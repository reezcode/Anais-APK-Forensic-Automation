#!/usr/bin/env python3
"""
Entropy Analysis Tool for APK Files
Visualizes entropy distribution to identify encrypted/obfuscated regions
Useful for detecting hidden payloads in protected APKs (DexProtector, DPT-Shell, etc.)
"""

import sys
import os
import zipfile
import math
import json
import argparse
from collections import Counter
from pathlib import Path


def calculate_entropy(data):
    """Calculate Shannon entropy of data"""
    if not data:
        return 0.0
    
    entropy = 0.0
    counter = Counter(data)
    length = len(data)
    
    for count in counter.values():
        probability = count / length
        entropy -= probability * math.log2(probability)
    
    return entropy


def analyze_chunk_entropy(data, chunk_size=1024):
    """Analyze entropy across chunks of data"""
    chunks = []
    for i in range(0, len(data), chunk_size):
        chunk = data[i:i+chunk_size]
        if len(chunk) > 0:
            entropy = calculate_entropy(chunk)
            chunks.append({
                'offset': i,
                'size': len(chunk),
                'entropy': entropy,
                'suspicious': entropy > 7.0  # High entropy indicates encryption/compression
            })
    return chunks


def generate_ascii_chart(chunks, width=80, height=20):
    """Generate ASCII art entropy chart"""
    if not chunks:
        return "No data to visualize"
    
    max_entropy = 8.0  # Max theoretical entropy for byte data
    chart = []
    
    # Header
    chart.append("Entropy Distribution Chart (0.0 - 8.0)")
    chart.append("=" * width)
    chart.append("█ = High Entropy (>7.0, likely encrypted)")
    chart.append("▓ = Medium-High (6.0-7.0)")
    chart.append("▒ = Medium (5.0-6.0)")
    chart.append("░ = Low (<5.0, plaintext)")
    chart.append("-" * width)
    
    # Data visualization
    chunk_groups = []
    group_size = max(1, len(chunks) // width)
    
    for i in range(0, len(chunks), group_size):
        group = chunks[i:i+group_size]
        avg_entropy = sum(c['entropy'] for c in group) / len(group)
        chunk_groups.append(avg_entropy)
    
    # Build chart rows
    for row in range(height):
        threshold = max_entropy * (1 - row / height)
        line = ""
        for entropy in chunk_groups:
            if entropy >= threshold:
                if entropy > 7.0:
                    line += "█"
                elif entropy > 6.0:
                    line += "▓"
                elif entropy > 5.0:
                    line += "▒"
                else:
                    line += "░"
            else:
                line += " "
        chart.append(f"{threshold:4.1f} |{line}|")
    
    chart.append("     " + "-" * width)
    chart.append(f"     0{'':>{width-20}}File Length")
    
    return "\n".join(chart)


def analyze_file_entropy(file_path, chunk_size=1024):
    """Analyze entropy of a single file"""
    try:
        with open(file_path, 'rb') as f:
            data = f.read()
        
        overall_entropy = calculate_entropy(data)
        chunks = analyze_chunk_entropy(data, chunk_size)
        
        # Find suspicious regions
        suspicious_regions = [c for c in chunks if c['suspicious']]
        high_entropy_ratio = len(suspicious_regions) / len(chunks) if chunks else 0
        
        return {
            'file': file_path,
            'size': len(data),
            'overall_entropy': overall_entropy,
            'chunks': chunks,
            'suspicious_regions': suspicious_regions,
            'high_entropy_ratio': high_entropy_ratio,
            'chart': generate_ascii_chart(chunks)
        }
    except Exception as e:
        return {
            'file': file_path,
            'error': str(e)
        }


def analyze_apk_entropy(apk_path, output_json, chunk_size=1024):
    """Analyze entropy of files within APK"""
    results = {
        'apk': apk_path,
        'chunk_size': chunk_size,
        'files': [],
        'summary': {}
    }
    
    try:
        with zipfile.ZipFile(apk_path, 'r') as zf:
            # Target files: DEX, SO libraries, and large assets
            target_extensions = ['.dex', '.so', '.dat', '.bin', '.jar']
            target_files = []
            
            for file_info in zf.filelist:
                filename = file_info.filename
                
                # Skip directories
                if filename.endswith('/'):
                    continue
                
                # Check if target file
                is_target = any(filename.endswith(ext) for ext in target_extensions)
                is_large_asset = filename.startswith('assets/') and file_info.file_size > 50000
                
                if is_target or is_large_asset:
                    target_files.append(file_info)
            
            print(f"[*] Analyzing {len(target_files)} files in APK...")
            
            for file_info in target_files:
                filename = file_info.filename
                print(f"[*] Processing: {filename} ({file_info.file_size} bytes)")
                
                try:
                    data = zf.read(filename)
                    overall_entropy = calculate_entropy(data)
                    chunks = analyze_chunk_entropy(data, chunk_size)
                    
                    suspicious_regions = [c for c in chunks if c['suspicious']]
                    high_entropy_ratio = len(suspicious_regions) / len(chunks) if chunks else 0
                    
                    file_result = {
                        'filename': filename,
                        'size': len(data),
                        'overall_entropy': overall_entropy,
                        'high_entropy_ratio': high_entropy_ratio,
                        'suspicious_regions_count': len(suspicious_regions),
                        'chunks': chunks[:100],  # Limit to first 100 chunks for JSON size
                        'assessment': classify_entropy(overall_entropy, high_entropy_ratio)
                    }
                    
                    # Add chart for highly suspicious files
                    if overall_entropy > 7.0 or high_entropy_ratio > 0.5:
                        file_result['chart'] = generate_ascii_chart(chunks, width=60)
                    
                    results['files'].append(file_result)
                    
                except Exception as e:
                    print(f"[!] Error processing {filename}: {e}")
                    results['files'].append({
                        'filename': filename,
                        'error': str(e)
                    })
            
            # Generate summary
            results['summary'] = generate_summary(results['files'])
            
    except Exception as e:
        results['error'] = str(e)
        print(f"[!] Error analyzing APK: {e}")
        return False
    
    # Save results
    try:
        with open(output_json, 'w') as f:
            json.dump(results, f, indent=2)
        print(f"[✓] Results saved to: {output_json}")
        
        # Print summary
        print_summary(results)
        return True
        
    except Exception as e:
        print(f"[!] Error saving results: {e}")
        return False


def classify_entropy(overall_entropy, high_entropy_ratio):
    """Classify file based on entropy characteristics"""
    if overall_entropy > 7.5 and high_entropy_ratio > 0.8:
        return {
            'level': 'CRITICAL',
            'description': 'Heavily encrypted/obfuscated - likely encrypted payload',
            'recommendation': 'Dynamic analysis required - this file is encrypted'
        }
    elif overall_entropy > 7.0 and high_entropy_ratio > 0.5:
        return {
            'level': 'HIGH',
            'description': 'Significant encryption detected',
            'recommendation': 'Contains encrypted sections - monitor for runtime unpacking'
        }
    elif overall_entropy > 6.5 or high_entropy_ratio > 0.3:
        return {
            'level': 'MEDIUM',
            'description': 'Moderate obfuscation or compression',
            'recommendation': 'May contain compressed or partially encrypted data'
        }
    else:
        return {
            'level': 'LOW',
            'description': 'Low entropy - mostly plaintext or uncompressed',
            'recommendation': 'Safe for static analysis'
        }


def generate_summary(files):
    """Generate analysis summary"""
    summary = {
        'total_files': len(files),
        'highly_suspicious': [],
        'suspicious': [],
        'normal': []
    }
    
    for file_data in files:
        if 'error' in file_data:
            continue
        
        assessment = file_data.get('assessment', {})
        level = assessment.get('level', 'UNKNOWN')
        
        entry = {
            'filename': file_data['filename'],
            'entropy': file_data.get('overall_entropy', 0),
            'high_entropy_ratio': file_data.get('high_entropy_ratio', 0)
        }
        
        if level == 'CRITICAL':
            summary['highly_suspicious'].append(entry)
        elif level in ['HIGH', 'MEDIUM']:
            summary['suspicious'].append(entry)
        else:
            summary['normal'].append(entry)
    
    return summary


def print_summary(results):
    """Print analysis summary to console"""
    summary = results['summary']
    
    print("\n" + "="*70)
    print("ENTROPY ANALYSIS SUMMARY")
    print("="*70)
    
    print(f"\n📊 Total Files Analyzed: {summary['total_files']}")
    
    if summary['highly_suspicious']:
        print(f"\n🔴 HIGHLY SUSPICIOUS ({len(summary['highly_suspicious'])} files):")
        for file in summary['highly_suspicious']:
            print(f"  • {file['filename']}")
            print(f"    Entropy: {file['entropy']:.2f} | High Entropy Ratio: {file['high_entropy_ratio']:.1%}")
    
    if summary['suspicious']:
        print(f"\n🟡 SUSPICIOUS ({len(summary['suspicious'])} files):")
        for file in summary['suspicious']:
            print(f"  • {file['filename']}")
            print(f"    Entropy: {file['entropy']:.2f} | High Entropy Ratio: {file['high_entropy_ratio']:.1%}")
    
    if summary['normal']:
        print(f"\n🟢 NORMAL ({len(summary['normal'])} files)")
    
    print("\n" + "="*70)
    
    # Show charts for highly suspicious files
    for file_data in results['files']:
        if file_data.get('assessment', {}).get('level') == 'CRITICAL':
            print(f"\n📈 CHART: {file_data['filename']}")
            print(file_data.get('chart', 'No chart available'))
            print()


def main():
    parser = argparse.ArgumentParser(
        description='Entropy Analysis Tool - Detect encrypted/obfuscated regions in APK files'
    )
    parser.add_argument('apk_path', help='Path to APK file')
    parser.add_argument('output_json', help='Path to output JSON file')
    parser.add_argument('--chunk-size', type=int, default=1024,
                       help='Chunk size for entropy analysis (default: 1024 bytes)')
    parser.add_argument('--verbose', action='store_true',
                       help='Verbose output')
    
    args = parser.parse_args()
    
    if not os.path.exists(args.apk_path):
        print(f"[!] Error: APK file not found: {args.apk_path}")
        sys.exit(1)
    
    success = analyze_apk_entropy(args.apk_path, args.output_json, args.chunk_size)
    sys.exit(0 if success else 1)


if __name__ == '__main__':
    main()
