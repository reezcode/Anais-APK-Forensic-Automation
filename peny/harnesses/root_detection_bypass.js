// Peny tier-0 harness: confirm root detection is present and bypassable
// (MASVS-RESILIENCE). Hooks the common su-path / Runtime.exec("su") checks,
// forces them negative, and reports a hit. A detection that this single hook
// disarms confirms that the app's resilience control is trivially bypassable.
//
// Emits: send({check:"root_detection", confirmed:bool, detail, evidence:[...]})
'use strict';

Java.perform(function () {
    var hit = false;
    var SU = /(^|\/)su$|magisk|supersu|busybox/i;

    try {
        var File = Java.use('java.io.File');
        File.exists.implementation = function () {
            var p = this.getAbsolutePath();
            if (SU.test(p)) {
                hit = true;
                send({ check: 'root_detection', confirmed: true,
                       detail: 'su/root path probed and forced absent: ' + p,
                       evidence: ['File.exists:' + p] });
                return false;
            }
            return this.exists();
        };
    } catch (e) {}

    try {
        var Runtime = Java.use('java.lang.Runtime');
        Runtime.exec.overload('java.lang.String').implementation = function (cmd) {
            if (SU.test(cmd)) {
                hit = true;
                send({ check: 'root_detection', confirmed: true,
                       detail: 'Runtime.exec root probe neutralized: ' + cmd,
                       evidence: ['Runtime.exec:' + cmd] });
                cmd = 'echo';
            }
            return this.exec(cmd);
        };
    } catch (e) {}

    if (!hit) {
        send({ check: 'root_detection', confirmed: false,
               detail: 'no su-path / exec root check exercised', evidence: [] });
    }
});
