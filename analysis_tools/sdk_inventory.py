#!/usr/bin/env python3
"""
Third-Party SDK Inventory

Enumerates the third-party SDKs bundled in the app by scanning decompiled
package paths and native libraries, classifies them (ads / analytics / tracker /
payment / crash / networking / social), extracts a version string when one is
discoverable, and — only with --online — queries the OSV.dev database for known
vulnerabilities in the identified Maven packages.

Usage: sdk_inventory.py <decompiled_dir> <jadx_dir> <output_json> [--online]
"""

import os
import re
import sys
import json

# package-path prefix -> (SDK name, category, maven coordinate or None)
SDK_MAP = {
    "com/google/firebase": ("Firebase", "analytics", "com.google.firebase:firebase-core"),
    "com/google/android/gms/ads": ("Google AdMob", "ads", "com.google.android.gms:play-services-ads"),
    "com/google/android/gms": ("Google Play Services", "platform", None),
    "com/facebook/ads": ("Meta Audience Network", "ads", None),
    "com/facebook/react": ("React Native", "framework", None),
    "com/facebook": ("Facebook SDK", "social", "com.facebook.android:facebook-android-sdk"),
    "com/squareup/okhttp3": ("OkHttp", "networking", "com.squareup.okhttp3:okhttp"),
    "okhttp3": ("OkHttp", "networking", "com.squareup.okhttp3:okhttp"),
    "retrofit2": ("Retrofit", "networking", "com.squareup.retrofit2:retrofit"),
    "com/squareup/picasso": ("Picasso", "image", "com.squareup.picasso:picasso"),
    "com/bumptech/glide": ("Glide", "image", "com.github.bumptech.glide:glide"),
    "io/reactivex": ("RxJava", "reactive", "io.reactivex.rxjava2:rxjava"),
    "com/google/gson": ("Gson", "serialization", "com.google.code.gson:gson"),
    "com/fasterxml/jackson": ("Jackson", "serialization", "com.fasterxml.jackson.core:jackson-core"),
    "com/appsflyer": ("AppsFlyer", "tracker", None),
    "com/adjust/sdk": ("Adjust", "tracker", None),
    "io/branch": ("Branch", "tracker", None),
    "com/flurry": ("Flurry", "analytics", None),
    "com/mixpanel": ("Mixpanel", "analytics", None),
    "com/amplitude": ("Amplitude", "analytics", None),
    "com/segment": ("Segment", "analytics", None),
    "com/onesignal": ("OneSignal", "push", None),
    "com/urbanairship": ("Airship", "push", None),
    "io/sentry": ("Sentry", "crash", "io.sentry:sentry-android"),
    "com/crashlytics": ("Crashlytics", "crash", None),
    "com/bugsnag": ("Bugsnag", "crash", None),
    "com/stripe": ("Stripe", "payment", None),
    "com/braintreepayments": ("Braintree", "payment", None),
    "com/paypal": ("PayPal", "payment", None),
    "com/midtrans": ("Midtrans", "payment", None),
    "com/unity3d": ("Unity Ads", "ads", None),
    "com/ironsource": ("ironSource", "ads", None),
    "com/applovin": ("AppLovin", "ads", None),
    "com/mopub": ("MoPub", "ads", None),
    "com/tapjoy": ("Tapjoy", "ads", None),
    "org/chromium": ("Chromium", "platform", None),
    "androidx": ("AndroidX", "platform", None),
    "kotlin": ("Kotlin stdlib", "platform", None),
}

TRACKER_CATEGORIES = {"ads", "tracker", "analytics"}

VERSION_RE = re.compile(r'(?:version|VERSION|VersionName|SDK_VERSION)\s*[=:]\s*"?([0-9]+\.[0-9]+(?:\.[0-9]+)?)"?')


def _source_roots(decompiled_dir, jadx_dir):
    roots = []
    if decompiled_dir and os.path.isdir(decompiled_dir):
        for c in sorted(os.listdir(decompiled_dir)):
            if c.startswith("smali"):
                roots.append(os.path.join(decompiled_dir, c))
    if jadx_dir and os.path.isdir(jadx_dir):
        for c in sorted(os.listdir(jadx_dir)):
            if c.startswith("sources"):
                roots.append(os.path.join(jadx_dir, c))
    return roots


def detect_sdks(decompiled_dir, jadx_dir):
    roots = _source_roots(decompiled_dir, jadx_dir)
    found = {}
    for root in roots:
        for prefix, (name, category, maven) in SDK_MAP.items():
            if name in found:
                continue
            if os.path.isdir(os.path.join(root, prefix)):
                found[name] = {
                    "sdk": name,
                    "package": prefix,
                    "category": category,
                    "maven": maven,
                    "version": None,
                    "tracker": category in TRACKER_CATEGORIES,
                }
    return found


def find_versions(found, decompiled_dir):
    """Best-effort version extraction from .version/.properties files in META-INF."""
    if not decompiled_dir:
        return
    for base in ("original/META-INF", "META-INF", "assets"):
        d = os.path.join(decompiled_dir, base)
        if not os.path.isdir(d):
            continue
        for dirpath, _, files in os.walk(d):
            for fn in files:
                if not fn.endswith((".version", ".properties")):
                    continue
                low = fn.lower()
                try:
                    with open(os.path.join(dirpath, fn), encoding="utf-8", errors="ignore") as f:
                        content = f.read()
                except OSError:
                    continue
                for info in found.values():
                    if info["version"]:
                        continue
                    token = info["sdk"].split()[0].lower()
                    if token in low or token in content.lower():
                        m = re.search(r'([0-9]+\.[0-9]+(?:\.[0-9]+)?)', content)
                        if m:
                            info["version"] = m.group(1)


def query_osv(found):
    """Query OSV.dev for Maven packages with a known version. Requires network."""
    import urllib.request
    for info in found.values():
        if not info.get("maven") or not info.get("version"):
            continue
        payload = json.dumps({
            "version": info["version"],
            "package": {"ecosystem": "Maven", "name": info["maven"]},
        }).encode()
        try:
            req = urllib.request.Request("https://api.osv.dev/v1/query", data=payload,
                                         headers={"Content-Type": "application/json"})
            with urllib.request.urlopen(req, timeout=15) as resp:
                data = json.load(resp)
            vulns = data.get("vulns", []) or []
            info["cves"] = [{"id": v.get("id"), "summary": v.get("summary", "")[:160]} for v in vulns]
        except Exception as exc:
            info["cve_error"] = str(exc)


def main():
    args = [a for a in sys.argv[1:] if not a.startswith("--")]
    online = "--online" in sys.argv
    if len(args) < 3:
        print("Usage: sdk_inventory.py <decompiled_dir> <jadx_dir> <output_json> [--online]")
        sys.exit(1)

    decompiled_dir = args[0] if os.path.exists(args[0]) else None
    jadx_dir = args[1] if os.path.exists(args[1]) else None
    output_json = args[2]

    found = detect_sdks(decompiled_dir, jadx_dir)
    find_versions(found, decompiled_dir)
    if online:
        query_osv(found)

    sdks = sorted(found.values(), key=lambda x: (x["category"], x["sdk"]))
    result = {
        "total": len(sdks),
        "trackers": [s["sdk"] for s in sdks if s["tracker"]],
        "online_cve_check": online,
        "sdks": sdks,
    }
    with open(output_json, "w") as f:
        json.dump(result, f, indent=2)

    print(f"SDK inventory: {len(sdks)} SDK(s), {len(result['trackers'])} tracker/ad/analytics"
          + (" (OSV checked)" if online else ""))


if __name__ == "__main__":
    main()
