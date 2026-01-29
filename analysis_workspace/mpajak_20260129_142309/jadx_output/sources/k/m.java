package k;

import java.lang.reflect.Type;
import java.math.BigInteger;

/* loaded from: classes6.dex */
public final class m implements q0, j.s {

    /* renamed from: a, reason: collision with root package name */
    public static final m f3728a = new m();

    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        i.c cVar = aVar.f3146g;
        if (cVar.q() == 2) {
            String i02 = cVar.i0();
            cVar.Q(16);
            return (T) new BigInteger(i02);
        }
        Object w4 = aVar.w(null);
        if (w4 == null) {
            return null;
        }
        return (T) m.j.e(w4);
    }

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        a1 a1Var = g0Var.f3689j;
        if (obj == null) {
            a1Var.I(b1.WriteNullNumberAsZero);
        } else {
            a1Var.write(((BigInteger) obj).toString());
        }
    }

    @Override // j.s
    public final int e() {
        return 2;
    }
}
