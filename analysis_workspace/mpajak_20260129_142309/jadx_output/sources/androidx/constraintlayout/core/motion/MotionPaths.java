package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes14.dex */
public class MotionPaths implements Comparable<MotionPaths> {
    public static final int CARTESIAN = 0;
    public static final boolean DEBUG = false;
    public static final int OFF_HEIGHT = 4;
    public static final int OFF_PATH_ROTATE = 5;
    public static final int OFF_POSITION = 0;
    public static final int OFF_WIDTH = 3;
    public static final int OFF_X = 1;
    public static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    public static final int PERPENDICULAR = 1;
    public static final int SCREEN = 2;
    public static final String TAG = "MotionPaths";
    public static String[] names = {"position", "x", "y", "width", "height", "pathRotate"};
    public HashMap<String, CustomVariable> customAttributes;
    public float height;
    public int mAnimateCircleAngleTo;
    public int mAnimateRelativeTo;
    public int mDrawPath;
    public Easing mKeyFrameEasing;
    public int mMode;
    public int mPathMotionArc;
    public float mPathRotate;
    public float mProgress;
    public float mRelativeAngle;
    public Motion mRelativeToController;
    public double[] mTempDelta;
    public double[] mTempValue;
    public float position;
    public float time;
    public float width;

    /* renamed from: x, reason: collision with root package name */
    public float f134x;

    /* renamed from: y, reason: collision with root package name */
    public float f135y;

    public MotionPaths() {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = -1;
        this.mAnimateRelativeTo = -1;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.customAttributes = new HashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    public MotionPaths(int i5, int i6, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = -1;
        this.mAnimateRelativeTo = -1;
        this.mRelativeAngle = Float.NaN;
        this.mRelativeToController = null;
        this.customAttributes = new HashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        if (motionPaths.mAnimateRelativeTo != -1) {
            initPolar(i5, i6, motionKeyPosition, motionPaths, motionPaths2);
            return;
        }
        int i7 = motionKeyPosition.mPositionType;
        if (i7 == 1) {
            initPath(motionKeyPosition, motionPaths, motionPaths2);
        } else if (i7 != 2) {
            initCartesian(motionKeyPosition, motionPaths, motionPaths2);
        } else {
            initScreen(i5, i6, motionKeyPosition, motionPaths, motionPaths2);
        }
    }

    private boolean diff(float f5, float f6) {
        return (Float.isNaN(f5) || Float.isNaN(f6)) ? Float.isNaN(f5) != Float.isNaN(f6) : Math.abs(f5 - f6) > 1.0E-6f;
    }

    private static final float xRotate(float f5, float f6, float f7, float f8, float f9, float f10) {
        return (((f9 - f7) * f6) - ((f10 - f8) * f5)) + f7;
    }

    private static final float yRotate(float f5, float f6, float f7, float f8, float f9, float f10) {
        return ((f10 - f8) * f6) + ((f9 - f7) * f5) + f8;
    }

    public void applyParameters(MotionWidget motionWidget) {
        this.mKeyFrameEasing = Easing.getInterpolator(motionWidget.motion.mTransitionEasing);
        MotionWidget.Motion motion = motionWidget.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mAnimateCircleAngleTo = motion.mAnimateCircleAngleTo;
        this.mProgress = motionWidget.propertySet.mProgress;
        this.mRelativeAngle = 0.0f;
        for (String str : motionWidget.getCustomAttributeNames()) {
            CustomVariable customAttribute = motionWidget.getCustomAttribute(str);
            if (customAttribute != null && customAttribute.isContinuous()) {
                this.customAttributes.put(str, customAttribute);
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(MotionPaths motionPaths) {
        return Float.compare(this.position, motionPaths.position);
    }

    public void configureRelativeTo(Motion motion) {
        motion.getPos(this.mProgress);
    }

    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z4) {
        boolean diff = diff(this.f134x, motionPaths.f134x);
        boolean diff2 = diff(this.f135y, motionPaths.f135y);
        zArr[0] = zArr[0] | diff(this.position, motionPaths.position);
        boolean z5 = diff | diff2 | z4;
        zArr[1] = zArr[1] | z5;
        zArr[2] = z5 | zArr[2];
        zArr[3] = zArr[3] | diff(this.width, motionPaths.width);
        zArr[4] = diff(this.height, motionPaths.height) | zArr[4];
    }

    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.f134x, this.f135y, this.width, this.height, this.mPathRotate};
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            if (iArr[i6] < 6) {
                dArr[i5] = fArr[iArr[i6]];
                i5++;
            }
        }
    }

    public void getBounds(int[] iArr, double[] dArr, float[] fArr, int i5) {
        float f5 = this.width;
        float f6 = this.height;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            float f7 = (float) dArr[i6];
            int i7 = iArr[i6];
            if (i7 == 3) {
                f5 = f7;
            } else if (i7 == 4) {
                f6 = f7;
            }
        }
        fArr[i5] = f5;
        fArr[i5 + 1] = f6;
    }

    public void getCenter(double d5, int[] iArr, double[] dArr, float[] fArr, int i5) {
        float f5 = this.f134x;
        float f6 = this.f135y;
        float f7 = this.width;
        float f8 = this.height;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            float f9 = (float) dArr[i6];
            int i7 = iArr[i6];
            if (i7 == 1) {
                f5 = f9;
            } else if (i7 == 2) {
                f6 = f9;
            } else if (i7 == 3) {
                f7 = f9;
            } else if (i7 == 4) {
                f8 = f9;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d5, fArr2, new float[2]);
            float f10 = fArr2[0];
            float f11 = fArr2[1];
            double d6 = f10;
            double d7 = f5;
            double d8 = f6;
            f5 = (float) (((Math.sin(d8) * d7) + d6) - (f7 / 2.0f));
            f6 = (float) ((f11 - (Math.cos(d8) * d7)) - (f8 / 2.0f));
        }
        fArr[i5] = (f7 / 2.0f) + f5 + 0.0f;
        fArr[i5 + 1] = (f8 / 2.0f) + f6 + 0.0f;
    }

    public void getCenter(double d5, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f5 = this.f134x;
        float f6 = this.f135y;
        float f7 = this.width;
        float f8 = this.height;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f13 = (float) dArr[i5];
            float f14 = (float) dArr2[i5];
            int i6 = iArr[i5];
            if (i6 == 1) {
                f5 = f13;
                f9 = f14;
            } else if (i6 == 2) {
                f6 = f13;
                f11 = f14;
            } else if (i6 == 3) {
                f7 = f13;
                f10 = f14;
            } else if (i6 == 4) {
                f8 = f13;
                f12 = f14;
            }
        }
        float f15 = 2.0f;
        float f16 = (f10 / 2.0f) + f9;
        float f17 = (f12 / 2.0f) + f11;
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            motion.getCenter(d5, fArr3, fArr4);
            float f18 = fArr3[0];
            float f19 = fArr3[1];
            float f20 = fArr4[0];
            float f21 = fArr4[1];
            double d6 = f5;
            double d7 = f6;
            float sin = (float) (((Math.sin(d7) * d6) + f18) - (f7 / 2.0f));
            f6 = (float) ((f19 - (Math.cos(d7) * d6)) - (f8 / 2.0f));
            double d8 = f9;
            double d9 = f11;
            float cos = (float) ((Math.cos(d7) * d9) + (Math.sin(d7) * d8) + f20);
            f17 = (float) ((Math.sin(d7) * d9) + (f21 - (Math.cos(d7) * d8)));
            f16 = cos;
            f5 = sin;
            f15 = 2.0f;
        }
        fArr[0] = (f7 / f15) + f5 + 0.0f;
        fArr[1] = (f8 / f15) + f6 + 0.0f;
        fArr2[0] = f16;
        fArr2[1] = f17;
    }

    public void getCenterVelocity(double d5, int[] iArr, double[] dArr, float[] fArr, int i5) {
        float f5 = this.f134x;
        float f6 = this.f135y;
        float f7 = this.width;
        float f8 = this.height;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            float f9 = (float) dArr[i6];
            int i7 = iArr[i6];
            if (i7 == 1) {
                f5 = f9;
            } else if (i7 == 2) {
                f6 = f9;
            } else if (i7 == 3) {
                f7 = f9;
            } else if (i7 == 4) {
                f8 = f9;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr2 = new float[2];
            motion.getCenter(d5, fArr2, new float[2]);
            float f10 = fArr2[0];
            float f11 = fArr2[1];
            double d6 = f10;
            double d7 = f5;
            double d8 = f6;
            f5 = (float) (((Math.sin(d8) * d7) + d6) - (f7 / 2.0f));
            f6 = (float) ((f11 - (Math.cos(d8) * d7)) - (f8 / 2.0f));
        }
        fArr[i5] = (f7 / 2.0f) + f5 + 0.0f;
        fArr[i5 + 1] = (f8 / 2.0f) + f6 + 0.0f;
    }

    public int getCustomData(String str, double[] dArr, int i5) {
        CustomVariable customVariable = this.customAttributes.get(str);
        int i6 = 0;
        if (customVariable == null) {
            return 0;
        }
        if (customVariable.numberOfInterpolatedValues() == 1) {
            dArr[i5] = customVariable.getValueToInterpolate();
            return 1;
        }
        int numberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
        customVariable.getValuesToInterpolate(new float[numberOfInterpolatedValues]);
        while (i6 < numberOfInterpolatedValues) {
            dArr[i5] = r2[i6];
            i6++;
            i5++;
        }
        return numberOfInterpolatedValues;
    }

    public int getCustomDataCount(String str) {
        CustomVariable customVariable = this.customAttributes.get(str);
        if (customVariable == null) {
            return 0;
        }
        return customVariable.numberOfInterpolatedValues();
    }

    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i5) {
        float f5 = this.f134x;
        float f6 = this.f135y;
        float f7 = this.width;
        float f8 = this.height;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            float f9 = (float) dArr[i6];
            int i7 = iArr[i6];
            if (i7 == 1) {
                f5 = f9;
            } else if (i7 == 2) {
                f6 = f9;
            } else if (i7 == 3) {
                f7 = f9;
            } else if (i7 == 4) {
                f8 = f9;
            }
        }
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float centerX = motion.getCenterX();
            float centerY = this.mRelativeToController.getCenterY();
            double d5 = f5;
            double d6 = f6;
            float sin = (float) (((Math.sin(d6) * d5) + centerX) - (f7 / 2.0f));
            f6 = (float) ((centerY - (Math.cos(d6) * d5)) - (f8 / 2.0f));
            f5 = sin;
        }
        float f10 = f7 + f5;
        float f11 = f8 + f6;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i8 = i5 + 1;
        fArr[i5] = f5 + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f6 + 0.0f;
        int i10 = i9 + 1;
        fArr[i9] = f10 + 0.0f;
        int i11 = i10 + 1;
        fArr[i10] = f6 + 0.0f;
        int i12 = i11 + 1;
        fArr[i11] = f10 + 0.0f;
        int i13 = i12 + 1;
        fArr[i12] = f11 + 0.0f;
        fArr[i13] = f5 + 0.0f;
        fArr[i13 + 1] = f11 + 0.0f;
    }

    public boolean hasCustomData(String str) {
        return this.customAttributes.containsKey(str);
    }

    public void initCartesian(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f5 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f5;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f6 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f5 : motionKeyPosition.mPercentWidth;
        float f7 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f5 : motionKeyPosition.mPercentHeight;
        float f8 = motionPaths2.width;
        float f9 = motionPaths.width;
        float f10 = f8 - f9;
        float f11 = motionPaths2.height;
        float f12 = motionPaths.height;
        float f13 = f11 - f12;
        this.position = this.time;
        float f14 = motionPaths.f134x;
        float f15 = motionPaths.f135y;
        float f16 = ((f8 / 2.0f) + motionPaths2.f134x) - ((f9 / 2.0f) + f14);
        float f17 = ((f11 / 2.0f) + motionPaths2.f135y) - ((f12 / 2.0f) + f15);
        float f18 = (f10 * f6) / 2.0f;
        this.f134x = (int) (((f16 * f5) + f14) - f18);
        float f19 = (f17 * f5) + f15;
        float f20 = (f13 * f7) / 2.0f;
        this.f135y = (int) (f19 - f20);
        this.width = (int) (f9 + r9);
        this.height = (int) (f12 + r12);
        float f21 = Float.isNaN(motionKeyPosition.mPercentX) ? f5 : motionKeyPosition.mPercentX;
        float f22 = Float.isNaN(motionKeyPosition.mAltPercentY) ? 0.0f : motionKeyPosition.mAltPercentY;
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            f5 = motionKeyPosition.mPercentY;
        }
        float f23 = Float.isNaN(motionKeyPosition.mAltPercentX) ? 0.0f : motionKeyPosition.mAltPercentX;
        this.mMode = 0;
        this.f134x = (int) (((f23 * f17) + ((f21 * f16) + motionPaths.f134x)) - f18);
        this.f135y = (int) (((f17 * f5) + ((f16 * f22) + motionPaths.f135y)) - f20);
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void initPath(MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f5 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f5;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f6 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f5 : motionKeyPosition.mPercentWidth;
        float f7 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f5 : motionKeyPosition.mPercentHeight;
        float f8 = motionPaths2.width - motionPaths.width;
        float f9 = motionPaths2.height - motionPaths.height;
        this.position = this.time;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            f5 = motionKeyPosition.mPercentX;
        }
        float f10 = motionPaths.f134x;
        float f11 = motionPaths.width;
        float f12 = motionPaths.f135y;
        float f13 = motionPaths.height;
        float f14 = ((motionPaths2.width / 2.0f) + motionPaths2.f134x) - ((f11 / 2.0f) + f10);
        float f15 = ((motionPaths2.height / 2.0f) + motionPaths2.f135y) - ((f13 / 2.0f) + f12);
        float f16 = f14 * f5;
        float f17 = (f8 * f6) / 2.0f;
        this.f134x = (int) ((f10 + f16) - f17);
        float f18 = f5 * f15;
        float f19 = (f9 * f7) / 2.0f;
        this.f135y = (int) ((f12 + f18) - f19);
        this.width = (int) (f11 + r7);
        this.height = (int) (f13 + r8);
        float f20 = Float.isNaN(motionKeyPosition.mPercentY) ? 0.0f : motionKeyPosition.mPercentY;
        this.mMode = 1;
        float f21 = (int) ((motionPaths.f134x + f16) - f17);
        float f22 = (int) ((motionPaths.f135y + f18) - f19);
        this.f134x = f21 + ((-f15) * f20);
        this.f135y = f22 + (f14 * f20);
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (java.lang.Float.isNaN(r9.mPercentY) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b1, code lost:
    
        r7 = r9.mPercentY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
    
        if (java.lang.Float.isNaN(r9.mPercentY) != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initPolar(int r7, int r8, androidx.constraintlayout.core.motion.key.MotionKeyPosition r9, androidx.constraintlayout.core.motion.MotionPaths r10, androidx.constraintlayout.core.motion.MotionPaths r11) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.MotionPaths.initPolar(int, int, androidx.constraintlayout.core.motion.key.MotionKeyPosition, androidx.constraintlayout.core.motion.MotionPaths, androidx.constraintlayout.core.motion.MotionPaths):void");
    }

    public void initScreen(int i5, int i6, MotionKeyPosition motionKeyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f5 = motionKeyPosition.mFramePosition / 100.0f;
        this.time = f5;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        float f6 = Float.isNaN(motionKeyPosition.mPercentWidth) ? f5 : motionKeyPosition.mPercentWidth;
        float f7 = Float.isNaN(motionKeyPosition.mPercentHeight) ? f5 : motionKeyPosition.mPercentHeight;
        float f8 = motionPaths2.width;
        float f9 = f8 - motionPaths.width;
        float f10 = motionPaths2.height;
        float f11 = f10 - motionPaths.height;
        this.position = this.time;
        float f12 = motionPaths.f134x;
        float f13 = motionPaths.f135y;
        float f14 = (f8 / 2.0f) + motionPaths2.f134x;
        float f15 = (f10 / 2.0f) + motionPaths2.f135y;
        float f16 = f9 * f6;
        this.f134x = (int) ((((f14 - ((r8 / 2.0f) + f12)) * f5) + f12) - (f16 / 2.0f));
        float f17 = f11 * f7;
        this.f135y = (int) ((((f15 - ((r11 / 2.0f) + f13)) * f5) + f13) - (f17 / 2.0f));
        this.width = (int) (r8 + f16);
        this.height = (int) (r11 + f17);
        this.mMode = 2;
        if (!Float.isNaN(motionKeyPosition.mPercentX)) {
            this.f134x = (int) (motionKeyPosition.mPercentX * ((int) (i5 - this.width)));
        }
        if (!Float.isNaN(motionKeyPosition.mPercentY)) {
            this.f135y = (int) (motionKeyPosition.mPercentY * ((int) (i6 - this.height)));
        }
        this.mAnimateRelativeTo = this.mAnimateRelativeTo;
        this.mKeyFrameEasing = Easing.getInterpolator(motionKeyPosition.mTransitionEasing);
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
    }

    public void setBounds(float f5, float f6, float f7, float f8) {
        this.f134x = f5;
        this.f135y = f6;
        this.width = f7;
        this.height = f8;
    }

    public void setDpDt(float f5, float f6, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            float f11 = (float) dArr[i5];
            double d5 = dArr2[i5];
            int i6 = iArr[i5];
            if (i6 == 1) {
                f7 = f11;
            } else if (i6 == 2) {
                f9 = f11;
            } else if (i6 == 3) {
                f8 = f11;
            } else if (i6 == 4) {
                f10 = f11;
            }
        }
        float f12 = f7 - ((0.0f * f8) / 2.0f);
        float f13 = f9 - ((0.0f * f10) / 2.0f);
        fArr[0] = (((f8 * 1.0f) + f12) * f5) + ((1.0f - f5) * f12) + 0.0f;
        fArr[1] = (((f10 * 1.0f) + f13) * f6) + ((1.0f - f6) * f13) + 0.0f;
    }

    public void setView(float f5, MotionWidget motionWidget, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f6;
        float f7;
        float f8 = this.f134x;
        float f9 = this.f135y;
        float f10 = this.width;
        float f11 = this.height;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i5 = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i5];
            this.mTempDelta = new double[i5];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i6 = 0; i6 < iArr.length; i6++) {
            this.mTempValue[iArr[i6]] = dArr[i6];
            this.mTempDelta[iArr[i6]] = dArr2[i6];
        }
        float f12 = Float.NaN;
        int i7 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (true) {
            double[] dArr4 = this.mTempValue;
            if (i7 >= dArr4.length) {
                break;
            }
            if (Double.isNaN(dArr4[i7]) && (dArr3 == null || dArr3[i7] == 0.0d)) {
                f7 = f12;
            } else {
                double d5 = dArr3 != null ? dArr3[i7] : 0.0d;
                if (!Double.isNaN(this.mTempValue[i7])) {
                    d5 = this.mTempValue[i7] + d5;
                }
                f7 = f12;
                float f17 = (float) d5;
                float f18 = (float) this.mTempDelta[i7];
                if (i7 == 1) {
                    f12 = f7;
                    f13 = f18;
                    f8 = f17;
                } else if (i7 == 2) {
                    f12 = f7;
                    f14 = f18;
                    f9 = f17;
                } else if (i7 == 3) {
                    f12 = f7;
                    f15 = f18;
                    f10 = f17;
                } else if (i7 == 4) {
                    f12 = f7;
                    f16 = f18;
                    f11 = f17;
                } else if (i7 == 5) {
                    f12 = f17;
                }
                i7++;
            }
            f12 = f7;
            i7++;
        }
        float f19 = f12;
        Motion motion = this.mRelativeToController;
        if (motion != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            motion.getCenter(f5, fArr, fArr2);
            float f20 = fArr[0];
            float f21 = fArr[1];
            float f22 = fArr2[0];
            float f23 = fArr2[1];
            double d6 = f8;
            double d7 = f9;
            float sin = (float) (((Math.sin(d7) * d6) + f20) - (f10 / 2.0f));
            float cos = (float) ((f21 - (Math.cos(d7) * d6)) - (f11 / 2.0f));
            double d8 = f13;
            double d9 = f14;
            float cos2 = (float) ((Math.cos(d7) * d6 * d9) + (Math.sin(d7) * d8) + f22);
            f6 = f11;
            float sin2 = (float) ((Math.sin(d7) * d6 * d9) + (f23 - (Math.cos(d7) * d8)));
            if (dArr2.length >= 2) {
                dArr2[0] = cos2;
                dArr2[1] = sin2;
            }
            if (!Float.isNaN(f19)) {
                motionWidget.setRotationZ((float) (Math.toDegrees(Math.atan2(sin2, cos2)) + f19));
            }
            f8 = sin;
            f9 = cos;
        } else {
            f6 = f11;
            if (!Float.isNaN(f19)) {
                motionWidget.setRotationZ((float) (Math.toDegrees(Math.atan2((f16 / 2.0f) + f14, (f15 / 2.0f) + f13)) + f19 + 0.0f));
            }
        }
        float f24 = f8 + 0.5f;
        float f25 = f9 + 0.5f;
        motionWidget.layout((int) f24, (int) f25, (int) (f24 + f10), (int) (f25 + f6));
    }

    public void setupRelative(Motion motion, MotionPaths motionPaths) {
        double d5 = (((this.width / 2.0f) + this.f134x) - motionPaths.f134x) - (motionPaths.width / 2.0f);
        double d6 = (((this.height / 2.0f) + this.f135y) - motionPaths.f135y) - (motionPaths.height / 2.0f);
        this.mRelativeToController = motion;
        this.f134x = (float) Math.hypot(d6, d5);
        this.f135y = (float) (Float.isNaN(this.mRelativeAngle) ? Math.atan2(d6, d5) + 1.5707963267948966d : Math.toRadians(this.mRelativeAngle));
    }
}
