package f4;

import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes19.dex */
public final class j implements y {

    /* renamed from: b, reason: collision with root package name */
    public boolean f2865b;

    /* renamed from: c, reason: collision with root package name */
    public final g f2866c;

    /* renamed from: d, reason: collision with root package name */
    public final Deflater f2867d;

    public j(y sink, Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        g sink2 = d1.d.d(sink);
        Intrinsics.checkNotNullParameter(sink2, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f2866c = sink2;
        this.f2867d = deflater;
    }

    @Override // f4.y
    public final void T(f source, long j5) {
        Intrinsics.checkNotNullParameter(source, "source");
        b.b(source.f2852c, 0L, j5);
        while (j5 > 0) {
            v vVar = source.f2851b;
            Intrinsics.checkNotNull(vVar);
            int min = (int) Math.min(j5, vVar.f2896c - vVar.f2895b);
            this.f2867d.setInput(vVar.f2894a, vVar.f2895b, min);
            a(false);
            long j6 = min;
            source.f2852c -= j6;
            int i5 = vVar.f2895b + min;
            vVar.f2895b = i5;
            if (i5 == vVar.f2896c) {
                source.f2851b = vVar.a();
                w.b(vVar);
            }
            j5 -= j6;
        }
    }

    @IgnoreJRERequirement
    public final void a(boolean z4) {
        v w4;
        f h5 = this.f2866c.h();
        while (true) {
            w4 = h5.w(1);
            Deflater deflater = this.f2867d;
            byte[] bArr = w4.f2894a;
            int i5 = w4.f2896c;
            int i6 = 8192 - i5;
            int deflate = z4 ? deflater.deflate(bArr, i5, i6, 2) : deflater.deflate(bArr, i5, i6);
            if (deflate > 0) {
                w4.f2896c += deflate;
                h5.f2852c += deflate;
                this.f2866c.L();
            } else if (this.f2867d.needsInput()) {
                break;
            }
        }
        if (w4.f2895b == w4.f2896c) {
            h5.f2851b = w4.a();
            w.b(w4);
        }
    }

    @Override // f4.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2865b) {
            return;
        }
        Throwable th = null;
        try {
            this.f2867d.finish();
            a(false);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f2867d.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f2866c.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f2865b = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // f4.y, java.io.Flushable
    public final void flush() {
        a(true);
        this.f2866c.flush();
    }

    @Override // f4.y
    public final b0 i() {
        return this.f2866c.i();
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("DeflaterSink(");
        g5.append(this.f2866c);
        g5.append(')');
        return g5.toString();
    }
}
