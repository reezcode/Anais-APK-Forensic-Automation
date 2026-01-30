# Anais APK Forensic CLI

A comprehensive command-line tool for Android APK security analysis and forensic investigation.

## Features

- 🔍 **Comprehensive APK Analysis**: Complete forensic analysis of Android applications
- 🛡️ **Security Scanning (SAST)**: Static Application Security Testing
- 🎯 **YARA Malware Detection**: Advanced malware signature matching
- 🔒 **Protection Bypass**: Handles obfuscated and protected APKs
- 🌐 **Network Analysis**: Extract and analyze network artifacts
- 📋 **Manifest Analysis**: Deep dive into AndroidManifest.xml
- 📊 **Entropy Analysis**: Detect encrypted payloads
- 📝 **Detailed Reports**: Generate markdown and JSON reports

## Installation

### Prerequisites

- Node.js >= 14.0.0
- Python 3
- APK analysis tools (apktool, jadx, yara)

### Quick Install (Development)

```bash
cd /Volumes/SSD/Cysec/Tools/Anais/anais-apk-forensic-cli
npm install
npm run build
npm link
```

Now you can use `anais` command globally!

For more installation options, see [INSTALL.md](INSTALL.md).

## Usage

### Basic Analysis

```bash
anais /path/to/app.apk
```

### Show Help

```bash
anais --help
```

### Show Version

```bash
anais --version
```

## Output

After analysis, Anais generates:

- **Main Report** (`report.md`): Comprehensive markdown report
- **JSON Report** (`report.json`): Structured JSON data
- **Detailed Reports**: Separate reports for entropy, SAST, manifest, network, YARA
- **Workspace**: All decompiled files and analysis artifacts

Example output:
```
🔍 Anais APK Forensic Analysis

══════════════════════════════════════════════════

📱 APK: app.apk
📂 Path: /path/to/app.apk

🚀 Executing analysis...

[Analysis output...]

══════════════════════════════════════════════════

✅ Analysis completed successfully!

📁 Workspace: /path/to/workspace
📄 Report: /path/to/workspace/reports/report.md
📊 JSON Report: /path/to/workspace/reports/report.json

💡 Tip: Open the report with your preferred markdown viewer
```

## Project Structure

```
anais-apk-forensic-cli/
├── bin/
│   └── anais              # Executable entry point
├── src/
│   ├── cli.ts            # CLI interface
│   ├── index.ts          # Main analysis orchestrator
│   ├── types/
│   │   └── index.ts      # TypeScript interfaces
│   └── utils/
│       ├── index.ts      # Utility exports
│       ├── output.ts     # Output formatting
│       └── paths.ts      # Path resolution
├── dist/                  # Compiled JavaScript (generated)
├── node_modules/          # Dependencies (generated)
├── package.json           # Package configuration
├── tsconfig.json          # TypeScript configuration
├── INSTALL.md            # Installation guide
└── README.md             # This file
```

## Development

### Build

```bash
npm run build
```

### Link for Testing

```bash
npm link
```

### Unlink

```bash
npm unlink -g anais-apk-forensic-cli
```

### Run Directly (without linking)

```bash
npm start /path/to/app.apk
```

## How It Works

The CLI tool wraps the existing `anais.sh` bash script and Python analysis tools:

1. **Input Validation**: Checks if the APK file exists
2. **Script Execution**: Spawns the `anais.sh` bash script
3. **Output Streaming**: Displays real-time analysis progress
4. **Result Parsing**: Extracts workspace and report paths
5. **Summary Display**: Shows final results and report locations

The actual analysis is performed by:
- `anais.sh`: Main orchestration script
- `analysis_tools/*.py`: Python modules for specific analysis tasks
- External tools: apktool, jadx, yara, androguard

## License

MIT

## Author

reezcode
