package k2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes24.dex */
public final class g implements q<Object> {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Constructor f3821e;

    public g(Constructor constructor) {
        this.f3821e = constructor;
    }

    @Override // k2.q
    public final Object c() {
        try {
            return this.f3821e.newInstance(new Object[0]);
        } catch (IllegalAccessException e5) {
            throw new AssertionError(e5);
        } catch (InstantiationException e6) {
            StringBuilder g5 = androidx.activity.d.g("Failed to invoke ");
            g5.append(this.f3821e);
            g5.append(" with no args");
            throw new RuntimeException(g5.toString(), e6);
        } catch (InvocationTargetException e7) {
            StringBuilder g6 = androidx.activity.d.g("Failed to invoke ");
            g6.append(this.f3821e);
            g6.append(" with no args");
            throw new RuntimeException(g6.toString(), e7.getTargetException());
        }
    }
}
