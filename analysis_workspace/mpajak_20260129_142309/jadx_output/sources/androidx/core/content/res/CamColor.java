package androidx.core.content.res;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.ColorUtils;
import kotlin.jvm.internal.DoubleCompanionObject;

/* loaded from: classes7.dex */
class CamColor {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;
    private final float mJ;
    private final float mJstar;
    private final float mM;
    private final float mQ;
    private final float mS;

    public CamColor(float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        this.mHue = f5;
        this.mChroma = f6;
        this.mJ = f7;
        this.mQ = f8;
        this.mM = f9;
        this.mS = f10;
        this.mJstar = f11;
        this.mAstar = f12;
        this.mBstar = f13;
    }

    @Nullable
    private static CamColor findCamByJ(@FloatRange(from = 0.0d, to = 360.0d) float f5, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f6, @FloatRange(from = 0.0d, to = 100.0d) float f7) {
        float f8 = 1000.0f;
        CamColor camColor = null;
        float f9 = 1000.0f;
        float f10 = 100.0f;
        float f11 = 0.0f;
        while (Math.abs(f11 - f10) > LIGHTNESS_SEARCH_ENDPOINT) {
            float f12 = ((f10 - f11) / 2.0f) + f11;
            int viewedInSrgb = fromJch(f12, f6, f5).viewedInSrgb();
            float lStarFromInt = CamUtils.lStarFromInt(viewedInSrgb);
            float abs = Math.abs(f7 - lStarFromInt);
            if (abs < 0.2f) {
                CamColor fromColor = fromColor(viewedInSrgb);
                float distance = fromColor.distance(fromJch(fromColor.getJ(), fromColor.getChroma(), f5));
                if (distance <= 1.0f) {
                    camColor = fromColor;
                    f8 = abs;
                    f9 = distance;
                }
            }
            if (f8 == 0.0f && f9 == 0.0f) {
                break;
            }
            if (lStarFromInt < f7) {
                f11 = f12;
            } else {
                f10 = f12;
            }
        }
        return camColor;
    }

    @NonNull
    public static CamColor fromColor(@ColorInt int i5) {
        return fromColorInViewingConditions(i5, ViewingConditions.DEFAULT);
    }

    @NonNull
    public static CamColor fromColorInViewingConditions(@ColorInt int i5, @NonNull ViewingConditions viewingConditions) {
        float[] xyzFromInt = CamUtils.xyzFromInt(i5);
        float[][] fArr = CamUtils.XYZ_TO_CAM16RGB;
        float f5 = (xyzFromInt[2] * fArr[0][2]) + (xyzFromInt[1] * fArr[0][1]) + (xyzFromInt[0] * fArr[0][0]);
        float f6 = (xyzFromInt[2] * fArr[1][2]) + (xyzFromInt[1] * fArr[1][1]) + (xyzFromInt[0] * fArr[1][0]);
        float f7 = (xyzFromInt[2] * fArr[2][2]) + (xyzFromInt[1] * fArr[2][1]) + (xyzFromInt[0] * fArr[2][0]);
        float f8 = viewingConditions.getRgbD()[0] * f5;
        float f9 = viewingConditions.getRgbD()[1] * f6;
        float f10 = viewingConditions.getRgbD()[2] * f7;
        float pow = (float) Math.pow((Math.abs(f8) * viewingConditions.getFl()) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f9) * viewingConditions.getFl()) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f10) * viewingConditions.getFl()) / 100.0d, 0.42d);
        float signum = ((Math.signum(f8) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f9) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f10) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d5 = signum3;
        float f11 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d5)) / 11.0f;
        float f12 = ((float) ((signum + signum2) - (d5 * 2.0d))) / 9.0f;
        float f13 = signum2 * 20.0f;
        float f14 = ((21.0f * signum3) + ((signum * 20.0f) + f13)) / 20.0f;
        float f15 = (((signum * 40.0f) + f13) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f12, f11)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f16 = atan2;
        float f17 = (3.1415927f * f16) / 180.0f;
        float pow4 = ((float) Math.pow((f15 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float flRoot = viewingConditions.getFlRoot() * (viewingConditions.getAw() + 4.0f) * (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(pow4 / 100.0f));
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f16) < 20.14d ? 360.0f + f16 : f16) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getNc()) * viewingConditions.getNcb()) * ((float) Math.sqrt((f12 * f12) + (f11 * f11)))) / (f14 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float flRoot2 = pow5 * viewingConditions.getFlRoot();
        float sqrt = ((float) Math.sqrt((r1 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f18 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * flRoot2) + 1.0f)) * 43.85965f;
        double d6 = f17;
        return new CamColor(f16, pow5, pow4, flRoot, flRoot2, sqrt, f18, log * ((float) Math.cos(d6)), log * ((float) Math.sin(d6)));
    }

    @NonNull
    private static CamColor fromJch(@FloatRange(from = 0.0d, to = 100.0d) float f5, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f6, @FloatRange(from = 0.0d, to = 360.0d) float f7) {
        return fromJchInFrame(f5, f6, f7, ViewingConditions.DEFAULT);
    }

    @NonNull
    private static CamColor fromJchInFrame(@FloatRange(from = 0.0d, to = 100.0d) float f5, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f6, @FloatRange(from = 0.0d, to = 360.0d) float f7, ViewingConditions viewingConditions) {
        float aw = (viewingConditions.getAw() + 4.0f) * (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(f5 / 100.0d)) * viewingConditions.getFlRoot();
        float flRoot = f6 * viewingConditions.getFlRoot();
        float sqrt = ((float) Math.sqrt(((f6 / ((float) Math.sqrt(r4))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f8 = (1.7f * f5) / ((0.007f * f5) + 1.0f);
        float log = ((float) Math.log((flRoot * 0.0228d) + 1.0d)) * 43.85965f;
        double d5 = (3.1415927f * f7) / 180.0f;
        return new CamColor(f7, f6, f5, aw, flRoot, sqrt, f8, log * ((float) Math.cos(d5)), log * ((float) Math.sin(d5)));
    }

    public static int toColor(@FloatRange(from = 0.0d, to = 360.0d) float f5, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f6, @FloatRange(from = 0.0d, to = 100.0d) float f7) {
        return toColor(f5, f6, f7, ViewingConditions.DEFAULT);
    }

    @ColorInt
    public static int toColor(@FloatRange(from = 0.0d, to = 360.0d) float f5, @FloatRange(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f6, @FloatRange(from = 0.0d, to = 100.0d) float f7, @NonNull ViewingConditions viewingConditions) {
        if (f6 < 1.0d || Math.round(f7) <= 0.0d || Math.round(f7) >= 100.0d) {
            return CamUtils.intFromLStar(f7);
        }
        float min = f5 < 0.0f ? 0.0f : Math.min(360.0f, f5);
        float f8 = f6;
        CamColor camColor = null;
        float f9 = 0.0f;
        boolean z4 = true;
        while (Math.abs(f9 - f6) >= CHROMA_SEARCH_ENDPOINT) {
            CamColor findCamByJ = findCamByJ(min, f8, f7);
            if (z4) {
                if (findCamByJ != null) {
                    return findCamByJ.viewed(viewingConditions);
                }
                z4 = false;
            } else if (findCamByJ == null) {
                f6 = f8;
            } else {
                f9 = f8;
                camColor = findCamByJ;
            }
            f8 = ((f6 - f9) / 2.0f) + f9;
        }
        return camColor == null ? CamUtils.intFromLStar(f7) : camColor.viewed(viewingConditions);
    }

    public float distance(@NonNull CamColor camColor) {
        float jStar = getJStar() - camColor.getJStar();
        float aStar = getAStar() - camColor.getAStar();
        float bStar = getBStar() - camColor.getBStar();
        return (float) (Math.pow(Math.sqrt((bStar * bStar) + (aStar * aStar) + (jStar * jStar)), 0.63d) * 1.41d);
    }

    @FloatRange(from = DoubleCompanionObject.NEGATIVE_INFINITY, fromInclusive = false, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getAStar() {
        return this.mAstar;
    }

    @FloatRange(from = DoubleCompanionObject.NEGATIVE_INFINITY, fromInclusive = false, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getBStar() {
        return this.mBstar;
    }

    @FloatRange(from = 0.0d, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getChroma() {
        return this.mChroma;
    }

    @FloatRange(from = 0.0d, to = 360.0d, toInclusive = false)
    public float getHue() {
        return this.mHue;
    }

    @FloatRange(from = 0.0d, to = 100.0d)
    public float getJ() {
        return this.mJ;
    }

    @FloatRange(from = 0.0d, to = 100.0d)
    public float getJStar() {
        return this.mJstar;
    }

    @FloatRange(from = 0.0d, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getM() {
        return this.mM;
    }

    @FloatRange(from = 0.0d, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getQ() {
        return this.mQ;
    }

    @FloatRange(from = 0.0d, to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getS() {
        return this.mS;
    }

    @ColorInt
    public int viewed(@NonNull ViewingConditions viewingConditions) {
        float pow = (float) Math.pow(((((double) getChroma()) == 0.0d || ((double) getJ()) == 0.0d) ? 0.0f : getChroma() / ((float) Math.sqrt(getJ() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double hue = (getHue() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + hue) + 3.8d)) * 0.25f;
        float aw = viewingConditions.getAw() * ((float) Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ()));
        float nc = cos * 3846.1538f * viewingConditions.getNc() * viewingConditions.getNcb();
        float nbb = aw / viewingConditions.getNbb();
        float sin = (float) Math.sin(hue);
        float cos2 = (float) Math.cos(hue);
        float f5 = (((0.305f + nbb) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (nc * 23.0f)));
        float f6 = cos2 * f5;
        float f7 = f5 * sin;
        float f8 = nbb * 460.0f;
        float f9 = ((288.0f * f7) + ((451.0f * f6) + f8)) / 1403.0f;
        float f10 = ((f8 - (891.0f * f6)) - (261.0f * f7)) / 1403.0f;
        float f11 = ((f8 - (f6 * 220.0f)) - (f7 * 6300.0f)) / 1403.0f;
        float fl = (100.0f / viewingConditions.getFl()) * Math.signum(f9) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f9) * 27.13d) / (400.0d - Math.abs(f9))), 2.380952380952381d));
        float fl2 = (100.0f / viewingConditions.getFl()) * Math.signum(f10) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f10) * 27.13d) / (400.0d - Math.abs(f10))), 2.380952380952381d));
        float fl3 = (100.0f / viewingConditions.getFl()) * Math.signum(f11) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
        float f12 = fl / viewingConditions.getRgbD()[0];
        float f13 = fl2 / viewingConditions.getRgbD()[1];
        float f14 = fl3 / viewingConditions.getRgbD()[2];
        float[][] fArr = CamUtils.CAM16RGB_TO_XYZ;
        return ColorUtils.XYZToColor((fArr[0][2] * f14) + (fArr[0][1] * f13) + (fArr[0][0] * f12), (fArr[1][2] * f14) + (fArr[1][1] * f13) + (fArr[1][0] * f12), (f14 * fArr[2][2]) + (f13 * fArr[2][1]) + (f12 * fArr[2][0]));
    }

    @ColorInt
    public int viewedInSrgb() {
        return viewed(ViewingConditions.DEFAULT);
    }
}
