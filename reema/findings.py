"""The common Finding schema every Reema analyzer emits.

Schema contract: docs/reema/finding-schema.md. Bump SCHEMA_VERSION on any
breaking change to the serialized shape.
"""

import hashlib
from dataclasses import asdict, dataclass, field
from datetime import datetime, timezone
from typing import List, Optional

SCHEMA_VERSION = "reema.findings/v1"

SEVERITIES = ("critical", "high", "medium", "low", "info")
CONFIDENCES = ("high", "medium", "low")

# Which score a finding feeds. Kept separate so a careless but benign app does
# not look like malware, and packed malware does not hide behind a clean posture.
#   malice   - evidence the sample intends harm (C2, banker overlay, SMS theft)
#   posture  - weakness in how the app is built (hardcoded key, allowBackup)
#   context  - neutral facts that change how to read the rest (packer, framework)
AXES = ("malice", "posture", "context")


@dataclass
class Evidence:
    """Where a finding was observed. Every field is optional except file."""

    file: str
    line: Optional[int] = None
    offset: Optional[int] = None
    snippet: Optional[str] = None


@dataclass
class Finding:
    source: str  # analyzer that produced it, e.g. "sast", "yara", "manifest"
    rule: str  # stable rule/check id inside that analyzer
    title: str
    severity: str
    axis: str
    confidence: str = "medium"
    category: str = ""
    description: str = ""
    recommendation: str = ""
    evidence: List[Evidence] = field(default_factory=list)
    attck: List[str] = field(default_factory=list)  # MITRE ATT&CK for Mobile IDs
    tags: List[str] = field(default_factory=list)
    # Who wrote the code the evidence points at: "app", "sdk:<name>", or ""
    # when the evidence is not code (manifest, assets, native libs).
    owner: str = ""
    id: str = ""

    def __post_init__(self):
        self.severity = normalize_severity(self.severity)
        if self.axis not in AXES:
            raise ValueError(f"axis must be one of {AXES}, got {self.axis!r}")
        if self.confidence not in CONFIDENCES:
            raise ValueError(f"confidence must be one of {CONFIDENCES}, got {self.confidence!r}")
        if not self.id:
            self.id = self._stable_id()

    def _stable_id(self):
        # Same sample + same rule + same location -> same id across runs, so
        # findings can be diffed, suppressed, and tracked in a case.
        first = self.evidence[0] if self.evidence else None
        location = f"{first.file}:{first.line}:{first.offset}" if first else ""
        digest = hashlib.sha1(f"{self.source}|{self.rule}|{self.title}|{location}".encode())
        return f"{self.source}-{digest.hexdigest()[:12]}"

    def to_dict(self):
        data = asdict(self)
        data["evidence"] = [{k: v for k, v in e.items() if v is not None} for e in data["evidence"]]
        return data


def normalize_severity(value):
    """Map the legacy tools' mixed spellings (CRITICAL, High, warning...) onto SEVERITIES."""
    v = str(value or "").strip().lower()
    aliases = {"warning": "medium", "warn": "medium", "error": "high", "note": "low", "informational": "info"}
    v = aliases.get(v, v)
    if v not in SEVERITIES:
        return "info"
    return v


def build_document(findings, sample=None):
    """Wrap findings in the versioned document written to reports/findings.json."""
    by_severity = {s: 0 for s in SEVERITIES}
    by_axis = {a: 0 for a in AXES}
    by_source = {}
    by_owner = {"app": 0, "sdk": 0, "unknown": 0}
    malice_by_owner = {"app": 0, "sdk": 0, "unknown": 0}
    for f in findings:
        by_severity[f.severity] += 1
        by_axis[f.axis] += 1
        by_source[f.source] = by_source.get(f.source, 0) + 1
        owner = "sdk" if f.owner.startswith("sdk:") else (f.owner or "unknown")
        by_owner[owner] += 1
        if f.axis == "malice":
            malice_by_owner[owner] += 1

    order = {s: i for i, s in enumerate(SEVERITIES)}
    findings = sorted(findings, key=lambda f: (order[f.severity], f.source, f.rule))

    return {
        "schema": SCHEMA_VERSION,
        "generated_at": datetime.now(timezone.utc).isoformat(timespec="seconds"),
        "sample": sample or {},
        "summary": {
            "total": len(findings),
            "by_severity": by_severity,
            "by_axis": by_axis,
            "by_source": by_source,
            "by_owner": by_owner,
            "malice_by_owner": malice_by_owner,
        },
        "findings": [f.to_dict() for f in findings],
    }
