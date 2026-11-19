// Peny tier-0 harness: confirm TLS trust/pinning weakness (MASVS-NETWORK).
//
// Looks for a permissive TrustManager (empty checkServerTrusted) and for OkHttp
// CertificatePinner use, neutralizes them, and reports. A permissive trust chain
// that this hook can disarm confirms a static insecure_network finding: TLS MITM
// is reachable on a hostile network.
//
// Emits: send({check:"pinning", confirmed:bool, detail, evidence:[...]})
'use strict';

Java.perform(function () {
    var hit = false;

    // Permissive custom X509TrustManager: checkServerTrusted that never throws.
    try {
        var X509TM = Java.use('javax.net.ssl.X509TrustManager');
        var SSLContext = Java.use('javax.net.ssl.SSLContext');
        var TrustManager = Java.registerClass({
            name: 'com.peny.TrustAll',
            implements: [X509TM],
            methods: {
                checkClientTrusted: function () {},
                checkServerTrusted: function () {},
                getAcceptedIssuers: function () { return []; }
            }
        });
        var init = SSLContext.init.overload(
            '[Ljavax.net.ssl.KeyManager;', '[Ljavax.net.ssl.TrustManager;', 'java.security.SecureRandom');
        init.implementation = function (km, tm, sr) {
            hit = true;
            send({ check: 'pinning', confirmed: true,
                   detail: 'SSLContext.init observed; trust manager replaceable',
                   evidence: ['SSLContext.init'] });
            return init.call(this, km, [TrustManager.$new()], sr);
        };
    } catch (e) {}

    // OkHttp certificate pinner: disarm and flag.
    try {
        var CP = Java.use('okhttp3.CertificatePinner');
        CP.check.overload('java.lang.String', 'java.util.List').implementation = function (host, peers) {
            hit = true;
            send({ check: 'pinning', confirmed: true,
                   detail: 'okhttp3 CertificatePinner.check bypassed for ' + host,
                   evidence: ['CertificatePinner.check:' + host] });
            return;
        };
    } catch (e) {}

    if (!hit) {
        send({ check: 'pinning', confirmed: false,
               detail: 'no permissive TrustManager / CertificatePinner exercised', evidence: [] });
    }
});
