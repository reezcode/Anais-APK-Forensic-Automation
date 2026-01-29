package y;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes11.dex */
public final class i extends f {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f5982b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(p.f.f4612a);

    @Override // p.f
    public final void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f5982b);
    }

    @Override // y.f
    public final Bitmap c(@NonNull s.d dVar, @NonNull Bitmap bitmap, int i5, int i6) {
        float width;
        float height;
        Paint paint = a0.f5959a;
        if (bitmap.getWidth() == i5 && bitmap.getHeight() == i6) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f5 = 0.0f;
        if (bitmap.getWidth() * i6 > bitmap.getHeight() * i5) {
            width = i6 / bitmap.getHeight();
            f5 = (i5 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i5 / bitmap.getWidth();
            height = (i6 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (height + 0.5f));
        Bitmap c5 = dVar.c(i5, i6, a0.d(bitmap));
        c5.setHasAlpha(bitmap.hasAlpha());
        a0.a(bitmap, c5, matrix);
        return c5;
    }

    @Override // p.f
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // p.f
    public final int hashCode() {
        return -599754482;
    }
}
