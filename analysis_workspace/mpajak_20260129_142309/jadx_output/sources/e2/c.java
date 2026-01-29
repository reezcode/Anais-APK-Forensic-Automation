package e2;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;

/* loaded from: classes17.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.textfield.a f2539a;

    public c(com.google.android.material.textfield.a aVar) {
        this.f2539a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f2539a.f2547c.setScaleX(floatValue);
        this.f2539a.f2547c.setScaleY(floatValue);
    }
}
