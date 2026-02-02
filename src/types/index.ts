/**
 * Analysis result from the forensic analysis
 */
export interface AnalysisResult {
  success: boolean;
  apkPath: string;
  workspaceDir?: string;
  reportPath?: string;
  jsonReportPath?: string;
  message: string;
  error?: string;
}

/**
 * CLI command options
 */
export interface CLIOptions {
  help?: boolean;
  version?: boolean;
  verbose?: boolean;
  output?: string;
}

/**
 * Original types (kept for compatibility)
 */
export interface CommandLineOptions {
  inputFile: string;
  outputFile?: string;
  verbose?: boolean;
}

export interface ApkAnalysisResult {
  packageName: string;
  versionCode: number;
  versionName: string;
  permissions: string[];
  activities: string[];
  services: string[];
  receivers: string[];
  providers: string[];
}

export type AnalysisStatus = "pending" | "in-progress" | "completed" | "failed";
