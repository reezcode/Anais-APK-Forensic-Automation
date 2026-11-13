#!/usr/bin/env python3
"""
REA deep-pass merge (Phase 2)

After an agent executes the tasks in rea_targets.json with REA's deep tools, it
writes its answers to a raw results file. This tool validates those answers
against the task list, normalizes them into the canonical rea_deep.json that the
report generator reads, and (optionally) regenerates the report so the deep
findings appear in it.

Raw results file shape (what the agent writes — see docs/reema/rea-deep-pass.md):
  {
    "completed": [
      {"task_id": "...", "rea_tool": "...", "target": "...",
       "evidence_id": "...", "findings": {...},
       "native_hooks": [{"symbol": "...", "address": "0x...", "note": "..."}],
       "limitations": ["..."]}
    ],
    "skipped": [{"task_id": "...", "reason": "..."}],
    "notes": ["..."]
  }

Usage:
  rea_deep.py <targets_json> <raw_results_json> <out_deep_json>
      [--work-dir DIR --temp-dir DIR --apk NAME --sha SHA]   # regenerate report

If the regen flags are given, report_generator_modular.py is re-run on the work
dir so rea_deep.json is folded into report.md / report.json.
"""

import os
import sys
import json
import argparse
import subprocess

DEEP_SCHEMA = 1


def _as_list(v):
    return v if isinstance(v, list) else ([] if v is None else [v])


def merge(targets, raw):
    """Validate+normalize agent results against the task list.

    Returns (canonical_deep_dict, warnings_list). Unknown task ids are kept but
    flagged; tasks neither completed nor skipped land in `pending`.
    """
    tasks = targets.get("tasks", []) if isinstance(targets, dict) else []
    task_ids = {t.get("id") for t in tasks if isinstance(t, dict)}
    warnings = []

    completed = []
    done_ids = set()
    for c in _as_list(raw.get("completed")):
        if not isinstance(c, dict):
            warnings.append(f"ignored non-object completed entry: {str(c)[:60]}")
            continue
        tid = c.get("task_id")
        if tid not in task_ids:
            warnings.append(f"completed task_id not in targets: {tid!r}")
        hooks = []
        for h in _as_list(c.get("native_hooks")):
            if isinstance(h, dict) and (h.get("address") or h.get("symbol")):
                hooks.append({"symbol": h.get("symbol"),
                              "address": h.get("address"),
                              "note": h.get("note")})
        entry = {
            "task_id": tid,
            "rea_tool": c.get("rea_tool"),
            "target": c.get("target"),
            "evidence_id": c.get("evidence_id"),
            "findings": c.get("findings") if isinstance(c.get("findings"), (dict, list)) else c.get("findings"),
            "native_hooks": hooks,
            "limitations": [str(x)[:200] for x in _as_list(c.get("limitations"))],
        }
        completed.append(entry)
        if tid:
            done_ids.add(tid)

    skipped = []
    for s in _as_list(raw.get("skipped")):
        if not isinstance(s, dict):
            continue
        tid = s.get("task_id")
        if tid and tid not in task_ids:
            warnings.append(f"skipped task_id not in targets: {tid!r}")
        skipped.append({"task_id": tid, "reason": s.get("reason")})
        if tid:
            done_ids.add(tid)

    pending = [tid for tid in (t.get("id") for t in tasks if isinstance(t, dict))
               if tid and tid not in done_ids]

    deep = {
        "schema": DEEP_SCHEMA,
        "available": True,
        "apk": targets.get("apk"),
        "completed": completed,
        "skipped": skipped,
        "pending": pending,
        "notes": [str(n)[:300] for n in _as_list(raw.get("notes"))] + warnings,
    }
    return deep, warnings


def main():
    ap = argparse.ArgumentParser(description="Merge agent REA deep-pass results into rea_deep.json")
    ap.add_argument("targets_json")
    ap.add_argument("raw_results_json")
    ap.add_argument("out_deep_json")
    ap.add_argument("--work-dir")
    ap.add_argument("--temp-dir")
    ap.add_argument("--apk")
    ap.add_argument("--sha", default="")
    args = ap.parse_args()

    try:
        targets = json.load(open(args.targets_json))
    except Exception as exc:
        print(f"error: cannot read targets_json: {exc}", file=sys.stderr)
        sys.exit(1)
    try:
        raw = json.load(open(args.raw_results_json))
    except Exception as exc:
        print(f"error: cannot read raw_results_json: {exc}", file=sys.stderr)
        sys.exit(1)

    deep, warnings = merge(targets, raw)
    with open(args.out_deep_json, "w") as f:
        json.dump(deep, f, indent=2)

    print(f"rea_deep: {len(deep['completed'])} completed, {len(deep['skipped'])} skipped, "
          f"{len(deep['pending'])} pending -> {args.out_deep_json}")
    for w in warnings:
        print(f"  warning: {w}", file=sys.stderr)

    # Report generator reads rea_deep.json from the temp dir; mirror it there.
    if args.temp_dir and os.path.isdir(args.temp_dir):
        with open(os.path.join(args.temp_dir, "rea_deep.json"), "w") as f:
            json.dump(deep, f, indent=2)

    if args.work_dir and args.temp_dir and args.apk:
        tools_dir = os.path.dirname(os.path.abspath(__file__))
        cmd = [sys.executable, os.path.join(tools_dir, "report_generator_modular.py"),
               args.work_dir, args.temp_dir, args.apk, args.sha,
               "--output-md", "report.md", "--output-json", "report.json"]
        rc = subprocess.run(cmd).returncode
        if rc == 0:
            print("report regenerated with deep findings")
        else:
            print(f"warning: report regen exited {rc}", file=sys.stderr)

        # Phase 3: regenerate the Frida script so recovered native addresses
        # become concrete Interceptor.attach hooks.
        pkg = "<package.name>"
        try:
            bi = json.load(open(os.path.join(args.temp_dir, "basic_info.json")))
            pkg = bi.get("package_name") or pkg
        except Exception:
            pass
        reports_dir = os.path.join(args.work_dir, "reports")
        if os.path.isdir(reports_dir):
            frc = subprocess.run([sys.executable, os.path.join(tools_dir, "frida_script_generator.py"),
                                  args.temp_dir, os.path.join(reports_dir, "frida_auto.js"), pkg]).returncode
            if frc == 0:
                print("frida_auto.js regenerated with REA native hooks")
            else:
                print(f"warning: frida regen exited {frc}", file=sys.stderr)


if __name__ == "__main__":
    main()
