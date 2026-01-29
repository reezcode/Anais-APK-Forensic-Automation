package y;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes21.dex */
public final class e implements r.w<Bitmap>, r.s {

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f5978b;

    /* renamed from: c, reason: collision with root package name */
    public final s.d f5979c;

    public e(@NonNull Bitmap bitmap, @NonNull s.d dVar) {
        Objects.requireNonNull(bitmap, "Bitmap must not be null");
        this.f5978b = bitmap;
        Objects.requireNonNull(dVar, "BitmapPool must not be null");
        this.f5979c = dVar;
    }

    @Nullable
    public static e c(@Nullable Bitmap bitmap, @NonNull s.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, dVar);
    }

    @Override // r.s
    public final void a() {
        this.f5978b.prepareToDraw();
    }

    @Override // r.w
    @NonNull
    public final Class<Bitmap> b() {
        return Bitmap.class;
    }

    @Override // r.w
    @NonNull
    public final Bitmap get() {
        return this.f5978b;
    }

    @Override // r.w
    public final int getSize() {
        return l0.k.d(this.f5978b);
    }

    @Override // r.w
    public final void recycle() {
        this.f5979c.d(this.f5978b);
    }
}
