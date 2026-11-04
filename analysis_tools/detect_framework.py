#!/usr/bin/env python3
"""
Cross-Platform Framework Detector

Standard SAST reads decompiled Java/Smali. Apps built on Flutter, React Native,
Xamarin/.NET or Unity keep most of their logic in native blobs or bytecode that
Java decompilation never sees, so an app can look "empty" while its real code
sits in libapp.so, index.android.bundle, assemblies/*.dll or libil2cpp.so.

This module classifies the framework, locates the artifact that holds the real
logic, reports whether the right specialized decompiler is installed, and gives
the exact next step. It writes framework_report.json.

Usage: detect_framework.py <apk_path> <decompiled_dir> <output_json>
"""

import os
import sys
import json
import shutil
import zipfile


def _zip_names(apk_path):
    if not apk_path or not os.path.isfile(apk_path):
        return []
    try:
        with zipfile.ZipFile(apk_path) as zf:
            return zf.namelist()
    except Exception:
        return []


def _tool_available(names):
    """Return the first available tool name/path from candidates (PATH or env)."""
    for n in names:
        if shutil.which(n):
            return n
    for env in ("BLUTTER", "IL2CPP_DUMPER", "HBCTOOL"):
        v = os.environ.get(env)
        if v and os.path.exists(v):
            return v
    return None


# Each framework: substring markers in zip entry names, the artifact that holds
# logic, the recommended decompiler(s), and whether that tool's logic is native.
FRAMEWORKS = {
    "Flutter": {
        "lib_markers": ["libflutter.so", "libapp.so"],
        "path_markers": ["assets/flutter_assets/"],
        "logic_artifact": "lib/<abi>/libapp.so (Dart AOT snapshot)",
        "tools": ["blutter"],
        "tool_hint": "Run blutter on libapp.so to recover Dart classes, or reFlutter to patch and trace.",
    },
    "React Native": {
        "lib_markers": ["libhermes.so", "libhermes_executor.so", "libjsc.so"],
        "path_markers": ["assets/index.android.bundle"],
        "logic_artifact": "assets/index.android.bundle (Hermes bytecode or plain JS)",
        "tools": ["hbctool", "hermes-dec"],
        "tool_hint": "If Hermes bytecode, disassemble with hbctool/hermes-dec; if plain JS, it is scanned directly.",
    },
    "Xamarin / .NET MAUI": {
        "lib_markers": ["libmonodroid.so", "libmonosgen", "libxamarin-app.so", "libxa-internal-api.so"],
        "path_markers": ["assemblies/", "assemblies/assemblies.blob"],
        "logic_artifact": "assemblies/*.dll (.NET IL, may be XALZ/LZ4 compressed)",
        "tools": ["ilspycmd", "monodis"],
        "tool_hint": "Decompress XALZ assemblies, then decompile the DLLs with ilspycmd or ILSpy.",
    },
    "Unity": {
        "lib_markers": ["libunity.so", "libil2cpp.so"],
        "path_markers": ["assets/bin/Data/Managed/", "assets/bin/Data/Managed/Metadata/global-metadata.dat"],
        "logic_artifact": "lib/<abi>/libil2cpp.so + global-metadata.dat",
        "tools": ["Il2CppDumper"],
        "tool_hint": "Run Il2CppDumper against libil2cpp.so and global-metadata.dat to recover C# symbols.",
    },
    "Cordova / Ionic": {
        "lib_markers": [],
        "path_markers": ["assets/www/", "assets/www/cordova.js"],
        "logic_artifact": "assets/www/ (HTML/JS/CSS web app)",
        "tools": [],
        "tool_hint": "Web assets are plain text and scanned directly; review assets/www/ JS.",
    },
}

HERMES_MAGIC = bytes([0xC6, 0x1F, 0xBC, 0x1F])


def classify(apk_path, decompiled_dir):
    names = _zip_names(apk_path)
    lowered = [n.lower() for n in names]

    detected = []
    for fw, sig in FRAMEWORKS.items():
        hits = []
        for m in sig["lib_markers"]:
            if any(m.lower() in n for n in lowered):
                hits.append(m)
        for m in sig["path_markers"]:
            if any(m.lower() in n for n in lowered):
                hits.append(m)
        if hits:
            tool = _tool_available(sig["tools"]) if sig["tools"] else None
            detected.append({
                "framework": fw,
                "markers": hits,
                "logic_artifact": sig["logic_artifact"],
                "recommended_tools": sig["tools"],
                "tool_available": bool(tool) if sig["tools"] else None,
                "tool_path": tool,
                "guidance": sig["tool_hint"],
            })

    return names, detected


def inspect_react_native(apk_path, names, entry):
    """Flag whether the RN bundle is Hermes bytecode or plain JS."""
    bundle = next((n for n in names if n.lower().endswith("index.android.bundle")), None)
    if not bundle:
        return
    try:
        with zipfile.ZipFile(apk_path) as zf:
            head = zf.read(bundle)[:4]
        if head == HERMES_MAGIC:
            entry["bundle_format"] = "hermes-bytecode"
            entry["guidance"] = ("index.android.bundle is Hermes bytecode. "
                                 "Disassemble with hbctool/hermes-dec; strings are still scannable.")
        else:
            entry["bundle_format"] = "plain-js"
            entry["guidance"] = ("index.android.bundle is plain JavaScript and is scanned directly by SAST.")
    except Exception:
        pass


def main():
    if len(sys.argv) < 4:
        print("Usage: detect_framework.py <apk_path> <decompiled_dir> <output_json>")
        sys.exit(1)

    apk_path = sys.argv[1] if os.path.exists(sys.argv[1]) else None
    decompiled_dir = sys.argv[2] if os.path.exists(sys.argv[2]) else None
    output_json = sys.argv[3]

    result = {
        "primary": "Native / Java-Kotlin",
        "frameworks": [],
        "coverage_warning": None,
    }

    names, detected = classify(apk_path, decompiled_dir)

    for entry in detected:
        if entry["framework"] == "React Native":
            inspect_react_native(apk_path, names, entry)

    result["frameworks"] = detected

    if detected:
        result["primary"] = detected[0]["framework"]
        # Frameworks whose logic is NOT in the scanned Java/Smali
        hidden = [d["framework"] for d in detected
                  if d["framework"] in ("Flutter", "Unity", "Xamarin / .NET MAUI")
                  or (d["framework"] == "React Native" and d.get("bundle_format") == "hermes-bytecode")]
        if hidden:
            result["coverage_warning"] = (
                f"Primary logic lives in {', '.join(hidden)} artifacts that Java/Smali SAST does not cover. "
                "Static Java findings alone understate this app; decompile the framework artifact.")

    with open(output_json, "w") as f:
        json.dump(result, f, indent=2)

    print(f"Framework: {result['primary']} | detected: {', '.join(d['framework'] for d in detected) or 'none'}")


if __name__ == "__main__":
    main()
