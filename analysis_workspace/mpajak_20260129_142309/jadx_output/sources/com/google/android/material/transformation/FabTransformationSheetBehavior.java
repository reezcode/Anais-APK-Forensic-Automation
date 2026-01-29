package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.transformation.FabTransformationBehavior;
import comeliest.metempsychosis.pokelogan.R;
import f1.h;
import f1.j;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes17.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public Map<View, Integer> f1361i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.HashMap, java.util.Map<android.view.View, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.HashMap, java.util.Map<android.view.View, java.lang.Integer>] */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    @CallSuper
    public final void a(@NonNull View view, @NonNull View view2, boolean z4, boolean z5) {
        int intValue;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z4) {
                this.f1361i = new HashMap(childCount);
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = coordinatorLayout.getChildAt(i5);
                boolean z6 = (childAt.getLayoutParams() instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).getBehavior() instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z6) {
                    ?? r5 = this.f1361i;
                    if (z4) {
                        r5.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    } else {
                        intValue = (r5 != 0 && r5.containsKey(childAt)) ? ((Integer) this.f1361i.get(childAt)).intValue() : 4;
                    }
                    ViewCompat.setImportantForAccessibility(childAt, intValue);
                }
            }
            if (!z4) {
                this.f1361i = null;
            }
        }
        super.a(view, view2, z4, z5);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @NonNull
    public final FabTransformationBehavior.b i(Context context, boolean z4) {
        int i5 = z4 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f1355a = h.a(context, i5);
        bVar.f1356b = new j();
        return bVar;
    }
}
