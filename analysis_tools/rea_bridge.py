#!/usr/bin/env python3
"""
REA Bridge (Phase 1) + deep-pass handoff (Phase 2)

Phase 1 runs REA's cheap, deterministic mobile analyses alongside Anais and
folds the results back into the report. Each is a single REA CLI call that needs
no native disassembler:
  - inspect-apk-signature       (schemes, signer fingerprints, digest integrity)
  - identify-flutter-build      (Flutter: snapshot/engine identity)
  - inspect-il2cpp-metadata     (Unity: C# names from global-metadata.dat)
  - inspect-managed-members     (Xamarin/.NET: IL members from a DLL)
  - inspect-native-exports      (each .so: export/JNI surface)

Phase 2 is agent-driven: the expensive, targeted questions (native
decompilation, flow tracing, dynamic ADB/Frida) are NOT run here. They are
emitted as structured, machine-actionable tasks in rea_targets.json for an agent
to execute with REA's deep tools. The agent writes answers to rea_deep.json
(see rea_deep.py and docs/reema/rea-deep-pass.md); the report generator folds them in.

Usage: rea_bridge.py <apk_path> <decompiled_dir> <temp_dir> <out_report_json> <out_targets_json>

REA command resolution: $ANAIS_REA_CMD, else `rea` on PATH, else
`npx -y rea-agents@<ver>`. Set ANAIS_REA_SKIP=1 to disable entirely.
"""

import os
import sys
import json
import shutil
import subprocess

REA_VERSION = "6.8.0"
PER_CALL_TIMEOUT = int(os.environ.get("ANAIS_REA_TIMEOUT", "180"))
MAX_SO = int(os.environ.get("ANAIS_REA_MAX_SO", "12"))
TARGETS_SCHEMA = 2


def resolve_rea_cmd():
    override = os.environ.get("ANAIS_REA_CMD")
    if override:
        return override.split()
    if shutil.which("rea"):
        return ["rea"]
    if shutil.which("npx"):
        return ["npx", "-y", f"rea-agents@{REA_VERSION}"]
    return None


def run_rea(base_cmd, args):
    """Run one REA CLI command, return (parsed_json_or_None, error_or_None).

    Complete delivery (no --evidence_output) so normalized_result arrives on
    stdout; the evidence_id in the payload still references REA's retained record.
    """
    cmd = list(base_cmd) + list(args) + ["--format", "json"]
    try:
        proc = subprocess.run(cmd, capture_output=True, text=True, timeout=PER_CALL_TIMEOUT)
    except subprocess.TimeoutExpired:
        return None, f"timeout after {PER_CALL_TIMEOUT}s"
    except OSError as exc:
        return None, str(exc)
    out = proc.stdout.strip()
    if not out:
        return None, (proc.stderr.strip()[:300] or f"exit {proc.returncode} with no output")
    try:
        start = out.index("{")
        return json.loads(out[start:]), None
    except (ValueError, json.JSONDecodeError):
        return None, out[:300]


def _apk_members(apk_path, predicate):
    import zipfile
    try:
        with zipfile.ZipFile(apk_path) as zf:
            return [n for n in zf.namelist() if predicate(n)]
    except Exception:
        return []


def _find_in_dirs(decompiled_dir, rel_suffix):
    """Find an extracted file (e.g. global-metadata.dat) under decompiled assets."""
    if not decompiled_dir or not os.path.isdir(decompiled_dir):
        return None
    for dirpath, _, files in os.walk(decompiled_dir):
        for f in files:
            if f.lower() == rel_suffix.lower():
                return os.path.join(dirpath, f)
    return None


def summarize_exports(nr):
    exports = nr.get("exports", [])
    if isinstance(exports, int):
        n = exports
        names = []
    else:
        n = len(exports)
        names = [e.get("name") if isinstance(e, dict) else e for e in exports]
    jni = [x for x in names if isinstance(x, str) and x.startswith(("JNI_", "Java_"))]
    out = {"export_count": n}
    if jni:
        out["jni_entry_points"] = jni[:8]
    if n == 0:
        out["note"] = "stripped / no dynamic exports — needs decompiler or dynamic analysis"
    return out


def summarize_flutter(nr):
    abis = nr.get("abis", [])
    hashes = []
    for a in abis:
        for c in (a.get("libapp", {}) or {}).get("snapshot_hash_candidates", []) or []:
            if c not in hashes:
                hashes.append(c)
    return {"flutter_detected": nr.get("flutter_detected"),
            "abis": [a.get("abi") for a in abis],
            "snapshot_hashes": hashes[:4]}


def summarize_il2cpp(nr):
    out = {}
    for k in ("version", "types", "methods", "string_literals", "images"):
        if k in nr:
            v = nr[k]
            out[k] = len(v) if isinstance(v, list) else v
    return out or {k: nr.get(k) for k in list(nr)[:4]}


def summarize_signature(nr):
    schemes = nr.get("schemes", {})
    present = [k for k, v in schemes.items() if isinstance(v, dict) and v.get("present")]
    integrity_ok = True
    fingerprints = []
    for v in schemes.values():
        if not isinstance(v, dict):
            continue
        for signer in v.get("signers", []) or []:
            fp = (signer.get("certificate") or {}).get("sha256_fingerprint")
            if fp and fp not in fingerprints:
                fingerprints.append(fp)
            for dig in signer.get("digests", []) or []:
                if dig.get("matches_apk") is False:
                    integrity_ok = False
    return {"schemes_present": present, "digest_integrity_ok": integrity_ok,
            "signer_fingerprints": fingerprints}


class TaskList:
    """Accumulates deep-pass tasks with stable, de-duplicated ids."""

    def __init__(self):
        self.tasks = []
        self._ids = set()

    def add(self, id, priority, trigger, rea_tool, target, obtain, goal,
            extract, feeds, cli_hint=None):
        if id in self._ids:
            return
        self._ids.add(id)
        t = {
            "id": id,
            "priority": priority,
            "trigger": trigger,
            "rea_tool": rea_tool,
            "target": target,
            "obtain": obtain,
            "goal": goal,
            "extract": extract,
            "feeds": feeds,
        }
        if cli_hint:
            t["cli_hint"] = cli_hint
        self.tasks.append(t)


def main():
    if len(sys.argv) < 6:
        print("Usage: rea_bridge.py <apk_path> <decompiled_dir> <temp_dir> <out_report_json> <out_targets_json>")
        sys.exit(1)

    apk_path, decompiled_dir, temp_dir, out_report, out_targets = sys.argv[1:6]
    deep_results_path = os.path.join(os.path.dirname(out_targets) or ".", "rea_deep.json")

    report = {"available": False, "command": None, "runs": [], "notes": []}
    tl = TaskList()
    targets = {
        "schema": TARGETS_SCHEMA,
        "note": "Deep REA questions for an agent-driven pass (Ghidra / graph / dynamic). "
                "Execute each task with REA's deep tools, then write answers to deep_results_path "
                "following docs/reema/rea-deep-pass.md and merge with rea_deep.py.",
        "apk": apk_path,
        "decompiled_dir": decompiled_dir,
        "temp_dir": temp_dir,
        "deep_results_path": deep_results_path,
        "tasks": tl.tasks,
    }

    if os.environ.get("ANAIS_REA_SKIP") == "1":
        report["notes"].append("REA bridge skipped (ANAIS_REA_SKIP=1)")
        _dump(out_report, report, out_targets, targets)
        return

    base_cmd = resolve_rea_cmd()
    if not base_cmd:
        report["notes"].append("No REA command found (install rea or npx; or set ANAIS_REA_CMD)")
        _dump(out_report, report, out_targets, targets)
        return

    report["available"] = True
    report["command"] = " ".join(base_cmd)

    framework = {}
    fw_path = os.path.join(temp_dir, "framework_report.json")
    if os.path.isfile(fw_path):
        try:
            framework = json.load(open(fw_path))
        except Exception:
            framework = {}
    fw_names = [d.get("framework") for d in framework.get("frameworks", [])]

    def record(tool, target, args, summarize=None):
        data, err = run_rea(base_cmd, args)
        entry = {"tool": tool, "target": target}
        if err:
            entry["error"] = err
        elif data:
            entry["evidence_id"] = data.get("evidence_id")
            nr = data.get("normalized_result") or {}
            entry["summary"] = summarize(nr) if summarize else {k: nr.get(k) for k in list(nr)[:4]}
            for lim in (data.get("limitations") or [])[:3]:
                entry.setdefault("limitations", []).append(lim if isinstance(lim, str) else str(lim)[:160])
        report["runs"].append(entry)
        return entry

    # 1. APK signature (always)
    record("inspect-apk-signature", os.path.basename(apk_path),
           ["inspect-apk-signature", apk_path], summarize_signature)

    # 2. Framework-specific cheap passes + deep tasks
    if "Flutter" in fw_names:
        record("identify-flutter-build", os.path.basename(apk_path),
               ["identify-flutter-build", apk_path], summarize_flutter)
        tl.add(
            id="flutter-dart-flow",
            priority="high",
            trigger="framework:Flutter",
            rea_tool="open_binary",
            cli_hint="blutter (external) recovers Dart classes from libapp.so + snapshot",
            target="lib/<abi>/libapp.so",
            obtain=f"extracted under {decompiled_dir}/lib/<abi>/libapp.so",
            goal="Recover Dart classes; map the app's primary navigation/login flow and "
                 "network call sites not visible in Dalvik.",
            extract=["dart_classes", "entry_flow", "network_call_sites"],
            feeds=["app_flow"],
        )

    if "Unity" in fw_names:
        meta = _find_in_dirs(decompiled_dir, "global-metadata.dat")
        if meta:
            record("inspect-il2cpp-metadata", os.path.basename(meta),
                   ["inspect-il2cpp-metadata", meta], summarize_il2cpp)
            tl.add(
                id="unity-il2cpp-methods",
                priority="medium",
                trigger="framework:Unity",
                rea_tool="inspect_il2cpp_metadata",
                cli_hint="link binary libil2cpp.so for native method addresses",
                target="assets/bin/Data/Managed/Metadata/global-metadata.dat + libil2cpp.so",
                obtain=f"metadata at {meta}; libil2cpp.so under {decompiled_dir}/lib/<abi>/",
                goal="Map C# type/method names to native addresses in libil2cpp.so; "
                     "locate game/business logic and anti-cheat checks.",
                extract=["method_addresses", "key_types", "string_literals"],
                feeds=["app_flow"],
            )
        else:
            report["notes"].append("Unity detected but global-metadata.dat not found in decompiled tree")

    if "Xamarin / .NET MAUI" in fw_names:
        dlls = _apk_members(apk_path, lambda n: n.lower().startswith("assemblies/") and n.lower().endswith(".dll"))
        report["notes"].append(f"Xamarin: {len(dlls)} assembly DLL(s) present; extract to inspect-managed-members")
        tl.add(
            id="xamarin-managed-logic",
            priority="high",
            trigger="framework:Xamarin / .NET MAUI",
            rea_tool="inspect_managed_artifact",
            cli_hint="decompress XALZ-compressed DLLs first; inspect-managed-members / ilspycmd",
            target="assemblies/*.dll (app assembly)",
            obtain="extract from APK assemblies/; XALZ-compressed entries must be inflated first",
            goal="Decompile the app assembly and map the business logic / API surface.",
            extract=["namespaces", "entry_types", "http_clients"],
            feeds=["app_flow"],
        )

    # 3. Native exports for each .so (cheap; locates JNI surface, stripped libs flagged)
    so_members = _apk_members(apk_path, lambda n: n.startswith("lib/") and n.endswith(".so"))
    seen = set()
    count = 0
    for m in so_members:
        name = m.rsplit("/", 1)[-1]
        if name in seen:
            continue
        seen.add(name)
        src = _find_in_dirs(decompiled_dir, name)
        if not src:
            continue
        if count >= MAX_SO:
            report["notes"].append(f"Native export scan capped at {MAX_SO} libraries")
            break
        count += 1
        entry = record("inspect-native-exports", name,
                       ["inspect-native-exports", src], summarize_exports)
        # Queue a deep task when the export surface looks like native RASP/logic:
        # stripped (no exports) or exposes JNI entry points worth tracing.
        summ = entry.get("summary", {}) if not entry.get("error") else {}
        stripped = bool(summ.get("note"))
        jni = summ.get("jni_entry_points") or []
        if stripped:
            tl.add(
                id=f"native-stripped-{name}",
                priority="medium",
                trigger="native:stripped-library",
                rea_tool="open_binary",
                target=f"lib/<abi>/{name}",
                obtain=f"{src}",
                goal=f"{name} exports nothing — likely stripped native logic or packer. "
                     "Decompile JNI_OnLoad and look for root/debugger/Frida checks.",
                extract=["jni_onload_pseudocode", "anti_analysis_checks", "function_addresses"],
                feeds=["frida_native_hooks"],
            )
        elif jni:
            tl.add(
                id=f"native-jni-{name}",
                priority="low",
                trigger="native:jni-surface",
                rea_tool="open_binary",
                target=f"lib/<abi>/{name}",
                obtain=f"{src}",
                goal=f"Trace the JNI entry points of {name} ({', '.join(jni[:4])}) to the "
                     "Java methods they back; confirm no security logic hides here.",
                extract=["jni_to_java_map", "function_addresses"],
                feeds=["app_flow"],
            )

    # 4. Deep-dive handoff for RASP / packed apps
    rasp = {}
    rasp_path = os.path.join(temp_dir, "rasp_report.json")
    if os.path.isfile(rasp_path):
        try:
            rasp = json.load(open(rasp_path))
        except Exception:
            rasp = {}
    for fam in rasp.get("detected", []) or []:
        slug = "".join(c.lower() if c.isalnum() else "-" for c in fam).strip("-")
        tl.add(
            id=f"rasp-{slug}",
            priority="high",
            trigger=f"rasp:{fam}",
            rea_tool="open_binary",
            cli_hint="follow with trace_native_values / native runtime for the abort path",
            target=f"{fam} detection library (see rasp_report.json evidence)",
            obtain=f"detection lib under {decompiled_dir}/lib/<abi>/ (path in rasp_report.json)",
            goal=f"Decompile the {fam} library; trace JNI_OnLoad and the exit/abort path. "
                 "Find where it kills the process so hooks land before it.",
            extract=["abort_function_address", "detection_routines", "bypass_hint"],
            feeds=["frida_native_hooks"],
        )
    for h in rasp.get("heuristics", []) or []:
        if h.get("name") == "randomized_native_lib_names":
            tl.add(
                id="rasp-randomized-libs",
                priority="high",
                trigger="heuristic:randomized_native_lib_names",
                rea_tool="open_binary",
                cli_hint="one open_binary per suspect .so; then trace_native_values",
                target="randomized-name .so files (see rasp_report.json heuristics)",
                obtain=f"under {decompiled_dir}/lib/<abi>/",
                goal="These stripped .so likely hold native RASP. Decompile each JNI_OnLoad; "
                     "look for root/debugger/Frida checks; return function addresses for hooks.",
                extract=["anti_analysis_checks", "function_addresses"],
                feeds=["frida_native_hooks"],
            )

    _dump(out_report, report, out_targets, targets)
    n_ok = sum(1 for r in report["runs"] if "evidence_id" in r)
    print(f"REA bridge: {n_ok}/{len(report['runs'])} analyses succeeded, {len(tl.tasks)} deep task(s)")


def _dump(out_report, report, out_targets, targets):
    with open(out_report, "w") as f:
        json.dump(report, f, indent=2)
    with open(out_targets, "w") as f:
        json.dump(targets, f, indent=2)


if __name__ == "__main__":
    main()
