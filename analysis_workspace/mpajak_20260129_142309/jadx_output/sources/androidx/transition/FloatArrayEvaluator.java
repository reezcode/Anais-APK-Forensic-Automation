package androidx.transition;

import android.animation.TypeEvaluator;
import androidx.appcompat.graphics.drawable.a;

/* loaded from: classes11.dex */
class FloatArrayEvaluator implements TypeEvaluator<float[]> {
    private float[] mArray;

    public FloatArrayEvaluator(float[] fArr) {
        this.mArray = fArr;
    }

    @Override // android.animation.TypeEvaluator
    public float[] evaluate(float f5, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.mArray;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i5 = 0; i5 < fArr3.length; i5++) {
            float f6 = fArr[i5];
            fArr3[i5] = a.a(fArr2[i5], f6, f5, f6);
        }
        return fArr3;
    }
}
