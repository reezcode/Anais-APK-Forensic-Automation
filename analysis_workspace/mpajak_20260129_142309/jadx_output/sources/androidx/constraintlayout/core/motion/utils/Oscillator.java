package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes5.dex */
public class Oscillator {
    public static final int BOUNCE = 6;
    public static final int COS_WAVE = 5;
    public static final int CUSTOM = 7;
    public static final int REVERSE_SAW_WAVE = 4;
    public static final int SAW_WAVE = 3;
    public static final int SIN_WAVE = 0;
    public static final int SQUARE_WAVE = 1;
    public static String TAG = "Oscillator";
    public static final int TRIANGLE_WAVE = 2;
    public double[] mArea;
    public MonotonicCurveFit mCustomCurve;
    public String mCustomType;
    public int mType;
    public float[] mPeriod = new float[0];
    public double[] mPosition = new double[0];
    public double PI2 = 6.283185307179586d;
    private boolean mNormalized = false;

    public void addPoint(double d5, float f5) {
        int length = this.mPeriod.length + 1;
        int binarySearch = Arrays.binarySearch(this.mPosition, d5);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.mPosition = Arrays.copyOf(this.mPosition, length);
        this.mPeriod = Arrays.copyOf(this.mPeriod, length);
        this.mArea = new double[length];
        double[] dArr = this.mPosition;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.mPosition[binarySearch] = d5;
        this.mPeriod[binarySearch] = f5;
        this.mNormalized = false;
    }

    public double getDP(double d5) {
        if (d5 <= 0.0d) {
            d5 = 1.0E-5d;
        } else if (d5 >= 1.0d) {
            d5 = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.mPosition, d5);
        if (binarySearch > 0 || binarySearch == 0) {
            return 0.0d;
        }
        int i5 = (-binarySearch) - 1;
        float[] fArr = this.mPeriod;
        int i6 = i5 - 1;
        double d6 = fArr[i5] - fArr[i6];
        double[] dArr = this.mPosition;
        double d7 = d6 / (dArr[i5] - dArr[i6]);
        return (fArr[i6] - (d7 * dArr[i6])) + (d5 * d7);
    }

    public double getP(double d5) {
        if (d5 < 0.0d) {
            d5 = 0.0d;
        } else if (d5 > 1.0d) {
            d5 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.mPosition, d5);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i5 = (-binarySearch) - 1;
        float[] fArr = this.mPeriod;
        int i6 = i5 - 1;
        double d6 = fArr[i5] - fArr[i6];
        double[] dArr = this.mPosition;
        double d7 = d6 / (dArr[i5] - dArr[i6]);
        return ((((d5 * d5) - (dArr[i6] * dArr[i6])) * d7) / 2.0d) + ((d5 - dArr[i6]) * (fArr[i6] - (dArr[i6] * d7))) + this.mArea[i6];
    }

    public double getSlope(double d5, double d6, double d7) {
        double d8;
        double signum;
        double p4 = getP(d5) + d6;
        double dp = getDP(d5) + d7;
        switch (this.mType) {
            case 1:
                return 0.0d;
            case 2:
                d8 = dp * 4.0d;
                signum = Math.signum((((p4 * 4.0d) + 3.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return dp * 2.0d;
            case 4:
                return (-dp) * 2.0d;
            case 5:
                double d9 = this.PI2;
                return Math.sin(d9 * p4) * (-d9) * dp;
            case 6:
                return ((((p4 * 4.0d) + 2.0d) % 4.0d) - 2.0d) * dp * 4.0d;
            case 7:
                return this.mCustomCurve.getSlope(p4 % 1.0d, 0);
            default:
                double d10 = this.PI2;
                d8 = dp * d10;
                signum = Math.cos(d10 * p4);
                break;
        }
        return signum * d8;
    }

    public double getValue(double d5, double d6) {
        double abs;
        double p4 = getP(d5) + d6;
        switch (this.mType) {
            case 1:
                return Math.signum(0.5d - (p4 % 1.0d));
            case 2:
                abs = Math.abs((((p4 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((p4 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((p4 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos((d6 + p4) * this.PI2);
            case 6:
                double abs2 = 1.0d - Math.abs(((p4 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.mCustomCurve.getPos(p4 % 1.0d, 0);
            default:
                return Math.sin(this.PI2 * p4);
        }
        return 1.0d - abs;
    }

    public void normalize() {
        double d5 = 0.0d;
        int i5 = 0;
        while (true) {
            if (i5 >= this.mPeriod.length) {
                break;
            }
            d5 += r7[i5];
            i5++;
        }
        double d6 = 0.0d;
        int i6 = 1;
        while (true) {
            float[] fArr = this.mPeriod;
            if (i6 >= fArr.length) {
                break;
            }
            int i7 = i6 - 1;
            float f5 = (fArr[i7] + fArr[i6]) / 2.0f;
            double[] dArr = this.mPosition;
            d6 += (dArr[i6] - dArr[i7]) * f5;
            i6++;
        }
        int i8 = 0;
        while (true) {
            float[] fArr2 = this.mPeriod;
            if (i8 >= fArr2.length) {
                break;
            }
            fArr2[i8] = (float) (fArr2[i8] * (d5 / d6));
            i8++;
        }
        this.mArea[0] = 0.0d;
        int i9 = 1;
        while (true) {
            float[] fArr3 = this.mPeriod;
            if (i9 >= fArr3.length) {
                this.mNormalized = true;
                return;
            }
            int i10 = i9 - 1;
            float f6 = (fArr3[i10] + fArr3[i9]) / 2.0f;
            double[] dArr2 = this.mPosition;
            double d7 = dArr2[i9] - dArr2[i10];
            double[] dArr3 = this.mArea;
            dArr3[i9] = (d7 * f6) + dArr3[i10];
            i9++;
        }
    }

    public void setType(int i5, String str) {
        this.mType = i5;
        this.mCustomType = str;
        if (str != null) {
            this.mCustomCurve = MonotonicCurveFit.buildWave(str);
        }
    }

    public String toString() {
        StringBuilder g5 = androidx.activity.d.g("pos =");
        g5.append(Arrays.toString(this.mPosition));
        g5.append(" period=");
        g5.append(Arrays.toString(this.mPeriod));
        return g5.toString();
    }
}
