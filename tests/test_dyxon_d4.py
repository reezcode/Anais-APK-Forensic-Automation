#!/usr/bin/env python3
"""Tests for Dyxon D4: the provider facade and the static->dynamic pipeline,
including the real merge into Reema's findings via the dynamic adapter.

No device: a FakeRunner scripts adb; a real case directory with a real
vaccine.json drives the pipeline; reema.adapters.collect proves the merge.

Run: python3 -m unittest discover -s tests -v
"""

import json
import sys
import tempfile
import unittest
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))
sys.path.insert(0, str(ROOT / "analysis_tools"))

from reema import adapters  # noqa: E402
from dyxon.backends.base import DeviceBackend  # noqa: E402
from dyxon.broker import Broker  # noqa: E402
from dyxon.errors import PoolExhausted  # noqa: E402
from dyxon.pipeline import run_dynamic_pass  # noqa: E402
from dyxon.pool import DeviceSlot, Pool  # noqa: E402
from dyxon.provider import DyxonProvider  # noqa: E402
from dyxon.shell import RunResult, SpawnHandle  # noqa: E402


class FakeRunner:
    def run(self, cmd, timeout=None):
        joined = " ".join(cmd)
        if "pm path" in joined:
            return RunResult(cmd, 0, "package:/data/app/com.x/base.apk", "")
        return RunResult(cmd, 0, "", "")

    def spawn(self, cmd):
        return SpawnHandle(cmd=cmd, pid=1)


class FakeBackend(DeviceBackend):
    name = "fake"

    def __init__(self, serial="emulator-5554"):
        self._serial = serial

    @classmethod
    def availability(cls, runner=None):
        return []

    def boot(self):
        return self._serial

    def wait_ready(self, serial, timeout=180.0):
        pass

    def root(self, serial):
        pass

    def snapshot(self, serial, name):
        pass

    def restore(self, serial, name):
        pass

    def destroy(self, serial):
        pass


def provider(n=1):
    slots = [DeviceSlot(backend=FakeBackend(f"emulator-{5554 + 2 * i}"), serial=f"emulator-{5554 + 2 * i}",
                        abi="arm64-v8a", android_version="14", frida_endpoint="127.0.0.1:27042")
             for i in range(n)]
    return DyxonProvider(Broker(Pool(slots), runner=FakeRunner()))


VACCINE = {"schema": "reema.vaccine/v1", "entries": [
    {"capability": "process_exec", "title": "Process exec", "severity": "low",
     "defense": {"harness": {"module": "dyxon.harnesses.example:run"}}},
]}


class ProviderTest(unittest.TestCase):
    def test_lease_yields_and_releases(self):
        p = provider(1)
        with p.lease() as session:
            self.assertEqual(session["serial"], "emulator-5554")
            self.assertEqual(p.status()["free"], 0)  # busy inside the lease
        self.assertEqual(p.status()["free"], 1)  # released on exit

    def test_lease_exhausted_raises(self):
        p = provider(1)
        with p.lease():
            with self.assertRaises(PoolExhausted):
                with p.lease():
                    pass

    def test_lease_releases_on_exception(self):
        p = provider(1)
        with self.assertRaises(RuntimeError):
            with p.lease():
                raise RuntimeError("boom")
        self.assertEqual(p.status()["free"], 1)


class PipelineTest(unittest.TestCase):
    def _case(self, d):
        case = Path(d)
        (case / "reports").mkdir(parents=True)
        (case / "temp").mkdir(parents=True)
        (case / "reports" / "vaccine.json").write_text(json.dumps(VACCINE))
        return case

    def test_run_dynamic_pass_writes_dynamic_findings(self):
        with tempfile.TemporaryDirectory() as d:
            case = self._case(d)
            result = run_dynamic_pass(case, provider(1), package="com.x")
            self.assertEqual(result["capabilities"], ["process_exec"])
            self.assertEqual(result["collected"]["observations"], 1)
            self.assertEqual(result["runs"][0]["observation"]["status"], "pass")
            self.assertTrue((case / "temp" / "dynamic_findings.json").is_file())

    def test_end_to_end_merge_into_reema_findings(self):
        with tempfile.TemporaryDirectory() as d:
            case = self._case(d)
            run_dynamic_pass(case, provider(1), package="com.x")
            # Reema's merge step reads temp/*.json through the adapter registry.
            findings, sources = adapters.collect(case)
            self.assertIn("dynamic_findings.json", sources)
            dynamic = [f for f in findings if f.source == "dynamic"]
            self.assertEqual(len(dynamic), 1)
            self.assertEqual(dynamic[0].rule, "process_exec")
            self.assertIn("status:pass", dynamic[0].tags)


if __name__ == "__main__":
    unittest.main()
