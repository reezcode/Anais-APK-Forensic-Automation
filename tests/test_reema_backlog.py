#!/usr/bin/env python3
"""Tests for the Reema backlog items: code-index strings and reachability (B1/B2),
ssdeep (B8), more hash providers (B6), family normalization (B7), sample upload
(B4), child samples (B9), and the K2-K5 fixes (B11).

Run: python3 -m unittest discover -s tests -v
"""

import io
import json
import os
import plistlib
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

import struct  # noqa: E402

from reema import adapters, apk, capabilities, classify, cli, enrich, index, iocs, ios, vaccine, verdict  # noqa: E402
from reema import _psl  # noqa: E402
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


class IocEnrichmentTest(unittest.TestCase):
    def test_threatfox_parsing(self):
        body = {"query_status": "ok", "data": [{"malware_printable": "Anatsa", "threat_type": "botnet_cc",
                                                "confidence_level": 80, "id": "1"}]}
        with mock.patch.object(enrich, "_http_json", return_value=(200, body)):
            status, data = enrich.ThreatFox().lookup_ioc("evil.top", "domains", "k")
        self.assertEqual((status, data["malware"], data["confidence"]), ("found", "Anatsa", 80))
        with mock.patch.object(enrich, "_http_json", return_value=(200, {"query_status": "no_result"})):
            self.assertEqual(enrich.ThreatFox().lookup_ioc("x", "domains", "k")[0], "not_found")

    def test_urlhaus_url_and_host(self):
        with mock.patch.object(enrich, "_http", return_value=(200, {"query_status": "ok", "threat": "malware_download",
                                                                   "url_status": "online", "tags": ["anatsa"]})):
            status, data = enrich.URLhaus().lookup_ioc("http://evil.top/x", "urls", "k")
        self.assertEqual((status, data["threat"]), ("found", "malware_download"))
        with mock.patch.object(enrich, "_http", return_value=(200, {"query_status": "ok", "urls": [{"a": 1}]})):
            status, data = enrich.URLhaus().lookup_ioc("evil.top", "domains", "k")
        self.assertEqual((status, data["threat"], data["url_count"]), ("found", "malware_host", 1))
        with mock.patch.object(enrich, "_http", return_value=(200, {"query_status": "no_results"})):
            self.assertEqual(enrich.URLhaus().lookup_ioc("evil.top", "domains", "k")[0], "not_found")

    def test_run_iocs_caches_skips_and_audits(self):
        with tempfile.TemporaryDirectory() as d:
            cache = enrich.Cache(Path(d) / "c.db")
            case = Case.create(Path(d) / "case")
            tf = enrich.ThreatFox()
            iocset = {"urls": [], "domains": ["evil.top"], "ips": []}
            found = (200, {"query_status": "ok", "data": [{"malware_printable": "X", "confidence_level": 90}]})
            with mock.patch.dict(os.environ, {"REEMA_THREATFOX_API_KEY": "k"}):
                with mock.patch.object(enrich, "_http_json", return_value=found) as m:
                    doc = enrich.run_iocs(iocset, case=case, cache=cache, providers=[tf])
                    again = enrich.run_iocs(iocset, case=case, cache=cache, providers=[tf])
            self.assertEqual(len(doc["hits"]), 1)
            self.assertTrue(again["hits"][0]["cached"])
            self.assertEqual(m.call_count, 1)  # second run served from cache
            self.assertEqual(case.record["enrichment"][0]["sent"], {"ioc": "evil.top", "kind": "domain"})

    def test_run_iocs_offline_and_no_key_send_nothing(self):
        with tempfile.TemporaryDirectory() as d:
            cache = enrich.Cache(Path(d) / "c.db")
            iocset = {"urls": [], "domains": ["evil.top"], "ips": []}
            with mock.patch.object(enrich, "_http_json") as m:
                with mock.patch.dict(os.environ, {}, clear=True):
                    enrich.run_iocs(iocset, cache=cache, providers=[enrich.ThreatFox()])          # no key
                with mock.patch.dict(os.environ, {"REEMA_THREATFOX_API_KEY": "k"}):
                    enrich.run_iocs(iocset, offline=True, cache=cache, providers=[enrich.ThreatFox()])
            m.assert_not_called()

    def test_ioc_enrichment_adapter(self):
        data = {"hits": [
            {"provider": "threatfox", "kind": "domain", "value": "evil.top",
             "data": {"malware": "Anatsa", "confidence": 90, "threat_type": "botnet_cc"}},
            {"provider": "urlhaus", "kind": "url", "value": "http://evil.top/x",
             "data": {"threat": "malware_download", "status": "online", "tags": []}},
        ]}
        out = adapters.ioc_enrichment(data, "/case")
        tf = next(f for f in out if f.rule == "threatfox:known_ioc")
        self.assertEqual((tf.severity, tf.confidence, tf.axis), ("critical", "high", "malice"))
        self.assertIn("family:Anatsa", tf.tags)
        self.assertTrue(any(f.rule == "urlhaus:known_ioc" for f in out))


class BareDomainIocTest(unittest.TestCase):
    def test_public_suffix_and_registrable(self):
        self.assertEqual(_psl.public_suffix("a.evil.co.uk"), "co.uk")
        self.assertEqual(_psl.registrable_domain("a.evil.co.uk"), "evil.co.uk")
        self.assertEqual(_psl.public_suffix("evil.id"), "id")
        self.assertIsNone(_psl.registrable_domain("co.uk"))  # bare suffix

    def test_credible_domain_rejects_code_identifiers(self):
        self.assertTrue(iocs._is_credible_domain("api.evil-c2.top"))
        self.assertTrue(iocs._is_credible_domain("cdn.bad.co.id"))
        self.assertFalse(iocs._is_credible_domain("coroutineId.id"))  # camelCase identifier
        self.assertFalse(iocs._is_credible_domain("R.id"))
        self.assertFalse(iocs._is_credible_domain("view.start"))     # not a public suffix
        self.assertFalse(iocs._is_credible_domain("id"))             # bare TLD

    def test_extract_reenables_credible_domains(self):
        with tempfile.TemporaryDirectory() as d:
            case = Path(d)
            (case / "temp").mkdir()
            (case / "temp" / "network_findings.json").write_text(json.dumps({
                "urls": [], "ip_addresses": [],
                "domains": ["evil-c2.top", "coroutineId.id", "schemas.android.com", "good.co.id"],
            }))
            out = iocs.extract(case)
            self.assertIn("evil-c2.top", out["domains"])
            self.assertIn("good.co.id", out["domains"])
            self.assertNotIn("coroutineId.id", out["domains"])
            self.assertNotIn("schemas.android.com", out["domains"])  # framework noise


class StixMispExportTest(unittest.TestCase):
    IOCS = {"urls": ["http://evil-c2.top/x"], "domains": ["evil-c2.top"], "ips": ["198.51.100.7"]}
    SAMPLE = {"file_name": "m.apk", "sha256": "a" * 64, "md5": "b" * 32}

    def test_stix_bundle_shape_and_patterns(self):
        b = iocs.stix_bundle(self.IOCS, self.SAMPLE)
        self.assertEqual(b["type"], "bundle")
        indicators = [o for o in b["objects"] if o["type"] == "indicator"]
        self.assertEqual(len(indicators), 3)
        patterns = {o["pattern"] for o in indicators}
        self.assertIn("[url:value = 'http://evil-c2.top/x']", patterns)
        self.assertIn("[domain-name:value = 'evil-c2.top']", patterns)
        self.assertIn("[ipv4-addr:value = '198.51.100.7']", patterns)
        for o in indicators:
            self.assertEqual(o["spec_version"], "2.1")
            self.assertEqual(o["pattern_type"], "stix")
            self.assertTrue(o["id"].startswith("indicator--"))

    def test_stix_ids_are_deterministic(self):
        a = iocs.stix_bundle(self.IOCS, self.SAMPLE)
        b = iocs.stix_bundle(self.IOCS, self.SAMPLE)
        self.assertEqual(a, b)

    def test_misp_event_attributes_include_hash(self):
        ev = iocs.misp_event(self.IOCS, self.SAMPLE)["Event"]
        attrs = {(a["type"], a["value"]) for a in ev["Attribute"]}
        self.assertIn(("url", "http://evil-c2.top/x"), attrs)
        self.assertIn(("domain", "evil-c2.top"), attrs)
        self.assertIn(("ip-dst", "198.51.100.7"), attrs)
        self.assertIn(("sha256", "a" * 64), attrs)
        self.assertTrue(all(a["to_ids"] for a in ev["Attribute"]))

    def test_write_emits_stix_and_misp_files(self):
        with tempfile.TemporaryDirectory() as d:
            case = Path(d)
            (case / "temp").mkdir()
            (case / "temp" / "network_findings.json").write_text(json.dumps({
                "urls": ["http://evil-c2.top/x"], "ip_addresses": ["198.51.100.7"],
                "domains": ["evil-c2.top"]}))
            iocs.write(case, sample=self.SAMPLE)
            stix = json.loads((case / "reports" / "iocs.stix.json").read_text())
            misp = json.loads((case / "reports" / "iocs.misp.json").read_text())
            self.assertEqual(stix["type"], "bundle")
            self.assertEqual(misp["Event"]["Attribute"][0]["category"] in
                             ("Network activity", "Payload delivery"), True)


def _macho64(dylibs=(), pie=True, signed=True, cryptid=1):
    """Build a minimal 64-bit little-endian arm64 Mach-O for parse tests."""
    cmds = []
    for name in dylibs:
        raw = name.encode() + b"\x00"
        pad = (-len(raw)) % 8
        raw += b"\x00" * pad
        cmdsize = 24 + len(raw)
        cmds.append(struct.pack("<6I", 0xC, cmdsize, 24, 0, 0, 0) + raw)
    cmds.append(struct.pack("<6I", 0x2C, 24, 0, 0, cryptid, 0))  # LC_ENCRYPTION_INFO_64
    if signed:
        cmds.append(struct.pack("<4I", 0x1D, 16, 0, 0))          # LC_CODE_SIGNATURE
    body = b"".join(cmds)
    flags = 0x200000 if pie else 0
    header = struct.pack("<8I", 0xFEEDFACF, 0x0100000C, 0, 2, len(cmds), len(body), flags, 0)
    return header + body


class DeepIosTest(unittest.TestCase):
    def test_parse_macho_facts(self):
        m = ios.parse_macho(_macho64(dylibs=["@rpath/libswiftCore.dylib"],
                                     pie=True, signed=True, cryptid=1))
        self.assertEqual(m["archs"], ["arm64"])
        self.assertTrue(m["pie"])
        self.assertTrue(m["signed"])
        self.assertTrue(m["encrypted"])
        self.assertTrue(m["swift"])
        self.assertEqual(m["jailbreak_dylibs"], [])

    def test_parse_macho_jailbreak_and_weaknesses(self):
        m = ios.parse_macho(_macho64(dylibs=["/usr/lib/substrate.dylib"],
                                     pie=False, signed=False, cryptid=0))
        self.assertFalse(m["pie"])
        self.assertFalse(m["signed"])
        self.assertFalse(m["encrypted"])
        self.assertEqual(m["jailbreak_dylibs"], ["/usr/lib/substrate.dylib"])

    def test_parse_macho_rejects_non_macho(self):
        self.assertEqual(ios.parse_macho(b"PK\x03\x04not a binary"), {})

    def test_macho_findings_from_facts(self):
        f = ios._macho_findings({"signed": False, "pie": False, "encrypted": False,
                                 "jailbreak_dylibs": ["substrate.dylib"]})
        rules = {x["rule"] for x in f}
        self.assertEqual(rules, {"macho_unsigned", "macho_no_pie",
                                 "macho_not_encrypted", "macho_jailbreak_tooling"})

    def test_analyze_ipa_end_to_end(self):
        with tempfile.TemporaryDirectory() as d:
            case = Path(d)
            ipa = case / "s.ipa"
            plist = plistlib.dumps({
                "CFBundleIdentifier": "com.x.y", "CFBundleExecutable": "X",
                "CFBundleName": "X", "CFBundleShortVersionString": "1.0",
                "NSAppTransportSecurity": {"NSAllowsArbitraryLoads": True},
            })
            macho = _macho64(dylibs=["/usr/lib/cycript.dylib"], pie=False, signed=False, cryptid=0)
            with zipfile.ZipFile(ipa, "w") as zf:
                zf.writestr("Payload/X.app/Info.plist", plist)
                zf.writestr("Payload/X.app/X", macho)
                zf.writestr("Payload/X.app/Frameworks/CoreLocation.framework/", b"")
                zf.writestr("Payload/X.app/Frameworks/CoreLocation.framework/CoreLocation", b"x")
            findings = ios.analyze(ipa, case)
            rules = {x["rule"] for x in findings}
            self.assertIn("ats_arbitrary_loads", rules)
            self.assertIn("macho_jailbreak_tooling", rules)
            self.assertIn("macho_no_pie", rules)
            self.assertIn("ios_cap_location", rules)
            info = json.loads((case / "temp" / "basic_info.json").read_text())
            self.assertEqual(info["macho"]["archs"], ["arm64"])


class ApkEngineTest(unittest.TestCase):
    """B10: the native Python APK engine (reema/apk.py). apktool/jadx/yara are
    not available in CI, so the subprocess layer is faked and the orchestration
    (stage set, order, file wiring, online gating) is asserted."""

    def _valid_apk(self, path):
        with zipfile.ZipFile(path, "w") as zf:
            zf.writestr("AndroidManifest.xml", b"<manifest/>")
            zf.writestr("classes.dex", b"dex\n035\x00")

    def _patched_run(self, case, sample, offline=False, env=None):
        calls = {"pytool": [], "run": [], "yara": []}

        def fake_pytool(script, args, logpath):
            calls["pytool"].append((script, [str(a) for a in args]))
            out = str(args[-1])
            if script == "prepare_input.py":
                Path(args[2]).write_text(json.dumps({"base_apk": str(sample)}))
            elif script == "apk_basic_info.py":
                Path(args[1]).write_text(json.dumps({"package_name": "com.x.y"}))
            elif script == "detect_obfuscation.py":
                Path(args[3]).write_text(json.dumps({"type": "proguard"}))
            elif script == "sast_scanner.py":
                Path(out).write_text(json.dumps({"critical": [], "high": []}))
            return 0

        def fake_run(cmd, logpath):
            calls["run"].append([str(c) for c in cmd])
            return 0

        def fake_yara(rules, targets, out_file, logpath):
            calls["yara"].append(str(out_file))
            Path(out_file).write_text("")

        env = env if env is not None else {}
        with mock.patch.object(apk, "_pytool", fake_pytool), \
             mock.patch.object(apk, "_run", fake_run), \
             mock.patch.object(apk, "_yara", fake_yara), \
             mock.patch.object(apk.shutil, "which", lambda name: "/usr/bin/" + name), \
             mock.patch.dict(os.environ, env, clear=False):
            results = apk.run(sample, case, "a" * 64, case=None, offline=offline)
        return results, calls

    def test_pipeline_stage_set_and_order(self):
        with tempfile.TemporaryDirectory() as d:
            case = Path(d) / "case"
            sample = Path(d) / "s.apk"
            self._valid_apk(sample)
            results, calls = self._patched_run(case, sample)
            stages = [s for s, _ in results]
            self.assertEqual(stages[:2], ["apktool", "jadx"])
            for expect in ("obfuscation", "framework", "rasp", "entropy", "yara",
                           "signing", "sdks", "manifest", "network", "sast"):
                self.assertIn(expect, stages)
            # Report, then derived outputs, come last and in order.
            self.assertEqual(stages[-3:], ["report", "frida", "sarif"])
            scripts = [s for s, _ in calls["pytool"]]
            self.assertIn("dex_payload_hunter.py", scripts)      # obfuscation preamble
            self.assertIn("report_generator_modular.py", scripts)
            self.assertEqual(len(calls["yara"]), 3)              # apk + decompiled + jadx trees

    def test_report_uses_base_apk_name(self):
        with tempfile.TemporaryDirectory() as d:
            case = Path(d) / "case"
            sample = Path(d) / "base.apk"
            self._valid_apk(sample)
            _, calls = self._patched_run(case, sample)
            report = next(a for s, a in calls["pytool"] if s == "report_generator_modular.py")
            self.assertEqual(report[2], "base.apk")
            self.assertIn("a" * 64, report)                      # sha256 passed through

    def test_sdk_online_gated_by_env_and_offline(self):
        with tempfile.TemporaryDirectory() as d:
            case = Path(d) / "case"
            sample = Path(d) / "s.apk"
            self._valid_apk(sample)
            # No env: offline sdk inventory.
            _, calls = self._patched_run(case, sample)
            sdk = next(a for s, a in calls["pytool"] if s == "sdk_inventory.py")
            self.assertNotIn("--online", sdk)
            # Env set but --offline wins: still no network.
            _, calls = self._patched_run(case, sample, offline=True,
                                         env={"ANAIS_CVE_ONLINE": "1"})
            sdk = next(a for s, a in calls["pytool"] if s == "sdk_inventory.py")
            self.assertNotIn("--online", sdk)
            # Env set, online allowed.
            _, calls = self._patched_run(case, sample, env={"ANAIS_CVE_ONLINE": "1"})
            sdk = next(a for s, a in calls["pytool"] if s == "sdk_inventory.py")
            self.assertIn("--online", sdk)

    def test_protection_check_clean_apk_passes_through(self):
        with tempfile.TemporaryDirectory() as d:
            sample = Path(d) / "s.apk"
            self._valid_apk(sample)
            self.assertEqual(apk._protection_check(sample, Path(d), Path(d) / "log"), sample)


class ContentDetectionTest(unittest.TestCase):
    """B13/B14/B16: the shipped capability rules, chains, defenses and family
    signatures load cleanly, cross-reference valid ids, and detect a profile."""

    def test_all_content_loads_without_errors(self):
        rules, rerr = capabilities.load_rules()
        chains, cerr = verdict.load_chains()
        defs, derr = vaccine.load_defenses()
        sigs, serr = classify.load_signatures()
        self.assertEqual((rerr, cerr, derr, serr), ([], [], [], []))
        cap_ids = {r.id for r in rules}
        self.assertGreater(len(rules), 10)
        for ch in chains:
            self.assertTrue(set(ch.capabilities) <= cap_ids, f"chain {ch.id} unknown cap")
        for d in defs:
            self.assertTrue(set(d.applies_to) <= cap_ids, f"defense {d.id} unknown cap")
        for s in sigs:
            self.assertTrue(s["caps"] <= cap_ids, f"signature {s['family']} unknown cap")

    def _banker_facts(self):
        app = "Lcom/evil/bank/Agent;"
        f = capabilities.Facts()
        f.add("permission", "android.permission.SYSTEM_ALERT_WINDOW", "manifest")
        f.add("api", "Landroid/view/WindowManager;->addView", app)
        f.add("api", "Landroid/accessibilityservice/AccessibilityService;->getRootInActiveWindow", app)
        f.add("api", "Landroid/view/accessibility/AccessibilityNodeInfo;->performAction", app)
        return f

    def test_banker_profile_fires_chain_and_signature(self):
        rules, _ = capabilities.load_rules()
        chains, _ = verdict.load_chains()
        matches = capabilities.match_rules(self._banker_facts(), rules)
        findings = [capabilities.match_to_finding(m) for m in matches]
        fired = {f.rule for f in findings}
        self.assertIn("overlay_phishing", fired)
        self.assertIn("accessibility_abuse", fired)

        v = verdict.decide(findings, chains, family=None)
        self.assertEqual(v["label"], "malicious")
        self.assertEqual(v["family"], "Banker")

        # Chain and the offline signature classifier independently name Banker -> high.
        fam = classify.classify(v, enrichment_family=None, findings=[])
        self.assertEqual(fam["family"], "Banker")
        self.assertEqual(fam["confidence"], "high")
        self.assertIn("chain", fam["sources"])
        self.assertIn("signature", fam["sources"])

    def test_signature_vote_needs_app_capabilities(self):
        self.assertIsNone(classify.signature_vote({}))
        self.assertIsNone(classify.signature_vote({"capabilities_app": ["clipboard_access"]}
                                                  if False else {"capabilities_app": []}))
        self.assertEqual(classify.signature_vote({"capabilities_app": ["clipboard_access"]}), "Clipper")

    def test_library_only_capability_does_not_make_malicious(self):
        # An api-only capability proven only in SDK code is owner sdk, not app,
        # so it does not drive the verdict.
        sdk = "Lcom/google/android/gms/common/Stub;"
        f = capabilities.Facts()
        f.add("api", "Landroid/media/projection/MediaProjection;->createVirtualDisplay", sdk)
        rules, _ = capabilities.load_rules()
        chains, _ = verdict.load_chains()
        findings = [capabilities.match_to_finding(m)
                    for m in capabilities.match_rules(f, rules)]
        self.assertIn("screen_capture", {x.rule for x in findings})
        self.assertNotEqual(findings[0].owner, "app")
        v = verdict.decide(findings, chains, family=None)
        self.assertNotEqual(v["label"], "malicious")

    def test_manifest_permission_evidence_is_app_owned(self):
        # Fix 1: a permission-only capability is attributed to the app, so the
        # verdict can see it (a packed app's only static signal).
        rules, _ = capabilities.load_rules()
        f = capabilities.Facts()
        f.add("permission", "android.permission.READ_CALL_LOG", "manifest")
        findings = [capabilities.match_to_finding(m)
                    for m in capabilities.match_rules(f, rules)]
        call = next(x for x in findings if x.rule == "call_log_access")
        self.assertEqual(call.owner, "app")

    def test_permission_constellation_needs_three_high_risk(self):
        # Fix 2: dangerous_permission_set uses any_of_min: 3.
        rules, _ = capabilities.load_rules()

        def fired(perms):
            f = capabilities.Facts()
            for p in perms:
                f.add("permission", "android.permission." + p, "manifest")
            return {m.rule.id for m in capabilities.match_rules(f, rules)}

        self.assertNotIn("dangerous_permission_set", fired(["SEND_SMS", "RECEIVE_SMS"]))
        self.assertIn("dangerous_permission_set",
                      fired(["SEND_SMS", "RECEIVE_SMS", "SYSTEM_ALERT_WINDOW"]))

    def test_packed_profile_verdict_and_family(self):
        # A packed app: no api_calls, only dangerous permissions. The
        # constellation (app-owned) lifts the verdict off clean and the
        # signature names the generic family.
        rules, _ = capabilities.load_rules()
        chains, _ = verdict.load_chains()
        f = capabilities.Facts()
        for p in ("SEND_SMS", "RECEIVE_SMS", "SYSTEM_ALERT_WINDOW",
                  "BIND_ACCESSIBILITY_SERVICE", "READ_CALL_LOG"):
            f.add("permission", "android.permission." + p, "manifest")
        findings = [capabilities.match_to_finding(m) for m in capabilities.match_rules(f, rules)]
        v = verdict.decide(findings, chains, family=None)
        self.assertIn(v["label"], ("suspicious", "malicious"))
        self.assertIn("dangerous_permission_set", v["capabilities_app"])
        fam = classify.classify(v, enrichment_family=None, findings=[])
        self.assertEqual(fam["family"], "Android.HighRisk")

    def test_any_of_min_out_of_range_is_an_error(self):
        from reema.capabilities import Rule, RuleError
        with self.assertRaises(RuleError):
            Rule({"id": "x", "any_of": [{"permission": "A"}], "any_of_min": 5}, "t.yaml")


if __name__ == "__main__":
    unittest.main()
