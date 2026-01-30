#!/usr/bin/env python3
"""
YARA Results Processor
Parses and enhances YARA scan results with detailed analysis and categorization
"""

import sys
import os
import re
import json
import argparse
from pathlib import Path
from collections import defaultdict


# YARA rule severity mapping
SEVERITY_MAP = {
    'AndroidMalware': 'CRITICAL',
    'Backdoor': 'CRITICAL',
    'Trojan': 'CRITICAL',
    'Ransomware': 'CRITICAL',
    'BankingMalware': 'CRITICAL',
    'Spyware': 'HIGH',
    'Adware': 'HIGH',
    'DexProtector': 'HIGH',
    'DPTShell': 'HIGH',
    'Packer': 'HIGH',
    'Obfuscator': 'MEDIUM',
    'SuspiciousAPI': 'MEDIUM',
    'NetworkArtifact': 'MEDIUM',
    'CryptoMining': 'HIGH',
    'PrivilegeEscalation': 'CRITICAL',
    'RootDetection': 'MEDIUM',
    'EmulatorDetection': 'MEDIUM',
    'DynamicCodeLoading': 'HIGH',
    'NativeCode': 'LOW',
    'Reflection': 'MEDIUM',
}


def parse_yara_output(yara_file):
    """Parse YARA output file"""
    if not os.path.exists(yara_file):
        return []
    
    matches = []
    current_match = None
    
    try:
        with open(yara_file, 'r', encoding='utf-8', errors='ignore') as f:
            for line in f:
                line = line.strip()
                
                if not line:
                    continue
                
                # Match line format: "RuleName file_path"
                if not line.startswith('0x') and not line.startswith('$'):
                    parts = line.split(None, 1)
                    if len(parts) >= 1:
                        if current_match:
                            matches.append(current_match)
                        
                        rule_name = parts[0]
                        file_path = parts[1] if len(parts) > 1 else "Unknown"
                        
                        current_match = {
                            'rule': rule_name,
                            'file': file_path,
                            'strings': []
                        }
                
                # String match format: "0x123:$string_name: matched content"
                elif line.startswith('0x'):
                    if current_match:
                        # Parse offset and string info
                        match_info = re.match(r'(0x[0-9a-fA-F]+):\$([^:]+):\s*(.+)', line)
                        if match_info:
                            offset = match_info.group(1)
                            string_name = match_info.group(2)
                            content = match_info.group(3)
                            
                            current_match['strings'].append({
                                'offset': offset,
                                'name': string_name,
                                'content': content
                            })
            
            # Add last match
            if current_match:
                matches.append(current_match)
                
    except Exception as e:
        print(f"[!] Error parsing {yara_file}: {e}")
    
    return matches


def categorize_matches(matches):
    """Categorize YARA matches by severity"""
    categorized = {
        'CRITICAL': [],
        'HIGH': [],
        'MEDIUM': [],
        'LOW': [],
        'INFO': []
    }
    
    for match in matches:
        rule_name = match['rule']
        
        # Determine severity
        severity = 'INFO'
        for keyword, sev in SEVERITY_MAP.items():
            if keyword.lower() in rule_name.lower():
                severity = sev
                break
        
        # Enhance match with metadata
        enhanced_match = {
            **match,
            'severity': severity,
            'description': get_rule_description(rule_name),
            'recommendation': get_recommendation(rule_name)
        }
        
        categorized[severity].append(enhanced_match)
    
    return categorized


def get_rule_description(rule_name):
    """Get human-readable description for YARA rule"""
    descriptions = {
        'AndroidMalware': 'Known Android malware signature detected',
        'Backdoor': 'Backdoor functionality identified',
        'Trojan': 'Trojan behavior patterns found',
        'Ransomware': 'Ransomware indicators present',
        'BankingMalware': 'Banking trojan signatures detected',
        'Spyware': 'Spyware capabilities identified',
        'Adware': 'Advertising/adware libraries detected',
        'DexProtector': 'DexProtector packer detected',
        'DPTShell': 'DPT-Shell obfuscation detected',
        'Packer': 'Code packing/obfuscation detected',
        'Obfuscator': 'Code obfuscation patterns found',
        'SuspiciousAPI': 'Suspicious API calls detected',
        'NetworkArtifact': 'Suspicious network artifacts found',
        'CryptoMining': 'Cryptocurrency mining code detected',
        'PrivilegeEscalation': 'Privilege escalation attempts detected',
        'RootDetection': 'Root detection mechanisms found',
        'EmulatorDetection': 'Emulator detection code present',
        'DynamicCodeLoading': 'Dynamic code loading detected',
        'NativeCode': 'Native code (JNI) usage detected',
        'Reflection': 'Java reflection usage detected',
    }
    
    for keyword, desc in descriptions.items():
        if keyword.lower() in rule_name.lower():
            return desc
    
    return f"YARA rule '{rule_name}' matched"


def get_recommendation(rule_name):
    """Get security recommendations based on YARA rule"""
    recommendations = {
        'Backdoor': 'URGENT: Review for unauthorized remote access capabilities. Check for command & control infrastructure.',
        'Trojan': 'URGENT: Analyze malicious payload. Identify data exfiltration mechanisms.',
        'Ransomware': 'CRITICAL: Check for encryption routines and ransom payment mechanisms.',
        'BankingMalware': 'CRITICAL: Review for credential theft, overlay attacks, and SMS interception.',
        'Spyware': 'HIGH: Analyze data collection capabilities. Check for keylogging and screen capture.',
        'DexProtector': 'Dynamic analysis required - DEX will be unpacked at runtime.',
        'DPTShell': 'Advanced packer detected - use Frida to dump unpacked DEX from memory.',
        'Packer': 'Packed code detected - static analysis may be limited. Consider dynamic analysis.',
        'DynamicCodeLoading': 'Monitor runtime behavior for dynamically loaded code execution.',
        'CryptoMining': 'Check for unauthorized resource usage and background mining operations.',
        'PrivilegeEscalation': 'Review for root exploits and privilege escalation vulnerabilities.',
    }
    
    for keyword, rec in recommendations.items():
        if keyword.lower() in rule_name.lower():
            return rec
    
    return 'Further investigation recommended.'


def generate_summary_stats(categorized):
    """Generate summary statistics"""
    stats = {
        'total_matches': sum(len(matches) for matches in categorized.values()),
        'by_severity': {
            severity: len(matches)
            for severity, matches in categorized.items()
        },
        'unique_rules': len(set(
            match['rule'] 
            for matches in categorized.values() 
            for match in matches
        )),
        'affected_files': len(set(
            match['file']
            for matches in categorized.values()
            for match in matches
        ))
    }
    return stats


def generate_markdown_report(categorized, stats, output_file):
    """Generate detailed Markdown report"""
    md_lines = [
        "# YARA Scan Results",
        "",
        "## Summary",
        "",
        f"- **Total Matches**: {stats['total_matches']}",
        f"- **Unique Rules**: {stats['unique_rules']}",
        f"- **Affected Files**: {stats['affected_files']}",
        "",
        "### Severity Breakdown",
        ""
    ]
    
    # Severity breakdown
    for severity in ['CRITICAL', 'HIGH', 'MEDIUM', 'LOW', 'INFO']:
        count = stats['by_severity'][severity]
        if count > 0:
            emoji = {'CRITICAL': '🔴', 'HIGH': '🟠', 'MEDIUM': '🟡', 'LOW': '🔵', 'INFO': '⚪'}
            md_lines.append(f"- {emoji.get(severity, '•')} **{severity}**: {count} match(es)")
    
    md_lines.append("")
    
    # Detailed findings by severity
    for severity in ['CRITICAL', 'HIGH', 'MEDIUM', 'LOW', 'INFO']:
        matches = categorized[severity]
        if not matches:
            continue
        
        md_lines.extend([
            f"## {severity} Severity Findings",
            ""
        ])
        
        # Group by rule
        rules = defaultdict(list)
        for match in matches:
            rules[match['rule']].append(match)
        
        for rule_name, rule_matches in rules.items():
            md_lines.extend([
                f"### {rule_name}",
                "",
                f"**Description**: {rule_matches[0]['description']}",
                "",
                f"**Recommendation**: {rule_matches[0]['recommendation']}",
                "",
                f"**Matches**: {len(rule_matches)} file(s)",
                ""
            ])
            
            # List affected files
            for i, match in enumerate(rule_matches, 1):
                md_lines.append(f"{i}. `{match['file']}`")
                
                # Show matched strings (limit to first 5)
                if match['strings']:
                    md_lines.append("")
                    md_lines.append("   **Matched Patterns**:")
                    for string_match in match['strings'][:5]:
                        content = string_match['content'][:100]  # Truncate long strings
                        md_lines.append(f"   - `{string_match['name']}` at `{string_match['offset']}`: `{content}`")
                    
                    if len(match['strings']) > 5:
                        md_lines.append(f"   - ... and {len(match['strings']) - 5} more pattern(s)")
                
                md_lines.append("")
            
            md_lines.append("")
    
    # Write report
    try:
        with open(output_file, 'w', encoding='utf-8') as f:
            f.write('\n'.join(md_lines))
        return True
    except Exception as e:
        print(f"[!] Error writing Markdown report: {e}")
        return False


def process_yara_results(yara_files, output_dir):
    """Process multiple YARA result files"""
    all_matches = []
    
    print("[*] Processing YARA results...")
    
    for yara_file in yara_files:
        if not os.path.exists(yara_file):
            print(f"[!] File not found: {yara_file}")
            continue
        
        print(f"[*] Parsing: {yara_file}")
        matches = parse_yara_output(yara_file)
        all_matches.extend(matches)
        print(f"    Found {len(matches)} match(es)")
    
    if not all_matches:
        print("[!] No YARA matches found")
        return False
    
    # Categorize matches
    categorized = categorize_matches(all_matches)
    
    # Generate statistics
    stats = generate_summary_stats(categorized)
    
    # Print console summary
    print("\n" + "="*70)
    print("YARA SCAN SUMMARY")
    print("="*70)
    print(f"Total Matches: {stats['total_matches']}")
    print(f"Unique Rules: {stats['unique_rules']}")
    print(f"Affected Files: {stats['affected_files']}")
    print("\nBy Severity:")
    for severity in ['CRITICAL', 'HIGH', 'MEDIUM', 'LOW', 'INFO']:
        count = stats['by_severity'][severity]
        if count > 0:
            emoji = {'CRITICAL': '🔴', 'HIGH': '🟠', 'MEDIUM': '🟡', 'LOW': '🔵', 'INFO': '⚪'}
            print(f"  {emoji.get(severity, '•')} {severity}: {count}")
    print("="*70 + "\n")
    
    # Save JSON
    json_output = os.path.join(output_dir, 'yara_processed.json')
    try:
        with open(json_output, 'w') as f:
            json.dump({
                'statistics': stats,
                'findings': categorized
            }, f, indent=2)
        print(f"[✓] JSON report saved: {json_output}")
    except Exception as e:
        print(f"[!] Error saving JSON: {e}")
    
    # Generate Markdown report
    md_output = os.path.join(output_dir, 'yara_detailed_report.md')
    if generate_markdown_report(categorized, stats, md_output):
        print(f"[✓] Markdown report saved: {md_output}")
    
    return True


def main():
    parser = argparse.ArgumentParser(
        description='YARA Results Processor - Enhanced YARA scan analysis'
    )
    parser.add_argument('yara_files', nargs='+', help='YARA result files to process')
    parser.add_argument('--output-dir', required=True, help='Output directory for reports')
    
    args = parser.parse_args()
    
    # Create output directory if needed
    os.makedirs(args.output_dir, exist_ok=True)
    
    success = process_yara_results(args.yara_files, args.output_dir)
    sys.exit(0 if success else 1)


if __name__ == '__main__':
    main()
