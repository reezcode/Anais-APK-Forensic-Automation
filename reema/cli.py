"""Reema command line.

    python3 -m reema analyze <sample> [-y rules.yar ...]   full static run
    python3 -m reema findings <case_dir>                   (re)build findings.json

In P0, `analyze` delegates the static run to the legacy engine (anais.sh) and
then normalizes its output. Later phases replace the engine stage by stage;
the CLI contract stays the same. See docs/reema/roadmap.md.
"""

import argparse
import hashlib
import json
import os
import subprocess
import sys
import time
from pathlib import Path

from reema import __version__
from reema.adapters import collect
from reema.findings import build_document

ROOT = Path(__file__).resolve().parent.parent
LEGACY_ENGINE = ROOT / "anais.sh"
SUPPORTED_INPUTS = {".apk", ".xapk", ".apkm", ".apks", ".aab"}


def _hashes(path):
    """Hash the sample in Python so the case record does not depend on shell tools."""
    digests = {"md5": hashlib.md5(), "sha1": hashlib.sha1(), "sha256": hashlib.sha256()}
    with open(path, "rb") as f:
        for chunk in iter(lambda: f.read(1 << 20), b""):
            for d in digests.values():
                d.update(chunk)
    return {name: d.hexdigest() for name, d in digests.items()}


def _sample_info(case_dir, sample=None):
    info = {}
    try:
        basic = json.loads((Path(case_dir) / "temp" / "basic_info.json").read_text(encoding="utf-8"))
        info = {k: basic[k] for k in ("package_name", "version_name", "version_code") if basic.get(k)}
    except (OSError, ValueError):
        pass
    if sample and Path(sample).is_file():
        info["file_name"] = Path(sample).name
        info["size"] = Path(sample).stat().st_size
        info.update(_hashes(sample))
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


def _latest_case(workspace, stem, since):
    """anais.sh names the case <stem>_<timestamp>; pick the newest one it just made."""
    candidates = [p for p in Path(workspace).glob(f"{stem}_*")
                  if p.is_dir() and p.stat().st_mtime >= since]
    return max(candidates, key=lambda p: p.stat().st_mtime) if candidates else None


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


def cmd_analyze(args):
    sample = Path(args.sample)
    if not sample.is_file():
        print(f"reema: sample not found: {sample}", file=sys.stderr)
        return 2
    if sample.suffix.lower() == ".jar":
        # JAR intake (no manifest/resources, jadx only) lands in P1.
        print("reema: .jar input is planned for P1; see docs/reema/roadmap.md", file=sys.stderr)
        return 2
    if sample.suffix.lower() not in SUPPORTED_INPUTS:
        print(f"reema: unsupported input type {sample.suffix!r}", file=sys.stderr)
        return 2

    cmd = [str(LEGACY_ENGINE)]
    for rule in args.yara or []:
        cmd += ["-y", rule]
    cmd.append(str(sample))

    started = time.time()
    # anais.sh already writes findings.json at the end of its run.
    rc = subprocess.call(cmd)
    if rc != 0:
        return rc
    case = _latest_case(_workspace(), sample.stem, started)
    if case:
        print(f"reema: findings -> {case / 'reports' / 'findings.json'}")
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
    a.add_argument("sample", help="path to .apk/.xapk/.apkm/.apks/.aab")
    a.add_argument("-y", "--yara", action="append", help="extra YARA rule file (repeatable)")
    a.set_defaults(func=cmd_analyze)

    f = sub.add_parser("findings", help="build reports/findings.json for an existing case directory")
    f.add_argument("case_dir", help="case directory created by an analysis run")
    f.add_argument("--sample", help="analyzed file; its hashes are recorded in the document")
    f.set_defaults(func=cmd_findings)
    return p


def main(argv=None):
    args = build_parser().parse_args(argv)
    return args.func(args)
