"""Code index: one androguard pass over the DEX code, stored as SQLite.

Rules query the index instead of regex-scanning decompiled sources. Each
class records its owner (app or SDK) and whether a manifest entry point can
reach it; each framework API call and each string literal records the method
that uses it, so a signal found only in library code, or in code nothing
reaches, can be discounted. Design: docs/reema/design.md §3.3.

Output: <case_dir>/temp/code_index.db

    meta(key, value)
    classes(id, name, owner, reachable)        name is a DEX descriptor, Lcom/x/A;
    methods(id, class_id, name, descriptor, reachable)
    api_calls(class_id, method, api)           api is Lpkg/Class;->name(desc)ret
    strings(class_id, method, value)           string literal and where it is used

`reachable` is 1, 0, or NULL (unknown: a JAR has no manifest to seed the walk
from). Only calls to external (framework / runtime) methods are stored in
api_calls; calls between the sample's own classes are not.
"""

import shutil
import sqlite3
import subprocess
import tempfile
import zipfile
from collections import defaultdict, deque
from pathlib import Path

from reema._legacy import owner_of

INDEX_SCHEMA = "reema.index/v1"

DDL = """
CREATE TABLE meta      (key TEXT PRIMARY KEY, value TEXT);
CREATE TABLE classes   (id INTEGER PRIMARY KEY, name TEXT UNIQUE NOT NULL, owner TEXT NOT NULL,
                        reachable INTEGER);
CREATE TABLE methods   (id INTEGER PRIMARY KEY, class_id INTEGER NOT NULL REFERENCES classes(id),
                        name TEXT NOT NULL, descriptor TEXT NOT NULL, reachable INTEGER);
CREATE TABLE api_calls (class_id INTEGER NOT NULL REFERENCES classes(id),
                        method TEXT NOT NULL, api TEXT NOT NULL);
CREATE TABLE strings   (class_id INTEGER NOT NULL REFERENCES classes(id),
                        method TEXT NOT NULL, value TEXT NOT NULL);
CREATE INDEX api_calls_api ON api_calls(api);
CREATE INDEX strings_value ON strings(value);
CREATE INDEX methods_class ON methods(class_id);
"""


def _quiet_androguard():
    try:
        from loguru import logger
        logger.remove()
    except ImportError:
        pass


def _dex_from_jar_classes(sample):
    """Convert a JVM-only JAR to a DEX with d8 (backlog B3). Returns dex bytes or None.

    Androguard reads DEX only, so a JAR holding just .class files is otherwise
    skipped. d8 ships with the Android build-tools; without it on PATH we give up.
    """
    if not shutil.which("d8"):
        return None
    with tempfile.TemporaryDirectory() as d:
        try:
            subprocess.run(["d8", "--output", d, str(sample)],
                           capture_output=True, timeout=300, check=True)
        except (OSError, subprocess.SubprocessError):
            return None
        dex = Path(d) / "classes.dex"
        return dex.read_bytes() if dex.is_file() else None


def _analysis_for(sample):
    """Return (dx, seeds, dex_source) for the sample.

    dx is an androguard Analysis, or None when the sample holds no DEX and none
    could be produced. seeds is the set of manifest entry-point class descriptors
    (None for a JAR, which has no manifest). dex_source is "apk", "dex" or "d8".
    """
    _quiet_androguard()
    from androguard.core.analysis.analysis import Analysis
    from androguard.core.dex import DEX

    sample = Path(sample)
    if sample.suffix.lower() == ".apk":
        from androguard.misc import AnalyzeAPK
        a, _, dx = AnalyzeAPK(str(sample))
        return dx, _seed_descriptors(a), "apk"

    with zipfile.ZipFile(sample) as zf:
        dex_names = [n for n in zf.namelist() if n.endswith(".dex")]
        if dex_names:
            dx = Analysis()
            for name in dex_names:
                dx.add(DEX(zf.read(name)))
            dx.create_xref()
            return dx, None, "dex"

    dex_bytes = _dex_from_jar_classes(sample)
    if dex_bytes is None:
        return None, None, None
    dx = Analysis()
    dx.add(DEX(dex_bytes))
    dx.create_xref()
    return dx, None, "d8"


def _seed_descriptors(apk):
    """Manifest entry points as class descriptors: components and the application class."""
    pkg = apk.get_package()
    names = set()
    for getter in (apk.get_activities, apk.get_services, apk.get_receivers, apk.get_providers):
        names.update(getter() or [])
    app = apk.get_attribute_value("application", "name")
    if app:
        names.add(app)
    out = set()
    for n in names:
        if not n:
            continue
        if n.startswith("."):
            n = pkg + n
        elif "." not in n:
            n = pkg + "." + n
        out.add("L" + n.replace(".", "/") + ";")
    return out


def _reachability(dx, seeds):
    """Set of reachable method keys (class_name, name, descriptor), or None when seeds is None.

    Seeds are manifest components and their internal superclasses; the framework
    may invoke any of their methods. From there the walk follows direct calls,
    overriding methods in subclasses (virtual dispatch), <init> of instantiated
    classes (their callbacks run later) and <clinit> of any reached class. Known
    gaps: reflection, native code and runtime-loaded code.
    """
    if seeds is None:
        return None

    internal = {ca.name: ca for ca in dx.get_internal_classes()}
    methods = {name: [m for m in ca.get_methods() if not m.is_external()]
               for name, ca in internal.items()}
    subclasses = defaultdict(list)
    for name, ca in internal.items():
        if ca.extends:
            subclasses[ca.extends].append(name)

    def key(m):
        return (m.class_name, m.name, m.descriptor)

    reachable, queue = set(), deque()

    def enqueue(m):
        k = key(m)
        if k not in reachable:
            reachable.add(k)
            queue.append(m)

    def enqueue_class(name):
        for m in methods.get(name, ()):
            enqueue(m)

    # Seed: each component class and its internal superclasses, all methods.
    seeded = set()
    for desc in seeds:
        name = desc
        while name in internal and name not in seeded:
            seeded.add(name)
            enqueue_class(name)
            name = internal[name].extends

    while queue:
        m = queue.popleft()
        for _, callee, _ in m.get_xref_to():
            if callee.is_external():
                continue
            enqueue(callee)
            if callee.name == "<init>":
                enqueue_class(callee.class_name)  # instantiated: its callbacks become reachable
            for sub in subclasses.get(callee.class_name, ()):   # virtual override in a subclass
                for sm in methods.get(sub, ()):
                    if sm.name == callee.name and sm.descriptor == callee.descriptor:
                        enqueue(sm)

    # A reached class runs its static initializer.
    for name in {c for c, _, _ in reachable}:
        for m in methods.get(name, ()):
            if m.name == "<clinit>":
                reachable.add(key(m))
    return reachable


def build(sample, out_path):
    """Build the index. Returns a summary dict (also stored in meta)."""
    out_path = Path(out_path)
    if out_path.exists():
        out_path.unlink()
    dx, seeds, dex_source = _analysis_for(sample)
    reachable = _reachability(dx, seeds) if dx is not None else None

    db = sqlite3.connect(out_path, timeout=30)
    try:
        return _build_into(db, dx, dex_source, reachable)
    finally:
        # Always release the write lock; if _build_into raised (androguard can
        # fail mid-analysis on a large/packed DEX) a leaked open connection
        # would lock the index for every later reader in this process.
        db.close()


def _build_into(db, dx, dex_source, reachable):
    db.executescript(DDL)
    summary = {"schema": INDEX_SCHEMA, "dex_present": dx is not None, "dex_source": dex_source,
               "classes": 0, "app_classes": 0, "reachable_classes": 0,
               "methods": 0, "reachable_methods": 0, "api_calls": 0, "strings": 0}

    if dx is not None:
        class_ids, class_reachable = {}, defaultdict(lambda: None)
        for ca in dx.get_internal_classes():
            owner = owner_of(ca.name)
            cur = db.execute("INSERT OR IGNORE INTO classes(name, owner) VALUES (?, ?)", (ca.name, owner))
            class_ids[ca.name] = cur.lastrowid or db.execute(
                "SELECT id FROM classes WHERE name = ?", (ca.name,)).fetchone()[0]
            summary["classes"] += 1
            summary["app_classes"] += owner == "app"

        # methods, with per-method reachability
        for ma in dx.get_internal_methods():
            cid = class_ids.get(ma.class_name)
            if cid is None:
                continue
            flag = None if reachable is None else int((ma.class_name, ma.name, ma.descriptor) in reachable)
            db.execute("INSERT INTO methods(class_id, name, descriptor, reachable) VALUES (?, ?, ?, ?)",
                       (cid, ma.name, ma.descriptor, flag))
            summary["methods"] += 1
            summary["reachable_methods"] += flag or 0
            if flag:
                class_reachable[ma.class_name] = 1
            elif flag == 0 and class_reachable[ma.class_name] is None:
                class_reachable[ma.class_name] = 0

        if reachable is not None:
            for name, flag in class_reachable.items():
                db.execute("UPDATE classes SET reachable = ? WHERE name = ?", (flag, name))
            summary["reachable_classes"] = sum(1 for v in class_reachable.values() if v == 1)
        else:
            summary["reachable_classes"] = None

        api_rows, str_rows = set(), set()
        for ma in dx.get_internal_methods():
            cid = class_ids.get(ma.class_name)
            if cid is None:
                continue
            caller = f"{ma.name}{ma.descriptor}"
            for _, callee, _ in ma.get_xref_to():
                if callee.is_external():
                    api_rows.add((cid, caller, f"{callee.class_name}->{callee.name}{callee.descriptor}"))
        for sa in dx.get_strings():
            value = sa.get_value()
            if not value:
                continue
            for ca, ma in sa.get_xref_from():
                cid = class_ids.get(ma.class_name)
                if cid is not None:
                    str_rows.add((cid, f"{ma.name}{ma.descriptor}", value))
        db.executemany("INSERT INTO api_calls(class_id, method, api) VALUES (?, ?, ?)", sorted(api_rows))
        db.executemany("INSERT INTO strings(class_id, method, value) VALUES (?, ?, ?)", sorted(str_rows))
        summary["api_calls"], summary["strings"] = len(api_rows), len(str_rows)

    db.executemany("INSERT INTO meta(key, value) VALUES (?, ?)", [(k, str(v)) for k, v in summary.items()])
    db.commit()
    return summary


def api_usage(index_path, api_prefix):
    """Callers of APIs starting with api_prefix, as (class, owner, method, api) rows."""
    # A bare `with sqlite3.connect()` commits but does not close, leaking a
    # handle that can lock the DB for a later reader on a large index; close it.
    db = sqlite3.connect(index_path, timeout=30)
    try:
        return db.execute(
            "SELECT c.name, c.owner, a.method, a.api FROM api_calls a JOIN classes c ON c.id = a.class_id "
            "WHERE a.api >= ? AND a.api < ? ORDER BY c.owner != 'app', c.name",
            (api_prefix, api_prefix + "￿")).fetchall()
    finally:
        db.close()


def unreachable_classes(index_path):
    """Descriptors of internal classes no manifest entry point reaches (reachable = 0).

    Empty when the index carries no reachability (reachable all NULL, e.g. a JAR).
    """
    db = sqlite3.connect(index_path, timeout=30)
    try:
        return {row[0] for row in db.execute("SELECT name FROM classes WHERE reachable = 0")}
    finally:
        db.close()
