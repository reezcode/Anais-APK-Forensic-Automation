#!/usr/bin/env python3
"""
SARIF Exporter

Converts Anais SAST findings into SARIF 2.1.0 so results can be uploaded to
GitHub code scanning, Azure DevOps, or any SARIF-aware CI/dashboard.

Usage: sarif_exporter.py <sast_findings.json> <output.sarif> [apk_name]
"""

import sys
import json

SARIF_VERSION = "2.1.0"
SARIF_SCHEMA = "https://raw.githubusercontent.com/oasis-tcs/sarif-spec/master/Schemata/sarif-schema-2.1.0.json"

# SARIF level per Anais severity
LEVEL = {"critical": "error", "high": "error", "medium": "warning", "low": "note", "info": "note"}
# GitHub security-severity numeric (drives severity badge)
SECURITY_SEVERITY = {"critical": "9.5", "high": "8.0", "medium": "5.0", "low": "3.0", "info": "1.0"}

SEVERITIES = ["critical", "high", "medium", "low", "info"]


def build_sarif(sast, apk_name):
    rules = {}
    results = []

    for sev in SEVERITIES:
        for f in sast.get(sev, []) or []:
            category = f.get("category", "finding")
            rule_id = f"anais/{category}"
            if rule_id not in rules:
                rules[rule_id] = {
                    "id": rule_id,
                    "name": "".join(w.capitalize() for w in category.split("_")) or "Finding",
                    "shortDescription": {"text": f.get("title", category)},
                    "defaultConfiguration": {"level": LEVEL.get(sev, "warning")},
                    "properties": {
                        "tags": ["security", category],
                        "security-severity": SECURITY_SEVERITY.get(sev, "5.0"),
                    },
                }

            file_path = f.get("file") or "unknown"
            line = f.get("line")
            region = {"startLine": line} if isinstance(line, int) and line > 0 else {"startLine": 1}

            result = {
                "ruleId": rule_id,
                "level": LEVEL.get(sev, "warning"),
                "message": {"text": f.get("description") or f.get("title") or category},
                "locations": [{
                    "physicalLocation": {
                        "artifactLocation": {"uri": file_path},
                        "region": region,
                    }
                }],
                "properties": {"severity": sev},
            }
            snippet = f.get("code")
            if snippet:
                result["locations"][0]["physicalLocation"]["region"]["snippet"] = {"text": snippet}
            results.append(result)

    return {
        "$schema": SARIF_SCHEMA,
        "version": SARIF_VERSION,
        "runs": [{
            "tool": {
                "driver": {
                    "name": "Anais",
                    "informationUri": "https://github.com/reezcode/Anais-APK-Forensic-Automation",
                    "rules": list(rules.values()),
                }
            },
            "properties": {"apk": apk_name} if apk_name else {},
            "results": results,
        }],
    }


def main():
    if len(sys.argv) < 3:
        print("Usage: sarif_exporter.py <sast_findings.json> <output.sarif> [apk_name]")
        sys.exit(1)

    sast_path = sys.argv[1]
    output_path = sys.argv[2]
    apk_name = sys.argv[3] if len(sys.argv) > 3 else None

    try:
        with open(sast_path) as f:
            sast = json.load(f)
    except Exception as exc:
        print(f"Could not read SAST findings: {exc}", file=sys.stderr)
        sys.exit(1)

    sarif = build_sarif(sast, apk_name)
    with open(output_path, "w") as f:
        json.dump(sarif, f, indent=2)

    print(f"SARIF written: {len(sarif['runs'][0]['results'])} results, {len(sarif['runs'][0]['tool']['driver']['rules'])} rules")


if __name__ == "__main__":
    main()
