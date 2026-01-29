package y;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import l0.a;
import y.s;

/* loaded from: classes17.dex */
public final class g implements p.j<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final m f5980a;

    public g(m mVar) {
        this.f5980a = mVar;
    }

    @Override // p.j
    public final boolean a(@NonNull ByteBuffer byteBuffer, @NonNull p.h hVar) {
        Objects.requireNonNull(this.f5980a);
        return true;
    }

    @Override // p.j
    public final r.w<Bitmap> b(@NonNull ByteBuffer byteBuffer, int i5, int i6, @NonNull p.h hVar) {
        AtomicReference<byte[]> atomicReference = l0.a.f3917a;
        a.C0044a c0044a = new a.C0044a(byteBuffer);
        m mVar = this.f5980a;
        return mVar.a(new s.a(c0044a, mVar.f6006d, mVar.f6005c), i5, i6, hVar, m.f6001k);
    }
}
