package a0;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p.h;
import p.j;
import r.w;

/* loaded from: classes11.dex */
public final class e implements j<Drawable, Drawable> {
    @Override // p.j
    public final /* bridge */ /* synthetic */ boolean a(@NonNull Drawable drawable, @NonNull h hVar) {
        return true;
    }

    @Override // p.j
    @Nullable
    public final w<Drawable> b(@NonNull Drawable drawable, int i5, int i6, @NonNull h hVar) {
        Drawable drawable2 = drawable;
        if (drawable2 != null) {
            return new c(drawable2);
        }
        return null;
    }
}
