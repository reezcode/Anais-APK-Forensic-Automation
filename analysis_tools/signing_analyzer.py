#!/usr/bin/env python3
"""
APK Signing Analyzer

Inspects the APK signing block and certificate chain for security-relevant
conditions:
  - which signature schemes are present (v1/v2/v3/v4)
  - v1-only signing (Janus / downgrade exposure, CVE-2017-13156)
  - debug certificates shipped to production
  - self-signed certificates (expected for Android, reported as context)
  - weak certificate signature algorithms (MD5/SHA1)
  - small RSA keys
  - certificate SHA-256 fingerprint (for cross-app reuse correlation)

Usage: signing_analyzer.py <apk_path> <output_json>
"""

import sys
import json
import hashlib

# androguard logs verbosely through loguru; silence it so our output stays clean
try:
    from loguru import logger as _loguru_logger
    _loguru_logger.remove()
except Exception:
    pass

try:
    from androguard.core.apk import APK
except ImportError:
    APK = None

try:
    from cryptography import x509
    from cryptography.hazmat.backends import default_backend
    from cryptography.hazmat.primitives import hashes
    from cryptography.hazmat.primitives.asymmetric import rsa, dsa, ec
except ImportError:
    x509 = None


DEBUG_CERT_MARKERS = ("android debug", "o=android", "cn=android debug")
WEAK_SIG_ALGS = ("md5", "sha1")


def _severity_finding(findings, severity, title, detail):
    findings.append({"severity": severity, "title": title, "detail": detail})


def analyze_certificate(der, findings):
    """Return a dict describing one DER-encoded certificate."""
    info = {
        "sha256": hashlib.sha256(der).hexdigest(),
        "sha1": hashlib.sha1(der).hexdigest(),
    }
    if x509 is None:
        return info
    try:
        cert = x509.load_der_x509_certificate(der, default_backend())
    except Exception as exc:
        info["parse_error"] = str(exc)
        return info

    subject = cert.subject.rfc4514_string()
    issuer = cert.issuer.rfc4514_string()
    info["subject"] = subject
    info["issuer"] = issuer
    info["serial"] = str(cert.serial_number)
    try:
        info["not_before"] = cert.not_valid_before_utc.isoformat()
        info["not_after"] = cert.not_valid_after_utc.isoformat()
    except AttributeError:  # older cryptography
        info["not_before"] = str(cert.not_valid_before)
        info["not_after"] = str(cert.not_valid_after)

    sig_alg = (cert.signature_algorithm_oid._name or "").lower()
    info["signature_algorithm"] = sig_alg
    info["self_signed"] = subject == issuer

    # Public key type and size
    pub = cert.public_key()
    if isinstance(pub, rsa.RSAPublicKey):
        info["key_type"] = "RSA"
        info["key_size"] = pub.key_size
    elif isinstance(pub, dsa.DSAPublicKey):
        info["key_type"] = "DSA"
        info["key_size"] = pub.key_size
    elif isinstance(pub, ec.EllipticCurvePublicKey):
        info["key_type"] = "EC"
        info["key_size"] = pub.key_size
    else:
        info["key_type"] = type(pub).__name__

    # Findings
    low = (subject + " " + issuer).lower()
    if any(m in low for m in DEBUG_CERT_MARKERS):
        info["debug_certificate"] = True
        _severity_finding(findings, "high", "Debug certificate in shipped APK",
                           f"Certificate subject looks like the Android debug key: {subject}")

    if any(w in sig_alg for w in WEAK_SIG_ALGS):
        _severity_finding(findings, "medium", "Weak certificate signature algorithm",
                           f"Certificate is signed with {sig_alg}, which is cryptographically weak.")

    if info.get("key_type") == "RSA" and info.get("key_size", 0) < 2048:
        _severity_finding(findings, "medium", "Short RSA signing key",
                           f"Signing key is RSA-{info.get('key_size')}; 2048-bit or larger is recommended.")

    return info


def main():
    if len(sys.argv) < 3:
        print("Usage: signing_analyzer.py <apk_path> <output_json>")
        sys.exit(1)

    apk_path = sys.argv[1]
    output_json = sys.argv[2]

    result = {
        "signed": False,
        "schemes": {"v1": False, "v2": False, "v3": False, "v4": False},
        "certificates": [],
        "findings": [],
    }

    if APK is None:
        result["error"] = "androguard not installed"
        with open(output_json, "w") as f:
            json.dump(result, f, indent=2)
        print("Warning: androguard not installed; skipping signing analysis")
        return

    try:
        apk = APK(apk_path)
    except Exception as exc:
        result["error"] = str(exc)
        with open(output_json, "w") as f:
            json.dump(result, f, indent=2)
        print(f"Signing analysis failed: {exc}")
        return

    findings = result["findings"]

    result["schemes"]["v1"] = bool(apk.is_signed_v1())
    result["schemes"]["v2"] = bool(apk.is_signed_v2())
    result["schemes"]["v3"] = bool(apk.is_signed_v3())
    # v4 support varies by androguard version
    try:
        result["schemes"]["v4"] = bool(getattr(apk, "is_signed_v4", lambda: False)())
    except Exception:
        result["schemes"]["v4"] = False
    result["signed"] = bool(apk.is_signed())

    if not result["signed"]:
        _severity_finding(findings, "high", "APK is not signed",
                           "No valid signature found; the package cannot be installed on a normal device and its origin is unverifiable.")

    # v1-only signing → Janus / downgrade exposure
    if result["schemes"]["v1"] and not (result["schemes"]["v2"] or result["schemes"]["v3"]):
        _severity_finding(findings, "high", "v1-only signing (Janus / downgrade risk)",
                           "APK is signed only with the v1 (JAR) scheme. On Android < 7.0 this is vulnerable to the Janus attack (CVE-2017-13156) and to signature-stripping downgrades.")

    # Collect certificates (v2/v3 preferred, fall back to v1 DER)
    der_certs = []
    try:
        der_certs = list(apk.get_certificates_der_v3() or [])
    except Exception:
        pass
    if not der_certs:
        try:
            der_certs = list(apk.get_certificates_der_v2() or [])
        except Exception:
            pass
    if not der_certs:
        try:
            der_certs = list(apk.get_certificates_der_v1() or [])
        except Exception:
            pass

    for der in der_certs:
        result["certificates"].append(analyze_certificate(der, findings))

    # Severity rollup
    sev_order = {"critical": 3, "high": 2, "medium": 1, "low": 0}
    result["max_severity"] = max((f["severity"] for f in findings),
                                 key=lambda s: sev_order.get(s, 0), default="none")

    with open(output_json, "w") as f:
        json.dump(result, f, indent=2)

    schemes = ",".join(k for k, v in result["schemes"].items() if v) or "none"
    print(f"Signing analysis complete. Schemes: {schemes} | Findings: {len(findings)}")


if __name__ == "__main__":
    main()
