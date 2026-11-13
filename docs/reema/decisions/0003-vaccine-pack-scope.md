# 0003. Vaccine Pack scope and limits

- Status: Accepted
- Date: 2026-11-13

## Context

Analysts want each capability found in a sample turned into a defense ("vaccine"): a way to verify that our apps resist it. The checks must work against any app under test. A harness that reproduces a malware capability is dual use, so its scope must be limited and written down.

## Decision

For each detected capability, the Vaccine Pack holds four parts:

| Part | Content |
|---|---|
| Profile | The capability, its ATT&CK IDs and preconditions, and the evidence from the sample |
| Defense | Code-level controls for the app under test |
| Check | A pass/fail test with the expected result |
| Harness | Optional runnable code for the check |

The test harness must stay within these limits:

1. **Target:** it acts only on the package passed as the app under test.
2. **No data leaves the device:** no network calls, no exfiltration, and no C2.
3. **No persistence:** no boot receivers, no hiding, no anti-uninstall.
4. **No evasion:** no obfuscation, packing, or anti-analysis.
5. **Visible:** the harness is clearly labelled as a test tool, in its app name and in the notification it shows while running.
6. **Smallest action:** it performs only the single action the check needs, then reports pass or fail.

Code taken from real samples is never copied into the harness.

## Consequences

- A harness proves the defense works. It does not reproduce the malware.
- Harness features need a review against these limits before they merge.
- Dyxon automates checks within the same limits.
