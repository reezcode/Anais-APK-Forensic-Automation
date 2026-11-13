# Dyxon runtime — broker, contracts, pipeline

Full detail behind the `dyxon-agent` summary. Design: `docs/dyxon/design.md`;
tool contract: `docs/dyxon/device-broker-contract.md`; integration:
`docs/dyxon/integration.md`.

## Backend and lifecycle

First backend is the Android Emulator (AVD, arm64 native on Apple Silicon). The
broker keeps a **warm pool**: N devices booted, rooted, provisioned (ABI-matched
`frida-server`, system CA cert, animations off) and held at a **golden
snapshot**. `acquire` leases one; `release`/TTL-expiry restores the snapshot and
returns it clean. Other backends (redroid, physical, Corellium) and lifecycle
modes are backlog, behind the same interface — a caller never changes.

Config (env, read by `python3 -m dyxon serve`):
`DYXON_AVDS="name:port,name2:port2"` (required), `DYXON_FRIDA_DIR`,
`DYXON_CERT`, `DYXON_CERT_HASH`.

## Session handle — `dyxon.session/v1`

Returned by `acquire_device`:

```json
{ "contract": "dyxon.session/v1", "session_id": "d3f1c0a2", "backend": "avd",
  "serial": "emulator-5554", "frida_endpoint": "127.0.0.1:27042",
  "android_version": "14", "arch": "arm64-v8a", "rooted": true,
  "network": "none", "ttl_seconds": 1800, "expires_at": "2026-11-13T12:30:00Z" }
```

`serial` is the ADB serial every REA/adb command targets. `network` is `none`
unless a job asks for a controlled sink. The lease is reclaimed at `expires_at`
even without `release`.

## Tool result envelope

`{ ok:true, session:{…} }` / `{ ok:true, session_id:"…" }` on success;
`{ ok:false, error:"<code>", message:"…" }` on a handled error. Codes:
`pool_exhausted`, `session_not_found`, `precondition`, `boot_error`,
`provision_error`, `error`.

## Runtime findings — `dyxon.dynamic/v1`

`collect_runtime` writes `<case>/temp/dynamic_findings.json`:

```json
{ "tool": "dyxon", "schema": "dyxon.dynamic/v1",
  "session": { "serial": "emulator-5554", "backend": "avd", "android_version": "14" },
  "observations": [
    { "capability": "process_exec", "status": "pass", "axis": "posture",
      "severity": "low", "title": "…", "detail": "…", "evidence": ["…"],
      "attck": [], "job_id": "…" } ],
  "errors": [] }
```

`status` ∈ `pass | fail | observed | no_harness | error`. Reema's `dynamic`
adapter maps each observation to a `reema.findings/v1` finding (source `dynamic`,
confidence `high`, `status:<v>` tag) on the next `reema findings <case>`.

## Harness contract

A Vaccine Pack entry may name `defense.harness.module = "dotted.module:function"`.
A harness is `run(ctx) -> {status, detail, evidence?, severity?}`, where `ctx`
(`HarnessContext`) gives `serial`, `package`, a bound `adb(*args)`, the
`frida_endpoint`, and `capability`. It must obey the ADR 0003 guardrails: act on
the app under test only, send nothing off-device, no persistence, no evasion,
minimal action, report pass/fail. No module → observation `no_harness`; a raising
harness → `error` (never crashes the broker). The neutral example is
`dyxon/harnesses/example.py`. Real harnesses are Reema content (backlog B14).

## Pipeline (in-process)

```python
from dyxon.broker import Broker
from dyxon.pool import warm_pool
from dyxon.backends.avd import AvdBackend
from dyxon.provision import Provisioner
from dyxon.provider import DyxonProvider
from dyxon.pipeline import run_dynamic_pass

pool = warm_pool([AvdBackend("pixel", port=5554)], Provisioner(frida_dir="/opt/frida"))
provider = DyxonProvider(Broker(pool))
run_dynamic_pass(case_dir, provider, package="com.target.app", apk="/path/app.apk")
```

`run_dynamic_pass` leases a device, runs every Vaccine Pack capability on the app
under test, `collect_runtime` into `<case>/temp/`, and releases. Then
`reema findings <case>` merges the result.

## Legacy dynamic bridge (`anais_dynamic`)

The pre-Dyxon prototype still ships: `anais_dynamic({ workDir, execute?, mode?,
timeout?, serial? })` (MCP) or `python3 analysis_tools/dynamic_bridge.py
<workDir>/temp <workDir>/reports --timeout 30 [--yes]`. It drives a single
connected device under `frida_auto.js` and writes a differently-shaped
`dynamic_findings.json` (hooks/logcat, not `dyxon.dynamic/v1`). Prefer the Dyxon
broker; the bridge is superseded stage by stage.

**SAFETY:** both execute the target (possibly malware). Dry-run/plan first; only
execute on a disposable, isolated, authorized device.
