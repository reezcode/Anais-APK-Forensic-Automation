# Peny Backlog

Designed but not implemented, ready to pick up. Items are referenced by id from
the roadmap and ADRs.

## Static lens

- **PE-S1 — MASVS rule set.** Author `peny/rules/` covering methodology §1:
  manifest, secrets, crypto, storage, platform/IPC, WebView, native. Each rule:
  fact matcher → MASVS control + MASTG id + CWE + severity + fix.
- **PE-S2 — Shared-core extraction extraction.** If an analyzer needed by Peny is
  buried in `reema/apk.py` and not cleanly callable, extract it into a shared
  module both import (do not fork). Guard with the contract test.
- **PE-S3 — Coverage matrix.** `peny/masvs.py`: every control group →
  pass/fail/needs_runtime/not_applicable/not_checked.
- **PE-S4 — Pentest-specific rules not in Reema's posture set.** FileProvider path
  config, `PendingIntent` mutability, WebView bridge + file-access flags,
  Zip-Slip, tapjacking, deep-link auth bypass, `taskAffinity`/`launchMode`
  hijack.

## Dynamic confirm

- **PE-D1 — Tier-0 Frida harnesses.** SSL-pinning bypass, Cipher/SecretKeySpec/
  PBEKeySpec/SecureRandom hooks, root-detection bypass, Log/clipboard hooks,
  shared_prefs/DB dump. Driven through REA on a Dyxon serial.
- **PE-D2 — Tier-1 user script loader.** Load an operator-supplied `.js` through
  REA `load_frida_script`; attach its output to the relevant finding.
- **PE-D3 — Runtime status merge.** Flip `runtime_status`
  (`pending`→`confirmed`/`refuted`) on `needs_runtime_confirmation` findings and
  re-render the report + matrix.

## Business logic (Track 2)

- **PE-B1 — Proxied lease profile (depends on Dyxon D-C1).** CA installed, device
  proxy set, egress only to the operator's Burp/mitmproxy. Peny is the first
  consumer of Dyxon's controlled-network sink; log the dependency in Dyxon's
  backlog.
- **PE-B2 — Traffic capture.** Structure the proxied session into a request log
  tied to the app flow.
- **PE-B3 — Replay/tamper helpers.** Price/quantity/IDOR tampering, JWT
  `alg=none`/weak-secret/missing-`exp`, session reuse after logout, rate-limit
  probing. Assists; not full auto-exploitation.

## Platform

- **PE-P1 — Aegis module.** A `peny` module in Aegis mirroring `modules/anais`
  (static) + the `dyxon` module (dynamic). Surfaces `peny_findings.json` and the
  MASVS matrix. Design-of-record stays here.
- **PE-P2 — `peny-agent` skill.** Router `anais-agent` gains a third route
  (static-forensics → reema, device → dyxon, **pentest → peny**).

## Deferred

- **PE-X1 — iOS.** Extend the lens over Reema's IPA intake; Android first.
