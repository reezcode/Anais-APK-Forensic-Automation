package a4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import s3.x;

/* loaded from: classes22.dex */
public final class f extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f109d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f110e = new a();

    /* loaded from: classes17.dex */
    public static final class a {
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r0.intValue() >= 9) goto L13;
     */
    static {
        /*
            a4.f$a r0 = new a4.f$a
            r0.<init>()
            a4.f.f110e = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L14
            java.lang.Integer r0 = kotlin.text.StringsKt.toIntOrNull(r0)
            goto L15
        L14:
            r0 = 0
        L15:
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            int r0 = r0.intValue()
            r3 = 9
            if (r0 < r3) goto L22
            goto L2d
        L22:
            r1 = 0
            goto L2d
        L24:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L22
            r0.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L22
        L2d:
            a4.f.f109d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.f.<clinit>():void");
    }

    @Override // a4.h
    public final void d(SSLSocket sslSocket, String str, List<x> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        SSLParameters sslParameters = sslSocket.getSSLParameters();
        List<String> a5 = h.f116c.a(protocols);
        Intrinsics.checkNotNullExpressionValue(sslParameters, "sslParameters");
        Object[] array = ((ArrayList) a5).toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        sslParameters.setApplicationProtocols((String[]) array);
        sslSocket.setSSLParameters(sslParameters);
    }

    @Override // a4.h
    public final String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (applicationProtocol.hashCode() != 0) {
                    return applicationProtocol;
                }
                if (!applicationProtocol.equals("")) {
                    return applicationProtocol;
                }
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }
}
