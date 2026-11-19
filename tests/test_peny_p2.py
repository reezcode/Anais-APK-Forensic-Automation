#!/usr/bin/env python3
"""Peny P2: the dynamic confirm track.

Hermetic: a fake FridaRunner stands in for a live device, so the confirm logic
(flip runtime_status, re-render matrix) is tested without an emulator — the same
injection pattern Dyxon uses for its shell Runner.

Run: python3 -m unittest discover -s tests -v
"""

import json
import sys
import tempfile
import unittest
from pathlib import Path
from unittest import mock

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))

from peny import dynamic, scan as scan_mod  # noqa: E402
from peny.findings import PenyFinding  # noqa: E402

SESSION = {"session_id": "s1", "serial": "emulator-5554", "frida_endpoint": "127.0.0.1:27042"}


class FakeFrida(dynamic.FridaRunner):
    """Returns canned send() messages keyed on the script's basename."""

    def __init__(self, by_script):
        self.by_script = by_script
        self.calls = []

    def run_script(self, package, script_path, timeout=20):
        name = Path(script_path).name
        self.calls.append((package, name))
        return self.by_script.get(name, {"messages": [], "error": None})


def _case_with_runtime_findings(tmp):
    """Build a real Peny case (via patched extraction) with crypto/network/storage
    findings, all flagged needs_runtime."""
    temp_files = {
        "basic_info.json": {"package_name": "com.example", "version_name": "1.0"},
        "sast_findings.json": {
            "high": [
                {"category": "insecure_crypto", "title": "AES/ECB", "file": "a.smali", "line": 5},
                {"category": "insecure_network", "title": "trust-all", "file": "n.smali", "line": 9},
            ],
            "medium": [
                {"category": "insecure_storage", "title": "plaintext prefs", "file": "s.smali", "line": 2},
            ],
        },
    }

    def fake_extract(target, case_dir, sha256, rules=None, offline=False):
        temp = Path(case_dir) / "temp"
        temp.mkdir(parents=True, exist_ok=True)
        for n, d in temp_files.items():
            (temp / n).write_text(json.dumps(d))
        return []

    apk = Path(tmp) / "t.apk"
    apk.write_bytes(b"PK\x03\x04")
    cdir = Path(tmp) / "case"
    with mock.patch("peny._shared.run_static_extraction", new=fake_extract):
        scan_mod.scan(str(apk), case_dir=str(cdir), authorized_by="op", offline=True)
    return cdir


class ConfirmTests(unittest.TestCase):
    def test_confirm_flips_status_and_matrix(self):
        with tempfile.TemporaryDirectory() as tmp:
            cdir = _case_with_runtime_findings(tmp)
            fake = FakeFrida({
                "crypto_hooks.js": {"messages": [
                    {"check": "weak_cipher", "confirmed": True, "detail": "Cipher ECB at runtime"}], "error": None},
                "ssl_pinning_bypass.js": {"messages": [
                    {"check": "pinning", "confirmed": False, "detail": "no pinner exercised"}], "error": None},
                "storage_dump.js": {"messages": [], "error": None},  # no signal
            })
            summary = dynamic.run_confirm(cdir, SESSION, fake, package="com.example")

            doc = json.loads((cdir / "reports" / "peny_findings.json").read_text())
            by_masvs = {f["masvs"]: f for f in doc["findings"]}
            self.assertEqual(by_masvs["MASVS-CRYPTO"]["runtime_status"], "confirmed")
            self.assertEqual(by_masvs["MASVS-NETWORK"]["runtime_status"], "refuted")
            self.assertEqual(by_masvs["MASVS-STORAGE"].get("runtime_status", "pending"), "pending")

            # matrix: crypto confirmed -> fail; network refuted -> fail; storage still needs_runtime
            self.assertEqual(doc["masvs"]["MASVS-CRYPTO"]["status"], "fail")
            self.assertEqual(doc["masvs"]["MASVS-NETWORK"]["status"], "fail")
            self.assertEqual(doc["masvs"]["MASVS-STORAGE"]["status"], "needs_runtime")
            self.assertEqual(summary["confirmed"], 1)

            # runtime evidence attached with the device serial
            ev = by_masvs["MASVS-CRYPTO"]["evidence"]
            self.assertTrue(any(e.get("file") == "device:emulator-5554" for e in ev))

            # dynamic record written; each pending source ran once
            self.assertTrue((cdir / "reports" / "peny_dynamic.json").is_file())
            ran = {name for _pkg, name in fake.calls}
            self.assertEqual(ran, {"crypto_hooks.js", "ssl_pinning_bypass.js", "storage_dump.js"})

    def test_runner_error_leaves_pending(self):
        with tempfile.TemporaryDirectory() as tmp:
            cdir = _case_with_runtime_findings(tmp)
            fake = FakeFrida({"crypto_hooks.js": {"messages": [], "error": "device offline"}})
            dynamic.run_confirm(cdir, SESSION, fake, package="com.example")
            doc = json.loads((cdir / "reports" / "peny_findings.json").read_text())
            crypto = next(f for f in doc["findings"] if f["masvs"] == "MASVS-CRYPTO")
            self.assertEqual(crypto.get("runtime_status", "pending"), "pending")

    def test_user_script_recorded_as_observation(self):
        with tempfile.TemporaryDirectory() as tmp:
            cdir = _case_with_runtime_findings(tmp)
            uscript = Path(tmp) / "mine.js"
            uscript.write_text("// noop")
            fake = FakeFrida({"mine.js": {"messages": [{"note": "hi"}], "error": None}})
            dynamic.run_confirm(cdir, SESSION, fake, package="com.example", user_script=str(uscript))
            rec = json.loads((cdir / "reports" / "peny_dynamic.json").read_text())
            sources = {o["source"] for o in rec["observations"]}
            self.assertIn("user_script", sources)


class RoundTripTests(unittest.TestCase):
    def test_from_dict_preserves_id(self):
        f = PenyFinding(source="crypto", rule="insecure_crypto", title="AES/ECB",
                        severity="high", masvs="MASVS-CRYPTO", needs_runtime_confirmation=True)
        f2 = PenyFinding.from_dict(f.to_dict())
        self.assertEqual(f.id, f2.id)
        self.assertTrue(f2.needs_runtime_confirmation)


if __name__ == "__main__":
    unittest.main()
