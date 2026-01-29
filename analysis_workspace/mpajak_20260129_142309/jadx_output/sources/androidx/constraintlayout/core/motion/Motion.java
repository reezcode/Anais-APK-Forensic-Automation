package androidx.constraintlayout.core.motion;

import androidx.activity.d;
import androidx.appcompat.graphics.drawable.a;
import androidx.constraintlayout.core.motion.key.MotionKey;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.key.MotionKeyTimeCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyTrigger;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.core.motion.utils.ViewState;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes15.dex */
public class Motion implements TypedValues {
    public static final int BOUNCE = 4;
    private static final boolean DEBUG = false;
    public static final int DRAW_PATH_AS_CONFIGURED = 4;
    public static final int DRAW_PATH_BASIC = 1;
    public static final int DRAW_PATH_CARTESIAN = 3;
    public static final int DRAW_PATH_NONE = 0;
    public static final int DRAW_PATH_RECTANGLE = 5;
    public static final int DRAW_PATH_RELATIVE = 2;
    public static final int DRAW_PATH_SCREEN = 6;
    public static final int EASE_IN = 1;
    public static final int EASE_IN_OUT = 0;
    public static final int EASE_OUT = 2;
    private static final boolean FAVOR_FIXED_SIZE_VIEWS = false;
    public static final int HORIZONTAL_PATH_X = 2;
    public static final int HORIZONTAL_PATH_Y = 3;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final int INTERPOLATOR_UNDEFINED = -3;
    public static final int LINEAR = 3;
    public static final int OVERSHOOT = 5;
    public static final int PATH_PERCENT = 0;
    public static final int PATH_PERPENDICULAR = 1;
    public static final int ROTATION_LEFT = 2;
    public static final int ROTATION_RIGHT = 1;
    private static final int SPLINE_STRING = -1;
    private static final String TAG = "MotionController";
    public static final int VERTICAL_PATH_X = 4;
    public static final int VERTICAL_PATH_Y = 5;
    public String[] attributeTable;
    private CurveFit mArcSpline;
    private int[] mAttributeInterpolatorCount;
    private String[] mAttributeNames;
    private HashMap<String, SplineSet> mAttributesMap;
    public String mConstraintTag;
    public float mCurrentCenterX;
    public float mCurrentCenterY;
    private HashMap<String, KeyCycleOscillator> mCycleMap;
    public int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private MotionKeyTrigger[] mKeyTriggers;
    private CurveFit[] mSpline;
    private HashMap<String, TimeCycleSplineSet> mTimeCycleAttributesMap;
    public MotionWidget mView;
    public Rect mTempRect = new Rect();
    private int mCurveFitType = -1;
    private MotionPaths mStartMotionPath = new MotionPaths();
    private MotionPaths mEndMotionPath = new MotionPaths();
    private MotionConstrainedPoint mStartPoint = new MotionConstrainedPoint();
    private MotionConstrainedPoint mEndPoint = new MotionConstrainedPoint();
    public float mMotionStagger = Float.NaN;
    public float mStaggerOffset = 0.0f;
    public float mStaggerScale = 1.0f;
    private int MAX_DIMENSION = 4;
    private float[] mValuesBuff = new float[4];
    private ArrayList<MotionPaths> mMotionPaths = new ArrayList<>();
    private float[] mVelocity = new float[1];
    private ArrayList<MotionKey> mKeyList = new ArrayList<>();
    private int mPathMotionArc = -1;
    private int mTransformPivotTarget = -1;
    private MotionWidget mTransformPivotView = null;
    private int mQuantizeMotionSteps = -1;
    private float mQuantizeMotionPhase = Float.NaN;
    private DifferentialInterpolator mQuantizeMotionInterpolator = null;
    private boolean mNoMovement = false;

    public Motion(MotionWidget motionWidget) {
        setView(motionWidget);
    }

    private float getAdjustedPosition(float f5, float[] fArr) {
        float f6 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f7 = this.mStaggerScale;
            if (f7 != 1.0d) {
                float f8 = this.mStaggerOffset;
                if (f5 < f8) {
                    f5 = 0.0f;
                }
                if (f5 > f8 && f5 < 1.0d) {
                    f5 = Math.min((f5 - f8) * f7, 1.0f);
                }
            }
        }
        Easing easing = this.mStartMotionPath.mKeyFrameEasing;
        float f9 = Float.NaN;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            MotionPaths next = it.next();
            Easing easing2 = next.mKeyFrameEasing;
            if (easing2 != null) {
                float f10 = next.time;
                if (f10 < f5) {
                    easing = easing2;
                    f6 = f10;
                } else if (Float.isNaN(f9)) {
                    f9 = next.time;
                }
            }
        }
        if (easing != null) {
            float f11 = (Float.isNaN(f9) ? 1.0f : f9) - f6;
            double d5 = (f5 - f6) / f11;
            f5 = (((float) easing.get(d5)) * f11) + f6;
            if (fArr != null) {
                fArr[0] = (float) easing.getDiff(d5);
            }
        }
        return f5;
    }

    private static DifferentialInterpolator getInterpolator(int i5, String str, int i6) {
        if (i5 != -1) {
            return null;
        }
        final Easing interpolator = Easing.getInterpolator(str);
        return new DifferentialInterpolator() { // from class: androidx.constraintlayout.core.motion.Motion.1
            public float mX;

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getInterpolation(float f5) {
                this.mX = f5;
                return (float) Easing.this.get(f5);
            }

            @Override // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
            public float getVelocity() {
                return (float) Easing.this.getDiff(this.mX);
            }
        };
    }

    private float getPreCycleDistance() {
        char c5;
        float f5;
        float[] fArr = new float[2];
        float f6 = 1.0f / 99;
        double d5 = 0.0d;
        double d6 = 0.0d;
        float f7 = 0.0f;
        int i5 = 0;
        while (i5 < 100) {
            float f8 = i5 * f6;
            double d7 = f8;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f9 = Float.NaN;
            float f10 = 0.0f;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    float f11 = next.time;
                    if (f11 < f8) {
                        easing = easing2;
                        f10 = f11;
                    } else if (Float.isNaN(f9)) {
                        f9 = next.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f9)) {
                    f9 = 1.0f;
                }
                d7 = (((float) easing.get((f8 - f10) / r17)) * (f9 - f10)) + f10;
            }
            this.mSpline[0].getPos(d7, this.mInterpolateData);
            float f12 = f7;
            int i6 = i5;
            this.mStartMotionPath.getCenter(d7, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
            if (i6 > 0) {
                c5 = 0;
                f5 = (float) (Math.hypot(d6 - fArr[1], d5 - fArr[0]) + f12);
            } else {
                c5 = 0;
                f5 = f12;
            }
            d5 = fArr[c5];
            i5 = i6 + 1;
            f7 = f5;
            d6 = fArr[1];
        }
        return f7;
    }

    private void insertKey(MotionPaths motionPaths) {
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        MotionPaths motionPaths2 = null;
        while (it.hasNext()) {
            MotionPaths next = it.next();
            if (motionPaths.position == next.position) {
                motionPaths2 = next;
            }
        }
        if (motionPaths2 != null) {
            this.mMotionPaths.remove(motionPaths2);
        }
        if (Collections.binarySearch(this.mMotionPaths, motionPaths) == 0) {
            StringBuilder g5 = d.g(" KeyPath position \"");
            g5.append(motionPaths.position);
            g5.append("\" outside of range");
            Utils.loge(TAG, g5.toString());
        }
        this.mMotionPaths.add((-r0) - 1, motionPaths);
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds(this.mView.getX(), this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    public void addKey(MotionKey motionKey) {
        this.mKeyList.add(motionKey);
    }

    public void addKeys(ArrayList<MotionKey> arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    public void buildBounds(float[] fArr, int i5) {
        float f5 = 1.0f / (i5 - 1);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, KeyCycleOscillator> hashMap3 = this.mCycleMap;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, KeyCycleOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            hashMap4.get("translationY");
        }
        for (int i6 = 0; i6 < i5; i6++) {
            float f6 = i6 * f5;
            float f7 = this.mStaggerScale;
            float f8 = 0.0f;
            if (f7 != 1.0f) {
                float f9 = this.mStaggerOffset;
                if (f6 < f9) {
                    f6 = 0.0f;
                }
                if (f6 > f9 && f6 < 1.0d) {
                    f6 = Math.min((f6 - f9) * f7, 1.0f);
                }
            }
            double d5 = f6;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f10 = Float.NaN;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                if (easing2 != null) {
                    float f11 = next.time;
                    if (f11 < f6) {
                        easing = easing2;
                        f8 = f11;
                    } else if (Float.isNaN(f10)) {
                        f10 = next.time;
                    }
                }
            }
            if (easing != null) {
                if (Float.isNaN(f10)) {
                    f10 = 1.0f;
                }
                d5 = (((float) easing.get((f6 - f8) / r11)) * (f10 - f8)) + f8;
            }
            this.mSpline[0].getPos(d5, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d5, dArr);
                }
            }
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i6 * 2);
        }
    }

    public int buildKeyBounds(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                iArr[i5] = it.next().mMode;
                i5++;
            }
        }
        int i6 = 0;
        for (double d5 : timePoints) {
            this.mSpline[0].getPos(d5, this.mInterpolateData);
            this.mStartMotionPath.getBounds(this.mInterpolateVariables, this.mInterpolateData, fArr, i6);
            i6 += 2;
        }
        return i6 / 2;
    }

    public int buildKeyFrames(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] timePoints = this.mSpline[0].getTimePoints();
        if (iArr != null) {
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                iArr[i5] = it.next().mMode;
                i5++;
            }
        }
        if (iArr2 != null) {
            Iterator<MotionPaths> it2 = this.mMotionPaths.iterator();
            int i6 = 0;
            while (it2.hasNext()) {
                iArr2[i6] = (int) (it2.next().position * 100.0f);
                i6++;
            }
        }
        int i7 = 0;
        for (int i8 = 0; i8 < timePoints.length; i8++) {
            this.mSpline[0].getPos(timePoints[i8], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i8], this.mInterpolateVariables, this.mInterpolateData, fArr, i7);
            i7 += 2;
        }
        return i7 / 2;
    }

    public void buildPath(float[] fArr, int i5) {
        double d5;
        float f5 = 1.0f;
        float f6 = 1.0f / (i5 - 1);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        SplineSet splineSet = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        SplineSet splineSet2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, KeyCycleOscillator> hashMap3 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, KeyCycleOscillator> hashMap4 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator2 = hashMap4 != null ? hashMap4.get("translationY") : null;
        int i6 = 0;
        while (i6 < i5) {
            float f7 = i6 * f6;
            float f8 = this.mStaggerScale;
            if (f8 != f5) {
                float f9 = this.mStaggerOffset;
                if (f7 < f9) {
                    f7 = 0.0f;
                }
                if (f7 > f9 && f7 < 1.0d) {
                    f7 = Math.min((f7 - f9) * f8, f5);
                }
            }
            float f10 = f7;
            double d6 = f10;
            Easing easing = this.mStartMotionPath.mKeyFrameEasing;
            float f11 = Float.NaN;
            Iterator<MotionPaths> it = this.mMotionPaths.iterator();
            float f12 = 0.0f;
            while (it.hasNext()) {
                MotionPaths next = it.next();
                Easing easing2 = next.mKeyFrameEasing;
                double d7 = d6;
                if (easing2 != null) {
                    float f13 = next.time;
                    if (f13 < f10) {
                        f12 = f13;
                        easing = easing2;
                    } else if (Float.isNaN(f11)) {
                        f11 = next.time;
                    }
                }
                d6 = d7;
            }
            double d8 = d6;
            if (easing != null) {
                if (Float.isNaN(f11)) {
                    f11 = 1.0f;
                }
                d5 = (((float) easing.get((f10 - f12) / r5)) * (f11 - f12)) + f12;
            } else {
                d5 = d8;
            }
            this.mSpline[0].getPos(d5, this.mInterpolateData);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d5, dArr);
                }
            }
            int i7 = i6 * 2;
            int i8 = i6;
            this.mStartMotionPath.getCenter(d5, this.mInterpolateVariables, this.mInterpolateData, fArr, i7);
            if (keyCycleOscillator != null) {
                fArr[i7] = keyCycleOscillator.get(f10) + fArr[i7];
            } else if (splineSet != null) {
                fArr[i7] = splineSet.get(f10) + fArr[i7];
            }
            if (keyCycleOscillator2 != null) {
                int i9 = i7 + 1;
                fArr[i9] = keyCycleOscillator2.get(f10) + fArr[i9];
            } else if (splineSet2 != null) {
                int i10 = i7 + 1;
                fArr[i10] = splineSet2.get(f10) + fArr[i10];
            }
            i6 = i8 + 1;
            f5 = 1.0f;
        }
    }

    public void buildRect(float f5, float[] fArr, int i5) {
        this.mSpline[0].getPos(getAdjustedPosition(f5, null), this.mInterpolateData);
        this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i5);
    }

    public void buildRectangles(float[] fArr, int i5) {
        float f5 = 1.0f / (i5 - 1);
        for (int i6 = 0; i6 < i5; i6++) {
            this.mSpline[0].getPos(getAdjustedPosition(i6 * f5, null), this.mInterpolateData);
            this.mStartMotionPath.getRect(this.mInterpolateVariables, this.mInterpolateData, fArr, i6 * 8);
        }
    }

    public void endTrigger(boolean z4) {
    }

    public int getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    public int getAttributeValues(String str, float[] fArr, int i5) {
        SplineSet splineSet = this.mAttributesMap.get(str);
        if (splineSet == null) {
            return -1;
        }
        for (int i6 = 0; i6 < fArr.length; i6++) {
            fArr[i6] = splineSet.get(i6 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public void getCenter(double d5, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.mSpline[0].getPos(d5, dArr);
        this.mSpline[0].getSlope(d5, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.mStartMotionPath.getCenter(d5, this.mInterpolateVariables, dArr, fArr, dArr2, fArr2);
    }

    public float getCenterX() {
        return this.mCurrentCenterX;
    }

    public float getCenterY() {
        return this.mCurrentCenterY;
    }

    public void getDpDt(float f5, float f6, float f7, float[] fArr) {
        double[] dArr;
        float adjustedPosition = getAdjustedPosition(f5, this.mVelocity);
        CurveFit[] curveFitArr = this.mSpline;
        int i5 = 0;
        if (curveFitArr == null) {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f8 = motionPaths.f134x;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f9 = f8 - motionPaths2.f134x;
            float f10 = motionPaths.f135y - motionPaths2.f135y;
            float f11 = motionPaths.width - motionPaths2.width;
            float f12 = (motionPaths.height - motionPaths2.height) + f10;
            fArr[0] = ((f11 + f9) * f6) + ((1.0f - f6) * f9);
            fArr[1] = (f12 * f7) + ((1.0f - f7) * f10);
            return;
        }
        double d5 = adjustedPosition;
        curveFitArr[0].getSlope(d5, this.mInterpolateVelocity);
        this.mSpline[0].getPos(d5, this.mInterpolateData);
        float f13 = this.mVelocity[0];
        while (true) {
            dArr = this.mInterpolateVelocity;
            if (i5 >= dArr.length) {
                break;
            }
            dArr[i5] = dArr[i5] * f13;
            i5++;
        }
        CurveFit curveFit = this.mArcSpline;
        if (curveFit == null) {
            this.mStartMotionPath.setDpDt(f6, f7, fArr, this.mInterpolateVariables, dArr, this.mInterpolateData);
            return;
        }
        double[] dArr2 = this.mInterpolateData;
        if (dArr2.length > 0) {
            curveFit.getPos(d5, dArr2);
            this.mArcSpline.getSlope(d5, this.mInterpolateVelocity);
            this.mStartMotionPath.setDpDt(f6, f7, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
        }
    }

    public int getDrawPath() {
        int i5 = this.mStartMotionPath.mDrawPath;
        Iterator<MotionPaths> it = this.mMotionPaths.iterator();
        while (it.hasNext()) {
            i5 = Math.max(i5, it.next().mDrawPath);
        }
        return Math.max(i5, this.mEndMotionPath.mDrawPath);
    }

    public float getFinalHeight() {
        return this.mEndMotionPath.height;
    }

    public float getFinalWidth() {
        return this.mEndMotionPath.width;
    }

    public float getFinalX() {
        return this.mEndMotionPath.f134x;
    }

    public float getFinalY() {
        return this.mEndMotionPath.f135y;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return 0;
    }

    public MotionPaths getKeyFrame(int i5) {
        return this.mMotionPaths.get(i5);
    }

    public int getKeyFrameInfo(int i5, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<MotionKey> it = this.mKeyList.iterator();
        int i6 = 0;
        int i7 = 0;
        while (it.hasNext()) {
            MotionKey next = it.next();
            int i8 = next.mType;
            if (i8 == i5 || i5 != -1) {
                iArr[i7] = 0;
                int i9 = i7 + 1;
                iArr[i9] = i8;
                int i10 = i9 + 1;
                int i11 = next.mFramePosition;
                iArr[i10] = i11;
                double d5 = i11 / 100.0f;
                this.mSpline[0].getPos(d5, this.mInterpolateData);
                this.mStartMotionPath.getCenter(d5, this.mInterpolateVariables, this.mInterpolateData, fArr, 0);
                int i12 = i10 + 1;
                iArr[i12] = Float.floatToIntBits(fArr[0]);
                int i13 = i12 + 1;
                iArr[i13] = Float.floatToIntBits(fArr[1]);
                if (next instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) next;
                    int i14 = i13 + 1;
                    iArr[i14] = motionKeyPosition.mPositionType;
                    int i15 = i14 + 1;
                    iArr[i15] = Float.floatToIntBits(motionKeyPosition.mPercentX);
                    i13 = i15 + 1;
                    iArr[i13] = Float.floatToIntBits(motionKeyPosition.mPercentY);
                }
                int i16 = i13 + 1;
                iArr[i7] = i16 - i7;
                i6++;
                i7 = i16;
            }
        }
        return i6;
    }

    public float getKeyFrameParameter(int i5, float f5, float f6) {
        MotionPaths motionPaths = this.mEndMotionPath;
        float f7 = motionPaths.f134x;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f8 = motionPaths2.f134x;
        float f9 = f7 - f8;
        float f10 = motionPaths.f135y;
        float f11 = motionPaths2.f135y;
        float f12 = f10 - f11;
        float f13 = (motionPaths2.width / 2.0f) + f8;
        float f14 = (motionPaths2.height / 2.0f) + f11;
        float hypot = (float) Math.hypot(f9, f12);
        if (hypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f15 = f5 - f13;
        float f16 = f6 - f14;
        if (((float) Math.hypot(f15, f16)) == 0.0f) {
            return 0.0f;
        }
        float f17 = (f16 * f12) + (f15 * f9);
        if (i5 == 0) {
            return f17 / hypot;
        }
        if (i5 == 1) {
            return (float) Math.sqrt((hypot * hypot) - (f17 * f17));
        }
        if (i5 == 2) {
            return f15 / f9;
        }
        if (i5 == 3) {
            return f16 / f9;
        }
        if (i5 == 4) {
            return f15 / f12;
        }
        if (i5 != 5) {
            return 0.0f;
        }
        return f16 / f12;
    }

    public int getKeyFramePositions(int[] iArr, float[] fArr) {
        Iterator<MotionKey> it = this.mKeyList.iterator();
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            MotionKey next = it.next();
            int i7 = next.mFramePosition;
            iArr[i5] = (next.mType * 1000) + i7;
            double d5 = i7 / 100.0f;
            this.mSpline[0].getPos(d5, this.mInterpolateData);
            this.mStartMotionPath.getCenter(d5, this.mInterpolateVariables, this.mInterpolateData, fArr, i6);
            i6 += 2;
            i5++;
        }
        return i5;
    }

    public double[] getPos(double d5) {
        this.mSpline[0].getPos(d5, this.mInterpolateData);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                curveFit.getPos(d5, dArr);
            }
        }
        return this.mInterpolateData;
    }

    public MotionKeyPosition getPositionKeyframe(int i5, int i6, float f5, float f6) {
        FloatRect floatRect = new FloatRect();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f7 = motionPaths.f134x;
        floatRect.left = f7;
        float f8 = motionPaths.f135y;
        floatRect.top = f8;
        floatRect.right = f7 + motionPaths.width;
        floatRect.bottom = f8 + motionPaths.height;
        FloatRect floatRect2 = new FloatRect();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f9 = motionPaths2.f134x;
        floatRect2.left = f9;
        float f10 = motionPaths2.f135y;
        floatRect2.top = f10;
        floatRect2.right = f9 + motionPaths2.width;
        floatRect2.bottom = f10 + motionPaths2.height;
        Iterator<MotionKey> it = this.mKeyList.iterator();
        while (it.hasNext()) {
            MotionKey next = it.next();
            if (next instanceof MotionKeyPosition) {
                MotionKeyPosition motionKeyPosition = (MotionKeyPosition) next;
                if (motionKeyPosition.intersects(i5, i6, floatRect, floatRect2, f5, f6)) {
                    return motionKeyPosition;
                }
            }
        }
        return null;
    }

    public void getPostLayoutDvDp(float f5, int i5, int i6, float f6, float f7, float[] fArr) {
        float adjustedPosition = getAdjustedPosition(f5, this.mVelocity);
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        SplineSet splineSet = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, SplineSet> hashMap2 = this.mAttributesMap;
        SplineSet splineSet2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, SplineSet> hashMap3 = this.mAttributesMap;
        SplineSet splineSet3 = hashMap3 == null ? null : hashMap3.get("rotationZ");
        HashMap<String, SplineSet> hashMap4 = this.mAttributesMap;
        SplineSet splineSet4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, SplineSet> hashMap5 = this.mAttributesMap;
        SplineSet splineSet5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, KeyCycleOscillator> hashMap6 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, KeyCycleOscillator> hashMap7 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator2 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, KeyCycleOscillator> hashMap8 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator3 = hashMap8 == null ? null : hashMap8.get("rotationZ");
        HashMap<String, KeyCycleOscillator> hashMap9 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator4 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, KeyCycleOscillator> hashMap10 = this.mCycleMap;
        KeyCycleOscillator keyCycleOscillator5 = hashMap10 != null ? hashMap10.get("scaleY") : null;
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
        velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
        velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(keyCycleOscillator4, keyCycleOscillator5, adjustedPosition);
        CurveFit curveFit = this.mArcSpline;
        if (curveFit != null) {
            double[] dArr = this.mInterpolateData;
            if (dArr.length > 0) {
                double d5 = adjustedPosition;
                curveFit.getPos(d5, dArr);
                this.mArcSpline.getSlope(d5, this.mInterpolateVelocity);
                this.mStartMotionPath.setDpDt(f6, f7, fArr, this.mInterpolateVariables, this.mInterpolateVelocity, this.mInterpolateData);
            }
            velocityMatrix.applyTransform(f6, f7, i5, i6, fArr);
            return;
        }
        int i7 = 0;
        if (this.mSpline == null) {
            MotionPaths motionPaths = this.mEndMotionPath;
            float f8 = motionPaths.f134x;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f9 = f8 - motionPaths2.f134x;
            KeyCycleOscillator keyCycleOscillator6 = keyCycleOscillator5;
            float f10 = motionPaths.f135y - motionPaths2.f135y;
            KeyCycleOscillator keyCycleOscillator7 = keyCycleOscillator4;
            float f11 = motionPaths.width - motionPaths2.width;
            float f12 = (motionPaths.height - motionPaths2.height) + f10;
            fArr[0] = ((f11 + f9) * f6) + ((1.0f - f6) * f9);
            fArr[1] = (f12 * f7) + ((1.0f - f7) * f10);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(splineSet3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(splineSet, splineSet2, adjustedPosition);
            velocityMatrix.setScaleVelocity(splineSet4, splineSet5, adjustedPosition);
            velocityMatrix.setRotationVelocity(keyCycleOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(keyCycleOscillator, keyCycleOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(keyCycleOscillator7, keyCycleOscillator6, adjustedPosition);
            velocityMatrix.applyTransform(f6, f7, i5, i6, fArr);
            return;
        }
        double adjustedPosition2 = getAdjustedPosition(adjustedPosition, this.mVelocity);
        this.mSpline[0].getSlope(adjustedPosition2, this.mInterpolateVelocity);
        this.mSpline[0].getPos(adjustedPosition2, this.mInterpolateData);
        float f13 = this.mVelocity[0];
        while (true) {
            double[] dArr2 = this.mInterpolateVelocity;
            if (i7 >= dArr2.length) {
                this.mStartMotionPath.setDpDt(f6, f7, fArr, this.mInterpolateVariables, dArr2, this.mInterpolateData);
                velocityMatrix.applyTransform(f6, f7, i5, i6, fArr);
                return;
            } else {
                dArr2[i7] = dArr2[i7] * f13;
                i7++;
            }
        }
    }

    public float getStartHeight() {
        return this.mStartMotionPath.height;
    }

    public float getStartWidth() {
        return this.mStartMotionPath.width;
    }

    public float getStartX() {
        return this.mStartMotionPath.f134x;
    }

    public float getStartY() {
        return this.mStartMotionPath.f135y;
    }

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public MotionWidget getView() {
        return this.mView;
    }

    public boolean interpolate(MotionWidget motionWidget, float f5, long j5, KeyCache keyCache) {
        int i5;
        float adjustedPosition = getAdjustedPosition(f5, null);
        int i6 = this.mQuantizeMotionSteps;
        if (i6 != -1) {
            float f6 = 1.0f / i6;
            float floor = ((float) Math.floor(adjustedPosition / f6)) * f6;
            float f7 = (adjustedPosition % f6) / f6;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                f7 = (f7 + this.mQuantizeMotionPhase) % 1.0f;
            }
            DifferentialInterpolator differentialInterpolator = this.mQuantizeMotionInterpolator;
            adjustedPosition = ((differentialInterpolator != null ? differentialInterpolator.getInterpolation(f7) : ((double) f7) > 0.5d ? 1.0f : 0.0f) * f6) + floor;
        }
        HashMap<String, SplineSet> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            Iterator<SplineSet> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(motionWidget, adjustedPosition);
            }
        }
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d5 = adjustedPosition;
            curveFitArr[0].getPos(d5, this.mInterpolateData);
            this.mSpline[0].getSlope(d5, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d5, dArr);
                    this.mArcSpline.getSlope(d5, this.mInterpolateVelocity);
                }
            }
            if (!this.mNoMovement) {
                this.mStartMotionPath.setView(adjustedPosition, motionWidget, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null);
            }
            if (this.mTransformPivotTarget != -1) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = motionWidget.getParent().findViewById(this.mTransformPivotTarget);
                }
                if (this.mTransformPivotView != null) {
                    float bottom = (this.mTransformPivotView.getBottom() + r13.getTop()) / 2.0f;
                    float right = (this.mTransformPivotView.getRight() + this.mTransformPivotView.getLeft()) / 2.0f;
                    if (motionWidget.getRight() - motionWidget.getLeft() > 0 && motionWidget.getBottom() - motionWidget.getTop() > 0) {
                        motionWidget.setPivotX(right - motionWidget.getLeft());
                        motionWidget.setPivotY(bottom - motionWidget.getTop());
                    }
                }
            }
            int i7 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i7 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i7].getPos(d5, this.mValuesBuff);
                this.mStartMotionPath.customAttributes.get(this.mAttributeNames[i7 - 1]).setInterpolatedValue(motionWidget, this.mValuesBuff);
                i7++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (adjustedPosition > 0.0f) {
                    if (adjustedPosition >= 1.0f) {
                        motionConstrainedPoint = this.mEndPoint;
                    } else if (this.mEndPoint.visibility != motionConstrainedPoint.visibility) {
                        i5 = 4;
                        motionWidget.setVisibility(i5);
                    }
                }
                i5 = motionConstrainedPoint.visibility;
                motionWidget.setVisibility(i5);
            }
            if (this.mKeyTriggers != null) {
                int i8 = 0;
                while (true) {
                    MotionKeyTrigger[] motionKeyTriggerArr = this.mKeyTriggers;
                    if (i8 >= motionKeyTriggerArr.length) {
                        break;
                    }
                    motionKeyTriggerArr[i8].conditionallyFire(adjustedPosition, motionWidget);
                    i8++;
                }
            }
        } else {
            MotionPaths motionPaths = this.mStartMotionPath;
            float f8 = motionPaths.f134x;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float a5 = a.a(motionPaths2.f134x, f8, adjustedPosition, f8);
            float f9 = motionPaths.f135y;
            float a6 = a.a(motionPaths2.f135y, f9, adjustedPosition, f9);
            float f10 = motionPaths.width;
            float a7 = a.a(motionPaths2.width, f10, adjustedPosition, f10);
            float f11 = motionPaths.height;
            float f12 = a5 + 0.5f;
            float f13 = a6 + 0.5f;
            motionWidget.layout((int) f12, (int) f13, (int) (f12 + a7), (int) (f13 + a.a(motionPaths2.height, f11, adjustedPosition, f11)));
        }
        HashMap<String, KeyCycleOscillator> hashMap2 = this.mCycleMap;
        if (hashMap2 == null) {
            return false;
        }
        for (KeyCycleOscillator keyCycleOscillator : hashMap2.values()) {
            if (keyCycleOscillator instanceof KeyCycleOscillator.PathRotateSet) {
                KeyCycleOscillator.PathRotateSet pathRotateSet = (KeyCycleOscillator.PathRotateSet) keyCycleOscillator;
                double[] dArr2 = this.mInterpolateVelocity;
                pathRotateSet.setPathRotate(motionWidget, adjustedPosition, dArr2[0], dArr2[1]);
            } else {
                keyCycleOscillator.setProperty(motionWidget, adjustedPosition);
            }
        }
        return false;
    }

    public String name() {
        return this.mView.getName();
    }

    public void positionKeyframe(MotionWidget motionWidget, MotionKeyPosition motionKeyPosition, float f5, float f6, String[] strArr, float[] fArr) {
        FloatRect floatRect = new FloatRect();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f7 = motionPaths.f134x;
        floatRect.left = f7;
        float f8 = motionPaths.f135y;
        floatRect.top = f8;
        floatRect.right = f7 + motionPaths.width;
        floatRect.bottom = f8 + motionPaths.height;
        FloatRect floatRect2 = new FloatRect();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f9 = motionPaths2.f134x;
        floatRect2.left = f9;
        float f10 = motionPaths2.f135y;
        floatRect2.top = f10;
        floatRect2.right = f9 + motionPaths2.width;
        floatRect2.bottom = f10 + motionPaths2.height;
        motionKeyPosition.positionAttributes(motionWidget, floatRect, floatRect2, f5, f6, strArr, fArr);
    }

    public void rotate(Rect rect, Rect rect2, int i5, int i6, int i7) {
        int i8;
        int width;
        int i9;
        int i10;
        int i11;
        if (i5 != 1) {
            if (i5 == 2) {
                i9 = rect.left + rect.right;
                i10 = rect.top;
                i11 = rect.bottom;
            } else if (i5 == 3) {
                i8 = rect.left + rect.right;
                width = ((rect.height() / 2) + rect.top) - (i8 / 2);
            } else {
                if (i5 != 4) {
                    return;
                }
                i9 = rect.left + rect.right;
                i10 = rect.bottom;
                i11 = rect.top;
            }
            rect2.left = i6 - ((rect.width() + (i10 + i11)) / 2);
            rect2.top = (i9 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
        }
        i8 = rect.left + rect.right;
        width = ((rect.top + rect.bottom) - rect.width()) / 2;
        rect2.left = width;
        rect2.top = i7 - ((rect.height() + i8) / 2);
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public void setBothStates(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        this.mNoMovement = true;
        motionPaths.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mEndMotionPath.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mStartPoint.setState(motionWidget);
        this.mEndPoint.setState(motionWidget);
    }

    public void setDrawPath(int i5) {
        this.mStartMotionPath.mDrawPath = i5;
    }

    public void setEnd(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mEndMotionPath;
        motionPaths.time = 1.0f;
        motionPaths.position = 1.0f;
        readView(motionPaths);
        this.mEndMotionPath.setBounds(motionWidget.getLeft(), motionWidget.getTop(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mEndMotionPath.applyParameters(motionWidget);
        this.mEndPoint.setState(motionWidget);
    }

    public void setPathMotionArc(int i5) {
        this.mPathMotionArc = i5;
    }

    public void setStart(MotionWidget motionWidget) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        motionPaths.setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        this.mStartMotionPath.applyParameters(motionWidget);
        this.mStartPoint.setState(motionWidget);
    }

    public void setStartState(ViewState viewState, MotionWidget motionWidget, int i5, int i6, int i7) {
        int height;
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        Rect rect = new Rect();
        if (i5 != 1) {
            if (i5 == 2) {
                int i8 = viewState.left + viewState.right;
                rect.left = i7 - ((viewState.width() + (viewState.top + viewState.bottom)) / 2);
                height = (i8 - viewState.height()) / 2;
            }
            this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
            this.mStartPoint.setState(rect, motionWidget, i5, viewState.rotation);
        }
        int i9 = viewState.left + viewState.right;
        rect.left = ((viewState.top + viewState.bottom) - viewState.width()) / 2;
        height = i6 - ((viewState.height() + i9) / 2);
        rect.top = height;
        rect.right = viewState.width() + rect.left;
        rect.bottom = viewState.height() + rect.top;
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mStartPoint.setState(rect, motionWidget, i5, viewState.rotation);
    }

    public void setTransformPivotTarget(int i5) {
        this.mTransformPivotTarget = i5;
        this.mTransformPivotView = null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i5, float f5) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i5, int i6) {
        if (i5 != 509) {
            return i5 == 704;
        }
        setPathMotionArc(i6);
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i5, String str) {
        if (705 == i5) {
            System.out.println("TYPE_INTERPOLATOR  " + str);
            this.mQuantizeMotionInterpolator = getInterpolator(-1, str, 0);
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i5, boolean z4) {
        return false;
    }

    public void setView(MotionWidget motionWidget) {
        this.mView = motionWidget;
    }

    public void setup(int i5, int i6, float f5, long j5) {
        ArrayList arrayList;
        String[] strArr;
        CustomVariable customVariable;
        SplineSet makeSpline;
        CustomVariable customVariable2;
        Integer num;
        Iterator<String> it;
        SplineSet makeSpline2;
        CustomVariable customVariable3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i7 = this.mPathMotionArc;
        if (i7 != -1) {
            this.mStartMotionPath.mPathMotionArc = i7;
        }
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        ArrayList<MotionKey> arrayList2 = this.mKeyList;
        if (arrayList2 != null) {
            Iterator<MotionKey> it2 = arrayList2.iterator();
            arrayList = null;
            while (it2.hasNext()) {
                MotionKey next = it2.next();
                if (next instanceof MotionKeyPosition) {
                    MotionKeyPosition motionKeyPosition = (MotionKeyPosition) next;
                    insertKey(new MotionPaths(i5, i6, motionKeyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i8 = motionKeyPosition.mCurveFit;
                    if (i8 != -1) {
                        this.mCurveFitType = i8;
                    }
                } else if (next instanceof MotionKeyCycle) {
                    next.getAttributeNames(hashSet3);
                } else if (next instanceof MotionKeyTimeCycle) {
                    next.getAttributeNames(hashSet);
                } else if (next instanceof MotionKeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((MotionKeyTrigger) next);
                } else {
                    next.setInterpolation(hashMap);
                    next.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.mKeyTriggers = (MotionKeyTrigger[]) arrayList.toArray(new MotionKeyTrigger[0]);
        }
        char c5 = 1;
        if (!hashSet2.isEmpty()) {
            this.mAttributesMap = new HashMap<>();
            Iterator<String> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                if (next2.startsWith("CUSTOM,")) {
                    KeyFrameArray.CustomVar customVar = new KeyFrameArray.CustomVar();
                    String str = next2.split(",")[c5];
                    Iterator<MotionKey> it4 = this.mKeyList.iterator();
                    while (it4.hasNext()) {
                        MotionKey next3 = it4.next();
                        Iterator<String> it5 = it3;
                        HashMap<String, CustomVariable> hashMap2 = next3.mCustom;
                        if (hashMap2 != null && (customVariable3 = hashMap2.get(str)) != null) {
                            customVar.append(next3.mFramePosition, customVariable3);
                        }
                        it3 = it5;
                    }
                    it = it3;
                    makeSpline2 = SplineSet.makeCustomSplineSet(next2, customVar);
                } else {
                    it = it3;
                    makeSpline2 = SplineSet.makeSpline(next2, j5);
                }
                if (makeSpline2 != null) {
                    makeSpline2.setType(next2);
                    this.mAttributesMap.put(next2, makeSpline2);
                }
                c5 = 1;
                it3 = it;
            }
            ArrayList<MotionKey> arrayList3 = this.mKeyList;
            if (arrayList3 != null) {
                Iterator<MotionKey> it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    MotionKey next4 = it6.next();
                    if (next4 instanceof MotionKeyAttributes) {
                        next4.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (String str2 : this.mAttributesMap.keySet()) {
                int intValue = (!hashMap.containsKey(str2) || (num = hashMap.get(str2)) == null) ? 0 : num.intValue();
                SplineSet splineSet = this.mAttributesMap.get(str2);
                if (splineSet != null) {
                    splineSet.setup(intValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.mTimeCycleAttributesMap == null) {
                this.mTimeCycleAttributesMap = new HashMap<>();
            }
            Iterator<String> it7 = hashSet.iterator();
            while (it7.hasNext()) {
                String next5 = it7.next();
                if (!this.mTimeCycleAttributesMap.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        KeyFrameArray.CustomVar customVar2 = new KeyFrameArray.CustomVar();
                        String str3 = next5.split(",")[1];
                        Iterator<MotionKey> it8 = this.mKeyList.iterator();
                        while (it8.hasNext()) {
                            MotionKey next6 = it8.next();
                            HashMap<String, CustomVariable> hashMap3 = next6.mCustom;
                            if (hashMap3 != null && (customVariable2 = hashMap3.get(str3)) != null) {
                                customVar2.append(next6.mFramePosition, customVariable2);
                            }
                        }
                        makeSpline = SplineSet.makeCustomSplineSet(next5, customVar2);
                    } else {
                        makeSpline = SplineSet.makeSpline(next5, j5);
                    }
                    if (makeSpline != null) {
                        makeSpline.setType(next5);
                    }
                }
            }
            ArrayList<MotionKey> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                Iterator<MotionKey> it9 = arrayList4.iterator();
                while (it9.hasNext()) {
                    MotionKey next7 = it9.next();
                    if (next7 instanceof MotionKeyTimeCycle) {
                        ((MotionKeyTimeCycle) next7).addTimeValues(this.mTimeCycleAttributesMap);
                    }
                }
            }
            for (String str4 : this.mTimeCycleAttributesMap.keySet()) {
                this.mTimeCycleAttributesMap.get(str4).setup(hashMap.containsKey(str4) ? hashMap.get(str4).intValue() : 0);
            }
        }
        int i9 = 2;
        int size = this.mMotionPaths.size() + 2;
        MotionPaths[] motionPathsArr = new MotionPaths[size];
        motionPathsArr[0] = this.mStartMotionPath;
        motionPathsArr[size - 1] = this.mEndMotionPath;
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == MotionKey.UNSET) {
            this.mCurveFitType = 0;
        }
        Iterator<MotionPaths> it10 = this.mMotionPaths.iterator();
        int i10 = 1;
        while (it10.hasNext()) {
            motionPathsArr[i10] = it10.next();
            i10++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.mEndMotionPath.customAttributes.keySet()) {
            if (this.mStartMotionPath.customAttributes.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.mAttributeNames = strArr2;
        this.mAttributeInterpolatorCount = new int[strArr2.length];
        int i11 = 0;
        while (true) {
            strArr = this.mAttributeNames;
            if (i11 >= strArr.length) {
                break;
            }
            String str6 = strArr[i11];
            this.mAttributeInterpolatorCount[i11] = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    break;
                }
                if (motionPathsArr[i12].customAttributes.containsKey(str6) && (customVariable = motionPathsArr[i12].customAttributes.get(str6)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i11] = customVariable.numberOfInterpolatedValues() + iArr[i11];
                    break;
                }
                i12++;
            }
            i11++;
        }
        boolean z4 = motionPathsArr[0].mPathMotionArc != -1;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i13 = 1; i13 < size; i13++) {
            motionPathsArr[i13].different(motionPathsArr[i13 - 1], zArr, this.mAttributeNames, z4);
        }
        int i14 = 0;
        for (int i15 = 1; i15 < length; i15++) {
            if (zArr[i15]) {
                i14++;
            }
        }
        this.mInterpolateVariables = new int[i14];
        int max = Math.max(2, i14);
        this.mInterpolateData = new double[max];
        this.mInterpolateVelocity = new double[max];
        int i16 = 0;
        for (int i17 = 1; i17 < length; i17++) {
            if (zArr[i17]) {
                this.mInterpolateVariables[i16] = i17;
                i16++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) double.class, size, this.mInterpolateVariables.length);
        double[] dArr2 = new double[size];
        for (int i18 = 0; i18 < size; i18++) {
            motionPathsArr[i18].fillStandard(dArr[i18], this.mInterpolateVariables);
            dArr2[i18] = motionPathsArr[i18].time;
        }
        int i19 = 0;
        while (true) {
            int[] iArr2 = this.mInterpolateVariables;
            if (i19 >= iArr2.length) {
                break;
            }
            if (iArr2[i19] < MotionPaths.names.length) {
                String c6 = a.c(new StringBuilder(), MotionPaths.names[this.mInterpolateVariables[i19]], " [");
                for (int i20 = 0; i20 < size; i20++) {
                    StringBuilder g5 = d.g(c6);
                    g5.append(dArr[i20][i19]);
                    c6 = g5.toString();
                }
            }
            i19++;
        }
        this.mSpline = new CurveFit[this.mAttributeNames.length + 1];
        int i21 = 0;
        while (true) {
            String[] strArr3 = this.mAttributeNames;
            if (i21 >= strArr3.length) {
                break;
            }
            String str7 = strArr3[i21];
            int i22 = 0;
            int i23 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i22 < size) {
                if (motionPathsArr[i22].hasCustomData(str7)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr3 = new int[i9];
                        iArr3[1] = motionPathsArr[i22].getCustomDataCount(str7);
                        iArr3[0] = size;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) double.class, iArr3);
                    }
                    dArr3[i23] = motionPathsArr[i22].time;
                    motionPathsArr[i22].getCustomData(str7, dArr4[i23], 0);
                    i23++;
                }
                i22++;
                i9 = 2;
            }
            i21++;
            this.mSpline[i21] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i23), (double[][]) Arrays.copyOf(dArr4, i23));
            i9 = 2;
        }
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != -1) {
            int[] iArr4 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) double.class, size, 2);
            for (int i24 = 0; i24 < size; i24++) {
                iArr4[i24] = motionPathsArr[i24].mPathMotionArc;
                dArr5[i24] = motionPathsArr[i24].time;
                dArr6[i24][0] = motionPathsArr[i24].f134x;
                dArr6[i24][1] = motionPathsArr[i24].f135y;
            }
            this.mArcSpline = CurveFit.getArc(iArr4, dArr5, dArr6);
        }
        float f6 = Float.NaN;
        this.mCycleMap = new HashMap<>();
        if (this.mKeyList != null) {
            Iterator<String> it11 = hashSet3.iterator();
            while (it11.hasNext()) {
                String next8 = it11.next();
                KeyCycleOscillator makeWidgetCycle = KeyCycleOscillator.makeWidgetCycle(next8);
                if (makeWidgetCycle != null) {
                    if (makeWidgetCycle.variesByPath() && Float.isNaN(f6)) {
                        f6 = getPreCycleDistance();
                    }
                    makeWidgetCycle.setType(next8);
                    this.mCycleMap.put(next8, makeWidgetCycle);
                }
            }
            Iterator<MotionKey> it12 = this.mKeyList.iterator();
            while (it12.hasNext()) {
                MotionKey next9 = it12.next();
                if (next9 instanceof MotionKeyCycle) {
                    ((MotionKeyCycle) next9).addCycleValues(this.mCycleMap);
                }
            }
            Iterator<KeyCycleOscillator> it13 = this.mCycleMap.values().iterator();
            while (it13.hasNext()) {
                it13.next().setup(f6);
            }
        }
    }

    public void setupRelative(Motion motion) {
        this.mStartMotionPath.setupRelative(motion, motion.mStartMotionPath);
        this.mEndMotionPath.setupRelative(motion, motion.mEndMotionPath);
    }

    public String toString() {
        StringBuilder g5 = d.g(" start: x: ");
        g5.append(this.mStartMotionPath.f134x);
        g5.append(" y: ");
        g5.append(this.mStartMotionPath.f135y);
        g5.append(" end: x: ");
        g5.append(this.mEndMotionPath.f134x);
        g5.append(" y: ");
        g5.append(this.mEndMotionPath.f135y);
        return g5.toString();
    }
}
