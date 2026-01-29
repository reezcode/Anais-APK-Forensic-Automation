#!/usr/bin/env python3
"""
Comprehensive Report Generator
Generates detailed markdown and JSON reports from analysis results
"""

import sys
import json
import argparse
from pathlib import Path
from datetime import datetime

class ReportGenerator:
    def __init__(self, workspace, temp_dir, apk_name, sha256):
        self.workspace = Path(workspace)
        self.temp_dir = Path(temp_dir)
        self.apk_name = apk_name
        self.sha256 = sha256
        self.timestamp = datetime.now().strftime('%Y-%m-%d %H:%M:%S')
        
        # Load all analysis results
        self.load_results()
    
    def load_results(self):
        """Load all JSON results from temp directory"""
        self.results = {}
        
        result_files = {
            'basic_info': 'basic_info.json',
            'encryption_check': 'encryption_check.json',
            'obfuscation': 'obfuscation_report.json',
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
    
    def generate_markdown(self, output_file):
        """Generate comprehensive markdown report"""
        
        md = []
        
        # Header
        md.append("# Android Malware Analysis Report\n")
        md.append(f"**Generated:** {self.timestamp}\n")
        md.append(f"**APK:** `{self.apk_name}`\n")
        md.append(f"**SHA256:** `{self.sha256}`\n")
        md.append("\n---\n")
        
        # Executive Summary
        md.append("\n## 📊 Executive Summary\n")
        self._add_executive_summary(md)
        
        # APK Information
        md.append("\n## 📱 APK Information\n")
        self._add_apk_info(md)
        
        # Protection & Obfuscation
        md.append("\n## 🔒 Protection & Obfuscation Analysis\n")
        self._add_obfuscation_info(md)
        
        # Security Findings
        md.append("\n## 🚨 Security Findings (SAST)\n")
        self._add_sast_findings(md)
        
        # Manifest Analysis
        md.append("\n## 📋 AndroidManifest Analysis\n")
        self._add_manifest_findings(md)
        
        # Network Analysis
        md.append("\n## 🌐 Network Analysis\n")
        self._add_network_findings(md)
        
        # YARA Results
        md.append("\n## 🎯 YARA Scan Results\n")
        self._add_yara_results(md)
        
        # Recommendations
        md.append("\n## 💡 Recommendations\n")
        self._add_recommendations(md)
        
        # Write report - create parent directory if needed
        output_path = Path(output_file)
        output_path.parent.mkdir(parents=True, exist_ok=True)
        
        with open(output_file, 'w') as f:
            f.write('\n'.join(md))
    
    def _add_executive_summary(self, md):
        """Add executive summary"""
        
        # Calculate risk level
        risk_score = self.results.get('sast', {}).get('summary', {}).get('risk_score', 0)
        
        if risk_score >= 70:
            risk_level = "🔴 **CRITICAL**"
        elif risk_score >= 40:
            risk_level = "🟠 **HIGH**"
        elif risk_score >= 20:
            risk_level = "🟡 **MEDIUM**"
        else:
            risk_level = "🟢 **LOW**"
        
        md.append(f"**Overall Risk Level:** {risk_level} (Score: {risk_score}/100)\n")
        
        # Key findings
        obf_type = self.results.get('obfuscation', {}).get('type', 'none')
        total_findings = self.results.get('sast', {}).get('summary', {}).get('total_findings', 0)
        critical_findings = len(self.results.get('sast', {}).get('critical', []))
        
        md.append(f"- **Obfuscation Type:** `{obf_type.upper()}`")
        md.append(f"- **Total Security Findings:** {total_findings}")
        md.append(f"- **Critical Issues:** {critical_findings}")
        md.append("")
    
    def _add_apk_info(self, md):
        """Add APK basic information"""
        
        info = self.results.get('basic_info', {})
        
        if 'error' in info:
            md.append(f"⚠️ Error extracting APK info: {info['error']}\n")
            return
        
        md.append("| Property | Value |")
        md.append("|----------|-------|")
        md.append(f"| Package Name | `{info.get('package_name', 'N/A')}` |")
        md.append(f"| App Name | {info.get('app_name', 'N/A')} |")
        md.append(f"| Version | {info.get('version_name', 'N/A')} ({info.get('version_code', 'N/A')}) |")
        md.append(f"| Min SDK | {info.get('min_sdk', 'N/A')} |")
        md.append(f"| Target SDK | {info.get('target_sdk', 'N/A')} |")
        md.append(f"| Signed | {info.get('is_signed', False)} |")
        md.append(f"| Permissions | {len(info.get('permissions', []))} |")
        md.append(f"| Activities | {len(info.get('activities', []))} |")
        md.append(f"| Services | {len(info.get('services', []))} |")
        md.append(f"| Receivers | {len(info.get('receivers', []))} |")
        md.append("")
        
        # Dangerous permissions
        if info.get('permissions'):
            md.append("\n### Key Permissions\n")
            dangerous = [p for p in info['permissions'] if any(d in p for d in ['SMS', 'CALL', 'CONTACTS', 'LOCATION', 'CAMERA', 'MICROPHONE', 'ACCESSIBILITY'])]
            if dangerous:
                for perm in dangerous[:10]:
                    md.append(f"- `{perm}`")
            md.append("")
    
    def _add_obfuscation_info(self, md):
        """Add obfuscation analysis"""
        
        obf = self.results.get('obfuscation', {})
        
        obf_type = obf.get('type', 'none')
        confidence = obf.get('confidence', 0)
        
        md.append(f"**Type:** `{obf_type.upper()}`")
        md.append(f"**Confidence:** {confidence}%\n")
        
        # Indicators
        indicators = obf.get('indicators', [])
        if indicators:
            md.append("### Indicators Detected\n")
            for indicator in indicators:
                md.append(f"- {indicator}")
            md.append("")
        
        # Recommendations
        recommendations = obf.get('recommendations', [])
        if recommendations:
            md.append("### Analysis Recommendations\n")
            for rec in recommendations:
                md.append(f"{rec}  ")
            md.append("")
    
    def _add_sast_findings(self, md):
        """Add SAST security findings"""
        
        sast = self.results.get('sast', {})
        summary = sast.get('summary', {})
        
        # Summary table
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
        
        # Sneak peek - top 5 critical/high findings
        md.append("### 👀 Top Priority Issues (Sneak Peek)\n")
        preview_count = 0
        for severity in ['critical', 'high']:
            findings = sast.get(severity, [])
            for finding in findings[:3]:  # Max 3 per severity for preview
                if preview_count >= 5:
                    break
                preview_count += 1
                md.append(f"**{preview_count}. [{severity.upper()}] {finding.get('title', 'Unknown')}**")
                md.append(f"- {finding.get('description', 'N/A')}")
                md.append(f"- File: `{finding.get('file', 'N/A')}`")
                md.append("")
            if preview_count >= 5:
                break
        
        if total_findings > 5:
            md.append(f"*📜 See all {total_findings} findings in detail below*\n")
        
        md.append("---\n")
        
        # Detailed findings - ALL items grouped by severity
        md.append("### 📋 All SAST Findings (Detailed)\n")
        
        for severity in ['critical', 'high', 'medium']:
            findings = sast.get(severity, [])
            if findings:
                emoji = {'critical': '🔴', 'high': '🟠', 'medium': '🟡'}
                md.append(f"\n#### {emoji[severity]} {severity.upper()} Severity ({len(findings)} findings)\n")
                
                # Group by category
                by_category = {}
                for finding in findings:
                    cat = finding.get('category', 'other')
                    if cat not in by_category:
                        by_category[cat] = []
                    by_category[cat].append(finding)
                
                for category, cat_findings in by_category.items():
                    md.append(f"\n##### {category.replace('_', ' ').title()} ({len(cat_findings)} issues)\n")
                    
                    for i, finding in enumerate(cat_findings, 1):
                        md.append(f"**{i}. {finding.get('title', 'Unknown')}**")
                        md.append(f"- **Description:** {finding.get('description', 'N/A')}")
                        md.append(f"- **File:** `{finding.get('file', 'N/A')}`")
                        if finding.get('line'):
                            md.append(f"- **Line:** {finding['line']}")
                        
                        if finding.get('code'):
                            md.append(f"\n```java")
                            md.append(finding['code'])
                            md.append(f"```\n")
                        else:
                            md.append("")
    
    def _add_manifest_findings(self, md):
        """Add manifest analysis findings"""
        
        manifest = self.results.get('manifest', {})
        findings = manifest.get('findings', [])
        
        if not findings:
            md.append("✅ No significant issues found in AndroidManifest.xml\n")
            return
        
        # Count by severity
        total = len(findings)
        by_severity = {'critical': [], 'high': [], 'medium': [], 'low': []}
        for finding in findings:
            sev = finding.get('severity', 'low')
            by_severity[sev].append(finding)
        
        md.append(f"**Total Issues:** {total}\n")
        
        # Sneak peek - top 5 issues
        md.append("### 👀 Top Issues (Sneak Peek)\n")
        preview_count = 0
        for severity in ['critical', 'high', 'medium']:
            for finding in by_severity[severity][:5]:
                if preview_count >= 5:
                    break
                preview_count += 1
                emoji = {'critical': '🔴', 'high': '🟠', 'medium': '🟡'}
                md.append(f"**{preview_count}. [{severity.upper()}] {finding.get('title', 'Unknown')}**")
                md.append(f"- {finding.get('description', 'N/A')}")
                md.append("")
            if preview_count >= 5:
                break
        
        if total > 5:
            md.append(f"*📜 See all {total} issues in detail below*\n")
        
        md.append("---\n")
        
        # All findings grouped by severity
        md.append("### 📋 All Manifest Issues (Detailed)\n")
        
        for severity in ['critical', 'high', 'medium']:
            if by_severity[severity]:
                emoji = {'critical': '🔴', 'high': '🟠', 'medium': '🟡'}
                md.append(f"\n#### {emoji[severity]} {severity.title()} Issues ({len(by_severity[severity])})\n")
                
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
        
        # URLs
        urls = network.get('urls', [])
        if urls:
            md.append(f"### 🔗 URLs Found\n")
            md.append(f"**Total URLs:** {len(urls)}\n")
            
            # Sneak peek - first 10
            md.append("#### 👀 Sample URLs (First 10)\n")
            for url in urls[:10]:
                md.append(f"- `{url}`")
            
            if len(urls) > 10:
                md.append(f"\n*📜 See all {len(urls)} URLs below*\n")
                md.append("---\n")
                md.append(f"#### 📋 All URLs ({len(urls)} total)\n")
                for i, url in enumerate(urls, 1):
                    md.append(f"{i}. `{url}`")
            md.append("")
        
        # Suspicious URLs
        suspicious = network.get('suspicious_urls', [])
        if suspicious:
            md.append(f"\n### 🚨 Suspicious URLs\n")
            md.append(f"**Total Suspicious:** {len(suspicious)}\n")
            
            for i, susp in enumerate(suspicious, 1):
                md.append(f"**{i}. {susp.get('url', 'N/A')}**")
                md.append(f"- **Reason:** {susp.get('reason', 'N/A')}")
                if susp.get('file'):
                    md.append(f"- **File:** `{susp.get('file', 'N/A')}`")
                md.append("")
        
        # WebSockets
        websockets = network.get('websockets', [])
        if websockets:
            md.append(f"\n### 🔌 WebSocket Connections\n")
            md.append(f"**Total WebSockets:** {len(websockets)}\n")
            
            for i, ws in enumerate(websockets, 1):
                md.append(f"**{i}. {ws.get('url', 'N/A')}**")
                md.append(f"- **File:** `{ws.get('file', 'N/A')}`")
                md.append("")
        
        # C2 Indicators
        c2 = network.get('c2_indicators', [])
        if c2:
            md.append(f"\n### 🎯 C2 Communication Indicators\n")
            md.append(f"**Total Indicators:** {len(c2)}\n")
            
            for i, indicator in enumerate(c2, 1):
                if 'url' in indicator:
                    md.append(f"**{i}. URL:** `{indicator['url']}`")
                elif 'domain' in indicator:
                    md.append(f"**{i}. Domain:** `{indicator['domain']}`")
                md.append(f"- {indicator.get('description', 'N/A')}")
                md.append("")
        
        # Domains and IPs
        domains = network.get('domains', [])
        ips = network.get('ip_addresses', [])
        
        if domains:
            unique_domains = list(set([d for d in domains if d and len(d) > 3]))
            md.append(f"\n### 🌍 Unique Domains\n")
            md.append(f"**Total Domains:** {len(unique_domains)}\n")
            
            # Sneak peek - first 15
            if len(unique_domains) > 15:
                md.append(f"#### 👀 Sample Domains (First 15)\n")
                for domain in unique_domains[:15]:
                    md.append(f"- `{domain}`")
                md.append(f"\n*📜 See all {len(unique_domains)} domains below*\n")
                md.append("---\n")
                md.append(f"#### 📋 All Domains ({len(unique_domains)} total)\n")
                for i, domain in enumerate(unique_domains, 1):
                    md.append(f"{i}. `{domain}`")
            else:
                for domain in unique_domains:
                    md.append(f"- `{domain}`")
            md.append("")
        
        if ips:
            unique_ips = list(set(ips))
            md.append(f"\n### 📍 IP Addresses\n")
            md.append(f"**Total IPs:** {len(unique_ips)}\n")
            
            for i, ip in enumerate(unique_ips, 1):
                md.append(f"{i}. `{ip}`")
            md.append("")
    
    def _add_yara_results(self, md):
        """Add YARA scan results"""
        
        yara_files = [
            'yara_apk_results.txt',
            'yara_decompiled_results.txt',
            'yara_jadx_results.txt'
        ]
        
        has_results = False
        
        for yara_file in yara_files:
            filepath = self.temp_dir / yara_file
            if filepath.exists():
                content = filepath.read_text(errors='ignore').strip()
                if content:
                    has_results = True
                    md.append(f"\n### {yara_file.replace('_', ' ').replace('.txt', '').title()}\n")
                    md.append(f"```")
                    md.append(content[:2000])  # Limit output
                    md.append(f"```\n")
        
        if not has_results:
            md.append("No YARA rule matches found.\n")
    
    def _add_recommendations(self, md):
        """Add analysis recommendations"""
        
        obf = self.results.get('obfuscation', {})
        recommendations = obf.get('recommendations', [])
        
        if recommendations:
            md.append("### Based on Protection Type\n")
            for rec in recommendations:
                md.append(f"{rec}  ")
            md.append("")
        
        # General recommendations
        md.append("\n### General Security Recommendations\n")
        md.append("1. **Dynamic Analysis:** Run the app in a controlled environment with Frida hooks")
        md.append("2. **Network Monitoring:** Capture and analyze network traffic")
        md.append("3. **Behavioral Analysis:** Monitor file system, IPC, and system calls")
        md.append("4. **Memory Dump:** Extract and analyze runtime memory")
        md.append("5. **API Hooking:** Hook sensitive APIs to understand behavior")
        md.append("")
    
    def generate_json(self, output_file):
        """Generate comprehensive JSON report"""
        
        report = {
            'metadata': {
                'apk_name': self.apk_name,
                'sha256': self.sha256,
                'timestamp': self.timestamp,
                'analyzer_version': '1.0'
            },
            'results': self.results
        }
        
        # Create parent directory if needed
        output_path = Path(output_file)
        output_path.parent.mkdir(parents=True, exist_ok=True)
        
        with open(output_file, 'w') as f:
            json.dump(report, f, indent=2)

def main():
    parser = argparse.ArgumentParser(description='Report Generator')
    parser.add_argument('--workspace', required=True, help='Workspace directory')
    parser.add_argument('--temp', required=True, help='Temp directory with results')
    parser.add_argument('--output', required=True, help='Output markdown file')
    parser.add_argument('--json', required=True, help='Output JSON file')
    parser.add_argument('--apk-name', required=True, help='APK filename')
    parser.add_argument('--sha256', required=True, help='APK SHA256 hash')
    
    args = parser.parse_args()
    
    generator = ReportGenerator(
        args.workspace,
        args.temp,
        args.apk_name,
        args.sha256
    )
    
    print("Generating markdown report...")
    generator.generate_markdown(args.output)
    
    print("Generating JSON report...")
    generator.generate_json(args.json)
    
    print(f"Reports generated successfully!")
    print(f"  Markdown: {args.output}")
    print(f"  JSON: {args.json}")

if __name__ == '__main__':
    main()
