package kotlin.random;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.ULongRange;

/* loaded from: classes10.dex */
public final class URandomKt {
    /* renamed from: checkUIntRangeBounds-J1ME1BU, reason: not valid java name */
    public static final void m1236checkUIntRangeBoundsJ1ME1BU(int i5, int i6) {
        if (!(UnsignedKt.uintCompare(i6, i5) > 0)) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(UInt.m104boximpl(i5), UInt.m104boximpl(i6)).toString());
        }
    }

    /* renamed from: checkULongRangeBounds-eb3DHEI, reason: not valid java name */
    public static final void m1237checkULongRangeBoundseb3DHEI(long j5, long j6) {
        if (!(UnsignedKt.ulongCompare(j6, j5) > 0)) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(ULong.m182boximpl(j5), ULong.m182boximpl(j6)).toString());
        }
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    public static final byte[] nextUBytes(Random random, int i5) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return UByteArray.m86constructorimpl(random.nextBytes(i5));
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: nextUBytes-EVgfTAA, reason: not valid java name */
    public static final byte[] m1238nextUBytesEVgfTAA(Random nextUBytes, byte[] array) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array);
        return array;
    }

    @SinceKotlin(version = "1.3")
    @ExperimentalUnsignedTypes
    /* renamed from: nextUBytes-Wvrt4B4, reason: not valid java name */
    public static final byte[] m1239nextUBytesWvrt4B4(Random nextUBytes, byte[] array, int i5, int i6) {
        Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array, i5, i6);
        return array;
    }

    /* renamed from: nextUBytes-Wvrt4B4$default, reason: not valid java name */
    public static /* synthetic */ byte[] m1240nextUBytesWvrt4B4$default(Random random, byte[] bArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = UByteArray.m92getSizeimpl(bArr);
        }
        return m1239nextUBytesWvrt4B4(random, bArr, i5, i6);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int nextUInt(Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return UInt.m110constructorimpl(random.nextInt());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int nextUInt(Random random, UIntRange range) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return UnsignedKt.uintCompare(range.m1246getLastpVg5ArA(), -1) < 0 ? m1241nextUInta8DCA5k(random, range.m1245getFirstpVg5ArA(), UInt.m110constructorimpl(range.m1246getLastpVg5ArA() + 1)) : UnsignedKt.uintCompare(range.m1245getFirstpVg5ArA(), 0) > 0 ? UInt.m110constructorimpl(m1241nextUInta8DCA5k(random, UInt.m110constructorimpl(range.m1245getFirstpVg5ArA() - 1), range.m1246getLastpVg5ArA()) + 1) : nextUInt(random);
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: nextUInt-a8DCA5k, reason: not valid java name */
    public static final int m1241nextUInta8DCA5k(Random nextUInt, int i5, int i6) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        m1236checkUIntRangeBoundsJ1ME1BU(i5, i6);
        return UInt.m110constructorimpl(nextUInt.nextInt(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: nextUInt-qCasIEU, reason: not valid java name */
    public static final int m1242nextUIntqCasIEU(Random nextUInt, int i5) {
        Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        return m1241nextUInta8DCA5k(nextUInt, 0, i5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long nextULong(Random random) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        return ULong.m188constructorimpl(random.nextLong());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long nextULong(Random random, ULongRange range) {
        Intrinsics.checkNotNullParameter(random, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        int ulongCompare = UnsignedKt.ulongCompare(range.m1255getLastsVKNKU(), -1L);
        long m1254getFirstsVKNKU = range.m1254getFirstsVKNKU();
        if (ulongCompare < 0) {
            return m1244nextULongjmpaWc(random, m1254getFirstsVKNKU, ULong.m188constructorimpl(ULong.m188constructorimpl(1 & 4294967295L) + range.m1255getLastsVKNKU()));
        }
        if (UnsignedKt.ulongCompare(m1254getFirstsVKNKU, 0L) <= 0) {
            return nextULong(random);
        }
        long j5 = 1 & 4294967295L;
        return ULong.m188constructorimpl(ULong.m188constructorimpl(j5) + m1244nextULongjmpaWc(random, ULong.m188constructorimpl(range.m1254getFirstsVKNKU() - ULong.m188constructorimpl(j5)), range.m1255getLastsVKNKU()));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: nextULong-V1Xi4fY, reason: not valid java name */
    public static final long m1243nextULongV1Xi4fY(Random nextULong, long j5) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        return m1244nextULongjmpaWc(nextULong, 0L, j5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: nextULong-jmpaW-c, reason: not valid java name */
    public static final long m1244nextULongjmpaWc(Random nextULong, long j5, long j6) {
        Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        m1237checkULongRangeBoundseb3DHEI(j5, j6);
        return ULong.m188constructorimpl(nextULong.nextLong(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }
}
