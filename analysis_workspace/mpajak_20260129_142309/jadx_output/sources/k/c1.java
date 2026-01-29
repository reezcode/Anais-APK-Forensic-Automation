package k;

import java.lang.reflect.Type;

/* loaded from: classes15.dex */
public final class c1 implements q0, j.s {

    /* renamed from: a, reason: collision with root package name */
    public static c1 f3679a = new c1();

    public static <T> T f(i.a aVar) {
        T t4;
        i.c cVar = aVar.f3146g;
        if (cVar.q() == 4) {
            t4 = (T) cVar.k0();
        } else {
            if (cVar.q() != 2) {
                Object w4 = aVar.w(null);
                if (w4 == null) {
                    return null;
                }
                return (T) w4.toString();
            }
            t4 = (T) cVar.i0();
        }
        cVar.Q(16);
        return t4;
    }

    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        if (type == StringBuffer.class) {
            i.c cVar = aVar.f3146g;
            if (cVar.q() == 4) {
                String k02 = cVar.k0();
                cVar.Q(16);
                return (T) new StringBuffer(k02);
            }
            Object w4 = aVar.w(null);
            if (w4 == null) {
                return null;
            }
            return (T) new StringBuffer(w4.toString());
        }
        if (type != StringBuilder.class) {
            return (T) f(aVar);
        }
        i.c cVar2 = aVar.f3146g;
        if (cVar2.q() == 4) {
            String k03 = cVar2.k0();
            cVar2.Q(16);
            return (T) new StringBuilder(k03);
        }
        Object w5 = aVar.w(null);
        if (w5 == null) {
            return null;
        }
        return (T) new StringBuilder(w5.toString());
    }

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        String str = (String) obj;
        a1 a1Var = g0Var.f3689j;
        if (str == null) {
            a1Var.I(b1.WriteNullStringAsEmpty);
        } else {
            a1Var.J(str);
        }
    }

    @Override // j.s
    public final int e() {
        return 4;
    }
}
