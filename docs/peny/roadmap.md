# Peny Roadmap

Last updated: 2026-11-19.

| Phase | Scope | Status |
|---|---|---|
| P0 | Package skeleton, one-way seam to the shared static core, contract test | **Done** (2026-11-19) |
| P1 | Static lens: MASVS rule set, coverage matrix, `peny.findings/v1`, pentest report | **Done** (2026-11-19) |
| P2 | Dynamic confirm track: Dyxon lease, tier-0 Frida harnesses, tier-1 user script | **Done** (2026-11-19) |
| P3 | Business-logic track: proxied lease (Dyxon D-C1), traffic capture + replay/tamper helpers | **Done** (2026-11-19) |

Target design for every phase: [`design.md`](design.md).
Designed but unimplemented work, ready to pick up: [`backlog.md`](backlog.md).

## P0 — Foundation (done)

| Item | Result |
|---|---|
| `peny/` Python package | `peny/cli.py`, `peny/__main__.py`, `peny/__init__.py` (0.1.0); runs as `python3 -m peny` |
| One-way seam | `peny/_shared.py` re-exports Reema's `Evidence`, `normalize_severity`, `SEVERITIES` and names `FORBIDDEN_REEMA_MODULES`; Peny never imports Reema's verdict/capability/vaccine/classify, Reema never imports Peny |
| Finding schema | `peny.findings/v1` in `peny/findings.py`: `PenyFinding` over the shared `Evidence`, MASVS matrix builder; see [`finding-schema.md`](finding-schema.md) |
| Contract test | `tests/test_peny.py`, 11 tests: fresh-interpreter checks that importing `peny` pulls no Reema lens and importing `reema` pulls no `peny`; shared primitives are the same objects (not forks); schema + matrix shape |
| Non-breakage proof | Full suite 227 tests pass (216 prior + 11 Peny), Reema untouched |
| CLI | `peny --version`; `peny analyze` wired but exits `2` (honest not-implemented) until P1 |

**Verification on 2026-11-19:** `python3 -m unittest discover -s tests` → 227
passed, 1 skipped. `python3 -m peny --version` → `peny 0.1.0`.

## P1 — Static lens (done)

| Item | Result |
|---|---|
| Extraction reuse | `peny/_shared.py` drives `reema.apk.run` (unpack + analyzers) and `reema.adapters.collect` (normalized findings) — lazy-imported, seam-safe |
| MASVS rule set | `peny/rules/masvs_map.py`: data-driven `(source, category) → MapRule` table (MASVS, CWE, MASTG, severity override, impact, fix, needs_runtime). Covers crypto, secrets, network, WebView, IPC/platform, storage, logging, manifest, signing, RASP. Malware IOCs / neutral context skipped |
| Coverage matrix | `peny/masvs.py`: `pass`/`fail`/`needs_runtime`/`not_checked` per control; a runtime-flagged group reads `needs_runtime` until confirmed; `STATIC_COVERAGE` separates statically-assessed groups from dynamic-only (AUTH) |
| Schema | `peny.findings/v1` document + matrix (`peny/findings.py`) |
| Report | `peny/report.py`: `report.md` (summary + matrix + findings by MASVS, each with impact/fix/evidence) and `masvs.md` |
| Case | `peny/case.py`: own case dir + `case.json` (`peny.case/v1`), authorization note, hashes, tool versions. Never writes a Reema report file |
| CLI | `peny analyze <apk> [--authorized-by --scope --offline --case-dir]` |
| Tests | `tests/test_peny_p1.py`, 11 tests (mapping, skip, matrix coverage, hermetic end-to-end scan with patched extraction) |

**Verification on 2026-11-19:** full suite **238 pass**, 1 skipped (227 prior +
11 P1). Hermetic scan asserts Peny writes `peny_findings.json`/`masvs.md`/
`report.md` and **no** `findings.json`.

## P2 — Dynamic confirm (done)

| Item | Result |
|---|---|
| Confirm engine | `peny/dynamic.py`: `confirm()` runs a tier-0 harness per pending source (once each), reads its `send()` messages, and flips `runtime_status` to `confirmed`/`refuted`; no decisive signal or a runner error honestly leaves it `pending` |
| Injectable runner | `FridaRunner` interface + `FridaBindingRunner` (real, over the `frida` Python binding) — so the confirm logic is unit-tested with a fake, the way Dyxon tests its shell Runner |
| Tier-0 harnesses | `peny/harnesses/`: `crypto_hooks.js` (weak cipher/hash), `ssl_pinning_bypass.js` (permissive TrustManager / OkHttp pinner), `root_detection_bypass.js`, `storage_dump.js` (plaintext prefs). Each emits `{check, confirmed, detail, evidence}` |
| Harness map | `HARNESS_MAP` keys Peny source → (script, check): crypto/network/storage/resilience. Sources without a tier-0 harness stay `pending` (manual / tier-1) |
| Tier-1 | `--user-script` runs an operator `.js` as-is; its messages are recorded as an observation, not auto-flipped |
| Lease reuse | `lease_and_confirm()` leases via `dyxon.provider.DyxonProvider` (lazy import; Peny does not hard-depend on Dyxon), then runs the pass on the serial |
| Outputs | Rewrites `peny_findings.json` + matrix + `report.md`; writes `reports/peny_dynamic.json` (`peny.dynamic/v1`: session + observations) |
| CLI | `peny confirm <case-dir> [--package --backend --user-script]` |
| Tests | `tests/test_peny_p2.py`, 4 tests (flip + matrix update + runtime evidence, runner-error stays pending, user-script observation, from_dict id round-trip) |

**Verification on 2026-11-19:** full suite **242 pass**, 1 skipped (238 prior +
4 P2). Seam still clean with `peny.dynamic` imported (Dyxon imported only inside
`lease_and_confirm`).

## P3 — Business logic (done)

Dyxon **D-C1** (controlled-proxy lease) shipped first (`acquire_device(
network="proxy")`); Peny is its first consumer.

| Item | Result |
|---|---|
| Traffic model | `peny/traffic.py`: tool-agnostic `Flow` + `load_flows` (HAR reader — the format every proxy exports) |
| Passive analyzers | `peny/businesslogic.py`: `inspect_jwts` (alg=none → MASVS-AUTH critical, missing `exp` → medium), `cleartext_secrets` (secret on http:// → MASVS-NETWORK) |
| Active replay | Injectable `ReplaySender` (`HttpReplaySender` real; fake in tests): `active_checks` (missing-auth — strip Authorization, still 2xx; IDOR — step a path id, different 2xx body) and `rate_limit_check` (no 429 over N replays). Only runs with `--active` |
| Coverage | P3 fills MASVS-AUTH (+ NETWORK/PLATFORM) the static lens left `not_checked` |
| Merge | `run_business_logic` merges P3 findings into the case (merge, not replace), rewrites reports, writes `reports/peny_traffic.json` (`peny.traffic/v1`) |
| CLI | `peny businesslogic <case-dir> --flows <har> [--active] [--proxy host:port]` |
| Tests | `tests/test_peny_p3.py`, 11 tests (HAR load, JWT/cleartext, missing-auth/IDOR/rate-limit, case merge) |

Scope: Peny captures and assists; it does not claim full automated exploitation.
Active replay only ever targets the authorized backend under test.

**Verification on 2026-11-19:** full suite **261 pass**, 1 skipped (250 prior +
11 P3). Seam clean with `peny.businesslogic` imported.

## Out of scope (for now)

- iOS. Reema has IPA intake; the seam extends there later, same lens pattern.
- Fully automated business-logic exploitation. Peny captures and assists.
