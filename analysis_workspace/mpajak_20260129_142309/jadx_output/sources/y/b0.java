package y;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public final class b0 implements p.j<Bitmap, Bitmap> {

    /* loaded from: classes18.dex */
    public static final class a implements r.w<Bitmap> {

        /* renamed from: b, reason: collision with root package name */
        public final Bitmap f5964b;

        public a(@NonNull Bitmap bitmap) {
            this.f5964b = bitmap;
        }

        @Override // r.w
        @NonNull
        public final Class<Bitmap> b() {
            return Bitmap.class;
        }

        @Override // r.w
        @NonNull
        public final Bitmap get() {
            return this.f5964b;
        }

        @Override // r.w
        public final int getSize() {
            return l0.k.d(this.f5964b);
        }

        @Override // r.w
        public final void recycle() {
        }
    }

    @Override // p.j
    public final /* bridge */ /* synthetic */ boolean a(@NonNull Bitmap bitmap, @NonNull p.h hVar) {
        return true;
    }

    @Override // p.j
    public final r.w<Bitmap> b(@NonNull Bitmap bitmap, int i5, int i6, @NonNull p.h hVar) {
        return new a(bitmap);
    }
}
