# 0002. Separate malice and posture axes

- Status: Accepted
- Date: 2026-11-13

## Context

The composite risk score (`report_generator_modular.compute_composite_risk`) adds YARA hits, SAST secrets, manifest hygiene, packing and signing into one number. SAST secrets and `allowBackup` measure how *carefully an app is built*. They do not show *intent to harm*. With one number, a carelessly built banking app can outscore a dropper. SOC/IR analysts need the verdict first.

## Decision

Every finding has an `axis`:

| Axis | Feeds |
|---|---|
| `malice` | The verdict (is it malware?) |
| `posture` | A separate security posture score |
| `context` | Neither score. It explains other findings (packer, framework, signing). |

The verdict uses `malice` findings and enrichment only. The report shows posture separately.

## Consequences

- Each adapter must classify its findings. The mapping is documented in [`finding-schema.md`](../finding-schema.md).
- A packer is `context`, not `malice`, because benign apps use packers too. Packing raises analysis priority but does not by itself make a sample malicious.
- The legacy composite score stays in `report.md` until P2 replaces it.
