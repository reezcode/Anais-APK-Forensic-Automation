import { spawn } from "child_process";
import { AnalysisResult } from "./types";
import {
  fileExists,
  getAnaisScriptPath,
  getBasename,
  getProjectRoot,
  resolveAbsolutePath,
} from "./utils";

export * from "./types";

export const executeForensicAnalysis = async (
  apkPath: string,
  extraArgs: string[] = [],
): Promise<AnalysisResult> => {
  return new Promise((resolve, reject) => {
    // Resolve absolute path
    const absoluteApkPath = resolveAbsolutePath(apkPath);

    // Check if APK file exists
    if (!fileExists(absoluteApkPath)) {
      return resolve({
        success: false,
        apkPath,
        message: `APK file not found: ${apkPath}`,
        error: "File not found",
      });
    }

    console.log(`\n📱 APK: ${getBasename(absoluteApkPath)}`);
    console.log(`📂 Path: ${absoluteApkPath}\n`);

    // Get paths
    const scriptDir = getProjectRoot();
    const anaisScript = getAnaisScriptPath();

    if (!fileExists(anaisScript)) {
      return resolve({
        success: false,
        apkPath,
        message: `Analysis script not found: ${anaisScript}`,
        error: "Script not found",
      });
    }

    console.log(`🚀 Executing analysis...\n`);

    // Spawn the bash script (passthrough flags before the APK path)
    const analysis = spawn("bash", [anaisScript, ...extraArgs, absoluteApkPath], {
      cwd: scriptDir,
      env: {
        ...process.env,
        PYTHONWARNINGS: "ignore",
      },
    });

    let stdout = "";
    let stderr = "";
    let workspaceDir = "";
    let reportPath = "";

    // Capture stdout
    analysis.stdout.on("data", (data) => {
      const output = data.toString();
      process.stdout.write(output);
      stdout += output;

      // Extract workspace directory from output
      const workspaceMatch = output.match(/Workspace initialized: (.+)/);
      if (workspaceMatch) {
        workspaceDir = workspaceMatch[1].trim();
      }

      // Extract report path
      const reportMatch = output.match(/Main report: (.+\.md)/);
      if (reportMatch) {
        reportPath = reportMatch[1].trim();
      }
    });

    // Capture stderr (though we're logging warnings there)
    analysis.stderr.on("data", (data) => {
      stderr += data.toString();
      // Don't print stderr to console as it's handled by the script
    });

    // Handle process completion
    analysis.on("close", (code) => {
      if (code === 0) {
        const jsonReportPath = reportPath.replace(/\.md$/, ".json");

        resolve({
          success: true,
          apkPath: absoluteApkPath,
          workspaceDir,
          reportPath,
          jsonReportPath: fileExists(jsonReportPath)
            ? jsonReportPath
            : undefined,
          message: "Analysis completed successfully",
        });
      } else {
        resolve({
          success: false,
          apkPath: absoluteApkPath,
          workspaceDir,
          message: `Analysis failed with exit code ${code}`,
          error: stderr || "Unknown error",
        });
      }
    });

    // Handle errors
    analysis.on("error", (error) => {
      reject({
        success: false,
        apkPath: absoluteApkPath,
        message: "Failed to execute analysis script",
        error: error.message,
      });
    });
  });
};
