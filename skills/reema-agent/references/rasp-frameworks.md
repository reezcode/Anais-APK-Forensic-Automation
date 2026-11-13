# RASP / packers and app frameworks

## RASP & packer detection (`rasp_report.json`)

Anais scores weighted signatures (native libs, stub classes, packages, assets,
manifest keywords, code keywords) and only issues a verdict above a minimum
score, so stray keywords do not trigger a false positive. Fields:

- `type` — top verdict (vendor name, `Unknown (heuristic)`, or `None Detected`).
- `confidence` — 0–100.
- `detected[]` — all vendors ranked (an app can stack layers).
- `evidence` — the concrete signatures matched, per vendor.
- `weak_signals` — sub-threshold hits (lib or capped code keywords) that did not
  reach a verdict on their own.
- `heuristics[]` — e.g. `randomized_native_lib_names` (stripped RASP with random
  `.so` names).
- `recommendations[]` — what the verdict implies for analysis.

Vendors covered include Talsec/freeRASP, Appdome, Promon SHIELD, DexGuard,
Zimperium zShield, LiAPP, Tencent Legu, Qihoo 360 Jiagu, Bangcle/SecNeo, and
more. Two broad kinds:

- **DEX shells / packers** (Legu, Jiagu, Bangcle, SecNeo): the real DEX is
  unpacked at runtime. Static Java is a stub. Next step: let the wrapper
  `Application` load, then dump the decrypted DEX from memory (dynamic). Phase 1
  REA/`dex_payload_report.json` flag whether the real DEX is absent from the APK.
- **Native RASP** (Appdome, Promon, Talsec native, randomized libs): checks run
  in `JNI_OnLoad` / native routines (root, debugger, Frida, integrity). Next
  step: REA deep pass (`open_binary` + `trace_native_values`) to find the
  abort/detection address, which Phase 3 turns into Frida hooks.

When RASP is detected, Anais queues matching deep tasks in `rea_targets.json`
(`feeds: frida_native_hooks`) and the generated Frida script carries vendor
notes. Confirm at runtime with the dynamic bridge.

## Frameworks (`framework_report.json`)

`primary` + `frameworks[]` classify where the real logic lives, because Dalvik
SAST misses it for cross-platform apps. `coverage_warning` is set when the app's
logic is in a form the Java/smali scan can't read:

- **Flutter** — logic compiled into `libapp.so` (Dart AOT snapshot). Recover with
  blutter via REA `open_binary`; `identify-flutter-build` gives snapshot identity.
- **React Native** — JS bundle. Hermes bytecode (`index.android.bundle` with the
  Hermes magic) needs a hbc decompiler; plain-JS bundles are scanned directly.
- **Unity (IL2CPP)** — C# compiled to native; names live in
  `global-metadata.dat`. REA `inspect_il2cpp_metadata` (+ linked `libil2cpp.so`)
  maps names to native addresses.
- **Xamarin / .NET MAUI** — logic in managed DLLs under `assemblies/` (often
  XALZ-compressed). REA `inspect_managed_artifact` / ilspycmd decompiles them.
- **Cordova** — web assets under `assets/www/`.
- **Native / Java-Kotlin** — ordinary Dalvik; the static SAST covers it, no
  deep-pass framework task needed.

For any framework with a `coverage_warning`, the real answer requires the REA
deep pass — the static SAST alone is not conclusive about app behavior.
