"""`peny` command line.

`analyze` runs the static pentest lens (P1): it reuses Reema's static core for
extraction, re-lenses the findings to OWASP MASVS/MASTG, and writes a pentest
report + coverage matrix into Peny's own case directory. See docs/peny/design.md.
"""

import argparse
import sys

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

    return parser


def main(argv=None):
    parser = build_parser()
    args = parser.parse_args(argv)
    if not getattr(args, "command", None):
        parser.print_help(sys.stderr)
        return 1
    return args.func(args)
