#!/usr/bin/env python3
"""
DEX Payload Hunter
Finds encrypted/hidden DEX payloads in APK files
Predicts runtime unpacking locations for dynamic analysis
"""

import sys
import os
import json
import io
import zipfile
import struct
import math
from pathlib import Path
from collections import defaultdict

try:
    from error_logger import setup_logger
except ImportError:
    class DummyLogger:
        def info(self, msg): pass
        def warning(self, msg): print(f"[WARNING] {msg}", file=sys.stderr)
        def error(self, msg, detail=None): print(f"[ERROR] {msg}", file=sys.stderr)
    def setup_logger(name, log_file=None, verbose=False):
        return DummyLogger()

class DEXPayloadHunter:
    """Hunt for hidden/encrypted DEX payloads in APK"""
    
    def __init__(self, apk_path):
        self.apk_path = Path(apk_path)
        self.logger = setup_logger('dex_payload_hunter')
        
        self.results = {
            'stub_dex_detected': False,
            'encrypted_payloads': [],
            'suspicious_files': [],
            'likely_unpack_locations': [],
            'protection_indicators': [],
            'recommendations': []
        }
    
    def calculate_entropy(self, data):
        """Calculate Shannon entropy of data"""
        if len(data) == 0:
            return 0
        
        freq = defaultdict(int)
        for byte in data:
            freq[byte] += 1
        
        entropy = 0
        for count in freq.values():
            p = count / len(data)
            entropy -= p * math.log2(p)
        
        return entropy
    
    def is_dex_file(self, data):
        """Check if data starts with DEX magic"""
        if len(data) < 8:
            return False
        return data[:4] == b'dex\n'
    
    def is_encrypted_dex(self, data):
        """Detect if data might be encrypted DEX based on patterns"""
        if len(data) < 112:  # DEX header size
            return False
        
        # Check for common encryption markers
        markers = [
            b'ENCRYPTED',
            b'ENCODED', 
            b'PACKED',
            b'DPT',
            b'SHELL',
            b'PROTECTED'
        ]
        
        for marker in markers:
            if marker in data[:200]:  # Check first 200 bytes
                return True
        
        # Check entropy - encrypted data has high entropy
        entropy = self.calculate_entropy(data[:min(10000, len(data))])
        if entropy > 7.5:
            return True
        
        return False
    
    def analyze_stub_dex(self, dex_path, dex_data):
        """Analyze if DEX is a stub/loader"""
        indicators = []
        is_stub = False
        
        # 1. Check size - stubs are usually small
        size = len(dex_data)
        if size < 100 * 1024:  # < 100KB
            indicators.append(f'Small DEX size: {size / 1024:.1f}KB (typical stub)')
            is_stub = True
        
        # 2. Check for DPT/protection strings in DEX
        protection_strings = [
            b'libdpt.so',
            b'JniBridge',
            b'ProxyApplication',
            b'ProxyComponentFactory',
            b'com/jx/shell',
            b'attachBaseContext',
            b'loadDex',
            b'getDexFromNative',
            b'unpack',
            b'decrypt'
        ]
        
        found_strings = []
        for ps in protection_strings:
            if ps in dex_data:
                found_strings.append(ps.decode('utf-8', errors='ignore'))
                is_stub = True
        
        if found_strings:
            indicators.append(f'Protection strings found: {", ".join(found_strings)}')
        
        # 3. Check method/class count (stubs have few methods)
        try:
            # Parse DEX header
            header = struct.unpack('<8sIII', dex_data[0:24])
            # Get method count from header
            method_ids_off = struct.unpack('<I', dex_data[88:92])[0]
            method_ids_size = struct.unpack('<I', dex_data[84:88])[0]
            
            if method_ids_size < 500:
                indicators.append(f'Low method count: {method_ids_size} (typical stub)')
                is_stub = True
        except:
            pass
        
        return is_stub, indicators
    
    def find_encrypted_payloads(self):
        """Find encrypted DEX payloads in APK"""
        payloads = []
        
        try:
            with zipfile.ZipFile(self.apk_path, 'r') as zf:
                for file_info in zf.filelist:
                    filename = file_info.filename
                    
                    # Skip standard files
                    if filename.startswith('META-INF/') or filename.startswith('res/'):
                        continue
                    
                    # Check suspicious locations
                    suspicious_patterns = [
                        'assets/',
                        'lib/',
                        '.dat',
                        '.bin',
                        '.jar',
                        '.dex',
                        '.so',
                        '.odex',
                        '.zip',
                        'classes',
                        'shell',
                        'stub',
                        'encrypted'
                    ]
                    
                    is_suspicious = any(pattern in filename.lower() for pattern in suspicious_patterns)
                    
                    if is_suspicious and file_info.file_size > 1024:  # > 1KB
                        try:
                            data = zf.read(filename)
                            entropy = self.calculate_entropy(data[:min(10000, len(data))])
                            
                            payload_info = {
                                'location': filename,
                                'size': file_info.file_size,
                                'size_kb': file_info.file_size / 1024,
                                'entropy': round(entropy, 2),
                                'compressed': file_info.compress_type != 0,
                                'indicators': []
                            }
                            
                            # Analyze file
                            if self.is_dex_file(data):
                                payload_info['type'] = 'DEX'
                                payload_info['indicators'].append('Valid DEX header')
                            elif self.is_encrypted_dex(data):
                                payload_info['type'] = 'Encrypted DEX (suspected)'
                                payload_info['indicators'].append('Encryption markers or high entropy')
                            elif entropy > 7.5:
                                payload_info['type'] = 'Encrypted data'
                                payload_info['indicators'].append(f'High entropy: {entropy:.2f}')
                            elif entropy > 6.5:
                                payload_info['type'] = 'Compressed/Obfuscated'
                                payload_info['indicators'].append(f'Medium-high entropy: {entropy:.2f}')
                            else:
                                payload_info['type'] = 'Unknown'
                            
                            # Check for specific protection patterns
                            if b'DPT' in data[:1000]:
                                payload_info['indicators'].append('DPT signature detected')
                            if b'BANGCLE' in data[:1000]:
                                payload_info['indicators'].append('Bangcle signature detected')
                            
                            payloads.append(payload_info)
                            
                        except Exception as e:
                            self.logger.error(f'Error analyzing {filename}', str(e))
        
        except Exception as e:
            self.logger.error('Error reading APK', str(e))
        
        return payloads
    
    def extract_strings_from_so(self, data, min_length=4):
        """Extract printable strings from binary data"""
        strings = []
        current_string = []
        
        for byte in data:
            if 32 <= byte < 127:  # Printable ASCII
                current_string.append(chr(byte))
            else:
                if len(current_string) >= min_length:
                    strings.append(''.join(current_string))
                current_string = []
        
        # Don't forget last string
        if len(current_string) >= min_length:
            strings.append(''.join(current_string))
        
        return strings
    
    def analyze_dpt_shell_library(self, zf):
        """Specifically analyze libdpt.so for DPT-shell protection artifacts"""
        dpt_findings = []
        
        # Find libdpt.so in any architecture or assets directory
        libdpt_files = [f for f in zf.filelist if 'libdpt' in f.filename.lower() and f.filename.endswith('.so')]
        
        if not libdpt_files:
            return dpt_findings
        
        for libdpt in libdpt_files:
            try:
                data = zf.read(libdpt.filename)
                
                # Extract all strings from the library
                all_strings = self.extract_strings_from_so(data, min_length=4)
                
                # Enhanced suspicious pattern detection
                found_artifacts = {
                    'zip_files': [],
                    'dex_files': [],
                    'jar_files': [],
                    'dat_files': [],
                    'code_cache_refs': [],
                    'file_paths': [],
                    'encryption_refs': [],
                    'shell_refs': [],
                    'class_loader_refs': []
                }
                
                for string in all_strings:
                    string_lower = string.lower()
                    
                    # CRITICAL: Check for .zip files (encrypted DEX container)
                    if '.zip' in string_lower and len(string) < 100:
                        if len(found_artifacts['zip_files']) < 10:
                            found_artifacts['zip_files'].append(string)
                    
                    # CRITICAL: Check for .dex files
                    if '.dex' in string_lower and len(string) < 100:
                        if len(found_artifacts['dex_files']) < 10:
                            found_artifacts['dex_files'].append(string)
                    
                    # Check for .jar files
                    if '.jar' in string_lower and len(string) < 100:
                        if len(found_artifacts['jar_files']) < 10:
                            found_artifacts['jar_files'].append(string)
                    
                    # Check for .dat files
                    if '.dat' in string_lower and len(string) < 100:
                        if len(found_artifacts['dat_files']) < 10:
                            found_artifacts['dat_files'].append(string)
                    
                    # CRITICAL: Check for code_cache path (where encrypted zip is stored)
                    if 'code_cache' in string_lower:
                        if len(found_artifacts['code_cache_refs']) < 10:
                            found_artifacts['code_cache_refs'].append(string)
                    
                    # Check for file path patterns
                    if any(path in string_lower for path in ['/data/data/', '/files/', '/cache/', '/app_dex/']):
                        if len(found_artifacts['file_paths']) < 10:
                            found_artifacts['file_paths'].append(string)
                    
                    # Check for encryption-related strings
                    if any(keyword in string_lower for keyword in ['encrypt', 'decrypt', 'cipher', 'aes', 'des', 'crypto']):
                        if len(found_artifacts['encryption_refs']) < 10:
                            found_artifacts['encryption_refs'].append(string)
                    
                    # Check for shell/unpack/load related strings
                    if any(keyword in string_lower for keyword in ['shell', 'unpack', 'load', 'jni_', 'proxy', 'wrapper']):
                        if len(found_artifacts['shell_refs']) < 10:
                            found_artifacts['shell_refs'].append(string)
                    
                    # Check for ClassLoader references
                    if any(keyword in string_lower for keyword in ['classloader', 'dexclassloader', 'basedexclassloader', 'pathclassloader']):
                        if len(found_artifacts['class_loader_refs']) < 10:
                            found_artifacts['class_loader_refs'].append(string)
                
                # Remove empty categories
                found_artifacts = {k: v for k, v in found_artifacts.items() if v}
                
                if found_artifacts:
                    dpt_findings.append({
                        'library': libdpt.filename,
                        'finding': '🚨 DPT-Shell Protection Binary [CRITICAL]',
                        'size': libdpt.file_size / 1024,
                        'category': 'DPT-Shell Binary Code',
                        'importance': 'CRITICAL',
                        'artifacts': found_artifacts,
                        'description': 'This is the DPT-Shell protection binary that handles DEX decryption and loading'
                    })
                    
                    self.logger.info(f'🚨 DPT-shell CRITICAL binary detected: {libdpt.filename} with {len(found_artifacts)} artifact types')
            
            except Exception as e:
                self.logger.error(f'Error analyzing {libdpt.filename}', str(e))
        
        return dpt_findings
    
    def analyze_native_libraries(self):
        """Check native libraries for embedded DEX and zip references"""
        lib_findings = []
        
        try:
            with zipfile.ZipFile(self.apk_path, 'r') as zf:
                # First, check specifically for DPT-shell
                dpt_findings = self.analyze_dpt_shell_library(zf)
                if dpt_findings:
                    lib_findings.extend(dpt_findings)
                
                lib_files = [f for f in zf.filelist if f.filename.startswith('lib/') and f.filename.endswith('.so')]
                
                for lib_file in lib_files:
                    try:
                        data = zf.read(lib_file.filename)
                        
                        # Check for embedded DEX
                        dex_offset = data.find(b'dex\n')
                        if dex_offset != -1:
                            lib_findings.append({
                                'library': lib_file.filename,
                                'finding': 'Embedded DEX detected',
                                'offset': dex_offset,
                                'size': lib_file.file_size / 1024
                            })
                        
                        # Check for ZIP file references (DPT-shell stores encrypted zip)
                        zip_patterns = [
                            rb'\.zip',
                            rb'\.jar',
                            rb'\.dat',
                            rb'code_cache',
                            rb'/files/',
                            rb'/app_dex/',
                            rb'encrypted',
                            rb'shell\.zip',
                            rb'dex\.zip',
                            rb'classes\.zip'
                        ]
                        
                        zip_refs = []
                        for pattern in zip_patterns:
                            if pattern in data:
                                # Try to extract readable string around the reference
                                offset = data.find(pattern)
                                # Get 50 bytes before and after for context
                                start = max(0, offset - 50)
                                end = min(len(data), offset + 50)
                                context = data[start:end]
                                # Extract printable string
                                try:
                                    readable = ''.join(chr(b) if 32 <= b < 127 else '.' for b in context)
                                    zip_refs.append({
                                        'pattern': pattern.decode('utf-8', errors='ignore'),
                                        'offset': offset,
                                        'context': readable.strip('.')
                                    })
                                except:
                                    zip_refs.append({
                                        'pattern': pattern.decode('utf-8', errors='ignore'),
                                        'offset': offset
                                    })
                        
                        if zip_refs:
                            lib_findings.append({
                                'library': lib_file.filename,
                                'finding': 'ZIP/encrypted file references found',
                                'size': lib_file.file_size / 1024,
                                'references': zip_refs[:5]  # Limit to 5 references
                            })
                        
                        # Check for protection library patterns
                        protection_libs = {
                            'libdpt': 'DPT-Shell',
                            'libjiagu': 'Qihoo 360',
                            'libbangcle': 'Bangcle',
                            'libprotect': 'DexProtector',
                            'libsecexe': 'SecNeo',
                            'libshell': 'Generic Shell'
                        }
                        
                        lib_name = lib_file.filename.lower()
                        for pattern, protector in protection_libs.items():
                            if pattern in lib_name:
                                lib_findings.append({
                                    'library': lib_file.filename,
                                    'finding': f'Protection library: {protector}',
                                    'size': lib_file.file_size / 1024
                                })
                    
                    except Exception as e:
                        self.logger.error(f'Error analyzing {lib_file.filename}', str(e))
        
        except Exception as e:
            self.logger.error('Error analyzing native libraries', str(e))
        
        return lib_findings
    
    def find_container_payloads(self, zf):
        """Find payloads hidden inside containers: ZIPs in assets, ZIPs inside .so files,
        and extensionless/long-named high-entropy assets."""
        found = {'zip_assets': [], 'embedded_in_so': [], 'suspicious_assets': []}

        for info in zf.filelist:
            name = info.filename
            try:
                if name.startswith('assets/'):
                    data = zf.read(name)
                    if data[:2] == b'PK':
                        try:
                            with zipfile.ZipFile(io.BytesIO(data)) as inner:
                                embedded = [f.filename for f in inner.filelist]
                            found['zip_assets'].append({
                                'location': name,
                                'size': len(data),
                                'embedded_files': embedded,
                                'contains_dex': any('.dex' in f.lower() for f in embedded),
                            })
                        except zipfile.BadZipFile:
                            # PK magic but unreadable: usually an encrypted container
                            found['suspicious_assets'].append({
                                'location': name,
                                'size': len(data),
                                'reason': 'PK signature but not a valid ZIP (likely encrypted)',
                            })
                    else:
                        base = Path(name).name
                        if '.' not in base or len(base) > 20:
                            entropy = self.calculate_entropy(data[:min(1024, len(data))])
                            if entropy > 7.0:
                                found['suspicious_assets'].append({
                                    'location': name,
                                    'size': len(data),
                                    'entropy': round(entropy, 2),
                                    'reason': 'Extensionless/long-named asset with high entropy',
                                })

                elif name.endswith('.so'):
                    data = zf.read(name)
                    offset = data.find(b'PK\x03\x04')
                    while offset != -1:
                        end = data.find(b'PK\x05\x06', offset)
                        if end != -1:
                            blob = data[offset:end + 22]  # 22 = end-of-central-directory size
                            try:
                                with zipfile.ZipFile(io.BytesIO(blob)) as inner:
                                    embedded = [f.filename for f in inner.filelist]
                                found['embedded_in_so'].append({
                                    'location': name,
                                    'offset': offset,
                                    'size': len(blob),
                                    'embedded_files': embedded,
                                    'contains_dex': any('.dex' in f.lower() for f in embedded),
                                })
                            except zipfile.BadZipFile:
                                pass
                        offset = data.find(b'PK\x03\x04', offset + 1)
            except Exception as e:
                self.logger.error(f'Error scanning container {name}', str(e))

        return found

    def locate_target(self, zf, target):
        """Locate the APK source of a runtime payload filename (e.g. the encrypted zip a
        shell writes to code_cache). Returns native references and candidate entries."""
        result = {'target': target, 'referenced_in': [], 'candidates': []}
        target_bytes = target.encode()

        for info in zf.filelist:
            if info.filename.endswith('.so'):
                try:
                    data = zf.read(info.filename)
                except Exception:
                    continue
                if target_bytes in data:
                    result['referenced_in'].append({'so_file': info.filename,
                                                    'offset': data.find(target_bytes)})

        # A name referenced only from native code is written at runtime, so its encrypted
        # source is usually a large, oddly named asset.
        if result['referenced_in']:
            for info in zf.filelist:
                base = Path(info.filename).name
                if not (info.filename.startswith('assets/') and info.file_size > 1_000_000 and base):
                    continue
                odd_name = ('.' not in base
                            or base.count(base[0]) > len(base) // 2
                            or not any(c.isalnum() and c.islower() for c in base))
                if odd_name:
                    data = zf.read(info.filename)
                    entropy = self.calculate_entropy(data[:min(4096, len(data))])
                    result['candidates'].append({
                        'location': info.filename,
                        'size': info.file_size,
                        'entropy': round(entropy, 2),
                        'likely_encrypted': entropy > 5.0,
                        'match': 'runtime-name source candidate',
                    })

        target_base = target.replace('.zip', '').replace('.jar', '').replace('.dat', '')
        for info in zf.filelist:
            if target_base.lower() in info.filename.lower():
                result['candidates'].append({
                    'location': info.filename,
                    'size': info.file_size,
                    'match': 'exact' if info.filename.endswith(target) else 'name contains target',
                })

        return result

    def extract_entry(self, location, output_path):
        """Write one APK entry to output_path. Returns True on success."""
        try:
            with zipfile.ZipFile(self.apk_path, 'r') as zf:
                data = zf.read(location)
            with open(output_path, 'wb') as f:
                f.write(data)
            return True
        except Exception as e:
            self.logger.error(f'Error extracting {location}', str(e))
            return False

    def predict_unpack_locations(self, package_name='<package>'):
        """Predict where DEX will be unpacked at runtime"""
        locations = [
            {
                'path': f'/data/data/{package_name}/code_cache/',
                'description': 'Code cache directory (DPT-shell stores encrypted zip here)',
                'priority': 'HIGH'
            },
            {
                'path': f'/data/data/{package_name}/app_dex/',
                'description': 'Common DEX cache directory',
                'priority': 'HIGH'
            },
            {
                'path': f'/data/data/{package_name}/files/',
                'description': 'App files directory',
                'priority': 'HIGH'
            },
            {
                'path': f'/data/data/{package_name}/cache/',
                'description': 'App cache directory',
                'priority': 'MEDIUM'
            },
            {
                'path': f'/data/data/{package_name}/lib/',
                'description': 'Native libraries directory',
                'priority': 'MEDIUM'
            },
            {
                'path': f'/data/data/{package_name}/app_xxx/',
                'description': 'Custom app directory (xxx = variant name)',
                'priority': 'HIGH'
            },
            {
                'path': f'/data/data/{package_name}/databases/',
                'description': 'Sometimes used for hidden storage',
                'priority': 'LOW'
            },
            {
                'path': f'/sdcard/Android/data/{package_name}/',
                'description': 'External storage (less common)',
                'priority': 'LOW'
            },
            {
                'path': '/data/local/tmp/',
                'description': 'Temporary directory (requires root)',
                'priority': 'LOW'
            }
        ]
        
        return locations
    
    def analyze(self, package_name=None, target=None):
        """Perform complete payload hunting analysis"""
        
        self.logger.info(f'Analyzing APK: {self.apk_path.name}')
        
        # 1. Check main DEX files
        try:
            with zipfile.ZipFile(self.apk_path, 'r') as zf:
                dex_files = [f for f in zf.filelist if f.filename.startswith('classes') and f.filename.endswith('.dex')]
                
                for dex_file in dex_files:
                    data = zf.read(dex_file.filename)
                    is_stub, indicators = self.analyze_stub_dex(dex_file.filename, data)
                    
                    if is_stub:
                        self.results['stub_dex_detected'] = True
                        self.results['protection_indicators'].append({
                            'file': dex_file.filename,
                            'type': 'Stub DEX',
                            'indicators': indicators
                        })
        
        except Exception as e:
            self.logger.error('Error analyzing DEX files', str(e))
        
        # 2. Find encrypted payloads
        self.results['encrypted_payloads'] = self.find_encrypted_payloads()

        # 2b. Payloads hidden inside containers, and the source of a named runtime payload
        try:
            with zipfile.ZipFile(self.apk_path, 'r') as zf:
                self.results['container_payloads'] = self.find_container_payloads(zf)
                if target:
                    self.results['target_search'] = self.locate_target(zf, target)
        except Exception as e:
            self.logger.error('Error scanning containers', str(e))

        # 3. Analyze native libraries
        lib_findings = self.analyze_native_libraries()
        if lib_findings:
            self.results['suspicious_files'].extend(lib_findings)
        
        # 4. Predict unpack locations
        self.results['likely_unpack_locations'] = self.predict_unpack_locations(package_name or '<package>')
        
        # 5. Generate recommendations
        self.generate_recommendations()
        
        return self.results
    
    def generate_recommendations(self):
        """Generate recommendations based on findings"""
        recs = []
        
        if self.results['stub_dex_detected']:
            recs.append({
                'priority': 'HIGH',
                'action': 'Dynamic Analysis Required',
                'details': 'Stub DEX detected - real DEX is encrypted/hidden and will be unpacked at runtime'
            })
            
            recs.append({
                'priority': 'HIGH',
                'action': 'Monitor Runtime Unpacking',
                'details': 'Use Frida hooks to intercept DexFile.loadDex, DexClassLoader, and file writes'
            })
        
        if self.results['encrypted_payloads']:
            high_entropy = [p for p in self.results['encrypted_payloads'] if p.get('entropy', 0) > 7.5]
            if high_entropy:
                recs.append({
                    'priority': 'HIGH',
                    'action': 'Extract Encrypted Payloads',
                    'details': f'Found {len(high_entropy)} high-entropy files that may contain encrypted DEX'
                })
        
        if self.results['suspicious_files']:
            # Check if DPT-shell was detected
            dpt_detected = any('DPT-Shell' in f.get('finding', '') for f in self.results['suspicious_files'])
            
            if dpt_detected:
                recs.append({
                    'priority': 'HIGH',
                    'action': 'DPT-Shell Protection Detected',
                    'details': 'libdpt.so found with suspicious strings - check artifacts for encrypted zip filename and paths'
                })
            
            recs.append({
                'priority': 'MEDIUM',
                'action': 'Analyze Native Libraries',
                'details': 'Protection libraries detected - analyze for DEX loading mechanisms'
            })
        
        recs.append({
            'priority': 'HIGH',
            'action': 'Setup Runtime Monitoring',
            'details': 'Monitor predicted unpack locations during app execution'
        })
        
        recs.append({
            'priority': 'MEDIUM',
            'action': 'Use Frida DEX Dumper',
            'details': 'Run scripts/frida/frida_dex_dump.js to capture unpacked DEX from memory'
        })
        
        self.results['recommendations'] = recs

def main():
    import argparse
    
    parser = argparse.ArgumentParser(description='Hunt for encrypted DEX payloads in APK')
    parser.add_argument('apk_path', help='Path to APK file')
    parser.add_argument('output_json', help='Output JSON file')
    parser.add_argument('package_name', nargs='?', default=None, help='Package name')
    parser.add_argument('--brief', action='store_true', help='Brief console output')
    parser.add_argument('--target', '-t',
                        help='Runtime payload filename to locate in the APK (e.g. i11111i111.zip)')
    parser.add_argument('--extract', '-e',
                        help='With --target: write the first candidate entry to this path')

    args = parser.parse_args()

    hunter = DEXPayloadHunter(args.apk_path)
    results = hunter.analyze(args.package_name, target=args.target)

    if args.extract:
        candidates = results.get('target_search', {}).get('candidates', [])
        if not candidates:
            print('No --target candidate to extract', file=sys.stderr)
        elif hunter.extract_entry(candidates[0]['location'], args.extract):
            print(f"Extracted {candidates[0]['location']} -> {args.extract}", file=sys.stderr)

    # Save results
    with open(args.output_json, 'w') as f:
        json.dump(results, f, indent=2)
    
    # Print summary (brief or detailed)
    if args.brief:
        # Brief output - just key findings
        if results['stub_dex_detected']:
            print("⚠️  Stub DEX detected - real DEX is hidden", file=sys.stderr)
        if results['encrypted_payloads']:
            print(f"🔒 Found {len(results['encrypted_payloads'])} encrypted payload(s)", file=sys.stderr)
        if results['suspicious_files']:
            so_with_refs = [f for f in results['suspicious_files'] if 'references' in f]
            if so_with_refs:
                print(f"🔍 Found {len(so_with_refs)} .so file(s) with zip references", file=sys.stderr)
        containers = results.get('container_payloads', {})
        hidden_dex = [c for k in ('zip_assets', 'embedded_in_so')
                      for c in containers.get(k, []) if c.get('contains_dex')]
        if hidden_dex:
            print(f"📦 Found {len(hidden_dex)} container(s) holding DEX", file=sys.stderr)
    else:
        # Detailed output
        print(f"\n{'='*60}")
        print(f"DEX PAYLOAD HUNTER RESULTS")
        print(f"{'='*60}")
        print(f"APK: {Path(args.apk_path).name}\n")
        
        if results['stub_dex_detected']:
            print("⚠️  STUB DEX DETECTED - Real DEX is hidden!")
            for indicator in results['protection_indicators']:
                print(f"\n📦 {indicator['file']}:")
                for ind in indicator['indicators']:
                    print(f"   • {ind}")
        
        if results['encrypted_payloads']:
            print(f"\n🔒 ENCRYPTED PAYLOADS FOUND: {len(results['encrypted_payloads'])}")
            for payload in results['encrypted_payloads'][:5]:  # Show first 5
                print(f"\n   📄 {payload['location']}")
                print(f"      Type: {payload['type']}")
                print(f"      Size: {payload['size_kb']:.1f} KB")
                print(f"      Entropy: {payload['entropy']}")
                for ind in payload['indicators']:
                    print(f"      • {ind}")
        
        if results['suspicious_files']:
            print(f"\n🔍 SUSPICIOUS FILES: {len(results['suspicious_files'])}")
            for sf in results['suspicious_files']:
                # Highlight DPT-Shell binaries differently
                if sf.get('category') == 'DPT-Shell Binary Code':
                    print(f"\n   {sf['finding']}")
                    print(f"   📂 Location: {sf['library']}")
                    print(f"   📏 Size: {sf['size']:.2f} KB")
                    print(f"   ⚠️  Importance: {sf.get('importance', 'HIGH')}")
                    if sf.get('description'):
                        print(f"   📝 {sf['description']}")
                else:
                    print(f"   • {sf['library']}: {sf['finding']}")
                
                # Show DPT-shell specific artifacts
                if 'artifacts' in sf:
                    print(f"      📋 Artifacts Extracted:")
                    artifacts = sf['artifacts']
                    
                    # CRITICAL: Show .dex files first
                    if 'dex_files' in artifacts:
                        print(f"         🎯 DEX files ({len(artifacts['dex_files'])} found):")
                        for item in artifacts['dex_files'][:5]:
                            print(f"            - {item}")
                    
                    # CRITICAL: Show .zip files
                    if 'zip_files' in artifacts:
                        print(f"         🔒 ZIP files ({len(artifacts['zip_files'])} found):")
                        for item in artifacts['zip_files'][:5]:
                            print(f"            - {item}")
                    
                    # Show .jar files
                    if 'jar_files' in artifacts:
                        print(f"         📦 JAR files ({len(artifacts['jar_files'])} found):")
                        for item in artifacts['jar_files'][:3]:
                            print(f"            - {item}")
                    
                    # Show .dat files
                    if 'dat_files' in artifacts:
                        print(f"         📄 DAT files ({len(artifacts['dat_files'])} found):")
                        for item in artifacts['dat_files'][:3]:
                            print(f"            - {item}")
                    
                    # CRITICAL: Show code_cache references
                    if 'code_cache_refs' in artifacts:
                        print(f"         📁 Code cache references:")
                        for item in artifacts['code_cache_refs'][:3]:
                            print(f"            - {item}")
                    
                    # Show file paths
                    if 'file_paths' in artifacts:
                        print(f"         📂 File paths ({len(artifacts['file_paths'])} found):")
                        for item in artifacts['file_paths'][:3]:
                            print(f"            - {item}")
                    
                    # Show encryption references
                    if 'encryption_refs' in artifacts:
                        print(f"         🔐 Encryption references:")
                        for item in artifacts['encryption_refs'][:3]:
                            print(f"            - {item}")
                    
                    # Show shell references
                    if 'shell_refs' in artifacts:
                        print(f"         🐚 Shell references ({len(artifacts['shell_refs'])} found):")
                        for item in artifacts['shell_refs'][:3]:
                            print(f"            - {item}")
                    
                    # Show ClassLoader references
                    if 'class_loader_refs' in artifacts:
                        print(f"         🔧 ClassLoader references:")
                        for item in artifacts['class_loader_refs'][:3]:
                            print(f"            - {item}")
                
                # Show general zip references (for non-DPT files)
                elif 'references' in sf:
                    for ref in sf['references'][:3]:  # Show first 3
                        print(f"      - {ref.get('pattern', 'N/A')} at offset {ref.get('offset', 0)}")
                        if 'context' in ref:
                            print(f"        Context: {ref['context'][:50]}")
        
        print(f"\n📍 PREDICTED UNPACK LOCATIONS:")
        for loc in results['likely_unpack_locations']:
            if loc['priority'] == 'HIGH':
                print(f"   🔴 {loc['path']}")
                print(f"      {loc['description']}")
        
        print(f"\n💡 RECOMMENDATIONS:")
        for rec in results['recommendations']:
            priority_icon = '🔴' if rec['priority'] == 'HIGH' else '🟡'
            print(f"   {priority_icon} {rec['action']}")
            print(f"      {rec['details']}")
        
        print(f"\n{'='*60}\n")

if __name__ == '__main__':
    main()
