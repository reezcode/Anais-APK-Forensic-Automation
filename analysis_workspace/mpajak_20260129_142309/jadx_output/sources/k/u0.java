package k;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes20.dex */
public final class u0 implements q0, j.s {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f3743a = new u0();

    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Object A = aVar.A(parameterizedType.getActualTypeArguments()[0], null);
        Type rawType = parameterizedType.getRawType();
        if (rawType == AtomicReference.class) {
            return (T) new AtomicReference(A);
        }
        if (rawType == WeakReference.class) {
            return (T) new WeakReference(A);
        }
        if (rawType == SoftReference.class) {
            return (T) new SoftReference(A);
        }
        throw new UnsupportedOperationException(rawType.toString());
    }

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        g0Var.q(obj instanceof AtomicReference ? ((AtomicReference) obj).get() : ((Reference) obj).get());
    }

    @Override // j.s
    public final int e() {
        return 12;
    }
}
