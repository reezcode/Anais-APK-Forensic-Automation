package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.AnimatorRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TintableImageSourceView;
import b2.n;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import comeliest.metempsychosis.pokelogan.R;
import f1.h;
import f1.k;
import i.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import v1.e;
import v1.s;

/* loaded from: classes18.dex */
public final class FloatingActionButton extends s implements TintableBackgroundView, TintableImageSourceView, t1.a, n, CoordinatorLayout.AttachedBehavior {

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public ColorStateList f1044c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f1045d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public ColorStateList f1046e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f1047f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public ColorStateList f1048g;

    /* renamed from: h, reason: collision with root package name */
    public int f1049h;

    /* renamed from: i, reason: collision with root package name */
    public int f1050i;

    /* renamed from: j, reason: collision with root package name */
    public int f1051j;

    /* renamed from: k, reason: collision with root package name */
    public int f1052k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1053l;

    /* renamed from: m, reason: collision with root package name */
    public u1.c f1054m;

    /* loaded from: classes15.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a, reason: collision with root package name */
        public Rect f1055a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1056b;

        public BaseBehavior() {
            this.f1056b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f3206l);
            this.f1056b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        public final boolean a(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            return this.f1056b && ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams()).getAnchorId() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean b(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton floatingActionButton) {
            if (!a(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f1055a == null) {
                this.f1055a = new Rect();
            }
            Rect rect = this.f1055a;
            e.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.i(null, false);
                return true;
            }
            floatingActionButton.m(null, false);
            return true;
        }

        public final boolean c(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            if (!a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.i(null, false);
                return true;
            }
            floatingActionButton.m(null, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Objects.requireNonNull(floatingActionButton);
            floatingActionButton.getLeft();
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                b(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) {
                    c(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i5) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            for (int i6 = 0; i6 < size; i6++) {
                View view2 = dependencies.get(i6);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) && c(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (b(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i5);
            Objects.requireNonNull(floatingActionButton);
            return true;
        }
    }

    /* loaded from: classes15.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes16.dex */
    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b() {
        }
    }

    /* loaded from: classes9.dex */
    public class b implements a2.b {
        public b() {
        }
    }

    /* loaded from: classes9.dex */
    public class c<T extends FloatingActionButton> implements d.f {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final k<T> f1058a = null;

        /* JADX WARN: Incorrect types in method signature: (Lf1/k<TT;>;)V */
        public c() {
        }

        @Override // com.google.android.material.floatingactionbutton.d.f
        public final void a() {
            this.f1058a.a();
        }

        @Override // com.google.android.material.floatingactionbutton.d.f
        public final void b() {
            this.f1058a.b();
        }

        public final boolean equals(@Nullable Object obj) {
            return (obj instanceof c) && ((c) obj).f1058a.equals(this.f1058a);
        }

        public final int hashCode() {
            return this.f1058a.hashCode();
        }
    }

    private d getImpl() {
        if (this.f1054m == null) {
            this.f1054m = new u1.c(this, new b());
        }
        return this.f1054m;
    }

    @Override // t1.a
    public final boolean a() {
        throw null;
    }

    public final void d() {
        d impl = getImpl();
        if (impl.f1086p == null) {
            impl.f1086p = new ArrayList<>();
        }
        impl.f1086p.add(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().k(getDrawableState());
    }

    public final void e(@NonNull Animator.AnimatorListener animatorListener) {
        d impl = getImpl();
        if (impl.f1085o == null) {
            impl.f1085o = new ArrayList<>();
        }
        impl.f1085o.add(animatorListener);
    }

    public final void f() {
        d impl = getImpl();
        c cVar = new c();
        if (impl.f1087q == null) {
            impl.f1087q = new ArrayList<>();
        }
        impl.f1087q.add(cVar);
    }

    @Deprecated
    public final void g(@NonNull Rect rect) {
        if (ViewCompat.isLaidOut(this)) {
            rect.set(0, 0, getWidth(), getHeight());
            throw null;
        }
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.f1044c;
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f1045d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f1075e;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f1076f;
    }

    @Nullable
    public Drawable getContentBackground() {
        Objects.requireNonNull(getImpl());
        return null;
    }

    @Px
    public int getCustomSize() {
        return this.f1050i;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    @Nullable
    public h getHideMotionSpec() {
        return getImpl().f1080j;
    }

    @ColorInt
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f1048g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @Nullable
    public ColorStateList getRippleColorStateList() {
        return this.f1048g;
    }

    @NonNull
    public b2.k getShapeAppearanceModel() {
        return (b2.k) Preconditions.checkNotNull(getImpl().f1071a);
    }

    @Nullable
    public h getShowMotionSpec() {
        return getImpl().f1079i;
    }

    public int getSize() {
        return this.f1049h;
    }

    public int getSizeDimension() {
        return h(this.f1049h);
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @Nullable
    public ColorStateList getSupportImageTintList() {
        return this.f1046e;
    }

    @Override // androidx.core.widget.TintableImageSourceView
    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f1047f;
    }

    public boolean getUseCompatPadding() {
        return this.f1053l;
    }

    public final int h(int i5) {
        int i6 = this.f1050i;
        if (i6 != 0) {
            return i6;
        }
        Resources resources = getResources();
        if (i5 != -1) {
            return resources.getDimensionPixelSize(i5 != 1 ? R.dimen.design_fab_size_normal : R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? h(1) : h(0);
    }

    public final void i(@Nullable a aVar, boolean z4) {
        d impl = getImpl();
        com.google.android.material.floatingactionbutton.a aVar2 = aVar == null ? null : new com.google.android.material.floatingactionbutton.a(this, aVar);
        if (impl.g()) {
            return;
        }
        Animator animator = impl.f1078h;
        if (animator != null) {
            animator.cancel();
        }
        if (!(ViewCompat.isLaidOut(impl.f1088r) && !impl.f1088r.isInEditMode())) {
            impl.f1088r.b(z4 ? 8 : 4, z4);
            if (aVar2 != null) {
                aVar2.f1060a.a(aVar2.f1061b);
                return;
            }
            return;
        }
        h hVar = impl.f1080j;
        AnimatorSet b5 = hVar != null ? impl.b(hVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f);
        b5.addListener(new com.google.android.material.floatingactionbutton.b(impl, z4, aVar2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f1086p;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                b5.addListener(it.next());
            }
        }
        b5.start();
    }

    public final boolean j() {
        return getImpl().g();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().i();
    }

    public final boolean k() {
        return getImpl().h();
    }

    public final void l() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f1046e;
        if (colorStateList == null) {
            DrawableCompat.clearColorFilter(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f1047f;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(colorForState, mode));
    }

    public final void m(@Nullable a aVar, boolean z4) {
        d impl = getImpl();
        com.google.android.material.floatingactionbutton.a aVar2 = aVar == null ? null : new com.google.android.material.floatingactionbutton.a(this, aVar);
        if (impl.h()) {
            return;
        }
        Animator animator = impl.f1078h;
        if (animator != null) {
            animator.cancel();
        }
        boolean z5 = impl.f1079i == null;
        if (!(ViewCompat.isLaidOut(impl.f1088r) && !impl.f1088r.isInEditMode())) {
            impl.f1088r.b(0, z4);
            impl.f1088r.setAlpha(1.0f);
            impl.f1088r.setScaleY(1.0f);
            impl.f1088r.setScaleX(1.0f);
            impl.o(1.0f);
            if (aVar2 != null) {
                aVar2.f1060a.b();
                return;
            }
            return;
        }
        if (impl.f1088r.getVisibility() != 0) {
            impl.f1088r.setAlpha(0.0f);
            impl.f1088r.setScaleY(z5 ? 0.4f : 0.0f);
            impl.f1088r.setScaleX(z5 ? 0.4f : 0.0f);
            impl.o(z5 ? 0.4f : 0.0f);
        }
        h hVar = impl.f1079i;
        AnimatorSet b5 = hVar != null ? impl.b(hVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f);
        b5.addListener(new com.google.android.material.floatingactionbutton.c(impl, z4, aVar2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f1085o;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                b5.addListener(it.next());
            }
        }
        b5.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        Objects.requireNonNull(impl);
        if (!(impl instanceof u1.c)) {
            ViewTreeObserver viewTreeObserver = impl.f1088r.getViewTreeObserver();
            if (impl.f1094x == null) {
                impl.f1094x = new u1.b(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f1094x);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f1088r.getViewTreeObserver();
        u1.b bVar = impl.f1094x;
        if (bVar != null) {
            viewTreeObserver.removeOnPreDrawListener(bVar);
            impl.f1094x = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i5, int i6) {
        this.f1051j = (getSizeDimension() - this.f1052k) / 2;
        getImpl().s();
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d2.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d2.a aVar = (d2.a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        new d2.a(onSaveInstanceState);
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            g(null);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i5) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.f1044c != colorStateList) {
            this.f1044c = colorStateList;
            Objects.requireNonNull(getImpl());
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f1045d != mode) {
            this.f1045d = mode;
            Objects.requireNonNull(getImpl());
        }
    }

    public void setCompatElevation(float f5) {
        d impl = getImpl();
        if (impl.f1074d != f5) {
            impl.f1074d = f5;
            impl.l(f5, impl.f1075e, impl.f1076f);
        }
    }

    public void setCompatElevationResource(@DimenRes int i5) {
        setCompatElevation(getResources().getDimension(i5));
    }

    public void setCompatHoveredFocusedTranslationZ(float f5) {
        d impl = getImpl();
        if (impl.f1075e != f5) {
            impl.f1075e = f5;
            impl.l(impl.f1074d, f5, impl.f1076f);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(@DimenRes int i5) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i5));
    }

    public void setCompatPressedTranslationZ(float f5) {
        d impl = getImpl();
        if (impl.f1076f != f5) {
            impl.f1076f = f5;
            impl.l(impl.f1074d, impl.f1075e, f5);
        }
    }

    public void setCompatPressedTranslationZResource(@DimenRes int i5) {
        setCompatPressedTranslationZ(getResources().getDimension(i5));
    }

    public void setCustomSize(@Px int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i5 != this.f1050i) {
            this.f1050i = i5;
            requestLayout();
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f5) {
        super.setElevation(f5);
        Objects.requireNonNull(getImpl());
    }

    public void setEnsureMinTouchTargetSize(boolean z4) {
        if (z4 != getImpl().f1072b) {
            getImpl().f1072b = z4;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(@IdRes int i5) {
        throw null;
    }

    public void setHideMotionSpec(@Nullable h hVar) {
        getImpl().f1080j = hVar;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i5) {
        setHideMotionSpec(h.a(getContext(), i5));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            impl.o(impl.f1082l);
            if (this.f1046e != null) {
                l();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i5) {
        throw null;
    }

    public void setMaxImageSize(int i5) {
        this.f1052k = i5;
        d impl = getImpl();
        if (impl.f1083m != i5) {
            impl.f1083m = i5;
            impl.o(impl.f1082l);
        }
    }

    public void setRippleColor(@ColorInt int i5) {
        setRippleColor(ColorStateList.valueOf(i5));
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.f1048g != colorStateList) {
            this.f1048g = colorStateList;
            getImpl().p();
        }
    }

    @Override // android.view.View
    public void setScaleX(float f5) {
        super.setScaleX(f5);
        getImpl().m();
    }

    @Override // android.view.View
    public void setScaleY(float f5) {
        super.setScaleY(f5);
        getImpl().m();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setShadowPaddingEnabled(boolean z4) {
        d impl = getImpl();
        impl.f1073c = z4;
        impl.s();
        throw null;
    }

    @Override // b2.n
    public void setShapeAppearanceModel(@NonNull b2.k kVar) {
        getImpl().f1071a = kVar;
    }

    public void setShowMotionSpec(@Nullable h hVar) {
        getImpl().f1079i = hVar;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i5) {
        setShowMotionSpec(h.a(getContext(), i5));
    }

    public void setSize(int i5) {
        this.f1050i = 0;
        if (i5 != this.f1049h) {
            this.f1049h = i5;
            requestLayout();
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        if (this.f1046e != colorStateList) {
            this.f1046e = colorStateList;
            l();
        }
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.f1047f != mode) {
            this.f1047f = mode;
            l();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f5) {
        super.setTranslationX(f5);
        getImpl().n();
    }

    @Override // android.view.View
    public void setTranslationY(float f5) {
        super.setTranslationY(f5);
        getImpl().n();
    }

    @Override // android.view.View
    public void setTranslationZ(float f5) {
        super.setTranslationZ(f5);
        getImpl().n();
    }

    public void setUseCompatPadding(boolean z4) {
        if (this.f1053l != z4) {
            this.f1053l = z4;
            getImpl().j();
        }
    }

    @Override // v1.s, android.widget.ImageView, android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
    }
}
