# Reema Backlog

Work that is designed but not implemented. Each item names where it plugs in,
so it can be picked up without extra context. When an item is done, move it to
[`changelog.md`](changelog.md) and delete it here.

Phase plan: [`roadmap.md`](roadmap.md). Target design: [`design.md`](design.md).

| Id | Item | Plugs into | Notes |
|---|---|---|---|
| B1 | **Reachability in the code index** | `reema/index.py` | Add `methods(id, class_id, name, descriptor, reachable)`. Seed the walk from manifest components (activities, services, receivers, providers, application class) and their internal superclasses. Follow direct calls, overriding methods in subclasses, `<clinit>`, and callback methods of instantiated classes. For JAR input with no manifest, leave `reachable` NULL. Then downgrade findings in unreachable code to `low` confidence (`reema/adapters.tag_owner`). Expected gaps: reflection, native code, runtime-loaded code. |
| B2 | **String table in the code index** | `reema/index.py` | `strings(class_id, method, value)` from `dx.get_strings()` xrefs. Needed by P2 rules that extract configuration values. |
| B3 | **Index for JVM-only JARs** | `reema/index.py` `_analysis_for` | Androguard reads DEX only. A JAR with only `.class` files is skipped today (`dex_present: false`). Option: convert it with `d8` first, or add a class-file parser. |
| B4 | **Sample upload** (`--upload`) | `reema/enrich.py` | ADR 0004 allows upload only on explicit opt-in. Not implemented. Record every upload in `case.json` `enrichment[]`. |
| B5 | **IOC enrichment** (ThreatFox, URLhaus) | `reema/enrich.py` | Needs the P2 IOC extractor first. Query only extracted domains, URLs and IPs; cache like hash lookups. |
| B6 | **More hash providers** (Koodous, Hybrid Analysis) | `reema/enrich.py` `PROVIDERS` | Add a class with `name`, `key_env`, `lookup(sha256, key)` returning `(status, data)`. |
| B7 | **Family label normalization** | `reema/enrich.py` → verdict | Reduce labels from several engines to one family with a confidence (AVclass-style). Feeds the P2 verdict. |
| B8 | **ssdeep fuzzy hash** | `reema/case.py` | TLSH is recorded when `py-tlsh` is installed. Add ssdeep behind the same optional import pattern. |
| B9 | **Child samples** | `reema/cli.py`, `reema/case.py` | Analyze a payload extracted by `dex_payload_hunter.py --extract` as a child case linked from the parent `case.json`. |
| B10 | **Native Python engine for APK** | `reema/cli.py` | `anais.sh` is still the APK engine. Port its stages to Python one at a time (ADR 0001). |
| B11 | **Known issues K2–K5** | see [`roadmap.md`](roadmap.md#known-issues) | YARA severity from `meta`, noisy URL keywords, generic YARA rule, duplicated TLD list. |
