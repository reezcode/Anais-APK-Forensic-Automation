package k;

import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes25.dex */
public final class l0 implements q0, j.s {

    /* renamed from: a, reason: collision with root package name */
    public static l0 f3727a = new l0();

    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        Object n4;
        i.c cVar = aVar.f3146g;
        try {
            int q4 = cVar.q();
            if (q4 == 2) {
                long e5 = cVar.e();
                cVar.Q(16);
                n4 = (T) Long.valueOf(e5);
            } else {
                if (q4 == 12) {
                    f.e eVar = new f.e(true);
                    aVar.E(eVar);
                    n4 = (T) m.j.n(eVar);
                } else {
                    n4 = m.j.n(aVar.w(null));
                }
                if (n4 == null) {
                    return null;
                }
            }
            return type == AtomicLong.class ? (T) new AtomicLong(((Long) n4).longValue()) : (T) n4;
        } catch (Exception e6) {
            throw new f.d(androidx.appcompat.widget.a.i("parseLong error, field : ", obj), e6);
        }
    }

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        a1 a1Var = g0Var.f3689j;
        if (obj == null) {
            a1Var.I(b1.WriteNullNumberAsZero);
            return;
        }
        long longValue = ((Long) obj).longValue();
        a1Var.A(longValue);
        if (!a1Var.l(b1.WriteClassName) || longValue > 2147483647L || longValue < -2147483648L || type == Long.class || type == Long.TYPE) {
            return;
        }
        a1Var.write(76);
    }

    @Override // j.s
    public final int e() {
        return 2;
    }
}
