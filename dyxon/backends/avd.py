"""The Android Emulator (AVD) backend.

Chosen as the first backend because arm64 system images run natively on Apple
Silicon, the emulator roots without hardware, and it is free and local. See
docs/dyxon/decisions/0001-dyxon-device-broker-architecture.md.

Every command goes through a Runner (dyxon.shell), so this driver is tested
without a live emulator. A missing executable surfaces as a return code of 127,
which `availability` reads to tell the user what to install.
"""

from __future__ import annotations

import time
from typing import List, Optional

from dyxon.backends.base import Check, DeviceBackend
from dyxon.errors import BootError
from dyxon.shell import Runner, SubprocessRunner


class AvdBackend(DeviceBackend):
    name = "avd"

    #: class-level binaries, so `availability` (a classmethod) can find them;
    #: an instance may override them through the constructor.
    EMULATOR_BIN = "emulator"
    ADB_BIN = "adb"

    def __init__(
        self,
        avd: str,
        port: int = 5554,
        runner: Optional[Runner] = None,
        emulator_bin: Optional[str] = None,
        adb_bin: Optional[str] = None,
        poll_interval: float = 2.0,
    ):
        self.avd = avd
        self.port = port
        self.runner = runner or SubprocessRunner()
        self.emulator_bin = emulator_bin or self.EMULATOR_BIN
        self.adb_bin = adb_bin or self.ADB_BIN
        self.poll_interval = poll_interval
        self._handle = None

    @property
    def serial(self) -> str:
        # The emulator's console port fixes its ADB serial, so a device booted
        # on a known port has a predictable serial without parsing `adb devices`.
        return f"emulator-{self.port}"

    @classmethod
    def availability(cls, runner: Optional[Runner] = None) -> List[Check]:
        runner = runner or SubprocessRunner()
        checks: List[Check] = []

        emu = runner.run([cls.EMULATOR_BIN, "-list-avds"])
        if emu.returncode == 127:
            checks.append(Check("emulator", False, "Android SDK emulator not on PATH"))
            checks.append(Check("avd", False, "cannot list AVDs without the emulator"))
        else:
            checks.append(Check("emulator", True, cls.EMULATOR_BIN))
            avds = [line.strip() for line in emu.stdout.splitlines() if line.strip()]
            checks.append(
                Check("avd", bool(avds), ", ".join(avds) or "no AVD defined (create one with avdmanager)")
            )

        adb = runner.run([cls.ADB_BIN, "version"])
        if adb.returncode == 127:
            checks.append(Check("adb", False, "adb not on PATH"))
        else:
            first = adb.stdout.splitlines()[0] if adb.stdout.strip() else "adb present"
            checks.append(Check("adb", True, first))

        return checks

    def boot(self) -> str:
        # -writable-system: needed to install the CA cert and to remount for root.
        # -no-snapshot-load: cold, clean boot; the golden snapshot is taken by the
        #   provisioner once the device is ready, not loaded here.
        cmd = [
            self.emulator_bin, "-avd", self.avd, "-port", str(self.port),
            "-writable-system", "-no-window", "-no-audio", "-no-boot-anim",
            "-no-snapshot-load",
        ]
        self._handle = self.runner.spawn(cmd)
        return self.serial

    def wait_ready(self, serial: str, timeout: float = 180.0) -> None:
        self.runner.run([self.adb_bin, "-s", serial, "wait-for-device"], timeout=timeout)
        deadline = time.monotonic() + timeout
        while True:
            r = self.runner.run([self.adb_bin, "-s", serial, "shell", "getprop", "sys.boot_completed"])
            if r.ok and r.stdout.strip() == "1":
                return
            if time.monotonic() >= deadline:
                raise BootError(f"{serial} did not finish booting within {timeout:.0f}s")
            time.sleep(self.poll_interval)

    def root(self, serial: str) -> None:
        # `adb root` restarts adbd, so wait for the device to come back before
        # remounting the system partition.
        self.runner.run([self.adb_bin, "-s", serial, "root"]).check()
        self.runner.run([self.adb_bin, "-s", serial, "wait-for-device"])
        self.runner.run([self.adb_bin, "-s", serial, "remount"]).check()

    def snapshot(self, serial: str, name: str) -> None:
        self.runner.run([self.adb_bin, "-s", serial, "emu", "avd", "snapshot", "save", name]).check()

    def restore(self, serial: str, name: str) -> None:
        self.runner.run([self.adb_bin, "-s", serial, "emu", "avd", "snapshot", "load", name]).check()

    def destroy(self, serial: str) -> None:
        self.runner.run([self.adb_bin, "-s", serial, "emu", "kill"])
        if self._handle is not None:
            self._handle.terminate()
            self._handle = None
