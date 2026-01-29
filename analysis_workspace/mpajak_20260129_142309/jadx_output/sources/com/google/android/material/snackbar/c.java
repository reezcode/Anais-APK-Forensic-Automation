package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.os.Handler;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f1170a;

    public c(BaseTransientBottomBar baseTransientBottomBar, int i5) {
        this.f1170a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Handler handler = BaseTransientBottomBar.f1129n;
        this.f1170a.f1134c.setTranslationY(intValue);
    }
}
