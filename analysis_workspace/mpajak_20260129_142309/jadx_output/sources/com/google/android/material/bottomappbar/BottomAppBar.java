package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import b2.h;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import comeliest.metempsychosis.pokelogan.R;
import h1.b;
import h1.c;
import h1.d;
import h1.f;
import h1.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import v1.r;

/* loaded from: classes4.dex */
public final class BottomAppBar extends Toolbar implements CoordinatorLayout.AttachedBehavior {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f761k = 0;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f762b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public Animator f763c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public Animator f764d;

    /* renamed from: e, reason: collision with root package name */
    public int f765e;

    /* renamed from: f, reason: collision with root package name */
    public int f766f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f767g;

    /* renamed from: h, reason: collision with root package name */
    @MenuRes
    public int f768h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f769i;

    /* renamed from: j, reason: collision with root package name */
    public Behavior f770j;

    /* loaded from: classes11.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e, reason: collision with root package name */
        @NonNull
        public final Rect f771e;

        /* renamed from: f, reason: collision with root package name */
        public WeakReference<BottomAppBar> f772f;

        /* renamed from: g, reason: collision with root package name */
        public int f773g;

        /* renamed from: h, reason: collision with root package name */
        public final a f774h;

        /* loaded from: classes7.dex */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                if (Behavior.this.f772f.get() == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                } else {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    Behavior.this.f771e.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    throw null;
                }
            }
        }

        public Behavior() {
            this.f774h = new a();
            this.f771e = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f774h = new a();
            this.f771e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i5) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f772f = new WeakReference<>(bottomAppBar);
            int i6 = BottomAppBar.f761k;
            View b5 = bottomAppBar.b();
            if (b5 == null || ViewCompat.isLaidOut(b5)) {
                coordinatorLayout.onLayoutChild(bottomAppBar, i5);
                return super.onLayoutChild(coordinatorLayout, bottomAppBar, i5);
            }
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) b5.getLayoutParams();
            layoutParams.anchorGravity = 49;
            this.f773g = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (b5 instanceof FloatingActionButton) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) b5;
                if (floatingActionButton.getShowMotionSpec() == null) {
                    floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                }
                if (floatingActionButton.getHideMotionSpec() == null) {
                    floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                }
                floatingActionButton.addOnLayoutChangeListener(this.f774h);
                floatingActionButton.d();
                floatingActionButton.e(new f(bottomAppBar));
                floatingActionButton.f();
            }
            bottomAppBar.f();
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, int i5, int i6) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout, bottomAppBar, view2, view3, i5, i6);
        }
    }

    /* loaded from: classes13.dex */
    public static class a extends AbsSavedState {
        public static final Parcelable.Creator<a> CREATOR = new C0015a();

        /* renamed from: b, reason: collision with root package name */
        public int f776b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f777c;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a$a, reason: collision with other inner class name */
        /* loaded from: classes19.dex */
        public class C0015a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new a(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final a createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i5) {
                return new a[i5];
            }
        }

        public a(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f776b = parcel.readInt();
            this.f777c = parcel.readInt() != 0;
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f776b);
            parcel.writeInt(this.f777c ? 1 : 0);
        }
    }

    @Nullable
    private ActionMenuView getActionMenuView() {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private int getBottomInset() {
        return 0;
    }

    private float getFabTranslationX() {
        return d(this.f765e);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f3135d;
    }

    private int getLeftInset() {
        return 0;
    }

    private int getRightInset() {
        return 0;
    }

    @NonNull
    private g getTopEdgeTreatment() {
        throw null;
    }

    @Nullable
    public final FloatingActionButton a() {
        View b5 = b();
        if (b5 instanceof FloatingActionButton) {
            return (FloatingActionButton) b5;
        }
        return null;
    }

    @Nullable
    public final View b() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).getDependents(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final int c(@NonNull ActionMenuView actionMenuView, int i5, boolean z4) {
        if (i5 != 1 || !z4) {
            return 0;
        }
        boolean a5 = r.a(this);
        int measuredWidth = a5 ? getMeasuredWidth() : 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).gravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 8388611) {
                measuredWidth = a5 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((a5 ? actionMenuView.getRight() : actionMenuView.getLeft()) + 0);
    }

    public final float d(int i5) {
        boolean a5 = r.a(this);
        if (i5 == 1) {
            return ((getMeasuredWidth() / 2) + 0) * (a5 ? -1 : 1);
        }
        return 0.0f;
    }

    public final boolean e() {
        FloatingActionButton a5 = a();
        return a5 != null && a5.k();
    }

    public final void f() {
        getTopEdgeTreatment().f3136e = getFabTranslationX();
        b();
        if (this.f769i) {
            e();
        }
        throw null;
    }

    @Nullable
    public ColorStateList getBackgroundTint() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public Behavior getBehavior() {
        if (this.f770j == null) {
            this.f770j = new Behavior();
        }
        return this.f770j;
    }

    @Dimension
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f3135d;
    }

    public int getFabAlignmentMode() {
        return this.f765e;
    }

    public int getFabAnimationMode() {
        return this.f766f;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f3134c;
    }

    @Dimension
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f3133b;
    }

    public boolean getHideOnScroll() {
        return this.f767g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.b(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
        if (!z4) {
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView == null || this.f764d != null) {
                return;
            }
            actionMenuView.setAlpha(1.0f);
            actionMenuView.setTranslationX(!e() ? c(actionMenuView, 0, false) : c(actionMenuView, this.f765e, this.f769i));
            return;
        }
        Animator animator = this.f764d;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f763c;
        if (animator2 != null) {
            animator2.cancel();
        }
        f();
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        this.f765e = aVar.f776b;
        this.f769i = aVar.f777c;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f776b = this.f765e;
        aVar.f777c = this.f769i;
        return aVar;
    }

    public void setBackgroundTint(@Nullable ColorStateList colorStateList) {
        DrawableCompat.setTintList(null, colorStateList);
    }

    public void setCradleVerticalOffset(@Dimension float f5) {
        if (f5 != getCradleVerticalOffset()) {
            g topEdgeTreatment = getTopEdgeTreatment();
            Objects.requireNonNull(topEdgeTreatment);
            if (f5 < 0.0f) {
                throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
            }
            topEdgeTreatment.f3135d = f5;
            throw null;
        }
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        throw null;
    }

    public void setFabAlignmentMode(int i5) {
        int i6;
        this.f768h = 0;
        boolean z4 = this.f769i;
        if (ViewCompat.isLaidOut(this)) {
            Animator animator = this.f764d;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (e()) {
                i6 = i5;
            } else {
                z4 = false;
                i6 = 0;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if (Math.abs(actionMenuView.getTranslationX() - c(actionMenuView, i6, z4)) > 1.0f) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    ofFloat2.addListener(new d(this, actionMenuView, i6, z4));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(150L);
                    animatorSet.playSequentially(ofFloat2, ofFloat);
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.f764d = animatorSet2;
            animatorSet2.addListener(new c(this));
            this.f764d.start();
        } else {
            int i7 = this.f768h;
            if (i7 != 0) {
                this.f768h = 0;
                getMenu().clear();
                inflateMenu(i7);
            }
        }
        if (this.f765e != i5 && ViewCompat.isLaidOut(this)) {
            Animator animator2 = this.f763c;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.f766f == 1) {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(a(), "translationX", d(i5));
                ofFloat3.setDuration(300L);
                arrayList2.add(ofFloat3);
            } else {
                FloatingActionButton a5 = a();
                if (a5 != null && !a5.j()) {
                    a5.i(new b(this, i5), true);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.f763c = animatorSet3;
            animatorSet3.addListener(new h1.a(this));
            this.f763c.start();
        }
        this.f765e = i5;
    }

    public void setFabAnimationMode(int i5) {
        this.f766f = i5;
    }

    public void setFabCornerSize(@Dimension float f5) {
        if (f5 == getTopEdgeTreatment().f3137f) {
            return;
        }
        getTopEdgeTreatment().f3137f = f5;
        throw null;
    }

    public void setFabCradleMargin(@Dimension float f5) {
        if (f5 == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f3134c = f5;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float f5) {
        if (f5 == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().f3133b = f5;
        throw null;
    }

    public void setHideOnScroll(boolean z4) {
        this.f767g = z4;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.f762b != null) {
            drawable = DrawableCompat.wrap(drawable.mutate());
            DrawableCompat.setTint(drawable, this.f762b.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(@ColorInt int i5) {
        this.f762b = Integer.valueOf(i5);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
