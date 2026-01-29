package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import n1.d;

/* loaded from: classes9.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f1365a;

    public c(d dVar) {
        this.f1365a = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d.C0056d revealInfo = this.f1365a.getRevealInfo();
        revealInfo.f4505c = Float.MAX_VALUE;
        this.f1365a.setRevealInfo(revealInfo);
    }
}
