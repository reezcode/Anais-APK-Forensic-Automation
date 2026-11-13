"""Family classifier: pick one family name from every signal Reema has.

Reema produces family hints from four places:
  - behaviour chains that fired    (verdict.chains[].family)
  - the local signature classifier (reema/families.yaml, offline, B16)
  - the online enrichment vote      (enrich.normalize_family)
  - YARA family-rule matches        (findings tagged "family:<name>")

This merges them into one best family with a confidence. The signature
classifier is offline detection content (no network, no YARA): it names a
family from the behaviour profile — the set of capabilities proven in the
sample's own code — so it is an independent source from the behaviour chains.

Confidence:
  high   - two or more independent sources agree on the family
  medium - one source names it (a fired chain, a signature, or a medium/high
           enrichment vote)
  low    - only a weak single source
  none   - no family signal
"""

from collections import Counter
from pathlib import Path

import yaml

FAMILIES_FILE = Path(__file__).resolve().parent / "families.yaml"


def load_signatures(path=FAMILIES_FILE):
    """Return (signatures, errors). Each signature is {family, caps:set, min_caps}.
    A missing or malformed file yields no signatures, never an exception."""
    signatures, errors = [], []
    path = Path(path)
    if not path.is_file():
        return signatures, errors
    try:
        doc = yaml.safe_load(path.read_text(encoding="utf-8")) or {}
    except yaml.YAMLError as e:
        return signatures, [f"{path}: YAML error: {e}"]
    for item in (doc.get("signatures", []) if isinstance(doc, dict) else []):
        family = item.get("family")
        caps = item.get("capabilities") or []
        if not family or not caps:
            errors.append(f"{path}: signature needs 'family' and 'capabilities'")
            continue
        min_caps = int(item.get("min_caps", len(caps)))
        signatures.append({"family": family, "caps": set(caps), "min_caps": min_caps})
    return signatures, errors


def signature_vote(verdict_block, signatures=None):
    """Name a family from the app-owned capabilities, or None.

    Picks the signature matching the most capabilities (ties break on the
    stronger threshold, then name) so the most specific profile wins."""
    caps = set((verdict_block or {}).get("capabilities_app") or [])
    if not caps:
        return None
    if signatures is None:
        signatures, _ = load_signatures()
    best = None
    for sig in signatures:
        matched = caps & sig["caps"]
        if len(matched) >= sig["min_caps"]:
            key = (len(matched), sig["min_caps"], sig["family"])
            if best is None or key > best[0]:
                best = (key, sig["family"])
    return best[1] if best else None


def _family_tags(findings):
    """Family names from findings tagged family:<name> (YARA rules, enrichment)."""
    names = Counter()
    for f in findings:
        for tag in f.get("tags", []):
            if isinstance(tag, str) and tag.startswith("family:") and len(tag) > 7:
                names[tag[7:]] += 1
    return names


def classify(verdict_block, enrichment_family=None, findings=None):
    """Return {family, confidence, sources, candidates}.

    verdict_block:      the findings.json `verdict` dict (for fired-chain families)
    enrichment_family:  enrich.normalize_family() result, or None
    findings:           the finding list (for family:* tags)
    """
    findings = findings or []
    sources = {}  # source name -> family it names

    for chain in (verdict_block or {}).get("chains", []):
        if chain.get("family"):
            sources.setdefault("chain", chain["family"])

    sig_family = signature_vote(verdict_block)
    if sig_family:
        sources.setdefault("signature", sig_family)

    if enrichment_family and enrichment_family.get("family"):
        if enrichment_family.get("confidence") in ("high", "medium"):
            sources["enrichment"] = enrichment_family["family"]
        else:
            sources.setdefault("enrichment_weak", enrichment_family["family"])

    tags = _family_tags(findings)
    if tags:
        sources["yara"] = tags.most_common(1)[0][0]

    if not sources:
        return {"family": None, "confidence": "none", "sources": {}, "candidates": {}}

    # Vote across sources, case-insensitively, keeping the first-seen spelling.
    votes = Counter()
    spelling = {}
    strong = {k: v for k, v in sources.items() if k != "enrichment_weak"}
    for name in (strong or sources).values():
        key = name.lower()
        votes[key] += 1
        spelling.setdefault(key, name)

    top_key, top = votes.most_common(1)[0]
    family = spelling[top_key]
    if top >= 2:
        confidence = "high"
    elif strong:
        confidence = "medium"
    else:
        confidence = "low"

    return {
        "family": family,
        "confidence": confidence,
        "sources": sources,
        "candidates": {spelling[k]: c for k, c in votes.most_common()},
    }
