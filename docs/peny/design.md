# Peny Design

Target architecture. Status lives in [`roadmap.md`](roadmap.md); this document
describes the end state.

## Goal

Given an Android app the operator is authorized to assess, produce a pentest
report mapped to OWASP MASVS/MASTG: per control, pass/fail, severity, evidence,
repro, and a developer-facing fix. Static findings that need runtime proof are
confirmed on a leased device; business-logic weaknesses are found through a
proxied session.

## The one-way seam (the core constraint)

Peny reuses Reema's static core but must never break Reema, and Reema must never
break Peny. The rule is a **single direction of dependency**:

```
            ┌─ shared static core ─┐
  APK ─────►│ unpack + index +     │──► raw facts
            │ raw analyzers        │
            └──────────┬───────────┘
                       │  Finding/Evidence schema (the contract)
            ┌──────────┴───────────┐
       Reema lens              Peny lens
```

- Peny imports the **shared extraction layer** and reads the **`posture`-axis
  findings** Reema already emits. It imports a documented *contract*, not Reema's
  private functions.
- Peny **never** imports `reema/verdict.py`, `reema/capabilities*`,
  `reema/vaccine.py`, `reema/classify.py`. Reema **never** imports `peny/`.
- No import cycle. The dependency graph is `peny → shared core ← reema`.

### Why this does not break either side

1. **Depend on the contract, not internals.** The seam is the Finding/Evidence
   schema plus the raw-extraction JSON. Reema can refactor its internals freely
   as long as the contract holds.
2. **Separate outputs, no file collision.** Peny has its own CLI
   (`python3 -m peny`), its own case directory, and its own report files
   (`peny.findings/v1`). Peny must **not** write Reema's `findings.json`,
   `verdict`, or `vaccine.json`. The same APK analysed by both produces two case
   directories and zero overwrite.
3. **A contract test pins the seam.** A test asserts the shape of the shared
   layer's output. A Reema refactor that changes that shape fails the test loudly
   before it can silently break Peny.
4. **Both suites gate shared-core edits.** `tests/test_reema*.py` staying green is
   the proof that Peny's reuse did not break Reema. `tests/test_peny*.py` is added
   alongside. Any change to a shared module runs both.

### Shared extraction layer

Reema's static analyzers are already standalone and emit raw facts:
`analysis_tools/manifest_analyzer.py`, `sast_scanner.py`, `network_analyzer.py`,
`sdk_inventory.py`, `signing_analyzer.py`, `so_string_analyzer.py`,
`entropy_analyzer.py`, `detect_obfuscation.py`, `detect_rasp.py`, plus
`reema/index.py` (androguard → SQLite code index) and `reema/findings.py` (the
`Finding`/`Evidence` schema).

Where a needed analyzer is cleanly callable today, Peny calls it. Where one is
buried inside `reema/apk.py` and not importable without side effects, the fix is
**extract it into a shared module both import — never fork it**. A copy-paste
drifts; a shared callable guarded by a contract test does not.

Reema's **`posture` axis** (ADR 0002: hardcoded keys, weak crypto, `allowBackup`,
exported components) is already the pentest signal set. Peny consumes those
findings and re-reads them through an exploitability/MASVS lens, then adds
pentest-specific rules the malware lens has no reason to carry (FileProvider path
config, `PendingIntent` mutability, WebView bridge flags, Zip-Slip, tapjacking,
deep-link auth bypass).

## Static lens (`peny/scan.py` + `peny/rules/`)

1. Run the shared extraction layer over the APK (reuse Reema's unpack + index).
2. Collect raw facts + Reema `posture` findings.
3. Apply Peny's MASVS rule set: map each fact to a MASVS control, assign
   exploitability severity, attach a CWE and a fix, and flag whether it
   `needs_runtime_confirmation`.
4. Emit `peny.findings/v1` and a **MASVS coverage matrix** (every control →
   pass / fail / not-applicable / needs-runtime).

The methodology in [`methodology.md`](methodology.md) §1 is the checklist the
rule set implements. §3–4 is the matrix shape.

## Dynamic tracks (device leased from Dyxon)

Peny leases a device from Dyxon and drives on-device work through REA
(`load_frida_script`, `instrument_with_frida`, `observe_native_calls`,
`read_adb_logcat`). It does not re-implement the device layer.

### Track 1 — confirm (air-gapped)

Flips static `needs_runtime_confirmation` findings to pass/fail. Built-in Frida
harnesses in `peny/harnesses/` (tier 0):

- universal SSL-pinning bypass (confirm §1.3 pinning finding)
- `Cipher`/`SecretKeySpec`/`PBEKeySpec`/`SecureRandom` hooks (confirm weak
  algo / hardcoded key / IV reuse at runtime)
- root/debug/Frida-detection bypass
- `Log`/clipboard hooks; `shared_prefs`/DB dump after a flow

A **tier-1** user-supplied `.js` path is loaded through REA for targeted deeper
testing. Peny does not reimplement Frida; it supplies and selects scripts.

Runs today on a stock Dyxon lease (`network = false`).

### Track 2 — business logic (proxied)

Methodology §2.7. Needs a **controlled-proxy lease profile** from Dyxon: CA
installed, device proxy set, egress only to the operator's Burp/mitmproxy, no
other network. This is Dyxon backlog **D-C1**; Peny is its first consumer, logged
as a cross-module dependency.

On that lease, Peny captures traffic and provides replay/tamper helpers:
price/quantity/IDOR tampering, JWT `alg=none` / weak-secret / missing-`exp`,
session reuse after logout, rate-limit probing. Fully automated business-logic
exploitation is out of scope; Peny captures, structures, and assists.

## Authorization

Pentest requires authorization the malware path does not assume. A Peny case
records an authorization/scope note (target package, who authorized, window).
Track 2 only ever targets a disposable, isolated, authorized emulator reached
through the operator's own proxy — never a personal device or a trusted network.

## Case directory

Mirrors Reema's layout but under Peny's own root, never overwriting a Reema case.

| Path | Content |
|---|---|
| `case.json` | Inputs with hashes, authorization note, tool versions, stage events |
| `reports/peny_findings.json` | `peny.findings/v1`: findings + MASVS matrix |
| `reports/masvs.json`, `masvs.md` | Coverage matrix, machine + human |
| `reports/report.md`, `report.json` | Pentest report |
| `temp/` | Shared code index, extraction JSON, dynamic captures |

## Code layout (target)

| Path | Role |
|---|---|
| `peny/cli.py` | `peny` command line |
| `peny/scan.py` | Static lens: extraction → MASVS rules → findings |
| `peny/rules/` | MASVS rule set (fact → control, severity, CWE, fix) |
| `peny/masvs.py` | Coverage matrix builder |
| `peny/findings.py` | `peny.findings/v1` (reuses Reema `Finding`/`Evidence`) |
| `peny/flutter.py` | Flutter (Dart AOT) track: blutter recovers `libapp.so`, then secret/URL/crypto checks over the Dart strings |
| `peny/secrets.py` | Extracted-secrets inventory (API keys/tokens/creds lifted from findings) |
| `peny/dynamic.py` | Dyxon lease + REA driver for both tracks |
| `peny/harnesses/` | Tier-0 Frida scripts; tier-1 user-script loader |
| `peny/report.py` | Report + MASVS matrix render |
| `peny/_shared.py` | The one-way seam: thin, documented bridge to the shared static core |

## SAST precision (shared scanner)

The static findings come from `analysis_tools/sast_scanner.py`, shared with Reema.
Its rules were tightened so Peny's results represent real issues, not keyword
hits:

- **Code vs. literals.** Comments are blanked (jadx writes `/* ... */` headers
  everywhere); for API-call rules (logging, storage, intent, WebView, network)
  string *bodies* are also blanked, so a pattern word inside a message string is
  not a finding. Secret/key/algorithm rules keep their literals. Import/`package`
  lines are skipped for structural rules.
- **Context gates.** `logging_sensitive_data` fires only when the statement also
  names sensitive data (`SENSITIVE_RE`: password/token/pin/...); bare
  `getSharedPreferences(...)` needs a world-readable mode or a sensitive key.
- **MASTG-aligned matchers.** `insecure_crypto` needs a quoted algorithm
  (`"DES/ECB/..."`, `"MD5"`) or `new Random(`/`Cipher.getInstance("AES")`, not a
  substring; `intent_vulnerabilities` flags mutable/implicit `PendingIntent` and
  `registerReceiver`, not plain `startActivity`; `remote_code_execution` flags
  the `DexClassLoader` family and `Runtime.getRuntime().exec`, not bare
  `loadClass`/`.dex`; native `.so` scanning flags anti-analysis/key markers, not
  `http`/`socket`/`exec` (present in every binary).

On a real Flutter banking app this cut the Peny-mapped SAST findings from ~162 to
~14 with no loss of true positives (measured, regression-tested in
`tests/test_reema_p1.py`).

## Flutter (Dart AOT) track

A Flutter app's logic lives in `lib/<abi>/libapp.so` as a Dart AOT snapshot that
jadx cannot read, so Java-layer SAST alone understates it. With
`peny analyze --flutter`, `peny/flutter.py` runs **blutter** on the
libapp.so/libflutter.so pair to recover the Dart objects (`pp.txt`/`objs.txt`
string pool), then runs the secret/URL/crypto checks over the recovered strings
(source `flutter`, feeding the same secrets inventory and MASVS matrix). The
track is opt-in because blutter builds a native tool and disassembles the whole
snapshot; it runs through an injectable runner, so it is tested without blutter.

Two analyzers run over blutter's output. `scan_dart_strings` is value-level
(secrets, cleartext URLs, weak-crypto names, TLS-bypass hooks over the string
pool). `analyze_dart_apis` is code-level: it enumerates the native platform
channels / plugins the Dart code wires to (MethodChannel and pigeon identifiers,
which survive obfuscation) and maps each to its MASVS attack-surface finding --
WebView, deep links, biometric gate, sensitive-capability plugins, secure vs.
plaintext storage, and app-custom channels (reviewed first). MIME types and
framework-internal `flutter/*` channels are excluded; pigeon channels collapse to
one finding per plugin.
When an app is Flutter but the track is not run, one info finding records that
the Dart code was not analyzed, so an empty Java layer is never mistaken for a
clean app.
