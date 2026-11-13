# Reema

Reema is the malware analysis and forensics feature of Anais. It takes an
Android sample (APK now, JAR next, IPA later) and answers three questions for a
SOC/IR analyst:

1. **Is it malicious?** Verdict, family, confidence.
2. **What can it do?** Capabilities, down to the exact framework and native
   calls, mapped to MITRE ATT&CK for Mobile.
3. **How do we defend against it?** A *Vaccine Pack* per capability: the
   technique, a harmless test harness that runs against our own apps, and the
   code-level defense that the test verifies.

Dynamic execution is out of scope here; it belongs to [Dyxon](../dyxon/README.md).

## Reading order

1. [`design.md`](design.md) — target architecture.
2. [`roadmap.md`](roadmap.md) — what exists today and what comes next.
3. [`finding-schema.md`](finding-schema.md) — the data contract every analyzer emits.
4. [`decisions/`](decisions/README.md) — why the design is the way it is.
5. [`backlog.md`](backlog.md) — designed but not implemented; ready to pick up.
6. [`changelog.md`](changelog.md) — history.

Reference for the current pipeline:
[`tools-architecture-and-flow.md`](tools-architecture-and-flow.md),
[`static-core-architecture.md`](static-core-architecture.md).

## Quick start

```bash
# Full static run of an APK (or .xapk/.apkm/.apks/.aab) or a JAR
python3 -m reema analyze sample.apk

# No data leaves the machine; cached enrichment is still used
python3 -m reema analyze --offline sample.jar

# Rebuild findings.json for an existing case directory
python3 -m reema findings ~/.anais/reports/<case_dir> --sample sample.apk
```

| Option | Effect |
|---|---|
| `-y FILE` | Extra YARA rule file (repeatable) |
| `--analyst NAME` | Name stored in `case.json` (default `$REEMA_ANALYST`, then login name) |
| `--case-dir DIR` | Write into DIR instead of a new `<workspace>/<stem>_<UTC time>/` |
| `--offline` | Send nothing online; use cached enrichment only |
| `--no-enrich` | Skip enrichment |
| `--no-index` | Skip the code index |

Enrichment keys (optional; without a key the provider is skipped):
`REEMA_MALWAREBAZAAR_API_KEY`, `REEMA_VIRUSTOTAL_API_KEY`. Only the SHA-256 is sent.

Case directory:

| Path | Content |
|---|---|
| `case.json` | Case record: inputs with hashes, artifacts with hashes, tool versions, online lookups, stage events |
| `reports/findings.json` | All findings (`reema.findings/v1`) |
| `reports/report.md`, `report.json` | Human report |
| `reports/report.sarif`, `frida_auto.js` | APK only |
| `temp/code_index.db` | Code index (SQLite) |
| `temp/enrichment.json` | Provider results |

## Code layout

| Path | Role |
|---|---|
| `reema/cli.py` | `reema` command line |
| `reema/findings.py` | `Finding` / `Evidence` schema, document builder |
| `reema/adapters.py` | Legacy analyzer JSON → `Finding`; owner tagging |
| `reema/case.py` | `case.json`: hashes, artifacts, tool versions, audit trail |
| `reema/index.py` | Code index (androguard → SQLite) |
| `reema/enrich.py` | MalwareBazaar / VirusTotal hash lookups with SQLite cache |
| `reema/jar.py` | JAR engine (jadx + code analyzers) |
| `reema/_legacy.py` | Bridge to `analysis_tools/` during migration |
| `analysis_tools/` | Legacy analyzers (migrated into `reema/` stage by stage) |
| `rules/` | YARA rules |
| `tests/test_reema.py`, `tests/test_reema_p1.py` | Reema tests |
