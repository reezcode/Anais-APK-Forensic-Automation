#!/bin/bash
# Test script untuk validasi framework
# Run this untuk test framework dengan dummy APK

set -e

echo "═══════════════════════════════════════════════════════════"
echo "  Anais Static Core - Validation Test"
echo "═══════════════════════════════════════════════════════════"
echo ""

# Test 1: Check all scripts exist
echo "[TEST 1] Checking script files..."
files=(
    "anais.sh"
    "scripts/dynamic_analysis_helper.sh"
    "scripts/setup.sh"
    "analysis_tools/check_zip_encryption.py"
    "analysis_tools/fix_apk_headers.py"
    "analysis_tools/detect_obfuscation.py"
    "analysis_tools/sast_scanner.py"
    "analysis_tools/apk_basic_info.py"
    "analysis_tools/manifest_analyzer.py"
    "analysis_tools/network_analyzer.py"
    "analysis_tools/report_generator_modular.py"
)

missing=0
for file in "${files[@]}"; do
    if [ -f "$file" ]; then
        echo "  ✓ $file"
    else
        echo "  ✗ $file (MISSING)"
        missing=$((missing + 1))
    fi
done

if [ $missing -eq 0 ]; then
    echo "✓ All script files present"
else
    echo "✗ $missing files missing"
    exit 1
fi
echo ""

# Test 2: Check permissions
echo "[TEST 2] Checking execute permissions..."
if [ -x "anais.sh" ] && [ -x "scripts/dynamic_analysis_helper.sh" ] && [ -x "scripts/setup.sh" ]; then
    echo "✓ Main scripts are executable"
else
    echo "✗ Scripts not executable. Run: chmod +x *.sh"
    exit 1
fi
echo ""

# Test 3: Check Python scripts
echo "[TEST 3] Checking Python scripts syntax..."
python_errors=0
for script in analysis_tools/*.py; do
    if python3 -m py_compile "$script" 2>/dev/null; then
        echo "  ✓ $(basename $script)"
    else
        echo "  ✗ $(basename $script) (SYNTAX ERROR)"
        python_errors=$((python_errors + 1))
    fi
done

if [ $python_errors -eq 0 ]; then
    echo "✓ All Python scripts valid"
else
    echo "✗ $python_errors Python scripts have syntax errors"
    exit 1
fi
echo ""

# Test 4: Check YARA rules
echo "[TEST 4] Validating YARA rules..."
if command -v yara >/dev/null 2>&1; then
    if [ -f "rules/yara_general_rules.yar" ]; then
        if yara -w rules/yara_general_rules.yar rules/yara_general_rules.yar >/dev/null 2>&1; then
            echo "  ✓ rules/yara_general_rules.yar"
        else
            echo "  ⚠ rules/yara_general_rules.yar (has warnings)"
        fi
    fi
    echo "✓ YARA rules validated"
else
    echo "⚠ YARA not installed, skipping rule validation"
fi
echo ""

# Test 5: Check documentation
echo "[TEST 5] Checking documentation files..."
docs=(
    "README.md"
    "docs/ARCHITECTURE.txt"
    "docs/Workflow and Reference.md"
    "analyzer_config.json"
)

for doc in "${docs[@]}"; do
    if [ -f "$doc" ]; then
        echo "  ✓ $doc"
    else
        echo "  ✗ $doc (MISSING)"
    fi
done
echo ""

# Test 6: Check directories
echo "[TEST 6] Checking directory structure..."
if [ -d "analysis_tools" ]; then
    echo "  ✓ analysis_tools/"
else
    echo "  ✗ analysis_tools/ (MISSING)"
fi

if [ -d "scripts" ]; then
    echo "  ✓ scripts/"
else
    echo "  ✗ scripts/ (MISSING)"
fi

if [ -d "rules" ]; then
    echo "  ✓ rules/"
else
    echo "  ✗ rules/ (MISSING)"
fi

if [ -d "docs" ]; then
    echo "  ✓ docs/"
else
    echo "  ✗ docs/ (MISSING)"
fi

if [ -d "${HOME}/Documents/Anais-Reports" ]; then
    echo "  ✓ ~/Documents/Anais-Reports/"
else
    echo "  ⚠ ~/Documents/Anais-Reports/ (will be created on first run)"
fi
echo ""

# Test 7: Check dependencies
echo "[TEST 7] Checking dependencies..."

check_cmd() {
    if command -v "$1" >/dev/null 2>&1; then
        echo "  ✓ $1"
        return 0
    else
        echo "  ✗ $1 (NOT INSTALLED)"
        return 1
    fi
}

deps_missing=0
check_cmd python3 || deps_missing=$((deps_missing + 1))
check_cmd java || deps_missing=$((deps_missing + 1))
check_cmd apktool || deps_missing=$((deps_missing + 1))
check_cmd jadx || deps_missing=$((deps_missing + 1))
check_cmd yara || deps_missing=$((deps_missing + 1))

if [ $deps_missing -eq 0 ]; then
    echo "✓ All dependencies installed"
else
    echo "⚠ $deps_missing dependencies missing (run setup.sh for details)"
fi
echo ""

# Test 8: Check Python packages
echo "[TEST 8] Checking Python packages..."

check_pkg() {
    if python3 -c "import ${1//-/_}" 2>/dev/null; then
        echo "  ✓ $1"
        return 0
    else
        echo "  ✗ $1 (NOT INSTALLED)"
        return 1
    fi
}

pkgs_missing=0
check_pkg androguard || pkgs_missing=$((pkgs_missing + 1))
check_pkg yara-python || pkgs_missing=$((pkgs_missing + 1))
check_pkg requests || pkgs_missing=$((pkgs_missing + 1))
check_pkg cryptography || pkgs_missing=$((pkgs_missing + 1))

if [ $pkgs_missing -eq 0 ]; then
    echo "✓ All Python packages installed"
else
    echo "⚠ $pkgs_missing Python packages missing"
    echo "  Install with: pip3 install androguard yara-python requests cryptography"
fi
echo ""

# Summary
echo "═══════════════════════════════════════════════════════════"
echo "                    TEST SUMMARY"
echo "═══════════════════════════════════════════════════════════"
echo ""

if [ $missing -eq 0 ] && [ $python_errors -eq 0 ]; then
    echo "✅ FRAMEWORK VALIDATION PASSED"
    echo ""
    echo "Framework is ready to use!"
    echo ""
    echo "Quick Start:"
    echo "  1. Run setup (if not done): ./scripts/setup.sh"
    echo "  2. Analyze an APK: ./anais.sh app.apk"
    echo ""
    
    if [ $deps_missing -gt 0 ] || [ $pkgs_missing -gt 0 ]; then
        echo "⚠️  Some dependencies are missing. The framework will work with"
        echo "   limited functionality. Run ./scripts/setup.sh for details."
    fi
else
    echo "❌ FRAMEWORK VALIDATION FAILED"
    echo ""
    echo "Please fix the errors above before using the framework."
    exit 1
fi

echo "═══════════════════════════════════════════════════════════"
