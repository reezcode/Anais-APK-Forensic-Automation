package y;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.concurrent.locks.Lock;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6008a = new a();

    /* loaded from: classes14.dex */
    public class a extends s.e {
        @Override // s.e, s.d
        public final void d(Bitmap bitmap) {
        }
    }

    @Nullable
    public static r.w<Bitmap> a(s.d dVar, Drawable drawable, int i5, int i6) {
        StringBuilder sb;
        String str;
        Drawable current = drawable.getCurrent();
        boolean z4 = false;
        Bitmap bitmap = null;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i5 != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i6 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i5 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i6 = current.getIntrinsicHeight();
                    }
                    Lock lock = a0.f5961c;
                    lock.lock();
                    Bitmap c5 = dVar.c(i5, i6, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(c5);
                        current.setBounds(0, 0, i5, i6);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = c5;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb = new StringBuilder();
                    sb.append("Unable to draw ");
                    sb.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height";
                    sb.append(str);
                    Log.w("DrawableToBitmap", sb.toString());
                }
                z4 = true;
            } else {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb = new StringBuilder();
                    sb.append("Unable to draw ");
                    sb.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width";
                    sb.append(str);
                    Log.w("DrawableToBitmap", sb.toString());
                }
                z4 = true;
            }
        }
        if (!z4) {
            dVar = f6008a;
        }
        return e.c(bitmap, dVar);
    }
}
