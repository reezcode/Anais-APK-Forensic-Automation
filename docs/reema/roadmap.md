# Reema Roadmap

Last updated: 2026-11-13.

| Phase | Scope | Status |
|---|---|---|
| P0 | Package skeleton, Finding schema, cleanup | **Done** (2026-11-13, commit `c397af94`) |
| P1 | Intake and case record, JAR input, code index, enrichment and cache | **Done** (2026-11-13); reachability shipped in 0.3.0 (B1) |
| P2 | Capability engine, verdict and posture split, IOC export | **Done** (2026-11-13); rule content → backlog B13 |
| P3 | Vaccine Pack generator, STIX 2.1 / MISP export | **Done** (2026-11-13); defense content → backlog B14, STIX/MISP → B15 |
| P4 | Test corpus gate, family classifier, iOS IPA | Next |

Target design for every phase: [`design.md`](design.md).
Designed but unimplemented work, ready to pick up: [`backlog.md`](backlog.md).

## P0 — Foundation (done)

| Item | Result |
|---|---|
| `reema/` Python package | `reema/cli.py`, `reema/findings.py`, `reema/adapters.py`; runs as `python3 -m reema` |
| Common Finding schema | `reema.findings/v1`, see [`finding-schema.md`](finding-schema.md) |
| Legacy adapters | 8 analyzers mapped: sast, yara, manifest, network, signing, rasp, dex_payload, entropy |
| Pipeline hook | `anais.sh` writes `reports/findings.json` on every run |
| Sample hashes | md5/sha1/sha256 computed in Python, stored in `findings.json` |
| Hash bug | Fixed: on macOS, the `SHA256` value in `anais.sh` contained the file path |
| Payload tool merge | `find_encrypted_payload.py` merged into `dex_payload_hunter.py` (`container_payloads`, `--target`, `--extract`) |
| Dead code | Removed `yara_results_processor.py` and the legacy `report_generator.py`. Kept `error_logger.py` (3 importers). |
| Repo hygiene | 49 tracked `.pyc` files removed from the git index |
| Docs | Reorganized into `docs/{reema,dyxon,platform}/` with kebab-case names; index in `docs/README.md` |
| Tests | `tests/test_reema.py`, 12 tests; suite total 53, all passing |

**Verification on 2026-11-13:**
- Sample: `SSLKiller-v1.2beta.apk`, sha256 `b5266732…c876b5`, run end to end.
- Result: 636 findings (malice 518, posture 116, context 2).
- The malice count is inflated by K1.

## P1 — Intake, index, enrichment (done)

| Item | Result |
|---|---|
| K1 fix | `sast_scanner.py` blanks Java comments before matching (line numbers kept) and scans app-owned files before SDK files under its 500-file cap. `sdk_inventory.owner_of()` tags every finding `app` / `sdk:<name>`; SDK findings drop to `low` confidence. SDK table gained AndroidX-adjacent libraries, libsu, and the Xposed API. |
| Case record | `reema/case.py` writes `case.json` (`reema.case/v1`): inputs (md5/sha1/sha256, optional TLSH), artifacts (file hash or tree digest), tool versions, online lookups, stage events. |
| JAR input | `reema/jar.py`: jadx, SAST, network, entropy, payload, YARA, report. No apktool. |
| Code index | `reema/index.py` → `temp/code_index.db`: classes with owner, framework API call sites. APK and DEX-bearing JAR. Reachability → backlog B1. |
| Enrichment | `reema/enrich.py`: MalwareBazaar and VirusTotal hash lookups, SQLite cache (7-day TTL found, 1-day not found), `--offline`, audit in `case.json`. Upload → backlog B4. |
| CLI | `reema analyze` owns the case: creates the directory, passes it to `anais.sh` via `ANAIS_CASE_DIR`, then runs index, enrichment, findings, and artifact hashing. |
| Tests | `tests/test_reema_p1.py`, 16 tests; suite total 69, all passing. |

**Verification on 2026-11-13** (same reference sample as P0):

| Metric | P0 | P1 |
|---|---|---|
| Findings | 636 | 568 |
| Malice | 518 | 218 |
| Malice in app code (`malice_by_owner.app`) | n/a | **4** |

The 4 remaining are the sample's own root-shell calls, which is correct for a
root tool. JAR check: `gson-2.11.0.jar` ran every stage in 3.3 s; index
reported "no DEX" as designed.

**Exit criteria:** K1 closed ✔; a JAR analyzes without errors ✔; a repeat run
of the same sample makes no network calls (cache hit, test
`test_second_run_uses_cache_and_offline_sends_nothing`) ✔.

## P2 — Capabilities and verdict (done)

| Item | Result |
|---|---|
| Capability engine | `reema/capabilities.py`: YAML rules in `reema/capabilities/`, matched against the code index (api/string) and manifest (permission/component). `requires` = AND, `any_of` = OR, case-insensitive substring. Owner/reachability set confidence. Load errors surface in `findings.json` `capability_rule_errors`. |
| Behaviour chains + verdict | `reema/verdict.py`: chains in `reema/chains.yaml` combine capability ids; `decide()` writes the `verdict` block (label/family/confidence/chains/reasons). Only app-code capabilities escalate; enrichment family can raise, never lower. |
| IOC export | `reema/iocs.py` → `reports/iocs.json` + `reports/iocs.csv`, defanged; URLs/IPs from the network analyzer and the code-index string table, domains from URL hosts (bare-domain harvest → backlog B12). Unblocks B5. |
| Content split | Engine is content-free. The real capability rules and chains are backlog B13 (owner: reez); format in [`capability-rules.md`](capability-rules.md). Ships one neutral example rule (`process_exec`). |
| Docs | [`capability-rules.md`](capability-rules.md) authoring guide; schema gains the `verdict` block. |
| Tests | `tests/test_reema_p2.py`, 14 tests; suite total 105, all passing. |

**Verification on 2026-11-13** (reference sample `SSLKiller-v1.2beta.apk`, `--no-enrich`):
verdict `CLEAN` (confidence low); the one example capability (`process_exec`)
matched only in the bundled `libsu` library, so it did not escalate — correct.
57 IOCs exported (5 URLs incl. the sample's real `t.me/sslkiller` channel).

## P3 — Vaccine Pack (done)

| Item | Result |
|---|---|
| Vaccine Pack generator | `reema/vaccine.py`: one entry per capability found (Profile / Defense / Check / Harness), written to `reports/vaccine/<cap>.md`, `reports/vaccine/index.md` and `reports/vaccine.json`. A capability with no defense gets a Profile and a visible stub. |
| Defense catalog | YAML in `reema/defenses/`, keyed to capability ids. Load errors reported and skipped. |
| ADR 0003 guardrails | The six harness limits are printed verbatim in every entry as the contract any harness must meet. Reema emits the defense and check, never attack code. |
| Content split | Engine is content-free; the real defense catalog and runnable harnesses are backlog B14 (owner: reez). Ships one neutral example (`process_exec`). Format: [`vaccine-pack.md`](vaccine-pack.md). |
| STIX 2.1 / MISP export | Deferred to backlog B15; IOC JSON/CSV already ship (P2). |
| Tests | `tests/test_reema_p3.py`, 7 tests; suite total 120, all passing. |

**Verification on 2026-11-13** (reference sample `SSLKiller-v1.2beta.apk`, `--no-enrich`):
one capability found (`process_exec`), one Vaccine Pack entry written with its
defense, check and guardrails.

## P4 — Quality and reach

- Labelled corpus and a precision/recall gate on rule changes.
- Family classifier.
- iOS IPA intake.

## Known issues

K1 (SAST matched jadx comments) was fixed in P1; K2–K5 were fixed in 0.3.0 (backlog
B11). See [`changelog.md`](changelog.md). No open known issues.

| Id | Issue | Evidence | Fixed in |
|---|---|---|---|
| K2 | YARA severity is guessed from the rule name (`yara_enhanced_analyzer.get_severity`), not read from `meta.threat_level`. | `analysis_tools/yara_enhanced_analyzer.py` | 0.3.0 |
| K3 | `network_analyzer.is_suspicious_url` flags any URL containing `api`, `upload` or `download`. | `analysis_tools/network_analyzer.py` | 0.3.0 |
| K4 | The `Android_General_Malware` YARA rule fires on strings common in benign apps (`getMethod`, `.invoke(`, `Base64.decode`). | `rules/yara_general_rules.yar` | 0.3.0 |
| K5 | The suspicious TLD list is hardcoded in `network_analyzer.py` and duplicated in `analyzer_config.json`. | Both files | 0.3.0 |
