// ============================================
// M-Pajak Malware Frida Instrumentation Script
// ============================================
// Usage: frida -U -f comeliest.metempsychosis.pokelogan -l frida_hooks.js --no-pause

console.log("[*] Starting M-Pajak Malware Analysis...");
console.log("[*] Target Package: comeliest.metempsychosis.pokelogan");
console.log("=".repeat(60));

// ============================================
// 1. WEBSOCKET URL CAPTURE (MOST IMPORTANT)
// ============================================
Java.perform(function () {
    console.log("\n[+] Hooking WebSocket Connection...");

    // Hook OkHttp WebSocket creation
    try {
        var OkHttpClient = Java.use("okhttp3.OkHttpClient");
        var Request = Java.use("okhttp3.Request");

        OkHttpClient.newWebSocket.overload('okhttp3.Request', 'okhttp3.WebSocketListener').implementation = function (request, listener) {
            console.log("\n" + "=".repeat(60));
            console.log("[!] WEBSOCKET CONNECTION INTERCEPTED");
            console.log("=".repeat(60));

            var url = request.url().toString();
            console.log("[WS] Full URL: " + url);

            // Extract query parameters
            var uri = request.url();
            console.log("[WS] Scheme: " + uri.scheme());
            console.log("[WS] Host: " + uri.host());
            console.log("[WS] Path: " + uri.encodedPath());
            console.log("[WS] Query: " + uri.encodedQuery());

            // Extract timestamp and signature
            var timestamp = uri.queryParameter("timeStamp");
            var signature = uri.queryParameter("sign");
            if (timestamp) console.log("[WS] Timestamp: " + timestamp);
            if (signature) console.log("[WS] Signature: " + signature);

            // Extract device ID from URL
            var pathMatch = url.match(/DEVICE_([a-f0-9]+m2p6)/);
            if (pathMatch) {
                console.log("[WS] Device ID: " + pathMatch[1]);
            }

            console.log("=".repeat(60) + "\n");

            return this.newWebSocket(request, listener);
        };
        console.log("[✓] WebSocket hook installed");
    } catch (e) {
        console.log("[!] WebSocket hook failed: " + e);
    }
});

// ============================================
// 2. DEVICE ID GENERATION
// ============================================
Java.perform(function () {
    console.log("\n[+] Hooking Device ID Generation...");

    try {
        // Hook the device ID generation method
        var C1814a = Java.use("p068k3.C1814a");

        C1814a.m2375c.implementation = function (context) {
            var deviceId = this.m2375c(context);
            console.log("\n[DEVICE] Generated Device ID: " + deviceId);

            // Extract Android ID
            var androidId = deviceId.replace("m2p6", "");
            console.log("[DEVICE] Android ID: " + androidId);
            console.log("[DEVICE] Campaign Tag: m2p6\n");

            return deviceId;
        };
        console.log("[✓] Device ID hook installed");
    } catch (e) {
        console.log("[!] Device ID hook failed: " + e);
    }
});

// ============================================
// 3. API COMMUNICATION INTERCEPTION
// ============================================
Java.perform(function () {
    console.log("\n[+] Hooking API Communication...");

    try {
        var C1822i = Java.use("p068k3.C1822i");

        // Hook the main API call method
        C1822i.m2427a.implementation = function (data, callback) {
            console.log("\n" + "=".repeat(60));
            console.log("[!] API CALL INTERCEPTED");
            console.log("=".repeat(60));

            // Convert data to JSON string for inspection
            try {
                var JSONObject = Java.use("org.json.JSONObject");
                var jsonStr = data.toString();
                console.log("[API] Payload:\n" + jsonStr);

                // Try to extract specific fields
                if (data.has("action")) {
                    console.log("[API] Action: " + data.getString("action"));
                }
                if (data.has("deviceId")) {
                    console.log("[API] Device ID: " + data.getString("deviceId"));
                }
                if (data.has("mnemoId")) {
                    console.log("[API] 🚨 MNEMONIC THEFT DETECTED!");
                    console.log("[API] Mnemonic: " + data.getString("mnemoId"));
                    console.log("[API] Wallet Package: " + data.getString("packageName"));
                }
            } catch (e) {
                console.log("[API] Data: " + data);
            }

            console.log("=".repeat(60) + "\n");

            return this.m2427a(data, callback);
        };
        console.log("[✓] API communication hook installed");
    } catch (e) {
        console.log("[!] API hook failed: " + e);
    }
});

// ============================================
// 4. MNEMONIC STEALING DETECTION
// ============================================
Java.perform(function () {
    console.log("\n[+] Hooking Mnemonic Theft Functions...");

    try {
        var C1819f = Java.use("p068k3.C1819f");

        // Hook the saveMnemonics method
        C1819f.m2422t.implementation = function (context) {
            console.log("\n" + "🚨".repeat(30));
            console.log("[!!!] MNEMONIC EXFILTRATION ATTEMPT DETECTED");
            console.log("🚨".repeat(30) + "\n");

            return this.m2422t(context);
        };
        console.log("[✓] Mnemonic theft hook installed");
    } catch (e) {
        console.log("[!] Mnemonic hook failed: " + e);
    }

    // Hook all InputWords activities
    var wallets = [
        "com.superbock.p020ui.custom.InputWordsImActivity",
        "com.superbock.p020ui.custom.InputWordsTpActivity",
        "com.superbock.p020ui.custom.InputWordsTrustActivity",
        "com.superbock.p020ui.custom.InputWordsMetaActivity",
        "com.superbock.p020ui.custom.InputWordsWalletActivity",
        "com.superbock.p020ui.custom.InputWordsBinanceActivity",
        "com.superbock.p020ui.custom.InputWordsOkxActivity",
        "com.superbock.p020ui.custom.InputWordsTronlinkActivity",
        "com.superbock.p020ui.custom.InputWordsTronglobalActivity"
    ];

    wallets.forEach(function (className) {
        try {
            var WalletActivity = Java.use(className);
            console.log("[✓] Hooked: " + className.split(".").pop());
        } catch (e) {
            // Class not loaded yet
        }
    });
});

// ============================================
// 5. SHAREDPREFERENCES MONITORING
// ============================================
Java.perform(function () {
    console.log("\n[+] Hooking SharedPreferences...");

    try {
        var SPUtils = Java.use("com.blankj.utilcode.util.SPUtils");

        // Hook put(String, String)
        SPUtils.put.overload('java.lang.String', 'java.lang.String').implementation = function (key, value) {
            if (key.includes("Domain") || key.includes("Url") || key.includes("deviceId") ||
                key.includes("thumbSnap") || key.includes("host") || key.includes("ws")) {
                console.log("\n[SP] PUT: " + key + " = " + value);
            }
            return this.put(key, value);
        };

        // Hook getString
        SPUtils.getString.overload('java.lang.String').implementation = function (key) {
            var value = this.getString(key);
            if (key.includes("Domain") || key.includes("Url") || key.includes("deviceId") ||
                key.includes("thumbSnap") || key.includes("host") || key.includes("ws")) {
                console.log("[SP] GET: " + key + " = " + value);
            }
            return value;
        };

        console.log("[✓] SharedPreferences hook installed");
    } catch (e) {
        console.log("[!] SharedPreferences hook failed: " + e);
    }
});

// ============================================
// 6. NETWORK TRAFFIC (OkHttp Interceptor)
// ============================================
Java.perform(function () {
    console.log("\n[+] Hooking Network Traffic...");

    try {
        var Call = Java.use("okhttp3.Call");
        var Request = Java.use("okhttp3.Request");

        // Hook execute() for synchronous calls
        Call.execute.implementation = function () {
            var request = this.request();
            var url = request.url().toString();
            var method = request.method();

            if (url.includes("a2decxd8syw7k") || url.includes("thumbsnap")) {
                console.log("\n[NET] " + method + " " + url);

                // Try to log headers
                var headers = request.headers();
                if (headers.size() > 0) {
                    console.log("[NET] Headers: " + headers.toString());
                }
            }

            return this.execute();
        };

        console.log("[✓] Network traffic hook installed");
    } catch (e) {
        console.log("[!] Network hook failed: " + e);
    }
});

// ============================================
// 7. ACCESSIBILITY SERVICE MONITORING
// ============================================
Java.perform(function () {
    console.log("\n[+] Hooking Accessibility Service...");

    try {
        var BaseService = Java.use("com.superbock.auto.BaseService");

        // Hook onAccessibilityEvent
        BaseService.onAccessibilityEvent.implementation = function (event) {
            var eventType = event.getEventType();
            var packageName = event.getPackageName();

            if (packageName && packageName.toString().includes("wallet") ||
                packageName.toString().includes("metamask") ||
                packageName.toString().includes("trust") ||
                packageName.toString().includes("token")) {
                console.log("\n[A11Y] 🎯 Target App Detected: " + packageName);
                console.log("[A11Y] Event Type: " + eventType);
            }

            return this.onAccessibilityEvent(event);
        };

        console.log("[✓] Accessibility Service hook installed");
    } catch (e) {
        console.log("[!] Accessibility hook failed: " + e);
    }
});

// ============================================
// 8. SMS INTERCEPTION
// ============================================
Java.perform(function () {
    console.log("\n[+] Hooking SMS Operations...");

    try {
        var SmsManager = Java.use("android.telephony.SmsManager");

        // Hook sendTextMessage
        SmsManager.sendTextMessage.implementation = function (dest, scAddr, text, sentIntent, deliveryIntent) {
            console.log("\n[SMS] 🚨 SMS BEING SENT!");
            console.log("[SMS] To: " + dest);
            console.log("[SMS] Text: " + text);

            // Optionally block the SMS
            // return; // Uncomment to block

            return this.sendTextMessage(dest, scAddr, text, sentIntent, deliveryIntent);
        };

        console.log("[✓] SMS hook installed");
    } catch (e) {
        console.log("[!] SMS hook failed: " + e);
    }
});

// ============================================
// 9. C2 DOMAIN CHANGES
// ============================================
Java.perform(function () {
    console.log("\n[+] Hooking C2 Configuration...");

    try {
        var C1755j0 = Java.use("p064k.C1755j0");

        // Hook domain setter
        C1755j0.m2316p.implementation = function (domainList) {
            console.log("\n[C2] 🔄 Domain Configuration Update");
            console.log("[C2] New Domains: " + domainList);
            return this.m2316p(domainList);
        };

        // Hook API host setter
        C1755j0.m2325y.implementation = function (domain) {
            console.log("[C2] New API Host: https://" + domain + "/appapi");
            return this.m2325y(domain);
        };

        // Hook WebSocket URL setter
        C1755j0.m2301D.implementation = function (domain) {
            console.log("[C2] New WebSocket URL: wss://" + domain + "/websocket/message/DEVICE_");
            return this.m2301D(domain);
        };

        console.log("[✓] C2 configuration hook installed");
    } catch (e) {
        console.log("[!] C2 hook failed: " + e);
    }
});

// ============================================
// 10. CRYPTO SIGNATURE CALCULATION
// ============================================
Java.perform(function () {
    console.log("\n[+] Hooking Signature Generation...");

    try {
        // Hook MessageDigest for hash calculation
        var MessageDigest = Java.use("java.security.MessageDigest");
        var originalDigest = MessageDigest.digest.overload('[B');

        MessageDigest.digest.overload('[B').implementation = function (input) {
            var result = originalDigest.call(this, input);
            var algorithm = this.getAlgorithm();

            if (algorithm.includes("MD5") || algorithm.includes("SHA")) {
                var inputStr = "";
                try {
                    inputStr = Java.use("java.lang.String").$new(input);
                } catch (e) { }

                console.log("\n[HASH] Algorithm: " + algorithm);
                if (inputStr.length < 200) {
                    console.log("[HASH] Input: " + inputStr);
                }

                // Convert result to hex
                var hex = "";
                for (var i = 0; i < result.length && i < 32; i++) {
                    var b = result[i];
                    hex += ("0" + (b & 0xFF).toString(16)).slice(-2);
                }
                console.log("[HASH] Output: " + hex);
            }

            return result;
        };

        console.log("[✓] Signature generation hook installed");
    } catch (e) {
        console.log("[!] Signature hook failed: " + e);
    }
});

// ============================================
// 11. FILE UPLOAD MONITORING (Thumbsnap)
// ============================================
Java.perform(function () {
    console.log("\n[+] Hooking File Uploads...");

    try {
        var C1815b = Java.use("p068k3.C1815b");

        // Hook upload method
        C1815b.m2383a.implementation = function (context, file, callback) {
            console.log("\n[UPLOAD] 📸 File Upload to Thumbsnap");
            console.log("[UPLOAD] File: " + file);
            console.log("[UPLOAD] API Key: 000461e4aa61d5ddb037f501186ea825");
            console.log("[UPLOAD] Endpoint: https://thumbsnap.com/api/upload");

            return this.m2383a(context, file, callback);
        };

        console.log("[✓] File upload hook installed");
    } catch (e) {
        console.log("[!] Upload hook failed: " + e);
    }
});

// ============================================
// 12. RUNTIME ACTIVITY MONITORING
// ============================================
Java.perform(function () {
    console.log("\n[+] Hooking Activity Lifecycle...");

    try {
        var Activity = Java.use("android.app.Activity");

        Activity.onCreate.overload('android.os.Bundle').implementation = function (bundle) {
            var activityName = this.getClass().getName();
            if (activityName.includes("superbock") || activityName.includes("InputWords")) {
                console.log("\n[ACTIVITY] 📱 Launched: " + activityName);
            }
            return this.onCreate(bundle);
        };

        console.log("[✓] Activity monitoring hook installed");
    } catch (e) {
        console.log("[!] Activity hook failed: " + e);
    }
});

// ============================================
// FINAL STATUS
// ============================================
console.log("\n" + "=".repeat(60));
console.log("[✓] Frida instrumentation complete!");
console.log("[*] Monitoring in real-time...");
console.log("[*] Trigger malware activities to see intercepted data");
console.log("=".repeat(60) + "\n");
