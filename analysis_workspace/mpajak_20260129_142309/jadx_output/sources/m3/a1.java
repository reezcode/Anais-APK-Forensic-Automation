package m3;

/* loaded from: classes9.dex */
public abstract class a1 extends v {
    @Override // m3.v
    public String toString() {
        String z4 = z();
        if (z4 != null) {
            return z4;
        }
        return getClass().getSimpleName() + '@' + a0.b(this);
    }

    public abstract a1 y();

    public final String z() {
        a1 a1Var;
        r3.c cVar = h0.f4179a;
        a1 a1Var2 = q3.m.f4787a;
        if (this == a1Var2) {
            return "Dispatchers.Main";
        }
        try {
            a1Var = a1Var2.y();
        } catch (UnsupportedOperationException unused) {
            a1Var = null;
        }
        if (this == a1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
