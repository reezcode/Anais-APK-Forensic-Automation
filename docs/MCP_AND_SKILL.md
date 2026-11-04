# Anais as an MCP server + the `anais-agent` skill

Anais can run as an MCP (Model Context Protocol) server so agents — Claude Code,
Codex, Cursor, etc. — call the pipeline as tools, and ships an `anais-agent`
skill that teaches an agent when and how to use it (mobile/APK scope), including
the handoff to REA for deep analysis.

## Build

The server is TypeScript, compiled to `dist/mcp/server.js`.

```bash
npm install
npm run build
```

Requires Node >= 20.19 (the MCP SDK is ESM, loaded from the CommonJS build via
Node's `require(esm)` interop) and the usual Anais runtime prerequisites
(python3, apktool, jadx, yara, androguard). Launchers:

- `node /abs/path/Anais/dist/mcp/server.js`
- or the installed bin `anais-mcp` (after `npm link` / global install)

The server speaks stdio: **stdout is the JSON-RPC channel**, all logging goes to
stderr. Boot line (stderr): `Anais MCP server vX.Y.Z ready (stdio)`.

## Tools

| Tool | Purpose |
|------|---------|
| `anais_analyze` | Run the static pipeline on an APK/bundle. `{ apkPath, yara?, rea? }` → `workDir`, report paths, summary. `rea:true` also runs the REA bridge + emits deep tasks. |
| `anais_read_report` | `{ workDir, full? }` → compact summary (risk, package, framework, RASP, signing, SAST counts) or the full `report.json`. |
| `anais_rea_targets` | `{ workDir }` → `rea_targets.json` deep-pass tasks (needs a prior `rea:true` run). |
| `anais_merge_deep` | `{ workDir, results }` → validate agent deep results, write `rea_deep.json`, regenerate report + `frida_auto.js`. |
| `anais_dynamic` | `{ workDir, execute?, mode?, timeout?, serial? }` → dynamic ADB/Frida run. **Dry-run unless `execute:true`** (executes the target). |

## Register

### Claude Code

```bash
claude mcp add anais -- node /abs/path/Anais/dist/mcp/server.js
```

Or add to `.mcp.json` / settings:

```json
{
  "mcpServers": {
    "anais": { "command": "node", "args": ["/abs/path/Anais/dist/mcp/server.js"] }
  }
}
```

### Codex

Add to `~/.codex/config.toml` (or the MCP section Codex uses):

```toml
[mcp_servers.anais]
command = "node"
args = ["/abs/path/Anais/dist/mcp/server.js"]
```

### Any stdio MCP client

Launch `node /abs/path/Anais/dist/mcp/server.js` as a stdio server. No arguments,
no network — it runs the local pipeline and reads/writes under the Anais
workspace.

After registering, restart/reconnect the client and confirm the `anais_*` tools
appear in the session.

## The `anais-agent` skill

The skill makes an agent reach for Anais on APK forensic requests and routes the
phases (static → REA deep → Frida → dynamic), prefers the MCP tools when
connected and falls back to the CLI otherwise, and hands deep native/managed work
to a general RE integration (e.g. `reverse-engineer-anything`).

It is **host-neutral** — standard Agent-Skills format (YAML `name`/`description`
frontmatter + Markdown body), no host-specific content. The canonical copy lives
in the repo at `skills/anais-agent/`:

```
skills/anais-agent/
  SKILL.md                      # router: when to use Anais, phase map, safety
  references/
    pipeline.md                 # every stage, outputs, run order, env flags
    reading-reports.md          # report.json schema + composite risk
    rasp-frameworks.md          # RASP/packer vendors + framework handling
    deep-and-dynamic.md         # REA deep-pass + dynamic-bridge contracts
```

`SKILL.md` is the always-loaded summary; the `references/*.md` are loaded on
demand, so the model gets depth without carrying it all at once (the same
pattern REA uses). `.claude/skills/anais-agent` in this repo is a symlink to the
canonical copy so Claude Code auto-discovers it here.

### Install into any host

Copy the skill into whatever directory your host scans for skills. The helper
dereferences the symlink and drops real files:

```bash
# default target: ~/.claude/skills  (Claude Code / Claude Desktop, user scope)
scripts/install_skills.sh

# any other host — pass its skill directory
scripts/install_skills.sh ~/.config/<host>/skills
```

Or copy by hand: `cp -RL skills/anais-agent <host-skill-dir>/`. Restart/reconnect
the host, then invoke the skill by name or let it auto-select from the
description on a matching request. If a host has no skill mechanism, the MCP
tools still work on their own — the skill is only the routing/knowledge layer.

## Relationship to REA

Anais owns the Android static pipeline and the orchestration; REA provides the
deep engines (native decompile, trace, dynamic, managed/IL2CPP inspection). The
`anais-agent` skill drives Anais and calls REA for the deep tasks in
`rea_targets.json`. Register both servers (peer model) for the full chain, or run
Anais alone for static + risk. See `docs/REA_DEEP_PASS.md`.
