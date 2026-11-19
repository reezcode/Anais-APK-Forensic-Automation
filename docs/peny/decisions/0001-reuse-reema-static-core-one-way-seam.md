# 0001. Reuse Reema's static core over a one-way seam

- Status: Accepted
- Date: 2026-11-19

## Context

Peny (mobile pentest / SAST) and Reema (malware analysis / forensics) read the
same raw static facts about an Android app — weak crypto, hardcoded secrets,
exported components, manifest flags. Reema already implements the unpack, the
androguard code index, and a full set of standalone analyzers, and already
separates a `posture` axis (ADR 0002) that is exactly the pentest signal set.

Re-implementing that extraction in Peny would duplicate thousands of lines and
guarantee drift. But coupling the two modules risks one breaking the other: a
Reema refactor silently breaks Peny, or a Peny change forces churn in Reema.

The operator's constraint was explicit: reuse Reema, but the two pipelines must
not break each other.

## Decision

Peny reuses Reema's static core over a **one-way seam**.

- The dependency graph is `peny → shared static core ← reema`. **No cycle.**
- Peny imports the shared extraction layer (the standalone analyzers and
  `reema/index.py`) and reads Reema's `posture`-axis findings. It depends on a
  documented **contract** — the `Finding`/`Evidence` schema plus the
  raw-extraction JSON — not on Reema's private functions.
- Peny **never** imports `reema/verdict.py`, `reema/capabilities*`,
  `reema/vaccine.py`, or `reema/classify.py`. Reema **never** imports `peny/`.
- Peny has its own CLI (`python3 -m peny`), its own case directory, and its own
  report files (`peny.findings/v1`). It must **not** write Reema's
  `findings.json`, `verdict`, or `vaccine.json`.
- When an analyzer Peny needs is not cleanly callable (buried in `reema/apk.py`
  with side effects), it is **extracted into a shared module both import — never
  forked**.
- A contract test pins the seam, and both `test_reema*` and `test_peny*` suites
  gate any change to a shared module.

## Consequences

- No duplicated extraction logic; one place to fix a parser bug.
- Reema can refactor its internals freely as long as the contract holds; the
  contract test catches a breaking change before it reaches Peny.
- Two lenses stay independent and independently releasable.
- Cost: the seam must be kept thin and documented (`peny/_shared.py`), and some
  Reema internals may need a one-time extraction into shared modules. A shared
  callable under a contract test is the price of not copy-pasting.
- The same APK can be run through both tools; outputs live in separate case
  directories and never collide.
