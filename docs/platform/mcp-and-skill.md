# Anais as MCP servers + the agent skills

Anais runs as MCP (Model Context Protocol) servers so agents — Claude Code,
Codex, Cursor, etc. — call it as tools, and ships agent skills that teach an
agent when and how to use it (mobile/APK scope), including the hand-off to REA
for deep analysis.

Since the Reema/Dyxon split there are **two MCP servers** and **three skills**:

- **Anais (Reema) MCP** — the TypeScript server below; static pipeline + REA
  deep-pass + the legacy dynamic bridge. Tools: `anais_analyze`,
  `anais_read_report`, `anais_rea_targets`, `anais_merge_deep`, `anais_dynamic`.
- **Dyxon MCP** — a separate long-lived Python server (`python3 -m dyxon serve`)
  that holds a device pool. Tools: `acquire_device`, `run_capability`,
  `collect_runtime`, `reset`, `release`, `status`. See
  [`../dyxon/device-broker-contract.md`](../dyxon/device-broker-contract.md) and
  [`../dyxon/integration.md`](../dyxon/integration.md).
- **Skills** — `reema-agent` (static), `dyxon-agent` (dynamic), and `anais-agent`
  (a thin router between the two). See "The agent skills" below.

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

## The agent skills

Three host-neutral skills (standard Agent-Skills format: YAML
`name`/`description` frontmatter + Markdown body). `SKILL.md` is the
always-loaded summary; `references/*.md` load on demand, so the model gets depth
without carrying it all at once (the same pattern REA uses). The canonical copies
live in `skills/`; `.claude/skills/<name>` symlinks make Claude Code
auto-discover them here.

```
skills/
  anais-agent/                  # thin router → reema-agent or dyxon-agent
    SKILL.md
  reema-agent/                  # static analysis, forensics, verdict, Vaccine Pack
    SKILL.md
    references/
      pipeline.md               # every static stage, outputs, run order, env, CLI
      reading-reports.md        # report.json / findings.json + composite risk
      rasp-frameworks.md        # RASP/packer vendors + framework handling
      rea-deep-pass.md          # REA deep-pass task/result contract
  dyxon-agent/                  # dynamic device broker: lease, run/detonate, collect
    SKILL.md
    references/
      runtime.md                # broker lifecycle, session/dynamic contracts, pipeline
```

- `reema-agent` reaches for the static pipeline on APK/JAR/IPA forensic requests,
  prefers the Anais MCP tools when connected and falls back to `python3 -m reema`,
  and hands deep native/managed work to REA.
- `dyxon-agent` reaches for a device: it leases a ready rooted sandbox from the
  Dyxon MCP (or `python3 -m dyxon`), runs/detonates, and collects runtime
  findings — it does not analyze.
- `anais-agent` only routes between the two and names the end-to-end loop.

### Install into any host

Copy the skills into whatever directory your host scans for skills. The helper
installs **all** of `skills/*/` (dereferencing symlinks):

```bash
# default target: ~/.claude/skills  (Claude Code / Claude Desktop, user scope)
scripts/install_skills.sh

# any other host — pass its skill directory
scripts/install_skills.sh ~/.config/<host>/skills
```

Or copy by hand: `cp -RL skills/reema-agent skills/dyxon-agent skills/anais-agent
<host-skill-dir>/`. Restart/reconnect the host, then invoke a skill by name or
let it auto-select from the description on a matching request. If a host has no
skill mechanism, the MCP tools still work on their own — the skills are only the
routing/knowledge layer.

## Relationship to REA

Reema owns the Android static pipeline and the orchestration; REA provides the
deep engines (native decompile, trace, managed/IL2CPP inspection); Dyxon provides
the device REA runs on. The `reema-agent` skill drives the static pass and calls
REA for the deep tasks in `rea_targets.json`; `dyxon-agent` leases REA a device.
Register the servers (peer model) for the full chain, or run Reema alone for
static + risk. See [`../reema/rea-deep-pass.md`](../reema/rea-deep-pass.md).
