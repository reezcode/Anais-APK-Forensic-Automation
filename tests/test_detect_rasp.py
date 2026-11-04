#!/usr/bin/env python3
"""Tests for analysis_tools/detect_rasp.py

Run: python3 -m unittest discover -s tests -v
"""

import json
import subprocess
import sys
import tempfile
import unittest
import zipfile
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT / "analysis_tools"))

from detect_rasp import RaspDetector  # noqa: E402

MANIFEST_TMPL = """<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android" package="com.example.app">
    <application android:name="{app}" android:label="App">
        <activity android:name="com.example.app.MainActivity"/>
    </application>
</manifest>
"""


class Fixture:
    """Builds a fake apktool/jadx workspace and optional APK zip."""

    def __init__(self, tmp):
        self.root = Path(tmp)
        self.dec = self.root / "decompiled"
        self.jadx = self.root / "jadx_output"
        self.apk = self.root / "app.apk"
        self.dec.mkdir()
        self.jadx.mkdir()
        self.manifest("com.example.app.App")

    def manifest(self, app_class):
        (self.dec / "AndroidManifest.xml").write_text(MANIFEST_TMPL.format(app=app_class))

    def lib(self, name, abi="arm64-v8a"):
        p = self.dec / "lib" / abi / name
        p.parent.mkdir(parents=True, exist_ok=True)
        p.write_bytes(b"\x7fELF")

    def smali(self, rel_path, body=".class public LFoo;\n"):
        p = self.dec / "smali" / rel_path
        p.parent.mkdir(parents=True, exist_ok=True)
        p.write_text(body)

    def asset(self, name):
        p = self.dec / "assets" / name
        p.parent.mkdir(parents=True, exist_ok=True)
        p.write_bytes(b"data")

    def zip_apk(self, entries):
        with zipfile.ZipFile(self.apk, "w") as zf:
            for e in entries:
                zf.writestr(e, b"x")

    def run(self, with_apk=False, decompiled=True):
        return RaspDetector(
            str(self.dec) if decompiled else None,
            str(self.jadx),
            str(self.apk) if with_apk else None,
        ).analyze()


class RaspDetectorTests(unittest.TestCase):
    def setUp(self):
        self._tmp = tempfile.TemporaryDirectory()
        self.fx = Fixture(self._tmp.name)

    def tearDown(self):
        self._tmp.cleanup()

    def test_clean_app_has_no_verdict(self):
        self.fx.lib("libflutter.so")
        self.fx.smali("com/example/app/MainActivity.smali")
        r = self.fx.run()
        self.assertEqual(r["type"], "None Detected")
        self.assertEqual(r["confidence"], 0)
        self.assertEqual(r["detected"], [])

    def test_generic_words_do_not_trigger(self):
        # Words that the old signatures matched on and that appear in ordinary apps
        noisy = "shell tamper RASP string encryption tencent alibaba shield risk control integrity_check"
        for i in range(30):
            self.fx.smali(f"com/example/app/C{i}.smali", f'const-string v0, "{noisy}"\n')
        r = self.fx.run()
        self.assertEqual(r["type"], "None Detected")
        self.assertEqual(r["indicators"], [])

    def test_jiagu_stub_and_lib(self):
        self.fx.manifest("com.stub.StubApp")
        self.fx.lib("libjiagu_a64.so")
        r = self.fx.run()
        self.assertEqual(r["type"], "Qihoo 360 Jiagu")
        self.assertGreaterEqual(r["confidence"], 90)
        self.assertTrue(any("360 Jiagu is a DEX shell" in x for x in r["recommendations"]))

    def test_talsec_package_in_smali(self):
        self.fx.smali("com/aheaditec/talsec_security/security/api/ThreatListener.smali")
        r = self.fx.run()
        self.assertEqual(r["type"], "Talsec / freeRASP")
        self.assertIn("package:com/aheaditec/talsec_security", r["evidence"]["Talsec / freeRASP"])

    def test_package_detected_in_jadx_when_smali_missing(self):
        p = self.fx.jadx / "sources" / "com" / "zimperium" / "Sdk.java"
        p.parent.mkdir(parents=True)
        p.write_text("class Sdk {}")
        r = self.fx.run()
        self.assertEqual(r["type"], "Zimperium zShield")

    def test_code_keywords_alone_are_capped_below_verdict(self):
        for i in range(50):
            self.fx.smali(f"o/C{i}.smali", 'const-string v0, "appdome fusionSet"\n')
        r = self.fx.run()
        self.assertEqual(r["type"], "None Detected")
        self.assertEqual(r["weak_signals"].get("Appdome"), 16)

    def test_same_lib_in_multiple_abis_counts_once(self):
        for abi in ("arm64-v8a", "armeabi-v7a", "x86", "x86_64"):
            self.fx.lib("libLIAPP.so", abi)
        r = self.fx.run()
        self.assertEqual(r["type"], "LiAPP")
        self.assertEqual(r["confidence"], 45)

    def test_weak_lib_alone_is_not_a_verdict(self):
        self.fx.lib("libpolarssl.so")
        r = self.fx.run()
        self.assertEqual(r["type"], "None Detected")
        self.assertIn("Talsec / freeRASP", r["weak_signals"])

    def test_apk_zip_fallback_when_apktool_failed(self):
        self.fx.zip_apk(["classes.dex", "lib/arm64-v8a/libDexHelper.so", "assets/secData0.jar"])
        r = self.fx.run(with_apk=True, decompiled=False)
        self.assertEqual(r["type"], "Bangcle / SecNeo")
        self.assertEqual(r["confidence"], 75)

    def test_multiple_layers_ranked(self):
        self.fx.manifest("com.secneo.apkwrapper.ApplicationWrapper")
        self.fx.lib("libsecexe.so")
        self.fx.smali("com/aheaditec/talsec/Foo.smali")
        r = self.fx.run()
        self.assertEqual(r["detected"][0], "Bangcle / SecNeo")
        self.assertIn("Talsec / freeRASP", r["detected"])
        self.assertTrue(any("Multiple protection layers" in x for x in r["recommendations"]))

    def test_randomized_lib_heuristic(self):
        for n in ("liba1e663.so", "libb34fb1.so", "libc58a81.so", "libd70ff5.so", "libe2ae4b.so", "libflutter.so"):
            self.fx.lib(n)
        r = self.fx.run()
        self.assertEqual(r["type"], "Unknown (heuristic)")
        names = [h["name"] for h in r["heuristics"]]
        self.assertIn("randomized_native_lib_names", names)

    def test_cli_writes_json(self):
        self.fx.lib("libappdome.so")
        out = self.fx.root / "rasp_report.json"
        subprocess.run(
            [sys.executable, str(ROOT / "analysis_tools" / "detect_rasp.py"),
             "missing.apk", str(self.fx.dec), str(self.fx.jadx), str(out)],
            check=True, capture_output=True,
        )
        data = json.loads(out.read_text())
        self.assertEqual(data["type"], "Appdome")


if __name__ == "__main__":
    unittest.main()
