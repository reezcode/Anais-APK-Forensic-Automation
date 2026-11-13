#!/usr/bin/env python3
"""Tests for Reema P3: the Vaccine Pack generator.

Defenses here are neutral fixtures, so the tests exercise the generator, not
any shipped defense content.

Run: python3 -m unittest discover -s tests -v
"""

import json
import sys
import tempfile
import unittest
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))

from reema import vaccine as V  # noqa: E402


def cap(rule, owner="app", confidence="high", severity="high", attck=None, title=None):
    return {"source": "capability", "rule": rule, "title": title or rule, "severity": severity,
            "owner": owner, "confidence": confidence, "attck": attck or [],
            "evidence": [{"file": "Lcom/x/A;", "snippet": f"api: {rule}"}]}


def write_defense(d, text):
    (Path(d) / "x.yaml").write_text(text, encoding="utf-8")
    return Path(d)


class DefenseLoadingTest(unittest.TestCase):
    def test_loads_and_matches_by_applies_to_and_id(self):
        with tempfile.TemporaryDirectory() as d:
            defenses, errors = V.load_defenses(write_defense(d, """
id: def_a
title: Defense A
applies_to: [cap_a, cap_b]
summary: do the thing
"""))
        self.assertEqual(errors, [])
        self.assertTrue(defenses[0].for_capability("cap_a"))
        self.assertTrue(defenses[0].for_capability("cap_b"))
        self.assertTrue(defenses[0].for_capability("def_a"))
        self.assertFalse(defenses[0].for_capability("other"))

    def test_missing_id_is_an_error_but_others_load(self):
        with tempfile.TemporaryDirectory() as d:
            Path(d, "ok.yaml").write_text("id: good\n")
            Path(d, "bad.yaml").write_text("title: no id\n")
            defenses, errors = V.load_defenses(d)
        self.assertEqual([x.id for x in defenses], ["good"])
        self.assertEqual(len(errors), 1)


class GenerateTest(unittest.TestCase):
    def _run(self, findings, defenses_text=None):
        d = tempfile.mkdtemp()
        (Path(d) / "reports").mkdir()
        defenses = None
        if defenses_text is not None:
            with tempfile.TemporaryDirectory() as dd:
                defenses, _ = V.load_defenses(write_defense(dd, defenses_text))
        else:
            defenses = []
        entries, errors = V.generate(d, findings_doc={"findings": findings}, defenses=defenses)
        return Path(d), entries

    def test_entry_per_capability_with_and_without_defense(self):
        case, entries = self._run(
            [cap("cap_a", attck=["T1059"]), cap("cap_b")],
            defenses_text="id: cap_a\ntitle: Defend A\nsummary: s\n"
                          "check:\n  steps: [one, two]\n  expected: it resists\n",
        )
        by_id = {e["capability"]: e for e in entries}
        self.assertIsNotNone(by_id["cap_a"]["defense"])
        self.assertIsNone(by_id["cap_b"]["defense"])
        # guardrails are always present (ADR 0003)
        self.assertEqual(len(by_id["cap_a"]["harness_guardrails"]), 6)

        self.assertTrue((case / "reports" / "vaccine" / "cap_a.md").is_file())
        self.assertTrue((case / "reports" / "vaccine" / "index.md").is_file())
        doc = json.loads((case / "reports" / "vaccine.json").read_text())
        self.assertEqual((doc["total"], doc["with_defense"]), (2, 1))

        md = (case / "reports" / "vaccine" / "cap_a.md").read_text()
        self.assertIn("## Defense", md)
        self.assertIn("## Check", md)
        self.assertIn("it resists", md)
        self.assertIn("Harness guardrails", md)

    def test_missing_defense_md_points_to_catalog(self):
        case, entries = self._run([cap("cap_x")])
        md = (case / "reports" / "vaccine" / "cap_x.md").read_text()
        self.assertIn("No defense catalog entry", md)
        self.assertIn("reema/defenses/", md)

    def test_dedup_prefers_app_owner(self):
        case, entries = self._run([cap("dup", owner="sdk:X", confidence="low"),
                                   cap("dup", owner="app", confidence="high")])
        self.assertEqual(len(entries), 1)
        self.assertEqual(entries[0]["owner"], "app")

    def test_non_capability_findings_ignored(self):
        case, entries = self._run([{"source": "sast", "rule": "r", "title": "t",
                                    "severity": "high", "owner": "app"}])
        self.assertEqual(entries, [])


class ShippedDefensesTest(unittest.TestCase):
    def test_shipped_defenses_load(self):
        defenses, errors = V.load_defenses()
        self.assertEqual(errors, [], f"shipped defenses have errors: {errors}")
        self.assertTrue(defenses, "no shipped defenses found")


if __name__ == "__main__":
    unittest.main()
