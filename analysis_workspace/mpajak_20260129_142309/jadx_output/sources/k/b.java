package k;

import java.lang.reflect.Type;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.concurrent.atomic.LongAdder;

/* loaded from: classes8.dex */
public final class b implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f3649a = new b();

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        a1 a1Var = g0Var.f3689j;
        if (obj instanceof LongAdder) {
            a1Var.s('{', "value", ((LongAdder) obj).longValue());
        } else {
            if (!(obj instanceof DoubleAdder)) {
                return;
            }
            double doubleValue = ((DoubleAdder) obj).doubleValue();
            a1Var.write(123);
            a1Var.q("value");
            a1Var.p(doubleValue, false);
        }
        a1Var.write(125);
    }
}
