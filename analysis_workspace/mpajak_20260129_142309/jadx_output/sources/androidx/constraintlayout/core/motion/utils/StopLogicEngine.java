package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes11.dex */
public class StopLogicEngine implements StopEngine {
    private static final float EPSILON = 1.0E-5f;
    private boolean mBackwards = false;
    private boolean mDone = false;
    private float mLastPosition;
    private int mNumberOfStages;
    private float mStage1Duration;
    private float mStage1EndPosition;
    private float mStage1Velocity;
    private float mStage2Duration;
    private float mStage2EndPosition;
    private float mStage2Velocity;
    private float mStage3Duration;
    private float mStage3EndPosition;
    private float mStage3Velocity;
    private float mStartPosition;
    private String mType;

    private float calcY(float f5) {
        this.mDone = false;
        float f6 = this.mStage1Duration;
        if (f5 <= f6) {
            float f7 = this.mStage1Velocity;
            return ((((this.mStage2Velocity - f7) * f5) * f5) / (f6 * 2.0f)) + (f7 * f5);
        }
        int i5 = this.mNumberOfStages;
        if (i5 == 1) {
            return this.mStage1EndPosition;
        }
        float f8 = f5 - f6;
        float f9 = this.mStage2Duration;
        if (f8 < f9) {
            float f10 = this.mStage1EndPosition;
            float f11 = this.mStage2Velocity;
            return ((((this.mStage3Velocity - f11) * f8) * f8) / (f9 * 2.0f)) + (f11 * f8) + f10;
        }
        if (i5 == 2) {
            return this.mStage2EndPosition;
        }
        float f12 = f8 - f9;
        float f13 = this.mStage3Duration;
        if (f12 > f13) {
            this.mDone = true;
            return this.mStage3EndPosition;
        }
        float f14 = this.mStage2EndPosition;
        float f15 = this.mStage3Velocity;
        return ((f15 * f12) + f14) - (((f15 * f12) * f12) / (f13 * 2.0f));
    }

    private void setup(float f5, float f6, float f7, float f8, float f9) {
        this.mDone = false;
        if (f5 == 0.0f) {
            f5 = 1.0E-4f;
        }
        this.mStage1Velocity = f5;
        float f10 = f5 / f7;
        float f11 = (f10 * f5) / 2.0f;
        if (f5 < 0.0f) {
            float sqrt = (float) Math.sqrt((f6 - ((((-f5) / f7) * f5) / 2.0f)) * f7);
            if (sqrt < f8) {
                this.mType = "backward accelerate, decelerate";
                this.mNumberOfStages = 2;
                this.mStage1Velocity = f5;
                this.mStage2Velocity = sqrt;
                this.mStage3Velocity = 0.0f;
                float f12 = (sqrt - f5) / f7;
                this.mStage1Duration = f12;
                this.mStage2Duration = sqrt / f7;
                this.mStage1EndPosition = ((f5 + sqrt) * f12) / 2.0f;
                this.mStage2EndPosition = f6;
                this.mStage3EndPosition = f6;
                return;
            }
            this.mType = "backward accelerate cruse decelerate";
            this.mNumberOfStages = 3;
            this.mStage1Velocity = f5;
            this.mStage2Velocity = f8;
            this.mStage3Velocity = f8;
            float f13 = (f8 - f5) / f7;
            this.mStage1Duration = f13;
            float f14 = f8 / f7;
            this.mStage3Duration = f14;
            float f15 = ((f5 + f8) * f13) / 2.0f;
            float f16 = (f14 * f8) / 2.0f;
            this.mStage2Duration = ((f6 - f15) - f16) / f8;
            this.mStage1EndPosition = f15;
            this.mStage2EndPosition = f6 - f16;
            this.mStage3EndPosition = f6;
            return;
        }
        if (f11 >= f6) {
            this.mType = "hard stop";
            this.mNumberOfStages = 1;
            this.mStage1Velocity = f5;
            this.mStage2Velocity = 0.0f;
            this.mStage1EndPosition = f6;
            this.mStage1Duration = (2.0f * f6) / f5;
            return;
        }
        float f17 = f6 - f11;
        float f18 = f17 / f5;
        if (f18 + f10 < f9) {
            this.mType = "cruse decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f5;
            this.mStage2Velocity = f5;
            this.mStage3Velocity = 0.0f;
            this.mStage1EndPosition = f17;
            this.mStage2EndPosition = f6;
            this.mStage1Duration = f18;
            this.mStage2Duration = f10;
            return;
        }
        float sqrt2 = (float) Math.sqrt(((f5 * f5) / 2.0f) + (f7 * f6));
        float f19 = (sqrt2 - f5) / f7;
        this.mStage1Duration = f19;
        float f20 = sqrt2 / f7;
        this.mStage2Duration = f20;
        if (sqrt2 < f8) {
            this.mType = "accelerate decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f5;
            this.mStage2Velocity = sqrt2;
            this.mStage3Velocity = 0.0f;
            this.mStage1Duration = f19;
            this.mStage2Duration = f20;
            this.mStage1EndPosition = ((f5 + sqrt2) * f19) / 2.0f;
            this.mStage2EndPosition = f6;
            return;
        }
        this.mType = "accelerate cruse decelerate";
        this.mNumberOfStages = 3;
        this.mStage1Velocity = f5;
        this.mStage2Velocity = f8;
        this.mStage3Velocity = f8;
        float f21 = (f8 - f5) / f7;
        this.mStage1Duration = f21;
        float f22 = f8 / f7;
        this.mStage3Duration = f22;
        float f23 = ((f5 + f8) * f21) / 2.0f;
        float f24 = (f22 * f8) / 2.0f;
        this.mStage2Duration = ((f6 - f23) - f24) / f8;
        this.mStage1EndPosition = f23;
        this.mStage2EndPosition = f6 - f24;
        this.mStage3EndPosition = f6;
    }

    public void config(float f5, float f6, float f7, float f8, float f9, float f10) {
        float f11;
        StopLogicEngine stopLogicEngine;
        float f12;
        this.mDone = false;
        this.mStartPosition = f5;
        boolean z4 = f5 > f6;
        this.mBackwards = z4;
        if (z4) {
            f12 = -f7;
            f11 = f5 - f6;
            stopLogicEngine = this;
        } else {
            f11 = f6 - f5;
            stopLogicEngine = this;
            f12 = f7;
        }
        stopLogicEngine.setup(f12, f11, f9, f10, f8);
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f5) {
        StringBuilder e5;
        String str2;
        StringBuilder e6 = androidx.activity.result.a.e(androidx.appcompat.graphics.drawable.a.c(androidx.activity.result.a.e(str, " ===== "), this.mType, "\n"), str);
        e6.append(this.mBackwards ? "backwards" : "forward ");
        e6.append(" time = ");
        e6.append(f5);
        e6.append("  stages ");
        StringBuilder f6 = androidx.activity.result.a.f(androidx.appcompat.view.a.h(e6, this.mNumberOfStages, "\n"), str, " dur ");
        f6.append(this.mStage1Duration);
        f6.append(" vel ");
        f6.append(this.mStage1Velocity);
        f6.append(" pos ");
        f6.append(this.mStage1EndPosition);
        f6.append("\n");
        String sb = f6.toString();
        if (this.mNumberOfStages > 1) {
            StringBuilder f7 = androidx.activity.result.a.f(sb, str, " dur ");
            f7.append(this.mStage2Duration);
            f7.append(" vel ");
            f7.append(this.mStage2Velocity);
            f7.append(" pos ");
            f7.append(this.mStage2EndPosition);
            f7.append("\n");
            sb = f7.toString();
        }
        if (this.mNumberOfStages > 2) {
            StringBuilder f8 = androidx.activity.result.a.f(sb, str, " dur ");
            f8.append(this.mStage3Duration);
            f8.append(" vel ");
            f8.append(this.mStage3Velocity);
            f8.append(" pos ");
            f8.append(this.mStage3EndPosition);
            f8.append("\n");
            sb = f8.toString();
        }
        float f9 = this.mStage1Duration;
        if (f5 <= f9) {
            e5 = androidx.activity.result.a.e(sb, str);
            str2 = "stage 0\n";
        } else {
            int i5 = this.mNumberOfStages;
            if (i5 == 1) {
                e5 = androidx.activity.result.a.e(sb, str);
                str2 = "end stage 0\n";
            } else {
                float f10 = f5 - f9;
                float f11 = this.mStage2Duration;
                if (f10 < f11) {
                    e5 = androidx.activity.result.a.e(sb, str);
                    str2 = " stage 1\n";
                } else if (i5 == 2) {
                    e5 = androidx.activity.result.a.e(sb, str);
                    str2 = "end stage 1\n";
                } else if (f10 - f11 < this.mStage3Duration) {
                    e5 = androidx.activity.result.a.e(sb, str);
                    str2 = " stage 2\n";
                } else {
                    e5 = androidx.activity.result.a.e(sb, str);
                    str2 = " end stage 2\n";
                }
            }
        }
        e5.append(str2);
        return e5.toString();
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f5) {
        float calcY = calcY(f5);
        this.mLastPosition = f5;
        return this.mBackwards ? this.mStartPosition - calcY : this.mStartPosition + calcY;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return this.mBackwards ? -getVelocity(this.mLastPosition) : getVelocity(this.mLastPosition);
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f5) {
        float f6;
        float f7;
        float f8 = this.mStage1Duration;
        if (f5 <= f8) {
            f6 = this.mStage1Velocity;
            f7 = this.mStage2Velocity;
        } else {
            int i5 = this.mNumberOfStages;
            if (i5 == 1) {
                return 0.0f;
            }
            f5 -= f8;
            f8 = this.mStage2Duration;
            if (f5 >= f8) {
                if (i5 == 2) {
                    return this.mStage2EndPosition;
                }
                float f9 = f5 - f8;
                float f10 = this.mStage3Duration;
                if (f9 >= f10) {
                    return this.mStage3EndPosition;
                }
                float f11 = this.mStage3Velocity;
                return f11 - ((f9 * f11) / f10);
            }
            f6 = this.mStage2Velocity;
            f7 = this.mStage3Velocity;
        }
        return (((f7 - f6) * f5) / f8) + f6;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        return getVelocity() < EPSILON && Math.abs(this.mStage3EndPosition - this.mLastPosition) < EPSILON;
    }
}
