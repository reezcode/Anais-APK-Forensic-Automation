package y;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes14.dex */
public final class q extends f {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f6011b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(p.f.f4612a);

    @Override // p.f
    public final void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f6011b);
    }

    @Override // y.f
    public final Bitmap c(@NonNull s.d dVar, @NonNull Bitmap bitmap, int i5, int i6) {
        return a0.b(dVar, bitmap, i5, i6);
    }

    @Override // p.f
    public final boolean equals(Object obj) {
        return obj instanceof q;
    }

    @Override // p.f
    public final int hashCode() {
        return 1572326941;
    }
}
