package f;

import java.util.ArrayList;
import java.util.List;
import k.a1;
import k.b1;
import k.e0;
import k.g0;

/* loaded from: classes13.dex */
public final class f implements e0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f2689c = b1.BrowserSecure.f3675b;

    /* renamed from: a, reason: collision with root package name */
    public String f2690a;

    /* renamed from: b, reason: collision with root package name */
    public final List<Object> f2691b = new ArrayList();

    public f() {
    }

    public f(String str) {
        this.f2690a = str;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<java.lang.Object>] */
    @Override // k.e0
    public final void a(g0 g0Var, int i5) {
        a1 a1Var = g0Var.f3689j;
        int i6 = f2689c;
        if ((i5 & i6) != 0 || a1Var.f(i6)) {
            a1Var.write("/**/");
        }
        a1Var.write(this.f2690a);
        a1Var.write(40);
        for (int i7 = 0; i7 < this.f2691b.size(); i7++) {
            if (i7 != 0) {
                a1Var.write(44);
            }
            g0Var.q(this.f2691b.get(i7));
        }
        a1Var.write(41);
    }

    public final String toString() {
        return a.x(this);
    }
}
