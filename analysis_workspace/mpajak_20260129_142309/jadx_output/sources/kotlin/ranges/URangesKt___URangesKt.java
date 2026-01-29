package kotlin.ranges;

import androidx.activity.d;
import java.util.NoSuchElementException;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.URandomKt;
import kotlin.ranges.UIntProgression;
import kotlin.ranges.ULongProgression;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes25.dex */
class URangesKt___URangesKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtLeast-5PvTz6A, reason: not valid java name */
    public static final short m1263coerceAtLeast5PvTz6A(short s4, short s5) {
        return Intrinsics.compare(s4 & 65535, 65535 & s5) < 0 ? s5 : s4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtLeast-J1ME1BU, reason: not valid java name */
    public static final int m1264coerceAtLeastJ1ME1BU(int i5, int i6) {
        return UnsignedKt.uintCompare(i5, i6) < 0 ? i6 : i5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtLeast-Kr8caGY, reason: not valid java name */
    public static final byte m1265coerceAtLeastKr8caGY(byte b5, byte b6) {
        return Intrinsics.compare(b5 & 255, b6 & 255) < 0 ? b6 : b5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtLeast-eb3DHEI, reason: not valid java name */
    public static final long m1266coerceAtLeasteb3DHEI(long j5, long j6) {
        return UnsignedKt.ulongCompare(j5, j6) < 0 ? j6 : j5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtMost-5PvTz6A, reason: not valid java name */
    public static final short m1267coerceAtMost5PvTz6A(short s4, short s5) {
        return Intrinsics.compare(s4 & 65535, 65535 & s5) > 0 ? s5 : s4;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtMost-J1ME1BU, reason: not valid java name */
    public static final int m1268coerceAtMostJ1ME1BU(int i5, int i6) {
        return UnsignedKt.uintCompare(i5, i6) > 0 ? i6 : i5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtMost-Kr8caGY, reason: not valid java name */
    public static final byte m1269coerceAtMostKr8caGY(byte b5, byte b6) {
        return Intrinsics.compare(b5 & 255, b6 & 255) > 0 ? b6 : b5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceAtMost-eb3DHEI, reason: not valid java name */
    public static final long m1270coerceAtMosteb3DHEI(long j5, long j6) {
        return UnsignedKt.ulongCompare(j5, j6) > 0 ? j6 : j5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-JPwROB0, reason: not valid java name */
    public static final long m1271coerceInJPwROB0(long j5, ClosedRange<ULong> range) {
        ULong endInclusive;
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((ULong) RangesKt___RangesKt.coerceIn(ULong.m182boximpl(j5), (ClosedFloatingPointRange<ULong>) range)).m239unboximpl();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + FilenameUtils.EXTENSION_SEPARATOR);
        }
        if (UnsignedKt.ulongCompare(j5, range.getStart().m239unboximpl()) < 0) {
            endInclusive = range.getStart();
        } else {
            if (UnsignedKt.ulongCompare(j5, range.getEndInclusive().m239unboximpl()) <= 0) {
                return j5;
            }
            endInclusive = range.getEndInclusive();
        }
        return endInclusive.m239unboximpl();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-VKSA0NQ, reason: not valid java name */
    public static final short m1272coerceInVKSA0NQ(short s4, short s5, short s6) {
        int i5 = s5 & 65535;
        int i6 = s6 & 65535;
        if (Intrinsics.compare(i5, i6) <= 0) {
            int i7 = 65535 & s4;
            return Intrinsics.compare(i7, i5) < 0 ? s5 : Intrinsics.compare(i7, i6) > 0 ? s6 : s4;
        }
        StringBuilder g5 = d.g("Cannot coerce value to an empty range: maximum ");
        g5.append((Object) UShort.m337toStringimpl(s6));
        g5.append(" is less than minimum ");
        g5.append((Object) UShort.m337toStringimpl(s5));
        g5.append(FilenameUtils.EXTENSION_SEPARATOR);
        throw new IllegalArgumentException(g5.toString());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-WZ9TVnA, reason: not valid java name */
    public static final int m1273coerceInWZ9TVnA(int i5, int i6, int i7) {
        if (UnsignedKt.uintCompare(i6, i7) <= 0) {
            return UnsignedKt.uintCompare(i5, i6) < 0 ? i6 : UnsignedKt.uintCompare(i5, i7) > 0 ? i7 : i5;
        }
        StringBuilder g5 = d.g("Cannot coerce value to an empty range: maximum ");
        g5.append((Object) UInt.m155toStringimpl(i7));
        g5.append(" is less than minimum ");
        g5.append((Object) UInt.m155toStringimpl(i6));
        g5.append(FilenameUtils.EXTENSION_SEPARATOR);
        throw new IllegalArgumentException(g5.toString());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-b33U2AM, reason: not valid java name */
    public static final byte m1274coerceInb33U2AM(byte b5, byte b6, byte b7) {
        int i5 = b6 & 255;
        int i6 = b7 & 255;
        if (Intrinsics.compare(i5, i6) <= 0) {
            int i7 = b5 & 255;
            return Intrinsics.compare(i7, i5) < 0 ? b6 : Intrinsics.compare(i7, i6) > 0 ? b7 : b5;
        }
        StringBuilder g5 = d.g("Cannot coerce value to an empty range: maximum ");
        g5.append((Object) UByte.m77toStringimpl(b7));
        g5.append(" is less than minimum ");
        g5.append((Object) UByte.m77toStringimpl(b6));
        g5.append(FilenameUtils.EXTENSION_SEPARATOR);
        throw new IllegalArgumentException(g5.toString());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-sambcqE, reason: not valid java name */
    public static final long m1275coerceInsambcqE(long j5, long j6, long j7) {
        if (UnsignedKt.ulongCompare(j6, j7) <= 0) {
            return UnsignedKt.ulongCompare(j5, j6) < 0 ? j6 : UnsignedKt.ulongCompare(j5, j7) > 0 ? j7 : j5;
        }
        StringBuilder g5 = d.g("Cannot coerce value to an empty range: maximum ");
        g5.append((Object) ULong.m233toStringimpl(j7));
        g5.append(" is less than minimum ");
        g5.append((Object) ULong.m233toStringimpl(j6));
        g5.append(FilenameUtils.EXTENSION_SEPARATOR);
        throw new IllegalArgumentException(g5.toString());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: coerceIn-wuiCnnA, reason: not valid java name */
    public static final int m1276coerceInwuiCnnA(int i5, ClosedRange<UInt> range) {
        UInt endInclusive;
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((UInt) RangesKt___RangesKt.coerceIn(UInt.m104boximpl(i5), (ClosedFloatingPointRange<UInt>) range)).m161unboximpl();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + FilenameUtils.EXTENSION_SEPARATOR);
        }
        if (UnsignedKt.uintCompare(i5, range.getStart().m161unboximpl()) < 0) {
            endInclusive = range.getStart();
        } else {
            if (UnsignedKt.uintCompare(i5, range.getEndInclusive().m161unboximpl()) <= 0) {
                return i5;
            }
            endInclusive = range.getEndInclusive();
        }
        return endInclusive.m161unboximpl();
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-68kG9v0, reason: not valid java name */
    public static final boolean m1277contains68kG9v0(UIntRange contains, byte b5) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1250containsWZ4Q5Ns(UInt.m110constructorimpl(b5 & 255));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: contains-GYNo2lE, reason: not valid java name */
    private static final boolean m1278containsGYNo2lE(ULongRange contains, ULong uLong) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return uLong != null && contains.m1259containsVKZWuLQ(uLong.m239unboximpl());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-Gab390E, reason: not valid java name */
    public static final boolean m1279containsGab390E(ULongRange contains, int i5) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1259containsVKZWuLQ(ULong.m188constructorimpl(i5 & 4294967295L));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-ULb-yJY, reason: not valid java name */
    public static final boolean m1280containsULbyJY(ULongRange contains, byte b5) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1259containsVKZWuLQ(ULong.m188constructorimpl(b5 & 255));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-ZsK3CEQ, reason: not valid java name */
    public static final boolean m1281containsZsK3CEQ(UIntRange contains, short s4) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1250containsWZ4Q5Ns(UInt.m110constructorimpl(s4 & 65535));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: contains-biwQdVI, reason: not valid java name */
    private static final boolean m1282containsbiwQdVI(UIntRange contains, UInt uInt) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return uInt != null && contains.m1250containsWZ4Q5Ns(uInt.m161unboximpl());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-fz5IDCE, reason: not valid java name */
    public static final boolean m1283containsfz5IDCE(UIntRange contains, long j5) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return ULong.m188constructorimpl(j5 >>> 32) == 0 && contains.m1250containsWZ4Q5Ns(UInt.m110constructorimpl((int) j5));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: contains-uhHAxoY, reason: not valid java name */
    public static final boolean m1284containsuhHAxoY(ULongRange contains, short s4) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1259containsVKZWuLQ(ULong.m188constructorimpl(s4 & 65535));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: downTo-5PvTz6A, reason: not valid java name */
    public static final UIntProgression m1285downTo5PvTz6A(short s4, short s5) {
        return UIntProgression.Companion.m1247fromClosedRangeNkh28Cs(UInt.m110constructorimpl(s4 & 65535), UInt.m110constructorimpl(s5 & 65535), -1);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: downTo-J1ME1BU, reason: not valid java name */
    public static final UIntProgression m1286downToJ1ME1BU(int i5, int i6) {
        return UIntProgression.Companion.m1247fromClosedRangeNkh28Cs(i5, i6, -1);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: downTo-Kr8caGY, reason: not valid java name */
    public static final UIntProgression m1287downToKr8caGY(byte b5, byte b6) {
        return UIntProgression.Companion.m1247fromClosedRangeNkh28Cs(UInt.m110constructorimpl(b5 & 255), UInt.m110constructorimpl(b6 & 255), -1);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: downTo-eb3DHEI, reason: not valid java name */
    public static final ULongProgression m1288downToeb3DHEI(long j5, long j6) {
        return ULongProgression.Companion.m1256fromClosedRange7ftBX0g(j5, j6, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final int first(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (!uIntProgression.isEmpty()) {
            return uIntProgression.m1245getFirstpVg5ArA();
        }
        throw new NoSuchElementException("Progression " + uIntProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final long first(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (!uLongProgression.isEmpty()) {
            return uLongProgression.m1254getFirstsVKNKU();
        }
        throw new NoSuchElementException("Progression " + uLongProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final UInt firstOrNull(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.m104boximpl(uIntProgression.m1245getFirstpVg5ArA());
    }

    @SinceKotlin(version = "1.7")
    public static final ULong firstOrNull(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.m182boximpl(uLongProgression.m1254getFirstsVKNKU());
    }

    @SinceKotlin(version = "1.7")
    public static final int last(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (!uIntProgression.isEmpty()) {
            return uIntProgression.m1246getLastpVg5ArA();
        }
        throw new NoSuchElementException("Progression " + uIntProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final long last(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (!uLongProgression.isEmpty()) {
            return uLongProgression.m1255getLastsVKNKU();
        }
        throw new NoSuchElementException("Progression " + uLongProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final UInt lastOrNull(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.m104boximpl(uIntProgression.m1246getLastpVg5ArA());
    }

    @SinceKotlin(version = "1.7")
    public static final ULong lastOrNull(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.m182boximpl(uLongProgression.m1255getLastsVKNKU());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final int random(UIntRange uIntRange) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        return random(uIntRange, Random.Default);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final int random(UIntRange uIntRange, Random random) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return URandomKt.nextUInt(random, uIntRange);
        } catch (IllegalArgumentException e5) {
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final long random(ULongRange uLongRange) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        return random(uLongRange, Random.Default);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final long random(ULongRange uLongRange, Random random) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return URandomKt.nextULong(random, uLongRange);
        } catch (IllegalArgumentException e5) {
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final UInt randomOrNull(UIntRange uIntRange) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        return randomOrNull(uIntRange, Random.Default);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    public static final UInt randomOrNull(UIntRange uIntRange, Random random) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (uIntRange.isEmpty()) {
            return null;
        }
        return UInt.m104boximpl(URandomKt.nextUInt(random, uIntRange));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final ULong randomOrNull(ULongRange uLongRange) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        return randomOrNull(uLongRange, Random.Default);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    public static final ULong randomOrNull(ULongRange uLongRange, Random random) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (uLongRange.isEmpty()) {
            return null;
        }
        return ULong.m182boximpl(URandomKt.nextULong(random, uLongRange));
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    /* renamed from: rangeUntil-5PvTz6A, reason: not valid java name */
    private static final UIntRange m1289rangeUntil5PvTz6A(short s4, short s5) {
        return m1293until5PvTz6A(s4, s5);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    /* renamed from: rangeUntil-J1ME1BU, reason: not valid java name */
    private static final UIntRange m1290rangeUntilJ1ME1BU(int i5, int i6) {
        return m1294untilJ1ME1BU(i5, i6);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    /* renamed from: rangeUntil-Kr8caGY, reason: not valid java name */
    private static final UIntRange m1291rangeUntilKr8caGY(byte b5, byte b6) {
        return m1295untilKr8caGY(b5, b6);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    /* renamed from: rangeUntil-eb3DHEI, reason: not valid java name */
    private static final ULongRange m1292rangeUntileb3DHEI(long j5, long j6) {
        return m1296untileb3DHEI(j5, j6);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final UIntProgression reversed(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        return UIntProgression.Companion.m1247fromClosedRangeNkh28Cs(uIntProgression.m1246getLastpVg5ArA(), uIntProgression.m1245getFirstpVg5ArA(), -uIntProgression.getStep());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final ULongProgression reversed(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        return ULongProgression.Companion.m1256fromClosedRange7ftBX0g(uLongProgression.m1255getLastsVKNKU(), uLongProgression.m1254getFirstsVKNKU(), -uLongProgression.getStep());
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final UIntProgression step(UIntProgression uIntProgression, int i5) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(i5 > 0, Integer.valueOf(i5));
        UIntProgression.Companion companion = UIntProgression.Companion;
        int m1245getFirstpVg5ArA = uIntProgression.m1245getFirstpVg5ArA();
        int m1246getLastpVg5ArA = uIntProgression.m1246getLastpVg5ArA();
        if (uIntProgression.getStep() <= 0) {
            i5 = -i5;
        }
        return companion.m1247fromClosedRangeNkh28Cs(m1245getFirstpVg5ArA, m1246getLastpVg5ArA, i5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    public static final ULongProgression step(ULongProgression uLongProgression, long j5) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(j5 > 0, Long.valueOf(j5));
        ULongProgression.Companion companion = ULongProgression.Companion;
        long m1254getFirstsVKNKU = uLongProgression.m1254getFirstsVKNKU();
        long m1255getLastsVKNKU = uLongProgression.m1255getLastsVKNKU();
        if (uLongProgression.getStep() <= 0) {
            j5 = -j5;
        }
        return companion.m1256fromClosedRange7ftBX0g(m1254getFirstsVKNKU, m1255getLastsVKNKU, j5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: until-5PvTz6A, reason: not valid java name */
    public static final UIntRange m1293until5PvTz6A(short s4, short s5) {
        return Intrinsics.compare(s5 & 65535, 0) <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange(UInt.m110constructorimpl(s4 & 65535), UInt.m110constructorimpl(UInt.m110constructorimpl(r3) - 1), null);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: until-J1ME1BU, reason: not valid java name */
    public static final UIntRange m1294untilJ1ME1BU(int i5, int i6) {
        return UnsignedKt.uintCompare(i6, 0) <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange(i5, UInt.m110constructorimpl(i6 - 1), null);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: until-Kr8caGY, reason: not valid java name */
    public static final UIntRange m1295untilKr8caGY(byte b5, byte b6) {
        return Intrinsics.compare(b6 & 255, 0) <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange(UInt.m110constructorimpl(b5 & 255), UInt.m110constructorimpl(UInt.m110constructorimpl(r3) - 1), null);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
    /* renamed from: until-eb3DHEI, reason: not valid java name */
    public static final ULongRange m1296untileb3DHEI(long j5, long j6) {
        return UnsignedKt.ulongCompare(j6, 0L) <= 0 ? ULongRange.Companion.getEMPTY() : new ULongRange(j5, ULong.m188constructorimpl(j6 - ULong.m188constructorimpl(1 & 4294967295L)), null);
    }
}
