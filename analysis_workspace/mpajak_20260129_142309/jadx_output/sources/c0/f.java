package c0;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Objects;
import p.l;
import r.w;

/* loaded from: classes16.dex */
public final class f implements l<c> {

    /* renamed from: b, reason: collision with root package name */
    public final l<Bitmap> f483b;

    public f(l<Bitmap> lVar) {
        Objects.requireNonNull(lVar, "Argument must not be null");
        this.f483b = lVar;
    }

    @Override // p.f
    public final void a(@NonNull MessageDigest messageDigest) {
        this.f483b.a(messageDigest);
    }

    @Override // p.l
    @NonNull
    public final w<c> b(@NonNull Context context, @NonNull w<c> wVar, int i5, int i6) {
        c cVar = wVar.get();
        w<Bitmap> eVar = new y.e(cVar.b(), com.bumptech.glide.b.b(context).f529b);
        w<Bitmap> b5 = this.f483b.b(context, eVar, i5, i6);
        if (!eVar.equals(b5)) {
            eVar.recycle();
        }
        Bitmap bitmap = b5.get();
        cVar.f471b.f482a.c(this.f483b, bitmap);
        return wVar;
    }

    @Override // p.f
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f483b.equals(((f) obj).f483b);
        }
        return false;
    }

    @Override // p.f
    public final int hashCode() {
        return this.f483b.hashCode();
    }
}
