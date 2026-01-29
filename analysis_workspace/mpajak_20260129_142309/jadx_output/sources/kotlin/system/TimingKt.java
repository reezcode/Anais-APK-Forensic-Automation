package kotlin.system;

import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@JvmName(name = "TimingKt")
/* loaded from: classes20.dex */
public final class TimingKt {
    public static final long measureNanoTime(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long nanoTime = System.nanoTime();
        block.invoke();
        return System.nanoTime() - nanoTime;
    }

    public static final long measureTimeMillis(Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long currentTimeMillis = System.currentTimeMillis();
        block.invoke();
        return System.currentTimeMillis() - currentTimeMillis;
    }
}
