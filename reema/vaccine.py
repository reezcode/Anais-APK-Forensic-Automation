"""Vaccine Pack generator.

For each capability the engine found in a sample, Reema emits a Vaccine Pack
entry: how to verify that an app under test resists that capability. An entry
has four parts (design §3.6, ADR 0003):

  Profile  - the capability, its ATT&CK IDs, and the evidence from this sample
  Defense  - code-level controls the app under test should implement
  Check    - a pass/fail test with its expected result
  Harness  - optional runnable test, bound by the ADR 0003 limits

The generator is content-free. Defenses live in reema/defenses/*.yaml, keyed
to capability ids; authoring them is backlog B14. A capability with no defense
entry still gets a Profile and a stub pointing at the catalog, so the gap is
visible rather than silent.

Harness guardrails (ADR 0003) are copied into every entry as the contract any
harness must meet: target only the app under test, send nothing off-device, no
persistence, no evasion, be clearly labelled, do the smallest action only.
Reema never emits attack code; it emits the defense and the check.

Output: reports/vaccine/<capability_id>.md plus reports/vaccine/index.md,
and reports/vaccine.json (machine-readable, consumed by Dyxon).
"""

import json
from pathlib import Path

import yaml

from reema.findings import SEVERITIES

DEFENSES_DIR = Path(__file__).resolve().parent / "defenses"

# The ADR 0003 limits, reproduced in every harness section as its contract.
HARNESS_GUARDRAILS = [
    "Target: acts only on the package passed as the app under test.",
    "No data leaves the device: no network, exfiltration or C2.",
    "No persistence: no boot receivers, hiding or anti-uninstall.",
    "No evasion: no obfuscation, packing or anti-analysis.",
    "Visible: labelled as a test tool in its app name and running notification.",
    "Smallest action: performs only the action the check needs, then reports pass/fail.",
]


def _as_list(value):
    if value is None:
        return []
    return value if isinstance(value, list) else [value]


class Defense:
    """One entry in the defense catalog. See docs/reema/vaccine-pack.md."""

    def __init__(self, data, path):
        self.path = path
        self.id = data.get("id")
        if not self.id:
            raise ValueError(f"{path}: defense is missing 'id'")
        self.title = data.get("title", self.id)
        self.applies_to = _as_list(data.get("applies_to"))
        self.summary = data.get("summary", "")
        self.controls = _as_list(data.get("controls"))
        self.check = data.get("check", {}) or {}
        self.harness = data.get("harness")  # optional mapping

    def for_capability(self, cap_id):
        """True when this defense covers the capability id (explicit applies_to,
        or an id equal to the capability's `defense:` field)."""
        return cap_id in self.applies_to or self.id == cap_id


def load_defenses(defenses_dir=DEFENSES_DIR):
    """Return (defenses, errors). A broken file is reported and skipped."""
    defenses, errors = [], []
    defenses_dir = Path(defenses_dir)
    if not defenses_dir.is_dir():
        return defenses, errors
    for path in sorted(defenses_dir.glob("*.yaml")) + sorted(defenses_dir.glob("*.yml")):
        try:
            docs = list(yaml.safe_load_all(path.read_text(encoding="utf-8")))
        except yaml.YAMLError as e:
            errors.append(f"{path}: YAML error: {e}")
            continue
        for data in docs:
            if not data:
                continue
            try:
                defenses.append(Defense(data, path))
            except (ValueError, AttributeError) as e:
                errors.append(str(e))
    return defenses, errors


def _capability_findings(findings_doc):
    """Capability findings from a findings.json document, deduped by rule id
    (keep the highest-confidence / app-owned instance)."""
    order = {"high": 0, "medium": 1, "low": 2}
    best = {}
    for f in findings_doc.get("findings", []):
        if f.get("source") != "capability":
            continue
        key = f.get("rule")
        prior = best.get(key)
        if prior is None or (f.get("owner") == "app" and prior.get("owner") != "app") \
                or order.get(f.get("confidence"), 3) < order.get(prior.get("confidence"), 3):
            best[key] = f
    return list(best.values())


def _match_defense(cap_id, cap_finding, defenses):
    want = cap_finding.get("rule")
    # A rule may name its defense via a `capability:<id>` tag or the id itself.
    for d in defenses:
        if d.for_capability(cap_id) or d.for_capability(want):
            return d
    return None


def _entry(cap, defense):
    """Build the machine-readable Vaccine Pack entry for one capability."""
    return {
        "capability": cap.get("rule"),
        "title": cap.get("title"),
        "severity": cap.get("severity"),
        "attck": cap.get("attck", []),
        "owner": cap.get("owner", ""),
        "confidence": cap.get("confidence"),
        "evidence": cap.get("evidence", [])[:5],
        "defense": None if defense is None else {
            "id": defense.id,
            "title": defense.title,
            "summary": defense.summary,
            "controls": defense.controls,
            "check": defense.check,
            "harness": defense.harness,
        },
        "harness_guardrails": HARNESS_GUARDRAILS,
    }


def _render_md(entry):
    cap = entry["capability"]
    md = [f"# Vaccine: {entry['title']}", ""]
    md.append(f"- **Capability:** `{cap}`")
    md.append(f"- **Severity:** {entry['severity']}")
    if entry["attck"]:
        md.append(f"- **ATT&CK:** {', '.join(entry['attck'])}")
    md.append(f"- **Seen in:** {entry['owner'] or 'unknown'} code (confidence {entry['confidence']})")
    md.append("")

    md.append("## Profile\n")
    md.append("Evidence from this sample:\n")
    for e in entry["evidence"]:
        loc = e.get("file", "?")
        snip = e.get("snippet", "")
        md.append(f"- `{loc}`" + (f" — {snip}" if snip else ""))
    if not entry["evidence"]:
        md.append("- (no evidence captured)")
    md.append("")

    d = entry["defense"]
    md.append("## Defense\n")
    if d is None:
        md.append(f"> No defense catalog entry for `{cap}` yet. Add one to "
                  f"`reema/defenses/` per docs/reema/vaccine-pack.md (backlog B14).\n")
    else:
        if d["summary"]:
            md.append(d["summary"] + "\n")
        if d["controls"]:
            md.append("| Control | Min API | Note |")
            md.append("|---|---|---|")
            for c in d["controls"]:
                md.append(f"| `{c.get('api', '')}` | {c.get('min_api', '-')} | {c.get('note', '')} |")
            md.append("")

        md.append("## Check\n")
        check = d["check"]
        for i, step in enumerate(_as_list(check.get("steps")), 1):
            md.append(f"{i}. {step}")
        if check.get("expected"):
            md.append(f"\n**Expected (pass):** {check['expected']}")
        md.append("")

        md.append("## Harness\n")
        if d["harness"]:
            h = d["harness"]
            md.append((h.get("note") or f"Harness: {h.get('module', 'see catalog')}") + "\n")
        else:
            md.append("No harness defined; run the Check manually (Dyxon automates it later).\n")

    md.append("### Harness guardrails (ADR 0003)\n")
    md.append("Any harness for this capability must meet all of:\n")
    for g in HARNESS_GUARDRAILS:
        md.append(f"- {g}")
    md.append("")
    return "\n".join(md)


def _severity_rank(entry):
    try:
        return SEVERITIES.index(entry["severity"])
    except (ValueError, KeyError):
        return len(SEVERITIES)


def generate(case_dir, findings_doc=None, defenses=None):
    """Write the Vaccine Pack for a case. Returns (entries, errors)."""
    case_dir = Path(case_dir)
    if findings_doc is None:
        findings_doc = json.loads((case_dir / "reports" / "findings.json").read_text(encoding="utf-8"))
    if defenses is None:
        defenses, errors = load_defenses()
    else:
        errors = []

    caps = _capability_findings(findings_doc)
    entries = []
    for cap in caps:
        defense = _match_defense(cap.get("rule"), cap, defenses)
        entries.append(_entry(cap, defense))
    entries.sort(key=lambda e: (_severity_rank(e), e["capability"] or ""))

    out_dir = case_dir / "reports" / "vaccine"
    out_dir.mkdir(parents=True, exist_ok=True)
    for entry in entries:
        (out_dir / f"{entry['capability']}.md").write_text(_render_md(entry), encoding="utf-8")

    covered = sum(1 for e in entries if e["defense"])
    index = ["# Vaccine Pack", "",
             f"{len(entries)} capability(ies); {covered} with a defense entry, "
             f"{len(entries) - covered} missing one.", ""]
    for e in entries:
        mark = "" if e["defense"] else "  _(no defense yet)_"
        index.append(f"- [{e['title']}]({e['capability']}.md) — `{e['capability']}` "
                     f"({e['severity']}){mark}")
    (out_dir / "index.md").write_text("\n".join(index) + "\n", encoding="utf-8")

    doc = {"schema": "reema.vaccine/v1", "total": len(entries),
           "with_defense": covered, "entries": entries}
    (case_dir / "reports" / "vaccine.json").write_text(json.dumps(doc, indent=2), encoding="utf-8")
    return entries, errors
