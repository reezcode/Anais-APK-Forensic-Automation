import * as fs from "fs";
import * as path from "path";

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
