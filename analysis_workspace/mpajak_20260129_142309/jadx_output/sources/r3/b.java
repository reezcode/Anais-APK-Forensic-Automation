package r3;

import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.ranges.RangesKt;
import m3.n0;
import q3.s;

/* loaded from: classes9.dex */
public final class b extends n0 implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final b f5059c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final q3.g f5060d;

    static {
        l lVar = l.f5075c;
        int C = i.g.C("kotlinx.coroutines.io.parallelism", RangesKt.coerceAtLeast(64, s.f4790a), 0, 0, 12);
        Objects.requireNonNull(lVar);
        if (!(C >= 1)) {
            throw new IllegalArgumentException(androidx.appcompat.widget.a.g("Expected positive parallelism level, but got ", C).toString());
        }
        f5060d = new q3.g(lVar, C);
    }

    @Override // m3.v
    public final void c(CoroutineContext coroutineContext, Runnable runnable) {
        f5060d.c(coroutineContext, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override // m3.v
    public final String toString() {
        return "Dispatchers.IO";
    }
}
