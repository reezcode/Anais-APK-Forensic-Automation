package c2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes6.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f515a;

    public b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f515a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f515a.f();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.f515a.f1135d;
        snackbarContentLayout.f1165b.setAlpha(0.0f);
        long j5 = 180;
        long j6 = 70;
        snackbarContentLayout.f1165b.animate().alpha(1.0f).setDuration(j5).setStartDelay(j6).start();
        if (snackbarContentLayout.f1166c.getVisibility() == 0) {
            snackbarContentLayout.f1166c.setAlpha(0.0f);
            snackbarContentLayout.f1166c.animate().alpha(1.0f).setDuration(j5).setStartDelay(j6).start();
        }
    }
}
