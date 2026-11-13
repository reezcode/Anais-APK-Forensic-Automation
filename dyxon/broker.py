"""The broker: the pool's logic as JSON-serialisable calls, transport-free.

The broker turns Pool operations into plain dicts and maps every DyxonError to
a stable error code (the ones in docs/dyxon/device-broker-contract.md). It knows
nothing about MCP, so it is tested directly; the MCP server (dyxon/mcp_server.py)
is a thin adapter over it.

D2 ships the generic device broker: acquire_device, reset, release, status.
run_capability and collect_runtime arrive in D3.
"""

from __future__ import annotations

from typing import Optional

from dyxon.errors import (
    BootError,
    DyxonError,
    PoolExhausted,
    PreconditionError,
    ProvisionError,
    SessionNotFound,
)
from dyxon.pool import DEFAULT_TTL_SECONDS, Pool

#: DyxonError type -> the error code callers switch on. Unlisted errors are "error".
_ERROR_CODES = {
    PoolExhausted: "pool_exhausted",
    SessionNotFound: "session_not_found",
    PreconditionError: "precondition",
    BootError: "boot_error",
    ProvisionError: "provision_error",
}


def _error(e: DyxonError) -> dict:
    return {"ok": False, "error": _ERROR_CODES.get(type(e), "error"), "message": str(e)}


class Broker:
    def __init__(self, pool: Pool):
        self.pool = pool

    def acquire_device(
        self,
        backend: Optional[str] = None,
        ttl_seconds: int = DEFAULT_TTL_SECONDS,
        network: str = "none",
    ) -> dict:
        """Lease a ready device; on success return its dyxon.session/v1 handle."""
        try:
            session = self.pool.acquire(ttl_seconds=ttl_seconds, backend=backend, network=network)
            return {"ok": True, "session": session.to_dict()}
        except DyxonError as e:
            return _error(e)

    def reset(self, session_id: str) -> dict:
        """Restore the leased device to its golden snapshot without releasing it."""
        try:
            self.pool.reset(session_id)
            return {"ok": True, "session_id": session_id}
        except DyxonError as e:
            return _error(e)

    def release(self, session_id: str) -> dict:
        """End the lease; the device is restored and returned to the pool."""
        try:
            self.pool.release(session_id)
            return {"ok": True, "session_id": session_id}
        except DyxonError as e:
            return _error(e)

    def status(self) -> dict:
        """Pool size and how many devices are free right now."""
        return {"ok": True, "size": self.pool.size, "free": self.pool.free_count()}
