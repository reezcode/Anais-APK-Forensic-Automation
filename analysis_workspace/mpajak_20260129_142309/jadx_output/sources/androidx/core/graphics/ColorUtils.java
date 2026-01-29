package androidx.core.graphics;

import android.graphics.Color;
import androidx.activity.d;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import java.util.Objects;

/* loaded from: classes12.dex */
public final class ColorUtils {
    private static final int MIN_ALPHA_SEARCH_MAX_ITERATIONS = 10;
    private static final int MIN_ALPHA_SEARCH_PRECISION = 1;
    private static final ThreadLocal<double[]> TEMP_ARRAY = new ThreadLocal<>();
    private static final double XYZ_EPSILON = 0.008856d;
    private static final double XYZ_KAPPA = 903.3d;
    private static final double XYZ_WHITE_REFERENCE_X = 95.047d;
    private static final double XYZ_WHITE_REFERENCE_Y = 100.0d;
    private static final double XYZ_WHITE_REFERENCE_Z = 108.883d;

    @RequiresApi(26)
    /* loaded from: classes14.dex */
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        public static Color compositeColors(Color color, Color color2) {
            if (!Objects.equals(color.getModel(), color2.getModel())) {
                StringBuilder g5 = d.g("Color models must match (");
                g5.append(color.getModel());
                g5.append(" vs. ");
                g5.append(color2.getModel());
                g5.append(")");
                throw new IllegalArgumentException(g5.toString());
            }
            if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                color = color.convert(color2.getColorSpace());
            }
            float[] components = color.getComponents();
            float[] components2 = color2.getComponents();
            float alpha = color.alpha();
            float alpha2 = (1.0f - alpha) * color2.alpha();
            int componentCount = color2.getComponentCount() - 1;
            components2[componentCount] = alpha + alpha2;
            if (components2[componentCount] > 0.0f) {
                alpha /= components2[componentCount];
                alpha2 /= components2[componentCount];
            }
            for (int i5 = 0; i5 < componentCount; i5++) {
                components2[i5] = (components2[i5] * alpha2) + (components[i5] * alpha);
            }
            return Color.valueOf(components2, color2.getColorSpace());
        }
    }

    private ColorUtils() {
    }

    @ColorInt
    public static int HSLToColor(@NonNull float[] fArr) {
        int round;
        int round2;
        int round3;
        float f5 = fArr[0];
        float f6 = fArr[1];
        float f7 = fArr[2];
        float abs = (1.0f - Math.abs((f7 * 2.0f) - 1.0f)) * f6;
        float f8 = f7 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f5 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f5) / 60) {
            case 0:
                round = Math.round((abs + f8) * 255.0f);
                round2 = Math.round((abs2 + f8) * 255.0f);
                round3 = Math.round(f8 * 255.0f);
                break;
            case 1:
                round = Math.round((abs2 + f8) * 255.0f);
                round2 = Math.round((abs + f8) * 255.0f);
                round3 = Math.round(f8 * 255.0f);
                break;
            case 2:
                round = Math.round(f8 * 255.0f);
                round2 = Math.round((abs + f8) * 255.0f);
                round3 = Math.round((abs2 + f8) * 255.0f);
                break;
            case 3:
                round = Math.round(f8 * 255.0f);
                round2 = Math.round((abs2 + f8) * 255.0f);
                round3 = Math.round((abs + f8) * 255.0f);
                break;
            case 4:
                round = Math.round((abs2 + f8) * 255.0f);
                round2 = Math.round(f8 * 255.0f);
                round3 = Math.round((abs + f8) * 255.0f);
                break;
            case 5:
            case 6:
                round = Math.round((abs + f8) * 255.0f);
                round2 = Math.round(f8 * 255.0f);
                round3 = Math.round((abs2 + f8) * 255.0f);
                break;
            default:
                round3 = 0;
                round = 0;
                round2 = 0;
                break;
        }
        return Color.rgb(constrain(round, 0, 255), constrain(round2, 0, 255), constrain(round3, 0, 255));
    }

    @ColorInt
    public static int LABToColor(@FloatRange(from = 0.0d, to = 100.0d) double d5, @FloatRange(from = -128.0d, to = 127.0d) double d6, @FloatRange(from = -128.0d, to = 127.0d) double d7) {
        double[] tempDouble3Array = getTempDouble3Array();
        LABToXYZ(d5, d6, d7, tempDouble3Array);
        return XYZToColor(tempDouble3Array[0], tempDouble3Array[1], tempDouble3Array[2]);
    }

    public static void LABToXYZ(@FloatRange(from = 0.0d, to = 100.0d) double d5, @FloatRange(from = -128.0d, to = 127.0d) double d6, @FloatRange(from = -128.0d, to = 127.0d) double d7, @NonNull double[] dArr) {
        double d8 = (d5 + 16.0d) / 116.0d;
        double d9 = (d6 / 500.0d) + d8;
        double d10 = d8 - (d7 / 200.0d);
        double pow = Math.pow(d9, 3.0d);
        if (pow <= XYZ_EPSILON) {
            pow = ((d9 * 116.0d) - 16.0d) / XYZ_KAPPA;
        }
        double pow2 = d5 > 7.9996247999999985d ? Math.pow(d8, 3.0d) : d5 / XYZ_KAPPA;
        double pow3 = Math.pow(d10, 3.0d);
        if (pow3 <= XYZ_EPSILON) {
            pow3 = ((d10 * 116.0d) - 16.0d) / XYZ_KAPPA;
        }
        dArr[0] = pow * XYZ_WHITE_REFERENCE_X;
        dArr[1] = pow2 * XYZ_WHITE_REFERENCE_Y;
        dArr[2] = pow3 * XYZ_WHITE_REFERENCE_Z;
    }

    public static void RGBToHSL(@IntRange(from = 0, to = 255) int i5, @IntRange(from = 0, to = 255) int i6, @IntRange(from = 0, to = 255) int i7, @NonNull float[] fArr) {
        float f5;
        float abs;
        float f6 = i5 / 255.0f;
        float f7 = i6 / 255.0f;
        float f8 = i7 / 255.0f;
        float max = Math.max(f6, Math.max(f7, f8));
        float min = Math.min(f6, Math.min(f7, f8));
        float f9 = max - min;
        float f10 = (max + min) / 2.0f;
        if (max == min) {
            f5 = 0.0f;
            abs = 0.0f;
        } else {
            f5 = max == f6 ? ((f7 - f8) / f9) % 6.0f : max == f7 ? ((f8 - f6) / f9) + 2.0f : 4.0f + ((f6 - f7) / f9);
            abs = f9 / (1.0f - Math.abs((2.0f * f10) - 1.0f));
        }
        float f11 = (f5 * 60.0f) % 360.0f;
        if (f11 < 0.0f) {
            f11 += 360.0f;
        }
        fArr[0] = constrain(f11, 0.0f, 360.0f);
        fArr[1] = constrain(abs, 0.0f, 1.0f);
        fArr[2] = constrain(f10, 0.0f, 1.0f);
    }

    public static void RGBToLAB(@IntRange(from = 0, to = 255) int i5, @IntRange(from = 0, to = 255) int i6, @IntRange(from = 0, to = 255) int i7, @NonNull double[] dArr) {
        RGBToXYZ(i5, i6, i7, dArr);
        XYZToLAB(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void RGBToXYZ(@IntRange(from = 0, to = 255) int i5, @IntRange(from = 0, to = 255) int i6, @IntRange(from = 0, to = 255) int i7, @NonNull double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d5 = i5 / 255.0d;
        double pow = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        double d6 = i6 / 255.0d;
        double pow2 = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
        double d7 = i7 / 255.0d;
        double pow3 = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * XYZ_WHITE_REFERENCE_Y;
        dArr[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * XYZ_WHITE_REFERENCE_Y;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * XYZ_WHITE_REFERENCE_Y;
    }

    @ColorInt
    public static int XYZToColor(@FloatRange(from = 0.0d, to = 95.047d) double d5, @FloatRange(from = 0.0d, to = 100.0d) double d6, @FloatRange(from = 0.0d, to = 108.883d) double d7) {
        double d8 = (((-0.4986d) * d7) + (((-1.5372d) * d6) + (3.2406d * d5))) / XYZ_WHITE_REFERENCE_Y;
        double d9 = ((0.0415d * d7) + ((1.8758d * d6) + ((-0.9689d) * d5))) / XYZ_WHITE_REFERENCE_Y;
        double d10 = ((1.057d * d7) + (((-0.204d) * d6) + (0.0557d * d5))) / XYZ_WHITE_REFERENCE_Y;
        return Color.rgb(constrain((int) Math.round((d8 > 0.0031308d ? (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d : d8 * 12.92d) * 255.0d), 0, 255), constrain((int) Math.round((d9 > 0.0031308d ? (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d : d9 * 12.92d) * 255.0d), 0, 255), constrain((int) Math.round((d10 > 0.0031308d ? (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d) * 255.0d), 0, 255));
    }

    public static void XYZToLAB(@FloatRange(from = 0.0d, to = 95.047d) double d5, @FloatRange(from = 0.0d, to = 100.0d) double d6, @FloatRange(from = 0.0d, to = 108.883d) double d7, @NonNull double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double pivotXyzComponent = pivotXyzComponent(d5 / XYZ_WHITE_REFERENCE_X);
        double pivotXyzComponent2 = pivotXyzComponent(d6 / XYZ_WHITE_REFERENCE_Y);
        double pivotXyzComponent3 = pivotXyzComponent(d7 / XYZ_WHITE_REFERENCE_Z);
        dArr[0] = Math.max(0.0d, (116.0d * pivotXyzComponent2) - 16.0d);
        dArr[1] = (pivotXyzComponent - pivotXyzComponent2) * 500.0d;
        dArr[2] = (pivotXyzComponent2 - pivotXyzComponent3) * 200.0d;
    }

    @ColorInt
    public static int blendARGB(@ColorInt int i5, @ColorInt int i6, @FloatRange(from = 0.0d, to = 1.0d) float f5) {
        float f6 = 1.0f - f5;
        return Color.argb((int) ((Color.alpha(i6) * f5) + (Color.alpha(i5) * f6)), (int) ((Color.red(i6) * f5) + (Color.red(i5) * f6)), (int) ((Color.green(i6) * f5) + (Color.green(i5) * f6)), (int) ((Color.blue(i6) * f5) + (Color.blue(i5) * f6)));
    }

    public static void blendHSL(@NonNull float[] fArr, @NonNull float[] fArr2, @FloatRange(from = 0.0d, to = 1.0d) float f5, @NonNull float[] fArr3) {
        if (fArr3.length != 3) {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
        float f6 = 1.0f - f5;
        fArr3[0] = circularInterpolate(fArr[0], fArr2[0], f5);
        fArr3[1] = (fArr2[1] * f5) + (fArr[1] * f6);
        fArr3[2] = (fArr2[2] * f5) + (fArr[2] * f6);
    }

    public static void blendLAB(@NonNull double[] dArr, @NonNull double[] dArr2, @FloatRange(from = 0.0d, to = 1.0d) double d5, @NonNull double[] dArr3) {
        if (dArr3.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double d6 = 1.0d - d5;
        dArr3[0] = (dArr2[0] * d5) + (dArr[0] * d6);
        dArr3[1] = (dArr2[1] * d5) + (dArr[1] * d6);
        dArr3[2] = (dArr2[2] * d5) + (dArr[2] * d6);
    }

    public static double calculateContrast(@ColorInt int i5, @ColorInt int i6) {
        if (Color.alpha(i6) != 255) {
            StringBuilder g5 = d.g("background can not be translucent: #");
            g5.append(Integer.toHexString(i6));
            throw new IllegalArgumentException(g5.toString());
        }
        if (Color.alpha(i5) < 255) {
            i5 = compositeColors(i5, i6);
        }
        double calculateLuminance = calculateLuminance(i5) + 0.05d;
        double calculateLuminance2 = calculateLuminance(i6) + 0.05d;
        return Math.max(calculateLuminance, calculateLuminance2) / Math.min(calculateLuminance, calculateLuminance2);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public static double calculateLuminance(@ColorInt int i5) {
        double[] tempDouble3Array = getTempDouble3Array();
        colorToXYZ(i5, tempDouble3Array);
        return tempDouble3Array[1] / XYZ_WHITE_REFERENCE_Y;
    }

    public static int calculateMinimumAlpha(@ColorInt int i5, @ColorInt int i6, float f5) {
        int i7 = 255;
        if (Color.alpha(i6) != 255) {
            StringBuilder g5 = d.g("background can not be translucent: #");
            g5.append(Integer.toHexString(i6));
            throw new IllegalArgumentException(g5.toString());
        }
        double d5 = f5;
        if (calculateContrast(setAlphaComponent(i5, 255), i6) < d5) {
            return -1;
        }
        int i8 = 0;
        for (int i9 = 0; i9 <= 10 && i7 - i8 > 1; i9++) {
            int i10 = (i8 + i7) / 2;
            if (calculateContrast(setAlphaComponent(i5, i10), i6) < d5) {
                i8 = i10;
            } else {
                i7 = i10;
            }
        }
        return i7;
    }

    @VisibleForTesting
    public static float circularInterpolate(float f5, float f6, float f7) {
        if (Math.abs(f6 - f5) > 180.0f) {
            if (f6 > f5) {
                f5 += 360.0f;
            } else {
                f6 += 360.0f;
            }
        }
        return (((f6 - f5) * f7) + f5) % 360.0f;
    }

    public static void colorToHSL(@ColorInt int i5, @NonNull float[] fArr) {
        RGBToHSL(Color.red(i5), Color.green(i5), Color.blue(i5), fArr);
    }

    public static void colorToLAB(@ColorInt int i5, @NonNull double[] dArr) {
        RGBToLAB(Color.red(i5), Color.green(i5), Color.blue(i5), dArr);
    }

    public static void colorToXYZ(@ColorInt int i5, @NonNull double[] dArr) {
        RGBToXYZ(Color.red(i5), Color.green(i5), Color.blue(i5), dArr);
    }

    private static int compositeAlpha(int i5, int i6) {
        return 255 - (((255 - i5) * (255 - i6)) / 255);
    }

    public static int compositeColors(@ColorInt int i5, @ColorInt int i6) {
        int alpha = Color.alpha(i6);
        int alpha2 = Color.alpha(i5);
        int compositeAlpha = compositeAlpha(alpha2, alpha);
        return Color.argb(compositeAlpha, compositeComponent(Color.red(i5), alpha2, Color.red(i6), alpha, compositeAlpha), compositeComponent(Color.green(i5), alpha2, Color.green(i6), alpha, compositeAlpha), compositeComponent(Color.blue(i5), alpha2, Color.blue(i6), alpha, compositeAlpha));
    }

    @NonNull
    @RequiresApi(26)
    public static Color compositeColors(@NonNull Color color, @NonNull Color color2) {
        return Api26Impl.compositeColors(color, color2);
    }

    private static int compositeComponent(int i5, int i6, int i7, int i8, int i9) {
        if (i9 == 0) {
            return 0;
        }
        return (((255 - i6) * (i7 * i8)) + ((i5 * 255) * i6)) / (i9 * 255);
    }

    private static float constrain(float f5, float f6, float f7) {
        return f5 < f6 ? f6 : Math.min(f5, f7);
    }

    private static int constrain(int i5, int i6, int i7) {
        return i5 < i6 ? i6 : Math.min(i5, i7);
    }

    public static double distanceEuclidean(@NonNull double[] dArr, @NonNull double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[2] - dArr2[2], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[0] - dArr2[0], 2.0d));
    }

    private static double[] getTempDouble3Array() {
        ThreadLocal<double[]> threadLocal = TEMP_ARRAY;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    private static double pivotXyzComponent(double d5) {
        return d5 > XYZ_EPSILON ? Math.pow(d5, 0.3333333333333333d) : ((d5 * XYZ_KAPPA) + 16.0d) / 116.0d;
    }

    @ColorInt
    public static int setAlphaComponent(@ColorInt int i5, @IntRange(from = 0, to = 255) int i6) {
        if (i6 < 0 || i6 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i5 & ViewCompat.MEASURED_SIZE_MASK) | (i6 << 24);
    }
}
