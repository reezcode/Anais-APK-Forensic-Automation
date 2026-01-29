package c2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes19.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f517b;

    public c(BaseTransientBottomBar baseTransientBottomBar, int i5) {
        this.f517b = baseTransientBottomBar;
        this.f516a = i5;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f517b.e();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.f517b.f1135d;
        snackbarContentLayout.f1165b.setAlpha(1.0f);
        long j5 = 180;
        long j6 = 0;
        snackbarContentLayout.f1165b.animate().alpha(0.0f).setDuration(j5).setStartDelay(j6).start();
        if (snackbarContentLayout.f1166c.getVisibility() == 0) {
            snackbarContentLayout.f1166c.setAlpha(1.0f);
            snackbarContentLayout.f1166c.animate().alpha(0.0f).setDuration(j5).setStartDelay(j6).start();
        }
    }
}
