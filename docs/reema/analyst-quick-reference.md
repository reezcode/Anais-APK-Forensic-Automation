# 🔍 Android Malware Analysis - Quick Reference Guide

## 📌 Workflow Overview

```
START
  ↓
┌─────────────────────────────────┐
│  1. INITIAL ASSESSMENT          │
│  - File hash (SHA256, MD5)      │
│  - File size                    │
│  - Basic APK info               │
└────────────┬────────────────────┘
             ↓
┌─────────────────────────────────┐
│  2. PROTECTION CHECK            │
│  - ZIP encryption?              │
│  - Password protected?          │
│  - Header manipulation?         │
└────────────┬────────────────────┘
             ↓
         Protected?
         ├─ YES → Fix Headers
         └─ NO  → Continue
             ↓
┌─────────────────────────────────┐
│  3. DECOMPILATION               │
│  - APKTool (SMALI)              │
│  - JADX (Java source)           │
└────────────┬────────────────────┘
             ↓
┌─────────────────────────────────┐
│  4. OBFUSCATION DETECTION       │
│  - ProGuard/R8?                 │
│  - DPT-Shell?                   │
│  - DexProtector?                │
│  - Bangcle?                     │
└────────────┬────────────────────┘
             ↓
     Advanced Protection?
     ├─ YES → DYNAMIC ANALYSIS
     │         ↓
     │    ┌──────────────────────┐
     │    │ - Install on device  │
     │    │ - Run app            │
     │    │ - Frida hooks        │
     │    │ - DEX dump           │
     │    │ - Re-analyze         │
     │    └──────────────────────┘
     │
     └─ NO → STATIC ANALYSIS
                ↓
┌─────────────────────────────────┐
│  5. STATIC ANALYSIS (SAST)      │
│  - Pattern matching             │
│  - Vulnerability detection      │
│  - Code review                  │
└────────────┬────────────────────┘
             ↓
┌─────────────────────────────────┐
│  6. ARTIFACT EXTRACTION         │
│  - Network URLs                 │
│  - Domains & IPs                │
│  - C2 indicators                │
│  - Crypto wallets               │
└────────────┬────────────────────┘
             ↓
┌─────────────────────────────────┐
│  7. MANIFEST ANALYSIS           │
│  - Permissions                  │
│  - Components                   │
│  - Misconfigurations            │
└────────────┬────────────────────┘
             ↓
┌─────────────────────────────────┐
│  8. YARA SCANNING               │
│  - Known malware families       │
│  - Suspicious patterns          │
│  - IOC matching                 │
└────────────┬────────────────────┘
             ↓
┌─────────────────────────────────┐
│  9. REPORT GENERATION           │
│  - Findings summary             │
│  - Risk scoring                 │
│  - Evidence (code snippets)     │
│  - Recommendations              │
└─────────────────────────────────┘
  ↓
END
```

## 🎯 Quick Commands

### Static Analysis

```bash
# Full analysis
./malware_analyzer.sh app.apk

# With custom YARA rules
yara -r custom_rules.yar decompiled_dir/
```

### Dynamic Analysis

```bash
# Install Frida server
./dynamic_analysis_helper.sh install-frida

# Dump DEX files
./dynamic_analysis_helper.sh dex-dump com.malware.app

# Hook crypto operations
./dynamic_analysis_helper.sh hook-crypto com.malware.app

# Hook network
./dynamic_analysis_helper.sh hook-network com.malware.app

# Pull dumps
./dynamic_analysis_helper.sh pull-dumps
```

### Manual Frida Usage

```bash
# List processes
frida-ps -U

# Attach to app
frida -U -f com.malware.app

# Run script
frida -U -f com.malware.app -l script.js --no-pause
```

## 🔥 Common Attack Patterns

### 1. Banking Trojan

**Indicators:**

- Accessibility service abuse
- Overlay windows (SYSTEM_ALERT_WINDOW)
- SMS interception
- Screen recording
- Contact list access

**Detection:**

```bash
# Look for
- AccessibilityService implementation
- WindowManager.addView
- TYPE_SYSTEM_OVERLAY
- MediaProjection
```

### 2. Crypto Wallet Stealer

**Indicators:**

- Wallet app package names
- Mnemonic/seed phrase keywords
- Clipboard monitoring
- Keylogging via accessibility

**Detection:**

```bash
# Search for
- im.token.app
- io.metamask
- "mnemonic"
- "seed phrase"
- ClipboardManager
```

### 3. Spyware

**Indicators:**

- Location tracking
- Contact exfiltration
- Call log access
- SMS reading
- Camera/microphone access

**Detection:**

```bash
# Check permissions
- ACCESS_FINE_LOCATION
- READ_CONTACTS
- READ_CALL_LOG
- READ_SMS
- CAMERA, RECORD_AUDIO
```

### 4. C2 Malware

**Indicators:**

- WebSocket connections
- Suspicious domains (.top, .xyz)
- Periodic network checks
- Command execution

**Detection:**

```bash
# Look for
- wss:// connections
- Suspicious TLDs
- AlarmManager (periodic tasks)
- Runtime.exec
```

## 🛡️ Protection Types & Bypass Methods

### ProGuard/R8

**Characteristics:**

- Short class/method names (a.java, b(), c)
- Package flattening
- String encryption

**Analysis:**

- ✅ Static analysis possible
- Use JADX with deobfuscation
- Focus on network/crypto APIs

### DPT-Shell

**Characteristics:**

- libdpt.so present
- DEX header manipulation
- Native code decryption

**Bypass:**

```bash
1. Install APK on rooted device
2. Run app to trigger unpacking
3. frida-dexdump -U -f com.app
4. Analyze dumped DEX
```

### DexProtector

**Characteristics:**

- libprotect.so / libexec.so
- String encryption
- Control flow obfuscation

**Bypass:**

- Same as DPT-Shell
- Use memory dumps
- Hook native functions

### Bangcle

**Characteristics:**

- libbangcle.so
- Application class wrapper
- DEX encryption

**Bypass:**

- Dynamic unpacking required
- Dump from /data/data/app/

## 📊 Risk Scoring Guide

| Score  | Level       | Description         | Action            |
| ------ | ----------- | ------------------- | ----------------- |
| 0-19   | 🟢 LOW      | Minor issues        | Review & monitor  |
| 20-39  | 🟡 MEDIUM   | Security concerns   | Investigate       |
| 40-69  | 🟠 HIGH     | Suspicious behavior | Detailed analysis |
| 70-100 | 🔴 CRITICAL | Confirmed malware   | Immediate action  |

## 🔍 Key Files to Check

### AndroidManifest.xml

```xml
<!-- Dangerous permissions -->
<uses-permission android:name="android.permission.BIND_ACCESSIBILITY_SERVICE"/>
<uses-permission android:name="android.permission.SYSTEM_ALERT_WINDOW"/>
<uses-permission android:name="android.permission.REQUEST_INSTALL_PACKAGES"/>

<!-- Exported components without protection -->
<service android:name=".MaliciousService" android:exported="true"/>

<!-- Debuggable flag -->
<application android:debuggable="true">
```

### SMALI Code Patterns

```smali
# Runtime.exec usage
invoke-virtual {v0, v1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)

# DexClassLoader
invoke-direct {v0, v1, v2, v3, v4}, Ldalvik/system/DexClassLoader;-><init>

# Accessibility Service
Landroid/accessibilityservice/AccessibilityService;
```

### Java Code Patterns

```java
// Dynamic code loading
DexClassLoader loader = new DexClassLoader(dexPath, ...);

// Native library loading
System.loadLibrary("suspicious");

// Root detection bypass
Runtime.getRuntime().exec("su");

// Reflection abuse
Method method = clazz.getDeclaredMethod("hidden", ...);
method.invoke(instance, ...);
```

## 🎓 Analysis Checklist

### Initial Triage

- [ ] Calculate file hashes
- [ ] Check file size (unusually large/small?)
- [ ] Verify APK signature
- [ ] Extract basic info (package, version)
- [ ] Check VirusTotal/online scanners

### Static Analysis

- [ ] Decompile with APKTool
- [ ] Decompile with JADX
- [ ] Detect obfuscation type
- [ ] Analyze AndroidManifest.xml
- [ ] Review dangerous permissions
- [ ] Check exported components
- [ ] Scan with YARA rules
- [ ] Extract network artifacts
- [ ] Review native libraries
- [ ] Check assets directory

### Dynamic Analysis (if needed)

- [ ] Setup isolated environment
- [ ] Install APK on test device
- [ ] Monitor network traffic
- [ ] Hook sensitive APIs with Frida
- [ ] Dump DEX from memory
- [ ] Capture screenshots/screen recording
- [ ] Monitor file system changes
- [ ] Check IPC/broadcasts

### Documentation

- [ ] Document all findings
- [ ] Include code evidence
- [ ] List IOCs (domains, IPs, hashes)
- [ ] Calculate risk score
- [ ] Provide remediation steps
- [ ] Generate final report

## 📱 Testing Environment Setup

### Recommended Setup

```
Host Machine (macOS/Linux)
  ├── Analysis tools (APKTool, JADX, YARA)
  ├── Python environment
  └── Frida tools

Android Emulator/Device
  ├── Rooted (Magisk)
  ├── Android 7-10 (best for analysis)
  ├── Frida server installed
  ├── SSL bypass modules
  └── Network monitoring (tcpdump/mitmproxy)
```

### Device Prep

```bash
# Root check
adb shell su -c "id"

# Install Frida server
./dynamic_analysis_helper.sh install-frida

# Disable SSL pinning (if using Magisk)
# Install TrustMeAlready or similar module

# Network monitoring
adb shell tcpdump -i wlan0 -w /sdcard/capture.pcap
```

## 🚨 Red Flags

Immediate investigation if found:

- ✋ BIND_ACCESSIBILITY_SERVICE permission
- ✋ SYSTEM_ALERT_WINDOW + banking app targeting
- ✋ WebSocket to suspicious domain
- ✋ Crypto wallet package names + clipboard access
- ✋ SMS_RECEIVED + abortBroadcast
- ✋ REQUEST_INSTALL_PACKAGES permission
- ✋ Native protection + network activity
- ✋ String encryption + C2 patterns
- ✋ Screen recording + accessibility
- ✋ Root detection bypass + data exfiltration

## 📚 Additional Resources

### Tools

- **APKTool:** https://ibotpeaches.github.io/Apktool/
- **JADX:** https://github.com/skylot/jadx
- **Frida:** https://frida.re/
- **Androguard:** https://github.com/androguard/androguard
- **YARA:** https://virustotal.github.io/yara/

### Learning

- **OWASP MSTG:** https://mas.owasp.org/
- **Android Security:** https://source.android.com/security
- **Malware Analysis:** https://www.malware-traffic-analysis.net/

---

**Remember:** Always analyze malware in isolated environment!
