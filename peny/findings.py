"""The Peny finding schema: `peny.findings/v1`.

Schema contract: docs/peny/finding-schema.md. Bump SCHEMA_VERSION on any
breaking change to the serialized shape.

Peny reuses Reema's `Evidence` type and severity machinery over the one-way seam
(peny/_shared.py). It does not reuse Reema's `Finding`: that type mandates a
malice/posture/context axis and carries no MASVS field. A Peny finding is always
a weakness, tagged with a MASVS control instead of an axis.
"""

import hashlib
from dataclasses import asdict, dataclass, field
from datetime import datetime, timezone
from typing import List, Optional

from peny._shared import SEVERITIES, Evidence, normalize_severity

SCHEMA_VERSION = "peny.findings/v1"

CONFIDENCES = ("high", "medium", "low")
RUNTIME_STATUSES = ("pending", "confirmed", "refuted")

# OWASP MASVS v2 control groups Peny maps findings onto.
MASVS_GROUPS = (
    "MASVS-STORAGE",
    "MASVS-CRYPTO",
    "MASVS-AUTH",
    "MASVS-NETWORK",
    "MASVS-PLATFORM",
    "MASVS-CODE",
    "MASVS-RESILIENCE",
    "MASVS-PRIVACY",
)


@dataclass
class PenyFinding:
    source: str  # rule group: manifest, crypto, storage, network, platform, webview, native, secrets
    rule: str  # stable rule/check id inside that group
    title: str
    severity: str  # exploitability, not malice
    masvs: str  # MASVS control group, e.g. "MASVS-CRYPTO"
    confidence: str = "medium"
    mastg: List[str] = field(default_factory=list)  # MASTG test ids
    cwe: List[str] = field(default_factory=list)  # CWE ids, e.g. "CWE-327"
    category: str = ""
    description: str = ""
    impact: str = ""  # what an attacker gains
    repro: str = ""  # how to reproduce / exploit
    fix: str = ""  # developer-facing remediation
    evidence: List[Evidence] = field(default_factory=list)
    owner: str = ""  # "app" / "sdk:<name>" / "" from Reema's sdk_inventory
    needs_runtime_confirmation: bool = False
    runtime_status: Optional[str] = None  # None until a dynamic track sets it
    id: str = ""

    def __post_init__(self):
        self.severity = normalize_severity(self.severity)
        if self.masvs not in MASVS_GROUPS:
            raise ValueError(f"masvs must be one of {MASVS_GROUPS}, got {self.masvs!r}")
        if self.confidence not in CONFIDENCES:
            raise ValueError(f"confidence must be one of {CONFIDENCES}, got {self.confidence!r}")
        if self.runtime_status is not None and self.runtime_status not in RUNTIME_STATUSES:
            raise ValueError(
                f"runtime_status must be one of {RUNTIME_STATUSES} or None, got {self.runtime_status!r}"
            )
        if not self.id:
            self.id = self._stable_id()

    def _stable_id(self):
        # Same target + same rule + same location -> same id across runs, so
        # findings can be diffed, suppressed, and tracked in a case.
        first = self.evidence[0] if self.evidence else None
        location = f"{first.file}:{first.line}:{first.offset}" if first else ""
        digest = hashlib.sha1(f"{self.source}|{self.rule}|{self.title}|{location}".encode())
        return f"peny-{digest.hexdigest()[:12]}"

    @classmethod
    def from_dict(cls, d):
        """Rebuild a PenyFinding from its serialized form (e.g. reloaded from
        peny_findings.json for the dynamic confirm pass)."""
        d = dict(d)
        d.pop("id", None)  # recomputed, but stable for the same inputs
        ev = [Evidence(**e) for e in d.pop("evidence", []) or []]
        known = {f for f in cls.__dataclass_fields__ if f != "evidence"}
        return cls(evidence=ev, **{k: v for k, v in d.items() if k in known})

    def to_dict(self):
        data = asdict(self)
        data["evidence"] = [{k: v for k, v in e.items() if v is not None} for e in data["evidence"]]
        # Drop unset optionals from the serialized form.
        if data["runtime_status"] is None:
            del data["runtime_status"]
        return data


def build_document(findings, sample=None, authorization=None, sources=None,
                   matrix=None, coverage=None):
    """Wrap findings in the versioned document written to reports/peny_findings.json.

    `matrix` is a prebuilt MASVS matrix; when omitted it is built from the
    findings with `coverage` (the set of statically-covered control groups).
    """
    from peny import __version__
    from peny.masvs import build_matrix

    by_severity = {s: 0 for s in SEVERITIES}
    by_masvs = {g: 0 for g in MASVS_GROUPS}
    needs_runtime = 0
    confirmed = 0
    for f in findings:
        by_severity[f.severity] += 1
        by_masvs[f.masvs] += 1
        if f.needs_runtime_confirmation and f.runtime_status in (None, "pending"):
            needs_runtime += 1
        if f.runtime_status == "confirmed":
            confirmed += 1

    order = {s: i for i, s in enumerate(SEVERITIES)}
    findings = sorted(findings, key=lambda f: (order[f.severity], f.masvs, f.rule))

    return {
        "schema": SCHEMA_VERSION,
        "peny_version": __version__,
        "generated_at": datetime.now(timezone.utc).isoformat(timespec="seconds"),
        "authorization": authorization or {},
        "sample": sample or {},
        "sources": sorted(sources) if sources else sorted({f.source for f in findings}),
        "summary": {
            "total": len(findings),
            "by_severity": by_severity,
            "by_masvs": by_masvs,
            "needs_runtime": needs_runtime,
            "confirmed": confirmed,
        },
        "masvs": matrix if matrix is not None else build_matrix(findings, coverage),
        "findings": [f.to_dict() for f in findings],
    }
