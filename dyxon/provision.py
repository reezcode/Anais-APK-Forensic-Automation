"""Make a booted, rooted device *ready*, then capture the golden snapshot.

"Ready" means: animations off, a running frida-server matched to the device
ABI, an optional system CA certificate installed for traffic inspection. The
backend owns boot/root/snapshot; the provisioner owns what goes *onto* the
device once it is up. Keeping them apart lets every backend share one
provisioner.

Everything runs through a Runner, so the provisioner is tested without a device.
"""

from __future__ import annotations

import glob
import os
from typing import Dict, Optional

from dyxon.backends.base import DeviceBackend
from dyxon.errors import ProvisionError
from dyxon.shell import Runner, SubprocessRunner

#: frida-server listens here on the device; the same port is forwarded to the host.
DEFAULT_FRIDA_PORT = 27042


class Provisioner:
    def __init__(
        self,
        runner: Optional[Runner] = None,
        adb_bin: str = "adb",
        frida_servers: Optional[Dict[str, str]] = None,
        frida_dir: Optional[str] = None,
        frida_port: int = DEFAULT_FRIDA_PORT,
    ):
        self.runner = runner or SubprocessRunner()
        self.adb_bin = adb_bin
        #: explicit abi -> frida-server path, if the caller knows them
        self.frida_servers = frida_servers
        #: or a directory of frida-server-*-android-<abi> binaries to pick from
        self.frida_dir = frida_dir
        self.frida_port = frida_port

    def _adb(self, serial, *args):
        return self.runner.run([self.adb_bin, "-s", serial, *args])

    def abi(self, serial: str) -> str:
        return self._adb(serial, "shell", "getprop", "ro.product.cpu.abi").check().stdout.strip()

    def apply_settings(self, serial: str) -> None:
        for key in ("window_animation_scale", "transition_animation_scale", "animator_duration_scale"):
            self._adb(serial, "shell", "settings", "put", "global", key, "0").check()
        # Keep the screen on while plugged in, so a job does not stall on a lock screen.
        self._adb(serial, "shell", "svc", "power", "stayon", "true")

    def _select_frida(self, abi: str) -> Optional[str]:
        if self.frida_servers:
            if abi in self.frida_servers:
                return self.frida_servers[abi]
            raise ProvisionError(f"no frida-server configured for ABI {abi!r}")
        if self.frida_dir:
            matches = [p for p in glob.glob(os.path.join(self.frida_dir, "*")) if abi in os.path.basename(p)]
            if matches:
                return sorted(matches)[0]
            raise ProvisionError(f"no frida-server matching ABI {abi!r} in {self.frida_dir}")
        return None  # frida not configured; the device is still usable without it

    def push_frida(self, serial: str) -> Optional[str]:
        """Push and start frida-server, forward its port, return the host endpoint.

        Returns None when no frida-server is configured (frida is optional at D0).
        """
        src = self._select_frida(self.abi(serial))
        if src is None:
            return None
        dst = "/data/local/tmp/frida-server"
        self._adb(serial, "push", src, dst).check()
        self._adb(serial, "shell", "chmod", "755", dst).check()
        # frida-server is long-running and needs root (already granted by the backend).
        self.runner.spawn([self.adb_bin, "-s", serial, "shell", dst])
        self._adb(serial, "forward", f"tcp:{self.frida_port}", f"tcp:{self.frida_port}").check()
        return f"127.0.0.1:{self.frida_port}"

    def install_cert(self, serial: str, cert_path: str, hashed_name: Optional[str] = None) -> str:
        """Install a PEM CA certificate into the system trust store.

        Android names a system CA by the old OpenSSL subject hash plus `.0`. If
        `hashed_name` is not given, it is computed with `openssl`; when openssl
        is absent the caller must pass the name, so the step never guesses.
        """
        if hashed_name is None:
            r = self.runner.run(["openssl", "x509", "-inform", "PEM", "-subject_hash_old", "-in", cert_path])
            if r.returncode == 127:
                raise ProvisionError("openssl not found; pass hashed_name (the <hash>.0 filename Android expects)")
            if not r.ok or not r.stdout.strip():
                raise ProvisionError(f"could not hash certificate: {r.stderr.strip() or 'no output'}")
            hashed_name = r.stdout.strip().splitlines()[0] + ".0"
        dst = f"/system/etc/security/cacerts/{hashed_name}"
        self._adb(serial, "push", cert_path, dst).check()
        self._adb(serial, "shell", "chmod", "644", dst).check()
        return hashed_name

    def provision(
        self,
        serial: str,
        cert_path: Optional[str] = None,
        cert_hashed_name: Optional[str] = None,
    ) -> Dict[str, Optional[str]]:
        info: Dict[str, Optional[str]] = {"abi": self.abi(serial)}
        self.apply_settings(serial)
        info["frida_endpoint"] = self.push_frida(serial)
        info["cert"] = self.install_cert(serial, cert_path, cert_hashed_name) if cert_path else None
        return info


def ready_device(
    backend: DeviceBackend,
    provisioner: Optional[Provisioner] = None,
    golden: str = "golden",
    cert_path: Optional[str] = None,
    cert_hashed_name: Optional[str] = None,
    boot_timeout: float = 180.0,
) -> "tuple[str, Dict[str, Optional[str]]]":
    """Bring a device from nothing to a clean, ready golden snapshot.

    boot -> wait -> root -> provision -> snapshot(golden). Returns the serial and
    a summary (abi, frida_endpoint, cert, golden). This is the full D0 flow; the
    pool (D1) calls it once per device and then restores `golden` between leases.
    """
    serial = backend.boot()
    backend.wait_ready(serial, timeout=boot_timeout)
    backend.root(serial)
    info: Dict[str, Optional[str]] = {"serial": serial}
    if provisioner is not None:
        info.update(provisioner.provision(serial, cert_path=cert_path, cert_hashed_name=cert_hashed_name))
    backend.snapshot(serial, golden)
    info["golden"] = golden
    return serial, info
