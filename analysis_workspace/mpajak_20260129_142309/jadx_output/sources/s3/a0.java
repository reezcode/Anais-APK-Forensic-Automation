package s3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a0 extends d1.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f5149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f5150c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5152e;

    public a0(byte[] bArr, u uVar, int i5, int i6) {
        this.f5149b = bArr;
        this.f5150c = uVar;
        this.f5151d = i5;
        this.f5152e = i6;
    }

    @Override // d1.f
    public final long A() {
        return this.f5151d;
    }

    @Override // d1.f
    public final u B() {
        return this.f5150c;
    }

    @Override // d1.f
    public final void K(f4.g sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.j(this.f5149b, this.f5152e, this.f5151d);
    }
}
