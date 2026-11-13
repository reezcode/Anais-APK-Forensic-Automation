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
5. [`changelog.md`](changelog.md) — history.

Reference for the current pipeline:
[`tools-architecture-and-flow.md`](tools-architecture-and-flow.md),
[`static-core-architecture.md`](static-core-architecture.md).

## Quick start

```bash
# Full static run (P0 delegates the engine to anais.sh)
python3 -m reema analyze sample.apk

# Rebuild findings.json for an existing case directory
python3 -m reema findings ~/.anais/reports/<case_dir> --sample sample.apk
```

Output: `<case_dir>/reports/findings.json`, plus the existing `report.md`,
`report.json`, `report.sarif`, and `frida_auto.js`.

## Code layout

| Path | Role |
|---|---|
| `reema/cli.py` | `reema` command line |
| `reema/findings.py` | `Finding` / `Evidence` schema, document builder |
| `reema/adapters.py` | Legacy analyzer JSON → `Finding` |
| `analysis_tools/` | Legacy analyzers (migrated into `reema/` stage by stage) |
| `rules/` | YARA rules |
| `tests/test_reema.py` | Reema tests |
