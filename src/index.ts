import { spawn } from "child_process";
import { AnalysisResult } from "./types";
import {
  fileExists,
  getBasename,
  getProjectRoot,
  resolveAbsolutePath,
} from "./utils";

export * from "./types";

export interface ExecuteOptions {
  /**
   * Where to echo the script's human-readable output. Defaults to stdout.
   * The MCP server passes a stderr writer so the stdio JSON-RPC channel on
   * stdout stays clean.
   */
  log?: (chunk: string) => void;
  /** Extra environment variables (e.g. ANAIS_REA=1) merged into the child env. */
  env?: NodeJS.ProcessEnv;
}

export const executeForensicAnalysis = async (
  apkPath: string,
  extraArgs: string[] = [],
  opts: ExecuteOptions = {},
): Promise<AnalysisResult> => {
  const log = opts.log ?? ((chunk: string) => process.stdout.write(chunk));
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

    log(`\n📱 APK: ${getBasename(absoluteApkPath)}\n`);
    log(`📂 Path: ${absoluteApkPath}\n`);

    // Get paths
    const scriptDir = getProjectRoot();

    log(`🚀 Executing analysis (reema engine)...\n`);

    // Spawn the native Python engine (passthrough flags before the APK path).
    // The bash engine (anais.sh) was retired in 0.7.0; reema/apk.py is the engine.
    const analysis = spawn("python3", ["-m", "reema", "analyze", ...extraArgs, absoluteApkPath], {
      cwd: scriptDir,
      env: {
        ...process.env,
        PYTHONWARNINGS: "ignore",
        PYTHONPATH: scriptDir + (process.env.PYTHONPATH ? `:${process.env.PYTHONPATH}` : ""),
        ...(opts.env ?? {}),
      },
    });

    let stdout = "";
    let stderr = "";
    let workspaceDir = "";
    let reportPath = "";

    // Capture stdout
    analysis.stdout.on("data", (data) => {
      const output = data.toString();
      log(output);
      stdout += output;

      // reema prints: "reema: case <id> -> <case_dir>". The report is written
      // to <case_dir>/reports/report.md.
      const caseMatch = output.match(/reema: case \S+ -> (.+)/);
      if (caseMatch) {
        workspaceDir = caseMatch[1].trim();
        reportPath = `${workspaceDir}/reports/report.md`;
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
