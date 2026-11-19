# Peny

Peny is the **mobile pentest / SAST suite** of Anais. It takes an Android app
you are **authorized to assess** and answers one question for a pentester or an
app-security engineer:

> Where is this app weak, and how does an attacker exploit it?

Output is a vulnerability report mapped to **OWASP MASVS / MASTG**: per control,
pass or fail, severity, evidence (`file:line` or runtime log), repro steps, and a
fix for the developer. Not a malware verdict — that is [Reema](../reema/README.md).

## Peny is not Reema

Peny and Reema read the same raw static facts (weak crypto, hardcoded secrets,
exported components, manifest flags) but through opposite lenses. The lens is the
whole point.

| | [Reema](../reema/README.md) | Peny |
|---|---|---|
| Target | someone else's app, assumed hostile | your / a client's app, **authorized** |
| Attacker | the app author | a third party attacking the app |
| Defender | the device / user | the app author |
| Question | "is it malware?" | "is it exploitable?" |
| Output | verdict, family, Vaccine Pack | MASVS matrix, severity, repro, fix |

The same fact (`Cipher.getInstance("AES/ECB")`) means different things to each:
Reema asks whether it signals malice; Peny asks whether an attacker can use it.
They stay separate modules over shared plumbing. See
[ADR 0001](decisions/0001-reuse-reema-static-core-one-way-seam.md).

## How it is built

Peny reuses Reema's static core — it does **not** re-implement the unpack, the
code index, or the raw analyzers. A one-way seam keeps the two from breaking each
other: Peny consumes the shared extraction layer and Reema's `posture`-axis
facts; it never imports Reema's verdict / capability / Vaccine code, and Reema
never imports Peny.

```
            ┌─ shared static core ─┐
  APK ─────►│ unpack + index +     │──► raw facts (manifest, secrets,
            │ raw analyzers        │     crypto, net, SDK, .so strings)
            └──────────┬───────────┘
                       │ Finding/Evidence schema — the contract
            ┌──────────┴───────────┐
       Reema lens              Peny lens
    "is it malware?"       "is it exploitable?"
    verdict / vaccine      MASVS matrix / fix
```

Dynamic analysis runs on a device **leased from [Dyxon](../dyxon/README.md)** —
Peny owns no devices, same as Aegis and REA. Two sub-phases:

- **Confirm (air-gapped):** built-in Frida flips static
  `needs_runtime_confirmation` findings to pass/fail (SSL-pinning bypass, crypto
  hooks, root-detection bypass, storage dump).
- **Business logic (proxied):** CA + proxy on the leased device, traffic captured
  through Burp/mitmproxy, replay/tamper helpers (price/IDOR, JWT `alg=none`).
  Depends on a Dyxon controlled-proxy lease profile (Dyxon backlog **D-C1**).

## Reading order

1. [`methodology.md`](methodology.md) — the full-surface Android pentest method; the source of record for what Peny checks.
2. [`design.md`](design.md) — target architecture: the one-way seam, the static lens, the dynamic tracks.
3. [`roadmap.md`](roadmap.md) — phases P0–P3, status.
4. [`finding-schema.md`](finding-schema.md) — `peny.findings/v1`, the data contract Peny emits.
5. [`decisions/`](decisions/README.md) — why the design is the way it is.
6. [`backlog.md`](backlog.md) — designed but not implemented, ready to pick up.

## Scope

Android first (`.apk/.xapk/.apkm/.apks/.aab`). iOS is deferred; Reema already has
IPA intake, so the seam extends there later with no change to the lens pattern.

## Status

See [`roadmap.md`](roadmap.md). Peny is in P0 (shared-core seam + package
skeleton).
