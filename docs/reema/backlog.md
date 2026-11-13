# Reema Backlog

Work that is designed but not implemented. Each item names where it plugs in,
so it can be picked up without extra context. When an item is done, move it to
[`changelog.md`](changelog.md) and delete it here.

Phase plan: [`roadmap.md`](roadmap.md). Target design: [`design.md`](design.md).

| Id | Item | Plugs into | Notes |
|---|---|---|---|
| B5 | **IOC enrichment** (ThreatFox, URLhaus) | `reema/enrich.py` | Needs the P2 IOC extractor first. Query only extracted domains, URLs and IPs; cache like hash lookups. |
| B10 | **Native Python engine for APK** | `reema/cli.py` | `anais.sh` is still the APK engine. Port its stages to Python one at a time (ADR 0001). |

Cleared in 0.3.0 (see [`changelog.md`](changelog.md)): B1 reachability, B2 string table,
B3 JVM-only JAR index (d8), B4 sample upload, B6 Koodous/Hybrid Analysis, B7 family
normalization, B8 ssdeep, B9 child samples, B11 (K2–K5).

Notes on what landed, for anyone extending it:
- **B1 reachability** is best-effort and static: reflection, native code and
  runtime-loaded code are not followed, so an unreachable tag means "no static path
  found", not "provably dead". The downgrade is class-level (any reachable method
  makes the class reachable).
- **B3** needs `d8` (Android build-tools) on PATH; absent it, a JVM-only JAR is still
  skipped. A class-file parser was not added.
- **B4/B6** upload and the new providers are untested against the live APIs (no keys in
  CI); parsing is covered by mocked-response tests only.
