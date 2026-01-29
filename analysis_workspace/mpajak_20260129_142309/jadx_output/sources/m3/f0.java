package m3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* loaded from: classes3.dex */
public final class f0<T> extends q3.q<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4175d = AtomicIntegerFieldUpdater.newUpdater(f0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    @Override // q3.q, m3.a
    public final void M(Object obj) {
        boolean z4;
        while (true) {
            int i5 = this._decision;
            z4 = false;
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (f4175d.compareAndSet(this, 0, 2)) {
                z4 = true;
                break;
            }
        }
        if (z4) {
            return;
        }
        q3.f.a(IntrinsicsKt.intercepted(null), i.g.x(obj), null);
    }

    @Override // q3.q, m3.z0
    public final void g(Object obj) {
        M(obj);
    }
}
