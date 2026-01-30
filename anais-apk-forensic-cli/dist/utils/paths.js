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
var __setModuleDefault = (this && this.__setModuleDefault) || (Object.create ? (function(o, v) {
    Object.defineProperty(o, "default", { enumerable: true, value: v });
}) : function(o, v) {
    o["default"] = v;
});
var __importStar = (this && this.__importStar) || (function () {
    var ownKeys = function(o) {
        ownKeys = Object.getOwnPropertyNames || function (o) {
            var ar = [];
            for (var k in o) if (Object.prototype.hasOwnProperty.call(o, k)) ar[ar.length] = k;
            return ar;
        };
        return ownKeys(o);
    };
    return function (mod) {
        if (mod && mod.__esModule) return mod;
        var result = {};
        if (mod != null) for (var k = ownKeys(mod), i = 0; i < k.length; i++) if (k[i] !== "default") __createBinding(result, mod, k[i]);
        __setModuleDefault(result, mod);
        return result;
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
exports.getProjectRoot = getProjectRoot;
exports.getAnaisScriptPath = getAnaisScriptPath;
exports.fileExists = fileExists;
exports.resolveAbsolutePath = resolveAbsolutePath;
exports.getBasename = getBasename;
const path = __importStar(require("path"));
const fs = __importStar(require("fs"));
/**
 * Get the project root directory (parent of anais-apk-forensic-cli)
 */
function getProjectRoot() {
    return path.resolve(__dirname, "../../..");
}
/**
 * Get the path to anais.sh script
 */
function getAnaisScriptPath() {
    return path.join(getProjectRoot(), "anais.sh");
}
/**
 * Check if a file exists
 */
function fileExists(filePath) {
    return fs.existsSync(filePath);
}
/**
 * Resolve absolute path
 */
function resolveAbsolutePath(filePath) {
    return path.resolve(filePath);
}
/**
 * Get basename of a file
 */
function getBasename(filePath) {
    return path.basename(filePath);
}
