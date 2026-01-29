package k2;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class t extends d1.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f3860b;

    public t(Method method) {
        this.f3860b = method;
    }

    @Override // d1.f
    public final <T> T C(Class<T> cls) {
        d1.f.y(cls);
        return (T) this.f3860b.invoke(null, cls, Object.class);
    }
}
