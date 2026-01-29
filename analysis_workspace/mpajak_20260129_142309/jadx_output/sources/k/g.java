package k;

import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes3.dex */
public final class g implements q0, j.s {

    /* renamed from: a, reason: collision with root package name */
    public static final g f3687a = new g();

    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.util.concurrent.atomic.AtomicLongArray] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.util.concurrent.atomic.AtomicIntegerArray] */
    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        if (aVar.f3146g.q() == 8) {
            aVar.f3146g.Q(16);
            return null;
        }
        f.b bVar = new f.b();
        aVar.y(bVar, null);
        int i5 = 0;
        if (type == AtomicIntegerArray.class) {
            ?? r4 = (T) new AtomicIntegerArray(bVar.size());
            while (i5 < bVar.size()) {
                r4.set(i5, m.j.l(bVar.get(i5)).intValue());
                i5++;
            }
            return r4;
        }
        ?? r42 = (T) new AtomicLongArray(bVar.size());
        while (i5 < bVar.size()) {
            r42.set(i5, m.j.n(bVar.get(i5)).longValue());
            i5++;
        }
        return r42;
    }

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        a1 a1Var = g0Var.f3689j;
        if (obj instanceof AtomicInteger) {
            a1Var.z(((AtomicInteger) obj).get());
            return;
        }
        if (obj instanceof AtomicLong) {
            a1Var.A(((AtomicLong) obj).get());
            return;
        }
        if (obj instanceof AtomicBoolean) {
            a1Var.a(((AtomicBoolean) obj).get() ? "true" : "false");
            return;
        }
        if (obj == null) {
            a1Var.I(b1.WriteNullListAsEmpty);
            return;
        }
        int i6 = 0;
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            int length = atomicIntegerArray.length();
            a1Var.write(91);
            while (i6 < length) {
                int i7 = atomicIntegerArray.get(i6);
                if (i6 != 0) {
                    a1Var.write(44);
                }
                a1Var.z(i7);
                i6++;
            }
            a1Var.write(93);
            return;
        }
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        int length2 = atomicLongArray.length();
        a1Var.write(91);
        while (i6 < length2) {
            long j5 = atomicLongArray.get(i6);
            if (i6 != 0) {
                a1Var.write(44);
            }
            a1Var.A(j5);
            i6++;
        }
        a1Var.write(93);
    }

    @Override // j.s
    public final int e() {
        return 14;
    }
}
