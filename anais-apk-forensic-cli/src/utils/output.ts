/**
 * Output formatting utilities
 */

export const colors = {
  reset: "\x1b[0m",
  bright: "\x1b[1m",
  dim: "\x1b[2m",
  red: "\x1b[31m",
  green: "\x1b[32m",
  yellow: "\x1b[33m",
  blue: "\x1b[34m",
  magenta: "\x1b[35m",
  cyan: "\x1b[36m",
};

export function formatSuccess(message: string): string {
  return `${colors.green}✅ ${message}${colors.reset}`;
}

export function formatError(message: string): string {
  return `${colors.red}❌ ${message}${colors.reset}`;
}

export function formatInfo(message: string): string {
  return `${colors.blue}ℹ ${message}${colors.reset}`;
}

export function formatWarning(message: string): string {
  return `${colors.yellow}⚠ ${message}${colors.reset}`;
}

export function printSeparator(length: number = 50): void {
  console.log("═".repeat(length));
}

export function printBanner(): void {
  console.log(
    `\n${colors.cyan}╔═══════════════════════════════════════════════════════════╗${colors.reset}`,
  );
  console.log(
    `${colors.cyan}║   Anais APK Forensic Automation - CLI v1.0.0            ║${colors.reset}`,
  );
  console.log(
    `${colors.cyan}║   Comprehensive APK Security Analysis & SAST             ║${colors.reset}`,
  );
  console.log(
    `${colors.cyan}╚═══════════════════════════════════════════════════════════╝${colors.reset}\n`,
  );
}
