#!/usr/bin/env python3
"""
Report Diff

Compares two Anais report.json files (two versions of the same app) and reports
what changed between them: risk score, permissions, network endpoints, native
libraries, bundled SDKs, detected framework and RASP. Useful for spotting a
malicious update or a new data-exfiltration path introduced between releases.

Usage: diff_reports.py <old_report.json> <new_report.json> [output_json]
"""

import sys
import json


def _load(path):
    with open(path) as f:
        data = json.load(f)
    # report.json wraps analysis under 'results'; accept either shape
    return data.get("results", data), data.get("metadata", {})


def _set(results, section, key):
    v = results.get(section, {}).get(key, [])
    if isinstance(v, list):
        out = set()
        for item in v:
            if isinstance(item, str):
                out.add(item)
            elif isinstance(item, dict):
                out.add(item.get("url") or item.get("name") or json.dumps(item, sort_keys=True))
        return out
    return set()


def _delta(old_set, new_set):
    return {"added": sorted(new_set - old_set), "removed": sorted(old_set - new_set)}


def diff(old, new):
    out = {}

    old_score = old.get("risk", {}).get("score")
    new_score = new.get("risk", {}).get("score")
    out["risk"] = {
        "old": old_score, "new": new_score,
        "change": (new_score - old_score) if (isinstance(old_score, int) and isinstance(new_score, int)) else None,
    }

    out["permissions"] = _delta(_set(old, "basic_info", "permissions"),
                                _set(new, "basic_info", "permissions"))
    out["urls"] = _delta(_set(old, "network", "urls"), _set(new, "network", "urls"))
    out["domains"] = _delta(_set(old, "network", "domains"), _set(new, "network", "domains"))
    out["suspicious_urls"] = _delta(_set(old, "network", "suspicious_urls"),
                                    _set(new, "network", "suspicious_urls"))
    out["libraries"] = _delta(_set(old, "basic_info", "libraries"),
                              _set(new, "basic_info", "libraries"))

    # SDKs
    def sdk_names(r):
        return {s.get("sdk") for s in r.get("sdk_inventory", {}).get("sdks", [])}
    out["sdks"] = _delta(sdk_names(old), sdk_names(new))

    # Framework / RASP scalar changes
    out["framework"] = {
        "old": old.get("framework", {}).get("primary"),
        "new": new.get("framework", {}).get("primary"),
    }
    out["rasp"] = {
        "old": old.get("rasp", {}).get("detected", []),
        "new": new.get("rasp", {}).get("detected", []),
    }

    return out


def render(d, old_meta, new_meta):
    lines = []
    lines.append("# Anais Version Diff\n")
    lines.append(f"- Old: `{old_meta.get('apk_name', 'old')}`")
    lines.append(f"- New: `{new_meta.get('apk_name', 'new')}`\n")

    r = d["risk"]
    arrow = ""
    if isinstance(r["change"], int):
        arrow = " 🔺" if r["change"] > 0 else (" 🔻" if r["change"] < 0 else " ▪")
    lines.append(f"**Risk score:** {r['old']} → {r['new']}{arrow}\n")

    if d["framework"]["old"] != d["framework"]["new"]:
        lines.append(f"**Framework changed:** {d['framework']['old']} → {d['framework']['new']}\n")
    if d["rasp"]["old"] != d["rasp"]["new"]:
        lines.append(f"**RASP changed:** {d['rasp']['old']} → {d['rasp']['new']}\n")

    for title, key in [("Permissions", "permissions"), ("Network URLs", "urls"),
                       ("Domains", "domains"), ("Suspicious URLs", "suspicious_urls"),
                       ("Native libraries", "libraries"), ("SDKs", "sdks")]:
        added = d[key]["added"]
        removed = d[key]["removed"]
        if not added and not removed:
            continue
        lines.append(f"## {title}")
        for a in added:
            lines.append(f"- ➕ `{a}`")
        for rm in removed:
            lines.append(f"- ➖ `{rm}`")
        lines.append("")

    return "\n".join(lines)


def main():
    if len(sys.argv) < 3:
        print("Usage: diff_reports.py <old_report.json> <new_report.json> [output_json]")
        sys.exit(1)

    old, old_meta = _load(sys.argv[1])
    new, new_meta = _load(sys.argv[2])
    result = diff(old, new)

    if len(sys.argv) > 3:
        with open(sys.argv[3], "w") as f:
            json.dump({"old": old_meta, "new": new_meta, "diff": result}, f, indent=2)

    print(render(result, old_meta, new_meta))


if __name__ == "__main__":
    main()
