#!/usr/bin/env python3
"""Peny P1: the static MASVS lens (mapping, coverage matrix, scan orchestration).

The scan test patches the extraction so it runs without apktool/jadx: it writes
the synthetic analyzer JSON the shared core would have written, then exercises the
real adapters -> MASVS mapping -> document/report path.

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

from reema.findings import Evidence, Finding  # noqa: E402  (the shared contract type)
from peny.findings import build_document  # noqa: E402
from peny.masvs import build_matrix  # noqa: E402
from peny.rules import STATIC_COVERAGE, to_peny  # noqa: E402


def rf(source, category, severity, axis="posture", rule=None):
    return Finding(source=source, rule=rule or category, title=f"{category} issue",
                   severity=severity, axis=axis, category=category,
                   evidence=[Evidence(file="smali/a.smali", line=3)])


class MappingTests(unittest.TestCase):
    def test_insecure_crypto_maps_to_masvs_crypto(self):
        pf = to_peny(rf("sast", "insecure_crypto", "high"))
        self.assertIsNotNone(pf)
        self.assertEqual(pf.masvs, "MASVS-CRYPTO")
        self.assertEqual(pf.severity, "high")
        self.assertIn("CWE-327", pf.cwe)
        self.assertTrue(pf.needs_runtime_confirmation)
        self.assertEqual(pf.source, "crypto")
        self.assertTrue(pf.fix)

    def test_cleartext_maps_to_network_high(self):
        pf = to_peny(rf("manifest", "cleartext_traffic", "medium"))
        self.assertEqual(pf.masvs, "MASVS-NETWORK")
        self.assertEqual(pf.severity, "high")  # rule overrides the analyzer severity

    def test_hardcoded_secret_is_storage(self):
        pf = to_peny(rf("sast", "hardcoded_secrets", "high"))
        self.assertEqual(pf.masvs, "MASVS-STORAGE")
        self.assertEqual(pf.source, "secrets")

    def test_malice_finding_is_skipped(self):
        # A malware behaviour is not the assessed app's own vulnerability.
        self.assertIsNone(to_peny(rf("sast", "data_exfiltration", "critical", axis="malice")))

    def test_c2_ioc_is_skipped(self):
        self.assertIsNone(to_peny(rf("network", "c2", "high", axis="malice", rule="c2_pattern")))

    def test_exported_component_needs_runtime(self):
        pf = to_peny(rf("manifest", "exported_component", "medium"))
        self.assertEqual(pf.masvs, "MASVS-PLATFORM")
        self.assertTrue(pf.needs_runtime_confirmation)

    def test_evidence_passed_through(self):
        pf = to_peny(rf("sast", "insecure_storage", "medium"))
        self.assertEqual(pf.evidence[0].line, 3)


class MatrixTests(unittest.TestCase):
    def test_coverage_pass_vs_not_checked(self):
        # backup_allowed is a static-only finding (no runtime flag) -> fail.
        findings = [to_peny(rf("manifest", "backup_allowed", "medium"))]
        m = build_matrix(findings, STATIC_COVERAGE)
        self.assertEqual(m["MASVS-STORAGE"]["status"], "fail")
        self.assertEqual(m["MASVS-CRYPTO"]["status"], "pass")         # covered, clean
        self.assertEqual(m["MASVS-AUTH"]["status"], "not_checked")    # dynamic-only group

    def test_runtime_flagged_group_is_needs_runtime(self):
        findings = [to_peny(rf("sast", "insecure_crypto", "high"))]  # needs_runtime rule
        m = build_matrix(findings, STATIC_COVERAGE)
        self.assertEqual(m["MASVS-CRYPTO"]["status"], "needs_runtime")

    def test_all_groups_present_and_ordered(self):
        m = build_matrix([], STATIC_COVERAGE)
        from peny.findings import MASVS_GROUPS
        self.assertEqual(list(m.keys()), list(MASVS_GROUPS))


class ScanTests(unittest.TestCase):
    def _fake_extraction(self, temp_files):
        def _fake(target, case_dir, sha256, rules=None, offline=False):
            temp = Path(case_dir) / "temp"
            temp.mkdir(parents=True, exist_ok=True)
            for name, data in temp_files.items():
                (temp / name).write_text(json.dumps(data))
            return []
        return _fake

    def test_scan_end_to_end_offline(self):
        from peny import scan as scan_mod

        temp_files = {
            "basic_info.json": {"package_name": "com.example", "version_name": "1.0"},
            "sast_findings.json": {
                "high": [{"category": "insecure_crypto", "title": "AES/ECB",
                          "file": "a.smali", "line": 5, "code": "AES/ECB"}],
                "critical": [{"category": "data_exfiltration", "title": "exfil",
                              "file": "b.smali", "line": 1}],
            },
            "manifest_findings.json": {
                "findings": [{"category": "cleartext_traffic", "title": "cleartext",
                              "severity": "high", "description": "HTTP allowed"}],
            },
        }
        with tempfile.TemporaryDirectory() as tmp:
            apk = Path(tmp) / "target.apk"
            apk.write_bytes(b"PK\x03\x04dummy")
            cdir = Path(tmp) / "case"
            with mock.patch("peny._shared.run_static_extraction",
                            new=self._fake_extraction(temp_files)):
                doc, out_dir = scan_mod.scan(str(apk), case_dir=str(cdir),
                                             authorized_by="op", scope="test", offline=True)

            self.assertEqual(doc["schema"], "peny.findings/v1")
            self.assertEqual(doc["authorization"]["authorized_by"], "op")
            self.assertEqual(doc["sample"]["package_name"], "com.example")
            # insecure_crypto + cleartext mapped; data_exfiltration (malice) skipped.
            masvs = {f["masvs"] for f in doc["findings"]}
            self.assertIn("MASVS-CRYPTO", masvs)
            self.assertIn("MASVS-NETWORK", masvs)
            self.assertNotIn("data_exfiltration", {f["rule"] for f in doc["findings"]})
            self.assertEqual(doc["masvs"]["MASVS-NETWORK"]["status"], "fail")  # cleartext, static
            self.assertEqual(doc["masvs"]["MASVS-CRYPTO"]["status"], "needs_runtime")  # crypto, runtime

            # Peny wrote its own files, and no Reema findings.json.
            reports = Path(out_dir) / "reports"
            self.assertTrue((reports / "peny_findings.json").is_file())
            self.assertTrue((reports / "masvs.md").is_file())
            self.assertTrue((reports / "report.md").is_file())
            self.assertFalse((reports / "findings.json").is_file())
            self.assertIn("Fix:", (reports / "report.md").read_text())


if __name__ == "__main__":
    unittest.main()
