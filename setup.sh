#!/bin/bash

###############################################
# Quick Setup Script
# Sets up the analysis framework and validates
###############################################

set -e

GREEN='\033[0;32m'
YELLOW='\033[1;33m'
RED='\033[0;31m'
BLUE='\033[0;34m'
NC='\033[0m'

echo -e "${BLUE}"
echo "╔════════════════════════════════════════════╗"
echo "║  Anais Static Core Setup ║"
echo "╚════════════════════════════════════════════╝"
echo -e "${NC}"

# Check if on macOS or Linux
if [[ "$OSTYPE" == "darwin"* ]]; then
    OS="macos"
    echo -e "${GREEN}[+] Detected macOS${NC}"
elif [[ "$OSTYPE" == "linux-gnu"* ]]; then
    OS="linux"
    echo -e "${GREEN}[+] Detected Linux${NC}"
else
    echo -e "${RED}[!] Unsupported OS${NC}"
    exit 1
fi

# Function to check if command exists
command_exists() {
    command -v "$1" >/dev/null 2>&1
}

# Check Python3
echo -e "\n${YELLOW}[*] Checking Python3...${NC}"
if command_exists python3; then
    PYTHON_VERSION=$(python3 --version | awk '{print $2}')
    echo -e "${GREEN}[+] Python3 found: $PYTHON_VERSION${NC}"
else
    echo -e "${RED}[!] Python3 not found${NC}"
    echo "Install with:"
    if [ "$OS" = "macos" ]; then
        echo "  brew install python3"
    else
        echo "  sudo apt-get install python3 python3-pip"
    fi
    exit 1
fi

# Check Java
echo -e "\n${YELLOW}[*] Checking Java...${NC}"
if command_exists java; then
    JAVA_VERSION=$(java -version 2>&1 | head -n 1)
    echo -e "${GREEN}[+] Java found: $JAVA_VERSION${NC}"
else
    echo -e "${RED}[!] Java not found${NC}"
    echo "Install with:"
    if [ "$OS" = "macos" ]; then
        echo "  brew install openjdk"
    else
        echo "  sudo apt-get install default-jdk"
    fi
    exit 1
fi

# Check APKTool
echo -e "\n${YELLOW}[*] Checking APKTool...${NC}"
if command_exists apktool; then
    APKTOOL_VERSION=$(apktool --version 2>&1 | head -n 1)
    echo -e "${GREEN}[+] APKTool found: $APKTOOL_VERSION${NC}"
else
    echo -e "${YELLOW}[!] APKTool not found${NC}"
    echo "Install with:"
    if [ "$OS" = "macos" ]; then
        echo "  brew install apktool"
    else
        echo "  sudo apt-get install apktool"
    fi
fi

# Check JADX
echo -e "\n${YELLOW}[*] Checking JADX...${NC}"
if command_exists jadx; then
    JADX_VERSION=$(jadx --version 2>&1 | head -n 1)
    echo -e "${GREEN}[+] JADX found: $JADX_VERSION${NC}"
else
    echo -e "${YELLOW}[!] JADX not found${NC}"
    echo "Install with:"
    if [ "$OS" = "macos" ]; then
        echo "  brew install jadx"
    else
        echo "  Download from: https://github.com/skylot/jadx/releases"
    fi
fi

# Check YARA
echo -e "\n${YELLOW}[*] Checking YARA...${NC}"
if command_exists yara; then
    YARA_VERSION=$(yara --version 2>&1)
    echo -e "${GREEN}[+] YARA found: $YARA_VERSION${NC}"
else
    echo -e "${YELLOW}[!] YARA not found${NC}"
    echo "Install with:"
    if [ "$OS" = "macos" ]; then
        echo "  brew install yara"
    else
        echo "  sudo apt-get install yara"
    fi
fi

# Install Python packages
echo -e "\n${YELLOW}[*] Checking Python packages...${NC}"

REQUIRED_PACKAGES=("androguard" "yara-python" "requests" "cryptography")
MISSING_PACKAGES=()

for package in "${REQUIRED_PACKAGES[@]}"; do
    if python3 -c "import ${package//-/_}" 2>/dev/null; then
        echo -e "${GREEN}[+] $package installed${NC}"
    else
        echo -e "${YELLOW}[!] $package not installed${NC}"
        MISSING_PACKAGES+=("$package")
    fi
done

if [ ${#MISSING_PACKAGES[@]} -ne 0 ]; then
    echo -e "\n${YELLOW}[*] Installing missing Python packages...${NC}"
    pip3 install "${MISSING_PACKAGES[@]}"
fi

# Make scripts executable
echo -e "\n${YELLOW}[*] Setting execute permissions...${NC}"
chmod +x malware_analyzer.sh
chmod +x dynamic_analysis_helper.sh

if [ -d "analysis_tools" ]; then
    chmod +x analysis_tools/*.py
fi

echo -e "${GREEN}[+] Scripts are now executable${NC}"

# Create necessary directories
echo -e "\n${YELLOW}[*] Creating directories...${NC}"
mkdir -p analysis_workspace
mkdir -p analysis_workspace/reports
echo -e "${GREEN}[+] Directories created${NC}"

# Validate YARA rules
echo -e "\n${YELLOW}[*] Validating YARA rules...${NC}"
if [ -f "yara_general_rules.yar" ]; then
    if yara -w yara_general_rules.yar yara_general_rules.yar >/dev/null 2>&1; then
        echo -e "${GREEN}[+] yara_general_rules.yar is valid${NC}"
    else
        echo -e "${YELLOW}[!] yara_general_rules.yar has warnings${NC}"
    fi
fi

if [ -f "yara_general_rules.yar" ]; then
    if yara -w yara_general_rules.yar yara_general_rules.yar >/dev/null 2>&1; then
        echo -e "${GREEN}[+] yara_general_rules.yar is valid${NC}"
    else
        echo -e "${YELLOW}[!] yara_general_rules.yar has warnings${NC}"
    fi
fi

# Summary
echo -e "\n${BLUE}═══════════════════════════════════════${NC}"
echo -e "${BLUE}           Setup Summary${NC}"
echo -e "${BLUE}═══════════════════════════════════════${NC}"

echo -e "\n${GREEN}✓ Setup Complete!${NC}\n"

echo "Quick Start:"
echo "  1. Analyze an APK:"
echo "     ./malware_analyzer.sh /path/to/app.apk"
echo ""
echo "  2. Dynamic analysis (with device connected):"
echo "     ./dynamic_analysis_helper.sh dex-dump com.package.name"
echo ""
echo "  3. View documentation:"
echo "     cat ANALYZER_README.md"
echo ""

# Check if ADB is available for dynamic analysis
if command_exists adb; then
    echo -e "${GREEN}[+] ADB found - Dynamic analysis available${NC}"
    echo ""
else
    echo -e "${YELLOW}[!] ADB not found - Dynamic analysis will not be available${NC}"
    echo "Install with:"
    if [ "$OS" = "macos" ]; then
        echo "  brew install android-platform-tools"
    else
        echo "  sudo apt-get install android-tools-adb"
    fi
    echo ""
fi

# Check for Frida
if command_exists frida; then
    echo -e "${GREEN}[+] Frida found - Advanced hooking available${NC}"
else
    echo -e "${YELLOW}[!] Frida not found - Install for advanced dynamic analysis${NC}"
    echo "Install with: pip3 install frida-tools"
fi

echo ""
echo -e "${BLUE}═══════════════════════════════════════${NC}"
echo ""
