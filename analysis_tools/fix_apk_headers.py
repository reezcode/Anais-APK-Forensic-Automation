#!/usr/bin/env python3
"""
APK Header Fixer
Attempts to fix corrupted or manipulated ZIP headers in APK files
"""

import sys
import struct
import shutil
from pathlib import Path

class APKHeaderFixer:
    def __init__(self, input_apk, output_apk):
        self.input_apk = Path(input_apk)
        self.output_apk = Path(output_apk)
    
    def fix_local_file_headers(self, data):
        """Remove encryption flags from local file headers"""
        output = bytearray(data)
        offset = 0
        
        while offset < len(output) - 30:
            # Look for local file header signature (PK\x03\x04)
            if output[offset:offset+4] == b'PK\x03\x04':
                # Get flag bytes at offset + 6
                flags = struct.unpack('<H', output[offset+6:offset+8])[0]
                
                # Clear encryption bit (bit 0)
                new_flags = flags & ~0x0001
                
                # Clear data descriptor bit (bit 3) if needed
                new_flags = new_flags & ~0x0008
                
                # Update flags
                output[offset+6:offset+8] = struct.pack('<H', new_flags)
                
                # Get filename and extra field lengths
                filename_len = struct.unpack('<H', output[offset+26:offset+28])[0]
                extra_len = struct.unpack('<H', output[offset+28:offset+30])[0]
                
                # Move to next header
                offset += 30 + filename_len + extra_len
            else:
                offset += 1
        
        return bytes(output)
    
    def fix_central_directory_headers(self, data):
        """Remove encryption flags from central directory headers"""
        output = bytearray(data)
        offset = 0
        
        while offset < len(output) - 46:
            # Look for central directory header signature (PK\x01\x02)
            if output[offset:offset+4] == b'PK\x01\x02':
                # Get flag bytes at offset + 8
                flags = struct.unpack('<H', output[offset+8:offset+10])[0]
                
                # Clear encryption bit (bit 0)
                new_flags = flags & ~0x0001
                
                # Clear data descriptor bit (bit 3) if needed
                new_flags = new_flags & ~0x0008
                
                # Update flags
                output[offset+8:offset+10] = struct.pack('<H', new_flags)
                
                # Get lengths
                filename_len = struct.unpack('<H', output[offset+28:offset+30])[0]
                extra_len = struct.unpack('<H', output[offset+30:offset+32])[0]
                comment_len = struct.unpack('<H', output[offset+32:offset+34])[0]
                
                # Move to next header
                offset += 46 + filename_len + extra_len + comment_len
            else:
                offset += 1
        
        return bytes(output)
    
    def remove_encryption_header(self, data):
        """Remove encryption header if present"""
        # Some protectors add fake encryption headers
        # Look for and remove them
        output = bytearray(data)
        
        # Search for encryption header patterns
        # This is heuristic-based and may need adjustment
        patterns = [
            b'\x09\x99\x07',  # Common encryption header
            b'\x09\x99\x08',
        ]
        
        for pattern in patterns:
            idx = output.find(pattern)
            if idx != -1:
                print(f"Found potential encryption header at offset {idx}")
                # Remove the pattern (careful with this)
                # output = output[:idx] + output[idx+len(pattern):]
        
        return bytes(output)
    
    def fix_apk(self):
        """Main fixing routine"""
        try:
            # Read entire APK
            with open(self.input_apk, 'rb') as f:
                data = f.read()
            
            print(f"Original APK size: {len(data)} bytes")
            
            # Apply fixes
            print("Fixing local file headers...")
            data = self.fix_local_file_headers(data)
            
            print("Fixing central directory headers...")
            data = self.fix_central_directory_headers(data)
            
            print("Checking for encryption headers...")
            data = self.remove_encryption_header(data)
            
            # Write fixed APK
            with open(self.output_apk, 'wb') as f:
                f.write(data)
            
            print(f"Fixed APK size: {len(data)} bytes")
            print(f"Fixed APK saved to: {self.output_apk}")
            
            return True
            
        except Exception as e:
            print(f"Error fixing APK: {e}")
            import traceback
            traceback.print_exc()
            return False

def main():
    if len(sys.argv) < 3:
        print("Usage: fix_apk_headers.py <input_apk> <output_apk>")
        sys.exit(1)
    
    input_apk = sys.argv[1]
    output_apk = sys.argv[2]
    
    fixer = APKHeaderFixer(input_apk, output_apk)
    
    if fixer.fix_apk():
        print("APK headers fixed successfully!")
        print("Try decompiling the fixed APK now.")
    else:
        print("Failed to fix APK headers.")
        sys.exit(1)

if __name__ == '__main__':
    main()
