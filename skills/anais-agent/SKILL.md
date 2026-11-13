---
name: anais-agent
description: Umbrella router for Anais mobile security work. Use when a request involves a local Android/mobile app (.apk/.xapk/.apkm/.apks/.aab/.jar/.ipa) and you need to decide between static forensics and running it on a device. It routes to reema-agent (static analysis, forensics, verdict, Vaccine Pack) or dyxon-agent (dynamic sandbox: lease a ready rooted device, run/detonate, confirm runtime behavior). Mobile scope only.
---

# Anais Agent (router)

Anais has two halves. This skill only routes; the work lives in the two focused
skills.

- **Static — contain, triage, defend without running it.** Analyze an APK/JAR/IPA
  (SAST, permissions, RASP/packer, obfuscation, signing, SDKs/trackers,
  capability/malware verdict, IOCs, framework ID), drive the REA deep pass, or
  build a Vaccine Pack. → **`reema-agent`**.
- **Dynamic — run it on a device.** Get a ready rooted Android sandbox, run or
  detonate an app, confirm runtime behavior (SSL pinning, crypto, root checks,
  dump decrypted DEX), run a Vaccine Pack check on a device, or hand a device to
  REA. → **`dyxon-agent`**.

## Decide

1. Does the answer need the app to *execute* on a device? → `dyxon-agent`.
2. Otherwise (what the package contains, its verdict, how to defend) →
   `reema-agent`.
3. The end-to-end loop: `reema-agent` analyzes → produces `vaccine.json` →
   `dyxon-agent` runs it on a device → `reema-agent` merges the runtime findings
   back into `findings.json`.

Mobile scope only. For non-APK targets (firmware, desktop binaries, JS/Electron)
use a general reverse-engineering integration (e.g. `reverse-engineer-anything`);
for the deep native/managed engines Reema and Dyxon both call, that is **REA**.
