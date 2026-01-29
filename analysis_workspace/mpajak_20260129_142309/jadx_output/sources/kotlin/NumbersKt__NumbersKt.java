package kotlin;

import kotlin.internal.InlineOnly;

/* loaded from: classes4.dex */
class NumbersKt__NumbersKt extends NumbersKt__NumbersJVMKt {
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int countLeadingZeroBits(byte b5) {
        return Integer.numberOfLeadingZeros(b5 & 255) - 24;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int countLeadingZeroBits(short s4) {
        return Integer.numberOfLeadingZeros(s4 & 65535) - 16;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int countOneBits(byte b5) {
        return Integer.bitCount(b5 & 255);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int countOneBits(short s4) {
        return Integer.bitCount(s4 & 65535);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int countTrailingZeroBits(byte b5) {
        return Integer.numberOfTrailingZeros(b5 | UByte.MIN_VALUE);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int countTrailingZeroBits(short s4) {
        return Integer.numberOfTrailingZeros(s4 | 65536);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final byte rotateLeft(byte b5, int i5) {
        int i6 = i5 & 7;
        return (byte) (((b5 & 255) >>> (8 - i6)) | (b5 << i6));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final short rotateLeft(short s4, int i5) {
        int i6 = i5 & 15;
        return (short) (((s4 & 65535) >>> (16 - i6)) | (s4 << i6));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final byte rotateRight(byte b5, int i5) {
        int i6 = i5 & 7;
        return (byte) (((b5 & 255) >>> i6) | (b5 << (8 - i6)));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final short rotateRight(short s4, int i5) {
        int i6 = i5 & 15;
        return (short) (((s4 & 65535) >>> i6) | (s4 << (16 - i6)));
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final byte takeHighestOneBit(byte b5) {
        return (byte) Integer.highestOneBit(b5 & 255);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final short takeHighestOneBit(short s4) {
        return (short) Integer.highestOneBit(s4 & 65535);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final byte takeLowestOneBit(byte b5) {
        return (byte) Integer.lowestOneBit(b5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final short takeLowestOneBit(short s4) {
        return (short) Integer.lowestOneBit(s4);
    }
}
