#!/usr/bin/env python3
"""Tests for Dyxon D1: warm pool, lease/restore, TTL reclaim, session handle.

The pool drives devices only through DeviceBackend, so a FakeBackend that counts
restore/destroy is enough — no emulator. A fake clock drives TTL.

Run: python3 -m unittest discover -s tests -v
"""

import sys
import unittest
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(ROOT))

from dyxon.backends.base import DeviceBackend  # noqa: E402
from dyxon.errors import PoolExhausted, SessionNotFound  # noqa: E402
from dyxon.pool import DeviceSlot, Pool  # noqa: E402
from dyxon.session import CONTRACT  # noqa: E402


class FakeBackend(DeviceBackend):
    def __init__(self, serial="emulator-5554", name="fake"):
        self._serial = serial
        self.name = name
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


class Clock:
    def __init__(self):
        self.t = 0.0

    def __call__(self):
        return self.t

    def advance(self, dt):
        self.t += dt


def slot(serial="emulator-5554", name="fake"):
    return DeviceSlot(
        backend=FakeBackend(serial, name),
        serial=serial,
        golden="golden",
        abi="arm64-v8a",
        android_version="14",
        frida_endpoint="127.0.0.1:27042",
    )


class SessionHandleTest(unittest.TestCase):
    def test_handle_fields(self):
        s = Pool([slot()]).acquire(ttl_seconds=600, network="none")
        d = s.to_dict()
        self.assertEqual(d["contract"], CONTRACT)
        self.assertEqual(d["serial"], "emulator-5554")
        self.assertEqual(d["frida_endpoint"], "127.0.0.1:27042")
        self.assertEqual(d["arch"], "arm64-v8a")
        self.assertEqual(d["android_version"], "14")
        self.assertTrue(d["rooted"])
        self.assertEqual(d["network"], "none")
        self.assertEqual(d["ttl_seconds"], 600)
        self.assertTrue(d["expires_at"].endswith("Z"))
        self.assertEqual(len(d["session_id"]), 8)

    def test_network_passthrough(self):
        self.assertEqual(Pool([slot()]).acquire(network="proxy").network, "proxy")


class LeaseTest(unittest.TestCase):
    def test_acquire_marks_busy_then_exhausts(self):
        p = Pool([slot()])
        p.acquire()
        self.assertEqual(p.free_count(), 0)
        with self.assertRaises(PoolExhausted):
            p.acquire()

    def test_release_restores_and_frees(self):
        s1 = slot()
        p = Pool([s1])
        sess = p.acquire()
        p.release(sess.session_id)
        self.assertEqual(s1.backend.restored, 1)
        self.assertEqual(p.free_count(), 1)
        p.acquire()  # reusable

    def test_release_unknown_raises(self):
        with self.assertRaises(SessionNotFound):
            Pool([slot()]).release("deadbeef")

    def test_reset_restores_keeps_lease(self):
        s1 = slot()
        p = Pool([s1])
        sess = p.acquire()
        p.reset(sess.session_id)
        self.assertEqual(s1.backend.restored, 1)
        self.assertEqual(p.free_count(), 0)  # still leased
        p.release(sess.session_id)
        self.assertEqual(s1.backend.restored, 2)

    def test_backend_filter(self):
        p = Pool([slot(name="fake")])
        p.acquire(backend="fake")
        with self.assertRaises(PoolExhausted):
            p.acquire(backend="other")


class TtlTest(unittest.TestCase):
    def test_ttl_reclaims_expired_lease(self):
        s1 = slot()
        clock = Clock()
        p = Pool([s1], clock=clock)
        sess = p.acquire(ttl_seconds=100)
        clock.advance(100)
        self.assertEqual(p.free_count(), 1)  # reaped on access
        self.assertEqual(s1.backend.restored, 1)
        with self.assertRaises(SessionNotFound):
            p.release(sess.session_id)  # already reclaimed

    def test_reap_returns_count_and_not_before_ttl(self):
        clock = Clock()
        p = Pool([slot()], clock=clock)
        p.acquire(ttl_seconds=100)
        clock.advance(50)
        self.assertEqual(p.reap(), 0)
        clock.advance(50)
        self.assertEqual(p.reap(), 1)


class ShutdownTest(unittest.TestCase):
    def test_shutdown_destroys_all(self):
        a, b = slot("emulator-5554"), slot("emulator-5556")
        p = Pool([a, b])
        p.shutdown()
        self.assertEqual((a.backend.destroyed, b.backend.destroyed), (1, 1))
        self.assertEqual(p.size, 0)


if __name__ == "__main__":
    unittest.main()
