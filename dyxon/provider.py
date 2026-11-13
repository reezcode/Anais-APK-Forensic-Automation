"""DyxonProvider: the device-provider facade other tools lease from.

Aegis and REA do not care about the pool, TTLs or snapshots; they want a ready
device for the duration of a job and want it returned afterwards. The provider
gives them exactly that: a `lease()` context manager that yields a
`dyxon.session/v1` handle and releases it on exit, plus pass-throughs for the
capability runner.

The provider wraps a Broker, so it works in-process (Aegis importing Dyxon) and
mirrors the MCP tool surface one to one (an agent calling the same names over
MCP). The REA hand-off is simply: lease, take `session["serial"]`, run REA's own
ADB/Frida tools against it, release.
"""

from __future__ import annotations

from contextlib import contextmanager
from typing import Optional

from dyxon.broker import Broker
from dyxon.errors import DyxonError, PoolExhausted
from dyxon.pool import DEFAULT_TTL_SECONDS


class DyxonProvider:
    def __init__(self, broker: Broker):
        self.broker = broker

    @contextmanager
    def lease(self, backend: Optional[str] = None, ttl_seconds: int = DEFAULT_TTL_SECONDS, network: str = "none"):
        """Acquire a device, yield its session handle, release it on exit.

        Raises PoolExhausted (or DyxonError) if no device could be leased, so a
        caller uses a normal `with` and `try/except`, never the ok/error envelope.
        """
        result = self.broker.acquire_device(backend=backend, ttl_seconds=ttl_seconds, network=network)
        if not result.get("ok"):
            message = result.get("message", "could not acquire a device")
            if result.get("error") == "pool_exhausted":
                raise PoolExhausted(message)
            raise DyxonError(message)
        session = result["session"]
        try:
            yield session
        finally:
            self.broker.release(session["session_id"])

    # Pass-throughs, so a caller holding a lease drives the runner without
    # reaching into the broker directly.
    def run_capability(self, session_id, package, **kwargs) -> dict:
        return self.broker.run_capability(session_id, package, **kwargs)

    def collect_runtime(self, session_id, out_dir) -> dict:
        return self.broker.collect_runtime(session_id, out_dir)

    def status(self) -> dict:
        return self.broker.status()
