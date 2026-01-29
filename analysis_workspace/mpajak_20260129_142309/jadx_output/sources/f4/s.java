package f4;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes21.dex */
public final class s implements y {

    /* renamed from: b, reason: collision with root package name */
    public final OutputStream f2886b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f2887c;

    public s(OutputStream out, b0 timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f2886b = out;
        this.f2887c = timeout;
    }

    @Override // f4.y
    public final void T(f source, long j5) {
        Intrinsics.checkNotNullParameter(source, "source");
        b.b(source.f2852c, 0L, j5);
        while (j5 > 0) {
            this.f2887c.f();
            v vVar = source.f2851b;
            Intrinsics.checkNotNull(vVar);
            int min = (int) Math.min(j5, vVar.f2896c - vVar.f2895b);
            this.f2886b.write(vVar.f2894a, vVar.f2895b, min);
            int i5 = vVar.f2895b + min;
            vVar.f2895b = i5;
            long j6 = min;
            j5 -= j6;
            source.f2852c -= j6;
            if (i5 == vVar.f2896c) {
                source.f2851b = vVar.a();
                w.b(vVar);
            }
        }
    }

    @Override // f4.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2886b.close();
    }

    @Override // f4.y, java.io.Flushable
    public final void flush() {
        this.f2886b.flush();
    }

    @Override // f4.y
    public final b0 i() {
        return this.f2887c;
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("sink(");
        g5.append(this.f2886b);
        g5.append(')');
        return g5.toString();
    }
}
