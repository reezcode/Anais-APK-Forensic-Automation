---
name: anais-agent
description: Use for Android APK forensics and mobile app security analysis — when a request involves a local .apk/.xapk/.apkm/.apks/.aab and asks to analyze, scan, triage, reverse, or assess it (SAST, permissions, RASP/packer, obfuscation, signing, SDKs/trackers, malware risk, framework ID, SSL pinning, root/anti-debug), or to drive the deep REA pass or dynamic Frida run on one. Mobile scope only.
---

# Anais Agent

Anais is an Android APK static-forensics pipeline with an optional REA deep pass
and a gated dynamic (ADB/Frida) bridge. Use it whenever a claim depends on what a
local Android app package actually contains or does. Mobile scope only — for
non-APK targets (iOS, firmware, desktop binaries, JS/Electron) use a general
reverse-engineering integration (e.g. `reverse-engineer-anything`) instead.

This skill is host-neutral: it works in any agent/MCP client. Prefer the MCP
tools named below when the Anais MCP server is connected; otherwise use the
CLI / Python tools — the same pipeline either way.

## Route the request

1. **Have an APK and need static facts** (permissions, SAST, RASP/packer,
   obfuscation, framework, signing, SDK/tracker inventory, composite risk,
   DEX-payload / encrypted-payload detection): run the **static pipeline**.
2. **Need to understand native/managed logic the static pass can't see** (Flutter
   Dart, Unity IL2CPP, Xamarin IL, stripped `.so`, a RASP abort path): run static
   with REA on, then execute the **REA deep tasks** and merge them.
3. **Need runtime confirmation** (does pinning/crypto/root-check actually fire,
   dump decrypted DEX, hit the native hooks): run the **dynamic bridge**. It
   executes the target — see Safety.

Work the phases in order; each feeds the next.

## How to run it

### Phase 0–1 · static (+ optional REA bridge)

- MCP: `anais_analyze({ apkPath, yara?, rea? })` → returns `workDir`, report
  paths, and a summary. `rea: true` also runs REA's cheap passes and emits the
  deep-task list.
- CLI: `anais /abs/path/app.apk` (add `-y` for full YARA; prefix `ANAIS_REA=1`
  for the REA bridge).
- Read results: `anais_read_report({ workDir })` (add `full: true` for the whole
  `report.json`), or read `<workDir>/reports/report.md`.

### Phase 2 · REA deep pass (agent-driven)

Only when `rea: true` was used and deep questions were queued.

1. Get tasks: `anais_rea_targets({ workDir })` → `rea_targets.json` (schema 2).
2. Execute each task with REA's deep tools (`open_binary` / `trace_native_values`
   for native and RASP abort paths, `inspect_il2cpp_metadata` for Unity,
   `inspect_managed_artifact` for Xamarin, `open_binary` on `libapp.so` for
   Flutter). Keep each Evidence record; do not assert beyond what REA returns.
3. Merge: `anais_merge_deep({ workDir, results })` (results per
   `references/deep-and-dynamic.md`). Writes `rea_deep.json`, regenerates the
   report's Deep Pass section, and compiles the recovered addresses into
   `frida_auto.js`.

### Phase 3 is automatic

`frida_auto.js` is (re)generated from the findings; after a deep-pass merge it
contains concrete `Interceptor.attach(base.add(ptr('0x…')))` hooks at the
REA-recovered RASP/JNI addresses. Nothing to call — just use the script.

### Phase 4 · dynamic (ADB/Frida) — gated

- MCP: `anais_dynamic({ workDir, execute?, mode?, timeout?, serial? })`.
  `execute` defaults to **false** (dry-run: returns the command plan, runs
  nothing). Pass `execute: true` to drive the device.
- CLI: `python3 analysis_tools/dynamic_bridge.py <workDir>/temp <workDir>/reports
  --timeout 30` (add `--yes` to execute).

## Safety

The dynamic bridge **executes the target application** on a device; the target
may be malware. Default to dry-run first, show the command plan, and only run
with `execute: true` / `--yes` on a disposable, isolated device the user has
authorized. Never run it against a personal device or a device on a trusted
network. The static and REA phases do not execute the app.

## Reference files

Load these on demand — they hold the detail this summary omits:

- `references/pipeline.md` — every analysis stage, what it produces, the run
  order, environment flags.
- `references/reading-reports.md` — `report.json` structure, each result
  section's fields, and how to read the composite risk score.
- `references/rasp-frameworks.md` — RASP/packer vendors, framework handling, and
  what each verdict means for next steps.
- `references/deep-and-dynamic.md` — the REA deep-pass task/result contract and
  the dynamic-bridge options and output.
