"""Dyxon: an on-demand Android sandbox broker for dynamic analysis.

Dyxon is the dynamic half of Anais. It provisions a ready, rooted Android
device, leases it to a caller, resets it to a clean snapshot between jobs, and
tears it down. Callers (REA, the Aegis module, the Reema Vaccine Pack runner)
run their own analysis on a leased device; Dyxon never analyses.

See docs/dyxon/README.md and docs/dyxon/design.md.

This is phase D0: the package skeleton, the AVD backend driver, the provisioner
and the preflight check. The pool, the session broker and the MCP server arrive
in D1-D2 (see docs/dyxon/roadmap.md).
"""

__version__ = "0.1.0"
