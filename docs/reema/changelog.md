# Reema Changelog

Format: newest first. Each entry lists what changed and where.

## 0.8.3 — backlog B18: anti-analysis manifest recovery (2026-11-13)

Validated against the two corpus misses (CORETAX, Taspen): both flip
`clean` → `suspicious`. Those samples ship a malformed binary `AndroidManifest.xml`
that androguard and apktool reject and that makes the axml2xml JS parser hang.

### Added
- **B18 — fallback manifest parsing** (`reema/_axml.py`, wired in `reema/apk.py`): when androguard recovers no permissions, `_manifest_fallback` recovers them and merges into `basic_info.json`, so the capability rules (notably `dangerous_permission_set`) still fire on a packed dropper. Two tiers: (1) a string-pool scrape of the raw manifest bytes (UTF-16/UTF-8) — fast and robust, since structural tampering rarely touches the string pool; (2) the bundled Node converter `axml/` (axml2xml), used only when the scrape finds nothing, bounded by a timeout because a malformed manifest can hang it. Degrades to no-op when neither recovers anything. CORETAX: 10 high-risk permissions recovered (BIND_ACCESSIBILITY_SERVICE, READ_SMS, SYSTEM_ALERT_WINDOW, RECORD_AUDIO, …).
- `tests/test_reema_backlog.py`: `AxmlFallbackTest` (6 tests — raw scrape, XML parse, binary-AXML fixture, merge, skip-when-present).

## 0.8.1 — corpus-driven content + engine fixes (2026-11-13)

Ran the corpus gate on a real malware set (`FourMays.apk`, `IsolPolicy-release.apk`).
It surfaced three defects; all fixed. Recall is now 2/2 (both caught), 0 errors.

### Fixed
- **Permission evidence is app-owned** (`reema/capabilities.py`): `Match.owners()` now attributes a manifest-declared permission/component to the app. Before, a permission-only capability was `owner=""`, so `verdict.decide` (which counts only `owner=="app"`) ignored it — a packed app verdicted `clean` despite dangerous declarations.
- **Index SQLite lock** (`reema/index.py`): `build()` wrapped its write connection in try/finally so it always closes. A mid-build androguard failure on a large/packed DEX previously leaked an open writer, locking `code_index.db` for every later reader (`capabilities.Facts.from_case` → `database is locked`). All `code_index.db` readers (`capabilities`, `index.api_usage`/`unreachable_classes`, `iocs._index_strings`) now use an explicit close + 30s busy timeout instead of a leak-prone bare `with`.

### Added
- **Permission-constellation capability** (`reema/capabilities/16-permission-profile.yaml` + `any_of_min` in the rule engine): `dangerous_permission_set` fires when ≥3 high-risk permissions (accessibility, overlay, SMS, call-log, device-admin, install) co-occur — the one static signal that survives packing, since the manifest remains even when the real DEX is unpacked at runtime. New `any_of_min` lets a rule require N-of-M conditions. Generic family `Android.HighRisk` signature (`reema/families.yaml`).
- **Per-sample corpus workspace** (`reema/corpus.py`): each sample analyses into its own workspace subdir.
- Tests: +5 (owner attribution, constellation threshold, packed-profile verdict/family, `any_of_min` validation).

## 0.8.0 — backlog B13/B14/B16 + anais.sh removal (2026-11-13)

Clears the last three backlog items (detection/defense content) and deletes the
retired bash engine. The backlog is now empty.

### Added
- **B13 — capability rules + chains**: real Android capability rules in `reema/capabilities/` (SMS send/intercept, overlay, accessibility abuse, device-admin, su, dynamic code loading, package install, location/audio/camera/screen/contacts/call-log/clipboard, boot persistence), each mapped to ATT&CK for Mobile. Behaviour chains in `reema/chains.yaml` (banker, SMS fraud, spyware, RAT, dropper, ransomware).
- **B14 — defense catalog**: defense entries in `reema/defenses/` keyed to every capability, each with code-level controls, a pass/fail check, and the ADR 0003 harness contract.
- **B16 — offline family classifier**: `reema/families.yaml` and `classify.signature_vote()` name a family from the app-owned capability profile — an offline source (no network, no YARA) independent of the behaviour chains, so a chain and a signature agreeing raises family confidence to high.
- `tests/test_reema_backlog.py`: `ContentDetectionTest` (4 tests — content loads/cross-refs, banker profile fires chain+signature, signature needs app caps, library-only capability stays non-malicious).

### Removed
- **`anais.sh` deleted** (retired as the engine in 0.7.0). The npm CLI (`src/index.ts`) and MCP now spawn `python3 -m reema analyze`; `getAnaisScriptPath` dropped, `package.json` `files`/`postinstall` and `scripts/validate_framework.sh` updated.
- Untracked 29 stray `__pycache__/*.pyc` / `.DS_Store` files that predated `.gitignore`.

## 0.7.0 — backlog B10: native Python APK engine (2026-11-13)

Cleared backlog B10. Every engineering backlog item is now implemented; the
only items left (B13, B14, B16) are detection/defense content owned by reez.

### Added
- **B10 — native Python APK engine** (`reema/apk.py`): `apk.run()` is a direct port of the `anais.sh` orchestrator. It drives the same `analysis_tools/` scripts and external tools (apktool, jadx, yara) in the same order, with the same output file names, so the Finding adapters and report are unchanged. Stages: `prepare_input` → `apk_basic_info` → protection check (ZIP-encryption probe + header fix) → apktool/jadx decompile (parallel) → analysis tools (obfuscation+dex-payload+SO-strings, framework, RASP, entropy, YARA, signing, SDK inventory, manifest, network, SAST — parallel) → `report_generator_modular` → Frida script + SARIF. `sdk_inventory` goes online only when `ANAIS_CVE_ONLINE=1` and the run is not `--offline`; the REA bridge still gates on `ANAIS_REA=1`.
- `tests/test_reema_backlog.py`: `ApkEngineTest` (4 tests — stage set/order, base-APK report name, online gating, protection pass-through).

### Changed
- `reema/cli.py`: the `analyze` engine stage for APKs now calls `reema/apk.py` instead of shelling out to `anais.sh`. Unused `subprocess` import and `LEGACY_ENGINE` constant removed. A run is fatal only when neither decompiler produced a tree.
- `reema` no longer invokes `anais.sh`. The script is retained for standalone use but is no longer the engine; it is deprecated and may be removed in a later release.

## 0.6.1 — backlog B17 (2026-11-13)

Cleared backlog B17. Remaining: B10 (native Python APK engine), B13/B14/B16
(detection/defense content, user-owned).

### Added
- **B17 — deep iOS analysis** (`reema/ios.py`): a stdlib Mach-O parser (`parse_macho`) reads the main executable's header and load commands — architecture(s) (incl. fat/universal slices, both byte orders), FairPlay encryption (`LC_ENCRYPTION_INFO[_64]` cryptid), PIE/ASLR (`MH_PIE`), code signature (`LC_CODE_SIGNATURE`), linked dylibs, and Swift use (`libswift*` / `__swift5`). `basic_info` now carries a `macho` block; `analyze` raises posture findings `macho_jailbreak_tooling` (Substrate/Cydia/Frida/… dylibs), `macho_unsigned`, `macho_no_pie`, `macho_not_encrypted`, plus a starter Apple-framework→capability map (`ios_cap_*`, context). A malformed binary degrades to the plist facts rather than failing the stage.
- `tests/test_reema_backlog.py`: `DeepIosTest` (5 tests, hand-built Mach-O fixtures).

## 0.6.0 — P4 corpus gate, family classifier, iOS IPA (2026-11-13)

### Added
- `reema/corpus.py` and `reema corpus`: regression gate for rule/chain changes. Runs the verdict over a labelled corpus (CSV/JSON manifest, samples outside the repo), reports precision/recall/FP-rate, and exits non-zero when the benign false-positive rate exceeds `--max-fp-rate` (default 0.0) or recall drops below `--min-recall`.
- `reema/classify.py`: family classifier that merges fired-chain families, the enrichment vote and `family:*` finding tags into one family with a confidence. Written to `findings.json` as `family`.
- `reema/ios.py` and `.ipa` input: structural IPA intake (Info.plist, entitlements, frameworks) with App Transport Security / URL-scheme posture findings via the new `ios` adapter (axis `posture`). The code index is skipped for IPAs.
- `tests/test_reema_p4.py` (18 tests).

### Changed
- `findings.json` gains a `family` block; `reema analyze` accepts `.ipa`.
- Backlog: added B16 (local signature-based family classifier) and B17 (deep iOS: Mach-O, Swift, iOS capability rules).

## 0.5.1 — backlog B15 (2026-11-13)

Cleared backlog B15. Remaining: B10 (native Python APK engine), B13 and B14
(capability + defense content, user-owned).

### Added
- **B15 — STIX 2.1 / MISP export** (`reema/iocs.py`): `iocs.write` also writes `reports/iocs.stix.json` (a STIX 2.1 bundle of the URLs/domains/IPs as `indicator` SDOs, with a `Reema` identity) and `reports/iocs.misp.json` (a MISP event with one network-activity attribute per IOC plus the sample hashes). Object IDs are deterministic (uuid5 over the indicator value) so a re-run on the same sample is diffable and de-duplicates on re-import. `stix_bundle()` and `misp_event()` are exposed for reuse.
- `tests/test_reema_backlog.py`: `StixMispExportTest` (4 tests).

## 0.5.0 — P3 Vaccine Pack (2026-11-13)

### Added
- `reema/vaccine.py`: Vaccine Pack generator. For each capability the engine found, writes an entry (Profile / Defense / Check / Harness) to `reports/vaccine/<capability>.md`, an `index.md`, and `reports/vaccine.json`. Capabilities are de-duplicated per rule, preferring the app-owned / highest-confidence instance. A capability with no defense entry gets a Profile and a visible stub.
- `reema/defenses/`: defense catalog (YAML keyed to capability ids), with one neutral example (`process_exec`). Load errors are reported and skipped.
- The six ADR 0003 harness guardrails are printed verbatim in every entry; Reema emits the defense and the check, never attack code.
- `docs/reema/vaccine-pack.md`: authoring guide for the catalog.
- `reema/cli.py`: `analyze` runs the vaccine stage after findings and records `reports/vaccine/` in `case.json`.
- `tests/test_reema_p3.py` (7 tests).

### Changed
- `reema analyze` prints a vaccine-entry count on the summary line.
- Backlog: added B14 (defense catalog + harness content, user-owned) and B15 (STIX 2.1 / MISP export).

## 0.4.1 — backlog B5, B12 (2026-11-13)

Cleared backlog B5 and B12. Remaining: B10 (native Python APK engine) and B13
(capability rule content, user-owned).

### Added
- **B5 — IOC enrichment** (`reema/enrich.py`): `ThreatFox` and `URLhaus` (abuse.ch) feeds. `run_iocs()` queries the extracted URLs/domains/IPs (capped at 50 per kind), caches per indicator with the hash-lookup TTLs, honours `--offline` and missing keys, and audits every live query in `case.json`. Keys: `REEMA_THREATFOX_API_KEY`, `REEMA_URLHAUS_API_KEY`. New `ioc_enrichment` adapter turns feed hits into `malice` findings; `reema/cli.py` runs the stage before findings so hits reach the verdict. `_http_json()` helper for JSON POST.
- **B12 — trustworthy bare-domain IOCs** (`reema/_psl.py`, `reema/iocs.py`): a bundled trimmed public-suffix list. `iocs.extract` re-enables the network analyzer's `domains` source, re-validating each candidate (lowercase labels, known public suffix, ≥2-char registrable label) so code identifiers like `coroutineId.id`, `R.id` and `r.id` are rejected while real domains pass.

### Fixed
- `analysis_tools/network_analyzer.py`: `extract_domains` drops any candidate containing an uppercase letter — a decompiled hostname is lowercase, so uppercase marks a code identifier (B12).

### Changed
- `tests/test_reema_backlog.py`: +10 tests (IOC feeds, public-suffix validation). Suite 103 → 113.

## 0.4.0 — P2 capability engine, verdict, IOCs (2026-11-13)

### Added
- `reema/capabilities.py`: data-driven capability engine. YAML rules in `reema/capabilities/` match the code index (api/string facts) and manifest (permission/component facts); `requires` is AND, `any_of` is OR, patterns are case-insensitive substrings. Owner and reachability set finding confidence. Malformed rules are reported (`capability_rule_errors`) and skipped. One neutral example rule ships (`process_exec`).
- `reema/verdict.py`: behaviour chains (`reema/chains.yaml`) and `decide()`, which writes the `verdict` block (label malicious/suspicious/pua/clean, family, confidence, fired chains, reasons). Only app-code capabilities escalate the label; the enrichment family vote can raise it, never lower it.
- `reema/iocs.py`: IOC extraction and export to `reports/iocs.json` and `reports/iocs.csv`, defanged (`hxxp://`, `[.]`). URLs and IPs come from the network analyzer and the code-index string table; domains come from URL hosts.
- `reema/cli.py`: `write_findings` runs the capability engine and verdict; `analyze` writes IOCs and prints the verdict line.
- `docs/reema/capability-rules.md`: authoring guide for rules and chains.
- `tests/test_reema_p2.py` (14 tests).

### Changed
- `findings.json` gains a `verdict` block and a `capability` finding source; `reema analyze` prints a verdict line.
- Backlog: B5 (IOC enrichment) now unblocked; added B12 (trustworthy bare-domain IOCs) and B13 (capability rule content).

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
