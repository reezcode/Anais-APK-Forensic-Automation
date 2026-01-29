package e0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes15.dex */
public final class r implements l {

    /* renamed from: b, reason: collision with root package name */
    public final Set<i0.h<?>> f2536b = Collections.newSetFromMap(new WeakHashMap());

    @Override // e0.l
    public final void d() {
        Iterator it = ((ArrayList) l0.k.e(this.f2536b)).iterator();
        while (it.hasNext()) {
            ((i0.h) it.next()).d();
        }
    }

    @Override // e0.l
    public final void onDestroy() {
        Iterator it = ((ArrayList) l0.k.e(this.f2536b)).iterator();
        while (it.hasNext()) {
            ((i0.h) it.next()).onDestroy();
        }
    }

    @Override // e0.l
    public final void onStart() {
        Iterator it = ((ArrayList) l0.k.e(this.f2536b)).iterator();
        while (it.hasNext()) {
            ((i0.h) it.next()).onStart();
        }
    }
}
