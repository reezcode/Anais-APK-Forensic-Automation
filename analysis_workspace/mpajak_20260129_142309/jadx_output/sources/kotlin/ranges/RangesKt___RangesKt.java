package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlin.ranges.CharProgression;
import kotlin.ranges.IntProgression;
import kotlin.ranges.LongProgression;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public class RangesKt___RangesKt extends RangesKt__RangesKt {
    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "byteRangeContains")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange closedRange, double d5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(d5);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "byteRangeContains")
    public static final /* synthetic */ boolean byteRangeContains(ClosedRange closedRange, float f5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(f5);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(ClosedRange<Byte> closedRange, int i5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(i5);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(ClosedRange<Byte> closedRange, long j5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(j5);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(ClosedRange<Byte> closedRange, short s4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(s4);
        if (byteExactOrNull != null) {
            return closedRange.contains(byteExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(OpenEndRange<Byte> openEndRange, int i5) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(i5);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(OpenEndRange<Byte> openEndRange, long j5) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(j5);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @JvmName(name = "byteRangeContains")
    public static final boolean byteRangeContains(OpenEndRange<Byte> openEndRange, short s4) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(s4);
        if (byteExactOrNull != null) {
            return openEndRange.contains(byteExactOrNull);
        }
        return false;
    }

    public static final byte coerceAtLeast(byte b5, byte b6) {
        return b5 < b6 ? b6 : b5;
    }

    public static final double coerceAtLeast(double d5, double d6) {
        return d5 < d6 ? d6 : d5;
    }

    public static final float coerceAtLeast(float f5, float f6) {
        return f5 < f6 ? f6 : f5;
    }

    public static int coerceAtLeast(int i5, int i6) {
        return i5 < i6 ? i6 : i5;
    }

    public static long coerceAtLeast(long j5, long j6) {
        return j5 < j6 ? j6 : j5;
    }

    public static final <T extends Comparable<? super T>> T coerceAtLeast(T t4, T minimumValue) {
        Intrinsics.checkNotNullParameter(t4, "<this>");
        Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
        return t4.compareTo(minimumValue) < 0 ? minimumValue : t4;
    }

    public static final short coerceAtLeast(short s4, short s5) {
        return s4 < s5 ? s5 : s4;
    }

    public static final byte coerceAtMost(byte b5, byte b6) {
        return b5 > b6 ? b6 : b5;
    }

    public static final double coerceAtMost(double d5, double d6) {
        return d5 > d6 ? d6 : d5;
    }

    public static final float coerceAtMost(float f5, float f6) {
        return f5 > f6 ? f6 : f5;
    }

    public static int coerceAtMost(int i5, int i6) {
        return i5 > i6 ? i6 : i5;
    }

    public static long coerceAtMost(long j5, long j6) {
        return j5 > j6 ? j6 : j5;
    }

    public static final <T extends Comparable<? super T>> T coerceAtMost(T t4, T maximumValue) {
        Intrinsics.checkNotNullParameter(t4, "<this>");
        Intrinsics.checkNotNullParameter(maximumValue, "maximumValue");
        return t4.compareTo(maximumValue) > 0 ? maximumValue : t4;
    }

    public static final short coerceAtMost(short s4, short s5) {
        return s4 > s5 ? s5 : s4;
    }

    public static final byte coerceIn(byte b5, byte b6, byte b7) {
        if (b6 <= b7) {
            return b5 < b6 ? b6 : b5 > b7 ? b7 : b5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b7) + " is less than minimum " + ((int) b6) + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public static final double coerceIn(double d5, double d6, double d7) {
        if (d6 <= d7) {
            return d5 < d6 ? d6 : d5 > d7 ? d7 : d5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d7 + " is less than minimum " + d6 + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public static final float coerceIn(float f5, float f6, float f7) {
        if (f6 <= f7) {
            return f5 < f6 ? f6 : f5 > f7 ? f7 : f5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f7 + " is less than minimum " + f6 + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public static int coerceIn(int i5, int i6, int i7) {
        if (i6 <= i7) {
            return i5 < i6 ? i6 : i5 > i7 ? i7 : i5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i7 + " is less than minimum " + i6 + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public static final int coerceIn(int i5, ClosedRange<Integer> range) {
        Integer endInclusive;
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((Number) coerceIn(Integer.valueOf(i5), (ClosedFloatingPointRange<Integer>) range)).intValue();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + FilenameUtils.EXTENSION_SEPARATOR);
        }
        if (i5 < range.getStart().intValue()) {
            endInclusive = range.getStart();
        } else {
            if (i5 <= range.getEndInclusive().intValue()) {
                return i5;
            }
            endInclusive = range.getEndInclusive();
        }
        return endInclusive.intValue();
    }

    public static long coerceIn(long j5, long j6, long j7) {
        if (j6 <= j7) {
            return j5 < j6 ? j6 : j5 > j7 ? j7 : j5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j7 + " is less than minimum " + j6 + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public static long coerceIn(long j5, ClosedRange<Long> range) {
        Long endInclusive;
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((Number) coerceIn(Long.valueOf(j5), (ClosedFloatingPointRange<Long>) range)).longValue();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + FilenameUtils.EXTENSION_SEPARATOR);
        }
        if (j5 < range.getStart().longValue()) {
            endInclusive = range.getStart();
        } else {
            if (j5 <= range.getEndInclusive().longValue()) {
                return j5;
            }
            endInclusive = range.getEndInclusive();
        }
        return endInclusive.longValue();
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t4, T t5, T t6) {
        Intrinsics.checkNotNullParameter(t4, "<this>");
        if (t5 == null || t6 == null) {
            if (t5 != null && t4.compareTo(t5) < 0) {
                return t5;
            }
            if (t6 != null && t4.compareTo(t6) > 0) {
                return t6;
            }
        } else {
            if (t5.compareTo(t6) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t6 + " is less than minimum " + t5 + FilenameUtils.EXTENSION_SEPARATOR);
            }
            if (t4.compareTo(t5) < 0) {
                return t5;
            }
            if (t4.compareTo(t6) > 0) {
                return t6;
            }
        }
        return t4;
    }

    @SinceKotlin(version = "1.1")
    public static final <T extends Comparable<? super T>> T coerceIn(T t4, ClosedFloatingPointRange<T> range) {
        Intrinsics.checkNotNullParameter(t4, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return (!range.lessThanOrEquals(t4, range.getStart()) || range.lessThanOrEquals(range.getStart(), t4)) ? (!range.lessThanOrEquals(range.getEndInclusive(), t4) || range.lessThanOrEquals(t4, range.getEndInclusive())) ? t4 : range.getEndInclusive() : range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public static final <T extends Comparable<? super T>> T coerceIn(T t4, ClosedRange<T> range) {
        Intrinsics.checkNotNullParameter(t4, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return (T) coerceIn((Comparable) t4, (ClosedFloatingPointRange) range);
        }
        if (!range.isEmpty()) {
            return t4.compareTo(range.getStart()) < 0 ? range.getStart() : t4.compareTo(range.getEndInclusive()) > 0 ? range.getEndInclusive() : t4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + FilenameUtils.EXTENSION_SEPARATOR);
    }

    public static final short coerceIn(short s4, short s5, short s6) {
        if (s5 <= s6) {
            return s4 < s5 ? s5 : s4 > s6 ? s6 : s4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s6) + " is less than minimum " + ((int) s5) + FilenameUtils.EXTENSION_SEPARATOR);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(CharRange charRange, Character ch) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        return ch != null && charRange.contains(ch.charValue());
    }

    @InlineOnly
    private static final boolean contains(IntRange intRange, byte b5) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return intRangeContains((ClosedRange<Integer>) intRange, b5);
    }

    @InlineOnly
    private static final boolean contains(IntRange intRange, long j5) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return intRangeContains((ClosedRange<Integer>) intRange, j5);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(IntRange intRange, Integer num) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return num != null && intRange.contains(num.intValue());
    }

    @InlineOnly
    private static final boolean contains(IntRange intRange, short s4) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return intRangeContains((ClosedRange<Integer>) intRange, s4);
    }

    @InlineOnly
    private static final boolean contains(LongRange longRange, byte b5) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return longRangeContains((ClosedRange<Long>) longRange, b5);
    }

    @InlineOnly
    private static final boolean contains(LongRange longRange, int i5) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return longRangeContains((ClosedRange<Long>) longRange, i5);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final boolean contains(LongRange longRange, Long l5) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return l5 != null && longRange.contains(l5.longValue());
    }

    @InlineOnly
    private static final boolean contains(LongRange longRange, short s4) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return longRangeContains((ClosedRange<Long>) longRange, s4);
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, byte b5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(b5));
    }

    @JvmName(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(ClosedRange<Double> closedRange, float f5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(f5));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, int i5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(i5));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, long j5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(j5));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "doubleRangeContains")
    public static final /* synthetic */ boolean doubleRangeContains(ClosedRange closedRange, short s4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Double.valueOf(s4));
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @JvmName(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(OpenEndRange<Double> openEndRange, float f5) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Double.valueOf(f5));
    }

    public static final CharProgression downTo(char c5, char c6) {
        return CharProgression.Companion.fromClosedRange(c5, c6, -1);
    }

    public static final IntProgression downTo(byte b5, byte b6) {
        return IntProgression.Companion.fromClosedRange(b5, b6, -1);
    }

    public static final IntProgression downTo(byte b5, int i5) {
        return IntProgression.Companion.fromClosedRange(b5, i5, -1);
    }

    public static final IntProgression downTo(byte b5, short s4) {
        return IntProgression.Companion.fromClosedRange(b5, s4, -1);
    }

    public static final IntProgression downTo(int i5, byte b5) {
        return IntProgression.Companion.fromClosedRange(i5, b5, -1);
    }

    public static IntProgression downTo(int i5, int i6) {
        return IntProgression.Companion.fromClosedRange(i5, i6, -1);
    }

    public static final IntProgression downTo(int i5, short s4) {
        return IntProgression.Companion.fromClosedRange(i5, s4, -1);
    }

    public static final IntProgression downTo(short s4, byte b5) {
        return IntProgression.Companion.fromClosedRange(s4, b5, -1);
    }

    public static final IntProgression downTo(short s4, int i5) {
        return IntProgression.Companion.fromClosedRange(s4, i5, -1);
    }

    public static final IntProgression downTo(short s4, short s5) {
        return IntProgression.Companion.fromClosedRange(s4, s5, -1);
    }

    public static final LongProgression downTo(byte b5, long j5) {
        return LongProgression.Companion.fromClosedRange(b5, j5, -1L);
    }

    public static final LongProgression downTo(int i5, long j5) {
        return LongProgression.Companion.fromClosedRange(i5, j5, -1L);
    }

    public static final LongProgression downTo(long j5, byte b5) {
        return LongProgression.Companion.fromClosedRange(j5, b5, -1L);
    }

    public static final LongProgression downTo(long j5, int i5) {
        return LongProgression.Companion.fromClosedRange(j5, i5, -1L);
    }

    public static final LongProgression downTo(long j5, long j6) {
        return LongProgression.Companion.fromClosedRange(j5, j6, -1L);
    }

    public static final LongProgression downTo(long j5, short s4) {
        return LongProgression.Companion.fromClosedRange(j5, s4, -1L);
    }

    public static final LongProgression downTo(short s4, long j5) {
        return LongProgression.Companion.fromClosedRange(s4, j5, -1L);
    }

    @SinceKotlin(version = "1.7")
    public static final char first(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (!charProgression.isEmpty()) {
            return charProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + charProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final int first(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (!intProgression.isEmpty()) {
            return intProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + intProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final long first(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (!longProgression.isEmpty()) {
            return longProgression.getFirst();
        }
        throw new NoSuchElementException("Progression " + longProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final Character firstOrNull(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (charProgression.isEmpty()) {
            return null;
        }
        return Character.valueOf(charProgression.getFirst());
    }

    @SinceKotlin(version = "1.7")
    public static final Integer firstOrNull(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (intProgression.isEmpty()) {
            return null;
        }
        return Integer.valueOf(intProgression.getFirst());
    }

    @SinceKotlin(version = "1.7")
    public static final Long firstOrNull(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (longProgression.isEmpty()) {
            return null;
        }
        return Long.valueOf(longProgression.getFirst());
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, byte b5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(b5));
    }

    @JvmName(name = "floatRangeContains")
    public static final boolean floatRangeContains(ClosedRange<Float> closedRange, double d5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf((float) d5));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, int i5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(i5));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, long j5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(j5));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "floatRangeContains")
    public static final /* synthetic */ boolean floatRangeContains(ClosedRange closedRange, short s4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Float.valueOf(s4));
    }

    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(ClosedRange<Integer> closedRange, byte b5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Integer.valueOf(b5));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "intRangeContains")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange closedRange, double d5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(d5);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "intRangeContains")
    public static final /* synthetic */ boolean intRangeContains(ClosedRange closedRange, float f5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(f5);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(ClosedRange<Integer> closedRange, long j5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(j5);
        if (intExactOrNull != null) {
            return closedRange.contains(intExactOrNull);
        }
        return false;
    }

    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(ClosedRange<Integer> closedRange, short s4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Integer.valueOf(s4));
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(OpenEndRange<Integer> openEndRange, byte b5) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Integer.valueOf(b5));
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(OpenEndRange<Integer> openEndRange, long j5) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Integer intExactOrNull = toIntExactOrNull(j5);
        if (intExactOrNull != null) {
            return openEndRange.contains(intExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @JvmName(name = "intRangeContains")
    public static final boolean intRangeContains(OpenEndRange<Integer> openEndRange, short s4) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Integer.valueOf(s4));
    }

    @SinceKotlin(version = "1.7")
    public static final char last(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (!charProgression.isEmpty()) {
            return charProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + charProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final int last(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (!intProgression.isEmpty()) {
            return intProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + intProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final long last(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (!longProgression.isEmpty()) {
            return longProgression.getLast();
        }
        throw new NoSuchElementException("Progression " + longProgression + " is empty.");
    }

    @SinceKotlin(version = "1.7")
    public static final Character lastOrNull(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        if (charProgression.isEmpty()) {
            return null;
        }
        return Character.valueOf(charProgression.getLast());
    }

    @SinceKotlin(version = "1.7")
    public static final Integer lastOrNull(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        if (intProgression.isEmpty()) {
            return null;
        }
        return Integer.valueOf(intProgression.getLast());
    }

    @SinceKotlin(version = "1.7")
    public static final Long lastOrNull(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        if (longProgression.isEmpty()) {
            return null;
        }
        return Long.valueOf(longProgression.getLast());
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(ClosedRange<Long> closedRange, byte b5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(b5));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "longRangeContains")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange closedRange, double d5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Long longExactOrNull = toLongExactOrNull(d5);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "longRangeContains")
    public static final /* synthetic */ boolean longRangeContains(ClosedRange closedRange, float f5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Long longExactOrNull = toLongExactOrNull(f5);
        if (longExactOrNull != null) {
            return closedRange.contains(longExactOrNull);
        }
        return false;
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(ClosedRange<Long> closedRange, int i5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(i5));
    }

    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(ClosedRange<Long> closedRange, short s4) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Long.valueOf(s4));
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(OpenEndRange<Long> openEndRange, byte b5) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(b5));
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(OpenEndRange<Long> openEndRange, int i5) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(i5));
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @JvmName(name = "longRangeContains")
    public static final boolean longRangeContains(OpenEndRange<Long> openEndRange, short s4) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Long.valueOf(s4));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final char random(CharRange charRange) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        return random(charRange, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    public static final char random(CharRange charRange, Random random) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return (char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1);
        } catch (IllegalArgumentException e5) {
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final int random(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return random(intRange, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    public static final int random(IntRange intRange, Random random) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return RandomKt.nextInt(random, intRange);
        } catch (IllegalArgumentException e5) {
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final long random(LongRange longRange) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return random(longRange, Random.Default);
    }

    @SinceKotlin(version = "1.3")
    public static final long random(LongRange longRange, Random random) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return RandomKt.nextLong(random, longRange);
        } catch (IllegalArgumentException e5) {
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Character randomOrNull(CharRange charRange) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        return randomOrNull(charRange, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Character randomOrNull(CharRange charRange, Random random) {
        Intrinsics.checkNotNullParameter(charRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (charRange.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) random.nextInt(charRange.getFirst(), charRange.getLast() + 1));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Integer randomOrNull(IntRange intRange) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        return randomOrNull(intRange, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Integer randomOrNull(IntRange intRange, Random random) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (intRange.isEmpty()) {
            return null;
        }
        return Integer.valueOf(RandomKt.nextInt(random, intRange));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final Long randomOrNull(LongRange longRange) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        return randomOrNull(longRange, Random.Default);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Long randomOrNull(LongRange longRange, Random random) {
        Intrinsics.checkNotNullParameter(longRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (longRange.isEmpty()) {
            return null;
        }
        return Long.valueOf(RandomKt.nextLong(random, longRange));
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final CharRange rangeUntil(char c5, char c6) {
        return until(c5, c6);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final IntRange rangeUntil(byte b5, byte b6) {
        return until(b5, b6);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final IntRange rangeUntil(byte b5, int i5) {
        return until(b5, i5);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final IntRange rangeUntil(byte b5, short s4) {
        return until(b5, s4);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final IntRange rangeUntil(int i5, byte b5) {
        return until(i5, b5);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final IntRange rangeUntil(int i5, int i6) {
        return until(i5, i6);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final IntRange rangeUntil(int i5, short s4) {
        return until(i5, s4);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final IntRange rangeUntil(short s4, byte b5) {
        return until(s4, b5);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final IntRange rangeUntil(short s4, int i5) {
        return until(s4, i5);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final IntRange rangeUntil(short s4, short s5) {
        return until(s4, s5);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final LongRange rangeUntil(byte b5, long j5) {
        return until(b5, j5);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final LongRange rangeUntil(int i5, long j5) {
        return until(i5, j5);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final LongRange rangeUntil(long j5, byte b5) {
        return until(j5, b5);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final LongRange rangeUntil(long j5, int i5) {
        return until(j5, i5);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final LongRange rangeUntil(long j5, long j6) {
        return until(j5, j6);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final LongRange rangeUntil(long j5, short s4) {
        return until(j5, s4);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final LongRange rangeUntil(short s4, long j5) {
        return until(s4, j5);
    }

    public static final CharProgression reversed(CharProgression charProgression) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        return CharProgression.Companion.fromClosedRange(charProgression.getLast(), charProgression.getFirst(), -charProgression.getStep());
    }

    public static final IntProgression reversed(IntProgression intProgression) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        return IntProgression.Companion.fromClosedRange(intProgression.getLast(), intProgression.getFirst(), -intProgression.getStep());
    }

    public static final LongProgression reversed(LongProgression longProgression) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        return LongProgression.Companion.fromClosedRange(longProgression.getLast(), longProgression.getFirst(), -longProgression.getStep());
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(ClosedRange<Short> closedRange, byte b5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return closedRange.contains(Short.valueOf(b5));
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "shortRangeContains")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange closedRange, double d5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(d5);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @Deprecated(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @DeprecatedSinceKotlin(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @JvmName(name = "shortRangeContains")
    public static final /* synthetic */ boolean shortRangeContains(ClosedRange closedRange, float f5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(f5);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(ClosedRange<Short> closedRange, int i5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(i5);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(ClosedRange<Short> closedRange, long j5) {
        Intrinsics.checkNotNullParameter(closedRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(j5);
        if (shortExactOrNull != null) {
            return closedRange.contains(shortExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(OpenEndRange<Short> openEndRange, byte b5) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return openEndRange.contains(Short.valueOf(b5));
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(OpenEndRange<Short> openEndRange, int i5) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(i5);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @JvmName(name = "shortRangeContains")
    public static final boolean shortRangeContains(OpenEndRange<Short> openEndRange, long j5) {
        Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        Short shortExactOrNull = toShortExactOrNull(j5);
        if (shortExactOrNull != null) {
            return openEndRange.contains(shortExactOrNull);
        }
        return false;
    }

    public static final CharProgression step(CharProgression charProgression, int i5) {
        Intrinsics.checkNotNullParameter(charProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(i5 > 0, Integer.valueOf(i5));
        CharProgression.Companion companion = CharProgression.Companion;
        char first = charProgression.getFirst();
        char last = charProgression.getLast();
        if (charProgression.getStep() <= 0) {
            i5 = -i5;
        }
        return companion.fromClosedRange(first, last, i5);
    }

    public static IntProgression step(IntProgression intProgression, int i5) {
        Intrinsics.checkNotNullParameter(intProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(i5 > 0, Integer.valueOf(i5));
        IntProgression.Companion companion = IntProgression.Companion;
        int first = intProgression.getFirst();
        int last = intProgression.getLast();
        if (intProgression.getStep() <= 0) {
            i5 = -i5;
        }
        return companion.fromClosedRange(first, last, i5);
    }

    public static final LongProgression step(LongProgression longProgression, long j5) {
        Intrinsics.checkNotNullParameter(longProgression, "<this>");
        RangesKt__RangesKt.checkStepIsPositive(j5 > 0, Long.valueOf(j5));
        LongProgression.Companion companion = LongProgression.Companion;
        long first = longProgression.getFirst();
        long last = longProgression.getLast();
        if (longProgression.getStep() <= 0) {
            j5 = -j5;
        }
        return companion.fromClosedRange(first, last, j5);
    }

    public static final Byte toByteExactOrNull(double d5) {
        boolean z4 = false;
        if (-128.0d <= d5 && d5 <= 127.0d) {
            z4 = true;
        }
        if (z4) {
            return Byte.valueOf((byte) d5);
        }
        return null;
    }

    public static final Byte toByteExactOrNull(float f5) {
        boolean z4 = false;
        if (-128.0f <= f5 && f5 <= 127.0f) {
            z4 = true;
        }
        if (z4) {
            return Byte.valueOf((byte) f5);
        }
        return null;
    }

    public static final Byte toByteExactOrNull(int i5) {
        if (new IntRange(-128, 127).contains(i5)) {
            return Byte.valueOf((byte) i5);
        }
        return null;
    }

    public static final Byte toByteExactOrNull(long j5) {
        if (new LongRange(-128L, 127L).contains(j5)) {
            return Byte.valueOf((byte) j5);
        }
        return null;
    }

    public static final Byte toByteExactOrNull(short s4) {
        if (intRangeContains((ClosedRange<Integer>) new IntRange(-128, 127), s4)) {
            return Byte.valueOf((byte) s4);
        }
        return null;
    }

    public static final Integer toIntExactOrNull(double d5) {
        boolean z4 = false;
        if (-2.147483648E9d <= d5 && d5 <= 2.147483647E9d) {
            z4 = true;
        }
        if (z4) {
            return Integer.valueOf((int) d5);
        }
        return null;
    }

    public static final Integer toIntExactOrNull(float f5) {
        boolean z4 = false;
        if (-2.1474836E9f <= f5 && f5 <= 2.1474836E9f) {
            z4 = true;
        }
        if (z4) {
            return Integer.valueOf((int) f5);
        }
        return null;
    }

    public static final Integer toIntExactOrNull(long j5) {
        if (new LongRange(-2147483648L, 2147483647L).contains(j5)) {
            return Integer.valueOf((int) j5);
        }
        return null;
    }

    public static final Long toLongExactOrNull(double d5) {
        boolean z4 = false;
        if (-9.223372036854776E18d <= d5 && d5 <= 9.223372036854776E18d) {
            z4 = true;
        }
        if (z4) {
            return Long.valueOf((long) d5);
        }
        return null;
    }

    public static final Long toLongExactOrNull(float f5) {
        boolean z4 = false;
        if (-9.223372E18f <= f5 && f5 <= 9.223372E18f) {
            z4 = true;
        }
        if (z4) {
            return Long.valueOf((long) f5);
        }
        return null;
    }

    public static final Short toShortExactOrNull(double d5) {
        boolean z4 = false;
        if (-32768.0d <= d5 && d5 <= 32767.0d) {
            z4 = true;
        }
        if (z4) {
            return Short.valueOf((short) d5);
        }
        return null;
    }

    public static final Short toShortExactOrNull(float f5) {
        boolean z4 = false;
        if (-32768.0f <= f5 && f5 <= 32767.0f) {
            z4 = true;
        }
        if (z4) {
            return Short.valueOf((short) f5);
        }
        return null;
    }

    public static final Short toShortExactOrNull(int i5) {
        if (new IntRange(-32768, 32767).contains(i5)) {
            return Short.valueOf((short) i5);
        }
        return null;
    }

    public static final Short toShortExactOrNull(long j5) {
        if (new LongRange(-32768L, 32767L).contains(j5)) {
            return Short.valueOf((short) j5);
        }
        return null;
    }

    public static final CharRange until(char c5, char c6) {
        return Intrinsics.compare((int) c6, 0) <= 0 ? CharRange.Companion.getEMPTY() : new CharRange(c5, (char) (c6 - 1));
    }

    public static final IntRange until(byte b5, byte b6) {
        return new IntRange(b5, b6 - 1);
    }

    public static final IntRange until(byte b5, int i5) {
        return i5 <= Integer.MIN_VALUE ? IntRange.Companion.getEMPTY() : new IntRange(b5, i5 - 1);
    }

    public static final IntRange until(byte b5, short s4) {
        return new IntRange(b5, s4 - 1);
    }

    public static final IntRange until(int i5, byte b5) {
        return new IntRange(i5, b5 - 1);
    }

    public static IntRange until(int i5, int i6) {
        return i6 <= Integer.MIN_VALUE ? IntRange.Companion.getEMPTY() : new IntRange(i5, i6 - 1);
    }

    public static final IntRange until(int i5, short s4) {
        return new IntRange(i5, s4 - 1);
    }

    public static final IntRange until(short s4, byte b5) {
        return new IntRange(s4, b5 - 1);
    }

    public static final IntRange until(short s4, int i5) {
        return i5 <= Integer.MIN_VALUE ? IntRange.Companion.getEMPTY() : new IntRange(s4, i5 - 1);
    }

    public static final IntRange until(short s4, short s5) {
        return new IntRange(s4, s5 - 1);
    }

    public static final LongRange until(byte b5, long j5) {
        return j5 <= Long.MIN_VALUE ? LongRange.Companion.getEMPTY() : new LongRange(b5, j5 - 1);
    }

    public static final LongRange until(int i5, long j5) {
        return j5 <= Long.MIN_VALUE ? LongRange.Companion.getEMPTY() : new LongRange(i5, j5 - 1);
    }

    public static final LongRange until(long j5, byte b5) {
        return new LongRange(j5, b5 - 1);
    }

    public static final LongRange until(long j5, int i5) {
        return new LongRange(j5, i5 - 1);
    }

    public static final LongRange until(long j5, long j6) {
        return j6 <= Long.MIN_VALUE ? LongRange.Companion.getEMPTY() : new LongRange(j5, j6 - 1);
    }

    public static final LongRange until(long j5, short s4) {
        return new LongRange(j5, s4 - 1);
    }

    public static final LongRange until(short s4, long j5) {
        return j5 <= Long.MIN_VALUE ? LongRange.Companion.getEMPTY() : new LongRange(s4, j5 - 1);
    }
}
