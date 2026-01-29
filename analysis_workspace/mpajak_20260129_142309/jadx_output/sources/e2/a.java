package e2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes23.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.textfield.a f2537a;

    public a(com.google.android.material.textfield.a aVar) {
        this.f2537a = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f2537a.f2545a.setEndIconVisible(true);
    }
}
