#!/bin/bash

#############################################
# Helper script untuk dynamic analysis
# Automate common tasks untuk frida & analysis
#############################################

set -e

# Get the parent directory (Anais root)
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"

GREEN='\033[0;32m'
YELLOW='\033[1;33m'
RED='\033[0;31m'
NC='\033[0m'

print_usage() {
    echo "Usage: $0 <command> [options]"
    echo ""
    echo "Commands:"
    echo "  dex-dump <package>       - Dump DEX files from running app"
    echo "  hook-crypto <package>    - Hook cryptographic operations"
    echo "  hook-network <package>   - Hook network operations"
    echo "  monitor-all <package>    - Monitor all activities"
    echo "  pull-dumps               - Pull all dumped files from device"
    echo "  install-frida            - Install Frida server on device"
    echo ""
}

check_device() {
    if ! adb devices | grep -q "device$"; then
        echo -e "${RED}[!] No Android device connected${NC}"
        exit 1
    fi
    echo -e "${GREEN}[+] Device connected${NC}"
}

check_frida() {
    if ! command -v frida >/dev/null 2>&1; then
        echo -e "${RED}[!] Frida not installed. Install with: pip3 install frida-tools${NC}"
        exit 1
    fi
    echo -e "${GREEN}[+] Frida tools found${NC}"
}

install_frida_server() {
    echo -e "${YELLOW}[*] Installing Frida server...${NC}"
    
    # Get device architecture
    ABI=$(adb shell getprop ro.product.cpu.abi | tr -d '\r')
    echo "[+] Device ABI: $ABI"
    
    # Get Frida version
    FRIDA_VERSION=$(frida --version)
    echo "[+] Frida version: $FRIDA_VERSION"
    
    # Download URL
    case $ABI in
        arm64-v8a)
            FRIDA_ARCH="arm64"
            ;;
        armeabi-v7a)
            FRIDA_ARCH="arm"
            ;;
        x86)
            FRIDA_ARCH="x86"
            ;;
        x86_64)
            FRIDA_ARCH="x86_64"
            ;;
        *)
            echo -e "${RED}[!] Unsupported architecture: $ABI${NC}"
            exit 1
            ;;
    esac
    
    echo "[*] Downloading frida-server for $FRIDA_ARCH..."
    DOWNLOAD_URL="https://github.com/frida/frida/releases/download/${FRIDA_VERSION}/frida-server-${FRIDA_VERSION}-android-${FRIDA_ARCH}.xz"
    
    curl -L -o frida-server.xz "$DOWNLOAD_URL"
    unxz frida-server.xz
    
    echo "[*] Pushing to device..."
    adb push frida-server /data/local/tmp/
    adb shell "chmod 755 /data/local/tmp/frida-server"
    
    echo "[*] Starting frida-server..."
    adb shell "/data/local/tmp/frida-server &"
    
    sleep 2
    
    if adb shell "ps | grep frida-server" >/dev/null; then
        echo -e "${GREEN}[+] Frida server installed and running${NC}"
    else
        echo -e "${RED}[!] Frida server failed to start${NC}"
        exit 1
    fi
    
    rm -f frida-server
}

dex_dump() {
    local package=$1
    
    echo -e "${YELLOW}[*] Dumping DEX from $package...${NC}"
    
    # Check if app is running
    if ! adb shell "ps | grep $package" >/dev/null; then
        echo "[*] App not running, starting it..."
        adb shell "monkey -p $package -c android.intent.category.LAUNCHER 1" >/dev/null 2>&1
        sleep 3
    fi
    
    # Run Frida script
    frida -U -f "$package" -l "${SCRIPT_DIR}/frida/frida_dex_dump.js" --no-pause
    
    echo -e "${GREEN}[+] DEX dump complete${NC}"
    echo "[*] Check device /sdcard/ for dumped_dex_*.dex files"
}

hook_crypto() {
    local package=$1
    
    echo -e "${YELLOW}[*] Hooking crypto operations for $package...${NC}"
    
    # Create temporary Frida script
    cat > /tmp/frida_crypto_hook.js <<'EOF'
Java.perform(function() {
    console.log("[*] Hooking crypto operations...");
    
    // Hook MessageDigest
    var MessageDigest = Java.use("java.security.MessageDigest");
    MessageDigest.digest.overload('[B').implementation = function(input) {
        console.log("[+] MessageDigest.digest called");
        console.log("    Algorithm: " + this.getAlgorithm());
        console.log("    Input: " + bytesToHex(input));
        
        var result = this.digest(input);
        console.log("    Output: " + bytesToHex(result));
        
        return result;
    };
    
    // Hook Cipher
    var Cipher = Java.use("javax.crypto.Cipher");
    Cipher.doFinal.overload('[B').implementation = function(input) {
        console.log("[+] Cipher.doFinal called");
        console.log("    Algorithm: " + this.getAlgorithm());
        console.log("    Mode: " + this.getOpmode());
        console.log("    Input length: " + input.length);
        
        var result = this.doFinal(input);
        console.log("    Output length: " + result.length);
        
        return result;
    };
    
    // Hook SecretKeySpec
    var SecretKeySpec = Java.use("javax.crypto.spec.SecretKeySpec");
    SecretKeySpec.$init.overload('[B', 'java.lang.String').implementation = function(key, algorithm) {
        console.log("[+] SecretKeySpec created");
        console.log("    Algorithm: " + algorithm);
        console.log("    Key: " + bytesToHex(key));
        
        return this.$init(key, algorithm);
    };
    
    function bytesToHex(bytes) {
        var hex = "";
        for (var i = 0; i < Math.min(bytes.length, 32); i++) {
            hex += ("0" + (bytes[i] & 0xFF).toString(16)).slice(-2);
        }
        if (bytes.length > 32) hex += "...";
        return hex;
    }
    
    console.log("[*] Crypto hooks installed");
});
EOF
    
    frida -U -f "$package" -l /tmp/frida_crypto_hook.js --no-pause
    
    rm -f /tmp/frida_crypto_hook.js
}

hook_network() {
    local package=$1
    
    echo -e "${YELLOW}[*] Hooking network operations for $package...${NC}"
    
    # Create temporary Frida script
    cat > /tmp/frida_network_hook.js <<'EOF'
Java.perform(function() {
    console.log("[*] Hooking network operations...");
    
    // Hook URL connection
    var URL = Java.use("java.net.URL");
    URL.openConnection.overload().implementation = function() {
        console.log("[+] URL.openConnection: " + this.toString());
        return this.openConnection();
    };
    
    // Hook OkHttp
    try {
        var OkHttpClient = Java.use("okhttp3.OkHttpClient");
        var Request = Java.use("okhttp3.Request");
        
        var Builder = OkHttpClient.Builder;
        Builder.build.implementation = function() {
            console.log("[+] OkHttpClient built");
            return this.build();
        };
        
        Request.url.implementation = function() {
            var url = this.url();
            console.log("[+] HTTP Request to: " + url.toString());
            return url;
        };
    } catch(e) {
        console.log("[-] OkHttp not found");
    }
    
    // Hook WebSocket
    try {
        var WebSocket = Java.use("okhttp3.WebSocket");
        // Note: Interface, hook implementations
    } catch(e) {
        console.log("[-] WebSocket not found");
    }
    
    // Hook Socket
    var Socket = Java.use("java.net.Socket");
    Socket.$init.overload('java.lang.String', 'int').implementation = function(host, port) {
        console.log("[+] Socket connection: " + host + ":" + port);
        return this.$init(host, port);
    };
    
    console.log("[*] Network hooks installed");
});
EOF
    
    frida -U -f "$package" -l /tmp/frida_network_hook.js --no-pause
    
    rm -f /tmp/frida_network_hook.js
}

monitor_all() {
    local package=$1
    
    echo -e "${YELLOW}[*] Monitoring all activities for $package...${NC}"
    
    frida -U -f "$package" -l frida_hooks.js --no-pause
}

pull_dumps() {
    echo -e "${YELLOW}[*] Pulling dumped files from device...${NC}"
    
    mkdir -p ./dumps
    
    # Pull DEX files
    adb shell "ls /sdcard/dumped_*.dex" 2>/dev/null | while read file; do
        if [ ! -z "$file" ]; then
            adb pull "$file" ./dumps/
        fi
    done
    
    # Pull memory dumps
    adb shell "ls /sdcard/memory_*.bin" 2>/dev/null | while read file; do
        if [ ! -z "$file" ]; then
            adb pull "$file" ./dumps/
        fi
    done
    
    echo -e "${GREEN}[+] Files pulled to ./dumps/${NC}"
    ls -lh ./dumps/
}

# Main
if [ $# -lt 1 ]; then
    print_usage
    exit 1
fi

COMMAND=$1
shift

check_device

case $COMMAND in
    dex-dump)
        check_frida
        if [ $# -lt 1 ]; then
            echo "Usage: $0 dex-dump <package>"
            exit 1
        fi
        dex_dump "$1"
        ;;
    hook-crypto)
        check_frida
        if [ $# -lt 1 ]; then
            echo "Usage: $0 hook-crypto <package>"
            exit 1
        fi
        hook_crypto "$1"
        ;;
    hook-network)
        check_frida
        if [ $# -lt 1 ]; then
            echo "Usage: $0 hook-network <package>"
            exit 1
        fi
        hook_network "$1"
        ;;
    monitor-all)
        check_frida
        if [ $# -lt 1 ]; then
            echo "Usage: $0 monitor-all <package>"
            exit 1
        fi
        monitor_all "$1"
        ;;
    pull-dumps)
        pull_dumps
        ;;
    install-frida)
        install_frida_server
        ;;
    *)
        echo -e "${RED}Unknown command: $COMMAND${NC}"
        print_usage
        exit 1
        ;;
esac
