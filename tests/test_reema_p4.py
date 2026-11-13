#!/usr/bin/env python3
"""Tests for Reema P4: corpus gate, family classifier, iOS IPA intake.

Run: python3 -m unittest discover -s tests -v
"""

import json
import plistlib
import sys
import tempfile
import unittest
import zipfile
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))
sys.path.insert(0, str(ROOT / "analysis_tools"))

from reema import classify, corpus, ios, adapters  # noqa: E402


class CorpusManifestTest(unittest.TestCase):
    def test_csv_with_header_and_json(self):
        with tempfile.TemporaryDirectory() as d:
            csv_path = Path(d) / "m.csv"
            csv_path.write_text("path,label\na.apk,benign\nb.apk,malware\n")
            self.assertEqual(corpus.load_manifest(csv_path),
                             [("a.apk", "benign"), ("b.apk", "malware")])
            json_path = Path(d) / "m.json"
            json_path.write_text('[{"path": "c.apk", "label": "pua"}]')
            self.assertEqual(corpus.load_manifest(json_path), [("c.apk", "pua")])

    def test_unknown_label_rejected(self):
        with tempfile.TemporaryDirectory() as d:
            p = Path(d) / "m.csv"
            p.write_text("a.apk,evil\n")
            with self.assertRaises(ValueError):
                corpus.load_manifest(p)


class CorpusMetricsTest(unittest.TestCase):
    def _metrics(self, rows):
        # rows: (label, verdict). Build result dicts as evaluate() would.
        results = [{"path": f"s{i}", "label": lbl, "verdict": v, "status": "ok",
                    "correct": v in corpus.EXPECTED[lbl]} for i, (lbl, v) in enumerate(rows)]
        return corpus._metrics(results)

    def test_confusion_and_rates(self):
        m = self._metrics([("malware", "malicious"), ("malware", "clean"),
                           ("benign", "clean"), ("benign", "suspicious")])
        self.assertEqual((m["tp"], m["fn"], m["tn"], m["fp"]), (1, 1, 1, 1))
        self.assertEqual(m["precision"], 0.5)
        self.assertEqual(m["recall"], 0.5)
        self.assertEqual(m["false_positive_rate"], 0.5)

    def test_gate_fails_on_fp(self):
        m = self._metrics([("benign", "malicious"), ("benign", "clean")])
        passed, reasons = corpus.gate(m, max_fp_rate=0.0)
        self.assertFalse(passed)
        self.assertTrue(reasons)

    def test_gate_passes_clean_benign(self):
        m = self._metrics([("benign", "clean"), ("malware", "malicious")])
        passed, reasons = corpus.gate(m, max_fp_rate=0.0, min_recall=1.0)
        self.assertTrue(passed, reasons)


class ClassifyTest(unittest.TestCase):
    def test_no_signal(self):
        r = classify.classify({}, enrichment_family=None, findings=[])
        self.assertEqual((r["family"], r["confidence"]), (None, "none"))

    def test_agreement_is_high(self):
        verdict = {"chains": [{"family": "Anatsa"}]}
        enr = {"family": "anatsa", "confidence": "high"}
        r = classify.classify(verdict, enrichment_family=enr, findings=[])
        self.assertEqual(r["family"], "Anatsa")
        self.assertEqual(r["confidence"], "high")

    def test_single_source_is_medium(self):
        r = classify.classify({"chains": [{"family": "Hydra"}]}, enrichment_family=None, findings=[])
        self.assertEqual((r["family"], r["confidence"]), ("Hydra", "medium"))

    def test_weak_enrichment_only_is_low(self):
        r = classify.classify({}, enrichment_family={"family": "Maybe", "confidence": "low"}, findings=[])
        self.assertEqual(r["confidence"], "low")

    def test_family_tag_from_findings(self):
        r = classify.classify({}, enrichment_family=None,
                              findings=[{"tags": ["family:Joker", "ioc"]}])
        self.assertEqual(r["family"], "Joker")


def make_ipa(path, info, extra=None):
    root = "Payload/Demo.app/"
    with zipfile.ZipFile(path, "w") as zf:
        zf.writestr(root + "Info.plist", plistlib.dumps(info))
        zf.writestr(root + "Demo", b"\xcf\xfa\xed\xfe")  # pretend Mach-O
        for name, data in (extra or {}).items():
            zf.writestr(root + name, data)
    return path


class IosTest(unittest.TestCase):
    def test_basic_info_reads_bundle(self):
        with tempfile.TemporaryDirectory() as d:
            ipa = make_ipa(Path(d) / "a.ipa", {
                "CFBundleIdentifier": "com.demo.app", "CFBundleName": "Demo",
                "CFBundleShortVersionString": "2.1", "CFBundleVersion": "21",
                "MinimumOSVersion": "15.0",
                "CFBundleURLTypes": [{"CFBundleURLSchemes": ["demoscheme"]}],
            })
            info = ios.basic_info(ipa)
        self.assertEqual(info["format"], "ipa")
        self.assertEqual(info["bundle_id"], "com.demo.app")
        self.assertEqual(info["version_name"], "2.1")
        self.assertIn("demoscheme", info["url_schemes"])

    def test_ats_posture_findings(self):
        with tempfile.TemporaryDirectory() as d:
            ipa = make_ipa(Path(d) / "a.ipa", {
                "CFBundleIdentifier": "com.demo.app",
                "NSAppTransportSecurity": {
                    "NSAllowsArbitraryLoads": True,
                    "NSExceptionDomains": {"insecure.test": {"NSExceptionAllowsInsecureHTTPLoads": True}},
                },
            })
            case = Path(d) / "case"
            findings = ios.analyze(ipa, case)
            rules = {f["rule"] for f in findings}
            self.assertIn("ats_arbitrary_loads", rules)
            self.assertIn("ats_insecure_exception", rules)
            self.assertTrue((case / "temp" / "ios_findings.json").is_file())

    def test_ios_adapter_maps_to_posture(self):
        data = {"findings": [{"severity": "high", "category": "ats", "rule": "ats_arbitrary_loads",
                              "title": "ATS disabled", "detail": "x"}]}
        out = adapters.ios(data, "/case")
        self.assertEqual((out[0].axis, out[0].source), ("posture", "ios"))

    def test_malformed_ipa_has_no_bundle(self):
        with tempfile.TemporaryDirectory() as d:
            p = Path(d) / "bad.ipa"
            with zipfile.ZipFile(p, "w") as zf:
                zf.writestr("not_payload/x", b"x")
            info = ios.basic_info(p)
        self.assertFalse(info["bundle_found"])


if __name__ == "__main__":
    unittest.main()
