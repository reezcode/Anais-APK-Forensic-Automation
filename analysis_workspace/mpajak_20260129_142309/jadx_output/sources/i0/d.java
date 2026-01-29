package i0;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* loaded from: classes13.dex */
public final class d extends e<Drawable> {
    public d(ImageView imageView) {
        super(imageView);
    }

    @Override // i0.e
    public final void k(@Nullable Drawable drawable) {
        ((ImageView) this.f3250b).setImageDrawable(drawable);
    }
}
