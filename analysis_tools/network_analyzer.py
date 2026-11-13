#!/usr/bin/env python3
"""
Network Artifacts Analyzer
Extracts and analyzes network-related artifacts from APK
"""

import sys
import json
import re
import argparse
from pathlib import Path
from collections import defaultdict
from urllib.parse import urlparse

# K5: single source of truth for suspicious TLDs is analyzer_config.json. The
# list below is only a fallback for when the config is missing or unreadable.
CONFIG_PATH = Path(__file__).resolve().parent.parent / "analyzer_config.json"
DEFAULT_SUSPICIOUS_TLDS = ['.top', '.xyz', '.tk', '.ml', '.ga', '.cf', '.gq', '.pw']


def load_suspicious_tlds(config_path=CONFIG_PATH):
    try:
        cfg = json.loads(Path(config_path).read_text(encoding='utf-8'))
        tlds = cfg.get('patterns', {}).get('suspicious_tlds')
        if tlds:
            return [t if t.startswith('.') else '.' + t for t in tlds]
    except (OSError, ValueError):
        pass
    return list(DEFAULT_SUSPICIOUS_TLDS)


class NetworkAnalyzer:
    def __init__(self, decompiled_dir, jadx_dir):
        self.decompiled_dir = Path(decompiled_dir) if decompiled_dir else None
        self.jadx_dir = Path(jadx_dir) if jadx_dir else None
        self.suspicious_tlds = load_suspicious_tlds()

        self.findings = {
            'urls': [],
            'domains': [],
            'ip_addresses': [],
            'websockets': [],
            'api_endpoints': [],
            'suspicious_urls': [],
            'c2_indicators': []
        }
    
    def extract_urls(self, content):
        """Extract URLs from content"""
        # URL patterns
        url_pattern = r'https?://[^\s\'"<>)}\]]+|wss?://[^\s\'"<>)}\]]+'
        urls = re.findall(url_pattern, content, re.IGNORECASE)
        
        # Filter and clean URLs
        cleaned_urls = []
        for url in urls:
            # Remove trailing punctuation
            url = url.rstrip('.,;:!?')
            
            # Must have valid domain structure
            try:
                parsed = urlparse(url)
                if parsed.netloc and '.' in parsed.netloc:
                    # Skip if netloc looks like a variable/class name
                    if not any([
                        parsed.netloc.startswith('$'),
                        parsed.netloc.startswith('{'),
                        'localhost' in parsed.netloc.lower(),
                        '127.0.0.1' in parsed.netloc,
                        parsed.netloc.endswith('.local'),
                    ]):
                        cleaned_urls.append(url)
            except:
                continue
        
        return cleaned_urls
    
    def extract_domains(self, content):
        """Extract domain names"""
        # Domain pattern (more flexible)
        domain_pattern = r'(?:[a-zA-Z0-9](?:[a-zA-Z0-9\-]{0,61}[a-zA-Z0-9])?\.)+[a-zA-Z]{2,}'
        domains = re.findall(domain_pattern, content)
        
        # Filter out false positives
        filtered_domains = []
        for domain in domains:
            domain_lower = domain.lower()

            # B12: a real hostname in decompiled code is written lowercase, so any
            # uppercase letter marks a code identifier (coroutineId.id, R.string).
            if domain != domain_lower:
                continue

            # Skip if it looks like a Java class/method pattern
            if any([
                domain.startswith('super.'),
                domain.startswith('this.'),
                '.on' in domain_lower and len(domain.split('.')) <= 3,  # onCancel, onCreate, etc
                domain.endswith('.java'),
                domain.endswith('.class'),
                domain.endswith('.xml'),
                '.get' in domain_lower and len(domain.split('.')) <= 3,
                '.set' in domain_lower and len(domain.split('.')) <= 3,
                '.is' in domain_lower and len(domain.split('.')) <= 3,
                all(part[0].isupper() for part in domain.split('.') if part),  # ClassName.MethodName
                domain.count('.') > 6,  # Too many dots, likely not a domain
                len(domain.split('.')[-1]) > 10,  # TLD too long
            ]):
                continue
            
            # Must have valid TLD
            tld = domain.split('.')[-1].lower()
            if tld in ['com', 'net', 'org', 'io', 'co', 'app', 'dev', 'ai', 'me', 'info', 
                       'xyz', 'online', 'site', 'top', 'cn', 'ru', 'de', 'uk', 'jp', 'kr',
                       'in', 'br', 'au', 'fr', 'it', 'es', 'nl', 'pl', 'se', 'no', 'fi',
                       'id', 'my', 'sg', 'th', 'vn', 'ph', 'tw', 'hk']:
                filtered_domains.append(domain)
        
        return filtered_domains
    
    def extract_ip_addresses(self, content):
        """Extract IP addresses"""
        ip_pattern = r'\b(?:\d{1,3}\.){3}\d{1,3}\b'
        ips = re.findall(ip_pattern, content)
        # Filter valid IPs
        valid_ips = [ip for ip in ips if all(0 <= int(octet) <= 255 for octet in ip.split('.'))]
        return valid_ips
    
    def is_suspicious_url(self, url):
        """Check if URL is suspicious.

        K3: 'api', 'upload' and 'download' were dropped — they appear in countless
        benign REST endpoints and flagged almost every app. Only path segments that
        actually signal command-and-control remain, matched as whole segments so a
        word like 'robot' no longer trips 'bot'.
        """
        c2_segments = {'c2', 'cmd', 'command', 'bot', 'gate', 'panel', 'inject'}

        parsed = urlparse(url)
        domain = parsed.netloc.lower()
        path = parsed.path.lower()

        # Check TLD
        for tld in self.suspicious_tlds:
            if domain.endswith(tld):
                return True, f'Suspicious TLD: {tld}'

        # Check C2-like whole segments in the path
        segments = {seg for seg in re.split(r'[/._-]', path) if seg}
        hit = c2_segments & segments
        if hit:
            return True, f'Suspicious path segment: {sorted(hit)[0]}'

        # Check for WebSocket
        if url.startswith('wss://') or url.startswith('ws://'):
            return True, 'WebSocket connection'

        return False, None
    
    def scan_java_files(self):
        """Scan Java files for network artifacts"""
        if not self.jadx_dir or not self.jadx_dir.exists():
            return
        
        print("Scanning Java files for network artifacts...")
        
        java_files = list(self.jadx_dir.rglob('*.java'))
        
        all_urls = set()
        all_domains = set()
        all_ips = set()
        
        for java_file in java_files:
            try:
                content = java_file.read_text(errors='ignore')
                
                # Extract URLs
                urls = self.extract_urls(content)
                for url in urls:
                    all_urls.add(url)
                    
                    # Check if suspicious
                    is_susp, reason = self.is_suspicious_url(url)
                    if is_susp:
                        self.findings['suspicious_urls'].append({
                            'url': url,
                            'reason': reason,
                            'file': str(java_file.relative_to(self.jadx_dir))
                        })
                    
                    # Check for WebSocket
                    if url.startswith('ws'):
                        self.findings['websockets'].append({
                            'url': url,
                            'file': str(java_file.relative_to(self.jadx_dir))
                        })
                
                # Extract domains
                domains = self.extract_domains(content)
                all_domains.update(domains)
                
                # Extract IPs
                ips = self.extract_ip_addresses(content)
                all_ips.update(ips)
                
            except Exception as e:
                continue
        
        self.findings['urls'] = list(all_urls)
        self.findings['domains'] = list(all_domains)
        self.findings['ip_addresses'] = list(all_ips)
    
    def scan_smali_files(self):
        """Scan SMALI files for network strings"""
        if not self.decompiled_dir:
            return
        
        print("Scanning SMALI files for network artifacts...")
        
        smali_dirs = [d for d in self.decompiled_dir.iterdir() if d.is_dir() and d.name.startswith('smali')]
        
        for smali_dir in smali_dirs:
            smali_files = list(smali_dir.rglob('*.smali'))[:200]  # Limit
            
            for smali_file in smali_files:
                try:
                    content = smali_file.read_text(errors='ignore')
                    
                    # Look for string constants
                    string_pattern = r'const-string.*?"([^"]+)"'
                    strings = re.findall(string_pattern, content)
                    
                    for string in strings:
                        # Check if it's a URL
                        if re.match(r'https?://', string) or re.match(r'wss?://', string):
                            self.findings['urls'].append(string)
                            
                            is_susp, reason = self.is_suspicious_url(string)
                            if is_susp:
                                self.findings['suspicious_urls'].append({
                                    'url': string,
                                    'reason': reason,
                                    'file': str(smali_file.relative_to(self.decompiled_dir))
                                })
                
                except Exception:
                    continue
    
    def detect_c2_patterns(self):
        """Detect C2 communication patterns"""
        
        # Check URLs for C2 indicators
        c2_patterns = [
            r'/api/.*/(upload|download|command|cmd)',
            r'/bot/',
            r'/c2/',
            r'/panel/',
            r'/gate/',
        ]
        
        for url in self.findings['urls']:
            for pattern in c2_patterns:
                if re.search(pattern, url, re.IGNORECASE):
                    self.findings['c2_indicators'].append({
                        'url': url,
                        'pattern': pattern,
                        'description': 'Potential C2 endpoint'
                    })
        
        # Check for DGA-like domains (Domain Generation Algorithm)
        for domain in self.findings['domains']:
            # Simple heuristic: long subdomain with random-looking characters
            parts = domain.split('.')
            for part in parts[:-2]:  # Exclude TLD and main domain
                if len(part) > 15 and sum(c.isdigit() for c in part) > 3:
                    self.findings['c2_indicators'].append({
                        'domain': domain,
                        'description': 'Potential DGA domain (long random subdomain)'
                    })
    
    def analyze(self):
        """Run all analysis"""
        self.scan_java_files()
        self.scan_smali_files()
        self.detect_c2_patterns()
        
        # Deduplicate
        self.findings['urls'] = list(set(self.findings['urls']))
        self.findings['domains'] = list(set(self.findings['domains']))
        self.findings['ip_addresses'] = list(set(self.findings['ip_addresses']))
        
        return self.findings

def main():
    parser = argparse.ArgumentParser(description='Network Artifacts Analyzer')
    parser.add_argument('--decompiled', help='Path to decompiled directory')
    parser.add_argument('--jadx', help='Path to JADX output')
    parser.add_argument('--output', required=True, help='Output JSON file')
    
    args = parser.parse_args()
    
    analyzer = NetworkAnalyzer(args.decompiled, args.jadx)
    findings = analyzer.analyze()
    
    with open(args.output, 'w') as f:
        json.dump(findings, f, indent=2)
    
    print(f"\nNetwork Analysis Results:")
    print(f"  URLs found: {len(findings['urls'])}")
    print(f"  Domains found: {len(findings['domains'])}")
    print(f"  IP addresses: {len(findings['ip_addresses'])}")
    print(f"  Suspicious URLs: {len(findings['suspicious_urls'])}")
    print(f"  C2 indicators: {len(findings['c2_indicators'])}")

if __name__ == '__main__':
    main()
