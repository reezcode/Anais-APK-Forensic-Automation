---
name: dyxon-agent
description: Use for dynamic Android analysis and on-demand device sandboxes — when a request needs a ready rooted Android emulator/device, to run or detonate an app, to confirm runtime behavior (SSL pinning, crypto, root checks, dump decrypted DEX), to run a Reema Vaccine Pack check on a device, or to give REA/another tool a device to work on. Dyxon leases the device; it does not analyze. Static/forensic requests go to reema-agent.
---

# Dyxon Agent

Dyxon is the **dynamic** half of Anais: an on-demand Android sandbox **broker**.
It provisions a ready, rooted device, leases it, resets it to a clean snapshot
between jobs, and tears it down. It does **not** analyze — callers run their own
work on a leased device. Static analysis is **Reema** (`reema-agent`); on-device
reverse engineering is **REA**.

Mental model: Dyxon hands you a device (ADB serial + frida endpoint). What you do
on it is yours.

## Route the request

1. **"Give me a ready rooted Android device"** (for REA, manual work, another
   tool): lease one from the broker (`acquire_device` → `reset`/`release`).
2. **"Run / detonate this app and watch it"**: lease, then `run_capability` with
   `mode="detonate"`, then `collect_runtime`.
3. **"Test an app against what the malware did"** (the Reema Vaccine Pack loop):
   run `run_dynamic_pass` — it runs each Vaccine Pack capability check on the app
   under test and writes `dynamic_findings.json`.
4. **Static facts about a package** (no device): that is Reema — use the
   **`reema-agent`** skill.

## How to run it

### Preflight

`python3 -m dyxon doctor` — checks `emulator`, an AVD, `adb` (and, with
`--frida-dir`, a frida-server). Fix anything marked `[--]` before serving.

### The device broker (MCP)

Long-lived server holding the device pool:

```bash
DYXON_AVDS=pixel:5554,pixel_7:5556 DYXON_FRIDA_DIR=/opt/frida python3 -m dyxon serve
```

Register like any MCP server (Claude Code: `claude mcp add dyxon -- python3 -m dyxon serve`).
Tools:

- `acquire_device({ backend?, ttl_seconds?, network? })` → `dyxon.session/v1`
  handle `{ serial, frida_endpoint, android_version, arch, ... }`, or
  `{ ok:false, error:"pool_exhausted" }`.
- `run_capability({ session_id, package, capability?, vaccine?, apk?, mode?, duration? })`
  — Vaccine check (`mode="check"`, needs `capability` + `vaccine.json` path) or
  detonation (`mode="detonate"`). Records a runtime observation.
- `collect_runtime({ session_id, out_dir })` → writes `dynamic_findings.json`
  (`dyxon.dynamic/v1`) into the case `temp/`.
- `reset({ session_id })` — restore the golden snapshot mid-lease.
- `release({ session_id })` — end the lease; device restored to clean.
- `status()` — pool size and free count.

### One device, by hand

`python3 -m dyxon up <avd>` boots, roots, provisions, and snapshots one device;
`python3 -m dyxon down <avd>` destroys it.

### In-process / end-to-end (Python)

`DyxonProvider.lease()` yields a session; `dyxon.pipeline.run_dynamic_pass(case_dir,
provider, package, apk=?)` runs the whole static→lease→dynamic loop. See
`references/runtime.md`.

## The REA hand-off

Dyxon does not run REA's tools. Lease a device, pass `session["serial"]` to REA
(`list_adb_devices`/`adb -s <serial> …`/`instrument_with_frida`/`read_adb_logcat`
all target it), `release` when done. Only the serial crosses between them.

## Merge back into Reema

`collect_runtime` writes `<case>/temp/dynamic_findings.json`. Reema folds it into
`reports/findings.json` on the next `python3 -m reema findings <case>` (its
`dynamic` adapter), as `source=dynamic`, confidence `high`, `status:<v>` tag. So
the full loop is: `reema analyze` → `vaccine.json` → `run_dynamic_pass` →
`dynamic_findings.json` → `reema findings`.

## Safety

Dyxon **executes the target application**, which may be malware. Defaults contain
it: every lease starts from a clean golden snapshot and is restored on release,
no real network by default, bounded TTL. Still: only ever run on a disposable,
isolated, authorized device/emulator — never a personal device or one on a
trusted network. Default to a dry lease/plan before detonating.

## Reference file

- `references/runtime.md` — the broker lifecycle, the `dyxon.session/v1` and
  `dyxon.dynamic/v1` contracts, the harness contract, the pipeline, and the
  legacy `anais_dynamic` bridge.
