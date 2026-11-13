"""Vaccine Pack harnesses.

A harness is a callable `run(ctx) -> dict` (ctx is dyxon.runner.HarnessContext).
It returns {status, detail, evidence?, severity?}. Real harnesses for real
capabilities are Reema content (backlog B14); only the neutral example ships here.

Harnesses must obey the ADR 0003 guardrails: act on the app under test only,
send nothing off-device, no persistence, no evasion, minimal action, report
pass/fail.
"""
