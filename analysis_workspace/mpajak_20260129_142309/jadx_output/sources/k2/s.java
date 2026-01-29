package k2;

import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class s extends d1.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f3858b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3859c;

    public s(Method method, int i5) {
        this.f3858b = method;
        this.f3859c = i5;
    }

    @Override // d1.f
    public final <T> T C(Class<T> cls) {
        d1.f.y(cls);
        return (T) this.f3858b.invoke(null, cls, Integer.valueOf(this.f3859c));
    }
}
