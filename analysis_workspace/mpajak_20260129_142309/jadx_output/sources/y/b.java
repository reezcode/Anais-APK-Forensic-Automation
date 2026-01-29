package y;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.File;

/* loaded from: classes25.dex */
public final class b implements p.k<BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    public final s.d f5962a;

    /* renamed from: b, reason: collision with root package name */
    public final p.k<Bitmap> f5963b;

    public b(s.d dVar, p.k<Bitmap> kVar) {
        this.f5962a = dVar;
        this.f5963b = kVar;
    }

    @Override // p.d
    public final boolean a(@NonNull Object obj, @NonNull File file, @NonNull p.h hVar) {
        return this.f5963b.a(new e(((BitmapDrawable) ((r.w) obj).get()).getBitmap(), this.f5962a), file, hVar);
    }

    @Override // p.k
    @NonNull
    public final p.c b(@NonNull p.h hVar) {
        return this.f5963b.b(hVar);
    }
}
