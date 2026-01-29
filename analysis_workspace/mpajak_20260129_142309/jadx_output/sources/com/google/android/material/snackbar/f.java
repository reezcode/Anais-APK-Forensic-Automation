package com.google.android.material.snackbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f1173b;

    public f(BaseTransientBottomBar baseTransientBottomBar) {
        this.f1173b = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BaseTransientBottomBar.g gVar = this.f1173b.f1134c;
        if (gVar == null) {
            return;
        }
        if (gVar.getParent() != null) {
            this.f1173b.f1134c.setVisibility(0);
        }
        if (this.f1173b.f1134c.getAnimationMode() != 1) {
            BaseTransientBottomBar baseTransientBottomBar = this.f1173b;
            int c5 = baseTransientBottomBar.c();
            baseTransientBottomBar.f1134c.setTranslationY(c5);
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(c5, 0);
            valueAnimator.setInterpolator(f1.a.f2768b);
            valueAnimator.setDuration(250L);
            valueAnimator.addListener(new c2.b(baseTransientBottomBar));
            valueAnimator.addUpdateListener(new c(baseTransientBottomBar, c5));
            valueAnimator.start();
            return;
        }
        BaseTransientBottomBar baseTransientBottomBar2 = this.f1173b;
        Objects.requireNonNull(baseTransientBottomBar2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(f1.a.f2767a);
        ofFloat.addUpdateListener(new a(baseTransientBottomBar2));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat2.setInterpolator(f1.a.f2770d);
        ofFloat2.addUpdateListener(new b(baseTransientBottomBar2));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new c2.e(baseTransientBottomBar2));
        animatorSet.start();
    }
}
