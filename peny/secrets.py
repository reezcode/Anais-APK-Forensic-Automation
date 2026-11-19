"""Extracted secrets inventory: API keys, tokens and credentials found in the app.

A secret is already a MASVS-STORAGE (or MASVS-NETWORK, when seen in traffic)
finding; this module lifts the secret *values* out of those findings into a
structured list, so a tester gets one table of "what leaked, where, what kind"
instead of reading it out of finding descriptions.

The value comes from the finding description (Reema writes "Pattern detected:
<value>") or, failing that, from the evidence snippet. The key name is read from
the source line (`<string name="google_api_key">`, `API_KEY = "..."`).
"""

import re

#: finding rules whose description carries a leaked secret value
SECRET_RULES = frozenset({"api_keys", "hardcoded_secrets", "secret_over_cleartext"})

_PATTERN_PREFIX = re.compile(r"^\s*pattern detected:\s*", re.IGNORECASE)

#: (type label, value regex): first match wins; order specific -> generic
_TYPES = (
    ("Google API key", re.compile(r"^AIza[0-9A-Za-z_\-]{35}$")),
    ("AWS access key ID", re.compile(r"^(AKIA|ASIA)[0-9A-Z]{16}$")),
    ("GitHub token", re.compile(r"^(ghp|gho|ghu|ghs|ghr)_[0-9A-Za-z]{36,}$")),
    ("Stripe key", re.compile(r"^(sk|pk|rk)_(live|test)_[0-9A-Za-z]{16,}$")),
    ("Slack token", re.compile(r"^xox[abposr]-[0-9A-Za-z-]{10,}$")),
    ("Twilio key", re.compile(r"^SK[0-9a-fA-F]{32}$")),
    ("SendGrid key", re.compile(r"^SG\.[\w\-]{22}\.[\w\-]{43}$")),
    ("JWT", re.compile(r"^eyJ[\w\-]+\.[\w\-]+\.[\w\-]*$")),
    ("Private key", re.compile(r"-----BEGIN [A-Z ]*PRIVATE KEY-----")),
    ("Firebase URL", re.compile(r"^https?://[\w\-]+\.(firebaseio\.com|firebasedatabase\.app)\b")),
    ("URL with credentials", re.compile(r"^[a-z][\w+.\-]*://[^/\s:@]+:[^/\s@]+@")),
)

_XML_NAME = re.compile(r'name="([^"]+)"[^>]*>\s*{value}')
_ASSIGN = re.compile(r'([A-Za-z_][\w.]*)\s*[=:]\s*["\']?{value}')


def classify(value):
    """Best-effort type label for a secret value."""
    for label, rx in _TYPES:
        if rx.search(value):
            return label
    return "Generic secret"


def mask(value):
    """Keep enough to recognise the secret, hide the rest."""
    if len(value) <= 8:
        return value[:2] + "…"
    return f"{value[:4]}…{value[-4:]}"


def _value_of(finding):
    desc = finding.get("description") or ""
    if _PATTERN_PREFIX.match(desc):
        value = _PATTERN_PREFIX.sub("", desc).strip()
        if value:
            return value
    return ""


def _name_of(value, snippet):
    if not snippet or not value:
        return ""
    esc = re.escape(value)
    for rx in (_XML_NAME, _ASSIGN):
        m = re.search(rx.pattern.replace("{value}", esc), snippet)
        if m:
            return m.group(1)
    return ""


def extract_secrets(findings):
    """Build the `secrets` inventory from finding dicts (peny.findings/v1 shape).

    One record per distinct (value, file, line). Findings without a recoverable
    value are skipped; they still appear as findings.
    """
    out, seen = [], set()
    for f in findings:
        if f.get("rule") not in SECRET_RULES:
            continue
        value = _value_of(f)
        if not value:
            continue
        evidence = f.get("evidence") or [{}]
        for ev in evidence:
            key = (value, ev.get("file", ""), ev.get("line"))
            if key in seen:
                continue
            seen.add(key)
            out.append({
                "type": classify(value),
                "value": value,
                "masked": mask(value),
                "name": _name_of(value, ev.get("snippet", "")),
                "file": ev.get("file", ""),
                "line": ev.get("line"),
                "rule": f.get("rule", ""),
                "masvs": f.get("masvs", ""),
                "severity": f.get("severity", ""),
                "finding_id": f.get("id", ""),
            })
    return out
