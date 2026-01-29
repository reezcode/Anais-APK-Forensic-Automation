package f4;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes21.dex */
public final class p implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final InputStream f2880b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f2881c;

    public p(InputStream input, b0 timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f2880b = input;
        this.f2881c = timeout;
    }

    @Override // f4.a0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2880b.close();
    }

    @Override // f4.a0
    public final b0 i() {
        return this.f2881c;
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("source(");
        g5.append(this.f2880b);
        g5.append(')');
        return g5.toString();
    }

    @Override // f4.a0
    public final long u(f sink, long j5) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j5 == 0) {
            return 0L;
        }
        if (!(j5 >= 0)) {
            throw new IllegalArgumentException(androidx.activity.result.a.d("byteCount < 0: ", j5).toString());
        }
        try {
            this.f2881c.f();
            v w4 = sink.w(1);
            int read = this.f2880b.read(w4.f2894a, w4.f2896c, (int) Math.min(j5, 8192 - w4.f2896c));
            if (read != -1) {
                w4.f2896c += read;
                long j6 = read;
                sink.f2852c += j6;
                return j6;
            }
            if (w4.f2895b != w4.f2896c) {
                return -1L;
            }
            sink.f2851b = w4.a();
            w.b(w4);
            return -1L;
        } catch (AssertionError e5) {
            if (d1.d.h(e5)) {
                throw new IOException(e5);
            }
            throw e5;
        }
    }
}
