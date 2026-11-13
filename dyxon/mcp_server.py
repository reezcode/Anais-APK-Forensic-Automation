"""MCP adapter over the broker.

A long-lived MCP server that holds the device pool in memory and exposes the
broker as tools, so an agent (the Aegis module, REA, Claude Code) leases a
device the same way it calls any other MCP tool. Unlike the Reema MCP wrapper
(which spawns a fresh process per call), this process must stay alive, because
the pool and its leases are in-memory state.

The `mcp` SDK import is guarded: the broker and `build_server` logic are
importable and testable even where the SDK is absent; only actually serving
needs it installed.
"""

from __future__ import annotations

import os
from typing import List, Optional

from dyxon.backends.avd import AvdBackend
from dyxon.backends.base import DeviceBackend
from dyxon.broker import Broker
from dyxon.pool import Pool, warm_pool
from dyxon.provision import Provisioner

try:  # the SDK is optional at import time
    from mcp.server.fastmcp import FastMCP
    _HAVE_MCP = True
except Exception:  # pragma: no cover - exercised only where the SDK is missing
    _HAVE_MCP = False


SERVER_NAME = "dyxon"


def build_server(broker: Broker, name: str = SERVER_NAME):
    """Register the broker's tools on a FastMCP server and return it.

    Raises RuntimeError when the `mcp` SDK is not installed, so a caller gets a
    clear message instead of an ImportError at an odd moment.
    """
    if not _HAVE_MCP:
        raise RuntimeError("the 'mcp' SDK is not installed; run: pip install mcp")

    server = FastMCP(name)

    @server.tool()
    def acquire_device(backend: Optional[str] = None, ttl_seconds: int = 1800, network: str = "none") -> dict:
        """Lease a ready, rooted Android device. Returns a dyxon.session/v1 handle
        with the ADB serial and frida endpoint, or {ok:false, error:"pool_exhausted"}."""
        return broker.acquire_device(backend=backend, ttl_seconds=ttl_seconds, network=network)

    @server.tool()
    def reset(session_id: str) -> dict:
        """Restore a leased device to its clean golden snapshot without releasing it."""
        return broker.reset(session_id)

    @server.tool()
    def release(session_id: str) -> dict:
        """End a lease; the device is restored to clean and returned to the pool."""
        return broker.release(session_id)

    @server.tool()
    def status() -> dict:
        """Report pool size and how many devices are free."""
        return broker.status()

    return server


def _parse_avds(spec: str) -> List[tuple]:
    """Parse DYXON_AVDS="name:port,name2:port2" into [(name, port), ...]."""
    out = []
    for item in spec.split(","):
        item = item.strip()
        if not item:
            continue
        name, _, port = item.partition(":")
        out.append((name.strip(), int(port) if port.strip() else 5554))
    return out


def pool_from_env() -> Pool:
    """Build and boot a pool from environment configuration.

    DYXON_AVDS      required, "name:port,name2:port2"
    DYXON_FRIDA_DIR optional, directory of frida-server binaries
    DYXON_CERT      optional, PEM CA certificate to install
    DYXON_CERT_HASH optional, the <hash>.0 filename (skips needing openssl)

    This boots real emulators, so it runs only when the server actually starts.
    """
    spec = os.environ.get("DYXON_AVDS", "").strip()
    if not spec:
        raise RuntimeError("set DYXON_AVDS to the AVDs to pool, e.g. DYXON_AVDS=pixel:5554,pixel_7:5556")
    provisioner = Provisioner(frida_dir=os.environ.get("DYXON_FRIDA_DIR"))
    backends: List[DeviceBackend] = [AvdBackend(name, port=port) for name, port in _parse_avds(spec)]
    cert = os.environ.get("DYXON_CERT")
    cert_hash = os.environ.get("DYXON_CERT_HASH")
    # warm_pool boots each backend; cert install happens per-device inside ready_device
    # via the provisioner only when cert is set, so thread it through there.
    if cert:
        pool_slots = []
        from dyxon.pool import DeviceSlot
        from dyxon.provision import ready_device
        for backend in backends:
            serial, info = ready_device(backend, provisioner, cert_path=cert, cert_hashed_name=cert_hash)
            pool_slots.append(DeviceSlot(
                backend=backend, serial=serial, abi=info.get("abi") or "",
                android_version=info.get("android_version") or "", frida_endpoint=info.get("frida_endpoint"),
            ))
        return Pool(pool_slots)
    return warm_pool(backends, provisioner)


def serve() -> int:
    """Boot the pool from the environment and run the MCP server over stdio."""
    broker = Broker(pool_from_env())
    server = build_server(broker)
    server.run()  # stdio transport
    return 0
