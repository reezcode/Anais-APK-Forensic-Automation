# Reema Roadmap

Last updated: 2026-11-13.

| Phase | Scope | Status |
|---|---|---|
| P0 | Package skeleton, Finding schema, cleanup | **Done** (2026-11-13, not yet committed) |
| P1 | Intake and case record, JAR input, code index, enrichment and cache | Next |
| P2 | Capability engine, verdict and posture split, IOC export | Planned |
| P3 | Vaccine Pack generator, STIX 2.1 / MISP export | Planned |
| P4 | Test corpus gate, family classifier, iOS IPA | Planned |

Target design for every phase: [`design.md`](design.md).

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

## P1 — Intake, index, enrichment (next)

The steps are ordered. K1 comes first because every later number depends on it.

1. Fix K1: add code-owner tagging and drop matches inside decompiler comments.
2. Write `case.json` (design §3.1): hash every input and artifact, record tool versions.
3. Add JAR intake: jadx only, no apktool, with class-based analyzers.
4. Build the code index with androguard: call sites, owner, reachability.
5. Add enrichment providers behind `--offline` and `--upload`, with the SQLite cache.
6. Report the counts on the SSLKiller reference sample before and after the K1 fix.

**Exit criteria:**
- K1 is closed.
- A JAR analyzes without errors.
- A repeat run of the same sample makes no network calls.

## P2 — Capabilities and verdict

- YAML capability rules and the matching engine (design §3.4), with about 20 starter capabilities.
- Behaviour chains and the `verdict` block (design §3.5).
- Report reordered: the verdict and capabilities come first.
- IOC extraction with JSON and CSV export.
- YARA severity read from rule `meta`, not from the rule name (K2).

## P3 — Vaccine Pack

- `reports/vaccine/` entries: profile, defense, check, harness (design §3.6, ADR 0003).
- Defense catalog in `reema/defenses/`.
- STIX 2.1 and MISP export.

## P4 — Quality and reach

- Labelled corpus and a precision/recall gate on rule changes.
- Family classifier.
- iOS IPA intake.

## Known issues

| Id | Issue | Evidence | Fix in |
|---|---|---|---|
| K1 | The SAST `remote_code_execution` pattern `\.dex` matches the `/* loaded from: classes.dex */` comment that jadx writes in every file. | SSLKiller run: 506 of 518 malice findings, all under `androidx/`, `kotlin/` | P1 step 1 |
| K2 | YARA severity is guessed from the rule name (`yara_enhanced_analyzer.get_severity`), not read from `meta.threat_level`. | `analysis_tools/yara_enhanced_analyzer.py` | P2 |
| K3 | `network_analyzer.is_suspicious_url` flags any URL containing `api`, `upload` or `download`. | `analysis_tools/network_analyzer.py` | P2 |
| K4 | The `Android_General_Malware` YARA rule fires on strings common in benign apps (`getMethod`, `.invoke(`, `Base64.decode`). | `rules/yara_general_rules.yar` | P2 |
| K5 | The suspicious TLD list is hardcoded in `network_analyzer.py` and duplicated in `analyzer_config.json`. | Both files | P2 |
