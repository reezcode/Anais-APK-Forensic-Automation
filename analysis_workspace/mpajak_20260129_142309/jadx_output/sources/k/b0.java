package k;

import com.google.common.collect.Multimap;
import java.lang.reflect.Type;

/* loaded from: classes11.dex */
public final class b0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public static b0 f3650a = new b0();

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        a1 a1Var = g0Var.f3689j;
        if (obj instanceof Multimap) {
            g0Var.q(((Multimap) obj).asMap());
        }
    }
}
