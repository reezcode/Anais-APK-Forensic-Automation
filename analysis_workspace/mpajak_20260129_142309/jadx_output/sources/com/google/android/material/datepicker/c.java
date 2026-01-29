package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import comeliest.metempsychosis.pokelogan.R;

/* loaded from: classes16.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final b f938a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final b f939b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final b f940c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final b f941d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final b f942e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final b f943f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final b f944g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final Paint f945h;

    public c(@NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(y1.b.b(context, R.attr.materialCalendarStyle, h.class.getCanonicalName()), i.g.f3212r);
        this.f938a = b.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f944g = b.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f939b = b.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f940c = b.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList a5 = y1.c.a(context, obtainStyledAttributes, 6);
        this.f941d = b.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f942e = b.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f943f = b.a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f945h = paint;
        paint.setColor(a5.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
