# Reading Anais reports

## Files

- `reports/report.md` — human report (index + sections).
- `reports/report.json` — machine report: `{ metadata, results }`.
- `reports/*.md` — detailed per-section pages (SAST, manifest, network, YARA,
  entropy, recommendations).
- `reports/report.sarif` — SAST as SARIF 2.1.0 for CI / code scanning.
- `reports/findings.json` — all findings in the `reema.findings/v1` schema. Filter on `axis` (`malice` / `posture` / `context`), `confidence`, and `owner` (`app` vs `sdk:<name>`). Start triage from `summary.malice_by_owner.app`.
- `case.json` (case root, `reema analyze` runs only) — input and artifact hashes, tool versions, online lookups, stage events.
- `reports/frida_auto.js` — generated Frida script.

## report.json shape

```
metadata: { generated, apk_name, sha256 }
results:
  basic_info:    { package_name, version_name, version_code, permissions[], activities[], ... }
  framework:     { primary, frameworks[], coverage_warning }
  obfuscation:   { type, confidence, ... }      (+ dex payload info)
  entropy:       { encrypted payload candidates }
  yara:          { summary: { critical_findings, high_severity, ... }, matches[] }
  sast:          { critical[], high[], medium[], low[], summary: { ... , risk_score } }
  manifest:      { exported components, permission risks, ... }
  network:       { urls[], suspicious_urls[], api_endpoints[], domains[] }
  signing:       { schemes, debug_certificate, janus_vulnerable, weak_signature, cert_sha256 }
  sdk_inventory: { sdks{name: {category, tracker, maven}}, ... }
  rasp:          { type, confidence, detected[], protection_details, evidence, weak_signals, heuristics[], recommendations[] }
  rea:           { available, command, runs[], notes[] }         (only if ANAIS_REA=1)
  rea_deep:      { completed[], skipped[], pending[], notes[] }   (after a deep-pass merge)
  dynamic:       { executed, hooks{...}, logcat{...}, ... }       (after a dynamic run)
  risk:          { score, level, breakdown[] }                   (composite)
```

The MCP `anais_read_report` returns a compact summary of these; pass `full:true`
for the whole object, or read a specific detailed `.md` when one section needs
depth.

## Composite risk

`risk.score` (0–100) is a single cross-signal score, built so no one noisy
source can saturate it. Contributions are capped per source and the SAST count
is log-damped:

- YARA critical/high — cap 30
- SAST (log-damped by finding counts) — cap 25
- packing / encrypted payload — cap 20
- manifest exposure — cap 10
- network exposure — cap 10
- signing problems — cap 10
- packer presence — cap 5

`risk.level` buckets the score (e.g. LOW / MEDIUM / HIGH / CRITICAL).
`risk.breakdown[]` lists each contributing factor and its points — read it to
explain *why* a score is what it is. A benign app with many low-severity SAST
hits lands MEDIUM, not maxed, by design. The report's executive summary shows
both the composite and the raw SAST-only score.
