package k;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes21.dex */
public final class g0 extends z0 {

    /* renamed from: i, reason: collision with root package name */
    public final x0 f3688i;

    /* renamed from: j, reason: collision with root package name */
    public final a1 f3689j;

    /* renamed from: k, reason: collision with root package name */
    public int f3690k;

    /* renamed from: l, reason: collision with root package name */
    public String f3691l;

    /* renamed from: m, reason: collision with root package name */
    public SimpleDateFormat f3692m;

    /* renamed from: n, reason: collision with root package name */
    public IdentityHashMap<Object, v0> f3693n;

    /* renamed from: o, reason: collision with root package name */
    public v0 f3694o;

    /* renamed from: p, reason: collision with root package name */
    public TimeZone f3695p;

    /* renamed from: q, reason: collision with root package name */
    public Locale f3696q;

    public g0() {
        this(new a1(), x0.f3759f);
    }

    public g0(a1 a1Var, x0 x0Var) {
        this.f3690k = 0;
        this.f3691l = "\t";
        this.f3693n = null;
        this.f3695p = f.a.f2678b;
        this.f3696q = f.a.f2679c;
        this.f3689j = a1Var;
        this.f3688i = x0Var;
    }

    public final boolean i(Object obj) {
        v0 v0Var;
        IdentityHashMap<Object, v0> identityHashMap = this.f3693n;
        if (identityHashMap == null || (v0Var = identityHashMap.get(obj)) == null) {
            return false;
        }
        Object obj2 = v0Var.f3747c;
        return obj2 == null || (obj2 instanceof Integer) || (obj2 instanceof String);
    }

    public final void j() {
        this.f3690k--;
    }

    public final q0 k(Class<?> cls) {
        return this.f3688i.c(cls);
    }

    public final void l() {
        this.f3690k++;
    }

    public final boolean m(Type type) {
        v0 v0Var;
        return this.f3689j.l(b1.WriteClassName) && !(type == null && this.f3689j.l(b1.NotWriteRootClassName) && ((v0Var = this.f3694o) == null || v0Var.f3745a == null));
    }

    public final void n() {
        this.f3689j.write(10);
        for (int i5 = 0; i5 < this.f3690k; i5++) {
            this.f3689j.write(this.f3691l);
        }
    }

    public final void o(v0 v0Var, Object obj, Object obj2) {
        p(v0Var, obj, obj2, 0, 0);
    }

    public final void p(v0 v0Var, Object obj, Object obj2, int i5, int i6) {
        if (this.f3689j.f3639i) {
            return;
        }
        this.f3694o = new v0(v0Var, obj, obj2, i5);
        if (this.f3693n == null) {
            this.f3693n = new IdentityHashMap<>();
        }
        this.f3693n.put(obj, this.f3694o);
    }

    public final void q(Object obj) {
        if (obj == null) {
            this.f3689j.E();
            return;
        }
        try {
            k(obj.getClass()).d(this, obj, null, null, 0);
        } catch (IOException e5) {
            throw new f.d(e5.getMessage(), e5);
        }
    }

    public final void r(String str) {
        a1 a1Var = this.f3689j;
        if (str == null) {
            a1Var.I(b1.WriteNullStringAsEmpty);
        } else {
            a1Var.J(str);
        }
    }

    public final void s() {
        this.f3689j.E();
    }

    public final void t(Object obj) {
        a1 a1Var;
        String str;
        a1 a1Var2;
        String str2;
        v0 v0Var = this.f3694o;
        if (obj == v0Var.f3746b) {
            a1Var2 = this.f3689j;
            str2 = "{\"$ref\":\"@\"}";
        } else {
            v0 v0Var2 = v0Var.f3745a;
            if (v0Var2 == null || obj != v0Var2.f3746b) {
                while (true) {
                    v0 v0Var3 = v0Var.f3745a;
                    if (v0Var3 == null) {
                        break;
                    } else {
                        v0Var = v0Var3;
                    }
                }
                if (obj == v0Var.f3746b) {
                    a1Var = this.f3689j;
                    str = "{\"$ref\":\"$\"}";
                } else {
                    this.f3689j.write("{\"$ref\":\"");
                    this.f3689j.write(this.f3693n.get(obj).toString());
                    a1Var = this.f3689j;
                    str = "\"}";
                }
                a1Var.write(str);
                return;
            }
            a1Var2 = this.f3689j;
            str2 = "{\"$ref\":\"..\"}";
        }
        a1Var2.write(str2);
    }

    public final String toString() {
        return this.f3689j.toString();
    }
}
