package y;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes19.dex */
public final class x implements p.j<Uri, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final a0.d f6039a;

    /* renamed from: b, reason: collision with root package name */
    public final s.d f6040b;

    public x(a0.d dVar, s.d dVar2) {
        this.f6039a = dVar;
        this.f6040b = dVar2;
    }

    @Override // p.j
    public final boolean a(@NonNull Uri uri, @NonNull p.h hVar) {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // p.j
    @Nullable
    public final r.w<Bitmap> b(@NonNull Uri uri, int i5, int i6, @NonNull p.h hVar) {
        r.w<Drawable> b5 = this.f6039a.b(uri, i5, i6, hVar);
        if (b5 == null) {
            return null;
        }
        return n.a(this.f6040b, (Drawable) ((a0.b) b5).get(), i5, i6);
    }
}
