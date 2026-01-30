"use strict";
/**
 * Output formatting utilities
 */
Object.defineProperty(exports, "__esModule", { value: true });
exports.colors = void 0;
exports.formatSuccess = formatSuccess;
exports.formatError = formatError;
exports.formatInfo = formatInfo;
exports.formatWarning = formatWarning;
exports.printSeparator = printSeparator;
exports.printBanner = printBanner;
exports.colors = {
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
function formatSuccess(message) {
    return `${exports.colors.green}✅ ${message}${exports.colors.reset}`;
}
function formatError(message) {
    return `${exports.colors.red}❌ ${message}${exports.colors.reset}`;
}
function formatInfo(message) {
    return `${exports.colors.blue}ℹ ${message}${exports.colors.reset}`;
}
function formatWarning(message) {
    return `${exports.colors.yellow}⚠ ${message}${exports.colors.reset}`;
}
function printSeparator(length = 50) {
    console.log("═".repeat(length));
}
function printBanner() {
    console.log(`\n${exports.colors.cyan}╔═══════════════════════════════════════════════════════════╗${exports.colors.reset}`);
    console.log(`${exports.colors.cyan}║   Anais APK Forensic Automation - CLI v1.0.0            ║${exports.colors.reset}`);
    console.log(`${exports.colors.cyan}║   Comprehensive APK Security Analysis & SAST             ║${exports.colors.reset}`);
    console.log(`${exports.colors.cyan}╚═══════════════════════════════════════════════════════════╝${exports.colors.reset}\n`);
}
