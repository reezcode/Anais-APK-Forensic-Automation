package e4;

import f4.a0;
import f4.o;
import java.io.Closeable;
import java.util.zip.Inflater;

/* loaded from: classes5.dex */
public final class c implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final f4.f f2602b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f2603c;

    /* renamed from: d, reason: collision with root package name */
    public final o f2604d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2605e;

    public c(boolean z4) {
        this.f2605e = z4;
        f4.f fVar = new f4.f();
        this.f2602b = fVar;
        Inflater inflater = new Inflater(true);
        this.f2603c = inflater;
        this.f2604d = new o((a0) fVar, inflater);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2604d.close();
    }
}
