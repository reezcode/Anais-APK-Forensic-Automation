# Android Malware Analysis Report

**Generated:** 2026-01-29 14:26:31

**APK:** `coretax.apk`

**SHA256:** `6c13831a8daedb1bd6f5662d9f8b11052bd8b8173f387f0e1e3dfdf8e639969e`


---


## 📑 Quick Navigation

- [Executive Summary](#executive-summary)
- [APK Information](#apk-information)
- [Protection & Obfuscation](#protection-obfuscation)
- 🔗 [Security Findings (SAST)](./sast_findings.md)
- 🔗 [AndroidManifest Analysis](./manifest_analysis.md)
- 🔗 [Network Analysis](./network_analysis.md)
- 🔗 [YARA Scan Results](./yara_results.md)
- 🔗 [Detailed Recommendations](./recommendations.md)


## 📊 Executive Summary {#executive-summary}

**Overall Risk Level:** 🔴 **CRITICAL** (Score: 83/100)

- **Obfuscation Type:** `DPT-SHELL`
- **Total Security Findings:** 13
- **Critical Issues:** 0


## 📱 APK Information {#apk-information}

| Property | Value |
|----------|-------|
| Package Name | `N/A` |
| App Name | N/A |
| Version | N/A (N/A) |
| Min SDK | N/A |
| Target SDK | N/A |
| Signed | False |
| Permissions | 0 |
| Activities | 0 |
| Services | 0 |
| Receivers | 0 |


## 🔒 Protection & Obfuscation Analysis {#protection-obfuscation}

**Type:** `DPT-SHELL`
**Confidence:** 99%

### 🚨 Stub DEX Detected

⚠️ **Real DEX is NOT in the APK** - it will be unpacked at runtime

**classes.dex:** Stub DEX
- Protection strings found: libdpt.so, JniBridge, ProxyApplication, ProxyComponentFactory, com/jx/shell, attachBaseContext

### 🔍 Protection Library Analysis

**Native libraries analyzed for protection artifacts:**


#### 📦 `assets/vwwwwwvwww/arm/libdpt.so`

- **Size:** 224.68 KB
- **Strings Extracted:** 2866
- **Categories Found:** 15

**🎯 DEX Files:** 1 found
  - `classes.dex`

**🔒 ZIP Files (Encrypted Containers):** 1 found
  - `i11111i111.zip`

**📁 Code Cache Paths:** 1 found
  - `code_cache`

**🔐 Encryption Keywords:** 20 found
  - `pthread_key_create`
  - `dpt_native`
  - `N10__cxxabiv117__class_type_infoE`
  - `N10__cxxabiv121__vmi_class_type_infoE`
  - `pthread_mutex_destroy`
  - ... and 15 more

**🔧 ClassLoaders:** 4 found
  - `(Ljava/lang/ClassLoader;)V`
  - `dalvik/system/BaseDexClassLoader`
  - `N3dpt7reflect32dalvik_system_BaseDexClassLoaderE`
  - `(Ljava/lang/ClassLoader;Ljava/lang/String;)V`

**🐚 Shell/Protection Keywords:** 35 found
  - `dalvik/system/BaseDexClassLoader`
  - `libbytehook.so`
  - `__loader_android_dlopen_ext`
  - `hook chain: auto RESTORE. GOT %x: %x -> %x, %s, %s`
  - `com/jx/shell/JniBridge`
  - ... and 30 more


#### 📦 `assets/vwwwwwvwww/arm64/libdpt.so`

- **Size:** 358.88 KB
- **Strings Extracted:** 1324
- **Categories Found:** 15

**🎯 DEX Files:** 1 found
  - `classes.dex`

**🔒 ZIP Files (Encrypted Containers):** 1 found
  - `i11111i111.zip`

**📁 Code Cache Paths:** 1 found
  - `code_cache`

**🔐 Encryption Keywords:** 21 found
  - `pthread_key_create`
  - `dpt_native`
  - `N10__cxxabiv117__class_type_infoE`
  - `N10__cxxabiv121__vmi_class_type_infoE`
  - `pthread_mutex_destroy`
  - ... and 16 more

**🔧 ClassLoaders:** 4 found
  - `(Ljava/lang/ClassLoader;)V`
  - `dalvik/system/BaseDexClassLoader`
  - `N3dpt7reflect32dalvik_system_BaseDexClassLoaderE`
  - `(Ljava/lang/ClassLoader;Ljava/lang/String;)V`

**🐚 Shell/Protection Keywords:** 37 found
  - `dalvik/system/BaseDexClassLoader`
  - `libbytehook.so`
  - `__loader_android_dlopen_ext`
  - `com/jx/shell/JniBridge`
  - `hook chain: hook OK. GOT %lx: + %lx, %s, %s`
  - ... and 32 more


### 🔒 Encrypted Payloads Found: 40

**lib/arm64-v8a/libASDFGHJ.so**
- Type: Unknown
- Size: 16.6 KB
- Entropy: 5.7

**lib/arm64-v8a/libyuv-utils.so**
- Type: Unknown
- Size: 294.2 KB
- Entropy: 4.06

**lib/arm64-v8a/liboeQktIUn.so**
- Type: Unknown
- Size: 337.8 KB
- Entropy: 3.67

**lib/arm64-v8a/libsentry-android.so**
- Type: Unknown
- Size: 16.4 KB
- Entropy: 4.62

**lib/arm64-v8a/libwAErpfZc.so**
- Type: Unknown
- Size: 125.8 KB
- Entropy: 5.74

*...and 35 more encrypted payloads*

### 📍 Predicted Runtime Unpack Locations

Monitor these paths during dynamic analysis:

- 🔴 `/data/data/<package>/code_cache/`
  Code cache directory (DPT-shell stores encrypted zip here)
- 🔴 `/data/data/<package>/app_dex/`
  Common DEX cache directory
- 🔴 `/data/data/<package>/files/`
  App files directory

### Detection Indicators

- DPT-Shell/jx.shell source files detected: 9 files
-   - sources/com/jx/shell/JniBridge.java
-   - sources/com/jx/shell/ProxyApplication.java
-   - sources/com/jx/shell/ProxyComponentFactory.java
-   - sources/com/jx/shell/JniBridge.java
-   - sources/com/jx/shell/ProxyApplication.java
-   - sources/com/jx/shell/ProxyComponentFactory.java
-   - sources/com/jx/shell/JniBridge.java
-   - sources/com/jx/shell/ProxyApplication.java
-   - sources/com/jx/shell/ProxyComponentFactory.java

*...and 1 more indicators*

### Analysis Recommendations

🔴 **Dynamic Analysis Required**
  Stub DEX detected - real DEX is encrypted/hidden and will be unpacked at runtime  
🔴 **Monitor Runtime Unpacking**
  Use Frida hooks to intercept DexFile.loadDex, DexClassLoader, and file writes  
🔴 **DPT-Shell Protection Detected**
  libdpt.so found with suspicious strings - check artifacts for encrypted zip filename and paths  

DYNAMIC ANALYSIS REQUIRED - NATIVE PROTECTION DETECTED  
1. Install APK on rooted Android device or emulator (Android 7-10 recommended)  
2. Use Frida with frida-dexdump or similar tool  
3. Run the application to trigger DEX unpacking  
4. Dump decrypted DEX from memory:  
   - frida-dexdump -U -f <package_name>  
   - Or use frida -U -f <package_name> -l frida_dex_dump.js  
5. Analyze dumped DEX files with JADX/APKTool  
6. Alternative: Use FART, DexHunter, or ZjDroid  
7. Monitor native library loading with Frida hooks  
8. Consider using Android Hooking/Instrumentation for API monitoring  
  
SPECIFIC TOOLS FOR THIS PROTECTION:  
- DPT-Shell unpacker tools  
- Frida script: frida_dex_dump.js (included)  
- FRIDA command: frida -U -f com.package.name -l frida_dex_dump.js --no-pause  
- Monitor JniBridge and libdpt.so loading  
- Hook ProxyApplication.attachBaseContext()  


## 📊 Analysis Results Summary


**🔴 Security Findings:** 13 issues found
- Critical: 0
- High: 0
- Medium: 0
- Low: 0

**🌐 Network Artifacts:**
- URLs found: 0
- Suspicious URLs: 0

### For Detailed Analysis:

- 📄 **[Security Findings (SAST)](./sast_findings.md)** - Complete vulnerability analysis
- 📄 **[Manifest Analysis](./manifest_analysis.md)** - Permission and component security
- 📄 **[Network Analysis](./network_analysis.md)** - Network artifacts and C2 indicators
- 📄 **[YARA Results](./yara_results.md)** - Malware pattern matching
- 📄 **[Recommendations](./recommendations.md)** - Actionable security guidance
