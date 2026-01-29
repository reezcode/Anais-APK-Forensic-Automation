package z;

import androidx.annotation.NonNull;
import java.util.Objects;
import r.w;

/* loaded from: classes13.dex */
public final class b implements w<byte[]> {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6097b;

    public b(byte[] bArr) {
        Objects.requireNonNull(bArr, "Argument must not be null");
        this.f6097b = bArr;
    }

    @Override // r.w
    @NonNull
    public final Class<byte[]> b() {
        return byte[].class;
    }

    @Override // r.w
    @NonNull
    public final byte[] get() {
        return this.f6097b;
    }

    @Override // r.w
    public final int getSize() {
        return this.f6097b.length;
    }

    @Override // r.w
    public final void recycle() {
    }
}
