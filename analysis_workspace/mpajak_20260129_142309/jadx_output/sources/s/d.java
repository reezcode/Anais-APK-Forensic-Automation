package s;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public interface d {
    void a();

    @NonNull
    Bitmap b(int i5, int i6, Bitmap.Config config);

    @NonNull
    Bitmap c(int i5, int i6, Bitmap.Config config);

    void d(Bitmap bitmap);

    void trimMemory(int i5);
}
