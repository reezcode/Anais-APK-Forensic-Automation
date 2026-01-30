#!/usr/bin/env node
"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
Object.defineProperty(exports, "__esModule", { value: true });
const index_1 = require("./index");
const utils_1 = require("./utils");
const main = () => __awaiter(void 0, void 0, void 0, function* () {
    const args = process.argv.slice(2);
    if (args.length === 0) {
        (0, utils_1.printBanner)();
        console.log("Usage:");
        console.log("  anais <apk-file-path>     Analyze an APK file");
        console.log("  anais --version           Show version");
        console.log("  anais --help              Show this help message");
        process.exit(0);
    }
    if (args[0] === "--version" || args[0] === "-v") {
        console.log("Anais APK Forensic CLI v1.0.0");
        process.exit(0);
    }
    if (args[0] === "--help" || args[0] === "-h") {
        (0, utils_1.printBanner)();
        console.log("Usage:");
        console.log("  anais <apk-file-path>     Analyze an APK file");
        console.log("  anais --version           Show version");
        console.log("  anais --help              Show this help message");
        console.log("\nDescription:");
        console.log("  Comprehensive APK security analysis and SAST scanner");
        console.log("  - Decompilation with APKTool and JADX");
        console.log("  - YARA malware detection");
        console.log("  - Obfuscation detection");
        console.log("  - Network traffic analysis");
        console.log("  - AndroidManifest analysis");
        console.log("  - Entropy analysis for encrypted payloads");
        process.exit(0);
    }
    const apkPath = args[0];
    try {
        console.log(`🔍 Anais APK Forensic Analysis\n`);
        (0, utils_1.printSeparator)();
        console.log();
        const result = yield (0, index_1.executeForensicAnalysis)(apkPath);
        console.log();
        (0, utils_1.printSeparator)();
        if (result.success) {
            console.log(`\n${(0, utils_1.formatSuccess)("Analysis completed successfully!")}\n`);
            if (result.workspaceDir) {
                console.log(`📁 Workspace: ${result.workspaceDir}`);
            }
            if (result.reportPath) {
                console.log(`📄 Report: ${result.reportPath}`);
            }
            if (result.jsonReportPath) {
                console.log(`📊 JSON Report: ${result.jsonReportPath}`);
            }
            console.log("\n💡 Tip: Open the report with your preferred markdown viewer");
            console.log(`   e.g., cat "${result.reportPath}"\n`);
        }
        else {
            console.log(`\n${(0, utils_1.formatError)("Analysis failed!")}\n`);
            console.log(`Error: ${result.message}`);
            if (result.error) {
                console.log(`Details: ${result.error}`);
            }
            process.exit(1);
        }
    }
    catch (error) {
        console.error(`\n${(0, utils_1.formatError)("Unexpected error during analysis:")}`);
        console.error(error);
        process.exit(1);
    }
});
main();
