#!/bin/bash

#################################################
# Anais Static Core
# Author: Reezcode24
# Date: 2026-01-23
# Description: Comprehensive APK analysis with multiple protection bypass techniques
# Supports: macOS, Linux, Windows (WSL/Git Bash)
#################################################

set -e

# Suppress Python warnings globally
export PYTHONWARNINGS="ignore"

# Detect OS
detect_os() {
    case "$(uname -s)" in
        Darwin*)
            echo "macos"
            ;;
        Linux*)
            echo "linux"
            ;;
        CYGWIN*|MINGW*|MSYS*)
            echo "windows"
            ;;
        *)
            echo "unknown"
            ;;
    esac
}

OS_TYPE=$(detect_os)

# Colors for output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
MAGENTA='\033[0;35m'
CYAN='\033[0;36m'
NC='\033[0m' # No Color

# Configuration
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
TOOLS_DIR="${SCRIPT_DIR}/analysis_tools"
CONFIG_FILE="${SCRIPT_DIR}/analyzer_config.json"
ERROR_LOG="${SCRIPT_DIR}/analysis_errors.log"

# Workspace location, resolved in priority order:
#   1. ANAIS_WORKSPACE environment variable
#   2. paths.workspace in analyzer_config.json
#   3. default ~/.anais/reports
# Default is deliberately NOT ~/Documents: that folder syncs to iCloud on macOS,
# which evicts large decompiled trees and makes later reads block on download.
resolve_workspace() {
    if [ -n "$ANAIS_WORKSPACE" ]; then
        echo "$ANAIS_WORKSPACE"
        return
    fi
    if [ -f "$CONFIG_FILE" ]; then
        local cfg
        cfg=$(python3 -c "
import json, os
try:
    p = json.load(open('$CONFIG_FILE')).get('paths', {}).get('workspace', '')
    print(os.path.expanduser(p) if p else '')
except Exception:
    print('')
" 2>/dev/null)
        if [ -n "$cfg" ]; then
            echo "$cfg"
            return
        fi
    fi
    echo "${HOME}/.anais/reports"
}

WORK_DIR="$(resolve_workspace)"

# Ensure workspace directory exists
if [ ! -d "$WORK_DIR" ]; then
    mkdir -p "$WORK_DIR/reports"
fi

# Banner
print_banner() {
    echo -e "${CYAN}"
    echo "╔═══════════════════════════════════════════════════════════╗"
    echo "║   Anais Static Core v1.1                                  ║"
    echo "║   Comprehensive APK Security Analysis & SAST              ║"
    echo "╚═══════════════════════════════════════════════════════════╝"
    echo -e "${NC}"
}

# Logging functions
log_info() {
    echo -e "${BLUE}[INFO]${NC} $1"
}

log_success() {
    echo -e "${GREEN}[✓]${NC} $1"
}

log_warning() {
    echo -e "${YELLOW}[WARNING]${NC} $1"
    echo "[$(date '+%Y-%m-%d %H:%M:%S')] [WARNING] $1" >> "$ERROR_LOG" 2>/dev/null || true
}

log_error() {
    echo -e "${RED}[ERROR]${NC} $1"
    echo "[$(date '+%Y-%m-%d %H:%M:%S')] [ERROR] $1" >> "$ERROR_LOG" 2>/dev/null || true
}

log_error_detail() {
    # Log detailed error to file only
    echo "[$(date '+%Y-%m-%d %H:%M:%S')] [ERROR DETAIL] $1" >> "$ERROR_LOG" 2>/dev/null || true
}

log_critical() {
    echo -e "${RED}[CRITICAL]${NC} $1"
    echo "[$(date '+%Y-%m-%d %H:%M:%S')] [CRITICAL] $1" >> "$ERROR_LOG" 2>/dev/null || true
}

log_section() {
    echo -e "\n${MAGENTA}═══ $1 ═══${NC}\n"
}

# Check dependencies
check_dependencies() {
    log_section "Checking Dependencies"
    
    local missing_deps=()
    
    # Core tools
    command -v python3 >/dev/null 2>&1 || missing_deps+=("python3")
    command -v java >/dev/null 2>&1 || missing_deps+=("java")
    command -v apktool >/dev/null 2>&1 || missing_deps+=("apktool")
    command -v jadx >/dev/null 2>&1 || missing_deps+=("jadx")
    command -v yara >/dev/null 2>&1 || missing_deps+=("yara")
    command -v unzip >/dev/null 2>&1 || missing_deps+=("unzip")
    command -v zipinfo >/dev/null 2>&1 || missing_deps+=("zipinfo")
    command -v xxd >/dev/null 2>&1 || missing_deps+=("xxd")
    
    # Python modules check
    python3 -c "import androguard" 2>/dev/null || log_warning "androguard not installed (pip3 install androguard)"
    python3 -c "import yara" 2>/dev/null || log_warning "yara-python not installed (pip3 install yara-python)"
    python3 -c "import requests" 2>/dev/null || log_warning "requests not installed (pip3 install requests)"
    
    if [ ${#missing_deps[@]} -ne 0 ]; then
        log_error "Missing dependencies: ${missing_deps[*]}"
        
        # OS-specific installation instructions
        case "$OS_TYPE" in
            macos)
                log_info "Install using: brew install ${missing_deps[*]}"
                ;;
            linux)
                log_info "Install using: sudo apt-get install ${missing_deps[*]} (Debian/Ubuntu)"
                log_info "Or: sudo yum install ${missing_deps[*]} (RedHat/CentOS)"
                ;;
            windows)
                log_info "Windows detected - ensure you're running in WSL or Git Bash"
                log_info "Install using package manager in your environment"
                ;;
            *)
                log_info "Install the missing dependencies using your system's package manager"
                ;;
        esac
        exit 1
    fi
    
    log_success "All core dependencies satisfied"
    log_info "Running on: $OS_TYPE"
}

# Initialize workspace
init_workspace() {
    local apk_path="$1"
    local apk_name=$(basename "$apk_path")
    apk_name="${apk_name%.*}"

    APK_WORK_DIR="${WORK_DIR}/${apk_name}_$(date +%Y%m%d_%H%M%S)"
    DECOMPILED_DIR="${APK_WORK_DIR}/decompiled"
    JADX_OUTPUT="${APK_WORK_DIR}/jadx_output"
    TEMP_DIR="${APK_WORK_DIR}/temp"
    REPORTS_DIR="${APK_WORK_DIR}/reports"
    REPORT_FILE="${REPORTS_DIR}/report.md"
    JSON_REPORT="${REPORTS_DIR}/report.json"
    
    mkdir -p "$APK_WORK_DIR" "$DECOMPILED_DIR" "$JADX_OUTPUT" "$TEMP_DIR" "$REPORTS_DIR"
    
    log_success "Workspace initialized: $APK_WORK_DIR"
}

# Normalize the input container (XAPK/APKM/APKS/AAB) to a single base APK.
# Sets APK_PATH to the resolved base APK; records bundle structure for the report.
prepare_input() {
    log_section "Preparing Input"

    local prepared_dir="${TEMP_DIR}/prepared"
    mkdir -p "$prepared_dir"

    local out
    if out=$(python3 "${TOOLS_DIR}/prepare_input.py" \
        "$APK_PATH" "$prepared_dir" "${TEMP_DIR}/prepare_input.json" 2>> "$ERROR_LOG"); then
        echo "$out" | grep -v '^BASE_APK=' || true
        local base
        base=$(echo "$out" | sed -n 's/^BASE_APK=//p' | tail -1)
        if [ -n "$base" ] && [ -f "$base" ]; then
            APK_PATH="$base"
            log_success "Using base APK: $(basename "$APK_PATH")"
        else
            log_warning "Input preparation returned no base APK; using original input"
        fi
    else
        log_warning "Input preparation failed; using original input as-is"
    fi
}

# APK Basic Info Extraction
extract_basic_info() {
    log_section "Extracting Basic APK Information"
    
    local apk_path="$1"
    
    # File hash (cross-platform)
    SHA256=$( (shasum -a 256 "$apk_path" 2>/dev/null || sha256sum "$apk_path") | awk '{print $1}')
    
    # MD5 (cross-platform)
    if [ "$OS_TYPE" = "macos" ]; then
        MD5=$(md5 -q "$apk_path")
    else
        MD5=$(md5sum "$apk_path" | awk '{print $1}')
    fi
    
    # File size (cross-platform)
    if [ "$OS_TYPE" = "macos" ]; then
        FILE_SIZE=$(stat -f%z "$apk_path")
    else
        FILE_SIZE=$(stat -c%s "$apk_path")
    fi
    
    log_info "SHA256: $SHA256"
    log_info "MD5: $MD5"
    log_info "Size: $FILE_SIZE bytes"
    
    # Try to get basic APK info using aapt
    if command -v aapt >/dev/null 2>&1; then
        aapt dump badging "$apk_path" > "${TEMP_DIR}/aapt_info.txt" 2>/dev/null || true
    fi
    
    # Use Python androguard for detailed analysis
    python3 "${TOOLS_DIR}/apk_basic_info.py" "$apk_path" "${TEMP_DIR}/basic_info.json" || true
}

# Check if APK is encrypted/password protected
check_apk_protection() {
    log_section "Checking APK Protection Mechanisms" 

    local apk_path="$1"
    
    # Test unzip
    if ! unzip -t "$apk_path" >/dev/null 2>&1; then
        log_warning "APK appears to be corrupted or encrypted"
        
        # Check ZIP encryption flags
        python3 "${TOOLS_DIR}/check_zip_encryption.py" "$apk_path" "${TEMP_DIR}/encryption_check.json"
        
        # Attempt header manipulation
        if [ -f "${TEMP_DIR}/encryption_check.json" ]; then
            local is_encrypted=$(python3 -c "import json; print(json.load(open('${TEMP_DIR}/encryption_check.json'))['encrypted'])")
            
            if [ "$is_encrypted" = "True" ]; then
                log_warning "Attempting to fix ZIP headers..."
                python3 "${TOOLS_DIR}/fix_apk_headers.py" "$apk_path" "${TEMP_DIR}/fixed_apk.apk"
                
                if [ -f "${TEMP_DIR}/fixed_apk.apk" ]; then
                    log_success "Headers fixed, using modified APK"
                    APK_TO_ANALYZE="${TEMP_DIR}/fixed_apk.apk"
                    return 0
                else
                    log_error "Failed to fix APK headers"
                    return 1
                fi
            else
                log_warning "ZIP test failed but archive is not flagged as encrypted"
                log_info "Continuing analysis with original APK"
                APK_TO_ANALYZE="$apk_path"
                return 0
            fi
        fi

        log_error "Unable to determine encryption state"
        return 1
    else
        log_success "APK is not encrypted"
        APK_TO_ANALYZE="$apk_path"
        return 0
    fi
}

# Decompile with apktool
decompile_apktool() {
    log_section "Decompiling with APKTool"
    
    local apk_path="$1"
    
    if apktool d -f -o "$DECOMPILED_DIR" "$apk_path" 2>&1 | tee "${TEMP_DIR}/apktool.log"; then
        log_success "APKTool decompilation successful"
        return 0
    else
        log_error "APKTool decompilation failed"
        return 1
    fi
}

# Decompile with JADX
decompile_jadx() {
    log_section "Decompiling with JADX"
    
    local apk_path="$1"
    
    if jadx -d "$JADX_OUTPUT" "$apk_path" 2>&1 | tee "${TEMP_DIR}/jadx.log"; then
        log_success "JADX decompilation successful"
        return 0
    else
        log_error "JADX decompilation failed"
        return 1
    fi
}

# Analyze protection libraries
analyze_protection_libraries() {
    log_section "Analyzing Protection Libraries"
    
    local protection_type="$1"
    local target_libs=()
    
    # Map protection type to library names
    case "$protection_type" in
        "dpt-shell")
            target_libs=("libdpt")
            log_info "Targeting DPT-Shell libraries: libdpt.so"
            ;;
        "bangcle")
            target_libs=("libbangcle" "libsecexe" "libDexHelper")
            log_info "Targeting Bangcle libraries: libbangcle*.so, libsecexe.so"
            ;;
        "qihoo-360"|"jiagu")
            target_libs=("libjiagu" "libjiagu_art" "libjiagu_dvm")
            log_info "Targeting Qihoo 360 libraries: libjiagu*.so"
            ;;
        "dexprotector")
            target_libs=("libprotect" "libdexprotector")
            log_info "Targeting DexProtector libraries: libprotect*.so"
            ;;
        "secneo")
            target_libs=("libshell" "libsecexe")
            log_info "Targeting SecNeo libraries: libshell*.so"
            ;;
        *)
            log_info "Unknown protection type: $protection_type"
            log_info "Analyzing all suspicious .so files"
            # Will analyze all .so files if found
            ;;
    esac
    
    # Build target arguments
    local target_args=""
    for lib in "${target_libs[@]}"; do
        target_args="$target_args --target $lib"
    done
    
    # Run SO String Analyzer
    log_info "Extracting strings from protection libraries..."
    
    if [ -n "$target_args" ]; then
        # Analyze specific targets
        if python3 "${TOOLS_DIR}/so_string_analyzer.py" \
            "$APK_PATH" \
            $target_args \
            --json "${TEMP_DIR}/so_strings.json" \
            --limit 20 2>> "$ERROR_LOG"; then
            log_success "Protection library analysis completed"
            
            # Show brief summary
            if [ -f "${TEMP_DIR}/so_strings.json" ]; then
                log_info "String extraction summary:"
                python3 -c "
import json
try:
    data = json.load(open('${TEMP_DIR}/so_strings.json'))
    for result in data:
        cats = result.get('categories', {})
        critical = ['dex_files', 'zip_files', 'code_cache_paths']
        for cat in critical:
            if cat in cats:
                items = cats[cat]
                print(f'  🎯 {cat}: {len(items)} found')
                for item in items[:2]:
                    print(f'     • {item}')
except Exception as e:
    pass
" 2>/dev/null || true
            fi
        else
            log_warning "SO string analysis completed but no output file generated"
        fi
    else
        # Analyze all .so files (no specific targets)
        log_info "No specific targets - scanning all native libraries..."
        
        # Just extract and log the presence of .so files
        python3 -c "
import zipfile
import sys
try:
    with zipfile.ZipFile('$APK_PATH', 'r') as zf:
        so_files = [f.filename for f in zf.filelist if f.filename.endswith('.so')]
        if so_files:
            print(f'Found {len(so_files)} .so file(s)')
            for so in so_files[:5]:
                print(f'  • {so}')
            if len(so_files) > 5:
                print(f'  ... and {len(so_files) - 5} more')
except Exception as e:
    print(f'Error: {e}', file=sys.stderr)
" 2>/dev/null || log_info "No native libraries found or error reading APK"
    fi
}

# Detect obfuscation
detect_obfuscation() {
    log_section "Detecting Obfuscation Techniques"
    
    # Generate basic APK info first if not exists
    if [ ! -f "${TEMP_DIR}/basic_info.json" ]; then
        python3 "${TOOLS_DIR}/apk_basic_info.py" "$APK_PATH" "${TEMP_DIR}/basic_info.json" 2>> "$ERROR_LOG" || true
    fi
    
    # First run DEX payload hunter to find encrypted payloads
    log_info "Hunting for encrypted DEX payloads..."
    local package_name=$(python3 -c "import json; f=open('${TEMP_DIR}/basic_info.json'); print(json.load(f).get('package_name', ''))" 2>> "$ERROR_LOG" || echo "")
    
    if python3 "${TOOLS_DIR}/dex_payload_hunter.py" \
        "$APK_PATH" \
        "${TEMP_DIR}/dex_payload_report.json" \
        "$package_name" --brief 2>> "$ERROR_LOG"; then
        log_success "DEX payload analysis completed"
    else
        log_warning "DEX payload hunter encountered issues (check $ERROR_LOG)"
    fi
    
    # Then run standard obfuscation detection
    if python3 "${TOOLS_DIR}/detect_obfuscation.py" \
        "$APK_PATH" \
        "$DECOMPILED_DIR" \
        "$JADX_OUTPUT" \
        "${TEMP_DIR}/obfuscation_report.json" 2>> "$ERROR_LOG"; then
        log_success "Obfuscation detection completed"
    else
        log_error "Obfuscation detection failed (check $ERROR_LOG for details)"
        return 1
    fi
    
    if [ -f "${TEMP_DIR}/obfuscation_report.json" ]; then
        local obf_type=$(python3 -c "import json; print(json.load(open('${TEMP_DIR}/obfuscation_report.json'))['type'])" 2>/dev/null || echo "unknown")
        log_info "Obfuscation type detected: $obf_type"
        
        # Check if DEX payload hunter found encrypted payloads
        local stub_detected=$(python3 -c "import json; print(json.load(open('${TEMP_DIR}/dex_payload_report.json')).get('stub_dex_detected', False))" 2>/dev/null || echo "False")
        local payload_count=$(python3 -c "import json; print(len(json.load(open('${TEMP_DIR}/dex_payload_report.json')).get('encrypted_payloads', [])))" 2>/dev/null || echo "0")
        
        if [ "$stub_detected" = "True" ] || [ "$payload_count" -gt 0 ]; then
            log_warning "🔒 ENCRYPTED DEX DETECTED!"
            log_info "Stub DEX: $stub_detected | Encrypted Payloads: $payload_count"
            log_info ""
            log_warning "Real DEX is NOT in the APK - it will be unpacked at runtime"
            log_info ""
        fi
        
        case "$obf_type" in
            "dpt-shell"|"dexprotector"|"bangcle"|"qihoo-360"|"jiagu"|"secneo")
                log_warning "Advanced protection detected: $obf_type"
                
                # Run SO String Analyzer for protection libraries
                log_info ""
                log_info "🔍 Analyzing protection library strings..."
                analyze_protection_libraries "$obf_type"
                
                log_info ""
                log_info "📍 DYNAMIC ANALYSIS REQUIRED:"
                log_info "  1. Install APK on rooted device/emulator"
                log_info "  2. Run app to trigger DEX unpacking"
                log_info "  3. Monitor these locations for unpacked DEX:"
                
                # Show top 3 likely unpack locations
                python3 -c "
import json
data = json.load(open('${TEMP_DIR}/dex_payload_report.json'))
for loc in data.get('likely_unpack_locations', [])[:3]:
    if loc['priority'] == 'HIGH':
        print(f\"     • {loc['path']}\")
" 2>/dev/null
                
                log_info "  4. Use Frida to dump DEX from memory:"
                log_info "     frida -U -l scripts/frida/frida_dex_dump.js -f <package>"
                log_info "  5. Pull dumped DEX files for re-analysis"
                log_info ""
                echo "$obf_type" > "${TEMP_DIR}/protection_type.txt"
                ;;
            "proguard"|"r8")
                log_info "Standard obfuscation detected: $obf_type"
                log_info "Proceeding with static analysis..."
                ;;
            *)
                log_info "No significant obfuscation detected or unknown type"
                ;;
        esac
    fi
}

detect_framework() {
    log_section "Detecting Cross-Platform Framework"

    if python3 "${TOOLS_DIR}/detect_framework.py" \
        "$APK_PATH" \
        "$DECOMPILED_DIR" \
        "${TEMP_DIR}/framework_report.json" 2>> "$ERROR_LOG"; then
        log_success "Framework detection completed"

        if [ -f "${TEMP_DIR}/framework_report.json" ]; then
            local primary=$(python3 -c "import json; print(json.load(open('${TEMP_DIR}/framework_report.json')).get('primary','Native / Java-Kotlin'))" 2>/dev/null || echo "unknown")
            log_info "Primary framework: $primary"
            local warn=$(python3 -c "import json; print(json.load(open('${TEMP_DIR}/framework_report.json')).get('coverage_warning') or '')" 2>/dev/null || echo "")
            if [ -n "$warn" ]; then
                log_warning "$warn"
            fi
        fi
    else
        log_warning "Framework detection had issues (check $ERROR_LOG)"
    fi
}

detect_rasp() {
    log_section "Detecting RASP / Protection Solutions"

    if python3 "${TOOLS_DIR}/detect_rasp.py" \
        "$APK_TO_ANALYZE" \
        "$DECOMPILED_DIR" \
        "$JADX_OUTPUT" \
        "${TEMP_DIR}/rasp_report.json" 2>> "$ERROR_LOG"; then
        log_success "RASP detection completed"

        if [ -f "${TEMP_DIR}/rasp_report.json" ]; then
            local rasp_summary=$(python3 -c "import json; d=json.load(open('${TEMP_DIR}/rasp_report.json')); print(', '.join(f'{k} ({v}%)' for k, v in d.get('protection_details', {}).items()) or d.get('type', 'None Detected'))" 2>/dev/null || echo "None Detected")
            if [ "$rasp_summary" != "None Detected" ]; then
                log_warning "Detected Protection/RASP: $rasp_summary"
            else
                log_info "No known RASP solution detected"
            fi
        fi
    else
        # Non-fatal: set -e would otherwise abort the remaining pipeline
        log_warning "RASP detection encountered issues (check $ERROR_LOG)"
    fi
}

# Run entropy analysis
run_entropy_analysis() {
    log_section "Running Entropy Analysis"
    
    local apk_path="$1"
    
    log_info "Analyzing file entropy to detect encrypted/obfuscated regions..."
    
    if python3 "${TOOLS_DIR}/entropy_analyzer.py" \
        "$apk_path" \
        "${TEMP_DIR}/entropy_analysis.json" \
        --chunk-size 2048 2>> "$ERROR_LOG"; then
        
        log_success "Entropy analysis completed"
        
        # Check for highly suspicious files
        if [ -f "${TEMP_DIR}/entropy_analysis.json" ]; then
            local critical_count=$(python3 -c "import json; d=json.load(open('${TEMP_DIR}/entropy_analysis.json')); print(len(d.get('summary', {}).get('highly_suspicious', [])))" 2>/dev/null || echo "0")
            local suspicious_count=$(python3 -c "import json; d=json.load(open('${TEMP_DIR}/entropy_analysis.json')); print(len(d.get('summary', {}).get('suspicious', [])))" 2>/dev/null || echo "0")
            
            if [ "$critical_count" -gt 0 ]; then
                log_warning "🔴 ${critical_count} highly encrypted file(s) detected!"
                log_info "High entropy indicates encrypted payloads - check entropy charts in report"
            fi
            
            if [ "$suspicious_count" -gt 0 ]; then
                log_info "🟡 ${suspicious_count} suspicious file(s) with elevated entropy"
            fi
        fi
    else
        log_warning "Entropy analysis encountered issues (check error log)"
    fi
}

# Scan every file named in a list with YARA, printing `yara -s` output.
# Usage: yara_scan_list <list_file> <threads> <rule_file>...
yara_scan_list() {
    local list="$1" threads="$2"
    shift 2
    [ -s "$list" ] || return 0
    if yara --help 2>&1 | grep -q -- "--scan-list"; then
        yara -s -p "$threads" --scan-list "$@" "$list" 2>/dev/null || true
    else
        # yara older than 4.1 has no --scan-list: fall back to one process per file.
        while IFS= read -r file; do
            yara -s "$@" "$file" 2>/dev/null || true
        done < "$list"
    fi
}

# Run YARA rules
run_yara_scan() {
    log_section "Running YARA Rules"
    
    local apk_path="$1"
    
    # Build YARA command array
    local yara_args=()
    for rule in "${YARA_RULES[@]}"; do
        if [ -f "$rule" ]; then
            yara_args+=("$rule")
            log_info "Using YARA rules: $rule"
        else
            log_warning "YARA rule file not found: $rule"
        fi
    done
    
    if [ ${#yara_args[@]} -eq 0 ]; then
        log_warning "No valid YARA rules found. Skipping YARA scan."
        return 1
    fi
    
    # Scan original APK
    log_info "Scanning original APK..."
    yara -s "${yara_args[@]}" "$apk_path" > "${TEMP_DIR}/yara_apk_results.txt" 2>&1 || true
    
    # Scan each tree with one yara process over a file list: one yara per file
    # recompiles the rules every time and takes tens of minutes on a large app.
    local threads
    threads=$(getconf _NPROCESSORS_ONLN 2>/dev/null || echo 4)

    # Scan decompiled directory
    if [ -d "$DECOMPILED_DIR" ]; then
        log_info "Scanning decompiled files..."
        find "$DECOMPILED_DIR" -type f \( -name "*.smali" -o -name "*.xml" \) > "${TEMP_DIR}/yara_decompiled_files.txt"
        yara_scan_list "${TEMP_DIR}/yara_decompiled_files.txt" "$threads" "${yara_args[@]}" \
            > "${TEMP_DIR}/yara_decompiled_results.txt"
    fi

    # Scan JADX output
    if [ -d "$JADX_OUTPUT" ]; then
        log_info "Scanning JADX sources..."
        find "$JADX_OUTPUT" -type f -name "*.java" > "${TEMP_DIR}/yara_jadx_files.txt"
        yara_scan_list "${TEMP_DIR}/yara_jadx_files.txt" "$threads" "${yara_args[@]}" \
            > "${TEMP_DIR}/yara_jadx_results.txt"
    fi
    
    log_success "YARA scan completed"
    
    # Process YARA results with enhanced analyzer
    log_info "Processing YARA results..."
    if python3 "${TOOLS_DIR}/yara_enhanced_analyzer.py" \
        "$TEMP_DIR" \
        "${TEMP_DIR}/yara_enhanced.json" \
        "${yara_args[@]}" 2>> "$ERROR_LOG"; then
        
        # Show summary
        if [ -f "${TEMP_DIR}/yara_enhanced.json" ]; then
            local total_rules=$(python3 -c "import json; print(json.load(open('${TEMP_DIR}/yara_enhanced.json'))['summary']['total_rules_checked'])" 2>/dev/null || echo "0")
            local matched_rules=$(python3 -c "import json; print(json.load(open('${TEMP_DIR}/yara_enhanced.json'))['summary']['rules_matched'])" 2>/dev/null || echo "0")
            local critical=$(python3 -c "import json; print(json.load(open('${TEMP_DIR}/yara_enhanced.json'))['summary']['critical_findings'])" 2>/dev/null || echo "0")
            local high=$(python3 -c "import json; print(json.load(open('${TEMP_DIR}/yara_enhanced.json'))['summary']['high_severity'])" 2>/dev/null || echo "0")
            
            log_success "YARA analysis complete"
            log_info "Rules: ${matched_rules}/${total_rules} matched | 🔴 ${critical} Critical | 🟠 ${high} High"
        fi
    else
        log_warning "YARA result processing had issues"
    fi
}

# Static Application Security Testing (SAST)
run_sast_analysis() {
    log_section "Running SAST Analysis"
    
    # Run comprehensive SAST
    if python3 "${TOOLS_DIR}/sast_scanner.py" \
        --apk "$APK_TO_ANALYZE" \
        --decompiled "$DECOMPILED_DIR" \
        --jadx "$JADX_OUTPUT" \
        --output "${TEMP_DIR}/sast_findings.json" 2>> "$ERROR_LOG"; then
        
        # Show summary with accurate counts
        if [ -f "${TEMP_DIR}/sast_findings.json" ]; then
            local critical=$(python3 -c "import json; d=json.load(open('${TEMP_DIR}/sast_findings.json')); print(len(d.get('critical', [])))" 2>/dev/null || echo "0")
            local high=$(python3 -c "import json; d=json.load(open('${TEMP_DIR}/sast_findings.json')); print(len(d.get('high', [])))" 2>/dev/null || echo "0")
            local medium=$(python3 -c "import json; d=json.load(open('${TEMP_DIR}/sast_findings.json')); print(len(d.get('medium', [])))" 2>/dev/null || echo "0")
            local total=$((critical + high + medium))
            
            log_success "SAST analysis completed"
            log_info "Findings: 🔴 ${critical} Critical | 🟠 ${high} High | 🟡 ${medium} Medium | Total: ${total}"
        else
            log_success "SAST analysis completed"
        fi
    else
        log_warning "SAST analysis had issues (check error log)"
    fi
}

# Inventory third-party SDKs (offline; set ANAIS_CVE_ONLINE=1 for OSV lookup)
inventory_sdks() {
    log_section "Inventorying Third-Party SDKs"

    local online_flag=""
    if [ "$ANAIS_CVE_ONLINE" = "1" ]; then
        online_flag="--online"
    fi

    if python3 "${TOOLS_DIR}/sdk_inventory.py" \
        "$DECOMPILED_DIR" \
        "$JADX_OUTPUT" \
        "${TEMP_DIR}/sdk_inventory.json" \
        $online_flag 2>> "$ERROR_LOG"; then
        if [ -f "${TEMP_DIR}/sdk_inventory.json" ]; then
            local n=$(python3 -c "import json; print(json.load(open('${TEMP_DIR}/sdk_inventory.json')).get('total',0))" 2>/dev/null || echo "0")
            local t=$(python3 -c "import json; print(len(json.load(open('${TEMP_DIR}/sdk_inventory.json')).get('trackers',[])))" 2>/dev/null || echo "0")
            log_success "SDK inventory completed"
            log_info "Detected ${n} SDK(s) | ${t} tracker/ad/analytics"
        fi
    else
        log_warning "SDK inventory had issues (check error log)"
    fi
}

# Analyze APK signing block and certificates
analyze_signing() {
    log_section "Analyzing APK Signing"

    if python3 "${TOOLS_DIR}/signing_analyzer.py" \
        "$APK_TO_ANALYZE" \
        "${TEMP_DIR}/signing_analysis.json" 2>> "$ERROR_LOG"; then

        if [ -f "${TEMP_DIR}/signing_analysis.json" ]; then
            local schemes=$(python3 -c "import json; d=json.load(open('${TEMP_DIR}/signing_analysis.json')); print(','.join(k for k,v in d.get('schemes',{}).items() if v) or 'none')" 2>/dev/null || echo "unknown")
            local nfind=$(python3 -c "import json; print(len(json.load(open('${TEMP_DIR}/signing_analysis.json')).get('findings', [])))" 2>/dev/null || echo "0")
            log_success "Signing analysis completed"
            log_info "Signature schemes: ${schemes} | Findings: ${nfind}"
        fi
    else
        log_warning "Signing analysis had issues (check error log)"
    fi
}

# Analyze AndroidManifest
analyze_manifest() {
    log_section "Analyzing AndroidManifest.xml"
    
    if [ -f "${DECOMPILED_DIR}/AndroidManifest.xml" ]; then
        if python3 "${TOOLS_DIR}/manifest_analyzer.py" \
            "${DECOMPILED_DIR}/AndroidManifest.xml" \
            "${TEMP_DIR}/manifest_findings.json" 2>> "$ERROR_LOG"; then
            
            # Show summary with accurate counts
            if [ -f "${TEMP_DIR}/manifest_findings.json" ]; then
                local findings=$(python3 -c "import json; d=json.load(open('${TEMP_DIR}/manifest_findings.json')); print(len(d.get('findings', [])))" 2>/dev/null || echo "0")
                log_success "Manifest analysis completed"
                log_info "Findings: ${findings} issue(s) detected"
            else
                log_success "Manifest analysis completed"
            fi
        else
            log_warning "Manifest analysis had issues (check error log)"
        fi
    else
        log_warning "AndroidManifest.xml not found"
    fi
}

# Network artifacts analysis
analyze_network_artifacts() {
    log_section "Analyzing Network Artifacts"
    
    if python3 "${TOOLS_DIR}/network_analyzer.py" \
        --decompiled "$DECOMPILED_DIR" \
        --jadx "$JADX_OUTPUT" \
        --output "${TEMP_DIR}/network_findings.json" 2>> "$ERROR_LOG"; then
        
        # Show summary with accurate counts
        if [ -f "${TEMP_DIR}/network_findings.json" ]; then
            local urls=$(python3 -c "import json; d=json.load(open('${TEMP_DIR}/network_findings.json')); print(len(d.get('urls', [])))" 2>/dev/null || echo "0")
            local suspicious=$(python3 -c "import json; d=json.load(open('${TEMP_DIR}/network_findings.json')); print(len(d.get('suspicious_urls', [])))" 2>/dev/null || echo "0")
            log_success "Network analysis completed"
            log_info "Found: ${urls} URL(s) | 🚨 ${suspicious} Suspicious"
        else
            log_success "Network analysis completed"
        fi
    else
        log_warning "Network analysis had issues (check error log)"
    fi
}

# Generate comprehensive report
generate_report() {
    log_section "Generating Analysis Report"
    
    # Use modular report generator for separate pages
    if python3 "${TOOLS_DIR}/report_generator_modular.py" \
        "$APK_WORK_DIR" \
        "$TEMP_DIR" \
        "$(basename "$APK_PATH")" \
        "$SHA256" \
        --output-md "report.md" \
        --output-json "report.json" 2>> "$ERROR_LOG"; then
        
        # Update report file paths
        REPORT_FILE="$REPORTS_DIR/report.md"
        JSON_REPORT="$REPORTS_DIR/report.json"
        
        # Copy cumulative error log to reports folder
        if [ -f "$ERROR_LOG" ] && [ -s "$ERROR_LOG" ]; then
            cp "$ERROR_LOG" "$REPORTS_DIR/analysis_errors.log"
            log_info "Error log copied to reports folder"
        fi
        
        log_success "Main report: $REPORT_FILE"
        log_success "Detailed reports in: $REPORTS_DIR/"
        log_success "  - entropy_analysis.md (🆕 Encrypted Payload Detection)"
        log_success "  - sast_findings.md"
        log_success "  - manifest_analysis.md"
        log_success "  - network_analysis.md"
        log_success "  - yara_results.md (🆕 Enhanced with Categorization)"
        log_success "  - recommendations.md"
    else
        log_error "Report generation failed (check $ERROR_LOG for details)"
    fi
}

# Optional deep-analysis bridge to REA (gated on ANAIS_REA=1)
run_rea_bridge() {
    if [ "$ANAIS_REA" != "1" ]; then
        return 0
    fi
    log_section "REA Bridge (deep analysis)"

    if python3 "${TOOLS_DIR}/rea_bridge.py" \
        "$APK_PATH" \
        "$DECOMPILED_DIR" \
        "$TEMP_DIR" \
        "${TEMP_DIR}/rea_report.json" \
        "${REPORTS_DIR}/rea_targets.json" 2>> "$ERROR_LOG"; then
        if [ -f "${TEMP_DIR}/rea_report.json" ]; then
            local ok=$(python3 -c "import json; d=json.load(open('${TEMP_DIR}/rea_report.json')); print(sum(1 for r in d.get('runs',[]) if 'evidence_id' in r))" 2>/dev/null || echo "0")
            local tot=$(python3 -c "import json; print(len(json.load(open('${TEMP_DIR}/rea_report.json')).get('runs',[])))" 2>/dev/null || echo "0")
            log_success "REA bridge completed (${ok}/${tot} analyses)"
            log_info "Deep-dive targets: ${REPORTS_DIR}/rea_targets.json"
            log_info "Agent-driven deep pass: see docs/reema/rea-deep-pass.md (merge with rea_deep.py)"
        fi
    else
        log_warning "REA bridge had issues (check $ERROR_LOG)"
    fi
}

# Generate derived outputs: a tailored Frida script and a SARIF export
generate_outputs() {
    log_section "Generating Derived Outputs"

    local pkg=$(python3 -c "import json; print(json.load(open('${TEMP_DIR}/basic_info.json')).get('package_name','') or '<package.name>')" 2>/dev/null || echo "<package.name>")

    if python3 "${TOOLS_DIR}/frida_script_generator.py" \
        "$TEMP_DIR" "${REPORTS_DIR}/frida_auto.js" "$pkg" 2>> "$ERROR_LOG"; then
        log_success "Frida script: ${REPORTS_DIR}/frida_auto.js"
    else
        log_warning "Frida script generation had issues (check error log)"
    fi

    # Reema normalized findings (common schema, see docs/reema/finding-schema.md)
    if PYTHONPATH="${SCRIPT_DIR}${PYTHONPATH:+:$PYTHONPATH}" python3 -m reema findings \
        "$APK_WORK_DIR" --sample "$APK_PATH" 2>> "$ERROR_LOG"; then
        log_success "Findings: ${REPORTS_DIR}/findings.json"
    else
        log_warning "Findings normalization had issues (check error log)"
    fi

    if [ -f "${TEMP_DIR}/sast_findings.json" ]; then
        if python3 "${TOOLS_DIR}/sarif_exporter.py" \
            "${TEMP_DIR}/sast_findings.json" "${REPORTS_DIR}/report.sarif" \
            "$(basename "$APK_PATH")" 2>> "$ERROR_LOG"; then
            log_success "SARIF report: ${REPORTS_DIR}/report.sarif"
        else
            log_warning "SARIF export had issues (check error log)"
        fi
    fi
}

# Main analysis workflow
main() {
    print_banner
    
    if [ $# -lt 1 ]; then
        echo "Usage: $0 [-y|--yara <yara_file>] <path_to_apk>"
        echo ""
        echo "Options:"
        echo "  -h, --help     Show this help message"
        echo "  -y, --yara     Specify custom YARA rule file (can be used multiple times)"
        echo ""
        exit 1
    fi
    
    YARA_RULES=()
    while [[ "$#" -gt 0 ]]; do
        case $1 in
            -y|--yara) YARA_RULES+=("$2"); shift ;;
            -h|--help)
                echo "Usage: $0 [-y|--yara <yara_file>] <path_to_apk>"
                echo ""
                echo "Options:"
                echo "  -h, --help     Show this help message"
                echo "  -y, --yara     Specify custom YARA rule file (can be used multiple times)"
                exit 0
                ;;
            *) APK_PATH="$1" ;;
        esac
        shift
    done
    
    if [ ${#YARA_RULES[@]} -eq 0 ]; then
        YARA_RULES=("${SCRIPT_DIR}/rules/yara_general_rules.yar")
    fi
    
    if [ ! -f "$APK_PATH" ]; then
        log_error "APK file not found: $APK_PATH"
        exit 1
    fi
    
    # Check dependencies
    check_dependencies
    
    # Initialize workspace
    init_workspace "$APK_PATH"

    # Normalize input container (XAPK/APKM/APKS/AAB) -> base APK (updates APK_PATH)
    prepare_input

    # Extract basic info
    extract_basic_info "$APK_PATH"
    
    # Check and bypass protections
    if check_apk_protection "$APK_PATH"; then
        # Decompile with APKTool and JADX concurrently (both are slow and independent)
        log_section "Decompiling (APKTool + JADX in parallel)"
        decompile_apktool "$APK_TO_ANALYZE" > "${TEMP_DIR}/log_apktool.txt" 2>&1 &
        local apktool_pid=$!
        decompile_jadx "$APK_TO_ANALYZE" > "${TEMP_DIR}/log_jadx.txt" 2>&1 &
        local jadx_pid=$!
        wait "$apktool_pid" || log_warning "APKTool failed, continuing..."
        wait "$jadx_pid" || log_warning "JADX failed, continuing..."
        cat "${TEMP_DIR}/log_apktool.txt" 2>/dev/null || true
        cat "${TEMP_DIR}/log_jadx.txt" 2>/dev/null || true

        # Independent analysis tools: run concurrently, buffer output, print in order.
        # Each tool reads the decompiled trees and writes its own JSON, so there are
        # no inter-tool dependencies; parallelism cuts wall-clock time on large apps.
        log_section "Running analysis tools in parallel"
        local -a par_tasks=(detect_obfuscation detect_framework detect_rasp \
                            run_entropy_analysis run_yara_scan analyze_signing \
                            inventory_sdks analyze_manifest analyze_network_artifacts \
                            run_sast_analysis)
        local -a par_pids=()
        local task
        for task in "${par_tasks[@]}"; do
            case "$task" in
                run_entropy_analysis|run_yara_scan)
                    "$task" "$APK_TO_ANALYZE" > "${TEMP_DIR}/log_${task}.txt" 2>&1 &
                    ;;
                *)
                    "$task" > "${TEMP_DIR}/log_${task}.txt" 2>&1 &
                    ;;
            esac
            par_pids+=("$!")
        done
        local i
        for i in "${!par_tasks[@]}"; do
            wait "${par_pids[$i]}" || log_warning "${par_tasks[$i]} exited non-zero (see output below)"
        done
        for task in "${par_tasks[@]}"; do
            cat "${TEMP_DIR}/log_${task}.txt" 2>/dev/null || true
        done

        # Optional deep analysis via REA (before report so it can be included)
        run_rea_bridge

        # Generate report
        generate_report

        # Derived outputs (Frida script, SARIF)
        generate_outputs

        log_section "Analysis Complete"
        log_success "All results saved to: $APK_WORK_DIR"
        log_info "Open report: cat $REPORT_FILE"
        
    else
        log_critical "Unable to analyze APK due to protection mechanisms"
        log_info "Manual intervention required"
        exit 1
    fi
}

# Run main
main "$@"
