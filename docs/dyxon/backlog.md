# Dyxon Backlog

Designed but not implemented. Each item names where it plugs in, so it can be
picked up without extra context. When an item is done, move it to the changelog
and delete it here.

Phase plan: [`roadmap.md`](roadmap.md). Target design: [`design.md`](design.md).

Most of these are the options the user chose *not* to build first but wants
later ("i want to all but later", 2026-11-13). They all live behind the broker
interface in [`device-broker-contract.md`](device-broker-contract.md), so adding
one does not change any caller.

## Other backends (all planned)

| Id | Item | Plugs into | Notes |
|---|---|---|---|
| D-B1 | **redroid backend** | backend driver | Android-in-Docker. Headless, scales to many instances, fast teardown. Needs a Linux host/VM (kernel binder) — not native on macOS. Best for CI/scale on Linux. |
| D-B2 | **Physical rooted device** | backend driver | Real hardware over ADB, Magisk root. Strongest anti-evasion for free. Reset is manual/re-flash; weaker isolation and scale. |
| D-B3 | **Corellium / cloud farm** | backend driver | Real virtualized ARM (and iOS). Best against evasive malware, snapshot/restore API, scales. Paid SaaS; ties to the iOS side of REA/Aegis. |

## Other lifecycle models (planned)

| Id | Item | Plugs into | Notes |
|---|---|---|---|
| D-L1 | **Ephemeral per request** | pool manager | Boot a fresh instance per lease, destroy after. Strongest isolation, slower acquire. Offer as a per-lease mode. |
| D-L2 | **Single device, reset between** | pool manager | One device, uninstall + settings reset between jobs. Simplest, weakest isolation. Offer as a low-resource mode. |

## Other interfaces (planned)

| Id | Item | Plugs into | Notes |
|---|---|---|---|
| D-I1 | **Python library + CLI** | broker | `import dyxon` / `dyxon acquire`, wrapping the same broker as the MCP server. For callers that would rather not speak MCP. |
| D-I2 | **Local HTTP broker** | broker | Language-agnostic REST daemon over the device pool, for non-MCP, non-Python callers. |

## Other first-build milestones (now later phases)

The two first-build options not chosen are scheduled, not dropped:

- **Reema Vaccine Pack runner** → roadmap D3 (`run_capability`).
- **Malware detonation + capture** → roadmap D3 (detonation profile).

## Capture depth (planned)

| Id | Item | Plugs into | Notes |
|---|---|---|---|
| D-C1 | **Controlled network sink** | provisioner, `run_capability` | Logged HTTP(S) proxy / fake-services host, so a job can observe egress without real internet. Off by default (see the isolation model in `design.md`). |
| D-C2 | **Runtime capture set** | capability runner | Logcat, pcap, unpacked DEX dumps, Frida traces → `dynamic_findings.json`. Much of this is REA's job on the leased device; Dyxon only orchestrates. |
