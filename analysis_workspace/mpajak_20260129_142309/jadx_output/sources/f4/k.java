package f4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public abstract class k implements y {

    /* renamed from: b, reason: collision with root package name */
    public final y f2868b;

    public k(y delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f2868b = delegate;
    }

    @Override // f4.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2868b.close();
    }

    @Override // f4.y, java.io.Flushable
    public void flush() {
        this.f2868b.flush();
    }

    @Override // f4.y
    public final b0 i() {
        return this.f2868b.i();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f2868b + ')';
    }
}
