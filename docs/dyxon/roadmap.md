# Dyxon Roadmap

Last updated: 2026-11-13.

Phases run in order; each is committed on its own. Target design:
[`design.md`](design.md). Designed-but-unbuilt work:
[`backlog.md`](backlog.md).

| Phase | Scope | Status |
|---|---|---|
| D0 | Package skeleton, AVD backend driver, provisioner | Planned |
| D1 | Broker + warm pool + snapshot reset, session handle (`dyxon.session/v1`) | Planned |
| D2 | MCP server: `acquire_device`, `reset`, `release` (the generic device broker) | Planned |
| D3 | Capability runner: `run_capability`, `collect_runtime`, `dynamic_findings.json` | Planned |
| D4 | Aegis / REA integration pass; detonation profile | Planned |

The four brainstorm decisions (2026-11-13) set the first path through these
phases: **AVD backend, MCP interface, warm pool + snapshot reset, generic
device broker first.** The other backends and the other first-build options the
user also wants are kept — scheduled in later phases and the backlog, behind the
same broker interface so callers never change. See
[decisions/0001](decisions/0001-dyxon-device-broker-architecture.md).

## D0 — Device driver (planned)

| Item | Target |
|---|---|
| `dyxon/` package | `python3 -m dyxon`, mirroring the `reema/` layout |
| AVD backend driver | Boot headless, `adb root` + `adb remount`, destroy; uniform driver interface for later backends |
| Provisioner | Arch-matched `frida-server`, system CA certificate, proxy, settings; take the golden snapshot |
| Preconditions check | Fail with a named dependency when `emulator`, an arm64 image, or `frida-server` is missing |

## D1 — Pool and lifecycle (planned)

| Item | Target |
|---|---|
| Pool manager | Keep N warm devices at the golden snapshot |
| Lease / restore | `acquire` marks busy; `release` restores the snapshot; TTL reclaims a stuck lease |
| Session handle | `dyxon.session/v1` per [`device-broker-contract.md`](device-broker-contract.md) |

## D2 — MCP broker (planned) — the generic device broker

| Item | Target |
|---|---|
| MCP server | `acquire_device`, `reset`, `release` |
| Contention | `pool_exhausted` / `session_not_found` behaviour, never block forever |
| Hand-off | A caller (REA) can take `serial` and run its own ADB/Frida tools unchanged |

This is the milestone chosen to build first. It unblocks REA and Aegis: they get
a ready device without Dyxon doing any analysis.

## D3 — Capability runner (planned)

| Item | Target |
|---|---|
| `run_capability` | Install an app under test, run a Reema Vaccine Pack check on the device |
| `collect_runtime` | Write `temp/dynamic_findings.json`, merged into `findings.json` |
| Detonation profile | Install a sample, run it, capture runtime observations |

Depends on Reema backlog B14 (Vaccine Pack harness content) for real checks; the
runner itself is content-free and ships with the neutral example.

## D4 — Integration (planned)

| Item | Target |
|---|---|
| Aegis / REA | Dyxon registered as a device provider the Aegis module and REA can lease from |
| End-to-end | Static (Reema) → lease (Dyxon) → dynamic (REA on the leased device) → merged report |
