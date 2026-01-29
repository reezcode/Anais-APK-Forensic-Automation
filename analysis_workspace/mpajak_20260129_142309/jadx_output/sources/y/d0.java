package y;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* loaded from: classes13.dex */
public final class d0 extends MediaDataSource {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f5977b;

    public d0(ByteBuffer byteBuffer) {
        this.f5977b = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f5977b.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j5, byte[] bArr, int i5, int i6) {
        if (j5 >= this.f5977b.limit()) {
            return -1;
        }
        this.f5977b.position((int) j5);
        int min = Math.min(i6, this.f5977b.remaining());
        this.f5977b.get(bArr, i5, min);
        return min;
    }
}
