#!/usr/bin/env python3
"""
RASP / App Protection Detector
Identifies commercial and free RASP (Runtime Application Self-Protection)
and packer/shell solutions from static artifacts:
  - native libraries (decoded lib/ dir and raw APK entries)
  - Java/Smali package paths
  - assets
  - AndroidManifest application/stub class names and keywords
  - vendor-specific code strings

Usage: detect_rasp.py <apk_path> <decompiled_dir> <jadx_dir> <output_json>
"""

import sys
import os
import json
import time
import re
import zipfile
from pathlib import Path

# Attempt to use the central logger, fallback to print if missing
try:
    from error_logger import setup_logger
except ImportError:
    class DummyLogger:
        def info(self, msg): print(f"[INFO] {msg}", file=sys.stderr)
        def warning(self, msg): print(f"[WARN] {msg}", file=sys.stderr)
        def error(self, msg): print(f"[ERROR] {msg}", file=sys.stderr)
        def exception(self, msg): print(f"[EXC] {msg}", file=sys.stderr)

    def setup_logger(name):
        return DummyLogger()


# Evidence weights. A single strong artifact (exact lib, stub class, package)
# is enough for a verdict; keywords alone are capped so they cannot be.
WEIGHTS = {
    "lib": 45,
    "lib_fuzzy": 20,
    "weak_lib": 10,
    "stub_class": 45,
    "package": 35,
    "asset": 30,
    "manifest_keyword": 20,
    "code_keyword": 8,
}
CODE_KEYWORD_CAP = 24
VERDICT_MIN_SCORE = 25

# Code scan budget: keeps the module fast on very large apps
CODE_SCAN_MAX_FILES = 100000
CODE_SCAN_MAX_SECONDS = 90
CODE_SCAN_MAX_FILE_SIZE = 1024 * 1024
CODE_SCAN_EXTS = {".smali", ".java", ".kt", ".json", ".properties", ".txt", ".xml"}
# macOS: iCloud-evicted files carry SF_DATALESS; reading them blocks on a download
SF_DATALESS = 0x40000000

# Vendor-neutral hardening heuristics (reported, never used as a vendor verdict)
RANDOM_LIB_RE = re.compile(r"^lib[a-z]{1,2}[0-9a-f]{2,6}\.so$")
RANDOM_ASSET_RE = re.compile(r"^[A-Za-z0-9_-]{32,}$")
HEURISTIC_MIN_COUNT = 5

# Signatures for known RASP / protectors / packers.
# Keep entries specific: generic words (e.g. "shell", "tamper") cause false positives.
RASP_SIGNATURES = {
    "Talsec / freeRASP": {
        "libs": [],
        "weak_libs": ["libsecurity.so", "libpolarssl.so"],
        "packages": ["com/aheaditec/talsec", "com/aheaditec/talsec_security"],
        "assets": [],
        "stub_classes": [],
        "manifest_keywords": ["com.aheaditec.talsec", "freerasp"],
        "code_keywords": ["aheaditec", "TalsecConfig", "ThreatListener"],
    },
    "Appdome": {
        "libs": ["libappdome.so"],
        "weak_libs": [],
        "packages": ["com/appdome", "runtime/loading"],
        "assets": [],
        "stub_classes": ["runtime.loading.InjectedActivity"],
        "manifest_keywords": ["com.appdome"],
        "code_keywords": ["appdome", "fusionSet"],
    },
    "Seciron": {
        "libs": ["libseciron.so"],
        "weak_libs": [],
        "packages": ["com/seciron"],
        "assets": [],
        "stub_classes": [],
        "manifest_keywords": ["seciron"],
        "code_keywords": ["seciron"],
    },
    "DexGuard": {
        "libs": ["libdexguard.so"],
        "weak_libs": [],
        "packages": ["dexguard/util", "com/guardsquare/dexguard"],
        "assets": [],
        "stub_classes": [],
        "manifest_keywords": ["dexguard"],
        "code_keywords": ["DexGuard", "guardsquare"],
    },
    "Zimperium zShield": {
        "libs": ["libzshield.so", "libziva.so"],
        "weak_libs": [],
        "packages": ["com/zimperium"],
        "assets": [],
        "stub_classes": [],
        "manifest_keywords": ["zimperium", "zshield"],
        "code_keywords": ["zshield", "zimperium"],
    },
    "LiAPP": {
        "libs": ["libLIAPP.so"],
        "weak_libs": [],
        "packages": ["com/lockincomp/liapp"],
        "assets": ["LIAPPClient.apk"],
        "stub_classes": [],
        "manifest_keywords": ["liapp", "lockincomp"],
        "code_keywords": ["LockinComp", "LIAPPClient"],
    },
    "Promon SHIELD": {
        "libs": ["libpromon.so", "libgoc24.so"],
        "weak_libs": [],
        "packages": ["com/promon"],
        "assets": [],
        "stub_classes": [],
        "manifest_keywords": ["com.promon"],
        "code_keywords": ["com.promon", "Lcom/promon/"],
    },
    "Alibaba Mobisec": {
        "libs": ["libmobisec.so"],
        "weak_libs": [],
        "packages": ["com/ali/mobisec", "com/alibaba/wireless/security"],
        "assets": [],
        "stub_classes": ["com.ali.mobisec.ProtectApplication"],
        "manifest_keywords": ["mobisec"],
        "code_keywords": ["mobisec"],
    },
    "Tencent Legu": {
        "libs": ["libshella.so", "libshellx.so", "libtup.so", "libtxRes.so"],
        "weak_libs": [],
        "packages": ["com/tencent/StubShell"],
        "assets": ["tosversion", "0OO00l111l1l"],
        "stub_classes": ["com.tencent.StubShell.TxAppEntry"],
        "manifest_keywords": ["stubshell"],
        "code_keywords": ["StubShell", "TxAppEntry"],
    },
    "Qihoo 360 Jiagu": {
        "libs": ["libjiagu.so", "libjiagu_a64.so", "libjiagu_x86.so", "libjiagu_x64.so"],
        "weak_libs": [],
        "packages": ["com/stub/StubApp", "com/qihoo/util"],
        "assets": ["libjiagu"],
        "stub_classes": ["com.stub.StubApp"],
        "manifest_keywords": ["com.stub.stubapp"],
        "code_keywords": ["libjiagu", "com.stub.StubApp"],
    },
    "Baidu Protect": {
        "libs": ["libbaiduprotect.so"],
        "weak_libs": [],
        "packages": ["com/baidu/protect"],
        "assets": ["baiduprotect"],
        "stub_classes": ["com.baidu.protect.StubApplication"],
        "manifest_keywords": ["com.baidu.protect"],
        "code_keywords": ["baiduprotect"],
    },
    "Bangcle / SecNeo": {
        "libs": ["libsecexe.so", "libsecmain.so", "libSecShell.so", "libDexHelper.so", "libbangcle.so"],
        "weak_libs": [],
        "packages": ["com/secneo", "com/bangcle"],
        "assets": ["bangcle_classes.jar", "secData0.jar"],
        "stub_classes": ["com.secneo.apkwrapper.ApplicationWrapper"],
        "manifest_keywords": ["secneo", "bangcle"],
        "code_keywords": ["secneo", "bangcle"],
    },
    "Ijiami": {
        "libs": ["libexec.so", "libexecmain.so"],
        "weak_libs": [],
        "packages": ["com/ijiami", "com/shell/SuperApplication"],
        "assets": ["ijiami.dat", "ijm_lib"],
        "stub_classes": ["com.shell.SuperApplication"],
        "manifest_keywords": ["ijiami"],
        "code_keywords": ["ijiami"],
    },
    "AppSealing": {
        "libs": ["libappsealing.so", "libcovault-appsec.so"],
        "weak_libs": [],
        "packages": ["com/inka/appsealing"],
        "assets": ["AppSealing"],
        "stub_classes": [],
        "manifest_keywords": ["appsealing", "com.inka"],
        "code_keywords": ["AppSealing", "inka.appsealing"],
    },
    "DexProtector": {
        "libs": ["libdexprotector.so"],
        "weak_libs": [],
        "packages": ["dexprotector", "com/licel"],
        "assets": ["dexprotector"],
        "stub_classes": [],
        "manifest_keywords": ["dexprotector", "com.licel"],
        "code_keywords": ["DexProtector", "com.licel"],
    },
    "Kiwano": {
        "libs": ["libkiwano.so"],
        "weak_libs": [],
        "packages": [],
        "assets": [],
        "stub_classes": [],
        "manifest_keywords": ["kiwano"],
        "code_keywords": ["kiwano"],
    },
}

RECOMMENDATIONS = {
    "Appdome": "Appdome prevents simple hooking. Try unpacking or patching in-memory.",
    "DexGuard": "DexGuard uses advanced obfuscation and hooking detection. String decryption may be required.",
    "Talsec / freeRASP": "freeRASP/Talsec detects root, emulators, debuggers and hooks. Hide Frida artifacts or hook the ThreatListener callbacks.",
    "LiAPP": "LiAPP commonly enforces runtime integrity checks. Consider dynamic tracing from app entry and JNI bridges.",
    "Promon SHIELD": "Promon SHIELD runs checks in native code. Trace JNI_OnLoad and its exit/kill paths before hooking Java.",
    "Tencent Legu": "Tencent Legu is a DEX shell. Dump the decrypted DEX at runtime (see scripts/frida/frida_dex_dump.js).",
    "Qihoo 360 Jiagu": "360 Jiagu is a DEX shell. Dump the decrypted DEX at runtime (see scripts/frida/frida_dex_dump.js).",
    "Baidu Protect": "Baidu Protect is a DEX shell. Dump the decrypted DEX at runtime (see scripts/frida/frida_dex_dump.js).",
    "Bangcle / SecNeo": "Bangcle/SecNeo encrypts DEX and checks for debuggers. Dump DEX after the wrapper Application loads.",
    "Ijiami": "Ijiami encrypts DEX behind com.shell.SuperApplication. Dump DEX at runtime.",
    "DexProtector": "DexProtector encrypts classes, strings and resources. Dump decrypted DEX and hook the native string decryptor.",
    "Zimperium zShield": "zShield applies native obfuscation and integrity checks. Expect Frida and root detection in native code.",
}


class RaspDetector:
    def __init__(self, decompiled_dir, jadx_dir, apk_path=None):
        self.decompiled_dir = Path(decompiled_dir) if decompiled_dir else None
        self.jadx_dir = Path(jadx_dir) if jadx_dir else None
        self.apk_path = apk_path
        self.logger = setup_logger('detect_rasp')
        self.rasp_signatures = RASP_SIGNATURES

        self.results = {
            'type': 'None Detected',
            'confidence': 0,
            'detected': [],
            'indicators': [],
            'protection_details': {},
            'recommendations': [],
            'evidence': {},
            'heuristics': [],
            'scan_stats': {},
        }

        self.scores = {}
        self.evidence = {}
        self._seen = set()
        self._code_points = {}

    # ------------------------------------------------------------------ helpers
    def _bump(self, rasp_type, kind, artifact, indicator):
        """Record one piece of evidence. Each (family, kind, artifact) counts once."""
        key = (rasp_type, kind, artifact.lower())
        if key in self._seen:
            return
        self._seen.add(key)

        points = WEIGHTS[kind]
        if kind == "code_keyword":
            used = self._code_points.get(rasp_type, 0)
            points = min(points, CODE_KEYWORD_CAP - used)
            if points <= 0:
                return
            self._code_points[rasp_type] = used + points

        self.scores[rasp_type] = self.scores.get(rasp_type, 0) + points
        self.evidence.setdefault(rasp_type, []).append(f"{kind}:{artifact}")
        self.results['indicators'].append(indicator)

    def _apk_entries(self):
        if not self.apk_path or not os.path.isfile(self.apk_path):
            return []
        try:
            with zipfile.ZipFile(self.apk_path) as zf:
                return zf.namelist()
        except Exception as exc:
            self.logger.warning(f"Could not read APK entries for RASP checks: {exc}")
            return []

    def _list_jadx_source_roots(self):
        if not self.jadx_dir or not self.jadx_dir.exists():
            return []
        return [c for c in self.jadx_dir.iterdir() if c.is_dir() and c.name.startswith("sources")]

    def _list_smali_roots(self):
        if not self.decompiled_dir or not self.decompiled_dir.exists():
            return []
        return sorted(c for c in self.decompiled_dir.iterdir() if c.is_dir() and c.name.startswith("smali"))

    # ------------------------------------------------------------------- checks
    def _match_lib(self, so_name, source):
        so_lc = so_name.lower()
        for rasp_type, sigs in self.rasp_signatures.items():
            libs_lc = [lib.lower() for lib in sigs["libs"]]
            if so_lc in libs_lc:
                self._bump(rasp_type, "lib", so_name, f"Found {rasp_type} library: {so_name} ({source})")
            else:
                # Vendors often suffix arch/version: libshella-2.10.so, libjiagu_a64.so
                for lib_lc in libs_lc:
                    stem = lib_lc[:-3] if lib_lc.endswith(".so") else lib_lc
                    if len(stem) >= 6 and so_lc.startswith(stem):
                        self._bump(rasp_type, "lib_fuzzy", so_name, f"Found {rasp_type} library (fuzzy): {so_name} ({source})")
                        break
            for lib in sigs.get("weak_libs", []):
                if so_lc == lib.lower():
                    self._bump(rasp_type, "weak_lib", so_name, f"Found {rasp_type} supporting library: {so_name} ({source})")

    def check_libraries(self, apk_entries):
        """Check for known RASP shared libraries (.so files)"""
        names = set()
        if self.decompiled_dir and (self.decompiled_dir / "lib").exists():
            for so_file in (self.decompiled_dir / "lib").rglob("*.so"):
                names.add((so_file.name, "decompiled"))
        for entry in apk_entries:
            if entry.startswith("lib/") and entry.endswith(".so"):
                names.add((entry.rsplit("/", 1)[-1], "apk"))

        for so_name, source in sorted(names):
            self._match_lib(so_name, source)
        unique = {n for n, _ in names}
        self.results['scan_stats']['native_libs'] = len(unique)

        randomized = sorted(n for n in unique if RANDOM_LIB_RE.match(n) and any(c.isdigit() for c in n))
        if len(randomized) >= HEURISTIC_MIN_COUNT:
            self.results['heuristics'].append({
                'name': 'randomized_native_lib_names',
                'description': f"{len(randomized)} native libraries with randomized hex names (typical of commercial native RASP, e.g. Promon SHIELD)",
                'samples': randomized[:10],
            })

    def check_packages(self):
        """Check for known RASP packages in Smali and JADX output"""
        roots = self._list_smali_roots() + self._list_jadx_source_roots()
        for root in roots:
            for rasp_type, sigs in self.rasp_signatures.items():
                for pkg in sigs["packages"]:
                    pkg_path = root / Path(pkg)
                    if pkg_path.is_dir() or pkg_path.with_suffix(".smali").exists() or pkg_path.with_suffix(".java").exists():
                        self._bump(rasp_type, "package", pkg, f"Found {rasp_type} package: {pkg} ({root.name})")

    def check_assets(self, apk_entries):
        """Check for known RASP assets and configuration files"""
        asset_names = set()
        assets_dir = self.decompiled_dir / "assets" if self.decompiled_dir else None
        if assets_dir and assets_dir.exists():
            for p in assets_dir.rglob("*"):
                asset_names.add(p.relative_to(assets_dir).as_posix())
        for entry in apk_entries:
            if entry.startswith("assets/"):
                asset_names.add(entry[len("assets/"):])

        randomized = sorted(a for a in asset_names if "/" not in a and RANDOM_ASSET_RE.match(a))
        if len(randomized) >= HEURISTIC_MIN_COUNT:
            self.results['heuristics'].append({
                'name': 'randomized_asset_names',
                'description': f"{len(randomized)} assets with random high-entropy names (typical of asset/resource encryption)",
                'samples': randomized[:10],
            })

        lowered = [a.lower() for a in asset_names]
        for rasp_type, sigs in self.rasp_signatures.items():
            for asset_name in sigs["assets"]:
                needle = asset_name.lower()
                hit = next((a for a in lowered if needle in a), None)
                if hit:
                    self._bump(rasp_type, "asset", asset_name, f"Found {rasp_type} asset artifact: {hit}")

    def check_manifest(self):
        """Check AndroidManifest.xml for stub/wrapper classes and vendor keywords"""
        if not self.decompiled_dir:
            return
        manifest_path = self.decompiled_dir / "AndroidManifest.xml"
        if not manifest_path.exists():
            return

        try:
            manifest_text = manifest_path.read_text(encoding="utf-8", errors="ignore")
        except Exception as exc:
            self.logger.warning(f"Failed to read manifest for RASP checks: {exc}")
            return
        manifest_lc = manifest_text.lower()

        for rasp_type, sigs in self.rasp_signatures.items():
            for stub in sigs.get("stub_classes", []):
                if f'"{stub.lower()}"' in manifest_lc:
                    self._bump(rasp_type, "stub_class", stub, f"Found {rasp_type} stub/wrapper class in manifest: {stub}")
            for keyword in sigs.get("manifest_keywords", []):
                if keyword.lower() in manifest_lc:
                    self._bump(rasp_type, "manifest_keyword", keyword, f"Found {rasp_type} manifest keyword: {keyword}")

    def check_code_keywords(self):
        """Check decompiled source/smali text for vendor-specific strings (budgeted)"""
        keywords = []
        for rasp_type, sigs in self.rasp_signatures.items():
            for kw in sigs.get("code_keywords", []):
                keywords.append((rasp_type, kw, kw.lower()))

        # Smali is complete; JADX is only a fallback when apktool output is missing
        roots = self._list_smali_roots() or self._list_jadx_source_roots()
        if self.decompiled_dir and (self.decompiled_dir / "assets").exists():
            roots.append(self.decompiled_dir / "assets")

        scanned = 0
        truncated = False
        start = time.monotonic()
        for root in roots:
            for dirpath, _, filenames in os.walk(root):
                for fname in filenames:
                    if scanned >= CODE_SCAN_MAX_FILES or time.monotonic() - start > CODE_SCAN_MAX_SECONDS:
                        truncated = True
                        break
                    if os.path.splitext(fname)[1].lower() not in CODE_SCAN_EXTS:
                        continue
                    fpath = os.path.join(dirpath, fname)
                    try:
                        st = os.stat(fpath)
                        if st.st_size > CODE_SCAN_MAX_FILE_SIZE or getattr(st, "st_flags", 0) & SF_DATALESS:
                            continue
                        with open(fpath, "r", encoding="utf-8", errors="ignore") as f:
                            text_lc = f.read().lower()
                    except OSError:
                        continue
                    scanned += 1
                    for rasp_type, kw, kw_lc in keywords:
                        if kw_lc in text_lc:
                            self._bump(rasp_type, "code_keyword", kw,
                                       f"Found {rasp_type} code keyword '{kw}' in {fname}")
                if truncated:
                    break
            if truncated:
                break

        self.results['scan_stats']['code_files_scanned'] = scanned
        self.results['scan_stats']['code_scan_truncated'] = truncated

    # ----------------------------------------------------------------- analysis
    def analyze(self):
        """Run all RASP detection checks"""
        self.logger.info("Starting RASP detection...")

        apk_entries = self._apk_entries()
        self.check_libraries(apk_entries)
        self.check_packages()
        self.check_assets(apk_entries)
        self.check_manifest()
        self.check_code_keywords()

        # Only families with at least one solid artifact get a verdict
        confirmed = {k: min(v, 100) for k, v in self.scores.items() if v >= VERDICT_MIN_SCORE}
        ranked = dict(sorted(confirmed.items(), key=lambda x: x[1], reverse=True))

        self.results['protection_details'] = ranked
        self.results['evidence'] = {k: self.evidence.get(k, [])[:25] for k in self.scores}
        self.results['weak_signals'] = {k: v for k, v in self.scores.items() if k not in confirmed}

        if ranked:
            best_type, best_score = next(iter(ranked.items()))
            self.results['type'] = best_type
            self.results['confidence'] = best_score
            self.results['detected'] = list(ranked.keys())

            self.results['recommendations'].append(
                f"Detected {best_type}. Specific dynamic instrumentation bypasses might be required.")
            for family in ranked:
                if family in RECOMMENDATIONS:
                    self.results['recommendations'].append(RECOMMENDATIONS[family])
            if len(ranked) > 1:
                self.results['recommendations'].append(
                    f"Multiple protection layers detected ({', '.join(ranked)}). Bypass them in load order: packer first, then RASP.")

        elif self.results['heuristics']:
            self.results['type'] = 'Unknown (heuristic)'
            self.results['recommendations'].append(
                "No known vendor matched, but hardening heuristics fired. Inspect native libs and JNI_OnLoad manually.")

        self.logger.info(f"RASP analysis complete. Type: {self.results['type']} (Confidence: {self.results['confidence']}%)")
        return self.results


def main():
    if len(sys.argv) < 5:
        print("Usage: detect_rasp.py <apk_path> <decompiled_dir> <jadx_dir> <output_json>")
        sys.exit(1)

    apk_path = sys.argv[1] if os.path.exists(sys.argv[1]) else None
    decompiled_dir = sys.argv[2] if os.path.exists(sys.argv[2]) else None
    jadx_dir = sys.argv[3] if os.path.exists(sys.argv[3]) else None
    output_json = sys.argv[4]

    detector = RaspDetector(decompiled_dir, jadx_dir, apk_path)
    results = detector.analyze()

    with open(output_json, 'w') as f:
        json.dump(results, f, indent=2)

if __name__ == "__main__":
    main()
