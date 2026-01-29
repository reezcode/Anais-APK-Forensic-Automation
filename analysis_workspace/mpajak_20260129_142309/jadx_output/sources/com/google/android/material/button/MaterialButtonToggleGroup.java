package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import b2.k;
import com.google.android.material.button.MaterialButton;
import comeliest.metempsychosis.pokelogan.R;
import i.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import v1.m;
import v1.r;

/* loaded from: classes20.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f835l = 0;

    /* renamed from: b, reason: collision with root package name */
    public final List<c> f836b;

    /* renamed from: c, reason: collision with root package name */
    public final e f837c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet<d> f838d;

    /* renamed from: e, reason: collision with root package name */
    public final Comparator<MaterialButton> f839e;

    /* renamed from: f, reason: collision with root package name */
    public Integer[] f840f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f841g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f842h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f843i;

    /* renamed from: j, reason: collision with root package name */
    @IdRes
    public final int f844j;

    /* renamed from: k, reason: collision with root package name */
    public Set<Integer> f845k;

    /* loaded from: classes9.dex */
    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton3)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton4)));
        }
    }

    /* loaded from: classes8.dex */
    public class b extends AccessibilityDelegateCompat {
        public b() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int i5;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            int i6 = MaterialButtonToggleGroup.f835l;
            Objects.requireNonNull(materialButtonToggleGroup);
            if (view instanceof MaterialButton) {
                int i7 = 0;
                for (int i8 = 0; i8 < materialButtonToggleGroup.getChildCount(); i8++) {
                    if (materialButtonToggleGroup.getChildAt(i8) == view) {
                        i5 = i7;
                        break;
                    }
                    if ((materialButtonToggleGroup.getChildAt(i8) instanceof MaterialButton) && materialButtonToggleGroup.d(i8)) {
                        i7++;
                    }
                }
            }
            i5 = -1;
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, i5, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* loaded from: classes9.dex */
    public static class c {

        /* renamed from: e, reason: collision with root package name */
        public static final b2.a f848e = new b2.a(0.0f);

        /* renamed from: a, reason: collision with root package name */
        public b2.c f849a;

        /* renamed from: b, reason: collision with root package name */
        public b2.c f850b;

        /* renamed from: c, reason: collision with root package name */
        public b2.c f851c;

        /* renamed from: d, reason: collision with root package name */
        public b2.c f852d;

        public c(b2.c cVar, b2.c cVar2, b2.c cVar3, b2.c cVar4) {
            this.f849a = cVar;
            this.f850b = cVar3;
            this.f851c = cVar4;
            this.f852d = cVar2;
        }
    }

    /* loaded from: classes23.dex */
    public interface d {
        void a();
    }

    /* loaded from: classes4.dex */
    public class e implements MaterialButton.b {
        public e() {
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(f2.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f836b = new ArrayList();
        this.f837c = new e();
        this.f838d = new LinkedHashSet<>();
        this.f839e = new a();
        this.f841g = false;
        this.f845k = new HashSet();
        TypedArray d5 = m.d(getContext(), attributeSet, g.f3211q, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(d5.getBoolean(2, false));
        this.f844j = d5.getResourceId(0, -1);
        this.f843i = d5.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        d5.recycle();
        ViewCompat.setImportantForAccessibility(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            if (d(i5)) {
                return i5;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if ((getChildAt(i6) instanceof MaterialButton) && d(i6)) {
                i5++;
            }
        }
        return i5;
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(ViewCompat.generateViewId());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f837c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i5 = firstVisibleChildIndex + 1; i5 < getChildCount(); i5++) {
            MaterialButton c5 = c(i5);
            int min = Math.min(c5.getStrokeWidth(), c(i5 - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = c5.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                MarginLayoutParamsCompat.setMarginEnd(layoutParams2, 0);
                MarginLayoutParamsCompat.setMarginStart(layoutParams2, -min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                MarginLayoutParamsCompat.setMarginStart(layoutParams2, 0);
            }
            c5.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            MarginLayoutParamsCompat.setMarginEnd(layoutParams3, 0);
            MarginLayoutParamsCompat.setMarginStart(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList, java.util.List<com.google.android.material.button.MaterialButtonToggleGroup$c>] */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i5, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f836b.add(new c(shapeAppearanceModel.f373e, shapeAppearanceModel.f376h, shapeAppearanceModel.f374f, shapeAppearanceModel.f375g));
        ViewCompat.setAccessibilityDelegate(materialButton, new b());
    }

    public final void b(@IdRes int i5, boolean z4) {
        if (i5 == -1) {
            Log.e("MaterialButtonToggleGroup", "Button ID is not valid: " + i5);
            return;
        }
        HashSet hashSet = new HashSet(this.f845k);
        if (z4 && !hashSet.contains(Integer.valueOf(i5))) {
            if (this.f842h && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i5));
        } else {
            if (z4 || !hashSet.contains(Integer.valueOf(i5))) {
                return;
            }
            if (!this.f843i || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i5));
            }
        }
        e(hashSet);
    }

    public final MaterialButton c(int i5) {
        return (MaterialButton) getChildAt(i5);
    }

    public final boolean d(int i5) {
        return getChildAt(i5).getVisibility() != 8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@NonNull Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f839e);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            treeMap.put(c(i5), Integer.valueOf(i5));
        }
        this.f840f = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public final void e(Set<Integer> set) {
        ?? r02 = this.f845k;
        this.f845k = new HashSet(set);
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            int id = c(i5).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f841g = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f841g = false;
            }
            if (r02.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator<d> it = this.f838d.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList, java.util.List<com.google.android.material.button.MaterialButtonToggleGroup$c>] */
    @VisibleForTesting
    public final void f() {
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i5 = 0; i5 < childCount; i5++) {
            MaterialButton c5 = c(i5);
            if (c5.getVisibility() != 8) {
                k shapeAppearanceModel = c5.getShapeAppearanceModel();
                Objects.requireNonNull(shapeAppearanceModel);
                k.a aVar = new k.a(shapeAppearanceModel);
                c cVar2 = (c) this.f836b.get(i5);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z4 = getOrientation() == 0;
                    if (i5 == firstVisibleChildIndex) {
                        if (!z4) {
                            b2.c cVar3 = cVar2.f849a;
                            b2.a aVar2 = c.f848e;
                            cVar = new c(cVar3, aVar2, cVar2.f850b, aVar2);
                        } else if (r.a(this)) {
                            b2.a aVar3 = c.f848e;
                            cVar = new c(aVar3, aVar3, cVar2.f850b, cVar2.f851c);
                        } else {
                            b2.c cVar4 = cVar2.f849a;
                            b2.c cVar5 = cVar2.f852d;
                            b2.a aVar4 = c.f848e;
                            cVar = new c(cVar4, cVar5, aVar4, aVar4);
                        }
                    } else if (i5 != lastVisibleChildIndex) {
                        cVar2 = null;
                    } else if (!z4) {
                        b2.a aVar5 = c.f848e;
                        cVar = new c(aVar5, cVar2.f852d, aVar5, cVar2.f851c);
                    } else if (r.a(this)) {
                        b2.c cVar6 = cVar2.f849a;
                        b2.c cVar7 = cVar2.f852d;
                        b2.a aVar6 = c.f848e;
                        cVar = new c(cVar6, cVar7, aVar6, aVar6);
                    } else {
                        b2.a aVar7 = c.f848e;
                        cVar = new c(aVar7, aVar7, cVar2.f850b, cVar2.f851c);
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    aVar.e(0.0f);
                    aVar.f(0.0f);
                    aVar.d(0.0f);
                    aVar.c(0.0f);
                } else {
                    aVar.f385e = cVar2.f849a;
                    aVar.f388h = cVar2.f852d;
                    aVar.f386f = cVar2.f850b;
                    aVar.f387g = cVar2.f851c;
                }
                c5.setShapeAppearanceModel(new k(aVar));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    @IdRes
    public int getCheckedButtonId() {
        if (!this.f842h || this.f845k.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f845k.iterator().next()).intValue();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            int id = c(i5).getId();
            if (this.f845k.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i5, int i6) {
        Integer[] numArr = this.f840f;
        if (numArr != null && i6 < numArr.length) {
            return numArr[i6].intValue();
        }
        Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
        return i6;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i5 = this.f844j;
        if (i5 != -1) {
            e(Collections.singleton(Integer.valueOf(i5)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getVisibleButtonCount(), false, this.f842h ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i5, int i6) {
        f();
        a();
        super.onMeasure(i5, i6);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.google.android.material.button.MaterialButtonToggleGroup$c>] */
    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f836b.remove(indexOfChild);
        }
        f();
        a();
    }

    public void setSelectionRequired(boolean z4) {
        this.f843i = z4;
    }

    public void setSingleSelection(@BoolRes int i5) {
        setSingleSelection(getResources().getBoolean(i5));
    }

    public void setSingleSelection(boolean z4) {
        if (this.f842h != z4) {
            this.f842h = z4;
            e(new HashSet());
        }
    }
}
