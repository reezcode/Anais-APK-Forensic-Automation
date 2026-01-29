package r3;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import m3.n0;

/* loaded from: classes15.dex */
public class f extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public a f5063c;

    public f(int i5, int i6, long j5) {
        this.f5063c = new a(i5, i6, j5, "DefaultDispatcher");
    }

    @Override // m3.v
    public final void c(CoroutineContext coroutineContext, Runnable runnable) {
        a aVar = this.f5063c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.f5040i;
        aVar.c(runnable, k.f5073f, false);
    }
}
