# Dyxon

Dyxon is the dynamic feature of Anais. It provisions a ready-to-use Android
sandbox on demand, leases it to a caller, resets it to a clean state between
jobs, and tears it down. It is the device layer that dynamic analysis runs on.

Dyxon will later be absorbed into the **Aegis** module. Static analysis and
forensics belong to [Reema](../reema/README.md). The original split is described
in [ADR 0001](../reema/decisions/0001-split-anais-into-reema-and-dyxon.md); the
device-broker architecture is described in
[decisions/0001](decisions/0001-dyxon-device-broker-architecture.md).

## What Dyxon is

A **device broker**, not an analysis tool. The clean seam:

- **Dyxon owns the device lifecycle**: boot a sandbox, root it, make it ready
  (matching `frida-server`, system CA certificate, proxy, settings), hold a warm
  pool, lease one out, restore it to a golden snapshot after each job, tear down.
- **Callers own the analysis** they run on a leased device. REA already has the
  full on-device toolset (ADB, Frida, logcat, screen capture, package inspect),
  so Dyxon does not reimplement it. Dyxon hands back a device; REA and Reema use
  it.

This keeps Dyxon small and lets any tool — Reema's Vaccine Pack runner, REA,
the Aegis module — share one pool of ready devices.

## How callers reach it

Dyxon is an **MCP server**. It exposes a handful of tools
(`acquire_device`, `run_capability`, `collect_runtime`, `reset`, `release`),
so the Aegis module and REA call it the same way they already call REA's tools.
The lease it returns is a **session handle**: an ADB serial, a Frida endpoint,
and a reset token. See
[`device-broker-contract.md`](device-broker-contract.md).

## Backends

The first backend is the **Android Emulator (AVD)**, which runs arm64 system
images natively on Apple Silicon. Other backends (`redroid`, physical rooted
devices, Corellium) are planned and live behind the same broker interface, so a
caller never changes. See [`backlog.md`](backlog.md).

## Inputs and outputs

| Direction | Artifact |
|---|---|
| In | A lease request (backend, Android version); optionally `reports/findings.json`, a Vaccine Pack, or an APK under test (from Reema) |
| Out | A session handle (serial, Frida endpoint, reset token); and, for an analysis job, `temp/dynamic_findings.json`, merged into `reports/findings.json` |

The runtime-findings contract (`dynamic_findings.json` → merged into
`findings.json`) is unchanged from the original Dyxon scope.

## Safety

Malware runs on these devices. Dyxon's defaults contain it: a leased device
starts from a clean golden snapshot, is restored after every job, and has no
real network path by default. See the design doc for the isolation model.

## Documents

| Document | Purpose |
|---|---|
| [`design.md`](design.md) | Target architecture: broker, backends, lifecycle, MCP tools, isolation |
| [`roadmap.md`](roadmap.md) | Phases D0–D4, status |
| [`backlog.md`](backlog.md) | Designed but not implemented, ready to pick up |
| [`device-broker-contract.md`](device-broker-contract.md) | MCP tool surface and the session-handle contract |
| [`decisions/`](decisions/README.md) | Architecture decision records |
| [`dynamic-analysis.md`](dynamic-analysis.md) | Current ADB/Frida bridge runbook (`analysis_tools/dynamic_bridge.py`) — the pre-Dyxon prototype |

## Status

D0–D2 are done (2026-11-13). The `dyxon/` package has the AVD backend driver and
provisioner (D0), the warm pool with lease/restore and the `dyxon.session/v1`
handle (D1), and the MCP device broker (D2). Commands:

- `python3 -m dyxon doctor` — check host dependencies.
- `python3 -m dyxon up <avd>` — boot, ready and snapshot one device.
- `DYXON_AVDS=pixel:5554 python3 -m dyxon serve` — run the MCP broker (tools
  `acquire_device`, `reset`, `release`, `status`) over stdio.

The capability runner (D3) runs a Vaccine Pack harness (or a detonation) against
an app under test, and `collect_runtime` writes `dynamic_findings.json`, which
Reema's `dynamic` adapter merges into `findings.json`. Harness logic for real
capabilities is Reema content (B14); a neutral example ships in
`dyxon/harnesses/example.py`.

The integration pass (D4) is done too: `DyxonProvider` is the device provider
Aegis and REA lease from (`with provider.lease() as session: ...`), and
`dyxon.pipeline.run_dynamic_pass` drives the full static→lease→dynamic→merged-
report loop. See [`integration.md`](integration.md). **The Dyxon roadmap
(D0–D4) is complete.**

The pre-Dyxon prototype
(`analysis_tools/dynamic_bridge.py`, `scripts/dynamic_analysis_helper.sh`)
still exists and is superseded stage by stage.
