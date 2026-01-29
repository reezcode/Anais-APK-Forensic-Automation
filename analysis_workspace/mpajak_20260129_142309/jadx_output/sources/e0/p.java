package e0;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes23.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Set<h0.c> f2526a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public final List<h0.c> f2527b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2528c;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<h0.c>] */
    public final boolean a(@Nullable h0.c cVar) {
        boolean z4 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = this.f2526a.remove(cVar);
        if (!this.f2527b.remove(cVar) && !remove) {
            z4 = false;
        }
        if (z4) {
            cVar.clear();
        }
        return z4;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<h0.c>] */
    public final void b() {
        Iterator it = ((ArrayList) l0.k.e(this.f2526a)).iterator();
        while (it.hasNext()) {
            h0.c cVar = (h0.c) it.next();
            if (!cVar.j() && !cVar.e()) {
                cVar.clear();
                if (this.f2528c) {
                    this.f2527b.add(cVar);
                } else {
                    cVar.i();
                }
            }
        }
    }

    public final String toString() {
        return super.toString() + "{numRequests=" + this.f2526a.size() + ", isPaused=" + this.f2528c + "}";
    }
}
