package y;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* loaded from: classes12.dex */
public final class y extends f {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f6041c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(p.f.f4612a);

    /* renamed from: b, reason: collision with root package name */
    public final int f6042b;

    public y(int i5) {
        l0.j.a(i5 > 0, "roundingRadius must be greater than 0.");
        this.f6042b = i5;
    }

    @Override // p.f
    public final void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f6041c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f6042b).array());
    }

    @Override // y.f
    public final Bitmap c(@NonNull s.d dVar, @NonNull Bitmap bitmap, int i5, int i6) {
        Bitmap c5;
        int i7 = this.f6042b;
        Paint paint = a0.f5959a;
        l0.j.a(i7 > 0, "roundingRadius must be greater than 0.");
        Bitmap.Config c6 = a0.c(bitmap);
        Bitmap.Config c7 = a0.c(bitmap);
        if (c7.equals(bitmap.getConfig())) {
            c5 = bitmap;
        } else {
            c5 = dVar.c(bitmap.getWidth(), bitmap.getHeight(), c7);
            new Canvas(c5).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap c8 = dVar.c(c5.getWidth(), c5.getHeight(), c6);
        c8.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(c5, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, c8.getWidth(), c8.getHeight());
        Lock lock = a0.f5961c;
        lock.lock();
        try {
            Canvas canvas = new Canvas(c8);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f5 = i7;
            canvas.drawRoundRect(rectF, f5, f5, paint2);
            canvas.setBitmap(null);
            lock.unlock();
            if (!c5.equals(bitmap)) {
                dVar.d(c5);
            }
            return c8;
        } catch (Throwable th) {
            a0.f5961c.unlock();
            throw th;
        }
    }

    @Override // p.f
    public final boolean equals(Object obj) {
        return (obj instanceof y) && this.f6042b == ((y) obj).f6042b;
    }

    @Override // p.f
    public final int hashCode() {
        int i5 = this.f6042b;
        char[] cArr = l0.k.f3942a;
        return ((i5 + 527) * 31) - 569625254;
    }
}
