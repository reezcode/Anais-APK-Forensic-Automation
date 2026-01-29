package e4;

import f4.j;
import java.io.Closeable;
import java.util.zip.Deflater;

/* loaded from: classes2.dex */
public final class a implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final f4.f f2597b;

    /* renamed from: c, reason: collision with root package name */
    public final Deflater f2598c;

    /* renamed from: d, reason: collision with root package name */
    public final j f2599d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2600e;

    public a(boolean z4) {
        this.f2600e = z4;
        f4.f fVar = new f4.f();
        this.f2597b = fVar;
        Deflater deflater = new Deflater(-1, true);
        this.f2598c = deflater;
        this.f2599d = new j(fVar, deflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2599d.close();
    }
}
