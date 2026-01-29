package i3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.superbock.ui.AdWebActivity;

/* loaded from: classes16.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdWebActivity f3312a;

    public a(AdWebActivity adWebActivity) {
        this.f3312a = adWebActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3312a.f1510h.setProgress(0);
        this.f3312a.f1510h.setVisibility(8);
        this.f3312a.f1512j = false;
    }
}
