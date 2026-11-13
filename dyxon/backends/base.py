"""The device backend interface.

A backend is one source of Android devices: the emulator (AVD, implemented in
D0), and later redroid, physical devices and Corellium (backlog D-B1..D-B3).
The broker and the pool talk to this interface only, so a new backend slots in
without changing any caller.

A backend owns the *lifecycle* of a device, nothing else: boot it, wait for it,
root it, snapshot it, restore the snapshot, destroy it. Making a booted device
*ready* (frida-server, certificate, settings) is the provisioner's job, so a
backend stays a thin wrapper over its device source.
"""

from __future__ import annotations

import abc
from dataclasses import dataclass
from typing import List


@dataclass
class Check:
    """One line of a preflight report: a named dependency and whether it is met."""

    name: str
    ok: bool
    detail: str = ""


class DeviceBackend(abc.ABC):
    """A source of Android devices, controlled through its lifecycle."""

    #: short, stable id used on the command line and in the session handle
    name: str = "base"

    @classmethod
    @abc.abstractmethod
    def availability(cls, runner=None) -> List[Check]:
        """Report whether this backend can run here (host tools, images).

        Pure and side-effect free: it inspects the host but boots nothing, so
        `dyxon doctor` can call it safely. Accepts an optional Runner so the
        check is testable without touching the real host.
        """

    @abc.abstractmethod
    def boot(self) -> str:
        """Start a device and return its ADB serial. Does not wait for boot."""

    @abc.abstractmethod
    def wait_ready(self, serial: str, timeout: float = 180.0) -> None:
        """Block until the device has finished booting, or raise BootError."""

    @abc.abstractmethod
    def root(self, serial: str) -> None:
        """Gain root on the device and make the system partition writable."""

    @abc.abstractmethod
    def snapshot(self, serial: str, name: str) -> None:
        """Save the current device state under `name` (the golden snapshot)."""

    @abc.abstractmethod
    def restore(self, serial: str, name: str) -> None:
        """Restore the device to the state saved under `name`."""

    @abc.abstractmethod
    def destroy(self, serial: str) -> None:
        """Shut the device down and release its resources."""
