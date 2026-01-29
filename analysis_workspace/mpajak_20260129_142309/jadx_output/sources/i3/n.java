package i3;

import android.animation.ValueAnimator;
import com.superbock.ui.AdWebSmallActivity;

/* loaded from: classes9.dex */
public final class n implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdWebSmallActivity f3334b;

    public n(AdWebSmallActivity adWebSmallActivity, int i5) {
        this.f3334b = adWebSmallActivity;
        this.f3333a = i5;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.f3334b.f1524f.setProgress((int) (((100 - r0) * animatedFraction) + this.f3333a));
    }
}
