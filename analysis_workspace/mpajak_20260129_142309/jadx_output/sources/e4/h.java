package e4;

import f4.f;
import f4.i;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class h implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final f4.f f2666b;

    /* renamed from: c, reason: collision with root package name */
    public final f4.f f2667c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2668d;

    /* renamed from: e, reason: collision with root package name */
    public a f2669e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f2670f;

    /* renamed from: g, reason: collision with root package name */
    public final f.a f2671g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2672h;

    /* renamed from: i, reason: collision with root package name */
    public final f4.g f2673i;

    /* renamed from: j, reason: collision with root package name */
    public final Random f2674j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2675k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2676l;

    /* renamed from: m, reason: collision with root package name */
    public final long f2677m;

    public h(boolean z4, f4.g sink, Random random, boolean z5, boolean z6, long j5) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f2672h = z4;
        this.f2673i = sink;
        this.f2674j = random;
        this.f2675k = z5;
        this.f2676l = z6;
        this.f2677m = j5;
        this.f2666b = new f4.f();
        this.f2667c = sink.h();
        this.f2670f = z4 ? new byte[4] : null;
        this.f2671g = z4 ? new f.a() : null;
    }

    public final void a(int i5, i iVar) {
        if (this.f2668d) {
            throw new IOException("closed");
        }
        int c5 = iVar.c();
        if (!(((long) c5) <= 125)) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.f2667c.A(i5 | 128);
        if (this.f2672h) {
            this.f2667c.A(c5 | 128);
            Random random = this.f2674j;
            byte[] bArr = this.f2670f;
            Intrinsics.checkNotNull(bArr);
            random.nextBytes(bArr);
            this.f2667c.y(this.f2670f);
            if (c5 > 0) {
                f4.f fVar = this.f2667c;
                long j5 = fVar.f2852c;
                fVar.x(iVar);
                f4.f fVar2 = this.f2667c;
                f.a aVar = this.f2671g;
                Intrinsics.checkNotNull(aVar);
                fVar2.f(aVar);
                this.f2671g.b(j5);
                i.g.I(this.f2671g, this.f2670f);
                this.f2671g.close();
            }
        } else {
            this.f2667c.A(c5);
            this.f2667c.x(iVar);
        }
        this.f2673i.flush();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r14, f4.i r15) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.h.b(int, f4.i):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a aVar = this.f2669e;
        if (aVar != null) {
            aVar.close();
        }
    }
}
