# Finding Schema — `peny.findings/v1`

Every Peny rule emits a `Finding`. Findings are serialized into
`<case_dir>/reports/peny_findings.json`. The document also carries the MASVS
coverage matrix. Downstream consumers (the report, the dynamic tracks, Aegis)
read this file and never read the per-tool JSON directly.

Peny **reuses Reema's `Evidence` type and severity machinery**
(`normalize_severity`, `SEVERITIES` from `reema/findings.py`) unchanged — that
reuse is part of the one-way seam
([ADR 0001](decisions/0001-reuse-reema-static-core-one-way-seam.md)). Reema's
`Finding` mandates a malice/posture/context `axis` and carries no MASVS field, so
Peny defines its own `PenyFinding` over the shared primitives rather than
widening Reema's dataclass. Source of the Peny document builder:
`peny/findings.py`. Bump `SCHEMA_VERSION` on any breaking change.

## Document

```json
{
  "schema": "peny.findings/v1",
  "peny_version": "0.1.0",
  "generated_at": "2026-11-19T00:00:00+00:00",
  "authorization": {
    "package": "com.example",
    "authorized_by": "operator note",
    "window": "2026-11-19"
  },
  "sample": {
    "file_name": "target.apk", "size": 5063076,
    "package_name": "com.example", "version_name": "1.2", "version_code": "1",
    "md5": "…", "sha1": "…", "sha256": "…"
  },
  "sources": ["manifest", "sast", "network", "signing", "crypto", "..."],
  "summary": {
    "total": 0,
    "by_severity": {"critical": 0, "high": 0, "medium": 0, "low": 0, "info": 0},
    "by_masvs": {"MASVS-STORAGE": 0, "MASVS-CRYPTO": 0, "MASVS-NETWORK": 0,
                 "MASVS-PLATFORM": 0, "MASVS-CODE": 0, "MASVS-RESILIENCE": 0,
                 "MASVS-AUTH": 0, "MASVS-PRIVACY": 0},
    "needs_runtime": 0,
    "confirmed": 0
  },
  "masvs": { /* coverage matrix, see below */ },
  "findings": [ /* Finding, sorted by severity, then masvs, then rule */ ]
}
```

- `authorization` is operator-supplied at run time (`--authorized-by`,
  `--scope`). It is a record, not a check; Peny does not validate it.
- `sources` lists the analyzers/rule groups that ran and were parsed.

## Finding

Peny uses the shared `Finding` fields from `reema.findings/v1`
([Reema schema](../reema/finding-schema.md)) with these differences:

| Field | Type | Required | Meaning |
|---|---|---|---|
| `id` | string | auto | `peny-<12 hex>`, stable across runs for the same rule, title and first evidence location. |
| `source` | string | yes | Rule group: `manifest`, `crypto`, `storage`, `network`, `platform`, `webview`, `native`, `secrets`. |
| `rule` | string | yes | Check id inside the source. |
| `title` | string | yes | One-line human summary. |
| `severity` | enum | yes | `critical` `high` `medium` `low` `info` — **exploitability**, not malice. |
| `masvs` | string | yes | MASVS control group, e.g. `MASVS-CRYPTO`. **Peny-specific.** |
| `mastg` | string[] | no | MASTG test ids, e.g. `MASTG-TEST-0014`. **Peny-specific.** |
| `cwe` | string[] | no | CWE ids, e.g. `CWE-327`. **Peny-specific.** |
| `confidence` | enum | no | `high` `medium` (default) `low`. |
| `description` | string | no | Detail. |
| `impact` | string | no | What an attacker gains. **Peny-specific.** |
| `repro` | string | no | How to reproduce / exploit. **Peny-specific.** |
| `fix` | string | no | Developer-facing remediation. **Peny-specific** (replaces Reema `recommendation`). |
| `evidence` | Evidence[] | no | Where it was seen (reused unchanged from Reema). |
| `needs_runtime_confirmation` | bool | no | Static finding awaiting dynamic proof (methodology §1.7). |
| `runtime_status` | enum | no | `pending` `confirmed` `refuted` — set by the dynamic track. |
| `owner` | string | no | `app` / `sdk:<name>` / empty, from Reema's `sdk_inventory.owner_of()`. A finding in SDK code is noted but not down-ranked — unlike Reema, an SDK weakness is still the app's exposure. |

`Evidence` is the shared type: `file`, `line`, `offset`, `snippet`. Unset
optional fields are omitted.

### Axis note

Peny has no `malice`/`posture`/`context` axis — every Peny finding is a weakness.
It carries `masvs` instead. When Peny reads a Reema `posture` finding across the
seam, it maps `posture` → the matching MASVS control and drops the axis field.

## MASVS matrix

```json
{
  "MASVS-STORAGE": {"status": "fail", "findings": ["peny-ab12…"], "controls_checked": 6},
  "MASVS-CRYPTO":  {"status": "fail", "findings": ["peny-cd34…"]},
  "MASVS-NETWORK": {"status": "needs_runtime", "findings": ["peny-ef56…"]},
  "MASVS-PLATFORM":{"status": "pass"},
  "MASVS-CODE":    {"status": "not_applicable"},
  "MASVS-RESILIENCE": {"status": "fail", "findings": ["peny-7890…"]}
}
```

`status` per control group: `pass` (checked, no finding), `fail` (one or more
findings), `needs_runtime` (a finding awaits dynamic confirmation),
`not_applicable` (control out of scope for this app), `not_checked` (no rule ran).

## Dynamic record — `peny.dynamic/v1`

The P2 confirm pass (`peny confirm`) writes `reports/peny_dynamic.json` and
rewrites `peny_findings.json` with the flipped `runtime_status` values.

```json
{
  "schema": "peny.dynamic/v1",
  "session": { "session_id": "...", "serial": "emulator-5554", "frida_endpoint": "..." },
  "observations": [
    {"source": "crypto", "script": "crypto_hooks.js", "check": "weak_cipher",
     "error": null, "messages": [{"check": "weak_cipher", "confirmed": true, "detail": "..."}]}
  ]
}
```

`session` is the `dyxon.session/v1` handle the device was leased under. One
observation per harness run; `source: "user_script"` carries a tier-1 run. The
confirm engine reads each harness's `send()` messages and sets the matching
finding's `runtime_status` to `confirmed` (a `confirmed:true` message),
`refuted` (only `confirmed:false`), or leaves it `pending` (no signal / error),
appending a runtime `Evidence` with `file: "device:<serial>"`.
