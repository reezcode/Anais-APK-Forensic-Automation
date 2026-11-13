# Dyxon Device-Broker Contract

The public interface between Dyxon and its callers (Aegis, REA, the Reema
Vaccine Pack runner). This is a versioned contract: a breaking change needs a
version bump, like [`reema.findings/v1`](../reema/finding-schema.md).

Contract id: `dyxon.session/v1`.

## MCP tools

Dyxon is an MCP server exposing five tools.

| Tool | Input | Output | Purpose |
|---|---|---|---|
| `acquire_device` | `backend` (default `avd`), `android_version`, `ttl_seconds` | a session handle | Lease a ready, rooted device from the pool. |
| `run_capability` | `session_id`, `apk` or `sample`, `capability` or Vaccine Pack ref | job id | Install the target and run a capability check or detonation on the leased device. |
| `collect_runtime` | `session_id`, `job_id` | path to `dynamic_findings.json` | Gather runtime observations for a job into the findings contract. |
| `reset` | `session_id` | ok | Restore the golden snapshot mid-lease without releasing. |
| `release` | `session_id` | ok | End the lease; the broker restores the snapshot and returns the device to the pool. |

`run_capability` and `collect_runtime` are optional conveniences. A caller that
only needs a device (for example REA running its own ADB/Frida tools) calls
`acquire_device`, works on the returned serial directly, then `release`.

A fifth tool, `status`, reports pool size and free count.

## Tool result envelope

Every tool returns a JSON object with an `ok` flag, so a caller distinguishes
success from a handled error without catching exceptions across the transport:

```json
{ "ok": true,  "session": { … dyxon.session/v1 … } }     // acquire_device
{ "ok": true,  "session_id": "d3f1c0a2" }                 // reset / release
{ "ok": false, "error": "pool_exhausted", "message": "…" }
```

`error` is one of the stable codes below; `message` is human-readable detail.

| Error code | Raised when |
|---|---|
| `pool_exhausted` | no free device and the pool is at capacity |
| `session_not_found` | unknown, released, or TTL-reclaimed `session_id` |
| `precondition` | a required host dependency is missing |
| `boot_error` | a device did not finish booting in time |
| `provision_error` | a device booted but could not be made ready |
| `error` | any other Dyxon error |

## Session handle (`dyxon.session/v1`)

Returned by `acquire_device`:

```json
{
  "contract": "dyxon.session/v1",
  "session_id": "d3f1c0a2",
  "backend": "avd",
  "serial": "emulator-5554",
  "frida_endpoint": "127.0.0.1:27042",
  "android_version": "14",
  "arch": "arm64-v8a",
  "rooted": true,
  "network": "none",
  "ttl_seconds": 1800,
  "expires_at": "2026-11-13T12:30:00Z"
}
```

- `serial` — the ADB serial the caller targets. REA's `list_adb_devices` /
  `instrument_with_frida` and any `adb -s <serial>` command use it.
- `frida_endpoint` — where `frida-server` listens on the device, already
  running and arch-matched.
- `network` — `none` by default; a job may request a controlled sink
  (`proxy`, `fake-services`) but not real egress without an explicit flag.
- `ttl_seconds` / `expires_at` — the lease is reclaimed at expiry even if the
  caller never calls `release`.

## Runtime-findings contract

`collect_runtime` writes `dynamic_findings.json` (into a case's `temp/`), with
schema `dyxon.dynamic/v1`:

```json
{
  "tool": "dyxon",
  "schema": "dyxon.dynamic/v1",
  "session": { "serial": "emulator-5554", "backend": "avd", "android_version": "14" },
  "observations": [
    { "capability": "process_exec", "status": "pass", "axis": "posture",
      "severity": "low", "title": "…", "detail": "…", "evidence": ["…"], "attck": [], "job_id": "…" }
  ],
  "errors": []
}
```

Reema's `dynamic` adapter (`reema/adapters.py`) maps each observation to a
`reema.findings/v1` finding (source `dynamic`, axis from the observation,
confidence `high` because it was observed at runtime) and merges it into
`reports/findings.json`. Dyxon is a producer of findings, not an owner of the
findings schema. `status` is one of `pass`, `fail`, `observed`, `no_harness`,
`error`; it is carried as a `status:<value>` tag on the finding.

## Error and contention behaviour

- No device free and the pool is at capacity → `acquire_device` returns a
  `pool_exhausted` error with a retry hint, never blocks forever.
- A `session_id` that has expired or been released → tools return
  `session_not_found`.
- A backend that cannot provision (no AVD, no `frida-server`) → a startup error
  naming the missing dependency, so the caller can report it.
