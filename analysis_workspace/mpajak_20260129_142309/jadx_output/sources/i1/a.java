package i1;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import b2.g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes13.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f3257a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f3257a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g gVar = this.f3257a.f786h;
        if (gVar != null) {
            gVar.p(floatValue);
        }
    }
}
