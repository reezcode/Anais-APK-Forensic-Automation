"""The broker: the pool's logic as JSON-serialisable calls, transport-free.

The broker turns Pool operations into plain dicts and maps every DyxonError to
a stable error code (the ones in docs/dyxon/device-broker-contract.md). It knows
nothing about MCP, so it is tested directly; the MCP server (dyxon/mcp_server.py)
is a thin adapter over it.

D2 ships the generic device broker: acquire_device, reset, release, status.
run_capability and collect_runtime arrive in D3.
"""

from __future__ import annotations

import os
import uuid
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
from dyxon.provision import Provisioner
from dyxon.runner import (
    CapabilityRunner,
    build_dynamic_findings,
    vaccine_entry,
    write_dynamic_findings,
)
from dyxon.shell import Runner, SubprocessRunner

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


#: Lease network modes. "none" is the default isolated lease; "proxy" routes the
#: device's HTTP(S) through a controlled sink (operator's Burp/mitmproxy) so a job
#: can observe egress. Opening egress is deliberate — see design.md isolation.
VALID_NETWORKS = ("none", "proxy")


class Broker:
    def __init__(self, pool: Pool, runner: Optional[Runner] = None, adb_bin: str = "adb"):
        self.pool = pool
        self.runner = runner or SubprocessRunner()  # drives adb on leased devices
        self.adb_bin = adb_bin
        self._jobs = {}  # session_id -> list[observation]

    def acquire_device(
        self,
        backend: Optional[str] = None,
        ttl_seconds: int = DEFAULT_TTL_SECONDS,
        network: str = "none",
        proxy: Optional[str] = None,
    ) -> dict:
        """Lease a ready device; on success return its dyxon.session/v1 handle.

        network="proxy" routes the device's HTTP(S) through `proxy` ("host:port",
        or the DYXON_PROXY env default) — the controlled sink (D-C1). The handle
        then carries a `proxy` field. The proxy is cleared by the snapshot restore
        on release/reset.
        """
        if network not in VALID_NETWORKS:
            return _error(PreconditionError(
                f"network must be one of {VALID_NETWORKS}, got {network!r}"))
        try:
            session = self.pool.acquire(ttl_seconds=ttl_seconds, backend=backend, network=network)
        except DyxonError as e:
            return _error(e)

        handle = session.to_dict()
        if network == "proxy":
            endpoint = proxy or os.environ.get("DYXON_PROXY")
            if not endpoint:
                self.pool.release(handle["session_id"])
                return _error(PreconditionError(
                    "network='proxy' needs a proxy endpoint: pass proxy= or set DYXON_PROXY"))
            try:
                Provisioner(self.runner, self.adb_bin).set_proxy(handle["serial"], endpoint)
            except DyxonError as e:
                self.pool.release(handle["session_id"])
                return _error(e)
            handle["proxy"] = endpoint
        return {"ok": True, "session": handle}

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

    def run_capability(
        self,
        session_id: str,
        package: str,
        capability: Optional[str] = None,
        vaccine=None,
        apk: Optional[str] = None,
        mode: str = "check",
        duration: float = 5.0,
    ) -> dict:
        """Run a Vaccine Pack check (mode="check") or a detonation (mode="detonate")
        on the leased device, record the observation, return its job id."""
        try:
            slot = self.pool.leased_slot(session_id)
        except DyxonError as e:
            return _error(e)
        cr = CapabilityRunner(self.runner, slot.serial, self.adb_bin, slot.frida_endpoint)
        try:
            if mode == "detonate":
                obs = cr.detonate(package, apk=apk, duration=duration)
            else:
                entry = vaccine_entry(vaccine, capability) if vaccine is not None else {"capability": capability}
                obs = cr.run_capability(capability, entry, package, apk=apk)
        except DyxonError as e:
            return _error(e)
        except Exception as e:  # harness resolution/install failures stay handled errors
            return {"ok": False, "error": "run_failed", "message": str(e)}
        job_id = uuid.uuid4().hex[:8]
        obs["job_id"] = job_id
        self._jobs.setdefault(session_id, []).append(obs)
        return {"ok": True, "job_id": job_id, "observation": obs}

    def collect_runtime(self, session_id: str, out_dir: str) -> dict:
        """Write this session's observations to dynamic_findings.json in out_dir
        (a case's temp/), for Reema's `dynamic` adapter to merge into findings.json."""
        try:
            slot = self.pool.leased_slot(session_id)
        except DyxonError as e:
            return _error(e)
        observations = self._jobs.get(session_id, [])
        session_info = {"serial": slot.serial, "backend": slot.backend.name, "android_version": slot.android_version}
        doc = build_dynamic_findings(session_info, observations)
        path = write_dynamic_findings(out_dir, doc)
        return {"ok": True, "path": path, "observations": len(observations)}

    def status(self) -> dict:
        """Pool size and how many devices are free right now."""
        return {"ok": True, "size": self.pool.size, "free": self.pool.free_count()}
