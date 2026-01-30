"use strict";
var __createBinding = (this && this.__createBinding) || (Object.create ? (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    var desc = Object.getOwnPropertyDescriptor(m, k);
    if (!desc || ("get" in desc ? !m.__esModule : desc.writable || desc.configurable)) {
      desc = { enumerable: true, get: function() { return m[k]; } };
    }
    Object.defineProperty(o, k2, desc);
}) : (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    o[k2] = m[k];
}));
var __exportStar = (this && this.__exportStar) || function(m, exports) {
    for (var p in m) if (p !== "default" && !Object.prototype.hasOwnProperty.call(exports, p)) __createBinding(exports, m, p);
};
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.executeForensicAnalysis = void 0;
const child_process_1 = require("child_process");
const utils_1 = require("./utils");
__exportStar(require("./types"), exports);
const executeForensicAnalysis = (apkPath) => __awaiter(void 0, void 0, void 0, function* () {
    return new Promise((resolve, reject) => {
        // Resolve absolute path
        const absoluteApkPath = (0, utils_1.resolveAbsolutePath)(apkPath);
        // Check if APK file exists
        if (!(0, utils_1.fileExists)(absoluteApkPath)) {
            return resolve({
                success: false,
                apkPath,
                message: `APK file not found: ${apkPath}`,
                error: "File not found",
            });
        }
        console.log(`\n📱 APK: ${(0, utils_1.getBasename)(absoluteApkPath)}`);
        console.log(`📂 Path: ${absoluteApkPath}\n`);
        // Get paths
        const scriptDir = (0, utils_1.getProjectRoot)();
        const anaisScript = (0, utils_1.getAnaisScriptPath)();
        if (!(0, utils_1.fileExists)(anaisScript)) {
            return resolve({
                success: false,
                apkPath,
                message: `Analysis script not found: ${anaisScript}`,
                error: "Script not found",
            });
        }
        console.log(`🚀 Executing analysis...\n`);
        // Spawn the bash script
        const analysis = (0, child_process_1.spawn)("bash", [anaisScript, absoluteApkPath], {
            cwd: scriptDir,
            env: Object.assign(Object.assign({}, process.env), { PYTHONWARNINGS: "ignore" }),
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
                    jsonReportPath: (0, utils_1.fileExists)(jsonReportPath)
                        ? jsonReportPath
                        : undefined,
                    message: "Analysis completed successfully",
                });
            }
            else {
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
});
exports.executeForensicAnalysis = executeForensicAnalysis;
