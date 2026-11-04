# Anais APK Forensic Automation

Automated security analysis tool for Android APK files. Built for security researchers, malware analysts, and penetration testers.

[![npm version](https://img.shields.io/npm/v/anais-apk-forensic.svg)](https://www.npmjs.com/package/anais-apk-forensic)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](LICENSE)

## What it does

Anais analyzes APK files and generates detailed security reports. It can detect malware, identify vulnerabilities, and help you understand what an Android app is doing under the hood.

**Features:**

- Accepts APK and bundle inputs: `.apk`, `.xapk`, `.apkm`, `.apks`, and `.aab` (AAB needs `bundletool`)
- Decompiles APKs with APKTool and JADX (run in parallel)
- Scans for malware with YARA rules
- Detects obfuscation (ProGuard, R8, DPT-Shell, DexProtector, Bangcle)
- Detects RASP / app-protection vendors (Talsec, Appdome, Promon, DexGuard, zShield, LiAPP, Tencent Legu, 360 Jiagu, and more)
- Identifies the app framework (Flutter, React Native, Xamarin/.NET, Unity, Cordova) and points to where the real logic lives
- Inventories third-party SDKs and flags trackers/ad/analytics (optional offline-by-default CVE lookup via OSV)
- Inspects APK signing: scheme versions, debug certificates, v1-only (Janus) risk, weak keys
- Runs static security analysis (SAST)
- Analyzes network behavior and manifest permissions
- Identifies encrypted payloads through entropy analysis
- Produces a single composite risk score across all signals
- Generates a target-specific Frida script and a SARIF export for CI
- Diffs two analyses to spot changes between app versions
- Supports dynamic analysis with Frida

## Installation

**Prerequisites:**

- Python 3.8+
- Java 8+
- Node.js 14+
- APKTool, JADX, and YARA

**Install via npm:**

```bash
npm install -g anais-apk-forensic
```

**Or from source:**

```bash
git clone https://github.com/reezcode/Anais-APK-Forensic-Automation.git
cd Anais-APK-Forensic-Automation
npm install
npm run build
./scripts/setup.sh
```

## Usage

Basic analysis:

```bash
anais /path/to/app.apk          # also: .xapk .apkm .apks .aab
anais -y custom_rules.yar /path/to/app.apk   # custom YARA rules (repeatable)
```

Reports are saved to `~/.anais/reports/` by default, in both Markdown and JSON formats.
Override the location with the `ANAIS_WORKSPACE` environment variable, or `paths.workspace`
in `analyzer_config.json`. (The default is no longer `~/Documents`, which syncs to iCloud
on macOS and evicts large decompiled trees.)

**Compare two versions of an app:**

```bash
python3 analysis_tools/diff_reports.py old/report.json new/report.json
```

**Look up CVEs for bundled SDKs (requires network):**

```bash
ANAIS_CVE_ONLINE=1 anais /path/to/app.apk   # queries OSV.dev for known-version SDKs
```

**Dynamic analysis:**

```bash
# Install Frida server
./scripts/dynamic_analysis_helper.sh install-frida

# Dump DEX from running app
./scripts/dynamic_analysis_helper.sh dex-dump com.package.name

# Hook crypto operations
./scripts/dynamic_analysis_helper.sh hook-crypto com.package.name
```

## Configuration

Edit `analyzer_config.json` to customize analysis behavior, enable/disable tools, or change output paths.

## Report Output

Each analysis generates:

- **report.md** - Human-readable report with findings and recommendations
- **report.json** - Machine-readable data for automation (includes the composite `risk` block)
- **report.sarif** - SARIF 2.1.0 export of SAST findings for GitHub code scanning / CI
- **frida_auto.js** - Target-specific Frida script generated from the findings
- Decompiled source code (APKTool and JADX output)
- YARA scan results
- SAST findings
- Network and manifest analysis

**Severity levels:**

- 🔴 CRITICAL (70-100): Confirmed malicious, take immediate action
- 🟠 HIGH (40-69): Suspicious, needs investigation
- 🟡 MEDIUM (20-39): Security concerns worth reviewing
- 🟢 LOW (0-19): Minor issues

## Contributing

Pull requests welcome. Please fork the repo, create a feature branch, and submit a PR. 4. Submit a pull request

## 📝 License

This project is licensed under the MIT License - see the LICENSE file for details.

## ⚠️ Disclaimer

This tool is intended for security research and educational purposes only. Always obtain proper authorization before analyzing applications you do not own.

## 👤 Author

**Reezcode24**

## License

MIT License - see [LICENSE](LICENSE) for details.

## Author

[@reezcode](https://github.com/reezcode)

## Disclaimer

This tool is for authorized security testing and research only. Don't analyze apps you don't own without permission.
