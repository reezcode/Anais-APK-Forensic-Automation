package i3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.superbock.ui.WebActivity;

/* loaded from: classes10.dex */
public final class d0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebActivity f3320a;

    public d0(WebActivity webActivity) {
        this.f3320a = webActivity;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3320a.f1546c.setProgress(0);
        this.f3320a.f1546c.setVisibility(8);
        this.f3320a.f1548e = false;
    }
}
