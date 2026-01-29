package androidx.core.content.res;

import androidx.annotation.NonNull;

/* loaded from: classes20.dex */
final class ViewingConditions {
    public static final ViewingConditions DEFAULT = make(CamUtils.WHITE_POINT_D65, (float) ((CamUtils.yFromLStar(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    private final float mAw;
    private final float mC;
    private final float mFl;
    private final float mFlRoot;
    private final float mN;
    private final float mNbb;
    private final float mNc;
    private final float mNcb;
    private final float[] mRgbD;
    private final float mZ;

    private ViewingConditions(float f5, float f6, float f7, float f8, float f9, float f10, float[] fArr, float f11, float f12, float f13) {
        this.mN = f5;
        this.mAw = f6;
        this.mNbb = f7;
        this.mNcb = f8;
        this.mC = f9;
        this.mNc = f10;
        this.mRgbD = fArr;
        this.mFl = f11;
        this.mFlRoot = f12;
        this.mZ = f13;
    }

    @NonNull
    public static ViewingConditions make(@NonNull float[] fArr, float f5, float f6, float f7, boolean z4) {
        float[][] fArr2 = CamUtils.XYZ_TO_CAM16RGB;
        float f8 = (fArr[2] * fArr2[0][2]) + (fArr[1] * fArr2[0][1]) + (fArr[0] * fArr2[0][0]);
        float f9 = (fArr[2] * fArr2[1][2]) + (fArr[1] * fArr2[1][1]) + (fArr[0] * fArr2[1][0]);
        float f10 = (fArr[2] * fArr2[2][2]) + (fArr[1] * fArr2[2][1]) + (fArr[0] * fArr2[2][0]);
        float f11 = (f7 / 10.0f) + 0.8f;
        float lerp = ((double) f11) >= 0.9d ? CamUtils.lerp(0.59f, 0.69f, (f11 - 0.9f) * 10.0f) : CamUtils.lerp(0.525f, 0.59f, (f11 - 0.8f) * 10.0f);
        float exp = z4 ? 1.0f : (1.0f - (((float) Math.exp(((-f5) - 42.0f) / 92.0f)) * 0.2777778f)) * f11;
        double d5 = exp;
        if (d5 > 1.0d) {
            exp = 1.0f;
        } else if (d5 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp};
        float f12 = 1.0f / ((5.0f * f5) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float cbrt = (0.1f * f14 * f14 * ((float) Math.cbrt(f5 * 5.0d))) + (f13 * f5);
        float yFromLStar = CamUtils.yFromLStar(f6) / fArr[1];
        double d6 = yFromLStar;
        float sqrt = ((float) Math.sqrt(d6)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d6, 0.2d));
        float[] fArr4 = {(float) Math.pow(((fArr3[0] * cbrt) * f8) / 100.0d, 0.42d), (float) Math.pow(((fArr3[1] * cbrt) * f9) / 100.0d, 0.42d), (float) Math.pow(((fArr3[2] * cbrt) * f10) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new ViewingConditions(yFromLStar, ((fArr5[2] * 0.05f) + (fArr5[0] * 2.0f) + fArr5[1]) * pow, pow, pow, lerp, f11, fArr3, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public float getAw() {
        return this.mAw;
    }

    public float getC() {
        return this.mC;
    }

    public float getFl() {
        return this.mFl;
    }

    public float getFlRoot() {
        return this.mFlRoot;
    }

    public float getN() {
        return this.mN;
    }

    public float getNbb() {
        return this.mNbb;
    }

    public float getNc() {
        return this.mNc;
    }

    public float getNcb() {
        return this.mNcb;
    }

    @NonNull
    public float[] getRgbD() {
        return this.mRgbD;
    }

    public float getZ() {
        return this.mZ;
    }
}
