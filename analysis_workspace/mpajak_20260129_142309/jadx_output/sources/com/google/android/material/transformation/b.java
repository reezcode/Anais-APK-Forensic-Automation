package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import n1.d;

/* loaded from: classes15.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f1363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Drawable f1364b;

    public b(d dVar, Drawable drawable) {
        this.f1363a = dVar;
        this.f1364b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f1363a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f1363a.setCircularRevealOverlayDrawable(this.f1364b);
    }
}
