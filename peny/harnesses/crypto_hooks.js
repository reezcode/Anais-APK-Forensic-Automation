// Peny tier-0 harness: confirm weak cryptography at runtime (MASVS-CRYPTO).
//
// Hooks Cipher.getInstance / MessageDigest.getInstance and reports when the app
// actually exercises a weak primitive (ECB mode, DES/3DES/RC4, MD5/SHA-1 for a
// security use). Confirms a static insecure_crypto finding with a live call.
//
// Emits: send({check:"weak_cipher", confirmed:bool, detail, evidence:[...]})
'use strict';

var WEAK = /(^|\/)(DES|DESede|RC2|RC4|ARC4|BLOWFISH)($|\/)|\/ECB\/|^MD5$|^MD4$|^SHA-?1$/i;

function report(transform, kind) {
    var weak = WEAK.test(transform);
    send({
        check: 'weak_cipher',
        confirmed: weak,
        detail: (weak ? 'weak ' : '') + kind + ': ' + transform,
        evidence: [kind + '=' + transform]
    });
}

Java.perform(function () {
    try {
        var Cipher = Java.use('javax.crypto.Cipher');
        Cipher.getInstance.overload('java.lang.String').implementation = function (t) {
            report(t, 'Cipher.getInstance');
            return this.getInstance(t);
        };
    } catch (e) {}
    try {
        var MD = Java.use('java.security.MessageDigest');
        MD.getInstance.overload('java.lang.String').implementation = function (a) {
            report(a, 'MessageDigest.getInstance');
            return this.getInstance(a);
        };
    } catch (e) {}
});
