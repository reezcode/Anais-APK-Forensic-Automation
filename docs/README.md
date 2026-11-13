# Anais Documentation

All project documentation lives in this directory. Start here.

## Layout

| Directory | Scope |
|---|---|
| [`reema/`](reema/README.md) | **Reema**: malware analysis and forensics. Static triage, capabilities, IOCs, Vaccine Pack. |
| [`dyxon/`](dyxon/README.md) | **Dyxon**: Android sandbox broker. Provisions, leases and resets ready rooted devices for dynamic analysis. Later integrated into Aegis. |
| [`platform/`](platform/) | Shared surface used by both features: MCP server, agent skill. |

## Documents

### Reema

| Document | Purpose |
|---|---|
| [`reema/README.md`](reema/README.md) | Feature overview and reading order |
| [`reema/design.md`](reema/design.md) | Target architecture: pipeline, capability engine, Vaccine Pack, enrichment |
| [`reema/roadmap.md`](reema/roadmap.md) | Phases P0–P4, status, known issues, next steps |
| [`reema/backlog.md`](reema/backlog.md) | Designed but not implemented, ready to pick up |
| [`reema/finding-schema.md`](reema/finding-schema.md) | `reema.findings/v1` contract (findings + verdict) |
| [`reema/capability-rules.md`](reema/capability-rules.md) | Authoring capability rules and behaviour chains |
| [`reema/vaccine-pack.md`](reema/vaccine-pack.md) | Authoring the defense catalog for the Vaccine Pack |
| [`reema/changelog.md`](reema/changelog.md) | What changed, per phase |
| [`reema/decisions/`](reema/decisions/README.md) | Architecture decision records (ADRs) |
| [`reema/tools-architecture-and-flow.md`](reema/tools-architecture-and-flow.md) | Current static pipeline, tool by tool |
| [`reema/static-core-architecture.md`](reema/static-core-architecture.md) | Module overview diagram of the static core |
| [`reema/analyst-quick-reference.md`](reema/analyst-quick-reference.md) | Analyst workflow cheat sheet |
| [`reema/custom-yara-and-api-keys.md`](reema/custom-yara-and-api-keys.md) | Custom YARA rules (`-y`) and API key tracking |
| [`reema/rea-deep-pass.md`](reema/rea-deep-pass.md) | Optional REA deep pass contract |

### Dyxon

| Document | Purpose |
|---|---|
| [`dyxon/README.md`](dyxon/README.md) | Feature overview and reading order |
| [`dyxon/design.md`](dyxon/design.md) | Target architecture: device broker, AVD backend, warm pool, MCP tools, isolation |
| [`dyxon/roadmap.md`](dyxon/roadmap.md) | Phases D0–D4, status |
| [`dyxon/backlog.md`](dyxon/backlog.md) | Designed but not implemented: other backends, lifecycle modes, interfaces |
| [`dyxon/device-broker-contract.md`](dyxon/device-broker-contract.md) | `dyxon.session/v1` MCP tool surface and session handle |
| [`dyxon/integration.md`](dyxon/integration.md) | How REA, Aegis and Reema lease from Dyxon; the static→dynamic flow |
| [`dyxon/decisions/`](dyxon/decisions/README.md) | Architecture decision records (ADRs) |
| [`dyxon/dynamic-analysis.md`](dyxon/dynamic-analysis.md) | ADB/Frida runtime bridge runbook (pre-Dyxon prototype) |

### Platform

| Document | Purpose |
|---|---|
| [`platform/mcp-and-skill.md`](platform/mcp-and-skill.md) | The two MCP servers (Anais/Reema + Dyxon) and the three agent skills |

## Conventions

- **File names:** lowercase kebab-case, `.md`. Example: `finding-schema.md`.
- **One folder per feature.** Each folder has a `README.md` that explains its scope and its reading order.
- **Decisions:** one ADR per decision in `<feature>/decisions/NNNN-short-title.md`, numbered in sequence and never renumbered. To change a decision, write a new ADR that supersedes the old one.
- **Status lives in the roadmap.** Design docs describe the target. `roadmap.md` says what exists today.
- **Dates** are absolute (`2026-11-13`), never relative.
- Agent skill references stay in `skills/<agent>/references/` (`reema-agent`,
  `dyxon-agent`) because the skill package ships them. They are not project docs.
