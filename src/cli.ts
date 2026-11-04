#!/usr/bin/env node

import { executeForensicAnalysis } from "./index";
import {
  formatError,
  formatSuccess,
  getVersion,
  printBanner,
  printSeparator,
} from "./utils";

const printUsage = () => {
  console.log("Usage:");
  console.log("  anais [options] <apk-file-path>   Analyze an APK file");
  console.log("");
  console.log("Options:");
  console.log("  -y, --yara <file>   Use a custom YARA rule file (repeatable)");
  console.log("  -v, --version       Show version");
  console.log("  -h, --help          Show this help message");
};

const main = async () => {
  const args = process.argv.slice(2);

  if (args.length === 0) {
    printBanner();
    printUsage();
    process.exit(0);
  }

  if (args[0] === "--version" || args[0] === "-v") {
    console.log(`Anais APK Forensic CLI v${getVersion()}`);
    process.exit(0);
  }

  if (args[0] === "--help" || args[0] === "-h") {
    printBanner();
    printUsage();
    console.log("\nDescription:");
    console.log("  Comprehensive APK security analysis and SAST scanner");
    console.log("  - Decompilation with APKTool and JADX");
    console.log("  - YARA malware detection");
    console.log("  - Obfuscation & RASP detection");
    console.log("  - Network traffic analysis");
    console.log("  - AndroidManifest analysis");
    console.log("  - Entropy analysis for encrypted payloads");
    process.exit(0);
  }

  // Separate the APK path from passthrough flags (e.g. -y/--yara rules).
  let apkPath = "";
  const passthrough: string[] = [];
  for (let i = 0; i < args.length; i++) {
    const a = args[i];
    if (a === "-y" || a === "--yara") {
      passthrough.push(a);
      if (i + 1 < args.length) {
        passthrough.push(args[++i]);
      }
    } else if (!apkPath) {
      apkPath = a;
    } else {
      passthrough.push(a);
    }
  }

  if (!apkPath) {
    console.log(`${formatError("No APK file path provided.")}\n`);
    printUsage();
    process.exit(1);
  }

  try {
    console.log(`🔍 Anais APK Forensic Analysis\n`);
    printSeparator();
    console.log();

    const result = await executeForensicAnalysis(apkPath, passthrough);

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
