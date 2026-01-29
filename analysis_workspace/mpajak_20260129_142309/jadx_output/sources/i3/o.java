package i3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.superbock.ui.AdWebSmallActivity;

/* loaded from: classes12.dex */
public final class o extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdWebSmallActivity f3335a;

    public o(AdWebSmallActivity adWebSmallActivity) {
        this.f3335a = adWebSmallActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3335a.f1524f.setProgress(0);
        this.f3335a.f1524f.setVisibility(8);
        this.f3335a.f1526h = false;
    }
}
