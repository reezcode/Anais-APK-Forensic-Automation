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
 * Get the project root directory (where package is installed)
 * When installed via npm, __dirname will be in node_modules/anais-apk-forensic/dist/utils
 * We need to go up to the package root
 */
export function getProjectRoot(): string {
  // Check if we're in node_modules (installed via npm)
  const currentDir = path.resolve(__dirname, "../..");
  if (currentDir.includes("node_modules")) {
    // Go up to node_modules/anais-apk-forensic/
    return path.resolve(__dirname, "../..");
  }
  // Otherwise we're in development mode (dist/utils -> root)
  return path.resolve(__dirname, "../..");
}

/**
 * Get the path to anais.sh script
 */
export function getAnaisScriptPath(): string {
  return path.join(getProjectRoot(), "anais.sh");
}

/**
 * Read the package version from package.json (single source of truth)
 */
export function getVersion(): string {
  try {
    const pkgPath = path.join(getProjectRoot(), "package.json");
    const pkg = JSON.parse(fs.readFileSync(pkgPath, "utf8"));
    return pkg.version || "unknown";
  } catch {
    return "unknown";
  }
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
