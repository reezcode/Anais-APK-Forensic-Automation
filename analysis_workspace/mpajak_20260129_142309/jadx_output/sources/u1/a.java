package u1;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* loaded from: classes5.dex */
public final class a implements TypeEvaluator<Float> {

    /* renamed from: a, reason: collision with root package name */
    public FloatEvaluator f5465a = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final Float evaluate(float f5, Float f6, Float f7) {
        float floatValue = this.f5465a.evaluate(f5, (Number) f6, (Number) f7).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
