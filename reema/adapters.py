"""Convert the legacy analyzer JSON files in <work_dir>/temp/ into Findings.

Each adapter reads one tool's output and returns a list of Finding. Adapters
never raise on malformed input: a missing or broken file yields no findings,
because one bad analyzer must not hide the others.

The legacy file names are the ones report_generator_modular.py loads.
"""

import json
from pathlib import Path

from reema._legacy import owner_of
from reema.findings import Evidence, Finding

# SAST categories that describe what malware does, not how a benign app is
# built. Pattern matches only, so confidence stays low until the P2
# capability engine confirms them.
SAST_MALICE_CATEGORIES = {
    "root_detection_bypass",
    "crypto_wallet_targeting",
    "data_exfiltration",
    "remote_code_execution",
    "accessibility_abuse",
}

# Manifest checks that are build hygiene. Dangerous permissions are a
# capability signal; anything uncategorized (e.g. a parse failure) is context.
MANIFEST_POSTURE_CATEGORIES = {"exported_component", "debuggable", "backup_allowed", "cleartext_traffic"}
MANIFEST_MALICE_CATEGORIES = {"dangerous_permission"}


def _manifest_axis(category):
    if category in MANIFEST_POSTURE_CATEGORIES:
        return "posture"
    if category in MANIFEST_MALICE_CATEGORIES:
        return "malice"
    return "context"


def _load(path):
    try:
        with open(path, "r", encoding="utf-8") as f:
            data = json.load(f)
        return data if isinstance(data, (dict, list)) else None
    except (OSError, ValueError):
        return None


def _rel(path, work_dir):
    """Show evidence paths relative to the case directory when they live inside it."""
    if not path:
        return "unknown"
    try:
        return str(Path(path).resolve().relative_to(Path(work_dir).resolve()))
    except (ValueError, OSError):
        return str(path)


def sast(data, work_dir):
    out = []
    for severity in ("critical", "high", "medium", "low", "info"):
        for item in data.get(severity, []) or []:
            category = item.get("category", "")
            out.append(Finding(
                source="sast",
                rule=category or "pattern",
                title=item.get("title", "SAST finding"),
                severity=severity,
                axis="malice" if category in SAST_MALICE_CATEGORIES else "posture",
                confidence="low" if category in SAST_MALICE_CATEGORIES else "medium",
                category=category,
                description=item.get("description", ""),
                evidence=[Evidence(file=_rel(item.get("file"), work_dir),
                                   line=item.get("line"),
                                   snippet=item.get("code"))],
            ))
    return out


def yara(data, work_dir):
    out = []
    for item in data.get("findings", []) or []:
        strings = item.get("matched_strings", []) or []
        snippet = ", ".join(f"{s.get('identifier')}={s.get('content')}" for s in strings[:5]) or None
        out.append(Finding(
            source="yara",
            rule=item.get("rule_name", "unknown"),
            title=f"YARA: {item.get('rule_name', 'unknown')}",
            severity=item.get("severity", "low"),
            axis="malice",
            # The bundled rules are generic string sets; treat a hit as a lead.
            confidence="low",
            category=item.get("category", ""),
            description=item.get("description", ""),
            recommendation=item.get("recommendation", ""),
            evidence=[Evidence(file=_rel(item.get("file"), work_dir), snippet=snippet)],
            tags=[f"scan:{item.get('scan_type')}"] if item.get("scan_type") else [],
        ))
    return out


def manifest(data, work_dir):
    out = []
    for item in data.get("findings", []) or []:
        category = item.get("category", "")
        subject = item.get("permission") or item.get("component") or ""
        out.append(Finding(
            source="manifest",
            rule=category or "manifest",
            title=item.get("title", "Manifest finding"),
            severity=item.get("severity", "info"),
            axis=_manifest_axis(category),
            confidence="low" if category in MANIFEST_MALICE_CATEGORIES else "medium",
            category=category,
            description=item.get("description", ""),
            evidence=[Evidence(file="AndroidManifest.xml", snippet=subject or None)],
        ))
    return out


def network(data, work_dir):
    out = []
    for item in data.get("c2_indicators", []) or []:
        target = item.get("url") or item.get("domain", "")
        out.append(Finding(
            source="network",
            rule="c2_pattern" if item.get("url") else "dga_domain",
            title=f"Potential C2 indicator: {target}",
            severity="high",
            axis="malice",
            confidence="low",
            category="c2",
            description=item.get("description", ""),
            evidence=[Evidence(file="(string table)", snippet=target)],
            tags=["ioc"],
        ))
    for item in data.get("suspicious_urls", []) or []:
        out.append(Finding(
            source="network",
            rule="suspicious_url",
            title=f"Suspicious URL: {item.get('url', '')}",
            severity="medium",
            axis="malice",
            confidence="low",
            category="network",
            description=item.get("reason", ""),
            evidence=[Evidence(file=_rel(item.get("file"), work_dir), snippet=item.get("url"))],
            tags=["ioc"],
        ))
    return out


def signing(data, work_dir):
    out = []
    for item in data.get("findings", []) or []:
        out.append(Finding(
            source="signing",
            rule=item.get("title", "signing").lower().replace(" ", "_"),
            title=item.get("title", "Signing issue"),
            severity=item.get("severity", "info"),
            # A debug or self-signed cert is normal for sideloaded malware and
            # for internal builds alike; it frames the sample, it does not convict it.
            axis="context",
            confidence="medium",
            category="signing",
            description=item.get("detail", ""),
            evidence=[Evidence(file="META-INF/")],
        ))
    return out


def rasp(data, work_dir):
    out = []
    for family in data.get("detected", []) or []:
        refs = (data.get("evidence", {}) or {}).get(family, []) or []
        evidence = [Evidence(file=str(r)) for r in refs[:5]] or [Evidence(file="(multiple)")]
        out.append(Finding(
            source="rasp",
            rule=f"protector:{family}",
            title=f"Protector/packer detected: {family}",
            severity="info",
            axis="context",
            confidence="high" if family == data.get("type") else "medium",
            category="protection",
            evidence=evidence,
            tags=["protector"],
        ))
    return out


def dex_payload(data, work_dir):
    out = []
    for ind in data.get("protection_indicators", []) or []:
        out.append(Finding(
            source="dex_payload",
            rule="stub_dex",
            title=f"Stub/loader DEX: {ind.get('file')}",
            severity="medium",
            axis="context",
            confidence="medium",
            category="packing",
            description="; ".join(ind.get("indicators", [])),
            recommendation="Real code is unpacked at runtime; dump it during dynamic analysis.",
            evidence=[Evidence(file=ind.get("file", "unknown"))],
        ))
    for p in data.get("encrypted_payloads", []) or []:
        if p.get("type") in (None, "Unknown", "DEX"):
            continue
        out.append(Finding(
            source="dex_payload",
            rule="encrypted_payload",
            title=f"{p.get('type')}: {p.get('location')}",
            severity="medium",
            axis="context",
            confidence="medium",
            category="packing",
            description="; ".join(p.get("indicators", [])),
            evidence=[Evidence(file=p.get("location", "unknown"))],
        ))
    containers = data.get("container_payloads", {}) or {}
    for key in ("zip_assets", "embedded_in_so"):
        for c in containers.get(key, []) or []:
            if not c.get("contains_dex"):
                continue
            # DEX shipped inside a container instead of as classesN.dex is a
            # dropper pattern: the code is meant to be loaded later.
            out.append(Finding(
                source="dex_payload",
                rule=f"hidden_dex:{key}",
                title=f"DEX hidden inside container: {c.get('location')}",
                severity="high",
                axis="malice",
                confidence="medium",
                category="dynamic_code_loading",
                description=f"Embedded files: {', '.join(c.get('embedded_files', [])[:10])}",
                evidence=[Evidence(file=c.get("location", "unknown"), offset=c.get("offset"))],
                attck=["T1407"],  # Download New Code at Runtime
            ))
    return out


def entropy(data, work_dir):
    out = []
    for item in (data.get("summary", {}) or {}).get("highly_suspicious", []) or []:
        out.append(Finding(
            source="entropy",
            rule="high_entropy",
            title=f"High-entropy file: {item.get('filename')}",
            severity="low",
            axis="context",
            confidence="medium",
            category="packing",
            description=f"entropy={item.get('entropy', 0):.2f}, "
                        f"high-entropy ratio={item.get('high_entropy_ratio', 0):.0%}",
            evidence=[Evidence(file=item.get("filename", "unknown"))],
        ))
    return out


def enrichment(data, work_dir):
    """Online reputation (reema/enrich.py). Only "found" results become findings."""
    out = []
    providers = data.get("providers", {}) or {}
    mb = providers.get("malwarebazaar", {})
    if mb.get("status") == "found":
        d = mb.get("data", {})
        family = d.get("family")
        out.append(Finding(
            source="enrichment",
            rule="malwarebazaar:known_sample",
            title=f"Known malware sample (MalwareBazaar){': ' + family if family else ''}",
            severity="critical",
            axis="malice",
            confidence="high",
            category="reputation",
            description=f"First seen {d.get('first_seen')}; tags: {', '.join(d.get('tags', []))}",
            evidence=[Evidence(file=d.get("link", "malwarebazaar"))],
            tags=[f"family:{family}"] if family else [],
        ))
    vt = providers.get("virustotal", {})
    if vt.get("status") == "found":
        d = vt.get("data", {})
        hits = d.get("malicious", 0) or 0
        if hits:
            label = d.get("label")
            out.append(Finding(
                source="enrichment",
                rule="virustotal:detections",
                title=f"{hits} engines detect this sample (VirusTotal){': ' + label if label else ''}",
                severity="critical" if hits >= 10 else "high" if hits >= 3 else "medium",
                axis="malice",
                confidence="high" if hits >= 10 else "medium" if hits >= 3 else "low",
                category="reputation",
                description=f"malicious={hits}, suspicious={d.get('suspicious', 0)}, "
                            f"undetected={d.get('undetected', 0)}",
                evidence=[Evidence(file=d.get("link", "virustotal"))],
                tags=[f"family:{label}"] if label else [],
            ))
    return out


# legacy file name in temp/ -> adapter
ADAPTERS = {
    "sast_findings.json": sast,
    "yara_enhanced.json": yara,
    "manifest_findings.json": manifest,
    "network_findings.json": network,
    "signing_analysis.json": signing,
    "rasp_report.json": rasp,
    "dex_payload_report.json": dex_payload,
    "entropy_analysis.json": entropy,
    "enrichment.json": enrichment,
}


def tag_owner(finding):
    """Set owner from the first evidence path. A finding in SDK code drops to low
    confidence: it describes a library, not the sample author's own code."""
    if finding.evidence and not finding.owner:
        finding.owner = owner_of(finding.evidence[0].file)
    if finding.owner.startswith("sdk:"):
        finding.confidence = "low"
    return finding


def collect(work_dir, extra=None):
    """Run every adapter over <work_dir>/temp. Returns (findings, sources_read).

    extra maps more file names to adapters (e.g. enrichment), checked after ADAPTERS.
    """
    temp = Path(work_dir) / "temp"
    findings, sources = [], []
    for filename, adapter in {**ADAPTERS, **(extra or {})}.items():
        data = _load(temp / filename)
        if not isinstance(data, dict):
            continue
        sources.append(filename)
        findings.extend(tag_owner(f) for f in adapter(data, work_dir))
    return findings, sources
