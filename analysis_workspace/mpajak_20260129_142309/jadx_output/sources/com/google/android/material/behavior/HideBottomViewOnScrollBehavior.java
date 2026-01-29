package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes7.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a, reason: collision with root package name */
    public int f741a;

    /* renamed from: b, reason: collision with root package name */
    public int f742b;

    /* renamed from: c, reason: collision with root package name */
    public int f743c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public ViewPropertyAnimator f744d;

    /* loaded from: classes21.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f744d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f741a = 0;
        this.f742b = 2;
        this.f743c = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f741a = 0;
        this.f742b = 2;
        this.f743c = 0;
    }

    public final void a(@NonNull V v4, int i5, long j5, TimeInterpolator timeInterpolator) {
        this.f744d = v4.animate().translationY(i5).setInterpolator(timeInterpolator).setDuration(j5).setListener(new a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v4, int i5) {
        this.f741a = v4.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v4.getLayoutParams()).bottomMargin;
        return super.onLayoutChild(coordinatorLayout, v4, i5);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull V v4, @NonNull View view, int i5, int i6, int i7, int i8, int i9, @NonNull int[] iArr) {
        if (i6 > 0) {
            if (this.f742b == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f744d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v4.clearAnimation();
            }
            this.f742b = 1;
            a(v4, this.f741a + this.f743c, 175L, f1.a.f2769c);
            return;
        }
        if (i6 < 0) {
            if (this.f742b == 2) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator2 = this.f744d;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                v4.clearAnimation();
            }
            this.f742b = 2;
            a(v4, 0, 225L, f1.a.f2770d);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v4, @NonNull View view, @NonNull View view2, int i5, int i6) {
        return i5 == 2;
    }
}
