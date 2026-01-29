package kotlin;

import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

@JvmName(name = "UnsignedKt")
/* loaded from: classes13.dex */
public final class UnsignedKt {
    @PublishedApi
    public static final int doubleToUInt(double d5) {
        if (Double.isNaN(d5) || d5 <= uintToDouble(0)) {
            return 0;
        }
        if (d5 >= uintToDouble(-1)) {
            return -1;
        }
        if (d5 <= 2.147483647E9d) {
            return UInt.m110constructorimpl((int) d5);
        }
        return UInt.m110constructorimpl(UInt.m110constructorimpl(Integer.MAX_VALUE) + UInt.m110constructorimpl((int) (d5 - Integer.MAX_VALUE)));
    }

    @PublishedApi
    public static final long doubleToULong(double d5) {
        if (Double.isNaN(d5) || d5 <= ulongToDouble(0L)) {
            return 0L;
        }
        if (d5 >= ulongToDouble(-1L)) {
            return -1L;
        }
        return ULong.m188constructorimpl(d5 < 9.223372036854776E18d ? (long) d5 : ULong.m188constructorimpl((long) (d5 - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @PublishedApi
    public static final int uintCompare(int i5, int i6) {
        return Intrinsics.compare(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
    }

    @PublishedApi
    /* renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m363uintDivideJ1ME1BU(int i5, int i6) {
        return UInt.m110constructorimpl((int) ((i5 & 4294967295L) / (i6 & 4294967295L)));
    }

    @PublishedApi
    /* renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m364uintRemainderJ1ME1BU(int i5, int i6) {
        return UInt.m110constructorimpl((int) ((i5 & 4294967295L) % (i6 & 4294967295L)));
    }

    @PublishedApi
    public static final double uintToDouble(int i5) {
        return (((i5 >>> 31) << 30) * 2) + (Integer.MAX_VALUE & i5);
    }

    @PublishedApi
    public static final int ulongCompare(long j5, long j6) {
        return Intrinsics.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
    }

    @PublishedApi
    /* renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m365ulongDivideeb3DHEI(long j5, long j6) {
        if (j6 < 0) {
            return ulongCompare(j5, j6) < 0 ? ULong.m188constructorimpl(0L) : ULong.m188constructorimpl(1L);
        }
        if (j5 >= 0) {
            return ULong.m188constructorimpl(j5 / j6);
        }
        long j7 = ((j5 >>> 1) / j6) << 1;
        return ULong.m188constructorimpl(j7 + (ulongCompare(ULong.m188constructorimpl(j5 - (j7 * j6)), ULong.m188constructorimpl(j6)) < 0 ? 0 : 1));
    }

    @PublishedApi
    /* renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m366ulongRemaindereb3DHEI(long j5, long j6) {
        long j7;
        if (j6 < 0) {
            return ulongCompare(j5, j6) < 0 ? j5 : ULong.m188constructorimpl(j5 - j6);
        }
        if (j5 >= 0) {
            j7 = j5 % j6;
        } else {
            long j8 = j5 - ((((j5 >>> 1) / j6) << 1) * j6);
            if (ulongCompare(ULong.m188constructorimpl(j8), ULong.m188constructorimpl(j6)) < 0) {
                j6 = 0;
            }
            j7 = j8 - j6;
        }
        return ULong.m188constructorimpl(j7);
    }

    @PublishedApi
    public static final double ulongToDouble(long j5) {
        return ((j5 >>> 11) * 2048) + (j5 & 2047);
    }

    public static final String ulongToString(long j5) {
        return ulongToString(j5, 10);
    }

    public static final String ulongToString(long j5, int i5) {
        if (j5 >= 0) {
            String l5 = Long.toString(j5, CharsKt.checkRadix(i5));
            Intrinsics.checkNotNullExpressionValue(l5, "toString(this, checkRadix(radix))");
            return l5;
        }
        long j6 = i5;
        long j7 = ((j5 >>> 1) / j6) << 1;
        long j8 = j5 - (j7 * j6);
        if (j8 >= j6) {
            j8 -= j6;
            j7++;
        }
        StringBuilder sb = new StringBuilder();
        String l6 = Long.toString(j7, CharsKt.checkRadix(i5));
        Intrinsics.checkNotNullExpressionValue(l6, "toString(this, checkRadix(radix))");
        sb.append(l6);
        String l7 = Long.toString(j8, CharsKt.checkRadix(i5));
        Intrinsics.checkNotNullExpressionValue(l7, "toString(this, checkRadix(radix))");
        sb.append(l7);
        return sb.toString();
    }
}
