# Integrating Dyxon

How REA, the Aegis module, and Reema use Dyxon as a device provider. Dyxon owns
the device lifecycle; every caller runs its own work on a leased device. See
[`design.md`](design.md) for the seam and
[`device-broker-contract.md`](device-broker-contract.md) for the tool surface.

## Two ways to call Dyxon

Both reach the same `Broker`, so they behave identically.

### In-process (Python callers: Aegis, Reema pipeline)

```python
from dyxon.broker import Broker
from dyxon.provider import DyxonProvider
from dyxon.pool import warm_pool
from dyxon.backends.avd import AvdBackend
from dyxon.provision import Provisioner

pool = warm_pool([AvdBackend("pixel", port=5554)], Provisioner(frida_dir="/opt/frida"))
provider = DyxonProvider(Broker(pool))

with provider.lease() as session:          # dyxon.session/v1 handle
    serial = session["serial"]             # e.g. "emulator-5554"
    ...                                     # run work against `serial`
# device is restored to its golden snapshot and returned to the pool on exit
```

### Over MCP (agents, Aegis module as an MCP client)

Run the broker as a long-lived server and register it like any MCP server:

```bash
DYXON_AVDS=pixel:5554,pixel_7:5556 \
DYXON_FRIDA_DIR=/opt/frida \
python3 -m dyxon serve
```

Claude Code: `claude mcp add dyxon -- python3 -m dyxon serve` (with the
`DYXON_*` environment set). The tools are `acquire_device`, `run_capability`,
`collect_runtime`, `reset`, `release`, `status`. Unlike the Reema MCP wrapper,
this server stays alive, because the pool and leases are in-memory state.

## The REA hand-off

REA already owns on-device analysis. Dyxon does not reimplement it; it hands REA
a device. The pattern:

1. `acquire_device` → `serial`, `frida_endpoint`.
2. Point REA at that serial: its `list_adb_devices` sees it, `adb -s <serial> …`
   and `instrument_with_frida` target it, `read_adb_logcat` reads it.
3. `release` when REA is done; Dyxon restores the snapshot.

Dyxon runs no REA tooling itself, and REA manages no device lifecycle. The only
thing that crosses between them is the serial.

## End-to-end: static → lease → dynamic → merged report

`dyxon.pipeline.run_dynamic_pass` drives the whole loop:

```python
from dyxon.pipeline import run_dynamic_pass
run_dynamic_pass(case_dir, provider, package="com.target.app", apk="/path/app.apk")
```

The flow and the files that carry state between the two halves:

```
reema analyze <sample>     ->  <case>/reports/vaccine.json     (capabilities + defenses)
run_dynamic_pass(...)      ->  <case>/temp/dynamic_findings.json (dyxon.dynamic/v1)
reema findings <case>      ->  <case>/reports/findings.json      (now with source "dynamic")
```

The merge is automatic: `dynamic_findings.json` is in Reema's adapter registry,
so the next `reema findings` run folds the runtime observations into
`findings.json` as `reema.findings/v1` findings (source `dynamic`, confidence
`high`). Neither side reads the other's internal files — only the two contract
files (`vaccine.json` in, `dynamic_findings.json` out) cross the boundary.

## What a caller provides

- **package** — the app under test's package name (the target on the device).
- **apk** — optional; installed once before the first check.
- **harness content** — real capability harnesses are Reema content (backlog
  B14). Until they land, checks return `no_harness` and the pass is a no-op
  beyond installing the app; the wiring is proven by the neutral example
  harness (`dyxon/harnesses/example.py`).
