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
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import s3.x;

/* loaded from: classes20.dex */
public final class c extends h {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f94e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f95f;

    /* renamed from: d, reason: collision with root package name */
    public final Provider f96d = new BouncyCastleJsseProvider();

    /* loaded from: classes24.dex */
    public static final class a {
    }

    static {
        a aVar = new a();
        f95f = aVar;
        boolean z4 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z4 = true;
        } catch (ClassNotFoundException unused) {
        }
        f94e = z4;
    }

    @Override // a4.h
    public final void d(SSLSocket sslSocket, String str, List<x> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (!(sslSocket instanceof BCSSLSocket)) {
            super.d(sslSocket, str, protocols);
            return;
        }
        BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
        BCSSLParameters sslParameters = bCSSLSocket.getParameters();
        List<String> a5 = h.f116c.a(protocols);
        Intrinsics.checkNotNullExpressionValue(sslParameters, "sslParameters");
        Object[] array = ((ArrayList) a5).toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        sslParameters.setApplicationProtocols((String[]) array);
        bCSSLSocket.setParameters(sslParameters);
    }

    @Override // a4.h
    public final String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (sslSocket instanceof BCSSLSocket) {
            String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
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
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f96d);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // a4.h
    public final X509TrustManager n() {
        TrustManagerFactory factory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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
