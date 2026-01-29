package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;
import r.m;

/* loaded from: classes8.dex */
public final class d extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    @VisibleForTesting
    public static final j<?, ?> f553k = new a();

    /* renamed from: a, reason: collision with root package name */
    public final s.b f554a;

    /* renamed from: b, reason: collision with root package name */
    public final g f555b;

    /* renamed from: c, reason: collision with root package name */
    public final i.g f556c;

    /* renamed from: d, reason: collision with root package name */
    public final b.a f557d;

    /* renamed from: e, reason: collision with root package name */
    public final List<h0.e<Object>> f558e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<Class<?>, j<?, ?>> f559f;

    /* renamed from: g, reason: collision with root package name */
    public final m f560g;

    /* renamed from: h, reason: collision with root package name */
    public final e f561h;

    /* renamed from: i, reason: collision with root package name */
    public final int f562i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    public h0.f f563j;

    public d(@NonNull Context context, @NonNull s.b bVar, @NonNull g gVar, @NonNull i.g gVar2, @NonNull b.a aVar, @NonNull Map<Class<?>, j<?, ?>> map, @NonNull List<h0.e<Object>> list, @NonNull m mVar, @NonNull e eVar, int i5) {
        super(context.getApplicationContext());
        this.f554a = bVar;
        this.f555b = gVar;
        this.f556c = gVar2;
        this.f557d = aVar;
        this.f558e = list;
        this.f559f = map;
        this.f560g = mVar;
        this.f561h = eVar;
        this.f562i = i5;
    }
}
