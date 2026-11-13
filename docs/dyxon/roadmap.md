# Dyxon Roadmap

Last updated: 2026-11-13.

Phases run in order; each is committed on its own. Target design:
[`design.md`](design.md). Designed-but-unbuilt work:
[`backlog.md`](backlog.md).

| Phase | Scope | Status |
|---|---|---|
| D0 | Package skeleton, AVD backend driver, provisioner | **Done** (2026-11-13) |
| D1 | Warm pool + snapshot reset, session handle (`dyxon.session/v1`) | **Done** (2026-11-13) |
| D2 | MCP server: `acquire_device`, `reset`, `release` (the generic device broker) | **Done** (2026-11-13) |
| D3 | Capability runner: `run_capability`, `collect_runtime`, `dynamic_findings.json` | **Done** (2026-11-13) |
| D4 | Aegis / REA integration pass; end-to-end static→dynamic | **Done** (2026-11-13) |

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

## D1 — Pool and lifecycle (done, 2026-11-13)

| Item | Result |
|---|---|
| Pool manager | `dyxon/pool.py`: `Pool` holds `DeviceSlot`s, lock-guarded; `warm_pool()` boots + readies N backends into a pool; `shutdown()` destroys all |
| Lease / restore | `acquire` leases a free slot (or raises `PoolExhausted`), `release` restores the golden snapshot and frees it, `reset` restores mid-lease. Optional `backend` filter and `network` on acquire |
| TTL reclaim | Each lease has a TTL; an expired lease is restored and freed on the next pool operation (`reap`, or lazily inside `acquire`/`free_count`). Clock is injectable for tests |
| Session handle | `dyxon/session.py`: `Session` (`dyxon.session/v1`), `to_dict()` in contract key order, per [`device-broker-contract.md`](device-broker-contract.md) |
| Errors | `PoolExhausted`, `SessionNotFound` added (map to the contract error codes) |

Verified on 2026-11-13: 10 D1 tests pass (lease, exhaustion, release/reset
restore counts, TTL reclaim, backend filter, shutdown). Suite total 191.

## D2 — MCP broker (done, 2026-11-13) — the generic device broker

| Item | Result |
|---|---|
| Broker core | `dyxon/broker.py`: `Broker` turns Pool ops into JSON dicts and maps every `DyxonError` to a stable code. Transport-free, so it is unit-tested without MCP |
| MCP server | `dyxon/mcp_server.py` + `dyxon serve`: FastMCP tools `acquire_device`, `reset`, `release`, `status`. Long-lived process holding the pool; stdio transport. `mcp` SDK import is guarded |
| Result envelope | `{ok, session|session_id}` or `{ok:false, error, message}` — see [`device-broker-contract.md`](device-broker-contract.md) |
| Contention | `pool_exhausted` / `session_not_found` returned as handled errors; never blocks |
| Config | Pool booted from `DYXON_AVDS` (plus `DYXON_FRIDA_DIR`, `DYXON_CERT`, `DYXON_CERT_HASH`) at server start |
| Hand-off | A caller takes `serial` from the handle and runs its own ADB/Frida tools unchanged |

This is the milestone chosen to build first. It unblocks REA and Aegis: they get
a ready device without Dyxon doing any analysis. Verified on 2026-11-13: 9 D2
tests pass (broker success/error paths; MCP adapter registers all four tools;
env config parse). Suite total 200.

## D3 — Capability runner (done, 2026-11-13)

| Item | Result |
|---|---|
| `run_capability` | `dyxon/runner.py` `CapabilityRunner`: optionally installs the app under test, resolves the Vaccine Pack entry's `defense.harness.module` (`dotted.module:function`), runs it with a `HarnessContext`, records an observation. No harness → `no_harness`; a bad harness → `error` (never crashes the broker). Broker tool `run_capability` |
| Harness plugin | A harness is `run(ctx) -> {status, detail, evidence?}`. Neutral example in `dyxon/harnesses/example.py` (confirms the app under test is installed). Real harnesses are Reema content (B14) |
| Detonation | `CapabilityRunner.detonate`: clear logcat, launch via `monkey`, wait `duration`, report crash lines. `mode="detonate"` on the tool |
| `collect_runtime` | Writes `dynamic_findings.json` (schema `dyxon.dynamic/v1`) into a case's `temp/` |
| Reema merge | `dynamic` adapter added to `reema/adapters.py` (+ registry), maps observations to `reema.findings/v1` (source `dynamic`, runtime confidence `high`, `status:<v>` tag) |

Content-free: the runner is the mechanism; harness logic for real capabilities
is Reema content (B14). Verified on 2026-11-13: 11 D3 tests (example harness
pass, no-harness, bad-harness error, detonation crash count, vaccine lookup,
write, broker run→collect, unknown session, detonate mode, adapter mapping).
Suite total 211.

## D4 — Integration (done, 2026-11-13)

| Item | Result |
|---|---|
| Device provider | `dyxon/provider.py` `DyxonProvider`: a `lease()` context manager that yields a `dyxon.session/v1` handle and releases it on exit (even on exception), plus runner pass-throughs. Works in-process and mirrors the MCP tools one to one |
| REA hand-off | Documented pattern: lease → take `session["serial"]` → run REA's own ADB/Frida tools → release. Dyxon runs no REA tooling; only the serial crosses |
| Pipeline | `dyxon/pipeline.py` `run_dynamic_pass`: lease, run each Vaccine Pack capability on the app under test, `collect_runtime` into the case's `temp/`, release |
| End-to-end merge | `temp/dynamic_findings.json` is folded into `reports/findings.json` by Reema's `dynamic` adapter (registry) on the next `reema findings` run. Proven in a test: a dynamic finding surfaces through `reema.adapters.collect` |
| Docs | [`integration.md`](integration.md): in-process vs MCP, the REA hand-off, the static→dynamic flow and the two contract files that cross the boundary |

Verified on 2026-11-13: 5 D4 tests (lease yield/release, release-on-exception,
exhaustion, pipeline writes `dynamic_findings.json`, end-to-end merge into Reema
findings). Suite total 216. The Dyxon roadmap (D0–D4) is complete.
