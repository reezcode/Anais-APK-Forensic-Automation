"""Neutral example harness, to demonstrate the harness contract.

It performs the smallest possible real check: confirm the app under test is
installed on the device. It touches nothing but the app under test, sends
nothing off-device, and takes no destructive action — the ADR 0003 guardrails.

Reference it from a Vaccine Pack entry with:

    defense:
      harness:
        module: "dyxon.harnesses.example:run"

Real harnesses that exercise a specific capability are Reema content (B14).
"""

from __future__ import annotations


def run(ctx) -> dict:
    r = ctx.adb("shell", "pm", "path", ctx.package)
    installed = r.ok and "package:" in (r.stdout or "")
    return {
        "status": "pass" if installed else "fail",
        "detail": f"app under test {ctx.package} installed={installed}",
        "evidence": [r.stdout.strip()[:120]] if installed else [],
    }
