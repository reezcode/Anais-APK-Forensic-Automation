package k;

import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.Objects;

/* loaded from: classes17.dex */
public final class a0 implements q0, j.s {

    /* renamed from: b, reason: collision with root package name */
    public static a0 f3628b = new a0();

    /* renamed from: a, reason: collision with root package name */
    public DecimalFormat f3629a;

    public a0() {
    }

    public a0(String str) {
        this.f3629a = new DecimalFormat(str);
    }

    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        float l5;
        try {
            i.c cVar = aVar.f3146g;
            if (cVar.q() == 2) {
                String i02 = cVar.i0();
                cVar.Q(16);
                l5 = Float.parseFloat(i02);
            } else {
                if (cVar.q() != 3) {
                    Object w4 = aVar.w(null);
                    if (w4 == null) {
                        return null;
                    }
                    return (T) m.j.k(w4);
                }
                l5 = cVar.l();
                cVar.Q(16);
            }
            return (T) Float.valueOf(l5);
        } catch (Exception e5) {
            throw new f.d(androidx.appcompat.widget.a.i("parseLong error, field : ", obj), e5);
        }
    }

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        a1 a1Var = g0Var.f3689j;
        if (obj == null) {
            a1Var.I(b1.WriteNullNumberAsZero);
            return;
        }
        float floatValue = ((Float) obj).floatValue();
        DecimalFormat decimalFormat = this.f3629a;
        if (decimalFormat != null) {
            a1Var.write(decimalFormat.format(floatValue));
            return;
        }
        Objects.requireNonNull(a1Var);
        if (Float.isNaN(floatValue) || Float.isInfinite(floatValue)) {
            a1Var.E();
            return;
        }
        String f5 = Float.toString(floatValue);
        if (a1Var.l(b1.WriteNullNumberAsZero) && f5.endsWith(".0")) {
            f5 = f5.substring(0, f5.length() - 2);
        }
        a1Var.write(f5);
        if (a1Var.l(b1.WriteClassName)) {
            a1Var.write(70);
        }
    }

    @Override // j.s
    public final int e() {
        return 2;
    }
}
