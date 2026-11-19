#!/usr/bin/env python3
"""
Comprehensive SAST Scanner for Android APK
Detects security vulnerabilities, malicious patterns, and suspicious behaviors
"""

import sys
import os
import json
import re
from pathlib import Path
from collections import defaultdict
import argparse

from sdk_inventory import owner_of

# String/char literals are matched first so a "/*" inside a string is not
# taken as a comment opener.
_JAVA_TOKEN = re.compile(r'"(?:\\.|[^"\\\n])*"|\'(?:\\.|[^\'\\\n])*\'|/\*.*?\*/|//[^\n]*', re.S)


def mask_java_comments(content):
    """Blank out Java comments, keeping newlines so line numbers stay exact.

    jadx writes comments such as "/* loaded from: classes.dex */" into every
    file; matching patterns against them produced most SAST false positives.
    """
    def blank(m):
        tok = m.group(0)
        if tok[0] in '"\'':
            return tok
        return re.sub(r'[^\n]', ' ', tok)
    return _JAVA_TOKEN.sub(blank, content)


_STRING_BODY = re.compile(r'"((?:\\.|[^"\\\n])*)"')


def blank_string_bodies(content):
    """Blank the *inside* of string literals, keeping the quotes and length.

    For API-call rules (a logged call, a WebView setter), a pattern word that
    appears inside a message string is noise: `Log.w("...retryPassword...")` is
    not sensitive logging. Length is preserved so match offsets still line up.
    Not used for secret/key/algorithm rules, whose evidence *is* the literal.
    """
    return _STRING_BODY.sub(lambda m: '"' + (' ' * len(m.group(1))) + '"', content)


#: Rules whose pattern is a code construct, so string-literal bodies are blanked
#: and import/package lines are skipped. Secret/key/crypto-algorithm rules keep
#: their literals and are absent here.
STRUCTURAL_CATEGORIES = frozenset({
    'logging_sensitive_data', 'insecure_storage', 'intent_vulnerabilities',
    'webview_vulnerabilities', 'insecure_network',
})

#: A log/store statement is only a finding when it also names sensitive data.
SENSITIVE_RE = re.compile(
    r'(?i)\b(pass(?:word|wd|phrase)?|pwd|secret|api[_-]?key|token|auth|bearer|'
    r'session|cookie|credential|pin|otp|jwt|mnemonic|seed|private[_-]?key|'
    r'card(?:[_-]?number)?|cvv|ssn|iban|account[_-]?number|location|latitude|'
    r'longitude|imei|imsi|email|phone)\b')

_IMPORT_RE = re.compile(r'^\s*(?:import|package)\s')


def app_first(files, root):
    """Order files so app-owned code is scanned before SDK code under the file cap."""
    return sorted(files, key=lambda f: (owner_of(str(f.relative_to(root))) != 'app', str(f)))


class SASTScanner:
    def __init__(self, apk_path, decompiled_dir, jadx_dir):
        self.apk_path = apk_path
        self.decompiled_dir = Path(decompiled_dir) if decompiled_dir and os.path.exists(decompiled_dir) else None
        self.jadx_dir = Path(jadx_dir) if jadx_dir and os.path.exists(jadx_dir) else None
        
        self.findings = {
            'critical': [],
            'high': [],
            'medium': [],
            'low': [],
            'info': [],
            'summary': {}
        }
        
        self.init_patterns()
    
    def init_patterns(self):
        """Initialize security patterns to search for"""
        
        # Critical patterns
        self.critical_patterns = {
            'root_detection_bypass': [
                r'Superuser',
                r'eu\.chainfire\.supersu',
                r'/system/xbin/su',
                r'/system/bin/su',
                r'RootTools',
            ],
            'crypto_wallet_targeting': [
                r'im\.token\.app',
                r'vip\.mytokenpocket',
                r'io\.metamask',
                r'com\.wallet\.crypto\.trustapp',
                r'com\.tronlinkpro\.wallet',
                r'com\.coinbase\.android',
                r'mnemonic',
                r'seed\s*phrase',
                r'private\s*key',
                r'wallet\s*password',
            ],
            'c2_communication': [
                r'wss?://[\w\-\.]+',
                r'https?://[\w\-\.]+\.(top|xyz|tk|ml|ga|cf|gq)',
                r'websocket',
                r'socket\.io',
            ],
            'data_exfiltration': [
                r'contacts\s*cursor',
                r'sms\s*cursor',
                r'call\s*log',
                r'accounts\s*manager',
                r'getInstalledPackages',
                r'TelephonyManager',
                r'getDeviceId',
                r'getLine1Number',
            ],
            # Dynamic code loading and shell exec. Bare `loadClass` and `.dex`
            # were dropped: reflection and "classes.dex" strings are everywhere
            # and pinned 12+ framework false positives per app.
            'remote_code_execution': [
                r'DexClassLoader',
                r'InMemoryDexClassLoader',
                r'BaseDexClassLoader',
                r'PathClassLoader\s*\(',
                r'DexFile\s*\(',
                r'createPackageContext',
                r'Runtime\.getRuntime\(\)\.exec',
                r'\bnew\s+ProcessBuilder\s*\(',
            ],
            'accessibility_abuse': [
                r'AccessibilityService',
                r'AccessibilityEvent',
                r'performGlobalAction',
                r'findAccessibilityNodeInfo',
            ],
        }
        
        # High severity patterns
        self.high_patterns = {
            # Each pattern needs crypto-API evidence: a whole quoted algorithm
            # literal (JCA names are case-insensitive, as is the scan) or a call.
            # Bare substrings (DES, ECB, MD5) used to hit identifiers such as
            # IBitmapDescriptorFactory or deserialize, and Random() hit
            # SecureRandom().
            'insecure_crypto': [
                r'"(?:DES|DESede|TripleDES|3DES|RC4|ARCFOUR|Blowfish)(?:/[A-Za-z0-9]+/[A-Za-z0-9]+)?"',
                r'"[A-Za-z0-9]+/ECB/[A-Za-z0-9]+"',
                r'"MD5"',
                r'"SHA-?1"',
                r'\bnew\s+(?:java\.util\.)?Random\s*\(',
                r'Cipher\.getInstance\(\s*"AES"\s*\)',  # AES without mode defaults to ECB
            ],
            'hardcoded_secrets': [
                r'password\s*=\s*["\'][\w]+["\']',
                r'api[_\-]?key\s*=\s*["\'][\w]+["\']',
                r'secret\s*=\s*["\'][\w]+["\']',
                r'token\s*=\s*["\'][\w]{20,}["\']',
            ],
            'api_keys': [
                r'AIza[0-9A-Za-z\-_]{35}',                                              # Google API Key / GCP
                r'AKIA[0-9A-Z]{16}',                                                    # AWS Access Key
                r'amzn\.mws\.[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}', # Amazon MWS
                r'EAACEdEose0cBA[0-9A-Za-z]+',                                          # Facebook Access Token
                r'sk_live_[0-9a-zA-Z]{24}',                                             # Stripe Standard
                r'rk_live_[0-9a-zA-Z]{24}',                                             # Stripe Restricted
                r'sq0atp-[0-9A-Za-z\-_]{22}',                                           # Square
                r'SG\.[0-9A-Za-z\-_]{22}\.[0-9A-Za-z\-_]{43}',                          # SendGrid
                r'key-[0-9a-zA-Z]{32}',                                                 # Mailgun
                r'SK[0-9a-fA-F]{32}',                                                   # Twilio
                r'xox[baprs]-[0-9]{12}-[0-9]{12}-[a-zA-Z0-9]{24}',                      # Slack Token
                r'https://hooks\.slack\.com/services/T[a-zA-Z0-9_]{8}/B[a-zA-Z0-9_]{8}/[a-zA-Z0-9_]{24}', # Slack Webhook
                r'https://[a-z0-9-]+\.firebaseio\.com',                                 # Firebase URL
            ],
            'insecure_network': [
                # Disabled TLS verification, not merely "uses a socket factory".
                r'setHostnameVerifier\s*\(\s*(?:[\w.]*ALLOW_ALL|[\w.]*\.NO_VERIFY|new\s+HostnameVerifier)',
                r'\bTrustAll\w*',
                r'trustAllHosts',
                r'checkServerTrusted\s*\([^)]*\)\s*\{\s*\}',  # empty trust manager
                r'(?-i:X509TrustManager)',
            ],
            'webview_vulnerabilities': [
                r'setJavaScriptEnabled\(\s*true\s*\)',
                r'addJavascriptInterface\s*\(',
                r'setAllowFileAccess\(\s*true\s*\)',
                r'setAllowUniversalAccessFromFileURLs\(\s*true\s*\)',
                r'setAllowContentAccess\(\s*true\s*\)',
            ],
            # Only genuinely risky runtime behaviour; plain requestPermissions() is
            # normal and manifest `dangerous_permission` already covers the grant.
            'dynamic_permission_requests': [
                r'(?-i:SYSTEM_ALERT_WINDOW)',
                r'(?-i:REQUEST_INSTALL_PACKAGES)',
                r'(?-i:MANAGE_EXTERNAL_STORAGE)',
            ],
        }

        # Medium severity patterns
        self.medium_patterns = {
            # Gated in _match_passes_gate: only when the logged statement also
            # references a sensitive identifier (password, token, pin, ...).
            'logging_sensitive_data': [
                r'Log\.[dviwe]\s*\(',
                r'System\.out\.print',
            ],
            # Bare getSharedPreferences/openFileOutput is normal; the risk is
            # world-readable/writable mode or a sensitive key (gated below).
            'insecure_storage': [
                r'MODE_WORLD_READABLE',
                r'MODE_WORLD_WRITE?ABLE',
                r'getSharedPreferences\s*\(',
                r'openFileOutput\s*\(',
            ],
            # Mutable/implicit PendingIntent and unprotected receivers; not plain
            # startActivity or an import line.
            'intent_vulnerabilities': [
                r'(?-i:FLAG_MUTABLE)',
                r'PendingIntent\.get\w+\s*\((?![^)]*FLAG_IMMUTABLE)',
                r'registerReceiver\s*\(',
            ],
        }
    
    def add_finding(self, severity, category, title, description, file_path, line_number=None, code_snippet=None):
        """Add a security finding"""
        finding = {
            'category': category,
            'title': title,
            'description': description,
            'file': str(file_path),
            'severity': severity
        }
        
        if line_number:
            finding['line'] = line_number
        
        if code_snippet:
            finding['code'] = code_snippet
        
        self.findings[severity].append(finding)
    
    @staticmethod
    def _line_at(content, pos):
        """The full source line containing offset `pos`."""
        start = content.rfind('\n', 0, pos) + 1
        end = content.find('\n', pos)
        return content[start:end if end != -1 else len(content)]

    def _match_passes_gate(self, category, line_text, snippet):
        """Context rules that a regex match can't express on its own.

        Returns False to drop a structurally-matched but benign hit:
        - logging / sensitive storage only count when sensitive data is named;
        - a bare `getSharedPreferences(...)` with no world-mode and no sensitive
          key is normal and is dropped.
        """
        text = f'{line_text}\n{snippet or ""}'
        if category == 'logging_sensitive_data':
            return bool(SENSITIVE_RE.search(text))
        if category == 'insecure_storage':
            if re.search(r'MODE_WORLD_(?:READABLE|WRITE?ABLE)', text):
                return True
            if re.search(r'getSharedPreferences|openFileOutput', line_text):
                return bool(SENSITIVE_RE.search(text))
        return True

    def _emit_matches(self, severity, category, patterns, search_text, snippet_src, rel_path,
                      per_file_cap, detected_title, describe):
        """Run one category's patterns over `search_text`, applying the import
        skip and the context gate, and record each surviving match.

        `search_text` is the text matched against (comments masked, and string
        bodies also blanked for structural rules, so offsets map onto
        `snippet_src`, the raw text shown to the user).
        """
        structural = category in STRUCTURAL_CATEGORIES
        for pattern in patterns:
            count = 0
            for match in re.finditer(pattern, search_text, re.IGNORECASE):
                if count >= per_file_cap:
                    break
                line_text = self._line_at(search_text, match.start())
                if structural and _IMPORT_RE.match(line_text):
                    continue
                line_num = search_text.count('\n', 0, match.start()) + 1
                snippet = self.extract_snippet(snippet_src, match.start(), match.end(), context_lines=3)
                if not self._match_passes_gate(category, self._line_at(snippet_src, match.start()), snippet):
                    continue
                self.add_finding(severity, category, detected_title(category),
                                 describe(match, pattern), rel_path, line_num, snippet)
                count += 1

    def _search_text_for(self, category, masked, blanked):
        """Pick the text a category matches against: structural rules use the
        string-body-blanked variant, literal rules keep their string contents."""
        return blanked if category in STRUCTURAL_CATEGORIES else masked

    def scan_smali_files(self):
        """Scan SMALI files for security issues"""
        if not self.decompiled_dir:
            return

        print("Scanning SMALI files...")

        # Find all smali directories
        smali_dirs = [d for d in self.decompiled_dir.iterdir() if d.is_dir() and d.name.startswith('smali')]

        for smali_dir in smali_dirs:
            smali_files = app_first(smali_dir.rglob('*.smali'), self.decompiled_dir)[:500]  # Limit to avoid too long processing

            for smali_file in smali_files:
                try:
                    content = smali_file.read_text(errors='ignore')
                    rel = smali_file.relative_to(self.decompiled_dir)
                    for category, patterns in self.critical_patterns.items():
                        self._emit_matches(
                            'critical', category, patterns, content, content, rel,
                            per_file_cap=3,
                            detected_title=lambda c: f'{c.replace("_", " ").title()} Detected',
                            describe=lambda m, p: f'Suspicious pattern found: {m.group(0)[:100]}')
                except Exception:
                    continue

    def scan_java_files(self):
        """Scan Java source files for security issues"""
        if not self.jadx_dir or not self.jadx_dir.exists():
            return

        print("Scanning Java source files...")

        java_files = app_first(self.jadx_dir.rglob('*.java'), self.jadx_dir)[:500]

        for java_file in java_files:
            try:
                raw = java_file.read_text(errors='ignore')
                masked = mask_java_comments(raw)        # comments blanked, offsets intact
                blanked = blank_string_bodies(masked)   # + string bodies, for structural rules
                rel = java_file.relative_to(self.jadx_dir)

                for severity, pattern_dict in (('critical', self.critical_patterns),
                                               ('high', self.high_patterns),
                                               ('medium', self.medium_patterns)):
                    for category, patterns in pattern_dict.items():
                        self._emit_matches(
                            severity, category, patterns,
                            self._search_text_for(category, masked, blanked), raw, rel,
                            per_file_cap=5,
                            detected_title=lambda c: c.replace("_", " ").title(),
                            describe=lambda m, p: f'Pattern detected: {m.group(0)[:100]}')
            except Exception:
                continue
                
            except Exception as e:
                continue
    
    def scan_native_libraries(self):
        """Scan native libraries for suspicious strings and API keys"""
        if not self.decompiled_dir:
            return
        
        print("Scanning native libraries...")
        
        lib_dir = self.decompiled_dir / 'lib'
        if not lib_dir.exists():
            return
        
        so_files = list(lib_dir.rglob('*.so'))

        # High-signal native strings only. The old list (http, socket, exec,
        # system, encrypt...) appears in essentially every .so (libc, OpenSSL,
        # the runtime) and produced pure noise. These are anti-analysis /
        # tampering markers and embedded key material, reported as info.
        native_markers = [
            (re.compile(rb'(?<![A-Za-z])(?:/system/bin/su|/system/xbin/su|which su)\b'), 'Root-check path'),
            (re.compile(rb'\bfrida|gum-js-loop|gmain\b'), 'Frida instrumentation marker'),
            (re.compile(rb'\b(?:magisk|xposed|substrate|zygisk)\b', re.IGNORECASE), 'Hooking/root framework marker'),
            (re.compile(rb'ptrace|/proc/self/status|TracerPid'), 'Anti-debug marker'),
            (re.compile(rb'-----BEGIN (?:RSA |EC |)PRIVATE KEY-----'), 'Embedded private key'),
        ]

        for so_file in so_files:
            try:
                # Read as binary and search for strings
                with open(so_file, 'rb') as f:
                    content_bytes = f.read()

                    seen = set()
                    for rx, label in native_markers:
                        m = rx.search(content_bytes)
                        if m and label not in seen:
                            seen.add(label)
                            sev = 'high' if label == 'Embedded private key' else 'info'
                            self.add_finding(
                                sev,
                                'native_code',
                                'Native Anti-Analysis / Key Marker',
                                f'{label}: {m.group(0)[:40].decode("latin-1", "ignore")}',
                                so_file.relative_to(self.decompiled_dir),
                                code_snippet=f'Marker: {label}'
                            )

                    # Also scan for API keys by decoding to string (ignoring errors)
                    content_str = content_bytes.decode('utf-8', errors='ignore')
                    if 'api_keys' in self.high_patterns:
                        for pattern in self.high_patterns['api_keys']:
                            matches = list(re.finditer(pattern, content_str, re.IGNORECASE))
                            if matches:
                                # Ensure uniqueness using set
                                unique_matches = set(m.group(0) for m in matches)
                                for match_str in list(unique_matches)[:3]:  # Limit to 3 uniques per file
                                    self.add_finding(
                                        'high',
                                        'api_keys',
                                        'API Key in Native Library',
                                        f'Found hardcoded API Key: {match_str[:50]}...',
                                        so_file.relative_to(self.decompiled_dir),
                                        code_snippet=f'Match: {match_str}'
                                    )
                            
            except Exception:
                continue
    
    def scan_assets(self):
        """Scan assets directory for suspicious files"""
        if not self.decompiled_dir:
            return
        
        print("Scanning assets...")
        
        assets_dir = self.decompiled_dir / 'assets'
        if not assets_dir.exists():
            return
        
        # Look for suspicious files
        suspicious_extensions = ['.dex', '.so', '.apk', '.jar', '.zip']
        
        for asset_file in assets_dir.rglob('*'):
            if asset_file.is_file():
                # Check extension
                if any(asset_file.suffix == ext for ext in suspicious_extensions):
                    self.add_finding(
                        'high',
                        'suspicious_asset',
                        'Suspicious File in Assets',
                        f'Executable or archive file found in assets: {asset_file.suffix}',
                        asset_file.relative_to(self.decompiled_dir)
                    )
                
                # Check for encoded/encrypted data
                if asset_file.suffix in ['.bin', '.dat', '.enc']:
                    self.add_finding(
                        'medium',
                        'suspicious_asset',
                        'Potential Encoded Data',
                        'Binary or encoded file in assets',
                        asset_file.relative_to(self.decompiled_dir)
                    )

    def scan_xml_resources(self):
        """Scan XML resources (AndroidManifest, strings.xml) for secrets and API keys"""
        if not self.decompiled_dir:
            return
            
        print("Scanning XML resources...")
        
        target_files = []
        manifest_path = self.decompiled_dir / 'AndroidManifest.xml'
        if manifest_path.exists():
            target_files.append(manifest_path)
            
        # Target all XMLs in res/values/
        res_values_dir = self.decompiled_dir / 'res' / 'values'
        if res_values_dir.exists():
            target_files.extend(list(res_values_dir.rglob('*.xml')))
            
        for xml_file in target_files:
            try:
                content = xml_file.read_text(errors='ignore')
                
                patterns_to_check = {
                    'critical': {
                        'c2_communication': self.critical_patterns.get('c2_communication', [])
                    },
                    'high': {
                        'hardcoded_secrets': self.high_patterns.get('hardcoded_secrets', []),
                        'api_keys': self.high_patterns.get('api_keys', [])
                    }
                }
                
                for severity, pattern_dict in patterns_to_check.items():
                    for category, patterns in pattern_dict.items():
                        for pattern in patterns:
                            matches = list(re.finditer(pattern, content, re.IGNORECASE))
                            if matches:
                                for match in matches[:3]: # Limit to avoid spam
                                    line_num = content[:match.start()].count('\n') + 1
                                    snippet = self.extract_snippet(content, match.start(), match.end(), context_lines=2)
                                    
                                    # Ensure findings are unique via simple deduplication
                                    # SAST analyzer doesn't have built-in dedup for the same line/content easily without checking the array,
                                    # so we just add it
                                    self.add_finding(
                                        severity,
                                        category,
                                        f'{category.replace("_", " ").title()} in XML',
                                        f'Pattern detected: {match.group(0)[:100]}',
                                        xml_file.relative_to(self.decompiled_dir),
                                        line_num,
                                        snippet
                                    )
            except Exception:
                continue
    
    def extract_snippet(self, content, start, end, context_lines=2):
        """Extract code snippet with context"""
        lines = content.split('\n')
        start_line = content[:start].count('\n')
        end_line = content[:end].count('\n')
        
        snippet_start = max(0, start_line - context_lines)
        snippet_end = min(len(lines), end_line + context_lines + 1)
        
        snippet_lines = lines[snippet_start:snippet_end]
        return '\n'.join(snippet_lines)
    
    def generate_summary(self):
        """Generate summary statistics"""
        self.findings['summary'] = {
            'total_findings': sum(len(self.findings[sev]) for sev in ['critical', 'high', 'medium', 'low', 'info']),
            'by_severity': {
                'critical': len(self.findings['critical']),
                'high': len(self.findings['high']),
                'medium': len(self.findings['medium']),
                'low': len(self.findings['low']),
                'info': len(self.findings['info']),
            },
            'risk_score': self.calculate_risk_score()
        }
    
    def calculate_risk_score(self):
        """Calculate overall risk score (0-100)"""
        weights = {
            'critical': 10,
            'high': 5,
            'medium': 2,
            'low': 1,
            'info': 0
        }
        
        score = sum(
            len(self.findings[sev]) * weight 
            for sev, weight in weights.items()
        )
        
        # Normalize to 0-100
        return min(100, score)
    
    def run(self):
        """Run all scans"""
        print("Starting SAST Analysis...")
        
        self.scan_smali_files()
        self.scan_java_files()
        self.scan_native_libraries()
        self.scan_assets()
        self.scan_xml_resources()
        
        self.generate_summary()
        
        print(f"SAST Analysis Complete!")
        print(f"Total Findings: {self.findings['summary']['total_findings']}")
        print(f"Risk Score: {self.findings['summary']['risk_score']}/100")
        
        return self.findings

def main():
    parser = argparse.ArgumentParser(description='SAST Scanner for Android APK')
    parser.add_argument('--apk', required=True, help='Path to APK file')
    parser.add_argument('--decompiled', help='Path to decompiled directory')
    parser.add_argument('--jadx', help='Path to JADX output directory')
    parser.add_argument('--output', required=True, help='Output JSON file')
    
    args = parser.parse_args()
    
    scanner = SASTScanner(args.apk, args.decompiled, args.jadx)
    findings = scanner.run()
    
    # Save results
    with open(args.output, 'w') as f:
        json.dump(findings, f, indent=2)
    
    print(f"\nResults saved to: {args.output}")

if __name__ == '__main__':
    main()
