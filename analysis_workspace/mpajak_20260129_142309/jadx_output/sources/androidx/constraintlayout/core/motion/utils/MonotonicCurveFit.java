package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class MonotonicCurveFit extends CurveFit {
    private static final String TAG = "MonotonicCurveFit";
    private boolean mExtrapolate = true;
    public double[] mSlopeTemp;
    private double[] mT;
    private double[][] mTangent;
    private double[][] mY;

    public MonotonicCurveFit(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.mSlopeTemp = new double[length2];
        int i5 = length - 1;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) double.class, i5, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) double.class, length, length2);
        for (int i6 = 0; i6 < length2; i6++) {
            int i7 = 0;
            while (i7 < i5) {
                int i8 = i7 + 1;
                dArr3[i7][i6] = (dArr2[i8][i6] - dArr2[i7][i6]) / (dArr[i8] - dArr[i7]);
                if (i7 == 0) {
                    dArr4[i7][i6] = dArr3[i7][i6];
                } else {
                    dArr4[i7][i6] = (dArr3[i7 - 1][i6] + dArr3[i7][i6]) * 0.5d;
                }
                i7 = i8;
            }
            dArr4[i5][i6] = dArr3[length - 2][i6];
        }
        for (int i9 = 0; i9 < i5; i9++) {
            for (int i10 = 0; i10 < length2; i10++) {
                if (dArr3[i9][i10] == 0.0d) {
                    dArr4[i9][i10] = 0.0d;
                    dArr4[i9 + 1][i10] = 0.0d;
                } else {
                    double d5 = dArr4[i9][i10] / dArr3[i9][i10];
                    int i11 = i9 + 1;
                    double d6 = dArr4[i11][i10] / dArr3[i9][i10];
                    double hypot = Math.hypot(d5, d6);
                    if (hypot > 9.0d) {
                        double d7 = 3.0d / hypot;
                        dArr4[i9][i10] = d5 * d7 * dArr3[i9][i10];
                        dArr4[i11][i10] = d7 * d6 * dArr3[i9][i10];
                    }
                }
            }
        }
        this.mT = dArr;
        this.mY = dArr2;
        this.mTangent = dArr4;
    }

    public static MonotonicCurveFit buildWave(String str) {
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i5 = 0;
        while (indexOf2 != -1) {
            dArr[i5] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i5++;
        }
        dArr[i5] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        return buildWave(Arrays.copyOf(dArr, i5 + 1));
    }

    private static MonotonicCurveFit buildWave(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d5 = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, length, 1);
        double[] dArr3 = new double[length];
        for (int i5 = 0; i5 < dArr.length; i5++) {
            double d6 = dArr[i5];
            int i6 = i5 + length2;
            dArr2[i6][0] = d6;
            double d7 = i5 * d5;
            dArr3[i6] = d7;
            if (i5 > 0) {
                int i7 = (length2 * 2) + i5;
                dArr2[i7][0] = d6 + 1.0d;
                dArr3[i7] = d7 + 1.0d;
                int i8 = i5 - 1;
                dArr2[i8][0] = (d6 - 1.0d) - d5;
                dArr3[i8] = (d7 - 1.0d) - d5;
            }
        }
        return new MonotonicCurveFit(dArr3, dArr2);
    }

    private static double diff(double d5, double d6, double d7, double d8, double d9, double d10) {
        double d11 = d6 * d6;
        double d12 = d6 * 6.0d;
        double d13 = 6.0d * d11 * d7;
        double d14 = 3.0d * d5;
        return (d5 * d9) + (((((d14 * d9) * d11) + (((d14 * d10) * d11) + ((d13 + ((d12 * d8) + (((-6.0d) * d11) * d8))) - (d12 * d7)))) - (((2.0d * d5) * d10) * d6)) - (((4.0d * d5) * d9) * d6));
    }

    private static double interpolate(double d5, double d6, double d7, double d8, double d9, double d10) {
        double d11 = d6 * d6;
        double d12 = d11 * d6;
        double d13 = 3.0d * d11;
        double d14 = d12 * 2.0d * d7;
        double d15 = ((d14 + ((d13 * d8) + (((-2.0d) * d12) * d8))) - (d13 * d7)) + d7;
        double d16 = d5 * d10;
        double d17 = (d16 * d12) + d15;
        double d18 = d5 * d9;
        return (d18 * d6) + ((((d12 * d18) + d17) - (d16 * d11)) - (((2.0d * d5) * d9) * d11));
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d5, int i5) {
        double[] dArr = this.mT;
        int length = dArr.length;
        int i6 = 0;
        if (this.mExtrapolate) {
            if (d5 <= dArr[0]) {
                return (getSlope(dArr[0], i5) * (d5 - dArr[0])) + this.mY[0][i5];
            }
            int i7 = length - 1;
            if (d5 >= dArr[i7]) {
                return (getSlope(dArr[i7], i5) * (d5 - dArr[i7])) + this.mY[i7][i5];
            }
        } else {
            if (d5 <= dArr[0]) {
                return this.mY[0][i5];
            }
            int i8 = length - 1;
            if (d5 >= dArr[i8]) {
                return this.mY[i8][i5];
            }
        }
        while (i6 < length - 1) {
            double[] dArr2 = this.mT;
            if (d5 == dArr2[i6]) {
                return this.mY[i6][i5];
            }
            int i9 = i6 + 1;
            if (d5 < dArr2[i9]) {
                double d6 = dArr2[i9] - dArr2[i6];
                double d7 = (d5 - dArr2[i6]) / d6;
                double[][] dArr3 = this.mY;
                double d8 = dArr3[i6][i5];
                double d9 = dArr3[i9][i5];
                double[][] dArr4 = this.mTangent;
                return interpolate(d6, d7, d8, d9, dArr4[i6][i5], dArr4[i9][i5]);
            }
            i6 = i9;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d5, double[] dArr) {
        double[] dArr2 = this.mT;
        int length = dArr2.length;
        int i5 = 0;
        int length2 = this.mY[0].length;
        if (this.mExtrapolate) {
            if (d5 <= dArr2[0]) {
                getSlope(dArr2[0], this.mSlopeTemp);
                for (int i6 = 0; i6 < length2; i6++) {
                    dArr[i6] = ((d5 - this.mT[0]) * this.mSlopeTemp[i6]) + this.mY[0][i6];
                }
                return;
            }
            int i7 = length - 1;
            if (d5 >= dArr2[i7]) {
                getSlope(dArr2[i7], this.mSlopeTemp);
                while (i5 < length2) {
                    dArr[i5] = ((d5 - this.mT[i7]) * this.mSlopeTemp[i5]) + this.mY[i7][i5];
                    i5++;
                }
                return;
            }
        } else {
            if (d5 <= dArr2[0]) {
                for (int i8 = 0; i8 < length2; i8++) {
                    dArr[i8] = this.mY[0][i8];
                }
                return;
            }
            int i9 = length - 1;
            if (d5 >= dArr2[i9]) {
                while (i5 < length2) {
                    dArr[i5] = this.mY[i9][i5];
                    i5++;
                }
                return;
            }
        }
        int i10 = 0;
        while (i10 < length - 1) {
            if (d5 == this.mT[i10]) {
                for (int i11 = 0; i11 < length2; i11++) {
                    dArr[i11] = this.mY[i10][i11];
                }
            }
            double[] dArr3 = this.mT;
            int i12 = i10 + 1;
            if (d5 < dArr3[i12]) {
                double d6 = dArr3[i12] - dArr3[i10];
                double d7 = (d5 - dArr3[i10]) / d6;
                while (i5 < length2) {
                    double[][] dArr4 = this.mY;
                    double d8 = dArr4[i10][i5];
                    double d9 = dArr4[i12][i5];
                    double[][] dArr5 = this.mTangent;
                    dArr[i5] = interpolate(d6, d7, d8, d9, dArr5[i10][i5], dArr5[i12][i5]);
                    i5++;
                }
                return;
            }
            i10 = i12;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d5, float[] fArr) {
        double[] dArr = this.mT;
        int length = dArr.length;
        int i5 = 0;
        int length2 = this.mY[0].length;
        if (this.mExtrapolate) {
            if (d5 <= dArr[0]) {
                getSlope(dArr[0], this.mSlopeTemp);
                for (int i6 = 0; i6 < length2; i6++) {
                    fArr[i6] = (float) (((d5 - this.mT[0]) * this.mSlopeTemp[i6]) + this.mY[0][i6]);
                }
                return;
            }
            int i7 = length - 1;
            if (d5 >= dArr[i7]) {
                getSlope(dArr[i7], this.mSlopeTemp);
                while (i5 < length2) {
                    fArr[i5] = (float) (((d5 - this.mT[i7]) * this.mSlopeTemp[i5]) + this.mY[i7][i5]);
                    i5++;
                }
                return;
            }
        } else {
            if (d5 <= dArr[0]) {
                for (int i8 = 0; i8 < length2; i8++) {
                    fArr[i8] = (float) this.mY[0][i8];
                }
                return;
            }
            int i9 = length - 1;
            if (d5 >= dArr[i9]) {
                while (i5 < length2) {
                    fArr[i5] = (float) this.mY[i9][i5];
                    i5++;
                }
                return;
            }
        }
        int i10 = 0;
        while (i10 < length - 1) {
            if (d5 == this.mT[i10]) {
                for (int i11 = 0; i11 < length2; i11++) {
                    fArr[i11] = (float) this.mY[i10][i11];
                }
            }
            double[] dArr2 = this.mT;
            int i12 = i10 + 1;
            if (d5 < dArr2[i12]) {
                double d6 = dArr2[i12] - dArr2[i10];
                double d7 = (d5 - dArr2[i10]) / d6;
                while (i5 < length2) {
                    double[][] dArr3 = this.mY;
                    double d8 = dArr3[i10][i5];
                    double d9 = dArr3[i12][i5];
                    double[][] dArr4 = this.mTangent;
                    fArr[i5] = (float) interpolate(d6, d7, d8, d9, dArr4[i10][i5], dArr4[i12][i5]);
                    i5++;
                }
                return;
            }
            i10 = i12;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d5, int i5) {
        double d6;
        double[] dArr = this.mT;
        int length = dArr.length;
        int i6 = 0;
        if (d5 < dArr[0]) {
            d6 = dArr[0];
        } else {
            int i7 = length - 1;
            d6 = d5 >= dArr[i7] ? dArr[i7] : d5;
        }
        while (i6 < length - 1) {
            double[] dArr2 = this.mT;
            int i8 = i6 + 1;
            if (d6 <= dArr2[i8]) {
                double d7 = dArr2[i8] - dArr2[i6];
                double d8 = (d6 - dArr2[i6]) / d7;
                double[][] dArr3 = this.mY;
                double d9 = dArr3[i6][i5];
                double d10 = dArr3[i8][i5];
                double[][] dArr4 = this.mTangent;
                return diff(d7, d8, d9, d10, dArr4[i6][i5], dArr4[i8][i5]) / d7;
            }
            i6 = i8;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d5, double[] dArr) {
        double d6;
        double[] dArr2 = this.mT;
        int length = dArr2.length;
        int length2 = this.mY[0].length;
        if (d5 <= dArr2[0]) {
            d6 = dArr2[0];
        } else {
            int i5 = length - 1;
            d6 = d5 >= dArr2[i5] ? dArr2[i5] : d5;
        }
        int i6 = 0;
        while (i6 < length - 1) {
            double[] dArr3 = this.mT;
            int i7 = i6 + 1;
            if (d6 <= dArr3[i7]) {
                double d7 = dArr3[i7] - dArr3[i6];
                double d8 = (d6 - dArr3[i6]) / d7;
                for (int i8 = 0; i8 < length2; i8++) {
                    double[][] dArr4 = this.mY;
                    double d9 = dArr4[i6][i8];
                    double d10 = dArr4[i7][i8];
                    double[][] dArr5 = this.mTangent;
                    dArr[i8] = diff(d7, d8, d9, d10, dArr5[i6][i8], dArr5[i7][i8]) / d7;
                }
                return;
            }
            i6 = i7;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mT;
    }
}
