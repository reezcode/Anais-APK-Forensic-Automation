package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
class NumbersKt__NumbersJVMKt extends NumbersKt__FloorDivModKt {
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int countLeadingZeroBits(int i5) {
        return Integer.numberOfLeadingZeros(i5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int countLeadingZeroBits(long j5) {
        return Long.numberOfLeadingZeros(j5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int countOneBits(int i5) {
        return Integer.bitCount(i5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int countOneBits(long j5) {
        return Long.bitCount(j5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int countTrailingZeroBits(int i5) {
        return Integer.numberOfTrailingZeros(i5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int countTrailingZeroBits(long j5) {
        return Long.numberOfTrailingZeros(j5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double fromBits(DoubleCompanionObject doubleCompanionObject, long j5) {
        Intrinsics.checkNotNullParameter(doubleCompanionObject, "<this>");
        return Double.longBitsToDouble(j5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float fromBits(FloatCompanionObject floatCompanionObject, int i5) {
        Intrinsics.checkNotNullParameter(floatCompanionObject, "<this>");
        return Float.intBitsToFloat(i5);
    }

    @InlineOnly
    private static final boolean isFinite(double d5) {
        return (Double.isInfinite(d5) || Double.isNaN(d5)) ? false : true;
    }

    @InlineOnly
    private static final boolean isFinite(float f5) {
        return (Float.isInfinite(f5) || Float.isNaN(f5)) ? false : true;
    }

    @InlineOnly
    private static final boolean isInfinite(double d5) {
        return Double.isInfinite(d5);
    }

    @InlineOnly
    private static final boolean isInfinite(float f5) {
        return Float.isInfinite(f5);
    }

    @InlineOnly
    private static final boolean isNaN(double d5) {
        return Double.isNaN(d5);
    }

    @InlineOnly
    private static final boolean isNaN(float f5) {
        return Float.isNaN(f5);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int rotateLeft(int i5, int i6) {
        return Integer.rotateLeft(i5, i6);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final long rotateLeft(long j5, int i5) {
        return Long.rotateLeft(j5, i5);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int rotateRight(int i5, int i6) {
        return Integer.rotateRight(i5, i6);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final long rotateRight(long j5, int i5) {
        return Long.rotateRight(j5, i5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int takeHighestOneBit(int i5) {
        return Integer.highestOneBit(i5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final long takeHighestOneBit(long j5) {
        return Long.highestOneBit(j5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int takeLowestOneBit(int i5) {
        return Integer.lowestOneBit(i5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final long takeLowestOneBit(long j5) {
        return Long.lowestOneBit(j5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int toBits(float f5) {
        return Float.floatToIntBits(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long toBits(double d5) {
        return Double.doubleToLongBits(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int toRawBits(float f5) {
        return Float.floatToRawIntBits(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long toRawBits(double d5) {
        return Double.doubleToRawLongBits(d5);
    }
}
