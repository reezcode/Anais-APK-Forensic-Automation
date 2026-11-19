# Peny Roadmap

Last updated: 2026-11-19.

| Phase | Scope | Status |
|---|---|---|
| P0 | Package skeleton, one-way seam to the shared static core, contract test | **Done** (2026-11-19) |
| P1 | Static lens: MASVS rule set, coverage matrix, `peny.findings/v1`, pentest report | Planned |
| P2 | Dynamic confirm track: Dyxon lease + REA, tier-0 Frida harnesses, tier-1 user script | Planned |
| P3 | Business-logic track: proxied lease (Dyxon D-C1), traffic capture + replay/tamper helpers | Planned |

Target design for every phase: [`design.md`](design.md).
Designed but unimplemented work, ready to pick up: [`backlog.md`](backlog.md).

## P0 — Foundation (done)

| Item | Result |
|---|---|
| `peny/` Python package | `peny/cli.py`, `peny/__main__.py`, `peny/__init__.py` (0.1.0); runs as `python3 -m peny` |
| One-way seam | `peny/_shared.py` re-exports Reema's `Evidence`, `normalize_severity`, `SEVERITIES` and names `FORBIDDEN_REEMA_MODULES`; Peny never imports Reema's verdict/capability/vaccine/classify, Reema never imports Peny |
| Finding schema | `peny.findings/v1` in `peny/findings.py`: `PenyFinding` over the shared `Evidence`, MASVS matrix builder; see [`finding-schema.md`](finding-schema.md) |
| Contract test | `tests/test_peny.py`, 11 tests: fresh-interpreter checks that importing `peny` pulls no Reema lens and importing `reema` pulls no `peny`; shared primitives are the same objects (not forks); schema + matrix shape |
| Non-breakage proof | Full suite 227 tests pass (216 prior + 11 Peny), Reema untouched |
| CLI | `peny --version`; `peny analyze` wired but exits `2` (honest not-implemented) until P1 |

**Verification on 2026-11-19:** `python3 -m unittest discover -s tests` → 227
passed, 1 skipped. `python3 -m peny --version` → `peny 0.1.0`.

## P1 — Static lens (planned)

- Run the shared extraction layer, collect raw facts + Reema `posture` findings.
- `peny/rules/` maps each fact to a MASVS control, exploitability severity, CWE,
  and a fix; flags `needs_runtime_confirmation`.
- `peny/masvs.py` builds the coverage matrix.
- `peny/report.py` renders `report.md` + the MASVS matrix.
- Own case directory; never writes a Reema report file.

## P2 — Dynamic confirm (planned)

- `peny/dynamic.py` leases from Dyxon, drives REA on the serial.
- Tier-0 harnesses in `peny/harnesses/`: SSL-pinning bypass, crypto hooks,
  root-detection bypass, storage dump.
- Tier-1: load an operator-supplied `.js` through REA.
- Flips `runtime_status` on `needs_runtime_confirmation` findings.
- Runs on a stock Dyxon lease (`network = false`).

## P3 — Business logic (planned)

- Depends on Dyxon **D-C1** (controlled-proxy lease profile). Logged as a
  cross-module dependency in [`backlog.md`](backlog.md) and Dyxon's backlog.
- CA + proxy on the leased device, egress only to the operator's proxy.
- Traffic capture + replay/tamper helpers (price/IDOR, JWT, session, rate limit).

## Out of scope (for now)

- iOS. Reema has IPA intake; the seam extends there later, same lens pattern.
- Fully automated business-logic exploitation. Peny captures and assists.
