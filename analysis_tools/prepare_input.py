#!/usr/bin/env python3
"""
Input Normalizer

Accepts any common Android distribution container and resolves it to a single
base APK that the rest of the pipeline can analyze, while recording the full
bundle structure (config splits, feature modules) so nothing is silently dropped.

Supported inputs:
  .apk            analyzed directly
  .xapk           APKPure bundle (zip of base + config split APKs + manifest.json)
  .apkm           APKMirror bundle (zip of base + splits + info.json)
  .apks           bundletool output (zip of splits/ or a universal/standalone APK)
  .aab            Android App Bundle (requires bundletool to build a universal APK)

Usage: prepare_input.py <input_path> <out_dir> <report_json>
Prints the resolved base APK path on the last stdout line (BASE_APK=<path>).
"""

import os
import sys
import json
import shutil
import zipfile
import subprocess
import tempfile


def _is_zip(path):
    try:
        with open(path, "rb") as f:
            return f.read(4)[:2] == b"PK"
    except OSError:
        return False


def _apk_entries(path):
    """Names of APK members inside a zip container."""
    with zipfile.ZipFile(path) as zf:
        return [n for n in zf.namelist() if n.lower().endswith(".apk")]


def _extract(path, members, dest):
    os.makedirs(dest, exist_ok=True)
    out = []
    with zipfile.ZipFile(path) as zf:
        for m in members:
            target = os.path.join(dest, os.path.basename(m))
            with zf.open(m) as src, open(target, "wb") as dst:
                shutil.copyfileobj(src, dst)
            out.append(target)
    return out


def _is_config_split(name):
    base = os.path.basename(name).lower()
    # Config/feature splits are named like config.arm64_v8a.apk, split_config.xxhdpi.apk
    return base.startswith(("config.", "split_config", "split.")) or ".config." in base


def _pick_base(apk_paths):
    """Choose the install base: a non-config APK, preferring one literally named base."""
    non_config = [p for p in apk_paths if not _is_config_split(p)]
    candidates = non_config or apk_paths
    for p in candidates:
        if os.path.basename(p).lower() in ("base.apk", "universal.apk"):
            return p
    # Otherwise the largest non-config APK (base dex is the biggest)
    return max(candidates, key=lambda p: os.path.getsize(p))


def _inventory(apk_paths):
    base = _pick_base(apk_paths)
    splits = []
    for p in apk_paths:
        if p == base:
            continue
        splits.append({
            "name": os.path.basename(p),
            "size": os.path.getsize(p),
            "config_split": _is_config_split(p),
        })
    return base, splits


def handle_bundle_zip(path, out_dir, report, kind):
    report["input_type"] = kind
    members = _apk_entries(path)
    if not members:
        report["error"] = f"No .apk members found inside {kind} container"
        return None
    extracted = _extract(path, members, out_dir)
    base, splits = _inventory(extracted)
    report["base_apk"] = base
    report["splits"] = splits
    report["split_count"] = len(splits)
    if splits:
        report["notes"].append(
            f"{len(splits)} split APK(s) present. The base APK is analyzed; config splits "
            "(native libs, resources) are inventoried but not merged — analyze them separately if needed.")
    return base


def handle_aab(path, out_dir, report):
    report["input_type"] = "aab"
    bundletool = shutil.which("bundletool") or os.environ.get("BUNDLETOOL")
    if not bundletool:
        report["error"] = ("AAB input requires bundletool to build an analyzable APK. "
                           "Install it (brew install bundletool) or set $BUNDLETOOL to the jar.")
        report["notes"].append("Without bundletool, extract base/ manually or build a universal APK.")
        return None

    apks_out = os.path.join(out_dir, "universal.apks")
    if bundletool.endswith(".jar"):
        cmd = ["java", "-jar", bundletool, "build-apks", f"--bundle={path}",
               f"--output={apks_out}", "--mode=universal"]
    else:
        cmd = [bundletool, "build-apks", f"--bundle={path}",
               f"--output={apks_out}", "--mode=universal"]
    try:
        subprocess.run(cmd, check=True, capture_output=True, text=True)
    except (subprocess.CalledProcessError, OSError) as exc:
        report["error"] = f"bundletool failed: {getattr(exc, 'stderr', '') or exc}"
        return None

    members = _apk_entries(apks_out)
    if not members:
        report["error"] = "bundletool produced no APK"
        return None
    extracted = _extract(apks_out, members, out_dir)
    base = _pick_base(extracted)
    report["base_apk"] = base
    report["splits"] = []
    report["notes"].append("Built a universal APK from the AAB with bundletool (all modules merged).")
    return base


def main():
    if len(sys.argv) < 4:
        print("Usage: prepare_input.py <input_path> <out_dir> <report_json>")
        sys.exit(1)

    input_path = sys.argv[1]
    out_dir = sys.argv[2]
    report_json = sys.argv[3]
    os.makedirs(out_dir, exist_ok=True)

    report = {
        "input_path": input_path,
        "input_type": None,
        "base_apk": None,
        "splits": [],
        "split_count": 0,
        "notes": [],
        "error": None,
    }

    ext = os.path.splitext(input_path)[1].lower()

    try:
        if ext == ".apk":
            report["input_type"] = "apk"
            report["base_apk"] = input_path
        elif ext == ".aab":
            handle_aab(input_path, out_dir, report)
        elif ext in (".xapk", ".apkm", ".apks"):
            handle_bundle_zip(input_path, out_dir, report, ext.lstrip("."))
        elif _is_zip(input_path) and _apk_entries(input_path):
            # Unknown extension but a zip of APKs — treat as a generic bundle
            handle_bundle_zip(input_path, out_dir, report, "bundle")
        else:
            report["input_type"] = "apk"
            report["base_apk"] = input_path
    except Exception as exc:
        report["error"] = str(exc)

    with open(report_json, "w") as f:
        json.dump(report, f, indent=2)

    if report["base_apk"]:
        print(f"Input type: {report['input_type']} | splits: {report['split_count']}")
        # Must be the final stdout line for the shell to capture
        print(f"BASE_APK={report['base_apk']}")
        sys.exit(0)
    else:
        print(f"Input preparation failed: {report.get('error')}", file=sys.stderr)
        sys.exit(1)


if __name__ == "__main__":
    main()
