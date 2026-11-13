# Dyxon Roadmap

Last updated: 2026-11-13.

Phases run in order; each is committed on its own. Target design:
[`design.md`](design.md). Designed-but-unbuilt work:
[`backlog.md`](backlog.md).

| Phase | Scope | Status |
|---|---|---|
| D0 | Package skeleton, AVD backend driver, provisioner | **Done** (2026-11-13) |
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

## D0 — Device driver (done, 2026-11-13)

| Item | Result |
|---|---|
| `dyxon/` package | `python3 -m dyxon`, mirroring the `reema/` layout; `dyxon/__init__.py` at `0.1.0` |
| AVD backend driver | `dyxon/backends/avd.py`: boot headless (`-writable-system -no-window -no-snapshot-load`), `wait_ready` polls `sys.boot_completed`, `adb root` + `remount`, snapshot save/load, `emu kill`. Behind the `DeviceBackend` interface (`backends/base.py`) so later backends slot in; registry in `backends/__init__.py` |
| Provisioner | `dyxon/provision.py`: animations off + stay-awake, ABI-matched `frida-server` (push, run, `adb forward`), optional system CA certificate (OpenSSL subject-hash name or a supplied one). `ready_device()` runs boot → wait → root → provision → golden snapshot |
| Preflight | `dyxon/preflight.py` + `dyxon doctor`: one line per dependency, exit non-zero if any missing. A missing executable surfaces as return code 127 |
| Testability | All commands run through a `Runner` (`dyxon/shell.py`); `tests/test_dyxon_d0.py` (19 tests) uses a fake runner — no live emulator needed |

Verified on 2026-11-13: 19 D0 tests pass; `dyxon doctor` reports ready on this
host (emulator, AVDs, adb all present).

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
