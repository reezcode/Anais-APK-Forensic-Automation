package f4;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* loaded from: classes15.dex */
public final class u implements h {

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public final f f2891b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public boolean f2892c;

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public final a0 f2893d;

    public u(a0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f2893d = source;
        this.f2891b = new f();
    }

    @Override // f4.h
    public final boolean B() {
        if (!this.f2892c) {
            return this.f2891b.B() && this.f2893d.u(this.f2891b, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // f4.h
    public final byte[] D(long j5) {
        c0(j5);
        return this.f2891b.D(j5);
    }

    @Override // f4.h
    public final void F(f sink, long j5) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            c0(j5);
            this.f2891b.F(sink, j5);
        } catch (EOFException e5) {
            sink.b0(this.f2891b);
            throw e5;
        }
    }

    @Override // f4.h
    public final String O(long j5) {
        if (!(j5 >= 0)) {
            throw new IllegalArgumentException(androidx.activity.result.a.d("limit < 0: ", j5).toString());
        }
        long j6 = j5 == Long.MAX_VALUE ? Long.MAX_VALUE : j5 + 1;
        byte b5 = (byte) 10;
        long a5 = a(b5, 0L, j6);
        if (a5 != -1) {
            return g4.a.a(this.f2891b, a5);
        }
        if (j6 < Long.MAX_VALUE && c(j6) && this.f2891b.c(j6 - 1) == ((byte) 13) && c(1 + j6) && this.f2891b.c(j6) == b5) {
            return g4.a.a(this.f2891b, j6);
        }
        f fVar = new f();
        f fVar2 = this.f2891b;
        fVar2.b(fVar, 0L, Math.min(32, fVar2.f2852c));
        StringBuilder g5 = androidx.activity.d.g("\\n not found: limit=");
        g5.append(Math.min(this.f2891b.f2852c, j5));
        g5.append(" content=");
        g5.append(fVar.l().d());
        g5.append("…");
        throw new EOFException(g5.toString());
    }

    public final long a(byte b5, long j5, long j6) {
        if (!(!this.f2892c)) {
            throw new IllegalStateException("closed".toString());
        }
        long j7 = 0;
        if (!(j6 >= 0)) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j6).toString());
        }
        while (j7 < j6) {
            long e5 = this.f2891b.e(b5, j7, j6);
            if (e5 != -1) {
                return e5;
            }
            f fVar = this.f2891b;
            long j8 = fVar.f2852c;
            if (j8 >= j6 || this.f2893d.u(fVar, 8192) == -1) {
                return -1L;
            }
            j7 = Math.max(j7, j8);
        }
        return -1L;
    }

    public final int b() {
        c0(4L);
        int readInt = this.f2891b.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final boolean c(long j5) {
        f fVar;
        if (!(j5 >= 0)) {
            throw new IllegalArgumentException(androidx.activity.result.a.d("byteCount < 0: ", j5).toString());
        }
        if (!(!this.f2892c)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            fVar = this.f2891b;
            if (fVar.f2852c >= j5) {
                return true;
            }
        } while (this.f2893d.u(fVar, 8192) != -1);
        return false;
    }

    @Override // f4.h
    public final void c0(long j5) {
        if (!c(j5)) {
            throw new EOFException();
        }
    }

    @Override // f4.a0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2892c) {
            return;
        }
        this.f2892c = true;
        this.f2893d.close();
        this.f2891b.a();
    }

    @Override // f4.h
    public final i d(long j5) {
        c0(j5);
        return this.f2891b.d(j5);
    }

    @Override // f4.h
    public final int g(r options) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (!(!this.f2892c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            int b5 = g4.a.b(this.f2891b, options, true);
            if (b5 != -2) {
                if (b5 != -1) {
                    this.f2891b.skip(options.f2884b[b5].c());
                    return b5;
                }
            } else if (this.f2893d.u(this.f2891b, 8192) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // f4.h, f4.g
    public final f h() {
        return this.f2891b;
    }

    @Override // f4.h
    public final long h0() {
        byte c5;
        c0(1L);
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            if (!c(i6)) {
                break;
            }
            c5 = this.f2891b.c(i5);
            if ((c5 < ((byte) 48) || c5 > ((byte) 57)) && ((c5 < ((byte) 97) || c5 > ((byte) 102)) && (c5 < ((byte) 65) || c5 > ((byte) 70)))) {
                break;
            }
            i5 = i6;
        }
        if (i5 == 0) {
            StringBuilder g5 = androidx.activity.d.g("Expected leading [0-9a-fA-F] character but was 0x");
            String num = Integer.toString(c5, CharsKt.checkRadix(CharsKt.checkRadix(16)));
            Intrinsics.checkNotNullExpressionValue(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            g5.append(num);
            throw new NumberFormatException(g5.toString());
        }
        return this.f2891b.h0();
    }

    @Override // f4.a0
    public final b0 i() {
        return this.f2893d.i();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2892c;
    }

    @Override // f4.h
    public final String j0(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f2891b.b0(this.f2893d);
        f fVar = this.f2891b;
        Objects.requireNonNull(fVar);
        Intrinsics.checkNotNullParameter(charset, "charset");
        return fVar.p(fVar.f2852c, charset);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        f fVar = this.f2891b;
        if (fVar.f2852c == 0 && this.f2893d.u(fVar, 8192) == -1) {
            return -1;
        }
        return this.f2891b.read(sink);
    }

    @Override // f4.h
    public final byte readByte() {
        c0(1L);
        return this.f2891b.readByte();
    }

    @Override // f4.h
    public final void readFully(byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            c0(sink.length);
            this.f2891b.readFully(sink);
        } catch (EOFException e5) {
            int i5 = 0;
            while (true) {
                f fVar = this.f2891b;
                long j5 = fVar.f2852c;
                if (j5 <= 0) {
                    throw e5;
                }
                int read = fVar.read(sink, i5, (int) j5);
                if (read == -1) {
                    throw new AssertionError();
                }
                i5 += read;
            }
        }
    }

    @Override // f4.h
    public final int readInt() {
        c0(4L);
        return this.f2891b.readInt();
    }

    @Override // f4.h
    public final long readLong() {
        c0(8L);
        return this.f2891b.readLong();
    }

    @Override // f4.h
    public final short readShort() {
        c0(2L);
        return this.f2891b.readShort();
    }

    @Override // f4.h
    public final void skip(long j5) {
        if (!(!this.f2892c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j5 > 0) {
            f fVar = this.f2891b;
            if (fVar.f2852c == 0 && this.f2893d.u(fVar, 8192) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j5, this.f2891b.f2852c);
            this.f2891b.skip(min);
            j5 -= min;
        }
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("buffer(");
        g5.append(this.f2893d);
        g5.append(')');
        return g5.toString();
    }

    @Override // f4.a0
    public final long u(f sink, long j5) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!(j5 >= 0)) {
            throw new IllegalArgumentException(androidx.activity.result.a.d("byteCount < 0: ", j5).toString());
        }
        if (!(!this.f2892c)) {
            throw new IllegalStateException("closed".toString());
        }
        f fVar = this.f2891b;
        if (fVar.f2852c == 0 && this.f2893d.u(fVar, 8192) == -1) {
            return -1L;
        }
        return this.f2891b.u(sink, Math.min(j5, this.f2891b.f2852c));
    }

    @Override // f4.h
    public final String v() {
        return O(Long.MAX_VALUE);
    }
}
