package y;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.RequiresApi;

@RequiresApi(api = 28)
/* loaded from: classes5.dex */
public final class d extends x.a<Bitmap> {

    /* renamed from: b, reason: collision with root package name */
    public final s.e f5976b = new s.e();

    @Override // x.a
    public final r.w<Bitmap> c(ImageDecoder.Source source, int i5, int i6, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder g5 = androidx.activity.d.g("Decoded [");
            g5.append(decodeBitmap.getWidth());
            g5.append("x");
            g5.append(decodeBitmap.getHeight());
            g5.append("] for [");
            g5.append(i5);
            g5.append("x");
            g5.append(i6);
            g5.append("]");
            Log.v("BitmapImageDecoder", g5.toString());
        }
        return new e(decodeBitmap, this.f5976b);
    }
}
