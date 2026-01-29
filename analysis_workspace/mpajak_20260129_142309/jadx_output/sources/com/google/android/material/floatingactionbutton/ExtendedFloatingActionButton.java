package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import f1.h;
import i.g;
import java.util.List;
import v1.e;

/* loaded from: classes17.dex */
public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.AttachedBehavior {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f1039r = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1040q;

    /* loaded from: classes19.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a, reason: collision with root package name */
        public Rect f1041a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1042b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1043c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f1042b = false;
            this.f1043c = true;
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f3205k);
            this.f1042b = obtainStyledAttributes.getBoolean(0, false);
            this.f1043c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        public final boolean a(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f1042b || this.f1043c) && ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams()).getAnchorId() == view.getId();
        }

        public final boolean b(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!a(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f1041a == null) {
                this.f1041a = new Rect();
            }
            Rect rect = this.f1041a;
            e.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                int i5 = ExtendedFloatingActionButton.f1039r;
                throw null;
            }
            int i6 = ExtendedFloatingActionButton.f1039r;
            throw null;
        }

        public final boolean c(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!a(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                int i5 = ExtendedFloatingActionButton.f1039r;
                throw null;
            }
            int i6 = ExtendedFloatingActionButton.f1039r;
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean getInsetDodgeRect(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, (ExtendedFloatingActionButton) view, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
            if (layoutParams.dodgeInsetEdges == 0) {
                layoutParams.dodgeInsetEdges = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, @NonNull View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                b(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) {
                    c(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i5) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i6 = 0; i6 < size; i6++) {
                View view2 = dependencies.get(i6);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.LayoutParams ? ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) && c(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (b(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i5);
            return true;
        }
    }

    /* loaded from: classes10.dex */
    public class a extends Property<View, Float> {
        public a() {
            super(Float.class, "width");
        }

        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f5) {
            View view2 = view;
            view2.getLayoutParams().width = f5.intValue();
            view2.requestLayout();
        }
    }

    /* loaded from: classes6.dex */
    public class b extends Property<View, Float> {
        public b() {
            super(Float.class, "height");
        }

        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f5) {
            View view2 = view;
            view2.getLayoutParams().height = f5.intValue();
            view2.requestLayout();
        }
    }

    /* loaded from: classes16.dex */
    public class c extends Property<View, Float> {
        public c() {
            super(Float.class, "paddingStart");
        }

        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            return Float.valueOf(ViewCompat.getPaddingStart(view));
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f5) {
            View view2 = view;
            ViewCompat.setPaddingRelative(view2, f5.intValue(), view2.getPaddingTop(), ViewCompat.getPaddingEnd(view2), view2.getPaddingBottom());
        }
    }

    /* loaded from: classes15.dex */
    public class d extends Property<View, Float> {
        public d() {
            super(Float.class, "paddingEnd");
        }

        @Override // android.util.Property
        @NonNull
        public final Float get(@NonNull View view) {
            return Float.valueOf(ViewCompat.getPaddingEnd(view));
        }

        @Override // android.util.Property
        public final void set(@NonNull View view, @NonNull Float f5) {
            View view2 = view;
            ViewCompat.setPaddingRelative(view2, ViewCompat.getPaddingStart(view2), view2.getPaddingTop(), f5.intValue(), view2.getPaddingBottom());
        }
    }

    static {
        new a();
        new b();
        new c();
        new d();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NonNull
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @VisibleForTesting
    public int getCollapsedSize() {
        return 0;
    }

    @Nullable
    public h getExtendMotionSpec() {
        throw null;
    }

    @Nullable
    public h getHideMotionSpec() {
        throw null;
    }

    @Nullable
    public h getShowMotionSpec() {
        throw null;
    }

    @Nullable
    public h getShrinkMotionSpec() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setAnimateShowBeforeLayout(boolean z4) {
        this.f1040q = z4;
    }

    public void setExtendMotionSpec(@Nullable h hVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(@AnimatorRes int i5) {
        setExtendMotionSpec(h.a(getContext(), i5));
    }

    public void setExtended(boolean z4) {
        if (z4) {
            throw null;
        }
    }

    public void setHideMotionSpec(@Nullable h hVar) {
        throw null;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i5) {
        setHideMotionSpec(h.a(getContext(), i5));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i5, int i6, int i7, int i8) {
        super.setPadding(i5, i6, i7, i8);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i5, int i6, int i7, int i8) {
        super.setPaddingRelative(i5, i6, i7, i8);
    }

    public void setShowMotionSpec(@Nullable h hVar) {
        throw null;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i5) {
        setShowMotionSpec(h.a(getContext(), i5));
    }

    public void setShrinkMotionSpec(@Nullable h hVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(@AnimatorRes int i5) {
        setShrinkMotionSpec(h.a(getContext(), i5));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i5) {
        super.setTextColor(i5);
        getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }
}
