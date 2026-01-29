package p0;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public abstract class n extends l {

    /* renamed from: c, reason: collision with root package name */
    public static final WeakReference<byte[]> f4644c = new WeakReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    public WeakReference<byte[]> f4645b;

    public n(byte[] bArr) {
        super(bArr);
        this.f4645b = f4644c;
    }

    @Override // p0.l
    public final byte[] e() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f4645b.get();
            if (bArr == null) {
                bArr = g();
                this.f4645b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    public abstract byte[] g();
}
