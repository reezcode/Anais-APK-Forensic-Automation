package y;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes5.dex */
public final class o implements p.l<Drawable> {

    /* renamed from: b, reason: collision with root package name */
    public final p.l<Bitmap> f6009b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6010c;

    public o(p.l<Bitmap> lVar, boolean z4) {
        this.f6009b = lVar;
        this.f6010c = z4;
    }

    @Override // p.f
    public final void a(@NonNull MessageDigest messageDigest) {
        this.f6009b.a(messageDigest);
    }

    @Override // p.l
    @NonNull
    public final r.w<Drawable> b(@NonNull Context context, @NonNull r.w<Drawable> wVar, int i5, int i6) {
        s.d dVar = com.bumptech.glide.b.b(context).f529b;
        Drawable drawable = wVar.get();
        r.w<Bitmap> a5 = n.a(dVar, drawable, i5, i6);
        if (a5 != null) {
            r.w<Bitmap> b5 = this.f6009b.b(context, a5, i5, i6);
            if (!b5.equals(a5)) {
                return u.c(context.getResources(), b5);
            }
            b5.recycle();
            return wVar;
        }
        if (!this.f6010c) {
            return wVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p.f
    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f6009b.equals(((o) obj).f6009b);
        }
        return false;
    }

    @Override // p.f
    public final int hashCode() {
        return this.f6009b.hashCode();
    }
}
