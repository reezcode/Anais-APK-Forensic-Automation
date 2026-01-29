package m3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class y0 extends p implements i0, p0 {

    /* renamed from: e, reason: collision with root package name */
    public z0 f4224e;

    @Override // m3.p0
    public final b1 a() {
        return null;
    }

    @Override // m3.i0
    public final void c() {
        boolean z4;
        z0 l5 = l();
        do {
            Object x4 = l5.x();
            if (!(x4 instanceof y0)) {
                if (!(x4 instanceof p0) || ((p0) x4).a() == null) {
                    return;
                }
                j();
                return;
            }
            if (x4 != this) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z0.f4225b;
            j0 j0Var = a0.f4162g;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(l5, x4, j0Var)) {
                    z4 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(l5) != x4) {
                    z4 = false;
                    break;
                }
            }
        } while (!z4);
    }

    @Override // m3.p0
    public final boolean isActive() {
        return true;
    }

    public final z0 l() {
        z0 z0Var = this.f4224e;
        if (z0Var != null) {
            return z0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    @Override // q3.i
    public final String toString() {
        return getClass().getSimpleName() + '@' + a0.b(this) + "[job@" + a0.b(l()) + ']';
    }
}
