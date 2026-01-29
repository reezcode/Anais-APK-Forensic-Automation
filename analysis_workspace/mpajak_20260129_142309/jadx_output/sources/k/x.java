package k;

import java.lang.reflect.Type;

/* loaded from: classes20.dex */
public final class x implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x f3758a = new x();

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        a1 a1Var = g0Var.f3689j;
        Enum r22 = (Enum) obj;
        if (r22 == null) {
            a1Var.E();
            return;
        }
        String str = null;
        if (a1Var.f3643m && !a1Var.f3644n) {
            str = r22.name();
        } else if (a1Var.f3644n) {
            str = r22.toString();
        }
        if (str == null) {
            a1Var.z(r22.ordinal());
            return;
        }
        int i6 = a1Var.l(b1.UseSingleQuotes) ? 39 : 34;
        a1Var.write(i6);
        a1Var.write(str);
        a1Var.write(i6);
    }
}
