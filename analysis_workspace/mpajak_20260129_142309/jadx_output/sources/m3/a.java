package m3;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import m3.u0;

/* loaded from: classes15.dex */
public abstract class a<T> extends z0 implements Continuation<T>, y {

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineContext f4155c;

    public a(CoroutineContext coroutineContext, boolean z4) {
        super(z4);
        A((u0) coroutineContext.get(u0.b.f4217b));
        this.f4155c = coroutineContext.plus(this);
    }

    @Override // m3.z0
    public final String C() {
        return super.C();
    }

    @Override // m3.z0
    public final void F(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            Throwable th = nVar.f4202a;
            nVar.a();
        }
    }

    public void M(Object obj) {
        g(obj);
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f4155c;
    }

    @Override // m3.z0, m3.u0
    public final boolean isActive() {
        return super.isActive();
    }

    @Override // m3.z0
    public final String j() {
        return getClass().getSimpleName() + " was cancelled";
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Object K;
        Object H = i.g.H(obj, null);
        do {
            K = K(x(), H);
            if (K == a0.f4156a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + H;
                n nVar = H instanceof n ? (n) H : null;
                throw new IllegalStateException(str, nVar != null ? nVar.f4202a : null);
            }
        } while (K == a0.f4158c);
        if (K == a0.f4157b) {
            return;
        }
        M(K);
    }

    @Override // m3.z0
    public final void z(Throwable th) {
        d1.d.g(this.f4155c, th);
    }
}
