package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewCompat;
import b2.g;
import b2.i;
import b2.k;
import comeliest.metempsychosis.pokelogan.R;
import java.util.Objects;

/* loaded from: classes17.dex */
public class a extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    public final RunnableC0024a f1334b;

    /* renamed from: c, reason: collision with root package name */
    public int f1335c;

    /* renamed from: d, reason: collision with root package name */
    public g f1336d;

    /* renamed from: com.google.android.material.timepicker.a$a, reason: collision with other inner class name */
    /* loaded from: classes22.dex */
    public class RunnableC0024a implements Runnable {
        public RunnableC0024a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.b();
        }
    }

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        g gVar = new g();
        this.f1336d = gVar;
        i iVar = new i(0.5f);
        k kVar = gVar.f324b.f347a;
        Objects.requireNonNull(kVar);
        k.a aVar = new k.a(kVar);
        aVar.f385e = iVar;
        aVar.f386f = iVar;
        aVar.f387g = iVar;
        aVar.f388h = iVar;
        gVar.setShapeAppearanceModel(new k(aVar));
        this.f1336d.o(ColorStateList.valueOf(-1));
        ViewCompat.setBackground(this, this.f1336d);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.g.f3220z, i5, 0);
        this.f1335c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1334b = new RunnableC0024a();
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i5, layoutParams);
        if (view.getId() == -1) {
            view.setId(ViewCompat.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f1334b);
            handler.post(this.f1334b);
        }
    }

    public final void b() {
        int childCount = getChildCount();
        int i5 = 1;
        for (int i6 = 0; i6 < childCount; i6++) {
            if ("skip".equals(getChildAt(i6).getTag())) {
                i5++;
            }
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        float f5 = 0.0f;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                constraintSet.constrainCircle(childAt.getId(), R.id.circle_center, this.f1335c, f5);
                f5 = (360.0f / (childCount - i5)) + f5;
            }
        }
        constraintSet.applyTo(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        b();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f1334b);
            handler.post(this.f1334b);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(@ColorInt int i5) {
        this.f1336d.o(ColorStateList.valueOf(i5));
    }
}
