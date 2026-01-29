package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.activity.d;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.VelocityMatrix;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes12.dex */
public class MotionController {
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
    private HashMap<String, ViewSpline> mAttributesMap;
    public String mConstraintTag;
    public float mCurrentCenterX;
    public float mCurrentCenterY;
    private HashMap<String, ViewOscillator> mCycleMap;
    public int mId;
    private double[] mInterpolateData;
    private int[] mInterpolateVariables;
    private double[] mInterpolateVelocity;
    private KeyTrigger[] mKeyTriggers;
    private boolean mNoMovement;
    private int mPathMotionArc;
    private Interpolator mQuantizeMotionInterpolator;
    private float mQuantizeMotionPhase;
    private int mQuantizeMotionSteps;
    private CurveFit[] mSpline;
    private HashMap<String, ViewTimeCycle> mTimeCycleAttributesMap;
    private int mTransformPivotTarget;
    private View mTransformPivotView;
    public View mView;
    public Rect mTempRect = new Rect();
    public boolean mForceMeasure = false;
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
    private ArrayList<Key> mKeyList = new ArrayList<>();

    public MotionController(View view) {
        int i5 = Key.UNSET;
        this.mPathMotionArc = i5;
        this.mTransformPivotTarget = i5;
        this.mTransformPivotView = null;
        this.mQuantizeMotionSteps = i5;
        this.mQuantizeMotionPhase = Float.NaN;
        this.mQuantizeMotionInterpolator = null;
        this.mNoMovement = false;
        setView(view);
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

    private static Interpolator getInterpolator(Context context, int i5, String str, int i6) {
        if (i5 == -2) {
            return AnimationUtils.loadInterpolator(context, i6);
        }
        if (i5 == -1) {
            final Easing interpolator = Easing.getInterpolator(str);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionController.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f5) {
                    return (float) Easing.this.get(f5);
                }
            };
        }
        if (i5 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i5 == 1) {
            return new AccelerateInterpolator();
        }
        if (i5 == 2) {
            return new DecelerateInterpolator();
        }
        if (i5 == 4) {
            return new BounceInterpolator();
        }
        if (i5 != 5) {
            return null;
        }
        return new OvershootInterpolator();
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
        if (Collections.binarySearch(this.mMotionPaths, motionPaths) == 0) {
            StringBuilder g5 = d.g(" KeyPath position \"");
            g5.append(motionPaths.position);
            g5.append("\" outside of range");
            Log.e(TAG, g5.toString());
        }
        this.mMotionPaths.add((-r0) - 1, motionPaths);
    }

    private void readView(MotionPaths motionPaths) {
        motionPaths.setBounds((int) this.mView.getX(), (int) this.mView.getY(), this.mView.getWidth(), this.mView.getHeight());
    }

    public void addKey(Key key) {
        this.mKeyList.add(key);
    }

    public void addKeys(ArrayList<Key> arrayList) {
        this.mKeyList.addAll(arrayList);
    }

    public void buildBounds(float[] fArr, int i5) {
        float f5 = 1.0f / (i5 - 1);
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, ViewSpline> hashMap2 = this.mAttributesMap;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, ViewOscillator> hashMap3 = this.mCycleMap;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, ViewOscillator> hashMap4 = this.mCycleMap;
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

    public int buildKeyFrames(float[] fArr, int[] iArr) {
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
        for (int i7 = 0; i7 < timePoints.length; i7++) {
            this.mSpline[0].getPos(timePoints[i7], this.mInterpolateData);
            this.mStartMotionPath.getCenter(timePoints[i7], this.mInterpolateVariables, this.mInterpolateData, fArr, i6);
            i6 += 2;
        }
        return i6 / 2;
    }

    public void buildPath(float[] fArr, int i5) {
        double d5;
        float f5 = 1.0f;
        float f6 = 1.0f / (i5 - 1);
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        ViewSpline viewSpline = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, ViewSpline> hashMap2 = this.mAttributesMap;
        ViewSpline viewSpline2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, ViewOscillator> hashMap3 = this.mCycleMap;
        ViewOscillator viewOscillator = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, ViewOscillator> hashMap4 = this.mCycleMap;
        ViewOscillator viewOscillator2 = hashMap4 != null ? hashMap4.get("translationY") : null;
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
            if (viewOscillator != null) {
                fArr[i7] = viewOscillator.get(f10) + fArr[i7];
            } else if (viewSpline != null) {
                fArr[i7] = viewSpline.get(f10) + fArr[i7];
            }
            if (viewOscillator2 != null) {
                int i9 = i7 + 1;
                fArr[i9] = viewOscillator2.get(f10) + fArr[i9];
            } else if (viewSpline2 != null) {
                int i10 = i7 + 1;
                fArr[i10] = viewSpline2.get(f10) + fArr[i10];
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
        if (!"button".equals(Debug.getName(this.mView)) || this.mKeyTriggers == null) {
            return;
        }
        int i5 = 0;
        while (true) {
            KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
            if (i5 >= keyTriggerArr.length) {
                return;
            }
            keyTriggerArr[i5].conditionallyFire(z4 ? -100.0f : 100.0f, this.mView);
            i5++;
        }
    }

    public int getAnimateRelativeTo() {
        return this.mStartMotionPath.mAnimateRelativeTo;
    }

    public int getAttributeValues(String str, float[] fArr, int i5) {
        ViewSpline viewSpline = this.mAttributesMap.get(str);
        if (viewSpline == null) {
            return -1;
        }
        for (int i6 = 0; i6 < fArr.length; i6++) {
            fArr[i6] = viewSpline.get(i6 / (fArr.length - 1));
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
            float f8 = motionPaths.f161x;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f9 = f8 - motionPaths2.f161x;
            float f10 = motionPaths.f162y - motionPaths2.f162y;
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
        return this.mEndMotionPath.f161x;
    }

    public float getFinalY() {
        return this.mEndMotionPath.f162y;
    }

    public MotionPaths getKeyFrame(int i5) {
        return this.mMotionPaths.get(i5);
    }

    public int getKeyFrameInfo(int i5, int[] iArr) {
        float[] fArr = new float[2];
        Iterator<Key> it = this.mKeyList.iterator();
        int i6 = 0;
        int i7 = 0;
        while (it.hasNext()) {
            Key next = it.next();
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
                if (next instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) next;
                    int i14 = i13 + 1;
                    iArr[i14] = keyPosition.mPositionType;
                    int i15 = i14 + 1;
                    iArr[i15] = Float.floatToIntBits(keyPosition.mPercentX);
                    i13 = i15 + 1;
                    iArr[i13] = Float.floatToIntBits(keyPosition.mPercentY);
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
        float f7 = motionPaths.f161x;
        MotionPaths motionPaths2 = this.mStartMotionPath;
        float f8 = motionPaths2.f161x;
        float f9 = f7 - f8;
        float f10 = motionPaths.f162y;
        float f11 = motionPaths2.f162y;
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
        Iterator<Key> it = this.mKeyList.iterator();
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            Key next = it.next();
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

    public KeyPositionBase getPositionKeyframe(int i5, int i6, float f5, float f6) {
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f7 = motionPaths.f161x;
        rectF.left = f7;
        float f8 = motionPaths.f162y;
        rectF.top = f8;
        rectF.right = f7 + motionPaths.width;
        rectF.bottom = f8 + motionPaths.height;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f9 = motionPaths2.f161x;
        rectF2.left = f9;
        float f10 = motionPaths2.f162y;
        rectF2.top = f10;
        rectF2.right = f9 + motionPaths2.width;
        rectF2.bottom = f10 + motionPaths2.height;
        Iterator<Key> it = this.mKeyList.iterator();
        while (it.hasNext()) {
            Key next = it.next();
            if (next instanceof KeyPositionBase) {
                KeyPositionBase keyPositionBase = (KeyPositionBase) next;
                if (keyPositionBase.intersects(i5, i6, rectF, rectF2, f5, f6)) {
                    return keyPositionBase;
                }
            }
        }
        return null;
    }

    public void getPostLayoutDvDp(float f5, int i5, int i6, float f6, float f7, float[] fArr) {
        float adjustedPosition = getAdjustedPosition(f5, this.mVelocity);
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        ViewSpline viewSpline = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, ViewSpline> hashMap2 = this.mAttributesMap;
        ViewSpline viewSpline2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, ViewSpline> hashMap3 = this.mAttributesMap;
        ViewSpline viewSpline3 = hashMap3 == null ? null : hashMap3.get(Key.ROTATION);
        HashMap<String, ViewSpline> hashMap4 = this.mAttributesMap;
        ViewSpline viewSpline4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, ViewSpline> hashMap5 = this.mAttributesMap;
        ViewSpline viewSpline5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, ViewOscillator> hashMap6 = this.mCycleMap;
        ViewOscillator viewOscillator = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, ViewOscillator> hashMap7 = this.mCycleMap;
        ViewOscillator viewOscillator2 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, ViewOscillator> hashMap8 = this.mCycleMap;
        ViewOscillator viewOscillator3 = hashMap8 == null ? null : hashMap8.get(Key.ROTATION);
        HashMap<String, ViewOscillator> hashMap9 = this.mCycleMap;
        ViewOscillator viewOscillator4 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, ViewOscillator> hashMap10 = this.mCycleMap;
        ViewOscillator viewOscillator5 = hashMap10 != null ? hashMap10.get("scaleY") : null;
        VelocityMatrix velocityMatrix = new VelocityMatrix();
        velocityMatrix.clear();
        velocityMatrix.setRotationVelocity(viewSpline3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, adjustedPosition);
        velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, adjustedPosition);
        velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
        velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
        velocityMatrix.setScaleVelocity(viewOscillator4, viewOscillator5, adjustedPosition);
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
            float f8 = motionPaths.f161x;
            MotionPaths motionPaths2 = this.mStartMotionPath;
            float f9 = f8 - motionPaths2.f161x;
            ViewOscillator viewOscillator6 = viewOscillator5;
            float f10 = motionPaths.f162y - motionPaths2.f162y;
            ViewOscillator viewOscillator7 = viewOscillator4;
            float f11 = motionPaths.width - motionPaths2.width;
            float f12 = (motionPaths.height - motionPaths2.height) + f10;
            fArr[0] = ((f11 + f9) * f6) + ((1.0f - f6) * f9);
            fArr[1] = (f12 * f7) + ((1.0f - f7) * f10);
            velocityMatrix.clear();
            velocityMatrix.setRotationVelocity(viewSpline3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewSpline, viewSpline2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewSpline4, viewSpline5, adjustedPosition);
            velocityMatrix.setRotationVelocity(viewOscillator3, adjustedPosition);
            velocityMatrix.setTranslationVelocity(viewOscillator, viewOscillator2, adjustedPosition);
            velocityMatrix.setScaleVelocity(viewOscillator7, viewOscillator6, adjustedPosition);
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
        return this.mStartMotionPath.f161x;
    }

    public float getStartY() {
        return this.mStartMotionPath.f162y;
    }

    public int getTransformPivotTarget() {
        return this.mTransformPivotTarget;
    }

    public View getView() {
        return this.mView;
    }

    public boolean interpolate(View view, float f5, long j5, KeyCache keyCache) {
        ViewTimeCycle.PathRotate pathRotate;
        boolean z4;
        char c5;
        double d5;
        float adjustedPosition = getAdjustedPosition(f5, null);
        int i5 = this.mQuantizeMotionSteps;
        if (i5 != Key.UNSET) {
            float f6 = 1.0f / i5;
            float floor = ((float) Math.floor(adjustedPosition / f6)) * f6;
            float f7 = (adjustedPosition % f6) / f6;
            if (!Float.isNaN(this.mQuantizeMotionPhase)) {
                f7 = (f7 + this.mQuantizeMotionPhase) % 1.0f;
            }
            Interpolator interpolator = this.mQuantizeMotionInterpolator;
            adjustedPosition = ((interpolator != null ? interpolator.getInterpolation(f7) : ((double) f7) > 0.5d ? 1.0f : 0.0f) * f6) + floor;
        }
        float f8 = adjustedPosition;
        HashMap<String, ViewSpline> hashMap = this.mAttributesMap;
        if (hashMap != null) {
            Iterator<ViewSpline> it = hashMap.values().iterator();
            while (it.hasNext()) {
                it.next().setProperty(view, f8);
            }
        }
        HashMap<String, ViewTimeCycle> hashMap2 = this.mTimeCycleAttributesMap;
        if (hashMap2 != null) {
            ViewTimeCycle.PathRotate pathRotate2 = null;
            boolean z5 = false;
            for (ViewTimeCycle viewTimeCycle : hashMap2.values()) {
                if (viewTimeCycle instanceof ViewTimeCycle.PathRotate) {
                    pathRotate2 = (ViewTimeCycle.PathRotate) viewTimeCycle;
                } else {
                    z5 |= viewTimeCycle.setProperty(view, f8, j5, keyCache);
                }
            }
            z4 = z5;
            pathRotate = pathRotate2;
        } else {
            pathRotate = null;
            z4 = false;
        }
        CurveFit[] curveFitArr = this.mSpline;
        if (curveFitArr != null) {
            double d6 = f8;
            curveFitArr[0].getPos(d6, this.mInterpolateData);
            this.mSpline[0].getSlope(d6, this.mInterpolateVelocity);
            CurveFit curveFit = this.mArcSpline;
            if (curveFit != null) {
                double[] dArr = this.mInterpolateData;
                if (dArr.length > 0) {
                    curveFit.getPos(d6, dArr);
                    this.mArcSpline.getSlope(d6, this.mInterpolateVelocity);
                }
            }
            if (this.mNoMovement) {
                d5 = d6;
            } else {
                d5 = d6;
                this.mStartMotionPath.setView(f8, view, this.mInterpolateVariables, this.mInterpolateData, this.mInterpolateVelocity, null, this.mForceMeasure);
                this.mForceMeasure = false;
            }
            if (this.mTransformPivotTarget != Key.UNSET) {
                if (this.mTransformPivotView == null) {
                    this.mTransformPivotView = ((View) view.getParent()).findViewById(this.mTransformPivotTarget);
                }
                if (this.mTransformPivotView != null) {
                    float bottom = (this.mTransformPivotView.getBottom() + r1.getTop()) / 2.0f;
                    float right = (this.mTransformPivotView.getRight() + this.mTransformPivotView.getLeft()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(right - view.getLeft());
                        view.setPivotY(bottom - view.getTop());
                    }
                }
            }
            HashMap<String, ViewSpline> hashMap3 = this.mAttributesMap;
            if (hashMap3 != null) {
                for (ViewSpline viewSpline : hashMap3.values()) {
                    if (viewSpline instanceof ViewSpline.PathRotate) {
                        double[] dArr2 = this.mInterpolateVelocity;
                        if (dArr2.length > 1) {
                            ((ViewSpline.PathRotate) viewSpline).setPathRotate(view, f8, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (pathRotate != null) {
                double[] dArr3 = this.mInterpolateVelocity;
                c5 = 1;
                z4 = pathRotate.setPathRotate(view, keyCache, f8, j5, dArr3[0], dArr3[1]) | z4;
            } else {
                c5 = 1;
            }
            int i6 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.mSpline;
                if (i6 >= curveFitArr2.length) {
                    break;
                }
                curveFitArr2[i6].getPos(d5, this.mValuesBuff);
                CustomSupport.setInterpolatedValue(this.mStartMotionPath.attributes.get(this.mAttributeNames[i6 - 1]), view, this.mValuesBuff);
                i6++;
            }
            MotionConstrainedPoint motionConstrainedPoint = this.mStartPoint;
            if (motionConstrainedPoint.mVisibilityMode == 0) {
                if (f8 > 0.0f) {
                    if (f8 >= 1.0f) {
                        motionConstrainedPoint = this.mEndPoint;
                    } else if (this.mEndPoint.visibility != motionConstrainedPoint.visibility) {
                        view.setVisibility(0);
                    }
                }
                view.setVisibility(motionConstrainedPoint.visibility);
            }
            if (this.mKeyTriggers != null) {
                int i7 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.mKeyTriggers;
                    if (i7 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i7].conditionallyFire(f8, view);
                    i7++;
                }
            }
        } else {
            c5 = 1;
            MotionPaths motionPaths = this.mStartMotionPath;
            float f9 = motionPaths.f161x;
            MotionPaths motionPaths2 = this.mEndMotionPath;
            float a5 = androidx.appcompat.graphics.drawable.a.a(motionPaths2.f161x, f9, f8, f9);
            float f10 = motionPaths.f162y;
            float a6 = androidx.appcompat.graphics.drawable.a.a(motionPaths2.f162y, f10, f8, f10);
            float f11 = motionPaths.width;
            float f12 = motionPaths2.width;
            float a7 = androidx.appcompat.graphics.drawable.a.a(f12, f11, f8, f11);
            float f13 = motionPaths.height;
            float f14 = motionPaths2.height;
            float f15 = a5 + 0.5f;
            int i8 = (int) f15;
            float f16 = a6 + 0.5f;
            int i9 = (int) f16;
            int i10 = (int) (f15 + a7);
            int a8 = (int) (f16 + androidx.appcompat.graphics.drawable.a.a(f14, f13, f8, f13));
            int i11 = i10 - i8;
            int i12 = a8 - i9;
            if (f12 != f11 || f14 != f13 || this.mForceMeasure) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                this.mForceMeasure = false;
            }
            view.layout(i8, i9, i10, a8);
        }
        HashMap<String, ViewOscillator> hashMap4 = this.mCycleMap;
        if (hashMap4 != null) {
            for (ViewOscillator viewOscillator : hashMap4.values()) {
                if (viewOscillator instanceof ViewOscillator.PathRotateSet) {
                    double[] dArr4 = this.mInterpolateVelocity;
                    ((ViewOscillator.PathRotateSet) viewOscillator).setPathRotate(view, f8, dArr4[0], dArr4[c5]);
                } else {
                    viewOscillator.setProperty(view, f8);
                }
            }
        }
        return z4;
    }

    public String name() {
        return this.mView.getContext().getResources().getResourceEntryName(this.mView.getId());
    }

    public void positionKeyframe(View view, KeyPositionBase keyPositionBase, float f5, float f6, String[] strArr, float[] fArr) {
        RectF rectF = new RectF();
        MotionPaths motionPaths = this.mStartMotionPath;
        float f7 = motionPaths.f161x;
        rectF.left = f7;
        float f8 = motionPaths.f162y;
        rectF.top = f8;
        rectF.right = f7 + motionPaths.width;
        rectF.bottom = f8 + motionPaths.height;
        RectF rectF2 = new RectF();
        MotionPaths motionPaths2 = this.mEndMotionPath;
        float f9 = motionPaths2.f161x;
        rectF2.left = f9;
        float f10 = motionPaths2.f162y;
        rectF2.top = f10;
        rectF2.right = f9 + motionPaths2.width;
        rectF2.bottom = f10 + motionPaths2.height;
        keyPositionBase.positionAttributes(view, rectF, rectF2, f5, f6, strArr, fArr);
    }

    public void remeasure() {
        this.mForceMeasure = true;
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

    public void setBothStates(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        this.mNoMovement = true;
        motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mEndMotionPath.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
        this.mEndPoint.setState(view);
    }

    public void setDrawPath(int i5) {
        this.mStartMotionPath.mDrawPath = i5;
    }

    public void setEndState(Rect rect, ConstraintSet constraintSet, int i5, int i6) {
        int i7 = constraintSet.mRotate;
        if (i7 != 0) {
            rotate(rect, this.mTempRect, i7, i5, i6);
            rect = this.mTempRect;
        }
        MotionPaths motionPaths = this.mEndMotionPath;
        motionPaths.time = 1.0f;
        motionPaths.position = 1.0f;
        readView(motionPaths);
        this.mEndMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mEndMotionPath.applyParameters(constraintSet.getParameters(this.mId));
        this.mEndPoint.setState(rect, constraintSet, i7, this.mId);
    }

    public void setPathMotionArc(int i5) {
        this.mPathMotionArc = i5;
    }

    public void setStartCurrentState(View view) {
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        motionPaths.setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.mStartPoint.setState(view);
    }

    public void setStartState(Rect rect, ConstraintSet constraintSet, int i5, int i6) {
        int i7 = constraintSet.mRotate;
        if (i7 != 0) {
            rotate(rect, this.mTempRect, i7, i5, i6);
        }
        MotionPaths motionPaths = this.mStartMotionPath;
        motionPaths.time = 0.0f;
        motionPaths.position = 0.0f;
        readView(motionPaths);
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        ConstraintSet.Constraint parameters = constraintSet.getParameters(this.mId);
        this.mStartMotionPath.applyParameters(parameters);
        this.mMotionStagger = parameters.motion.mMotionStagger;
        this.mStartPoint.setState(rect, constraintSet, i7, this.mId);
        this.mTransformPivotTarget = parameters.transform.transformPivotTarget;
        ConstraintSet.Motion motion = parameters.motion;
        this.mQuantizeMotionSteps = motion.mQuantizeMotionSteps;
        this.mQuantizeMotionPhase = motion.mQuantizeMotionPhase;
        Context context = this.mView.getContext();
        ConstraintSet.Motion motion2 = parameters.motion;
        this.mQuantizeMotionInterpolator = getInterpolator(context, motion2.mQuantizeInterpolatorType, motion2.mQuantizeInterpolatorString, motion2.mQuantizeInterpolatorID);
    }

    public void setStartState(ViewState viewState, View view, int i5, int i6, int i7) {
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
            this.mStartPoint.setState(rect, view, i5, viewState.rotation);
        }
        int i9 = viewState.left + viewState.right;
        rect.left = ((viewState.top + viewState.bottom) - viewState.width()) / 2;
        height = i6 - ((viewState.height() + i9) / 2);
        rect.top = height;
        rect.right = viewState.width() + rect.left;
        rect.bottom = viewState.height() + rect.top;
        this.mStartMotionPath.setBounds(rect.left, rect.top, rect.width(), rect.height());
        this.mStartPoint.setState(rect, view, i5, viewState.rotation);
    }

    public void setTransformPivotTarget(int i5) {
        this.mTransformPivotTarget = i5;
        this.mTransformPivotView = null;
    }

    public void setView(View view) {
        this.mView = view;
        this.mId = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.mConstraintTag = ((ConstraintLayout.LayoutParams) layoutParams).getConstraintTag();
        }
    }

    public void setup(int i5, int i6, float f5, long j5) {
        ArrayList arrayList;
        String[] strArr;
        ConstraintAttribute constraintAttribute;
        ViewTimeCycle makeSpline;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        ViewSpline makeSpline2;
        ConstraintAttribute constraintAttribute3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i7 = this.mPathMotionArc;
        if (i7 != Key.UNSET) {
            this.mStartMotionPath.mPathMotionArc = i7;
        }
        this.mStartPoint.different(this.mEndPoint, hashSet2);
        ArrayList<Key> arrayList2 = this.mKeyList;
        if (arrayList2 != null) {
            Iterator<Key> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                Key next = it.next();
                if (next instanceof KeyPosition) {
                    KeyPosition keyPosition = (KeyPosition) next;
                    insertKey(new MotionPaths(i5, i6, keyPosition, this.mStartMotionPath, this.mEndMotionPath));
                    int i8 = keyPosition.mCurveFit;
                    if (i8 != Key.UNSET) {
                        this.mCurveFitType = i8;
                    }
                } else if (next instanceof KeyCycle) {
                    next.getAttributeNames(hashSet3);
                } else if (next instanceof KeyTimeCycle) {
                    next.getAttributeNames(hashSet);
                } else if (next instanceof KeyTrigger) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((KeyTrigger) next);
                } else {
                    next.setInterpolation(hashMap);
                    next.getAttributeNames(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        char c5 = 0;
        if (arrayList != null) {
            this.mKeyTriggers = (KeyTrigger[]) arrayList.toArray(new KeyTrigger[0]);
        }
        char c6 = 1;
        if (!hashSet2.isEmpty()) {
            this.mAttributesMap = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(",")[c6];
                    Iterator<Key> it3 = this.mKeyList.iterator();
                    while (it3.hasNext()) {
                        Key next3 = it3.next();
                        HashMap<String, ConstraintAttribute> hashMap2 = next3.mCustomConstraints;
                        if (hashMap2 != null && (constraintAttribute3 = hashMap2.get(str)) != null) {
                            sparseArray.append(next3.mFramePosition, constraintAttribute3);
                        }
                    }
                    makeSpline2 = ViewSpline.makeCustomSpline(next2, (SparseArray<ConstraintAttribute>) sparseArray);
                } else {
                    makeSpline2 = ViewSpline.makeSpline(next2);
                }
                if (makeSpline2 != null) {
                    makeSpline2.setType(next2);
                    this.mAttributesMap.put(next2, makeSpline2);
                }
                c6 = 1;
            }
            ArrayList<Key> arrayList3 = this.mKeyList;
            if (arrayList3 != null) {
                Iterator<Key> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    Key next4 = it4.next();
                    if (next4 instanceof KeyAttributes) {
                        next4.addValues(this.mAttributesMap);
                    }
                }
            }
            this.mStartPoint.addValues(this.mAttributesMap, 0);
            this.mEndPoint.addValues(this.mAttributesMap, 100);
            for (String str2 : this.mAttributesMap.keySet()) {
                int intValue = (!hashMap.containsKey(str2) || (num = hashMap.get(str2)) == null) ? 0 : num.intValue();
                ViewSpline viewSpline = this.mAttributesMap.get(str2);
                if (viewSpline != null) {
                    viewSpline.setup(intValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.mTimeCycleAttributesMap == null) {
                this.mTimeCycleAttributesMap = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.mTimeCycleAttributesMap.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(",")[1];
                        Iterator<Key> it6 = this.mKeyList.iterator();
                        while (it6.hasNext()) {
                            Key next6 = it6.next();
                            HashMap<String, ConstraintAttribute> hashMap3 = next6.mCustomConstraints;
                            if (hashMap3 != null && (constraintAttribute2 = hashMap3.get(str3)) != null) {
                                sparseArray2.append(next6.mFramePosition, constraintAttribute2);
                            }
                        }
                        makeSpline = ViewTimeCycle.makeCustomSpline(next5, sparseArray2);
                    } else {
                        makeSpline = ViewTimeCycle.makeSpline(next5, j5);
                    }
                    if (makeSpline != null) {
                        makeSpline.setType(next5);
                        this.mTimeCycleAttributesMap.put(next5, makeSpline);
                    }
                }
            }
            ArrayList<Key> arrayList4 = this.mKeyList;
            if (arrayList4 != null) {
                Iterator<Key> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    Key next7 = it7.next();
                    if (next7 instanceof KeyTimeCycle) {
                        ((KeyTimeCycle) next7).addTimeValues(this.mTimeCycleAttributesMap);
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
        if (this.mMotionPaths.size() > 0 && this.mCurveFitType == -1) {
            this.mCurveFitType = 0;
        }
        Iterator<MotionPaths> it8 = this.mMotionPaths.iterator();
        int i10 = 1;
        while (it8.hasNext()) {
            motionPathsArr[i10] = it8.next();
            i10++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.mEndMotionPath.attributes.keySet()) {
            if (this.mStartMotionPath.attributes.containsKey(str5)) {
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
                if (motionPathsArr[i12].attributes.containsKey(str6) && (constraintAttribute = motionPathsArr[i12].attributes.get(str6)) != null) {
                    int[] iArr = this.mAttributeInterpolatorCount;
                    iArr[i11] = constraintAttribute.numberOfInterpolatedValues() + iArr[i11];
                    break;
                }
                i12++;
            }
            i11++;
        }
        boolean z4 = motionPathsArr[0].mPathMotionArc != Key.UNSET;
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
                String c7 = androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), MotionPaths.names[this.mInterpolateVariables[i19]], " [");
                for (int i20 = 0; i20 < size; i20++) {
                    StringBuilder g5 = d.g(c7);
                    g5.append(dArr[i20][i19]);
                    c7 = g5.toString();
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
            double[] dArr3 = null;
            int i23 = 0;
            double[][] dArr4 = null;
            while (i22 < size) {
                if (motionPathsArr[i22].hasCustomData(str7)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr3 = new int[i9];
                        iArr3[1] = motionPathsArr[i22].getCustomDataCount(str7);
                        iArr3[c5] = size;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) double.class, iArr3);
                    }
                    dArr3[i23] = motionPathsArr[i22].time;
                    motionPathsArr[i22].getCustomData(str7, dArr4[i23], 0);
                    i23++;
                }
                i22++;
                i9 = 2;
                c5 = 0;
            }
            i21++;
            this.mSpline[i21] = CurveFit.get(this.mCurveFitType, Arrays.copyOf(dArr3, i23), (double[][]) Arrays.copyOf(dArr4, i23));
            i9 = 2;
            c5 = 0;
        }
        this.mSpline[0] = CurveFit.get(this.mCurveFitType, dArr2, dArr);
        if (motionPathsArr[0].mPathMotionArc != Key.UNSET) {
            int[] iArr4 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) double.class, size, 2);
            for (int i24 = 0; i24 < size; i24++) {
                iArr4[i24] = motionPathsArr[i24].mPathMotionArc;
                dArr5[i24] = motionPathsArr[i24].time;
                dArr6[i24][0] = motionPathsArr[i24].f161x;
                dArr6[i24][1] = motionPathsArr[i24].f162y;
            }
            this.mArcSpline = CurveFit.getArc(iArr4, dArr5, dArr6);
        }
        float f6 = Float.NaN;
        this.mCycleMap = new HashMap<>();
        if (this.mKeyList != null) {
            Iterator<String> it9 = hashSet3.iterator();
            while (it9.hasNext()) {
                String next8 = it9.next();
                ViewOscillator makeSpline3 = ViewOscillator.makeSpline(next8);
                if (makeSpline3 != null) {
                    if (makeSpline3.variesByPath() && Float.isNaN(f6)) {
                        f6 = getPreCycleDistance();
                    }
                    makeSpline3.setType(next8);
                    this.mCycleMap.put(next8, makeSpline3);
                }
            }
            Iterator<Key> it10 = this.mKeyList.iterator();
            while (it10.hasNext()) {
                Key next9 = it10.next();
                if (next9 instanceof KeyCycle) {
                    ((KeyCycle) next9).addCycleValues(this.mCycleMap);
                }
            }
            Iterator<ViewOscillator> it11 = this.mCycleMap.values().iterator();
            while (it11.hasNext()) {
                it11.next().setup(f6);
            }
        }
    }

    public void setupRelative(MotionController motionController) {
        this.mStartMotionPath.setupRelative(motionController, motionController.mStartMotionPath);
        this.mEndMotionPath.setupRelative(motionController, motionController.mEndMotionPath);
    }

    public String toString() {
        StringBuilder g5 = d.g(" start: x: ");
        g5.append(this.mStartMotionPath.f161x);
        g5.append(" y: ");
        g5.append(this.mStartMotionPath.f162y);
        g5.append(" end: x: ");
        g5.append(this.mEndMotionPath.f161x);
        g5.append(" y: ");
        g5.append(this.mEndMotionPath.f162y);
        return g5.toString();
    }
}
