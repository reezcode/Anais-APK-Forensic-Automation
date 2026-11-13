"""Preflight: can Dyxon run here?

`dyxon doctor` calls this to tell the user exactly what is missing before any
device is booted — the Android SDK emulator, an AVD, adb, and (optionally) a
frida-server binary. It boots nothing; it only inspects the host.
"""

from __future__ import annotations

import os
from typing import List, Optional

from dyxon.backends import get_backend
from dyxon.backends.base import Check
from dyxon.shell import Runner


def doctor(backend_name: str = "avd", frida_dir: Optional[str] = None, runner: Optional[Runner] = None) -> List[Check]:
    """Return one Check per dependency for `backend_name`, plus optional frida."""
    checks: List[Check] = list(get_backend(backend_name).availability(runner=runner))
    if frida_dir is not None:
        present = os.path.isdir(frida_dir) and any(os.scandir(frida_dir))
        checks.append(Check("frida-server", present, frida_dir if present else f"{frida_dir}: empty or missing"))
    return checks


def ok(checks: List[Check]) -> bool:
    """True when every check passed."""
    return all(c.ok for c in checks)


def render(checks: List[Check]) -> str:
    """Format checks as aligned `[ok]`/`[--]` lines for the CLI."""
    width = max((len(c.name) for c in checks), default=0)
    lines = []
    for c in checks:
        mark = "ok" if c.ok else "--"
        lines.append(f"[{mark}] {c.name.ljust(width)}  {c.detail}")
    return "\n".join(lines)
