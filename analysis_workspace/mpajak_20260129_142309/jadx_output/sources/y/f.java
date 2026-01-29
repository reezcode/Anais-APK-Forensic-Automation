package y;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* loaded from: classes11.dex */
public abstract class f implements p.l<Bitmap> {
    @Override // p.l
    @NonNull
    public final r.w<Bitmap> b(@NonNull Context context, @NonNull r.w<Bitmap> wVar, int i5, int i6) {
        if (!l0.k.j(i5, i6)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i5 + " or height: " + i6 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        s.d dVar = com.bumptech.glide.b.b(context).f529b;
        Bitmap bitmap = wVar.get();
        if (i5 == Integer.MIN_VALUE) {
            i5 = bitmap.getWidth();
        }
        if (i6 == Integer.MIN_VALUE) {
            i6 = bitmap.getHeight();
        }
        Bitmap c5 = c(dVar, bitmap, i5, i6);
        return bitmap.equals(c5) ? wVar : e.c(c5, dVar);
    }

    public abstract Bitmap c(@NonNull s.d dVar, @NonNull Bitmap bitmap, int i5, int i6);
}
