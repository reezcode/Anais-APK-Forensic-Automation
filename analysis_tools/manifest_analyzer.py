#!/usr/bin/env python3
"""
AndroidManifest.xml Analyzer
Detects security issues and misconfigurations in manifest
Supports binary AXML format conversion
"""

import sys
import json
import xml.etree.ElementTree as ET
from pathlib import Path
import subprocess
import os

class ManifestAnalyzer:
    def __init__(self, manifest_path):
        self.manifest_path = Path(manifest_path)
        self.findings = []
        self.info = {}
        self.converted = False
        
        # Check if manifest is binary AXML and convert if needed
        manifest_to_parse = self._handle_binary_manifest(manifest_path)
        
        try:
            self.tree = ET.parse(manifest_to_parse)
            self.root = self.tree.getroot()
        except Exception as e:
            self.findings.append({
                'severity': 'critical',
                'title': 'Failed to parse manifest',
                'description': str(e)
            })
            self.tree = None
            self.root = None
    
    def _is_binary_axml(self, filepath):
        """Check if file is binary AXML format"""
        try:
            with open(filepath, 'rb') as f:
                # Binary AXML files start with specific magic bytes
                header = f.read(4)
                # Check for AXML magic number (0x00080003 or 0x03000800)
                if header in [b'\x03\x00\x08\x00', b'\x00\x08\x00\x03']:
                    return True
                
                # Also check if file starts with XML declaration
                f.seek(0)
                first_bytes = f.read(100)
                if b'<?xml' not in first_bytes and b'<manifest' not in first_bytes:
                    return True
                    
        except Exception:
            pass
        return False
    
    def _convert_binary_to_xml(self, binary_path):
        """Convert binary AXML to readable XML using axml2xml Node.js tool"""
        output_path = binary_path.parent / f"{binary_path.stem}_converted.xml"
        
        try:
            # Find the axml converter script
            script_dir = Path(__file__).parent.parent
            axml_converter = script_dir / "axml" / "convert_axml.js"
            
            if not axml_converter.exists():
                print(f"[ERROR] AXML converter not found at: {axml_converter}")
                return str(binary_path)
            
            # Run the Node.js converter
            result = subprocess.run(
                ['node', str(axml_converter), str(binary_path), str(output_path)],
                capture_output=True,
                text=True,
                timeout=30
            )
            
            if result.returncode == 0 and output_path.exists():
                print(f"[INFO] Converted binary AXML to XML successfully")
                return str(output_path)
            else:
                error_msg = result.stderr if result.stderr else result.stdout
                print(f"[ERROR] AXML conversion failed: {error_msg}")
                return str(binary_path)
                
        except FileNotFoundError:
            print(f"[ERROR] Node.js not found. Install Node.js to convert binary AXML files")
            return str(binary_path)
        except subprocess.TimeoutExpired:
            print(f"[ERROR] AXML conversion timeout")
            return str(binary_path)
        except Exception as e:
            print(f"[ERROR] Failed to convert binary AXML: {e}")
            return str(binary_path)
    
    def _handle_binary_manifest(self, manifest_path):
        """Check and convert binary manifest if needed"""
        if self._is_binary_axml(manifest_path):
            print(f"[WARNING] Binary AXML detected, converting to readable XML...")
            self.converted = True
            converted_path = self._convert_binary_to_xml(Path(manifest_path))
            return converted_path
        
        return manifest_path
    
    def check_dangerous_permissions(self):
        """Check for dangerous permissions"""
        if not self.root:
            return
        
        dangerous_perms = {
            'READ_SMS': 'Can read SMS messages',
            'RECEIVE_SMS': 'Can intercept incoming SMS',
            'SEND_SMS': 'Can send SMS messages',
            'READ_CONTACTS': 'Can access contacts',
            'WRITE_CONTACTS': 'Can modify contacts',
            'READ_CALL_LOG': 'Can read call history',
            'WRITE_CALL_LOG': 'Can modify call history',
            'RECORD_AUDIO': 'Can record audio',
            'CAMERA': 'Can access camera',
            'ACCESS_FINE_LOCATION': 'Can access precise location',
            'READ_PHONE_STATE': 'Can read phone state and device ID',
            'SYSTEM_ALERT_WINDOW': 'Can draw over other apps',
            'REQUEST_INSTALL_PACKAGES': 'Can install packages',
            'REQUEST_DELETE_PACKAGES': 'Can delete packages',
            'BIND_ACCESSIBILITY_SERVICE': 'Accessibility service (high risk)',
            'BIND_DEVICE_ADMIN': 'Device administrator',
            'WRITE_EXTERNAL_STORAGE': 'Can write to external storage',
        }
        
        namespace = {'android': 'http://schemas.android.com/apk/res/android'}
        
        for perm in self.root.findall('.//uses-permission', namespace):
            name = perm.get('{http://schemas.android.com/apk/res/android}name', '')
            perm_name = name.split('.')[-1]
            
            if perm_name in dangerous_perms:
                severity = 'critical' if perm_name in ['BIND_ACCESSIBILITY_SERVICE', 'SYSTEM_ALERT_WINDOW', 'REQUEST_INSTALL_PACKAGES'] else 'high'
                
                self.findings.append({
                    'severity': severity,
                    'category': 'dangerous_permission',
                    'title': f'Dangerous Permission: {perm_name}',
                    'description': dangerous_perms[perm_name],
                    'permission': name
                })
    
    def check_exported_components(self):
        """Check for exported components without permissions"""
        if not self.root:
            return
        
        namespace = {'android': 'http://schemas.android.com/apk/res/android'}
        
        components = [
            ('activity', 'Activity'),
            ('service', 'Service'),
            ('receiver', 'Receiver'),
            ('provider', 'Provider')
        ]
        
        for comp_type, comp_name in components:
            for comp in self.root.findall(f'.//{comp_type}', namespace):
                exported = comp.get('{http://schemas.android.com/apk/res/android}exported', 'false')
                permission = comp.get('{http://schemas.android.com/apk/res/android}permission', None)
                name = comp.get('{http://schemas.android.com/apk/res/android}name', 'Unknown')
                
                # Check for intent filters (makes component exported by default in older APIs)
                has_intent_filter = len(comp.findall('.//intent-filter')) > 0
                
                if (exported == 'true' or has_intent_filter) and not permission:
                    self.findings.append({
                        'severity': 'high',
                        'category': 'exported_component',
                        'title': f'Exported {comp_name} Without Permission',
                        'description': f'{comp_name} is exported but lacks permission protection',
                        'component': name,
                        'type': comp_type
                    })
    
    def check_debuggable(self):
        """Check if app is debuggable"""
        if not self.root:
            return
        
        namespace = {'android': 'http://schemas.android.com/apk/res/android'}
        app = self.root.find('.//application', namespace)
        
        if app is not None:
            debuggable = app.get('{http://schemas.android.com/apk/res/android}debuggable', 'false')
            
            if debuggable == 'true':
                self.findings.append({
                    'severity': 'critical',
                    'category': 'debuggable',
                    'title': 'Application is Debuggable',
                    'description': 'App can be debugged, allowing code injection and data extraction'
                })
    
    def check_backup_allowed(self):
        """Check if backup is allowed"""
        if not self.root:
            return
        
        namespace = {'android': 'http://schemas.android.com/apk/res/android'}
        app = self.root.find('.//application', namespace)
        
        if app is not None:
            backup = app.get('{http://schemas.android.com/apk/res/android}allowBackup', 'true')
            
            if backup == 'true':
                self.findings.append({
                    'severity': 'medium',
                    'category': 'backup_allowed',
                    'title': 'Backup Allowed',
                    'description': 'App data can be backed up via adb, potentially exposing sensitive data'
                })
    
    def check_cleartext_traffic(self):
        """Check if cleartext traffic is allowed"""
        if not self.root:
            return
        
        namespace = {'android': 'http://schemas.android.com/apk/res/android'}
        app = self.root.find('.//application', namespace)
        
        if app is not None:
            cleartext = app.get('{http://schemas.android.com/apk/res/android}usesCleartextTraffic', 'true')
            
            if cleartext == 'true':
                self.findings.append({
                    'severity': 'medium',
                    'category': 'cleartext_traffic',
                    'title': 'Cleartext Traffic Allowed',
                    'description': 'App can use HTTP connections, data can be intercepted'
                })
    
    def extract_info(self):
        """Extract basic manifest info"""
        if not self.root:
            return
        
        namespace = {'android': 'http://schemas.android.com/apk/res/android'}
        
        self.info = {
            'package': self.root.get('package', 'Unknown'),
            'version_code': self.root.get('{http://schemas.android.com/apk/res/android}versionCode', 'Unknown'),
            'version_name': self.root.get('{http://schemas.android.com/apk/res/android}versionName', 'Unknown'),
        }
        
        # Count components
        self.info['component_counts'] = {
            'activities': len(self.root.findall('.//activity', namespace)),
            'services': len(self.root.findall('.//service', namespace)),
            'receivers': len(self.root.findall('.//receiver', namespace)),
            'providers': len(self.root.findall('.//provider', namespace)),
        }
    
    def analyze(self):
        """Run all checks"""
        self.extract_info()
        self.check_dangerous_permissions()
        self.check_exported_components()
        self.check_debuggable()
        self.check_backup_allowed()
        self.check_cleartext_traffic()
        
        results = {
            'info': self.info,
            'findings': self.findings
        }
        
        # Add conversion info if manifest was binary
        if self.converted:
            results['info']['manifest_format'] = 'binary_axml_converted'
            results['info']['conversion_note'] = 'Original manifest was in binary AXML format and has been converted to readable XML'
        else:
            results['info']['manifest_format'] = 'xml'
        
        return results

def main():
    if len(sys.argv) < 3:
        print("Usage: manifest_analyzer.py <manifest_path> <output_json>")
        sys.exit(1)
    
    manifest_path = sys.argv[1]
    output_json = sys.argv[2]
    
    analyzer = ManifestAnalyzer(manifest_path)
    results = analyzer.analyze()
    
    with open(output_json, 'w') as f:
        json.dump(results, f, indent=2)
    
    print(f"Manifest analysis complete: {len(results['findings'])} findings")

if __name__ == '__main__':
    main()
