package b4;

import b4.f;
import b4.j;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes19.dex */
public final class e implements j.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f445a = "com.google.android.gms.org.conscrypt";

    @Override // b4.j.a
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String name = sslSocket.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
        return StringsKt.u(name, this.f445a + FilenameUtils.EXTENSION_SEPARATOR);
    }

    @Override // b4.j.a
    public final k b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        f.a aVar = f.f447g;
        Class<?> cls = sslSocket.getClass();
        Class<?> cls2 = cls;
        while (!Intrinsics.areEqual(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError(androidx.activity.d.e("No OpenSSLSocketImpl superclass of socket of type ", cls));
            }
        }
        Intrinsics.checkNotNull(cls2);
        return new f(cls2);
    }
}
