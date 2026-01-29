package kotlin.math;

import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public class MathKt__MathJVMKt extends MathKt__MathHKt {
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double IEEErem(double d5, double d6) {
        return Math.IEEEremainder(d5, d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float IEEErem(float f5, float f6) {
        return (float) Math.IEEEremainder(f5, f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double abs(double d5) {
        return Math.abs(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float abs(float f5) {
        return Math.abs(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int abs(int i5) {
        return Math.abs(i5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long abs(long j5) {
        return Math.abs(j5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double acos(double d5) {
        return Math.acos(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float acos(float f5) {
        return (float) Math.acos(f5);
    }

    @SinceKotlin(version = "1.2")
    public static final double acosh(double d5) {
        if (d5 < 1.0d) {
            return Double.NaN;
        }
        if (d5 > Constants.upper_taylor_2_bound) {
            return Math.log(d5) + Constants.LN2;
        }
        double d6 = 1;
        double d7 = d5 - d6;
        if (d7 >= Constants.taylor_n_bound) {
            return Math.log(Math.sqrt((d5 * d5) - d6) + d5);
        }
        double sqrt = Math.sqrt(d7);
        if (sqrt >= Constants.taylor_2_bound) {
            sqrt -= ((sqrt * sqrt) * sqrt) / 12;
        }
        return sqrt * Math.sqrt(2.0d);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float acosh(float f5) {
        return (float) acosh(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double asin(double d5) {
        return Math.asin(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float asin(float f5) {
        return (float) Math.asin(f5);
    }

    @SinceKotlin(version = "1.2")
    public static final double asinh(double d5) {
        double sqrt;
        double d6 = Constants.taylor_n_bound;
        if (d5 < d6) {
            return d5 <= (-d6) ? -asinh(-d5) : Math.abs(d5) >= Constants.taylor_2_bound ? d5 - (((d5 * d5) * d5) / 6) : d5;
        }
        if (d5 <= Constants.upper_taylor_n_bound) {
            sqrt = Math.sqrt((d5 * d5) + 1);
        } else {
            if (d5 > Constants.upper_taylor_2_bound) {
                return Math.log(d5) + Constants.LN2;
            }
            d5 *= 2;
            sqrt = 1 / d5;
        }
        return Math.log(sqrt + d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float asinh(float f5) {
        return (float) asinh(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double atan(double d5) {
        return Math.atan(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atan(float f5) {
        return (float) Math.atan(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double atan2(double d5, double d6) {
        return Math.atan2(d5, d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atan2(float f5, float f6) {
        return (float) Math.atan2(f5, f6);
    }

    @SinceKotlin(version = "1.2")
    public static final double atanh(double d5) {
        if (Math.abs(d5) < Constants.taylor_n_bound) {
            return Math.abs(d5) > Constants.taylor_2_bound ? d5 + (((d5 * d5) * d5) / 3) : d5;
        }
        double d6 = 1;
        return Math.log((d6 + d5) / (d6 - d5)) / 2;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float atanh(float f5) {
        return (float) atanh(f5);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final double cbrt(double d5) {
        return Math.cbrt(d5);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    @InlineOnly
    private static final float cbrt(float f5) {
        return (float) Math.cbrt(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ceil(double d5) {
        return Math.ceil(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ceil(float f5) {
        return (float) Math.ceil(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double cos(double d5) {
        return Math.cos(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float cos(float f5) {
        return (float) Math.cos(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double cosh(double d5) {
        return Math.cosh(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float cosh(float f5) {
        return (float) Math.cosh(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double exp(double d5) {
        return Math.exp(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float exp(float f5) {
        return (float) Math.exp(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double expm1(double d5) {
        return Math.expm1(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float expm1(float f5) {
        return (float) Math.expm1(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double floor(double d5) {
        return Math.floor(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float floor(float f5) {
        return (float) Math.floor(f5);
    }

    private static final double getAbsoluteValue(double d5) {
        return Math.abs(d5);
    }

    private static final float getAbsoluteValue(float f5) {
        return Math.abs(f5);
    }

    private static final int getAbsoluteValue(int i5) {
        return Math.abs(i5);
    }

    private static final long getAbsoluteValue(long j5) {
        return Math.abs(j5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(double d5) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(float f5) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(int i5) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getAbsoluteValue$annotations(long j5) {
    }

    private static final double getSign(double d5) {
        return Math.signum(d5);
    }

    private static final float getSign(float f5) {
        return Math.signum(f5);
    }

    public static int getSign(int i5) {
        if (i5 < 0) {
            return -1;
        }
        return i5 > 0 ? 1 : 0;
    }

    public static int getSign(long j5) {
        if (j5 < 0) {
            return -1;
        }
        return j5 > 0 ? 1 : 0;
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getSign$annotations(double d5) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getSign$annotations(float f5) {
    }

    @SinceKotlin(version = "1.2")
    public static /* synthetic */ void getSign$annotations(int i5) {
    }

    @SinceKotlin(version = "1.2")
    public static /* synthetic */ void getSign$annotations(long j5) {
    }

    private static final double getUlp(double d5) {
        return Math.ulp(d5);
    }

    private static final float getUlp(float f5) {
        return Math.ulp(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getUlp$annotations(double d5) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    public static /* synthetic */ void getUlp$annotations(float f5) {
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double hypot(double d5, double d6) {
        return Math.hypot(d5, d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float hypot(float f5, float f6) {
        return (float) Math.hypot(f5, f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ln(double d5) {
        return Math.log(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ln(float f5) {
        return (float) Math.log(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double ln1p(double d5) {
        return Math.log1p(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float ln1p(float f5) {
        return (float) Math.log1p(f5);
    }

    @SinceKotlin(version = "1.2")
    public static final double log(double d5, double d6) {
        if (d6 <= 0.0d) {
            return Double.NaN;
        }
        if (d6 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d5) / Math.log(d6);
    }

    @SinceKotlin(version = "1.2")
    public static final float log(float f5, float f6) {
        if (f6 <= 0.0f) {
            return Float.NaN;
        }
        if (f6 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log(f5) / Math.log(f6));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double log10(double d5) {
        return Math.log10(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float log10(float f5) {
        return (float) Math.log10(f5);
    }

    @SinceKotlin(version = "1.2")
    public static final double log2(double d5) {
        return Math.log(d5) / Constants.LN2;
    }

    @SinceKotlin(version = "1.2")
    public static final float log2(float f5) {
        return (float) (Math.log(f5) / Constants.LN2);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double max(double d5, double d6) {
        return Math.max(d5, d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float max(float f5, float f6) {
        return Math.max(f5, f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int max(int i5, int i6) {
        return Math.max(i5, i6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long max(long j5, long j6) {
        return Math.max(j5, j6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double min(double d5, double d6) {
        return Math.min(d5, d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float min(float f5, float f6) {
        return Math.min(f5, f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final int min(int i5, int i6) {
        return Math.min(i5, i6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final long min(long j5, long j6) {
        return Math.min(j5, j6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextDown(double d5) {
        return Math.nextAfter(d5, Double.NEGATIVE_INFINITY);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextDown(float f5) {
        return Math.nextAfter(f5, Double.NEGATIVE_INFINITY);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextTowards(double d5, double d6) {
        return Math.nextAfter(d5, d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextTowards(float f5, float f6) {
        return Math.nextAfter(f5, f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double nextUp(double d5) {
        return Math.nextUp(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float nextUp(float f5) {
        return Math.nextUp(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double pow(double d5, double d6) {
        return Math.pow(d5, d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double pow(double d5, int i5) {
        return Math.pow(d5, i5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float pow(float f5, float f6) {
        return (float) Math.pow(f5, f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float pow(float f5, int i5) {
        return (float) Math.pow(f5, i5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double round(double d5) {
        return Math.rint(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float round(float f5) {
        return (float) Math.rint(f5);
    }

    @SinceKotlin(version = "1.2")
    public static int roundToInt(double d5) {
        if (Double.isNaN(d5)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d5 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d5 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d5);
    }

    @SinceKotlin(version = "1.2")
    public static final int roundToInt(float f5) {
        if (Float.isNaN(f5)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f5);
    }

    @SinceKotlin(version = "1.2")
    public static long roundToLong(double d5) {
        if (Double.isNaN(d5)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d5);
    }

    @SinceKotlin(version = "1.2")
    public static final long roundToLong(float f5) {
        return roundToLong(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sign(double d5) {
        return Math.signum(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sign(float f5) {
        return Math.signum(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sin(double d5) {
        return Math.sin(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sin(float f5) {
        return (float) Math.sin(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sinh(double d5) {
        return Math.sinh(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sinh(float f5) {
        return (float) Math.sinh(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double sqrt(double d5) {
        return Math.sqrt(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float sqrt(float f5) {
        return (float) Math.sqrt(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double tan(double d5) {
        return Math.tan(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float tan(float f5) {
        return (float) Math.tan(f5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double tanh(double d5) {
        return Math.tanh(d5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float tanh(float f5) {
        return (float) Math.tanh(f5);
    }

    @SinceKotlin(version = "1.2")
    public static final double truncate(double d5) {
        return (Double.isNaN(d5) || Double.isInfinite(d5)) ? d5 : d5 > 0.0d ? Math.floor(d5) : Math.ceil(d5);
    }

    @SinceKotlin(version = "1.2")
    public static final float truncate(float f5) {
        if (Float.isNaN(f5) || Float.isInfinite(f5)) {
            return f5;
        }
        return (float) (f5 > 0.0f ? Math.floor(f5) : Math.ceil(f5));
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double withSign(double d5, double d6) {
        return Math.copySign(d5, d6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final double withSign(double d5, int i5) {
        return Math.copySign(d5, i5);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float withSign(float f5, float f6) {
        return Math.copySign(f5, f6);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final float withSign(float f5, int i5) {
        return Math.copySign(f5, i5);
    }
}
