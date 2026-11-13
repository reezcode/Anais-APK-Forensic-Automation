#!/usr/bin/env node
/**
 * Anais MCP server
 *
 * Exposes the Anais APK forensic pipeline as MCP tools so an agent (Claude Code,
 * Codex, etc.) can drive it: run the static analysis, read the report, pull the
 * REA deep-pass task list, merge agent-produced deep results, and run the gated
 * dynamic (ADB/Frida) bridge.
 *
 * Transport is stdio: stdout carries the JSON-RPC channel, so all human-readable
 * logging goes to stderr.
 */

import { spawn } from "child_process";
import * as fs from "fs";
import * as path from "path";
import { McpServer } from "@modelcontextprotocol/sdk/server/mcp.js";
import { StdioServerTransport } from "@modelcontextprotocol/sdk/server/stdio.js";
import { z } from "zod";

import { executeForensicAnalysis } from "../index";
import { getProjectRoot, getVersion } from "../utils/paths";

const ROOT = getProjectRoot();
const TOOLS_DIR = path.join(ROOT, "analysis_tools");

function logErr(msg: string): void {
  process.stderr.write(msg.endsWith("\n") ? msg : msg + "\n");
}

function deriveDirs(workDir: string): { reports: string; temp: string } {
  return { reports: path.join(workDir, "reports"), temp: path.join(workDir, "temp") };
}

function readJson(file: string): any | null {
  try {
    return JSON.parse(fs.readFileSync(file, "utf8"));
  } catch {
    return null;
  }
}

/** Run a Python analysis tool, capturing output (never to our stdout). */
function runPython(
  script: string,
  args: string[],
  env: NodeJS.ProcessEnv = {},
): Promise<{ code: number; stdout: string; stderr: string }> {
  return new Promise((resolve) => {
    const proc = spawn("python3", [path.join(TOOLS_DIR, script), ...args], {
      cwd: ROOT,
      env: { ...process.env, PYTHONWARNINGS: "ignore", ...env },
    });
    let stdout = "";
    let stderr = "";
    proc.stdout.on("data", (d) => (stdout += d.toString()));
    proc.stderr.on("data", (d) => (stderr += d.toString()));
    proc.on("close", (code) => resolve({ code: code ?? -1, stdout, stderr }));
    proc.on("error", (e) => resolve({ code: -1, stdout, stderr: String(e) }));
  });
}

/** Compact, agent-friendly summary of a report.json. */
function summarizeReport(report: any): any {
  const r = report?.results ?? {};
  const pick = (o: any, keys: string[]) =>
    o && typeof o === "object"
      ? Object.fromEntries(keys.filter((k) => k in o).map((k) => [k, o[k]]))
      : undefined;
  return {
    metadata: report?.metadata,
    package: r.basic_info?.package_name,
    framework: r.framework?.primary,
    rasp: pick(r.rasp ?? r.rasp_report, ["type", "confidence", "detected"]),
    signing: pick(r.signing, ["debug_certificate", "janus_vulnerable", "schemes"]),
    sdk_count: r.sdk_inventory ? Object.keys(r.sdk_inventory.sdks ?? r.sdk_inventory).length : undefined,
    sast: pick(r.sast?.summary, ["critical", "high", "medium", "low", "risk_score"]),
    risk: r.risk ?? report?.risk,
    rea_available: r.rea?.available ?? false,
    rea_deep: r.rea_deep ? { completed: (r.rea_deep.completed ?? []).length, pending: (r.rea_deep.pending ?? []).length } : undefined,
    dynamic_executed: r.dynamic?.executed ?? false,
  };
}

function text(obj: unknown) {
  return { content: [{ type: "text" as const, text: typeof obj === "string" ? obj : JSON.stringify(obj, null, 2) }] };
}

const server = new McpServer({ name: "anais", version: getVersion() });

// Alias to avoid TS2589 (the SDK's zod-rawShape generic over-instantiates);
// handler args are validated at runtime by the declared zod schemas.
const reg: any = server.registerTool.bind(server);

reg(
  "anais_analyze",
  {
    title: "Analyze an APK (static pipeline)",
    description:
      "Run the full Anais static forensic pipeline on a local APK/XAPK/APKM/APKS/AAB. " +
      "Decompiles, runs SAST/YARA/entropy, RASP & packer detection, framework/signing/SDK " +
      "analysis, and a composite risk score. Set rea=true to also run REA's cheap passes and " +
      "emit the deep-pass task list. Returns the work dir, report paths, and a summary.",
    inputSchema: {
      apkPath: z.string().describe("Absolute path to the APK/bundle file"),
      yara: z.boolean().optional().describe("Run the full YARA scan (-y)"),
      rea: z.boolean().optional().describe("Also run the REA bridge (ANAIS_REA=1)"),
    },
  },
  async ({ apkPath, yara, rea }: any) => {
    const flags: string[] = [];
    if (yara) flags.push("-y");
    const env = rea ? { ANAIS_REA: "1" } : {};
    const result = await executeForensicAnalysis(apkPath, flags, { log: logErr, env });
    let workDir: string | undefined;
    let summary: any;
    if (result.reportPath) {
      workDir = path.dirname(path.dirname(result.reportPath));
      const json = result.jsonReportPath && readJson(result.jsonReportPath);
      if (json) summary = summarizeReport(json);
    }
    return text({ ...result, workDir, summary });
  },
);

reg(
  "anais_read_report",
  {
    title: "Read a prior analysis report",
    description:
      "Return the compact summary of a completed analysis (risk, package, framework, RASP, " +
      "signing, SAST counts). Pass a workDir from anais_analyze. Set full=true for the entire " +
      "report.json.",
    inputSchema: {
      workDir: z.string().describe("The work dir returned by anais_analyze"),
      full: z.boolean().optional().describe("Return the entire report.json instead of a summary"),
    },
  },
  async ({ workDir, full }: any) => {
    const { reports } = deriveDirs(workDir);
    const json = readJson(path.join(reports, "report.json"));
    if (!json) return text({ error: `no report.json under ${reports}` });
    return text(full ? json : summarizeReport(json));
  },
);

reg(
  "anais_rea_targets",
  {
    title: "Get REA deep-pass tasks",
    description:
      "Return rea_targets.json: the machine-actionable deep-analysis tasks Anais queued for an " +
      "agent to run with REA's deep tools (native decompile, flow trace, dynamic). Requires a " +
      "prior anais_analyze with rea=true. Execute the tasks with REA, then call anais_merge_deep.",
    inputSchema: { workDir: z.string().describe("The work dir returned by anais_analyze") },
  },
  async ({ workDir }: any) => {
    const { reports } = deriveDirs(workDir);
    const json = readJson(path.join(reports, "rea_targets.json"));
    if (!json) return text({ error: "no rea_targets.json — run anais_analyze with rea=true first" });
    return text(json);
  },
);

reg(
  "anais_merge_deep",
  {
    title: "Merge REA deep-pass results",
    description:
      "After running the rea_targets.json tasks with REA's deep tools, pass the raw results here. " +
      "Validates them against the task list, writes rea_deep.json, and regenerates the report + " +
      "frida_auto.js (native hook points become concrete Frida hooks). See docs/reema/rea-deep-pass.md.",
    inputSchema: {
      workDir: z.string().describe("The work dir returned by anais_analyze"),
      results: z
        .object({
          completed: z.array(z.any()).optional(),
          skipped: z.array(z.any()).optional(),
          notes: z.array(z.any()).optional(),
        })
        .passthrough()
        .describe("Raw deep-pass results (see docs/reema/rea-deep-pass.md)"),
    },
  },
  async ({ workDir, results }: any) => {
    const { reports, temp } = deriveDirs(workDir);
    const report = readJson(path.join(reports, "report.json"));
    const apk = report?.metadata?.apk_name ?? "app.apk";
    const sha = report?.metadata?.sha256 ?? "";
    const rawPath = path.join(temp, "rea_raw_results.json");
    fs.writeFileSync(rawPath, JSON.stringify(results, null, 2));
    const r = await runPython("rea_deep.py", [
      path.join(reports, "rea_targets.json"),
      rawPath,
      path.join(reports, "rea_deep.json"),
      "--work-dir", workDir, "--temp-dir", temp, "--apk", apk, "--sha", sha,
    ]);
    return text({ code: r.code, stdout: r.stdout.trim(), stderr: r.stderr.trim() });
  },
);

reg(
  "anais_dynamic",
  {
    title: "Dynamic analysis (ADB/Frida) — gated",
    description:
      "Run the target on a connected device under the generated frida_auto.js and capture hook " +
      "hits + logcat. SAFETY: this EXECUTES the target (possibly malware). It is dry-run by " +
      "default (returns the command plan, runs nothing); pass execute=true to actually drive the " +
      "device. Use a disposable/isolated device. See docs/dyxon/dynamic-analysis.md.",
    inputSchema: {
      workDir: z.string().describe("The work dir returned by anais_analyze"),
      execute: z.boolean().optional().describe("Actually run on the device (default false = dry-run)"),
      mode: z.enum(["spawn", "attach"]).optional().describe("spawn (default) or attach"),
      timeout: z.number().int().positive().optional().describe("Capture window seconds (default 30)"),
      serial: z.string().optional().describe("Target device serial (adb -s / frida -D)"),
    },
  },
  async ({ workDir, execute, mode, timeout, serial }: any) => {
    const { reports, temp } = deriveDirs(workDir);
    const args = [temp, reports, "--mode", mode ?? "spawn", "--timeout", String(timeout ?? 30)];
    if (serial) args.push("--serial", serial);
    if (execute) args.push("--yes");
    const r = await runPython("dynamic_bridge.py", args);
    const findings = readJson(path.join(reports, "dynamic_findings.json"));
    return text({ code: r.code, stdout: r.stdout.trim(), stderr: r.stderr.trim(), findings });
  },
);

async function main(): Promise<void> {
  const transport = new StdioServerTransport();
  await server.connect(transport);
  logErr(`Anais MCP server v${getVersion()} ready (stdio)`);
}

main().catch((e) => {
  logErr(`fatal: ${e}`);
  process.exit(1);
});
