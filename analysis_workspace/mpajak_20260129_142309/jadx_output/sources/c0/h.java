package c0;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import r.w;

/* loaded from: classes17.dex */
public final class h implements p.j<o.a, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final s.d f506a;

    public h(s.d dVar) {
        this.f506a = dVar;
    }

    @Override // p.j
    public final /* bridge */ /* synthetic */ boolean a(@NonNull o.a aVar, @NonNull p.h hVar) {
        return true;
    }

    @Override // p.j
    public final w<Bitmap> b(@NonNull o.a aVar, int i5, int i6, @NonNull p.h hVar) {
        return y.e.c(aVar.b(), this.f506a);
    }
}
