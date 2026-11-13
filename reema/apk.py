"""APK engine: native Python port of the legacy anais.sh orchestrator (B10).

This drives the same `analysis_tools/` scripts and external tools (apktool,
jadx, yara) that anais.sh drove, in the same order and writing the same output
file names, so the Finding adapters and the report work unchanged. The bash
engine is retired; this module is the APK engine that `reema/cli.py` calls.

Stages:
  prepare_input -> basic_info -> protection check -> decompile (apktool + jadx,
  in parallel) -> analysis tools (in parallel) -> report -> derived outputs
  (Frida script, SARIF).

Reema's normalized findings (`findings.json`) are written by the CLI after the
engine returns, so this module does not call `reema findings` itself (anais.sh
did, because it ran standalone).

Fidelity notes:
  - A missing external tool degrades the run (empty tree, skipped stage) rather
    than aborting, unlike anais.sh which hard-exited on a dependency check.
  - `sdk_inventory` goes online only when ANAIS_CVE_ONLINE=1 and the run is not
    `--offline`. The REA deep-analysis bridge still gates on ANAIS_REA=1.
"""

import json
import os
import shutil
import subprocess
import sys
import zipfile
from concurrent.futures import ThreadPoolExecutor
from pathlib import Path

from reema._legacy import RULES_DIR, TOOLS_DIR

DEFAULT_RULES = [str(RULES_DIR / "yara_general_rules.yar")]

# Obfuscation type -> protection library name patterns, for so_string_analyzer
# (ported from anais.sh analyze_protection_libraries).
_PROTECTION_LIBS = {
    "dpt-shell": ("libdpt",),
    "bangcle": ("libbangcle", "libsecexe", "libDexHelper"),
    "qihoo-360": ("libjiagu", "libjiagu_art", "libjiagu_dvm"),
    "jiagu": ("libjiagu", "libjiagu_art", "libjiagu_dvm"),
    "dexprotector": ("libprotect", "libdexprotector"),
    "secneo": ("libshell", "libsecexe"),
}
# Advanced protections that trigger the SO string pass.
_ADVANCED_PROTECTIONS = set(_PROTECTION_LIBS)


def _run(cmd, logpath):
    """Run cmd, appending stdout+stderr to logpath. Returns the exit code."""
    with open(logpath, "a") as fh:
        fh.write("$ " + " ".join(map(str, cmd)) + "\n")
        fh.flush()
        return subprocess.run(cmd, stdout=fh, stderr=fh).returncode


def _pytool(script, args, logpath):
    return _run([sys.executable, str(TOOLS_DIR / script), *map(str, args)], logpath)


def _read_json(path):
    try:
        return json.loads(Path(path).read_text(encoding="utf-8"))
    except (OSError, ValueError):
        return {}


def _prepare_input(apk, temp, logpath):
    """Normalize a container (XAPK/APKM/APKS/AAB) to a base APK. Returns the base path."""
    prepared = temp / "prepared"
    prepared.mkdir(parents=True, exist_ok=True)
    _pytool("prepare_input.py", [apk, prepared, temp / "prepare_input.json"], logpath)
    base = _read_json(temp / "prepare_input.json").get("base_apk")
    if base and Path(base).is_file():
        return Path(base)
    return Path(apk)


def _protection_check(apk, temp, logpath):
    """Return the APK to analyze: the original, or a header-fixed copy when the
    archive is ZIP-encrypted (ported from anais.sh check_apk_protection)."""
    try:
        with zipfile.ZipFile(apk) as zf:
            if zf.testzip() is None:
                return Path(apk)
    except zipfile.BadZipFile:
        pass
    # Archive did not open cleanly: probe for encryption and try a header fix.
    _pytool("check_zip_encryption.py", [apk, temp / "encryption_check.json"], logpath)
    if _read_json(temp / "encryption_check.json").get("encrypted"):
        fixed = temp / "fixed_apk.apk"
        _pytool("fix_apk_headers.py", [apk, fixed], logpath)
        if fixed.is_file():
            return fixed
    return Path(apk)


def _decompile(apk_to_analyze, decompiled, jadx_out, temp):
    """Run apktool and jadx in parallel. Returns [(stage, rc), ...]."""
    def _apktool():
        if not shutil.which("apktool"):
            return ("apktool", 127)
        return ("apktool", _run(["apktool", "d", "-f", "-o", str(decompiled), str(apk_to_analyze)],
                                temp / "log_apktool.txt"))

    def _jadx():
        if not shutil.which("jadx"):
            return ("jadx", 127)
        return ("jadx", _run(["jadx", "-d", str(jadx_out), str(apk_to_analyze)],
                             temp / "log_jadx.txt"))

    with ThreadPoolExecutor(max_workers=2) as pool:
        return [f.result() for f in [pool.submit(_apktool), pool.submit(_jadx)]]


def _yara(rules, targets, out_file, logpath):
    """Run yara -s over targets, writing yara's text output to out_file."""
    if not shutil.which("yara") or not targets:
        out_file.write_text("")
        return
    help_text = subprocess.run(["yara", "--help"], capture_output=True, text=True).stdout
    with open(out_file, "w") as out, open(logpath, "a") as log:
        if "--scan-list" in help_text:
            list_file = out_file.with_suffix(".list")
            list_file.write_text("".join(f"{t}\n" for t in targets))
            subprocess.run(["yara", "-s", "-p", str(os.cpu_count() or 4), "--scan-list",
                            *rules, str(list_file)], stdout=out, stderr=log)
        else:
            for target in targets:
                subprocess.run(["yara", "-s", *rules, str(target)], stdout=out, stderr=log)


def _so_strings(apk, obf_type, temp, logpath):
    """SO string extraction for an advanced protection (anais.sh
    analyze_protection_libraries). No-op when the type has no known libraries."""
    libs = _PROTECTION_LIBS.get(obf_type)
    if not libs:
        return
    args = [apk]
    for lib in libs:
        args += ["--target", lib]
    args += ["--json", temp / "so_strings.json", "--limit", "20"]
    _pytool("so_string_analyzer.py", args, logpath)


def run(apk, case_dir, sha256, rules=None, case=None, offline=False):
    """Analyze apk into case_dir. Returns a list of (stage, exit_code)."""
    case_dir = Path(case_dir)
    temp = case_dir / "temp"
    decompiled = case_dir / "decompiled"
    jadx_out = case_dir / "jadx_output"
    reports = case_dir / "reports"
    for d in (temp, decompiled, jadx_out, reports):
        d.mkdir(parents=True, exist_ok=True)
    rules = rules or DEFAULT_RULES
    engine_log = temp / "engine.log"
    results = []

    # Sequential preamble: later stages depend on these outputs.
    base_apk = _prepare_input(apk, temp, engine_log)
    _pytool("apk_basic_info.py", [base_apk, temp / "basic_info.json"], engine_log)
    target = _protection_check(base_apk, temp, engine_log)
    pkg = _read_json(temp / "basic_info.json").get("package_name", "") or ""

    results += _decompile(target, decompiled, jadx_out, temp)

    # Parallel analysis tools. Each task owns its log file and returns (stage, rc);
    # they share no state beyond the files they each write (same as anais.sh).
    def _obfuscation():
        log = temp / "log_obfuscation.txt"
        _pytool("dex_payload_hunter.py", [base_apk, temp / "dex_payload_report.json", pkg, "--brief"], log)
        rc = _pytool("detect_obfuscation.py",
                     [base_apk, decompiled, jadx_out, temp / "obfuscation_report.json"], log)
        obf_type = _read_json(temp / "obfuscation_report.json").get("type", "")
        if obf_type in _ADVANCED_PROTECTIONS:
            (temp / "protection_type.txt").write_text(obf_type)
            _so_strings(base_apk, obf_type, temp, log)
        return ("obfuscation", rc)

    def _framework():
        return ("framework", _pytool("detect_framework.py",
                [base_apk, decompiled, temp / "framework_report.json"], temp / "log_framework.txt"))

    def _rasp():
        return ("rasp", _pytool("detect_rasp.py",
                [target, decompiled, jadx_out, temp / "rasp_report.json"], temp / "log_rasp.txt"))

    def _entropy():
        return ("entropy", _pytool("entropy_analyzer.py",
                [target, temp / "entropy_analysis.json", "--chunk-size", "2048"], temp / "log_entropy.txt"))

    def _signing():
        return ("signing", _pytool("signing_analyzer.py",
                [target, temp / "signing_analysis.json"], temp / "log_signing.txt"))

    def _sdks():
        args = [decompiled, jadx_out, temp / "sdk_inventory.json"]
        if os.environ.get("ANAIS_CVE_ONLINE") == "1" and not offline:
            args.append("--online")
        return ("sdks", _pytool("sdk_inventory.py", args, temp / "log_sdks.txt"))

    def _manifest():
        mf = decompiled / "AndroidManifest.xml"
        if not mf.is_file():
            return ("manifest", 0)
        return ("manifest", _pytool("manifest_analyzer.py",
                [mf, temp / "manifest_findings.json"], temp / "log_manifest.txt"))

    def _network():
        return ("network", _pytool("network_analyzer.py",
                ["--decompiled", decompiled, "--jadx", jadx_out,
                 "--output", temp / "network_findings.json"], temp / "log_network.txt"))

    def _sast():
        return ("sast", _pytool("sast_scanner.py",
                ["--apk", target, "--decompiled", decompiled, "--jadx", jadx_out,
                 "--output", temp / "sast_findings.json"], temp / "log_sast.txt"))

    def _yara_stage():
        log = temp / "log_yara.txt"
        _yara(rules, [target], temp / "yara_apk_results.txt", log)
        _yara(rules, sorted(decompiled.rglob("*.smali")) + sorted(decompiled.rglob("*.xml")),
              temp / "yara_decompiled_results.txt", log)
        _yara(rules, sorted(jadx_out.rglob("*.java")), temp / "yara_jadx_results.txt", log)
        return ("yara", _pytool("yara_enhanced_analyzer.py",
                [temp, temp / "yara_enhanced.json", *rules], log))

    tasks = [_obfuscation, _framework, _rasp, _entropy, _yara_stage,
             _signing, _sdks, _manifest, _network, _sast]
    with ThreadPoolExecutor(max_workers=os.cpu_count() or 4) as pool:
        results += [f.result() for f in [pool.submit(t) for t in tasks]]

    # Optional deep-analysis bridge to REA (gated on ANAIS_REA=1).
    if os.environ.get("ANAIS_REA") == "1":
        results.append(("rea", _pytool("rea_bridge.py",
                        [base_apk, decompiled, temp, temp / "rea_report.json",
                         reports / "rea_targets.json"], temp / "log_rea.txt")))

    # Report, then derived outputs.
    results.append(("report", _pytool("report_generator_modular.py",
                    [case_dir, temp, base_apk.name, sha256,
                     "--output-md", "report.md", "--output-json", "report.json"], engine_log)))
    results.append(("frida", _pytool("frida_script_generator.py",
                    [temp, reports / "frida_auto.js", pkg or "<package.name>"], engine_log)))
    if (temp / "sast_findings.json").is_file():
        results.append(("sarif", _pytool("sarif_exporter.py",
                        [temp / "sast_findings.json", reports / "report.sarif", base_apk.name], engine_log)))

    if case is not None:
        for stage, rc in results:
            case.log(f"apk:{stage}", "ok" if rc == 0 else "error", "" if rc == 0 else f"exit {rc}")
    return results
