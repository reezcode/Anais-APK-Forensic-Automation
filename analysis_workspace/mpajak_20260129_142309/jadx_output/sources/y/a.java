package y;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;

/* loaded from: classes20.dex */
public final class a<DataType> implements p.j<DataType, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    public final p.j<DataType, Bitmap> f5957a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f5958b;

    public a(@NonNull Resources resources, @NonNull p.j<DataType, Bitmap> jVar) {
        this.f5958b = resources;
        this.f5957a = jVar;
    }

    @Override // p.j
    public final boolean a(@NonNull DataType datatype, @NonNull p.h hVar) {
        return this.f5957a.a(datatype, hVar);
    }

    @Override // p.j
    public final r.w<BitmapDrawable> b(@NonNull DataType datatype, int i5, int i6, @NonNull p.h hVar) {
        return u.c(this.f5958b, this.f5957a.b(datatype, i5, i6, hVar));
    }
}
