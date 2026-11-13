"""Dyxon exception hierarchy.

Every error Dyxon raises on purpose derives from DyxonError, so a caller can
catch the whole family with one except clause. The broker (D2) maps these to
the error codes in docs/dyxon/device-broker-contract.md.
"""

from __future__ import annotations


class DyxonError(Exception):
    """Base class for every error Dyxon raises on purpose."""


class CommandError(DyxonError):
    """A device/host command returned a non-zero exit code.

    Carries the command and its captured output so the caller can report what
    actually failed, not just that something did.
    """

    def __init__(self, cmd, returncode, stderr=""):
        self.cmd = list(cmd)
        self.returncode = returncode
        self.stderr = stderr or ""
        shown = " ".join(self.cmd)
        tail = self.stderr.strip().splitlines()[-1] if self.stderr.strip() else ""
        super().__init__(f"command failed ({returncode}): {shown}" + (f" -> {tail}" if tail else ""))


class PreconditionError(DyxonError):
    """A required host dependency is missing (emulator, adb, an AVD, frida-server).

    The message names the missing dependency so the caller can tell the user
    exactly what to install, per the contract's startup-error behaviour.
    """


class ProvisionError(DyxonError):
    """A device booted but could not be made ready (root, cert, frida-server)."""


class BootError(DyxonError):
    """A device did not reach a usable state within the timeout."""
