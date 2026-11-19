"""Peny case directory and `case.json`.

Peny keeps its own minimal case record rather than reuse Reema's, so the two
tools never share a case directory or overwrite each other's files (ADR 0001).
"""

import hashlib
import json
import os
from datetime import datetime, timezone
from pathlib import Path

SCHEMA_VERSION = "peny.case/v1"


def hash_file(path):
    md5, sha1, sha256 = hashlib.md5(), hashlib.sha1(), hashlib.sha256()
    with open(path, "rb") as fh:
        for chunk in iter(lambda: fh.read(1 << 20), b""):
            md5.update(chunk)
            sha1.update(chunk)
            sha256.update(chunk)
    return {"md5": md5.hexdigest(), "sha1": sha1.hexdigest(), "sha256": sha256.hexdigest()}


def workspace():
    """Where new case directories are created. PENY_WORKSPACE wins, else ~/.anais/peny."""
    env = os.environ.get("PENY_WORKSPACE")
    return Path(env) if env else Path.home() / ".anais" / "peny"


def new_case_dir(target, case_dir=None):
    if case_dir:
        d = Path(case_dir)
    else:
        stamp = datetime.now(timezone.utc).strftime("%Y%m%dT%H%M%SZ")
        d = workspace() / f"{Path(target).stem}_{stamp}"
    (d / "temp").mkdir(parents=True, exist_ok=True)
    (d / "reports").mkdir(parents=True, exist_ok=True)
    return d


def _tool_versions():
    from peny import __version__ as peny_version

    versions = {"peny": peny_version}
    try:
        from reema import __version__ as reema_version

        versions["reema"] = reema_version
    except Exception:
        pass
    return versions


def write_case(case_dir, target, hashes, authorization):
    record = {
        "schema": SCHEMA_VERSION,
        "created_at": datetime.now(timezone.utc).isoformat(timespec="seconds"),
        "target": {"file_name": Path(target).name, **hashes,
                   "size": Path(target).stat().st_size if Path(target).is_file() else None},
        "authorization": authorization,
        "tool_versions": _tool_versions(),
    }
    (Path(case_dir) / "case.json").write_text(json.dumps(record, indent=2))
    return record
