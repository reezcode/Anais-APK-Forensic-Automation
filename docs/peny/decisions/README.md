# Architecture Decision Records

One file per decision: `NNNN-short-title.md`. Numbers are sequential and never
reused. To change a decision, add a new ADR that supersedes it, and set the
old one's status to `Superseded by NNNN`.

| ADR | Title | Status |
|---|---|---|
| [0001](0001-reuse-reema-static-core-one-way-seam.md) | Reuse Reema's static core over a one-way seam | Accepted |

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
