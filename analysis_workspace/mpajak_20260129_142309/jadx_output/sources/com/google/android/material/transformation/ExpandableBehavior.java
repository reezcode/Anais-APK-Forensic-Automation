package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import java.util.List;

@Deprecated
/* loaded from: classes9.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a, reason: collision with root package name */
    public int f1340a;

    /* loaded from: classes5.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f1341b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f1342c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ t1.a f1343d;

        public a(View view, int i5, t1.a aVar) {
            this.f1341b = view;
            this.f1342c = i5;
            this.f1343d = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            this.f1341b.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f1340a == this.f1342c) {
                t1.a aVar = this.f1343d;
                expandableBehavior.a((View) aVar, this.f1341b, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f1340a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1340a = 0;
    }

    public abstract void a(View view, View view2, boolean z4, boolean z5);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i5;
        t1.a aVar = (t1.a) view2;
        if (!(!aVar.a() ? this.f1340a != 1 : !((i5 = this.f1340a) == 0 || i5 == 2))) {
            return false;
        }
        this.f1340a = aVar.a() ? 1 : 2;
        a((View) aVar, view, aVar.a(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public final boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i5) {
        t1.a aVar;
        int i6;
        if (!ViewCompat.isLaidOut(view)) {
            List<View> dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = dependencies.get(i7);
                if (layoutDependsOn(coordinatorLayout, view, view2)) {
                    aVar = (t1.a) view2;
                    break;
                }
                i7++;
            }
            if (aVar != null) {
                if (!aVar.a() ? this.f1340a != 1 : !((i6 = this.f1340a) == 0 || i6 == 2)) {
                    int i8 = aVar.a() ? 1 : 2;
                    this.f1340a = i8;
                    view.getViewTreeObserver().addOnPreDrawListener(new a(view, i8, aVar));
                }
            }
        }
        return false;
    }
}
