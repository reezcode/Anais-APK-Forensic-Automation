# Finding Schema — `reema.findings/v1`

Every Reema analyzer emits `Finding` objects. They are serialized into
`<case_dir>/reports/findings.json`. Downstream consumers read this file and
never read the per-tool JSON directly. Consumers include the report, the
verdict engine, the Vaccine Pack generator, Dyxon, and Aegis.

Source: `reema/findings.py`. Bump `SCHEMA_VERSION` on any breaking change.

## Document

```json
{
  "schema": "reema.findings/v1",
  "reema_version": "0.4.0",
  "generated_at": "2026-11-13T08:03:10+00:00",
  "sample": {
    "file_name": "sample.apk", "size": 5063076,
    "package_name": "com.example", "version_name": "1.2", "version_code": "1",
    "md5": "…", "sha1": "…", "sha256": "…"
  },
  "sources": ["sast_findings.json", "yara_enhanced.json", "…"],
  "summary": {
    "total": 636,
    "by_severity": {"critical": 0, "high": 0, "medium": 0, "low": 0, "info": 0},
    "by_axis": {"malice": 0, "posture": 0, "context": 0},
    "by_source": {"sast": 0},
    "by_owner": {"app": 0, "sdk": 0, "unknown": 0},
    "malice_by_owner": {"app": 0, "sdk": 0, "unknown": 0}
  },
  "verdict": { /* see "Verdict" below */ },
  "findings": [ /* Finding, sorted by severity, then source, then rule */ ]
}
```

- `sample` hashes are computed by Reema in Python from the file passed with `--sample`.
- `summary.malice_by_owner.app` is the headline triage number: malice findings in the sample author's own code.
- `sources` lists the analyzer files that were present and parsed. A source
  that is missing or malformed is skipped, and this list shows the skip.

## Finding

| Field | Type | Required | Meaning |
|---|---|---|---|
| `id` | string | auto | `<source>-<12 hex>`. Stable across runs for the same source, rule, title and first evidence location. Use it to diff, suppress and track. |
| `source` | string | yes | Analyzer: `sast`, `yara`, `manifest`, `network`, `signing`, `rasp`, `dex_payload`, `entropy`, `enrichment`, `capability`. |
| `rule` | string | yes | Check id inside the source. |
| `title` | string | yes | One-line human summary. |
| `severity` | enum | yes | `critical` `high` `medium` `low` `info`. Legacy spellings are normalized. |
| `axis` | enum | yes | `malice`, `posture` or `context`. See below. |
| `confidence` | enum | no | `high` `medium` (default) `low`. |
| `category` | string | no | Grouping label from the source. |
| `description` | string | no | Detail. |
| `recommendation` | string | no | Analyst action. |
| `evidence` | Evidence[] | no | Where it was seen. |
| `attck` | string[] | no | MITRE ATT&CK for Mobile technique IDs, e.g. `T1407`. |
| `tags` | string[] | no | Free labels, e.g. `ioc`, `protector`, `scan:jadx`, `family:<name>`. |
| `owner` | string | no | Who wrote the code the first evidence points at: `app`, `sdk:<name>`, or empty when the evidence is not code. Set from `sdk_inventory.owner_of()`. A finding in SDK code is forced to `low` confidence. Added in 0.2.0; additive, schema stays v1. |

### Evidence

| Field | Type | Meaning |
|---|---|---|
| `file` | string | Path relative to the case directory when possible, else as reported. |
| `line` | int | 1-based line, if known. |
| `offset` | int | Byte offset in the file, if known. |
| `snippet` | string | Matched text or code. |

Unset optional fields are omitted from the JSON.

## Verdict

`findings.json` carries a `verdict` block (added 0.4.0), built by
`reema/verdict.py` from capability findings, behaviour chains and the
enrichment family vote. See [`capability-rules.md`](capability-rules.md).

```json
{
  "label": "malicious",        // malicious | suspicious | pua | clean
  "family": "GenericBanker",   // or null
  "confidence": "high",        // high | medium | low
  "chains": [ {"chain": "...", "title": "...", "matched": ["cap_a"], "of": 2, "label": "malicious"} ],
  "capabilities_app": ["cap_a"],   // capability ids proven in app code
  "capabilities_all": ["cap_a"],   // including library-only
  "reasons": ["chain ... : ...", "enrichment family ..."]
}
```

Only capabilities in **app** code drive the label; library-only capabilities
are listed but do not escalate it. Enrichment can raise the label, never lower
it. The posture score stays separate (ADR 0002).

## Axes

The axis decides which score a finding feeds. See
[ADR 0002](decisions/0002-separate-malice-and-posture-axes.md).

| Axis | Feeds | Examples |
|---|---|---|
| `malice` | Verdict (is it malware?) | C2 URL patterns, dangerous permissions, DEX hidden in a container, YARA malware rules, SAST `accessibility_abuse` |
| `posture` | Security posture (is it built badly?) | Hardcoded keys, weak crypto, `allowBackup`, exported components |
| `context` | Neither. It changes how to read the rest. | Packer or protector detected, stub DEX, high entropy, signing details |

## Legacy mapping (P0)

`reema/adapters.py` maps the legacy analyzer files as follows.

| File in `temp/` | Adapter | Axis rule |
|---|---|---|
| `sast_findings.json` | `sast` | `malice` (confidence `low`) for `root_detection_bypass`, `crypto_wallet_targeting`, `data_exfiltration`, `remote_code_execution`, `accessibility_abuse`; else `posture` |
| `yara_enhanced.json` | `yara` | `malice`, confidence `low` (bundled rules are generic) |
| `manifest_findings.json` | `manifest` | `dangerous_permission` → `malice`; `exported_component`, `debuggable`, `backup_allowed`, `cleartext_traffic` → `posture`; other → `context` |
| `network_findings.json` | `network` | `c2_indicators`, `suspicious_urls` → `malice`, tagged `ioc` |
| `signing_analysis.json` | `signing` | `context` |
| `rasp_report.json` | `rasp` | `context`, tagged `protector` |
| `dex_payload_report.json` | `dex_payload` | stub/encrypted → `context`; DEX inside a container → `malice`, `T1407` |
| `entropy_analysis.json` | `entropy` | `highly_suspicious` → `context` |
| `enrichment.json` | `enrichment` | MalwareBazaar known sample → `malice`, `critical`, confidence `high`; VirusTotal detections → `malice`, severity and confidence by engine count (≥10 high, ≥3 medium, else low). Not-found and skipped lookups produce no finding. |
| capability engine (not a temp file) | `capability` | One finding per matched rule in `reema/capabilities/`; `axis: malice`, severity from the rule, confidence from owner (app → high, library-only → low). Source label `capabilities` in `sources`. |

In P0 most `malice` findings are low-confidence pattern matches. The P2
capability engine raises or lowers confidence from code reachability and from
combinations of signals.
