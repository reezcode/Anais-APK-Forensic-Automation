package kotlin;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class DeepRecursiveKt {
    private static final Object UNDEFINED_RESULT;

    static {
        Result.Companion companion = Result.Companion;
        UNDEFINED_RESULT = Result.m16constructorimpl(IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }

    private static /* synthetic */ void getUNDEFINED_RESULT$annotations() {
    }

    @SinceKotlin(version = "1.7")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T, R> R invoke(DeepRecursiveFunction<T, R> deepRecursiveFunction, T t4) {
        Intrinsics.checkNotNullParameter(deepRecursiveFunction, "<this>");
        return (R) new DeepRecursiveScopeImpl(deepRecursiveFunction.getBlock$kotlin_stdlib(), t4).runCallLoop();
    }
}
