package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.dynamicanimation.animation.DynamicAnimation;

/* loaded from: classes23.dex */
public final class FlingAnimation extends DynamicAnimation<FlingAnimation> {
    private final DragForce mFlingForce;

    /* loaded from: classes13.dex */
    public static final class DragForce implements Force {
        private static final float DEFAULT_FRICTION = -4.2f;
        private static final float VELOCITY_THRESHOLD_MULTIPLIER = 62.5f;
        private float mFriction = DEFAULT_FRICTION;
        private final DynamicAnimation.MassState mMassState = new DynamicAnimation.MassState();
        private float mVelocityThreshold;

        @Override // androidx.dynamicanimation.animation.Force
        public float getAcceleration(float f5, float f6) {
            return f6 * this.mFriction;
        }

        public float getFrictionScalar() {
            return this.mFriction / DEFAULT_FRICTION;
        }

        @Override // androidx.dynamicanimation.animation.Force
        public boolean isAtEquilibrium(float f5, float f6) {
            return Math.abs(f6) < this.mVelocityThreshold;
        }

        public void setFrictionScalar(float f5) {
            this.mFriction = f5 * DEFAULT_FRICTION;
        }

        public void setValueThreshold(float f5) {
            this.mVelocityThreshold = f5 * VELOCITY_THRESHOLD_MULTIPLIER;
        }

        public DynamicAnimation.MassState updateValueAndVelocity(float f5, float f6, long j5) {
            float f7 = j5;
            this.mMassState.mVelocity = (float) (Math.exp((f7 / 1000.0f) * this.mFriction) * f6);
            DynamicAnimation.MassState massState = this.mMassState;
            float f8 = this.mFriction;
            massState.mValue = (float) ((Math.exp((f8 * f7) / 1000.0f) * (f6 / f8)) + (f5 - (f6 / f8)));
            DynamicAnimation.MassState massState2 = this.mMassState;
            if (isAtEquilibrium(massState2.mValue, massState2.mVelocity)) {
                this.mMassState.mVelocity = 0.0f;
            }
            return this.mMassState;
        }
    }

    public FlingAnimation(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        DragForce dragForce = new DragForce();
        this.mFlingForce = dragForce;
        dragForce.setValueThreshold(getValueThreshold());
    }

    public <K> FlingAnimation(K k5, FloatPropertyCompat<K> floatPropertyCompat) {
        super(k5, floatPropertyCompat);
        DragForce dragForce = new DragForce();
        this.mFlingForce = dragForce;
        dragForce.setValueThreshold(getValueThreshold());
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public float getAcceleration(float f5, float f6) {
        return this.mFlingForce.getAcceleration(f5, f6);
    }

    public float getFriction() {
        return this.mFlingForce.getFrictionScalar();
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public boolean isAtEquilibrium(float f5, float f6) {
        return f5 >= this.mMaxValue || f5 <= this.mMinValue || this.mFlingForce.isAtEquilibrium(f5, f6);
    }

    public FlingAnimation setFriction(@FloatRange(from = 0.0d, fromInclusive = false) float f5) {
        if (f5 <= 0.0f) {
            throw new IllegalArgumentException("Friction must be positive");
        }
        this.mFlingForce.setFrictionScalar(f5);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setMaxValue(float f5) {
        super.setMaxValue(f5);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setMinValue(float f5) {
        super.setMinValue(f5);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setStartVelocity(float f5) {
        super.setStartVelocity(f5);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public void setValueThreshold(float f5) {
        this.mFlingForce.setValueThreshold(f5);
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public boolean updateValueAndVelocity(long j5) {
        DynamicAnimation.MassState updateValueAndVelocity = this.mFlingForce.updateValueAndVelocity(this.mValue, this.mVelocity, j5);
        float f5 = updateValueAndVelocity.mValue;
        this.mValue = f5;
        float f6 = updateValueAndVelocity.mVelocity;
        this.mVelocity = f6;
        float f7 = this.mMinValue;
        if (f5 < f7) {
            this.mValue = f7;
            return true;
        }
        float f8 = this.mMaxValue;
        if (f5 <= f8) {
            return isAtEquilibrium(f5, f6);
        }
        this.mValue = f8;
        return true;
    }
}
