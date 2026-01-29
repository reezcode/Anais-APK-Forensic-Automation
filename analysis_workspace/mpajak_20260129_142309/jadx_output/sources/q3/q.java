package q3;

import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* loaded from: classes2.dex */
public class q<T> extends m3.a<T> implements CoroutineStackFrame {
    @Override // m3.z0
    public final boolean B() {
        return true;
    }

    @Override // m3.a
    public void M(Object obj) {
        i.g.x(obj);
        throw null;
    }

    @Override // m3.z0
    public void g(Object obj) {
        f.a(IntrinsicsKt.intercepted(null), i.g.x(obj), null);
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }
}
