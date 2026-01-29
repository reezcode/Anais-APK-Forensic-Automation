package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;

/* loaded from: classes22.dex */
class NumbersKt__FloorDivModKt extends NumbersKt__BigIntegersKt {
    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(byte b5, byte b6) {
        int i5 = b5 / b6;
        return ((b5 ^ b6) >= 0 || b6 * i5 == b5) ? i5 : i5 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(byte b5, int i5) {
        int i6 = b5 / i5;
        return ((b5 ^ i5) >= 0 || i5 * i6 == b5) ? i6 : i6 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(byte b5, short s4) {
        int i5 = b5 / s4;
        return ((b5 ^ s4) >= 0 || s4 * i5 == b5) ? i5 : i5 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(int i5, byte b5) {
        int i6 = i5 / b5;
        return ((i5 ^ b5) >= 0 || b5 * i6 == i5) ? i6 : i6 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(int i5, int i6) {
        int i7 = i5 / i6;
        return ((i5 ^ i6) >= 0 || i6 * i7 == i5) ? i7 : i7 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(int i5, short s4) {
        int i6 = i5 / s4;
        return ((i5 ^ s4) >= 0 || s4 * i6 == i5) ? i6 : i6 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(short s4, byte b5) {
        int i5 = s4 / b5;
        return ((s4 ^ b5) >= 0 || b5 * i5 == s4) ? i5 : i5 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(short s4, int i5) {
        int i6 = s4 / i5;
        return ((s4 ^ i5) >= 0 || i5 * i6 == s4) ? i6 : i6 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int floorDiv(short s4, short s5) {
        int i5 = s4 / s5;
        return ((s4 ^ s5) >= 0 || s5 * i5 == s4) ? i5 : i5 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(byte b5, long j5) {
        long j6 = b5;
        long j7 = j6 / j5;
        return ((j6 ^ j5) >= 0 || j5 * j7 == j6) ? j7 : j7 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(int i5, long j5) {
        long j6 = i5;
        long j7 = j6 / j5;
        return ((j6 ^ j5) >= 0 || j5 * j7 == j6) ? j7 : j7 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j5, byte b5) {
        long j6 = b5;
        long j7 = j5 / j6;
        return ((j5 ^ j6) >= 0 || j6 * j7 == j5) ? j7 : j7 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j5, int i5) {
        long j6 = i5;
        long j7 = j5 / j6;
        return ((j5 ^ j6) >= 0 || j6 * j7 == j5) ? j7 : j7 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j5, long j6) {
        long j7 = j5 / j6;
        return ((j5 ^ j6) >= 0 || j6 * j7 == j5) ? j7 : j7 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(long j5, short s4) {
        long j6 = s4;
        long j7 = j5 / j6;
        return ((j5 ^ j6) >= 0 || j6 * j7 == j5) ? j7 : j7 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long floorDiv(short s4, long j5) {
        long j6 = s4;
        long j7 = j6 / j5;
        return ((j6 ^ j5) >= 0 || j5 * j7 == j6) ? j7 : j7 - 1;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(byte b5, byte b6) {
        int i5 = b5 % b6;
        return (byte) (i5 + (b6 & (((i5 ^ b6) & ((-i5) | i5)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(int i5, byte b5) {
        int i6 = i5 % b5;
        return (byte) (i6 + (b5 & (((i6 ^ b5) & ((-i6) | i6)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(long j5, byte b5) {
        long j6 = j5 % b5;
        return (byte) (j6 + (r0 & (((j6 ^ r0) & ((-j6) | j6)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final byte mod(short s4, byte b5) {
        int i5 = s4 % b5;
        return (byte) (i5 + (b5 & (((i5 ^ b5) & ((-i5) | i5)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double mod(double d5, double d6) {
        double d7 = d5 % d6;
        if (d7 == 0.0d) {
            return d7;
        }
        return !(Math.signum(d7) == Math.signum(d6)) ? d7 + d6 : d7;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double mod(double d5, float f5) {
        double d6 = f5;
        double d7 = d5 % d6;
        if (d7 == 0.0d) {
            return d7;
        }
        return !(Math.signum(d7) == Math.signum(d6)) ? d7 + d6 : d7;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final double mod(float f5, double d5) {
        double d6 = f5 % d5;
        if (d6 == 0.0d) {
            return d6;
        }
        return !(Math.signum(d6) == Math.signum(d5)) ? d6 + d5 : d6;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final float mod(float f5, float f6) {
        float f7 = f5 % f6;
        if (f7 == 0.0f) {
            return f7;
        }
        return !(Math.signum(f7) == Math.signum(f6)) ? f7 + f6 : f7;
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(byte b5, int i5) {
        int i6 = b5 % i5;
        return i6 + (i5 & (((i6 ^ i5) & ((-i6) | i6)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(int i5, int i6) {
        int i7 = i5 % i6;
        return i7 + (i6 & (((i7 ^ i6) & ((-i7) | i7)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(long j5, int i5) {
        long j6 = i5;
        long j7 = j5 % j6;
        return (int) (j7 + (j6 & (((j7 ^ j6) & ((-j7) | j7)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final int mod(short s4, int i5) {
        int i6 = s4 % i5;
        return i6 + (i5 & (((i6 ^ i5) & ((-i6) | i6)) >> 31));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(byte b5, long j5) {
        long j6 = b5 % j5;
        return j6 + (j5 & (((j6 ^ j5) & ((-j6) | j6)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(int i5, long j5) {
        long j6 = i5 % j5;
        return j6 + (j5 & (((j6 ^ j5) & ((-j6) | j6)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(long j5, long j6) {
        long j7 = j5 % j6;
        return j7 + (j6 & (((j7 ^ j6) & ((-j7) | j7)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final long mod(short s4, long j5) {
        long j6 = s4 % j5;
        return j6 + (j5 & (((j6 ^ j5) & ((-j6) | j6)) >> 63));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(byte b5, short s4) {
        int i5 = b5 % s4;
        return (short) (i5 + (s4 & (((i5 ^ s4) & ((-i5) | i5)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(int i5, short s4) {
        int i6 = i5 % s4;
        return (short) (i6 + (s4 & (((i6 ^ s4) & ((-i6) | i6)) >> 31)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(long j5, short s4) {
        long j6 = j5 % s4;
        return (short) (j6 + (r0 & (((j6 ^ r0) & ((-j6) | j6)) >> 63)));
    }

    @SinceKotlin(version = "1.5")
    @IntrinsicConstEvaluation
    @InlineOnly
    private static final short mod(short s4, short s5) {
        int i5 = s4 % s5;
        return (short) (i5 + (s5 & (((i5 ^ s5) & ((-i5) | i5)) >> 31)));
    }
}
