# REA Deep Pass (Phase 2, agent-driven)

Anais' Phase 1 REA bridge (`ANAIS_REA=1`) runs the cheap, deterministic REA
analyses and writes **`rea_targets.json`** into the report folder: a list of the
expensive, targeted questions that need REA's deep tools (native decompilation,
flow tracing, dynamic ADB/Frida). Phase 2 is where an agent answers them.

Anais does **not** run these itself. They cost real time, often need a native
disassembler (Ghidra/Hopper), and some need a device. An agent with REA (MCP
tools, or the `rea` / `npx rea-agents` CLI) executes them out-of-band, then
merges the answers back.

## Flow

```
anais.sh (ANAIS_REA=1)
   └─ rea_bridge.py  ──►  reports/rea_targets.json   (the task list)
                                   │
            agent runs REA deep tools per task
                                   │
                          raw_results.json           (agent writes)
                                   │
   rea_deep.py  ──►  reports/rea_deep.json  ──►  report.md / report.json
```

## 1. Read the task list

`rea_targets.json`:

```json
{
  "schema": 2,
  "apk": "/path/app.apk",
  "decompiled_dir": "/.../decompiled",
  "temp_dir": "/.../temp",
  "deep_results_path": "/.../reports/rea_deep.json",
  "tasks": [
    {
      "id": "rasp-qihoo-360-jiagu",
      "priority": "high",
      "trigger": "rasp:Qihoo 360 Jiagu",
      "rea_tool": "open_binary",
      "cli_hint": "follow with trace_native_values / native runtime for the abort path",
      "target": "Qihoo 360 Jiagu detection library (see rasp_report.json evidence)",
      "obtain": "detection lib under /.../decompiled/lib/<abi>/ (path in rasp_report.json)",
      "goal": "Decompile the library; trace JNI_OnLoad and the exit/abort path...",
      "extract": ["abort_function_address", "detection_routines", "bypass_hint"],
      "feeds": ["frida_native_hooks"]
    }
  ]
}
```

Work tasks `priority: high` first. `obtain` tells you where the artifact already
sits (most are extracted under `decompiled_dir`); if a `.so`/`.dll` is only in
the APK, pull it out first. Xamarin `assemblies/*.dll` may be XALZ-compressed —
inflate before decompiling.

## 2. Route each task to a REA tool

Use REA's **"Route the target first"** rule (the `reverse-engineer-anything`
skill). `rea_tool` is the suggested entry point:

| Task trigger | REA entry tool | Then |
|--------------|----------------|------|
| `rasp:*`, `native:stripped-library`, `heuristic:*` | `open_binary` | decompile `JNI_OnLoad`; `trace_native_values` for the abort/detection path |
| `native:jni-surface` | `open_binary` | map JNI exports → Java methods |
| `framework:Flutter` | `open_binary` on `libapp.so` | recover Dart (blutter), map login/nav flow |
| `framework:Unity` | `inspect_il2cpp_metadata` (+ linked `libil2cpp.so`) | method → native address map |
| `framework:Xamarin / .NET MAUI` | `inspect_managed_artifact` | decompile app assembly logic |

Keep each task's **Evidence** (evidence_id, limitations). Do not assert beyond
what REA returns; a stripped library with no pseudocode stays "unknown", not
"benign".

## 3. Write raw results

One JSON file, any name (e.g. `raw_results.json`):

```json
{
  "completed": [
    {
      "task_id": "rasp-qihoo-360-jiagu",
      "rea_tool": "open_binary",
      "target": "lib/arm64-v8a/libjiagu_a64.so",
      "evidence_id": "<from REA>",
      "findings": {
        "abort_function_address": "0x1a2b0",
        "detection_routines": ["ptrace", "/proc/self/status TracerPid"]
      },
      "native_hooks": [
        {"symbol": "JNI_OnLoad", "address": "0x1980", "note": "init + first check"},
        {"symbol": "sub_1a2b0", "address": "0x1a2b0", "note": "abort() on detection"}
      ],
      "limitations": ["dynamic string decryption not resolved statically"]
    }
  ],
  "skipped": [
    {"task_id": "native-jni-libc++_shared.so", "reason": "stdlib, no app logic"}
  ],
  "notes": ["device not available; dynamic tasks deferred"]
}
```

- `findings` — free-form object; the `extract` keys from the task are the target.
- `native_hooks` — entries with an `address` or `symbol`; these surface in the
  report as candidate Frida targets and feed the Frida script (Phase 3).
- `task_id` must match an id from `rea_targets.json` (unknown ids are flagged).

## 4. Merge

```bash
python3 analysis_tools/rea_deep.py \
    <reports>/rea_targets.json \
    raw_results.json \
    <reports>/rea_deep.json \
    --work-dir <apk_work_dir> --temp-dir <apk_work_dir>/temp \
    --apk app.apk --sha <sha256>
```

This validates against the task list, writes canonical `rea_deep.json`,
regenerates `report.md` / `report.json` with a **Deep Pass (agent-driven)**
section, and regenerates `reports/frida_auto.js` so every `native_hooks` entry
becomes a concrete `Interceptor.attach(base.add(ptr('0x...')))` block (Phase 3).
Omit the `--work-dir/--temp-dir/--apk` flags to only write `rea_deep.json`
without regenerating anything.

So the `native_hooks` you report are the payload that wires REA's recovered
addresses straight into the ready-to-run Frida script — give each a real
`address` (file offset from `open_binary`) and, when known, its `symbol`.

Tasks you neither complete nor skip stay in `pending` and are reported as still
queued.
