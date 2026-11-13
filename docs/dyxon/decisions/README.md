# Architecture Decision Records — Dyxon

One file per decision: `NNNN-short-title.md`. Numbers are sequential and never
reused. To change a decision, add a new ADR that supersedes it, and set the
old one's status to `Superseded by NNNN`.

Dyxon's existence as a separate feature is decided in
[Reema ADR 0001](../../reema/decisions/0001-split-anais-into-reema-and-dyxon.md).
The ADRs here cover Dyxon's own architecture.

| ADR | Title | Status |
|---|---|---|
| [0001](0001-dyxon-device-broker-architecture.md) | Dyxon is a device broker: AVD, MCP, warm pool | Accepted |

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
