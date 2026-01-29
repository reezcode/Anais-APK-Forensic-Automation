package a4;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import b4.f;
import b4.i;
import b4.j;
import b4.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s3.x;

/* loaded from: classes22.dex */
public final class a extends h {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f85e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0000a f86f = new C0000a();

    /* renamed from: d, reason: collision with root package name */
    public final List<k> f87d;

    /* renamed from: a4.a$a, reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0000a {
    }

    static {
        f85e = h.f116c.c() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        k[] kVarArr = new k[4];
        kVarArr[0] = Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29 ? new b4.a() : null;
        f.a aVar = b4.f.f447g;
        kVarArr[1] = new j(b4.f.f446f);
        kVarArr[2] = new j(i.f457a);
        kVarArr[3] = new j(b4.g.f453a);
        List listOfNotNull = CollectionsKt.listOfNotNull((Object[]) kVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOfNotNull) {
            if (((k) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f87d = arrayList;
    }

    @Override // a4.h
    public final d1.f b(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        b4.b bVar = x509TrustManagerExtensions != null ? new b4.b(trustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : super.b(trustManager);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<b4.k>] */
    @Override // a4.h
    public final void d(SSLSocket sslSocket, String str, List<? extends x> protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f87d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((k) obj).a(sslSocket)) {
                    break;
                }
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            kVar.d(sslSocket, str, protocols);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<b4.k>] */
    @Override // a4.h
    public final String f(SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f87d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k) obj).a(sslSocket)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            return kVar.b(sslSocket);
        }
        return null;
    }

    @Override // a4.h
    @SuppressLint({"NewApi"})
    public final boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
