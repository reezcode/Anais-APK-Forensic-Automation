package e2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes22.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.textfield.b f2542a;

    public g(com.google.android.material.textfield.b bVar) {
        this.f2542a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        com.google.android.material.textfield.b bVar = this.f2542a;
        bVar.f2547c.setChecked(bVar.f1266m);
        this.f2542a.f1272s.start();
    }
}
