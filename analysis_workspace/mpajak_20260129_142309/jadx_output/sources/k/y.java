package k;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Enumeration;

/* loaded from: classes16.dex */
public final class y implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public static y f3771a = new y();

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        a1 a1Var = g0Var.f3689j;
        if (obj == null) {
            a1Var.I(b1.WriteNullListAsEmpty);
            return;
        }
        Type type2 = null;
        int i6 = 0;
        if (a1Var.l(b1.WriteClassName) && (type instanceof ParameterizedType)) {
            type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        }
        Enumeration enumeration = (Enumeration) obj;
        v0 v0Var = g0Var.f3694o;
        g0Var.o(v0Var, obj, obj2);
        try {
            a1Var.write(91);
            while (enumeration.hasMoreElements()) {
                Object nextElement = enumeration.nextElement();
                int i7 = i6 + 1;
                if (i6 != 0) {
                    a1Var.write(44);
                }
                if (nextElement == null) {
                    a1Var.E();
                } else {
                    g0Var.k(nextElement.getClass()).d(g0Var, nextElement, Integer.valueOf(i7 - 1), type2, 0);
                }
                i6 = i7;
            }
            a1Var.write(93);
        } finally {
            g0Var.f3694o = v0Var;
        }
    }
}
