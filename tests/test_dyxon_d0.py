#!/usr/bin/env python3
"""Tests for Dyxon D0: AVD backend driver, provisioner, preflight.

No real emulator, adb or frida-server: every command goes through a FakeRunner
that returns scripted results and records what was called.

Run: python3 -m unittest discover -s tests -v
"""

import sys
import unittest
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))

from dyxon import cli, preflight, provision  # noqa: E402
from dyxon.backends import get_backend  # noqa: E402
from dyxon.backends.avd import AvdBackend  # noqa: E402
from dyxon.errors import BootError, CommandError, ProvisionError  # noqa: E402
from dyxon.provision import Provisioner, ready_device  # noqa: E402
from dyxon.shell import RunResult, SpawnHandle  # noqa: E402


class FakeRunner:
    """Scripted Runner. `on(substr, ...)` sets the reply for commands containing substr."""

    def __init__(self):
        self.calls = []
        self.spawns = []
        self._rules = []  # (substr, (returncode, stdout, stderr))

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
        self.spawns.append(cmd)
        return SpawnHandle(cmd=cmd, pid=4321)

    def ran(self, substr):
        return any(substr in " ".join(c) for c in self.calls)


def _check(checks, name):
    return next(c for c in checks if c.name == name)


class AvailabilityTest(unittest.TestCase):
    def test_reports_missing_tools(self):
        r = FakeRunner().on("-list-avds", returncode=127).on("version", returncode=127)
        checks = AvdBackend.availability(runner=r)
        self.assertFalse(_check(checks, "emulator").ok)
        self.assertFalse(_check(checks, "avd").ok)
        self.assertFalse(_check(checks, "adb").ok)

    def test_lists_avds(self):
        r = (FakeRunner()
             .on("-list-avds", stdout="pixel\npixel_7\n")
             .on("version", stdout="Android Debug Bridge version 1.0.41"))
        checks = AvdBackend.availability(runner=r)
        self.assertTrue(_check(checks, "emulator").ok)
        self.assertTrue(_check(checks, "avd").ok)
        self.assertIn("pixel", _check(checks, "avd").detail)
        self.assertTrue(_check(checks, "adb").ok)


class PreflightTest(unittest.TestCase):
    def test_doctor_ok_and_render(self):
        r = (FakeRunner()
             .on("-list-avds", stdout="pixel\n")
             .on("version", stdout="adb 1.0.41"))
        checks = preflight.doctor(runner=r)
        self.assertTrue(preflight.ok(checks))
        self.assertIn("[ok]", preflight.render(checks))

    def test_doctor_not_ok(self):
        r = FakeRunner().on("-list-avds", returncode=127).on("version", returncode=127)
        self.assertFalse(preflight.ok(preflight.doctor(runner=r)))


class BackendTest(unittest.TestCase):
    def _backend(self, runner):
        return AvdBackend("pixel", port=5556, runner=runner, poll_interval=0.0)

    def test_boot_serial_and_spawn_flags(self):
        r = FakeRunner()
        b = self._backend(r)
        self.assertEqual(b.boot(), "emulator-5556")
        spawned = " ".join(r.spawns[0])
        self.assertIn("-writable-system", spawned)
        self.assertIn("-no-snapshot-load", spawned)
        self.assertIn("-port 5556", spawned)

    def test_wait_ready_returns_when_booted(self):
        r = FakeRunner().on("sys.boot_completed", stdout="1")
        self._backend(r).wait_ready("emulator-5556", timeout=5.0)  # no raise

    def test_wait_ready_times_out(self):
        r = FakeRunner().on("sys.boot_completed", stdout="0")
        with self.assertRaises(BootError):
            self._backend(r).wait_ready("emulator-5556", timeout=0.0)

    def test_root_remounts(self):
        r = FakeRunner()
        self._backend(r).root("emulator-5556")
        self.assertTrue(r.ran("root"))
        self.assertTrue(r.ran("remount"))

    def test_root_raises_on_failure(self):
        r = FakeRunner().on("remount", returncode=1, stderr="not permitted")
        with self.assertRaises(CommandError):
            self._backend(r).root("emulator-5556")

    def test_snapshot_restore_destroy(self):
        r = FakeRunner()
        b = self._backend(r)
        b.snapshot("emulator-5556", "golden")
        b.restore("emulator-5556", "golden")
        b.destroy("emulator-5556")
        self.assertTrue(r.ran("snapshot save golden"))
        self.assertTrue(r.ran("snapshot load golden"))
        self.assertTrue(r.ran("emu kill"))


class ProvisionerTest(unittest.TestCase):
    def test_apply_settings(self):
        r = FakeRunner()
        Provisioner(runner=r).apply_settings("emulator-5554")
        self.assertTrue(r.ran("window_animation_scale"))
        self.assertTrue(r.ran("svc power stayon true"))

    def test_push_frida_selects_by_abi(self):
        r = FakeRunner().on("ro.product.cpu.abi", stdout="arm64-v8a")
        p = Provisioner(runner=r, frida_servers={"arm64-v8a": "/f/frida-arm64"})
        endpoint = p.push_frida("emulator-5554")
        self.assertEqual(endpoint, "127.0.0.1:27042")
        self.assertTrue(r.ran("push /f/frida-arm64 /data/local/tmp/frida-server"))
        self.assertIn("/data/local/tmp/frida-server", " ".join(r.spawns[0]) if r.spawns else "")
        self.assertTrue(r.ran("forward tcp:27042 tcp:27042"))

    def test_push_frida_none_when_unconfigured(self):
        r = FakeRunner().on("ro.product.cpu.abi", stdout="arm64-v8a")
        self.assertIsNone(Provisioner(runner=r).push_frida("emulator-5554"))

    def test_push_frida_no_match_raises(self):
        r = FakeRunner().on("ro.product.cpu.abi", stdout="x86_64")
        p = Provisioner(runner=r, frida_servers={"arm64-v8a": "/f/frida-arm64"})
        with self.assertRaises(ProvisionError):
            p.push_frida("emulator-5554")

    def test_install_cert_without_openssl_requires_name(self):
        r = FakeRunner().on("subject_hash_old", returncode=127)
        with self.assertRaises(ProvisionError):
            Provisioner(runner=r).install_cert("emulator-5554", "/c.pem")

    def test_install_cert_with_given_name(self):
        r = FakeRunner()
        name = Provisioner(runner=r).install_cert("emulator-5554", "/c.pem", hashed_name="9a5ba575.0")
        self.assertEqual(name, "9a5ba575.0")
        self.assertTrue(r.ran("/system/etc/security/cacerts/9a5ba575.0"))


class ReadyDeviceTest(unittest.TestCase):
    def test_full_flow(self):
        r = (FakeRunner()
             .on("sys.boot_completed", stdout="1")
             .on("ro.product.cpu.abi", stdout="arm64-v8a"))
        backend = AvdBackend("pixel", port=5554, runner=r, poll_interval=0.0)
        prov = Provisioner(runner=r, frida_servers={"arm64-v8a": "/f/frida-arm64"})
        serial, info = ready_device(backend, prov, golden="golden")
        self.assertEqual(serial, "emulator-5554")
        self.assertEqual(info["golden"], "golden")
        self.assertEqual(info["abi"], "arm64-v8a")
        self.assertEqual(info["frida_endpoint"], "127.0.0.1:27042")
        self.assertTrue(r.ran("snapshot save golden"))


class RegistryAndCliTest(unittest.TestCase):
    def test_get_backend_known_and_unknown(self):
        self.assertIs(get_backend("avd"), AvdBackend)
        with self.assertRaises(KeyError):
            get_backend("nope")

    def test_parser_wires_subcommands(self):
        p = cli.build_parser()
        self.assertIs(p.parse_args(["doctor"]).func, cli.cmd_doctor)
        self.assertEqual(p.parse_args(["up", "pixel", "--port", "5600"]).port, 5600)
        self.assertIs(p.parse_args(["down", "pixel"]).func, cli.cmd_down)


if __name__ == "__main__":
    unittest.main()
