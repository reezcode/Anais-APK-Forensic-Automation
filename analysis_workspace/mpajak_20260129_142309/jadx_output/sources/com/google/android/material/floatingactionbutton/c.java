package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

/* loaded from: classes21.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f1066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d.g f1067b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f1068c;

    public c(d dVar, boolean z4, d.g gVar) {
        this.f1068c = dVar;
        this.f1066a = z4;
        this.f1067b = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f1068c;
        dVar.f1084n = 0;
        dVar.f1078h = null;
        d.g gVar = this.f1067b;
        if (gVar != null) {
            ((a) gVar).f1060a.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f1068c.f1088r.b(0, this.f1066a);
        d dVar = this.f1068c;
        dVar.f1084n = 2;
        dVar.f1078h = animator;
    }
}
