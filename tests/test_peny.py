#!/usr/bin/env python3
"""Peny P0: the one-way seam and the finding schema.

These tests encode ADR 0001 (docs/peny/decisions/0001): Peny reuses Reema's
shared static primitives, never Reema's analysis lenses, and Reema never imports
Peny. The isolation checks run in a fresh interpreter so an import pulled in by
another test cannot mask a real dependency.

Run: python3 -m unittest discover -s tests -v
"""

import subprocess
import sys
import unittest
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))

from peny import _shared, cli  # noqa: E402
from peny.findings import PenyFinding, build_document  # noqa: E402


def _run(code):
    """Run a snippet in a fresh interpreter rooted at the repo."""
    return subprocess.run(
        [sys.executable, "-c", code], cwd=ROOT, capture_output=True, text=True
    )


class SeamTests(unittest.TestCase):
    def test_peny_imports(self):
        import peny  # noqa: F401
        import peny.cli  # noqa: F401
        import peny.findings  # noqa: F401

    def test_importing_peny_pulls_no_reema_lens(self):
        proc = _run(
            "import peny, peny.findings, peny.cli, sys\n"
            "from peny._shared import FORBIDDEN_REEMA_MODULES\n"
            "leaked = [m for m in FORBIDDEN_REEMA_MODULES if m in sys.modules]\n"
            "assert not leaked, leaked\n"
        )
        self.assertEqual(proc.returncode, 0, proc.stderr)

    def test_importing_reema_pulls_no_peny(self):
        proc = _run(
            "import reema, reema.findings, sys\n"
            "leaked = [m for m in sys.modules if m.startswith('peny')]\n"
            "assert not leaked, leaked\n"
        )
        self.assertEqual(proc.returncode, 0, proc.stderr)

    def test_reema_still_imports(self):
        import reema  # noqa: F401
        import reema.findings  # noqa: F401

    def test_shared_primitives_reused_not_forked(self):
        import reema.findings as rf

        self.assertIs(_shared.Evidence, rf.Evidence)
        self.assertIs(_shared.normalize_severity, rf.normalize_severity)
        self.assertIs(_shared.SEVERITIES, rf.SEVERITIES)


class SchemaTests(unittest.TestCase):
    def test_penyfinding_builds_and_serializes(self):
        from peny._shared import Evidence

        f = PenyFinding(
            source="crypto",
            rule="ecb_mode",
            title="AES used in ECB mode",
            severity="high",
            masvs="MASVS-CRYPTO",
            cwe=["CWE-327"],
            fix="Use AES/GCM/NoPadding.",
            evidence=[Evidence(file="smali/a.smali", line=12, snippet='Cipher.getInstance("AES/ECB")')],
        )
        self.assertTrue(f.id.startswith("peny-"))
        d = f.to_dict()
        self.assertEqual(d["masvs"], "MASVS-CRYPTO")
        self.assertEqual(d["fix"], "Use AES/GCM/NoPadding.")
        self.assertNotIn("runtime_status", d)  # unset optional dropped
        self.assertEqual(d["evidence"][0]["line"], 12)

    def test_penyfinding_rejects_bad_masvs(self):
        with self.assertRaises(ValueError):
            PenyFinding(source="crypto", rule="x", title="t", severity="high", masvs="MASVS-BOGUS")

    def test_document_shape(self):
        f = PenyFinding(
            source="manifest", rule="debuggable", title="debuggable=true",
            severity="medium", masvs="MASVS-RESILIENCE",
        )
        doc = build_document(
            [f],
            sample={"package_name": "com.example"},
            authorization={"authorized_by": "op", "package": "com.example"},
        )
        self.assertEqual(doc["schema"], "peny.findings/v1")
        self.assertEqual(doc["authorization"]["authorized_by"], "op")
        self.assertEqual(doc["summary"]["total"], 1)
        self.assertEqual(doc["summary"]["by_masvs"]["MASVS-RESILIENCE"], 1)
        self.assertEqual(doc["masvs"]["MASVS-RESILIENCE"]["status"], "fail")

    def test_matrix_needs_runtime_vs_fail(self):
        pending = PenyFinding(
            source="network", rule="pinning", title="no pinning",
            severity="high", masvs="MASVS-NETWORK", needs_runtime_confirmation=True,
        )
        doc = build_document([pending])
        self.assertEqual(doc["masvs"]["MASVS-NETWORK"]["status"], "needs_runtime")
        self.assertEqual(doc["summary"]["needs_runtime"], 1)

        pending.runtime_status = "confirmed"
        doc2 = build_document([pending])
        self.assertEqual(doc2["masvs"]["MASVS-NETWORK"]["status"], "fail")
        self.assertEqual(doc2["summary"]["confirmed"], 1)


class CliTests(unittest.TestCase):
    def test_cli_version(self):
        proc = _run("from peny.cli import main; main(['--version'])")
        self.assertEqual(proc.returncode, 0, proc.stderr)
        self.assertIn("peny", proc.stdout.lower())

    def test_cli_analyze_missing_file(self):
        rc = cli.main(["analyze", "nonexistent.apk"])
        self.assertEqual(rc, 2)  # clean error, not a traceback


if __name__ == "__main__":
    unittest.main()
