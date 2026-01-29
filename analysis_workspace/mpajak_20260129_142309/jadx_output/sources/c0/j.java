package c0;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import r.w;

/* loaded from: classes4.dex */
public final class j implements p.j<InputStream, c> {

    /* renamed from: a, reason: collision with root package name */
    public final List<ImageHeaderParser> f509a;

    /* renamed from: b, reason: collision with root package name */
    public final p.j<ByteBuffer, c> f510b;

    /* renamed from: c, reason: collision with root package name */
    public final s.b f511c;

    public j(List<ImageHeaderParser> list, p.j<ByteBuffer, c> jVar, s.b bVar) {
        this.f509a = list;
        this.f510b = jVar;
        this.f511c = bVar;
    }

    @Override // p.j
    public final boolean a(@NonNull InputStream inputStream, @NonNull p.h hVar) {
        return !((Boolean) hVar.c(i.f508b)).booleanValue() && com.bumptech.glide.load.c.c(this.f509a, inputStream, this.f511c) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // p.j
    public final w<c> b(@NonNull InputStream inputStream, int i5, int i6, @NonNull p.h hVar) {
        byte[] bArr;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream2.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e5) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e5);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f510b.b(ByteBuffer.wrap(bArr), i5, i6, hVar);
    }
}
