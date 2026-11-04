#!/usr/bin/env python3
"""
Frida Script Generator

Builds a target-specific Frida instrumentation script from the static findings,
so the analyst starts dynamic analysis with hooks that already match this app:
bypasses for the detected RASP vendor, SSL pinning unpinning, crypto/key logging,
root/debugger-detection neutralizers, and (for packed apps) a DEX dump pointer.

Usage: frida_script_generator.py <temp_dir> <output_js> [package_name]
Reads rasp_report.json, framework_report.json, sast_findings.json,
dex_payload_report.json and network_findings.json from <temp_dir> when present.

When an agent-driven REA deep pass has run (rea_deep.json present), the native
hook points it recovered — tasks whose `feeds` include `frida_native_hooks` —
are turned into concrete Interceptor.attach blocks at the recovered addresses.
"""

import os
import sys
import json

HEADER = """// ============================================================
// Anais auto-generated Frida script
// Generated from static findings for: {pkg}
// Usage: frida -U -f {pkg} -l {fname} --no-pause
// ============================================================
console.log("[Anais] Instrumentation starting for {pkg}");
"""

SSL_UNPINNING = """
// --- SSL pinning bypass (OkHttp / TrustManager / Conscrypt) ---
Java.perform(function () {
    try {
        var X509TrustManager = Java.use('javax.net.ssl.X509TrustManager');
        var SSLContext = Java.use('javax.net.ssl.SSLContext');
        var TrustManager = Java.registerClass({
            name: 'com.anais.TrustAll',
            implements: [X509TrustManager],
            methods: {
                checkClientTrusted: function () {},
                checkServerTrusted: function () {},
                getAcceptedIssuers: function () { return []; }
            }
        });
        var init = SSLContext.init.overload(
            '[Ljavax.net.ssl.KeyManager;', '[Ljavax.net.ssl.TrustManager;', 'java.security.SecureRandom');
        init.implementation = function (km, tm, sr) {
            console.log('[Anais] SSLContext.init hooked - installing permissive TrustManager');
            init.call(this, km, [TrustManager.$new()], sr);
        };
    } catch (e) { console.log('[Anais] TrustManager hook failed: ' + e); }

    try {
        var CertPinner = Java.use('okhttp3.CertificatePinner');
        CertPinner.check.overload('java.lang.String', 'java.util.List').implementation = function () {
            console.log('[Anais] okhttp3 CertificatePinner.check bypassed');
        };
    } catch (e) {}
});
"""

CRYPTO_LOGGER = """
// --- Crypto / key material logging ---
Java.perform(function () {
    try {
        var Cipher = Java.use('javax.crypto.Cipher');
        Cipher.doFinal.overload('[B').implementation = function (data) {
            var out = this.doFinal(data);
            console.log('[Anais][crypto] ' + this.getAlgorithm() + ' doFinal len=' + (data ? data.length : 0));
            return out;
        };
    } catch (e) {}
    try {
        var KeySpec = Java.use('javax.crypto.spec.SecretKeySpec');
        KeySpec.$init.overload('[B', 'java.lang.String').implementation = function (key, alg) {
            try { console.log('[Anais][key] ' + alg + ' = ' + Java.use('android.util.Base64').encodeToString(key, 0)); } catch (e) {}
            return this.$init(key, alg);
        };
    } catch (e) {}
});
"""

ROOT_DEBUG_BYPASS = """
// --- Root / debugger detection neutralizers ---
Java.perform(function () {
    try {
        var Debug = Java.use('android.os.Debug');
        Debug.isDebuggerConnected.implementation = function () { return false; };
    } catch (e) {}
    try {
        var Runtime = Java.use('java.lang.Runtime');
        Runtime.exec.overload('java.lang.String').implementation = function (cmd) {
            if (cmd && (cmd.indexOf('su') !== -1 || cmd.indexOf('which') !== -1)) {
                console.log('[Anais] blocked root-probe exec: ' + cmd);
                throw Java.use('java.io.IOException').$new('blocked');
            }
            return this.exec(cmd);
        };
    } catch (e) {}
});
"""

NATIVE_TRACE = """
// --- Native JNI_OnLoad trace (RASP/packers run checks here) ---
try {
    Interceptor.attach(Module.getExportByName(null, 'dlopen'), {
        onEnter: function (args) {
            var p = args[0]; if (p) { var n = p.readCString(); if (n && n.indexOf('.so') !== -1) console.log('[Anais][dlopen] ' + n); }
        }
    });
} catch (e) { console.log('[Anais] dlopen hook failed: ' + e); }
"""

RASP_NOTES = {
    "Talsec / freeRASP": "// Hook com.aheaditec.talsec ThreatListener callbacks to swallow detections.",
    "Appdome": "// Appdome runs in native code; trace JNI_OnLoad and the process-kill path before Java hooks.",
    "Promon SHIELD": "// Promon checks in native libs; trace JNI_OnLoad exit/abort before hooking Java.",
    "Tencent Legu": "// DEX shell: let the wrapper Application load, then dump DEX from memory.",
    "Qihoo 360 Jiagu": "// DEX shell: dump decrypted DEX after com.stub.StubApp runs.",
    "Bangcle / SecNeo": "// DEX shell: dump DEX after the wrapper Application loads.",
}


def _lib_from_target(target):
    """Return the .so basename from a task target like 'lib/<abi>/libfoo.so'."""
    if not target or not isinstance(target, str):
        return None
    base = os.path.basename(target.strip())
    return base if base.endswith(".so") else None


def _js_str(s):
    """Escape a string for embedding in single-quoted JS."""
    return str(s).replace("\\", "\\\\").replace("'", "\\'")


def build_native_hooks(deep):
    """Build a Frida block from REA deep-pass native hook points.

    Returns (js_or_None, hook_count). Hooks are grouped per library; an entry
    with an address attaches at base+offset, one with only a symbol resolves the
    export by name.
    """
    by_lib = {}
    for c in deep.get("completed", []) or []:
        lib = _lib_from_target(c.get("target"))
        for h in c.get("native_hooks", []) or []:
            if not isinstance(h, dict):
                continue
            addr = h.get("address")
            sym = h.get("symbol")
            if not (addr or sym):
                continue
            key = lib or "<unknown.so>"
            by_lib.setdefault(key, []).append({
                "symbol": sym, "address": addr, "note": h.get("note"),
                "task": c.get("task_id"),
            })
    if not by_lib:
        return None, 0

    lines = ["", "// --- REA-recovered native hook points (deep pass) ---",
             "// Addresses are file offsets from REA open_binary; attached at module base + offset.",
             "(function () {"]
    count = 0
    for lib, hooks in by_lib.items():
        safe = _js_str(lib)
        if lib == "<unknown.so>":
            lines.append(f"  // NOTE: library unknown for the hooks below; set the correct .so name.")
        lines.append(f"  var base = Module.findBaseAddress('{safe}');")
        lines.append(f"  if (!base) {{ console.log('[Anais] {safe} not loaded yet; "
                     f"attach after dlopen or re-run with the right name'); }}")
        lines.append("  else {")
        for h in hooks:
            count += 1
            label = _js_str(f"{lib}!{h.get('symbol') or h.get('address')}"
                            + (f" ({h['note']})" if h.get("note") else ""))
            if h.get("address"):
                lines.append(f"    try {{ Interceptor.attach(base.add(ptr('{_js_str(h['address'])}')), {{")
                lines.append(f"      onEnter: function (args) {{ console.log('[Anais][native] enter {label}'); }},")
                lines.append(f"      onLeave: function (ret) {{ console.log('[Anais][native] leave {label} ret=' + ret); }}")
                lines.append("    }); } catch (e) { console.log('[Anais] hook failed: ' + e); }")
            else:
                sym = _js_str(h["symbol"])
                lines.append(f"    try {{ Interceptor.attach(Module.getExportByName('{safe}', '{sym}'), {{")
                lines.append(f"      onEnter: function (args) {{ console.log('[Anais][native] enter {label}'); }}")
                lines.append("    }); } catch (e) { console.log('[Anais] export hook failed: ' + e); }")
        lines.append("  }")
    lines.append("})();")
    return "\n".join(lines) + "\n", count


def _load(temp_dir, name):
    p = os.path.join(temp_dir, name)
    if os.path.isfile(p):
        try:
            with open(p) as f:
                return json.load(f)
        except Exception:
            return {}
    return {}


def main():
    if len(sys.argv) < 3:
        print("Usage: frida_script_generator.py <temp_dir> <output_js> [package_name]")
        sys.exit(1)

    temp_dir = sys.argv[1]
    output_js = sys.argv[2]
    pkg = sys.argv[3] if len(sys.argv) > 3 else "<package.name>"

    rasp = _load(temp_dir, "rasp_report.json")
    framework = _load(temp_dir, "framework_report.json")
    sast = _load(temp_dir, "sast_findings.json")
    dexp = _load(temp_dir, "dex_payload_report.json")
    network = _load(temp_dir, "network_findings.json")
    deep = _load(temp_dir, "rea_deep.json")

    fname = os.path.basename(output_js)
    blocks = [HEADER.format(pkg=pkg, fname=fname)]
    included = []

    # SSL unpinning if any https endpoint or network findings exist (nearly always useful)
    if network.get("urls") or network.get("suspicious_urls") or network.get("api_endpoints"):
        blocks.append(SSL_UNPINNING)
        included.append("SSL unpinning")

    # Crypto logging if crypto-related SAST findings present
    sast_text = json.dumps(sast).lower()
    if any(k in sast_text for k in ("crypto", "cipher", "aes", "des", "md5", "secretkey")):
        blocks.append(CRYPTO_LOGGER)
        included.append("crypto/key logging")

    # Root/debugger bypass if RASP detected or relevant findings
    if rasp.get("detected") or "root" in sast_text or "debugger" in sast_text:
        blocks.append(ROOT_DEBUG_BYPASS)
        included.append("root/debugger bypass")

    # Native trace if RASP/packer/native framework
    native_fw = any(d.get("framework") in ("Flutter", "Unity", "Xamarin / .NET MAUI")
                    for d in framework.get("frameworks", []))
    if rasp.get("detected") or native_fw or dexp.get("stub_dex_detected"):
        blocks.append(NATIVE_TRACE)
        included.append("native dlopen/JNI trace")

    # REA-recovered native hooks (Phase 3): concrete addresses beat the generic trace
    native_hooks_js, hook_count = build_native_hooks(deep)
    if native_hooks_js:
        blocks.append(native_hooks_js)
        included.append(f"REA native hooks ({hook_count})")

    # Vendor-specific notes
    notes = []
    for fam in rasp.get("detected", []) or []:
        if fam in RASP_NOTES:
            notes.append(RASP_NOTES[fam])
    if dexp.get("stub_dex_detected"):
        notes.append("// Packed DEX detected: pair with scripts/frida/frida_dex_dump.js to dump the real DEX.")
    if notes:
        blocks.append("\n// --- Target-specific notes ---\n" + "\n".join(notes) + "\n")

    if not included:
        blocks.append("\n// No strong signals; starting with a generic SSL unpin + crypto log.\n")
        blocks.append(SSL_UNPINNING)
        blocks.append(CRYPTO_LOGGER)
        included = ["SSL unpinning", "crypto/key logging"]

    blocks.append(f'\nconsole.log("[Anais] Hooks active: {", ".join(included)}");\n')

    with open(output_js, "w") as f:
        f.write("\n".join(blocks))

    print(f"Frida script written ({', '.join(included)})")


if __name__ == "__main__":
    main()
