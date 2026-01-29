package a4;

import java.security.KeyStore;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import s3.x;

/* loaded from: classes19.dex */
public final class g extends h {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f111e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f112f;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f113d = new OpenJSSE();

    /* loaded from: classes24.dex */
    public static final class a {
    }

    static {
        a aVar = new a();
        f112f = aVar;
        boolean z4 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z4 = true;
        } catch (ClassNotFoundException unused) {
        }
        f111e = z4;
    }

    @Override // a4.h
    public final void d(SSLSocket sslSocket, String str, List<x> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (!(sslSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            super.d(sslSocket, str, protocols);
            return;
        }
        org.openjsse.javax.net.ssl.SSLSocket sSLSocket = (org.openjsse.javax.net.ssl.SSLSocket) sslSocket;
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (sSLParameters instanceof SSLParameters) {
            Object[] array = ((ArrayList) h.f116c.a(protocols)).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        }
    }

    @Override // a4.h
    public final String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (sslSocket instanceof org.openjsse.javax.net.ssl.SSLSocket) {
            String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sslSocket).getApplicationProtocol();
            if (applicationProtocol != null && (applicationProtocol.hashCode() != 0 || !applicationProtocol.equals(""))) {
                return applicationProtocol;
            }
        } else {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        }
        return null;
    }

    @Override // a4.h
    public final SSLContext l() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f113d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "SSLContext.getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // a4.h
    public final X509TrustManager n() {
        TrustManagerFactory factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f113d);
        factory.init((KeyStore) null);
        Intrinsics.checkNotNullExpressionValue(factory, "factory");
        TrustManager[] trustManagers = factory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder g5 = androidx.activity.d.g("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(arrays, "java.util.Arrays.toString(this)");
        g5.append(arrays);
        throw new IllegalStateException(g5.toString().toString());
    }
}
