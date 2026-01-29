package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes17.dex */
public class VelocityMatrix {
    private static String TAG = "VelocityMatrix";
    public float mDRotate;
    public float mDScaleX;
    public float mDScaleY;
    public float mDTranslateX;
    public float mDTranslateY;
    public float mRotate;

    public void applyTransform(float f5, float f6, int i5, int i6, float[] fArr) {
        float f7 = fArr[0];
        float f8 = fArr[1];
        float f9 = (f6 - 0.5f) * 2.0f;
        float f10 = f7 + this.mDTranslateX;
        float f11 = f8 + this.mDTranslateY;
        float f12 = (this.mDScaleX * (f5 - 0.5f) * 2.0f) + f10;
        float f13 = (this.mDScaleY * f9) + f11;
        float radians = (float) Math.toRadians(this.mRotate);
        float radians2 = (float) Math.toRadians(this.mDRotate);
        double d5 = radians;
        double d6 = i6 * f9;
        float sin = (((float) ((Math.sin(d5) * ((-i5) * r7)) - (Math.cos(d5) * d6))) * radians2) + f12;
        float cos = (radians2 * ((float) ((Math.cos(d5) * (i5 * r7)) - (Math.sin(d5) * d6)))) + f13;
        fArr[0] = sin;
        fArr[1] = cos;
    }

    public void clear() {
        this.mDRotate = 0.0f;
        this.mDTranslateY = 0.0f;
        this.mDTranslateX = 0.0f;
        this.mDScaleY = 0.0f;
        this.mDScaleX = 0.0f;
    }

    public void setRotationVelocity(KeyCycleOscillator keyCycleOscillator, float f5) {
        if (keyCycleOscillator != null) {
            this.mDRotate = keyCycleOscillator.getSlope(f5);
        }
    }

    public void setRotationVelocity(SplineSet splineSet, float f5) {
        if (splineSet != null) {
            this.mDRotate = splineSet.getSlope(f5);
            this.mRotate = splineSet.get(f5);
        }
    }

    public void setScaleVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f5) {
        if (keyCycleOscillator != null) {
            this.mDScaleX = keyCycleOscillator.getSlope(f5);
        }
        if (keyCycleOscillator2 != null) {
            this.mDScaleY = keyCycleOscillator2.getSlope(f5);
        }
    }

    public void setScaleVelocity(SplineSet splineSet, SplineSet splineSet2, float f5) {
        if (splineSet != null) {
            this.mDScaleX = splineSet.getSlope(f5);
        }
        if (splineSet2 != null) {
            this.mDScaleY = splineSet2.getSlope(f5);
        }
    }

    public void setTranslationVelocity(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f5) {
        if (keyCycleOscillator != null) {
            this.mDTranslateX = keyCycleOscillator.getSlope(f5);
        }
        if (keyCycleOscillator2 != null) {
            this.mDTranslateY = keyCycleOscillator2.getSlope(f5);
        }
    }

    public void setTranslationVelocity(SplineSet splineSet, SplineSet splineSet2, float f5) {
        if (splineSet != null) {
            this.mDTranslateX = splineSet.getSlope(f5);
        }
        if (splineSet2 != null) {
            this.mDTranslateY = splineSet2.getSlope(f5);
        }
    }
}
