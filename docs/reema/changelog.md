# Reema Changelog

Format: newest first. Each entry lists what changed and where.

## 0.3.0 — backlog clearance (2026-11-13)

Cleared backlog items B1, B2, B3, B4, B6, B7, B8, B9 and B11 (K2–K5). Remaining:
B5 (IOC enrichment, blocked on the P2 IOC extractor) and B10 (native Python APK
engine). See `backlog.md`.

### Added
- **B2 — string table** (`reema/index.py`): `strings(class_id, method, value)` from `dx.get_strings()` xrefs, with a `strings_value` index. Needed by P2 configuration-value rules.
- **B1 — reachability** (`reema/index.py`): `methods(id, class_id, name, descriptor, reachable)` and a `reachable` column on `classes`. The walk seeds from manifest components (activities, services, receivers, providers, application class) and their internal superclasses, then follows direct calls, overriding methods in subclasses, `<init>` of instantiated classes and `<clinit>` of reached classes. `reema/adapters.py` downgrades findings in unreachable classes to `low` confidence and tags them `unreachable`. JAR input (no manifest) leaves `reachable` NULL. Known gaps: reflection, native code, runtime-loaded code.
- **B3 — JVM-only JAR index** (`reema/index.py`): a JAR holding only `.class` files is converted with `d8` before analysis (`dex_source: "d8"`); without `d8` on PATH the index is skipped as before.
- **B8 — ssdeep** (`reema/case.py`): `ssdeep_hash()` records an ssdeep fuzzy hash on each input when the `ssdeep` module is installed, behind the same optional-import pattern as TLSH.
- **B6 — more hash providers** (`reema/enrich.py`): `Koodous` and `HybridAnalysis`, keys from `REEMA_KOODOUS_API_KEY` and `REEMA_HYBRIDANALYSIS_API_KEY`; their `found` results become enrichment findings.
- **B7 — family normalization** (`reema/enrich.py`): `normalize_family()` reduces every engine's label to one family with a confidence (AVclass-style majority vote after stripping category/platform tokens). Stored as `family` in `enrichment.json` and tagged on enrichment findings; feeds the P2 verdict.
- **B4 — sample upload** (`reema/enrich.py`, `reema/cli.py`): `reema analyze --upload` uploads the sample to providers that support it (MalwareBazaar, VirusTotal). Opt-in only (ADR 0004), refused together with `--offline`; every upload is audited in `case.json` with `sample_uploaded: true`.
- **B9 — child samples** (`reema/cli.py`, `reema/case.py`): `reema analyze --extract-children` extracts DEX-bearing container payloads the hunter found and analyzes each as a linked child case; parent and child `case.json` cross-reference via `children[]` / `parent`.
- `tests/test_reema_backlog.py` (22 tests).

### Fixed
- **K2** (`analysis_tools/yara_enhanced_analyzer.py`): YARA severity now reads each rule's `meta.threat_level` instead of guessing from the rule name; the name heuristic is the fallback for rules without the meta field.
- **K3** (`analysis_tools/network_analyzer.py`): `is_suspicious_url` no longer flags every URL containing `api`, `upload` or `download`; only C2-like whole path segments remain, so `robot` no longer matches `bot`.
- **K4** (`rules/yara_general_rules.yar`): `Android_General_Malware` dropped the `3 of them` condition that fired on benign reflection/Base64/crypto strings; a match now needs a real code-execution or code-loading signal.
- **K5** (`analysis_tools/network_analyzer.py`): the suspicious-TLD list is loaded from `analyzer_config.json` instead of being duplicated in code; the in-code list is only a fallback.

### Changed
- `reema/index.py` summary gains `dex_source`, `methods`, `reachable_methods`, `reachable_classes`, `strings`; `reema/cli.py` logs reachability and string counts.

## 0.2.0 — P1 intake, index, enrichment (2026-11-13)

### Added
- `reema/case.py`: `case.json` (`reema.case/v1`) with input hashes (md5/sha1/sha256, TLSH if `py-tlsh` is installed), artifact hashes (file or tree digest), tool versions, enrichment audit trail, stage events.
- `reema/index.py`: androguard code index in `temp/code_index.db` (classes with owner, framework API call sites); `api_usage()` query helper.
- `reema/enrich.py`: MalwareBazaar and VirusTotal hash lookups, SQLite cache, `--offline`; keys from `REEMA_MALWAREBAZAAR_API_KEY`, `REEMA_VIRUSTOTAL_API_KEY`.
- `reema/jar.py`: JAR engine.
- `reema/_legacy.py`: bridge to `analysis_tools/`.
- `enrichment` adapter; `Finding.owner`; `summary.by_owner`, `summary.malice_by_owner`.
- `reema analyze` options: `--analyst`, `--case-dir`, `--offline`, `--no-enrich`, `--no-index`; `.jar` input.
- `sdk_inventory.owner_of()`; SDK entries: Android Support Library, Material Components, Guava, kotlinx, JetBrains annotations, libsu, Xposed API.
- `tests/test_reema_p1.py` (16 tests).
- `docs/reema/backlog.md`.

### Changed
- `reema analyze` creates the case directory and passes it to `anais.sh` through `ANAIS_CASE_DIR`. Case directories are named `<stem>_<YYYYmmdd_HHMMSS>Z` (UTC).
- `sast_scanner.py` scans app-owned files before SDK files under its 500-file cap.

### Fixed
- K1: `sast_scanner.py` matched patterns inside comments, including jadx's `/* loaded from: classes.dex */` header in every file. Comments are now blanked before matching; snippets still show the original source.

## 0.1.0 — P0 foundation (2026-11-13)

### Added
- `reema/` package, run as `python3 -m reema`:
  - `analyze <sample>`: runs the static pipeline (`anais.sh`) and reports the location of `findings.json`.
  - `findings <case_dir> [--sample FILE]`: builds `reports/findings.json` for an existing case.
- `reema.findings/v1` schema (`reema/findings.py`): severity, axis (`malice` / `posture` / `context`), confidence, evidence, ATT&CK IDs, ids that stay the same across runs.
- Adapters from 8 legacy analyzer outputs (`reema/adapters.py`).
- `anais.sh` writes `reports/findings.json` at the end of every run.
- `dex_payload_hunter.py` changes:
  - New `container_payloads` result: ZIP assets, ZIPs embedded in `.so` files, and suspicious assets.
  - New `--target` and `--extract` options.
- `tests/test_reema.py` (12 tests).
- Docs:
  - `docs/README.md`
  - `docs/reema/README.md`, `design.md`, `roadmap.md`, `finding-schema.md`, `changelog.md`
  - `docs/reema/decisions/0001`–`0004`
  - `docs/dyxon/README.md`

### Changed
- Docs moved and renamed to kebab-case:

| Old | New |
|---|---|
| `docs/STATIC_CORE_ARCH.md` | `docs/reema/static-core-architecture.md` |
| `docs/TOOLS_ARCHITECTURE_AND_FLOW.md` | `docs/reema/tools-architecture-and-flow.md` |
| `docs/YARA_RULES_ARGS.md` | `docs/reema/custom-yara-and-api-keys.md` |
| `docs/REA_DEEP_PASS.md` | `docs/reema/rea-deep-pass.md` |
| `docs/WORKFLOW_REF.md` | `docs/reema/analyst-quick-reference.md` |
| `docs/DYNAMIC_ANALYSIS.md` | `docs/dyxon/dynamic-analysis.md` |
| `docs/MCP_AND_SKILL.md` | `docs/platform/mcp-and-skill.md` |

- References to the moved docs updated in:
  - `README.md`
  - `anais.sh`
  - `src/mcp/server.ts`
  - `analysis_tools/rea_bridge.py`, `rea_deep.py`, `dynamic_bridge.py`
- `scripts/validate_framework.sh` checks `report_generator_modular.py` instead of the removed `report_generator.py`.
- `package.json` ships the `reema/` directory.

### Fixed
- On macOS, the `SHA256` value in `anais.sh` contained the file path as well as the hash, and the report showed both.

### Removed
- `analysis_tools/find_encrypted_payload.py`: merged into `dex_payload_hunter.py`.
- `analysis_tools/yara_results_processor.py`: had no callers.
- `analysis_tools/report_generator.py`: replaced by `report_generator_modular.py`.
- 49 `.pyc` files that git was tracking despite `.gitignore`.
