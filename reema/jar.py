"""JAR engine: static analysis of a .jar with no manifest or resources.

apktool does not apply, so the tree is decompiled with jadx only, and only the
analyzers that work on code and raw archive entries run. Output files use the
same names as the APK engine, so the adapters and the report work unchanged.
"""

import json
import os
import shutil
import subprocess
import sys
import zipfile
from pathlib import Path

from reema._legacy import RULES_DIR, TOOLS_DIR

DEFAULT_RULES = [str(RULES_DIR / "yara_general_rules.yar")]


def basic_info(jar):
    """Write what a JAR can tell about itself: manifest attributes and content mix."""
    info = {"format": "jar", "file_name": Path(jar).name}
    with zipfile.ZipFile(jar) as zf:
        names = zf.namelist()
        info["entries"] = len(names)
        info["class_files"] = sum(n.endswith(".class") for n in names)
        info["dex_files"] = [n for n in names if n.endswith(".dex")]
        info["native_libs"] = [n for n in names if n.endswith(".so")]
        if "META-INF/MANIFEST.MF" in names:
            attrs = {}
            for line in zf.read("META-INF/MANIFEST.MF").decode("utf-8", "replace").splitlines():
                if ": " in line:
                    k, v = line.split(": ", 1)
                    attrs[k.strip()] = v.strip()
            info["manifest"] = {k: attrs[k] for k in ("Main-Class", "Created-By", "Implementation-Title",
                                                     "Implementation-Version", "Built-By") if k in attrs}
    return info


def _tool(script, *args, log):
    cmd = [sys.executable, str(TOOLS_DIR / script), *map(str, args)]
    return subprocess.run(cmd, stdout=log, stderr=log).returncode


def _yara(rules, targets, out_file, log):
    """Run yara over targets (files) with -s, writing yara's text output to out_file."""
    if not shutil.which("yara") or not targets:
        out_file.write_text("")
        return
    help_text = subprocess.run(["yara", "--help"], capture_output=True, text=True).stdout
    with open(out_file, "w") as out:
        if "--scan-list" in help_text:
            # One process for all targets: per-file runs recompile the rules each time.
            list_file = out_file.with_suffix(".list")
            list_file.write_text("".join(f"{t}\n" for t in targets))
            subprocess.run(["yara", "-s", "-p", str(os.cpu_count() or 4), "--scan-list", *rules,
                            str(list_file)], stdout=out, stderr=log)
        else:
            for target in targets:
                subprocess.run(["yara", "-s", *rules, str(target)], stdout=out, stderr=log)


def run(jar, case_dir, sha256, rules=None, case=None):
    """Analyze jar into case_dir. Returns a list of (stage, exit_code)."""
    case_dir = Path(case_dir)
    temp, jadx_out, reports = case_dir / "temp", case_dir / "jadx_output", case_dir / "reports"
    rules = rules or DEFAULT_RULES
    results = []

    (temp / "basic_info.json").write_text(json.dumps(basic_info(jar), indent=2))

    with open(temp / "engine.log", "a") as log:
        if shutil.which("jadx"):
            rc = subprocess.run(["jadx", "-d", str(jadx_out), str(jar)], stdout=log, stderr=log).returncode
        else:
            rc = 127
        results.append(("jadx", rc))

        results.append(("sast", _tool("sast_scanner.py", "--apk", jar, "--jadx", jadx_out,
                                      "--output", temp / "sast_findings.json", log=log)))
        results.append(("network", _tool("network_analyzer.py", "--jadx", jadx_out,
                                         "--output", temp / "network_findings.json", log=log)))
        results.append(("entropy", _tool("entropy_analyzer.py", jar, temp / "entropy_analysis.json", log=log)))
        results.append(("dex_payload", _tool("dex_payload_hunter.py", jar, temp / "dex_payload_report.json",
                                             "--brief", log=log)))

        _yara(rules, [jar], temp / "yara_apk_results.txt", log)
        _yara(rules, sorted(jadx_out.rglob("*.java")), temp / "yara_jadx_results.txt", log)
        results.append(("yara", _tool("yara_enhanced_analyzer.py", temp, temp / "yara_enhanced.json",
                                      *rules, log=log)))

        results.append(("report", _tool("report_generator_modular.py", case_dir, temp, Path(jar).name, sha256,
                                        "--output-md", "report.md", "--output-json", "report.json", log=log)))

    if case is not None:
        for stage, rc in results:
            case.log(f"jar:{stage}", "ok" if rc == 0 else "error", "" if rc == 0 else f"exit {rc}")
    reports.mkdir(exist_ok=True)
    return results
