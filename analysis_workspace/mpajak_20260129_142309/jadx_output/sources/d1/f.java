package d1;

import java.lang.reflect.Modifier;
import java.util.List;
import p2.a;
import s3.g0;
import s3.u;
import w2.c0;

/* loaded from: classes21.dex */
public abstract class f implements v2.f {

    /* renamed from: a, reason: collision with root package name */
    public static a.C0059a f2481a;

    public static void y(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException(androidx.appcompat.view.a.g(cls, androidx.activity.d.g("Interface can't be instantiated! Interface name: ")));
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException(androidx.appcompat.view.a.g(cls, androidx.activity.d.g("Abstract class can't be instantiated! Class name: ")));
        }
    }

    public abstract long A();

    public abstract u B();

    public abstract Object C(Class cls);

    public abstract void D(int i5);

    public abstract void E();

    public abstract void F();

    public abstract void G();

    public abstract void H(g0 g0Var, String str);

    public abstract void I(g0 g0Var);

    public Object J(v2.g gVar, Object obj, int i5) {
        return obj;
    }

    public abstract void K(f4.g gVar);

    public abstract void L(Throwable th, Throwable th2);

    @Override // v2.f
    public boolean c() {
        return this instanceof c0;
    }

    @Override // v2.f
    public Object e(v2.g gVar, Object obj) {
        return obj;
    }

    @Override // v2.f
    public Object v(v2.g gVar, c3.e eVar, int i5) {
        Object d5 = d(eVar, i5);
        if (d5 == null) {
            return null;
        }
        return J(gVar, d5, i5);
    }

    public abstract List z(List list, String str);
}
