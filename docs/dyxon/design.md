# Dyxon Design

Target architecture for Dyxon, the Android sandbox broker. This describes the
end state; [`roadmap.md`](roadmap.md) says what exists today, and
[`backlog.md`](backlog.md) holds designed-but-unbuilt work.

## Goal

Give any caller a ready, rooted Android device with one call, and guarantee it
is clean. Callers run their own analysis on it. Dyxon never analyses; it
provisions, leases, resets, and tears down.

## The seam: broker, not analyst

REA already owns on-device analysis (ADB, Frida, logcat, screen, package
inspection, native tracing). Reema owns static analysis and the Vaccine Pack.
Dyxon owns only what neither does: the **device lifecycle**.

```
  caller (Aegis / REA / Reema Vaccine runner)
        │  acquire_device()
        ▼
  ┌───────────────────────────────┐
  │ Dyxon broker (MCP server)     │
  │  pool ── lease ── reset ── TTL│
  └───────────────────────────────┘
        │  returns session handle
        ▼
  { serial, frida_endpoint, reset_token }
        │
        ▼
  caller runs analysis on `serial`
  (REA's ADB/Frida tools, or Reema capability checks)
        │  collect_runtime() → dynamic_findings.json
        ▼
  release() → Dyxon restores the golden snapshot
```

Dyxon reads no caller-internal files and writes no verdict. Its only analysis
output is `temp/dynamic_findings.json`, produced by `run_capability`/
`collect_runtime` and merged into `reports/findings.json` by the existing
contract.

## Components

| Component | Responsibility |
|---|---|
| **Broker** | MCP server. Accepts lease requests, assigns a device from the pool, enforces TTL, serialises access. |
| **Backend driver** | One per device source (AVD first). Boots, roots, snapshots, restores, destroys a device. Uniform interface, so the broker is backend-agnostic. |
| **Provisioner** | Makes a booted device *ready*: pushes the arch-matched `frida-server`, installs the system CA certificate, sets the proxy, applies settings (disable animations, stay-awake), takes the golden snapshot. |
| **Pool manager** | Keeps N warm devices at the golden snapshot, hands out leases, restores the snapshot on release. |
| **Capability runner** | Optional. Installs an app under test, runs Reema Vaccine Pack checks or detonates a sample, collects runtime observations into `dynamic_findings.json`. Thin — the heavy on-device work is REA's or the harness's. |

## Backend: Android Emulator (AVD) first

Chosen because arm64 system images run natively on Apple Silicon, it is free and
local, and it roots without hardware.

- Boot: `emulator -avd dyxon-clean -writable-system -no-window` (headless).
- Root: a `userdebug`/`-eng` image gives `adb root`; `adb remount` for a
  writable system partition.
- Ready: push `frida-server` (arch-matched), `adb install` the system CA
  certificate, `adb shell settings` toggles.
- Snapshot: AVD snapshots (`emulator -snapshot <name>`, or the console
  `avd snapshot save/load`) provide the golden-state restore.

Weakness: a sophisticated sample can detect the emulator. The backlog adds
higher-fidelity backends (`redroid`, physical, Corellium) behind the same
interface; see [`backlog.md`](backlog.md).

## Interface: MCP server

Dyxon is an MCP server so the Aegis module and REA call it the way they already
call REA. The tool surface and the session-handle schema are specified in
[`device-broker-contract.md`](device-broker-contract.md). A thin Python
library/CLI may wrap the same broker later (backlog), but MCP is the contract.

## Lifecycle: warm pool + snapshot reset

The broker keeps a small pool of booted, provisioned devices held at the golden
snapshot.

1. `acquire_device` → the broker leases a device, marks it busy, returns the
   session handle with a TTL.
2. The caller works on the device (installs an app, runs analysis).
3. `release` (or TTL expiry) → the broker restores the golden snapshot,
   returning the device to the pool clean.

This gives fast acquisition with a clean-state guarantee on every lease. The
alternatives (ephemeral per request, single device reset between jobs) remain
available as backlog options for callers that want stronger isolation or
simpler infra.

## Isolation and safety

Malware executes on these devices. Defaults contain it:

- **Clean every time.** A lease always starts from the golden snapshot; release
  always restores it. No sample residue crosses a lease.
- **No real network by default.** The device has no route to the internet
  unless a job explicitly requests a controlled sink (for example a logged HTTP
  proxy or a fake-services host). Opening real egress is an explicit,
  per-job decision.
- **No host mounts.** The device cannot reach the analyst's filesystem.
- **Bounded leases.** A TTL prevents a hung job from holding or contaminating a
  device forever.
- **Teardown on shutdown.** Pool devices are destroyed when the broker stops.

These mirror the Vaccine Pack guardrails in spirit
([Reema ADR 0003](../reema/decisions/0003-vaccine-pack-scope.md)): act on the
target, do not persist, do not reach outward unless asked.

## What Dyxon does not do

- No static analysis, no verdict, no family classification — that is Reema.
- No on-device reverse engineering tooling of its own — that is REA.
- No detection or capability *content* — the Vaccine Pack checks it runs are
  authored in Reema (backlog B13/B14).
