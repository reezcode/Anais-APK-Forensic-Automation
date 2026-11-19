"""The one-way seam to Reema's static core.

This module is the *only* place Peny reaches into Reema. It re-exports the shared
extraction primitives Peny is allowed to depend on, and names the Reema modules
Peny must never import. Keeping the boundary in one file makes it auditable and
makes the contract test (tests/test_peny.py) cheap to write.

Rule (docs/peny ADR 0001): the dependency graph is

    peny -> shared static core <- reema          (no cycle)

Peny depends on a documented *contract* — the Evidence type and the severity
machinery, plus (from P1) the raw-extraction entry points — never on Reema's
verdict / capability / vaccine / classify internals.
"""

# --- allowed: shared primitives reused unchanged -------------------------------
# Evidence is the shared location type; severity normalization keeps Peny and
# Reema spelling identical so findings diff cleanly across both tools.
from reema.findings import (  # noqa: F401  (re-exported for Peny modules)
    SEVERITIES,
    Evidence,
    normalize_severity,
)

# --- forbidden: Reema's analysis lenses ---------------------------------------
# Peny must not import these. The contract test asserts that importing `peny`
# pulls none of them in. Listed here as the single source of truth.
FORBIDDEN_REEMA_MODULES = (
    "reema.verdict",
    "reema.capabilities",
    "reema.vaccine",
    "reema.classify",
)

# --- allowed: shared extraction pipeline --------------------------------------
# Reema's APK engine (reema.apk) and adapters (reema.adapters) import only the
# shared static modules (_axml, _legacy, index, findings) — never a lens. Peny
# drives them to unpack + run the analyzers, then reads the normalized Findings.
# Imported lazily so `import peny` stays cheap and pulls no androguard.

def run_static_extraction(apk, case_dir, sha256, rules=None, offline=False):
    """Unpack `apk` into `case_dir` and run the shared analyzers (writes the raw
    JSON into `case_dir/temp/`). Returns the engine's [(stage, exit_code), ...]."""
    from reema import apk as reema_apk

    return reema_apk.run(apk, case_dir, sha256, rules=rules, offline=offline)


def collect_findings(case_dir):
    """Return `(findings, sources_read)` from the raw analyzer JSON already written
    under `case_dir/temp/`. `findings` is the normalized `reema.findings.Finding`
    list Peny re-lenses; it carries axis + owner tags but no verdict."""
    from reema import adapters

    return adapters.collect(case_dir)


def read_basic_info(case_dir):
    """Read `temp/basic_info.json` (package, version, components) if present."""
    import json
    from pathlib import Path

    try:
        return json.loads((Path(case_dir) / "temp" / "basic_info.json").read_text(encoding="utf-8"))
    except (OSError, ValueError):
        return {}


__all__ = [
    "SEVERITIES",
    "Evidence",
    "normalize_severity",
    "FORBIDDEN_REEMA_MODULES",
    "run_static_extraction",
    "collect_findings",
    "read_basic_info",
]
