#!/usr/bin/env python3
"""
Modular Report Generator
Generates split reports with main index and separate detail files
"""

import sys
import json
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
            'dex_payload': 'dex_payload_report.json',
            'so_strings': 'so_strings.json',
            'sast': 'sast_findings.json',
            'manifest': 'manifest_findings.json',
            'network': 'network_findings.json',
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
        md.append("- [Protection & Obfuscation](#protection-obfuscation)")
        md.append("- 🔗 [Security Findings (SAST)](./sast_findings.md)")
        md.append("- 🔗 [AndroidManifest Analysis](./manifest_analysis.md)")
        md.append("- 🔗 [Network Analysis](./network_analysis.md)")
        md.append("- 🔗 [YARA Scan Results](./yara_results.md)")
        md.append("- 🔗 [Detailed Recommendations](./recommendations.md)")
        md.append("")
        
        # Executive Summary
        md.append("\n## 📊 Executive Summary {#executive-summary}\n")
        self._add_executive_summary(md)
        
        # APK Information
        md.append("\n## 📱 APK Information {#apk-information}\n")
        self._add_apk_info(md)
        
        # Protection & Obfuscation
        md.append("\n## 🔒 Protection & Obfuscation Analysis {#protection-obfuscation}\n")
        self._add_obfuscation_info(md)
        
        # Summary sections with links to details
        md.append("\n## 📊 Analysis Results Summary\n")
        md.append(self._get_findings_summary())
        
        md.append("\n### For Detailed Analysis:\n")
        md.append("- 📄 **[Security Findings (SAST)](./sast_findings.md)** - Complete vulnerability analysis")
        md.append("- 📄 **[Manifest Analysis](./manifest_analysis.md)** - Permission and component security")
        md.append("- 📄 **[Network Analysis](./network_analysis.md)** - Network artifacts and C2 indicators")
        md.append("- 📄 **[YARA Results](./yara_results.md)** - Malware pattern matching")
        md.append("- 📄 **[Recommendations](./recommendations.md)** - Actionable security guidance")
        md.append("")
        
        # Write main report
        with open(output_file, 'w') as f:
            f.write('\n'.join(md))
        
        # Generate detailed reports
        self._generate_sast_report()
        self._generate_manifest_report()
        self._generate_network_report()
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
    
    def _add_executive_summary(self, md):
        """Add executive summary"""
        
        # Calculate risk level
        risk_score = self.results.get('sast', {}).get('summary', {}).get('risk_score', 0)
        
        if risk_score >= 80:
            risk_level = "🔴 **CRITICAL**"
        elif risk_score >= 60:
            risk_level = "🟠 **HIGH**"
        elif risk_score >= 40:
            risk_level = "🟡 **MEDIUM**"
        elif risk_score >= 20:
            risk_level = "🟢 **LOW**"
        else:
            risk_level = "⚪ **MINIMAL**"
        
        md.append(f"**Overall Risk Level:** {risk_level} (Score: {risk_score}/100)\n")
        
        obf_type = self.results.get('obfuscation', {}).get('type', 'none')
        md.append(f"- **Obfuscation Type:** `{obf_type.upper()}`")
        
        total_findings = self.results.get('sast', {}).get('summary', {}).get('total_findings', 0)
        critical_findings = self.results.get('sast', {}).get('summary', {}).get('critical', 0)
        md.append(f"- **Total Security Findings:** {total_findings}")
        md.append(f"- **Critical Issues:** {critical_findings}")
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
    
    def _add_yara_results(self, md):
        """Add YARA scan results"""
        
        yara_files = [
            ('yara_apk_results.txt', 'APK Scan'),
            ('yara_decompiled_results.txt', 'Decompiled Files'),
            ('yara_jadx_results.txt', 'JADX Sources'),
        ]
        
        for filename, title in yara_files:
            filepath = self.temp_dir / filename
            if filepath.exists():
                md.append(f"\n### {title}\n")
                md.append("```")
                try:
                    content = filepath.read_text(errors='ignore')
                    if content.strip():
                        md.append(content[:5000])  # Limit to 5000 chars
                        if len(content) > 5000:
                            md.append("\n... (output truncated)")
                    else:
                        md.append("No matches found")
                except Exception as e:
                    md.append(f"Error reading results: {e}")
                md.append("```\n")
    
    def _add_recommendations(self, md):
        """Add security recommendations"""
        
        obf = self.results.get('obfuscation', {})
        sast = self.results.get('sast', {})
        
        md.append("### Based on Protection Type\n")
        obf_recs = obf.get('recommendations', [])
        for rec in obf_recs:
            md.append(f"{rec}  ")
        md.append("")
        
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
