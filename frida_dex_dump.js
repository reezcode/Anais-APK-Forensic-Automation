"""
Frida script untuk dump DEX dari memory saat runtime
Berguna untuk bypass DPT - Shell, DexProtector, dan proteksi lainnya
"""

Java.perform(function () {
    console.log("[*] Starting DEX Dump Script...");

    // Hook DexFile class untuk intercept loaded DEX
    var DexFile = Java.use("dalvik.system.DexFile");

    // Hook openDexFile untuk capture DEX files
    DexFile.openDexFile.overload('java.lang.String', 'java.lang.String', 'int').implementation = function (source, output, flags) {
        console.log("[+] DexFile.openDexFile called");
        console.log("    Source: " + source);
        console.log("    Output: " + output);

        var result = this.openDexFile(source, output, flags);

        // Try to dump the DEX
        try {
            var file = Java.use("java.io.File").$new(source);
            if (file.exists()) {
                console.log("[+] DEX file exists, attempting to dump...");
                dumpDexFile(source);
            }
        } catch (e) {
            console.log("[-] Error dumping DEX: " + e);
        }

        return result;
    };

    // Hook DexClassLoader untuk capture dynamically loaded DEX
    var DexClassLoader = Java.use("dalvik.system.DexClassLoader");
    DexClassLoader.$init.overload('java.lang.String', 'java.lang.String', 'java.lang.String', 'java.lang.ClassLoader').implementation = function (dexPath, optimizedDir, libraryPath, parent) {
        console.log("[+] DexClassLoader initialized");
        console.log("    DEX Path: " + dexPath);
        console.log("    Optimized: " + optimizedDir);

        // Dump the DEX before loading
        dumpDexFile(dexPath);

        return this.$init(dexPath, optimizedDir, libraryPath, parent);
    };

    // Hook PathClassLoader
    var PathClassLoader = Java.use("dalvik.system.PathClassLoader");
    PathClassLoader.$init.overload('java.lang.String', 'java.lang.ClassLoader').implementation = function (dexPath, parent) {
        console.log("[+] PathClassLoader initialized");
        console.log("    DEX Path: " + dexPath);

        dumpDexFile(dexPath);

        return this.$init(dexPath, parent);
    };

    // Function to dump DEX file
    function dumpDexFile(dexPath) {
        try {
            var File = Java.use("java.io.File");
            var FileInputStream = Java.use("java.io.FileInputStream");
            var FileOutputStream = Java.use("java.io.FileOutputStream");

            var srcFile = File.$new(dexPath);
            if (!srcFile.exists()) {
                console.log("[-] Source file doesn't exist: " + dexPath);
                return;
            }

            var timestamp = Date.now();
            var outputPath = "/sdcard/dumped_dex_" + timestamp + ".dex";
            var dstFile = File.$new(outputPath);

            var fis = FileInputStream.$new(srcFile);
            var fos = FileOutputStream.$new(dstFile);

            var buffer = Java.array('byte', []);
            buffer = Java.use("java.lang.reflect.Array").newInstance(Java.use("java.lang.Byte").TYPE, 8192);

            var bytesRead = 0;
            while ((bytesRead = fis.read(buffer)) !== -1) {
                fos.write(buffer, 0, bytesRead);
            }

            fis.close();
            fos.close();

            console.log("[+] DEX dumped to: " + outputPath);

        } catch (e) {
            console.log("[-] Error in dumpDexFile: " + e);
        }
    }

    // Hook native methods that might decrypt DEX
    // Common patterns in DPT-Shell and similar protectors

    var System = Java.use("java.lang.System");
    System.loadLibrary.implementation = function (libname) {
        console.log("[+] Loading native library: " + libname);

        // Common protection library names
        var protectionLibs = ["dpt", "protect", "shell", "jiagu", "bangcle"];
        var isProtectionLib = protectionLibs.some(function (name) {
            return libname.toLowerCase().indexOf(name) !== -1;
        });

        if (isProtectionLib) {
            console.log("[!] PROTECTION LIBRARY DETECTED: " + libname);
            console.log("[!] DEX decryption may occur after this");
        }

        return this.loadLibrary(libname);
    };

    // Hook Runtime.load for additional native library monitoring
    var Runtime = Java.use("java.lang.Runtime");
    Runtime.load.implementation = function (libpath) {
        console.log("[+] Runtime.load called: " + libpath);
        return this.load(libpath);
    };

    // Dump all loaded classes periodically
    setTimeout(function () {
        console.log("[*] Enumerating loaded classes...");

        Java.enumerateLoadedClasses({
            onMatch: function (className) {
                // Filter for potentially interesting classes
                if (className.indexOf("com.") === 0 &&
                    !className.startsWith("com.android") &&
                    !className.startsWith("com.google")) {
                    console.log("    " + className);
                }
            },
            onComplete: function () {
                console.log("[*] Class enumeration complete");
            }
        });
    }, 5000);

    console.log("[*] DEX Dump Script ready. Hooks installed.");
    console.log("[*] Dumped files will be in /sdcard/dumped_dex_*.dex");
    console.log("[*] Use 'adb pull /sdcard/dumped_dex_*.dex' to retrieve them");
});
