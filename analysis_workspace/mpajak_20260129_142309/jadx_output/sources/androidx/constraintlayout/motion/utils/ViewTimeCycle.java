package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes16.dex */
public abstract class ViewTimeCycle extends TimeCycleSplineSet {
    private static final String TAG = "ViewTimeCycle";

    /* loaded from: classes6.dex */
    public static class AlphaSet extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            view.setAlpha(get(f5, j5, view, keyCache));
            return this.mContinue;
        }
    }

    /* loaded from: classes8.dex */
    public static class CustomSet extends ViewTimeCycle {
        public String mAttributeName;
        public float[] mCache;
        public SparseArray<ConstraintAttribute> mConstraintAttributeList;
        public float[] mTempValues;
        public SparseArray<float[]> mWaveProperties = new SparseArray<>();

        public CustomSet(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.mAttributeName = str.split(",")[1];
            this.mConstraintAttributeList = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void setPoint(int i5, float f5, float f6, int i6, float f7) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        public void setPoint(int i5, ConstraintAttribute constraintAttribute, float f5, int i6, float f6) {
            this.mConstraintAttributeList.append(i5, constraintAttribute);
            this.mWaveProperties.append(i5, new float[]{f5, f6});
            this.mWaveShape = Math.max(this.mWaveShape, i6);
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            this.mCurveFit.getPos(f5, this.mTempValues);
            float[] fArr = this.mTempValues;
            float f6 = fArr[fArr.length - 2];
            float f7 = fArr[fArr.length - 1];
            long j6 = j5 - this.last_time;
            if (Float.isNaN(this.last_cycle)) {
                float floatValue = keyCache.getFloatValue(view, this.mAttributeName, 0);
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
            CustomSupport.setInterpolatedValue(this.mConstraintAttributeList.valueAt(0), view, this.mCache);
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
                ConstraintAttribute valueAt = this.mConstraintAttributeList.valueAt(i7);
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

    /* loaded from: classes19.dex */
    public static class ElevationSet extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            view.setElevation(get(f5, j5, view, keyCache));
            return this.mContinue;
        }
    }

    /* loaded from: classes22.dex */
    public static class PathRotate extends ViewTimeCycle {
        public boolean setPathRotate(View view, KeyCache keyCache, float f5, long j5, double d5, double d6) {
            view.setRotation(get(f5, j5, view, keyCache) + ((float) Math.toDegrees(Math.atan2(d6, d5))));
            return this.mContinue;
        }

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            return this.mContinue;
        }
    }

    /* loaded from: classes15.dex */
    public static class ProgressSet extends ViewTimeCycle {
        public boolean mNoMethod = false;

        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(get(f5, j5, view, keyCache));
            } else {
                if (this.mNoMethod) {
                    return false;
                }
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.mNoMethod = true;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, Float.valueOf(get(f5, j5, view, keyCache)));
                    } catch (IllegalAccessException | InvocationTargetException e5) {
                        Log.e(ViewTimeCycle.TAG, "unable to setProgress", e5);
                    }
                }
            }
            return this.mContinue;
        }
    }

    /* loaded from: classes19.dex */
    public static class RotationSet extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            view.setRotation(get(f5, j5, view, keyCache));
            return this.mContinue;
        }
    }

    /* loaded from: classes5.dex */
    public static class RotationXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            view.setRotationX(get(f5, j5, view, keyCache));
            return this.mContinue;
        }
    }

    /* loaded from: classes6.dex */
    public static class RotationYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            view.setRotationY(get(f5, j5, view, keyCache));
            return this.mContinue;
        }
    }

    /* loaded from: classes15.dex */
    public static class ScaleXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            view.setScaleX(get(f5, j5, view, keyCache));
            return this.mContinue;
        }
    }

    /* loaded from: classes10.dex */
    public static class ScaleYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            view.setScaleY(get(f5, j5, view, keyCache));
            return this.mContinue;
        }
    }

    /* loaded from: classes2.dex */
    public static class TranslationXset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            view.setTranslationX(get(f5, j5, view, keyCache));
            return this.mContinue;
        }
    }

    /* loaded from: classes11.dex */
    public static class TranslationYset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            view.setTranslationY(get(f5, j5, view, keyCache));
            return this.mContinue;
        }
    }

    /* loaded from: classes18.dex */
    public static class TranslationZset extends ViewTimeCycle {
        @Override // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean setProperty(View view, float f5, long j5, KeyCache keyCache) {
            view.setTranslationZ(get(f5, j5, view, keyCache));
            return this.mContinue;
        }
    }

    public static ViewTimeCycle makeCustomSpline(String str, SparseArray<ConstraintAttribute> sparseArray) {
        return new CustomSet(str, sparseArray);
    }

    public static ViewTimeCycle makeSpline(String str, long j5) {
        ViewTimeCycle rotationXset;
        Objects.requireNonNull(str);
        switch (str) {
            case "rotationX":
                rotationXset = new RotationXset();
                break;
            case "rotationY":
                rotationXset = new RotationYset();
                break;
            case "translationX":
                rotationXset = new TranslationXset();
                break;
            case "translationY":
                rotationXset = new TranslationYset();
                break;
            case "translationZ":
                rotationXset = new TranslationZset();
                break;
            case "progress":
                rotationXset = new ProgressSet();
                break;
            case "scaleX":
                rotationXset = new ScaleXset();
                break;
            case "scaleY":
                rotationXset = new ScaleYset();
                break;
            case "rotation":
                rotationXset = new RotationSet();
                break;
            case "elevation":
                rotationXset = new ElevationSet();
                break;
            case "transitionPathRotate":
                rotationXset = new PathRotate();
                break;
            case "alpha":
                rotationXset = new AlphaSet();
                break;
            default:
                return null;
        }
        rotationXset.setStartTime(j5);
        return rotationXset;
    }

    public float get(float f5, long j5, View view, KeyCache keyCache) {
        this.mCurveFit.getPos(f5, this.mCache);
        float[] fArr = this.mCache;
        float f6 = fArr[1];
        if (f6 == 0.0f) {
            this.mContinue = false;
            return fArr[2];
        }
        if (Float.isNaN(this.last_cycle)) {
            float floatValue = keyCache.getFloatValue(view, this.mType, 0);
            this.last_cycle = floatValue;
            if (Float.isNaN(floatValue)) {
                this.last_cycle = 0.0f;
            }
        }
        float f7 = (float) (((((j5 - this.last_time) * 1.0E-9d) * f6) + this.last_cycle) % 1.0d);
        this.last_cycle = f7;
        keyCache.setFloatValue(view, this.mType, 0, f7);
        this.last_time = j5;
        float f8 = this.mCache[0];
        float calcWave = (calcWave(this.last_cycle) * f8) + this.mCache[2];
        this.mContinue = (f8 == 0.0f && f6 == 0.0f) ? false : true;
        return calcWave;
    }

    public abstract boolean setProperty(View view, float f5, long j5, KeyCache keyCache);
}
