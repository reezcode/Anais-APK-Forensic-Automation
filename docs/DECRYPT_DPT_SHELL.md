# DPT-Shell Encrypted DEX Analysis Guide

After extracting `assets/OoooooOooo` → `encrypted_dex_source.bin`, here are your options:

## 🎯 Option 1: Dynamic Analysis (Easiest & Most Reliable)

### Prerequisites

```bash
# Install Frida
pip3 install frida-tools

# Start Frida server on device
adb push frida-server /data/local/tmp/
adb shell "chmod 755 /data/local/tmp/frida-server"
adb shell "/data/local/tmp/frida-server &"
```

### Step 1: Install the APK

```bash
adb install CORETAX.apk
```

### Step 2: Run Frida Dumper

```bash
# The script is already generated: dpt_dex_dumper.js
frida -U -f id.go.mobilejtc.coretax -l dpt_dex_dumper.js --no-pause
```

### Step 3: Let App Start

- The app will start
- DPT-Shell will decrypt `assets/OoooooOooo`
- Frida will intercept and dump to `/data/local/tmp/decrypted_dex.zip`

### Step 4: Pull Decrypted DEX

```bash
adb pull /data/local/tmp/decrypted_dex.zip
# or
adb pull /data/local/tmp/decrypted_from_load.zip
```

### Step 5: Analyze Decrypted DEX

```bash
# Check contents
unzip -l decrypted_dex.zip

# Decompile with JADX
jadx decrypted_dex.zip

# Or extract classes.dex
unzip decrypted_dex.zip
jadx classes.dex
```

---

## 🔧 Option 2: Manual Runtime Extraction

### Monitor code_cache Directory

```bash
# Shell into device
adb shell

# Monitor file creation (run before launching app)
su
inotifywait -m /data/data/id.go.mobilejtc.coretax/code_cache/

# In another terminal, launch app
adb shell am start -n id.go.mobilejtc.coretax/.MainActivity

# When you see i11111i111.zip created, pull it
adb pull /data/data/id.go.mobilejtc.coretax/code_cache/i11111i111.zip
```

### Alternative: Use run-as (non-root)

```bash
# Launch app first
adb shell am start -n id.go.mobilejtc.coretax/.MainActivity

# Wait a few seconds for decryption
sleep 5

# Copy from app directory
adb shell "run-as id.go.mobilejtc.coretax cat code_cache/i11111i111.zip" > decrypted.zip

# Analyze
jadx decrypted.zip
```

---

## 🔬 Option 3: Reverse Engineer libdpt.so (Advanced)

### Analyze Decryption Routine

```bash
# Extract libdpt.so
unzip -p CORETAX.apk assets/vwwwwwvwww/arm64/libdpt.so > libdpt.so

# Load in Ghidra or IDA Pro
# Look for:
# 1. JNI_OnLoad function
# 2. File read operations (fopen, fread on "OoooooOooo")
# 3. Decryption algorithm (likely AES/DES/custom XOR)
# 4. File write to code_cache
```

### Find Decryption Key

```bash
# Search for potential keys in libdpt.so
strings libdpt.so | grep -E '^[A-Za-z0-9+/=]{16,}$'

# Or use Frida to hook and log encryption key
# (requires understanding the decryption function signature)
```

---

## 🛠️ Option 4: Memory Dump (Root Required)

### Dump Process Memory After Decryption

```bash
# Start app
adb shell am start -n id.go.mobilejtc.coretax/.MainActivity

# Wait for DEX to load
sleep 10

# Find process PID
PID=$(adb shell "ps | grep coretax" | awk '{print $2}')

# Dump memory
adb shell "su -c 'cat /proc/$PID/maps'"

# Look for code_cache mapped regions
# Dump that region
adb shell "su -c 'dd if=/proc/$PID/mem of=/data/local/tmp/dex_dump.bin bs=1 skip=<start_addr> count=<size>'"

# Pull and analyze
adb pull /data/local/tmp/dex_dump.bin
```

---

## 📊 Analyzing encrypted_dex_source.bin (Static - Limited)

### Check File Structure

```bash
# View hex dump
xxd encrypted_dex_source.bin | head -50

# Calculate entropy (high = encrypted)
ent encrypted_dex_source.bin

# Look for patterns
binwalk encrypted_dex_source.bin

# Search for embedded strings
strings encrypted_dex_source.bin | less
```

### Identify Encryption Algorithm

The file you extracted is encrypted. Common DPT-Shell encryptions:

- **AES-128/256** - Most common
- **Custom XOR** - Some variants
- **TEA/XTEA** - Older versions
- **RC4** - Less common

**Without the decryption key from libdpt.so, static decryption is extremely difficult.**

---

## ⚡ Quick Start (Recommended Path)

### For Rooted Device:

```bash
# 1. Install app
adb install CORETAX.apk

# 2. Start app
adb shell am start -n id.go.mobilejtc.coretax/.MainActivity

# 3. Wait 5 seconds
sleep 5

# 4. Pull decrypted file
adb pull /data/data/id.go.mobilejtc.coretax/code_cache/i11111i111.zip

# 5. Analyze
jadx i11111i111.zip
```

### For Non-Rooted Device with Frida:

```bash
# 1. Start Frida server on device
adb shell "/data/local/tmp/frida-server &"

# 2. Run dumper script
frida -U -f id.go.mobilejtc.coretax -l dpt_dex_dumper.js --no-pause

# 3. Wait for output: "✅ Decrypted DEX dumped to..."

# 4. Pull file
adb pull /data/local/tmp/decrypted_dex.zip

# 5. Analyze
jadx decrypted_dex.zip
```

---

## 🎯 Expected Results

### Decrypted ZIP Contents

```
i11111i111.zip
├── classes.dex          # Main DEX file
├── classes2.dex         # Additional DEX (if present)
└── ...                  # Other resources
```

### File Sizes

- **Encrypted:** ~3.5 MB (`OoooooOooo`)
- **Decrypted:** ~4-6 MB (ZIP with DEX inside)
- **DEX file:** ~3-5 MB (uncompressed)

---

## 🚨 Troubleshooting

### Frida Script Not Working

```bash
# Check Frida server is running
adb shell "ps | grep frida"

# Check Frida can connect
frida-ps -U

# Restart Frida server
adb shell "killall frida-server"
adb shell "/data/local/tmp/frida-server &"
```

### File Not Found in code_cache

```bash
# Check app permissions
adb shell "ls -la /data/data/id.go.mobilejtc.coretax/"

# App might use different directory
adb shell "find /data/data/id.go.mobilejtc.coretax/ -name '*111*.zip'"

# Or search for any recent .zip files
adb shell "find /data/data/id.go.mobilejtc.coretax/ -name '*.zip' -mmin -5"
```

### App Crashes on Start

- DPT-Shell might detect Frida
- Try Frida with anti-detection: `frida -U -f <package> --realm=emulated`
- Or use manual extraction after app starts normally

---

## 📝 Next Steps After Getting Decrypted DEX

1. **Decompile with JADX:**

   ```bash
   jadx -d output_folder decrypted_dex.zip
   ```

2. **Search for malicious code:**

   ```bash
   grep -r "Runtime.exec" output_folder/
   grep -r "http://" output_folder/
   grep -r "crypto" output_folder/
   ```

3. **Re-run SAST on decrypted code:**

   ```bash
   ./anais/malware_analyzer.sh decrypted_dex.zip
   ```

4. **Compare with original analysis** to see what was hidden

---

## 🎓 Understanding DPT-Shell Flow

```
APK Installation
    ↓
App Starts
    ↓
Application.attachBaseContext()
    ↓
libdpt.so → JNI_OnLoad()
    ↓
Reads: assets/OoooooOooo (encrypted)
    ↓
Decrypts with AES/Custom Algorithm
    ↓
Writes: code_cache/i11111i111.zip (decrypted)
    ↓
DexClassLoader loads i11111i111.zip
    ↓
Real App Code Executes
```

Your Frida hook catches step 5 (write) or step 6 (load)! 🎯
