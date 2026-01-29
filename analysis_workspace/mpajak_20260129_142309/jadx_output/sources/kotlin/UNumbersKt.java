package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;

@JvmName(name = "UNumbersKt")
/* loaded from: classes2.dex */
public final class UNumbersKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countLeadingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m259countLeadingZeroBits7apg3OU(byte b5) {
        return Integer.numberOfLeadingZeros(b5 & 255) - 24;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countLeadingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m260countLeadingZeroBitsVKZWuLQ(long j5) {
        return Long.numberOfLeadingZeros(j5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countLeadingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m261countLeadingZeroBitsWZ4Q5Ns(int i5) {
        return Integer.numberOfLeadingZeros(i5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countLeadingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m262countLeadingZeroBitsxj2QHRw(short s4) {
        return Integer.numberOfLeadingZeros(s4 & 65535) - 16;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countOneBits-7apg3OU, reason: not valid java name */
    private static final int m263countOneBits7apg3OU(byte b5) {
        return Integer.bitCount(UInt.m110constructorimpl(b5 & 255));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countOneBits-VKZWuLQ, reason: not valid java name */
    private static final int m264countOneBitsVKZWuLQ(long j5) {
        return Long.bitCount(j5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countOneBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m265countOneBitsWZ4Q5Ns(int i5) {
        return Integer.bitCount(i5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countOneBits-xj2QHRw, reason: not valid java name */
    private static final int m266countOneBitsxj2QHRw(short s4) {
        return Integer.bitCount(UInt.m110constructorimpl(s4 & 65535));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countTrailingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m267countTrailingZeroBits7apg3OU(byte b5) {
        return Integer.numberOfTrailingZeros(b5 | UByte.MIN_VALUE);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countTrailingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m268countTrailingZeroBitsVKZWuLQ(long j5) {
        return Long.numberOfTrailingZeros(j5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countTrailingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m269countTrailingZeroBitsWZ4Q5Ns(int i5) {
        return Integer.numberOfTrailingZeros(i5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: countTrailingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m270countTrailingZeroBitsxj2QHRw(short s4) {
        return Integer.numberOfTrailingZeros(s4 | 65536);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: rotateLeft-JSWoG40, reason: not valid java name */
    private static final long m271rotateLeftJSWoG40(long j5, int i5) {
        return ULong.m188constructorimpl(Long.rotateLeft(j5, i5));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: rotateLeft-LxnNnR4, reason: not valid java name */
    private static final byte m272rotateLeftLxnNnR4(byte b5, int i5) {
        return UByte.m34constructorimpl(NumbersKt__NumbersKt.rotateLeft(b5, i5));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: rotateLeft-V7xB4Y4, reason: not valid java name */
    private static final int m273rotateLeftV7xB4Y4(int i5, int i6) {
        return UInt.m110constructorimpl(Integer.rotateLeft(i5, i6));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: rotateLeft-olVBNx4, reason: not valid java name */
    private static final short m274rotateLeftolVBNx4(short s4, int i5) {
        return UShort.m294constructorimpl(NumbersKt__NumbersKt.rotateLeft(s4, i5));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: rotateRight-JSWoG40, reason: not valid java name */
    private static final long m275rotateRightJSWoG40(long j5, int i5) {
        return ULong.m188constructorimpl(Long.rotateRight(j5, i5));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: rotateRight-LxnNnR4, reason: not valid java name */
    private static final byte m276rotateRightLxnNnR4(byte b5, int i5) {
        return UByte.m34constructorimpl(NumbersKt__NumbersKt.rotateRight(b5, i5));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: rotateRight-V7xB4Y4, reason: not valid java name */
    private static final int m277rotateRightV7xB4Y4(int i5, int i6) {
        return UInt.m110constructorimpl(Integer.rotateRight(i5, i6));
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class, ExperimentalUnsignedTypes.class})
    @InlineOnly
    /* renamed from: rotateRight-olVBNx4, reason: not valid java name */
    private static final short m278rotateRightolVBNx4(short s4, int i5) {
        return UShort.m294constructorimpl(NumbersKt__NumbersKt.rotateRight(s4, i5));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: takeHighestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m279takeHighestOneBit7apg3OU(byte b5) {
        return UByte.m34constructorimpl((byte) Integer.highestOneBit(b5 & 255));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: takeHighestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m280takeHighestOneBitVKZWuLQ(long j5) {
        return ULong.m188constructorimpl(Long.highestOneBit(j5));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: takeHighestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m281takeHighestOneBitWZ4Q5Ns(int i5) {
        return UInt.m110constructorimpl(Integer.highestOneBit(i5));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: takeHighestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m282takeHighestOneBitxj2QHRw(short s4) {
        return UShort.m294constructorimpl((short) Integer.highestOneBit(s4 & 65535));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: takeLowestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m283takeLowestOneBit7apg3OU(byte b5) {
        return UByte.m34constructorimpl((byte) Integer.lowestOneBit(b5 & 255));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: takeLowestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m284takeLowestOneBitVKZWuLQ(long j5) {
        return ULong.m188constructorimpl(Long.lowestOneBit(j5));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: takeLowestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m285takeLowestOneBitWZ4Q5Ns(int i5) {
        return UInt.m110constructorimpl(Integer.lowestOneBit(i5));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalUnsignedTypes.class, ExperimentalStdlibApi.class})
    @InlineOnly
    /* renamed from: takeLowestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m286takeLowestOneBitxj2QHRw(short s4) {
        return UShort.m294constructorimpl((short) Integer.lowestOneBit(s4 & 65535));
    }
}
