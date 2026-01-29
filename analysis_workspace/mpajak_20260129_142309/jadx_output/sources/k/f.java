package k;

import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class f implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f3684a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f3685b;

    public f(Class<?> cls, q0 q0Var) {
        this.f3684a = cls;
        this.f3685b = q0Var;
    }

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        a1 a1Var = g0Var.f3689j;
        if (obj == null) {
            a1Var.I(b1.WriteNullListAsEmpty);
            return;
        }
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        v0 v0Var = g0Var.f3694o;
        g0Var.o(v0Var, obj, obj2);
        try {
            a1Var.write(91);
            for (int i6 = 0; i6 < length; i6++) {
                if (i6 != 0) {
                    a1Var.write(44);
                }
                Object obj3 = objArr[i6];
                if (obj3 != null) {
                    (obj3.getClass() == this.f3684a ? this.f3685b : g0Var.k(obj3.getClass())).d(g0Var, obj3, Integer.valueOf(i6), null, 0);
                } else if (a1Var.l(b1.WriteNullStringAsEmpty) && (obj instanceof String[])) {
                    a1Var.J("");
                } else {
                    a1Var.a("null");
                }
            }
            a1Var.write(93);
        } finally {
            g0Var.f3694o = v0Var;
        }
    }
}
