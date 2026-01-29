package k;

import java.lang.reflect.Type;
import java.math.BigDecimal;

/* loaded from: classes14.dex */
public final class l implements q0, j.s {

    /* renamed from: a, reason: collision with root package name */
    public static final l f3726a = new l();

    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        try {
            i.c cVar = aVar.f3146g;
            if (cVar.q() != 2 && cVar.q() != 3) {
                Object w4 = aVar.w(null);
                if (w4 == null) {
                    return null;
                }
                return (T) m.j.d(w4);
            }
            T t4 = (T) cVar.U();
            cVar.Q(16);
            return t4;
        } catch (Exception e5) {
            throw new f.d(androidx.appcompat.widget.a.i("parseDecimal error, field : ", obj), e5);
        }
    }

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        a1 a1Var = g0Var.f3689j;
        if (obj == null) {
            a1Var.I(b1.WriteNullNumberAsZero);
            return;
        }
        BigDecimal bigDecimal = (BigDecimal) obj;
        a1Var.write(a1Var.l(b1.WriteBigDecimalAsPlain) ? bigDecimal.toPlainString() : bigDecimal.toString());
        if (a1Var.l(b1.WriteClassName) && type != BigDecimal.class && bigDecimal.scale() == 0) {
            a1Var.write(46);
        }
    }

    @Override // j.s
    public final int e() {
        return 2;
    }
}
