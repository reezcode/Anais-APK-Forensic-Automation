package i0;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes6.dex */
public final class b extends e<Bitmap> {
    public b(ImageView imageView) {
        super(imageView);
    }

    @Override // i0.e
    public final void k(Bitmap bitmap) {
        ((ImageView) this.f3250b).setImageBitmap(bitmap);
    }
}
