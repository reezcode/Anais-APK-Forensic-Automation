package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.dynamicanimation.animation.DynamicAnimation;

/* loaded from: classes6.dex */
public final class SpringForce implements Force {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;
    private static final double UNSET = Double.MAX_VALUE;
    private static final double VELOCITY_THRESHOLD_MULTIPLIER = 62.5d;
    private double mDampedFreq;
    public double mDampingRatio;
    private double mFinalPosition;
    private double mGammaMinus;
    private double mGammaPlus;
    private boolean mInitialized;
    private final DynamicAnimation.MassState mMassState;
    public double mNaturalFreq;
    private double mValueThreshold;
    private double mVelocityThreshold;

    public SpringForce() {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = Double.MAX_VALUE;
        this.mMassState = new DynamicAnimation.MassState();
    }

    public SpringForce(float f5) {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = Double.MAX_VALUE;
        this.mMassState = new DynamicAnimation.MassState();
        this.mFinalPosition = f5;
    }

    private void init() {
        if (this.mInitialized) {
            return;
        }
        if (this.mFinalPosition == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d5 = this.mDampingRatio;
        if (d5 > 1.0d) {
            double d6 = this.mNaturalFreq;
            this.mGammaPlus = (Math.sqrt((d5 * d5) - 1.0d) * d6) + ((-d5) * d6);
            double d7 = this.mDampingRatio;
            double d8 = this.mNaturalFreq;
            this.mGammaMinus = ((-d7) * d8) - (Math.sqrt((d7 * d7) - 1.0d) * d8);
        } else if (d5 >= 0.0d && d5 < 1.0d) {
            this.mDampedFreq = Math.sqrt(1.0d - (d5 * d5)) * this.mNaturalFreq;
        }
        this.mInitialized = true;
    }

    @Override // androidx.dynamicanimation.animation.Force
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public float getAcceleration(float f5, float f6) {
        float finalPosition = f5 - getFinalPosition();
        double d5 = this.mNaturalFreq;
        return (float) (((-(d5 * d5)) * finalPosition) - (((d5 * 2.0d) * this.mDampingRatio) * f6));
    }

    public float getDampingRatio() {
        return (float) this.mDampingRatio;
    }

    public float getFinalPosition() {
        return (float) this.mFinalPosition;
    }

    public float getStiffness() {
        double d5 = this.mNaturalFreq;
        return (float) (d5 * d5);
    }

    @Override // androidx.dynamicanimation.animation.Force
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean isAtEquilibrium(float f5, float f6) {
        return ((double) Math.abs(f6)) < this.mVelocityThreshold && ((double) Math.abs(f5 - getFinalPosition())) < this.mValueThreshold;
    }

    public SpringForce setDampingRatio(@FloatRange(from = 0.0d) float f5) {
        if (f5 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.mDampingRatio = f5;
        this.mInitialized = false;
        return this;
    }

    public SpringForce setFinalPosition(float f5) {
        this.mFinalPosition = f5;
        return this;
    }

    public SpringForce setStiffness(@FloatRange(from = 0.0d, fromInclusive = false) float f5) {
        if (f5 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.mNaturalFreq = Math.sqrt(f5);
        this.mInitialized = false;
        return this;
    }

    public void setValueThreshold(double d5) {
        double abs = Math.abs(d5);
        this.mValueThreshold = abs;
        this.mVelocityThreshold = abs * VELOCITY_THRESHOLD_MULTIPLIER;
    }

    public DynamicAnimation.MassState updateValues(double d5, double d6, long j5) {
        double cos;
        double d7;
        init();
        double d8 = j5 / 1000.0d;
        double d9 = d5 - this.mFinalPosition;
        double d10 = this.mDampingRatio;
        if (d10 > 1.0d) {
            double d11 = this.mGammaMinus;
            double d12 = this.mGammaPlus;
            double d13 = d9 - (((d11 * d9) - d6) / (d11 - d12));
            double d14 = ((d9 * d11) - d6) / (d11 - d12);
            d7 = (Math.pow(2.718281828459045d, this.mGammaPlus * d8) * d14) + (Math.pow(2.718281828459045d, d11 * d8) * d13);
            double d15 = this.mGammaMinus;
            double pow = Math.pow(2.718281828459045d, d15 * d8) * d13 * d15;
            double d16 = this.mGammaPlus;
            cos = (Math.pow(2.718281828459045d, d16 * d8) * d14 * d16) + pow;
        } else if (d10 == 1.0d) {
            double d17 = this.mNaturalFreq;
            double d18 = (d17 * d9) + d6;
            double d19 = (d18 * d8) + d9;
            double pow2 = Math.pow(2.718281828459045d, (-d17) * d8) * d19;
            double pow3 = Math.pow(2.718281828459045d, (-this.mNaturalFreq) * d8) * d19;
            double d20 = this.mNaturalFreq;
            cos = (Math.pow(2.718281828459045d, (-d20) * d8) * d18) + (pow3 * (-d20));
            d7 = pow2;
        } else {
            double d21 = 1.0d / this.mDampedFreq;
            double d22 = this.mNaturalFreq;
            double d23 = ((d10 * d22 * d9) + d6) * d21;
            double sin = ((Math.sin(this.mDampedFreq * d8) * d23) + (Math.cos(this.mDampedFreq * d8) * d9)) * Math.pow(2.718281828459045d, (-d10) * d22 * d8);
            double d24 = this.mNaturalFreq;
            double d25 = this.mDampingRatio;
            double d26 = (-d24) * sin * d25;
            double pow4 = Math.pow(2.718281828459045d, (-d25) * d24 * d8);
            double d27 = this.mDampedFreq;
            double sin2 = Math.sin(d27 * d8) * (-d27) * d9;
            double d28 = this.mDampedFreq;
            cos = (((Math.cos(d28 * d8) * d23 * d28) + sin2) * pow4) + d26;
            d7 = sin;
        }
        DynamicAnimation.MassState massState = this.mMassState;
        massState.mValue = (float) (d7 + this.mFinalPosition);
        massState.mVelocity = (float) cos;
        return massState;
    }
}
