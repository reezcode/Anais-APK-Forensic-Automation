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
import uuid
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


# STIX 2.1 / MISP export (B15). IDs are deterministic (uuid5 over the indicator
# value) so re-running on the same sample yields the same bundle, which keeps a
# report diffable and lets a TIP de-duplicate on re-import.
_REEMA_NS = uuid.UUID("5f3d6b6e-9f9a-5d3a-9b6e-7e6a9f9a5d3a")
# A fixed created/modified timestamp keeps the bundle reproducible; the real
# first-seen time belongs to the case record, not the indicator object.
_STIX_TS = "2020-01-01T00:00:00.000Z"

# IOC kind -> (STIX pattern object-path, MISP attribute type).
_STIX_PATH = {"urls": "url:value", "domains": "domain-name:value", "ips": "ipv4-addr:value"}
_MISP_TYPE = {"urls": "url", "domains": "domain", "ips": "ip-dst"}


def _stix_id(prefix, value):
    return f"{prefix}--{uuid.uuid5(_REEMA_NS, prefix + ':' + value)}"


def stix_bundle(iocs, sample=None):
    """Return a STIX 2.1 bundle (dict) of the indicators as `indicator` SDOs."""
    sample = sample or {}
    identity_id = _stix_id("identity", "reema")
    objects = [{
        "type": "identity", "spec_version": "2.1", "id": identity_id,
        "created": _STIX_TS, "modified": _STIX_TS,
        "name": "Reema", "identity_class": "system",
    }]
    for kind, path in _STIX_PATH.items():
        for value in iocs.get(kind, []):
            pattern = "[%s = '%s']" % (path, value.replace("\\", "\\\\").replace("'", "\\'"))
            objects.append({
                "type": "indicator", "spec_version": "2.1",
                "id": _stix_id("indicator", value),
                "created": _STIX_TS, "modified": _STIX_TS,
                "created_by_ref": identity_id,
                "name": value, "pattern": pattern, "pattern_type": "stix",
                "valid_from": _STIX_TS,
                "labels": ["malicious-activity"],
            })
    return {
        "type": "bundle",
        "id": _stix_id("bundle", sample.get("sha256", "reema")),
        "objects": objects,
    }


def misp_event(iocs, sample=None):
    """Return a MISP event (dict) with one network-activity attribute per IOC."""
    sample = sample or {}
    name = sample.get("file_name") or sample.get("package_name") or "sample"
    attributes = []
    for kind, mtype in _MISP_TYPE.items():
        for value in iocs.get(kind, []):
            attributes.append({
                "uuid": str(uuid.uuid5(_REEMA_NS, "misp:" + value)),
                "type": mtype, "category": "Network activity",
                "to_ids": True, "value": value,
            })
    for algo in ("md5", "sha1", "sha256"):
        if sample.get(algo):
            attributes.append({
                "uuid": str(uuid.uuid5(_REEMA_NS, "misp:" + sample[algo])),
                "type": algo, "category": "Payload delivery",
                "to_ids": True, "value": sample[algo],
            })
    return {"Event": {
        "uuid": str(uuid.uuid5(_REEMA_NS, "event:" + (sample.get("sha256") or name))),
        "info": "Reema static analysis: %s" % name,
        "analysis": "2", "threat_level_id": "2", "distribution": "0",
        "Attribute": attributes,
    }}


def write(case_dir, sample=None):
    """Write reports/iocs.{json,csv,stix.json,misp.json}. Returns (iocs, count)."""
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

    (reports / "iocs.stix.json").write_text(
        json.dumps(stix_bundle(iocs, sample), indent=2), encoding="utf-8")
    (reports / "iocs.misp.json").write_text(
        json.dumps(misp_event(iocs, sample), indent=2), encoding="utf-8")
    return iocs, len(rows)
