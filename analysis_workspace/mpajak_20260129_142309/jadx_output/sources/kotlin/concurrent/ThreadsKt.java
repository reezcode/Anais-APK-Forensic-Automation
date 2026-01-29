package kotlin.concurrent;

import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@JvmName(name = "ThreadsKt")
/* loaded from: classes16.dex */
public final class ThreadsKt {
    @InlineOnly
    private static final <T> T getOrSet(ThreadLocal<T> threadLocal, Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(threadLocal, "<this>");
        Intrinsics.checkNotNullParameter(function0, "default");
        T t4 = threadLocal.get();
        if (t4 != null) {
            return t4;
        }
        T invoke = function0.invoke();
        threadLocal.set(invoke);
        return invoke;
    }

    public static final Thread thread(boolean z4, boolean z5, ClassLoader classLoader, String str, int i5, final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Thread thread = new Thread() { // from class: kotlin.concurrent.ThreadsKt$thread$thread$1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                block.invoke();
            }
        };
        if (z5) {
            thread.setDaemon(true);
        }
        if (i5 > 0) {
            thread.setPriority(i5);
        }
        if (str != null) {
            thread.setName(str);
        }
        if (classLoader != null) {
            thread.setContextClassLoader(classLoader);
        }
        if (z4) {
            thread.start();
        }
        return thread;
    }
}
