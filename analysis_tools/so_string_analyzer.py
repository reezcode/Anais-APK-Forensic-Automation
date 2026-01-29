#!/usr/bin/env python3
"""
Native Library String Analyzer
Extracts and analyzes strings from .so files to find DEX/protection artifacts
"""

import sys
import zipfile
import re
from pathlib import Path
from collections import defaultdict
import json
import argparse

class SOStringAnalyzer:
    def __init__(self, verbose=False):
        self.verbose = verbose
        self.results = {}
        
    def extract_strings(self, data, min_length=4, max_length=200):
        """Extract printable ASCII strings from binary data"""
        strings = []
        current_string = []
        
        for byte in data:
            if 32 <= byte < 127:  # Printable ASCII range
                current_string.append(chr(byte))
            else:
                if len(current_string) >= min_length:
                    string = ''.join(current_string)
                    if len(string) <= max_length:  # Filter out extremely long strings
                        strings.append(string)
                current_string = []
        
        # Don't forget the last string
        if len(current_string) >= min_length:
            string = ''.join(current_string)
            if len(string) <= max_length:
                strings.append(string)
        
        return strings
    
    def categorize_strings(self, strings):
        """Categorize extracted strings by type and importance"""
        categories = {
            'dex_files': [],           # .dex file references
            'zip_files': [],           # .zip file references
            'jar_files': [],           # .jar file references
            'dat_files': [],           # .dat file references
            'apk_files': [],           # .apk file references
            'so_files': [],            # .so file references
            'code_cache_paths': [],    # code_cache directory refs
            'data_paths': [],          # /data/data/ paths
            'app_paths': [],           # app-specific paths
            'file_operations': [],     # file I/O related strings
            'encryption_keywords': [], # crypto-related keywords
            'class_loaders': [],       # ClassLoader references
            'jni_methods': [],         # JNI method names
            'java_classes': [],        # Java class references
            'shell_keywords': [],      # Shell/unpack keywords
            'url_patterns': [],        # URL-like patterns
            'base64_like': [],         # Base64-encoded looking strings
            'hex_patterns': [],        # Hexadecimal patterns
            'package_names': [],       # Android package names
            'system_calls': [],        # System call names
            'library_calls': [],       # Library function calls
            'strings_of_interest': []  # Other suspicious strings
        }
        
        for string in strings:
            string_lower = string.lower()
            
            # File extensions (HIGH PRIORITY)
            if '.dex' in string_lower:
                categories['dex_files'].append(string)
            if '.zip' in string_lower:
                categories['zip_files'].append(string)
            if '.jar' in string_lower:
                categories['jar_files'].append(string)
            if '.dat' in string_lower:
                categories['dat_files'].append(string)
            if '.apk' in string_lower:
                categories['apk_files'].append(string)
            if '.so' in string_lower and '/' in string:
                categories['so_files'].append(string)
            
            # Path patterns (HIGH PRIORITY)
            if 'code_cache' in string_lower or 'code-cache' in string_lower:
                categories['code_cache_paths'].append(string)
            if '/data/data/' in string_lower or '/data/app/' in string_lower:
                categories['data_paths'].append(string)
            if any(p in string_lower for p in ['/files/', '/cache/', '/app_dex/', '/app_', '/databases/']):
                categories['app_paths'].append(string)
            
            # File operations
            if any(op in string_lower for op in ['fopen', 'fread', 'fwrite', 'fclose', 'open64', 'read', 'write', 'mkdir', 'rmdir']):
                if len(string) < 50:  # Avoid long false positives
                    categories['file_operations'].append(string)
            
            # Encryption keywords (HIGH PRIORITY)
            if any(kw in string_lower for kw in ['encrypt', 'decrypt', 'cipher', 'aes', 'des', 'rsa', 'crypto', 'md5', 'sha', 'key', 'iv', 'salt']):
                if len(string) < 80:
                    categories['encryption_keywords'].append(string)
            
            # ClassLoader patterns (HIGH PRIORITY)
            if any(cl in string_lower for cl in ['classloader', 'dexclassloader', 'pathclassloader', 'basedexclassloader', 'inmemorydexclassloader']):
                categories['class_loaders'].append(string)
            
            # JNI methods
            if string.startswith('JNI_') or string.startswith('Java_'):
                categories['jni_methods'].append(string)
            if any(jni in string for jni in ['JNIEnv', 'jmethodID', 'jclass', 'jobject', 'jstring']):
                categories['jni_methods'].append(string)
            
            # Java class patterns (com.*, android.*, etc.)
            if re.match(r'^[a-z]+(\.[a-z][a-z0-9_]*)+', string):
                if '/' not in string and len(string) < 100:
                    categories['java_classes'].append(string)
            if 'dalvik/system/' in string_lower or 'android/app/' in string_lower:
                categories['java_classes'].append(string)
            
            # Shell/Protection keywords (HIGH PRIORITY)
            if any(sh in string_lower for sh in ['shell', 'unpack', 'stub', 'proxy', 'wrapper', 'loader', 'attach', 'detach', 'hook']):
                if len(string) < 60:
                    categories['shell_keywords'].append(string)
            
            # URL patterns
            if re.match(r'https?://', string_lower):
                categories['url_patterns'].append(string)
            
            # Base64-like patterns (long alphanumeric strings)
            if len(string) > 20 and re.match(r'^[A-Za-z0-9+/=]+$', string):
                if len(string) < 150:
                    categories['base64_like'].append(string)
            
            # Hex patterns
            if len(string) > 16 and re.match(r'^[0-9a-fA-F]+$', string):
                if len(string) < 100:
                    categories['hex_patterns'].append(string)
            
            # Package name patterns
            if re.match(r'^com\.[a-z][a-z0-9_]*(\.[a-z][a-z0-9_]*)+$', string_lower):
                categories['package_names'].append(string)
            
            # System calls
            if any(sc in string for sc in ['syscall', 'ptrace', 'mmap', 'mprotect', 'dlopen', 'dlsym', 'pthread']):
                if len(string) < 50:
                    categories['system_calls'].append(string)
            
            # Library calls
            if any(lc in string for lc in ['libc.so', 'libdl.so', 'liblog.so', 'libm.so', 'libz.so']):
                categories['library_calls'].append(string)
        
        # Remove empty categories and remove duplicates
        result = {}
        for category, items in categories.items():
            if items:
                result[category] = list(set(items))  # Remove duplicates
        
        return result
    
    def analyze_so_file(self, so_path, data):
        """Perform complete analysis on a single .so file"""
        if self.verbose:
            print(f"\n{'='*70}")
            print(f"Analyzing: {so_path}")
            print(f"Size: {len(data):,} bytes ({len(data)/1024:.2f} KB)")
            print(f"{'='*70}")
        
        # Extract strings
        strings = self.extract_strings(data, min_length=4)
        
        if self.verbose:
            print(f"Extracted {len(strings)} strings")
        
        # Categorize strings
        categorized = self.categorize_strings(strings)
        
        # Calculate statistics
        stats = {
            'total_strings': len(strings),
            'categories_found': len(categorized),
            'file_size_bytes': len(data),
            'file_size_kb': len(data) / 1024
        }
        
        # Build result
        result = {
            'file': so_path,
            'stats': stats,
            'categories': categorized
        }
        
        return result
    
    def analyze_apk(self, apk_path, target_libs=None):
        """Analyze .so files from APK"""
        if not Path(apk_path).exists():
            print(f"Error: APK not found: {apk_path}", file=sys.stderr)
            return None
        
        results = []
        
        try:
            with zipfile.ZipFile(apk_path, 'r') as zf:
                # Find all .so files
                so_files = [f for f in zf.filelist if f.filename.endswith('.so')]
                
                # Filter by target if specified
                if target_libs:
                    so_files = [f for f in so_files if any(target in f.filename.lower() for target in target_libs)]
                
                if not so_files:
                    print("No .so files found in APK", file=sys.stderr)
                    return None
                
                print(f"\nFound {len(so_files)} .so file(s) to analyze")
                
                for so_file in so_files:
                    try:
                        data = zf.read(so_file.filename)
                        result = self.analyze_so_file(so_file.filename, data)
                        results.append(result)
                    except Exception as e:
                        print(f"Error analyzing {so_file.filename}: {e}", file=sys.stderr)
                        
        except Exception as e:
            print(f"Error reading APK: {e}", file=sys.stderr)
            return None
        
        return results
    
    def analyze_file(self, file_path):
        """Analyze a single .so file"""
        if not Path(file_path).exists():
            print(f"Error: File not found: {file_path}", file=sys.stderr)
            return None
        
        try:
            with open(file_path, 'rb') as f:
                data = f.read()
            
            result = self.analyze_so_file(str(file_path), data)
            return [result]
        except Exception as e:
            print(f"Error reading file: {e}", file=sys.stderr)
            return None
    
    def print_results(self, results, show_all=False, limit=10):
        """Print analysis results in a readable format"""
        if not results:
            print("No results to display")
            return
        
        for result in results:
            print(f"\n{'='*70}")
            print(f"📦 {result['file']}")
            print(f"{'='*70}")
            print(f"Size: {result['stats']['file_size_kb']:.2f} KB")
            print(f"Total strings extracted: {result['stats']['total_strings']}")
            print(f"Categories found: {result['stats']['categories_found']}\n")
            
            categories = result['categories']
            
            # Priority categories first
            priority_categories = [
                ('dex_files', '🎯 DEX Files', '⚠️  CRITICAL'),
                ('zip_files', '🔒 ZIP Files', '⚠️  CRITICAL'),
                ('jar_files', '📦 JAR Files', 'HIGH'),
                ('dat_files', '📄 DAT Files', 'HIGH'),
                ('apk_files', '📱 APK Files', 'HIGH'),
                ('code_cache_paths', '📁 Code Cache Paths', '⚠️  CRITICAL'),
                ('data_paths', '📂 Data Paths', 'HIGH'),
                ('encryption_keywords', '🔐 Encryption Keywords', 'HIGH'),
                ('class_loaders', '🔧 ClassLoaders', 'HIGH'),
                ('shell_keywords', '🐚 Shell/Protection Keywords', 'HIGH'),
            ]
            
            # Show priority categories
            for cat_key, cat_name, priority in priority_categories:
                if cat_key in categories:
                    items = categories[cat_key]
                    print(f"\n{cat_name} [{priority}]: {len(items)} found")
                    display_limit = len(items) if show_all else min(limit, len(items))
                    for item in items[:display_limit]:
                        print(f"   • {item}")
                    if len(items) > display_limit:
                        print(f"   ... and {len(items) - display_limit} more (use --all to show)")
            
            # Other categories
            other_categories = [
                ('jni_methods', '⚙️  JNI Methods'),
                ('java_classes', '☕ Java Classes'),
                ('app_paths', '📂 App Paths'),
                ('file_operations', '📝 File Operations'),
                ('url_patterns', '🌐 URLs'),
                ('package_names', '📦 Package Names'),
                ('system_calls', '⚡ System Calls'),
                ('so_files', '📚 SO Libraries'),
                ('base64_like', '🔤 Base64-like Strings'),
                ('hex_patterns', '🔢 Hex Patterns'),
            ]
            
            if show_all or self.verbose:
                for cat_key, cat_name in other_categories:
                    if cat_key in categories:
                        items = categories[cat_key]
                        print(f"\n{cat_name}: {len(items)} found")
                        display_limit = len(items) if show_all else min(5, len(items))
                        for item in items[:display_limit]:
                            print(f"   • {item}")
                        if len(items) > display_limit:
                            print(f"   ... and {len(items) - display_limit} more")
    
    def export_json(self, results, output_path):
        """Export results to JSON file"""
        try:
            with open(output_path, 'w', encoding='utf-8') as f:
                json.dump(results, f, indent=2, ensure_ascii=False)
            print(f"\n✅ Results exported to: {output_path}")
        except Exception as e:
            print(f"Error exporting JSON: {e}", file=sys.stderr)


def main():
    parser = argparse.ArgumentParser(
        description='Native Library String Analyzer - Extract and analyze strings from .so files',
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog="""
Examples:
  # Analyze all .so files in APK
  python3 so_string_analyzer.py app.apk
  
  # Analyze specific libraries (DPT-shell)
  python3 so_string_analyzer.py app.apk --target libdpt
  
  # Analyze a single .so file
  python3 so_string_analyzer.py lib/arm64-v8a/libdpt.so
  
  # Show all strings (no limits)
  python3 so_string_analyzer.py app.apk --all
  
  # Export to JSON
  python3 so_string_analyzer.py app.apk --json results.json
  
  # Verbose output
  python3 so_string_analyzer.py app.apk -v
        """
    )
    
    parser.add_argument('input', help='APK file or .so file to analyze')
    parser.add_argument('--target', '-t', action='append', help='Target library name patterns (e.g., libdpt, libbangcle)')
    parser.add_argument('--all', '-a', action='store_true', help='Show all strings (no limit)')
    parser.add_argument('--limit', '-l', type=int, default=10, help='Limit items per category (default: 10)')
    parser.add_argument('--json', '-j', help='Export results to JSON file')
    parser.add_argument('--verbose', '-v', action='store_true', help='Verbose output')
    parser.add_argument('--brief', '-b', action='store_true', help='Brief output (critical findings only)')
    
    args = parser.parse_args()
    
    analyzer = SOStringAnalyzer(verbose=args.verbose)
    
    # Determine input type
    input_path = Path(args.input)
    
    if not input_path.exists():
        print(f"Error: File not found: {args.input}", file=sys.stderr)
        sys.exit(1)
    
    # Analyze
    if input_path.suffix.lower() == '.apk':
        results = analyzer.analyze_apk(str(input_path), target_libs=args.target)
    elif input_path.suffix.lower() == '.so':
        results = analyzer.analyze_file(str(input_path))
    else:
        # Try to analyze as .so file anyway
        results = analyzer.analyze_file(str(input_path))
    
    if not results:
        print("Analysis failed", file=sys.stderr)
        sys.exit(1)
    
    # Print results
    if not args.brief:
        analyzer.print_results(results, show_all=args.all, limit=args.limit)
    else:
        # Brief output - only critical findings
        for result in results:
            print(f"\n{result['file']}:")
            critical_cats = ['dex_files', 'zip_files', 'code_cache_paths', 'encryption_keywords', 'shell_keywords']
            for cat in critical_cats:
                if cat in result['categories']:
                    items = result['categories'][cat]
                    print(f"  {cat}: {len(items)} found")
                    for item in items[:3]:
                        print(f"    - {item}")
    
    # Export JSON if requested
    if args.json:
        analyzer.export_json(results, args.json)
    
    print(f"\n✅ Analysis complete!")


if __name__ == '__main__':
    main()
