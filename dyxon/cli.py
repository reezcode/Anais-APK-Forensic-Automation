"""Dyxon command line.

D0 commands:
  doctor  — check host dependencies; exit non-zero if any are missing
  up      — boot one device, make it ready, take the golden snapshot
  down    — destroy a device

The pool and the MCP broker (D1-D2) add their own commands later. `up`/`down`
operate on a single device by its AVD name and port; the broker will manage many.
"""

from __future__ import annotations

import argparse
import json

from dyxon import __version__
from dyxon.backends.avd import AvdBackend
from dyxon.errors import DyxonError
from dyxon.preflight import doctor, ok, render
from dyxon.provision import Provisioner, ready_device


def cmd_doctor(args) -> int:
    checks = doctor(backend_name=args.backend, frida_dir=args.frida_dir)
    print(render(checks))
    passed = ok(checks)
    print("\nready" if passed else "\nnot ready: install the items marked [--]")
    return 0 if passed else 1


def cmd_up(args) -> int:
    backend = AvdBackend(args.avd, port=args.port)
    provisioner = None
    if args.frida_dir or args.cert:
        provisioner = Provisioner(frida_dir=args.frida_dir)
    serial, info = ready_device(
        backend, provisioner, golden=args.golden, cert_path=args.cert, boot_timeout=args.timeout
    )
    print(json.dumps(info, indent=2))
    return 0


def cmd_down(args) -> int:
    backend = AvdBackend(args.avd, port=args.port)
    backend.destroy(backend.serial)
    print(f"destroyed {backend.serial}")
    return 0


def build_parser() -> argparse.ArgumentParser:
    p = argparse.ArgumentParser(prog="dyxon", description="Dyxon: Android sandbox broker for dynamic analysis")
    p.add_argument("--version", action="version", version=f"dyxon {__version__}")
    sub = p.add_subparsers(dest="command", required=True)

    d = sub.add_parser("doctor", help="check host dependencies without booting anything")
    d.add_argument("--backend", default="avd", help="backend to check (default: avd)")
    d.add_argument("--frida-dir", help="directory of frida-server binaries to verify")
    d.set_defaults(func=cmd_doctor)

    u = sub.add_parser("up", help="boot a device, make it ready, take the golden snapshot")
    u.add_argument("avd", help="AVD name (see `emulator -list-avds`)")
    u.add_argument("--port", type=int, default=5554, help="emulator console port (default: 5554)")
    u.add_argument("--frida-dir", help="directory of frida-server-*-android-<abi> binaries")
    u.add_argument("--cert", help="PEM CA certificate to install into the system trust store")
    u.add_argument("--golden", default="golden", help="snapshot name to save (default: golden)")
    u.add_argument("--timeout", type=float, default=180.0, help="boot timeout in seconds (default: 180)")
    u.set_defaults(func=cmd_up)

    w = sub.add_parser("down", help="destroy a device")
    w.add_argument("avd", help="AVD name (used only for logging)")
    w.add_argument("--port", type=int, default=5554, help="emulator console port (default: 5554)")
    w.set_defaults(func=cmd_down)

    return p


def main(argv=None) -> int:
    args = build_parser().parse_args(argv)
    try:
        return args.func(args)
    except DyxonError as e:
        print(f"dyxon: {e}", flush=True)
        return 2


if __name__ == "__main__":
    raise SystemExit(main())
