package f4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes19.dex */
public abstract class l implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final a0 f2869b;

    public l(a0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f2869b = delegate;
    }

    @Override // f4.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2869b.close();
    }

    @Override // f4.a0
    public final b0 i() {
        return this.f2869b.i();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f2869b + ')';
    }
}
