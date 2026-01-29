
console.log("[*] DPT-Shell DEX Dumper Started");

// Hook file write operations to catch when decrypted DEX is written
var open = Module.findExportByName("libc.so", "open");
var write = Module.findExportByName("libc.so", "write");
var close = Module.findExportByName("libc.so", "close");

var targetFiles = {};

// Monitor file opens
Interceptor.attach(open, {
    onEnter: function(args) {
        var path = Memory.readUtf8String(args[0]);
        this.path = path;
        
        // Check if it's writing to code_cache with our target filename
        if (path.indexOf("code_cache") !== -1 && path.indexOf("i11111i111.zip") !== -1) {
            console.log("[+] Target file being opened: " + path);
            this.isTarget = true;
        }
    },
    onLeave: function(retval) {
        if (this.isTarget) {
            var fd = retval.toInt32();
            targetFiles[fd] = {
                path: this.path,
                data: []
            };
            console.log("[+] Tracking FD: " + fd);
        }
    }
});

// Capture writes to tracked files
Interceptor.attach(write, {
    onEnter: function(args) {
        var fd = args[0].toInt32();
        
        if (targetFiles[fd]) {
            var buf = args[1];
            var count = args[2].toInt32();
            
            // Read the data being written
            var data = Memory.readByteArray(buf, count);
            targetFiles[fd].data.push(data);
            
            console.log("[+] Captured " + count + " bytes written to " + targetFiles[fd].path);
        }
    }
});

// When file is closed, save the complete data
Interceptor.attach(close, {
    onEnter: function(args) {
        var fd = args[0].toInt32();
        
        if (targetFiles[fd]) {
            console.log("[+] File closed, dumping data...");
            
            // Combine all chunks
            var totalSize = 0;
            targetFiles[fd].data.forEach(function(chunk) {
                totalSize += chunk.byteLength;
            });
            
            console.log("[+] Total size: " + totalSize + " bytes");
            
            // Save to file
            var file = new File("/data/local/tmp/decrypted_dex.zip", "wb");
            targetFiles[fd].data.forEach(function(chunk) {
                file.write(chunk);
            });
            file.close();
            
            console.log("[+] ✅ Decrypted DEX dumped to: /data/local/tmp/decrypted_dex.zip");
            console.log("[+] Pull it with: adb pull /data/local/tmp/decrypted_dex.zip");
            
            delete targetFiles[fd];
        }
    }
});

// Also hook DexFile.loadDex to catch DEX loading
Java.perform(function() {
    console.log("[*] Hooking DexFile.loadDex...");
    
    var DexFile = Java.use("dalvik.system.DexFile");
    
    DexFile.loadDex.overload('java.lang.String', 'java.lang.String', 'int').implementation = function(sourcePathName, outputPathName, flags) {
        console.log("[+] DexFile.loadDex called:");
        console.log("    Source: " + sourcePathName);
        console.log("    Output: " + outputPathName);
        console.log("    Flags: " + flags);
        
        var result = this.loadDex(sourcePathName, outputPathName, flags);
        
        // If this is our target, copy the file
        if (sourcePathName.indexOf("i11111i111.zip") !== -1) {
            console.log("[+] ✅ Found target DEX load! Copying file...");
            
            // Copy the decrypted file
            var File = Java.use("java.io.File");
            var source = File.$new(sourcePathName);
            
            if (source.exists()) {
                console.log("[+] Source exists, size: " + source.length() + " bytes");
                
                // Use shell to copy
                var Runtime = Java.use("java.lang.Runtime");
                var runtime = Runtime.getRuntime();
                runtime.exec("cp " + sourcePathName + " /data/local/tmp/decrypted_from_load.zip");
                
                console.log("[+] Copied to: /data/local/tmp/decrypted_from_load.zip");
            }
        }
        
        return result;
    };
    
    console.log("[*] DexFile.loadDex hooked!");
});

// Hook BaseDexClassLoader to catch DEX loading
Java.perform(function() {
    console.log("[*] Hooking BaseDexClassLoader...");
    
    var BaseDexClassLoader = Java.use("dalvik.system.BaseDexClassLoader");
    
    BaseDexClassLoader.$init.overload('java.lang.String', 'java.io.File', 'java.lang.String', 'java.lang.ClassLoader').implementation = function(dexPath, optimizedDirectory, librarySearchPath, parent) {
        console.log("[+] BaseDexClassLoader constructor called:");
        console.log("    DEX path: " + dexPath);
        console.log("    Optimized dir: " + optimizedDirectory);
        
        if (dexPath.indexOf("i11111i111.zip") !== -1) {
            console.log("[+] ✅ Target DEX being loaded!");
        }
        
        return this.$init(dexPath, optimizedDirectory, librarySearchPath, parent);
    };
    
    console.log("[*] BaseDexClassLoader hooked!");
});

console.log("[*] All hooks installed, waiting for DEX decryption...");
