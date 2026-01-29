package b4;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import s3.x;

/* loaded from: classes15.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public k f458a;

    /* renamed from: b, reason: collision with root package name */
    public final a f459b;

    public interface a {
        boolean a(SSLSocket sSLSocket);

        k b(SSLSocket sSLSocket);
    }

    public j(a socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f459b = socketAdapterFactory;
    }

    @Override // b4.k
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f459b.a(sslSocket);
    }

    @Override // b4.k
    public final String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        k e5 = e(sslSocket);
        if (e5 != null) {
            return e5.b(sslSocket);
        }
        return null;
    }

    @Override // b4.k
    public final boolean c() {
        return true;
    }

    @Override // b4.k
    public final void d(SSLSocket sslSocket, String str, List<? extends x> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        k e5 = e(sslSocket);
        if (e5 != null) {
            e5.d(sslSocket, str, protocols);
        }
    }

    public final synchronized k e(SSLSocket sSLSocket) {
        if (this.f458a == null && this.f459b.a(sSLSocket)) {
            this.f458a = this.f459b.b(sSLSocket);
        }
        return this.f458a;
    }
}
