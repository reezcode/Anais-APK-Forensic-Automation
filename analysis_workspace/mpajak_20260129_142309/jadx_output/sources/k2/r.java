package k2;

import java.lang.reflect.Method;

/* loaded from: classes25.dex */
public final class r extends d1.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f3856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3857c;

    public r(Method method, Object obj) {
        this.f3856b = method;
        this.f3857c = obj;
    }

    @Override // d1.f
    public final <T> T C(Class<T> cls) {
        d1.f.y(cls);
        return (T) this.f3856b.invoke(this.f3857c, cls);
    }
}
