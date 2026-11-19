# Mobile App Pentest / Vulnerability Assessment — Static (JADX) + Dynamic (Frida)

Scope: full-surface Android assessment — not just chained-escalation bugs, but also
standalone issues (weak crypto, hardcoded secrets, insecure storage, info leaks, debug
flags, etc). Methodology below, use as checklist.

---

## 0. Prep

1. Get target APK (and if possible, a rooted/emulated test device + Burp/mitmproxy CA installed).
2. Record app package name, version, build variant (debug/release).
3. Unpack baseline:
   - `apktool d app.apk` — resources, smali, AndroidManifest.xml in plaintext.
   - `jadx -d out/ app.apk` (or GUI) — Java-ish decompiled source, easier to read than smali.
4. Keep both outputs — jadx can choke/garble on some obfuscated or native-heavy code; smali is ground truth.

---

## 1. Static Analysis via JADX

### 1.1 Manifest review (`AndroidManifest.xml`)
- `android:debuggable="true"` — must be false in release.
- `android:allowBackup="true"` — ADB backup can exfiltrate app data.
- `android:backupAgent` custom agent — check what it actually backs up.
- `exported="true"` on Activities/Services/Receivers/Providers without permission guard → IPC attack surface. Also check implicit export (has `<intent-filter>` but no explicit `android:exported` on API < 31 → defaults exported).
- `android:usesCleartextTraffic="true"` and absence of `network_security_config.xml` → cleartext HTTP allowed.
- `network_security_config.xml` present but with `<trust-anchors><certificates src="user"/>` → trusts user-added CAs, defeats pinning value.
- Custom permissions with `protectionLevel="normal"` instead of `signature`/`signatureOrSystem`.
- Permissions requested: dangerous/overbroad (`READ_SMS`, `READ_CONTACTS`, `ACCESS_FINE_LOCATION`, `RECORD_AUDIO`, `CAMERA`, `READ_EXTERNAL_STORAGE`, `MANAGE_EXTERNAL_STORAGE`, `QUERY_ALL_PACKAGES`) vs. what app actually needs.
- Intent filters — deep links / custom URI schemes (potential for intent spoofing, task hijacking). Check `android:host`/`android:pathPattern` for overly broad matching (`*`).
- `android:taskAffinity`/`android:launchMode` misconfig → task hijacking (StrandHogg-style).
- `minSdkVersion`/`targetSdkVersion` — low value means fewer platform mitigations enforced (no scoped storage, no network security config default, etc).
- `android:sharedUserId` — legacy, broadens signature-level access with other apps.
- `<meta-data>` tags — sometimes contain API keys/config directly in manifest (e.g. Google Maps API key, Facebook App ID/Secret, Crashlytics tokens).
- `android:extractNativeLibs`, `android:multiArch` — not security per se but note for native review scope.
- FileProvider `<provider>` with `grantUriPermissions="true"` and overly broad `<paths>` (`<root-path path="." />`) → path traversal via content URI.

### 1.2 Hardcoded secrets & sensitive data
Search decompiled tree + resources (java/, resources/, assets/, res/raw, res/values) for:
- API keys, tokens, AWS/GCP/Azure/Firebase keys, OAuth client secrets, Stripe/PayPal/Twilio/SendGrid keys.
- Hardcoded usernames/passwords, private keys (`BEGIN RSA/EC/OPENSSH PRIVATE KEY`), `.pem`/`.jks`/`.p12`/`.keystore` bundled in assets.
- `strings.xml`, `res/raw`, `assets/` — configs, URLs, backend endpoints, firebase DB URLs.
- `BuildConfig.java` — leftover debug URLs/flags, build-time injected secrets (`buildConfigField` in gradle).
- `.env`, `.properties`, `google-services.json`, `local.properties`, `gradle.properties` bundled by mistake.
- Database connection strings (JDBC URLs with embedded creds), internal hostnames/IPs leaking infra topology.

**Keyword/pattern list for grep (case-insensitive):**

| Category | Patterns |
|---|---|
| Generic secret names | `secret`, `password`, `passwd`, `pwd`, `pass`, `credential`, `apikey`, `api_key`, `api-key`, `access_key`, `accesskey`, `access_token`, `auth_token`, `authtoken`, `client_secret`, `client_id`, `private_key`, `privatekey`, `encryption_key`, `enc_key`, `signing_key`, `master_key`, `session_key`, `security_token`, `bearer` |
| Cloud provider keys | AWS: `AKIA[0-9A-Z]{16}`, `aws_secret_access_key`, `aws_access_key_id`; GCP: `AIza[0-9A-Za-z\\-_]{35}`, `"type": "service_account"`; Azure: `DefaultEndpointsProtocol=`, `AccountKey=`; generic `-----BEGIN (RSA\|EC\|DSA\|OPENSSH\|PGP) PRIVATE KEY-----` |
| Firebase/Google | `firebaseio.com`, `firebasedatabase.app`, `AIzaSy[0-9A-Za-z_\\-]{33}`, `.googleapis.com`, `google-services.json`, `GoogleService-Info.plist` |
| Payment/SaaS SDKs | Stripe `sk_live_`, `pk_live_`, `rk_live_`; PayPal `client_id`/`client_secret` near `paypal`; Twilio `SK[0-9a-fA-F]{32}`, `AC[0-9a-fA-F]{32}`; SendGrid `SG\.[A-Za-z0-9_\-\.]{66}`; Mailgun `key-[0-9a-zA-Z]{32}`; Slack `xox[baprs]-`; Mapbox `pk\.eyJ` / `sk\.eyJ` |
| JWT / tokens | `eyJ[A-Za-z0-9_-]{10,}\.[A-Za-z0-9_-]{10,}\.[A-Za-z0-9_-]{10,}` (JWT shape), `Bearer [A-Za-z0-9\-_\.=]+`, `Basic [A-Za-z0-9+/=]{20,}` (hardcoded basic auth) |
| Infra / backend | `jdbc:mysql://`, `jdbc:postgresql://`, `mongodb://`, `mongodb+srv://`, `redis://`, `amqp://`, internal IP ranges `10\.`, `172\.(1[6-9]\|2[0-9]\|3[01])\.`, `192\.168\.`, internal hostnames `.internal`, `.local`, `.corp` |
| Crypto material | `BEGIN CERTIFICATE`, `.keystore`, `.jks`, `.p12`, `keystorePassword`, `keyPassword`, `storePassword` (often in leftover `build.gradle` inside APK or debug resources) |
| Comments/leftovers | `TODO.*(password\|key\|secret)`, `FIXME.*(password\|key\|secret)`, `test.*password`, `debug.*key`, `backdoor`, `hardcode` |
| Generic high-entropy | Any quoted string literal ≥ 20 chars of mixed-case alnum/symbols assigned to a field named like above — flag for manual review even without keyword match (entropy-based secret scanners, e.g. `trufflehog`/`gitleaks` regex set, catch what keyword grep misses). |

Also run a dedicated secret-scanner against the decompiled/unpacked tree (not just manual grep) for full coverage: `gitleaks detect --source out/`, `trufflehog filesystem out/`, or MobSF's built-in secret finder — these ship maintained, continuously-updated regex/entropy rules that are more complete than any manually hand-written keyword list.

### 1.3 Cryptography review

**Weak/broken primitives to grep for:**
- Ciphers: `DES`, `DESede`/`3DES`, `RC2`, `RC4`, `ARC4`, `Blowfish` (weak/legacy for new use), raw `AES` without mode specified (defaults to ECB on some providers).
- Hashes: `MD5`, `MD4`, `SHA-1`/`SHA1` for integrity/password use (fine for non-security checksums only).
- Modes: `/ECB/` in any `Cipher.getInstance("...")` string — no IV, pattern leakage. `/CBC/` without HMAC (no authenticated encryption, padding-oracle risk) — check for `GCM` as the safe counter-example.
- Key sizes: AES-128 flagged if policy requires 256; RSA < 2048 bits; DSA/ECC curves < 224 bits.
- PBKDF: `PBEWithMD5AndDES`, low iteration counts in `PBEKeySpec`/`PBKDF2WithHmacSHA1` (< 10,000 iterations), or straight unsalted hash used as "password hashing" instead of bcrypt/argon2/scrypt/PBKDF2.

**Key/IV/seed material handling:**
- Hardcoded encryption keys/IVs: `SecretKeySpec(byte[] ...)`, `IvParameterSpec(byte[] ...)` with literal byte arrays or string-derived keys (`"mysecretkey".getBytes()`).
- Static/predictable salt for password hashing (or no salt) — literal salt byte arrays, or salt == username/fixed string.
- Key derived from easily-guessable material: device ID, package name, hardcoded string, app version.
- IV reuse across encryptions (same `IvParameterSpec` instance/constant reused) — breaks CBC/CTR/GCM confidentiality guarantees.
- Custom/home-rolled crypto instead of vetted libs (custom XOR "encryption", custom base64-as-encryption, bit-shifting obfuscation presented as crypto).
- `SecureRandom` misuse: seeded (`new SecureRandom(fixedSeedBytes)`), or `java.util.Random()`/`Math.random()` used for tokens, nonces, OTPs, password reset codes, session IDs.
- `KeyStore`/`AndroidKeyStore` usage check — is the hardware-backed keystore actually used for key storage, or is key material kept in app memory/Java heap/SharedPreferences instead?

**TLS/pinning:**
- TrustManager/HostnameVerifier overrides that accept all certs: empty-body `checkClientTrusted`/`checkServerTrusted`, `return true` in `verify()`, `setDefaultHostnameVerifier(ALLOW_ALL_HOSTNAME_VERIFIER)`.
- `SSLContext.init(..., trustAllCerts, ...)` patterns, `X509TrustManager` anonymous class with no-op methods.
- `okhttp3.OkHttpClient.Builder().sslSocketFactory(..., trustAllCerts)` or `.hostnameVerifier { _, _ -> true }`.
- Pinning present? absent entirely, weak (single pin with no backup pin → bricks on rotation but also means easy to spot/strip), or has a debug-build bypass flag left enabled in release (`if (BuildConfig.DEBUG) skipPinning()` where DEBUG flag mismapped).
- Certificate/key material (`.cer`, `.crt`, `.p12` used for pin bundled as asset) — check expiry, algorithm (SHA1 cert = weak).

**Grep pattern cheat-sheet:**
`Cipher\.getInstance\(.*(DES|RC2|RC4|ECB).*\)`, `MessageDigest\.getInstance\(.*(MD5|SHA-1|SHA1).*\)`, `new SecretKeySpec`, `new IvParameterSpec`, `new SecureRandom\(`, `new Random\(`, `PBEWithMD5`, `TrustManager`, `HostnameVerifier`, `ALLOW_ALL_HOSTNAME_VERIFIER`, `X509TrustManager`, `checkServerTrusted`, `setDefaultHostnameVerifier`, `CertificatePinner`.

### 1.4 Insecure data storage
- `SharedPreferences` storing tokens/PII in plaintext (no `EncryptedSharedPreferences`/Jetpack Security).
- SQLite DBs without encryption (no SQLCipher/Room+SQLCipher), stored in `/data/data/<pkg>/databases`.
- `MODE_WORLD_READABLE`/`MODE_WORLD_WRITABLE` (legacy, pre API-17, still check in old codebases).
- File creation with weak perms: `openFileOutput(name, 0)` vs explicit `MODE_PRIVATE` — confirm default is private, check for accidental world perms via `chmod`/`Runtime.exec("chmod 777 ...")`.
- Logging of sensitive data: `Log.d/.i/.e/.w/.v`, `System.out.println`, `printStackTrace()` with tokens, PII, passwords, full request/response bodies, stack traces leaking internals.
- Sensitive data written to external storage: `getExternalStorageDirectory()`, `getExternalFilesDir()`, `Environment.getExternalStoragePublicDirectory()` — world-accessible on older Android, scoped storage bypass attempts on newer.
- Clipboard usage for sensitive fields: `ClipboardManager.setPrimaryClip` after copying OTP/password/card number without `CLIPBOARD_IS_SENSITIVE` flag and without timed clear.
- Screenshots/task-switcher leakage: missing `FLAG_SECURE` (`WindowManager.LayoutParams.FLAG_SECURE`) on screens showing PII, card numbers, auth codes.
- Autofill/keyboard cache: sensitive `EditText` fields missing `android:importantForAutofill="no"` or proper `inputType` (password fields not masked, or `autofillHints` leaking into autofill service).
- Backup exposure: data written to paths included in `android:fullBackupContent` rules, or default-included when `allowBackup=true` with no exclusion rules.
- Temp/cache files: sensitive data written to `getCacheDir()`/`getCodeCacheDir()` without cleanup, or to `/sdcard/Android/data/<pkg>/cache`.
- IPC data leakage: sensitive data passed via `Intent` extras to other apps/components without `FLAG_GRANT_READ_URI_PERMISSION` scoping, or broadcast sent non-locally (should use `LocalBroadcastManager`/`sendBroadcast` with receiver permission) so other apps can intercept via registered receivers.
- Third-party keyboard/IME interaction with sensitive input fields — no mitigation possible client-side beyond `inputType`, but note exposure.
- Biometric/credential prompt implementation: `BiometricPrompt`/`FingerprintManager` result not tied to a `CryptoObject`/Keystore-backed key → bypassable biometric "auth" that doesn't actually gate key material.
- Analytics/crash-reporting SDKs (Firebase Analytics, Crashlytics, Sentry, Bugsnag, Mixpanel, Amplitude) — check what fields get sent; PII/tokens accidentally included in custom logged events or crash breadcrumbs.

### 1.5 Platform/component-level issues
- Exported `ContentProvider` — SQL injection in query/update/delete methods (string concat instead of parameterized `?` args, raw `rawQuery`/`execSQL` with user input). Also check path traversal via `openFile`/`openAssetFile` on file-backed providers.
- Exported `BroadcastReceiver`/`Service` — unauthenticated actions, sensitive operations triggered by intent extras, sticky broadcasts leaking last-sent data to any receiver.
- `Activity`/`Service` exported without permission that calls into privileged code (e.g., change settings, dump data, trigger payment) directly from `onCreate`/`onStartCommand` based on untrusted extras.
- WebView config: `setJavaScriptEnabled(true)` + `addJavascriptInterface` → JS-to-native bridge RCE on API < 17 (missing `@JavascriptInterface` annotation requirement); `setAllowFileAccess(true)`, `setAllowFileAccessFromFileURLs`, `setAllowUniversalAccessFromFileURLs` → local file theft/XSS-to-native escalation; `loadUrl` with untrusted/user-controlled URL; mixed content mode (`MIXED_CONTENT_ALWAYS_ALLOW`); disabled cert validation in `onReceivedSslError` (`handler.proceed()` always called).
- Insecure deep link handling — unchecked `Intent.getData()`/`getStringExtra()` driving navigation, file loads, WebView URL loads, or auth bypass (e.g., deep link lands on authenticated screen without checking session).
- `PendingIntent` without `FLAG_IMMUTABLE` (and without `FLAG_ONE_SHOT`/`FLAG_UPDATE_CURRENT` as appropriate) → intent hijacking/injection by malicious app filling in the Intent.
- Implicit `Intent` for sensitive operations (should be explicit with package/component set) → intent interception by another installed app.
- Zip path traversal ("Zip Slip") in any custom unzip/file-extraction code bundled in the app (check for `ZipInputStream`/`ZipEntry.getName()` used directly as output path without sanitization).
- Root/emulator/debugger/Frida/Xposed detection — present? Which checks (su binary path, build tags `test-keys`, `ro.debuggable`, `ro.secure`, package name checks for Magisk/busybox, `/proc/self/maps` scan for frida-agent, port 27042 check, `ptrace` self-attach anti-debug)? Note: static presence only — trivially bypassable, confirm bypass in dynamic phase.
- Tapjacking protection: `setFilterTouchesWhenObscured(true)` missing on sensitive buttons (consent/payment confirm).
- Screen overlay / accessibility-service abuse surface — does app restrict rendering when an overlay is detected (`android.permission.SYSTEM_ALERT_WINDOW` relevant for attacker side, not this app, but note if app has sensitive confirm screens without overlay protection).
- Code integrity / anti-tamper: signature verification of own APK at runtime (`PackageManager.getPackageInfo(..., GET_SIGNATURES)`), absent or easily patched out.
- Third-party SDK inventory — ad/analytics SDKs (Facebook, AppsFlyer, AdMob, Unity Ads, etc.), outdated libs with known CVEs (cross-check versions in `build.gradle`/manifest/`META-INF` against NVD/Snyk advisories). Flag SDKs known for excessive data collection.
- Dynamic code loading: `DexClassLoader`/`PathClassLoader` loading code from writable/external paths → code injection if that path is attacker-writable.
- Reflection used to bypass access checks or call hidden/non-public APIs — note as fragile/evasion indicator.

### 1.6 Native code (if `.so` present)
- Pull libs from `lib/<abi>/`, run through Ghidra for hardcoded keys/credentials and weak crypto reimplemented in C/C++ (custom AES/XOR tables, embedded key material in `.rodata`).
- `strings` pass over each `.so` for URLs, API keys, format strings revealing debug/logging left in release build.
- Check for `JNI_OnLoad` obfuscation/anti-tamper, packers (commercial Android packers wrap the real DEX), or RASP/SSL-pinning logic implemented natively (OpenSSL/BoringSSL cert verification calls) — static jadx view alone won't reveal this, flag for dynamic follow-up + Ghidra disasm.
- Hardening flags on native libs: missing `PIE`, missing stack canary (`-fstack-protector`), missing `RELRO`/`NX`, missing `FORTIFY_SOURCE` — check with `checksec`-style inspection in Ghidra/binary headers.
- Native logging (`__android_log_print` calls) leaking sensitive data at JNI layer, invisible to a pure-Java log hook.
- JNI method name mapping — do native methods correspond 1:1 with suspicious crypto/auth logic that's deliberately moved to native to evade static Java analysis?

### 1.7 Output of static phase
- Table of findings: component, issue, severity, evidence (file:line), repro note.
- Flag anything that *needs* runtime confirmation (e.g., "TrustManager looks permissive — verify at runtime with Frida+Burp").

---

## 2. Dynamic Analysis via Frida

### 2.1 Setup
- Rooted device/emulator (or `objection`/`frida-gadget` injection for non-rooted + repackaged APK if root unavailable).
- `frida-server` running on device, matching `frida-tools` version on host.
- `frida-ps -U` to confirm app visible; `frida -U -f <package> -l script.js --no-pause` to spawn with hook attached from process start (important for hooks that must land before init, e.g. crypto/SSL pinning).
- Proxy device through Burp/mitmproxy; install proxy CA in system or user store as needed.

### 2.2 SSL/TLS pinning bypass (confirm static finding from 1.3)
- Use `frida-codeshare`'s universal Android SSL pinning bypass, or custom hook on:
  - `X509TrustManager.checkServerTrusted`
  - `OkHttpClient.Builder.certificatePinner`
  - `TrustManagerImpl.verifyChain` (Android system-level fallback)
  - Native pinning in `.so` (hook relevant OpenSSL/BoringSSL cert verify functions if Java-level bypass has no effect).
- Confirm traffic now visible in Burp → proves pinning was absent/bypassable, not just "looked weak in code."

### 2.3 Crypto runtime verification
- Hook `javax.crypto.Cipher.getInstance`, `.init`, `.update`, `.doFinal` to log algorithm string, mode, key bytes, IV, plaintext/ciphertext at call time. Confirms static-identified weak algo/hardcoded key is actually exercised with real traffic, and may surface keys *derived* at runtime (not visible in static strings, e.g. HKDF/PBKDF output).
- Hook `javax.crypto.spec.SecretKeySpec` and `IvParameterSpec`/`GCMParameterSpec` constructors to dump key/IV bytes used, and how often IV repeats across calls (reuse detection).
- Hook `java.security.MessageDigest.getInstance`/`.digest` for weak hash usage in password/integrity handling, dump input/output.
- Hook `javax.crypto.spec.PBEKeySpec` constructor to dump iteration count and salt used for password-based key derivation at runtime.
- Hook `java.security.SecureRandom`/`java.util.Random` constructors and `.nextBytes`/`.nextInt` to catch seeded/predictable randomness used for tokens, confirm actual entropy source.
- Hook `android.security.keystore.KeyGenParameterSpec.Builder` / `AndroidKeyStore` calls to confirm whether keys are actually hardware-backed or exportable (`setUserAuthenticationRequired`, `setInvalidatedByBiometricEnrollment`).
- Hook `javax.crypto.Mac.getInstance`/`.doFinal` for HMAC key/algorithm verification (e.g., JWT signing done client-side, API request signing).

### 2.4 Root/Jailbreak & anti-debug/anti-Frida bypass
- Hook common detection methods and force return values to get past client-side defenses and reach deeper functionality for further testing:
  - `Debug.isDebuggerConnected()`, `Debug.waitingForDebugger()`
  - su-binary/path checks (`/system/bin/su`, `/system/xbin/su`, `Runtime.exec("which su")`)
  - build tag checks (`Build.TAGS` contains `test-keys`), `Settings.Secure.getString(... "development_settings_enabled")`
  - package-presence checks for Magisk/SuperSU/busybox/Xposed (`PackageManager.getPackageInfo` for known root-app package names)
  - `ro.debuggable`/`ro.secure` system property reads
  - native anti-Frida: port 27042 scan, `/proc/self/maps` or `/proc/self/status` scan for `frida`/`gum-js-loop`/`gmain` thread names, `ptrace(PTRACE_TRACEME)` self-attach trick (hook `ptrace` in libc to no-op).
- Use `objection`'s `android root disable` / `android sslpinning disable` as fast path before writing custom scripts; fall back to custom hooks when app uses non-standard/native detection objection doesn't cover.

### 2.5 Sensitive data in memory / logs at runtime
- Hook `Log.d/.i/.e/.w/.v`, `System.out.println`, `PrintStream.println` to capture any sensitive values the app logs live (tokens, PII, request/response bodies) — confirms static logging finding is reachable with real values during a real session.
- Use Frida to dump/search live process memory (or `objection android memory dump/search`, `objection android memory search --string "<pattern>"`) for session tokens, passwords, card numbers, after login/checkout flow — validates memory-storage exposure claims and checks whether secrets are zeroed after use (char[] wipe) vs. lingering String objects (immutable, can't be wiped, visible until GC).
- Hook clipboard APIs (`ClipboardManager.setPrimaryClip`/`getPrimaryClip`) to confirm sensitive values actually land on clipboard and for how long.
- Hook biometric callback (`BiometricPrompt.AuthenticationCallback.onAuthenticationSucceeded`) to check if success is enforced via a real `CryptoObject` tied to Keystore, or just a boolean flag Frida could force to `true` without ever matching a fingerprint.

### 2.6 Storage/IPC runtime checks
- Trigger app flows, then pull `/data/data/<pkg>` (via root, `adb backup` if allowBackup, or `run-as`) and inspect `shared_prefs/`, `databases/`, `files/`, `cache/` for plaintext secrets written during the session — confirms 1.4 findings with live data instead of just code inspection.
- Use `am start -n <component>` / `am broadcast -a <action>` / `am startservice` against exported components identified in 1.5 to confirm they're reachable without permission and produce observable effect (crash, data leak, state change, unauthorized action).
- `content query --uri content://<authority>/...` against exported `ContentProvider` to confirm data access/SQL injection reachable without permission; try `' OR '1'='1` style payloads in query params.
- For WebView JS bridge: trigger a page load, use Frida to call the exposed `@JavascriptInterface` methods directly from a hooked/injected JS context (or inject via `evaluateJavascript`), confirm reachable from untrusted web content (test via a local malicious HTML page loaded in the WebView if `loadUrl` accepts arbitrary input).
- Check `FLAG_SECURE` enforcement at runtime: attempt screenshot (`adb shell screencap`) while sensitive screen is foregrounded, confirm whether content is captured.
- Zip Slip: if app has import/extract feature, feed crafted zip with `../../` entry names and confirm file written outside intended directory.

### 2.7 Business-logic / auth checks (enabled by pinning bypass + proxy)
- Replay/tamper requests in Burp to test server-side validation independent of client (price tampering, quantity/discount manipulation, IDOR via sequential IDs, auth bypass by stripping/forging headers) — technically "backend" but usually scoped in mobile pentests since client is the only way in.
- Check JWT/token handling: `alg=none` acceptance, weak HMAC secret brute-forceable (`jwt_tool`/`hashcat`), missing expiry (`exp`) enforcement, missing audience/issuer checks — observed via intercepted traffic and confirmed by crafting a modified token and replaying.
- Session management: token reuse after logout, missing server-side invalidation, predictable session identifiers (check sequential/low-entropy values captured across multiple logins).
- Rate limiting / brute-force protection on login, OTP, password-reset endpoints — observed by replaying requests at volume through Burp.
- API endpoints discovered only via traffic capture but absent from any client-visible menu ("hidden"/debug/admin endpoints) — test for auth enforcement.

### 2.8 Output of dynamic phase
- For each static finding flagged "needs runtime confirmation": pass/fail + evidence (Frida console output, Burp request/response, screenshot).
- New findings only visible at runtime (e.g., key derived dynamically, sensitive data appearing in memory/logs only during specific flow, IV reuse only visible across multiple real calls, server-side validation gaps only visible via traffic tampering).

---

## 3. Reporting

For each finding, record:
- Title, severity (Critical/High/Medium/Low/Info), category (e.g. insecure crypto, hardcoded secret, exposed component).
- Evidence: file:line (static) or Frida/Burp log excerpt (dynamic).
- Repro steps.
- Fix recommendation.

Map coverage against OWASP MASVS (useful even for non-chained bugs — MASVS-STORAGE,
MASVS-CRYPTO, MASVS-NETWORK, MASVS-PLATFORM, MASVS-CODE, MASVS-RESILIENCE) so isolated
weak-crypto / exposed-credential findings still land in a structured control matrix,
not just a flat bug list.

---

## 4. Quick checklist (condensed)

**Static / Manifest**
- [ ] debuggable, allowBackup(+backup rules), exported components (incl. implicit export <31), cleartext traffic, network_security_config trust-anchors
- [ ] Overbroad permissions, taskAffinity/launchMode hijack risk, FileProvider path config, meta-data keys

**Static / Secrets**
- [ ] Keyword grep across code/resources/assets (generic names, cloud keys, SaaS SDK keys, JWT/basic-auth shapes, infra conn strings, crypto material, leftover comments)
- [ ] Run gitleaks/trufflehog/MobSF secret scanner over unpacked tree

**Static / Crypto**
- [ ] Weak ciphers/hashes/modes (DES/RC4/MD5/SHA1/ECB/CBC-no-HMAC), key size, PBKDF iteration count
- [ ] Hardcoded key/IV/salt, IV reuse, guessable key derivation, SecureRandom/Random misuse
- [ ] AndroidKeyStore actually used vs. key material in app memory/prefs
- [ ] TrustManager/HostnameVerifier overrides, pinning presence/strength, cert/key asset expiry+algo

**Static / Storage**
- [ ] SharedPreferences/SQLite plaintext, file perms, logging of sensitive data, external storage, clipboard, FLAG_SECURE, autofill, backup inclusion, cache/temp files, IPC data leakage, biometric-to-Keystore binding, analytics SDK field leakage

**Static / Platform & IPC**
- [ ] Exported provider SQLi/path traversal, exported receiver/service/activity abuse, WebView JS bridge + file access flags + SSL error bypass, deep link handling, PendingIntent mutability, implicit intents, Zip Slip, root/debug/Frida/Xposed detection presence, tapjacking, APK signature self-check, dynamic code loading, outdated SDK CVEs

**Static / Native**
- [ ] strings + Ghidra pass on .so for keys/weak crypto, native-level pinning/RASP, hardening flags (PIE/RELRO/NX/canary), native logging, JNI method mapping

**Dynamic / Frida**
- [ ] Confirm pinning bypass → proxy traffic visible in Burp
- [ ] Hook Cipher/SecretKeySpec/IvParameterSpec/PBEKeySpec/SecureRandom/Mac/KeyStore — confirm real key/algo/IV-reuse/iteration-count at runtime
- [ ] Root/debug/Frida-detection bypass (Java + native ptrace/port-scan checks)
- [ ] Live Log/println hook + memory dump/search for secrets during real flows; check String vs char[] wipe
- [ ] Clipboard + biometric-callback hooks
- [ ] adb/run-as: pull app data dir after use, inspect shared_prefs/databases/files/cache for plaintext secrets
- [ ] am/content: probe exported activities/services/receivers/providers directly, test SQLi/path traversal payloads
- [ ] WebView JS bridge direct invocation test; Zip Slip test if import/extract feature exists
- [ ] FLAG_SECURE check via adb screencap

**Dynamic / Business logic (via Burp once traffic visible)**
- [ ] Request tampering (price/quantity/IDOR/header forge), JWT alg=none/weak-secret/expiry, session reuse after logout, rate limiting, hidden/debug endpoint discovery
