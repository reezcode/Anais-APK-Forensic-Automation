package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* loaded from: classes12.dex */
public abstract class TimeCycleSplineSet {
    public static final int CURVE_OFFSET = 2;
    public static final int CURVE_PERIOD = 1;
    public static final int CURVE_VALUE = 0;
    private static final String TAG = "SplineSet";
    public static float VAL_2PI = 6.2831855f;
    public int count;
    public long last_time;
    public CurveFit mCurveFit;
    public String mType;
    public int mWaveShape = 0;
    public int[] mTimePoints = new int[10];
    public float[][] mValues = (float[][]) Array.newInstance((Class<?>) float.class, 10, 3);
    public float[] mCache = new float[3];
    public boolean mContinue = false;
    public float last_cycle = Float.NaN;

    /* loaded from: classes21.dex */
    public static class CustomSet extends TimeCycleSplineSet {
        public String mAttributeName;
        public float[] mCache;
        public KeyFrameArray.CustomArray mConstraintAttributeList;
        public float[] mTempValues;
        public KeyFrameArray.FloatArray mWaveProperties = new KeyFrameArray.FloatArray();

        public CustomSet(String str, KeyFrameArray.CustomArray customArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i5, float f5, float f6, int i6, float f7) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void setPoint(int i5, CustomAttribute customAttribute, float f5, int i6, float f6) {
            this.mConstraintAttributeList.append(i5, customAttribute);
            this.mWaveProperties.append(i5, new float[]{f5, f6});
            this.mWaveShape = Math.max(this.mWaveShape, i6);
        }

        public boolean setProperty(MotionWidget motionWidget, float f5, long j5, KeyCache keyCache) {
            this.mCurveFit.getPos(f5, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            long j6 = j5 - this.last_time;
            if (Float.isNaN(this.last_cycle)) {
                float floatValue = keyCache.getFloatValue(motionWidget, this.mAttributeName, 0);
                this.last_cycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.last_cycle = 0.0f;
                }
            }
            float f8 = (float) ((((j6 * 1.0E-9d) * f6) + this.last_cycle) % 1.0d);
            this.last_cycle = f8;
            this.last_time = j5;
            float calcWave = calcWave(f8);
            this.mContinue = false;
            int i5 = 0;
            while (true) {
                float[] fArr2 = this.mCache;
                if (i5 >= fArr2.length) {
                    break;
                }
                boolean z4 = this.mContinue;
                float[] fArr3 = this.mTempValues;
                this.mContinue = z4 | (((double) fArr3[i5]) != 0.0d);
                fArr2[i5] = (fArr3[i5] * calcWave) + f7;
                i5++;
            }
            motionWidget.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), this.mCache);
            if (f6 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i5) {
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i6 = numberOfInterpolatedValues + 2;
            this.mTempValues = new float[i6];
            this.mCache = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, size, i6);
            for (int i7 = 0; i7 < size; i7++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i7);
                CustomAttribute valueAt = this.mConstraintAttributeList.valueAt(i7);
                float[] valueAt2 = this.mWaveProperties.valueAt(i7);
                dArr[i7] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i8 = 0;
                while (true) {
                    if (i8 < this.mTempValues.length) {
                        dArr2[i7][i8] = r8[i8];
                        i8++;
                    }
                }
                dArr2[i7][numberOfInterpolatedValues] = valueAt2[0];
                dArr2[i7][numberOfInterpolatedValues + 1] = valueAt2[1];
            }
            this.mCurveFit = CurveFit.get(i5, dArr, dArr2);
        }
    }

    /* loaded from: classes14.dex */
    public static class CustomVarSet extends TimeCycleSplineSet {
        public String mAttributeName;
        public float[] mCache;
        public KeyFrameArray.CustomVar mConstraintAttributeList;
        public float[] mTempValues;
        public KeyFrameArray.FloatArray mWaveProperties = new KeyFrameArray.FloatArray();

        public CustomVarSet(String str, KeyFrameArray.CustomVar customVar) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i5, float f5, float f6, int i6, float f7) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void setPoint(int i5, CustomVariable customVariable, float f5, int i6, float f6) {
            this.mConstraintAttributeList.append(i5, customVariable);
            this.mWaveProperties.append(i5, new float[]{f5, f6});
            this.mWaveShape = Math.max(this.mWaveShape, i6);
        }

        public boolean setProperty(MotionWidget motionWidget, float f5, long j5, KeyCache keyCache) {
            this.mCurveFit.getPos(f5, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            long j6 = j5 - this.last_time;
            if (Float.isNaN(this.last_cycle)) {
                float floatValue = keyCache.getFloatValue(motionWidget, this.mAttributeName, 0);
                this.last_cycle = floatValue;
                if (Float.isNaN(floatValue)) {
                    this.last_cycle = 0.0f;
                }
            }
            float f8 = (float) ((((j6 * 1.0E-9d) * f6) + this.last_cycle) % 1.0d);
            this.last_cycle = f8;
            this.last_time = j5;
            float calcWave = calcWave(f8);
            this.mContinue = false;
            int i5 = 0;
            while (true) {
                float[] fArr2 = this.mCache;
                if (i5 >= fArr2.length) {
                    break;
                }
                boolean z4 = this.mContinue;
                float[] fArr3 = this.mTempValues;
                this.mContinue = z4 | (((double) fArr3[i5]) != 0.0d);
                fArr2[i5] = (fArr3[i5] * calcWave) + f7;
                i5++;
            }
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(motionWidget, this.mCache);
            if (f6 != 0.0f) {
                this.mContinue = true;
            }
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setup(int i5) {
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            int i6 = numberOfInterpolatedValues + 2;
            this.mTempValues = new float[i6];
            this.mCache = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, size, i6);
            for (int i7 = 0; i7 < size; i7++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i7);
                CustomVariable valueAt = this.mConstraintAttributeList.valueAt(i7);
                float[] valueAt2 = this.mWaveProperties.valueAt(i7);
                dArr[i7] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i8 = 0;
                while (true) {
                    if (i8 < this.mTempValues.length) {
                        dArr2[i7][i8] = r8[i8];
                        i8++;
                    }
                }
                dArr2[i7][numberOfInterpolatedValues] = valueAt2[0];
                dArr2[i7][numberOfInterpolatedValues + 1] = valueAt2[1];
            }
            this.mCurveFit = CurveFit.get(i5, dArr, dArr2);
        }
    }

    /* loaded from: classes14.dex */
    public static class Sort {
        public static void doubleQuickSort(int[] iArr, float[][] fArr, int i5, int i6) {
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

        private static int partition(int[] iArr, float[][] fArr, int i5, int i6) {
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

        private static void swap(int[] iArr, float[][] fArr, int i5, int i6) {
            int i7 = iArr[i5];
            iArr[i5] = iArr[i6];
            iArr[i6] = i7;
            float[] fArr2 = fArr[i5];
            fArr[i5] = fArr[i6];
            fArr[i6] = fArr2;
        }
    }

    public float calcWave(float f5) {
        float abs;
        switch (this.mWaveShape) {
            case 1:
                return Math.signum(f5 * VAL_2PI);
            case 2:
                abs = Math.abs(f5);
                break;
            case 3:
                return (((f5 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f5 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f5 * VAL_2PI);
            case 6:
                float abs2 = 1.0f - Math.abs(((f5 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f5 * VAL_2PI);
        }
        return 1.0f - abs;
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public void setPoint(int i5, float f5, float f6, int i6, float f7) {
        int[] iArr = this.mTimePoints;
        int i7 = this.count;
        iArr[i7] = i5;
        float[][] fArr = this.mValues;
        fArr[i7][0] = f5;
        fArr[i7][1] = f6;
        fArr[i7][2] = f7;
        this.mWaveShape = Math.max(this.mWaveShape, i6);
        this.count++;
    }

    public void setStartTime(long j5) {
        this.last_time = j5;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setup(int i5) {
        int i6;
        int i7 = this.count;
        if (i7 == 0) {
            PrintStream printStream = System.err;
            StringBuilder g5 = androidx.activity.d.g("Error no points added to ");
            g5.append(this.mType);
            printStream.println(g5.toString());
            return;
        }
        Sort.doubleQuickSort(this.mTimePoints, this.mValues, 0, i7 - 1);
        int i8 = 1;
        int i9 = 0;
        while (true) {
            int[] iArr = this.mTimePoints;
            if (i8 >= iArr.length) {
                break;
            }
            if (iArr[i8] != iArr[i8 - 1]) {
                i9++;
            }
            i8++;
        }
        if (i9 == 0) {
            i9 = 1;
        }
        double[] dArr = new double[i9];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, i9, 3);
        int i10 = 0;
        while (i6 < this.count) {
            if (i6 > 0) {
                int[] iArr2 = this.mTimePoints;
                i6 = iArr2[i6] == iArr2[i6 + (-1)] ? i6 + 1 : 0;
            }
            dArr[i10] = this.mTimePoints[i6] * 0.01d;
            double[] dArr3 = dArr2[i10];
            float[][] fArr = this.mValues;
            dArr3[0] = fArr[i6][0];
            dArr2[i10][1] = fArr[i6][1];
            dArr2[i10][2] = fArr[i6][2];
            i10++;
        }
        this.mCurveFit = CurveFit.get(i5, dArr, dArr2);
    }

    public String toString() {
        String str = this.mType;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i5 = 0; i5 < this.count; i5++) {
            StringBuilder e5 = androidx.activity.result.a.e(str, "[");
            e5.append(this.mTimePoints[i5]);
            e5.append(" , ");
            e5.append(decimalFormat.format(this.mValues[i5]));
            e5.append("] ");
            str = e5.toString();
        }
        return str;
    }
}
