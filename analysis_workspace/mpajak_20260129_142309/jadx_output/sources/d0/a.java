package d0;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import p.h;
import r.w;

/* loaded from: classes6.dex */
public final class a implements e<Bitmap, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap.CompressFormat f2462a = Bitmap.CompressFormat.JPEG;

    /* renamed from: b, reason: collision with root package name */
    public final int f2463b = 100;

    @Override // d0.e
    @Nullable
    public final w<byte[]> a(@NonNull w<Bitmap> wVar, @NonNull h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        wVar.get().compress(this.f2462a, this.f2463b, byteArrayOutputStream);
        wVar.recycle();
        return new z.b(byteArrayOutputStream.toByteArray());
    }
}
