package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;
import androidx.appcompat.graphics.drawable.a;

/* loaded from: classes3.dex */
abstract class LookupTableInterpolator implements Interpolator {
    private final float mStepSize;
    private final float[] mValues;

    public LookupTableInterpolator(float[] fArr) {
        this.mValues = fArr;
        this.mStepSize = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f5) {
        if (f5 >= 1.0f) {
            return 1.0f;
        }
        if (f5 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.mValues;
        int min = Math.min((int) ((fArr.length - 1) * f5), fArr.length - 2);
        float f6 = this.mStepSize;
        float f7 = (f5 - (min * f6)) / f6;
        float[] fArr2 = this.mValues;
        return a.a(fArr2[min + 1], fArr2[min], f7, fArr2[min]);
    }
}
