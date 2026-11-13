#!/usr/bin/env python3
"""
Dynamic Analysis Bridge (Phase 4)

Runs the target app on a connected Android device/emulator under the
Anais-generated Frida script (reports/frida_auto.js), captures the hook output
and logcat, and folds a Dynamic Analysis section into the report. This confirms
at runtime what the static pass only suspected: SSL pinning, crypto/key use,
root/RASP checks firing, native hooks hit (incl. REA-recovered addresses).

SAFETY: this EXECUTES the target application on a real device. The target may be
malware. Nothing runs without an explicit --yes; without it the tool prints the
exact command plan and exits (dry-run). Use a disposable/isolated device.

Preflight: adb on PATH, a device connected, frida + frida-server reachable
(frida-ps -U). None of this runs in the default anais pipeline — it is a
separate, opt-in step (see docs/dyxon/dynamic-analysis.md).

Usage:
  dynamic_bridge.py <temp_dir> <reports_dir>
      [--package PKG] [--apk-path APK] [--serial SERIAL]
      [--mode spawn|attach] [--timeout 30] [--frida-script PATH]
      [--install] [--dry-run] [--yes] [--out dynamic_findings.json]
"""

import os
import sys
import json
import time
import shutil
import argparse
import subprocess

FINDINGS_SCHEMA = 1

# Marker -> category for the [Anais] console.log lines the hook script emits.
HOOK_MARKERS = [
    ("[Anais][crypto]", "crypto"),
    ("[Anais][key]", "keys"),
    ("[Anais][native]", "native"),
    ("[Anais][dlopen]", "dlopen"),
    ("CertificatePinner.check bypassed", "ssl_bypass"),
    ("SSLContext.init hooked", "ssl_bypass"),
    ("blocked root-probe exec", "root_blocked"),
]


def parse_frida_output(text):
    """Categorize the hook script's [Anais] console lines. Returns a dict."""
    hooks = {"ssl_bypass": [], "crypto": [], "keys": [], "native": [],
             "dlopen": [], "root_blocked": []}
    errors = []
    for raw in (text or "").splitlines():
        line = raw.strip()
        if not line:
            continue
        if "hook failed" in line or "Failed to" in line or "Error:" in line:
            errors.append(line[:200])
            continue
        for marker, cat in HOOK_MARKERS:
            if marker in line:
                hooks[cat].append(line[:300])
                break
    hits_total = sum(len(v) for v in hooks.values())
    return {"hooks": hooks, "hits_total": hits_total, "errors": errors}


def parse_logcat(text, package=None):
    """Pull crashes / uncaught exceptions / package lines from a logcat dump."""
    crashes, exceptions, pkg_lines = [], [], []
    for raw in (text or "").splitlines():
        line = raw.strip()
        if not line:
            continue
        if "FATAL EXCEPTION" in line or "AndroidRuntime" in line:
            crashes.append(line[:300])
        elif "Exception" in line or "\tat " in line or line.startswith("at "):
            exceptions.append(line[:300])
        elif package and package in line:
            pkg_lines.append(line[:300])
    return {"crashes": crashes[:40], "exceptions": exceptions[:60],
            "package_lines": pkg_lines[:60],
            "lines": len((text or "").splitlines())}


def _adb(serial):
    cmd = ["adb"]
    if serial:
        cmd += ["-s", serial]
    return cmd


def build_commands(cfg):
    """Return the ordered (label, argv) plan. Pure — used by --dry-run and tests."""
    adb = _adb(cfg["serial"])
    plan = []
    if cfg["install"] and cfg["apk_path"]:
        plan.append(("install apk", adb + ["install", "-r", cfg["apk_path"]]))
    plan.append(("clear logcat", adb + ["logcat", "-c"]))
    frida = ["frida", "-U"]
    if cfg["serial"]:
        frida = ["frida", "-D", cfg["serial"]]
    if cfg["mode"] == "spawn":
        frida += ["-f", cfg["package"]]
    else:
        frida += ["-n", cfg["package"]]
    frida += ["-l", cfg["frida_script"], "--no-pause", "-q"]
    plan.append((f"frida {cfg['mode']} ({cfg['timeout']}s)", frida))
    plan.append(("dump logcat", adb + ["logcat", "-d"]))
    return plan


def _run(argv, timeout=None):
    try:
        p = subprocess.run(argv, capture_output=True, text=True, timeout=timeout)
        return p.returncode, p.stdout, p.stderr
    except subprocess.TimeoutExpired as e:
        return 124, (e.stdout or ""), (e.stderr or "")
    except OSError as exc:
        return 127, "", str(exc)


def preflight(cfg, result):
    """Check adb/device/frida reachability. Returns True if good to execute."""
    ok = True
    if not shutil.which("adb"):
        result["errors"].append("adb not on PATH")
        ok = False
    if not shutil.which("frida"):
        result["errors"].append("frida not on PATH")
        ok = False
    if not os.path.isfile(cfg["frida_script"]):
        result["errors"].append(f"frida script not found: {cfg['frida_script']}")
        ok = False
    if not ok:
        return False
    rc, out, _ = _run(_adb(cfg["serial"]) + ["devices"], timeout=15)
    devices = [l.split("\t")[0] for l in out.splitlines()[1:]
               if l.strip() and l.endswith("device")]
    result["devices"] = devices
    if not devices:
        result["errors"].append("no adb device in 'device' state (adb devices)")
        ok = False
    rc, out, err = _run(["frida-ps", "-U"], timeout=20) if not cfg["serial"] else \
        _run(["frida-ps", "-D", cfg["serial"]], timeout=20)
    if rc != 0:
        result["errors"].append(f"frida-server not reachable: {(err or out).strip()[:160]}")
        ok = False
    return ok


def execute(cfg, result):
    """Run the app under Frida, capture hook output + logcat. Mutates result."""
    adb = _adb(cfg["serial"])
    if cfg["install"] and cfg["apk_path"]:
        rc, out, err = _run(adb + ["install", "-r", cfg["apk_path"]], timeout=180)
        result["notes"].append(f"install rc={rc} {(err or out).strip()[:120]}")
    _run(adb + ["logcat", "-c"], timeout=15)

    frida = ["frida", "-U"] if not cfg["serial"] else ["frida", "-D", cfg["serial"]]
    frida += (["-f", cfg["package"]] if cfg["mode"] == "spawn" else ["-n", cfg["package"]])
    frida += ["-l", cfg["frida_script"], "--no-pause", "-q"]

    frida_out = ""
    try:
        proc = subprocess.Popen(frida, stdout=subprocess.PIPE, stderr=subprocess.STDOUT, text=True)
        try:
            frida_out, _ = proc.communicate(timeout=cfg["timeout"])
        except subprocess.TimeoutExpired:
            proc.terminate()
            try:
                frida_out, _ = proc.communicate(timeout=10)
            except subprocess.TimeoutExpired:
                proc.kill()
                frida_out, _ = proc.communicate()
    except OSError as exc:
        result["errors"].append(f"frida launch failed: {exc}")
        return

    parsed = parse_frida_output(frida_out)
    result["hooks"] = parsed["hooks"]
    result["hits_total"] = parsed["hits_total"]
    result["errors"].extend(parsed["errors"][:20])

    rc, logout, _ = _run(adb + ["logcat", "-d"], timeout=20)
    result["logcat"] = parse_logcat(logout, cfg["package"])
    result["executed"] = True


def main():
    ap = argparse.ArgumentParser(description="Phase 4 dynamic ADB/Frida bridge")
    ap.add_argument("temp_dir")
    ap.add_argument("reports_dir")
    ap.add_argument("--package")
    ap.add_argument("--apk-path")
    ap.add_argument("--serial")
    ap.add_argument("--mode", choices=["spawn", "attach"], default="spawn")
    ap.add_argument("--timeout", type=int, default=30)
    ap.add_argument("--frida-script")
    ap.add_argument("--install", action="store_true")
    ap.add_argument("--dry-run", action="store_true")
    ap.add_argument("--yes", action="store_true")
    ap.add_argument("--out", default="dynamic_findings.json")
    args = ap.parse_args()

    package = args.package
    if not package:
        try:
            package = json.load(open(os.path.join(args.temp_dir, "basic_info.json"))).get("package_name")
        except Exception:
            package = None
    if not package:
        print("error: package unknown (pass --package or provide basic_info.json)", file=sys.stderr)
        sys.exit(2)

    frida_script = args.frida_script or os.path.join(args.reports_dir, "frida_auto.js")
    cfg = {"package": package, "apk_path": args.apk_path, "serial": args.serial,
           "mode": args.mode, "timeout": args.timeout, "frida_script": frida_script,
           "install": args.install}

    result = {"schema": FINDINGS_SCHEMA, "available": True, "executed": False,
              "package": package, "device": args.serial or "USB", "mode": args.mode,
              "duration_sec": args.timeout, "frida_script": frida_script,
              "hooks": {}, "hits_total": 0, "logcat": {}, "devices": [],
              "errors": [], "notes": []}

    plan = build_commands(cfg)
    print("Command plan:")
    for label, argv in plan:
        print(f"  [{label}] {' '.join(argv)}")

    if not args.yes or args.dry_run:
        result["notes"].append("dry-run: not executed (pass --yes to run on the device)")
        print("\nDRY-RUN: nothing executed. Re-run with --yes to drive the device.")
        _write(args, result)
        return

    if not preflight(cfg, result):
        print("preflight failed: " + "; ".join(result["errors"]), file=sys.stderr)
        _write(args, result)
        sys.exit(1)

    t0 = time.time()
    execute(cfg, result)
    result["duration_sec"] = round(time.time() - t0, 1)
    _write(args, result)
    print(f"dynamic: executed={result['executed']} hits={result['hits_total']} "
          f"logcat_crashes={len(result.get('logcat', {}).get('crashes', []))}")


def _write(args, result):
    out_path = args.out if os.path.isabs(args.out) else os.path.join(args.reports_dir, args.out)
    with open(out_path, "w") as f:
        json.dump(result, f, indent=2)
    # Mirror into temp so the report generator picks it up on regen.
    try:
        with open(os.path.join(args.temp_dir, "dynamic_findings.json"), "w") as f:
            json.dump(result, f, indent=2)
    except Exception:
        pass


if __name__ == "__main__":
    main()
