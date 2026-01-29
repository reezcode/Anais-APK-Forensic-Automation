package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import comeliest.metempsychosis.pokelogan.R;
import i.g;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import v1.f;
import v1.h;
import v1.m;

/* loaded from: classes3.dex */
public class ChipGroup extends f {

    /* renamed from: f, reason: collision with root package name */
    @Dimension
    public int f879f;

    /* renamed from: g, reason: collision with root package name */
    @Dimension
    public int f880g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public d f881h;

    /* renamed from: i, reason: collision with root package name */
    public final v1.b<Chip> f882i;

    /* renamed from: j, reason: collision with root package name */
    public final int f883j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final e f884k;

    /* loaded from: classes22.dex */
    public class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f885a;

        public a(c cVar) {
            this.f885a = cVar;
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public b() {
            super(-2, -2);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Deprecated
    /* loaded from: classes10.dex */
    public interface c {
        void a();
    }

    /* loaded from: classes24.dex */
    public interface d {
    }

    /* loaded from: classes8.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f887b;

        public e() {
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, T extends v1.h<T>>] */
        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(ViewCompat.generateViewId());
                }
                v1.b<Chip> bVar = ChipGroup.this.f882i;
                Chip chip = (Chip) view2;
                bVar.f5559a.put(Integer.valueOf(chip.getId()), chip);
                if (chip.isChecked()) {
                    bVar.a(chip);
                }
                chip.setInternalOnCheckedChangeListener(new v1.a(bVar));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f887b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.Integer, T extends v1.h<T>>] */
        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                v1.b<Chip> bVar = chipGroup.f882i;
                Chip chip = (Chip) view2;
                Objects.requireNonNull(bVar);
                chip.setInternalOnCheckedChangeListener(null);
                bVar.f5559a.remove(Integer.valueOf(chip.getId()));
                bVar.f5560b.remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f887b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(f2.a.a(context, attributeSet, R.attr.chipGroupStyle, 2131755979), attributeSet, R.attr.chipGroupStyle);
        v1.b<Chip> bVar = new v1.b<>();
        this.f882i = bVar;
        e eVar = new e();
        this.f884k = eVar;
        TypedArray d5 = m.d(getContext(), attributeSet, g.f3202h, R.attr.chipGroupStyle, 2131755979, new int[0]);
        int dimensionPixelOffset = d5.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(d5.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(d5.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(d5.getBoolean(5, false));
        setSingleSelection(d5.getBoolean(6, false));
        setSelectionRequired(d5.getBoolean(4, false));
        this.f883j = d5.getResourceId(0, -1);
        d5.recycle();
        bVar.f5561c = new com.google.android.material.chip.b(this);
        super.setOnHierarchyChangeListener(eVar);
        ViewCompat.setImportantForAccessibility(this, 1);
    }

    private int getChipCount() {
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if (getChildAt(i6) instanceof Chip) {
                i5++;
            }
        }
        return i5;
    }

    @Override // v1.f
    public final boolean a() {
        return this.f5595d;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.view.ViewGroup
    @NonNull
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    @IdRes
    public int getCheckedChipId() {
        return this.f882i.c();
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        return this.f882i.b(this);
    }

    @Dimension
    public int getChipSpacingHorizontal() {
        return this.f879f;
    }

    @Dimension
    public int getChipSpacingVertical() {
        return this.f880g;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.Integer, T extends v1.h<T>>] */
    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i5 = this.f883j;
        if (i5 != -1) {
            v1.b<Chip> bVar = this.f882i;
            h<Chip> hVar = (h) bVar.f5559a.get(Integer.valueOf(i5));
            if (hVar != null && bVar.a(hVar)) {
                bVar.d();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(getRowCount(), this.f5595d ? getChipCount() : -1, false, this.f882i.f5562d ? 1 : 2));
    }

    public void setChipSpacing(@Dimension int i5) {
        setChipSpacingHorizontal(i5);
        setChipSpacingVertical(i5);
    }

    public void setChipSpacingHorizontal(@Dimension int i5) {
        if (this.f879f != i5) {
            this.f879f = i5;
            setItemSpacing(i5);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@DimenRes int i5) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i5));
    }

    public void setChipSpacingResource(@DimenRes int i5) {
        setChipSpacing(getResources().getDimensionPixelOffset(i5));
    }

    public void setChipSpacingVertical(@Dimension int i5) {
        if (this.f880g != i5) {
            this.f880g = i5;
            setLineSpacing(i5);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@DimenRes int i5) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i5));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i5) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@Nullable c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new a(cVar));
        }
    }

    public void setOnCheckedStateChangeListener(@Nullable d dVar) {
        this.f881h = dVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f884k.f887b = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z4) {
        this.f882i.f5563e = z4;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i5) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i5) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(@BoolRes int i5) {
        setSingleLine(getResources().getBoolean(i5));
    }

    @Override // v1.f
    public void setSingleLine(boolean z4) {
        super.setSingleLine(z4);
    }

    public void setSingleSelection(@BoolRes int i5) {
        setSingleSelection(getResources().getBoolean(i5));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.Integer, T extends v1.h<T>>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public void setSingleSelection(boolean z4) {
        v1.b<Chip> bVar = this.f882i;
        if (bVar.f5562d != z4) {
            bVar.f5562d = z4;
            boolean z5 = !bVar.f5560b.isEmpty();
            Iterator it = bVar.f5559a.values().iterator();
            while (it.hasNext()) {
                bVar.e((h) it.next(), false);
            }
            if (z5) {
                bVar.d();
            }
        }
    }
}
