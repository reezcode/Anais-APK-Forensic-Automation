package m3;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public final class i1 extends v {

    /* renamed from: c, reason: collision with root package name */
    public static final i1 f4183c = new i1();

    @Override // m3.v
    public final void c(CoroutineContext coroutineContext, Runnable runnable) {
        if (((l1) coroutineContext.get(l1.f4195b)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // m3.v
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
