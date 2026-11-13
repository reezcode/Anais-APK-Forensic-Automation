# Anais pipeline — stages and outputs

`anais.sh` orchestrates the run. A TypeScript CLI (`anais`) and the MCP server
both invoke it. Everything writes JSON into `<workDir>/temp/` and human reports
into `<workDir>/reports/`. `workDir` is `<workspace>/<apk_basename>`.

## Order of operations

1. **prepare_input** (`prepare_input.py`) — normalize `.apk/.xapk/.apkm/.apks/.aab`
   to a base APK. XAPK/APKM/APKS pick the base split; AAB needs `bundletool`.
   Output: `prepare_input.json`, and the resolved `BASE_APK`.
2. **basic info** (`apk_basic_info.py`) — package, version, permissions,
   components. Output: `basic_info.json`.
3. **zip integrity / header fix** — detects encrypted/!broken zip headers
   (`check_zip_encryption.py`, `fix_apk_headers.py`).
4. **decompile (parallel)** — `apktool d` → `decompiled/`, `jadx` → `jadx_output/`
   run concurrently; logs in temp.
5. **parallel analysis block** — these run concurrently, each to its own log:
   - `detect_obfuscation.py` → `obfuscation_report.json` (+ `dex_payload_report.json`)
   - `detect_framework.py` → `framework_report.json`
   - `detect_rasp.py` → `rasp_report.json`
   - entropy analysis → `entropy_analysis.json` (encrypted payloads)
   - YARA scan → `yara_enhanced.json`
   - `signing_analyzer.py` → `signing_analysis.json`
   - `sdk_inventory.py` → `sdk_inventory.json` (`--online` adds OSV CVE lookup)
   - manifest analysis → `manifest_findings.json`
   - network artifacts → `network_findings.json`
   - SAST → `sast_findings.json`
6. **REA bridge** (`rea_bridge.py`, only if `ANAIS_REA=1`) — cheap REA passes →
   `rea_report.json`; deep-task handoff → `reports/rea_targets.json`.
7. **report** (`report_generator_modular.py`) — merges all JSON into
   `reports/report.md` + `reports/report.json`, plus per-section `.md` pages.
8. **derived outputs** — `frida_script_generator.py` → `reports/frida_auto.js`;
   `sarif_exporter.py` → `reports/report.sarif`;
   `python3 -m reema findings` → `reports/findings.json` (normalized findings).

Out-of-band, agent-driven (not in the default run):
- `rea_deep.py` — merge REA deep-pass answers → `rea_deep.json`, regenerate
  report + `frida_auto.js`.
- `dynamic_bridge.py` — run the app on a device under `frida_auto.js` →
  `dynamic_findings.json` (gated; executes the target).

## Environment flags

- `ANAIS_REA=1` — enable the REA bridge (Phase 1 + deep-task handoff).
- `ANAIS_REA_CMD` — override the REA command (else `rea`, else `npx -y rea-agents@<ver>`).
- `ANAIS_REA_SKIP=1` — hard-disable the REA bridge.
- `ANAIS_REA_MAX_SO` — cap native-export scan count. `ANAIS_REA_TIMEOUT` — per-call timeout.
- `ANAIS_WORKSPACE` — override the workspace root (default `~/.anais/reports`,
  deliberately off iCloud-synced paths).

## CLI flags

- `-y` / `--yara` — run the full YARA scan.
- APK path is positional (last arg to `anais.sh`).

## Extending

Each tool is standalone: reads the decompiled trees / APK, writes one JSON into
temp. Add a new tool by (1) writing `analysis_tools/<tool>.py` that emits
`<name>.json`, (2) adding it to the parallel block in `anais.sh`, (3) loading it
in `report_generator_modular.py`'s `result_files` and adding a render method.
