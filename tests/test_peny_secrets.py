#!/usr/bin/env python3
"""Tests for Peny's extracted-secrets inventory (peny.secrets).

Run: python3 -m unittest discover -s tests -v
"""

import sys
import unittest
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))

from peny.findings import PenyFinding, build_document  # noqa: E402
from peny.report import render_report  # noqa: E402
from peny.secrets import classify, extract_secrets, mask  # noqa: E402
from reema.findings import Evidence  # noqa: E402

GKEY = "AIzaSyFAKE0TEST0KEY0000000000000000000x"
XML = (
    '    <string name="google_app_id">1:1443:android:edb1</string>\n'
    f'    <string name="google_api_key">{GKEY}</string>\n'
)


def _secret_finding(value=GKEY, snippet=XML, file="res/values/strings.xml", line=67, rule="api_keys"):
    return PenyFinding(
        source="secrets", rule=rule, title="Api Keys in XML", severity="high",
        masvs="MASVS-STORAGE", category=rule, description=f"Pattern detected: {value}",
        evidence=[Evidence(file=file, line=line, snippet=snippet)],
    )


class ClassifyTests(unittest.TestCase):
    def test_known_types(self):
        self.assertEqual(classify(GKEY), "Google API key")
        self.assertEqual(classify("AKIAIOSFODNN7EXAMPLE"), "AWS access key ID")
        self.assertEqual(classify("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxIn0.sig"), "JWT")
        self.assertEqual(classify("hunter2-but-longer"), "Generic secret")

    def test_mask_hides_middle(self):
        self.assertEqual(mask(GKEY), f"{GKEY[:4]}…{GKEY[-4:]}")
        self.assertEqual(mask("abc"), "ab…")


class ExtractTests(unittest.TestCase):
    def test_value_type_name_and_location(self):
        [s] = extract_secrets([_secret_finding().to_dict()])
        self.assertEqual(s["value"], GKEY)
        self.assertEqual(s["type"], "Google API key")
        self.assertEqual(s["name"], "google_api_key")
        self.assertEqual((s["file"], s["line"]), ("res/values/strings.xml", 67))
        self.assertEqual(s["masvs"], "MASVS-STORAGE")

    def test_java_assignment_name(self):
        snippet = f'    private static final String API_KEY = "{GKEY}";'
        [s] = extract_secrets([_secret_finding(snippet=snippet, file="sources/a/B.java").to_dict()])
        self.assertEqual(s["name"], "API_KEY")

    def test_dedup_and_non_secret_rules_ignored(self):
        f = _secret_finding().to_dict()
        other = PenyFinding(source="crypto", rule="insecure_crypto", title="x", severity="high",
                            masvs="MASVS-CRYPTO", description="Pattern detected: DES").to_dict()
        self.assertEqual(len(extract_secrets([f, f, other])), 1)

    def test_no_value_is_skipped(self):
        f = _secret_finding().to_dict()
        f["description"] = "Hardcoded secret"
        self.assertEqual(extract_secrets([f]), [])


class DocumentTests(unittest.TestCase):
    def test_document_carries_inventory_and_count(self):
        doc = build_document([_secret_finding()])
        self.assertEqual(doc["summary"]["secrets"], 1)
        self.assertEqual(doc["secrets"][0]["value"], GKEY)

    def test_report_masks_values(self):
        md = render_report(build_document([_secret_finding()]))
        self.assertIn("## Extracted secrets (1)", md)
        self.assertIn(mask(GKEY), md)
        self.assertNotIn(f"`{GKEY}`", md.split("## Findings")[0])


if __name__ == "__main__":
    unittest.main()
