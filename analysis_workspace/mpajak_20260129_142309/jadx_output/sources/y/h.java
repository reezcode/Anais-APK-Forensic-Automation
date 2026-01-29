package y;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

@RequiresApi(api = 28)
/* loaded from: classes12.dex */
public final class h implements p.j<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final d f5981a = new d();

    @Override // p.j
    public final /* bridge */ /* synthetic */ boolean a(@NonNull ByteBuffer byteBuffer, @NonNull p.h hVar) {
        return true;
    }

    @Override // p.j
    @Nullable
    public final r.w<Bitmap> b(@NonNull ByteBuffer byteBuffer, int i5, int i6, @NonNull p.h hVar) {
        return this.f5981a.b(ImageDecoder.createSource(byteBuffer), i5, i6, hVar);
    }
}
