"""Case record and chain of custody: <case_dir>/case.json.

A case is one analysis of one sample. The record lists every input and every
derived artifact with its hash, the tools and versions that produced them,
and what was sent to online providers. Layout: docs/reema/design.md §3.1.
"""

import getpass
import hashlib
import json
import os
import platform
import re
import shutil
import subprocess
import uuid
from datetime import datetime, timezone
from pathlib import Path

from reema import __version__

CASE_SCHEMA = "reema.case/v1"


def utc_now():
    return datetime.now(timezone.utc).isoformat(timespec="seconds")


def hash_file(path, algorithms=("md5", "sha1", "sha256")):
    digests = {name: hashlib.new(name) for name in algorithms}
    with open(path, "rb") as f:
        for chunk in iter(lambda: f.read(1 << 20), b""):
            for d in digests.values():
                d.update(chunk)
    return {name: d.hexdigest() for name, d in digests.items()}


def tlsh_hash(path):
    """TLSH fuzzy hash when py-tlsh is installed; None otherwise."""
    try:
        import tlsh
    except ImportError:
        return None
    with open(path, "rb") as f:
        value = tlsh.hash(f.read())
    return value if value and value != "TNULL" else None


def hash_tree(root):
    """Digest a directory as sha256 over sorted "relpath\\0sha256\\n" lines.

    A per-file listing of a decompiled tree would run to thousands of entries;
    one tree digest plus a file count proves the tree is unchanged.
    """
    root = Path(root)
    lines, count = [], 0
    for p in sorted(root.rglob("*")):
        if p.is_file():
            lines.append(f"{p.relative_to(root).as_posix()}\0{hash_file(p, ('sha256',))['sha256']}\n")
            count += 1
    return {"sha256": hashlib.sha256("".join(lines).encode()).hexdigest(), "files": count}


def _version(cmd, pattern=r"\d+\.\d+(?:\.\d+)?"):
    exe = shutil.which(cmd[0])
    if not exe:
        return None
    try:
        out = subprocess.run(cmd, capture_output=True, text=True, timeout=30)
    except (OSError, subprocess.SubprocessError):
        return None
    m = re.search(pattern, (out.stdout or "") + (out.stderr or ""))
    return m.group(0) if m else "unknown"


def tool_versions():
    versions = {
        "reema": __version__,
        "python": platform.python_version(),
        "apktool": _version(["apktool", "--version"]),
        "jadx": _version(["jadx", "--version"]),
        "yara": _version(["yara", "--version"]),
    }
    try:
        import androguard
        versions["androguard"] = getattr(androguard, "__version__", "unknown")
    except ImportError:
        versions["androguard"] = None
    return {k: v for k, v in versions.items() if v is not None}


class Case:
    def __init__(self, case_dir, record):
        self.dir = Path(case_dir)
        self.record = record

    @property
    def path(self):
        return self.dir / "case.json"

    @classmethod
    def create(cls, case_dir, analyst=None):
        case_dir = Path(case_dir)
        for sub in ("decompiled", "jadx_output", "temp", "reports"):
            (case_dir / sub).mkdir(parents=True, exist_ok=True)
        record = {
            "schema": CASE_SCHEMA,
            "case_id": str(uuid.uuid4()),
            "analyst": analyst or os.environ.get("REEMA_ANALYST") or getpass.getuser(),
            "host": platform.node(),
            "created_at": utc_now(),
            "completed_at": None,
            "tools": tool_versions(),
            "inputs": [],
            "artifacts": [],
            "enrichment": [],
            "events": [],
        }
        case = cls(case_dir, record)
        case.save()
        return case

    @classmethod
    def load(cls, case_dir):
        case_dir = Path(case_dir)
        return cls(case_dir, json.loads((case_dir / "case.json").read_text(encoding="utf-8")))

    def add_input(self, path, role):
        """role: "original" for what the analyst supplied, "base_apk" for the resolved APK."""
        path = Path(path)
        entry = {"role": role, "path": str(path.resolve()), "name": path.name,
                 "size": path.stat().st_size, "recorded_at": utc_now(), **hash_file(path)}
        fuzzy = tlsh_hash(path)
        if fuzzy:
            entry["tlsh"] = fuzzy
        self.record["inputs"].append(entry)
        return entry

    def add_artifact(self, path, producer):
        """Record a derived file or directory. Paths are stored relative to the case."""
        path = Path(path)
        if not path.exists():
            return None
        entry = {"path": path.resolve().relative_to(self.dir.resolve()).as_posix(),
                 "producer": producer, "recorded_at": utc_now()}
        if path.is_dir():
            entry.update(kind="tree", **hash_tree(path))
        else:
            entry.update(kind="file", size=path.stat().st_size, sha256=hash_file(path, ("sha256",))["sha256"])
        # Re-recording a path replaces the old entry, so the record shows the final state.
        self.record["artifacts"] = [a for a in self.record["artifacts"] if a["path"] != entry["path"]]
        self.record["artifacts"].append(entry)
        return entry

    def add_enrichment(self, provider, sent, status, cached):
        """Audit trail for every online lookup (ADR 0004): what left the machine, and when."""
        self.record["enrichment"].append({"provider": provider, "sent": sent, "status": status,
                                          "cached": cached, "at": utc_now()})

    def log(self, stage, status, detail=""):
        self.record["events"].append({"at": utc_now(), "stage": stage, "status": status,
                                      **({"detail": detail} if detail else {})})

    def complete(self):
        self.record["completed_at"] = utc_now()
        self.save()

    def save(self):
        self.path.write_text(json.dumps(self.record, indent=2), encoding="utf-8")
