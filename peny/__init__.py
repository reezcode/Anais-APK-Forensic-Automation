"""Peny: mobile pentest / SAST suite for authorized Android apps.

Peny answers "is this app exploitable?" and reports against OWASP MASVS/MASTG.
It is the pentest half of Anais. Malware analysis lives in Reema; dynamic device
orchestration lives in Dyxon. See docs/peny/README.md.

Peny reuses Reema's static core over a one-way seam (docs/peny ADR 0001): it
imports the shared extraction primitives, never Reema's verdict/capability/
vaccine code, and Reema never imports Peny.
"""

__version__ = "0.2.0"
