# Anais APK Forensic Automation

> Comprehensive APK security analysis and SAST scanner for Android applications

[![Version](https://img.shields.io/badge/version-1.0.0-blue.svg)](https://github.com/reezcode/Anais-APK-Forensic-Automation)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](LICENSE)

## 🔍 Overview

Anais is an automated APK forensic analysis framework designed for mobile security researchers, penetration testers, and malware analysts. It provides comprehensive static and dynamic analysis capabilities with support for various protection bypass techniques.

### Key Features

- 🛡️ **Advanced Obfuscation Detection** - ProGuard, R8, DPT-Shell, DexProtector, and more
- 🔬 **Multi-Tool Integration** - APKTool, JADX, YARA, Androguard
- 🎯 **SAST Engine** - Static Application Security Testing with pattern matching
- 📊 **Detailed Reporting** - Markdown and JSON formatted analysis reports
- 🔄 **Dynamic Analysis** - Frida-based runtime analysis and DEX dumping
- 🌐 **Network Analysis** - Traffic pattern detection and URL extraction
- 🔐 **Crypto Detection** - Weak cryptography and security vulnerability identification

## 📁 Project Structure

```
Anais/
├── anais.sh                      # Main analysis orchestrator
├── analyzer_config.json          # Configuration file
├── README.md                     # This file
├── anais-apk-forensic-cli/       # TypeScript CLI wrapper
│   ├── bin/anais                 # CLI executable
│   └── src/                      # CLI source code
├── analysis_tools/               # Python analysis modules
│   ├── apk_basic_info.py         # APK information extractor
│   ├── detect_obfuscation.py     # Obfuscation detector
│   ├── sast_scanner.py           # SAST engine
│   ├── manifest_analyzer.py      # Manifest analyzer
│   ├── network_analyzer.py       # Network traffic analyzer
│   └── report_generator.py       # Report generator
├── scripts/                      # Utility scripts
│   ├── setup.sh                  # Environment setup
│   ├── validate_framework.sh     # Framework validation
│   ├── dynamic_analysis_helper.sh # Dynamic analysis helper
│   └── frida/                    # Frida scripts
│       ├── frida_dex_dump.js     # DEX dumper
│       ├── frida_hooks.js        # General hooks
│       └── dpt_dex_dumper.js     # DPT shell dumper
├── rules/                        # YARA rules
│   └── yara_general_rules.yar    # General malware detection rules
├── apkid/                        # APKiD integration
└── docs/                         # Documentation
    ├── ARCHITECTURE.txt          # Architecture documentation
    ├── Workflow and Reference.md # Workflow reference
    └── DECRYPT_DPT_SHELL.md      # DPT shell decryption guide
```

## 🚀 Quick Start

### Prerequisites

- **macOS/Linux** operating system
- **Python 3.8+** with pip
- **Java JDK 8+**
- **Node.js 14+** (for CLI)
- **Android SDK Platform Tools** (for dynamic analysis)
- **Frida** (optional, for dynamic analysis)

### Installation

1. **Clone the repository**

   ```bash
   git clone https://github.com/reezcode/Anais-APK-Forensic-Automation.git
   cd Anais-APK-Forensic-Automation
   ```

2. **Run setup script**

   ```bash
   ./scripts/setup.sh
   ```

3. **Validate installation**
   ```bash
   ./scripts/validate_framework.sh
   ```

### Basic Usage

**Analyze an APK file:**

```bash
./anais.sh /path/to/app.apk
```

**Using the CLI wrapper:**

```bash
cd anais-apk-forensic-cli
npm install
npm link
anais /path/to/app.apk
```

**View the generated report:**

```bash
cat ~/Documents/Anais-Reports/app_name_*/report.md
```

## 📖 Usage Examples

### Static Analysis

```bash
# Full static analysis
./anais.sh suspicious.apk

# View JSON report for programmatic access
cat ~/Documents/Anais-Reports/suspicious_*/report.json
```

### Dynamic Analysis

```bash
# Install Frida on device
./scripts/dynamic_analysis_helper.sh install-frida

# Dump DEX from running app
./scripts/dynamic_analysis_helper.sh dex-dump com.package.name

# Hook crypto functions
./scripts/dynamic_analysis_helper.sh hook-crypto com.package.name

# Pull dumped files
./scripts/dynamic_analysis_helper.sh pull-dumps
```

## 🔧 Configuration

Edit `analyzer_config.json` to customize:

- **Paths** - Workspace, tools, and reports locations
- **Tools** - Enable/disable APKTool, JADX, YARA
- **Analysis** - Toggle specific analysis modules
- **YARA** - Configure rule scanning options

## 📊 Report Output

Analysis reports are saved to `~/Documents/Anais-Reports/` with:

- **report.md** - Human-readable Markdown report
- **report.json** - Machine-readable JSON report
- **Detailed findings** - SAST, YARA, entropy, manifest, network analysis
- **Recommendations** - Security improvement suggestions

### Severity Levels

| Level       | Score  | Description                                             |
| ----------- | ------ | ------------------------------------------------------- |
| 🔴 CRITICAL | 70-100 | Confirmed malicious activity, immediate action required |
| 🟠 HIGH     | 40-69  | Suspicious patterns detected, investigation needed      |
| 🟡 MEDIUM   | 20-39  | Security concerns, review recommended                   |
| 🟢 LOW      | 0-19   | Minor issues, informational                             |

## 🛠️ Advanced Features

### Supported Protection Types

- **ProGuard/R8** - Basic obfuscation (static analysis)
- **DPT-Shell** - Native DEX encryption (dynamic unpacking required)
- **DexProtector** - Control flow obfuscation (memory dump)
- **Bangcle** - Application wrapper (runtime analysis)

### YARA Rules

Custom YARA rules in `rules/yara_general_rules.yar` for detecting:

- Malware families
- Suspicious behaviors
- Known exploits
- Privacy violations

## 🤝 Contributing

Contributions are welcome! Please:

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Submit a pull request

## 📝 License

This project is licensed under the MIT License - see the LICENSE file for details.

## ⚠️ Disclaimer

This tool is intended for security research and educational purposes only. Always obtain proper authorization before analyzing applications you do not own.

## 👤 Author

**Mobile CySec Expert**

- GitHub: [@reezcode](https://github.com/reezcode)

## 🙏 Acknowledgments

- APKTool
- JADX
- YARA
- Androguard
- Frida

---

**Anais Static Core v1.0** | Comprehensive APK Security Analysis & SAST
