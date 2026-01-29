package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.state.WidgetFrame;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class SplineSet {
    private static final String TAG = "SplineSet";
    private int count;
    public CurveFit mCurveFit;
    private String mType;
    public int[] mTimePoints = new int[10];
    public float[] mValues = new float[10];

    /* loaded from: classes6.dex */
    public static class CoreSpline extends SplineSet {
        public long start;
        public String type;

        public CoreSpline(String str, long j5) {
            this.type = str;
            this.start = j5;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setProperty(TypedValues typedValues, float f5) {
            typedValues.setValue(typedValues.getId(this.type), get(f5));
        }
    }

    /* loaded from: classes22.dex */
    public static class CustomSet extends SplineSet {
        public String mAttributeName;
        public KeyFrameArray.CustomArray mConstraintAttributeList;
        public float[] mTempValues;

        public CustomSet(String str, KeyFrameArray.CustomArray customArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i5, float f5) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void setPoint(int i5, CustomAttribute customAttribute) {
            this.mConstraintAttributeList.append(i5, customAttribute);
        }

        public void setProperty(WidgetFrame widgetFrame, float f5) {
            this.mCurveFit.getPos(f5, this.mTempValues);
            widgetFrame.setCustomValue(this.mConstraintAttributeList.valueAt(0), this.mTempValues);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i5) {
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.mTempValues = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, size, numberOfInterpolatedValues);
            for (int i6 = 0; i6 < size; i6++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i6);
                CustomAttribute valueAt = this.mConstraintAttributeList.valueAt(i6);
                dArr[i6] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i7 = 0;
                while (true) {
                    if (i7 < this.mTempValues.length) {
                        dArr2[i6][i7] = r6[i7];
                        i7++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i5, dArr, dArr2);
        }
    }

    /* loaded from: classes9.dex */
    public static class CustomSpline extends SplineSet {
        public String mAttributeName;
        public KeyFrameArray.CustomVar mConstraintAttributeList;
        public float[] mTempValues;

        public CustomSpline(String str, KeyFrameArray.CustomVar customVar) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = customVar;
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setPoint(int i5, float f5) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void setPoint(int i5, CustomVariable customVariable) {
            this.mConstraintAttributeList.append(i5, customVariable);
        }

        public void setProperty(MotionWidget motionWidget, float f5) {
            this.mCurveFit.getPos(f5, this.mTempValues);
            this.mConstraintAttributeList.valueAt(0).setInterpolatedValue(motionWidget, this.mTempValues);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setProperty(TypedValues typedValues, float f5) {
            setProperty((MotionWidget) typedValues, f5);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void setup(int i5) {
            int size = this.mConstraintAttributeList.size();
            int numberOfInterpolatedValues = this.mConstraintAttributeList.valueAt(0).numberOfInterpolatedValues();
            double[] dArr = new double[size];
            this.mTempValues = new float[numberOfInterpolatedValues];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, size, numberOfInterpolatedValues);
            for (int i6 = 0; i6 < size; i6++) {
                int keyAt = this.mConstraintAttributeList.keyAt(i6);
                CustomVariable valueAt = this.mConstraintAttributeList.valueAt(i6);
                dArr[i6] = keyAt * 0.01d;
                valueAt.getValuesToInterpolate(this.mTempValues);
                int i7 = 0;
                while (true) {
                    if (i7 < this.mTempValues.length) {
                        dArr2[i6][i7] = r6[i7];
                        i7++;
                    }
                }
            }
            this.mCurveFit = CurveFit.get(i5, dArr, dArr2);
        }
    }

    public static class Sort {
        private Sort() {
        }

        public static void doubleQuickSort(int[] iArr, float[] fArr, int i5, int i6) {
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

        private static void swap(int[] iArr, float[] fArr, int i5, int i6) {
            int i7 = iArr[i5];
            iArr[i5] = iArr[i6];
            iArr[i6] = i7;
            float f5 = fArr[i5];
            fArr[i5] = fArr[i6];
            fArr[i6] = f5;
        }
    }

    public static SplineSet makeCustomSpline(String str, KeyFrameArray.CustomArray customArray) {
        return new CustomSet(str, customArray);
    }

    public static SplineSet makeCustomSplineSet(String str, KeyFrameArray.CustomVar customVar) {
        return new CustomSpline(str, customVar);
    }

    public static SplineSet makeSpline(String str, long j5) {
        return new CoreSpline(str, j5);
    }

    public float get(float f5) {
        return (float) this.mCurveFit.getPos(f5, 0);
    }

    public CurveFit getCurveFit() {
        return this.mCurveFit;
    }

    public float getSlope(float f5) {
        return (float) this.mCurveFit.getSlope(f5, 0);
    }

    public void setPoint(int i5, float f5) {
        int[] iArr = this.mTimePoints;
        if (iArr.length < this.count + 1) {
            this.mTimePoints = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.mValues;
            this.mValues = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.mTimePoints;
        int i6 = this.count;
        iArr2[i6] = i5;
        this.mValues[i6] = f5;
        this.count = i6 + 1;
    }

    public void setProperty(TypedValues typedValues, float f5) {
        typedValues.setValue(a.a(this.mType), get(f5));
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setup(int i5) {
        int i6;
        int i7 = this.count;
        if (i7 == 0) {
            return;
        }
        Sort.doubleQuickSort(this.mTimePoints, this.mValues, 0, i7 - 1);
        int i8 = 1;
        for (int i9 = 1; i9 < this.count; i9++) {
            int[] iArr = this.mTimePoints;
            if (iArr[i9 - 1] != iArr[i9]) {
                i8++;
            }
        }
        double[] dArr = new double[i8];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) double.class, i8, 1);
        int i10 = 0;
        while (i6 < this.count) {
            if (i6 > 0) {
                int[] iArr2 = this.mTimePoints;
                i6 = iArr2[i6] == iArr2[i6 + (-1)] ? i6 + 1 : 0;
            }
            dArr[i10] = this.mTimePoints[i6] * 0.01d;
            dArr2[i10][0] = this.mValues[i6];
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
