# Anais APK Forensic CLI - Quick Reference

## Installation

```bash
cd /Volumes/SSD/Cysec/Tools/Anais/anais-apk-forensic-cli
npm install && npm run build && npm link
```

## Commands

| Command            | Description         |
| ------------------ | ------------------- |
| `anais <apk-file>` | Analyze an APK file |
| `anais --help`     | Show help message   |
| `anais --version`  | Show version        |

## Examples

### Analyze an APK

```bash
anais ~/Downloads/app.apk
```

### View Help

```bash
anais --help
```

## Output Files

| File/Directory                 | Description                 |
| ------------------------------ | --------------------------- |
| `reports/report.md`            | Main comprehensive report   |
| `reports/report.json`          | JSON structured data        |
| `reports/entropy_analysis.md`  | Encrypted payload detection |
| `reports/sast_findings.md`     | Security findings           |
| `reports/manifest_analysis.md` | AndroidManifest analysis    |
| `reports/network_analysis.md`  | Network artifacts           |
| `reports/yara_results.md`      | Malware detection results   |
| `decompiled/`                  | APKTool output              |
| `jadx_output/`                 | JADX decompiled Java        |

## Troubleshooting

### Command not found

```bash
# Check npm global bin directory
npm config get prefix

# Add to PATH (add to ~/.zshrc)
export PATH="$(npm config get prefix)/bin:$PATH"
```

### Script not found error

Make sure you're running from the correct directory structure:

```
/Volumes/SSD/Cysec/Tools/Anais/
├── anais.sh                    # Main analysis script
├── anais-apk-forensic-cli/     # CLI tool
└── analysis_tools/             # Python modules
```

### Permission errors

```bash
chmod +x /Volumes/SSD/Cysec/Tools/Anais/anais-apk-forensic-cli/bin/anais
```

## Uninstall

```bash
npm unlink -g anais-apk-forensic-cli
```
