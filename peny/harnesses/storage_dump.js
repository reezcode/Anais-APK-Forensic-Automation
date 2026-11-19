// Peny tier-0 harness: confirm plaintext secrets written to storage
// (MASVS-STORAGE). Hooks SharedPreferences.Editor.putString and flags a value
// that lands under a sensitive key in a plain (non-encrypted) preferences store.
// Confirms a static insecure_storage finding with a live write.
//
// Emits: send({check:"plaintext_secret", confirmed:bool, detail, evidence:[...]})
'use strict';

var SENSITIVE = /token|password|passwd|secret|api[_-]?key|session|auth|pin|card/i;

Java.perform(function () {
    try {
        var Editor = Java.use('android.content.SharedPreferences$Editor');
        Editor.putString.implementation = function (key, value) {
            if (key && SENSITIVE.test(key.toString())) {
                var preview = value ? value.toString().substring(0, 24) : '';
                send({ check: 'plaintext_secret', confirmed: true,
                       detail: 'sensitive value stored in plain SharedPreferences: ' + key,
                       evidence: ['putString:' + key + '=' + preview] });
            }
            return this.putString(key, value);
        };
    } catch (e) {
        send({ check: 'plaintext_secret', confirmed: false,
               detail: 'SharedPreferences.Editor not hookable', evidence: [] });
    }
});
