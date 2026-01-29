#!/usr/bin/env python3
"""
APK Basic Information Extractor using Androguard
"""

import sys
import json
from pathlib import Path

try:
    from androguard.core.bytecodes.apk import APK
except ImportError:
    print("Warning: androguard not installed. Run: pip3 install androguard")
    sys.exit(0)

def extract_apk_info(apk_path):
    """Extract comprehensive APK information"""
    try:
        apk = APK(apk_path)
        
        info = {
            'package_name': apk.get_package(),
            'app_name': apk.get_app_name(),
            'version_name': apk.get_androidversion_name(),
            'version_code': apk.get_androidversion_code(),
            'min_sdk': apk.get_min_sdk_version(),
            'target_sdk': apk.get_target_sdk_version(),
            'permissions': apk.get_permissions(),
            'activities': apk.get_activities(),
            'services': apk.get_services(),
            'receivers': apk.get_receivers(),
            'providers': apk.get_providers(),
            'libraries': apk.get_libraries(),
            'main_activity': apk.get_main_activity(),
            'is_signed': apk.is_signed(),
            'is_signed_v1': apk.is_signed_v1(),
            'is_signed_v2': apk.is_signed_v2(),
            'is_signed_v3': apk.is_signed_v3(),
        }
        
        # Get certificate info if signed
        if apk.is_signed():
            try:
                certs = apk.get_certificates_der_v1()
                if certs:
                    from cryptography import x509
                    from cryptography.hazmat.backends import default_backend
                    
                    cert = x509.load_der_x509_certificate(certs[0], default_backend())
                    info['certificate'] = {
                        'subject': str(cert.subject),
                        'issuer': str(cert.issuer),
                        'serial': str(cert.serial_number),
                        'not_before': str(cert.not_valid_before),
                        'not_after': str(cert.not_valid_after),
                    }
            except:
                pass
        
        return info
        
    except Exception as e:
        return {'error': str(e)}

def main():
    if len(sys.argv) < 3:
        print("Usage: apk_basic_info.py <apk_path> <output_json>")
        sys.exit(1)
    
    apk_path = sys.argv[1]
    output_json = sys.argv[2]
    
    info = extract_apk_info(apk_path)
    
    with open(output_json, 'w') as f:
        json.dump(info, f, indent=2)
    
    print(f"APK Info extracted successfully")
    if 'package_name' in info:
        print(f"Package: {info['package_name']}")
        print(f"Version: {info['version_name']} ({info['version_code']})")
        print(f"Permissions: {len(info.get('permissions', []))}")

if __name__ == '__main__':
    main()
