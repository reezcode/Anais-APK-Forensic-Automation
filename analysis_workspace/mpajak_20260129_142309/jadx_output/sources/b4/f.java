package b4;

import a4.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import s3.x;

/* loaded from: classes23.dex */
public class f implements k {

    /* renamed from: f, reason: collision with root package name */
    public static final e f446f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f447g = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Method f448a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f449b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f450c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f451d;

    /* renamed from: e, reason: collision with root package name */
    public final Class<? super SSLSocket> f452e;

    /* loaded from: classes9.dex */
    public static final class a {
    }

    static {
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", "packageName");
        f446f = new e();
    }

    public f(Class<? super SSLSocket> sslSocketClass) {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f452e = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f448a = declaredMethod;
        this.f449b = sslSocketClass.getMethod("setHostname", String.class);
        this.f450c = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f451d = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // b4.k
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f452e.isInstance(sslSocket);
    }

    @Override // b4.k
    public final String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f450c.invoke(sslSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (IllegalAccessException e5) {
            throw new AssertionError(e5);
        } catch (NullPointerException e6) {
            if (Intrinsics.areEqual(e6.getMessage(), "ssl == null")) {
                return null;
            }
            throw e6;
        } catch (InvocationTargetException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // b4.k
    public final boolean c() {
        b.a aVar = a4.b.f89g;
        return a4.b.f88f;
    }

    @Override // b4.k
    public final void d(SSLSocket sslSocket, String str, List<? extends x> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f448a.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f449b.invoke(sslSocket, str);
                }
                this.f451d.invoke(sslSocket, a4.h.f116c.b(protocols));
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            } catch (InvocationTargetException e6) {
                throw new AssertionError(e6);
            }
        }
    }
}
