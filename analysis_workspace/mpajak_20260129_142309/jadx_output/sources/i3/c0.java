package i3;

import android.animation.ValueAnimator;
import com.superbock.ui.WebActivity;

/* loaded from: classes17.dex */
public final class c0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebActivity f3318b;

    public c0(WebActivity webActivity, int i5) {
        this.f3318b = webActivity;
        this.f3317a = i5;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.f3318b.f1546c.setProgress((int) (((100 - r0) * animatedFraction) + this.f3317a));
    }
}
