package s3;

import java.io.Closeable;
import java.nio.charset.Charset;
import kotlin.io.CloseableKt;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public abstract class d0 implements Closeable {
    public abstract long a();

    public abstract u b();

    public abstract f4.h c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t3.c.d(c());
    }

    public final String e() {
        Charset charset;
        f4.h c5 = c();
        try {
            u b5 = b();
            if (b5 == null || (charset = b5.a(Charsets.UTF_8)) == null) {
                charset = Charsets.UTF_8;
            }
            String j02 = c5.j0(t3.c.t(c5, charset));
            CloseableKt.closeFinally(c5, null);
            return j02;
        } finally {
        }
    }
}
