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
        # `require`: capabilities that must ALL be present (the malware-specific
        # discriminator, e.g. overlay or an accessibility service -- things a
        # benign app with the same sensor capabilities does not have).
        # `capabilities`: the supporting set; at least `min_match` must be present.
        self.require = _as_list(data.get("require"))
        self.capabilities = _as_list(data.get("capabilities"))
        self.min_match = int(data.get("min_match", len(self.capabilities)))
        self.label = data.get("label", "malicious")
        if self.label not in LABELS:
            raise ValueError(f"{path}: chain {self.id!r} has invalid label {self.label!r}")
        if not self.require and not self.capabilities:
            raise ValueError(f"{path}: chain {self.id!r} has neither 'require' nor 'capabilities'")

    def evaluate(self, present_ids):
        if any(r not in present_ids for r in self.require):
            return None
        matched = [c for c in self.capabilities if c in present_ids]
        if len(matched) < self.min_match:
            return None
        hit = self.require + matched
        if not hit:
            return None
        return {"chain": self.id, "title": self.title, "family": self.family,
                "label": self.label, "matched": hit,
                "required": len(self.require) + self.min_match, "of": len(self.require) + len(self.capabilities)}


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

    # Precision-first: a lone capability is NOT malice -- a benign messenger,
    # camera or SMS app has the same capabilities as spyware. Only a fired chain
    # (a malware-specific combination) escalates, with one exception: the
    # dangerous-permission constellation is itself the discriminator (>=2 of
    # accessibility/overlay/device-admin/install, which benign apps rarely
    # declare together), so it alone reads as "suspicious".
    if not fired and "dangerous_permission_set" in app_caps:
        label = "suspicious"
        reasons.append("high-risk permission constellation in app manifest")
    elif not fired and app_caps:
        reasons.append(f"{len(app_caps)} capability(ies) in app code (no malicious chain): {sorted(app_caps)}")
    elif not fired and all_caps:
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
