╔═══════════════════════════════════════════════════════════════════════════╗
║                  Anais Static Core                       ║
║                         QUICK REFERENCE CARD                              ║
╚═══════════════════════════════════════════════════════════════════════════╝

┌─── QUICK START ─────────────────────────────────────────────────────────┐
│                                                                          │
│  Setup:        ./setup.sh                                               │
│  Validate:     ./validate_framework.sh                                  │
│  Analyze:      ./malware_analyzer.sh app.apk                            │
│  View Report:  cat analysis_workspace/app_*/report.md                   │
│                                                                          │
└──────────────────────────────────────────────────────────────────────────┘

┌─── FILE STRUCTURE ──────────────────────────────────────────────────────┐
│                                                                          │
│  malware_analyzer.sh              Main orchestrator                     │
│  dynamic_analysis_helper.sh       Frida helper                          │
│  setup.sh                         Environment setup                     │
│  validate_framework.sh            Framework validation                  │
│                                                                          │
│  analysis_tools/                  Analysis modules                      │
│    ├─ check_zip_encryption.py    ZIP protection detector               │
│    ├─ fix_apk_headers.py          Header manipulation                   │
│    ├─ detect_obfuscation.py       Obfuscation detector                  │
│    ├─ sast_scanner.py             SAST engine                           │
│    ├─ apk_basic_info.py           APK info extractor                    │
│    ├─ manifest_analyzer.py        Manifest analyzer                     │
│    ├─ network_analyzer.py         Network artifacts                     │
│    └─ report_generator.py         Report generator                      │
│                                                                          │
│  frida_dex_dump.js                DEX dumper script                     │
│  frida_hooks.js                   General hooks                         │
│                                                                          │
│  yara-test.yar                    M-Pajak rules                         │
│  yara_general_rules.yar           General rules                         │
│                                                                          │
└──────────────────────────────────────────────────────────────────────────┘

┌─── COMMAND CHEAT SHEET ─────────────────────────────────────────────────┐
│                                                                          │
│  STATIC ANALYSIS                                                        │
│  ───────────────                                                         │
│  ./malware_analyzer.sh app.apk                                          │
│  ./malware_analyzer.sh --help                                           │
│                                                                          │
│  DYNAMIC ANALYSIS                                                        │
│  ────────────────                                                        │
│  ./dynamic_analysis_helper.sh install-frida                             │
│  ./dynamic_analysis_helper.sh dex-dump com.pkg.name                     │
│  ./dynamic_analysis_helper.sh hook-crypto com.pkg.name                  │
│  ./dynamic_analysis_helper.sh hook-network com.pkg.name                 │
│  ./dynamic_analysis_helper.sh pull-dumps                                │
│                                                                          │
│  FRIDA (MANUAL)                                                          │
│  ──────────────                                                          │
│  frida-ps -U                                    List processes          │
│  frida -U -f com.pkg.name                       Attach to app           │
│  frida -U -f com.pkg.name -l script.js          Run script              │
│  frida-dexdump -U -f com.pkg.name               Dump DEX                │
│                                                                          │
│  YARA                                                                    │
│  ─────                                                                   │
│  yara -r rules.yar target_dir/                  Recursive scan          │
│  yara -s rules.yar file.apk                     Scan with strings       │
│                                                                          │
│  APK TOOLS                                                               │
│  ─────────                                                               │
│  apktool d app.apk -o output/                   Decompile               │
│  apktool b output/ -o new.apk                   Rebuild                 │
│  jadx -d output/ app.apk                        Decompile to Java       │
│  aapt dump badging app.apk                      Show APK info           │
│                                                                          │
└──────────────────────────────────────────────────────────────────────────┘

┌─── PROTECTION TYPES ────────────────────────────────────────────────────┐
│                                                                          │
│  TYPE          │ CHARACTERISTICS         │ BYPASS METHOD                │
│  ──────────────┼─────────────────────────┼──────────────────────────   │
│  ProGuard/R8   │ Short names, flattened  │ Static analysis OK          │
│                │ packages                │ Use JADX deobfuscation      │
│  ──────────────┼─────────────────────────┼──────────────────────────   │
│  DPT-Shell     │ libdpt.so, DEX modified │ Dynamic unpacking required  │
│                │ Native decryption       │ Frida + DEX dump            │
│  ──────────────┼─────────────────────────┼──────────────────────────   │
│  DexProtector  │ libprotect.so, Control  │ Memory dump                 │
│                │ flow obfuscation        │ Runtime analysis            │
│  ──────────────┼─────────────────────────┼──────────────────────────   │
│  Bangcle       │ libbangcle.so, Wrapper  │ Dynamic unpacking           │
│                │ Application class       │ /data/data dump             │
│                                                                          │
└──────────────────────────────────────────────────────────────────────────┘

┌─── SEVERITY LEVELS ─────────────────────────────────────────────────────┐
│                                                                          │
│  🔴 CRITICAL (70-100)  │ Confirmed malicious, immediate action          │
│  🟠 HIGH (40-69)       │ Suspicious patterns, investigation needed      │
│  🟡 MEDIUM (20-39)     │ Security concerns, review recommended          │
│  🟢 LOW (0-19)         │ Minor issues, informational                    │
│                                                                          │
└──────────────────────────────────────────────────────────────────────────┘

┌─── COMMON MALWARE PATTERNS ─────────────────────────────────────────────┐
│                                                                          │
│  BANKING TROJAN                                                          │
│  ├─ AccessibilityService abuse                                          │
│  ├─ SYSTEM_ALERT_WINDOW (overlay)                                       │
│  ├─ SMS interception (abortBroadcast)                                   │
│  └─ Screen recording (MediaProjection)                                  │
│                                                                          │
│  CRYPTO STEALER                                                          │
│  ├─ Wallet app package names (metamask, trust, etc)                     │
│  ├─ "mnemonic", "seed phrase" strings                                   │
│  ├─ ClipboardManager access                                             │
│  └─ Keylogging via accessibility                                        │
│                                                                          │
│  SPYWARE                                                                 │
│  ├─ Location tracking (LocationManager)                                 │
│  ├─ Contact exfiltration (ContactsContract)                             │
│  ├─ Call log access (CallLog)                                           │
│  └─ Camera/Mic access (MediaRecorder)                                   │
│                                                                          │
│  C2 MALWARE                                                              │
│  ├─ WebSocket connections (wss://)                                      │
│  ├─ Suspicious TLDs (.top, .xyz, .tk)                                   │
│  ├─ Periodic checks (AlarmManager)                                      │
│  └─ Command execution (Runtime.exec)                                    │
│                                                                          │
└──────────────────────────────────────────────────────────────────────────┘

┌─── KEY FILES TO CHECK ──────────────────────────────────────────────────┐
│                                                                          │
│  AndroidManifest.xml                                                     │
│  ├─ Dangerous permissions                                               │
│  ├─ Exported components                                                 │
│  ├─ android:debuggable="true"                                           │
│  └─ android:allowBackup="true"                                          │
│                                                                          │
│  strings.xml / res/values/                                               │
│  └─ Hardcoded URLs, API keys, secrets                                   │
│                                                                          │
│  lib/*.so (Native libraries)                                             │
│  └─ Protection libraries, encryption code                               │
│                                                                          │
│  assets/                                                                 │
│  └─ Hidden DEX, config files, payloads                                  │
│                                                                          │
└──────────────────────────────────────────────────────────────────────────┘

┌─── ANALYSIS WORKFLOW ───────────────────────────────────────────────────┐
│                                                                          │
│  1. INITIAL TRIAGE                                                       │
│     ├─ Calculate hashes (SHA256, MD5)                                   │
│     ├─ Check file size                                                  │
│     └─ Run basic info extraction                                        │
│                                                                          │
│  2. STATIC ANALYSIS                                                      │
│     ├─ Check for protections/encryption                                 │
│     ├─ Decompile (APKTool + JADX)                                       │
│     ├─ Detect obfuscation type                                          │
│     ├─ Run SAST scanner                                                 │
│     ├─ Analyze manifest                                                 │
│     ├─ Extract network artifacts                                        │
│     └─ YARA scanning                                                    │
│                                                                          │
│  3. DYNAMIC ANALYSIS (if protected)                                      │
│     ├─ Install on rooted device                                         │
│     ├─ Run app with Frida hooks                                         │
│     ├─ Dump DEX from memory                                             │
│     ├─ Monitor network traffic                                          │
│     └─ Re-analyze dumped files                                          │
│                                                                          │
│  4. REPORTING                                                            │
│     ├─ Aggregate all findings                                           │
│     ├─ Calculate risk score                                             │
│     ├─ Generate evidence                                                │
│     └─ Provide recommendations                                          │
│                                                                          │
└──────────────────────────────────────────────────────────────────────────┘

┌─── RED FLAGS 🚨 ────────────────────────────────────────────────────────┐
│                                                                          │
│  Investigate immediately if found:                                       │
│                                                                          │
│  ☠️  BIND_ACCESSIBILITY_SERVICE permission                              │
│  ☠️  SYSTEM_ALERT_WINDOW + banking app targeting                        │
│  ☠️  WebSocket to suspicious domain (.top, .xyz)                        │
│  ☠️  Crypto wallet packages + clipboard access                          │
│  ☠️  SMS_RECEIVED + abortBroadcast                                      │
│  ☠️  REQUEST_INSTALL_PACKAGES permission                                │
│  ☠️  Native protection + obfuscated network                             │
│  ☠️  Screen recording + accessibility                                   │
│  ☠️  Root detection bypass + data exfiltration                          │
│  ☠️  Multiple dangerous permissions combined                            │
│                                                                          │
└──────────────────────────────────────────────────────────────────────────┘

┌─── ENVIRONMENT SETUP ───────────────────────────────────────────────────┐
│                                                                          │
│  ANALYSIS HOST                                                           │
│  ├─ Python 3.8+                                                          │
│  ├─ Java 8+                                                              │
│  ├─ APKTool, JADX, YARA                                                  │
│  └─ Pip packages: androguard, yara-python, requests, cryptography       │
│                                                                          │
│  TEST DEVICE (for dynamic analysis)                                      │
│  ├─ Rooted Android (Magisk)                                              │
│  ├─ Android 7-10 recommended                                             │
│  ├─ Frida server installed                                               │
│  ├─ ADB enabled                                                          │
│  └─ Isolated network                                                     │
│                                                                          │
└──────────────────────────────────────────────────────────────────────────┘

┌─── TROUBLESHOOTING ─────────────────────────────────────────────────────┐
│                                                                          │
│  ISSUE: APKTool decompilation fails                                      │
│  FIX: Try header fix tool, check APK integrity                          │
│                                                                          │
│  ISSUE: JADX produces empty output                                       │
│  FIX: APK might be encrypted, try dynamic unpacking                      │
│                                                                          │
│  ISSUE: Frida can't connect to device                                    │
│  FIX: Check frida-server is running, check ADB connection               │
│                                                                          │
│  ISSUE: DEX dump returns empty files                                     │
│  FIX: App might use anti-frida, try alternative tools                    │
│                                                                          │
│  ISSUE: Too many false positives in SAST                                 │
│  FIX: Adjust patterns in config, focus on critical findings             │
│                                                                          │
└──────────────────────────────────────────────────────────────────────────┘

┌─── OUTPUT LOCATIONS ────────────────────────────────────────────────────┐
│                                                                          │
│  analysis_workspace/<app>_<timestamp>/                                   │
│    ├─ report.md              Main report (markdown)                     │
│    ├─ report.json            Machine-readable output                    │
│    ├─ decompiled/            APKTool output                             │
│    │   ├─ AndroidManifest.xml                                           │
│    │   ├─ smali/                                                         │
│    │   └─ res/                                                           │
│    ├─ jadx_output/           JADX Java sources                          │
│    └─ temp/                  Analysis artifacts                         │
│        ├─ basic_info.json                                               │
│        ├─ obfuscation_report.json                                       │
│        ├─ sast_findings.json                                            │
│        ├─ manifest_findings.json                                        │
│        ├─ network_findings.json                                         │
│        └─ yara_*.txt                                                    │
│                                                                          │
│  dumps/                      Frida dump output                          │
│    ├─ dumped_dex_*.dex                                                   │
│    └─ memory_*.bin                                                       │
│                                                                          │
└──────────────────────────────────────────────────────────────────────────┘

┌─── USEFUL RESOURCES ────────────────────────────────────────────────────┐
│                                                                          │
│  Documentation:                                                          │
│  ├─ README.md                 Main documentation                        │
│  ├─ ANALYZER_README.md        User guide                                │
│  ├─ ANALYSIS_QUICK_REFERENCE  Quick ref & checklists                    │
│  ├─ FRAMEWORK_SUMMARY.md      Complete capabilities                     │
│  └─ ARCHITECTURE.txt          Architecture diagram                      │
│                                                                          │
│  External:                                                               │
│  ├─ OWASP MSTG: https://mas.owasp.org/                                  │
│  ├─ Frida: https://frida.re/                                            │
│  ├─ APKTool: https://ibotpeaches.github.io/Apktool/                     │
│  ├─ JADX: https://github.com/skylot/jadx                                │
│  └─ Androguard: https://github.com/androguard/androguard                │
│                                                                          │
└──────────────────────────────────────────────────────────────────────────┘

╔═══════════════════════════════════════════════════════════════════════════╗
║                         Version 1.0 - 2026-01-23                          ║
║                   Anais Static Core                      ║
║                    Educational and Research Use Only                      ║
╚═══════════════════════════════════════════════════════════════════════════╝
