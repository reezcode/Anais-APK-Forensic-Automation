package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes21.dex */
public class ArcCurveFit extends CurveFit {
    public static final int ARC_START_FLIP = 3;
    public static final int ARC_START_HORIZONTAL = 2;
    public static final int ARC_START_LINEAR = 0;
    public static final int ARC_START_VERTICAL = 1;
    private static final int START_HORIZONTAL = 2;
    private static final int START_LINEAR = 3;
    private static final int START_VERTICAL = 1;
    public Arc[] mArcs;
    private boolean mExtrapolate = true;
    private final double[] mTime;

    /* loaded from: classes18.dex */
    public static class Arc {
        private static final double EPSILON = 0.001d;
        private static final String TAG = "Arc";
        private static double[] ourPercent = new double[91];
        public boolean linear;
        public double mArcDistance;
        public double mArcVelocity;
        public double mEllipseA;
        public double mEllipseB;
        public double mEllipseCenterX;
        public double mEllipseCenterY;
        public double[] mLut;
        public double mOneOverDeltaTime;
        public double mTime1;
        public double mTime2;
        public double mTmpCosAngle;
        public double mTmpSinAngle;
        public boolean mVertical;
        public double mX1;
        public double mX2;
        public double mY1;
        public double mY2;

        public Arc(int i5, double d5, double d6, double d7, double d8, double d9, double d10) {
            this.linear = false;
            this.mVertical = i5 == 1;
            this.mTime1 = d5;
            this.mTime2 = d6;
            this.mOneOverDeltaTime = 1.0d / (d6 - d5);
            if (3 == i5) {
                this.linear = true;
            }
            double d11 = d9 - d7;
            double d12 = d10 - d8;
            if (!this.linear && Math.abs(d11) >= EPSILON && Math.abs(d12) >= EPSILON) {
                this.mLut = new double[101];
                boolean z4 = this.mVertical;
                this.mEllipseA = d11 * (z4 ? -1 : 1);
                this.mEllipseB = d12 * (z4 ? 1 : -1);
                this.mEllipseCenterX = z4 ? d9 : d7;
                this.mEllipseCenterY = z4 ? d8 : d10;
                buildTable(d7, d8, d9, d10);
                this.mArcVelocity = this.mArcDistance * this.mOneOverDeltaTime;
                return;
            }
            this.linear = true;
            this.mX1 = d7;
            this.mX2 = d9;
            this.mY1 = d8;
            this.mY2 = d10;
            double hypot = Math.hypot(d12, d11);
            this.mArcDistance = hypot;
            this.mArcVelocity = hypot * this.mOneOverDeltaTime;
            double d13 = this.mTime2;
            double d14 = this.mTime1;
            this.mEllipseCenterX = d11 / (d13 - d14);
            this.mEllipseCenterY = d12 / (d13 - d14);
        }

        private void buildTable(double d5, double d6, double d7, double d8) {
            double d9;
            double d10 = d7 - d5;
            double d11 = d6 - d8;
            int i5 = 0;
            double d12 = 0.0d;
            double d13 = 0.0d;
            double d14 = 0.0d;
            while (true) {
                if (i5 >= ourPercent.length) {
                    break;
                }
                double d15 = d12;
                double radians = Math.toRadians((i5 * 90.0d) / (r15.length - 1));
                double sin = Math.sin(radians) * d10;
                double cos = Math.cos(radians) * d11;
                if (i5 > 0) {
                    d9 = Math.hypot(sin - d13, cos - d14) + d15;
                    ourPercent[i5] = d9;
                } else {
                    d9 = d15;
                }
                i5++;
                d14 = cos;
                d12 = d9;
                d13 = sin;
            }
            double d16 = d12;
            this.mArcDistance = d16;
            int i6 = 0;
            while (true) {
                double[] dArr = ourPercent;
                if (i6 >= dArr.length) {
                    break;
                }
                dArr[i6] = dArr[i6] / d16;
                i6++;
            }
            int i7 = 0;
            while (true) {
                if (i7 >= this.mLut.length) {
                    return;
                }
                double length = i7 / (r1.length - 1);
                int binarySearch = Arrays.binarySearch(ourPercent, length);
                if (binarySearch >= 0) {
                    this.mLut[i7] = binarySearch / (ourPercent.length - 1);
                } else if (binarySearch == -1) {
                    this.mLut[i7] = 0.0d;
                } else {
                    int i8 = -binarySearch;
                    int i9 = i8 - 2;
                    double[] dArr2 = ourPercent;
                    this.mLut[i7] = (((length - dArr2[i9]) / (dArr2[i8 - 1] - dArr2[i9])) + i9) / (dArr2.length - 1);
                }
                i7++;
            }
        }

        public double getDX() {
            double d5 = this.mEllipseA * this.mTmpCosAngle;
            double hypot = this.mArcVelocity / Math.hypot(d5, (-this.mEllipseB) * this.mTmpSinAngle);
            if (this.mVertical) {
                d5 = -d5;
            }
            return d5 * hypot;
        }

        public double getDY() {
            double d5 = this.mEllipseA * this.mTmpCosAngle;
            double d6 = (-this.mEllipseB) * this.mTmpSinAngle;
            double hypot = this.mArcVelocity / Math.hypot(d5, d6);
            return this.mVertical ? (-d6) * hypot : d6 * hypot;
        }

        public double getLinearDX(double d5) {
            return this.mEllipseCenterX;
        }

        public double getLinearDY(double d5) {
            return this.mEllipseCenterY;
        }

        public double getLinearX(double d5) {
            double d6 = (d5 - this.mTime1) * this.mOneOverDeltaTime;
            double d7 = this.mX1;
            return ((this.mX2 - d7) * d6) + d7;
        }

        public double getLinearY(double d5) {
            double d6 = (d5 - this.mTime1) * this.mOneOverDeltaTime;
            double d7 = this.mY1;
            return ((this.mY2 - d7) * d6) + d7;
        }

        public double getX() {
            return (this.mEllipseA * this.mTmpSinAngle) + this.mEllipseCenterX;
        }

        public double getY() {
            return (this.mEllipseB * this.mTmpCosAngle) + this.mEllipseCenterY;
        }

        public double lookup(double d5) {
            if (d5 <= 0.0d) {
                return 0.0d;
            }
            if (d5 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.mLut;
            double length = d5 * (dArr.length - 1);
            int i5 = (int) length;
            return ((dArr[i5 + 1] - dArr[i5]) * (length - i5)) + dArr[i5];
        }

        public void setPoint(double d5) {
            double lookup = lookup((this.mVertical ? this.mTime2 - d5 : d5 - this.mTime1) * this.mOneOverDeltaTime) * 1.5707963267948966d;
            this.mTmpSinAngle = Math.sin(lookup);
            this.mTmpCosAngle = Math.cos(lookup);
        }
    }

    public ArcCurveFit(int[] iArr, double[] dArr, double[][] dArr2) {
        this.mTime = dArr;
        this.mArcs = new Arc[dArr.length - 1];
        int i5 = 0;
        int i6 = 1;
        int i7 = 1;
        while (true) {
            Arc[] arcArr = this.mArcs;
            if (i5 >= arcArr.length) {
                return;
            }
            int i8 = iArr[i5];
            if (i8 == 0) {
                i7 = 3;
            } else if (i8 == 1) {
                i6 = 1;
                i7 = 1;
            } else if (i8 == 2) {
                i6 = 2;
                i7 = 2;
            } else if (i8 == 3) {
                i6 = i6 == 1 ? 2 : 1;
                i7 = i6;
            }
            int i9 = i5 + 1;
            arcArr[i5] = new Arc(i7, dArr[i5], dArr[i9], dArr2[i5][0], dArr2[i5][1], dArr2[i9][0], dArr2[i9][1]);
            i5 = i9;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d5, int i5) {
        int i6 = 0;
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            if (d5 < arcArr[0].mTime1) {
                double d6 = arcArr[0].mTime1;
                double d7 = d5 - arcArr[0].mTime1;
                if (arcArr[0].linear) {
                    if (i5 == 0) {
                        return (d7 * this.mArcs[0].getLinearDX(d6)) + arcArr[0].getLinearX(d6);
                    }
                    return (d7 * this.mArcs[0].getLinearDY(d6)) + arcArr[0].getLinearY(d6);
                }
                arcArr[0].setPoint(d6);
                if (i5 == 0) {
                    return (d7 * this.mArcs[0].getDX()) + this.mArcs[0].getX();
                }
                return (d7 * this.mArcs[0].getDY()) + this.mArcs[0].getY();
            }
            if (d5 > arcArr[arcArr.length - 1].mTime2) {
                double d8 = arcArr[arcArr.length - 1].mTime2;
                double d9 = d5 - d8;
                int length = arcArr.length - 1;
                if (i5 == 0) {
                    return (d9 * this.mArcs[length].getLinearDX(d8)) + arcArr[length].getLinearX(d8);
                }
                return (d9 * this.mArcs[length].getLinearDY(d8)) + arcArr[length].getLinearY(d8);
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            if (d5 < arcArr2[0].mTime1) {
                d5 = arcArr2[0].mTime1;
            } else if (d5 > arcArr2[arcArr2.length - 1].mTime2) {
                d5 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i6 >= arcArr3.length) {
                return Double.NaN;
            }
            if (d5 <= arcArr3[i6].mTime2) {
                if (arcArr3[i6].linear) {
                    return i5 == 0 ? arcArr3[i6].getLinearX(d5) : arcArr3[i6].getLinearY(d5);
                }
                arcArr3[i6].setPoint(d5);
                Arc[] arcArr4 = this.mArcs;
                return i5 == 0 ? arcArr4[i6].getX() : arcArr4[i6].getY();
            }
            i6++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d5, double[] dArr) {
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            if (d5 < arcArr[0].mTime1) {
                double d6 = arcArr[0].mTime1;
                double d7 = d5 - arcArr[0].mTime1;
                if (arcArr[0].linear) {
                    dArr[0] = (this.mArcs[0].getLinearDX(d6) * d7) + arcArr[0].getLinearX(d6);
                    dArr[1] = (d7 * this.mArcs[0].getLinearDY(d6)) + this.mArcs[0].getLinearY(d6);
                    return;
                }
                arcArr[0].setPoint(d6);
                dArr[0] = (this.mArcs[0].getDX() * d7) + this.mArcs[0].getX();
                dArr[1] = (d7 * this.mArcs[0].getDY()) + this.mArcs[0].getY();
                return;
            }
            if (d5 > arcArr[arcArr.length - 1].mTime2) {
                double d8 = arcArr[arcArr.length - 1].mTime2;
                double d9 = d5 - d8;
                int length = arcArr.length - 1;
                if (arcArr[length].linear) {
                    dArr[0] = (this.mArcs[length].getLinearDX(d8) * d9) + arcArr[length].getLinearX(d8);
                    dArr[1] = (d9 * this.mArcs[length].getLinearDY(d8)) + this.mArcs[length].getLinearY(d8);
                    return;
                }
                arcArr[length].setPoint(d5);
                dArr[0] = (this.mArcs[length].getDX() * d9) + this.mArcs[length].getX();
                dArr[1] = (d9 * this.mArcs[length].getDY()) + this.mArcs[length].getY();
                return;
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            if (d5 < arcArr2[0].mTime1) {
                d5 = arcArr2[0].mTime1;
            }
            if (d5 > arcArr2[arcArr2.length - 1].mTime2) {
                d5 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i5 = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i5 >= arcArr3.length) {
                return;
            }
            if (d5 <= arcArr3[i5].mTime2) {
                if (arcArr3[i5].linear) {
                    dArr[0] = arcArr3[i5].getLinearX(d5);
                    dArr[1] = this.mArcs[i5].getLinearY(d5);
                    return;
                } else {
                    arcArr3[i5].setPoint(d5);
                    dArr[0] = this.mArcs[i5].getX();
                    dArr[1] = this.mArcs[i5].getY();
                    return;
                }
            }
            i5++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d5, float[] fArr) {
        if (this.mExtrapolate) {
            Arc[] arcArr = this.mArcs;
            if (d5 < arcArr[0].mTime1) {
                double d6 = arcArr[0].mTime1;
                double d7 = d5 - arcArr[0].mTime1;
                if (arcArr[0].linear) {
                    fArr[0] = (float) ((this.mArcs[0].getLinearDX(d6) * d7) + arcArr[0].getLinearX(d6));
                    fArr[1] = (float) ((d7 * this.mArcs[0].getLinearDY(d6)) + this.mArcs[0].getLinearY(d6));
                    return;
                }
                arcArr[0].setPoint(d6);
                fArr[0] = (float) ((this.mArcs[0].getDX() * d7) + this.mArcs[0].getX());
                fArr[1] = (float) ((d7 * this.mArcs[0].getDY()) + this.mArcs[0].getY());
                return;
            }
            if (d5 > arcArr[arcArr.length - 1].mTime2) {
                double d8 = arcArr[arcArr.length - 1].mTime2;
                double d9 = d5 - d8;
                int length = arcArr.length - 1;
                if (!arcArr[length].linear) {
                    arcArr[length].setPoint(d5);
                    fArr[0] = (float) this.mArcs[length].getX();
                    fArr[1] = (float) this.mArcs[length].getY();
                    return;
                } else {
                    fArr[0] = (float) ((this.mArcs[length].getLinearDX(d8) * d9) + arcArr[length].getLinearX(d8));
                    fArr[1] = (float) ((d9 * this.mArcs[length].getLinearDY(d8)) + this.mArcs[length].getLinearY(d8));
                    return;
                }
            }
        } else {
            Arc[] arcArr2 = this.mArcs;
            if (d5 < arcArr2[0].mTime1) {
                d5 = arcArr2[0].mTime1;
            } else if (d5 > arcArr2[arcArr2.length - 1].mTime2) {
                d5 = arcArr2[arcArr2.length - 1].mTime2;
            }
        }
        int i5 = 0;
        while (true) {
            Arc[] arcArr3 = this.mArcs;
            if (i5 >= arcArr3.length) {
                return;
            }
            if (d5 <= arcArr3[i5].mTime2) {
                if (arcArr3[i5].linear) {
                    fArr[0] = (float) arcArr3[i5].getLinearX(d5);
                    fArr[1] = (float) this.mArcs[i5].getLinearY(d5);
                    return;
                } else {
                    arcArr3[i5].setPoint(d5);
                    fArr[0] = (float) this.mArcs[i5].getX();
                    fArr[1] = (float) this.mArcs[i5].getY();
                    return;
                }
            }
            i5++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d5, int i5) {
        Arc[] arcArr = this.mArcs;
        int i6 = 0;
        if (d5 < arcArr[0].mTime1) {
            d5 = arcArr[0].mTime1;
        }
        if (d5 > arcArr[arcArr.length - 1].mTime2) {
            d5 = arcArr[arcArr.length - 1].mTime2;
        }
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i6 >= arcArr2.length) {
                return Double.NaN;
            }
            if (d5 <= arcArr2[i6].mTime2) {
                if (arcArr2[i6].linear) {
                    return i5 == 0 ? arcArr2[i6].getLinearDX(d5) : arcArr2[i6].getLinearDY(d5);
                }
                arcArr2[i6].setPoint(d5);
                Arc[] arcArr3 = this.mArcs;
                return i5 == 0 ? arcArr3[i6].getDX() : arcArr3[i6].getDY();
            }
            i6++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d5, double[] dArr) {
        Arc[] arcArr = this.mArcs;
        if (d5 < arcArr[0].mTime1) {
            d5 = arcArr[0].mTime1;
        } else if (d5 > arcArr[arcArr.length - 1].mTime2) {
            d5 = arcArr[arcArr.length - 1].mTime2;
        }
        int i5 = 0;
        while (true) {
            Arc[] arcArr2 = this.mArcs;
            if (i5 >= arcArr2.length) {
                return;
            }
            if (d5 <= arcArr2[i5].mTime2) {
                if (arcArr2[i5].linear) {
                    dArr[0] = arcArr2[i5].getLinearDX(d5);
                    dArr[1] = this.mArcs[i5].getLinearDY(d5);
                    return;
                } else {
                    arcArr2[i5].setPoint(d5);
                    dArr[0] = this.mArcs[i5].getDX();
                    dArr[1] = this.mArcs[i5].getDY();
                    return;
                }
            }
            i5++;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mTime;
    }
}
