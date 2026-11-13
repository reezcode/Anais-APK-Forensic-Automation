"""The static -> dynamic pipeline: run Reema's Vaccine Pack on a real device.

`run_dynamic_pass` ties the two halves of Anais together. Reema has already run
statically and produced a case directory with `reports/vaccine.json` (the
capabilities it found, each with a defense and, where content exists, a harness).
This leases a device, runs each capability's check on the app under test,
collects the observations into the case's `temp/dynamic_findings.json`, and
releases the device.

Reema then merges that file into `reports/findings.json` the next time its
report step runs (`reema findings <case>`), because the `dynamic` adapter is in
the registry. So the full flow is:

    reema analyze  ->  reports/vaccine.json
    run_dynamic_pass  ->  temp/dynamic_findings.json
    reema findings  ->  reports/findings.json (now with source "dynamic")
"""

from __future__ import annotations

from pathlib import Path
from typing import List, Optional

from dyxon.provider import DyxonProvider
from dyxon.runner import load_vaccine


def run_dynamic_pass(
    case_dir,
    provider: DyxonProvider,
    package: str,
    apk: Optional[str] = None,
    capabilities: Optional[List[str]] = None,
    backend: Optional[str] = None,
    ttl_seconds: int = 1800,
) -> dict:
    """Lease a device, run each capability check, collect runtime findings.

    `capabilities` defaults to every capability in the case's Vaccine Pack. `apk`,
    if given, is installed once before the first check. Returns a summary with the
    per-capability run results and the collect result.
    """
    case_dir = Path(case_dir)
    vaccine_path = case_dir / "reports" / "vaccine.json"
    vaccine = load_vaccine(vaccine_path) if vaccine_path.is_file() else {"entries": []}
    if capabilities is None:
        capabilities = [e.get("capability") for e in vaccine.get("entries", []) if e.get("capability")]

    runs = []
    with provider.lease(backend=backend, ttl_seconds=ttl_seconds) as session:
        session_id = session["session_id"]
        to_install = apk  # install only on the first check
        for capability in capabilities:
            runs.append(provider.run_capability(
                session_id, package, capability=capability, vaccine=vaccine, apk=to_install))
            to_install = None
        collected = provider.collect_runtime(session_id, str(case_dir / "temp"))

    return {"package": package, "capabilities": capabilities, "runs": runs, "collected": collected}
