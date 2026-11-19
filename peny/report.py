"""Render the Peny pentest report and MASVS matrix as Markdown."""

from peny.findings import MASVS_GROUPS

_SEV_ORDER = ("critical", "high", "medium", "low", "info")
_STATUS_LABEL = {
    "fail": "FAIL",
    "needs_runtime": "NEEDS RUNTIME",
    "pass": "PASS",
    "not_checked": "not checked",
    "not_applicable": "n/a",
}


def render_matrix(matrix):
    lines = ["| MASVS control | Status | Findings |", "|---|---|---|"]
    for g in MASVS_GROUPS:
        entry = matrix.get(g, {"status": "not_checked"})
        n = len(entry.get("findings", []))
        lines.append(f"| {g} | {_STATUS_LABEL.get(entry['status'], entry['status'])} | {n or ''} |")
    return "\n".join(lines) + "\n"


def _finding_md(f):
    out = [f"#### {f['severity'].upper()} — {f['title']}", ""]
    meta = [f"**MASVS:** {f['masvs']}"]
    if f.get("cwe"):
        meta.append(f"**CWE:** {', '.join(f['cwe'])}")
    if f.get("mastg"):
        meta.append(f"**MASTG:** {', '.join(f['mastg'])}")
    if f.get("needs_runtime_confirmation"):
        meta.append(f"**Runtime:** {f.get('runtime_status', 'pending')}")
    if f.get("owner"):
        meta.append(f"**Owner:** {f['owner']}")
    out.append(" · ".join(meta))
    out.append("")
    if f.get("impact"):
        out.append(f"**Impact:** {f['impact']}")
    if f.get("description"):
        out.append(f"**Detail:** {f['description']}")
    for e in f.get("evidence", [])[:5]:
        loc = e.get("file", "")
        if e.get("line"):
            loc += f":{e['line']}"
        snip = f" — `{e['snippet']}`" if e.get("snippet") else ""
        out.append(f"- `{loc}`{snip}")
    if f.get("fix"):
        out.append(f"**Fix:** {f['fix']}")
    out.append("")
    return "\n".join(out)


def render_report(doc):
    s = doc["summary"]
    auth = doc.get("authorization", {})
    sample = doc.get("sample", {})
    out = [
        "# Peny — Mobile Pentest Report",
        "",
        f"**Target:** {sample.get('file_name', '')} "
        f"(`{sample.get('package_name', '')}` {sample.get('version_name', '')})",
        f"**SHA-256:** `{sample.get('sha256', '')}`",
        f"**Authorized by:** {auth.get('authorized_by') or '—'} · **Scope:** {auth.get('scope') or '—'}",
        f"**Generated:** {doc.get('generated_at', '')} · peny {doc.get('peny_version', '')}",
        "",
        "## Summary",
        "",
        f"Total findings: **{s['total']}** "
        f"(critical {s['by_severity']['critical']}, high {s['by_severity']['high']}, "
        f"medium {s['by_severity']['medium']}, low {s['by_severity']['low']}, info {s['by_severity']['info']}). "
        f"{s['needs_runtime']} await runtime confirmation; {s['confirmed']} confirmed.",
        "",
        "## MASVS coverage",
        "",
        render_matrix(doc.get("masvs", {})),
        "## Findings",
        "",
    ]
    if not doc["findings"]:
        out.append("_No findings from the static lens._")
        return "\n".join(out) + "\n"

    by_group = {}
    for f in doc["findings"]:
        by_group.setdefault(f["masvs"], []).append(f)
    for g in MASVS_GROUPS:
        group = by_group.get(g)
        if not group:
            continue
        out.append(f"### {g}")
        out.append("")
        group.sort(key=lambda f: _SEV_ORDER.index(f["severity"]) if f["severity"] in _SEV_ORDER else 99)
        for f in group:
            out.append(_finding_md(f))
    return "\n".join(out) + "\n"
