package kotlin.coroutines.jvm.internal;

import kotlin.SinceKotlin;

@SinceKotlin(version = "1.3")
/* loaded from: classes15.dex */
public interface CoroutineStackFrame {
    CoroutineStackFrame getCallerFrame();

    StackTraceElement getStackTraceElement();
}
