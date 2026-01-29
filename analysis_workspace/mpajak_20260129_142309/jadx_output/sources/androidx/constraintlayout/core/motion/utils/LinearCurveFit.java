package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes4.dex */
public class LinearCurveFit extends CurveFit {
    private static final String TAG = "LinearCurveFit";
    private boolean mExtrapolate = true;
    public double[] mSlopeTemp;
    private double[] mT;
    private double mTotalLength;
    private double[][] mY;

    public LinearCurveFit(double[] dArr, double[][] dArr2) {
        this.mTotalLength = Double.NaN;
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.mSlopeTemp = new double[length2];
        this.mT = dArr;
        this.mY = dArr2;
        if (length2 > 2) {
            double d5 = 0.0d;
            double d6 = 0.0d;
            int i5 = 0;
            while (i5 < dArr.length) {
                double d7 = dArr2[i5][0];
                double d8 = dArr2[i5][0];
                if (i5 > 0) {
                    Math.hypot(d7 - d5, d8 - d6);
                }
                i5++;
                d5 = d7;
                d6 = d8;
            }
            this.mTotalLength = 0.0d;
        }
    }

    private double getLength2D(double d5) {
        if (Double.isNaN(this.mTotalLength)) {
            return 0.0d;
        }
        double[] dArr = this.mT;
        int length = dArr.length;
        if (d5 <= dArr[0]) {
            return 0.0d;
        }
        int i5 = length - 1;
        if (d5 >= dArr[i5]) {
            return this.mTotalLength;
        }
        double d6 = 0.0d;
        double d7 = 0.0d;
        double d8 = 0.0d;
        int i6 = 0;
        while (i6 < i5) {
            double[][] dArr2 = this.mY;
            double d9 = dArr2[i6][0];
            double d10 = dArr2[i6][1];
            if (i6 > 0) {
                d6 += Math.hypot(d9 - d7, d10 - d8);
            }
            double[] dArr3 = this.mT;
            if (d5 == dArr3[i6]) {
                return d6;
            }
            int i7 = i6 + 1;
            if (d5 < dArr3[i7]) {
                double d11 = (d5 - dArr3[i6]) / (dArr3[i7] - dArr3[i6]);
                double[][] dArr4 = this.mY;
                double d12 = dArr4[i6][0];
                double d13 = dArr4[i7][0];
                double d14 = 1.0d - d11;
                return Math.hypot(d10 - ((dArr4[i7][1] * d11) + (dArr4[i6][1] * d14)), d9 - ((d13 * d11) + (d12 * d14))) + d6;
            }
            i6 = i7;
            d7 = d9;
            d8 = d10;
        }
        return 0.0d;
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
                double d6 = (d5 - dArr2[i6]) / (dArr2[i9] - dArr2[i6]);
                double[][] dArr3 = this.mY;
                return (dArr3[i9][i5] * d6) + ((1.0d - d6) * dArr3[i6][i5]);
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
                double d6 = (d5 - dArr3[i10]) / (dArr3[i12] - dArr3[i10]);
                while (i5 < length2) {
                    double[][] dArr4 = this.mY;
                    dArr[i5] = (dArr4[i12][i5] * d6) + ((1.0d - d6) * dArr4[i10][i5]);
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
                double d6 = (d5 - dArr2[i10]) / (dArr2[i12] - dArr2[i10]);
                while (i5 < length2) {
                    double[][] dArr3 = this.mY;
                    fArr[i5] = (float) ((dArr3[i12][i5] * d6) + ((1.0d - d6) * dArr3[i10][i5]));
                    i5++;
                }
                return;
            }
            i10 = i12;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d5, int i5) {
        double[] dArr = this.mT;
        int length = dArr.length;
        int i6 = 0;
        if (d5 < dArr[0]) {
            d5 = dArr[0];
        } else {
            int i7 = length - 1;
            if (d5 >= dArr[i7]) {
                d5 = dArr[i7];
            }
        }
        while (i6 < length - 1) {
            double[] dArr2 = this.mT;
            int i8 = i6 + 1;
            if (d5 <= dArr2[i8]) {
                double d6 = dArr2[i8] - dArr2[i6];
                double d7 = dArr2[i6];
                double[][] dArr3 = this.mY;
                return (dArr3[i8][i5] - dArr3[i6][i5]) / d6;
            }
            i6 = i8;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d5, double[] dArr) {
        double[] dArr2 = this.mT;
        int length = dArr2.length;
        int length2 = this.mY[0].length;
        if (d5 <= dArr2[0]) {
            d5 = dArr2[0];
        } else {
            int i5 = length - 1;
            if (d5 >= dArr2[i5]) {
                d5 = dArr2[i5];
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            double[] dArr3 = this.mT;
            int i7 = i6 + 1;
            if (d5 <= dArr3[i7]) {
                double d6 = dArr3[i7] - dArr3[i6];
                double d7 = dArr3[i6];
                for (int i8 = 0; i8 < length2; i8++) {
                    double[][] dArr4 = this.mY;
                    dArr[i8] = (dArr4[i7][i8] - dArr4[i6][i8]) / d6;
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
