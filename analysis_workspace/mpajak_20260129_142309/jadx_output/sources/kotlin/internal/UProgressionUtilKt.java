package kotlin.internal;

import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UnsignedKt;

/* loaded from: classes16.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m1228differenceModuloWZ9TVnA(int i5, int i6, int i7) {
        int m364uintRemainderJ1ME1BU = UnsignedKt.m364uintRemainderJ1ME1BU(i5, i7);
        int m364uintRemainderJ1ME1BU2 = UnsignedKt.m364uintRemainderJ1ME1BU(i6, i7);
        int uintCompare = UnsignedKt.uintCompare(m364uintRemainderJ1ME1BU, m364uintRemainderJ1ME1BU2);
        int m110constructorimpl = UInt.m110constructorimpl(m364uintRemainderJ1ME1BU - m364uintRemainderJ1ME1BU2);
        return uintCompare >= 0 ? m110constructorimpl : UInt.m110constructorimpl(m110constructorimpl + i7);
    }

    /* renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m1229differenceModulosambcqE(long j5, long j6, long j7) {
        long m366ulongRemaindereb3DHEI = UnsignedKt.m366ulongRemaindereb3DHEI(j5, j7);
        long m366ulongRemaindereb3DHEI2 = UnsignedKt.m366ulongRemaindereb3DHEI(j6, j7);
        int ulongCompare = UnsignedKt.ulongCompare(m366ulongRemaindereb3DHEI, m366ulongRemaindereb3DHEI2);
        long m188constructorimpl = ULong.m188constructorimpl(m366ulongRemaindereb3DHEI - m366ulongRemaindereb3DHEI2);
        return ulongCompare >= 0 ? m188constructorimpl : ULong.m188constructorimpl(m188constructorimpl + j7);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m1230getProgressionLastElement7ftBX0g(long j5, long j6, long j7) {
        long m1229differenceModulosambcqE;
        if (j7 > 0) {
            if (UnsignedKt.ulongCompare(j5, j6) >= 0) {
                return j6;
            }
            m1229differenceModulosambcqE = j6 - m1229differenceModulosambcqE(j6, j5, ULong.m188constructorimpl(j7));
        } else {
            if (j7 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (UnsignedKt.ulongCompare(j5, j6) <= 0) {
                return j6;
            }
            m1229differenceModulosambcqE = j6 + m1229differenceModulosambcqE(j5, j6, ULong.m188constructorimpl(-j7));
        }
        return ULong.m188constructorimpl(m1229differenceModulosambcqE);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m1231getProgressionLastElementNkh28Cs(int i5, int i6, int i7) {
        int m1228differenceModuloWZ9TVnA;
        if (i7 > 0) {
            if (UnsignedKt.uintCompare(i5, i6) >= 0) {
                return i6;
            }
            m1228differenceModuloWZ9TVnA = i6 - m1228differenceModuloWZ9TVnA(i6, i5, UInt.m110constructorimpl(i7));
        } else {
            if (i7 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (UnsignedKt.uintCompare(i5, i6) <= 0) {
                return i6;
            }
            m1228differenceModuloWZ9TVnA = i6 + m1228differenceModuloWZ9TVnA(i5, i6, UInt.m110constructorimpl(-i7));
        }
        return UInt.m110constructorimpl(m1228differenceModuloWZ9TVnA);
    }
}
