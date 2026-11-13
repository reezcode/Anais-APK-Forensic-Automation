# 0004. Online enrichment, hash-only by default

- Status: Accepted
- Date: 2026-11-13

## Context

Online threat intelligence adds what static analysis cannot provide: family labels, first-seen dates, detection counts and known IOCs. Sending data out has costs:

- An uploaded sample becomes visible to third parties.
- Even a hash can reveal that a private client app exists.
- Providers limit request rates.

## Decision

| Rule | Detail |
|---|---|
| Enabled by default | Enrichment runs unless the case sets `--offline`. |
| What is sent | Only hashes and extracted IOCs, by default. |
| Upload | The sample is uploaded only with an explicit `--upload`. |
| Keys | Read from env vars `REEMA_<PROVIDER>_API_KEY`. Never stored in the repo or in case output. |
| Cache | Responses go into a local SQLite cache with a TTL. A repeat run uses the cache. |
| Audit | `case.json` records each provider queried, what was sent, and when. |

## Consequences

- Analysts get family context without leaking the sample.
- Cases that involve private apps must be run with `--offline`, and the docs must say so.
- Each provider needs its own adapter and error handling. A provider failure must never fail the analysis.
