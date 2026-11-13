"""Code index: one androguard pass over the DEX code, stored as SQLite.

Rules query the index instead of regex-scanning decompiled sources. Each
class records its owner (app or SDK), and each framework API call records the
class that makes it, so a signal found only in library code can be discounted.
Design: docs/reema/design.md §3.3.

Output: <case_dir>/temp/code_index.db

    meta(key, value)
    classes(id, name, owner)                 name is a DEX descriptor, Lcom/x/A;
    api_calls(class_id, method, api)         api is Lpkg/Class;->name(desc)ret

Only calls to external (framework / runtime) methods are stored; calls between
the sample's own classes are not.
"""

import sqlite3
import zipfile
from pathlib import Path

from reema._legacy import owner_of

INDEX_SCHEMA = "reema.index/v1"

DDL = """
CREATE TABLE meta      (key TEXT PRIMARY KEY, value TEXT);
CREATE TABLE classes   (id INTEGER PRIMARY KEY, name TEXT UNIQUE NOT NULL, owner TEXT NOT NULL);
CREATE TABLE api_calls (class_id INTEGER NOT NULL REFERENCES classes(id),
                        method TEXT NOT NULL, api TEXT NOT NULL);
CREATE INDEX api_calls_api ON api_calls(api);
"""


def _quiet_androguard():
    try:
        from loguru import logger
        logger.remove()
    except ImportError:
        pass


def _analysis_for(sample):
    """Return an androguard Analysis for an APK, or for the DEX files inside a JAR.
    Returns None when the sample holds no DEX (a plain JVM JAR)."""
    _quiet_androguard()
    from androguard.core.analysis.analysis import Analysis
    from androguard.core.dex import DEX

    sample = Path(sample)
    if sample.suffix.lower() == ".apk":
        from androguard.misc import AnalyzeAPK
        _, _, dx = AnalyzeAPK(str(sample))
        return dx

    with zipfile.ZipFile(sample) as zf:
        dex_names = [n for n in zf.namelist() if n.endswith(".dex")]
        if not dex_names:
            return None
        dx = Analysis()
        for name in dex_names:
            dx.add(DEX(zf.read(name)))
    dx.create_xref()
    return dx


def build(sample, out_path):
    """Build the index. Returns a summary dict (also stored in meta)."""
    out_path = Path(out_path)
    if out_path.exists():
        out_path.unlink()
    dx = _analysis_for(sample)

    db = sqlite3.connect(out_path)
    db.executescript(DDL)
    summary = {"schema": INDEX_SCHEMA, "dex_present": dx is not None,
               "classes": 0, "app_classes": 0, "api_calls": 0}

    if dx is not None:
        class_ids = {}
        for ca in dx.get_internal_classes():
            owner = owner_of(ca.name)
            cur = db.execute("INSERT OR IGNORE INTO classes(name, owner) VALUES (?, ?)", (ca.name, owner))
            class_ids[ca.name] = cur.lastrowid or db.execute(
                "SELECT id FROM classes WHERE name = ?", (ca.name,)).fetchone()[0]
            summary["classes"] += 1
            summary["app_classes"] += owner == "app"

        rows = set()
        for ma in dx.get_internal_methods():
            cid = class_ids.get(ma.class_name)
            if cid is None:
                continue
            caller = f"{ma.name}{ma.descriptor}"
            for _, callee, _ in ma.get_xref_to():
                if callee.is_external():
                    rows.add((cid, caller, f"{callee.class_name}->{callee.name}{callee.descriptor}"))
        db.executemany("INSERT INTO api_calls(class_id, method, api) VALUES (?, ?, ?)", sorted(rows))
        summary["api_calls"] = len(rows)

    db.executemany("INSERT INTO meta(key, value) VALUES (?, ?)", [(k, str(v)) for k, v in summary.items()])
    db.commit()
    db.close()
    return summary


def api_usage(index_path, api_prefix):
    """Callers of APIs starting with api_prefix, as (class, owner, method, api) rows."""
    with sqlite3.connect(index_path) as db:
        return db.execute(
            "SELECT c.name, c.owner, a.method, a.api FROM api_calls a JOIN classes c ON c.id = a.class_id "
            "WHERE a.api >= ? AND a.api < ? ORDER BY c.owner != 'app', c.name",
            (api_prefix, api_prefix + "￿")).fetchall()
