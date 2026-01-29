#!/usr/bin/env python3
"""
ZIP Encryption and Protection Checker
Detects various ZIP protection mechanisms including encryption and header manipulation
"""

import sys
import struct
import json
import zipfile
from pathlib import Path

class ZipProtectionChecker:
    def __init__(self, apk_path):
        self.apk_path = Path(apk_path)
        self.results = {
            'encrypted': False,
            'password_protected': False,
            'encrypted_files': [],
            'corrupted_headers': False,
            'protection_type': 'none',
            'details': {}
        }
    
    def check_zip_encryption(self):
        """Check if ZIP file is encrypted or password protected"""
        try:
            with zipfile.ZipFile(self.apk_path, 'r') as zf:
                for info in zf.infolist():
                    # Check encryption flag (bit 0 of flag_bits)
                    if info.flag_bits & 0x1:
                        self.results['encrypted'] = True
                        self.results['password_protected'] = True
                        self.results['encrypted_files'].append(info.filename)
                        self.results['protection_type'] = 'password_protected'
        except zipfile.BadZipFile:
            self.results['corrupted_headers'] = True
            self.results['protection_type'] = 'corrupted_zip'
        except Exception as e:
            self.results['details']['error'] = str(e)
    
    def check_local_file_header(self):
        """Check local file headers for manipulation"""
        try:
            with open(self.apk_path, 'rb') as f:
                data = f.read(1024)  # Read first KB
                
                # Check for ZIP signature
                if data[:4] != b'PK\x03\x04':
                    self.results['corrupted_headers'] = True
                    self.results['details']['header_issue'] = 'Invalid ZIP signature'
                    return False
                
                # Parse local file header
                signature = struct.unpack('<I', data[0:4])[0]
                version = struct.unpack('<H', data[4:6])[0]
                flags = struct.unpack('<H', data[6:8])[0]
                
                self.results['details']['local_header'] = {
                    'signature': hex(signature),
                    'version': version,
                    'flags': hex(flags)
                }
                
                # Check encryption bit
                if flags & 0x1:
                    self.results['encrypted'] = True
                
                return True
                
        except Exception as e:
            self.results['details']['header_error'] = str(e)
            return False
    
    def check_central_directory(self):
        """Check central directory for manipulation"""
        try:
            with open(self.apk_path, 'rb') as f:
                # Search for End of Central Directory signature
                f.seek(-22, 2)  # Minimum EOCD size is 22 bytes
                data = f.read()
                
                # Look for EOCD signature (PK\x05\x06)
                eocd_offset = data.find(b'PK\x05\x06')
                if eocd_offset == -1:
                    # Try reading more data
                    f.seek(-1024, 2)
                    data = f.read()
                    eocd_offset = data.find(b'PK\x05\x06')
                
                if eocd_offset != -1:
                    eocd_data = data[eocd_offset:]
                    cd_offset = struct.unpack('<I', eocd_data[16:20])[0]
                    
                    self.results['details']['central_directory'] = {
                        'offset': cd_offset,
                        'found': True
                    }
                else:
                    self.results['corrupted_headers'] = True
                    self.results['details']['central_directory'] = {
                        'found': False
                    }
                    
        except Exception as e:
            self.results['details']['cd_error'] = str(e)
    
    def analyze(self):
        """Run all checks"""
        self.check_zip_encryption()
        self.check_local_file_header()
        self.check_central_directory()
        
        return self.results

def main():
    if len(sys.argv) < 3:
        print("Usage: check_zip_encryption.py <apk_path> <output_json>")
        sys.exit(1)
    
    apk_path = sys.argv[1]
    output_json = sys.argv[2]
    
    checker = ZipProtectionChecker(apk_path)
    results = checker.analyze()
    
    # Save results
    with open(output_json, 'w') as f:
        json.dump(results, f, indent=2)
    
    # Print summary
    print(f"Encryption Check Results:")
    print(f"  Encrypted: {results['encrypted']}")
    print(f"  Password Protected: {results['password_protected']}")
    print(f"  Protection Type: {results['protection_type']}")
    print(f"  Corrupted Headers: {results['corrupted_headers']}")
    
    if results['encrypted_files']:
        print(f"  Encrypted Files: {len(results['encrypted_files'])}")

if __name__ == '__main__':
    main()
