package e0;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes21.dex */
public final class a implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Set<l> f2507a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public boolean f2508b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2509c;

    @Override // e0.k
    public final void a(@NonNull l lVar) {
        this.f2507a.remove(lVar);
    }

    @Override // e0.k
    public final void b(@NonNull l lVar) {
        this.f2507a.add(lVar);
        if (this.f2509c) {
            lVar.onDestroy();
        } else if (this.f2508b) {
            lVar.onStart();
        } else {
            lVar.d();
        }
    }

    public final void c() {
        this.f2509c = true;
        Iterator it = ((ArrayList) l0.k.e(this.f2507a)).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onDestroy();
        }
    }

    public final void d() {
        this.f2508b = true;
        Iterator it = ((ArrayList) l0.k.e(this.f2507a)).iterator();
        while (it.hasNext()) {
            ((l) it.next()).onStart();
        }
    }

    public final void e() {
        this.f2508b = false;
        Iterator it = ((ArrayList) l0.k.e(this.f2507a)).iterator();
        while (it.hasNext()) {
            ((l) it.next()).d();
        }
    }
}
