"""Family classifier: pick one family name from every signal Reema has.

Reema produces family hints from three places:
  - behaviour chains that fired   (verdict.chains[].family)
  - the online enrichment vote     (enrich.normalize_family)
  - YARA family-rule matches       (findings tagged "family:<name>")

This merges them into one best family with a confidence. It combines signals
Reema already has; it does not add new detection content. A static
signature-based family classifier (no network, no YARA) is content, so it is
backlog B16 (user-owned).

Confidence:
  high   - two or more independent sources agree on the family
  medium - one source names it (a fired chain, or a medium/high enrichment vote)
  low    - only a weak single source
  none   - no family signal
"""

from collections import Counter


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
