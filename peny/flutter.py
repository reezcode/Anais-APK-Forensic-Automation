"""Flutter (Dart AOT) SAST track.

Standard SAST reads decompiled Java/Smali, but a Flutter app's real logic lives
in `lib/<abi>/libapp.so` as a Dart AOT snapshot, invisible to jadx. This module
runs **blutter** to recover the Dart objects (class names + the string pool) and
then runs the same secret / URL / crypto checks over the recovered strings, so a
Flutter app gets findings instead of an empty report.

blutter is slow (it builds a native tool on first use and disassembles the whole
snapshot), so the track is opt-in (`peny analyze --flutter`) and runs through an
injectable runner, which keeps it testable without blutter installed.
"""

from __future__ import annotations

import json
import os
import re
import subprocess
from dataclasses import dataclass, field
from pathlib import Path
from typing import List, Optional, Protocol

from peny._shared import Evidence
from peny.findings import PenyFinding
from peny import secrets as secrets_mod

#: abi dirs blutter can take, best first (it needs libapp.so + libflutter.so)
_ABI_ORDER = ("arm64-v8a", "armeabi-v7a", "x86_64", "x86")

# Weak crypto algorithm names as they appear in Dart string constants.
_WEAK_CRYPTO = re.compile(r'\b(MD5|SHA-?1|DES|3DES|TripleDES|RC4|ARCFOUR|Blowfish|ECB)\b')
_CLEARTEXT_URL = re.compile(
    r'http://(?!localhost|127\.0\.0\.1|10\.0\.2\.2)([\w.\-]+)(?::\d+)?(?:/[^\s"\'<>]*)?')
#: XML-namespace / schema / spec hosts that are not network endpoints.
_NAMESPACE_HOSTS = re.compile(
    r'(?:^|\.)(?:w3\.org|xml\.org|apache\.org|purl\.org|json-schema\.org|'
    r'schemas\.android\.com|schemas\.microsoft\.com|ns\.adobe\.com|iptc\.org|'
    r'openxmlformats\.org|docbook\.org|oasis-open\.org|example\.com|example\.org)$',
    re.IGNORECASE)
#: TLS-bypass only when the string is the bare Dart hook, not a prose message
#: that merely mentions it (blutter's string pool holds error text too).
_TLS_BYPASS = re.compile(
    r'^\s*(?:badCertificateCallback|onBadCertificate|allowBadCertificates)\s*$|'
    r'HttpOverrides\.global')


@dataclass
class BlutterResult:
    ok: bool
    out_dir: Optional[Path] = None
    log: str = ""


class BlutterRunner(Protocol):
    def run(self, lib_dir: Path, out_dir: Path) -> BlutterResult:  # pragma: no cover - protocol
        ...


@dataclass
class BlutterCliRunner:
    """Real runner: shells the `blutter` wrapper (upstream blutter.py)."""

    blutter_bin: str = "blutter"
    timeout: int = 900

    def run(self, lib_dir: Path, out_dir: Path) -> BlutterResult:
        out_dir.mkdir(parents=True, exist_ok=True)
        try:
            proc = subprocess.run(
                [self.blutter_bin, str(lib_dir), str(out_dir)],
                capture_output=True, text=True, timeout=self.timeout,
            )
        except FileNotFoundError:
            return BlutterResult(ok=False, log=f"{self.blutter_bin!r} not found on PATH")
        except subprocess.TimeoutExpired:
            return BlutterResult(ok=False, out_dir=out_dir, log=f"blutter timed out after {self.timeout}s")
        log = (proc.stdout or "") + (proc.stderr or "")
        # blutter writes the Dart dump even when exit code is non-zero on warnings,
        # so success is "we got recoverable output", not just returncode 0.
        ok = proc.returncode == 0 or bool(_dump_files(out_dir))
        return BlutterResult(ok=ok, out_dir=out_dir, log=log[-4000:])


def find_flutter_libs(case_dir) -> Optional[Path]:
    """Return a lib/<abi> dir holding both libapp.so and libflutter.so."""
    case = Path(case_dir)
    roots = [case / "decompiled" / "lib", case / "jadx_output" / "resources" / "lib"]
    best = None
    for root in roots:
        if not root.is_dir():
            continue
        for abi in _ABI_ORDER:
            d = root / abi
            if (d / "libapp.so").is_file() and (d / "libflutter.so").is_file():
                return d
            if best is None and (d / "libapp.so").is_file():
                best = d
    return best


def is_flutter(case_dir) -> bool:
    """True when the case is a Flutter app (framework report or a libapp.so)."""
    case = Path(case_dir)
    report = case / "temp" / "framework_report.json"
    try:
        data = json.loads(report.read_text())
        if data.get("primary") == "Flutter" or any(
            f.get("framework") == "Flutter" for f in data.get("frameworks", [])
        ):
            return True
    except Exception:
        pass
    return find_flutter_libs(case) is not None


def _dump_files(out_dir) -> List[Path]:
    """blutter's text output, richest first: the object-pool dump holds the Dart
    string constants; asm/* is the fallback when the pool dump is absent."""
    out = Path(out_dir)
    files: List[Path] = []
    for name in ("pp.txt", "objs.txt"):
        p = out / name
        if p.is_file():
            files.append(p)
    asm = out / "asm"
    if asm.is_dir():
        files.extend(sorted(asm.rglob("*.txt"))[:200])
    return files


# Dart string constants in blutter output look like: [key] "value" or
#   ... String: "value"  or bare quoted literals in the asm. Pull quoted runs.
_DART_STRING = re.compile(r'"((?:\\.|[^"\\])*)"')


def extract_dart_strings(out_dir, cap_per_file=20000):
    """Yield (value, file_label, line_no) for Dart string constants in the dump."""
    for f in _dump_files(out_dir):
        try:
            text = f.read_text(errors="ignore")
        except Exception:
            continue
        label = f.name if f.parent.name != "asm" else f"asm/{f.name}"
        n = 0
        for ln, line in enumerate(text.splitlines(), 1):
            for m in _DART_STRING.finditer(line):
                val = m.group(1)
                if 4 <= len(val) <= 400:
                    yield val, label, ln
                    n += 1
                    if n >= cap_per_file:
                        break
            if n >= cap_per_file:
                break


def scan_dart_strings(out_dir) -> List[PenyFinding]:
    """Run secret / URL / crypto checks over the recovered Dart strings."""
    findings: List[PenyFinding] = []
    seen = set()

    def add(rule, value, label, line, **kw):
        key = (rule, value, label, line)
        if key in seen:
            return
        seen.add(key)
        ev = Evidence(file=f"flutter:{label}", line=line, snippet=value[:200])
        findings.append(PenyFinding(source="flutter", rule=rule, evidence=[ev], confidence="medium", **kw))

    for value, label, line in extract_dart_strings(out_dir):
        # 1) API keys / secrets (reuse the classifier used for XML/Java secrets)
        if secrets_mod.classify(value) != "Generic secret" or re.match(r'^[A-Za-z0-9_\-]{32,}$', value):
            kind = secrets_mod.classify(value)
            if kind != "Generic secret":
                add("api_keys", value, label, line,
                    title=f"{kind} in Dart code", severity="high", masvs="MASVS-STORAGE",
                    cwe=["CWE-798"], category="api_keys",
                    description=f"Pattern detected: {value}",
                    impact="A key compiled into the Dart snapshot is extractable with blutter and abusable against the backend.",
                    fix="Remove embedded keys; fetch at runtime over TLS or hold them server-side.")
                continue
        # 2) Cleartext HTTP endpoints (skip XML-namespace / schema / DTD URIs)
        mu = _CLEARTEXT_URL.search(value)
        if (mu and not _NAMESPACE_HOSTS.search(mu.group(1))
                and not re.search(r'\.(?:dtd|xsd|ent|mod|rng)(?:$|[?#])', mu.group(0), re.IGNORECASE)):
            add("flutter_cleartext_url", mu.group(0), label, line,
                title="Cleartext HTTP endpoint in Dart code", severity="medium", masvs="MASVS-NETWORK",
                cwe=["CWE-319"], mastg=["MASTG-TEST-0019"], category="insecure_network",
                description=f"Cleartext URL: {value}",
                impact="Traffic to this endpoint is unencrypted and open to interception/tampering.",
                fix="Use https and enforce TLS; add a network security config.",
                needs_runtime_confirmation=True)
            continue
        # 3) Weak crypto algorithm names
        mc = _WEAK_CRYPTO.search(value)
        if mc and ("crypt" in value.lower() or "cipher" in value.lower() or "digest" in value.lower()
                   or "hash" in value.lower() or "/" in value):
            add("insecure_crypto", value, label, line,
                title="Weak cryptography referenced in Dart code", severity="high", masvs="MASVS-CRYPTO",
                cwe=["CWE-327"], mastg=["MASTG-TEST-0014"], category="insecure_crypto",
                description=f"Weak algorithm: {mc.group(0)}",
                impact="A weak or broken cipher/hash lets an attacker recover or forge protected data.",
                fix="Use AES-256-GCM and SHA-256+; drop MD5/SHA-1/DES/RC4/ECB.",
                needs_runtime_confirmation=True)
            continue
        # 4) TLS-verification bypass hooks
        if _TLS_BYPASS.search(value):
            add("flutter_tls_bypass", value, label, line,
                title="TLS certificate validation may be disabled (Dart)", severity="high", masvs="MASVS-NETWORK",
                cwe=["CWE-295"], mastg=["MASTG-TEST-0020"], category="insecure_network",
                description=f"TLS bypass marker: {value}",
                impact="Disabled certificate validation enables man-in-the-middle interception.",
                fix="Never accept bad certificates in production; pin the server certificate/public key.",
                needs_runtime_confirmation=True)
    return findings


# ── Code-level analysis: native attack surface (platform channels/plugins) ────
# Obfuscation strips plugin call names, but the MethodChannel / pigeon channel
# identifiers survive as string constants and reveal what native surface the Dart
# code wires to. This is binary-level analysis (which APIs the app uses), beyond
# flat secret/URL scanning.
# A MethodChannel id has a namespace and a name: a reverse-domain (or a known
# host like app/ or plugins/) followed by "/name". Requiring the slash + the
# dotted/known namespace excludes MIME types (text/plain) and bare domains.
_CHANNEL = re.compile(r'^(?:[a-z][a-z0-9_]*\.){1,}[a-z0-9_]+/[a-z0-9_.]+$|^(?:app|plugins|channel)/[a-z0-9_.]+$')
_MIME_TOP = re.compile(r'^(?:text|image|audio|video|application|model|message|multipart|font|chemical)/')
_PIGEON = re.compile(r'^dev\.flutter\.pigeon\.([a-z0-9_]+)')
_FRAMEWORK_CHANNEL = re.compile(r'^flutter/|^dev\.flutter\.pigeon\.(?:flutter|path_provider)\b')
#: hosts of the standard plugin registries; anything else is an app-custom channel
_PLUGIN_HOSTS = ("plugins.flutter.io/", "plugins.flutter.dev/", "dev.fluttercommunity.plus/",
                 "dev.flutter.pigeon.")

# (substring in the channel/plugin id) -> finding spec. First match wins.
_CHANNEL_RULES = [
    ("webview", dict(rule="flutter_webview", title="WebView platform channel in use",
                     severity="medium", masvs="MASVS-PLATFORM", mastg=["MASTG-TEST-0031"],
                     impact="An embedded WebView with JavaScript or file access widens the attack surface (XSS, local-file read).",
                     fix="Disable JavaScript/file access unless required; restrict loaded origins.",
                     needs_runtime=True)),
    ("secure_storage", dict(rule="flutter_secure_storage", title="flutter_secure_storage in use",
                            severity="info", masvs="MASVS-STORAGE",
                            impact="Keystore-backed storage is available; verify sensitive data actually uses it.",
                            fix="Store tokens/keys in flutter_secure_storage, not SharedPreferences.")),
    ("shared_preferences", dict(rule="flutter_shared_prefs", title="SharedPreferences channel in use",
                                severity="low", masvs="MASVS-STORAGE",
                                impact="SharedPreferences is plaintext; secrets stored there are readable on a rooted device.",
                                fix="Keep secrets out of SharedPreferences; use flutter_secure_storage.",
                                needs_runtime=True)),
    ("local_auth", dict(rule="flutter_local_auth", title="Biometric / local-auth channel in use",
                        severity="low", masvs="MASVS-AUTH", mastg=["MASTG-TEST-0018"],
                        impact="A client-side biometric gate can be bypassed; it must not be the only control.",
                        fix="Enforce authorization server-side; treat local_auth as UX, not security.",
                        needs_runtime=True)),
    ("biometric", dict(rule="flutter_local_auth", title="Biometric channel in use",
                       severity="low", masvs="MASVS-AUTH", needs_runtime=True,
                       impact="A client-side biometric gate can be bypassed.",
                       fix="Enforce authorization server-side.")),
    ("camera", dict(rule="flutter_sensitive_capability", title="Camera channel in use",
                    severity="low", masvs="MASVS-PRIVACY",
                    impact="Access to a sensitive device capability (camera).",
                    fix="Confirm the capability is used only with consent and for the stated purpose.")),
    ("image_picker", dict(rule="flutter_sensitive_capability", title="Image picker channel in use",
                          severity="low", masvs="MASVS-PRIVACY",
                          impact="Access to user media.",
                          fix="Confirm scope and consent.")),
    ("geolocator", dict(rule="flutter_sensitive_capability", title="Location channel in use",
                        severity="low", masvs="MASVS-PRIVACY",
                        impact="Access to precise location.",
                        fix="Confirm consent and purpose.")),
    ("url_launcher", dict(rule="flutter_url_launcher", title="url_launcher channel in use",
                          severity="low", masvs="MASVS-PLATFORM",
                          impact="Launching attacker-influenced URLs/intents can enable redirection or intent abuse.",
                          fix="Validate and allow-list launched URLs/schemes.")),
    ("app_links", dict(rule="flutter_deeplink", title="Deep-link channel in use (app_links)",
                       severity="low", masvs="MASVS-PLATFORM", mastg=["MASTG-TEST-0028"], needs_runtime=True,
                       impact="Deep links carry attacker-controlled data into the app; unvalidated, they enable navigation/parameter abuse.",
                       fix="Validate and authorize every deep-link path and parameter.")),
    ("uni_links", dict(rule="flutter_deeplink", title="Deep-link channel in use (uni_links)",
                       severity="low", masvs="MASVS-PLATFORM", mastg=["MASTG-TEST-0028"], needs_runtime=True,
                       impact="Deep links carry attacker-controlled data into the app.",
                       fix="Validate and authorize every deep-link path and parameter.")),
]


def _channel_finding(channel, count, label, line):
    pigeon = _PIGEON.match(channel)
    key = pigeon.group(1) if pigeon else channel
    spec = next((s for sub, s in _CHANNEL_RULES if sub in key), None)
    if spec is None:
        custom = not any(channel.startswith(h) for h in _PLUGIN_HOSTS)
        spec = dict(
            rule="flutter_custom_channel" if custom else "flutter_platform_channel",
            title=("Custom native MethodChannel" if custom else "Native platform channel") + f" '{channel}'",
            severity="medium" if custom else "info",
            masvs="MASVS-PLATFORM", mastg=["MASTG-TEST-0032"],
            impact=("A custom native channel is app-defined attack surface; its native handler receives Dart input."
                    if custom else "A platform channel bridges Dart and native code."),
            fix="Review the native handler for input validation and authorization." if custom
                else "Inventory only; confirm the plugin's native side is current and configured safely.")
    desc = f"Native channel: {channel}" + (f" (x{count})" if count > 1 else "")
    ev = Evidence(file=f"flutter:{label}", line=line, snippet=channel)
    return PenyFinding(source="flutter", confidence="medium", category="flutter_api",
                       cwe=["CWE-749"], description=desc, evidence=[ev],
                       needs_runtime_confirmation=spec.pop("needs_runtime", False), **spec)


def analyze_dart_apis(out_dir, cap=60) -> List[PenyFinding]:
    """Enumerate the native platform channels / plugins the Dart code wires to
    and map each to its MASVS attack-surface finding (one per distinct channel)."""
    seen = {}
    for value, label, line in extract_dart_strings(out_dir):
        if _FRAMEWORK_CHANNEL.match(value) or _MIME_TOP.match(value):
            continue
        pigeon = _PIGEON.match(value)
        if pigeon or _CHANNEL.match(value):
            # Pigeon emits one channel per method; collapse to the plugin so a
            # WebView plugin is one finding, not one per generated method.
            key = f"dev.flutter.pigeon.{pigeon.group(1)}" if pigeon else value
            rec = seen.get(key)
            if rec:
                rec[0] += 1
            else:
                seen[key] = [1, label, line]
    findings = [_channel_finding(ch, c, lbl, ln) for ch, (c, lbl, ln) in seen.items()]
    # Surface the risky channels first, then cap.
    order = {"medium": 0, "low": 1, "info": 2}
    findings.sort(key=lambda f: order.get(f.severity, 3))
    return findings[:cap]


def run_flutter_track(case_dir, runner: Optional[BlutterRunner] = None,
                      out_dir=None, blutter_bin="blutter"):
    """Recover Dart logic with blutter and scan it. Returns (findings, status).

    Non-fatal: if the app is not Flutter, or blutter is unavailable or fails, it
    returns a short status (and one info finding for a detected-but-unanalyzed
    Flutter app) rather than raising, so `peny analyze` never breaks on it.
    """
    case = Path(case_dir)
    if not is_flutter(case):
        return [], {"flutter": False}

    lib_dir = find_flutter_libs(case)
    if lib_dir is None or not (lib_dir / "libflutter.so").is_file():
        return _unanalyzed(lib_dir, "libapp.so/libflutter.so pair not found"), {
            "flutter": True, "ran": False, "reason": "libs missing"}

    out = Path(out_dir) if out_dir else case / "temp" / "blutter"
    runner = runner or BlutterCliRunner(blutter_bin=blutter_bin)
    result = runner.run(lib_dir, out)
    if not result.ok:
        return _unanalyzed(lib_dir, result.log or "blutter did not produce output"), {
            "flutter": True, "ran": True, "ok": False, "log": result.log}

    out_dir = result.out_dir or out
    findings = scan_dart_strings(out_dir) + analyze_dart_apis(out_dir)
    return findings, {"flutter": True, "ran": True, "ok": True, "findings": len(findings)}


def _unanalyzed(lib_dir, reason) -> List[PenyFinding]:
    """A single info finding so a Flutter app is never silently empty."""
    loc = str(lib_dir) if lib_dir else "lib/<abi>/libapp.so"
    return [PenyFinding(
        source="flutter", rule="flutter_not_analyzed",
        title="Flutter app: Dart logic not analyzed", severity="info",
        masvs="MASVS-CODE", confidence="high", category="flutter",
        description=f"This is a Flutter app; its logic is a Dart AOT snapshot ({loc}) that standard SAST cannot read. {reason}.",
        impact="Findings from the Java/Kotlin layer alone understate a Flutter app.",
        fix="Run `peny analyze --flutter` with blutter installed to recover and scan the Dart code.",
        evidence=[Evidence(file="flutter:libapp.so", line=None, snippet=reason[:200])],
    )]
