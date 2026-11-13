"""iOS IPA intake: structural metadata and Info.plist posture.

An IPA is a zip with Payload/<App>.app/. This reads the app bundle's
Info.plist, entitlements and embedded frameworks, and raises posture findings
(axis "posture") for the common App Transport Security and URL-scheme
misconfigurations. It is deliberately shallow: Mach-O disassembly, Swift
metadata and capability rules for iOS are backlog B17.

Output files reuse the APK engine's names so the Finding adapters and the
report work unchanged:
  temp/basic_info.json   bundle metadata (format "ipa")
  temp/ios_findings.json posture findings  (consumed by the ios adapter)

Info.plist can be binary (bplist) or XML; plistlib reads both.
"""

import json
import plistlib
import zipfile
from pathlib import Path


def _read_plist(zf, name):
    try:
        return plistlib.loads(zf.read(name))
    except (KeyError, ValueError, plistlib.InvalidFileException):
        return {}


def _app_root(names):
    """The Payload/<App>.app/ prefix, or None."""
    for n in names:
        parts = n.split("/")
        if len(parts) >= 2 and parts[0] == "Payload" and parts[1].endswith(".app"):
            return f"Payload/{parts[1]}/"
    return None


def basic_info(ipa):
    info = {"format": "ipa", "file_name": Path(ipa).name}
    with zipfile.ZipFile(ipa) as zf:
        names = zf.namelist()
        root = _app_root(names)
        info["bundle_found"] = bool(root)
        if not root:
            return info
        plist = _read_plist(zf, root + "Info.plist")
        info["bundle_id"] = plist.get("CFBundleIdentifier")
        info["app_name"] = plist.get("CFBundleDisplayName") or plist.get("CFBundleName")
        info["version_name"] = plist.get("CFBundleShortVersionString")
        info["version_code"] = str(plist.get("CFBundleVersion") or "")
        info["min_os"] = plist.get("MinimumOSVersion")
        info["platforms"] = plist.get("CFBundleSupportedPlatforms", [])
        info["url_schemes"] = [s for t in plist.get("CFBundleURLTypes", []) or []
                               for s in (t.get("CFBundleURLSchemes") or [])]
        info["frameworks"] = sorted({n.split("/")[-2] for n in names
                                     if "/Frameworks/" in n and n.endswith(".framework/")})
        info["dylibs"] = sorted(n.split("/")[-1] for n in names if n.endswith(".dylib"))
        info["has_embedded_provision"] = (root + "embedded.mobileprovision") in names
    return info


def _ats_findings(ats):
    """App Transport Security posture, from NSAppTransportSecurity."""
    out = []
    if ats.get("NSAllowsArbitraryLoads"):
        out.append(("high", "ats_arbitrary_loads",
                    "ATS disabled globally (NSAllowsArbitraryLoads = true)",
                    "The app permits cleartext/invalid-TLS connections to any host."))
    for host, cfg in (ats.get("NSExceptionDomains") or {}).items():
        if isinstance(cfg, dict) and cfg.get("NSExceptionAllowsInsecureHTTPLoads"):
            out.append(("medium", "ats_insecure_exception",
                        f"ATS exception allows insecure HTTP for {host}",
                        "Cleartext traffic is permitted to this domain."))
    return out


def analyze(ipa, case_dir):
    """Write temp/basic_info.json and temp/ios_findings.json. Returns the findings list."""
    case_dir = Path(case_dir)
    temp = case_dir / "temp"
    temp.mkdir(parents=True, exist_ok=True)

    info = basic_info(ipa)
    (temp / "basic_info.json").write_text(json.dumps(info, indent=2), encoding="utf-8")

    findings = []
    with zipfile.ZipFile(ipa) as zf:
        root = _app_root(zf.namelist())
        plist = _read_plist(zf, root + "Info.plist") if root else {}

    for sev, rule, title, detail in _ats_findings(plist.get("NSAppTransportSecurity", {}) or {}):
        findings.append({"severity": sev, "category": "ats", "rule": rule,
                         "title": title, "detail": detail})
    if info.get("url_schemes"):
        findings.append({"severity": "low", "category": "url_scheme", "rule": "custom_url_schemes",
                         "title": f"Declares custom URL scheme(s): {', '.join(info['url_schemes'])}",
                         "detail": "Custom URL schemes can be invoked by other apps; validate their input."})

    (temp / "ios_findings.json").write_text(
        json.dumps({"findings": findings, "info": info}, indent=2), encoding="utf-8")
    return findings
