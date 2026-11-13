#!/usr/bin/env python3
"""Tests for Dyxon D2: the broker (pool as JSON calls) and the MCP adapter.

The broker is tested over a real Pool backed by FakeBackend slots — no emulator,
no MCP transport. The MCP server is smoke-tested only when the `mcp` SDK is
present.

Run: python3 -m unittest discover -s tests -v
"""

import sys
import unittest
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))

from dyxon import mcp_server  # noqa: E402
from dyxon.backends.base import DeviceBackend  # noqa: E402
from dyxon.broker import Broker  # noqa: E402
from dyxon.pool import DeviceSlot, Pool  # noqa: E402


class FakeBackend(DeviceBackend):
    name = "fake"

    def __init__(self, serial="emulator-5554"):
        self._serial = serial
        self.restored = 0
        self.destroyed = 0

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
        self.destroyed += 1


def broker(n=1):
    slots = [
        DeviceSlot(backend=FakeBackend(f"emulator-{5554 + 2 * i}"), serial=f"emulator-{5554 + 2 * i}",
                   abi="arm64-v8a", android_version="14", frida_endpoint="127.0.0.1:27042")
        for i in range(n)
    ]
    return Broker(Pool(slots))


class BrokerTest(unittest.TestCase):
    def test_acquire_returns_session(self):
        r = broker().acquire_device(ttl_seconds=600)
        self.assertTrue(r["ok"])
        s = r["session"]
        self.assertEqual(s["contract"], "dyxon.session/v1")
        self.assertEqual(s["serial"], "emulator-5554")
        self.assertEqual(s["arch"], "arm64-v8a")
        self.assertEqual(s["ttl_seconds"], 600)

    def test_acquire_exhausted_is_handled_error(self):
        b = broker(1)
        b.acquire_device()
        r = b.acquire_device()
        self.assertFalse(r["ok"])
        self.assertEqual(r["error"], "pool_exhausted")
        self.assertIn("message", r)

    def test_release_then_reacquire(self):
        b = broker(1)
        sid = b.acquire_device()["session"]["session_id"]
        self.assertTrue(b.release(sid)["ok"])
        self.assertTrue(b.acquire_device()["ok"])  # freed

    def test_release_unknown_is_session_not_found(self):
        r = broker().release("deadbeef")
        self.assertEqual((r["ok"], r["error"]), (False, "session_not_found"))

    def test_reset_known_and_unknown(self):
        b = broker(1)
        sid = b.acquire_device()["session"]["session_id"]
        self.assertTrue(b.reset(sid)["ok"])
        self.assertEqual(b.reset("nope")["error"], "session_not_found")

    def test_status(self):
        b = broker(2)
        self.assertEqual(b.status(), {"ok": True, "size": 2, "free": 2})
        b.acquire_device()
        self.assertEqual(b.status()["free"], 1)


@unittest.skipUnless(mcp_server._HAVE_MCP, "mcp SDK not installed")
class McpAdapterTest(unittest.TestCase):
    def test_build_server_registers_tools(self):
        import asyncio
        server = mcp_server.build_server(broker(1))
        self.assertEqual(server.name, "dyxon")
        tools = asyncio.run(server.list_tools())
        names = {t.name for t in tools}
        # D2 tools; run_capability/collect_runtime are added in D3.
        self.assertTrue({"acquire_device", "reset", "release", "status"} <= names)


class ConfigTest(unittest.TestCase):
    def test_parse_avds(self):
        self.assertEqual(mcp_server._parse_avds("pixel:5554, pixel_7:5556"),
                         [("pixel", 5554), ("pixel_7", 5556)])
        self.assertEqual(mcp_server._parse_avds("solo"), [("solo", 5554)])

    def test_pool_from_env_requires_avds(self):
        import os
        old = os.environ.pop("DYXON_AVDS", None)
        try:
            with self.assertRaises(RuntimeError):
                mcp_server.pool_from_env()
        finally:
            if old is not None:
                os.environ["DYXON_AVDS"] = old


if __name__ == "__main__":
    unittest.main()
