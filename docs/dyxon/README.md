# Dyxon

Dyxon is the dynamic orchestration feature of Anais. It runs a sample or an app under test on a device, and it records what happens at runtime. It will later be integrated into the **Aegis** module.

Static analysis and forensics belong to [Reema](../reema/README.md).
The split is described in [ADR 0001](../reema/decisions/0001-split-anais-into-reema-and-dyxon.md).

## Scope

- Device control through ADB: install, launch, logcat.
- Frida instrumentation, using the script Reema generates (`reports/frida_auto.js`).
- Runtime capture: SSL pinning bypass status, crypto in use, unpacked DEX dumps.
- Planned: automated execution of Reema Vaccine Pack checks against an app under test.

## Inputs and outputs

| Direction | Artifact |
|---|---|
| In | `reports/findings.json`, `reports/frida_auto.js`, Vaccine Pack checks (from Reema) |
| Out | `temp/dynamic_findings.json`, merged into the report |

## Documents

| Document | Purpose |
|---|---|
| [`dynamic-analysis.md`](dynamic-analysis.md) | ADB/Frida runtime bridge runbook (`analysis_tools/dynamic_bridge.py`) |

## Status

The current implementation is `analysis_tools/dynamic_bridge.py` and `scripts/dynamic_analysis_helper.sh`. Dyxon has no package of its own yet. Its roadmap starts once Reema P1 is done.
