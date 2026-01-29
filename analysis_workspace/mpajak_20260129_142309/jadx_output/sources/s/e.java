package s;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class e implements d {
    @Override // s.d
    public final void a() {
    }

    @Override // s.d
    @NonNull
    public final Bitmap b(int i5, int i6, Bitmap.Config config) {
        return Bitmap.createBitmap(i5, i6, config);
    }

    @Override // s.d
    @NonNull
    public final Bitmap c(int i5, int i6, Bitmap.Config config) {
        return Bitmap.createBitmap(i5, i6, config);
    }

    @Override // s.d
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // s.d
    public final void trimMemory(int i5) {
    }
}
