package d0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p.h;
import r.w;
import y.u;

/* loaded from: classes25.dex */
public final class b implements e<Bitmap, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f2464a;

    public b(@NonNull Resources resources) {
        this.f2464a = resources;
    }

    @Override // d0.e
    @Nullable
    public final w<BitmapDrawable> a(@NonNull w<Bitmap> wVar, @NonNull h hVar) {
        return u.c(this.f2464a, wVar);
    }
}
