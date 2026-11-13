# Reema Design

Status: **target design**. What exists today is tracked in
[`roadmap.md`](roadmap.md). The reasons behind each choice are in
[`decisions/`](decisions/README.md).

## 1. Goals

| # | Goal | Measured by |
|---|---|---|
| G1 | Fast, defensible triage for SOC/IR analysts | Verdict, family and top capabilities on page 1 of the report, each backed by evidence |
| G2 | Capability extraction tied to code | Every capability cites the files, classes and API call sites that support it |
| G3 | Turn each capability into a defense ("vaccine") | A Vaccine Pack entry per capability, with a pass/fail check that runs against any app under test |
| G4 | Forensic traceability | A case record with hashes, tool versions and UTC timestamps; finding ids that stay the same across runs |
| G5 | Low false positives | A benign/malware test corpus gates every rule change |

**Non-goals:**
- Executing samples. That belongs to [Dyxon](../dyxon/README.md).
- iOS IPA support. It is planned for P4.

## 2. Users

| User | Need |
|---|---|
| SOC/IR analyst (primary) | Triage a sample quickly and defend the verdict with evidence. |
| App security engineer (secondary) | Use the Vaccine Pack to verify that any app under test resists the capabilities seen in real samples. |

## 3. Pipeline

```
 sample (.apk/.xapk/.apkm/.apks/.aab, .jar)
   │
   ▼
 1. Intake ─────────── case.json: case id, analyst, UTC times, tool versions,
   │                    hashes, fuzzy hashes, signing certificate fingerprint
   ▼
 2. Enrichment ─────── online reputation and family labels (hash and IOC lookups)
   ▼
 3. Code index ─────── one parse of the DEX code shared by every rule
   ▼
 4. Analyzers ──────── emit Findings (finding-schema.md)
   ▼
 5. Capability engine  signals → capabilities → behaviour chains → ATT&CK for Mobile
   ▼
 6. Verdict ────────── malicious / suspicious / PUA / clean, family, confidence;
   │                    posture score kept separate (ADR 0002)
   ▼
 7. Outputs ────────── triage report, findings.json, IOC export, Vaccine Pack
```

### 3.1 Intake

- Accepts `.apk`, `.xapk`, `.apkm`, `.apks`, `.aab` and `.jar`.
- A JAR has no manifest or resources. For a JAR, intake skips apktool, and only class-based checks apply.
- Intake hashes the original input and the resolved base APK.
- Each derived artifact gets its own hash in `case.json`: decompiled trees, extracted payloads and reports. This record is the chain of custody.
- An embedded payload, such as a DEX hidden in an asset, is analyzed as a child sample under the same case.

`case.json` fields:

| Field | Content |
|---|---|
| `case_id` | Unique id for the case |
| `analyst` | Who ran the analysis |
| `created_at` | UTC timestamp |
| `inputs[]` | Each input: path, size, md5, sha1, sha256, TLSH |
| `artifacts[]` | Each derived file: path, sha256, producer, created time |
| `tools` | Name and version of every tool used (apktool, jadx, yara, androguard, Reema) |
| `enrichment` | Providers queried, query time, cache hits |

### 3.2 Enrichment

Policy: [ADR 0004](decisions/0004-online-enrichment-hash-only-default.md).

**Data sent:**
- By default only hashes and extracted IOCs leave the machine.
- The sample itself is uploaded only with `--upload`.
- `--offline` turns enrichment off for a case. A hash alone can reveal that a private app exists.

**Providers:** malware hash repositories, multi-engine scanners, and IOC feeds.

**Keys:** API keys are read from env vars named `REEMA_<PROVIDER>_API_KEY`. They are never stored in the repo or in case output.

**Cache:** responses go into a local SQLite cache with a TTL. A repeat run then works offline and stays inside rate limits.

**Normalization:** family labels from several engines are reduced to one family name with a confidence value.

### 3.3 Code index

Today each legacy analyzer regex-scans the jadx output on its own. That is slow, and it causes the noise in known issue K1 ([roadmap](roadmap.md#known-issues)). The code index fixes both: it is built once, and every rule queries it.

The index holds:
- Classes, methods, strings and manifest components.
- API call sites: caller method, callee signature, file and line.
- **Code owner:** each class is tagged `app` or `sdk:<name>`, using `sdk_inventory`.
- **Reachability:** whether a manifest entry point can reach the class (0.3.0, backlog B1). Static and best-effort: reflection, native code and runtime-loaded code are not followed.

Two rules use the owner and reachability tags:
- A signal found only in SDK code, or in code no entry point reaches, is downgraded to `low` confidence.
- A signal in reachable app code keeps its confidence.

### 3.4 Capability engine

The engine is data driven, so an analyst can add a capability without changing code.

**Rule files:** one YAML file per capability, in `reema/capabilities/`.

Each rule has these fields:

| Field | Content |
|---|---|
| `id` | Stable id, e.g. `a11y_control` |
| `title` | Short name of the capability |
| `attck` | ATT&CK for Mobile technique IDs |
| `requires` | Conditions that must all hold. A condition can be a manifest declaration, a resource configuration, or a set of APIs. |
| `any_of` | Supporting signals; at least one must be present |
| `extract` | Data to pull out as forensic evidence, e.g. lists of targeted packages or configuration values |
| `confidence` | How owner and reachability raise or lower confidence |
| `defense` | Id of the defense entry in the Vaccine Pack (section 3.6) |

**Behaviour chains** combine capabilities into a profile. Example: remote control plus credential theft plus anti-removal reads as a banking trojan profile. The verdict uses chains, not single signals.

**Output:** each matched capability is a `Finding` with:
- `axis: malice`
- `attck` IDs
- the call sites as `evidence`
- the extracted data

**Starter taxonomy (P2):** about 20 capability families, grouped as:
- device control
- credential and OTP theft
- data collection
- telephony abuse
- code loading and droppers
- C2 channels
- persistence
- anti-analysis

### 3.5 Verdict

- **Inputs:**
  - capability findings
  - behaviour chains
  - enrichment family labels
  - YARA family rules
- **Output:** a `verdict` block in `findings.json` with these fields:
  - `label`: `malicious`, `suspicious`, `pua` or `clean`
  - `family`
  - `confidence`
  - `reasons[]`: each entry points to a finding id
- **Posture:** a separate score, shown under its own heading in the report. A badly built benign app must not look like malware.

### 3.6 Vaccine Pack

Scope and limits: [ADR 0003](decisions/0003-vaccine-pack-scope.md).

For each capability the engine finds, Reema writes an entry in `reports/vaccine/`. Each entry has four parts:

| Part | Content |
|---|---|
| **Profile** | The capability, its ATT&CK IDs, the preconditions it needs (for example a permission the user must grant), and the evidence from this sample |
| **Defense** | Code-level controls that an app under test should implement, with the Android APIs involved and the minimum API level for each |
| **Check** | A pass/fail check against an app under test. Each check says how to run it (manual steps now; Dyxon automates it later) and the expected result. |
| **Harness** | An optional harness that runs the check on a test device. It follows the limits in ADR 0003. |

**Generic by design.** The harness and check take the package name of the app under test as a parameter. They work against any app the engineer chooses to test.

**Defense examples** (the defense catalog lives in `reema/defenses/`):

| Capability family | Example defenses in the app under test |
|---|---|
| Accessibility misuse | `View.setAccessibilityDataSensitive()` (API 34) on sensitive views; check enabled services through `AccessibilityManager` and `AccessibilityServiceInfo.isAccessibilityTool()` |
| Overlay and tapjacking | `View.setFilterTouchesWhenObscured(true)`; reject events with `MotionEvent.FLAG_WINDOW_IS_PARTIALLY_OBSCURED`; `Window.setHideOverlayWindows(true)` (API 31) |
| Screen capture | `WindowManager.LayoutParams.FLAG_SECURE` on sensitive screens |
| OTP interception | Prefer app-bound or push-based verification; use the SMS Retriever API instead of reading the inbox |
| Repackaging and tampering | Signature and integrity checks; Play Integrity API verdicts checked on the server |

**Flow into other modules:**
- Dyxon runs the checks automatically on a device.
- Aegis tracks which apps pass which checks.

### 3.7 Outputs

| File | Content |
|---|---|
| `reports/findings.json` | All findings (`reema.findings/v1`), plus the verdict from P2 |
| `reports/report.md` | Triage report. The verdict and capabilities come first; posture comes after. |
| `reports/iocs.{json,csv}` | IOCs. STIX 2.1 and MISP exports arrive in P3. |
| `reports/vaccine/` | Vaccine Pack entries |
| `reports/report.sarif` | SAST findings for CI (existing) |
| `case.json` | Case record and chain of custody |

## 4. Module boundaries

| Module | Owns | Consumes |
|---|---|---|
| Reema | Intake, enrichment, static analysis, verdict, Vaccine Pack | Sample |
| Dyxon | Device control, runtime capture, automated checks | `findings.json`, Vaccine Pack checks |
| Aegis | Orchestration across apps, results over time | Reema and Dyxon outputs |

The contract between modules is `findings.json` and the Vaccine Pack. Neither module reads the other's internal files. ([ADR 0001](decisions/0001-split-anais-into-reema-and-dyxon.md))

## 5. Quality

- **Test corpus:** a labelled set of benign and malicious samples. Hashes are listed in the repo; the samples are kept outside the repo.
- **Rule gate:** every rule change reports precision and recall on the corpus. A change that adds false positives on benign apps does not merge.
- **Unit tests:** each adapter, rule and output writer has tests in `tests/`.
