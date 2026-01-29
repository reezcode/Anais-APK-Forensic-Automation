package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Objects;

/* loaded from: classes20.dex */
class MotionConstrainedPoint implements Comparable<MotionConstrainedPoint> {
    public static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    public static final int PERPENDICULAR = 1;
    public static final String TAG = "MotionPaths";
    public static String[] names = {"position", "x", "y", "width", "height", "pathRotate"};
    private float height;
    private Easing mKeyFrameEasing;
    private float position;
    public int visibility;
    private float width;

    /* renamed from: x, reason: collision with root package name */
    private float f159x;

    /* renamed from: y, reason: collision with root package name */
    private float f160y;
    private float alpha = 1.0f;
    public int mVisibilityMode = 0;
    private boolean applyElevation = false;
    private float elevation = 0.0f;
    private float rotation = 0.0f;
    private float rotationX = 0.0f;
    public float rotationY = 0.0f;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float mPivotX = Float.NaN;
    private float mPivotY = Float.NaN;
    private float translationX = 0.0f;
    private float translationY = 0.0f;
    private float translationZ = 0.0f;
    private int mDrawPath = 0;
    private float mPathRotate = Float.NaN;
    private float mProgress = Float.NaN;
    private int mAnimateRelativeTo = -1;
    public LinkedHashMap<String, ConstraintAttribute> attributes = new LinkedHashMap<>();
    public int mMode = 0;
    public double[] mTempValue = new double[18];
    public double[] mTempDelta = new double[18];

    private boolean diff(float f5, float f6) {
        return (Float.isNaN(f5) || Float.isNaN(f6)) ? Float.isNaN(f5) != Float.isNaN(f6) : Math.abs(f5 - f6) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void addValues(HashMap<String, ViewSpline> hashMap, int i5) {
        String str;
        for (String str2 : hashMap.keySet()) {
            ViewSpline viewSpline = hashMap.get(str2);
            Objects.requireNonNull(str2);
            char c5 = 65535;
            switch (str2.hashCode()) {
                case -1249320806:
                    if (str2.equals("rotationX")) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str2.equals("rotationY")) {
                        c5 = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str2.equals("translationX")) {
                        c5 = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str2.equals("translationY")) {
                        c5 = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str2.equals("translationZ")) {
                        c5 = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str2.equals("progress")) {
                        c5 = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (str2.equals("scaleX")) {
                        c5 = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str2.equals("scaleY")) {
                        c5 = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (str2.equals(Key.PIVOT_X)) {
                        c5 = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str2.equals(Key.PIVOT_Y)) {
                        c5 = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str2.equals(Key.ROTATION)) {
                        c5 = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str2.equals("elevation")) {
                        c5 = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str2.equals("transitionPathRotate")) {
                        c5 = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str2.equals("alpha")) {
                        c5 = '\r';
                        break;
                    }
                    break;
            }
            float f5 = 1.0f;
            float f6 = 0.0f;
            switch (c5) {
                case 0:
                    if (!Float.isNaN(this.rotationX)) {
                        f6 = this.rotationX;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case 1:
                    if (!Float.isNaN(this.rotationY)) {
                        f6 = this.rotationY;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case 2:
                    if (!Float.isNaN(this.translationX)) {
                        f6 = this.translationX;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case 3:
                    if (!Float.isNaN(this.translationY)) {
                        f6 = this.translationY;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case 4:
                    if (!Float.isNaN(this.translationZ)) {
                        f6 = this.translationZ;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case 5:
                    if (!Float.isNaN(this.mProgress)) {
                        f6 = this.mProgress;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case 6:
                    if (!Float.isNaN(this.scaleX)) {
                        f5 = this.scaleX;
                    }
                    viewSpline.setPoint(i5, f5);
                    break;
                case 7:
                    if (!Float.isNaN(this.scaleY)) {
                        f5 = this.scaleY;
                    }
                    viewSpline.setPoint(i5, f5);
                    break;
                case '\b':
                    if (!Float.isNaN(this.mPivotX)) {
                        f6 = this.mPivotX;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case '\t':
                    if (!Float.isNaN(this.mPivotY)) {
                        f6 = this.mPivotY;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case '\n':
                    if (!Float.isNaN(this.rotation)) {
                        f6 = this.rotation;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case 11:
                    if (!Float.isNaN(this.elevation)) {
                        f6 = this.elevation;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case '\f':
                    if (!Float.isNaN(this.mPathRotate)) {
                        f6 = this.mPathRotate;
                    }
                    viewSpline.setPoint(i5, f6);
                    break;
                case '\r':
                    if (!Float.isNaN(this.alpha)) {
                        f5 = this.alpha;
                    }
                    viewSpline.setPoint(i5, f5);
                    break;
                default:
                    if (str2.startsWith("CUSTOM")) {
                        String str3 = str2.split(",")[1];
                        if (!this.attributes.containsKey(str3)) {
                            break;
                        } else {
                            ConstraintAttribute constraintAttribute = this.attributes.get(str3);
                            if (viewSpline instanceof ViewSpline.CustomSet) {
                                ((ViewSpline.CustomSet) viewSpline).setPoint(i5, constraintAttribute);
                                break;
                            } else {
                                str = str2 + " ViewSpline not a CustomSet frame = " + i5 + ", value" + constraintAttribute.getValueToInterpolate() + viewSpline;
                            }
                        }
                    } else {
                        str = "UNKNOWN spline " + str2;
                    }
                    Log.e("MotionPaths", str);
                    break;
            }
        }
    }

    public void applyParameters(View view) {
        this.visibility = view.getVisibility();
        this.alpha = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.applyElevation = false;
        this.elevation = view.getElevation();
        this.rotation = view.getRotation();
        this.rotationX = view.getRotationX();
        this.rotationY = view.getRotationY();
        this.scaleX = view.getScaleX();
        this.scaleY = view.getScaleY();
        this.mPivotX = view.getPivotX();
        this.mPivotY = view.getPivotY();
        this.translationX = view.getTranslationX();
        this.translationY = view.getTranslationY();
        this.translationZ = view.getTranslationZ();
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        ConstraintSet.PropertySet propertySet = constraint.propertySet;
        int i5 = propertySet.mVisibilityMode;
        this.mVisibilityMode = i5;
        int i6 = propertySet.visibility;
        this.visibility = i6;
        this.alpha = (i6 == 0 || i5 != 0) ? propertySet.alpha : 0.0f;
        ConstraintSet.Transform transform = constraint.transform;
        this.applyElevation = transform.applyElevation;
        this.elevation = transform.elevation;
        this.rotation = transform.rotation;
        this.rotationX = transform.rotationX;
        this.rotationY = transform.rotationY;
        this.scaleX = transform.scaleX;
        this.scaleY = transform.scaleY;
        this.mPivotX = transform.transformPivotX;
        this.mPivotY = transform.transformPivotY;
        this.translationX = transform.translationX;
        this.translationY = transform.translationY;
        this.translationZ = transform.translationZ;
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mProgress = constraint.propertySet.mProgress;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute.isContinuous()) {
                this.attributes.put(str, constraintAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionConstrainedPoint motionConstrainedPoint) {
        return Float.compare(this.position, motionConstrainedPoint.position);
    }

    public void different(MotionConstrainedPoint motionConstrainedPoint, HashSet<String> hashSet) {
        if (diff(this.alpha, motionConstrainedPoint.alpha)) {
            hashSet.add("alpha");
        }
        if (diff(this.elevation, motionConstrainedPoint.elevation)) {
            hashSet.add("elevation");
        }
        int i5 = this.visibility;
        int i6 = motionConstrainedPoint.visibility;
        if (i5 != i6 && this.mVisibilityMode == 0 && (i5 == 0 || i6 == 0)) {
            hashSet.add("alpha");
        }
        if (diff(this.rotation, motionConstrainedPoint.rotation)) {
            hashSet.add(Key.ROTATION);
        }
        if (!Float.isNaN(this.mPathRotate) || !Float.isNaN(motionConstrainedPoint.mPathRotate)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.mProgress) || !Float.isNaN(motionConstrainedPoint.mProgress)) {
            hashSet.add("progress");
        }
        if (diff(this.rotationX, motionConstrainedPoint.rotationX)) {
            hashSet.add("rotationX");
        }
        if (diff(this.rotationY, motionConstrainedPoint.rotationY)) {
            hashSet.add("rotationY");
        }
        if (diff(this.mPivotX, motionConstrainedPoint.mPivotX)) {
            hashSet.add(Key.PIVOT_X);
        }
        if (diff(this.mPivotY, motionConstrainedPoint.mPivotY)) {
            hashSet.add(Key.PIVOT_Y);
        }
        if (diff(this.scaleX, motionConstrainedPoint.scaleX)) {
            hashSet.add("scaleX");
        }
        if (diff(this.scaleY, motionConstrainedPoint.scaleY)) {
            hashSet.add("scaleY");
        }
        if (diff(this.translationX, motionConstrainedPoint.translationX)) {
            hashSet.add("translationX");
        }
        if (diff(this.translationY, motionConstrainedPoint.translationY)) {
            hashSet.add("translationY");
        }
        if (diff(this.translationZ, motionConstrainedPoint.translationZ)) {
            hashSet.add("translationZ");
        }
    }

    public void different(MotionConstrainedPoint motionConstrainedPoint, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | diff(this.position, motionConstrainedPoint.position);
        zArr[1] = zArr[1] | diff(this.f159x, motionConstrainedPoint.f159x);
        zArr[2] = zArr[2] | diff(this.f160y, motionConstrainedPoint.f160y);
        zArr[3] = zArr[3] | diff(this.width, motionConstrainedPoint.width);
        zArr[4] = diff(this.height, motionConstrainedPoint.height) | zArr[4];
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.f159x, this.f160y, this.width, this.height, this.alpha, this.elevation, this.rotation, this.rotationX, this.rotationY, this.scaleX, this.scaleY, this.mPivotX, this.mPivotY, this.translationX, this.translationY, this.translationZ, this.mPathRotate};
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            if (iArr[i6] < 18) {
                dArr[i5] = fArr[iArr[i6]];
                i5++;
            }
        }
    }

    public int getCustomData(String str, double[] dArr, int i5) {
        ConstraintAttribute constraintAttribute = this.attributes.get(str);
        if (constraintAttribute.numberOfInterpolatedValues() == 1) {
            dArr[i5] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = constraintAttribute.numberOfInterpolatedValues();
        constraintAttribute.getValuesToInterpolate(new float[numberOfInterpolatedValues]);
        int i6 = 0;
        while (i6 < numberOfInterpolatedValues) {
            dArr[i5] = r1[i6];
            i6++;
            i5++;
        }
        return numberOfInterpolatedValues;
    }

    public int getCustomDataCount(String str) {
        return this.attributes.get(str).numberOfInterpolatedValues();
    }

    public boolean hasCustomData(String str) {
        return this.attributes.containsKey(str);
    }

    public void setBounds(float f5, float f6, float f7, float f8) {
        this.f159x = f5;
        this.f160y = f6;
        this.width = f7;
        this.height = f8;
    }

    public void setState(Rect rect, View view, int i5, float f5) {
        float f6;
        setBounds(rect.left, rect.top, rect.width(), rect.height());
        applyParameters(view);
        this.mPivotX = Float.NaN;
        this.mPivotY = Float.NaN;
        if (i5 == 1) {
            f6 = f5 - 90.0f;
        } else if (i5 != 2) {
            return;
        } else {
            f6 = f5 + 90.0f;
        }
        this.rotation = f6;
    }

    public void setState(Rect rect, ConstraintSet constraintSet, int i5, int i6) {
        float f5;
        setBounds(rect.left, rect.top, rect.width(), rect.height());
        applyParameters(constraintSet.getParameters(i6));
        float f6 = 90.0f;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        return;
                    }
                }
            }
            f5 = this.rotation + 90.0f;
            this.rotation = f5;
            if (f5 > 180.0f) {
                f6 = 360.0f;
                this.rotation = f5 - f6;
            }
            return;
        }
        f5 = this.rotation;
        this.rotation = f5 - f6;
    }

    public void setState(View view) {
        setBounds(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        applyParameters(view);
    }
}
