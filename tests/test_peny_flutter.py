#!/usr/bin/env python3
"""Tests for Peny's Flutter (Dart AOT) track. blutter is never run: a fake
runner points the scan at a fixture dump.

Run: python3 -m unittest discover -s tests -v
"""

import sys
import tempfile
import unittest
from dataclasses import dataclass
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))

from peny import flutter as F  # noqa: E402

# A pp.txt-like dump: Dart string constants as blutter writes them.
DUMP = '''pool heap offset: 0x900080
[pp+0x60] String: "getCallbackHandle"
[pp+0x68] String: "AIzaSyFAKE0TEST0KEY0000000000000000000x"
[pp+0x70] String: "http://api.internal.example.net/v1/login"
[pp+0x78] String: "http://www.w3.org/2000/svg"
[pp+0x80] String: "cipher = AES/ECB/PKCS5Padding"
[pp+0x88] String: "badCertificateCallback"
[pp+0x90] String: ": Error in user badCertificateCallback: ignored"
[pp+0x98] String: "http://www.ibm.com/data/dtd/v11/x.dtd"
'''


@dataclass
class FakeRunner:
    out: Path
    ok: bool = True

    def run(self, lib_dir, out_dir):
        return F.BlutterResult(ok=self.ok, out_dir=self.out, log="fake")


def _dump_dir():
    d = Path(tempfile.mkdtemp())
    (d / "pp.txt").write_text(DUMP)
    return d


class ScanDartStringsTest(unittest.TestCase):
    def setUp(self):
        self.out = _dump_dir()
        self.findings = F.scan_dart_strings(self.out)
        self.by = {}
        for f in self.findings:
            self.by.setdefault(f.rule, []).append(f)

    def test_api_key_found_and_classified(self):
        self.assertIn("api_keys", self.by)
        f = self.by["api_keys"][0]
        self.assertIn("AIzaSyFAKE", f.description)
        self.assertEqual(f.masvs, "MASVS-STORAGE")
        self.assertEqual(f.source, "flutter")

    def test_real_cleartext_url_kept_namespaces_dropped(self):
        urls = [f.description for f in self.by.get("flutter_cleartext_url", [])]
        self.assertTrue(any("api.internal.example.net" in u for u in urls))
        self.assertFalse(any("w3.org" in u for u in urls))
        self.assertFalse(any("ibm.com" in u and ".dtd" in u for u in urls))

    def test_weak_crypto_found(self):
        self.assertIn("insecure_crypto", self.by)

    def test_tls_bypass_only_bare_hook_not_prose(self):
        tls = self.by.get("flutter_tls_bypass", [])
        self.assertEqual(len(tls), 1)  # the bare "badCertificateCallback", not the error sentence
        self.assertNotIn("Error in user", tls[0].description)


class AnalyzeDartApisTest(unittest.TestCase):
    """Code-level analysis: platform-channel / plugin identifiers -> attack
    surface findings, with MIME/framework noise excluded and pigeon collapsed."""

    def setUp(self):
        dump = (
            'pool heap offset: 0x0\n'
            '[pp+0x1] String: "dev.flutter.pigeon.webview_flutter_android.WebView.loadUrl"\n'
            '[pp+0x2] String: "dev.flutter.pigeon.webview_flutter_android.WebView.setSettings"\n'
            '[pp+0x3] String: "app/native_variables_channel"\n'
            '[pp+0x4] String: "plugins.flutter.io/local_auth"\n'
            '[pp+0x5] String: "plugins.it_nomads.com/flutter_secure_storage"\n'
            '[pp+0x6] String: "com.llfbandit.app_links/events"\n'
            '[pp+0x7] String: "text/plain"\n'
            '[pp+0x8] String: "image/jpeg"\n'
            '[pp+0x9] String: "flutter/platform"\n'
            '[pp+0xa] String: "application/json"\n'
        )
        import tempfile
        d = Path(tempfile.mkdtemp()); (d / "pp.txt").write_text(dump)
        self.fs = F.analyze_dart_apis(d)
        self.by = {}
        for f in self.fs:
            self.by.setdefault(f.rule, []).append(f)

    def test_webview_collapsed_to_one(self):
        self.assertEqual(len(self.by.get("flutter_webview", [])), 1)

    def test_custom_channel_flagged_medium(self):
        cc = self.by.get("flutter_custom_channel", [])
        self.assertEqual(len(cc), 1)
        self.assertEqual(cc[0].severity, "medium")
        self.assertIn("native_variables_channel", cc[0].description)

    def test_known_plugins_classified(self):
        self.assertIn("flutter_local_auth", self.by)
        self.assertIn("flutter_secure_storage", self.by)
        self.assertIn("flutter_deeplink", self.by)

    def test_mime_and_framework_excluded(self):
        descs = " ".join(f.description for f in self.fs)
        for noise in ("text/plain", "image/jpeg", "application/json", "flutter/platform"):
            self.assertNotIn(noise, descs)


class TrackTest(unittest.TestCase):
    def _case(self, flutter=True):
        case = Path(tempfile.mkdtemp())
        lib = case / "decompiled" / "lib" / "arm64-v8a"
        lib.mkdir(parents=True)
        if flutter:
            (lib / "libapp.so").write_bytes(b"\x7fELF fake")
            (lib / "libflutter.so").write_bytes(b"\x7fELF fake")
        return case, lib

    def test_runs_and_returns_findings(self):
        case, _ = self._case()
        findings, status = F.run_flutter_track(case, runner=FakeRunner(out=_dump_dir()))
        self.assertTrue(status["flutter"] and status["ran"] and status["ok"])
        self.assertTrue(any(f.source == "flutter" and f.rule == "api_keys" for f in findings))

    def test_not_flutter_is_noop(self):
        case, _ = self._case(flutter=False)
        findings, status = F.run_flutter_track(case, runner=FakeRunner(out=_dump_dir()))
        self.assertEqual((findings, status), ([], {"flutter": False}))

    def test_blutter_failure_yields_single_info_finding(self):
        case, _ = self._case()
        findings, status = F.run_flutter_track(case, runner=FakeRunner(out=_dump_dir(), ok=False))
        self.assertFalse(status["ok"])
        self.assertEqual(len(findings), 1)
        self.assertEqual(findings[0].rule, "flutter_not_analyzed")
        self.assertEqual(findings[0].severity, "info")

    def test_find_libs_prefers_arm64(self):
        case, lib = self._case()
        self.assertEqual(F.find_flutter_libs(case), lib)


if __name__ == "__main__":
    unittest.main()
