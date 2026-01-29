package androidx.core.content.res;

import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;

/* loaded from: classes21.dex */
final class CamUtils {
    public static final float[][] XYZ_TO_CAM16RGB = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] CAM16RGB_TO_XYZ = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] WHITE_POINT_D65 = {95.047f, 100.0f, 108.883f};
    public static final float[][] SRGB_TO_XYZ = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    private CamUtils() {
    }

    public static int intFromLStar(float f5) {
        if (f5 < 1.0f) {
            return -16777216;
        }
        if (f5 > 99.0f) {
            return -1;
        }
        float f6 = (f5 + 16.0f) / 116.0f;
        float f7 = (f5 > 8.0f ? 1 : (f5 == 8.0f ? 0 : -1)) > 0 ? f6 * f6 * f6 : f5 / 903.2963f;
        float f8 = f6 * f6 * f6;
        boolean z4 = f8 > 0.008856452f;
        float f9 = z4 ? f8 : ((f6 * 116.0f) - 16.0f) / 903.2963f;
        if (!z4) {
            f8 = ((f6 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = WHITE_POINT_D65;
        return ColorUtils.XYZToColor(f9 * fArr[0], f7 * fArr[1], f8 * fArr[2]);
    }

    public static float lStarFromInt(int i5) {
        return lStarFromY(yFromInt(i5));
    }

    public static float lStarFromY(float f5) {
        float f6 = f5 / 100.0f;
        return f6 <= 0.008856452f ? f6 * 903.2963f : (((float) Math.cbrt(f6)) * 116.0f) - 16.0f;
    }

    public static float lerp(float f5, float f6, float f7) {
        return androidx.appcompat.graphics.drawable.a.a(f6, f5, f7, f5);
    }

    public static float linearized(int i5) {
        float f5 = i5 / 255.0f;
        return (f5 <= 0.04045f ? f5 / 12.92f : (float) Math.pow((f5 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    @NonNull
    public static float[] xyzFromInt(int i5) {
        float linearized = linearized(Color.red(i5));
        float linearized2 = linearized(Color.green(i5));
        float linearized3 = linearized(Color.blue(i5));
        float[][] fArr = SRGB_TO_XYZ;
        return new float[]{(fArr[0][2] * linearized3) + (fArr[0][1] * linearized2) + (fArr[0][0] * linearized), (fArr[1][2] * linearized3) + (fArr[1][1] * linearized2) + (fArr[1][0] * linearized), (linearized3 * fArr[2][2]) + (linearized2 * fArr[2][1]) + (linearized * fArr[2][0])};
    }

    public static float yFromInt(int i5) {
        float linearized = linearized(Color.red(i5));
        float linearized2 = linearized(Color.green(i5));
        float linearized3 = linearized(Color.blue(i5));
        float[][] fArr = SRGB_TO_XYZ;
        return (linearized3 * fArr[1][2]) + (linearized2 * fArr[1][1]) + (linearized * fArr[1][0]);
    }

    public static float yFromLStar(float f5) {
        return (f5 > 8.0f ? (float) Math.pow((f5 + 16.0d) / 116.0d, 3.0d) : f5 / 903.2963f) * 100.0f;
    }
}
