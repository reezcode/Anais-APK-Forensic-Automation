"""Reema command line.

    python3 -m reema analyze <sample> [options]     full static run into a new case
    python3 -m reema findings <case_dir>            (re)build reports/findings.json

`analyze` stages:
    1. case     create <workspace>/<stem>_<UTC time>/ and case.json, hash the input
    2. engine   APK family: anais.sh (legacy engine); JAR: reema/jar.py
    3. index    androguard code index -> temp/code_index.db       (--no-index skips)
    4. enrich   hash reputation -> temp/enrichment.json            (--offline: cache only)
    5. findings reports/findings.json
    6. record   hash every artifact into case.json

A failed stage is logged in case.json and the run continues; only a failed
engine run stops it. See docs/reema/README.md.
"""

import argparse
import json
import os
import subprocess
import sys
from datetime import datetime, timezone
from pathlib import Path

from reema import __version__, enrich, index, jar
from reema.adapters import collect
from reema.case import Case, hash_file
from reema.findings import build_document

ROOT = Path(__file__).resolve().parent.parent
LEGACY_ENGINE = ROOT / "anais.sh"
APK_INPUTS = {".apk", ".xapk", ".apkm", ".apks", ".aab"}
JAR_INPUTS = {".jar"}


def _sample_info(case_dir, sample=None):
    info = {}
    try:
        basic = json.loads((Path(case_dir) / "temp" / "basic_info.json").read_text(encoding="utf-8"))
        info = {k: basic[k] for k in ("package_name", "version_name", "version_code", "format") if basic.get(k)}
    except (OSError, ValueError):
        pass
    if sample and Path(sample).is_file():
        info["file_name"] = Path(sample).name
        info["size"] = Path(sample).stat().st_size
        info.update(hash_file(sample))
    return info


def write_findings(case_dir, sample=None):
    """Build <case_dir>/reports/findings.json from the analyzer outputs. Returns (path, document)."""
    case_dir = Path(case_dir)
    findings, sources = collect(case_dir)
    doc = build_document(findings, sample=_sample_info(case_dir, sample))
    doc["sources"] = sources
    doc["reema_version"] = __version__
    out = case_dir / "reports" / "findings.json"
    out.parent.mkdir(parents=True, exist_ok=True)
    out.write_text(json.dumps(doc, indent=2), encoding="utf-8")
    return out, doc


def _workspace():
    if os.environ.get("ANAIS_WORKSPACE"):
        return Path(os.environ["ANAIS_WORKSPACE"]).expanduser()
    try:
        cfg = json.loads((ROOT / "analyzer_config.json").read_text(encoding="utf-8"))
        ws = cfg.get("paths", {}).get("workspace")
        if ws:
            return Path(ws).expanduser()
    except (OSError, ValueError):
        pass
    return Path.home() / ".anais" / "reports"


def _new_case_dir(sample):
    stamp = datetime.now(timezone.utc).strftime("%Y%m%d_%H%M%SZ")
    return _workspace() / f"{sample.stem}_{stamp}"


def _base_apk(case_dir, fallback):
    """The APK anais.sh actually analyzed (bundles resolve to their base split)."""
    try:
        prep = json.loads((case_dir / "temp" / "prepare_input.json").read_text(encoding="utf-8"))
        base = prep.get("base_apk")
        if base and Path(base).is_file():
            return Path(base)
    except (OSError, ValueError):
        pass
    return fallback


def _run_engine(sample, case_dir, rules, case):
    if sample.suffix.lower() in JAR_INPUTS:
        sha256 = case.record["inputs"][0]["sha256"]
        results = jar.run(sample, case_dir, sha256, rules=rules, case=case)
        # jadx exits non-zero on partial decompile errors; only a missing tree is fatal.
        return 0 if any((case_dir / "jadx_output").iterdir()) else dict(results).get("jadx", 1)

    cmd = [str(LEGACY_ENGINE)]
    for rule in rules or []:
        cmd += ["-y", rule]
    cmd.append(str(sample))
    env = {**os.environ, "ANAIS_CASE_DIR": str(case_dir)}
    rc = subprocess.call(cmd, env=env)
    case.log("engine:anais.sh", "ok" if rc == 0 else "error", "" if rc == 0 else f"exit {rc}")
    return rc


def _stage_index(target, case_dir, case):
    out = case_dir / "temp" / "code_index.db"
    try:
        summary = index.build(target, out)
    except Exception as e:  # androguard raises many types on malformed DEX
        case.log("index", "error", str(e))
        return
    (case_dir / "temp" / "code_index.json").write_text(json.dumps(summary, indent=2))
    if not summary["dex_present"]:
        case.log("index", "skipped", "no DEX in sample (JVM-only JAR, backlog B3)")
    else:
        case.log("index", "ok", f"{summary['classes']} classes, {summary['api_calls']} API calls")


def _stage_enrich(case_dir, case, offline):
    sha256 = case.record["inputs"][0]["sha256"]
    doc = enrich.run(sha256, offline=offline, case=case)
    (case_dir / "temp" / "enrichment.json").write_text(json.dumps(doc, indent=2))
    statuses = ", ".join(f"{k}={v['status']}" for k, v in doc["providers"].items())
    case.log("enrich", "ok", statuses)


def _record_artifacts(case_dir, case):
    producers = {
        "decompiled": "apktool", "jadx_output": "jadx",
        "temp/code_index.db": "reema.index", "temp/enrichment.json": "reema.enrich",
    }
    for rel, producer in producers.items():
        case.add_artifact(case_dir / rel, producer)
    for p in sorted((case_dir / "reports").glob("*")):
        if p.is_file():
            case.add_artifact(p, "reema.findings" if p.name == "findings.json" else "report")


def cmd_analyze(args):
    sample = Path(args.sample)
    if not sample.is_file():
        print(f"reema: sample not found: {sample}", file=sys.stderr)
        return 2
    if sample.suffix.lower() not in APK_INPUTS | JAR_INPUTS:
        print(f"reema: unsupported input type {sample.suffix!r}", file=sys.stderr)
        return 2

    case_dir = Path(args.case_dir) if args.case_dir else _new_case_dir(sample)
    case = Case.create(case_dir, analyst=args.analyst)
    case.add_input(sample, "original")
    case.save()
    print(f"reema: case {case.record['case_id']} -> {case_dir}")

    rc = _run_engine(sample, case_dir, args.yara, case)
    if rc != 0:
        case.save()
        print(f"reema: engine failed (exit {rc}); see {case.path}", file=sys.stderr)
        return rc

    target = sample
    if sample.suffix.lower() in APK_INPUTS:
        target = _base_apk(case_dir, sample)
        if target.resolve() != sample.resolve():
            case.add_input(target, "base_apk")

    if not args.no_index:
        _stage_index(target, case_dir, case)
    if not args.no_enrich:
        _stage_enrich(case_dir, case, offline=args.offline)

    out, doc = write_findings(case_dir, sample=sample)
    case.log("findings", "ok", f"{doc['summary']['total']} findings")
    _record_artifacts(case_dir, case)
    case.complete()

    s = doc["summary"]
    print(f"reema: {s['total']} findings (malice={s['by_axis']['malice']}, "
          f"malice in app code={s['malice_by_owner']['app']}) -> {out}")
    return 0


def cmd_findings(args):
    case_dir = Path(args.case_dir)
    if not (case_dir / "temp").is_dir():
        print(f"reema: {case_dir} is not a case directory (no temp/)", file=sys.stderr)
        return 2
    out, doc = write_findings(case_dir, sample=args.sample)
    s = doc["summary"]
    print(f"reema: {s['total']} findings "
          f"(malice={s['by_axis']['malice']}, posture={s['by_axis']['posture']}, "
          f"context={s['by_axis']['context']}) -> {out}")
    return 0


def build_parser():
    p = argparse.ArgumentParser(prog="reema", description="Reema: Android malware analysis & forensics")
    p.add_argument("--version", action="version", version=f"reema {__version__}")
    sub = p.add_subparsers(dest="command", required=True)

    a = sub.add_parser("analyze", help="run a full static analysis on a sample")
    a.add_argument("sample", help="path to .apk/.xapk/.apkm/.apks/.aab/.jar")
    a.add_argument("-y", "--yara", action="append", help="extra YARA rule file (repeatable)")
    a.add_argument("--analyst", help="name recorded in case.json (default: $REEMA_ANALYST or login)")
    a.add_argument("--case-dir", help="use this case directory instead of a new one")
    a.add_argument("--offline", action="store_true", help="send nothing online; use cached enrichment only")
    a.add_argument("--no-enrich", action="store_true", help="skip enrichment entirely")
    a.add_argument("--no-index", action="store_true", help="skip the code index")
    a.set_defaults(func=cmd_analyze)

    f = sub.add_parser("findings", help="build reports/findings.json for an existing case directory")
    f.add_argument("case_dir", help="case directory created by an analysis run")
    f.add_argument("--sample", help="analyzed file; its hashes are recorded in the document")
    f.set_defaults(func=cmd_findings)
    return p


def main(argv=None):
    args = build_parser().parse_args(argv)
    return args.func(args)
