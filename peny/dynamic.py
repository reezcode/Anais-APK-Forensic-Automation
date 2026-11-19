"""The dynamic confirm track (P2): prove static findings on a leased device.

Peny does not own devices. It leases one from Dyxon (the same provider Aegis and
REA use) and drives tier-0 Frida harnesses to flip a static finding's
`needs_runtime_confirmation` to `confirmed` or `refuted`. The Frida execution is
behind an injectable `FridaRunner`, so the confirm logic is unit-tested without a
live emulator — the same pattern Dyxon uses for its shell Runner.

Flow (mirrors dyxon.pipeline.run_dynamic_pass):

    peny analyze           -> reports/peny_findings.json  (some needs_runtime)
    peny confirm (here)    -> lease device, run harnesses, flip runtime_status
                              -> rewrite reports + reports/peny_dynamic.json

Tier-1: a user-supplied .js is run as-is and its messages are recorded as an
observation for the operator to read; it does not auto-flip a finding.
"""

import json
import time
from pathlib import Path

from peny._shared import Evidence
from peny.findings import PenyFinding, build_document
from peny.masvs import build_matrix
from peny.rules import STATIC_COVERAGE

HARNESSES_DIR = Path(__file__).resolve().parent / "harnesses"

# Peny finding source -> (tier-0 script, the `check` name its send() carries).
# A source with no entry has no tier-0 harness and stays pending (manual/tier-1).
HARNESS_MAP = {
    "crypto": ("crypto_hooks.js", "weak_cipher"),
    "network": ("ssl_pinning_bypass.js", "pinning"),
    "storage": ("storage_dump.js", "plaintext_secret"),
    "resilience": ("root_detection_bypass.js", "root_detection"),
}


# --- Frida execution boundary (injectable) ------------------------------------

class FridaRunner:
    """Load a script against an app on a device and return its send() messages.

    Contract: run_script(package, script_path, timeout) ->
        {"messages": [<send payload dict>, ...], "error": str | None}
    """

    def run_script(self, package, script_path, timeout=20):  # pragma: no cover - interface
        raise NotImplementedError


class FridaBindingRunner(FridaRunner):
    """Real runner over the `frida` Python binding. Needs a device + frida-server;
    not exercised by the hermetic tests."""

    def __init__(self, serial, spawn=True, settle=5.0, sleep=time.sleep):
        self.serial = serial
        self.spawn = spawn
        self.settle = settle
        self._sleep = sleep

    def run_script(self, package, script_path, timeout=20):
        try:
            import frida
        except Exception as e:  # frida not installed
            return {"messages": [], "error": f"frida unavailable: {e}"}
        messages = []
        try:
            device = frida.get_device(self.serial) if self.serial else frida.get_usb_device()
            pid = device.spawn([package]) if self.spawn else device.get_frontmost_application().pid
            session = device.attach(pid)
            script = session.create_script(Path(script_path).read_text(encoding="utf-8"))
            script.on("message", lambda m, d: m.get("type") == "send" and messages.append(m.get("payload")))
            script.load()
            if self.spawn:
                device.resume(pid)
            self._sleep(min(timeout, self.settle))
            session.detach()
        except Exception as e:  # a device/hook failure must not crash the pass
            return {"messages": messages, "error": str(e)}
        return {"messages": messages, "error": None}


# --- confirm logic ------------------------------------------------------------

def _interpret(messages, check):
    """Read a harness's messages for one check into (status, detail) or
    (None, reason) when there is no decisive signal."""
    seen = [m for m in messages if isinstance(m, dict) and m.get("check") == check]
    confirmed = [m for m in seen if m.get("confirmed")]
    if confirmed:
        return "confirmed", confirmed[0].get("detail", "confirmed at runtime")
    if seen:
        return "refuted", seen[0].get("detail", "not reproduced at runtime")
    return None, "no runtime signal"


def confirm(findings, session, frida_runner, package, harnesses_dir=HARNESSES_DIR):
    """Run tier-0 harnesses and flip runtime_status on pending findings in place.

    Returns a list of observation dicts (one per harness run) for the dynamic
    record. Each script runs once; its messages serve every finding of that source.
    """
    serial = session.get("serial", "")
    device = f"device:{serial}" if serial else "device"
    pending_sources = {
        f.source for f in findings
        if f.needs_runtime_confirmation and f.runtime_status in (None, "pending") and f.source in HARNESS_MAP
    }

    observations = []
    results = {}  # source -> (status-decider inputs)
    for source in sorted(pending_sources):
        script, check = HARNESS_MAP[source]
        run = frida_runner.run_script(package, str(Path(harnesses_dir) / script), timeout=20)
        results[source] = run
        observations.append({
            "source": source, "script": script, "check": check,
            "error": run.get("error"), "messages": run.get("messages", []),
        })

    for f in findings:
        if not (f.needs_runtime_confirmation and f.runtime_status in (None, "pending")):
            continue
        run = results.get(f.source)
        if run is None:
            continue  # no tier-0 harness for this source; stays pending
        if run.get("error"):
            continue  # couldn't run; honestly leave it pending
        _, check = HARNESS_MAP[f.source]
        status, detail = _interpret(run.get("messages", []), check)
        if status is None:
            continue
        f.runtime_status = status
        f.evidence = list(f.evidence) + [Evidence(file=device, snippet=detail)]

    return observations


def run_confirm(case_dir, session, frida_runner, package=None, user_script=None):
    """Load a Peny case, confirm its findings on `session`, rewrite the reports.

    `package` defaults to the case's analysed package. Returns a summary dict.
    """
    from peny import report as report_mod

    case_dir = Path(case_dir)
    doc = json.loads((case_dir / "reports" / "peny_findings.json").read_text(encoding="utf-8"))
    package = package or (doc.get("sample", {}) or {}).get("package_name", "") or \
        (doc.get("authorization", {}) or {}).get("package", "")

    findings = [PenyFinding.from_dict(d) for d in doc.get("findings", [])]
    observations = confirm(findings, session, frida_runner, package)

    if user_script:
        run = frida_runner.run_script(package, str(user_script), timeout=30)
        observations.append({"source": "user_script", "script": str(user_script),
                             "check": "user_script", "error": run.get("error"),
                             "messages": run.get("messages", [])})

    matrix = build_matrix(findings, STATIC_COVERAGE)
    new_doc = build_document(
        findings,
        sample=doc.get("sample"),
        authorization=doc.get("authorization"),
        sources=doc.get("sources"),
        matrix=matrix,
    )

    reports = case_dir / "reports"
    (reports / "peny_findings.json").write_text(json.dumps(new_doc, indent=2))
    (reports / "masvs.json").write_text(json.dumps(matrix, indent=2))
    (reports / "masvs.md").write_text(report_mod.render_matrix(matrix))
    (reports / "report.md").write_text(report_mod.render_report(new_doc))
    (reports / "report.json").write_text(json.dumps(new_doc, indent=2))
    (reports / "peny_dynamic.json").write_text(json.dumps(
        {"schema": "peny.dynamic/v1", "session": session, "observations": observations}, indent=2))

    return {
        "package": package,
        "confirmed": new_doc["summary"]["confirmed"],
        "needs_runtime": new_doc["summary"]["needs_runtime"],
        "observations": len(observations),
    }


def lease_and_confirm(case_dir, provider=None, package=None, backend=None,
                      user_script=None, ttl_seconds=1800):
    """Lease a device from Dyxon and run the confirm pass on it.

    `provider` is a dyxon.provider.DyxonProvider (imported lazily so Peny does not
    hard-depend on Dyxon). Builds a real FridaBindingRunner from the lease.
    """
    if provider is None:
        from dyxon.broker import Broker
        from dyxon.mcp_server import pool_from_env
        from dyxon.provider import DyxonProvider
        provider = DyxonProvider(Broker(pool_from_env()))

    with provider.lease(backend=backend, ttl_seconds=ttl_seconds) as session:
        runner = FridaBindingRunner(serial=session.get("serial", ""))
        return run_confirm(case_dir, session, runner, package=package, user_script=user_script)
