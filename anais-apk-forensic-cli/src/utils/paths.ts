import * as fs from "fs";
import * as os from "os";
import * as path from "path";

/**
 * Get the user's Documents folder path
 */
export function getUserDocumentsPath(): string {
  const homeDir = os.homedir();
  return path.join(homeDir, "Documents");
}

/**
 * Get the default analysis workspace path (Documents/Anais-Reports)
 */
export function getDefaultWorkspacePath(): string {
  return path.join(getUserDocumentsPath(), "Anais-Reports");
}

/**
 * Ensure the analysis workspace directory exists
 */
export function ensureWorkspaceExists(): void {
  const workspacePath = getDefaultWorkspacePath();
  if (!fs.existsSync(workspacePath)) {
    fs.mkdirSync(workspacePath, { recursive: true });
  }
}

/**
 * Get the project root directory (parent of anais-apk-forensic-cli)
 */
export function getProjectRoot(): string {
  return path.resolve(__dirname, "../../..");
}

/**
 * Get the path to anais.sh script
 */
export function getAnaisScriptPath(): string {
  return path.join(getProjectRoot(), "anais.sh");
}

/**
 * Check if a file exists
 */
export function fileExists(filePath: string): boolean {
  return fs.existsSync(filePath);
}

/**
 * Resolve absolute path
 */
export function resolveAbsolutePath(filePath: string): string {
  return path.resolve(filePath);
}

/**
 * Get basename of a file
 */
export function getBasename(filePath: string): string {
  return path.basename(filePath);
}
