package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Rect f929a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f930b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f931c;

    /* renamed from: d, reason: collision with root package name */
    public final ColorStateList f932d;

    /* renamed from: e, reason: collision with root package name */
    public final int f933e;

    /* renamed from: f, reason: collision with root package name */
    public final b2.k f934f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i5, b2.k kVar, @NonNull Rect rect) {
        Preconditions.checkArgumentNonnegative(rect.left);
        Preconditions.checkArgumentNonnegative(rect.top);
        Preconditions.checkArgumentNonnegative(rect.right);
        Preconditions.checkArgumentNonnegative(rect.bottom);
        this.f929a = rect;
        this.f930b = colorStateList2;
        this.f931c = colorStateList;
        this.f932d = colorStateList3;
        this.f933e = i5;
        this.f934f = kVar;
    }

    @NonNull
    public static b a(@NonNull Context context, @StyleRes int i5) {
        Preconditions.checkArgument(i5 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i5, i.g.f3213s);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList a5 = y1.c.a(context, obtainStyledAttributes, 4);
        ColorStateList a6 = y1.c.a(context, obtainStyledAttributes, 9);
        ColorStateList a7 = y1.c.a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        b2.k a8 = b2.k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new b2.a(0)).a();
        obtainStyledAttributes.recycle();
        return new b(a5, a6, a7, dimensionPixelSize, a8, rect);
    }

    public final void b(@NonNull TextView textView) {
        b2.g gVar = new b2.g();
        b2.g gVar2 = new b2.g();
        gVar.setShapeAppearanceModel(this.f934f);
        gVar2.setShapeAppearanceModel(this.f934f);
        gVar.o(this.f931c);
        gVar.r(this.f933e, this.f932d);
        textView.setTextColor(this.f930b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f930b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f929a;
        ViewCompat.setBackground(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
