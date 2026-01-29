package y;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes10.dex */
public final class j extends f {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f5983b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(p.f.f4612a);

    @Override // p.f
    public final void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f5983b);
    }

    @Override // y.f
    public final Bitmap c(@NonNull s.d dVar, @NonNull Bitmap bitmap, int i5, int i6) {
        Paint paint = a0.f5959a;
        if (bitmap.getWidth() > i5 || bitmap.getHeight() > i6) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return a0.b(dVar, bitmap, i5, i6);
        }
        if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        }
        Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        return bitmap;
    }

    @Override // p.f
    public final boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // p.f
    public final int hashCode() {
        return -670243078;
    }
}
