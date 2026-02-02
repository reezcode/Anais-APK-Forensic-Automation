#!/usr/bin/env python3
"""
Obfuscation Detection Module
Detects various obfuscation and protection mechanisms in Android APKs
including ProGuard, R8, DPT-Shell, DexProtector, Bangcle, etc.
Integrates with APKiD for enhanced detection.
"""

import sys
import os
import json
import re
import subprocess
from pathlib import Path
from collections import Counter

# Import error logger
try:
    from error_logger import setup_logger
except ImportError:
    # Fallback if error_logger not available
    class DummyLogger:
        def info(self, msg): pass
        def warning(self, msg): print(f"[WARNING] {msg}", file=sys.stderr)
        def error(self, msg, detail=None): print(f"[ERROR] {msg}", file=sys.stderr)
        def exception(self, msg, exc_info=True): print(f"[ERROR] {msg}", file=sys.stderr)
    
    def setup_logger(name, log_file=None, verbose=False):
        return DummyLogger()

class ObfuscationDetector:
    def __init__(self, decompiled_dir, jadx_dir, apk_path=None):
        self.decompiled_dir = Path(decompiled_dir) if decompiled_dir else None
        self.jadx_dir = Path(jadx_dir) if jadx_dir else None
        self.apk_path = apk_path
        self.logger = setup_logger('detect_obfuscation')
        
        self.results = {
            'type': 'none',
            'confidence': 0,
            'indicators': [],
            'protection_details': {},
            'apkid_results': {},
            'recommendations': []
        }
    
    def check_dex_files(self):
        """Check DEX files for protection shells"""
        indicators = []
        
        if not self.decompiled_dir:
            return indicators
        
        # Look for shell DEX files
        dex_files = list(self.decompiled_dir.rglob('*.dex'))
        
        # Check for abnormal DEX structure
        for dex_file in dex_files:
            try:
                with open(dex_file, 'rb') as f:
                    header = f.read(112)  # DEX header is 112 bytes
                    
                    # Check magic
                    if header[:4] != b'dex\n':
                        indicators.append(f'Invalid DEX magic in {dex_file.name}')
                    
                    # Check for encryption markers
                    if b'DPT' in header or b'dpt' in header:
                        indicators.append('DPT-Shell signature detected')
                        self.results['type'] = 'dpt-shell'
                        self.results['confidence'] = 90
                    
                    if b'BANGCLE' in header or b'bangcle' in header:
                        indicators.append('Bangcle signature detected')
                        self.results['type'] = 'bangcle'
                        self.results['confidence'] = 90
                        
            except Exception as e:
                indicators.append(f'Error reading {dex_file.name}: {e}')
        
        return indicators
    
    def check_native_libs(self):
        """Check for native protection libraries"""
        indicators = []
        
        if not self.decompiled_dir:
            return indicators
        
        lib_dir = self.decompiled_dir / 'lib'
        if lib_dir.exists():
            so_files = list(lib_dir.rglob('*.so'))
            
            # Known protection library names
            protection_libs = {
                'libdpt': 'DPT-Shell',
                'libexec': 'DexProtector',
                'libprotect': 'DexProtector',
                'libjiagu': 'Qihoo 360',
                'libbangcle': 'Bangcle',
                'libsecexe': 'SecNeo',
                'libshell': 'Generic Shell',
                'libmobisec': 'MobiSec',
                'libnqshield': 'NetQin',
                'libprotection': 'Generic Protection',
                'libapp': 'App Encryption',
                'libjiag': 'Qihoo 360',
                'libddog': 'Ijiami',
                'libAPKProtect': 'APK Protect',
                'libexecmain': 'Execmain Protection',
                'libtosprotection': 'Tencent Protection',
                'libshella': 'Shell Variant A',
                'libfake': 'Fake Dex Protection',
            }
            
            for so_file in so_files:
                name = so_file.name.lower()
                for lib_pattern, protector in protection_libs.items():
                    if lib_pattern in name:
                        indicators.append(f'Protection library detected: {so_file.name} ({protector})')  
                        # Use most specific match
                        if 'dpt' in lib_pattern:
                            self.results['type'] = 'dpt-shell'
                        elif self.results['type'] == 'none':
                            self.results['type'] = protector.lower().replace(' ', '-')
                        self.results['confidence'] = max(self.results['confidence'], 90)
        
        return indicators
    
    def check_manifest_indicators(self):
        """Check AndroidManifest for protection indicators"""
        indicators = []
        
        if not self.decompiled_dir:
            return indicators
        
        manifest = self.decompiled_dir / 'AndroidManifest.xml'
        if manifest.exists():
            try:
                content = manifest.read_text(errors='ignore')
                
                # Check for known protection application classes
                protection_apps = {
                    'com.jx.shell': 'DPT-Shell (jx.shell)',
                    'com.jx': 'DPT-Shell variant',
                    'JniBridge': 'JNI Bridge Protection (DPT)',
                    'ProxyApplication': 'Proxy Application Shell (DPT)',
                    'ProxyComponentFactory': 'Proxy Component Shell (DPT)',
                    'com.secneo.apkwrapper': 'SecNeo',
                    'com.bangcle.app': 'Bangcle',
                    'com.qihoo.util': 'Qihoo 360',
                    'com.shell.NativeApplication': 'Generic Shell',
                    's.h.e.l.l': 'Obfuscated Shell',
                    'com.stub.StubApp': 'Stub Application Shell',
                    'com.wrapper.': 'Wrapper Shell',
                    'StubApplication': 'Stub Shell',
                    'com.metaapp': 'Meta Application Shell',
                    'com.ali.mobisecenhance': 'Alibaba MobiSec',
                    'com.tencent.StubShell': 'Tencent Shell',
                    'com.baidu.protect': 'Baidu Protect',
                    'com.qihoo360.repacker': 'Qihoo 360 Packer',
                    'net.lingala.zip4j': 'Zip4j Encryption',
                    'DPTApplication': 'DPT Shell',
                    'com.dpt.': 'DPT Protection',
                }
                
                for pattern, protector in protection_apps.items():
                    if pattern in content:
                        indicators.append(f'Protection application class: {pattern} ({protector})')
                        # Specific handling for jx.shell/DPT variants
                        if any(x in pattern.lower() for x in ['jx', 'dpt', 'jnibridge', 'proxy']):
                            self.results['type'] = 'dpt-shell'
                            self.results['confidence'] = 98
                            self.results['protection_details']['shell_type'] = protector
                        elif self.results['type'] == 'none' or self.results['confidence'] < 80:
                            self.results['type'] = protector.lower().replace(' ', '-').replace('(', '').replace(')', '')
                            self.results['confidence'] = 85
                        
            except Exception as e:
                indicators.append(f'Error reading manifest: {e}')
        
        return indicators
    
    def check_proguard_r8(self):
        """Detect ProGuard/R8 obfuscation"""
        indicators = []
        
        if not self.jadx_dir or not self.jadx_dir.exists():
            return indicators
        
        # Sample Java files to check
        java_files = list(self.jadx_dir.rglob('*.java'))[:50]  # Check first 50
        
        if not java_files:
            return indicators
        
        # Indicators of ProGuard/R8
        obfuscated_patterns = {
            'short_class_names': 0,  # Classes with single letter names
            'short_method_names': 0,  # Methods like a(), b(), c()
            'short_field_names': 0,   # Fields like a, b, c
            'package_flattening': 0,  # All classes in root package
        }
        
        for java_file in java_files:
            try:
                content = java_file.read_text(errors='ignore')
                
                # Check for short class names (a.java, b.java, etc.)
                if len(java_file.stem) <= 2 and java_file.stem.isalpha():
                    obfuscated_patterns['short_class_names'] += 1
                
                # Check for short method names
                short_methods = re.findall(r'\s+[a-z]\s*\([^)]*\)\s*{', content)
                obfuscated_patterns['short_method_names'] += len(short_methods)
                
                # Check for short field names
                short_fields = re.findall(r'^\s+(private|public|protected)?\s+\w+\s+[a-z];', content, re.MULTILINE)
                obfuscated_patterns['short_field_names'] += len(short_fields)
                
                # Check package structure
                package_match = re.search(r'package\s+([\w.]+);', content)
                if package_match:
                    package = package_match.group(1)
                    # If package has no dots, it's likely flattened
                    if '.' not in package or len(package) <= 3:
                        obfuscated_patterns['package_flattening'] += 1
                        
            except Exception as e:
                continue
        
        # Determine if ProGuard/R8 is used
        total_indicators = sum(obfuscated_patterns.values())
        
        if obfuscated_patterns['short_class_names'] > 10 or total_indicators > 30:
            indicators.append('ProGuard/R8 obfuscation detected')
            indicators.append(f"  - Short class names: {obfuscated_patterns['short_class_names']}")
            indicators.append(f"  - Short method names: {obfuscated_patterns['short_method_names']}")
            indicators.append(f"  - Short field names: {obfuscated_patterns['short_field_names']}")
            
            if self.results['type'] == 'none':
                self.results['type'] = 'proguard'
                self.results['confidence'] = min(70 + (total_indicators // 10), 95)
        
        return indicators
    
    def check_dpt_jx_shell_sources(self):
        """Check Java sources for DPT/jx.shell specific patterns"""
        indicators = []
        
        if not self.jadx_dir or not self.jadx_dir.exists():
            return indicators
        
        # Look for jx.shell specific files
        jx_shell_patterns = [
            '**/jx/shell/*.java',
            '**/com/jx/**/*.java',
            '**/JniBridge.java',
            '**/ProxyApplication.java',
            '**/ProxyComponentFactory.java',
            '**/DPTApplication.java',
        ]
        
        found_files = []
        for pattern in jx_shell_patterns:
            found_files.extend(self.jadx_dir.glob(pattern))
        
        if found_files:
            indicators.append(f'DPT-Shell/jx.shell source files detected: {len(found_files)} files')
            for f in found_files[:10]:  # Show first 10
                indicators.append(f'  - {f.relative_to(self.jadx_dir)}')
            
            self.results['type'] = 'dpt-shell'
            self.results['confidence'] = 99
            self.results['protection_details']['detected_files'] = [str(f.relative_to(self.jadx_dir)) for f in found_files]
            return indicators
        
        # Check for DPT-shell code patterns in any Java file
        java_files = list(self.jadx_dir.rglob('*.java'))[:200]  # Increased to check more files
        
        dpt_patterns = {
            r'libdpt\.so': 'DPT native library',
            r'JniBridge\b': 'JNI Bridge class',
            r'ProxyApplication': 'Proxy Application',
            r'ProxyComponentFactory': 'Proxy Component Factory',
            r'com\.jx\.shell': 'jx.shell package',
            r'attachBaseContext.*native': 'Native context attach',
            r'System\.load.*libdpt': 'DPT library loading',
            r'\.dex.*decrypt': 'DEX decryption',
            r'\.dex.*unpack': 'DEX unpacking',
            r'loadDex.*native': 'Native DEX loading',
            r'getDexFromNative': 'Get DEX from native',
            r'attachBaseContext.*classloader': 'Classloader manipulation',
        }
        
        matches = 0
        matched_files = []
        pattern_matches = Counter()
        
        for java_file in java_files:
            try:
                content = java_file.read_text(errors='ignore')
                
                for pattern, desc in dpt_patterns.items():
                    if re.search(pattern, content, re.IGNORECASE):
                        matches += 1
                        pattern_matches[desc] += 1
                        if java_file not in matched_files:
                            matched_files.append(java_file)
                        
            except Exception:
                continue
        
        if matches > 2:  # Lowered threshold for better detection
            indicators.append(f'DPT-Shell code patterns detected ({matches} matches in {len(matched_files)} files)')
            for desc, count in pattern_matches.most_common(5):
                indicators.append(f'  - {desc}: {count} occurrence(s)')
            self.results['type'] = 'dpt-shell'
            self.results['confidence'] = max(self.results['confidence'], min(70 + matches * 5, 95))
            self.results['protection_details']['pattern_matches'] = dict(pattern_matches)
        
        return indicators
    
    def run_apkid(self):
        """Run APKiD for advanced obfuscation detection"""
        indicators = []
        
        if not self.apk_path or not Path(self.apk_path).exists():
            return indicators
        
        try:
            # Get the directory where this script is located
            script_dir = Path(__file__).parent.parent
            apkid_dir = script_dir / 'apkid'
            
            # Check if APKiD is available
            if self.logger.info('APKiD not found, skipping enhanced detection'):
                indicators.append('APKiD not found, skipping enhanced detection')
                return indicators
            
            # Run APKiD with JSON output
            cmd = [
                sys.executable, '-m', 'apkid.main',
                '--json',
                '--timeout', '60',
                str(self.apk_path)
            ]
            
            # Set PYTHONPATH to include apkid directory
            env = os.environ.copy()
            env['PYTHONPATH'] = str(script_dir) + ':' + env.get('PYTHONPATH', '')
            
            result = subprocess.run(
                cmd,
                capture_output=True,
                text=True,
                timeout=70,
                env=env,
                cwd=str(script_dir)
            )
            
            if result.returncode == 0 and result.stdout:
                apkid_data = json.loads(result.stdout)
                self.results['apkid_results'] = apkid_data
                
                # Parse APKiD results
                apk_name = Path(self.apk_path).name
                if apk_name in apkid_data:
                    apk_data = apkid_data[apk_name]
                    
                    # Check for compilers
                    if 'compiler' in apk_data:
                        for compiler_info in apk_data['compiler']:
                            indicators.append(f'APKiD - Compiler: {compiler_info}')
                    
                    # Check for obfuscators
                    if 'obfuscator' in apk_data:
                        for obf_info in apk_data['obfuscator']:
                            indicators.append(f'APKiD - Obfuscator: {obf_info}')
                            if 'dpt' in obf_info.lower() or 'jx' in obf_info.lower():
                                self.results['type'] = 'dpt-shell'
                                self.results['confidence'] = 95
                    
                    # Check for packers
                    if 'packer' in apk_data:
                        for packer_info in apk_data['packer']:
                            indicators.append(f'APKiD - Packer: {packer_info}')
                            if self.results['type'] == 'none':
                                self.results['type'] = 'packed'
                                self.results['confidence'] = 85
                    
                    # Check for protectors
                    if 'protector' in apk_data:
                        for prot_info in apk_data['protector']:
                            indicators.append(f'APKiD - Protector: {prot_info}')
                            if 'dpt' in prot_info.lower():
                                self.results['type'] = 'dpt-shell'
                                self.results['confidence'] = 95
                    
                    # Check for anti-VM
                    if 'anti_vm' in apk_data:
                        for antivm_info in apk_data['anti_vm']:
                            indicators.append(f'APKiD - Anti-VM: {antivm_info}')
                    
                    # Check for abnormal features
                    if 'abnormal' in apk_data:
                        for abnormal_info in apk_data['abnormal']:
                            indicators.append(f'APKiD - Abnormal: {abnormal_info}')
            else:
                if result.stderr:
                    self.logger.warning(f'APKiD warning: {result.stderr[:200]}')
                    
        except subprocess.TimeoutExpired:
            self.logger.warning('APKiD scan timed out')
            indicators.append('APKiD scan timed out')
        except json.JSONDecodeError as e:
            self.logger.error('APKiD output parse error', str(e))
        except Exception as e:
            self.logger.exception('APKiD scan error')
            indicators.append('APKiD scan error (check logs)')
            indicators.append(f'APKiD scan error: {e}')
        
        return indicators
    
    def check_additional_obfuscation(self):
        """Check for additional obfuscation techniques"""
        indicators = []
        
        if not self.jadx_dir or not self.jadx_dir.exists():
            return indicators
        
        java_files = list(self.jadx_dir.rglob('*.java'))[:100]
        
        obf_patterns = {
            'control_flow': {
                'pattern': r'(goto|switch|if.*goto)',
                'desc': 'Control flow obfuscation',
                'count': 0
            },
            'reflection': {
                'pattern': r'(Class\.forName|getDeclaredMethod|getDeclaredField|invoke)',
                'desc': 'Reflection-based obfuscation',
                'count': 0
            },
            'dynamic_loading': {
                'pattern': r'(DexClassLoader|PathClassLoader|loadDex|loadClass)',
                'desc': 'Dynamic class loading',
                'count': 0
            },
            'native_methods': {
                'pattern': r'native\s+\w+',
                'desc': 'Native method usage',
                'count': 0
            },
            'string_concat': {
                'pattern': r'new\s+StringBuilder.*append',
                'desc': 'String concatenation obfuscation',
                'count': 0
            },
        }
        
        for java_file in java_files:
            try:
                content = java_file.read_text(errors='ignore')
                
                for key, info in obf_patterns.items():
                    matches = re.findall(info['pattern'], content, re.IGNORECASE)
                    info['count'] += len(matches)
                    
            except Exception:
                continue
        
        # Report findings
        for key, info in obf_patterns.items():
            if info['count'] > 20:  # Threshold for significance
                indicators.append(f"{info['desc']} detected ({info['count']} occurrences)")
                self.results['protection_details'][key] = info['count']
        
        return indicators
    
    def check_string_encryption(self):
        """Detect string encryption"""
        indicators = []
        
        if not self.jadx_dir or not self.jadx_dir.exists():
            return indicators
        
        java_files = list(self.jadx_dir.rglob('*.java'))[:30]
        
        encrypted_string_patterns = [
            r'decrypt\s*\(',
            r'deobfuscate\s*\(',
            r'base64\s*\(',
            r'cipher\.doFinal',
            r'Cipher\.getInstance',
            r'SecretKeySpec',
        ]
        
        matches = 0
        for java_file in java_files:
            try:
                content = java_file.read_text(errors='ignore')
                
                for pattern in encrypted_string_patterns:
                    if re.search(pattern, content, re.IGNORECASE):
                        matches += 1
                        
            except Exception:
                continue
        
        if matches > 5:
            indicators.append(f'String encryption detected ({matches} indicators)')
            self.results['protection_details']['string_encryption'] = True
        
        return indicators
    
    def generate_recommendations(self):
        """Generate recommendations based on detected protection"""
        
        if self.results['type'] in ['dpt-shell', 'dpt-shell-jx.shell', 'dexprotector', 'bangcle', 'qihoo-360', 'generic-shell', 'ijiami', 'secneo']:
            self.results['recommendations'] = [
                'DYNAMIC ANALYSIS REQUIRED - NATIVE PROTECTION DETECTED',
                '1. Install APK on rooted Android device or emulator (Android 7-10 recommended)',
                '2. Use Frida with frida-dexdump or similar tool',
                '3. Run the application to trigger DEX unpacking',
                '4. Dump decrypted DEX from memory:',
                '   - frida-dexdump -U -f <package_name>',
                '   - Or use frida -U -f <package_name> -l scripts/frida/frida_dex_dump.js',
                '5. Analyze dumped DEX files with JADX/APKTool',
                '6. Alternative: Use FART, DexHunter, or ZjDroid',
                '7. Monitor native library loading with Frida hooks',
                '8. Consider using Android Hooking/Instrumentation for API monitoring',
                '',
                'SPECIFIC TOOLS FOR THIS PROTECTION:',
            ]
            
            if self.results['type'] == 'dpt-shell':
                self.results['recommendations'].extend([
                    '- DPT-Shell unpacker tools',
                    '- Frida script: scripts/frida/frida_dex_dump.js (included)',
                    '- FRIDA command: frida -U -f com.package.name -l scripts/frida/frida_dex_dump.js --no-pause',
                    '- Monitor JniBridge and libdpt.so loading',
                    '- Hook ProxyApplication.attachBaseContext()',
                ])
            elif 'bangcle' in self.results['type']:
                self.results['recommendations'].extend([
                    '- Bangcle unpacker',
                    '- ZjDroid for Bangcle',
                ])
            elif 'qihoo' in self.results['type']:
                self.results['recommendations'].extend([
                    '- Qihoo 360 unpacker',
                    '- FART for Qihoo protection',
                ])
                
        elif self.results['type'] in ['proguard', 'r8']:
            self.results['recommendations'] = [
                'STATIC ANALYSIS POSSIBLE (with limitations)',
                '1. Use JADX with deobfuscation options enabled',
                '2. Apply class/method renaming for better readability',
                '3. Focus on analyzing:',
                '   - Network communications',
                '   - Cryptographic operations',
                '   - Permission usage',
                '   - Sensitive API calls',
                '4. Use dynamic analysis for runtime behavior',
                '5. Consider using JADX-GUI for manual analysis',
            ]
        else:
            self.results['recommendations'] = [
                'STANDARD STATIC ANALYSIS APPLICABLE',
                '1. Proceed with SAST tools',
                '2. Manual code review of critical components',
                '3. Check for security vulnerabilities',
                '4. Analyze network traffic',
                '5. Review permissions and components',
            ]
    
    def analyze(self):
        """Run all detection checks"""
        
        # Run APKiD first for comprehensive detection
        self.results['indicators'].extend(self.run_apkid())
        
        # Check for DEX-level protection
        self.results['indicators'].extend(self.check_dex_files())
        
        # Check for native libraries
        self.results['indicators'].extend(self.check_native_libs())
        
        # Check manifest (this can detect jx.shell directly)
        self.results['indicators'].extend(self.check_manifest_indicators())
        
        # Check Java sources for DPT/jx.shell patterns (priority check)
        self.results['indicators'].extend(self.check_dpt_jx_shell_sources())
        
        # Check for additional obfuscation techniques
        self.results['indicators'].extend(self.check_additional_obfuscation())
        
        # Check for ProGuard/R8 (only if no advanced protection detected)
        if self.results['type'] == 'none':
            self.results['indicators'].extend(self.check_proguard_r8())
        
        # Check string encryption
        self.results['indicators'].extend(self.check_string_encryption())
        
        # Generate recommendations
        self.generate_recommendations()
        
        return self.results

def main():
    if len(sys.argv) < 5:
        print("Usage: detect_obfuscation.py <apk_path> <decompiled_dir> <jadx_dir> <output_json>")
        sys.exit(1)
    
    apk_path = sys.argv[1] if os.path.exists(sys.argv[1]) else None
    decompiled_dir = sys.argv[2] if os.path.exists(sys.argv[2]) else None
    jadx_dir = sys.argv[3] if os.path.exists(sys.argv[3]) else None
    output_json = sys.argv[4]
    
    detector = ObfuscationDetector(decompiled_dir, jadx_dir, apk_path)
    results = detector.analyze()
    
    # Save results
    with open(output_json, 'w') as f:
        json.dump(results, f, indent=2)
    
    # Print summary
    print(f"\n{'='*60}")
    print(f"OBFUSCATION DETECTION RESULTS")
    print(f"{'='*60}")
    print(f"Type: {results['type'].upper()}")
    print(f"Confidence: {results['confidence']}%")
    print(f"\nIndicators Found: {len(results['indicators'])}")
    for indicator in results['indicators']:
        print(f"  • {indicator}")
    
    if results['apkid_results']:
        print(f"\nAPKiD Enhanced Detection: Enabled")
    
    if results['recommendations']:
        print(f"\nRECOMMENDATIONS:")
        for rec in results['recommendations']:
            print(f"  {rec}")
    
    print(f"\n{'='*60}\n")

if __name__ == '__main__':
    main()
