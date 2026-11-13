"""Command execution, behind one small interface.

Every host and device command Dyxon runs goes through a Runner. The default
runner shells out with subprocess; tests inject a fake runner that returns
scripted results, so the backend and provisioner are testable without a real
emulator, adb or frida-server.

Two kinds of command:
- `run` — a blocking command that finishes and yields output (adb shell, push).
- `spawn` — a long-running process that stays alive (the emulator itself).
"""

from __future__ import annotations

import shlex
import subprocess
from dataclasses import dataclass, field
from typing import List, Optional, Protocol

from dyxon.errors import CommandError


@dataclass
class RunResult:
    """The outcome of a blocking command."""

    cmd: List[str]
    returncode: int
    stdout: str = ""
    stderr: str = ""

    @property
    def ok(self) -> bool:
        return self.returncode == 0

    def check(self) -> "RunResult":
        """Raise CommandError unless the command succeeded; else return self."""
        if not self.ok:
            raise CommandError(self.cmd, self.returncode, self.stderr)
        return self


@dataclass
class SpawnHandle:
    """A reference to a spawned, still-running process."""

    cmd: List[str]
    pid: Optional[int] = None
    _popen: Optional[subprocess.Popen] = field(default=None, repr=False)

    def terminate(self) -> None:
        if self._popen is not None and self._popen.poll() is None:
            self._popen.terminate()


class Runner(Protocol):
    """What the backend and provisioner need to execute commands."""

    def run(self, cmd: List[str], timeout: Optional[float] = None) -> RunResult: ...

    def spawn(self, cmd: List[str]) -> SpawnHandle: ...


class SubprocessRunner:
    """The real runner: blocking commands via subprocess.run, long-running via Popen."""

    def run(self, cmd: List[str], timeout: Optional[float] = None) -> RunResult:
        try:
            p = subprocess.run(cmd, capture_output=True, text=True, timeout=timeout)
        except FileNotFoundError:
            # The executable itself is missing; report it as a failed command
            # rather than letting the OSError escape, so callers see one error type.
            return RunResult(cmd, 127, "", f"{cmd[0]}: not found")
        except subprocess.TimeoutExpired as e:
            return RunResult(cmd, 124, e.stdout or "", f"timed out after {timeout}s")
        return RunResult(cmd, p.returncode, p.stdout or "", p.stderr or "")

    def spawn(self, cmd: List[str]) -> SpawnHandle:
        p = subprocess.Popen(cmd, stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL)
        return SpawnHandle(cmd=cmd, pid=p.pid, _popen=p)


def as_cmd(text: str) -> List[str]:
    """Split a command string into argv, for readable call sites in tests."""
    return shlex.split(text)
