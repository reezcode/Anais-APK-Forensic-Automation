#!/usr/bin/env python3
"""Tests for the Reema backlog items: code-index strings and reachability (B1/B2),
ssdeep (B8), more hash providers (B6), family normalization (B7), sample upload
(B4), child samples (B9), and the K2-K5 fixes (B11).

Run: python3 -m unittest discover -s tests -v
"""

import io
import json
import os
import sqlite3
import sys
import tempfile
import unittest
import zipfile
from pathlib import Path
from unittest import mock

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))
sys.path.insert(0, str(ROOT / "analysis_tools"))

from reema import adapters, cli, enrich, index  # noqa: E402
from reema.case import Case  # noqa: E402
from reema.findings import Evidence, Finding  # noqa: E402
import yara_enhanced_analyzer as yara_ea  # noqa: E402
import network_analyzer as net  # noqa: E402


def make_index(path, rows):
    """rows: list of (descriptor, owner, reachable)."""
    db = sqlite3.connect(path)
    db.executescript(index.DDL)
    for name, owner, reachable in rows:
        db.execute("INSERT INTO classes(name, owner, reachable) VALUES (?, ?, ?)", (name, owner, reachable))
    db.commit()
    db.close()


class ReachabilityConsumptionTest(unittest.TestCase):
    def test_reachability_none_without_seeds(self):
        self.assertIsNone(index._reachability(object(), None))

    def test_class_key_from_jadx_and_smali(self):
        self.assertEqual(adapters._class_key("jadx_output/sources/com/evil/Dead.java"), "com/evil/Dead")
        self.assertEqual(adapters._class_key("decompiled/smali_classes2/com/x/A.smali"), "com/x/A")
        self.assertEqual(adapters._class_key("sources/com/x/A$1.java"), "com/x/A")
        self.assertIsNone(adapters._class_key(""))

    def test_unreachable_classes_query(self):
        with tempfile.TemporaryDirectory() as d:
            db = Path(d) / "code_index.db"
            make_index(db, [("Lcom/evil/Dead;", "app", 0), ("Lcom/evil/Live;", "app", 1),
                            ("Lcom/x/Unknown;", "app", None)])
            self.assertEqual(index.unreachable_classes(db), {"Lcom/evil/Dead;"})

    def test_collect_downgrades_findings_in_unreachable_code(self):
        with tempfile.TemporaryDirectory() as d:
            work = Path(d)
            (work / "temp").mkdir()
            make_index(work / "temp" / "code_index.db",
                       [("Lcom/evil/Dead;", "app", 0), ("Lcom/evil/Live;", "app", 1)])
            (work / "temp" / "sast_findings.json").write_text(json.dumps({"high": [
                {"category": "", "title": "dead", "file": "jadx_output/sources/com/evil/Dead.java", "line": 3},
                {"category": "", "title": "live", "file": "jadx_output/sources/com/evil/Live.java", "line": 4},
            ]}))
            findings, _ = adapters.collect(work)
            by_title = {f.title: f for f in findings}
            self.assertEqual(by_title["dead"].confidence, "low")
            self.assertIn("unreachable", by_title["dead"].tags)
            self.assertEqual(by_title["live"].confidence, "medium")
            self.assertNotIn("unreachable", by_title["live"].tags)

    def test_no_index_means_no_downgrade(self):
        with tempfile.TemporaryDirectory() as d:
            self.assertEqual(adapters._unreachable_keys(Path(d)), set())


class FakeMethod:
    def __init__(self, cls, name, desc="()V", calls=()):
        self.class_name, self.name, self.descriptor = cls, name, desc
        self._calls = list(calls)

    def is_external(self):
        return False

    def get_xref_to(self):
        return [(None, m, 0) for m in self._calls]


class FakeClass:
    def __init__(self, name, extends, methods):
        self.name, self.extends = name, extends
        for m in methods:
            m.class_name = name
        self._methods = methods

    def get_methods(self):
        return self._methods


class FakeDx:
    def __init__(self, classes):
        self._classes = classes

    def get_internal_classes(self):
        return self._classes


class ReachabilityWalkTest(unittest.TestCase):
    def test_walk_follows_calls_overrides_init_and_clinit(self):
        base_v = FakeMethod("LBase;", "virt")
        sub_v = FakeMethod("LSub;", "virt")          # override of Base.virt
        inst_init = FakeMethod("LInst;", "<init>")
        inst_cb = FakeMethod("LInst;", "callback")   # reached via instantiation, not a direct call
        inst_clinit = FakeMethod("LInst;", "<clinit>")
        helper = FakeMethod("LHelper;", "work", calls=[inst_init])
        on_create = FakeMethod("LComp;", "onCreate", calls=[helper, base_v])
        dead = FakeMethod("LDead;", "unused")

        classes = [
            FakeClass("LComp;", "LBase;", [on_create]),
            FakeClass("LBase;", None, [base_v]),
            FakeClass("LSub;", "LBase;", [sub_v]),
            FakeClass("LHelper;", None, [helper]),
            FakeClass("LInst;", None, [inst_init, inst_cb, inst_clinit]),
            FakeClass("LDead;", None, [dead]),
        ]
        reachable = index._reachability(FakeDx(classes), {"LComp;"})
        self.assertIn(("LComp;", "onCreate", "()V"), reachable)
        self.assertIn(("LHelper;", "work", "()V"), reachable)
        self.assertIn(("LInst;", "<init>", "()V"), reachable)
        self.assertIn(("LInst;", "callback", "()V"), reachable)   # instantiated class callback
        self.assertIn(("LInst;", "<clinit>", "()V"), reachable)   # static init of a reached class
        self.assertIn(("LSub;", "virt", "()V"), reachable)        # virtual override
        self.assertNotIn(("LDead;", "unused", "()V"), reachable)


class FamilyNormalizationTest(unittest.TestCase):
    def test_majority_vote_across_engines(self):
        doc = {"providers": {
            "malwarebazaar": {"status": "found", "data": {"family": "Anatsa", "tags": ["banker"]}},
            "virustotal": {"status": "found", "data": {"label": "Trojan.AndroidOS.Anatsa.a"}},
            "hybridanalysis": {"status": "found", "data": {"family": "Anatsa"}},
        }}
        fam = enrich.normalize_family(doc)
        self.assertEqual(fam["family"], "anatsa")
        self.assertEqual(fam["confidence"], "high")

    def test_generic_tokens_dropped(self):
        self.assertEqual(enrich._family_tokens("Android.Trojan.Generic"), [])
        self.assertEqual(enrich._family_tokens("Trojan-Banker.AndroidOS.Cerberus"), ["cerberus"])

    def test_no_labels_is_low_confidence_none(self):
        fam = enrich.normalize_family({"providers": {}})
        self.assertEqual((fam["family"], fam["confidence"]), (None, "low"))


class ProviderTest(unittest.TestCase):
    def test_koodous_parsing(self):
        with mock.patch.object(enrich, "_http", return_value=(200, {"is_detected": True, "rating": -5,
                                                                    "tags": {"anatsa": 1}})):
            status, data = enrich.Koodous().lookup("h", "k")
        self.assertEqual((status, data["detected"], data["tags"]), ("found", True, ["anatsa"]))
        with mock.patch.object(enrich, "_http", return_value=(404, {})):
            self.assertEqual(enrich.Koodous().lookup("h", "k")[0], "not_found")

    def test_hybridanalysis_parsing(self):
        body = [{"verdict": "malicious", "threat_score": 90, "vx_family": "Anatsa", "av_detect": 30}]
        with mock.patch.object(enrich, "_http", return_value=(200, body)):
            status, data = enrich.HybridAnalysis().lookup("h", "k")
        self.assertEqual((status, data["family"], data["threat_score"]), ("found", "Anatsa", 90))
        with mock.patch.object(enrich, "_http", return_value=(200, [])):
            self.assertEqual(enrich.HybridAnalysis().lookup("h", "k")[0], "not_found")

    def test_enrichment_adapter_new_providers_and_family_tag(self):
        data = {"providers": {
            "hybridanalysis": {"status": "found", "data": {"verdict": "malicious", "family": "Anatsa",
                                                           "threat_score": 90}},
            "koodous": {"status": "found", "data": {"detected": True, "rating": -5, "tags": ["anatsa"]}},
        }, "family": {"family": "anatsa"}}
        out = adapters.enrichment(data, "/case")
        rules = {f.rule for f in out}
        self.assertIn("hybridanalysis:verdict", rules)
        self.assertIn("koodous:detected", rules)
        self.assertTrue(all("family:anatsa" in f.tags for f in out))


class UploadProvider:
    name = "fake"
    key_env = "REEMA_FAKE_API_KEY"

    def __init__(self):
        self.uploaded = None

    def upload(self, path, key):
        self.uploaded = Path(path).name
        return "uploaded", {"analysis_id": "xyz"}


class UploadTest(unittest.TestCase):
    def test_upload_is_audited_and_flagged(self):
        with tempfile.TemporaryDirectory() as d:
            sample = Path(d) / "s.apk"
            sample.write_bytes(b"PK\x03\x04payload")
            case = Case.create(Path(d) / "c")
            p = UploadProvider()
            with mock.patch.dict(os.environ, {"REEMA_FAKE_API_KEY": "k"}):
                results = enrich.upload(sample, case=case, providers=[p])
            self.assertEqual(results["fake"]["status"], "uploaded")
            self.assertEqual(p.uploaded, "s.apk")
            audit = case.record["enrichment"][0]
            self.assertTrue(audit["sent"]["sample_uploaded"])

    def test_upload_skips_without_key(self):
        with tempfile.TemporaryDirectory() as d:
            sample = Path(d) / "s.apk"
            sample.write_bytes(b"x")
            with mock.patch.dict(os.environ, {}, clear=True):
                results = enrich.upload(sample, providers=[UploadProvider()])
            self.assertEqual(results["fake"]["status"], "skipped_no_key")


class ChildSampleTest(unittest.TestCase):
    def test_as_jar_passthrough_and_dex_wrap(self):
        with zipfile.ZipFile(io.BytesIO(), "w"):
            pass
        buf = io.BytesIO()
        with zipfile.ZipFile(buf, "w") as zf:
            zf.writestr("classes.dex", b"dex\n035\0")
        self.assertEqual(cli._as_jar(buf.getvalue()), buf.getvalue())  # already a zip
        wrapped = cli._as_jar(b"dex\n035\0rest")
        self.assertTrue(zipfile.is_zipfile(io.BytesIO(wrapped)))
        self.assertIsNone(cli._as_jar(b"not a dex or zip"))

    def test_hidden_dex_containers_parsing(self):
        with tempfile.TemporaryDirectory() as d:
            case_dir = Path(d)
            (case_dir / "temp").mkdir()
            (case_dir / "temp" / "dex_payload_report.json").write_text(json.dumps({"container_payloads": {
                "zip_assets": [{"location": "assets/p.zip", "contains_dex": True, "embedded_files": ["classes.dex"]},
                               {"location": "assets/img.png", "contains_dex": False}],
                "embedded_in_so": [],
            }}))
            self.assertEqual(cli._hidden_dex_containers(case_dir), [("assets/p.zip", ["classes.dex"])])

    def test_stage_children_extracts_and_links(self):
        with tempfile.TemporaryDirectory() as d:
            case_dir = Path(d) / "case"
            Case.create(case_dir)  # makes temp/ etc
            parent = Case.load(case_dir)
            # a fake APK holding one asset zip that contains a dex
            inner = io.BytesIO()
            with zipfile.ZipFile(inner, "w") as zf:
                zf.writestr("classes.dex", b"dex\n035\0")
            apk = Path(d) / "a.apk"
            with zipfile.ZipFile(apk, "w") as zf:
                zf.writestr("assets/p.zip", inner.getvalue())
            (case_dir / "temp" / "dex_payload_report.json").write_text(json.dumps({"container_payloads": {
                "zip_assets": [{"location": "assets/p.zip", "contains_dex": True}]}}))
            with mock.patch.object(cli, "_analyze_child", return_value=0) as m:
                cli._stage_children(apk, case_dir, parent, rules=None)
            m.assert_called_once()
            self.assertTrue((case_dir / "children").is_dir())


class YaraSeverityTest(unittest.TestCase):
    def test_threat_level_from_meta_overrides_name_guess(self):
        results = {"rules_checked": [], "summary": {}}
        sev = {}
        yara_ea.extract_rules_info(str(ROOT / "rules" / "yara_general_rules.yar"), results, sev)
        # Protection shell rule is INFO in its meta, though its name has no severity cue.
        self.assertEqual(sev["Android_Native_Protection_Shell"], "INFO")
        self.assertEqual(sev["Android_SMS_Trojan"], "CRITICAL")
        self.assertEqual(yara_ea.get_severity("Android_Native_Protection_Shell", sev), "INFO")
        # Without the map, it falls back to the name-based guess.
        self.assertEqual(yara_ea.get_severity("Android_Native_Protection_Shell"), "LOW")


class NetworkFixTest(unittest.TestCase):
    def setUp(self):
        self.a = net.NetworkAnalyzer(None, None)

    def test_tlds_loaded_from_config(self):
        self.assertIn(".top", self.a.suspicious_tlds)

    def test_api_upload_download_no_longer_suspicious(self):
        self.assertEqual(self.a.is_suspicious_url("https://good.com/api/v1/upload")[0], False)
        self.assertEqual(self.a.is_suspicious_url("https://cdn.com/download/file")[0], False)

    def test_c2_segment_and_tld_still_flagged(self):
        self.assertTrue(self.a.is_suspicious_url("https://evil.top/x")[0])
        self.assertTrue(self.a.is_suspicious_url("https://host.com/bot/cmd")[0])
        # whole-segment match: 'bot' must not fire inside 'robot'
        self.assertFalse(self.a.is_suspicious_url("https://host.com/robot/data")[0])


class GeneralMalwareRuleTest(unittest.TestCase):
    def test_bare_three_of_them_removed(self):
        text = (ROOT / "rules" / "yara_general_rules.yar").read_text()
        block = text.split("rule Android_General_Malware", 1)[1].split("rule ", 1)[0]
        self.assertNotIn("(3 of them)", block)


if __name__ == "__main__":
    unittest.main()
