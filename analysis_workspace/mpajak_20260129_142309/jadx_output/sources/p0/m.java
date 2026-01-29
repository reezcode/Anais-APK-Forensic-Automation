package p0;

import java.util.Arrays;

/* loaded from: classes25.dex */
public final class m extends l {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4643b;

    public m(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f4643b = bArr;
    }

    @Override // p0.l
    public final byte[] e() {
        return this.f4643b;
    }
}
