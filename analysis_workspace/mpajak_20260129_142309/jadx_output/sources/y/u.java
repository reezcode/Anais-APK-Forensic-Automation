package y;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes18.dex */
public final class u implements r.w<BitmapDrawable>, r.s {

    /* renamed from: b, reason: collision with root package name */
    public final Resources f6030b;

    /* renamed from: c, reason: collision with root package name */
    public final r.w<Bitmap> f6031c;

    public u(@NonNull Resources resources, @NonNull r.w<Bitmap> wVar) {
        Objects.requireNonNull(resources, "Argument must not be null");
        this.f6030b = resources;
        Objects.requireNonNull(wVar, "Argument must not be null");
        this.f6031c = wVar;
    }

    @Nullable
    public static r.w<BitmapDrawable> c(@NonNull Resources resources, @Nullable r.w<Bitmap> wVar) {
        if (wVar == null) {
            return null;
        }
        return new u(resources, wVar);
    }

    @Override // r.s
    public final void a() {
        r.w<Bitmap> wVar = this.f6031c;
        if (wVar instanceof r.s) {
            ((r.s) wVar).a();
        }
    }

    @Override // r.w
    @NonNull
    public final Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    @Override // r.w
    @NonNull
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.f6030b, this.f6031c.get());
    }

    @Override // r.w
    public final int getSize() {
        return this.f6031c.getSize();
    }

    @Override // r.w
    public final void recycle() {
        this.f6031c.recycle();
    }
}
