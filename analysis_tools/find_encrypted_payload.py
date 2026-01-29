#!/usr/bin/env python3
"""
Encrypted Payload Locator
Finds the actual source location of encrypted DEX payloads within the APK
before they are unpacked to code_cache at runtime.
"""

import sys
import zipfile
import struct
from pathlib import Path
import argparse
import json

class EncryptedPayloadLocator:
    def __init__(self, apk_path, target_filename=None):
        self.apk_path = apk_path
        self.target_filename = target_filename
        self.results = {
            'found_payloads': [],
            'zip_signatures': [],
            'embedded_in_so': [],
            'obfuscated_assets': [],
            'suspicious_files': []
        }
    
    def search_by_magic_bytes(self, zf):
        """Search for ZIP magic bytes (PK signature) in all files"""
        print("\n🔍 Searching for ZIP magic bytes (PK signatures)...")
        
        # ZIP file signatures
        ZIP_SIGNATURES = [
            b'PK\x03\x04',  # Local file header
            b'PK\x05\x06',  # End of central directory
            b'PK\x01\x02',  # Central directory file header
        ]
        
        for file_info in zf.filelist:
            try:
                data = zf.read(file_info.filename)
                
                # Check for ZIP signatures
                for sig in ZIP_SIGNATURES:
                    offset = 0
                    while True:
                        offset = data.find(sig, offset)
                        if offset == -1:
                            break
                        
                        # Found a signature - check if it's a valid ZIP
                        if sig == b'PK\x03\x04':  # Local file header
                            # Try to read ZIP header
                            try:
                                if offset + 30 <= len(data):
                                    header = data[offset:offset+30]
                                    # Parse local file header
                                    signature, version, flags, method, mod_time, mod_date, crc32, comp_size, uncomp_size, fname_len, extra_len = struct.unpack('<IHHHHIIIHH', header)
                                    
                                    if fname_len > 0 and fname_len < 256:  # Reasonable filename length
                                        # Extract filename
                                        if offset + 30 + fname_len <= len(data):
                                            zip_fname = data[offset+30:offset+30+fname_len].decode('utf-8', errors='ignore')
                                            
                                            # Check if this matches our target
                                            match_target = False
                                            if self.target_filename and self.target_filename.lower() in zip_fname.lower():
                                                match_target = True
                                            
                                            result = {
                                                'location': file_info.filename,
                                                'offset': offset,
                                                'embedded_filename': zip_fname,
                                                'compressed_size': comp_size,
                                                'uncompressed_size': uncomp_size,
                                                'compression_method': method,
                                                'matches_target': match_target
                                            }
                                            
                                            self.results['zip_signatures'].append(result)
                                            
                                            if match_target:
                                                print(f"\n✅ FOUND TARGET: {self.target_filename}")
                                                print(f"   Location: {file_info.filename}")
                                                print(f"   Offset: 0x{offset:08x} ({offset} bytes)")
                                                print(f"   Embedded filename: {zip_fname}")
                                                print(f"   Compressed: {comp_size} bytes")
                                                print(f"   Uncompressed: {uncomp_size} bytes")
                            except Exception as e:
                                pass
                        
                        offset += 1
                        
            except Exception as e:
                continue
    
    def search_obfuscated_assets(self, zf):
        """Search assets folder for obfuscated files that might be the payload"""
        print("\n🔍 Searching assets folder for obfuscated files...")
        
        asset_files = [f for f in zf.filelist if f.filename.startswith('assets/')]
        
        for asset in asset_files:
            try:
                data = zf.read(asset.filename)
                
                # Check if it's actually a ZIP file (starts with PK)
                if data[:2] == b'PK':
                    is_valid_zip = True
                    embedded_files = []
                    
                    # Try to read as ZIP
                    try:
                        import io
                        with zipfile.ZipFile(io.BytesIO(data)) as inner_zip:
                            embedded_files = [f.filename for f in inner_zip.filelist]
                            
                            # Check if any embedded file contains .dex
                            has_dex = any('.dex' in f.lower() for f in embedded_files)
                            
                            result = {
                                'location': asset.filename,
                                'size': len(data),
                                'is_zip': True,
                                'embedded_files': embedded_files,
                                'contains_dex': has_dex,
                                'potential_payload': has_dex
                            }
                            
                            self.results['obfuscated_assets'].append(result)
                            
                            print(f"\n📦 Found ZIP in assets: {asset.filename}")
                            print(f"   Size: {len(data)} bytes")
                            print(f"   Contains {len(embedded_files)} file(s)")
                            if has_dex:
                                print(f"   ⚠️  Contains DEX files!")
                            print(f"   Files: {', '.join(embedded_files[:5])}")
                            
                    except zipfile.BadZipFile:
                        # Not a valid ZIP despite PK signature
                        result = {
                            'location': asset.filename,
                            'size': len(data),
                            'is_zip': False,
                            'has_pk_signature': True,
                            'potential_encrypted': True
                        }
                        self.results['suspicious_files'].append(result)
                        print(f"\n🔒 Suspicious file: {asset.filename}")
                        print(f"   Has PK signature but not a valid ZIP (likely encrypted)")
                        print(f"   Size: {len(data)} bytes")
                
                # Check for files with suspicious names or no extension
                elif '.' not in Path(asset.filename).name or len(Path(asset.filename).name) > 20:
                    # Check entropy (high entropy = encrypted/compressed)
                    entropy = self.calculate_entropy(data[:min(1024, len(data))])
                    
                    if entropy > 7.0:  # High entropy
                        result = {
                            'location': asset.filename,
                            'size': len(data),
                            'entropy': entropy,
                            'suspicious': True
                        }
                        self.results['suspicious_files'].append(result)
                        print(f"\n⚠️  High entropy file: {asset.filename}")
                        print(f"   Size: {len(data)} bytes")
                        print(f"   Entropy: {entropy:.2f} (likely encrypted)")
                        
            except Exception as e:
                continue
    
    def search_in_native_libs(self, zf):
        """Search for embedded payloads in .so files"""
        print("\n🔍 Searching native libraries for embedded payloads...")
        
        so_files = [f for f in zf.filelist if f.filename.endswith('.so')]
        
        for so_file in so_files:
            try:
                data = zf.read(so_file.filename)
                
                # Search for PK signatures
                pk_offsets = []
                offset = 0
                while True:
                    offset = data.find(b'PK\x03\x04', offset)
                    if offset == -1:
                        break
                    pk_offsets.append(offset)
                    offset += 1
                
                if pk_offsets:
                    # Found embedded ZIP
                    for pk_offset in pk_offsets:
                        # Try to extract the embedded ZIP
                        try:
                            # Find the end of the ZIP (look for end of central directory signature)
                            end_offset = data.find(b'PK\x05\x06', pk_offset)
                            if end_offset != -1:
                                # Extract ZIP data
                                end_offset += 22  # Size of end of central directory record
                                zip_data = data[pk_offset:end_offset]
                                
                                # Try to read it
                                import io
                                try:
                                    with zipfile.ZipFile(io.BytesIO(zip_data)) as embedded_zip:
                                        embedded_files = [f.filename for f in embedded_zip.filelist]
                                        
                                        result = {
                                            'location': so_file.filename,
                                            'offset': pk_offset,
                                            'size': len(zip_data),
                                            'embedded_files': embedded_files,
                                            'contains_dex': any('.dex' in f.lower() for f in embedded_files)
                                        }
                                        
                                        self.results['embedded_in_so'].append(result)
                                        
                                        print(f"\n📦 Found embedded ZIP in: {so_file.filename}")
                                        print(f"   Offset: 0x{pk_offset:08x} ({pk_offset} bytes)")
                                        print(f"   Size: {len(zip_data)} bytes")
                                        print(f"   Files: {', '.join(embedded_files)}")
                                        
                                except zipfile.BadZipFile:
                                    pass
                        except Exception as e:
                            continue
                            
            except Exception as e:
                continue
    
    def search_by_name_pattern(self, zf):
        """Search for files matching the target filename pattern"""
        if not self.target_filename:
            return
        
        print(f"\n🔍 Searching for files matching: {self.target_filename}")
        
        # Also search where the filename is referenced (in .so files)
        target_bytes = self.target_filename.encode()
        
        # Find all .so files that reference this filename
        so_references = []
        for file_info in zf.filelist:
            if file_info.filename.endswith('.so'):
                try:
                    data = zf.read(file_info.filename)
                    if target_bytes in data:
                        offset = data.find(target_bytes)
                        so_references.append({
                            'so_file': file_info.filename,
                            'offset': offset
                        })
                        print(f"\n📌 Found reference in: {file_info.filename}")
                        print(f"   Offset: 0x{offset:08x}")
                except:
                    continue
        
        # If found in .so files, the actual encrypted data is likely in assets
        if so_references:
            print(f"\n💡 The filename '{self.target_filename}' is used at RUNTIME")
            print(f"   The ENCRYPTED source is likely in assets/ with an obfuscated name")
            print(f"\n🔍 Checking for large suspicious assets...")
            
            # Find large files in assets (potential encrypted payloads)
            large_assets = []
            for file_info in zf.filelist:
                if file_info.filename.startswith('assets/') and file_info.file_size > 1_000_000:  # > 1MB
                    # Check if it has weird name
                    filename = Path(file_info.filename).name
                    is_suspicious = (
                        '.' not in filename or  # No extension
                        filename.count(filename[0]) > len(filename) // 2 or  # Repetitive chars
                        not any(c.isalnum() and c.islower() for c in filename)  # No lowercase letters
                    )
                    
                    if is_suspicious:
                        large_assets.append(file_info)
                        
                        data = zf.read(file_info.filename)
                        entropy = self.calculate_entropy(data[:min(4096, len(data))])
                        
                        result = {
                            'location': file_info.filename,
                            'size': len(data),
                            'compressed_size': file_info.compress_size,
                            'entropy': entropy,
                            'likely_encrypted': entropy > 5.0,
                            'target_runtime_name': self.target_filename,
                            'referenced_in': [ref['so_file'] for ref in so_references]
                        }
                        
                        self.results['found_payloads'].append(result)
                        
                        print(f"\n✅ POTENTIAL SOURCE: {file_info.filename}")
                        print(f"   Size: {len(data):,} bytes ({len(data)/1024/1024:.2f} MB)")
                        print(f"   Entropy: {entropy:.2f}")
                        if entropy > 5.0:
                            print(f"   ⚠️  High entropy - likely encrypted!")
                        print(f"   Runtime name: {self.target_filename}")
                        print(f"   Referenced in: {', '.join(ref['so_file'] for ref in so_references)}")
        
        # Original search for exact filename
        # Extract base name without extension
        target_base = self.target_filename.replace('.zip', '').replace('.jar', '').replace('.dat', '')
        
        for file_info in zf.filelist:
            # Check if filename contains target pattern
            if target_base.lower() in file_info.filename.lower():
                data = zf.read(file_info.filename)
                
                result = {
                    'location': file_info.filename,
                    'size': len(data),
                    'compressed_size': file_info.compress_size,
                    'exact_match': file_info.filename.endswith(self.target_filename)
                }
                
                self.results['found_payloads'].append(result)
                
                print(f"\n✅ FOUND: {file_info.filename}")
                print(f"   Size: {len(data)} bytes")
                print(f"   Compressed: {file_info.compress_size} bytes")
                
                # Check if it's a valid ZIP
                if data[:2] == b'PK':
                    print(f"   ✓ Valid ZIP signature")
                    
                    # Try to list contents
                    try:
                        import io
                        with zipfile.ZipFile(io.BytesIO(data)) as inner_zip:
                            files = [f.filename for f in inner_zip.filelist]
                            print(f"   Contains: {', '.join(files)}")
                    except:
                        print(f"   ⚠️  Has PK signature but cannot read (encrypted?)")
                else:
                    entropy = self.calculate_entropy(data[:min(1024, len(data))])
                    print(f"   Entropy: {entropy:.2f}")
    
    def calculate_entropy(self, data):
        """Calculate Shannon entropy of data"""
        if not data:
            return 0
        
        import math
        from collections import Counter
        
        counter = Counter(data)
        length = len(data)
        entropy = 0
        
        for count in counter.values():
            p = count / length
            entropy -= p * math.log2(p)
        
        return entropy
    
    def extract_payload(self, output_path, location):
        """Extract the found payload to a file"""
        print(f"\n💾 Extracting payload from: {location}")
        
        try:
            with zipfile.ZipFile(self.apk_path, 'r') as zf:
                data = zf.read(location)
                
                with open(output_path, 'wb') as f:
                    f.write(data)
                
                print(f"✅ Extracted to: {output_path}")
                print(f"   Size: {len(data)} bytes")
                
                # Try to analyze
                if data[:2] == b'PK':
                    print(f"   Type: ZIP archive")
                    try:
                        import io
                        with zipfile.ZipFile(io.BytesIO(data)) as inner_zip:
                            files = [f.filename for f in inner_zip.filelist]
                            print(f"   Contains {len(files)} file(s):")
                            for f in files:
                                print(f"      • {f}")
                    except:
                        print(f"   ⚠️  Encrypted or corrupted ZIP")
                else:
                    entropy = self.calculate_entropy(data[:min(1024, len(data))])
                    print(f"   Entropy: {entropy:.2f}")
                    if entropy > 7.5:
                        print(f"   Likely encrypted")
                
                return True
                
        except Exception as e:
            print(f"❌ Error: {e}")
            return False
    
    def search_all(self):
        """Perform all searches"""
        print(f"\n{'='*70}")
        print(f"🔍 ENCRYPTED PAYLOAD LOCATOR")
        print(f"{'='*70}")
        print(f"APK: {self.apk_path}")
        if self.target_filename:
            print(f"Target: {self.target_filename}")
        print(f"{'='*70}")
        
        with zipfile.ZipFile(self.apk_path, 'r') as zf:
            # Search by name pattern first
            if self.target_filename:
                self.search_by_name_pattern(zf)
            
            # Search in assets
            self.search_obfuscated_assets(zf)
            
            # Search in native libraries
            self.search_in_native_libs(zf)
            
            # Search by magic bytes (comprehensive but slow)
            # self.search_by_magic_bytes(zf)  # Uncomment for deep search
        
        return self.results


def main():
    parser = argparse.ArgumentParser(
        description='Find encrypted DEX payload source location in APK',
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog="""
Examples:
  # Find specific encrypted zip file
  python3 find_encrypted_payload.py app.apk --target i11111i111.zip
  
  # Search for all suspicious files
  python3 find_encrypted_payload.py app.apk
  
  # Extract found payload
  python3 find_encrypted_payload.py app.apk --target i11111i111.zip --extract payload.zip
  
  # Export results to JSON
  python3 find_encrypted_payload.py app.apk --json results.json
        """
    )
    
    parser.add_argument('apk', help='APK file to analyze')
    parser.add_argument('--target', '-t', help='Target filename to search for (e.g., i11111i111.zip)')
    parser.add_argument('--extract', '-e', help='Extract found payload to this path')
    parser.add_argument('--json', '-j', help='Export results to JSON file')
    
    args = parser.parse_args()
    
    if not Path(args.apk).exists():
        print(f"Error: APK not found: {args.apk}", file=sys.stderr)
        sys.exit(1)
    
    # Create locator
    locator = EncryptedPayloadLocator(args.apk, args.target)
    
    # Search
    results = locator.search_all()
    
    # Summary
    print(f"\n{'='*70}")
    print(f"📊 SEARCH SUMMARY")
    print(f"{'='*70}")
    print(f"Direct matches: {len(results['found_payloads'])}")
    print(f"Obfuscated assets: {len(results['obfuscated_assets'])}")
    print(f"Embedded in .so: {len(results['embedded_in_so'])}")
    print(f"Suspicious files: {len(results['suspicious_files'])}")
    print(f"{'='*70}\n")
    
    # Extract if requested
    if args.extract and results['found_payloads']:
        location = results['found_payloads'][0]['location']
        locator.extract_payload(args.extract, location)
    
    # Export JSON
    if args.json:
        with open(args.json, 'w') as f:
            json.dump(results, f, indent=2)
        print(f"✅ Results exported to: {args.json}")


if __name__ == '__main__':
    main()
