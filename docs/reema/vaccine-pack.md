# Vaccine Pack and the Defense Catalog

For each capability the engine finds in a sample, Reema writes a **Vaccine Pack**
entry: how to verify that an app under test resists that capability. This is the
authoring guide for the content the generator runs. The generator itself is in
`reema/vaccine.py`; you do not edit it to add defenses. You add:

- **defense entries** — one YAML file per defense in `reema/defenses/`

A neutral example ships as `reema/defenses/00-example.yaml` (`process_exec`),
paired with the example capability of the same name.

Scope and limits come from [ADR 0003](decisions/0003-vaccine-pack-scope.md).
Reema emits the **defense and the check**, never attack code.

## What the generator produces

Run as part of `reema analyze` (after findings). Per case:

| Path | Content |
|---|---|
| `reports/vaccine/<capability>.md` | One Vaccine Pack entry per capability found |
| `reports/vaccine/index.md` | Index, marking which capabilities lack a defense |
| `reports/vaccine.json` | Machine-readable entries (consumed by Dyxon) |

Each entry has four parts:

| Part | Source |
|---|---|
| **Profile** | The capability finding: ATT&CK IDs, owner/confidence, evidence from this sample |
| **Defense** | The matching defense catalog entry (below) |
| **Check** | The catalog entry's `check` block |
| **Harness** | The catalog entry's `harness`, plus the ADR 0003 guardrails printed verbatim |

A capability with no catalog entry still gets a Profile and a stub pointing
here, so the gap is visible rather than silent.

## Defense entry format

```yaml
id: a11y_defense              # required, unique
title: Resist accessibility input capture
applies_to:                   # capability ids this defense covers
  - a11y_input_capture
summary: >
  One or two sentences: what the app under test should do so the capability
  cannot harm it.
controls:                     # code-level controls, each with the API and min level
  - api: "View.setAccessibilityDataSensitive"
    min_api: 34
    note: Mark sensitive views so other a11y services cannot read them.
  - api: "AccessibilityManager.getEnabledAccessibilityServiceList"
    min_api: 14
    note: Detect and warn on non-allowlisted enabled services.
check:
  steps:
    - Step the engineer runs against the app under test.
    - Another step.
  expected: >
    The pass condition, in one sentence.
harness:                      # optional
  module: null                # path/name of a harness module, or null
  note: >
    What a harness would do, within the guardrails below. Describe the defense
    check, not an attack.
```

Matching: a defense applies to a capability when the capability id is in
`applies_to`, or when the defense `id` equals the capability id. A capability
rule can also name its defense through its own `defense:` field
(see [`capability-rules.md`](capability-rules.md)).

A file with no `id`, or broken YAML, is reported and skipped; the others still
load. The shipped catalog is load-checked by
`tests/test_reema_p3.py::ShippedDefensesTest`.

## Harness guardrails (ADR 0003)

Every entry prints these as the contract any harness must meet. A harness that
cannot meet all six is not written:

1. Target: acts only on the package passed as the app under test.
2. No data leaves the device: no network, exfiltration or C2.
3. No persistence: no boot receivers, hiding or anti-uninstall.
4. No evasion: no obfuscation, packing or anti-analysis.
5. Visible: labelled as a test tool in its app name and running notification.
6. Smallest action: performs only the action the check needs, then reports pass/fail.

A harness proves the defense works. It never reproduces the malware, and no
code from a sample is copied into it.

## Authoring status

The real defense catalog and any runnable harnesses are backlog **B14**
(owner: reez). The generator and this format are in place; the repo ships only
the neutral `process_exec` example so the pipeline and tests run.
