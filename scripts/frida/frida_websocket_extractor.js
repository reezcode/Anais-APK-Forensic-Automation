// ============================================
// M-Pajak WebSocket URL Extractor (Focused)
// ============================================
// This script specifically extracts the COMPLETE WebSocket URL
// with timestamp and signature for sandbox testing
//
// Usage: frida -U -f comeliest.metempsychosis.pokelogan -l frida_websocket_extractor.js --no-pause

console.log("=".repeat(70));
console.log("M-PAJAK WEBSOCKET URL EXTRACTOR");
console.log("=".repeat(70));

var completeUrl = null;
var deviceId = null;
var timestamp = null;
var signature = null;

// ============================================
// 1. Extract Device ID First
// ============================================
Java.perform(function () {
    try {
        var C1814a = Java.use("p068k3.C1814a");

        C1814a.m2375c.implementation = function (context) {
            deviceId = this.m2375c(context);
            console.log("\n[1/3] Device ID Extracted:");
            console.log("      " + deviceId);
            return deviceId;
        };
    } catch (e) {
        console.log("[!] Could not hook device ID: " + e);
    }
});

// ============================================
// 2. Capture Signature Calculation
// ============================================
Java.perform(function () {
    try {
        // Hook the point where signature is calculated (around line 2990 in C1355i.java)
        var C1355i = Java.use("p038f3.C1355i");

        // Find the method that builds the WebSocket connection
        // This is tricky, we need to hook the actual signature building

        // Alternative: Hook MessageDigest to capture the signature
        var MessageDigest = Java.use("java.security.MessageDigest");
        var originalDigest = MessageDigest.digest.overload('[B');

        MessageDigest.digest.overload('[B').implementation = function (input) {
            var result = originalDigest.call(this, input);

            // Convert to hex string
            var hex = "";
            for (var i = 0; i < result.length; i++) {
                var b = result[i];
                hex += ("0" + (b & 0xFF).toString(16)).slice(-2);
            }

            // If this looks like a signature (MD5 = 32 chars, SHA256 = 64 chars)
            if (hex.length >= 32 && hex.length <= 64) {
                console.log("\n[2/3] Possible Signature Detected:");
                console.log("      Algorithm: " + this.getAlgorithm());
                console.log("      Hash: " + hex);
                signature = hex;
            }

            return result;
        };
    } catch (e) {
        console.log("[!] Could not hook signature: " + e);
    }
});

// ============================================
// 3. Intercept Complete WebSocket URL
// ============================================
Java.perform(function () {
    try {
        var OkHttpClient = Java.use("okhttp3.OkHttpClient");

        OkHttpClient.newWebSocket.overload('okhttp3.Request', 'okhttp3.WebSocketListener').implementation = function (request, listener) {
            var url = request.url().toString();

            if (url.includes("websocket/message/DEVICE_")) {
                completeUrl = url;

                var uri = request.url();
                timestamp = uri.queryParameter("timeStamp");
                var sign = uri.queryParameter("sign");

                console.log("\n" + "=".repeat(70));
                console.log("🎯 COMPLETE WEBSOCKET URL CAPTURED!");
                console.log("=".repeat(70));
                console.log("\nFull URL:");
                console.log(url);
                console.log("\n" + "-".repeat(70));
                console.log("Components:");
                console.log("-".repeat(70));
                console.log("Base URL:   wss://" + uri.host() + uri.encodedPath());
                console.log("Device ID:  " + (deviceId || "Already captured above"));
                console.log("Timestamp:  " + timestamp);
                console.log("Signature:  " + sign);
                console.log("-".repeat(70));

                // Save to file (Frida can't write files, but we can log it)
                console.log("\n📋 COPY THIS FOR SANDBOX TESTING:");
                console.log("-".repeat(70));
                console.log(url);
                console.log("-".repeat(70));

                // Also provide wscat command
                console.log("\n💻 WSCAT COMMAND:");
                console.log("-".repeat(70));
                console.log('wscat -c "' + url + '"');
                console.log("-".repeat(70));

                // Python command
                console.log("\n🐍 PYTHON COMMAND:");
                console.log("-".repeat(70));
                console.log("import websocket");
                console.log('ws = websocket.create_connection("' + url + '")');
                console.log("print(ws.recv())");
                console.log("-".repeat(70));

                console.log("\n✅ WebSocket URL extraction complete!\n");
            }

            return this.newWebSocket(request, listener);
        };
    } catch (e) {
        console.log("[!] Could not hook WebSocket: " + e);
    }
});

// ============================================
// 4. Monitor when WebSocket sends data
// ============================================
Java.perform(function () {
    try {
        var WebSocket = Java.use("okhttp3.WebSocket");

        // Hook send method if available
        console.log("[*] Attempting to hook WebSocket send methods...");

    } catch (e) {
        console.log("[!] Could not hook WebSocket send: " + e);
    }
});

console.log("\n[*] Hooks installed. Waiting for WebSocket connection...");
console.log("[*] Trigger the malware to connect (open app, trigger notification, etc.)");
console.log("[*] The complete URL will be displayed when connection is made\n");
