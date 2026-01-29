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
            'remote_code_execution': [
                r'DexClassLoader',
                r'PathClassLoader',
                r'loadClass',
                r'\.dex',
                r'Runtime\.exec',
                r'ProcessBuilder',
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
            'insecure_crypto': [
                r'DES',
                r'ECB',
                r'MD5',
                r'SHA1(?!SHA256)',
                r'Random\(\)',
                r'Cipher\.getInstance\("AES"\)',  # Without mode
            ],
            'hardcoded_secrets': [
                r'password\s*=\s*["\'][\w]+["\']',
                r'api[_\-]?key\s*=\s*["\'][\w]+["\']',
                r'secret\s*=\s*["\'][\w]+["\']',
                r'token\s*=\s*["\'][\w]{20,}["\']',
            ],
            'insecure_network': [
                r'setHostnameVerifier.*ALLOW_ALL',
                r'TrustAllCertificates',
                r'http://(?!localhost)',
                r'trustAllHosts',
                r'SSLSocketFactory',
            ],
            'webview_vulnerabilities': [
                r'setJavaScriptEnabled\(true\)',
                r'addJavascriptInterface',
                r'setAllowFileAccess\(true\)',
                r'setAllowContentAccess\(true\)',
            ],
            'dynamic_permission_requests': [
                r'requestPermissions',
                r'READ_SMS',
                r'RECEIVE_SMS',
                r'READ_CONTACTS',
                r'READ_CALL_LOG',
                r'SYSTEM_ALERT_WINDOW',
                r'REQUEST_INSTALL_PACKAGES',
            ],
        }
        
        # Medium severity patterns
        self.medium_patterns = {
            'logging_sensitive_data': [
                r'Log\.[dviwe]\(',
                r'printStackTrace',
                r'System\.out\.print',
            ],
            'insecure_storage': [
                r'MODE_WORLD_READABLE',
                r'MODE_WORLD_WRITEABLE',
                r'openFileOutput',
                r'getSharedPreferences',
            ],
            'intent_vulnerabilities': [
                r'sendBroadcast',
                r'startActivity',
                r'startService',
                r'getIntent\(\)',
                r'PendingIntent',
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
    
    def scan_smali_files(self):
        """Scan SMALI files for security issues"""
        if not self.decompiled_dir:
            return
        
        print("Scanning SMALI files...")
        
        # Find all smali directories
        smali_dirs = [d for d in self.decompiled_dir.iterdir() if d.is_dir() and d.name.startswith('smali')]
        
        for smali_dir in smali_dirs:
            smali_files = list(smali_dir.rglob('*.smali'))[:500]  # Limit to avoid too long processing
            
            for smali_file in smali_files:
                try:
                    content = smali_file.read_text(errors='ignore')
                    
                    # Check critical patterns
                    for category, patterns in self.critical_patterns.items():
                        for pattern in patterns:
                            matches = list(re.finditer(pattern, content, re.IGNORECASE))
                            if matches:
                                for match in matches[:3]:  # Limit matches per file
                                    line_num = content[:match.start()].count('\n') + 1
                                    snippet = self.extract_snippet(content, match.start(), match.end())
                                    
                                    self.add_finding(
                                        'critical',
                                        category,
                                        f'{category.replace("_", " ").title()} Detected',
                                        f'Suspicious pattern found: {pattern}',
                                        smali_file.relative_to(self.decompiled_dir),
                                        line_num,
                                        snippet
                                    )
                    
                except Exception as e:
                    continue
    
    def scan_java_files(self):
        """Scan Java source files for security issues"""
        if not self.jadx_dir or not self.jadx_dir.exists():
            return
        
        print("Scanning Java source files...")
        
        java_files = list(self.jadx_dir.rglob('*.java'))[:500]
        
        for java_file in java_files:
            try:
                content = java_file.read_text(errors='ignore')
                lines = content.split('\n')
                
                # Scan for all pattern categories
                all_patterns = [
                    ('critical', self.critical_patterns),
                    ('high', self.high_patterns),
                    ('medium', self.medium_patterns)
                ]
                
                for severity, pattern_dict in all_patterns:
                    for category, patterns in pattern_dict.items():
                        for pattern in patterns:
                            matches = list(re.finditer(pattern, content, re.IGNORECASE))
                            
                            if matches:
                                for match in matches[:5]:  # Limit per file
                                    line_num = content[:match.start()].count('\n') + 1
                                    snippet = self.extract_snippet(content, match.start(), match.end(), context_lines=3)
                                    
                                    self.add_finding(
                                        severity,
                                        category,
                                        f'{category.replace("_", " ").title()}',
                                        f'Pattern detected: {match.group(0)[:100]}',
                                        java_file.relative_to(self.jadx_dir),
                                        line_num,
                                        snippet
                                    )
                
            except Exception as e:
                continue
    
    def scan_native_libraries(self):
        """Scan native libraries for suspicious strings"""
        if not self.decompiled_dir:
            return
        
        print("Scanning native libraries...")
        
        lib_dir = self.decompiled_dir / 'lib'
        if not lib_dir.exists():
            return
        
        so_files = list(lib_dir.rglob('*.so'))
        
        suspicious_strings = [
            'curl',
            'wget',
            'http',
            'socket',
            'exec',
            'system',
            'popen',
            'decrypt',
            'encrypt',
        ]
        
        for so_file in so_files:
            try:
                # Read as binary and search for strings
                with open(so_file, 'rb') as f:
                    content = f.read()
                    
                    for susp_str in suspicious_strings:
                        if susp_str.encode() in content:
                            self.add_finding(
                                'medium',
                                'native_code',
                                'Suspicious String in Native Library',
                                f'Found: {susp_str}',
                                so_file.relative_to(self.decompiled_dir),
                                code_snippet=f'String: {susp_str}'
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
