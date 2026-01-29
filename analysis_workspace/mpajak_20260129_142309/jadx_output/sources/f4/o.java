package f4;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes24.dex */
public final class o implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public int f2876b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2877c;

    /* renamed from: d, reason: collision with root package name */
    public final h f2878d;

    /* renamed from: e, reason: collision with root package name */
    public final Inflater f2879e;

    public o(a0 source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        h source2 = d1.d.e(source);
        Intrinsics.checkNotNullParameter(source2, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f2878d = source2;
        this.f2879e = inflater;
    }

    public o(h source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f2878d = source;
        this.f2879e = inflater;
    }

    public final long a(f sink, long j5) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j5 >= 0)) {
            throw new IllegalArgumentException(androidx.activity.result.a.d("byteCount < 0: ", j5).toString());
        }
        if (!(!this.f2877c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j5 == 0) {
            return 0L;
        }
        try {
            v w4 = sink.w(1);
            int min = (int) Math.min(j5, 8192 - w4.f2896c);
            if (this.f2879e.needsInput() && !this.f2878d.B()) {
                v vVar = this.f2878d.h().f2851b;
                Intrinsics.checkNotNull(vVar);
                int i5 = vVar.f2896c;
                int i6 = vVar.f2895b;
                int i7 = i5 - i6;
                this.f2876b = i7;
                this.f2879e.setInput(vVar.f2894a, i6, i7);
            }
            int inflate = this.f2879e.inflate(w4.f2894a, w4.f2896c, min);
            int i8 = this.f2876b;
            if (i8 != 0) {
                int remaining = i8 - this.f2879e.getRemaining();
                this.f2876b -= remaining;
                this.f2878d.skip(remaining);
            }
            if (inflate > 0) {
                w4.f2896c += inflate;
                long j6 = inflate;
                sink.f2852c += j6;
                return j6;
            }
            if (w4.f2895b == w4.f2896c) {
                sink.f2851b = w4.a();
                w.b(w4);
            }
            return 0L;
        } catch (DataFormatException e5) {
            throw new IOException(e5);
        }
    }

    @Override // f4.a0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2877c) {
            return;
        }
        this.f2879e.end();
        this.f2877c = true;
        this.f2878d.close();
    }

    @Override // f4.a0
    public final b0 i() {
        return this.f2878d.i();
    }

    @Override // f4.a0
    public final long u(f sink, long j5) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long a5 = a(sink, j5);
            if (a5 > 0) {
                return a5;
            }
            if (this.f2879e.finished() || this.f2879e.needsDictionary()) {
                return -1L;
            }
        } while (!this.f2878d.B());
        throw new EOFException("source exhausted prematurely");
    }
}
