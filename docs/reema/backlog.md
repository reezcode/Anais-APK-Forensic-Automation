# Reema Backlog

Work that is designed but not implemented. Each item names where it plugs in,
so it can be picked up without extra context. When an item is done, move it to
[`changelog.md`](changelog.md) and delete it here.

Phase plan: [`roadmap.md`](roadmap.md). Target design: [`design.md`](design.md).

**The backlog is empty — every designed item is implemented.** New work starts
as a new `B<n>` row here.

Cleared in 0.3.0 (see [`changelog.md`](changelog.md)): B1 reachability, B2 string table,
B3 JVM-only JAR index (d8), B4 sample upload, B6 Koodous/Hybrid Analysis, B7 family
normalization, B8 ssdeep, B9 child samples, B11 (K2–K5).
Cleared in 0.4.1: B5 IOC enrichment (ThreatFox/URLhaus feeds), B12 bare-domain IOCs.
Cleared in 0.5.1: B15 STIX 2.1 / MISP export.
Cleared in 0.6.1: B17 deep iOS (Mach-O parse, Swift detection, framework→capability map).
Cleared in 0.7.0: B10 native Python APK engine (`reema/apk.py`); `anais.sh` retired as the engine.
Cleared in 0.8.0: B13 capability rule content + chains, B14 defense catalog, B16 offline
family classifier (`reema/families.yaml`). `anais.sh` deleted; the npm CLI and MCP now
drive `reema/apk.py`.

Notes on what landed, for anyone extending it:
- **B1 reachability** is best-effort and static: reflection, native code and
  runtime-loaded code are not followed, so an unreachable tag means "no static path
  found", not "provably dead". The downgrade is class-level (any reachable method
  makes the class reachable).
- **B3** needs `d8` (Android build-tools) on PATH; absent it, a JVM-only JAR is still
  skipped. A class-file parser was not added.
- **B4/B6** upload and the new providers are untested against the live APIs (no keys in
  CI); parsing is covered by mocked-response tests only.
- **B13/B14/B16** detection content profiles families by behaviour; capability rules use
  AND-of-conditions (substring match over API/permission/string/component facts). The
  family signatures (B16) vote only on app-owned capabilities, independent of the chains,
  so a chain and a signature agreeing raises family confidence to high. Tune against the
  P4 corpus (`reema corpus`) before trusting the verdict on a new sample set.
