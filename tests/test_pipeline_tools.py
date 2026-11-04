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
import rea_deep  # noqa: E402
import frida_script_generator  # noqa: E402
import dynamic_bridge  # noqa: E402
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


class ReaDeepMergeTests(unittest.TestCase):
    def _targets(self):
        return {"schema": 2, "apk": "app.apk", "tasks": [
            {"id": "rasp-x"}, {"id": "flutter-dart-flow"}, {"id": "native-jni-liba.so"}]}

    def test_pending_completed_skipped_partition(self):
        raw = {"completed": [{"task_id": "rasp-x", "findings": {"a": 1}}],
               "skipped": [{"task_id": "flutter-dart-flow", "reason": "no device"}]}
        deep, warn = rea_deep.merge(self._targets(), raw)
        self.assertEqual(deep["pending"], ["native-jni-liba.so"])
        self.assertEqual(len(deep["completed"]), 1)
        self.assertEqual(deep["skipped"][0]["reason"], "no device")
        self.assertEqual(warn, [])

    def test_unknown_task_id_flagged(self):
        raw = {"completed": [{"task_id": "bogus", "findings": {}}]}
        deep, warn = rea_deep.merge(self._targets(), raw)
        self.assertTrue(any("bogus" in w for w in warn))
        self.assertIn("completed task_id not in targets: 'bogus'", deep["notes"])

    def test_native_hooks_normalized_and_filtered(self):
        raw = {"completed": [{"task_id": "rasp-x", "native_hooks": [
            {"symbol": "JNI_OnLoad", "address": "0x10"},
            {"note": "no address or symbol"}]}]}
        deep, _ = rea_deep.merge(self._targets(), raw)
        hooks = deep["completed"][0]["native_hooks"]
        self.assertEqual(len(hooks), 1)
        self.assertEqual(hooks[0]["address"], "0x10")


class ReaDeepReportTests(unittest.TestCase):
    def setUp(self):
        self._tmp = tempfile.TemporaryDirectory()
        self.ws = Path(self._tmp.name) / "ws"
        self.temp = self.ws / "temp"
        self.temp.mkdir(parents=True)
        (self.ws / "reports").mkdir()

    def tearDown(self):
        self._tmp.cleanup()

    def test_deep_pass_renders_hooks(self):
        (self.temp / "rea_report.json").write_text(json.dumps(
            {"available": True, "command": "rea", "runs": [], "notes": []}))
        (self.temp / "rea_deep.json").write_text(json.dumps({
            "available": True, "completed": [
                {"task_id": "rasp-x", "rea_tool": "open_binary", "findings": {"abort": "0x1a"},
                 "native_hooks": [{"symbol": "JNI_OnLoad", "address": "0x10", "note": "init"}],
                 "evidence_id": "ev123"}],
            "skipped": [], "pending": ["flutter-dart-flow"], "notes": []}))
        gen = ModularReportGenerator(str(self.ws), str(self.temp), "app.apk", "sha")
        md = []
        gen._add_rea_info(md)
        text = "\n".join(md)
        self.assertIn("Deep Pass (agent-driven)", text)
        self.assertIn("Native hook points", text)
        self.assertIn("0x10", text)
        self.assertIn("Pending", text)


class FridaNativeHookTests(unittest.TestCase):
    def test_address_and_export_hooks_grouped_by_lib(self):
        deep = {"completed": [
            {"task_id": "rasp-x", "target": "lib/arm64-v8a/libjiagu_a64.so",
             "native_hooks": [{"symbol": "sub_1a2b0", "address": "0x1a2b0", "note": "abort"},
                              {"symbol": "JNI_OnLoad", "address": None}]},
            {"task_id": "noise", "target": "lib/arm64-v8a/libfoo.so",
             "native_hooks": [{"note": "no addr or symbol"}]}]}
        js, count = frida_script_generator.build_native_hooks(deep)
        self.assertEqual(count, 2)  # the empty hook is dropped
        self.assertIn("Module.findBaseAddress('libjiagu_a64.so')", js)
        self.assertIn("base.add(ptr('0x1a2b0'))", js)
        self.assertIn("Module.getExportByName('libjiagu_a64.so', 'JNI_OnLoad')", js)
        self.assertNotIn("libfoo.so", js)

    def test_no_hooks_returns_none(self):
        js, count = frida_script_generator.build_native_hooks({"completed": []})
        self.assertIsNone(js)
        self.assertEqual(count, 0)

    def test_generator_includes_deep_hooks(self):
        with tempfile.TemporaryDirectory() as d:
            Path(d, "rea_deep.json").write_text(json.dumps({"completed": [
                {"task_id": "rasp-x", "target": "lib/arm64-v8a/libjiagu_a64.so",
                 "native_hooks": [{"symbol": "sub_1a2b0", "address": "0x1a2b0", "note": "abort"}]}]}))
            out = Path(d, "frida_auto.js")
            subprocess.run([sys.executable, str(TOOLS / "frida_script_generator.py"),
                            d, str(out), "com.x"], check=True, capture_output=True)
            text = out.read_text()
            self.assertIn("REA-recovered native hook points", text)
            self.assertIn("base.add(ptr('0x1a2b0'))", text)


class DynamicBridgeTests(unittest.TestCase):
    def test_parse_frida_output_categorizes(self):
        text = "\n".join([
            "[Anais] Instrumentation starting for com.x",
            "[Anais] okhttp3 CertificatePinner.check bypassed",
            "[Anais][crypto] AES doFinal len=16",
            "[Anais][key] AES = QUJD",
            "[Anais][native] enter libjiagu_a64.so!sub_1a2b0 (abort)",
            "[Anais] blocked root-probe exec: which su",
            "[Anais] hook failed: something",
        ])
        r = dynamic_bridge.parse_frida_output(text)
        self.assertEqual(len(r["hooks"]["ssl_bypass"]), 1)
        self.assertEqual(len(r["hooks"]["crypto"]), 1)
        self.assertEqual(len(r["hooks"]["keys"]), 1)
        self.assertEqual(len(r["hooks"]["native"]), 1)
        self.assertEqual(len(r["hooks"]["root_blocked"]), 1)
        self.assertEqual(r["hits_total"], 5)
        self.assertEqual(len(r["errors"]), 1)

    def test_parse_logcat_finds_crash(self):
        text = "\n".join([
            "01-01 E AndroidRuntime: FATAL EXCEPTION: main",
            "\tat com.x.MainActivity.onCreate(MainActivity.java:1)",
            "01-01 I com.x: normal line",
        ])
        r = dynamic_bridge.parse_logcat(text, "com.x")
        self.assertEqual(len(r["crashes"]), 1)
        self.assertTrue(r["exceptions"])
        self.assertEqual(r["lines"], 3)

    def test_build_commands_spawn_plan(self):
        cfg = {"package": "com.x", "apk_path": None, "serial": None, "mode": "spawn",
               "timeout": 30, "frida_script": "/r/frida_auto.js", "install": False}
        plan = dynamic_bridge.build_commands(cfg)
        labels = [l for l, _ in plan]
        self.assertIn("clear logcat", labels)
        frida = next(argv for l, argv in plan if l.startswith("frida"))
        self.assertIn("-f", frida)
        self.assertIn("com.x", frida)

    def test_build_commands_attach_and_serial_install(self):
        cfg = {"package": "com.x", "apk_path": "/a.apk", "serial": "emu-5554",
               "mode": "attach", "timeout": 10, "frida_script": "/r/s.js", "install": True}
        plan = dynamic_bridge.build_commands(cfg)
        self.assertEqual(plan[0][0], "install apk")
        self.assertIn("-s", plan[0][1])  # adb serial
        frida = next(argv for l, argv in plan if l.startswith("frida"))
        self.assertIn("-D", frida)      # frida device by serial
        self.assertIn("-n", frida)      # attach by name


class DynamicReportTests(unittest.TestCase):
    def setUp(self):
        self._tmp = tempfile.TemporaryDirectory()
        self.ws = Path(self._tmp.name) / "ws"
        self.temp = self.ws / "temp"
        self.temp.mkdir(parents=True)
        (self.ws / "reports").mkdir()

    def tearDown(self):
        self._tmp.cleanup()

    def test_dynamic_section_renders(self):
        (self.temp / "dynamic_findings.json").write_text(json.dumps({
            "available": True, "executed": True, "device": "USB", "mode": "spawn",
            "duration_sec": 30, "frida_script": "reports/frida_auto.js", "hits_total": 2,
            "hooks": {"ssl_bypass": ["[Anais] CertificatePinner.check bypassed"],
                      "native": ["[Anais][native] enter libx.so!sub_1"]},
            "logcat": {"crashes": ["FATAL EXCEPTION: main"], "exceptions": [], "lines": 10},
            "errors": [], "notes": []}))
        gen = ModularReportGenerator(str(self.ws), str(self.temp), "app.apk", "sha")
        md = []
        gen._add_dynamic_info(md)
        text = "\n".join(md)
        self.assertIn("SSL pinning bypassed", text)
        self.assertIn("Native hooks hit", text)
        self.assertIn("FATAL EXCEPTION", text)


if __name__ == "__main__":
    unittest.main()
