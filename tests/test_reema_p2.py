#!/usr/bin/env python3
"""Tests for Reema P2: capability engine, behaviour chains, verdict, IOCs.

Rules here are neutral fixtures (process execution, a made-up marker) written
to a temp dir, so the tests exercise the engine, not any shipped detection
content.

Run: python3 -m unittest discover -s tests -v
"""

import json
import sqlite3
import sys
import tempfile
import unittest
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))
sys.path.insert(0, str(ROOT / "analysis_tools"))

from reema import capabilities as C, iocs, verdict as V  # noqa: E402


def write_rules(d, text):
    p = Path(d) / "r.yaml"
    p.write_text(text, encoding="utf-8")
    return Path(d)


def facts_from(apis=(), strings=(), perms=(), comps=()):
    f = C.Facts()
    for api, where in apis:
        f.add("api", api, where)
    for s, where in strings:
        f.add("string", s, where)
    for p in perms:
        f.add("permission", p, "manifest")
    for comp in comps:
        f.add("component", comp, "manifest")
    return f


class RuleLoadingTest(unittest.TestCase):
    def test_loads_valid_rule(self):
        with tempfile.TemporaryDirectory() as d:
            rules, errors = C.load_rules(write_rules(d, """
id: exec
title: Executes processes
attck: [T1059]
requires:
  - api: "Runtime;->exec"
"""))
        self.assertEqual(errors, [])
        self.assertEqual(rules[0].id, "exec")
        self.assertEqual(rules[0].attck, ["T1059"])

    def test_reports_errors_without_dropping_good_rules(self):
        with tempfile.TemporaryDirectory() as d:
            Path(d, "good.yaml").write_text("id: good\nrequires:\n  - api: x\n")
            Path(d, "noid.yaml").write_text("title: no id\nrequires:\n  - api: x\n")
            Path(d, "nocond.yaml").write_text("id: empty\n")
            Path(d, "badsrc.yaml").write_text("id: bad\nrequires:\n  - nope: x\n")
            rules, errors = C.load_rules(d)
        self.assertEqual([r.id for r in rules], ["good"])
        self.assertEqual(len(errors), 3)

    def test_duplicate_id_is_an_error(self):
        with tempfile.TemporaryDirectory() as d:
            Path(d, "a.yaml").write_text("id: dup\nrequires:\n  - api: x\n")
            Path(d, "b.yaml").write_text("id: dup\nrequires:\n  - api: y\n")
            rules, errors = C.load_rules(d)
        self.assertEqual(len(rules), 1)
        self.assertTrue(any("duplicate" in e for e in errors))


class MatchingTest(unittest.TestCase):
    def _rule(self, d, text):
        return C.load_rules(write_rules(d, text))[0][0]

    def test_requires_is_and_any_of_is_or(self):
        with tempfile.TemporaryDirectory() as d:
            rule = self._rule(d, """
id: r
requires:
  - permission: FOO_PERM
any_of:
  - api: [alpha, beta]
""")
        # requires satisfied, any_of satisfied
        self.assertIsNotNone(rule.evaluate(facts_from(perms=["FOO_PERM"], apis=[("beta()", "Lx;")])))
        # requires missing -> no match
        self.assertIsNone(rule.evaluate(facts_from(apis=[("beta()", "Lx;")])))
        # any_of missing -> no match
        self.assertIsNone(rule.evaluate(facts_from(perms=["FOO_PERM"])))

    def test_substring_case_insensitive(self):
        with tempfile.TemporaryDirectory() as d:
            rule = self._rule(d, "id: r\nrequires:\n  - string: SECRETMARKER\n")
        self.assertIsNotNone(rule.evaluate(facts_from(strings=[("has secretmarker inside", "Lx;")])))

    def test_finding_confidence_by_owner(self):
        with tempfile.TemporaryDirectory() as d:
            rule = self._rule(d, "id: r\nseverity: high\nrequires:\n  - api: exec\n")
        app = C.match_to_finding(rule.evaluate(facts_from(apis=[("exec()", "Lcom/app/A;")])))
        self.assertEqual((app.owner, app.confidence, app.axis), ("app", "high", "malice"))
        sdk = C.match_to_finding(rule.evaluate(facts_from(apis=[("exec()", "Landroidx/a/B;")])))
        self.assertEqual(sdk.confidence, "low")
        self.assertIn("capability:r", app.tags)


class VerdictTest(unittest.TestCase):
    def _cap(self, rule_id, owner):
        from reema.findings import Evidence, Finding
        return Finding(source="capability", rule=rule_id, title=rule_id, severity="high",
                       axis="malice", owner=owner, evidence=[Evidence(file="Lx;")])

    def test_chain_fires_on_app_capabilities(self):
        with tempfile.TemporaryDirectory() as d:
            p = Path(d) / "chains.yaml"
            p.write_text("chains:\n  - id: banker\n    title: Bank profile\n    family: DemoBank\n"
                         "    capabilities: [cap_a, cap_b]\n    min_match: 2\n")
            chains, errs = V.load_chains(p)
        self.assertEqual(errs, [])
        findings = [self._cap("cap_a", "app"), self._cap("cap_b", "app")]
        v = V.decide(findings, chains)
        self.assertEqual(v["label"], "malicious")
        self.assertEqual(v["family"], "DemoBank")
        self.assertEqual(v["confidence"], "high")

    def test_library_only_capability_does_not_escalate(self):
        with tempfile.TemporaryDirectory() as d:
            p = Path(d) / "chains.yaml"
            p.write_text("chains:\n  - id: banker\n    capabilities: [cap_a, cap_b]\n    min_match: 2\n")
            chains, _ = V.load_chains(p)
        findings = [self._cap("cap_a", "sdk:X"), self._cap("cap_b", "sdk:X")]
        v = V.decide(findings, chains)
        self.assertEqual(v["label"], "clean")
        self.assertEqual(v["capabilities_app"], [])

    def test_single_app_capability_is_suspicious(self):
        v = V.decide([self._cap("cap_a", "app")], [])
        self.assertEqual(v["label"], "suspicious")

    def test_clean_with_no_capabilities(self):
        v = V.decide([], [])
        self.assertEqual((v["label"], v["family"]), ("clean", None))

    def test_family_from_enrichment_escalates(self):
        v = V.decide([], [], family={"family": "Anatsa", "confidence": "high"})
        self.assertEqual(v["label"], "malicious")
        self.assertEqual(v["family"], "Anatsa")


class IocTest(unittest.TestCase):
    def _case(self, d, network=None, strings=()):
        case = Path(d) / "case"
        (case / "temp").mkdir(parents=True)
        (case / "temp" / "network_findings.json").write_text(json.dumps(network or {}))
        if strings:
            db = case / "temp" / "code_index.db"
            con = sqlite3.connect(db)
            con.executescript("CREATE TABLE classes(id INTEGER PRIMARY KEY, name TEXT);"
                              "CREATE TABLE strings(class_id INTEGER, method TEXT, value TEXT);")
            con.execute("INSERT INTO classes(id, name) VALUES (1, 'La;')")
            con.executemany("INSERT INTO strings VALUES (1, 'm', ?)", [(s,) for s in strings])
            con.commit()
            con.close()
        return case

    def test_filters_private_ip_and_noise_domains(self):
        with tempfile.TemporaryDirectory() as d:
            case = self._case(d, {"ip_addresses": ["127.0.0.1", "8.8.8.8"],
                                  "domains": ["r.id", "evil.example"],
                                  "urls": ["https://c2.example.net/gate"]})
            io = iocs.extract(case)
        self.assertEqual(io["ips"], ["8.8.8.8"])
        # bare domains list is ignored; host of the URL is kept
        self.assertIn("c2.example.net", io["domains"])
        self.assertNotIn("r.id", io["domains"])

    def test_mines_urls_and_ips_from_index_strings_and_defangs(self):
        with tempfile.TemporaryDirectory() as d:
            case = self._case(d, {}, strings=["reach http://bad.host/x now", "ip 45.76.1.1 here"])
            io, count = iocs.write(case)
            doc = json.loads((case / "reports" / "iocs.json").read_text())
            self.assertIn("http://bad.host/x", io["urls"])
            self.assertIn("45.76.1.1", io["ips"])
            self.assertIn("hxxp://bad[.]host/x", doc["defanged"])
            self.assertTrue((case / "reports" / "iocs.csv").is_file())


class ShippedContentTest(unittest.TestCase):
    """The rules and chains that ship in the repo must at least load cleanly."""

    def test_shipped_rules_and_chains_load(self):
        rules, errors = C.load_rules()
        self.assertEqual(errors, [], f"shipped capability rules have errors: {errors}")
        self.assertTrue(rules, "no shipped capability rules found")
        chains, cerrors = V.load_chains()
        self.assertEqual(cerrors, [], f"shipped chains have errors: {cerrors}")


if __name__ == "__main__":
    unittest.main()
