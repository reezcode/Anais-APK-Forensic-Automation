"""Fallback AndroidManifest parsing for anti-analysis manifests (B18).

androguard and apktool both reject a deliberately malformed binary
AndroidManifest.xml -- an anti-analysis technique in packed droppers ("dummy
data between elements", bad chunk headers) -- so `basic_info.json` has no
permissions and no capability can fire. This recovers them two ways:

1. String-pool scrape (primary, fast): a binary AXML keeps its strings in a
   pool, and the structural tampering rarely touches it, so the permission
   names survive as UTF-16/UTF-8 strings in the raw bytes. A regex over the
   decoded bytes recovers them even when every structural parser fails or hangs.
2. The bundled Node converter `axml/` (axml2xml): used only when the scrape
   finds nothing, to structurally decode an oddly-encoded pool and to recover
   components. It is bounded by a timeout because a malformed manifest can make
   the JS parser loop.

Everything degrades to {} (never an exception).
"""

import re
import shutil
import subprocess
import tempfile
import zipfile
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
CONVERTER = ROOT / "axml" / "convert_axml.js"
_NODE_MODULES = ROOT / "axml" / "node_modules"

# A permission name: one or more lowercase dotted segments, ".permission.",
# then an UPPER_SNAKE constant. Matches android.permission.* and vendor perms.
_PERM_STR_RE = re.compile(r'(?:[a-z][a-z0-9_]*\.){1,8}permission\.[A-Z][A-Z0-9_]{2,48}')
_PERM_XML_RE = re.compile(r'uses-permission[^>]*android:name="([^"]+)"')
_COMP_RE = re.compile(r'<(activity|service|receiver|provider)\b[^>]*?android:name="([^"]+)"')
_COMP_KEY = {"activity": "activities", "service": "services",
             "receiver": "receivers", "provider": "providers"}


def available():
    """True when the node converter and its installed dependencies are present."""
    return bool(shutil.which("node")) and CONVERTER.is_file() and _NODE_MODULES.is_dir()


def _permissions_from_bytes(raw):
    """Scrape permission names from the raw manifest string pool, across the
    encodings a binary AXML may use. Robust to structural tampering."""
    names = set()
    for enc in ("utf-16-le", "utf-8", "latin-1"):
        try:
            text = raw.decode(enc, "ignore")
        except (UnicodeDecodeError, LookupError):
            continue
        names.update(_PERM_STR_RE.findall(text))
    return sorted(n for n in names if len(n) < 80)


def _convert_with_node(raw, timeout):
    """Convert binary AXML to XML text with axml2xml, or None on failure/timeout."""
    if not available():
        return None
    with tempfile.TemporaryDirectory() as d:
        axml = Path(d) / "AndroidManifest.axml"
        out = Path(d) / "out.xml"
        axml.write_bytes(raw)
        try:
            proc = subprocess.run(["node", str(CONVERTER), str(axml), str(out)],
                                  capture_output=True, text=True, timeout=timeout)
        except (subprocess.SubprocessError, OSError):
            return None
        if proc.returncode != 0 or not out.is_file():
            return None
        return out.read_text(encoding="utf-8", errors="replace")


def facts_from_xml(xml):
    """Scrape permissions/components from converted manifest XML (unit-testable
    without node)."""
    perms = sorted(set(_PERM_XML_RE.findall(xml)))
    comps = {"activities": [], "services": [], "receivers": [], "providers": []}
    seen = set()
    for tag, name in _COMP_RE.findall(xml):
        key = _COMP_KEY[tag]
        if (key, name) not in seen:
            seen.add((key, name))
            comps[key].append(name)
    if not perms and not any(comps.values()):
        return {}
    return {"permissions": perms, "manifest_source": "axml2xml", **comps}


def manifest_facts(apk_path, timeout=30):
    """Permissions (and components when available) from the APK's manifest.

    Returns {} on any failure. The string-pool scrape runs first because it is
    fast and survives tampering that makes the structural parser hang; the node
    converter is a bounded fallback used only when the scrape finds nothing.
    """
    try:
        with zipfile.ZipFile(apk_path) as zf:
            raw = zf.read("AndroidManifest.xml")
    except (OSError, KeyError, zipfile.BadZipFile):
        return {}

    perms = _permissions_from_bytes(raw)
    if perms:
        return {"permissions": perms, "manifest_source": "axml:strings"}

    xml = _convert_with_node(raw, timeout)
    if xml:
        return facts_from_xml(xml)
    return {}
