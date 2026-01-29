package k;

import java.lang.reflect.Type;
import java.text.DecimalFormat;

/* loaded from: classes11.dex */
public final class w implements q0 {

    /* renamed from: b, reason: collision with root package name */
    public static final w f3749b = new w();

    /* renamed from: a, reason: collision with root package name */
    public DecimalFormat f3750a;

    public w() {
        this.f3750a = null;
    }

    public w(String str) {
        this.f3750a = new DecimalFormat(str);
    }

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        a1 a1Var = g0Var.f3689j;
        if (obj == null) {
            a1Var.I(b1.WriteNullNumberAsZero);
            return;
        }
        double doubleValue = ((Double) obj).doubleValue();
        if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
            a1Var.E();
            return;
        }
        DecimalFormat decimalFormat = this.f3750a;
        if (decimalFormat == null) {
            a1Var.p(doubleValue, true);
        } else {
            a1Var.write(decimalFormat.format(doubleValue));
        }
    }
}
