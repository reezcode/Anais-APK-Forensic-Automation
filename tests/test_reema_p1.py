#!/usr/bin/env python3
"""Tests for Reema P1: code owner (K1), SAST comment masking, case record,
enrichment and its cache, JAR intake, and the code index.

Run: python3 -m unittest discover -s tests -v
"""

import io
import json
import os
import sys
import tempfile
import unittest
import zipfile
from pathlib import Path
from unittest import mock

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))
sys.path.insert(0, str(ROOT / "analysis_tools"))

from reema import adapters, enrich, index, jar  # noqa: E402
from reema.case import Case, hash_tree  # noqa: E402
from reema.findings import Evidence, Finding, build_document  # noqa: E402
from sast_scanner import app_first, mask_java_comments  # noqa: E402
from sdk_inventory import owner_of  # noqa: E402


def write_zip(path, entries):
    with zipfile.ZipFile(path, "w") as zf:
        for name, data in entries.items():
            zf.writestr(name, data)
    return path


class OwnerTest(unittest.TestCase):
    def test_paths_and_descriptors(self):
        self.assertEqual(owner_of("sources/kotlin/KotlinNullPointerException.java"), "sdk:Kotlin stdlib")
        self.assertEqual(owner_of("smali_classes2/com/google/android/gms/ads/A.smali"), "sdk:Google AdMob")
        self.assertEqual(owner_of("Lcom/example/app/MainActivity;"), "app")
        self.assertEqual(owner_of("sources/kotlinx/coroutines/Job.java"), "sdk:Kotlin extensions (kotlinx)")
        self.assertEqual(owner_of("AndroidManifest.xml"), "")

    def test_prefix_must_end_at_a_path_boundary(self):
        # "kotlin" must not claim "kotlinfoo/"
        self.assertEqual(owner_of("sources/kotlinfoo/A.java"), "app")

    def test_sdk_finding_drops_to_low_confidence(self):
        f = adapters.tag_owner(Finding(source="sast", rule="r", title="t", severity="high", axis="posture",
                                       evidence=[Evidence(file="sources/androidx/a/B.java")]))
        self.assertEqual((f.owner, f.confidence), ("sdk:AndroidX", "low"))
        doc = build_document([f])
        self.assertEqual(doc["summary"]["by_owner"]["sdk"], 1)


class SastMaskTest(unittest.TestCase):
    def test_jadx_header_comment_no_longer_matches(self):
        src = '/* loaded from: classes.dex */\nclass A { String s = "/* keep */ x.dex"; // .dex tail\n}'
        masked = mask_java_comments(src)
        self.assertEqual(len(masked), len(src))
        self.assertEqual(masked.count("\n"), src.count("\n"))
        self.assertNotIn("loaded from", masked)
        self.assertNotIn("tail", masked)
        self.assertIn('"/* keep */ x.dex"', masked)

    def test_app_files_sort_before_sdk_files(self):
        with tempfile.TemporaryDirectory() as d:
            root = Path(d)
            files = [root / "sources/androidx/A.java", root / "sources/com/evil/B.java"]
            self.assertEqual(app_first(files, root)[0].name, "B.java")


class InsecureCryptoPatternTest(unittest.TestCase):
    """insecure_crypto must need crypto-API evidence, not a bare substring."""

    def setUp(self):
        import re

        from sast_scanner import SASTScanner, mask_java_comments

        pats = SASTScanner("x.apk", None, None).high_patterns["insecure_crypto"]
        self.hits = lambda code: [
            m.group(0) for p in pats for m in re.finditer(p, mask_java_comments(code), re.IGNORECASE)
        ]

    def test_identifiers_and_secure_api_do_not_match(self):
        for clean in (
            'C.i(x, "IBitmapDescriptorFactory is not initialized");',
            "obj.deserialize(description);",
            "SecureRandom r = new SecureRandom();",
            "/* DES/ECB/PKCS5Padding */ run();",
        ):
            self.assertEqual(self.hits(clean), [], clean)

    def test_weak_crypto_calls_match(self):
        for weak in (
            'Cipher.getInstance("DES/ECB/PKCS5Padding");',
            'Cipher.getInstance("AES/ECB/PKCS7Padding");',
            'MessageDigest.getInstance("md5");',
            'MessageDigest.getInstance("SHA-1");',
            "Random r = new Random();",
            'Cipher.getInstance("AES");',
            'SecretKeyFactory.getInstance("DESede");',
        ):
            self.assertTrue(self.hits(weak), weak)


class GatedSastTest(unittest.TestCase):
    """Noisy SAST rules (logging, intent, storage, permissions, native) must
    need real evidence, not a bare keyword, import line, or string body."""

    def setUp(self):
        import re

        from sast_scanner import (SASTScanner, STRUCTURAL_CATEGORIES,
                                   blank_string_bodies, mask_java_comments)
        self.sc = SASTScanner("x.apk", None, None)
        self.cats = {**self.sc.high_patterns, **self.sc.medium_patterns, **self.sc.critical_patterns}

        def hits(code, category):
            masked = mask_java_comments(code)
            text = blank_string_bodies(masked) if category in STRUCTURAL_CATEGORIES else masked
            out = []
            for p in self.cats[category]:
                for m in re.finditer(p, text, re.IGNORECASE):
                    line = self.sc._line_at(text, m.start())
                    if category in STRUCTURAL_CATEGORIES and re.match(r"^\s*(import|package)\s", line):
                        continue
                    if not self.sc._match_passes_gate(category, self.sc._line_at(code, m.start()), code):
                        continue
                    out.append(m.group(0))
            return out
        self.hits = hits

    def test_benign_dropped(self):
        drop = [
            ("logging_sensitive_data", 'Log.i("FirebaseMessaging", "App not initialized");'),
            ("intent_vulnerabilities", "import android.app.PendingIntent;"),
            ("intent_vulnerabilities", "context.startActivity(createChooser);"),
            ("intent_vulnerabilities", "PendingIntent.getService(ctx, 0, i, FLAG_IMMUTABLE);"),
            ("insecure_storage", 'context.getSharedPreferences("FirebaseHeartBeat", 0);'),
            ("dynamic_permission_requests", "ActivityCompat.requestPermissions(a, p, 1);"),
            ("insecure_network", "builder.sslSocketFactory(f, tm);"),
            ("remote_code_execution", 'String n = "classes.dex";'),
            ("remote_code_execution", "loader.loadClass(name);"),
        ]
        for cat, code in drop:
            self.assertEqual(self.hits(code, cat), [], f"{cat}: {code}")

    def test_real_issues_kept(self):
        keep = [
            ("logging_sensitive_data", "Log.d(TAG, \"password=\" + pwd);"),
            ("intent_vulnerabilities", "PendingIntent.getActivity(ctx, 0, i, FLAG_MUTABLE);"),
            ("insecure_storage", "openFileOutput(f, MODE_WORLD_READABLE);"),
            ("dynamic_permission_requests", "ctx.startActivity(new Intent(SYSTEM_ALERT_WINDOW));"),
            ("insecure_network", "conn.setHostnameVerifier(ALLOW_ALL_HOSTNAME_VERIFIER);"),
            ("webview_vulnerabilities", "ws.setJavaScriptEnabled(true);"),
            ("remote_code_execution", "new DexClassLoader(p, o, null, cl);"),
        ]
        for cat, code in keep:
            self.assertTrue(self.hits(code, cat), f"{cat}: {code}")


class CaseTest(unittest.TestCase):
    def test_record_inputs_artifacts_and_tree_digest(self):
        with tempfile.TemporaryDirectory() as d:
            case_dir = Path(d) / "case"
            sample = Path(d) / "s.apk"
            sample.write_bytes(b"abc")
            case = Case.create(case_dir, analyst="tester")
            case.add_input(sample, "original")
            (case_dir / "jadx_output" / "a.java").write_text("x")
            first = case.add_artifact(case_dir / "jadx_output", "jadx")
            case.add_artifact(case_dir / "jadx_output", "jadx")  # re-record replaces
            case.complete()
            rec = json.loads((case_dir / "case.json").read_text())

            self.assertEqual(rec["schema"], "reema.case/v1")
            self.assertEqual(rec["analyst"], "tester")
            self.assertEqual(rec["inputs"][0]["sha256"],
                             "ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad")
            self.assertEqual(len(rec["artifacts"]), 1)
            self.assertEqual((first["kind"], first["files"], first["path"]), ("tree", 1, "jadx_output"))
            self.assertIsNotNone(rec["completed_at"])

            (case_dir / "jadx_output" / "a.java").write_text("changed")
            self.assertNotEqual(hash_tree(case_dir / "jadx_output")["sha256"], first["sha256"])


class FakeProvider:
    name = "fake"
    key_env = "REEMA_FAKE_API_KEY"

    def __init__(self, status="found", data=None):
        self.calls = 0
        self.status, self.data = status, data or {"family": "Demo"}

    def lookup(self, sha256, key):
        self.calls += 1
        return self.status, self.data


class EnrichTest(unittest.TestCase):
    def setUp(self):
        self.tmp = tempfile.TemporaryDirectory()
        self.cache = enrich.Cache(Path(self.tmp.name) / "c.db")

    def tearDown(self):
        self.tmp.cleanup()

    def test_no_key_skips_without_calling(self):
        p = FakeProvider()
        with mock.patch.dict(os.environ, {}, clear=True):
            doc = enrich.run("h", cache=self.cache, providers=[p])
        self.assertEqual(doc["providers"]["fake"]["status"], "skipped_no_key")
        self.assertEqual(p.calls, 0)

    def test_second_run_uses_cache_and_offline_sends_nothing(self):
        p = FakeProvider()
        with mock.patch.dict(os.environ, {"REEMA_FAKE_API_KEY": "k"}):
            enrich.run("h", cache=self.cache, providers=[p])
            again = enrich.run("h", cache=self.cache, providers=[p])
            offline_miss = enrich.run("other", offline=True, cache=self.cache, providers=[p])
        self.assertEqual(p.calls, 1)
        self.assertTrue(again["providers"]["fake"]["cached"])
        self.assertEqual(offline_miss["providers"]["fake"]["status"], "skipped_offline")

    def test_errors_are_not_cached(self):
        p = FakeProvider(status="error", data={"http_status": 500})
        with mock.patch.dict(os.environ, {"REEMA_FAKE_API_KEY": "k"}):
            enrich.run("h", cache=self.cache, providers=[p])
            enrich.run("h", cache=self.cache, providers=[p])
        self.assertEqual(p.calls, 2)

    def test_cache_expires(self):
        self.cache.put("fake", "h", "not_found", {})
        self.assertIsNotNone(self.cache.get("fake", "h"))
        self.assertIsNone(self.cache.get("fake", "h", now=enrich.time.time() + enrich.TTL_NOT_FOUND + 1))

    def test_case_audit_records_what_was_sent(self):
        with tempfile.TemporaryDirectory() as d:
            case = Case.create(Path(d) / "c")
            with mock.patch.dict(os.environ, {"REEMA_FAKE_API_KEY": "k"}):
                enrich.run("abc", cache=self.cache, providers=[FakeProvider()], case=case)
            self.assertEqual(case.record["enrichment"][0]["sent"], {"sha256": "abc"})

    def test_malwarebazaar_response_parsing(self):
        body = {"query_status": "ok", "data": [{"signature": "Anatsa", "tags": ["banker"],
                                                 "first_seen": "2026-01-01", "file_type": "apk"}]}
        with mock.patch.object(enrich, "_http", return_value=(200, body)):
            status, data = enrich.MalwareBazaar().lookup("h", "k")
        self.assertEqual((status, data["family"]), ("found", "Anatsa"))
        with mock.patch.object(enrich, "_http", return_value=(200, {"query_status": "hash_not_found"})):
            self.assertEqual(enrich.MalwareBazaar().lookup("h", "k")[0], "not_found")

    def test_virustotal_response_parsing(self):
        body = {"data": {"attributes": {"last_analysis_stats": {"malicious": 12, "undetected": 50},
                                        "popular_threat_classification": {"suggested_threat_label": "trojan.x"}}}}
        with mock.patch.object(enrich, "_http", return_value=(200, body)):
            status, data = enrich.VirusTotal().lookup("h", "k")
        self.assertEqual((status, data["malicious"], data["label"]), ("found", 12, "trojan.x"))
        with mock.patch.object(enrich, "_http", return_value=(404, {})):
            self.assertEqual(enrich.VirusTotal().lookup("h", "k")[0], "not_found")

    def test_enrichment_adapter(self):
        data = {"providers": {
            "malwarebazaar": {"status": "found", "data": {"family": "Anatsa", "tags": ["banker"]}},
            "virustotal": {"status": "found", "data": {"malicious": 2, "label": None}},
        }}
        mb, vt = adapters.enrichment(data, "/case")
        self.assertEqual((mb.severity, mb.confidence, mb.tags), ("critical", "high", ["family:Anatsa"]))
        self.assertEqual((vt.severity, vt.confidence), ("medium", "low"))
        self.assertEqual(adapters.enrichment({"providers": {"virustotal": {"status": "not_found"}}}, "/c"), [])


class JarTest(unittest.TestCase):
    def test_basic_info_reads_manifest(self):
        with tempfile.TemporaryDirectory() as d:
            j = write_zip(Path(d) / "t.jar", {
                "META-INF/MANIFEST.MF": "Manifest-Version: 1.0\nMain-Class: com.x.Main\nCreated-By: test\n",
                "com/x/Main.class": b"\xca\xfe\xba\xbe",
            })
            info = jar.basic_info(j)
        self.assertEqual(info["manifest"]["Main-Class"], "com.x.Main")
        self.assertEqual((info["class_files"], info["dex_files"]), (1, []))

    def test_index_skips_jar_without_dex(self):
        with tempfile.TemporaryDirectory() as d:
            j = write_zip(Path(d) / "t.jar", {"com/x/Main.class": b"\xca\xfe\xba\xbe"})
            summary = index.build(j, Path(d) / "i.db")
            self.assertFalse(summary["dex_present"])
            self.assertEqual(index.api_usage(Path(d) / "i.db", "Ljava/"), [])


if __name__ == "__main__":
    unittest.main()
