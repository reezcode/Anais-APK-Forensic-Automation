"""The capability runner: run a Vaccine Pack check on a leased device.

Reema produces a Vaccine Pack (reports/vaccine.json, schema reema.vaccine/v1):
for each capability it found, a defense and a check, and optionally a runnable
harness. Dyxon runs that harness against an app under test on a leased device
and records what happened as a runtime observation.

The runner is content-free. The *mechanism* lives here (install the app, resolve
and invoke the harness, capture the result); the *harness logic* for a real
capability is Reema content (backlog B14). One neutral example harness ships in
dyxon/harnesses/example.py to show the contract.

A harness is a callable `run(ctx) -> dict`, named in the Vaccine Pack entry as
`defense.harness.module = "dotted.module:function"` (function defaults to `run`).
It must obey the ADR 0003 guardrails: act on the app under test only, send
nothing off-device, no persistence, minimal action, report pass/fail.

Observations are written as dynamic_findings.json (schema dyxon.dynamic/v1),
which Reema's `dynamic` adapter merges into findings.json (reema.findings/v1).
"""

from __future__ import annotations

import importlib
import json
import time
from dataclasses import dataclass
from pathlib import Path
from typing import Callable, List, Optional

from dyxon.shell import RunResult, Runner, SubprocessRunner

DYNAMIC_SCHEMA = "dyxon.dynamic/v1"


@dataclass
class HarnessContext:
    """What a harness is given. Everything it may touch, and nothing more."""

    serial: str
    package: str  # the app under test
    adb: Callable[..., RunResult]  # adb(*args) -> RunResult, already bound to -s <serial>
    capability: str
    frida_endpoint: Optional[str] = None


class CapabilityRunner:
    """Runs checks/detonation on one leased device (by serial)."""

    def __init__(self, runner: Optional[Runner], serial: str, adb_bin: str = "adb",
                 frida_endpoint: Optional[str] = None, sleep=time.sleep):
        self.runner = runner or SubprocessRunner()
        self.serial = serial
        self.adb_bin = adb_bin
        self.frida_endpoint = frida_endpoint
        self._sleep = sleep  # injectable, so detonation does not really sleep in tests

    def _adb(self, *args) -> RunResult:
        return self.runner.run([self.adb_bin, "-s", self.serial, *args])

    def install(self, apk: str) -> None:
        self._adb("install", "-r", apk).check()

    @staticmethod
    def _resolve_harness(spec: str) -> Callable:
        module_path, _, func = spec.partition(":")
        module = importlib.import_module(module_path)
        return getattr(module, func or "run")

    def run_capability(self, capability: str, entry: dict, package: str, apk: Optional[str] = None) -> dict:
        """Run the harness for one capability; return a runtime observation.

        When the entry has no harness module (the default, until B14 content
        lands), the observation is `no_harness`: the check must be run manually.
        """
        if apk:
            self.install(apk)
        base = {
            "capability": capability,
            "axis": "posture",  # a Vaccine check measures the app-under-test's posture
            "severity": entry.get("severity", "info"),
            "title": entry.get("title", capability),
            "attck": entry.get("attck", []),
        }
        module = ((entry.get("defense") or {}).get("harness") or {}).get("module")
        if not module:
            return {**base, "status": "no_harness", "detail": "no harness defined; run the check manually", "evidence": []}
        try:
            fn = self._resolve_harness(module)
            ctx = HarnessContext(self.serial, package, self._adb, capability, self.frida_endpoint)
            result = fn(ctx) or {}
        except Exception as e:  # a bad harness must not crash the broker
            return {**base, "status": "error", "detail": f"harness error: {e}", "evidence": []}
        return {
            **base,
            "status": result.get("status", "observed"),
            "severity": result.get("severity", base["severity"]),
            "detail": result.get("detail", ""),
            "evidence": result.get("evidence", []),
        }

    def detonate(self, package: str, apk: Optional[str] = None, duration: float = 5.0) -> dict:
        """Launch an app, let it run, and report crash lines from logcat.

        A minimal detonation profile: start the launcher activity, wait, read
        logcat. Deeper runtime capture (pcap, DEX dumps, Frida traces) is REA's
        job on the leased device, or backlog D-C2.
        """
        if apk:
            self.install(apk)
        self._adb("logcat", "-c")  # clear, so we only see this run
        self._adb("shell", "monkey", "-p", package, "-c", "android.intent.category.LAUNCHER", "1")
        self._sleep(duration)
        logcat = self._adb("logcat", "-d", "-v", "brief")
        crashes = [ln for ln in logcat.stdout.splitlines() if "FATAL EXCEPTION" in ln or "ANR in" in ln]
        return {
            "capability": "detonation",
            "axis": "context",
            "severity": "info",
            "title": f"Detonated {package}",
            "status": "observed",
            "detail": f"ran {package} for {duration:g}s; {len(crashes)} crash line(s)",
            "evidence": crashes[:5],
            "attck": [],
        }


def build_dynamic_findings(session_info: dict, observations: List[dict], errors=None) -> dict:
    return {
        "tool": "dyxon",
        "schema": DYNAMIC_SCHEMA,
        "session": session_info,
        "observations": observations,
        "errors": errors or [],
    }


def write_dynamic_findings(out_dir: str, doc: dict) -> str:
    """Write dynamic_findings.json into out_dir (a case's temp/) and return its path."""
    path = Path(out_dir) / "dynamic_findings.json"
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(doc, indent=2), encoding="utf-8")
    return str(path)


def load_vaccine(vaccine) -> dict:
    """Accept a vaccine.json path or an already-loaded dict."""
    if isinstance(vaccine, dict):
        return vaccine
    return json.loads(Path(vaccine).read_text(encoding="utf-8"))


def vaccine_entry(vaccine, capability: str) -> dict:
    """Find the entry for `capability` in a Vaccine Pack, or a minimal stub."""
    doc = load_vaccine(vaccine)
    for entry in doc.get("entries", []) or []:
        if entry.get("capability") == capability:
            return entry
    return {"capability": capability}
