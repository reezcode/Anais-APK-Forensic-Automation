"""The session handle: Dyxon's public lease contract.

`dyxon.session/v1` is what `acquire_device` returns. It tells a caller which
device to target (`serial`), where frida-server listens (`frida_endpoint`), and
when the lease expires. See docs/dyxon/device-broker-contract.md. This is a
versioned contract: a breaking change needs a new version string.
"""

from __future__ import annotations

from dataclasses import dataclass
from typing import Optional

CONTRACT = "dyxon.session/v1"


@dataclass
class Session:
    session_id: str
    backend: str
    serial: str
    frida_endpoint: Optional[str]
    android_version: str
    arch: str
    rooted: bool
    network: str
    ttl_seconds: int
    expires_at: str  # ISO 8601, UTC, e.g. 2026-11-13T12:30:00Z
    contract: str = CONTRACT

    def to_dict(self) -> dict:
        # Key order mirrors the contract document for readable handles.
        return {
            "contract": self.contract,
            "session_id": self.session_id,
            "backend": self.backend,
            "serial": self.serial,
            "frida_endpoint": self.frida_endpoint,
            "android_version": self.android_version,
            "arch": self.arch,
            "rooted": self.rooted,
            "network": self.network,
            "ttl_seconds": self.ttl_seconds,
            "expires_at": self.expires_at,
        }
