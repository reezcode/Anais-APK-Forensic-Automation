package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.MotionWidget;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes24.dex */
public abstract class KeyCycleOscillator {
    private static final String TAG = "KeyCycleOscillator";
    private CurveFit mCurveFit;
    private CycleOscillator mCycleOscillator;
    private String mType;
    private int mWaveShape = 0;
    private String mWaveString = null;
    public int mVariesBy = 0;
    public ArrayList<WavePoint> mWavePoints = new ArrayList<>();

    /* loaded from: classes4.dex */
    public static class CoreSpline extends KeyCycleOscillator {
        public String type;
        public int typeId;

        public CoreSpline(String str) {
            this.type = str;
            this.typeId = c.a(str);
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(MotionWidget motionWidget, float f5) {
            motionWidget.setValue(this.typeId, get(f5));
        }
    }

    /* loaded from: classes16.dex */
    public static class CycleOscillator {
        private static final String TAG = "CycleOscillator";
        public static final int UNSET = -1;
        private final int OFFST;
        private final int PHASE;
        private final int VALUE;
        public CurveFit mCurveFit;
        public float[] mOffset;
        public Oscillator mOscillator;
        public float mPathLength;
        public float[] mPeriod;
        public float[] mPhase;
        public double[] mPosition;
        public float[] mScale;
        public double[] mSplineSlopeCache;
        public double[] mSplineValueCache;
        public float[] mValues;
        private final int mVariesBy;
        public int mWaveShape;

        public CycleOscillator(int i5, String str, int i6, int i7) {
            Oscillator oscillator = new Oscillator();
            this.mOscillator = oscillator;
            this.OFFST = 0;
            this.PHASE = 1;
            this.VALUE = 2;
            this.mWaveShape = i5;
            this.mVariesBy = i6;
            oscillator.setType(i5, str);
            this.mValues = new float[i7];
            this.mPosition = new double[i7];
            this.mPeriod = new float[i7];
            this.mOffset = new float[i7];
            this.mPhase = new float[i7];
            this.mScale = new float[i7];
        }

        public double getLastPhase() {
            return this.mSplineValueCache[1];
        }

        public double getSlope(float f5) {
            CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                double d5 = f5;
                curveFit.getSlope(d5, this.mSplineSlopeCache);
                this.mCurveFit.getPos(d5, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineSlopeCache;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d6 = f5;
            double value = this.mOscillator.getValue(d6, this.mSplineValueCache[1]);
            double slope = this.mOscillator.getSlope(d6, this.mSplineValueCache[1], this.mSplineSlopeCache[1]);
            double[] dArr2 = this.mSplineSlopeCache;
            return (slope * this.mSplineValueCache[2]) + (value * dArr2[2]) + dArr2[0];
        }

        public double getValues(float f5) {
            CurveFit curveFit = this.mCurveFit;
            if (curveFit != null) {
                curveFit.getPos(f5, this.mSplineValueCache);
            } else {
                double[] dArr = this.mSplineValueCache;
                dArr[0] = this.mOffset[0];
                dArr[1] = this.mPhase[0];
                dArr[2] = this.mValues[0];
            }
            double[] dArr2 = this.mSplineValueCache;
            return (this.mOscillator.getValue(f5, dArr2[1]) * this.mSplineValueCache[2]) + dArr2[0];
        }

        public void setPoint(int i5, int i6, float f5, float f6, float f7, float f8) {
            this.mPosition[i5] = i6 / 100.0d;
            this.mPeriod[i5] = f5;
            this.mOffset[i5] = f6;
            this.mPhase[i5] = f7;
            this.mValues[i5] = f8;
        }

        public void setup(float f5) {
            this.mPathLength = f5;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) double.class, this.mPosition.length, 3);
            float[] fArr = this.mValues;
            this.mSplineValueCache = new double[fArr.length + 2];
            this.mSplineSlopeCache = new double[fArr.length + 2];
            if (this.mPosition[0] > 0.0d) {
                this.mOscillator.addPoint(0.0d, this.mPeriod[0]);
            }
            double[] dArr2 = this.mPosition;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.mOscillator.addPoint(1.0d, this.mPeriod[length]);
            }
            for (int i5 = 0; i5 < dArr.length; i5++) {
                dArr[i5][0] = this.mOffset[i5];
                dArr[i5][1] = this.mPhase[i5];
                dArr[i5][2] = this.mValues[i5];
                this.mOscillator.addPoint(this.mPosition[i5], this.mPeriod[i5]);
            }
            this.mOscillator.normalize();
            double[] dArr3 = this.mPosition;
            this.mCurveFit = dArr3.length > 1 ? CurveFit.get(0, dArr3, dArr) : null;
        }
    }

    /* loaded from: classes3.dex */
    public static class IntDoubleSort {
        private IntDoubleSort() {
        }

        private static int partition(int[] iArr, float[] fArr, int i5, int i6) {
            int i7 = iArr[i6];
            int i8 = i5;
            while (i5 < i6) {
                if (iArr[i5] <= i7) {
                    swap(iArr, fArr, i8, i5);
                    i8++;
                }
                i5++;
            }
            swap(iArr, fArr, i8, i6);
            return i8;
        }

        public static void sort(int[] iArr, float[] fArr, int i5, int i6) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i6;
            iArr2[1] = i5;
            int i7 = 2;
            while (i7 > 0) {
                int i8 = i7 - 1;
                int i9 = iArr2[i8];
                i7 = i8 - 1;
                int i10 = iArr2[i7];
                if (i9 < i10) {
                    int partition = partition(iArr, fArr, i9, i10);
                    int i11 = i7 + 1;
                    iArr2[i7] = partition - 1;
                    int i12 = i11 + 1;
                    iArr2[i11] = i9;
                    int i13 = i12 + 1;
                    iArr2[i12] = i10;
                    i7 = i13 + 1;
                    iArr2[i13] = partition + 1;
                }
            }
        }

        private static void swap(int[] iArr, float[] fArr, int i5, int i6) {
            int i7 = iArr[i5];
            iArr[i5] = iArr[i6];
            iArr[i6] = i7;
            float f5 = fArr[i5];
            fArr[i5] = fArr[i6];
            fArr[i6] = f5;
        }
    }

    /* loaded from: classes13.dex */
    public static class IntFloatFloatSort {
        private IntFloatFloatSort() {
        }

        private static int partition(int[] iArr, float[] fArr, float[] fArr2, int i5, int i6) {
            int i7 = iArr[i6];
            int i8 = i5;
            while (i5 < i6) {
                if (iArr[i5] <= i7) {
                    swap(iArr, fArr, fArr2, i8, i5);
                    i8++;
                }
                i5++;
            }
            swap(iArr, fArr, fArr2, i8, i6);
            return i8;
        }

        public static void sort(int[] iArr, float[] fArr, float[] fArr2, int i5, int i6) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i6;
            iArr2[1] = i5;
            int i7 = 2;
            while (i7 > 0) {
                int i8 = i7 - 1;
                int i9 = iArr2[i8];
                i7 = i8 - 1;
                int i10 = iArr2[i7];
                if (i9 < i10) {
                    int partition = partition(iArr, fArr, fArr2, i9, i10);
                    int i11 = i7 + 1;
                    iArr2[i7] = partition - 1;
                    int i12 = i11 + 1;
                    iArr2[i11] = i9;
                    int i13 = i12 + 1;
                    iArr2[i12] = i10;
                    i7 = i13 + 1;
                    iArr2[i13] = partition + 1;
                }
            }
        }

        private static void swap(int[] iArr, float[] fArr, float[] fArr2, int i5, int i6) {
            int i7 = iArr[i5];
            iArr[i5] = iArr[i6];
            iArr[i6] = i7;
            float f5 = fArr[i5];
            fArr[i5] = fArr[i6];
            fArr[i6] = f5;
            float f6 = fArr2[i5];
            fArr2[i5] = fArr2[i6];
            fArr2[i6] = f6;
        }
    }

    /* loaded from: classes16.dex */
    public static class PathRotateSet extends KeyCycleOscillator {
        public String type;
        public int typeId;

        public PathRotateSet(String str) {
            this.type = str;
            this.typeId = c.a(str);
        }

        public void setPathRotate(MotionWidget motionWidget, float f5, double d5, double d6) {
            motionWidget.setRotationZ(get(f5) + ((float) Math.toDegrees(Math.atan2(d6, d5))));
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public void setProperty(MotionWidget motionWidget, float f5) {
            motionWidget.setValue(this.typeId, get(f5));
        }
    }

    /* loaded from: classes6.dex */
    public static class WavePoint {
        public float mOffset;
        public float mPeriod;
        public float mPhase;
        public int mPosition;
        public float mValue;

        public WavePoint(int i5, float f5, float f6, float f7, float f8) {
            this.mPosition = i5;
            this.mValue = f8;
            this.mOffset = f6;
            this.mPeriod = f5;
            this.mPhase = f7;
        }
    }

    public static KeyCycleOscillator makeWidgetCycle(String str) {
        return str.equals("pathRotate") ? new PathRotateSet(str) : new CoreSpline(str);
    }

    public float get(float f5) {
        return (float) this.mCycleOscillator.getValues(f5);
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public float getSlope(float f5) {
        return (float) this.mCycleOscillator.getSlope(f5);
    }

    public void setCustom(Object obj) {
    }

    public void setPoint(int i5, int i6, String str, int i7, float f5, float f6, float f7, float f8) {
        this.mWavePoints.add(new WavePoint(i5, f5, f6, f7, f8));
        if (i7 != -1) {
            this.mVariesBy = i7;
        }
        this.mWaveShape = i6;
        this.mWaveString = str;
    }

    public void setPoint(int i5, int i6, String str, int i7, float f5, float f6, float f7, float f8, Object obj) {
        this.mWavePoints.add(new WavePoint(i5, f5, f6, f7, f8));
        if (i7 != -1) {
            this.mVariesBy = i7;
        }
        this.mWaveShape = i6;
        setCustom(obj);
        this.mWaveString = str;
    }

    public void setProperty(MotionWidget motionWidget, float f5) {
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setup(float f5) {
        int size = this.mWavePoints.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.mWavePoints, new Comparator<WavePoint>() { // from class: androidx.constraintlayout.core.motion.utils.KeyCycleOscillator.1
            @Override // java.util.Comparator
            public int compare(WavePoint wavePoint, WavePoint wavePoint2) {
                return Integer.compare(wavePoint.mPosition, wavePoint2.mPosition);
            }
        });
        double[] dArr = new double[size];
        char c5 = 0;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, size, 3);
        this.mCycleOscillator = new CycleOscillator(this.mWaveShape, this.mWaveString, this.mVariesBy, size);
        Iterator<WavePoint> it = this.mWavePoints.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            WavePoint next = it.next();
            float f6 = next.mPeriod;
            dArr[i5] = f6 * 0.01d;
            double[] dArr3 = dArr2[i5];
            float f7 = next.mValue;
            dArr3[c5] = f7;
            double[] dArr4 = dArr2[i5];
            float f8 = next.mOffset;
            dArr4[1] = f8;
            double[] dArr5 = dArr2[i5];
            float f9 = next.mPhase;
            dArr5[2] = f9;
            this.mCycleOscillator.setPoint(i5, next.mPosition, f6, f8, f9, f7);
            i5++;
            c5 = 0;
        }
        this.mCycleOscillator.setup(f5);
        this.mCurveFit = CurveFit.get(0, dArr, dArr2);
    }

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<WavePoint> it = this.mWavePoints.iterator();
        while (it.hasNext()) {
            WavePoint next = it.next();
            StringBuilder e5 = androidx.activity.result.a.e(str, "[");
            e5.append(next.mPosition);
            e5.append(" , ");
            e5.append(decimalFormat.format(next.mValue));
            e5.append("] ");
            str = e5.toString();
        }
        return str;
    }

    public boolean variesByPath() {
        return this.mVariesBy == 1;
    }
}
