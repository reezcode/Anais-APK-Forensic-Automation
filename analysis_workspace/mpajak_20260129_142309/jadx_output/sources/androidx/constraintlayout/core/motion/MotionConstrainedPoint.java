package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.Utils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Objects;

/* loaded from: classes14.dex */
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
    private float f132x;

    /* renamed from: y, reason: collision with root package name */
    private float f133y;
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
    public LinkedHashMap<String, CustomVariable> mCustomVariable = new LinkedHashMap<>();
    public int mMode = 0;
    public double[] mTempValue = new double[18];
    public double[] mTempDelta = new double[18];

    private boolean diff(float f5, float f6) {
        return (Float.isNaN(f5) || Float.isNaN(f6)) ? Float.isNaN(f5) != Float.isNaN(f6) : Math.abs(f5 - f6) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void addValues(HashMap<String, SplineSet> hashMap, int i5) {
        String str;
        for (String str2 : hashMap.keySet()) {
            SplineSet splineSet = hashMap.get(str2);
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
                case -1249320804:
                    if (str2.equals("rotationZ")) {
                        c5 = 2;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str2.equals("translationX")) {
                        c5 = 3;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str2.equals("translationY")) {
                        c5 = 4;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str2.equals("translationZ")) {
                        c5 = 5;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str2.equals("progress")) {
                        c5 = 6;
                        break;
                    }
                    break;
                case -987906986:
                    if (str2.equals("pivotX")) {
                        c5 = 7;
                        break;
                    }
                    break;
                case -987906985:
                    if (str2.equals("pivotY")) {
                        c5 = '\b';
                        break;
                    }
                    break;
                case -908189618:
                    if (str2.equals("scaleX")) {
                        c5 = '\t';
                        break;
                    }
                    break;
                case -908189617:
                    if (str2.equals("scaleY")) {
                        c5 = '\n';
                        break;
                    }
                    break;
                case 92909918:
                    if (str2.equals("alpha")) {
                        c5 = 11;
                        break;
                    }
                    break;
                case 803192288:
                    if (str2.equals("pathRotate")) {
                        c5 = '\f';
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
                    splineSet.setPoint(i5, f6);
                    break;
                case 1:
                    if (!Float.isNaN(this.rotationY)) {
                        f6 = this.rotationY;
                    }
                    splineSet.setPoint(i5, f6);
                    break;
                case 2:
                    if (!Float.isNaN(this.rotation)) {
                        f6 = this.rotation;
                    }
                    splineSet.setPoint(i5, f6);
                    break;
                case 3:
                    if (!Float.isNaN(this.translationX)) {
                        f6 = this.translationX;
                    }
                    splineSet.setPoint(i5, f6);
                    break;
                case 4:
                    if (!Float.isNaN(this.translationY)) {
                        f6 = this.translationY;
                    }
                    splineSet.setPoint(i5, f6);
                    break;
                case 5:
                    if (!Float.isNaN(this.translationZ)) {
                        f6 = this.translationZ;
                    }
                    splineSet.setPoint(i5, f6);
                    break;
                case 6:
                    if (!Float.isNaN(this.mProgress)) {
                        f6 = this.mProgress;
                    }
                    splineSet.setPoint(i5, f6);
                    break;
                case 7:
                    if (!Float.isNaN(this.mPivotX)) {
                        f6 = this.mPivotX;
                    }
                    splineSet.setPoint(i5, f6);
                    break;
                case '\b':
                    if (!Float.isNaN(this.mPivotY)) {
                        f6 = this.mPivotY;
                    }
                    splineSet.setPoint(i5, f6);
                    break;
                case '\t':
                    if (!Float.isNaN(this.scaleX)) {
                        f5 = this.scaleX;
                    }
                    splineSet.setPoint(i5, f5);
                    break;
                case '\n':
                    if (!Float.isNaN(this.scaleY)) {
                        f5 = this.scaleY;
                    }
                    splineSet.setPoint(i5, f5);
                    break;
                case 11:
                    if (!Float.isNaN(this.alpha)) {
                        f5 = this.alpha;
                    }
                    splineSet.setPoint(i5, f5);
                    break;
                case '\f':
                    if (!Float.isNaN(this.mPathRotate)) {
                        f6 = this.mPathRotate;
                    }
                    splineSet.setPoint(i5, f6);
                    break;
                default:
                    if (str2.startsWith("CUSTOM")) {
                        String str3 = str2.split(",")[1];
                        if (!this.mCustomVariable.containsKey(str3)) {
                            break;
                        } else {
                            CustomVariable customVariable = this.mCustomVariable.get(str3);
                            if (splineSet instanceof SplineSet.CustomSpline) {
                                ((SplineSet.CustomSpline) splineSet).setPoint(i5, customVariable);
                                break;
                            } else {
                                str = str2 + " ViewSpline not a CustomSet frame = " + i5 + ", value" + customVariable.getValueToInterpolate() + splineSet;
                            }
                        }
                    } else {
                        str = "UNKNOWN spline " + str2;
                    }
                    Utils.loge("MotionPaths", str);
                    break;
            }
        }
    }

    public void applyParameters(MotionWidget motionWidget) {
        this.visibility = motionWidget.getVisibility();
        this.alpha = motionWidget.getVisibility() != 4 ? 0.0f : motionWidget.getAlpha();
        this.applyElevation = false;
        this.rotation = motionWidget.getRotationZ();
        this.rotationX = motionWidget.getRotationX();
        this.rotationY = motionWidget.getRotationY();
        this.scaleX = motionWidget.getScaleX();
        this.scaleY = motionWidget.getScaleY();
        this.mPivotX = motionWidget.getPivotX();
        this.mPivotY = motionWidget.getPivotY();
        this.translationX = motionWidget.getTranslationX();
        this.translationY = motionWidget.getTranslationY();
        this.translationZ = motionWidget.getTranslationZ();
        for (String str : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.mCustomVariable.put(str, customAttribute);
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
            hashSet.add("translationZ");
        }
        int i5 = this.visibility;
        int i6 = motionConstrainedPoint.visibility;
        if (i5 != i6 && this.mVisibilityMode == 0 && (i5 == 4 || i6 == 4)) {
            hashSet.add("alpha");
        }
        if (diff(this.rotation, motionConstrainedPoint.rotation)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.mPathRotate) || !Float.isNaN(motionConstrainedPoint.mPathRotate)) {
            hashSet.add("pathRotate");
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
            hashSet.add("pivotX");
        }
        if (diff(this.mPivotY, motionConstrainedPoint.mPivotY)) {
            hashSet.add("pivotY");
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
        if (diff(this.elevation, motionConstrainedPoint.elevation)) {
            hashSet.add("elevation");
        }
    }

    public void different(MotionConstrainedPoint motionConstrainedPoint, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | diff(this.position, motionConstrainedPoint.position);
        zArr[1] = zArr[1] | diff(this.f132x, motionConstrainedPoint.f132x);
        zArr[2] = zArr[2] | diff(this.f133y, motionConstrainedPoint.f133y);
        zArr[3] = zArr[3] | diff(this.width, motionConstrainedPoint.width);
        zArr[4] = diff(this.height, motionConstrainedPoint.height) | zArr[4];
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.f132x, this.f133y, this.width, this.height, this.alpha, this.elevation, this.rotation, this.rotationX, this.rotationY, this.scaleX, this.scaleY, this.mPivotX, this.mPivotY, this.translationX, this.translationY, this.translationZ, this.mPathRotate};
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            if (iArr[i6] < 18) {
                dArr[i5] = fArr[iArr[i6]];
                i5++;
            }
        }
    }

    public int getCustomData(String str, double[] dArr, int i5) {
        CustomVariable customVariable = this.mCustomVariable.get(str);
        if (customVariable.numberOfInterpolatedValues() == 1) {
            dArr[i5] = customVariable.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
        customVariable.getValuesToInterpolate(new float[numberOfInterpolatedValues]);
        int i6 = 0;
        while (i6 < numberOfInterpolatedValues) {
            dArr[i5] = r1[i6];
            i6++;
            i5++;
        }
        return numberOfInterpolatedValues;
    }

    public int getCustomDataCount(String str) {
        return this.mCustomVariable.get(str).numberOfInterpolatedValues();
    }

    public boolean hasCustomData(String str) {
        return this.mCustomVariable.containsKey(str);
    }

    public void setBounds(float f5, float f6, float f7, float f8) {
        this.f132x = f5;
        this.f133y = f6;
        this.width = f7;
        this.height = f8;
    }

    public void setState(MotionWidget motionWidget) {
        setBounds(motionWidget.getX(), motionWidget.getY(), motionWidget.getWidth(), motionWidget.getHeight());
        applyParameters(motionWidget);
    }

    public void setState(Rect rect, MotionWidget motionWidget, int i5, float f5) {
        float f6;
        setBounds(rect.left, rect.top, rect.width(), rect.height());
        applyParameters(motionWidget);
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
}
