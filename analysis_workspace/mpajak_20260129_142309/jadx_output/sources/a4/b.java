package a4;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import b4.f;
import b4.i;
import b4.j;
import b4.k;
import b4.l;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s3.x;

/* loaded from: classes23.dex */
public final class b extends h {

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f88f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f89g = new a();

    /* renamed from: d, reason: collision with root package name */
    public final List<k> f90d;

    /* renamed from: e, reason: collision with root package name */
    public final b4.h f91e;

    /* loaded from: classes21.dex */
    public static final class a {
    }

    /* renamed from: a4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0001b implements d4.d {

        /* renamed from: a, reason: collision with root package name */
        public final X509TrustManager f92a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f93b;

        public C0001b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f92a = trustManager;
            this.f93b = findByIssuerAndSignatureMethod;
        }

        @Override // d4.d
        public final X509Certificate a(X509Certificate cert) {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object invoke = this.f93b.invoke(this.f92a, cert);
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e5) {
                throw new AssertionError("unable to get issues and signature", e5);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0001b)) {
                return false;
            }
            C0001b c0001b = (C0001b) obj;
            return Intrinsics.areEqual(this.f92a, c0001b.f92a) && Intrinsics.areEqual(this.f93b, c0001b.f93b);
        }

        public final int hashCode() {
            X509TrustManager x509TrustManager = this.f92a;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f93b;
            return hashCode + (method != null ? method.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder g5 = androidx.activity.d.g("CustomTrustRootIndex(trustManager=");
            g5.append(this.f92a);
            g5.append(", findByIssuerAndSignatureMethod=");
            g5.append(this.f93b);
            g5.append(")");
            return g5.toString();
        }
    }

    static {
        boolean z4 = false;
        if (h.f116c.c() && Build.VERSION.SDK_INT < 30) {
            z4 = true;
        }
        f88f = z4;
    }

    public b() {
        l lVar;
        Method method;
        Method method2;
        k[] kVarArr = new k[4];
        l.a aVar = l.f460h;
        Intrinsics.checkNotNullParameter("com.android.org.conscrypt", "packageName");
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class<?> paramsClass = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Intrinsics.checkNotNullExpressionValue(paramsClass, "paramsClass");
            lVar = new l(cls, cls2, paramsClass);
        } catch (Exception e5) {
            h.f114a.i("unable to load android socket classes", 5, e5);
            lVar = null;
        }
        kVarArr[0] = lVar;
        f.a aVar2 = b4.f.f447g;
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
        this.f90d = arrayList;
        try {
            Class<?> cls3 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls3.getMethod("get", new Class[0]);
            method2 = cls3.getMethod("open", String.class);
            method = cls3.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f91e = new b4.h(method3, method2, method);
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

    @Override // a4.h
    public final d4.d c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            method.setAccessible(true);
            return new C0001b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.c(trustManager);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<b4.k>] */
    @Override // a4.h
    public final void d(SSLSocket sslSocket, String str, List<x> protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f90d.iterator();
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

    @Override // a4.h
    public final void e(Socket socket, InetSocketAddress address, int i5) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i5);
        } catch (ClassCastException e5) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e5;
            }
            throw new IOException("Exception in connect", e5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<b4.k>] */
    @Override // a4.h
    public final String f(SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f90d.iterator();
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
    public final Object g() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        b4.h hVar = this.f91e;
        Objects.requireNonNull(hVar);
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        Method method = hVar.f454a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, new Object[0]);
            Method method2 = hVar.f455b;
            Intrinsics.checkNotNull(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // a4.h
    public final boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
        }
        if (i5 < 23) {
            return true;
        }
        NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
        Intrinsics.checkNotNullExpressionValue(networkSecurityPolicy, "NetworkSecurityPolicy.getInstance()");
        return networkSecurityPolicy.isCleartextTrafficPermitted();
    }

    @Override // a4.h
    public final void k(String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        b4.h hVar = this.f91e;
        Objects.requireNonNull(hVar);
        boolean z4 = false;
        if (obj != null) {
            try {
                Method method = hVar.f456c;
                Intrinsics.checkNotNull(method);
                method.invoke(obj, new Object[0]);
                z4 = true;
            } catch (Exception unused) {
            }
        }
        if (z4) {
            return;
        }
        h.j(this, message, 5, null, 4, null);
    }
}
