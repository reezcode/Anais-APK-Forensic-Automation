#!/usr/bin/env python3
"""Peny P3: the business-logic track over captured (proxied) traffic.

Hermetic: a HAR file stands in for a proxy export and a fake ReplaySender stands
in for live replay, so the analyzers and the merge are tested without a backend.

Run: python3 -m unittest discover -s tests -v
"""

import base64
import json
import sys
import tempfile
import unittest
from pathlib import Path
from unittest import mock

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))

from peny import businesslogic as bl, scan as scan_mod, traffic  # noqa: E402


def jwt(alg="none", payload=None):
    def seg(obj):
        return base64.urlsafe_b64encode(json.dumps(obj).encode()).decode().rstrip("=")
    return seg({"alg": alg, "typ": "JWT"}) + "." + seg(payload or {"sub": "1"}) + "."


def har(entries):
    return {"log": {"entries": entries}}


def entry(method, url, req_headers=None, req_body="", status=200, resp_body=""):
    return {
        "request": {"method": method, "url": url,
                    "headers": [{"name": k, "value": v} for k, v in (req_headers or {}).items()],
                    "postData": {"text": req_body}},
        "response": {"status": status, "headers": [], "content": {"text": resp_body}},
    }


class FakeSender(bl.ReplaySender):
    def __init__(self, responses, default=(200, "")):
        self.responses = responses  # url -> (status, body)
        self.default = default
        self.sent = []

    def send(self, method, url, headers, body=None):
        self.sent.append((method, url, dict(headers)))
        status, b = self.responses.get(url, self.default)
        return {"status": status, "body": b}


class TrafficTests(unittest.TestCase):
    def test_load_har(self):
        with tempfile.NamedTemporaryFile("w", suffix=".har", delete=False) as fh:
            json.dump(har([entry("POST", "https://api.x/login", {"Authorization": "Bearer x"}, "pw")]), fh)
            path = fh.name
        flows = traffic.load_flows(path)
        self.assertEqual(len(flows), 1)
        self.assertEqual(flows[0].method, "POST")
        self.assertEqual(flows[0].header("authorization"), "Bearer x")
        self.assertEqual(flows[0].scheme, "https")


class PassiveTests(unittest.TestCase):
    def test_jwt_alg_none_is_critical_auth(self):
        f = traffic.Flow(method="GET", url="https://api.x/me",
                         req_headers={"authorization": "Bearer " + jwt("none")}, status=200)
        out = bl.inspect_jwts([f])
        self.assertTrue(any(x.rule == "jwt_alg_none" and x.masvs == "MASVS-AUTH"
                            and x.severity == "critical" for x in out))

    def test_jwt_missing_exp(self):
        f = traffic.Flow(method="GET", url="https://api.x/me",
                         req_headers={"authorization": "Bearer " + jwt("HS256", {"sub": "1"})}, status=200)
        out = bl.inspect_jwts([f])
        self.assertTrue(any(x.rule == "jwt_no_exp" for x in out))

    def test_cleartext_secret_is_network(self):
        f = traffic.Flow(method="POST", url="http://api.x/login", req_body="password=hunter2", status=200)
        out = bl.cleartext_secrets([f])
        self.assertEqual(out[0].masvs, "MASVS-NETWORK")
        self.assertEqual(out[0].rule, "secret_over_cleartext")

    def test_https_secret_not_flagged(self):
        f = traffic.Flow(method="POST", url="https://api.x/login", req_body="password=hunter2", status=200)
        self.assertEqual(bl.cleartext_secrets([f]), [])


class ActiveTests(unittest.TestCase):
    def test_missing_auth_detected_when_strip_still_200(self):
        f = traffic.Flow(method="GET", url="https://api.x/account",
                         req_headers={"authorization": "Bearer t"}, status=200, resp_body="acct")
        sender = FakeSender({}, default=(200, "acct"))  # succeeds without auth
        out = bl.active_checks([f], sender)
        self.assertTrue(any(x.rule == "missing_auth" for x in out))
        # the replay was sent without an Authorization header
        self.assertNotIn("authorization", sender.sent[0][2])

    def test_missing_auth_not_flagged_when_401(self):
        f = traffic.Flow(method="GET", url="https://api.x/account",
                         req_headers={"authorization": "Bearer t"}, status=200)
        sender = FakeSender({"https://api.x/account": (401, "")})
        self.assertFalse(any(x.rule == "missing_auth" for x in bl.active_checks([f], sender)))

    def test_idor_detected(self):
        f = traffic.Flow(method="GET", url="https://api.x/api/user/100", status=200, resp_body="userA")
        sender = FakeSender({"https://api.x/api/user/101": (200, "userB")})
        out = bl.active_checks([f], sender)
        self.assertTrue(any(x.rule == "idor" and x.masvs == "MASVS-AUTH" for x in out))

    def test_no_rate_limit(self):
        f = traffic.Flow(method="POST", url="https://api.x/login", status=200)
        sender = FakeSender({}, default=(200, ""))
        out = bl.rate_limit_check([f], sender, attempts=5)
        self.assertEqual(out[0].rule, "no_rate_limit")

    def test_rate_limit_ok_when_429(self):
        f = traffic.Flow(method="POST", url="https://api.x/login", status=200)
        sender = FakeSender({"https://api.x/login": (429, "")})
        self.assertEqual(bl.rate_limit_check([f], sender, attempts=5), [])


class MergeTests(unittest.TestCase):
    def _case(self, tmp):
        def fake_extract(target, case_dir, sha256, rules=None, offline=False):
            temp = Path(case_dir) / "temp"
            temp.mkdir(parents=True, exist_ok=True)
            (temp / "basic_info.json").write_text(json.dumps({"package_name": "com.example"}))
            (temp / "sast_findings.json").write_text(json.dumps(
                {"high": [{"category": "insecure_crypto", "title": "ECB", "file": "a", "line": 1}]}))
            return []
        apk = Path(tmp) / "t.apk"
        apk.write_bytes(b"PK\x03\x04")
        cdir = Path(tmp) / "case"
        with mock.patch("peny._shared.run_static_extraction", new=fake_extract):
            scan_mod.scan(str(apk), case_dir=str(cdir), offline=True)
        return cdir

    def test_merge_into_case_sets_auth_fail(self):
        with tempfile.TemporaryDirectory() as tmp:
            cdir = self._case(tmp)
            flows = [traffic.Flow(method="GET", url="https://api.x/me",
                                  req_headers={"authorization": "Bearer " + jwt("none")}, status=200)]
            summary = bl.run_business_logic(cdir, flows, active=False)
            self.assertEqual(summary["added"], 1)
            doc = json.loads((cdir / "reports" / "peny_findings.json").read_text())
            self.assertEqual(doc["masvs"]["MASVS-AUTH"]["status"], "fail")
            self.assertTrue((cdir / "reports" / "peny_traffic.json").is_file())
            # the static crypto finding is still present (merge, not replace)
            self.assertIn("MASVS-CRYPTO", {f["masvs"] for f in doc["findings"]})


if __name__ == "__main__":
    unittest.main()
