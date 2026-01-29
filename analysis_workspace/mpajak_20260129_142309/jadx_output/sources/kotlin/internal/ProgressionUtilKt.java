package kotlin.internal;

import kotlin.PublishedApi;

/* loaded from: classes9.dex */
public final class ProgressionUtilKt {
    private static final int differenceModulo(int i5, int i6, int i7) {
        return mod(mod(i5, i7) - mod(i6, i7), i7);
    }

    private static final long differenceModulo(long j5, long j6, long j7) {
        return mod(mod(j5, j7) - mod(j6, j7), j7);
    }

    @PublishedApi
    public static final int getProgressionLastElement(int i5, int i6, int i7) {
        if (i7 > 0) {
            return i5 >= i6 ? i6 : i6 - differenceModulo(i6, i5, i7);
        }
        if (i7 < 0) {
            return i5 <= i6 ? i6 : i6 + differenceModulo(i5, i6, -i7);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @PublishedApi
    public static final long getProgressionLastElement(long j5, long j6, long j7) {
        if (j7 > 0) {
            return j5 >= j6 ? j6 : j6 - differenceModulo(j6, j5, j7);
        }
        if (j7 < 0) {
            return j5 <= j6 ? j6 : j6 + differenceModulo(j5, j6, -j7);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    private static final int mod(int i5, int i6) {
        int i7 = i5 % i6;
        return i7 >= 0 ? i7 : i7 + i6;
    }

    private static final long mod(long j5, long j6) {
        long j7 = j5 % j6;
        return j7 >= 0 ? j7 : j7 + j6;
    }
}
