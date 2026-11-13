# 0001. Split Anais into Reema and Dyxon

- Status: Accepted
- Date: 2026-11-13

## Context

`anais.sh` handles static analysis, the optional REA deep pass and the hooks into dynamic (Frida) analysis in one script. Static triage and runtime orchestration have different users, different risks, and different release cycles: dynamic analysis executes the sample, and static analysis does not. Runtime orchestration will later move into the Aegis module.

## Decision

- **Reema** owns malware analysis and forensics: intake, enrichment, static analysis, the verdict, and the Vaccine Pack. Code lives in `reema/` (Python).
- **Dyxon** owns dynamic orchestration: device control, Frida, runtime capture, and automated Vaccine Pack checks. Aegis will absorb it later.
- The contract between the two is `findings.json` (`reema.findings/v1`) and the Vaccine Pack. Neither module reads the other's internal files.
- The orchestrator is rewritten in Python stage by stage. `anais.sh` stays the engine until each stage is replaced. The TypeScript MCP server stays a thin wrapper.

## Consequences

- Each module can be tested and released on its own schedule.
- The schema becomes a versioned public contract, so breaking changes need a version bump.
- During migration the Python CLI and the shell engine run side by side, and both paths must keep working.
