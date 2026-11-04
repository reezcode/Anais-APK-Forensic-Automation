---
name: anais-agent
description: Use for Android APK forensics and mobile app security analysis — when a request involves a local .apk/.xapk/.apkm/.apks/.aab and asks to analyze, scan, triage, reverse, or assess it (SAST, permissions, RASP/packer, obfuscation, signing, SDKs/trackers, malware risk, framework ID, SSL pinning, root/anti-debug), or to drive the deep REA pass or dynamic Frida run on one. Mobile scope only.
---

# Anais Agent

Anais is an Android APK static-forensics pipeline with an optional REA deep pass
and a gated dynamic (ADB/Frida) bridge. Use it whenever a claim depends on what a
local Android app package actually contains or does. Mobile scope only — for
non-APK targets (iOS, firmware, desktop binaries, JS/Electron) route to the
`reverse-engineer-anything` skill instead.

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

Prefer the **MCP tools** when the Anais server is connected (names below). If it
is not, use the **CLI / Python tools** — identical pipeline.

### Phase 0–1 · static (+ optional REA bridge)

- MCP: `anais_analyze({ apkPath, yara?, rea? })` → returns `workDir`, report
  paths, and a summary. Set `rea: true` to also run REA's cheap passes and emit
  the deep-task list.
- CLI: `anais /abs/path/app.apk` (add `-y` for full YARA; prefix `ANAIS_REA=1`
  for the REA bridge).
- Read results: `anais_read_report({ workDir })` (add `full: true` for the whole
  `report.json`), or read `<workDir>/reports/report.md`.

### Phase 2 · REA deep pass (agent-driven)

Only when `rea: true` was used and deep questions were queued.

1. Get tasks: `anais_rea_targets({ workDir })` → `rea_targets.json` (schema 2:
   each task has `rea_tool`, `target`+`obtain`, `extract` keys, `feeds`).
2. Execute each task with **REA's deep tools** (the `reverse-engineer-anything`
   skill): `open_binary` / `trace_native_values` for native and RASP abort paths,
   `inspect_il2cpp_metadata` for Unity, `inspect_managed_artifact` for Xamarin,
   `open_binary` on `libapp.so` (blutter) for Flutter. Keep each Evidence record;
   do not assert beyond what REA returns.
3. Merge: `anais_merge_deep({ workDir, results })` where `results` follows
   `docs/REA_DEEP_PASS.md` (`completed[]` with `findings` and `native_hooks[]`).
   This writes `rea_deep.json`, regenerates the report's **Deep Pass** section,
   and compiles the recovered addresses into `frida_auto.js`.
   - CLI equivalent: write the raw results to a file and run
     `python3 analysis_tools/rea_deep.py <reports>/rea_targets.json raw.json <reports>/rea_deep.json --work-dir <workDir> --temp-dir <workDir>/temp --apk <name> --sha <sha>`.

### Phase 3 is automatic

`frida_auto.js` is (re)generated from the findings; after a deep-pass merge it
contains concrete `Interceptor.attach(base.add(ptr('0x…')))` hooks at the
REA-recovered RASP/JNI addresses. Nothing to call — just use the script.

### Phase 4 · dynamic (ADB/Frida) — gated

- MCP: `anais_dynamic({ workDir, execute?, mode?, timeout?, serial? })`.
  `execute` defaults to **false** (dry-run: returns the command plan, runs
  nothing). Pass `execute: true` to drive the device.
- CLI: `python3 analysis_tools/dynamic_bridge.py <workDir>/temp <workDir>/reports
  --timeout 30` (add `--yes` to execute). Full guide: `docs/DYNAMIC_ANALYSIS.md`.

## Safety

The dynamic bridge **executes the target application** on a device; the target
may be malware. Default to dry-run first, show the command plan, and only run
with `execute: true` / `--yes` on a disposable, isolated device the user has
authorized. Never run it against a personal device or a device on a trusted
network. The static and REA phases do not execute the app.

## Reading output

`report.json` = `{ metadata, results }`. Key result sections: `basic_info`,
`framework`, `rasp`, `signing`, `sdk_inventory`, `sast`, `rea`, `rea_deep`,
`dynamic`, plus the composite `risk`. Prefer the compact summary; read the full
report or a specific detailed `.md` only when a section needs it.
