package f4;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes25.dex */
public final class n implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public byte f2871b;

    /* renamed from: c, reason: collision with root package name */
    public final u f2872c;

    /* renamed from: d, reason: collision with root package name */
    public final Inflater f2873d;

    /* renamed from: e, reason: collision with root package name */
    public final o f2874e;

    /* renamed from: f, reason: collision with root package name */
    public final CRC32 f2875f;

    public n(a0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        u uVar = new u(source);
        this.f2872c = uVar;
        Inflater inflater = new Inflater(true);
        this.f2873d = inflater;
        this.f2874e = new o((h) uVar, inflater);
        this.f2875f = new CRC32();
    }

    public final void a(String str, int i5, int i6) {
        if (i6 == i5) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i6), Integer.valueOf(i5)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
        throw new IOException(format);
    }

    public final void b(f fVar, long j5, long j6) {
        v vVar = fVar.f2851b;
        while (true) {
            Intrinsics.checkNotNull(vVar);
            int i5 = vVar.f2896c;
            int i6 = vVar.f2895b;
            if (j5 < i5 - i6) {
                break;
            }
            j5 -= i5 - i6;
            vVar = vVar.f2899f;
        }
        while (j6 > 0) {
            int min = (int) Math.min(vVar.f2896c - r7, j6);
            this.f2875f.update(vVar.f2894a, (int) (vVar.f2895b + j5), min);
            j6 -= min;
            vVar = vVar.f2899f;
            Intrinsics.checkNotNull(vVar);
            j5 = 0;
        }
    }

    @Override // f4.a0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2874e.close();
    }

    @Override // f4.a0
    public final b0 i() {
        return this.f2872c.i();
    }

    @Override // f4.a0
    public final long u(f sink, long j5) {
        long j6;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j5 >= 0)) {
            throw new IllegalArgumentException(androidx.activity.result.a.d("byteCount < 0: ", j5).toString());
        }
        if (j5 == 0) {
            return 0L;
        }
        if (this.f2871b == 0) {
            this.f2872c.c0(10L);
            byte c5 = this.f2872c.f2891b.c(3L);
            boolean z4 = ((c5 >> 1) & 1) == 1;
            if (z4) {
                b(this.f2872c.f2891b, 0L, 10L);
            }
            a("ID1ID2", 8075, this.f2872c.readShort());
            this.f2872c.skip(8L);
            if (((c5 >> 2) & 1) == 1) {
                this.f2872c.c0(2L);
                if (z4) {
                    b(this.f2872c.f2891b, 0L, 2L);
                }
                long n4 = this.f2872c.f2891b.n();
                this.f2872c.c0(n4);
                if (z4) {
                    j6 = n4;
                    b(this.f2872c.f2891b, 0L, n4);
                } else {
                    j6 = n4;
                }
                this.f2872c.skip(j6);
            }
            if (((c5 >> 3) & 1) == 1) {
                long a5 = this.f2872c.a((byte) 0, 0L, Long.MAX_VALUE);
                if (a5 == -1) {
                    throw new EOFException();
                }
                if (z4) {
                    b(this.f2872c.f2891b, 0L, a5 + 1);
                }
                this.f2872c.skip(a5 + 1);
            }
            if (((c5 >> 4) & 1) == 1) {
                long a6 = this.f2872c.a((byte) 0, 0L, Long.MAX_VALUE);
                if (a6 == -1) {
                    throw new EOFException();
                }
                if (z4) {
                    b(this.f2872c.f2891b, 0L, a6 + 1);
                }
                this.f2872c.skip(a6 + 1);
            }
            if (z4) {
                u uVar = this.f2872c;
                uVar.c0(2L);
                a("FHCRC", uVar.f2891b.n(), (short) this.f2875f.getValue());
                this.f2875f.reset();
            }
            this.f2871b = (byte) 1;
        }
        if (this.f2871b == 1) {
            long j7 = sink.f2852c;
            long u4 = this.f2874e.u(sink, j5);
            if (u4 != -1) {
                b(sink, j7, u4);
                return u4;
            }
            this.f2871b = (byte) 2;
        }
        if (this.f2871b == 2) {
            a("CRC", this.f2872c.b(), (int) this.f2875f.getValue());
            a("ISIZE", this.f2872c.b(), (int) this.f2873d.getBytesWritten());
            this.f2871b = (byte) 3;
            if (!this.f2872c.B()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
