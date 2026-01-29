package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes25.dex */
public final class ULongArrayKt {
    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    private static final long[] ULongArray(int i5, Function1<? super Integer, ULong> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        long[] jArr = new long[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            jArr[i6] = init.invoke(Integer.valueOf(i6)).m239unboximpl();
        }
        return ULongArray.m242constructorimpl(jArr);
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    @InlineOnly
    /* renamed from: ulongArrayOf-QwZRm1k, reason: not valid java name */
    private static final long[] m258ulongArrayOfQwZRm1k(long... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements;
    }
}
