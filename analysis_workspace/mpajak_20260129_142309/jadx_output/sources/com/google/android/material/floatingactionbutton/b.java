package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

/* loaded from: classes9.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1063b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d.g f1064c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f1065d;

    public b(d dVar, boolean z4, d.g gVar) {
        this.f1065d = dVar;
        this.f1063b = z4;
        this.f1064c = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1062a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f1065d;
        dVar.f1084n = 0;
        dVar.f1078h = null;
        if (this.f1062a) {
            return;
        }
        FloatingActionButton floatingActionButton = dVar.f1088r;
        boolean z4 = this.f1063b;
        floatingActionButton.b(z4 ? 8 : 4, z4);
        d.g gVar = this.f1064c;
        if (gVar != null) {
            a aVar = (a) gVar;
            aVar.f1060a.a(aVar.f1061b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f1065d.f1088r.b(0, this.f1063b);
        d dVar = this.f1065d;
        dVar.f1084n = 1;
        dVar.f1078h = animator;
        this.f1062a = false;
    }
}
