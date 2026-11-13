# Reema pipeline — stages and outputs

`reema/apk.py` (the native-Python engine, run as `python3 -m reema analyze`)
orchestrates the run; the TypeScript CLI (`anais`) and the MCP server spawn it.
(`anais.sh` was retired in 0.8.0.) Everything writes JSON into `<workDir>/temp/`
and human reports into `<workDir>/reports/`. `workDir` is the case directory
`<workspace>/<apk_basename>_<timestamp>`.

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
8. **report + derived outputs** — normalized `reports/findings.json`
   (`reema.findings/v1`: capability engine + verdict + family), `reports/report.sarif`,
   `reports/frida_auto.js`, and the **Vaccine Pack** (`reports/vaccine/*.md` +
   `reports/vaccine.json`, one defense + check per capability found). `case.json`
   at the case root records hashes, tool versions, enrichment and stage events.

Out-of-band, agent-driven (not in the default run):
- `rea_deep.py` — merge REA deep-pass answers → `rea_deep.json`, regenerate
  report + `frida_auto.js` (see `rea-deep-pass.md`).
- **Dynamic** is a separate feature now (**Dyxon**), not part of the Reema run.
  The static→dynamic hand-off is the `dyxon-agent` skill.

## Environment flags

- `ANAIS_REA=1` — enable the REA bridge (Phase 1 + deep-task handoff).
- `ANAIS_REA_CMD` — override the REA command (else `rea`, else `npx -y rea-agents@<ver>`).
- `ANAIS_REA_SKIP=1` — hard-disable the REA bridge.
- `ANAIS_REA_MAX_SO` — cap native-export scan count. `ANAIS_REA_TIMEOUT` — per-call timeout.
- `ANAIS_WORKSPACE` — override the workspace root (default `~/.anais/reports`,
  deliberately off iCloud-synced paths).

## CLI (`python3 -m reema`)

- `analyze <sample>` — full static run (APK/XAPK/APKM/APKS/AAB/JAR/IPA) →
  case dir with `findings.json` + `vaccine.json`. Flags: `-y/--yara <file>`
  (repeatable), `--offline` (cache-only enrichment), `--no-enrich`, `--no-index`,
  `--case-dir <dir>`, `--extract-children`, `--analyst <name>`.
- `findings <case_dir>` — rebuild `reports/findings.json` from `temp/*.json`
  (this is what folds in `dynamic_findings.json` after a Dyxon run).
- `corpus <manifest> --samples-dir <dir>` — regression gate over labelled samples
  (`--max-fp-rate`, `--min-recall`).

## Extending

Each analyzer is standalone: reads the decompiled trees / APK, writes one JSON
into `temp/`. Add one by (1) writing `analysis_tools/<tool>.py` that emits
`<name>.json`, (2) wiring it into the engine (`reema/apk.py`), (3) adding a
`reema/adapters.py` adapter + registry entry so its output becomes findings.
