package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* loaded from: classes4.dex */
class RectEvaluator implements TypeEvaluator<Rect> {
    private Rect mRect;

    public RectEvaluator() {
    }

    public RectEvaluator(Rect rect) {
        this.mRect = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f5, Rect rect, Rect rect2) {
        int i5 = rect.left + ((int) ((rect2.left - r0) * f5));
        int i6 = rect.top + ((int) ((rect2.top - r1) * f5));
        int i7 = rect.right + ((int) ((rect2.right - r2) * f5));
        int i8 = rect.bottom + ((int) ((rect2.bottom - r6) * f5));
        Rect rect3 = this.mRect;
        if (rect3 == null) {
            return new Rect(i5, i6, i7, i8);
        }
        rect3.set(i5, i6, i7, i8);
        return this.mRect;
    }
}
