"""Behaviour chains and the verdict.

A behaviour chain (reema/chains.yaml) names a set of capability ids that,
together, read as a known malware profile. A chain fires when enough of its
capabilities matched in app code. Chains are content, like capability rules,
so analysts edit chains.yaml, not this file.

The verdict combines three things:
  - capability findings (axis "malice")
  - fired chains
  - the family label from online enrichment (enrich.normalize_family)

It is deliberately conservative: a single low-confidence pattern match never
produces "malicious". The posture score stays separate (ADR 0002).
"""

from pathlib import Path

import yaml

CHAINS_FILE = Path(__file__).resolve().parent / "chains.yaml"

LABELS = ("malicious", "suspicious", "pua", "clean")


def _as_list(value):
    if value is None:
        return []
    return value if isinstance(value, list) else [value]


class Chain:
    def __init__(self, data, path):
        self.id = data.get("id")
        if not self.id:
            raise ValueError(f"{path}: chain is missing 'id'")
        self.title = data.get("title", self.id)
        self.family = data.get("family", "")
        self.capabilities = _as_list(data.get("capabilities"))
        # Fire when at least `min_match` of the named capabilities are present;
        # default: all of them.
        self.min_match = int(data.get("min_match", len(self.capabilities)))
        self.label = data.get("label", "malicious")
        if self.label not in LABELS:
            raise ValueError(f"{path}: chain {self.id!r} has invalid label {self.label!r}")

    def evaluate(self, present_ids):
        matched = [c for c in self.capabilities if c in present_ids]
        if len(matched) >= self.min_match and matched:
            return {"chain": self.id, "title": self.title, "family": self.family,
                    "label": self.label, "matched": matched,
                    "required": self.min_match, "of": len(self.capabilities)}
        return None


def load_chains(path=CHAINS_FILE):
    """Return (chains, errors). Missing file yields no chains, not an error."""
    chains, errors = [], []
    path = Path(path)
    if not path.is_file():
        return chains, errors
    try:
        docs = list(yaml.safe_load_all(path.read_text(encoding="utf-8")))
    except yaml.YAMLError as e:
        return chains, [f"{path}: YAML error: {e}"]
    for data in docs:
        if not data:
            continue
        for item in _as_list(data if isinstance(data, list) else data.get("chains", data)):
            try:
                chains.append(Chain(item, path))
            except (ValueError, AttributeError) as e:
                errors.append(str(e))
    return chains, errors


def _rank(label):
    return LABELS.index(label)


def decide(findings, chains, family=None):
    """Produce the verdict block.

    findings: the full Finding list (capability findings drive the verdict).
    chains:   loaded Chain objects.
    family:   enrich.normalize_family() result, or None.
    """
    # Capabilities proven in the sample's own code carry the verdict; library-only
    # capabilities are listed but do not escalate it.
    app_caps = {f.rule for f in findings
                if f.source == "capability" and f.owner == "app"}
    all_caps = {f.rule for f in findings if f.source == "capability"}

    fired = [c for c in (ch.evaluate(app_caps) for ch in chains) if c]

    reasons = []
    label = "clean"

    if fired:
        label = min((c["label"] for c in fired), key=_rank)
        for c in fired:
            reasons.append(f"chain {c['chain']} ({c['matched']}/{c['of']} capabilities): {c['title']}")

    # Online reputation can raise, never lower, the label.
    enrich_label = None
    if family and family.get("family"):
        conf = family.get("confidence", "low")
        enrich_label = "malicious" if conf in ("high", "medium") else "suspicious"
        reasons.append(f"enrichment family {family['family']} (confidence {conf})")

    # A strong single capability in app code is "suspicious" even with no chain.
    if not fired and app_caps:
        label = "suspicious"
        reasons.append(f"{len(app_caps)} capability(ies) in app code: {sorted(app_caps)}")
    elif not fired and not app_caps and all_caps:
        reasons.append(f"{len(all_caps)} capability(ies) in library code only: {sorted(all_caps)}")

    for candidate in (enrich_label,):
        if candidate and _rank(candidate) < _rank(label):
            label = candidate

    # Confidence: chains or corroborated family -> high; one signal -> medium; else low.
    if fired and (family and family.get("family")):
        confidence = "high"
    elif fired or (family and family.get("confidence") == "high"):
        confidence = "high" if fired else "medium"
    elif app_caps or enrich_label:
        confidence = "medium"
    else:
        confidence = "low"

    chosen_family = None
    if fired:
        chosen_family = next((c["family"] for c in fired if c["family"]), None)
    if not chosen_family and family:
        chosen_family = family.get("family")

    return {
        "label": label,
        "family": chosen_family,
        "confidence": confidence,
        "chains": fired,
        "capabilities_app": sorted(app_caps),
        "capabilities_all": sorted(all_caps),
        "reasons": reasons or ["no malicious capabilities detected"],
    }
