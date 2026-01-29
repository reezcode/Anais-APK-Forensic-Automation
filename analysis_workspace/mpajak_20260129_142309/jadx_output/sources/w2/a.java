package w2;

import java.lang.reflect.Field;

/* loaded from: classes14.dex */
public abstract class a extends d1.f implements v2.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f5752b;

    /* renamed from: c, reason: collision with root package name */
    public final Class<?>[] f5753c;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;[Ljava/lang/Class<*>;)V */
    public a(int i5, Class[] clsArr) {
        this.f5752b = i5;
        this.f5753c = clsArr;
    }

    @Override // v2.a
    public Object a(Number number) {
        return null;
    }

    @Override // v2.a
    public String[] b() {
        return null;
    }

    @Override // v2.a
    public Object f(v2.g gVar) {
        return null;
    }

    @Override // v2.a
    public final Class<?>[] g() {
        return this.f5753c;
    }

    @Override // v2.a
    public Class<?> h() {
        Class<?>[] clsArr = this.f5753c;
        if (clsArr.length == 0) {
            return null;
        }
        return clsArr[0];
    }

    @Override // v2.a
    public final boolean i() {
        return j();
    }

    @Override // v2.a
    public boolean j() {
        return !(this instanceof d);
    }

    @Override // v2.a
    public boolean k() {
        return this instanceof j0;
    }

    @Override // v2.a
    public boolean l() {
        return false;
    }

    @Override // v2.a
    public boolean m(Field field) {
        Class<?>[] clsArr = this.f5753c;
        if (clsArr.length == 0) {
            return true;
        }
        for (Class<?> cls : clsArr) {
            if (cls.isAssignableFrom(field.getType())) {
                return true;
            }
        }
        return false;
    }

    @Override // v2.a
    public int n() {
        return 0;
    }

    @Override // v2.a
    public Object o(Object obj) {
        return null;
    }

    @Override // v2.a
    public boolean p() {
        return this instanceof i;
    }

    @Override // v2.a
    public Object q() {
        throw new IllegalStateException("Should not have tried to generate this type");
    }

    @Override // v2.a
    public boolean r() {
        return !(this instanceof d);
    }

    @Override // v2.f
    public final int s() {
        return this.f5752b;
    }

    @Override // v2.a
    public boolean t() {
        return this instanceof h;
    }

    @Override // v2.a
    public boolean u() {
        return !(this instanceof c0);
    }

    @Override // v2.a
    public boolean w() {
        return this instanceof j0;
    }
}
