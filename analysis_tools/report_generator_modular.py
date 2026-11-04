#!/usr/bin/env python3
"""
Modular Report Generator
Generates split reports with main index and separate detail files
"""

import sys
import json
import math
import argparse
from pathlib import Path
from datetime import datetime

class ModularReportGenerator:
    def __init__(self, workspace, temp_dir, apk_name, sha256):
        self.workspace = Path(workspace)
        self.temp_dir = Path(temp_dir)
        self.apk_name = apk_name
        self.sha256 = sha256
        self.timestamp = datetime.now().strftime('%Y-%m-%d %H:%M:%S')
        self.report_dir = self.workspace / 'reports'
        self.report_dir.mkdir(exist_ok=True)
        
        # Load all analysis results
        self.load_results()
    
    def load_results(self):
        """Load all JSON results from temp directory"""
        self.results = {}
        
        result_files = {
            'basic_info': 'basic_info.json',
            'encryption_check': 'encryption_check.json',
            'obfuscation': 'obfuscation_report.json',
            'rasp': 'rasp_report.json',
            'dex_payload': 'dex_payload_report.json',
            'so_strings': 'so_strings.json',
            'entropy': 'entropy_analysis.json',
            'yara': 'yara_enhanced.json',
            'sast': 'sast_findings.json',
            'manifest': 'manifest_findings.json',
            'network': 'network_findings.json',
            'signing': 'signing_analysis.json',
            'input_prep': 'prepare_input.json',
            'framework': 'framework_report.json',
            'sdk_inventory': 'sdk_inventory.json',
            'rea': 'rea_report.json',
            'rea_deep': 'rea_deep.json',
            'dynamic': 'dynamic_findings.json',
        }
        
        for key, filename in result_files.items():
            filepath = self.temp_dir / filename
            if filepath.exists():
                try:
                    with open(filepath, 'r') as f:
                        self.results[key] = json.load(f)
                except Exception as e:
                    self.results[key] = {'error': str(e)}
            else:
                self.results[key] = {}
    
    def generate_main_report(self, output_file):
        """Generate main index report with links to detailed reports"""
        
        md = []
        
        # Header
        md.append("# Android Malware Analysis Report\n")
        md.append(f"**Generated:** {self.timestamp}\n")
        md.append(f"**APK:** `{self.apk_name}`\n")
        md.append(f"**SHA256:** `{self.sha256}`\n")
        md.append("\n---\n")
        
        # Quick Navigation
        md.append("\n## 📑 Quick Navigation\n")
        md.append("- [Executive Summary](#executive-summary)")
        md.append("- [APK Information](#apk-information)")
        md.append("- [App Framework](#framework)")
        md.append("- [Protection & Obfuscation](#protection-obfuscation)")
        md.append("- [RASP Detection](#rasp-detection)")
        md.append("- [Signing & Certificates](#signing)")
        md.append("- [Third-Party SDKs](#sdks)")
        if self.results.get('rea', {}).get('available'):
            md.append("- [REA Deep Analysis](#rea)")
        if self.results.get('dynamic', {}).get('executed'):
            md.append("- [Dynamic Analysis](#dynamic)")
        md.append("- 🔗 [Security Findings (SAST)](./sast_findings.md)")
        md.append("- 🔗 [AndroidManifest Analysis](./manifest_analysis.md)")
        md.append("- 🔗 [Network Analysis](./network_analysis.md)")
        md.append("- 🔗 [Entropy Analysis](./entropy_analysis.md) - **Encrypted Payload Detection**")
        md.append("- 🔗 [YARA Scan Results](./yara_results.md)")
        md.append("- 🔗 [Detailed Recommendations](./recommendations.md)")
        md.append("")
        
        # Executive Summary
        md.append("\n## 📊 Executive Summary {#executive-summary}\n")
        self._add_executive_summary(md)
        
        # APK Information
        md.append("\n## 📱 APK Information {#apk-information}\n")
        self._add_apk_info(md)
        
        # App framework
        md.append("\n## 🧩 App Framework {#framework}\n")
        self._add_framework_info(md)

        # Protection & Obfuscation
        md.append("\n## 🔒 Protection & Obfuscation Analysis {#protection-obfuscation}\n")
        self._add_obfuscation_info(md)

        # RASP detection
        md.append("\n## 🛡️ RASP Detection {#rasp-detection}\n")
        self._add_rasp_info(md)

        # Signing & certificates
        md.append("\n## 🔏 Signing & Certificates {#signing}\n")
        self._add_signing_info(md)

        # Third-party SDKs
        md.append("\n## 📦 Third-Party SDKs {#sdks}\n")
        self._add_sdk_info(md)

        # REA deep analysis (only when the bridge ran)
        if self.results.get('rea', {}).get('available'):
            md.append("\n## 🔬 REA Deep Analysis {#rea}\n")
            self._add_rea_info(md)

        # Dynamic analysis (only when the bridge executed on a device)
        if self.results.get('dynamic', {}).get('executed'):
            md.append("\n## ▶️ Dynamic Analysis {#dynamic}\n")
            self._add_dynamic_info(md)

        # Summary sections with links to details
        md.append("\n## 📊 Analysis Results Summary\n")
        md.append(self._get_findings_summary())
        
        md.append("\n### For Detailed Analysis:\n")
        md.append("- 📄 **[Security Findings (SAST)](./sast_findings.md)** - Complete vulnerability analysis")
        md.append("- 📄 **[Manifest Analysis](./manifest_analysis.md)** - Permission and component security")
        md.append("- 📄 **[Network Analysis](./network_analysis.md)** - Network artifacts and C2 indicators")
        md.append("- 📄 **[Entropy Analysis](./entropy_analysis.md)** - Encrypted payload detection & visualization")
        md.append("- 📄 **[YARA Results](./yara_results.md)** - Malware pattern matching with detailed categorization")
        md.append("- 📄 **[Recommendations](./recommendations.md)** - Actionable security guidance")
        md.append("")
        
        # Write main report
        with open(output_file, 'w') as f:
            f.write('\n'.join(md))
        
        # Generate detailed reports
        self._generate_sast_report()
        self._generate_manifest_report()
        self._generate_network_report()
        self._generate_entropy_report()
        self._generate_yara_report()
        self._generate_recommendations_report()
    
    def _get_findings_summary(self):
        """Get summary of findings"""
        lines = []
        
        # SAST Summary
        sast = self.results.get('sast', {}).get('summary', {})
        if sast:
            lines.append(f"\n**🔴 Security Findings:** {sast.get('total_findings', 0)} issues found")
            lines.append(f"- Critical: {sast.get('critical', 0)}")
            lines.append(f"- High: {sast.get('high', 0)}")
            lines.append(f"- Medium: {sast.get('medium', 0)}")
            lines.append(f"- Low: {sast.get('low', 0)}")
        
        # Manifest Summary
        manifest = self.results.get('manifest', {})
        if manifest:
            dangerous_perms = len(manifest.get('dangerous_permissions', []))
            exported_components = len(manifest.get('exported_components', []))
            lines.append(f"\n**📋 Manifest Issues:**")
            lines.append(f"- Dangerous permissions: {dangerous_perms}")
            lines.append(f"- Exported components: {exported_components}")
        
        # Network Summary
        network = self.results.get('network', {})
        if network:
            urls = len(network.get('urls', []))
            suspicious = len(network.get('suspicious_urls', []))
            lines.append(f"\n**🌐 Network Artifacts:**")
            lines.append(f"- URLs found: {urls}")
            lines.append(f"- Suspicious URLs: {suspicious}")
        
        # Entropy Summary
        entropy = self.results.get('entropy', {})
        if entropy and 'summary' in entropy:
            summary = entropy['summary']
            lines.append(f"\n**📊 Entropy Analysis:**")
            lines.append(f"- Highly suspicious files: {len(summary.get('highly_suspicious', []))}")
            lines.append(f"- Suspicious files: {len(summary.get('suspicious', []))}")

        # RASP Summary
        rasp = self.results.get('rasp', {})
        if rasp:
            rasp_type = rasp.get('type', 'none')
            confidence = rasp.get('confidence', 0)
            lines.append(f"\n**🛡️ RASP Detection:**")
            lines.append(f"- Type: {rasp_type}")
            lines.append(f"- Confidence: {f'{confidence}%' if rasp.get('detected') else 'n/a'}")
        
        # YARA Summary
        yara = self.results.get('yara', {})
        if yara and 'statistics' in yara:
            stats = yara['statistics']
            lines.append(f"\n**🎯 YARA Matches:**")
            lines.append(f"- Total matches: {stats.get('total_matches', 0)}")
            by_sev = stats.get('by_severity', {})
            if by_sev.get('CRITICAL', 0) > 0:
                lines.append(f"- 🔴 Critical: {by_sev['CRITICAL']}")
            if by_sev.get('HIGH', 0) > 0:
                lines.append(f"- 🟠 High: {by_sev['HIGH']}")
        
        return '\n'.join(lines)
    
    def _generate_sast_report(self):
        """Generate detailed SAST findings report"""
        output_file = self.report_dir / 'sast_findings.md'
        
        md = []
        md.append("# 🚨 Security Findings (SAST)\n")
        md.append(f"**Analysis Date:** {self.timestamp}\n")
        md.append(f"**APK:** {self.apk_name}\n")
        md.append("\n[← Back to Main Report](./report.md)\n")
        md.append("\n---\n")
        
        # Add SAST findings
        self._add_sast_findings(md)
        
        with open(output_file, 'w') as f:
            f.write('\n'.join(md))
    
    def _generate_manifest_report(self):
        """Generate detailed manifest analysis report"""
        output_file = self.report_dir / 'manifest_analysis.md'
        
        md = []
        md.append("# 📋 AndroidManifest Analysis\n")
        md.append(f"**Analysis Date:** {self.timestamp}\n")
        md.append(f"**APK:** {self.apk_name}\n")
        md.append("\n[← Back to Main Report](./report.md)\n")
        md.append("\n---\n")
        
        # Add manifest findings
        self._add_manifest_findings(md)
        
        with open(output_file, 'w') as f:
            f.write('\n'.join(md))
    
    def _generate_network_report(self):
        """Generate detailed network analysis report"""
        output_file = self.report_dir / 'network_analysis.md'
        
        md = []
        md.append("# 🌐 Network Analysis\n")
        md.append(f"**Analysis Date:** {self.timestamp}\n")
        md.append(f"**APK:** {self.apk_name}\n")
        md.append("\n[← Back to Main Report](./report.md)\n")
        md.append("\n---\n")
        
        # Add network findings
        self._add_network_findings(md)
        
        with open(output_file, 'w') as f:
            f.write('\n'.join(md))
    
    def _generate_entropy_report(self):
        """Generate detailed entropy analysis report"""
        output_file = self.report_dir / 'entropy_analysis.md'
        
        md = []
        md.append("# 📊 Entropy Analysis - Encrypted Payload Detection\n")
        md.append(f"**Analysis Date:** {self.timestamp}\n")
        md.append(f"**APK:** {self.apk_name}\n")
        md.append("\n[← Back to Main Report](./report.md)\n")
        md.append("\n---\n")
        
        # Add entropy findings
        self._add_entropy_findings(md)
        
        with open(output_file, 'w') as f:
            f.write('\n'.join(md))
    
    def _generate_yara_report(self):
        """Generate detailed YARA results report"""
        output_file = self.report_dir / 'yara_results.md'
        
        md = []
        md.append("# 🎯 YARA Scan Results\n")
        md.append(f"**Analysis Date:** {self.timestamp}\n")
        md.append(f"**APK:** {self.apk_name}\n")
        md.append("\n[← Back to Main Report](./report.md)\n")
        md.append("\n---\n")
        
        # Add YARA results
        self._add_yara_results(md)
        
        with open(output_file, 'w') as f:
            f.write('\n'.join(md))
    
    def _generate_recommendations_report(self):
        """Generate detailed recommendations report"""
        output_file = self.report_dir / 'recommendations.md'
        
        md = []
        md.append("# 💡 Security Recommendations\n")
        md.append(f"**Analysis Date:** {self.timestamp}\n")
        md.append(f"**APK:** {self.apk_name}\n")
        md.append("\n[← Back to Main Report](./report.md)\n")
        md.append("\n---\n")
        
        # Add recommendations
        self._add_recommendations(md)
        
        with open(output_file, 'w') as f:
            f.write('\n'.join(md))
    
    @staticmethod
    def _risk_level(score):
        if score >= 80:
            return "🔴 **CRITICAL**"
        if score >= 60:
            return "🟠 **HIGH**"
        if score >= 40:
            return "🟡 **MEDIUM**"
        if score >= 20:
            return "🟢 **LOW**"
        return "⚪ **MINIMAL**"

    def _len(self, section, key):
        """Length of a list-valued field, tolerating missing/int values."""
        v = self.results.get(section, {}).get(key, [])
        if isinstance(v, int):
            return v
        return len(v) if isinstance(v, (list, dict)) else 0

    def compute_composite_risk(self):
        """Combine every analyzer's signal into one 0-100 risk score.

        Unlike the raw SAST risk_score (which saturates at 100 on any large
        app from sheer finding count), this weights confirmed-malware signals
        highest and applies diminishing returns to high-volume signals so the
        number stays comparable across apps of very different sizes.
        """
        breakdown = []

        def add(label, value):
            value = round(value, 1)
            if value > 0:
                breakdown.append({'factor': label, 'points': value})
            return value

        score = 0.0

        # 1. Confirmed malware: YARA critical/high matches (strongest signal, cap 30)
        yara = self.results.get('yara', {}).get('summary', {})
        yc = yara.get('critical_findings', 0) or 0
        yh = yara.get('high_severity', 0) or 0
        score += add(f"YARA matches ({yc} critical, {yh} high)", min(yc * 15 + yh * 6, 30))

        # 2. SAST severity, log-damped so finding count can't alone saturate (cap 25)
        s_crit = self._len('sast', 'critical')
        s_high = self._len('sast', 'high')
        score += add(f"SAST severity ({s_crit} critical, {s_high} high)",
                     min(8 * math.log10(1 + s_crit) + 4 * math.log10(1 + s_high), 25))

        # 3. Packing / encrypted payloads (cap 20)
        dexp = self.results.get('dex_payload', {})
        packed = bool(dexp.get('stub_dex_detected')) or self._len('dex_payload', 'encrypted_payloads') > 0
        hs = self._len('entropy', 'highly_suspicious')
        pack_pts = (15 if packed else 0) + min(hs * 2, 10)
        score += add("Packing / encrypted payloads", min(pack_pts, 20))

        # 4. Manifest misconfiguration (cap 10)
        score += add("Manifest misconfigurations",
                     min(3 * math.log10(1 + self._len('manifest', 'findings')), 10))

        # 5. Suspicious network artifacts (cap 10)
        score += add(f"Suspicious network artifacts ({self._len('network', 'suspicious_urls')})",
                     min(self._len('network', 'suspicious_urls') * 3, 10))

        # 6. Known packer/protector present (cap 5) — raises analysis difficulty
        obf_type = str(self.results.get('obfuscation', {}).get('type', 'none')).lower()
        if obf_type in ('dpt-shell', 'dexprotector', 'bangcle', 'qihoo-360', 'jiagu', 'secneo'):
            score += add(f"Commercial packer ({obf_type})", 5)

        # 7. Signing problems (cap 10)
        signing = self.results.get('signing', {})
        sign_pts = 0
        sign_titles = []
        for f in signing.get('findings', []) or []:
            sev = f.get('severity')
            if sev == 'high':
                sign_pts += 5
            elif sev == 'medium':
                sign_pts += 2
            sign_titles.append(f.get('title', ''))
        if sign_pts:
            score += add(f"Signing issues ({'; '.join(t for t in sign_titles if t)})", min(sign_pts, 10))

        score = int(round(min(score, 100)))
        return {'score': score, 'level': self._risk_level(score), 'breakdown': breakdown}

    def _add_executive_summary(self, md):
        """Add executive summary"""

        risk = self.compute_composite_risk()
        self.results['risk'] = risk  # surfaced in JSON output too

        md.append(f"**Overall Risk Level:** {risk['level']} (Score: {risk['score']}/100)\n")
        md.append("*Composite score across SAST, YARA, packing, manifest and network signals.*\n")

        if risk['breakdown']:
            md.append("| Risk Contributor | Points |")
            md.append("|------------------|-------:|")
            for item in risk['breakdown']:
                md.append(f"| {item['factor']} | {item['points']} |")
            md.append("")

        fw = self.results.get('framework', {})
        if fw:
            md.append(f"- **App Framework:** `{fw.get('primary', 'Native / Java-Kotlin')}`")

        obf_type = self.results.get('obfuscation', {}).get('type', 'none')
        md.append(f"- **Obfuscation Type:** `{obf_type.upper()}`")

        rasp = self.results.get('rasp', {})
        if rasp:
            detected = rasp.get('detected') or []
            rasp_label = ', '.join(detected) if detected else rasp.get('type', 'None Detected')
            md.append(f"- **RASP / App Protection:** `{rasp_label}`")

        signing = self.results.get('signing', {})
        if signing and not signing.get('error'):
            active = ', '.join(f"v{k[1:]}" for k, v in signing.get('schemes', {}).items() if v) or 'none'
            sign_findings = signing.get('findings', [])
            sign_note = f"{len(sign_findings)} issue(s)" if sign_findings else "no issues"
            md.append(f"- **Signing:** `{active}` ({sign_note})")

        inv = self.results.get('sdk_inventory', {})
        if inv and inv.get('total'):
            md.append(f"- **Third-Party SDKs:** {inv.get('total')} ({len(inv.get('trackers', []))} tracker/ad/analytics)")

        total_findings = self.results.get('sast', {}).get('summary', {}).get('total_findings', 0)
        critical_findings = self._len('sast', 'critical')
        md.append(f"- **Total Security Findings:** {total_findings}")
        md.append(f"- **Critical Issues:** {critical_findings}")
        md.append(f"- **SAST-only Risk Score:** {self.results.get('sast', {}).get('summary', {}).get('risk_score', 0)}/100")
        md.append("")
    
    def _add_apk_info(self, md):
        """Add APK information"""
        basic_info = self.results.get('basic_info', {})
        
        md.append("| Property | Value |")
        md.append("|----------|-------|")
        md.append(f"| Package Name | `{basic_info.get('package_name', 'N/A')}` |")
        md.append(f"| App Name | {basic_info.get('app_name', 'N/A')} |")
        md.append(f"| Version | {basic_info.get('version_name', 'N/A')} ({basic_info.get('version_code', 'N/A')}) |")
        md.append(f"| Min SDK | {basic_info.get('min_sdk', 'N/A')} |")
        md.append(f"| Target SDK | {basic_info.get('target_sdk', 'N/A')} |")
        md.append(f"| Signed | {basic_info.get('is_signed', False)} |")
        md.append(f"| Permissions | {len(basic_info.get('permissions', []))} |")
        md.append(f"| Activities | {len(basic_info.get('activities', []))} |")
        md.append(f"| Services | {len(basic_info.get('services', []))} |")
        md.append(f"| Receivers | {len(basic_info.get('receivers', []))} |")
        md.append("")

        prep = self.results.get('input_prep', {})
        if prep and prep.get('input_type') and prep.get('input_type') != 'apk':
            md.append(f"**Input container:** `{prep.get('input_type')}`")
            splits = prep.get('splits', [])
            if splits:
                md.append(f"\nAnalyzed the base APK. {len(splits)} split APK(s) present in the bundle:\n")
                md.append("| Split | Size | Config split |")
                md.append("|-------|-----:|:------------:|")
                for s in splits:
                    md.append(f"| `{s.get('name')}` | {s.get('size', 0):,} B | {'✅' if s.get('config_split') else '—'} |")
            for note in prep.get('notes', []):
                md.append(f"\n> {note}")
            md.append("")

    def _add_obfuscation_info(self, md):
        """Add obfuscation detection info"""
        obf = self.results.get('obfuscation', {})
        dex_payload = self.results.get('dex_payload', {})
        so_strings = self.results.get('so_strings', [])
        
        obf_type = obf.get('type', 'none')
        confidence = obf.get('confidence', 0)
        
        md.append(f"**Type:** `{obf_type.upper()}`")
        md.append(f"**Confidence:** {confidence}%\n")
        
        # DEX Payload Analysis
        if dex_payload:
            stub_detected = dex_payload.get('stub_dex_detected', False)
            encrypted_payloads = dex_payload.get('encrypted_payloads', [])
            
            if stub_detected:
                md.append("### 🚨 Stub DEX Detected\n")
                md.append("⚠️ **Real DEX is NOT in the APK** - it will be unpacked at runtime\n")
                
                for indicator in dex_payload.get('protection_indicators', []):
                    md.append(f"**{indicator.get('file')}:** {indicator.get('type')}")
                    for ind in indicator.get('indicators', []):
                        md.append(f"- {ind}")
                md.append("")
            
            # Protection Library String Analysis
            if so_strings and len(so_strings) > 0:
                md.append("### 🔍 Protection Library Analysis\n")
                md.append("**Native libraries analyzed for protection artifacts:**\n")
                
                for lib_result in so_strings:
                    lib_file = lib_result.get('file', 'Unknown')
                    stats = lib_result.get('stats', {})
                    categories = lib_result.get('categories', {})
                    
                    md.append(f"\n#### 📦 `{lib_file}`\n")
                    md.append(f"- **Size:** {stats.get('file_size_kb', 0):.2f} KB")
                    md.append(f"- **Strings Extracted:** {stats.get('total_strings', 0)}")
                    md.append(f"- **Categories Found:** {stats.get('categories_found', 0)}\n")
                    
                    # Show critical findings
                    critical_cats = {
                        'dex_files': '🎯 DEX Files',
                        'zip_files': '🔒 ZIP Files (Encrypted Containers)',
                        'code_cache_paths': '📁 Code Cache Paths',
                        'encryption_keywords': '🔐 Encryption Keywords',
                        'class_loaders': '🔧 ClassLoaders',
                        'shell_keywords': '🐚 Shell/Protection Keywords'
                    }
                    
                    for cat_key, cat_name in critical_cats.items():
                        if cat_key in categories:
                            items = categories[cat_key]
                            md.append(f"**{cat_name}:** {len(items)} found")
                            for item in items[:5]:  # Show first 5
                                md.append(f"  - `{item}`")
                            if len(items) > 5:
                                md.append(f"  - ... and {len(items) - 5} more")
                            md.append("")
                md.append("")
            
            if encrypted_payloads:
                md.append(f"### 🔒 Encrypted Payloads Found: {len(encrypted_payloads)}\n")
                for payload in encrypted_payloads[:5]:  # Show first 5
                    md.append(f"**{payload['location']}**")
                    md.append(f"- Type: {payload['type']}")
                    md.append(f"- Size: {payload['size_kb']:.1f} KB")
                    md.append(f"- Entropy: {payload['entropy']}")
                    for ind in payload.get('indicators', []):
                        md.append(f"- {ind}")
                    md.append("")
                
                if len(encrypted_payloads) > 5:
                    md.append(f"*...and {len(encrypted_payloads) - 5} more encrypted payloads*\n")
            
            # Likely unpack locations
            unpack_locs = dex_payload.get('likely_unpack_locations', [])
            if unpack_locs and (stub_detected or encrypted_payloads):
                md.append("### 📍 Predicted Runtime Unpack Locations\n")
                md.append("Monitor these paths during dynamic analysis:\n")
                for loc in unpack_locs[:5]:
                    if loc['priority'] == 'HIGH':
                        md.append(f"- 🔴 `{loc['path']}`")
                        md.append(f"  {loc['description']}")
                md.append("")
        
        indicators = obf.get('indicators', [])
        if indicators:
            md.append("### Detection Indicators\n")
            for ind in indicators[:10]:  # Show first 10
                md.append(f"- {ind}")
            if len(indicators) > 10:
                md.append(f"\n*...and {len(indicators) - 10} more indicators*")
            md.append("")
        
        # APKiD results if available
        apkid = obf.get('apkid_results', {})
        if apkid:
            md.append("### APKiD Enhanced Detection\n")
            md.append("✅ APKiD analysis completed\n")
        
        md.append("### Analysis Recommendations\n")
        
        # DEX payload recommendations
        if dex_payload:
            for rec in dex_payload.get('recommendations', [])[:3]:
                priority_icon = '🔴' if rec.get('priority') == 'HIGH' else '🟡'
                md.append(f"{priority_icon} **{rec.get('action')}**")
                md.append(f"  {rec.get('details')}  ")
            md.append("")
        
        # Obfuscation recommendations
        recs = obf.get('recommendations', [])
        for rec in recs:
            md.append(f"{rec}  ")
        md.append("")

    SEVERITY_ICON = {'critical': '🔴', 'high': '🔴', 'medium': '🟠', 'low': '🟡'}

    def _add_rea_info(self, md):
        """Add REA deep-analysis bridge results"""
        rea = self.results.get('rea', {})
        runs = rea.get('runs', [])

        md.append(f"*Analyses run via `{rea.get('command', 'rea')}`. "
                  "Evidence IDs reference REA's retained records.*\n")

        if runs:
            md.append("| REA Tool | Target | Result | Evidence ID |")
            md.append("|----------|--------|--------|-------------|")
            for r in runs:
                if r.get('error'):
                    result = f"⚠️ {r['error'][:60]}"
                    ev = '—'
                else:
                    summ = r.get('summary', {})
                    result = ', '.join(f"{k}={v}" for k, v in list(summ.items())[:3]) if isinstance(summ, dict) else str(summ)[:70]
                    ev = f"`{(r.get('evidence_id') or '')[:18]}…`"
                md.append(f"| {r.get('tool')} | `{r.get('target')}` | {result or '—'} | {ev} |")
            md.append("")

        for note in rea.get('notes', []):
            md.append(f"> {note}")
        if rea.get('notes'):
            md.append("")

        deep = self.results.get('rea_deep', {})
        if deep.get('available') and (deep.get('completed') or deep.get('skipped')):
            self._add_rea_deep(md, deep)
        else:
            md.append("See `rea_targets.json` for the deep-dive questions queued for an agent-driven REA pass "
                      "(native decompilation, call-flow tracing, dynamic ADB/Frida). "
                      "Run them, then merge answers with `rea_deep.py`.\n")

    def _add_rea_deep(self, md, deep):
        """Render the agent-driven deep pass (Phase 2) results."""
        md.append("\n### Deep Pass (agent-driven)\n")
        completed = deep.get('completed', [])
        skipped = deep.get('skipped', [])
        pending = deep.get('pending', [])

        if completed:
            md.append("| Task | REA Tool | Findings | Evidence ID |")
            md.append("|------|----------|----------|-------------|")
            for c in completed:
                f = c.get('findings')
                if isinstance(f, dict):
                    shown = ', '.join(f"{k}={v}" for k, v in list(f.items())[:3])
                elif f is None:
                    shown = '—'
                else:
                    shown = str(f)[:70]
                ev = f"`{(c.get('evidence_id') or '')[:18]}…`" if c.get('evidence_id') else '—'
                md.append(f"| {c.get('task_id')} | {c.get('rea_tool') or '—'} | {shown or '—'} | {ev} |")
            md.append("")

        # Native hook points (feeds the Frida script — Phase 3)
        hooks = [(c.get('task_id'), h) for c in completed for h in c.get('native_hooks', []) if h]
        if hooks:
            md.append("**Native hook points** (candidate Frida targets):\n")
            md.append("| From Task | Symbol | Address | Note |")
            md.append("|-----------|--------|---------|------|")
            for tid, h in hooks:
                md.append(f"| {tid} | `{h.get('symbol') or '—'}` | `{h.get('address') or '—'}` | {h.get('note') or ''} |")
            md.append("")

        if skipped:
            md.append("**Skipped:** " + ", ".join(
                f"{s.get('task_id')} ({s.get('reason') or 'no reason'})" for s in skipped) + "\n")
        if pending:
            md.append(f"**Pending** ({len(pending)}): {', '.join(pending)} — "
                      "still queued in `rea_targets.json`.\n")
        for note in deep.get('notes', [])[:6]:
            md.append(f"> {note}")
        if deep.get('notes'):
            md.append("")

    def _add_dynamic_info(self, md):
        """Render the Phase 4 dynamic (ADB/Frida) runtime results."""
        dyn = self.results.get('dynamic', {})
        md.append(f"*Runtime run on `{dyn.get('device', '?')}` via `{dyn.get('mode', '?')}` "
                  f"for {dyn.get('duration_sec', '?')}s using `{Path(dyn.get('frida_script', '')).name}`. "
                  f"{dyn.get('hits_total', 0)} hook hit(s).*\n")

        hooks = dyn.get('hooks', {})
        LABELS = {"ssl_bypass": "SSL pinning bypassed", "crypto": "Crypto calls",
                  "keys": "Key material", "native": "Native hooks hit",
                  "dlopen": "Libraries loaded (dlopen)", "root_blocked": "Root probes blocked"}
        rows = [(LABELS.get(k, k), v) for k, v in hooks.items() if v]
        if rows:
            md.append("| Observed at runtime | Count | Sample |")
            md.append("|---------------------|-------|--------|")
            for label, v in rows:
                sample = (v[0][:80] + '…') if v and len(v[0]) > 80 else (v[0] if v else '')
                md.append(f"| {label} | {len(v)} | `{sample}` |")
            md.append("")
        else:
            md.append("No instrumented hooks fired during the capture window.\n")

        logcat = dyn.get('logcat', {})
        if logcat.get('crashes'):
            md.append(f"**Crashes / FATAL ({len(logcat['crashes'])}):**\n")
            md.append("```")
            for c in logcat['crashes'][:8]:
                md.append(c)
            md.append("```")
        if dyn.get('errors'):
            md.append("**Instrumentation errors:**")
            for e in dyn['errors'][:6]:
                md.append(f"> {e}")
            md.append("")
        for note in dyn.get('notes', [])[:6]:
            md.append(f"> {note}")
        if dyn.get('notes'):
            md.append("")

    def _add_sdk_info(self, md):
        """Add third-party SDK inventory"""
        inv = self.results.get('sdk_inventory', {})
        if not inv:
            md.append("⚠️ SDK inventory data not available\n")
            return

        sdks = inv.get('sdks', [])
        if not sdks:
            md.append("No known third-party SDKs detected.\n")
            return

        trackers = inv.get('trackers', [])
        md.append(f"**{inv.get('total', len(sdks))} SDK(s) detected** — "
                  f"{len(trackers)} classified as tracker / ad / analytics.\n")
        if trackers:
            md.append(f"> 🔎 Privacy note: {', '.join(trackers)}\n")

        md.append("| SDK | Category | Version | CVEs |")
        md.append("|-----|----------|---------|------|")
        for s in sdks:
            ver = s.get('version') or '—'
            cves = s.get('cves')
            if cves:
                cve_txt = ', '.join(c.get('id', '') for c in cves)
            elif inv.get('online_cve_check'):
                cve_txt = '✅ none'
            else:
                cve_txt = '—'
            md.append(f"| {s.get('sdk')} | {s.get('category')} | {ver} | {cve_txt} |")
        md.append("")

    def _add_framework_info(self, md):
        """Add cross-platform framework detection info"""
        fw = self.results.get('framework', {})
        if not fw:
            md.append("⚠️ Framework analysis data not available\n")
            return

        md.append(f"**Primary framework:** `{fw.get('primary', 'Native / Java-Kotlin')}`\n")

        detected = fw.get('frameworks', [])
        if detected:
            for d in detected:
                md.append(f"### {d.get('framework')}")
                md.append(f"- **Logic artifact:** `{d.get('logic_artifact')}`")
                md.append(f"- **Markers:** {', '.join(f'`{m}`' for m in d.get('markers', []))}")
                if d.get('bundle_format'):
                    md.append(f"- **Bundle format:** `{d.get('bundle_format')}`")
                tools = d.get('recommended_tools') or []
                if tools:
                    avail = d.get('tool_available')
                    status = '✅ installed' if avail else '❌ not installed'
                    md.append(f"- **Recommended tool:** {', '.join(f'`{t}`' for t in tools)} ({status})")
                md.append(f"- {d.get('guidance')}")
                md.append("")
        else:
            md.append("Standard Java/Kotlin app — full source is covered by SAST.\n")

        if fw.get('coverage_warning'):
            md.append(f"> ⚠️ **Coverage caveat:** {fw['coverage_warning']}\n")

    def _add_signing_info(self, md):
        """Add APK signing and certificate information"""
        signing = self.results.get('signing', {})

        if not signing:
            md.append("⚠️ Signing analysis data not available\n")
            return
        if signing.get('error'):
            md.append(f"⚠️ Signing analysis unavailable: {signing['error']}\n")
            return

        schemes = signing.get('schemes', {})
        active = ', '.join(f"v{k[1:]}" for k, v in schemes.items() if v) or 'none'
        md.append(f"- **Signed:** {'Yes' if signing.get('signed') else 'No'}")
        md.append(f"- **Signature schemes:** `{active}`")
        md.append("")

        findings = signing.get('findings', [])
        if findings:
            md.append("### Signing Findings\n")
            for f in findings:
                icon = self.SEVERITY_ICON.get(f.get('severity'), '⚪')
                md.append(f"- {icon} **{f.get('title')}** — {f.get('detail')}")
            md.append("")
        else:
            md.append("✅ No signing issues detected\n")

        certs = signing.get('certificates', [])
        if certs:
            md.append("### Certificates\n")
            md.append("| Subject | Key | Signature Alg | SHA-256 |")
            md.append("|---------|-----|---------------|---------|")
            for c in certs:
                subj = c.get('subject', '(unparsed)')
                key = f"{c.get('key_type', '?')}-{c.get('key_size', '?')}"
                alg = c.get('signature_algorithm', '?')
                fp = c.get('sha256', '')
                md.append(f"| {subj} | {key} | {alg} | `{fp[:32]}…` |")
            md.append("")

    def _add_rasp_info(self, md):
        """Add RASP detection information"""
        rasp = self.results.get('rasp', {})

        if not rasp:
            md.append("⚠️ RASP analysis data not available\n")
            return

        rasp_type = rasp.get('type', 'none')
        confidence = rasp.get('confidence', 0)
        md.append(f"**Type:** `{str(rasp_type).upper()}`")
        md.append(f"**Confidence:** {f'{confidence}%' if rasp.get('detected') else 'n/a'}\n")

        indicators = rasp.get('indicators', [])
        if indicators:
            md.append("### Detection Indicators\n")
            for indicator in indicators[:20]:
                md.append(f"- {indicator}")
            if len(indicators) > 20:
                md.append(f"\n*...and {len(indicators) - 20} more indicators*")
            md.append("")

        details = rasp.get('protection_details', {})
        if details:
            md.append("### Detected Protection Families\n")
            md.append("| Family | Score |")
            md.append("|--------|-------|")
            for family, score in sorted(details.items(), key=lambda x: x[1], reverse=True):
                md.append(f"| {family} | {score} |")
            md.append("")

        evidence = rasp.get('evidence', {})
        if evidence:
            md.append("### Evidence\n")
            for family, items in evidence.items():
                md.append(f"**{family}**")
                for item in items[:8]:
                    md.append(f"- `{item}`")
                if len(items) > 8:
                    md.append(f"- ... and {len(items) - 8} more")
                md.append("")

        heuristics = rasp.get('heuristics', [])
        if heuristics:
            md.append("### Hardening Heuristics (vendor unknown)\n")
            for h in heuristics:
                md.append(f"- {h.get('description', h.get('name'))}")
                samples = h.get('samples', [])
                if samples:
                    md.append(f"  - Samples: {', '.join(f'`{x}`' for x in samples[:5])}")
            md.append("")

        weak = rasp.get('weak_signals', {})
        if weak:
            md.append("### Weak Signals (below verdict threshold)\n")
            for family, score in sorted(weak.items(), key=lambda x: x[1], reverse=True):
                md.append(f"- {family}: {score}")
            md.append("")

        recs = rasp.get('recommendations', [])
        if recs:
            md.append("### RASP-Specific Recommendations\n")
            for rec in recs:
                md.append(f"- {rec}")
            md.append("")
    
    def _add_sast_findings(self, md):
        """Add SAST findings (full details)"""
        sast = self.results.get('sast', {})
        summary = sast.get('summary', {})
        
        md.append("### Summary\n")
        md.append("| Severity | Count |")
        md.append("|----------|-------|")
        total_findings = 0
        for severity in ['critical', 'high', 'medium', 'low']:
            count = summary.get('by_severity', {}).get(severity, 0)
            total_findings += count
            emoji = {'critical': '🔴', 'high': '🟠', 'medium': '🟡', 'low': '🔵'}
            md.append(f"| {emoji[severity]} {severity.title()} | {count} |")
        md.append("")
        
        md.append(f"**Total Findings:** {total_findings}\n")
        
        if total_findings == 0:
            md.append("✅ No security issues found\n")
            return
        
        # Group findings by severity - read directly from arrays
        for severity in ['critical', 'high', 'medium', 'low']:
            findings = sast.get(severity, [])
            if not findings:
                continue
            
            icons = {'critical': '🔴', 'high': '🟠', 'medium': '🟡', 'low': '🔵'}
            md.append(f"\n## {icons[severity]} {severity.upper()} Severity Findings\n")
            
            # Group by category
            by_category = {}
            for finding in findings:
                cat = finding.get('category', 'other')
                if cat not in by_category:
                    by_category[cat] = []
                by_category[cat].append(finding)
            
            for category, cat_findings in by_category.items():
                md.append(f"\n### {category.replace('_', ' ').title()} ({len(cat_findings)} issues)\n")
                
                for i, finding in enumerate(cat_findings, 1):
                    md.append(f"**{i}. {finding.get('title', 'Security Issue')}**")
                    md.append(f"- **Description:** {finding.get('description', 'N/A')}")
                    md.append(f"- **File:** `{finding.get('file', 'N/A')}`")
                    if finding.get('line'):
                        md.append(f"- **Line:** {finding['line']}")
                    md.append("")
                    
                    code = finding.get('code', '')
                    if code:
                        md.append("```java")
                        md.append(code)
                        md.append("```\n")
    
    def _add_manifest_findings(self, md):
        """Add manifest analysis findings"""
        manifest = self.results.get('manifest', {})
        findings = manifest.get('findings', [])
        
        if not findings:
            md.append("✅ No significant issues found in AndroidManifest.xml\n")
            return
        
        md.append(f"**Total Issues:** {len(findings)}\n")
        
        # Group by severity
        by_severity = {'critical': [], 'high': [], 'medium': [], 'low': []}
        for finding in findings:
            sev = finding.get('severity', 'low')
            by_severity[sev].append(finding)
        
        for severity in ['critical', 'high', 'medium']:
            if not by_severity[severity]:
                continue
            
            emoji = {'critical': '🔴', 'high': '🟠', 'medium': '🟡'}
            md.append(f"\n## {emoji[severity]} {severity.title()} Issues ({len(by_severity[severity])})\n")
            
            for i, finding in enumerate(by_severity[severity], 1):
                md.append(f"**{i}. {finding.get('title', 'Unknown')}**")
                md.append(f"- **Description:** {finding.get('description', 'N/A')}")
                if finding.get('permission'):
                    md.append(f"- **Permission:** `{finding['permission']}`")
                if finding.get('component'):
                    md.append(f"- **Component:** `{finding['component']}`")
                md.append("")
    
    def _add_network_findings(self, md):
        """Add network analysis findings"""
        network = self.results.get('network', {})
        
        urls = network.get('urls', [])
        domains = network.get('domains', [])
        ips = network.get('ips', [])
        suspicious_urls = network.get('suspicious_urls', [])
        
        if suspicious_urls:
            md.append("### 🚨 Suspicious URLs\n")
            for url in suspicious_urls:  # Show all
                md.append(f"- `{url}`")
            md.append("")
        
        if urls:
            md.append(f"### URLs Found ({len(urls)})\n")
            for url in urls:  # Show all
                md.append(f"- `{url}`")
            md.append("")
        
        if domains:
            md.append(f"### Unique Domains ({len(domains)})\n")
            for domain in list(domains):  # Show all
                md.append(f"- `{domain}`")
            md.append("")
        
        if ips:
            md.append(f"### IP Addresses ({len(ips)})\n")
            for ip in ips:
                md.append(f"- `{ip}`")
            md.append("")
    
    def _add_entropy_findings(self, md):
        """Add entropy analysis findings"""
        entropy = self.results.get('entropy', {})
        
        if not entropy or 'files' not in entropy:
            md.append("⚠️ Entropy analysis data not available\n")
            return
        
        summary = entropy.get('summary', {})
        files = entropy.get('files', [])
        
        md.append("## Overview\n")
        md.append("Entropy analysis identifies encrypted or heavily obfuscated regions in APK files.")
        md.append("High entropy (>7.0) typically indicates encryption, while low entropy (<5.0) suggests plaintext.\n")
        md.append(f"**Files Analyzed:** {summary.get('total_files', len(files))}\n")
        
        # Highly suspicious files
        highly_suspicious = summary.get('highly_suspicious', [])
        if highly_suspicious:
            md.append(f"\n## 🔴 Highly Suspicious Files ({len(highly_suspicious)})\n")
            md.append("These files show characteristics of strong encryption - likely encrypted payloads.\n")
            
            for file_entry in highly_suspicious:
                filename = file_entry['filename']
                entropy_val = file_entry['entropy']
                ratio = file_entry['high_entropy_ratio']
                
                md.append(f"\n### `{filename}`\n")
                md.append(f"- **Overall Entropy:** {entropy_val:.2f}/8.0")
                md.append(f"- **High Entropy Ratio:** {ratio:.1%}")
                md.append(f"- **Assessment:** Likely encrypted payload - dynamic analysis required\n")
                
                # Find and display chart if available
                file_data = next((f for f in files if f.get('filename') == filename), None)
                if file_data and 'chart' in file_data:
                    md.append("**Entropy Distribution:**\n")
                    md.append("```")
                    md.append(file_data['chart'])
                    md.append("```\n")
                
                if file_data and 'assessment' in file_data:
                    md.append(f"**Recommendation:** {file_data['assessment'].get('recommendation', 'N/A')}\n")
        
        # Suspicious files
        suspicious = summary.get('suspicious', [])
        if suspicious:
            md.append(f"\n## 🟡 Suspicious Files ({len(suspicious)})\n")
            md.append("These files contain elevated entropy regions - may contain compressed or partially encrypted data.\n")
            
            for file_entry in suspicious:
                filename = file_entry['filename']
                entropy_val = file_entry['entropy']
                ratio = file_entry['high_entropy_ratio']
                
                md.append(f"\n### `{filename}`\n")
                md.append(f"- **Overall Entropy:** {entropy_val:.2f}/8.0")
                md.append(f"- **High Entropy Ratio:** {ratio:.1%}\n")
        
        # Normal files
        normal = summary.get('normal', [])
        if normal:
            md.append(f"\n## 🟢 Normal Files ({len(normal)})\n")
            md.append("These files show low entropy - mostly plaintext or uncompressed code.\n")
        
        md.append("\n## Interpretation Guide\n")
        md.append("| Entropy Range | Interpretation |")
        md.append("|--------------|----------------|")
        md.append("| 7.5 - 8.0 | Heavily encrypted - likely encrypted payload |")
        md.append("| 7.0 - 7.5 | Strong encryption/compression detected |")
        md.append("| 6.0 - 7.0 | Moderate obfuscation or compression |")
        md.append("| 5.0 - 6.0 | Some obfuscation, mostly normal code |")
        md.append("| 0.0 - 5.0 | Low entropy - plaintext or uncompressed |")
        md.append("")
    
    def _add_yara_results(self, md):
        """Add YARA scan results with detailed rule information"""
        yara_data = self.results.get('yara', {})
        
        # If no enhanced results, try to parse raw YARA files
        if not yara_data or 'summary' not in yara_data:
            md.append("## Overview\n")
            md.append("⚠️ Enhanced YARA analysis not available. Showing raw results:\n")
            self._add_raw_yara_results(md)
            return
        
        summary = yara_data.get('summary', {})
        findings = yara_data.get('findings', [])
        rules_checked = yara_data.get('rules_checked', [])
        categories = yara_data.get('categories', {})
        scan_details = yara_data.get('scan_details', {})
        
        # Summary section
        md.append("## Overview\n")
        md.append(f"- **Rules Checked:** {summary.get('total_rules_checked', 0)}")
        md.append(f"- **Rules Matched:** {summary.get('rules_matched', 0)}/{summary.get('total_rules_checked', 0)}")
        md.append(f"- **Total Matches:** {summary.get('total_matches', 0)}")
        md.append(f"- **Files Scanned:** {summary.get('files_scanned', 0)}\n")
        
        # Scan coverage
        md.append("### Scan Coverage\n")
        md.append("| Scan Type | Files | Matches |")
        md.append("|-----------|-------|---------|")
        for scan_name, scan_info in scan_details.items():
            scan_label = scan_name.replace('_scan', '').replace('_', ' ').title()
            files = len(scan_info.get('files', []))
            matches = scan_info.get('matches', 0)
            md.append(f"| {scan_label} | {files} | {matches} |")
        md.append("")
        
        # Severity breakdown
        md.append("### Severity Distribution\n")
        md.append("| Severity | Count |")
        md.append("|----------|-------|")
        critical = summary.get('critical_findings', 0)
        high = summary.get('high_severity', 0)
        medium = summary.get('medium_severity', 0)
        low = summary.get('low_severity', 0)
        
        if critical > 0:
            md.append(f"| 🔴 CRITICAL | {critical} |")
        if high > 0:
            md.append(f"| 🟠 HIGH | {high} |")
        if medium > 0:
            md.append(f"| 🟡 MEDIUM | {medium} |")
        if low > 0:
            md.append(f"| 🔵 LOW | {low} |")
        md.append("")
        
        # Rules checked table
        if rules_checked:
            md.append("\n## All Rules Checked\n")
            md.append("Complete list of YARA rules that were executed during the scan.\n")
            md.append("| Rule Name | Category | Severity | Status | Matches |")
            md.append("|-----------|----------|----------|--------|---------|")
            
            for rule in rules_checked:
                name = rule['name']
                category = rule['category']
                severity = rule['severity']
                matched = "✓ Matched" if rule['matched'] else "✗ No Match"
                match_count = rule['match_count']
                
                # Add emoji based on status
                emoji = "🔍"
                if rule['matched']:
                    if severity == 'CRITICAL':
                        emoji = "🔴"
                    elif severity == 'HIGH':
                        emoji = "🟠"
                    elif severity == 'MEDIUM':
                        emoji = "🟡"
                    else:
                        emoji = "🔵"
                
                md.append(f"| {emoji} `{name}` | {category} | {severity} | {matched} | {match_count} |")
            md.append("")
        
        # Detailed findings by severity
        if findings:
            md.append("\n## Detailed Findings\n")
            
            for severity in ['CRITICAL', 'HIGH', 'MEDIUM', 'LOW']:
                severity_findings = [f for f in findings if f['severity'] == severity]
                if not severity_findings:
                    continue
                
                emoji = {'CRITICAL': '🔴', 'HIGH': '🟠', 'MEDIUM': '🟡', 'LOW': '🔵'}
                md.append(f"\n### {emoji[severity]} {severity} Severity ({len(severity_findings)} matches)\n")
                
                # Group by rule
                from collections import defaultdict
                by_rule = defaultdict(list)
                for finding in severity_findings:
                    by_rule[finding['rule_name']].append(finding)
                
                for rule_name, rule_findings in by_rule.items():
                    md.append(f"\n#### `{rule_name}` ({len(rule_findings)} occurrences)\n")
                    
                    # Rule details
                    first = rule_findings[0]
                    md.append(f"**Category:** {first['category']}")
                    md.append(f"**Description:** {first['description']}")
                    md.append(f"**Recommendation:** {first['recommendation']}\n")
                    
                    md.append("**Affected Files:**\n")
                    for i, finding in enumerate(rule_findings, 1):
                        file_path = finding['file']
                        scan_type = finding['scan_type']
                        
                        md.append(f"{i}. `{file_path}` _(from {scan_type} scan)_")
                        
                        # Show matched strings if available
                        matched_strings = finding.get('matched_strings', [])
                        if matched_strings:
                            md.append(f"   - **Matched Patterns:** {len(matched_strings)}")
                            for j, string_match in enumerate(matched_strings[:3], 1):
                                offset = string_match['offset']
                                identifier = string_match['identifier']
                                content = string_match['content'][:60]
                                md.append(f"     {j}. `{identifier}` at {offset}: `{content}...`")
                            if len(matched_strings) > 3:
                                md.append(f"     ... and {len(matched_strings) - 3} more")
                        md.append("")
                    
                    md.append("---\n")
    
    def _add_raw_yara_results(self, md):
        """Fallback method to display raw YARA scan results"""
        yara_files = [
            ('yara_apk_results.txt', 'APK Scan'),
            ('yara_decompiled_results.txt', 'Decompiled Files'),
            ('yara_jadx_results.txt', 'JADX Sources'),
        ]
        
        has_results = False
        for filename, title in yara_files:
            filepath = self.temp_dir / filename
            if filepath.exists():
                try:
                    content = filepath.read_text(errors='ignore')
                    if content.strip():
                        has_results = True
                        md.append(f"\n### {title}\n")
                        md.append("```")
                        lines = content.strip().split('\n')
                        for line in lines[:100]:  # Limit to 100 lines per file
                            md.append(line)
                        if len(lines) > 100:
                            md.append(f"\n... ({len(lines) - 100} more lines)")
                        md.append("```\n")
                except Exception as e:
                    md.append(f"Error reading {filename}: {e}\n")
        
        if not has_results:
            md.append("✅ No YARA matches found\n")
    
    def _add_recommendations(self, md):
        """Add security recommendations"""
        
        obf = self.results.get('obfuscation', {})
        sast = self.results.get('sast', {})
        entropy = self.results.get('entropy', {})
        yara = self.results.get('yara', {})
        
        md.append("### Based on Protection Type\n")
        obf_recs = obf.get('recommendations', [])
        for rec in obf_recs:
            md.append(f"{rec}  ")
        md.append("")
        
        fw = self.results.get('framework', {})
        if fw.get('coverage_warning'):
            md.append("### Based on App Framework\n")
            md.append(f"- {fw['coverage_warning']}")
            for d in fw.get('frameworks', []):
                md.append(f"- {d.get('framework')}: {d.get('guidance')}")
            md.append("")

        rasp_recs = self.results.get('rasp', {}).get('recommendations', [])
        if rasp_recs:
            md.append("### Based on RASP Detection\n")
            for rec in rasp_recs:
                md.append(f"- {rec}")
            md.append("")

        # Entropy-based recommendations
        if entropy and entropy.get('summary', {}).get('highly_suspicious'):
            md.append("### Based on Entropy Analysis\n")
            md.append("🔴 **High entropy files detected:**")
            md.append("1. These files are likely encrypted and cannot be analyzed statically")
            md.append("2. **REQUIRED:** Dynamic analysis to capture unpacked DEX files")
            md.append("3. Install APK on rooted device/emulator")
            md.append("4. Use Frida scripts to dump DEX from memory at runtime")
            md.append("5. Monitor file system for unpacked payloads\n")
        
        md.append("### Based on SAST Findings\n")
        critical_count = sast.get('summary', {}).get('critical', 0)
        high_count = sast.get('summary', {}).get('high', 0)
        
        if critical_count > 0:
            md.append("1. **URGENT:** Address all critical severity findings immediately")
            md.append("2. **PRIORITY:** Review and fix high severity issues")
        elif high_count > 0:
            md.append("1. **PRIORITY:** Review and fix high severity issues")
        
        md.append("3. **Code Review:** Conduct thorough manual code review")
        md.append("4. **Penetration Testing:** Perform dynamic analysis and penetration testing")
        md.append("")
        
        md.append("### General Security Recommendations\n")
        md.append("1. **Dynamic Analysis:** Run the app in a controlled environment with Frida hooks")
        md.append("2. **Network Monitoring:** Capture and analyze network traffic")
        md.append("3. **Behavioral Analysis:** Monitor file system, IPC, and system calls")
        md.append("4. **Memory Dump:** Extract and analyze runtime memory")
        md.append("5. **API Hooking:** Hook sensitive APIs to understand behavior")
        md.append("")
    
    def generate_json(self, output_file):
        """Generate JSON report (complete data)"""
        
        report_data = {
            'metadata': {
                'generated': self.timestamp,
                'apk_name': self.apk_name,
                'sha256': self.sha256,
            },
            'results': self.results
        }
        
        with open(output_file, 'w') as f:
            json.dump(report_data, f, indent=2)

def main():
    parser = argparse.ArgumentParser(description='Generate modular malware analysis reports')
    parser.add_argument('workspace', help='Analysis workspace directory')
    parser.add_argument('temp_dir', help='Temporary directory with analysis results')
    parser.add_argument('apk_name', help='APK filename')
    parser.add_argument('sha256', help='APK SHA256 hash')
    parser.add_argument('--output-md', default='report.md', help='Main markdown report output')
    parser.add_argument('--output-json', default='report.json', help='JSON report output')
    
    args = parser.parse_args()
    
    generator = ModularReportGenerator(
        args.workspace,
        args.temp_dir,
        args.apk_name,
        args.sha256
    )
    
    # Generate modular markdown reports
    output_md = Path(args.workspace) / 'reports' / args.output_md
    generator.generate_main_report(output_md)
    print(f"✓ Main report: {output_md}")
    print(f"✓ Detailed reports in: {Path(args.workspace) / 'reports'}")
    
    # Generate JSON report
    output_json = Path(args.workspace) / 'reports' / args.output_json
    generator.generate_json(output_json)
    print(f"✓ JSON report: {output_json}")

if __name__ == '__main__':
    main()
