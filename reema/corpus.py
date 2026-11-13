"""Corpus gate: measure the verdict against a labelled sample set.

Rule and chain changes are content, so they need a regression gate. This runs
`reema analyze` over a labelled corpus, compares each verdict to the expected
label, and reports precision/recall plus the false-positive rate on benign
apps. A change that makes benign apps look malicious fails the gate (ADR: the
corpus gate in design.md §5).

Samples are kept outside the repo; the manifest lists them by hash and label
(design §5). The manifest is CSV or JSON:

    CSV:  path,label           (label: benign | malware | pua; header optional)
    JSON: [{"path": "...", "label": "..."}]  or  {"path": "label", ...}

`path` is resolved against --samples-dir. A row whose file is missing is
reported and skipped, so a partial local mirror of the corpus still runs.

Expected verdict per label:
    benign  -> clean
    malware -> malicious or suspicious   (either counts as a catch)
    pua     -> pua, suspicious or malicious

Runs are forced offline and without enrichment, so the gate measures the
static rules alone and never depends on a network service.
"""

import csv
import json
import subprocess
import sys
import tempfile
from pathlib import Path

LABELS = ("benign", "malware", "pua")

# A label is "caught" when the verdict is in this set.
EXPECTED = {
    "benign": {"clean"},
    "malware": {"malicious", "suspicious"},
    "pua": {"pua", "suspicious", "malicious"},
}

ROOT = Path(__file__).resolve().parent.parent


def load_manifest(path):
    """Return [(relative_path, label), ...]. Raises ValueError on an unknown label."""
    path = Path(path)
    text = path.read_text(encoding="utf-8")
    rows = []
    if path.suffix.lower() == ".json":
        data = json.loads(text)
        items = data.items() if isinstance(data, dict) else (
            (d["path"], d["label"]) for d in data)
        rows = [(str(p), str(label)) for p, label in items]
    else:
        reader = csv.reader(line for line in text.splitlines() if line.strip())
        for i, parts in enumerate(reader):
            if len(parts) < 2:
                continue
            p, label = parts[0].strip(), parts[1].strip().lower()
            if i == 0 and label == "label":  # header row
                continue
            rows.append((p, label))
    for _, label in rows:
        if label not in LABELS:
            raise ValueError(f"{path}: unknown label {label!r}; use one of {LABELS}")
    return rows


def _verdict_for(sample, workspace):
    """Run reema analyze on one sample and return its verdict label, or None on error."""
    # Each sample gets its own workspace subdirectory. Sharing one workspace
    # across samples let a leftover SQLite handle (the code index) collide with
    # the next run -> "database is locked".
    import hashlib
    import os
    sample_ws = Path(workspace) / f"s_{hashlib.sha1(str(sample).encode()).hexdigest()[:12]}"
    sample_ws.mkdir(parents=True, exist_ok=True)
    cmd = [sys.executable, "-m", "reema", "analyze", "--offline", "--no-enrich", str(sample)]
    full_env = {**os.environ, "ANAIS_WORKSPACE": str(sample_ws), "PYTHONPATH": str(ROOT)}
    proc = subprocess.run(cmd, capture_output=True, text=True, env=full_env)
    if proc.returncode != 0:
        return None, proc.stderr.strip().splitlines()[-1:] or ["engine failed"]
    # The newest case directory for this sample holds the verdict.
    cases = sorted(Path(sample_ws).glob(f"{Path(sample).stem}_*"),
                   key=lambda p: p.stat().st_mtime)
    if not cases:
        return None, ["no case directory produced"]
    try:
        doc = json.loads((cases[-1] / "reports" / "findings.json").read_text(encoding="utf-8"))
        return doc.get("verdict", {}).get("label"), None
    except (OSError, ValueError) as e:
        return None, [str(e)]


def evaluate(manifest_rows, samples_dir, workspace=None):
    """Run the corpus and return a results dict (per-sample rows + metrics)."""
    samples_dir = Path(samples_dir)
    tmp = None
    if workspace is None:
        tmp = tempfile.mkdtemp(prefix="reema_corpus_")
        workspace = tmp

    results = []
    for rel, label in manifest_rows:
        sample = samples_dir / rel
        if not sample.is_file():
            results.append({"path": rel, "label": label, "verdict": None, "status": "missing"})
            continue
        verdict, err = _verdict_for(sample, workspace)
        if verdict is None:
            results.append({"path": rel, "label": label, "verdict": None,
                            "status": "error", "detail": err})
            continue
        caught = verdict in EXPECTED[label]
        results.append({"path": rel, "label": label, "verdict": verdict,
                        "status": "ok", "correct": caught})

    return {"metrics": _metrics(results), "results": results, "workspace": str(workspace)}


def _metrics(results):
    """Confusion counts and rates over the samples that ran.

    "positive" = the tool called it malware-ish (malicious/suspicious/pua);
    "negative" = the tool called it clean. Ground truth: benign vs not-benign.
    """
    tp = fp = tn = fn = 0
    scored = [r for r in results if r["status"] == "ok"]
    for r in scored:
        flagged = r["verdict"] != "clean"
        benign = r["label"] == "benign"
        if benign and flagged:
            fp += 1
        elif benign and not flagged:
            tn += 1
        elif not benign and flagged:
            tp += 1
        else:
            fn += 1

    def ratio(n, d):
        return round(n / d, 4) if d else None

    benign_total = sum(1 for r in scored if r["label"] == "benign")
    return {
        "samples": len(results),
        "scored": len(scored),
        "missing": sum(1 for r in results if r["status"] == "missing"),
        "errors": sum(1 for r in results if r["status"] == "error"),
        "tp": tp, "fp": fp, "tn": tn, "fn": fn,
        "precision": ratio(tp, tp + fp),
        "recall": ratio(tp, tp + fn),
        "false_positive_rate": ratio(fp, benign_total),
        "accuracy": ratio(tp + tn, len(scored)),
    }


def gate(metrics, max_fp_rate=0.0, min_recall=None):
    """Return (passed, reasons). Fails when benign FP rate exceeds max_fp_rate,
    or (if given) recall falls below min_recall."""
    reasons = []
    fpr = metrics.get("false_positive_rate")
    if fpr is not None and fpr > max_fp_rate:
        reasons.append(f"false-positive rate {fpr} > allowed {max_fp_rate}")
    if min_recall is not None:
        recall = metrics.get("recall")
        if recall is not None and recall < min_recall:
            reasons.append(f"recall {recall} < required {min_recall}")
    return (not reasons), reasons
