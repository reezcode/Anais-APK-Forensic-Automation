"""`peny` command line.

`analyze` runs the static pentest lens (P1): it reuses Reema's static core for
extraction, re-lenses the findings to OWASP MASVS/MASTG, and writes a pentest
report + coverage matrix into Peny's own case directory. See docs/peny/design.md.
"""

import argparse
import sys
from pathlib import Path

from peny import __version__


def _cmd_analyze(args):
    from peny.scan import scan

    try:
        doc, cdir = scan(
            args.target,
            case_dir=args.case_dir,
            authorized_by=args.authorized_by,
            scope=args.scope,
            offline=args.offline,
        )
    except FileNotFoundError as exc:
        print(f"peny analyze: no such file: {exc}", file=sys.stderr)
        return 2

    s = doc["summary"]
    print(f"peny: {s['total']} findings "
          f"(critical {s['by_severity']['critical']}, high {s['by_severity']['high']}, "
          f"medium {s['by_severity']['medium']}, low {s['by_severity']['low']}), "
          f"{s['needs_runtime']} need runtime -> {cdir}/reports/peny_findings.json")
    return 0


def _cmd_confirm(args):
    from peny.dynamic import lease_and_confirm

    case_dir = Path(args.case_dir)
    if not (case_dir / "reports" / "peny_findings.json").is_file():
        print(f"peny confirm: no peny_findings.json under {case_dir}; run `peny analyze` first.",
              file=sys.stderr)
        return 2
    try:
        summary = lease_and_confirm(case_dir, package=args.package, backend=args.backend,
                                    user_script=args.user_script)
    except Exception as exc:  # device/lease/dyxon failure -> clean message, not a traceback
        print(f"peny confirm: dynamic pass failed: {exc}", file=sys.stderr)
        return 1
    print(f"peny: confirmed {summary['confirmed']}, {summary['needs_runtime']} still pending "
          f"({summary['observations']} harness run(s)) -> {case_dir}/reports/peny_findings.json")
    return 0


def _cmd_businesslogic(args):
    from peny.businesslogic import HttpReplaySender, run_business_logic
    from peny.traffic import load_flows

    case_dir = Path(args.case_dir)
    if not (case_dir / "reports" / "peny_findings.json").is_file():
        print(f"peny businesslogic: no peny_findings.json under {case_dir}; run `peny analyze` first.",
              file=sys.stderr)
        return 2
    flows = load_flows(args.flows)
    if not flows:
        print(f"peny businesslogic: no flows loaded from {args.flows} (expects a HAR export).",
              file=sys.stderr)
        return 2
    sender = HttpReplaySender(proxy=args.proxy) if args.active else None
    summary = run_business_logic(case_dir, flows, sender=sender, active=args.active)
    print(f"peny: {summary['flows']} flows, {summary['added']} business-logic finding(s) "
          f"(active={summary['active']}) -> {case_dir}/reports/peny_findings.json")
    return 0


def build_parser():
    parser = argparse.ArgumentParser(
        prog="peny",
        description="Mobile pentest / SAST suite for authorized Android apps (OWASP MASVS/MASTG).",
    )
    parser.add_argument("--version", action="version", version=f"peny {__version__}")
    sub = parser.add_subparsers(dest="command")

    p_analyze = sub.add_parser("analyze", help="Static pentest scan of an authorized Android app")
    p_analyze.add_argument("target", help="Path to the app (.apk/.xapk/.apkm/.apks/.aab)")
    p_analyze.add_argument("--authorized-by", default="", help="Who authorized the assessment (recorded in case.json)")
    p_analyze.add_argument("--scope", default="", help="Assessment scope/window note (recorded in case.json)")
    p_analyze.add_argument("--case-dir", default=None, help="Write into DIR instead of a new case directory")
    p_analyze.add_argument("--offline", action="store_true", help="Send nothing online during extraction")
    p_analyze.set_defaults(func=_cmd_analyze)

    p_confirm = sub.add_parser(
        "confirm", help="Confirm a case's runtime-flagged findings on a Dyxon-leased device")
    p_confirm.add_argument("case_dir", help="A Peny case directory from `peny analyze`")
    p_confirm.add_argument("--package", default=None, help="Override the app package to run (default: case's)")
    p_confirm.add_argument("--backend", default=None, help="Dyxon backend to lease (default: pool default)")
    p_confirm.add_argument("--user-script", default=None, help="Tier-1 Frida .js to run as-is (recorded as an observation)")
    p_confirm.set_defaults(func=_cmd_confirm)

    p_biz = sub.add_parser(
        "businesslogic", help="Assess captured traffic (JWT/auth/IDOR) from a proxied lease")
    p_biz.add_argument("case_dir", help="A Peny case directory from `peny analyze`")
    p_biz.add_argument("--flows", required=True, help="HAR export from the proxied session (Burp/mitmproxy)")
    p_biz.add_argument("--active", action="store_true",
                       help="Send tampered replays (missing-auth/IDOR/rate-limit) — live requests to the backend")
    p_biz.add_argument("--proxy", default=None, help="Send replays through this proxy (host:port)")
    p_biz.set_defaults(func=_cmd_businesslogic)

    return parser


def main(argv=None):
    parser = build_parser()
    args = parser.parse_args(argv)
    if not getattr(args, "command", None):
        parser.print_help(sys.stderr)
        return 1
    return args.func(args)
