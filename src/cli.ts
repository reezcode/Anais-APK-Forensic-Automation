#!/usr/bin/env node

import { executeForensicAnalysis } from "./index";
import {
  formatError,
  formatSuccess,
  printBanner,
  printSeparator,
} from "./utils";

const main = async () => {
  const args = process.argv.slice(2);

  if (args.length === 0) {
    printBanner();
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
    printBanner();
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
    printSeparator();
    console.log();

    const result = await executeForensicAnalysis(apkPath);

    console.log();
    printSeparator();

    if (result.success) {
      console.log(`\n${formatSuccess("Analysis completed successfully!")}\n`);

      if (result.workspaceDir) {
        console.log(`📁 Workspace: ${result.workspaceDir}`);
      }

      if (result.reportPath) {
        console.log(`📄 Report: ${result.reportPath}`);
      }

      if (result.jsonReportPath) {
        console.log(`📊 JSON Report: ${result.jsonReportPath}`);
      }

      console.log(
        "\n💡 Tip: Open the report with your preferred markdown viewer",
      );
      console.log(`   e.g., cat "${result.reportPath}"\n`);
    } else {
      console.log(`\n${formatError("Analysis failed!")}\n`);
      console.log(`Error: ${result.message}`);
      if (result.error) {
        console.log(`Details: ${result.error}`);
      }
      process.exit(1);
    }
  } catch (error) {
    console.error(`\n${formatError("Unexpected error during analysis:")}`);
    console.error(error);
    process.exit(1);
  }
};

main();
