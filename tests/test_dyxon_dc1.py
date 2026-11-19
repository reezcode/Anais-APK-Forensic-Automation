#!/usr/bin/env python3
"""Tests for Dyxon D-C1: the controlled-proxy lease profile.

A proxy lease routes the device's HTTP(S) through an operator-supplied sink. The
broker applies it over an injected FakeRunner, so no emulator or adb is needed.

Run: python3 -m unittest discover -s tests -v
"""

import os
import sys
import unittest
from pathlib import Path
from unittest import mock

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))

from dyxon.backends.base import DeviceBackend  # noqa: E402
from dyxon.broker import Broker  # noqa: E402
from dyxon.pool import DeviceSlot, Pool  # noqa: E402
from dyxon.provider import DyxonProvider  # noqa: E402
from dyxon.provision import Provisioner  # noqa: E402
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
        self.restored = 0

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
        self.restored += 1

    def destroy(self, serial):
        pass


def make_broker(runner):
    slot = DeviceSlot(backend=FakeBackend(), serial="emulator-5554",
                      abi="arm64-v8a", android_version="14", frida_endpoint="127.0.0.1:27042")
    return Broker(Pool([slot]), runner=runner)


class ProxyLeaseTests(unittest.TestCase):
    def test_proxy_mode_sets_device_proxy_and_handle(self):
        runner = FakeRunner()
        r = make_broker(runner).acquire_device(network="proxy", proxy="10.0.2.2:8080")
        self.assertTrue(r["ok"], r)
        self.assertEqual(r["session"]["network"], "proxy")
        self.assertEqual(r["session"]["proxy"], "10.0.2.2:8080")
        self.assertTrue(runner.ran("settings put global http_proxy 10.0.2.2:8080"))

    def test_proxy_mode_uses_env_default(self):
        runner = FakeRunner()
        with mock.patch.dict(os.environ, {"DYXON_PROXY": "10.0.2.2:9000"}):
            r = make_broker(runner).acquire_device(network="proxy")
        self.assertTrue(r["ok"], r)
        self.assertEqual(r["session"]["proxy"], "10.0.2.2:9000")

    def test_proxy_without_endpoint_errors_and_releases(self):
        runner = FakeRunner()
        broker = make_broker(runner)
        with mock.patch.dict(os.environ, {}, clear=True):
            r = broker.acquire_device(network="proxy")
        self.assertFalse(r["ok"])
        self.assertEqual(r["error"], "precondition")
        self.assertFalse(runner.ran("http_proxy"))
        self.assertEqual(broker.pool.free_count(), 1)  # device was released

    def test_set_proxy_failure_releases_device(self):
        runner = FakeRunner().on("http_proxy", returncode=1, stderr="boom")
        broker = make_broker(runner)
        r = broker.acquire_device(network="proxy", proxy="10.0.2.2:8080")
        self.assertFalse(r["ok"])
        self.assertEqual(broker.pool.free_count(), 1)

    def test_none_mode_sets_no_proxy(self):
        runner = FakeRunner()
        r = make_broker(runner).acquire_device(network="none")
        self.assertTrue(r["ok"])
        self.assertNotIn("proxy", r["session"])
        self.assertFalse(runner.ran("http_proxy"))

    def test_invalid_network_rejected(self):
        r = make_broker(FakeRunner()).acquire_device(network="internet")
        self.assertFalse(r["ok"])
        self.assertEqual(r["error"], "precondition")


class ProvisionerProxyTests(unittest.TestCase):
    def test_set_and_clear_proxy(self):
        runner = FakeRunner()
        p = Provisioner(runner)
        p.set_proxy("emulator-5554", "10.0.2.2:8080")
        p.clear_proxy("emulator-5554")
        self.assertTrue(runner.ran("settings put global http_proxy 10.0.2.2:8080"))
        self.assertTrue(runner.ran("settings delete global http_proxy"))


class ProviderProxyTests(unittest.TestCase):
    def test_lease_passes_proxy_and_releases(self):
        runner = FakeRunner()
        broker = make_broker(runner)
        provider = DyxonProvider(broker)
        with provider.lease(network="proxy", proxy="10.0.2.2:8080") as session:
            self.assertEqual(session["proxy"], "10.0.2.2:8080")
            self.assertEqual(broker.pool.free_count(), 0)
        self.assertEqual(broker.pool.free_count(), 1)  # released on exit


if __name__ == "__main__":
    unittest.main()
