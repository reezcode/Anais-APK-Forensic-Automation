package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.f;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes23.dex */
public class MotionKeyPosition extends MotionKey {
    public static final int KEY_TYPE = 2;
    public static final String NAME = "KeyPosition";
    public static final float SELECTION_SLOPE = 20.0f;
    public static final int TYPE_CARTESIAN = 0;
    public static final int TYPE_PATH = 1;
    public static final int TYPE_SCREEN = 2;
    public float mAltPercentX;
    public float mAltPercentY;
    private float mCalculatedPositionX;
    private float mCalculatedPositionY;
    public int mCurveFit;
    public int mDrawPath;
    public int mPathMotionArc;
    public float mPercentHeight;
    public float mPercentWidth;
    public float mPercentX;
    public float mPercentY;
    public int mPositionType;
    public String mTransitionEasing;

    public MotionKeyPosition() {
        int i5 = MotionKey.UNSET;
        this.mCurveFit = i5;
        this.mTransitionEasing = null;
        this.mPathMotionArc = i5;
        this.mDrawPath = 0;
        this.mPercentWidth = Float.NaN;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = Float.NaN;
        this.mPercentY = Float.NaN;
        this.mAltPercentX = Float.NaN;
        this.mAltPercentY = Float.NaN;
        this.mPositionType = 0;
        this.mCalculatedPositionX = Float.NaN;
        this.mCalculatedPositionY = Float.NaN;
        this.mType = 2;
    }

    private void calcCartesianPosition(float f5, float f6, float f7, float f8) {
        float f9 = f7 - f5;
        float f10 = f8 - f6;
        float f11 = Float.isNaN(this.mPercentX) ? 0.0f : this.mPercentX;
        float f12 = Float.isNaN(this.mAltPercentY) ? 0.0f : this.mAltPercentY;
        float f13 = Float.isNaN(this.mPercentY) ? 0.0f : this.mPercentY;
        this.mCalculatedPositionX = (int) (((Float.isNaN(this.mAltPercentX) ? 0.0f : this.mAltPercentX) * f10) + (f11 * f9) + f5);
        this.mCalculatedPositionY = (int) ((f10 * f13) + (f9 * f12) + f6);
    }

    private void calcPathPosition(float f5, float f6, float f7, float f8) {
        float f9 = f7 - f5;
        float f10 = f8 - f6;
        float f11 = this.mPercentX;
        float f12 = (f9 * f11) + f5;
        float f13 = this.mPercentY;
        this.mCalculatedPositionX = ((-f10) * f13) + f12;
        this.mCalculatedPositionY = (f9 * f13) + (f10 * f11) + f6;
    }

    private void calcScreenPosition(int i5, int i6) {
        float f5 = this.mPercentX;
        float f6 = 0;
        this.mCalculatedPositionX = ((i5 - 0) * f5) + f6;
        this.mCalculatedPositionY = ((i6 - 0) * f5) + f6;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> hashMap) {
    }

    public void calcPosition(int i5, int i6, float f5, float f6, float f7, float f8) {
        int i7 = this.mPositionType;
        if (i7 == 1) {
            calcPathPosition(f5, f6, f7, f8);
        } else if (i7 != 2) {
            calcCartesianPosition(f5, f6, f7, f8);
        } else {
            calcScreenPosition(i5, i6);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public MotionKey mo3clone() {
        return new MotionKeyPosition().copy(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey copy(MotionKey motionKey) {
        super.copy(motionKey);
        MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
        this.mTransitionEasing = motionKeyPosition.mTransitionEasing;
        this.mPathMotionArc = motionKeyPosition.mPathMotionArc;
        this.mDrawPath = motionKeyPosition.mDrawPath;
        this.mPercentWidth = motionKeyPosition.mPercentWidth;
        this.mPercentHeight = Float.NaN;
        this.mPercentX = motionKeyPosition.mPercentX;
        this.mPercentY = motionKeyPosition.mPercentY;
        this.mAltPercentX = motionKeyPosition.mAltPercentX;
        this.mAltPercentY = motionKeyPosition.mAltPercentY;
        this.mCalculatedPositionX = motionKeyPosition.mCalculatedPositionX;
        this.mCalculatedPositionY = motionKeyPosition.mCalculatedPositionY;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return f.a(str);
    }

    public float getPositionX() {
        return this.mCalculatedPositionX;
    }

    public float getPositionY() {
        return this.mCalculatedPositionY;
    }

    public boolean intersects(int i5, int i6, FloatRect floatRect, FloatRect floatRect2, float f5, float f6) {
        calcPosition(i5, i6, floatRect.centerX(), floatRect.centerY(), floatRect2.centerX(), floatRect2.centerY());
        return Math.abs(f5 - this.mCalculatedPositionX) < 20.0f && Math.abs(f6 - this.mCalculatedPositionY) < 20.0f;
    }

    public void positionAttributes(MotionWidget motionWidget, FloatRect floatRect, FloatRect floatRect2, float f5, float f6, String[] strArr, float[] fArr) {
        int i5 = this.mPositionType;
        if (i5 == 1) {
            positionPathAttributes(floatRect, floatRect2, f5, f6, strArr, fArr);
        } else if (i5 != 2) {
            positionCartAttributes(floatRect, floatRect2, f5, f6, strArr, fArr);
        } else {
            positionScreenAttributes(motionWidget, floatRect, floatRect2, f5, f6, strArr, fArr);
        }
    }

    public void positionCartAttributes(FloatRect floatRect, FloatRect floatRect2, float f5, float f6, String[] strArr, float[] fArr) {
        float centerX = floatRect.centerX();
        float centerY = floatRect.centerY();
        float centerX2 = floatRect2.centerX() - centerX;
        float centerY2 = floatRect2.centerY() - centerY;
        if (strArr[0] == null) {
            strArr[0] = "percentX";
            fArr[0] = (f5 - centerX) / centerX2;
            strArr[1] = "percentY";
            fArr[1] = (f6 - centerY) / centerY2;
            return;
        }
        float f7 = (f5 - centerX) / centerX2;
        if ("percentX".equals(strArr[0])) {
            fArr[0] = f7;
            fArr[1] = (f6 - centerY) / centerY2;
        } else {
            fArr[1] = f7;
            fArr[0] = (f6 - centerY) / centerY2;
        }
    }

    public void positionPathAttributes(FloatRect floatRect, FloatRect floatRect2, float f5, float f6, String[] strArr, float[] fArr) {
        float centerX = floatRect.centerX();
        float centerY = floatRect.centerY();
        float centerX2 = floatRect2.centerX() - centerX;
        float centerY2 = floatRect2.centerY() - centerY;
        float hypot = (float) Math.hypot(centerX2, centerY2);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f7 = centerX2 / hypot;
        float f8 = centerY2 / hypot;
        float f9 = f6 - centerY;
        float f10 = f5 - centerX;
        float f11 = ((f7 * f9) - (f10 * f8)) / hypot;
        float f12 = ((f8 * f9) + (f7 * f10)) / hypot;
        if (strArr[0] != null) {
            if ("percentX".equals(strArr[0])) {
                fArr[0] = f12;
                fArr[1] = f11;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f12;
        fArr[1] = f11;
    }

    public void positionScreenAttributes(MotionWidget motionWidget, FloatRect floatRect, FloatRect floatRect2, float f5, float f6, String[] strArr, float[] fArr) {
        floatRect.centerX();
        floatRect.centerY();
        floatRect2.centerX();
        floatRect2.centerY();
        MotionWidget parent = motionWidget.getParent();
        int width = parent.getWidth();
        int height = parent.getHeight();
        if (strArr[0] == null) {
            strArr[0] = "percentX";
            fArr[0] = f5 / width;
            strArr[1] = "percentY";
            fArr[1] = f6 / height;
            return;
        }
        float f7 = f5 / width;
        if ("percentX".equals(strArr[0])) {
            fArr[0] = f7;
            fArr[1] = f6 / height;
        } else {
            fArr[1] = f7;
            fArr[0] = f6 / height;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i5, float f5) {
        switch (i5) {
            case 503:
                this.mPercentWidth = f5;
                return true;
            case 504:
                break;
            case 505:
                this.mPercentWidth = f5;
                break;
            case 506:
                this.mPercentX = f5;
                return true;
            case 507:
                this.mPercentY = f5;
                return true;
            default:
                return super.setValue(i5, f5);
        }
        this.mPercentHeight = f5;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i5, int i6) {
        if (i5 == 100) {
            this.mFramePosition = i6;
            return true;
        }
        if (i5 == 508) {
            this.mCurveFit = i6;
            return true;
        }
        if (i5 != 510) {
            return super.setValue(i5, i6);
        }
        this.mPositionType = i6;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i5, String str) {
        if (i5 != 501) {
            return super.setValue(i5, str);
        }
        this.mTransitionEasing = str.toString();
        return true;
    }
}
