# 0001. Dyxon is a device broker: AVD, MCP, warm pool

- Status: Accepted
- Date: 2026-11-13

## Context

Dyxon was originally scoped narrowly as "run a sample under Frida and capture
runtime." The actual need is broader: an on-demand, ready, rooted Android
sandbox that any tool can use — the Reema Vaccine Pack runner, REA, and the
Aegis module — whenever it needs a device to run something dynamic.

Two forces shape the design:

1. **REA already owns on-device analysis.** It has ADB, Frida, logcat, screen
   capture, package inspection and native tracing. If Dyxon also analyses, it
   duplicates REA and the two compete for the device.
2. **The host is Apple Silicon (macOS, arm64).** This rules out some backends
   as a first target: `redroid` needs a Linux kernel (binder); Corellium is a
   paid cloud service.

A brainstorm on 2026-11-13 settled four questions.

## Decision

- **Dyxon is a device broker, not an analyst.** It owns the device lifecycle —
  provision, root, make ready, hold a warm pool, lease, reset to a golden
  snapshot, tear down. Callers run their own analysis on the leased device.
  Dyxon reimplements none of REA's on-device tooling.
- **First backend: Android Emulator (AVD).** arm64 system images run natively
  on Apple Silicon; it roots without hardware and is free and local. Other
  backends (`redroid`, physical, Corellium) are planned behind the same
  interface — the user wants all of them, later (backlog D-B1..D-B3).
- **Interface: MCP server.** Tools `acquire_device`, `run_capability`,
  `collect_runtime`, `reset`, `release`. This matches how Aegis and REA already
  call REA. A Python library/CLI and an HTTP broker are backlog (D-I1, D-I2).
- **Lifecycle: warm pool + snapshot reset.** Keep N ready devices at a golden
  snapshot; lease one, restore the snapshot on release. Fast acquisition with a
  clean-state guarantee. Ephemeral-per-request and single-device-reset are
  offered as backlog modes (D-L1, D-L2).
- **First milestone: the generic device broker** (`acquire_device` / `reset` /
  `release`). It unblocks REA and Aegis immediately — they get a ready device
  without Dyxon doing any analysis. The Vaccine Pack runner and detonation are
  scheduled next (roadmap D3), not dropped.
- **Contract:** the session handle `dyxon.session/v1` (serial, Frida endpoint,
  reset token) out of the broker; `dynamic_findings.json` merged into
  `reema.findings/v1` out of any analysis job. See
  [`../device-broker-contract.md`](../device-broker-contract.md).

## Consequences

- Dyxon stays small and has one job; REA and Reema keep theirs. One pool of
  ready devices serves every caller.
- Adding a backend or a lifecycle mode is a driver behind a fixed interface, so
  no caller changes.
- Malware runs on these devices, so the broker must enforce clean-state-per-
  lease, no-network-by-default, and bounded leases (see the isolation model in
  [`../design.md`](../design.md)). This is now Dyxon's responsibility to
  maintain.
- The MCP surface becomes a versioned public contract; a breaking change needs a
  version bump.
- The emulator is detectable by evasive samples; until a higher-fidelity backend
  lands (backlog), results on anti-emulator malware are limited.
