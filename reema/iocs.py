"""IOC extraction and export.

Collects indicators the network analyzer already found (URLs, domains, IPs)
plus any in the code index string table, de-duplicates them, drops obvious
noise, and writes reports/iocs.json and reports/iocs.csv.

Defanging: exported indicators are written in defanged form (hxxp://, [.])
so a report can be pasted into a ticket without becoming a live link. The raw
value is kept alongside for tooling.
"""

import csv
import ipaddress
import json
import re
import sqlite3
from pathlib import Path

from reema._psl import public_suffix, registrable_domain

URL_RE = re.compile(r"\bhttps?://[^\s\"'<>\\)]+", re.IGNORECASE)
IPV4_RE = re.compile(r"\b(?:\d{1,3}\.){3}\d{1,3}\b")
DOMAIN_RE = re.compile(r"\b(?:[a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?\.)+[a-z]{2,24}\b", re.IGNORECASE)

# Hosts/domains that are almost always framework noise, not indicators.
NOISE_DOMAINS = {
    "schemas.android.com", "www.w3.org", "xmlpull.org", "java.sun.com",
    "goo.gl", "example.com", "github.com", "developer.android.com",
    "play.google.com", "fonts.gstatic.com",
}
NOISE_SUFFIXES = (".android.com", ".googleapis.com", ".google.com", ".gstatic.com")
# Resource/string artifacts that look like domains but are not (e.g. Kotlin property names).
NOT_A_DOMAIN = re.compile(r"\.(top|bottom|start|end|left|right|java|kt|xml|png|json)$", re.IGNORECASE)


def _is_public_ip(value):
    try:
        ip = ipaddress.ip_address(value)
    except ValueError:
        return False
    return not (ip.is_private or ip.is_loopback or ip.is_multicast or ip.is_reserved or ip.is_unspecified)


def _is_real_domain(value):
    value = value.lower().rstrip(".")
    if value in NOISE_DOMAINS or NOT_A_DOMAIN.search(value):
        return False
    if any(value == s[1:] or value.endswith(s) for s in NOISE_SUFFIXES):
        return False
    return True


# A credible bare domain is a registrable name under a known public suffix (B12).
_HOSTNAME_RE = re.compile(r"\A(?:[a-z0-9](?:[a-z0-9-]{0,61}[a-z0-9])?\.)+[a-z0-9][a-z0-9-]{0,61}[a-z0-9]?\Z")


def _is_credible_domain(value):
    """True for a standalone domain that is a real registrable name, not a code
    identifier like `coroutineId.id` or `R.id` (B12).

    Decompiled hostnames are written lowercase, so an uppercase letter marks a
    Java/Kotlin identifier; and the suffix must be a known public suffix with at
    least one label in front of it (so a bare TLD or `x.start` is rejected).
    """
    if not value or value != value.lower():
        return False
    value = value.rstrip(".")
    if not _HOSTNAME_RE.match(value):
        return False
    if value in NOISE_DOMAINS or any(value == s[1:] or value.endswith(s) for s in NOISE_SUFFIXES):
        return False
    reg = registrable_domain(value)
    if not reg:
        return False
    # A one-character registrable label (`r.id`) is a code identifier, not a domain.
    return len(reg.split(".")[0]) >= 2


def defang(value):
    return value.replace("http://", "hxxp://").replace("https://", "hxxps://").replace(".", "[.]")


def _load_json(path):
    try:
        return json.loads(Path(path).read_text(encoding="utf-8"))
    except (OSError, ValueError):
        return {}


def _index_strings(db_path):
    """Yield string constants from the code index, if present."""
    if not Path(db_path).is_file():
        return
    try:
        with sqlite3.connect(db_path) as con:
            for (value,) in con.execute("SELECT value FROM strings"):
                yield value
    except sqlite3.Error:
        return


def extract(case_dir):
    """Return {urls, domains, ips} of de-duplicated, filtered indicators."""
    case_dir = Path(case_dir)
    temp = case_dir / "temp"
    net = _load_json(temp / "network_findings.json")

    urls, domains, ips = set(), set(), set()

    for u in net.get("urls", []) or []:
        urls.add(u.strip())
    for ip in net.get("ip_addresses", []) or []:
        if _is_public_ip(ip):
            ips.add(ip)
    # The network analyzer's bare `domains` list is noisy (its regex also catches
    # code identifiers like "R.id"), so each candidate is re-validated against the
    # bundled public-suffix list before it is trusted as an indicator (B12).
    for domain in net.get("domains", []) or []:
        if _is_credible_domain(domain):
            domains.add(domain.lower().rstrip("."))

    # Mine the code-index string table for indicators the analyzer missed.
    for value in _index_strings(temp / "code_index.db"):
        for u in URL_RE.findall(value):
            urls.add(u)
        for ip in IPV4_RE.findall(value):
            if _is_public_ip(ip):
                ips.add(ip)

    # A URL's host is itself a domain indicator.
    for u in list(urls):
        m = re.match(r"https?://([^/:\s]+)", u, re.IGNORECASE)
        if m and _is_real_domain(m.group(1)):
            domains.add(m.group(1).lower())

    return {
        "urls": sorted(urls),
        "domains": sorted(domains),
        "ips": sorted(ips),
    }


def _rows(iocs):
    for kind in ("urls", "domains", "ips"):
        for value in iocs[kind]:
            yield {"type": kind[:-1], "value": value, "defanged": defang(value)}


def write(case_dir, sample=None):
    """Write reports/iocs.json and reports/iocs.csv. Returns (iocs, count)."""
    case_dir = Path(case_dir)
    iocs = extract(case_dir)
    reports = case_dir / "reports"
    reports.mkdir(parents=True, exist_ok=True)
    rows = list(_rows(iocs))

    doc = {"schema": "reema.iocs/v1", "sample": sample or {},
           "counts": {k: len(v) for k, v in iocs.items()}, "indicators": iocs,
           "defanged": [r["defanged"] for r in rows]}
    (reports / "iocs.json").write_text(json.dumps(doc, indent=2), encoding="utf-8")

    with open(reports / "iocs.csv", "w", newline="", encoding="utf-8") as f:
        w = csv.DictWriter(f, fieldnames=["type", "value", "defanged"])
        w.writeheader()
        w.writerows(rows)
    return iocs, len(rows)
