#!/usr/bin/env python3
"""
Enhanced YARA Results Analyzer
Provides detailed analysis, categorization, and rule tracking of YARA scan results
"""

import os
import sys
import json
import re
from datetime import datetime


def analyze_yara_results(temp_dir, output_file, rule_files=None):
    """Enhanced YARA results analyzer with categorization and severity scoring"""
    if rule_files is None:
        rule_files = []
        
    results = {
        'summary': {
            'total_matches': 0,
            'critical_findings': 0,
            'high_severity': 0,
            'medium_severity': 0,
            'low_severity': 0,
            'files_scanned': 0,
            'total_rules_checked': 0,
            'rules_matched': 0
        },
        'findings': [],
        'categories': {},
        'rules_checked': [],
        'scan_details': {
            'apk_scan': {'files': [], 'matches': 0},
            'decompiled_scan': {'files': [], 'matches': 0},
            'jadx_scan': {'files': [], 'matches': 0}
        }
    }
    
    # Process multiple rule files
    for yara_rules_file in rule_files:
        if os.path.exists(yara_rules_file):
            extract_rules_info(yara_rules_file, results)
    
    # Parse results from different scans
    yara_files = [
        ('apk', f'{temp_dir}/yara_apk_results.txt'),
        ('decompiled', f'{temp_dir}/yara_decompiled_results.txt'),
        ('jadx', f'{temp_dir}/yara_jadx_results.txt')
    ]
    
    for scan_type, yara_file in yara_files:
        if os.path.exists(yara_file):
            parse_yara_output(yara_file, scan_type, results)
    
    # Calculate summary statistics
    results['summary']['total_matches'] = len(results['findings'])
    results['summary']['rules_matched'] = len(set(f['rule_name'] for f in results['findings']))
    results['summary']['critical_findings'] = sum(1 for f in results['findings'] if f['severity'] == 'CRITICAL')
    results['summary']['high_severity'] = sum(1 for f in results['findings'] if f['severity'] == 'HIGH')
    results['summary']['medium_severity'] = sum(1 for f in results['findings'] if f['severity'] == 'MEDIUM')
    results['summary']['low_severity'] = sum(1 for f in results['findings'] if f['severity'] == 'LOW')
    
    # Mark rules as matched
    matched_rules = set(f['rule_name'] for f in results['findings'])
    for rule in results['rules_checked']:
        rule['matched'] = rule['name'] in matched_rules
        rule['match_count'] = sum(1 for f in results['findings'] if f['rule_name'] == rule['name'])
    
    # Sort findings by severity
    severity_order = {'CRITICAL': 0, 'HIGH': 1, 'MEDIUM': 2, 'LOW': 3}
    results['findings'].sort(key=lambda x: (severity_order[x['severity']], x['rule_name']))
    
    # Save results
    with open(output_file, 'w') as f:
        json.dump(results, f, indent=2)
    
    return results


def extract_rules_info(yara_rules_file, results):
    """Extract information about all YARA rules"""
    try:
        with open(yara_rules_file, 'r', encoding='utf-8', errors='ignore') as f:
            content = f.read()
        
        # Simple regex to extract rule names and metadata
        rule_pattern = r'rule\s+(\w+)\s*(?:\:\s*[\w\s]+)?\s*\{'
        meta_pattern = r'meta:\s*((?:.*?\n)*?)\s*(?:strings:|condition:)'
        
        rules = re.finditer(rule_pattern, content)
        total_rules = 0
        
        for rule_match in rules:
            rule_name = rule_match.group(1)
            total_rules += 1
            
            # Try to extract description from metadata
            rule_start = rule_match.start()
            rule_block = content[rule_start:rule_start + 1000]  # Get next 1000 chars
            
            description = get_description(rule_name)
            
            # Extract meta tags if available
            meta_match = re.search(meta_pattern, rule_block, re.DOTALL)
            if meta_match:
                meta_content = meta_match.group(1)
                desc_match = re.search(r'description\s*=\s*"([^"]+)"', meta_content)
                if desc_match:
                    description = desc_match.group(1)
            
            results['rules_checked'].append({
                'name': rule_name,
                'category': get_category(rule_name),
                'severity': get_severity(rule_name),
                'description': description,
                'matched': False,
                'match_count': 0
            })
        
        results['summary']['total_rules_checked'] = total_rules
        
    except Exception as e:
        print(f"Error extracting rules info: {e}", file=sys.stderr)


def parse_yara_output(yara_file, scan_type, results):
    """Parse YARA output file and extract findings"""
    try:
        with open(yara_file, 'r', encoding='utf-8', errors='ignore') as f:
            content = f.read()
            
        if not content.strip():
            return
            
        # Track scanned file
        scan_detail = results['scan_details'][f'{scan_type}_scan']
        
        # Parse YARA output format:
        # Line 1: rule_name file_path
        # Line 2+: 0xoffset:$string_name: matched_content (optional, only with -s flag)
        
        lines = content.strip().split('\n')
        current_rule = None
        current_file = None
        matched_strings = []
        
        for line in lines:
            if not line.strip():
                continue
            
            # Check if this is a rule match line (doesn't start with 0x)
            if not line.startswith('0x'):
                # This is a new rule match: rule_name file_path
                # Save previous finding if exists
                if current_rule and current_file:
                    save_finding(current_rule, current_file, scan_type, matched_strings, results, scan_detail)
                    matched_strings = []
                
                # Parse new rule match
                parts = line.split(maxsplit=1)
                if len(parts) >= 1:
                    current_rule = parts[0]
                    current_file = parts[1] if len(parts) > 1 else 'unknown'
            else:
                # This is a matched string line: 0xoffset:$string_name: matched_content
                # Parse: 0x239319a:$lib_dpt: libdpt
                match_parts = line.split(':', 2)
                if len(match_parts) >= 2:
                    offset = match_parts[0]  # 0x239319a
                    string_id = match_parts[1]  # $lib_dpt
                    content_match = match_parts[2].strip() if len(match_parts) > 2 else ''
                    
                    matched_strings.append({
                        'offset': offset,
                        'identifier': string_id,
                        'content': content_match[:100]  # Limit content length
                    })
        
        # Save last finding
        if current_rule and current_file:
            save_finding(current_rule, current_file, scan_type, matched_strings, results, scan_detail)
            
    except Exception as e:
        print(f"Error parsing YARA output {yara_file}: {e}", file=sys.stderr)


def save_finding(rule_name, file_path, scan_type, matched_strings, results, scan_detail):
    """Save a YARA finding to results"""
    if file_path not in scan_detail['files']:
        scan_detail['files'].append(file_path)
    scan_detail['matches'] += 1
    
    finding = {
        'rule_name': rule_name,
        'file': file_path,
        'scan_type': scan_type,
        'matched_strings': matched_strings.copy(),
        'string_count': len(matched_strings),
        'severity': get_severity(rule_name),
        'category': get_category(rule_name),
        'description': get_description(rule_name),
        'recommendation': get_recommendation(rule_name)
    }
    
    results['findings'].append(finding)
    results['summary']['files_scanned'] += 1
    
    # Group by category
    category = finding['category']
    if category not in results['categories']:
        results['categories'][category] = []
    results['categories'][category].append(finding)


def get_severity(rule_name):
    """Determine severity based on rule name"""
    rule_lower = rule_name.lower()
    
    # Critical threats
    if any(x in rule_lower for x in ['ransom', 'banker', 'trojan', 'rootkit', 'backdoor', 'keylogger']):
        return 'CRITICAL'
    
    # High severity
    if any(x in rule_lower for x in ['obfuscation', 'packer', 'encrypted', 'suspicious', 'malicious', 'exploit']):
        return 'HIGH'
    
    # Medium severity
    if any(x in rule_lower for x in ['webview', 'permission', 'crypto', 'network', 'url', 'reflection']):
        return 'MEDIUM'
    
    return 'LOW'


def get_category(rule_name):
    """Categorize rule based on name"""
    rule_lower = rule_name.lower()
    
    categories = {
        'Obfuscation': ['obfuscation', 'packer', 'dexprotector', 'jiagu', 'bangcle', 'dpt', 'encrypted'],
        'Malware': ['trojan', 'banker', 'ransomware', 'spyware', 'adware', 'malware'],
        'Network': ['url', 'network', 'http', 'socket', 'c2', 'command'],
        'Permissions': ['permission', 'privilege', 'root', 'admin'],
        'Crypto': ['crypto', 'encryption', 'cipher', 'aes', 'rsa', 'base64'],
        'Suspicious': ['suspicious', 'backdoor', 'exploit', 'vulnerability', 'reflection'],
        'Anti-Analysis': ['anti_debug', 'anti_vm', 'emulator', 'frida', 'xposed']
    }
    
    for category, keywords in categories.items():
        if any(keyword in rule_lower for keyword in keywords):
            return category
    
    return 'Other'


def get_description(rule_name):
    """Get detailed description for rule"""
    descriptions = {
        'dexprotector': 'DexProtector commercial obfuscator detected - code is heavily protected',
        'jiagu': 'Qihoo 360 Jiagu packer detected - indicates protected/encrypted DEX',
        'bangcle': 'Bangcle/SecShell packer detected - DEX is encrypted',
        'dpt_shell': 'DPT-Shell packer detected - advanced protection mechanism',
        'encrypted_dex': 'Encrypted DEX payload detected - real code hidden',
        'suspicious_url': 'Suspicious or hardcoded URL found',
        'root_detection': 'Root/jailbreak detection mechanism found',
        'anti_debug': 'Anti-debugging technique detected',
        'webview_javascript': 'JavaScript interface exposed in WebView - potential XSS',
        'dynamic_code_loading': 'Dynamic code loading detected - may load malicious code at runtime',
        'reflection_usage': 'Heavy reflection usage - may hide malicious behavior',
        'native_hooks': 'Native hooking detected - may intercept system calls',
        'obfuscated_strings': 'Obfuscated strings detected - hiding malicious content',
        'command_execution': 'Command execution capability detected',
        'file_encryption': 'File encryption capability detected',
        'sms_interception': 'SMS interception detected - privacy risk',
        'call_interception': 'Call recording/interception detected',
        'data_exfiltration': 'Data exfiltration pattern detected',
        'credential_theft': 'Credential stealing pattern found'
    }
    
    for key, desc in descriptions.items():
        if key in rule_name.lower():
            return desc
    
    return f'Security finding: {rule_name}'


def get_recommendation(rule_name):
    """Get remediation recommendation"""
    rule_lower = rule_name.lower()
    
    if 'packer' in rule_lower or 'obfuscation' in rule_lower or 'encrypted' in rule_lower:
        return 'Use dynamic analysis with Frida to unpack at runtime and dump DEX from memory'
    
    if 'trojan' in rule_lower or 'malware' in rule_lower:
        return 'Quarantine immediately - manual review required before execution'
    
    if 'suspicious' in rule_lower or 'backdoor' in rule_lower:
        return 'Investigate code context and network behavior - may be false positive'
    
    if 'anti' in rule_lower:
        return 'Bypass detection in controlled environment to continue analysis'
    
    if 'url' in rule_lower or 'network' in rule_lower:
        return 'Monitor network traffic and validate all endpoints'
    
    return 'Review code manually and assess risk in context'


def main():
    if len(sys.argv) < 3:
        print("Usage: yara_enhanced_analyzer.py <temp_dir> <output_file> [rule_files...]")
        sys.exit(1)
    
    temp_dir = sys.argv[1]
    output_file = sys.argv[2]
    rule_files = sys.argv[3:]
    
    results = analyze_yara_results(temp_dir, output_file, rule_files=rule_files)
    
    print(f"\n✓ Enhanced YARA analysis complete")
    print(f"  Rules Checked: {results['summary']['total_rules_checked']}")
    print(f"  Rules Matched: {results['summary']['rules_matched']}")
    print(f"  Total Matches: {results['summary']['total_matches']}")
    print(f"  Critical: {results['summary']['critical_findings']}")
    print(f"  High: {results['summary']['high_severity']}")
    print(f"  Medium: {results['summary']['medium_severity']}")
    print(f"  Low: {results['summary']['low_severity']}")


if __name__ == '__main__':
    main()
