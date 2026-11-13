# Capability Rules and Behaviour Chains

This is the authoring guide for the content the capability engine runs. The
engine itself is in `reema/capabilities.py` (matching) and `reema/verdict.py`
(chains and verdict); you do not edit those to add detections. You add:

- **capability rules** — one YAML file per capability in `reema/capabilities/`
- **behaviour chains** — entries in `reema/chains.yaml`

A worked example ships as `reema/capabilities/00-example.yaml` (`process_exec`).

## How matching works

The engine builds **facts** from the case output and tests each rule against
them. There are four fact sources:

| Source | Where it comes from | Example fact |
|---|---|---|
| `api` | framework API call sites in `temp/code_index.db` | `Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;` |
| `string` | string constants in `temp/code_index.db` | `https://host/path` |
| `permission` | `uses-permission` in `temp/basic_info.json` | `android.permission.READ_SMS` |
| `component` | activities/services/receivers/providers | `com.x.MyService` |

Every pattern matches by **case-insensitive substring**, so you write the part
that is stable (`Runtime;->exec`), not the full descriptor.

Each fact carries the class it was found in. The engine uses that to set the
finding's `owner` (`app` vs `sdk:<name>`) and confidence:

- found in the app's own code → `confidence: high`
- found only in library code → `confidence: low`

## Capability rule format

```yaml
id: a11y_input_capture        # required, unique across all rule files
title: Captures input via accessibility
severity: high                # critical|high|medium|low|info (default high)
attck:                        # MITRE ATT&CK for Mobile technique IDs
  - T1417.001
tags: [input-capture]         # free labels, added to the finding
description: >
  One or two sentences an analyst reads in the report.
recommendation: >
  What to check or do about it.
defense: a11y_defense         # optional: id of a Vaccine Pack defense (P3)

# requires: ALL of these conditions must match (logical AND)
requires:
  - permission: BIND_ACCESSIBILITY_SERVICE
  - component: ".*"            # substring; use a service class name fragment

# any_of: AT LEAST ONE must match (logical OR). Optional.
any_of:
  - api:
      - "AccessibilityNodeInfo;->getText"
      - "AccessibilityService;->getRootInActiveWindow"
```

Rules:

- A rule must have `requires`, `any_of`, or both.
- A condition is a one-key mapping: the key is a fact source, the value is one
  pattern or a list of patterns.
- An unknown source, a missing `id`, a duplicate `id`, or a rule with no
  conditions is reported as a load error and that rule is skipped. The other
  rules still load. Load errors appear in `findings.json` under
  `capability_rule_errors`.
- Multiple rules per file are allowed (YAML `---` separators).

A matched rule produces one `Finding`: `source: capability`, `axis: malice`,
the rule's `severity`, `attck`, `tags` (plus `capability:<id>`), and the
matched facts as evidence.

## Behaviour chain format

A chain combines capability ids into a known-profile verdict. Chains live in
`reema/chains.yaml`.

```yaml
chains:
  - id: banker_overlay
    title: Overlay banking trojan profile
    family: GenericBanker       # family name used in the verdict
    label: malicious            # malicious|suspicious|pua|clean (default malicious)
    capabilities:               # capability ids from the rule files
      - a11y_input_capture
      - overlay_window
      - sms_intercept
    min_match: 2                # fire when >= this many are present (default: all)
```

A chain only counts capabilities found in **app** code, so a library that
happens to contain one of them does not trip a verdict.

## Verdict logic (reference)

`reema/verdict.py` combines capability findings, fired chains, and the
enrichment family vote. The order, from strongest:

1. A fired chain sets the label to the chain's `label` (lowest/strongest wins).
2. An enrichment family with medium/high confidence raises the label to
   `malicious`; low confidence raises it to at most `suspicious`. It never
   lowers a label.
3. With no chain but one or more capabilities in app code, the label is
   `suspicious`.
4. Otherwise `clean`.

Confidence is `high` when a chain fires (or a chain plus a family agree),
`medium` for a single app capability or a family hit, else `low`.

The verdict is written to `findings.json` under `verdict`. See
[`finding-schema.md`](finding-schema.md#verdict).

## Testing your rules

- `python3 -m reema analyze <sample>` runs the rules and prints the verdict.
- The shipped rules and `chains.yaml` are load-checked by
  `tests/test_reema_p2.py::ShippedContentTest`; keep that green.
- Rules are content, so measure them against the benign/malware corpus (P4)
  before trusting a new detection.
