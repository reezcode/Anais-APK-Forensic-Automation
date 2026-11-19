"""The Peny static lens: extraction -> MASVS rules -> findings + matrix.

Peny reuses Reema's static core for the extraction (unpack + analyzers) and then
re-lenses the normalized findings through the MASVS rule set. It writes only its
own report files; it never touches a Reema case.
"""

import json
from pathlib import Path

from peny import _shared, case as case_mod
from peny.findings import build_document
from peny.masvs import build_matrix
from peny.rules import STATIC_COVERAGE, to_peny


def _sample_block(target, hashes, basic_info):
    return {
        "file_name": Path(target).name,
        "size": Path(target).stat().st_size if Path(target).is_file() else None,
        "package_name": basic_info.get("package_name", ""),
        "version_name": basic_info.get("version_name", ""),
        "version_code": basic_info.get("version_code", ""),
        **hashes,
    }


def scan(target, case_dir=None, authorized_by="", scope="", offline=False, report=None):
    """Run the static pentest lens over `target`. Returns the `peny.findings/v1`
    document and writes the case to disk.

    `report` is the report renderer (injected so tests stay off disk-heavy paths);
    defaults to `peny.report`.
    """
    target = str(target)
    if not Path(target).is_file():
        raise FileNotFoundError(target)
    if report is None:
        from peny import report as report

    authorization = {"authorized_by": authorized_by, "scope": scope}
    cdir = case_mod.new_case_dir(target, case_dir)
    hashes = case_mod.hash_file(target)
    authorization["package"] = ""  # filled from basic_info below
    case_mod.write_case(cdir, target, hashes, authorization)

    # --- shared extraction (reema core) ------------------------------------
    _shared.run_static_extraction(target, cdir, hashes["sha256"], offline=offline)
    raw_findings, _raw_sources = _shared.collect_findings(cdir)
    basic_info = _shared.read_basic_info(cdir)
    authorization["package"] = basic_info.get("package_name", "")

    # --- re-lens to MASVS --------------------------------------------------
    peny_findings = [pf for pf in (to_peny(f) for f in raw_findings) if pf is not None]
    sources = sorted({pf.source for pf in peny_findings})
    matrix = build_matrix(peny_findings, STATIC_COVERAGE)
    doc = build_document(
        peny_findings,
        sample=_sample_block(target, hashes, basic_info),
        authorization=authorization,
        sources=sources,
        matrix=matrix,
    )

    # --- write Peny's own reports (never a Reema file) ---------------------
    reports = cdir / "reports"
    (reports / "peny_findings.json").write_text(json.dumps(doc, indent=2))
    (reports / "masvs.json").write_text(json.dumps(matrix, indent=2))
    (reports / "masvs.md").write_text(report.render_matrix(matrix))
    (reports / "report.md").write_text(report.render_report(doc))
    (reports / "report.json").write_text(json.dumps(doc, indent=2))

    return doc, cdir
