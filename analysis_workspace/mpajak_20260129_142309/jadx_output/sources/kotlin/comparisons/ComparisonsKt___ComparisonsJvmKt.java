package kotlin.comparisons;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes25.dex */
public class ComparisonsKt___ComparisonsJvmKt extends ComparisonsKt__ComparisonsKt {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte maxOf(byte b5, byte b6) {
        return (byte) Math.max((int) b5, (int) b6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte maxOf(byte b5, byte b6, byte b7) {
        return (byte) Math.max((int) b5, Math.max((int) b6, (int) b7));
    }

    @SinceKotlin(version = "1.4")
    public static final byte maxOf(byte b5, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b6 : other) {
            b5 = (byte) Math.max((int) b5, (int) b6);
        }
        return b5;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double maxOf(double d5, double d6) {
        return Math.max(d5, d6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double maxOf(double d5, double d6, double d7) {
        return Math.max(d5, Math.max(d6, d7));
    }

    @SinceKotlin(version = "1.4")
    public static final double maxOf(double d5, double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (double d6 : other) {
            d5 = Math.max(d5, d6);
        }
        return d5;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float maxOf(float f5, float f6) {
        return Math.max(f5, f6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float maxOf(float f5, float f6, float f7) {
        return Math.max(f5, Math.max(f6, f7));
    }

    @SinceKotlin(version = "1.4")
    public static final float maxOf(float f5, float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f6 : other) {
            f5 = Math.max(f5, f6);
        }
        return f5;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int maxOf(int i5, int i6) {
        return Math.max(i5, i6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int maxOf(int i5, int i6, int i7) {
        return Math.max(i5, Math.max(i6, i7));
    }

    @SinceKotlin(version = "1.4")
    public static final int maxOf(int i5, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i6 : other) {
            i5 = Math.max(i5, i6);
        }
        return i5;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long maxOf(long j5, long j6) {
        return Math.max(j5, j6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long maxOf(long j5, long j6, long j7) {
        return Math.max(j5, Math.max(j6, j7));
    }

    @SinceKotlin(version = "1.4")
    public static final long maxOf(long j5, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j6 : other) {
            j5 = Math.max(j5, j6);
        }
        return j5;
    }

    @SinceKotlin(version = "1.1")
    public static <T extends Comparable<? super T>> T maxOf(T a5, T b5) {
        Intrinsics.checkNotNullParameter(a5, "a");
        Intrinsics.checkNotNullParameter(b5, "b");
        return a5.compareTo(b5) >= 0 ? a5 : b5;
    }

    @SinceKotlin(version = "1.1")
    public static final <T extends Comparable<? super T>> T maxOf(T a5, T b5, T c5) {
        Intrinsics.checkNotNullParameter(a5, "a");
        Intrinsics.checkNotNullParameter(b5, "b");
        Intrinsics.checkNotNullParameter(c5, "c");
        return (T) maxOf(a5, maxOf(b5, c5));
    }

    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> T maxOf(T a5, T... other) {
        Intrinsics.checkNotNullParameter(a5, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        for (T t4 : other) {
            a5 = (T) maxOf(a5, t4);
        }
        return a5;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short maxOf(short s4, short s5) {
        return (short) Math.max((int) s4, (int) s5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short maxOf(short s4, short s5, short s6) {
        return (short) Math.max((int) s4, Math.max((int) s5, (int) s6));
    }

    @SinceKotlin(version = "1.4")
    public static final short maxOf(short s4, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s5 : other) {
            s4 = (short) Math.max((int) s4, (int) s5);
        }
        return s4;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte minOf(byte b5, byte b6) {
        return (byte) Math.min((int) b5, (int) b6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte minOf(byte b5, byte b6, byte b7) {
        return (byte) Math.min((int) b5, Math.min((int) b6, (int) b7));
    }

    @SinceKotlin(version = "1.4")
    public static final byte minOf(byte b5, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b6 : other) {
            b5 = (byte) Math.min((int) b5, (int) b6);
        }
        return b5;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double minOf(double d5, double d6) {
        return Math.min(d5, d6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double minOf(double d5, double d6, double d7) {
        return Math.min(d5, Math.min(d6, d7));
    }

    @SinceKotlin(version = "1.4")
    public static final double minOf(double d5, double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (double d6 : other) {
            d5 = Math.min(d5, d6);
        }
        return d5;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float minOf(float f5, float f6) {
        return Math.min(f5, f6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float minOf(float f5, float f6, float f7) {
        return Math.min(f5, Math.min(f6, f7));
    }

    @SinceKotlin(version = "1.4")
    public static final float minOf(float f5, float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f6 : other) {
            f5 = Math.min(f5, f6);
        }
        return f5;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int minOf(int i5, int i6) {
        return Math.min(i5, i6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int minOf(int i5, int i6, int i7) {
        return Math.min(i5, Math.min(i6, i7));
    }

    @SinceKotlin(version = "1.4")
    public static final int minOf(int i5, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i6 : other) {
            i5 = Math.min(i5, i6);
        }
        return i5;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long minOf(long j5, long j6) {
        return Math.min(j5, j6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long minOf(long j5, long j6, long j7) {
        return Math.min(j5, Math.min(j6, j7));
    }

    @SinceKotlin(version = "1.4")
    public static final long minOf(long j5, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j6 : other) {
            j5 = Math.min(j5, j6);
        }
        return j5;
    }

    @SinceKotlin(version = "1.1")
    public static final <T extends Comparable<? super T>> T minOf(T a5, T b5) {
        Intrinsics.checkNotNullParameter(a5, "a");
        Intrinsics.checkNotNullParameter(b5, "b");
        return a5.compareTo(b5) <= 0 ? a5 : b5;
    }

    @SinceKotlin(version = "1.1")
    public static final <T extends Comparable<? super T>> T minOf(T a5, T b5, T c5) {
        Intrinsics.checkNotNullParameter(a5, "a");
        Intrinsics.checkNotNullParameter(b5, "b");
        Intrinsics.checkNotNullParameter(c5, "c");
        return (T) minOf(a5, minOf(b5, c5));
    }

    @SinceKotlin(version = "1.4")
    public static final <T extends Comparable<? super T>> T minOf(T a5, T... other) {
        Intrinsics.checkNotNullParameter(a5, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        for (T t4 : other) {
            a5 = (T) minOf(a5, t4);
        }
        return a5;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short minOf(short s4, short s5) {
        return (short) Math.min((int) s4, (int) s5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short minOf(short s4, short s5, short s6) {
        return (short) Math.min((int) s4, Math.min((int) s5, (int) s6));
    }

    @SinceKotlin(version = "1.4")
    public static final short minOf(short s4, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s5 : other) {
            s4 = (short) Math.min((int) s4, (int) s5);
        }
        return s4;
    }
}
