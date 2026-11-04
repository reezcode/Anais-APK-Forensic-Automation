#!/usr/bin/env python3
"""Tests for the framework/input/signing/output pipeline tools.

Run: python3 -m unittest discover -s tests -v
"""

import json
import os
import subprocess
import sys
import tempfile
import unittest
import zipfile
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
TOOLS = ROOT / "analysis_tools"
sys.path.insert(0, str(TOOLS))

import detect_framework  # noqa: E402
import sarif_exporter  # noqa: E402
import sdk_inventory  # noqa: E402
import diff_reports  # noqa: E402
import prepare_input  # noqa: E402
import rea_bridge  # noqa: E402
from report_generator_modular import ModularReportGenerator  # noqa: E402

HERMES_MAGIC = bytes([0xC6, 0x1F, 0xBC, 0x1F])


def make_apk(path, entries):
    """entries: dict of arcname -> bytes."""
    with zipfile.ZipFile(path, "w") as zf:
        for name, data in entries.items():
            zf.writestr(name, data)


class FrameworkDetectTests(unittest.TestCase):
    def setUp(self):
        self._tmp = tempfile.TemporaryDirectory()
        self.tmp = Path(self._tmp.name)

    def tearDown(self):
        self._tmp.cleanup()

    def _run(self, entries):
        apk = self.tmp / "a.apk"
        make_apk(apk, entries)
        out = self.tmp / "fw.json"
        detector_argv = [str(apk), "/nonexistent", str(out)]
        old = sys.argv
        sys.argv = ["detect_framework.py"] + detector_argv
        try:
            try:
                detect_framework.main()
            except SystemExit:
                pass
        finally:
            sys.argv = old
        return json.loads(out.read_text())

    def test_flutter(self):
        r = self._run({"lib/arm64-v8a/libflutter.so": b"x",
                       "lib/arm64-v8a/libapp.so": b"x",
                       "assets/flutter_assets/kernel_blob.bin": b"x"})
        self.assertEqual(r["primary"], "Flutter")
        self.assertIsNotNone(r["coverage_warning"])

    def test_react_native_hermes(self):
        r = self._run({"lib/arm64-v8a/libhermes.so": b"x",
                       "assets/index.android.bundle": HERMES_MAGIC + b"rest"})
        self.assertEqual(r["primary"], "React Native")
        self.assertEqual(r["frameworks"][0]["bundle_format"], "hermes-bytecode")
        self.assertIsNotNone(r["coverage_warning"])

    def test_react_native_plain_js(self):
        r = self._run({"lib/arm64-v8a/libjsc.so": b"x",
                       "assets/index.android.bundle": b"var x = require('react');"})
        self.assertEqual(r["frameworks"][0]["bundle_format"], "plain-js")
        self.assertIsNone(r["coverage_warning"])  # plain JS is scanned

    def test_native_app_no_framework(self):
        r = self._run({"classes.dex": b"x", "AndroidManifest.xml": b"x"})
        self.assertEqual(r["primary"], "Native / Java-Kotlin")
        self.assertEqual(r["frameworks"], [])


class SarifTests(unittest.TestCase):
    def test_structure_and_levels(self):
        sast = {
            "critical": [{"category": "remote_code_execution", "title": "RCE",
                          "description": "loadClass", "file": "a/b.smali", "line": 44, "code": "x"}],
            "medium": [{"category": "weak_crypto", "title": "MD5", "description": "md5",
                        "file": "c.java", "line": 3}],
            "summary": {},
        }
        sarif = sarif_exporter.build_sarif(sast, "app.apk")
        self.assertEqual(sarif["version"], "2.1.0")
        run = sarif["runs"][0]
        self.assertEqual(run["tool"]["driver"]["name"], "Anais")
        self.assertEqual(len(run["results"]), 2)
        levels = {r["ruleId"]: r["level"] for r in run["results"]}
        self.assertEqual(levels["anais/remote_code_execution"], "error")
        self.assertEqual(levels["anais/weak_crypto"], "warning")
        rce = next(r for r in run["results"] if r["ruleId"] == "anais/remote_code_execution")
        self.assertEqual(rce["locations"][0]["physicalLocation"]["region"]["startLine"], 44)


class SdkInventoryTests(unittest.TestCase):
    def setUp(self):
        self._tmp = tempfile.TemporaryDirectory()
        self.dec = Path(self._tmp.name) / "decompiled"
        (self.dec / "smali" / "okhttp3").mkdir(parents=True)
        (self.dec / "smali" / "com" / "appsflyer").mkdir(parents=True)
        (self.dec / "smali" / "androidx").mkdir(parents=True)

    def tearDown(self):
        self._tmp.cleanup()

    def test_detects_and_classifies(self):
        found = sdk_inventory.detect_sdks(str(self.dec), None)
        names = set(found)
        self.assertIn("OkHttp", names)
        self.assertIn("AppsFlyer", names)
        self.assertTrue(found["AppsFlyer"]["tracker"])
        self.assertFalse(found["OkHttp"]["tracker"])


class DiffTests(unittest.TestCase):
    def test_permission_and_risk_delta(self):
        old = {"basic_info": {"permissions": ["A", "B"]}, "risk": {"score": 40},
               "framework": {"primary": "Native / Java-Kotlin"}, "rasp": {"detected": []}}
        new = {"basic_info": {"permissions": ["A", "C"]}, "risk": {"score": 55},
               "framework": {"primary": "Flutter"}, "rasp": {"detected": ["Appdome"]}}
        d = diff_reports.diff(old, new)
        self.assertEqual(d["risk"]["change"], 15)
        self.assertEqual(d["permissions"]["added"], ["C"])
        self.assertEqual(d["permissions"]["removed"], ["B"])
        self.assertNotEqual(d["framework"]["old"], d["framework"]["new"])


class PrepareInputTests(unittest.TestCase):
    def setUp(self):
        self._tmp = tempfile.TemporaryDirectory()
        self.tmp = Path(self._tmp.name)

    def tearDown(self):
        self._tmp.cleanup()

    def test_xapk_picks_base_and_lists_splits(self):
        xapk = self.tmp / "app.xapk"
        with zipfile.ZipFile(xapk, "w") as zf:
            zf.writestr("base.apk", b"x" * 500)
            zf.writestr("config.arm64_v8a.apk", b"x" * 100)
            zf.writestr("manifest.json", b"{}")
        report = {"input_path": str(xapk), "input_type": None, "base_apk": None,
                  "splits": [], "split_count": 0, "notes": [], "error": None}
        base = prepare_input.handle_bundle_zip(str(xapk), str(self.tmp / "out"), report, "xapk")
        self.assertTrue(base.endswith("base.apk"))
        self.assertEqual(report["split_count"], 1)
        self.assertTrue(report["splits"][0]["config_split"])

    def test_aab_without_bundletool_errors(self):
        aab = self.tmp / "app.aab"
        aab.write_bytes(b"PK\x03\x04dummy")
        report = {"input_path": str(aab), "input_type": None, "base_apk": None,
                  "splits": [], "split_count": 0, "notes": [], "error": None}
        # Only meaningful when bundletool is absent
        import shutil as _sh
        if _sh.which("bundletool") or os.environ.get("BUNDLETOOL"):
            self.skipTest("bundletool present")
        base = prepare_input.handle_aab(str(aab), str(self.tmp / "out"), report)
        self.assertIsNone(base)
        self.assertIn("bundletool", report["error"])


class CompositeRiskTests(unittest.TestCase):
    def setUp(self):
        self._tmp = tempfile.TemporaryDirectory()
        self.ws = Path(self._tmp.name) / "ws"
        self.temp = self.ws / "temp"
        self.temp.mkdir(parents=True)
        (self.ws / "reports").mkdir()

    def tearDown(self):
        self._tmp.cleanup()

    def _write(self, name, obj):
        (self.temp / name).write_text(json.dumps(obj))

    def _gen(self):
        return ModularReportGenerator(str(self.ws), str(self.temp), "app.apk", "sha")

    def test_clean_app_minimal(self):
        self._write("sast_findings.json", {"critical": [], "high": [], "summary": {"risk_score": 0}})
        risk = self._gen().compute_composite_risk()
        self.assertEqual(risk["score"], 0)

    def test_sast_count_cannot_saturate(self):
        self._write("sast_findings.json",
                    {"critical": [{} for _ in range(5000)], "high": [{} for _ in range(5000)],
                     "summary": {"risk_score": 100}})
        risk = self._gen().compute_composite_risk()
        # SAST contribution alone is capped at 25
        self.assertLessEqual(risk["score"], 25)

    def test_yara_critical_dominates(self):
        self._write("yara_enhanced.json", {"summary": {"critical_findings": 3, "high_severity": 0}})
        risk = self._gen().compute_composite_risk()
        self.assertEqual(risk["score"], 30)  # capped


class ReaBridgeTests(unittest.TestCase):
    def test_exports_summary_flags_stripped(self):
        self.assertIn("note", rea_bridge.summarize_exports({"exports": []}))
        s = rea_bridge.summarize_exports({"exports": [{"name": "JNI_OnLoad"}, {"name": "foo"}]})
        self.assertEqual(s["export_count"], 2)
        self.assertEqual(s["jni_entry_points"], ["JNI_OnLoad"])

    def test_signature_summary_detects_integrity_failure(self):
        nr = {"schemes": {
            "v1": {"present": False, "signers": []},
            "v2": {"present": True, "signers": [
                {"certificate": {"sha256_fingerprint": "abc"},
                 "digests": [{"matches_apk": False}]}]},
        }}
        s = rea_bridge.summarize_signature(nr)
        self.assertEqual(s["schemes_present"], ["v2"])
        self.assertFalse(s["digest_integrity_ok"])
        self.assertEqual(s["signer_fingerprints"], ["abc"])

    def test_flutter_summary_pulls_snapshot_hash(self):
        nr = {"flutter_detected": True, "abis": [
            {"abi": "arm64-v8a", "libapp": {"snapshot_hash_candidates": ["deadbeef"]}}]}
        s = rea_bridge.summarize_flutter(nr)
        self.assertEqual(s["snapshot_hashes"], ["deadbeef"])
        self.assertEqual(s["abis"], ["arm64-v8a"])

    def test_resolve_cmd_prefers_env_override(self):
        old = os.environ.get("ANAIS_REA_CMD")
        os.environ["ANAIS_REA_CMD"] = "/usr/bin/rea custom"
        try:
            self.assertEqual(rea_bridge.resolve_rea_cmd(), ["/usr/bin/rea", "custom"])
        finally:
            if old is None:
                del os.environ["ANAIS_REA_CMD"]
            else:
                os.environ["ANAIS_REA_CMD"] = old

    def test_skip_flag_produces_unavailable_report(self):
        with tempfile.TemporaryDirectory() as d:
            rep = os.path.join(d, "rea.json")
            tgt = os.path.join(d, "targets.json")
            argv = ["rea_bridge.py", "app.apk", d, d, rep, tgt]
            old = sys.argv
            os.environ["ANAIS_REA_SKIP"] = "1"
            sys.argv = argv
            try:
                try:
                    rea_bridge.main()
                except SystemExit:
                    pass
            finally:
                sys.argv = old
                del os.environ["ANAIS_REA_SKIP"]
            self.assertFalse(json.loads(open(rep).read())["available"])
            self.assertTrue(os.path.exists(tgt))


if __name__ == "__main__":
    unittest.main()
