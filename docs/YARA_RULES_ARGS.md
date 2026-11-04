# Anais v1.1.0: New Features Usage Tutorial

Welcome to the new features in Anais version `1.1.0`! This tutorial specifically covers the implementation details, scanning targets, and usage commands for the new **API Key Tracking** and **Custom YARA Rule Execution** features.

---

## 1. Advanced API Key Tracking

With the introduction of v1.1.0, Anais is now equipped with sophisticated API Key detection across the entire physical structure of an APK. It automatically hunts down highly privileged keys and credentials that developers frequently forget to strip from production builds.

### 🎯 What gets tracked automatically?
- Google API Keys / Google Cloud Platform identifiers (`AIza...`)
- Amazon Web Services (AWS) Access Keys
- Stripe Live / Restricted Keys
- Slack OAuth Tokens & Webhooks
- Twilio API Identifiers
- SendGrid, Square, Mailgun, Firebase URLs, etc.

### 🔍 Where does Anais look?
Anais doesn't just scan the extracted `.java` code. It recursively interrogates multiple abstraction layers of the APK during the Static Analysis (SAST) phase:
1. **Source Code**: Java Source via JADX and Smali Bytecode.
2. **Metadata & Resources**: Directly inspects the `AndroidManifest.xml` and `res/values/strings.xml` for properties frequently added via `BuildConfig`.
3. **Native Layer`: Performs byte-scanning natively inside compiled `.so` C/C++ libraries where advanced apps attempt to obfuscate their credentials.

### 🚀 Usage
You do not need to supply any special flags! By default, parsing API keys is permanently integrated into the primary static analysis engine flow.

```bash
./anais.sh suspicious_app.apk
```

### 📋 Where to find the results
Any discovered tokens will be dynamically injected into the final Modular report: `analysis_workspace/<app_name_version>/report.md`.
Navigate to the **Security Findings** section and look under `[High severity]`:

> **Api Keys in XML:** Pattern detected: AIzaSyAEXAM... *File: AndroidManifest.xml*
> **Api Keys in Native Library:** Pattern detected: xoxb-12345... *File: lib/armeabi-v7a/libnative.so*

---

## 2. Customizable YARA Rules

Anais incorporates a highly sophisticated YARA engine running through `yara_enhanced_analyzer.py`. We have heavily refactored its CLI orchestration to allow users to attach *any number* of custom YARA intelligence rules dynamically to an analysis.

### ❓ What is the default behavior without custom rules?
If you supply no specific flags, Anais defaults directly to the bundled intelligence located at `rules/yara_general_rules.yar`.

### 🚀 Usage: Passing Custom Rules

You can use the `-y` or `--yara` flag followed by the path to a `.yar` file.

**Single Custom Rule:**
```bash
./anais.sh -y my_experimental_rule.yar sample_app.apk
```

**Multiple Custom Rules:**
You can chain as many YARA rules as needed by stacking the `-y` parameters:
```bash
./anais.sh -y company_policy.yar -y threat_intel_feed.yar --yara custom_packer_detect.yar sample_app.apk
```

### 🧠 How Anais aggregates the custom rules

When providing multiple external files, you don't need to configure manual rule metadata parsing! The internal engine seamlessly scans all files provided to extract embedded `meta:` descriptions. 

During report generation, if a rule in `company_policy.yar` gets triggered, `report.md` will list the threat severity, rule name, and the specific match logic natively inherited from your custom file exactly how it would normally execute the default rules!
