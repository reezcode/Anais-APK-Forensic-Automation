package i3;

import android.animation.ValueAnimator;
import com.superbock.ui.AdWebActivity;

/* loaded from: classes12.dex */
public final class j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdWebActivity f3329b;

    public j(AdWebActivity adWebActivity, int i5) {
        this.f3329b = adWebActivity;
        this.f3328a = i5;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.f3329b.f1510h.setProgress((int) (((100 - r0) * animatedFraction) + this.f3328a));
    }
}
