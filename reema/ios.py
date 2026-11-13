"""iOS IPA intake: structural metadata, Mach-O facts and Info.plist posture.

An IPA is a zip with Payload/<App>.app/. This reads the app bundle's
Info.plist and embedded frameworks, parses the main executable's Mach-O load
commands (encryption, PIE/ASLR, code signature, linked dylibs, Swift), and
raises findings for the common App Transport Security and URL-scheme
misconfigurations plus the Mach-O posture and a starter framework->capability
map (B17).

Mach-O parsing is stdlib-only (`struct`): it reads the header and load
commands, never disassembles. A malformed binary degrades to the plist facts
rather than failing the stage.

Output files reuse the APK engine's names so the Finding adapters and the
report work unchanged:
  temp/basic_info.json   bundle metadata (format "ipa")
  temp/ios_findings.json posture findings  (consumed by the ios adapter)

Info.plist can be binary (bplist) or XML; plistlib reads both.
"""

import json
import plistlib
import struct
import zipfile
from pathlib import Path

# Mach-O magics, keyed by the first 4 bytes read big-endian (so a little-endian
# binary's feedfacf reads as cffaedfe). Value is (struct byte-order, word bits).
_MH_MAGICS = {
    0xFEEDFACE: (">", 32),   # 32-bit big-endian
    0xFEEDFACF: (">", 64),   # 64-bit big-endian
    0xCEFAEDFE: ("<", 32),   # 32-bit little-endian
    0xCFFAEDFE: ("<", 64),   # 64-bit little-endian
}
_FAT_MAGICS = {0xCAFEBABE, 0xBEBAFECA}  # universal (fat) binary, 32-bit offsets

# Load commands we read. LC_REQ_DYLD bit (0x80000000) is masked off first.
_LC_SEGMENT = 0x1
_LC_SEGMENT_64 = 0x19
_LC_LOAD_DYLIB = 0xC
_LC_LOAD_WEAK_DYLIB = 0x18
_LC_REEXPORT_DYLIB = 0x1F
_LC_LOAD_UPWARD_DYLIB = 0x1E
_LC_CODE_SIGNATURE = 0x1D
_LC_ENCRYPTION_INFO = 0x21
_LC_ENCRYPTION_INFO_64 = 0x2C
_DYLIB_LCS = {_LC_LOAD_DYLIB, _LC_LOAD_WEAK_DYLIB, _LC_REEXPORT_DYLIB, _LC_LOAD_UPWARD_DYLIB}

_MH_PIE = 0x200000  # header flag: position-independent executable (ASLR)

_CPU_NAMES = {0x0100000C: "arm64", 0xC: "arm", 0x01000007: "x86_64", 0x7: "i386"}

# Dylibs that signal jailbreak / runtime-hooking tooling baked into the app.
_JAILBREAK_MARKERS = ("substrate", "cydia", "cycript", "frida", "libhooker",
                      "sslkillswitch", "rocketbootstrap", "libflex")

# Starter Apple-framework -> capability map (context axis). Detection *content*
# for iOS lives in backlog B13 (owner reez); this is the structural seed.
_FRAMEWORK_CAPS = {
    "CoreLocation": "location",
    "AVFoundation": "camera-microphone",
    "Photos": "photo-library",
    "PhotosUI": "photo-library",
    "Contacts": "contacts",
    "AddressBook": "contacts",
    "LocalAuthentication": "biometric-auth",
    "CoreBluetooth": "bluetooth",
    "HealthKit": "health-data",
    "EventKit": "calendar",
    "CoreMotion": "motion-sensors",
}


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


def _parse_slice(data, base, bo, bits):
    """Parse one Mach-O slice at offset `base`. Returns a partial fact dict."""
    out = {"dylibs": [], "encrypted": None, "pie": None, "signed": False}
    hdr_size = 32 if bits == 64 else 28
    # magic, cputype, cpusubtype, filetype, ncmds, sizeofcmds, flags[, reserved]
    fields = struct.unpack_from(bo + ("7I" if bits == 32 else "8I"), data, base)
    cputype, ncmds, flags = fields[1], fields[4], fields[6]
    out["arch"] = _CPU_NAMES.get(cputype, hex(cputype))
    out["pie"] = bool(flags & _MH_PIE)
    off = base + hdr_size
    for _ in range(ncmds):
        if off + 8 > len(data):
            break
        cmd, cmdsize = struct.unpack_from(bo + "2I", data, off)
        cmd &= 0x7FFFFFFF  # strip LC_REQ_DYLD
        if cmdsize < 8 or off + cmdsize > len(data):
            break
        if cmd in _DYLIB_LCS:
            (name_off,) = struct.unpack_from(bo + "I", data, off + 8)
            if 0 < name_off < cmdsize:
                raw = data[off + name_off:off + cmdsize].split(b"\x00", 1)[0]
                out["dylibs"].append(raw.decode("utf-8", "replace"))
        elif cmd == _LC_CODE_SIGNATURE:
            out["signed"] = True
        elif cmd in (_LC_ENCRYPTION_INFO, _LC_ENCRYPTION_INFO_64):
            # cryptoff(4), cryptsize(4), cryptid(4) follow cmd/cmdsize.
            (cryptid,) = struct.unpack_from(bo + "I", data, off + 16)
            out["encrypted"] = bool(cryptid)
        off += cmdsize
    return out


def parse_macho(data):
    """Facts about a Mach-O executable: arch(s), encryption, PIE, signature,
    linked dylibs and Swift use. Returns {} when `data` is not Mach-O."""
    if len(data) < 8:
        return {}
    (magic,) = struct.unpack_from(">I", data, 0)
    slices = []
    try:
        if magic in _FAT_MAGICS:
            bo = ">" if magic == 0xCAFEBABE else "<"
            (nfat,) = struct.unpack_from(bo + "I", data, 4)
            for i in range(nfat):
                # fat_arch: cputype, cpusubtype, offset, size, align
                _, _, foff, _, _ = struct.unpack_from(bo + "5I", data, 8 + i * 20)
                if foff + 8 <= len(data):
                    slices.append(foff)
        else:
            slices.append(0)
        archs = []
        for base in slices:
            (m,) = struct.unpack_from(">I", data, base)
            if m not in _MH_MAGICS:
                continue
            bo, bits = _MH_MAGICS[m]
            archs.append(_parse_slice(data, base, bo, bits))
    except struct.error:
        return {}
    if not archs:
        return {}
    dylibs = sorted({d for a in archs for d in a["dylibs"]})
    swift = any("libswift" in d.lower() for d in dylibs) or b"__swift5" in data[:1 << 22]
    return {
        "archs": [a["arch"] for a in archs],
        "encrypted": any(a["encrypted"] for a in archs),
        "pie": all(a["pie"] for a in archs),
        "signed": any(a["signed"] for a in archs),
        "swift": swift,
        "dylibs": dylibs,
        "jailbreak_dylibs": sorted({d for d in dylibs
                                    if any(m in d.lower() for m in _JAILBREAK_MARKERS)}),
    }


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

        # Parse the main executable's Mach-O (B17).
        exe = plist.get("CFBundleExecutable")
        info["executable"] = exe
        if exe and (root + exe) in names:
            try:
                info["macho"] = parse_macho(zf.read(root + exe))
            except (KeyError, zipfile.BadZipFile):
                info["macho"] = {}
        else:
            info["macho"] = {}
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


def _macho_findings(macho):
    """Posture findings from the parsed Mach-O facts (B17)."""
    out = []
    if not macho:
        return out
    if macho.get("jailbreak_dylibs"):
        out.append({"severity": "high", "category": "macho", "rule": "macho_jailbreak_tooling",
                    "title": "Links jailbreak/hooking tooling: " + ", ".join(macho["jailbreak_dylibs"]),
                    "detail": "The binary links libraries used to hook or subvert iOS at runtime."})
    if macho.get("signed") is False:
        out.append({"severity": "high", "category": "macho", "rule": "macho_unsigned",
                    "title": "Main executable has no code-signature load command",
                    "detail": "An unsigned Mach-O cannot have been distributed through the App Store; it may be tampered or repackaged."})
    if macho.get("pie") is False:
        out.append({"severity": "medium", "category": "macho", "rule": "macho_no_pie",
                    "title": "Main executable is not position-independent (no PIE)",
                    "detail": "Without MH_PIE the binary loads at a fixed address, weakening ASLR."})
    if macho.get("encrypted") is False:
        out.append({"severity": "low", "category": "macho", "rule": "macho_not_encrypted",
                    "title": "Main executable is not FairPlay-encrypted",
                    "detail": "The binary carries no encryption (cryptid 0): decrypted/cracked, or built outside the App Store."})
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
    findings.extend(_macho_findings(info.get("macho") or {}))
    for fw in info.get("frameworks", []):
        name = fw[:-len(".framework")] if fw.endswith(".framework") else fw
        cap = _FRAMEWORK_CAPS.get(name)
        if cap:
            findings.append({"severity": "info", "category": "capability", "rule": f"ios_cap_{cap}",
                             "title": f"Links {name} ({cap})",
                             "detail": f"The app bundles the {name} framework; it can exercise {cap}."})

    (temp / "ios_findings.json").write_text(
        json.dumps({"findings": findings, "info": info}, indent=2), encoding="utf-8")
    return findings
