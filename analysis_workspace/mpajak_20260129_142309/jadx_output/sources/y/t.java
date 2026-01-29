package y;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

@RequiresApi(api = 28)
/* loaded from: classes4.dex */
public final class t implements p.j<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final d f6029a = new d();

    @Override // p.j
    public final /* bridge */ /* synthetic */ boolean a(@NonNull InputStream inputStream, @NonNull p.h hVar) {
        return true;
    }

    @Override // p.j
    @Nullable
    public final r.w<Bitmap> b(@NonNull InputStream inputStream, int i5, int i6, @NonNull p.h hVar) {
        InputStream inputStream2 = inputStream;
        AtomicReference<byte[]> atomicReference = l0.a.f3917a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = l0.a.f3917a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream2.read(andSet);
            if (read < 0) {
                l0.a.f3917a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return this.f6029a.b(ImageDecoder.createSource((ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0)), i5, i6, hVar);
            }
            byteArrayOutputStream.write(andSet, 0, read);
        }
    }
}
