package a0;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* loaded from: classes16.dex */
public final class c extends b<Drawable> {
    public c(Drawable drawable) {
        super(drawable);
    }

    @Override // r.w
    @NonNull
    public final Class<Drawable> b() {
        return this.f22b.getClass();
    }

    @Override // r.w
    public final int getSize() {
        return Math.max(1, this.f22b.getIntrinsicHeight() * this.f22b.getIntrinsicWidth() * 4);
    }

    @Override // r.w
    public final void recycle() {
    }
}
