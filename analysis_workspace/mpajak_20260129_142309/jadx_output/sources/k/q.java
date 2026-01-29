package k;

import java.lang.reflect.Type;

/* loaded from: classes9.dex */
public final class q implements q0, j.s {

    /* renamed from: a, reason: collision with root package name */
    public static final q f3739a = new q();

    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        Object w4 = aVar.w(null);
        if (w4 == null) {
            return null;
        }
        return (T) m.j.h(w4);
    }

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        a1 a1Var = g0Var.f3689j;
        Character ch = (Character) obj;
        if (ch == null) {
            a1Var.J("");
        } else {
            a1Var.J(ch.charValue() == 0 ? "\u0000" : ch.toString());
        }
    }

    @Override // j.s
    public final int e() {
        return 4;
    }
}
