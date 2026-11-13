# Architecture Decision Records

One file per decision: `NNNN-short-title.md`. Numbers are sequential and never
reused. To change a decision, add a new ADR that supersedes it, and set the
old one's status to `Superseded by NNNN`.

| ADR | Title | Status |
|---|---|---|
| [0001](0001-split-anais-into-reema-and-dyxon.md) | Split Anais into Reema and Dyxon | Accepted |
| [0002](0002-separate-malice-and-posture-axes.md) | Separate malice and posture axes | Accepted |
| [0003](0003-vaccine-pack-scope.md) | Vaccine Pack scope and limits | Accepted |
| [0004](0004-online-enrichment-hash-only-default.md) | Online enrichment, hash-only by default | Accepted |

## Template

```markdown
# NNNN. Title

- Status: Proposed | Accepted | Superseded by NNNN
- Date: YYYY-MM-DD

## Context
What problem or force makes a decision necessary.

## Decision
What we will do.

## Consequences
What becomes easier, what becomes harder, what we must now maintain.
```
