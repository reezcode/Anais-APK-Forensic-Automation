"""The warm pool: lease a ready device, restore it to clean on release.

The pool holds N devices already booted, rooted, provisioned and snapshotted at
a golden state. `acquire` leases a free one and returns a `dyxon.session/v1`
handle; `release` restores the golden snapshot and returns the device to the
pool; `reset` restores mid-lease without releasing. A lease carries a TTL, and
an expired lease is reclaimed (restored and freed) on the next pool operation,
so a stuck caller never holds a device forever.

This is the lifecycle chosen in ADR 0001: warm pool + golden-snapshot reset.
The pool is backend-agnostic — it drives devices only through `DeviceBackend`,
so it never knows or cares that they are emulators.
"""

from __future__ import annotations

import threading
import time
import uuid
from dataclasses import dataclass, field
from datetime import datetime, timedelta, timezone
from typing import Callable, List, Optional

from dyxon.backends.base import DeviceBackend
from dyxon.errors import PoolExhausted, SessionNotFound
from dyxon.provision import Provisioner, ready_device
from dyxon.session import Session

DEFAULT_TTL_SECONDS = 1800


@dataclass
class DeviceSlot:
    """One device in the pool and its lease state."""

    backend: DeviceBackend
    serial: str
    golden: str = "golden"
    abi: str = ""
    android_version: str = ""
    frida_endpoint: Optional[str] = None
    rooted: bool = True
    # lease state, managed by the pool under its lock
    leased_to: Optional[str] = None
    expires_at_mono: Optional[float] = field(default=None, repr=False)

    @property
    def free(self) -> bool:
        return self.leased_to is None


class Pool:
    def __init__(self, slots: List[DeviceSlot], clock: Callable[[], float] = time.monotonic):
        self._slots = list(slots)
        self._sessions = {}  # session_id -> DeviceSlot
        self._lock = threading.Lock()
        self._clock = clock  # monotonic source, injectable for tests

    # -- introspection -----------------------------------------------------
    @property
    def size(self) -> int:
        return len(self._slots)

    def free_count(self) -> int:
        with self._lock:
            self._reap_locked()
            return sum(1 for s in self._slots if s.free)

    # -- lease lifecycle ---------------------------------------------------
    def acquire(
        self,
        ttl_seconds: int = DEFAULT_TTL_SECONDS,
        backend: Optional[str] = None,
        network: str = "none",
    ) -> Session:
        """Lease a free device; raise PoolExhausted if none is available."""
        with self._lock:
            self._reap_locked()
            slot = next(
                (s for s in self._slots if s.free and (backend is None or s.backend.name == backend)),
                None,
            )
            if slot is None:
                want = f" for backend {backend!r}" if backend else ""
                raise PoolExhausted(f"no free device{want} in a pool of {len(self._slots)}; retry later")
            session_id = uuid.uuid4().hex[:8]
            slot.leased_to = session_id
            slot.expires_at_mono = self._clock() + ttl_seconds
            self._sessions[session_id] = slot
            return self._session(slot, session_id, ttl_seconds, network)

    def release(self, session_id: str) -> None:
        """End a lease: restore the golden snapshot, return the device to the pool."""
        with self._lock:
            slot = self._sessions.pop(session_id, None)
            if slot is None:
                raise SessionNotFound(session_id)
            self._restore(slot)
            slot.leased_to = None
            slot.expires_at_mono = None

    def reset(self, session_id: str) -> None:
        """Restore the golden snapshot without ending the lease."""
        with self._lock:
            slot = self._sessions.get(session_id)
            if slot is None:
                raise SessionNotFound(session_id)
            self._restore(slot)

    def leased_slot(self, session_id: str) -> DeviceSlot:
        """Return the DeviceSlot a session holds (serial, frida endpoint, ...).

        Raises SessionNotFound for an unknown, released or reclaimed session.
        The caller reads the slot (serial, endpoint); it does not change lease state.
        """
        with self._lock:
            self._reap_locked()
            slot = self._sessions.get(session_id)
            if slot is None:
                raise SessionNotFound(session_id)
            return slot

    def reap(self) -> int:
        """Reclaim every expired lease now; return how many were reclaimed."""
        with self._lock:
            return self._reap_locked()

    def shutdown(self) -> None:
        """Destroy every device in the pool. Call when the broker stops."""
        with self._lock:
            for slot in self._slots:
                try:
                    slot.backend.destroy(slot.serial)
                except Exception:
                    # Teardown is best effort; one failing device must not strand the rest.
                    pass
            self._slots = []
            self._sessions = {}

    # -- internals ---------------------------------------------------------
    def _restore(self, slot: DeviceSlot) -> None:
        slot.backend.restore(slot.serial, slot.golden)

    def _reap_locked(self) -> int:
        now = self._clock()
        reclaimed = 0
        for session_id, slot in list(self._sessions.items()):
            if slot.expires_at_mono is not None and now >= slot.expires_at_mono:
                try:
                    self._restore(slot)
                finally:
                    slot.leased_to = None
                    slot.expires_at_mono = None
                    del self._sessions[session_id]
                    reclaimed += 1
        return reclaimed

    def _session(self, slot: DeviceSlot, session_id: str, ttl_seconds: int, network: str) -> Session:
        expires = datetime.now(timezone.utc) + timedelta(seconds=ttl_seconds)
        return Session(
            session_id=session_id,
            backend=slot.backend.name,
            serial=slot.serial,
            frida_endpoint=slot.frida_endpoint,
            android_version=slot.android_version,
            arch=slot.abi,
            rooted=slot.rooted,
            network=network,
            ttl_seconds=ttl_seconds,
            expires_at=expires.strftime("%Y-%m-%dT%H:%M:%SZ"),
        )


def warm_pool(
    backends: List[DeviceBackend],
    provisioner: Optional[Provisioner] = None,
    golden: str = "golden",
    boot_timeout: float = 180.0,
) -> Pool:
    """Boot and ready each backend, then build a Pool of the resulting slots.

    This is the real bring-up path; it boots devices, so it needs a working
    emulator. Tests build a Pool directly from pre-made slots instead.
    """
    slots: List[DeviceSlot] = []
    for backend in backends:
        serial, info = ready_device(backend, provisioner, golden=golden, boot_timeout=boot_timeout)
        slots.append(DeviceSlot(
            backend=backend,
            serial=serial,
            golden=golden,
            abi=info.get("abi") or "",
            android_version=info.get("android_version") or "",
            frida_endpoint=info.get("frida_endpoint"),
        ))
    return Pool(slots)
