#!/usr/bin/env python3
"""Tests for the reema package (Finding schema, legacy adapters, CLI) and the
container scan merged into dex_payload_hunter.

Run: python3 -m unittest discover -s tests -v
"""

import io
import json
import sys
import tempfile
import unittest
import zipfile
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))
sys.path.insert(0, str(ROOT / "analysis_tools"))

from reema import adapters, cli  # noqa: E402
from reema.findings import Evidence, Finding, build_document, normalize_severity  # noqa: E402
import dex_payload_hunter  # noqa: E402


def zip_bytes(entries):
    buf = io.BytesIO()
    with zipfile.ZipFile(buf, "w") as zf:
        for name, data in entries.items():
            zf.writestr(name, data)
    return buf.getvalue()


class FindingSchemaTest(unittest.TestCase):
    def test_severity_aliases_normalize(self):
        self.assertEqual(normalize_severity("CRITICAL"), "critical")
        self.assertEqual(normalize_severity("warning"), "medium")
        self.assertEqual(normalize_severity("bogus"), "info")

    def test_rejects_unknown_axis(self):
        with self.assertRaises(ValueError):
            Finding(source="x", rule="r", title="t", severity="low", axis="evil")

    def test_id_is_stable_and_location_sensitive(self):
        a = Finding(source="sast", rule="r", title="t", severity="high", axis="posture",
                    evidence=[Evidence(file="A.java", line=3)])
        b = Finding(source="sast", rule="r", title="t", severity="high", axis="posture",
                    evidence=[Evidence(file="A.java", line=3)])
        c = Finding(source="sast", rule="r", title="t", severity="high", axis="posture",
                    evidence=[Evidence(file="A.java", line=4)])
        self.assertEqual(a.id, b.id)
        self.assertNotEqual(a.id, c.id)

    def test_document_sorts_and_counts(self):
        doc = build_document([
            Finding(source="a", rule="r", title="t", severity="low", axis="context"),
            Finding(source="b", rule="r", title="t", severity="critical", axis="malice"),
        ])
        self.assertEqual(doc["schema"], "reema.findings/v1")
        self.assertEqual(doc["findings"][0]["severity"], "critical")
        self.assertEqual(doc["summary"]["by_axis"], {"malice": 1, "posture": 0, "context": 1})
        # Unset optional evidence fields are dropped from the JSON.
        doc = build_document([Finding(source="a", rule="r", title="t", severity="low", axis="context",
                                      evidence=[Evidence(file="f")])])
        self.assertEqual(doc["findings"][0]["evidence"], [{"file": "f"}])


class AdapterTest(unittest.TestCase):
    def test_sast_splits_malice_and_posture(self):
        data = {
            "critical": [{"category": "accessibility_abuse", "title": "A11y", "file": "x.smali"}],
            "high": [{"category": "hardcoded_secrets", "title": "Key", "file": "y.java", "line": 7}],
        }
        out = {f.category: f for f in adapters.sast(data, "/case")}
        self.assertEqual(out["accessibility_abuse"].axis, "malice")
        self.assertEqual(out["accessibility_abuse"].confidence, "low")
        self.assertEqual(out["hardcoded_secrets"].axis, "posture")
        self.assertEqual(out["hardcoded_secrets"].evidence[0].line, 7)

    def test_manifest_axes(self):
        data = {"findings": [
            {"severity": "critical", "category": "dangerous_permission", "title": "P",
             "permission": "android.permission.BIND_ACCESSIBILITY_SERVICE"},
            {"severity": "medium", "category": "backup_allowed", "title": "B"},
            {"severity": "critical", "title": "Failed to parse manifest"},
        ]}
        axes = [f.axis for f in adapters.manifest(data, "/case")]
        self.assertEqual(axes, ["malice", "posture", "context"])

    def test_yara_uppercase_severity_and_evidence_relative(self):
        data = {"findings": [{"rule_name": "Android_SMS_Trojan", "severity": "CRITICAL",
                              "file": "/case/decompiled/a.smali", "scan_type": "decompiled",
                              "matched_strings": [{"identifier": "$sms", "content": "SmsManager"}]}]}
        (f,) = adapters.yara(data, "/case")
        self.assertEqual(f.severity, "critical")
        self.assertEqual(f.evidence[0].file, "decompiled/a.smali")
        self.assertIn("$sms=SmsManager", f.evidence[0].snippet)

    def test_hidden_dex_is_malice_with_attck(self):
        data = {"container_payloads": {"zip_assets": [
            {"location": "assets/x.bin", "embedded_files": ["classes.dex"], "contains_dex": True},
            {"location": "assets/y.zip", "embedded_files": ["a.txt"], "contains_dex": False},
        ]}}
        (f,) = adapters.dex_payload(data, "/case")
        self.assertEqual(f.axis, "malice")
        self.assertEqual(f.attck, ["T1407"])

    def test_collect_skips_missing_and_broken_files(self):
        with tempfile.TemporaryDirectory() as d:
            temp = Path(d) / "temp"
            temp.mkdir()
            (temp / "sast_findings.json").write_text("{not json")
            (temp / "signing_analysis.json").write_text(json.dumps(
                {"findings": [{"severity": "high", "title": "Debug certificate", "detail": "CN=Android Debug"}]}))
            findings, sources = adapters.collect(d)
        self.assertEqual(sources, ["signing_analysis.json"])
        self.assertEqual(findings[0].axis, "context")


class CliTest(unittest.TestCase):
    def test_findings_command_writes_document_with_hashes(self):
        with tempfile.TemporaryDirectory() as d:
            case = Path(d)
            (case / "temp").mkdir()
            (case / "temp" / "network_findings.json").write_text(json.dumps(
                {"c2_indicators": [{"url": "http://a.top/gate/", "description": "Potential C2 endpoint"}]}))
            sample = case / "s.apk"
            sample.write_bytes(b"abc")
            rc = cli.main(["findings", str(case), "--sample", str(sample)])
            doc = json.loads((case / "reports" / "findings.json").read_text())
        self.assertEqual(rc, 0)
        self.assertEqual(doc["sample"]["sha256"],
                         "ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad")
        self.assertEqual(doc["summary"]["total"], 1)
        self.assertIn("ioc", doc["findings"][0]["tags"])

    def test_analyze_rejects_jar_until_p1(self):
        with tempfile.TemporaryDirectory() as d:
            jar = Path(d) / "x.jar"
            jar.write_bytes(b"PK")
            self.assertEqual(cli.main(["analyze", str(jar)]), 2)


class ContainerScanTest(unittest.TestCase):
    def test_finds_dex_in_asset_zip_and_so_and_locates_target(self):
        inner = zip_bytes({"classes.dex": b"dex\n035\x00" + b"\x00" * 200})
        so_blob = b"\x7fELF" + b"\x00" * 64 + b"i11111i111.zip\x00" + inner + b"\x00" * 16
        with tempfile.TemporaryDirectory() as d:
            apk = Path(d) / "t.apk"
            apk.write_bytes(zip_bytes({
                "classes.dex": b"dex\n035\x00",
                "assets/payload.bin": inner,
                "assets/broken": b"PK\x03\x04" + b"\xff" * 64,
                "lib/arm64-v8a/libshell.so": so_blob,
            }))
            hunter = dex_payload_hunter.DEXPayloadHunter(apk)
            results = hunter.analyze("com.example", target="i11111i111.zip")
            out = Path(d) / "out.bin"
            extracted = hunter.extract_entry("assets/payload.bin", out)
            self.assertTrue(extracted)
            self.assertEqual(out.read_bytes(), inner)

        c = results["container_payloads"]
        self.assertEqual([a["location"] for a in c["zip_assets"]], ["assets/payload.bin"])
        self.assertTrue(c["zip_assets"][0]["contains_dex"])
        self.assertEqual(c["embedded_in_so"][0]["location"], "lib/arm64-v8a/libshell.so")
        self.assertIn("assets/broken", [s["location"] for s in c["suspicious_assets"]])
        self.assertEqual(results["target_search"]["referenced_in"][0]["so_file"],
                         "lib/arm64-v8a/libshell.so")


if __name__ == "__main__":
    unittest.main()
