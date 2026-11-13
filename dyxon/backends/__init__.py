"""Backend registry.

Backends register here by name so the CLI and the broker can look one up
without importing it directly. D0 ships only the AVD backend; later backends
(redroid, physical, Corellium) add a line each.
"""

from __future__ import annotations

from typing import Dict, Type

from dyxon.backends.base import DeviceBackend
from dyxon.backends.avd import AvdBackend

BACKENDS: Dict[str, Type[DeviceBackend]] = {
    AvdBackend.name: AvdBackend,
}


def get_backend(name: str) -> Type[DeviceBackend]:
    """Return the backend class for `name`, or raise KeyError listing the known ones."""
    try:
        return BACKENDS[name]
    except KeyError:
        known = ", ".join(sorted(BACKENDS)) or "none"
        raise KeyError(f"unknown backend {name!r}; known: {known}")


__all__ = ["BACKENDS", "get_backend", "DeviceBackend", "AvdBackend"]
