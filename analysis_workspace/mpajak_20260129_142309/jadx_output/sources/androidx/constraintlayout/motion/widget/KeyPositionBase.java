package androidx.constraintlayout.motion.widget;

import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;

/* loaded from: classes22.dex */
abstract class KeyPositionBase extends Key {
    public static final float SELECTION_SLOPE = 20.0f;
    public int mCurveFit = Key.UNSET;

    public abstract void calcPosition(int i5, int i6, float f5, float f6, float f7, float f8);

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
    }

    public abstract float getPositionX();

    public abstract float getPositionY();

    public abstract boolean intersects(int i5, int i6, RectF rectF, RectF rectF2, float f5, float f6);

    public abstract void positionAttributes(View view, RectF rectF, RectF rectF2, float f5, float f6, String[] strArr, float[] fArr);
}
