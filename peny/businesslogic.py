"""The business-logic track (P3): find backend weaknesses in captured traffic.

Enabled by a proxied Dyxon lease (D-C1): with the device's HTTP(S) flowing
through the operator's proxy, Peny inspects the captured requests (JWT handling,
secrets in cleartext) and, with an injected `ReplaySender`, actively tampers
replays (missing auth, IDOR, rate limiting). Findings land on MASVS-AUTH /
MASVS-NETWORK / MASVS-PLATFORM — the controls the static lens leaves `not_checked`.

Peny captures and assists; it does not claim full automated exploitation. Active
replay only ever targets the authorized backend the operator is testing.
"""

import base64
import json
import re
from pathlib import Path

from peny._shared import Evidence
from peny.findings import PenyFinding, build_document
from peny.masvs import build_matrix
from peny.rules import STATIC_COVERAGE

# Control groups the P3 track assesses (so a clean, checked group reads `pass`).
BIZ_COVERAGE = frozenset({"MASVS-AUTH", "MASVS-NETWORK", "MASVS-PLATFORM"})

_JWT = re.compile(r"eyJ[A-Za-z0-9_-]{5,}\.[A-Za-z0-9_-]{5,}\.[A-Za-z0-9_-]*")
_SENSITIVE_KEY = re.compile(r"token|password|passwd|secret|api[_-]?key|session|auth|pin|card", re.I)
_ID_IN_PATH = re.compile(r"/(\d{2,})(?=/|$|\?)")


# --- active-replay boundary (injectable) --------------------------------------

class ReplaySender:
    """Send a (possibly tampered) request; return {"status": int, "body": str}."""

    def send(self, method, url, headers, body=None):  # pragma: no cover - interface
        raise NotImplementedError


class HttpReplaySender(ReplaySender):
    """Real sender over urllib, optionally through the operator proxy. Not used by
    the hermetic tests (it touches the network)."""

    def __init__(self, proxy=None, timeout=15):
        self.proxy = proxy
        self.timeout = timeout

    def send(self, method, url, headers, body=None):
        import urllib.request

        handlers = [urllib.request.ProxyHandler({"http": self.proxy, "https": self.proxy})] if self.proxy else []
        opener = urllib.request.build_opener(*handlers)
        data = body.encode("utf-8") if isinstance(body, str) else body
        req = urllib.request.Request(url, data=data, method=method, headers=headers or {})
        try:
            with opener.open(req, timeout=self.timeout) as resp:
                return {"status": resp.status, "body": resp.read(4096).decode("utf-8", "replace")}
        except urllib.error.HTTPError as e:
            return {"status": e.code, "body": ""}
        except Exception as e:
            return {"status": 0, "body": str(e)}


# --- JWT helpers --------------------------------------------------------------

def _b64url(seg):
    seg += "=" * (-len(seg) % 4)
    return base64.urlsafe_b64decode(seg)


def decode_jwt(token):
    """Decode a JWT's header and payload (no signature verification). None if not a JWT."""
    parts = token.split(".")
    if len(parts) < 2:
        return None
    try:
        return json.loads(_b64url(parts[0])), json.loads(_b64url(parts[1]))
    except Exception:
        return None


def _jwts_in(flow):
    tokens = set(_JWT.findall(flow.header("authorization") or ""))
    tokens |= set(_JWT.findall(flow.header("cookie") or ""))
    tokens |= set(_JWT.findall(flow.req_body or ""))
    return tokens


def _finding(**kw):
    kw.setdefault("confidence", "medium")
    kw.setdefault("runtime_status", "confirmed")  # observed/active in real traffic
    return PenyFinding(**kw)


# --- passive analyzers --------------------------------------------------------

def inspect_jwts(flows):
    out, seen = [], set()
    for f in flows:
        for tok in _jwts_in(f):
            decoded = decode_jwt(tok)
            if not decoded:
                continue
            header, payload = decoded
            key = (header.get("alg"), tuple(sorted(payload)))
            if key in seen:
                continue
            seen.add(key)
            alg = str(header.get("alg", "")).lower()
            ev = [Evidence(file=f.url, snippet=f"alg={header.get('alg')}")]
            if alg == "none":
                out.append(_finding(
                    source="auth", rule="jwt_alg_none", title="JWT accepts alg=none",
                    severity="critical", masvs="MASVS-AUTH", cwe=["CWE-347"],
                    mastg=["MASTG-TEST-0017"], confidence="high",
                    impact="A token signed with alg=none is forgeable; auth can be bypassed.",
                    fix="Reject alg=none server-side; pin the expected algorithm.", evidence=ev))
            elif "exp" not in payload:
                out.append(_finding(
                    source="auth", rule="jwt_no_exp", title="JWT has no expiry (exp)",
                    severity="medium", masvs="MASVS-AUTH", cwe=["CWE-613"],
                    impact="A token without exp stays valid indefinitely if leaked.",
                    fix="Issue short-lived tokens with an enforced exp claim.", evidence=ev))
    return out


def cleartext_secrets(flows):
    out = []
    for f in flows:
        if f.scheme != "http":
            continue
        hay = " ".join([f.header("authorization") or "", f.header("cookie") or "", f.req_body or "", f.url])
        if _SENSITIVE_KEY.search(hay):
            out.append(_finding(
                source="network", rule="secret_over_cleartext",
                title="Sensitive data sent over cleartext HTTP", severity="high",
                masvs="MASVS-NETWORK", cwe=["CWE-319"], confidence="high",
                impact="Credentials/tokens on plain HTTP are readable by any network attacker.",
                fix="Send all authenticated traffic over TLS; disable cleartext.",
                evidence=[Evidence(file=f.url, snippet=f.method)]))
    return out


# --- active replay analyzers --------------------------------------------------

def _is_2xx(status):
    return 200 <= status < 300


def active_checks(flows, sender):
    out = []
    for f in flows:
        if not _is_2xx(f.status):
            continue
        # Missing authentication: drop Authorization, resend; still 2xx == served unauthenticated.
        if f.header("authorization"):
            stripped = {k: v for k, v in f.req_headers.items() if k != "authorization"}
            resp = sender.send(f.method, f.url, stripped, f.req_body or None)
            if _is_2xx(resp.get("status", 0)):
                out.append(_finding(
                    source="auth", rule="missing_auth", title="Endpoint serves data without authentication",
                    severity="high", masvs="MASVS-AUTH", cwe=["CWE-306"], confidence="high",
                    impact="The request succeeds with no token; authorization is not enforced.",
                    fix="Enforce authentication/authorization server-side on every sensitive endpoint.",
                    evidence=[Evidence(file=f.url, snippet=f"{f.method} -> {resp.get('status')} without auth")]))
        # IDOR: step a numeric id in the path, resend; a different 2xx body suggests broken object access.
        m = _ID_IN_PATH.search(f.url)
        if m:
            other = str(int(m.group(1)) + 1)
            mutated = f.url[:m.start(1)] + other + f.url[m.end(1):]
            resp = sender.send(f.method, mutated, f.req_headers, f.req_body or None)
            if _is_2xx(resp.get("status", 0)) and resp.get("body") and resp.get("body") != f.resp_body:
                out.append(_finding(
                    source="businesslogic", rule="idor", title="Possible IDOR on object id in path",
                    severity="high", masvs="MASVS-AUTH", cwe=["CWE-639"], confidence="low",
                    impact="Another object's data is returned for a swapped id; access control may be missing.",
                    fix="Enforce per-object ownership checks server-side, not just a valid session.",
                    evidence=[Evidence(file=mutated, snippet=f"id {m.group(1)}->{other} -> {resp.get('status')}")]))
    return out


def rate_limit_check(flows, sender, attempts=6):
    """Replay the first auth-ish request N times; no 429 anywhere == weak throttling."""
    target = next((f for f in flows if re.search(r"login|auth|otp|verify|reset", f.url, re.I)), None)
    if target is None:
        return []
    statuses = [sender.send(target.method, target.url, target.req_headers, target.req_body or None).get("status", 0)
                for _ in range(attempts)]
    if 429 not in statuses:
        return [_finding(
            source="auth", rule="no_rate_limit", title="No rate limiting on a sensitive endpoint",
            severity="medium", masvs="MASVS-AUTH", cwe=["CWE-307"], confidence="low",
            impact="Repeated requests are not throttled; brute force / enumeration is feasible.",
            fix="Add server-side rate limiting and lockout on auth, OTP and reset endpoints.",
            evidence=[Evidence(file=target.url, snippet=f"{attempts} replays, statuses {statuses}")])]
    return []


# --- orchestration ------------------------------------------------------------

def analyze(flows, sender=None, active=False):
    """Return P3 findings from captured flows. Active replay runs only when a
    `sender` is given and `active` is set (it sends live requests)."""
    findings = inspect_jwts(flows) + cleartext_secrets(flows)
    if active and sender is not None:
        findings += active_checks(flows, sender) + rate_limit_check(flows, sender)
    return findings


def run_business_logic(case_dir, flows, sender=None, active=False):
    """Analyze captured flows and merge the P3 findings into a Peny case."""
    from peny import report as report_mod

    case_dir = Path(case_dir)
    doc = json.loads((case_dir / "reports" / "peny_findings.json").read_text(encoding="utf-8"))
    existing = [PenyFinding.from_dict(d) for d in doc.get("findings", [])]
    new = analyze(flows, sender=sender, active=active)

    by_id = {f.id: f for f in existing}
    for f in new:
        by_id[f.id] = f  # a re-run replaces a prior identical P3 finding
    merged = list(by_id.values())

    coverage = STATIC_COVERAGE | BIZ_COVERAGE
    matrix = build_matrix(merged, coverage)
    new_doc = build_document(
        merged, sample=doc.get("sample"), authorization=doc.get("authorization"),
        sources=sorted({f.source for f in merged}), matrix=matrix)

    reports = case_dir / "reports"
    (reports / "peny_findings.json").write_text(json.dumps(new_doc, indent=2))
    (reports / "masvs.json").write_text(json.dumps(matrix, indent=2))
    (reports / "masvs.md").write_text(report_mod.render_matrix(matrix))
    (reports / "report.md").write_text(report_mod.render_report(new_doc))
    (reports / "report.json").write_text(json.dumps(new_doc, indent=2))
    (reports / "peny_traffic.json").write_text(json.dumps(
        {"schema": "peny.traffic/v1", "flows": len(flows), "active": active,
         "added": [f.id for f in new]}, indent=2))

    return {"flows": len(flows), "added": len(new), "active": active}
