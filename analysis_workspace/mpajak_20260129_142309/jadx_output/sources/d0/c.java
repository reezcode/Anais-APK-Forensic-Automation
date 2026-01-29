package d0;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p.h;
import r.w;

/* loaded from: classes13.dex */
public final class c implements e<Drawable, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    public final s.d f2465a;

    /* renamed from: b, reason: collision with root package name */
    public final e<Bitmap, byte[]> f2466b;

    /* renamed from: c, reason: collision with root package name */
    public final e<c0.c, byte[]> f2467c;

    public c(@NonNull s.d dVar, @NonNull e<Bitmap, byte[]> eVar, @NonNull e<c0.c, byte[]> eVar2) {
        this.f2465a = dVar;
        this.f2466b = eVar;
        this.f2467c = eVar2;
    }

    @Override // d0.e
    @Nullable
    public final w<byte[]> a(@NonNull w<Drawable> wVar, @NonNull h hVar) {
        Drawable drawable = wVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f2466b.a(y.e.c(((BitmapDrawable) drawable).getBitmap(), this.f2465a), hVar);
        }
        if (drawable instanceof c0.c) {
            return this.f2467c.a(wVar, hVar);
        }
        return null;
    }
}
