#!/usr/bin/env python3
"""Tests for Dyxon D3: capability runner, detonation, collect, Reema dynamic adapter.

No device: a FakeRunner scripts adb output. The example harness
(dyxon.harnesses.example) is a real importable module, so harness resolution is
exercised for real.

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
from dyxon.pool import DeviceSlot, Pool  # noqa: E402
from dyxon.runner import CapabilityRunner, build_dynamic_findings, vaccine_entry, write_dynamic_findings  # noqa: E402
from dyxon.shell import RunResult, SpawnHandle  # noqa: E402


class FakeRunner:
    def __init__(self):
        self.calls = []
        self._rules = []

    def on(self, substr, returncode=0, stdout="", stderr=""):
        self._rules.append((substr, (returncode, stdout, stderr)))
        return self

    def run(self, cmd, timeout=None):
        self.calls.append(cmd)
        joined = " ".join(cmd)
        for substr, (rc, out, err) in self._rules:
            if substr in joined:
                return RunResult(cmd, rc, out, err)
        return RunResult(cmd, 0, "", "")

    def spawn(self, cmd):
        return SpawnHandle(cmd=cmd, pid=1)

    def ran(self, substr):
        return any(substr in " ".join(c) for c in self.calls)


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


EXAMPLE_HARNESS = {"module": "dyxon.harnesses.example:run"}


def runner(serial="emulator-5554"):
    return CapabilityRunner(FakeRunner().on("pm path", stdout="package:/data/app/com.x/base.apk"),
                            serial, sleep=lambda _s: None)


class RunCapabilityTest(unittest.TestCase):
    def test_example_harness_pass(self):
        entry = {"capability": "process_exec", "title": "T", "severity": "low",
                 "defense": {"harness": EXAMPLE_HARNESS}}
        obs = runner().run_capability("process_exec", entry, "com.x")
        self.assertEqual(obs["status"], "pass")
        self.assertEqual(obs["axis"], "posture")
        self.assertTrue(obs["evidence"])

    def test_no_harness_when_absent(self):
        obs = runner().run_capability("process_exec", {"capability": "process_exec"}, "com.x")
        self.assertEqual(obs["status"], "no_harness")

    def test_bad_harness_is_error_not_crash(self):
        entry = {"capability": "x", "defense": {"harness": {"module": "dyxon.nope:run"}}}
        obs = runner().run_capability("x", entry, "com.x")
        self.assertEqual(obs["status"], "error")

    def test_detonate_counts_crashes(self):
        r = FakeRunner().on("logcat -d", stdout="I/x\nE/AndroidRuntime: FATAL EXCEPTION: main\n")
        cr = CapabilityRunner(r, "emulator-5554", sleep=lambda _s: None)
        obs = cr.detonate("com.x", duration=0)
        self.assertEqual(obs["axis"], "context")
        self.assertEqual(len(obs["evidence"]), 1)
        self.assertTrue(r.ran("monkey -p com.x"))


class VaccineAndWriteTest(unittest.TestCase):
    def test_vaccine_entry_lookup(self):
        vac = {"entries": [{"capability": "process_exec", "title": "T"}]}
        self.assertEqual(vaccine_entry(vac, "process_exec")["title"], "T")
        self.assertEqual(vaccine_entry(vac, "absent"), {"capability": "absent"})

    def test_write_dynamic_findings(self):
        with tempfile.TemporaryDirectory() as d:
            doc = build_dynamic_findings({"serial": "emulator-5554"}, [{"capability": "c", "status": "pass"}])
            path = write_dynamic_findings(d, doc)
            self.assertTrue(Path(path).is_file())
            loaded = json.loads(Path(path).read_text())
            self.assertEqual(loaded["schema"], "dyxon.dynamic/v1")
            self.assertEqual(len(loaded["observations"]), 1)


class BrokerRuntimeTest(unittest.TestCase):
    def _broker(self):
        slot = DeviceSlot(backend=FakeBackend(), serial="emulator-5554", abi="arm64-v8a",
                          android_version="14", frida_endpoint="127.0.0.1:27042")
        r = FakeRunner().on("pm path", stdout="package:/data/app/com.x/base.apk")
        return Broker(Pool([slot]), runner=r)

    def test_run_then_collect(self):
        b = self._broker()
        sid = b.acquire_device()["session"]["session_id"]
        vac = {"entries": [{"capability": "process_exec", "severity": "low",
                            "defense": {"harness": EXAMPLE_HARNESS}}]}
        r = b.run_capability(sid, "com.x", capability="process_exec", vaccine=vac)
        self.assertTrue(r["ok"])
        self.assertEqual(r["observation"]["status"], "pass")
        self.assertIn("job_id", r)
        with tempfile.TemporaryDirectory() as d:
            c = b.collect_runtime(sid, d)
            self.assertTrue(c["ok"])
            self.assertEqual(c["observations"], 1)
            self.assertTrue(Path(c["path"]).is_file())

    def test_run_unknown_session(self):
        b = self._broker()
        r = b.run_capability("deadbeef", "com.x", capability="c", vaccine={"entries": []})
        self.assertEqual((r["ok"], r["error"]), (False, "session_not_found"))

    def test_detonate_mode(self):
        b = self._broker()
        sid = b.acquire_device()["session"]["session_id"]
        r = b.run_capability(sid, "com.x", mode="detonate", duration=0)
        self.assertTrue(r["ok"])
        self.assertEqual(r["observation"]["capability"], "detonation")


class DynamicAdapterTest(unittest.TestCase):
    def test_maps_observations_to_findings(self):
        doc = {"session": {"serial": "emulator-5554"}, "observations": [
            {"capability": "process_exec", "title": "T", "severity": "low",
             "axis": "posture", "status": "pass", "detail": "d", "evidence": ["e1"]},
            {"capability": "detonation", "title": "D", "severity": "info",
             "axis": "context", "status": "observed", "detail": "d2", "evidence": []},
        ]}
        fs = adapters.dynamic(doc, "/case")
        self.assertEqual(len(fs), 2)
        self.assertEqual(fs[0].source, "dynamic")
        self.assertEqual(fs[0].axis, "posture")
        self.assertEqual(fs[0].confidence, "high")
        self.assertIn("status:pass", fs[0].tags)
        self.assertEqual(fs[0].evidence[0].file, "device:emulator-5554")

    def test_registered_in_adapters(self):
        self.assertIs(adapters.ADAPTERS["dynamic_findings.json"], adapters.dynamic)


if __name__ == "__main__":
    unittest.main()
