# REA deep pass + dynamic bridge — contracts

## REA deep pass (Phase 2)

`rea_targets.json` (schema 2) lists machine-actionable tasks:

```json
{
  "schema": 2, "apk": "...", "decompiled_dir": "...", "temp_dir": "...",
  "deep_results_path": ".../reports/rea_deep.json",
  "tasks": [{
    "id": "rasp-qihoo-360-jiagu", "priority": "high", "trigger": "rasp:Qihoo 360 Jiagu",
    "rea_tool": "open_binary", "cli_hint": "...", "target": "...", "obtain": "...",
    "goal": "...", "extract": ["abort_function_address", "detection_routines"],
    "feeds": ["frida_native_hooks"]
  }]
}
```

Work `priority: high` first. `obtain` says where the artifact already sits
(usually under `decompiled_dir`); pull a `.so`/`.dll` from the APK if it is not
extracted, and inflate XALZ-compressed Xamarin DLLs first. Route each task per
its `trigger` (see `rasp-frameworks.md`). Keep every Evidence record; a stripped
library with no pseudocode stays "unknown", not "benign".

Write answers (any filename) in this shape, then merge:

```json
{
  "completed": [{
    "task_id": "rasp-qihoo-360-jiagu", "rea_tool": "open_binary",
    "target": "lib/arm64-v8a/libjiagu_a64.so", "evidence_id": "<from REA>",
    "findings": { "abort_function_address": "0x1a2b0", "detection_routines": ["ptrace"] },
    "native_hooks": [{ "symbol": "JNI_OnLoad", "address": "0x1980", "note": "init check" }],
    "limitations": ["dynamic string decryption not resolved statically"]
  }],
  "skipped": [{ "task_id": "native-jni-libc++_shared.so", "reason": "stdlib" }],
  "notes": ["device not available; dynamic deferred"]
}
```

- `findings` — free-form; aim it at the task's `extract` keys.
- `native_hooks` — entries with an `address` and/or `symbol`. These are the
  payload: they become concrete Frida hooks in `frida_auto.js`, so give real
  file offsets from `open_binary`.
- `task_id` must match a task id (unknown ids are flagged).

Merge — MCP `anais_merge_deep({ workDir, results })`, or CLI:

```bash
python3 analysis_tools/rea_deep.py <reports>/rea_targets.json raw.json \
    <reports>/rea_deep.json --work-dir <workDir> --temp-dir <workDir>/temp \
    --apk <name> --sha <sha>
```

Merge validates against the task list, writes `rea_deep.json`, and regenerates
the report's Deep Pass section plus `frida_auto.js`. Tasks neither completed nor
skipped land in `pending`.

## Dynamic bridge (Phase 4)

Runs the target on a connected device under `frida_auto.js`, captures the
`[Anais]` hook output + a logcat dump into `dynamic_findings.json`:

```json
{
  "executed": true, "package": "...", "mode": "spawn", "duration_sec": 30.4,
  "hits_total": 7,
  "hooks": { "ssl_bypass": [...], "crypto": [...], "keys": [...],
             "native": [...], "dlopen": [...], "root_blocked": [...] },
  "logcat": { "crashes": [...], "exceptions": [...], "lines": 1234 },
  "errors": [], "notes": []
}
```

Invoke — MCP `anais_dynamic({ workDir, execute?, mode?, timeout?, serial? })`
(`execute` defaults to false = dry-run), or CLI
`python3 analysis_tools/dynamic_bridge.py <workDir>/temp <workDir>/reports
--timeout 30 [--yes]`. Options: `--mode spawn|attach`, `--serial`, `--timeout`,
`--install`/`--apk-path`, `--frida-script`.

Preflight checks `adb`/device/`frida-server` (`frida-ps -U`) before any
execution. Reading results: native hooks firing at REA-recovered addresses prove
the Phase-3 bypass works; `crypto`/`keys` lines capture runtime key material; a
logcat crash right after launch usually means a detection fired before the hook
landed (switch to `attach` or hook `JNI_OnLoad` earlier).

**SAFETY:** this executes the target (possibly malware). Dry-run first, show the
plan, and only execute with `execute:true`/`--yes` on a disposable, isolated,
authorized device.
