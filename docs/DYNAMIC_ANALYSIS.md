# Dynamic Analysis (Phase 4, ADB/Frida runtime bridge)

The static pipeline (and the REA deep pass) tell you what the app *can* do.
Phase 4 runs it on a real device under the Anais-generated Frida script and
records what actually happens: SSL pinning bypassed, crypto/keys in use,
root/RASP checks firing, and the native hooks — including REA-recovered
addresses from Phase 3 — being hit.

This is a **separate, opt-in step**. It never runs inside `anais`, because it
executes the target.

> **Safety.** `dynamic_bridge.py` installs/launches and executes the target
> application. The target may be malware. It does nothing without an explicit
> `--yes`; without that flag it only prints the command plan (dry-run). Run it
> only against a disposable, isolated device or emulator you can wipe — never a
> personal phone or a device on a trusted network.

## Prerequisites

- `adb` on PATH and a device in `device` state (`adb devices`).
- `frida` on PATH and a matching `frida-server` running on the device
  (`frida-ps -U` must list processes).
- A generated `reports/frida_auto.js` (produced by a normal `anais` run; richer
  after a Phase 3 deep-pass merge adds native hook addresses).

## Run

Dry-run first — see exactly what will execute, nothing runs:

```bash
python3 analysis_tools/dynamic_bridge.py \
    <apk_work_dir>/temp <apk_work_dir>/reports \
    --mode spawn --timeout 30
```

Then execute on the device:

```bash
python3 analysis_tools/dynamic_bridge.py \
    <apk_work_dir>/temp <apk_work_dir>/reports \
    --mode spawn --timeout 30 --yes
```

The package is read from `temp/basic_info.json`; override with `--package`.

### Options

| Flag | Meaning |
|------|---------|
| `--mode spawn` | launch the app under Frida (default); `attach` hooks a running process by name |
| `--timeout N` | capture window in seconds (default 30) |
| `--serial S` | target a specific device (`adb -s` / `frida -D`) |
| `--install` | `adb install -r <apk>` first (needs `--apk-path`) |
| `--apk-path P` | APK to install |
| `--frida-script P` | script to inject (default `reports/frida_auto.js`) |
| `--yes` | actually execute on the device (without it: dry-run) |
| `--dry-run` | force dry-run even with `--yes` |
| `--out NAME` | output filename (default `dynamic_findings.json`) |

## Output

Writes `reports/dynamic_findings.json` (mirrored into `temp/` for report regen):

```json
{
  "executed": true, "package": "com.x", "device": "USB", "mode": "spawn",
  "duration_sec": 30.4, "hits_total": 7,
  "hooks": {
    "ssl_bypass": ["[Anais] okhttp3 CertificatePinner.check bypassed"],
    "crypto": ["[Anais][crypto] AES doFinal len=32"],
    "keys": ["[Anais][key] AES = ..."],
    "native": ["[Anais][native] enter libjiagu_a64.so!sub_1a2b0 (abort)"],
    "dlopen": ["[Anais][dlopen] /data/app/.../libfoo.so"],
    "root_blocked": ["[Anais] blocked root-probe exec: which su"]
  },
  "logcat": {"crashes": [...], "exceptions": [...], "lines": 1234},
  "errors": [], "notes": []
}
```

## Fold into the report

Regenerate the report so a **Dynamic Analysis** section appears
(hook-hit table + logcat crashes):

```bash
python3 analysis_tools/report_generator_modular.py \
    <apk_work_dir> <apk_work_dir>/temp app.apk <sha256> \
    --output-md report.md --output-json report.json
```

(`rea_deep.py`'s merge already regenerates the report; run it after a deep pass,
then run the dynamic bridge, then regenerate once more — or just regenerate last.)

## Reading the result

- Native hooks firing at the REA-recovered addresses confirm the RASP/abort path
  Phase 3 located — the bypass works.
- `crypto`/`keys` lines capture real key material and payload sizes at runtime,
  resolving what static entropy only flagged.
- `logcat` crashes right after launch usually mean a detection fired before the
  hook landed — move to `attach`, an earlier spawn gate, or hook `JNI_OnLoad`
  earlier.
