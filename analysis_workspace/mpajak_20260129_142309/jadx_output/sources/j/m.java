package j;

import java.lang.reflect.Type;

/* loaded from: classes25.dex */
public final class m implements s {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, f.f] */
    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        int i5;
        i.d dVar = (i.d) aVar.f3146g;
        String W = dVar.W(aVar.f3142c);
        dVar.y();
        int i6 = dVar.f3181b;
        if (i6 == 25) {
            String W2 = dVar.W(aVar.f3142c);
            W = androidx.activity.d.f(W, ".") + W2;
            dVar.y();
            i6 = dVar.f3181b;
        }
        ?? r12 = (T) new f.f(W);
        if (i6 != 10) {
            StringBuilder g5 = androidx.activity.d.g("illegal jsonp : ");
            g5.append(dVar.c());
            throw new f.d(g5.toString());
        }
        do {
            dVar.y();
            r12.f2691b.add(aVar.w(null));
            i5 = dVar.f3181b;
        } while (i5 == 16);
        if (i5 != 11) {
            StringBuilder g6 = androidx.activity.d.g("illegal jsonp : ");
            g6.append(dVar.c());
            throw new f.d(g6.toString());
        }
        dVar.y();
        if (dVar.f3181b == 24) {
            dVar.y();
        }
        return r12;
    }

    @Override // j.s
    public final int e() {
        return 0;
    }
}
