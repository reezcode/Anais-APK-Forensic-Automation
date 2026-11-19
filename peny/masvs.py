"""The MASVS coverage matrix.

Every control group gets a status so the report shows what was assessed, not just
what failed. Absence of a finding never silently means "secure": a group is only
`pass` when the static lens actually covers it (peny.rules.STATIC_COVERAGE).
"""

from peny.findings import MASVS_GROUPS


def build_matrix(findings, coverage=None):
    """Return {MASVS-GROUP: {status, findings?}} for every control group.

    status:
      fail          one or more findings
      needs_runtime every finding in the group still awaits dynamic confirmation
      pass          group is statically covered and had no finding
      not_checked   group is not statically covered and had no finding
    `coverage` is the set of groups the static lens evaluates; default is all
    groups (so every clean group reads `pass`).
    """
    covered = set(coverage) if coverage is not None else set(MASVS_GROUPS)
    matrix = {}

    for f in findings:
        group = matrix.setdefault(f.masvs, {"status": "fail", "findings": [], "_all_pending": True})
        group["findings"].append(f.id)
        resolved = not f.needs_runtime_confirmation or f.runtime_status in ("confirmed", "refuted")
        if resolved:
            group["_all_pending"] = False
    for group in matrix.values():
        if group.pop("_all_pending"):
            group["status"] = "needs_runtime"

    for g in MASVS_GROUPS:
        if g in matrix:
            continue
        matrix[g] = {"status": "pass" if g in covered else "not_checked"}

    # Stable, human order: by control group name.
    return {g: matrix[g] for g in MASVS_GROUPS}
