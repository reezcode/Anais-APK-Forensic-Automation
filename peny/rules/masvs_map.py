"""The MASVS rule set: map a shared-core finding to a Peny vulnerability.

Peny does not re-detect anything. It re-lenses the normalized findings the
shared static core already produces (manifest, sast, signing, rasp, ...) through
an exploitability lens: each known `(source, category)` pair maps to an OWASP
MASVS control, a CWE, a MASTG test, an exploitability severity, a developer fix,
and whether runtime proof is needed (methodology §1.7).

The table is data, so extending coverage (backlog PE-S1/PE-S4) is adding a row,
not writing code. An unmapped finding is skipped — malware IOCs and neutral
context facts are not the assessed app's vulnerabilities.
"""

from dataclasses import dataclass, field
from typing import List, Optional


@dataclass(frozen=True)
class MapRule:
    masvs: str
    source: str  # Peny rule-group label for the emitted finding
    severity: Optional[str] = None  # override; None keeps the analyzer severity
    cwe: List[str] = field(default_factory=list)
    mastg: List[str] = field(default_factory=list)
    impact: str = ""
    fix: str = ""
    needs_runtime: bool = False


# Keyed on (reema_source, reema_category). Category is what the adapter sets as
# the finding's `category` (and usually its `rule`).
RULES = {
    # --- SAST: cryptography -------------------------------------------------
    ("sast", "insecure_crypto"): MapRule(
        masvs="MASVS-CRYPTO", source="crypto", severity="high",
        cwe=["CWE-327"], mastg=["MASTG-TEST-0014"],
        impact="Weak or broken cipher/hash lets an attacker recover or forge protected data.",
        fix="Use AES-256-GCM and SHA-256+; drop ECB/DES/3DES/RC4 and MD5/SHA-1 for security use.",
        needs_runtime=True),
    # --- SAST: secrets ------------------------------------------------------
    ("sast", "hardcoded_secrets"): MapRule(
        masvs="MASVS-STORAGE", source="secrets", severity="high",
        cwe=["CWE-798"], mastg=["MASTG-TEST-0011"],
        impact="A secret shipped in the APK is extractable by anyone with the file.",
        fix="Remove embedded secrets; fetch at runtime over TLS or hold keys in the Android Keystore."),
    ("sast", "api_keys"): MapRule(
        masvs="MASVS-STORAGE", source="secrets", severity="high",
        cwe=["CWE-798"], mastg=["MASTG-TEST-0011"],
        impact="A hardcoded API key can be lifted from the APK and abused against the backend.",
        fix="Move keys server-side or scope/rotate them; never ship a privileged key in the client."),
    # --- SAST: network ------------------------------------------------------
    ("sast", "insecure_network"): MapRule(
        masvs="MASVS-NETWORK", source="network", severity="high",
        cwe=["CWE-295"], mastg=["MASTG-TEST-0020"],
        impact="Trust-all TrustManager/HostnameVerifier makes TLS MITM trivial on a hostile network.",
        fix="Remove permissive TrustManager/HostnameVerifier; enforce TLS and certificate pinning.",
        needs_runtime=True),
    # --- SAST: platform / WebView / IPC ------------------------------------
    ("sast", "webview_vulnerabilities"): MapRule(
        masvs="MASVS-PLATFORM", source="webview", severity="high",
        cwe=["CWE-749"], mastg=["MASTG-TEST-0033"],
        impact="A JS bridge or file access in a WebView can escalate web content to native code or local file theft.",
        fix="Disable JavaScript/file access unless required; require @JavascriptInterface; validate every loaded URL.",
        needs_runtime=True),
    ("sast", "intent_vulnerabilities"): MapRule(
        masvs="MASVS-PLATFORM", source="platform", severity="medium",
        cwe=["CWE-927"], mastg=["MASTG-TEST-0029"],
        impact="Implicit intents and mutable PendingIntents can be intercepted or hijacked by another app.",
        fix="Use explicit intents; set FLAG_IMMUTABLE on PendingIntents; validate all intent extras.",
        needs_runtime=True),
    ("sast", "dynamic_permission_requests"): MapRule(
        masvs="MASVS-CODE", source="platform", severity="low",
        cwe=["CWE-250"],
        impact="Permissions requested at runtime widen the attack surface if unneeded.",
        fix="Request only permissions the feature needs; review each runtime grant."),
    # --- SAST: storage / privacy -------------------------------------------
    ("sast", "insecure_storage"): MapRule(
        masvs="MASVS-STORAGE", source="storage", severity="medium",
        cwe=["CWE-312"], mastg=["MASTG-TEST-0001"],
        impact="Sensitive data at rest in plaintext is readable on a rooted or backed-up device.",
        fix="Use EncryptedSharedPreferences / SQLCipher; never MODE_WORLD_READABLE; keep secrets off external storage.",
        needs_runtime=True),
    ("sast", "logging_sensitive_data"): MapRule(
        masvs="MASVS-PRIVACY", source="storage", severity="medium",
        cwe=["CWE-532"], mastg=["MASTG-TEST-0003"],
        impact="Sensitive values in logcat are readable by other apps on older Android and by anyone with ADB.",
        fix="Strip sensitive data from logs in release builds; gate Log calls on BuildConfig.DEBUG.",
        needs_runtime=True),

    # --- Manifest -----------------------------------------------------------
    ("manifest", "exported_component"): MapRule(
        masvs="MASVS-PLATFORM", source="manifest", severity="medium",
        cwe=["CWE-926"], mastg=["MASTG-TEST-0024"],
        impact="An exported component without a guard is reachable IPC an attacker app can drive.",
        fix="Set exported=false, or guard with a signature-level permission and validate all input.",
        needs_runtime=True),
    ("manifest", "debuggable"): MapRule(
        masvs="MASVS-RESILIENCE", source="manifest", severity="high",
        cwe=["CWE-489"], mastg=["MASTG-TEST-0046"],
        impact="A debuggable release lets anyone attach a debugger and inspect or control the app.",
        fix="Set android:debuggable=false in the release build."),
    ("manifest", "backup_allowed"): MapRule(
        masvs="MASVS-STORAGE", source="manifest", severity="medium",
        cwe=["CWE-530"], mastg=["MASTG-TEST-0009"],
        impact="allowBackup=true lets ADB backup exfiltrate the app's private data without root.",
        fix="Set allowBackup=false, or define fullBackupContent/dataExtractionRules to exclude secrets."),
    ("manifest", "cleartext_traffic"): MapRule(
        masvs="MASVS-NETWORK", source="manifest", severity="high",
        cwe=["CWE-319"], mastg=["MASTG-TEST-0019"],
        impact="Cleartext HTTP is readable and modifiable by any network attacker.",
        fix="Set usesCleartextTraffic=false and add a network_security_config that enforces TLS."),
    ("manifest", "dangerous_permission"): MapRule(
        masvs="MASVS-PRIVACY", source="manifest", severity="low",
        cwe=["CWE-250"], mastg=["MASTG-TEST-0004"],
        impact="Over-broad permissions enlarge the blast radius if the app is compromised.",
        fix="Drop permissions the app does not need; justify each dangerous one."),

    # --- Signing ------------------------------------------------------------
    ("signing", "signing"): MapRule(
        masvs="MASVS-RESILIENCE", source="signing", severity="low",
        cwe=["CWE-347"], mastg=["MASTG-TEST-0047"],
        impact="Weak or v1-only signing weakens tamper protection and integrity guarantees.",
        fix="Sign with APK Signature Scheme v2+/v3; do not ship a debug or self-signed release cert."),

    # --- RASP / packer (context -> resilience note) ------------------------
    ("rasp", "protection"): MapRule(
        masvs="MASVS-RESILIENCE", source="resilience", severity="info",
        mastg=["MASTG-TEST-0048"],
        impact="A packer/RASP is present; static coverage is limited until it is confirmed or bypassed.",
        fix="Confirm the protection's strength dynamically; a single easily-stripped check is not resilience.",
        needs_runtime=True),
}


def to_peny(finding):
    """Map a shared-core Finding to a PenyFinding, or None to skip it.

    Skipped: malware IOCs and neutral context facts that are not the assessed
    app's own weaknesses (no row in RULES for them).
    """
    from peny.findings import PenyFinding

    rule = RULES.get((finding.source, finding.category)) or RULES.get((finding.source, finding.rule))
    if rule is None:
        return None
    return PenyFinding(
        source=rule.source,
        rule=finding.category or finding.rule,
        title=finding.title,
        severity=rule.severity or finding.severity,
        masvs=rule.masvs,
        confidence=finding.confidence,
        mastg=list(rule.mastg),
        cwe=list(rule.cwe),
        category=finding.category,
        description=finding.description,
        impact=rule.impact,
        fix=rule.fix,
        evidence=list(finding.evidence),  # shared Evidence type, passed through
        owner=finding.owner,  # an SDK weakness is still the app's exposure; not down-ranked
        needs_runtime_confirmation=rule.needs_runtime,
    )


# MASVS groups Peny's static lens actually evaluates. A group here with no
# finding is reported `pass`; a group outside it with no finding is `not_checked`
# (it needs the dynamic/traffic tracks, P2/P3). Downstream never infers coverage
# from absence.
STATIC_COVERAGE = frozenset({
    "MASVS-STORAGE", "MASVS-CRYPTO", "MASVS-NETWORK",
    "MASVS-PLATFORM", "MASVS-CODE", "MASVS-RESILIENCE", "MASVS-PRIVACY",
})
