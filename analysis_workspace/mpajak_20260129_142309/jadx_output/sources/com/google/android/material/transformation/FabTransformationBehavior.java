package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import f1.h;
import f1.i;
import f1.j;
import java.util.Objects;

@Deprecated
/* loaded from: classes10.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f1346c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f1347d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f1348e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f1349f;

    /* renamed from: g, reason: collision with root package name */
    public float f1350g;

    /* renamed from: h, reason: collision with root package name */
    public float f1351h;

    /* loaded from: classes25.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f1352a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f1353b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f1354c;

        public a(boolean z4, View view, View view2) {
            this.f1352a = z4;
            this.f1353b = view;
            this.f1354c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f1352a) {
                return;
            }
            this.f1353b.setVisibility(4);
            this.f1354c.setAlpha(1.0f);
            this.f1354c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f1352a) {
                this.f1353b.setVisibility(0);
                this.f1354c.setAlpha(0.0f);
                this.f1354c.setVisibility(4);
            }
        }
    }

    /* loaded from: classes24.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public h f1355a;

        /* renamed from: b, reason: collision with root package name */
        public j f1356b;
    }

    public FabTransformationBehavior() {
        this.f1346c = new Rect();
        this.f1347d = new RectF();
        this.f1348e = new RectF();
        this.f1349f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1346c = new Rect();
        this.f1347d = new RectF();
        this.f1348e = new RectF();
        this.f1349f = new int[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03cd A[LOOP:0: B:41:0x03cb->B:42:0x03cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0194  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.AnimatorSet b(@androidx.annotation.NonNull android.view.View r27, @androidx.annotation.NonNull android.view.View r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.b(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final void c(@NonNull View view, @NonNull RectF rectF) {
        h(view, rectF);
        rectF.offset(this.f1350g, this.f1351h);
    }

    @NonNull
    public final Pair<i, i> d(float f5, float f6, boolean z4, @NonNull b bVar) {
        i c5;
        h hVar;
        String str;
        if (f5 == 0.0f || f6 == 0.0f) {
            c5 = bVar.f1355a.c("translationXLinear");
            hVar = bVar.f1355a;
            str = "translationYLinear";
        } else if ((!z4 || f6 >= 0.0f) && (z4 || f6 <= 0.0f)) {
            c5 = bVar.f1355a.c("translationXCurveDownwards");
            hVar = bVar.f1355a;
            str = "translationYCurveDownwards";
        } else {
            c5 = bVar.f1355a.c("translationXCurveUpwards");
            hVar = bVar.f1355a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(c5, hVar.c(str));
    }

    public final float e(@NonNull View view, @NonNull View view2, @NonNull j jVar) {
        RectF rectF = this.f1347d;
        RectF rectF2 = this.f1348e;
        c(view, rectF);
        h(view2, rectF2);
        Objects.requireNonNull(jVar);
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float f(@NonNull View view, @NonNull View view2, @NonNull j jVar) {
        RectF rectF = this.f1347d;
        RectF rectF2 = this.f1348e;
        c(view, rectF);
        h(view2, rectF2);
        Objects.requireNonNull(jVar);
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final float g(@NonNull b bVar, @NonNull i iVar, float f5) {
        long j5 = iVar.f2781a;
        long j6 = iVar.f2782b;
        i c5 = bVar.f1355a.c("expansion");
        float interpolation = iVar.b().getInterpolation((((c5.f2781a + c5.f2782b) + 17) - j5) / j6);
        LinearInterpolator linearInterpolator = f1.a.f2767a;
        return androidx.appcompat.graphics.drawable.a.a(0.0f, f5, interpolation, f5);
    }

    public final void h(@NonNull View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f1349f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract b i(Context context, boolean z4);

    @Nullable
    public final ViewGroup j(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public final boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public final void onAttachedToLayoutParams(@NonNull CoordinatorLayout.LayoutParams layoutParams) {
        if (layoutParams.dodgeInsetEdges == 0) {
            layoutParams.dodgeInsetEdges = 80;
        }
    }
}
