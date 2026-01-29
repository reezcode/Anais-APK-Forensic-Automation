package f4;

import java.nio.ByteBuffer;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes16.dex */
public final class t implements g {

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public final f f2888b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public boolean f2889c;

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public final y f2890d;

    public t(y sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f2890d = sink;
        this.f2888b = new f();
    }

    @Override // f4.g
    public final g C(int i5) {
        if (!(!this.f2889c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2888b.A(i5);
        L();
        return this;
    }

    @Override // f4.g
    public final g G(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.f2889c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2888b.y(source);
        L();
        return this;
    }

    @Override // f4.g
    public final g L() {
        if (!(!this.f2889c)) {
            throw new IllegalStateException("closed".toString());
        }
        f fVar = this.f2888b;
        long j5 = fVar.f2852c;
        if (j5 == 0) {
            j5 = 0;
        } else {
            v vVar = fVar.f2851b;
            Intrinsics.checkNotNull(vVar);
            v vVar2 = vVar.f2900g;
            Intrinsics.checkNotNull(vVar2);
            if (vVar2.f2896c < 8192 && vVar2.f2898e) {
                j5 -= r5 - vVar2.f2895b;
            }
        }
        if (j5 > 0) {
            this.f2890d.T(this.f2888b, j5);
        }
        return this;
    }

    @Override // f4.y
    public final void T(f source, long j5) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.f2889c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2888b.T(source, j5);
        L();
    }

    @Override // f4.g
    public final g X(i byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!(!this.f2889c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2888b.x(byteString);
        L();
        return this;
    }

    @Override // f4.g
    public final long b0(a0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j5 = 0;
        while (true) {
            long u4 = ((p) source).u(this.f2888b, 8192);
            if (u4 == -1) {
                return j5;
            }
            j5 += u4;
            L();
        }
    }

    @Override // f4.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2889c) {
            return;
        }
        Throwable th = null;
        try {
            f fVar = this.f2888b;
            long j5 = fVar.f2852c;
            if (j5 > 0) {
                this.f2890d.T(fVar, j5);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f2890d.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f2889c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // f4.g
    public final g d0(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (!(!this.f2889c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2888b.K(string);
        L();
        return this;
    }

    @Override // f4.g
    public final g e0(long j5) {
        if (!(!this.f2889c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2888b.e0(j5);
        L();
        return this;
    }

    @Override // f4.g, f4.y, java.io.Flushable
    public final void flush() {
        if (!(!this.f2889c)) {
            throw new IllegalStateException("closed".toString());
        }
        f fVar = this.f2888b;
        long j5 = fVar.f2852c;
        if (j5 > 0) {
            this.f2890d.T(fVar, j5);
        }
        this.f2890d.flush();
    }

    @Override // f4.g
    public final f h() {
        return this.f2888b;
    }

    @Override // f4.y
    public final b0 i() {
        return this.f2890d.i();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2889c;
    }

    @Override // f4.g
    public final g j(byte[] source, int i5, int i6) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.f2889c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2888b.z(source, i5, i6);
        L();
        return this;
    }

    @Override // f4.g
    public final g k(long j5) {
        if (!(!this.f2889c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2888b.k(j5);
        L();
        return this;
    }

    @Override // f4.g
    public final g m() {
        if (!(!this.f2889c)) {
            throw new IllegalStateException("closed".toString());
        }
        f fVar = this.f2888b;
        long j5 = fVar.f2852c;
        if (j5 > 0) {
            this.f2890d.T(fVar, j5);
        }
        return this;
    }

    @Override // f4.g
    public final g o(int i5) {
        if (!(!this.f2889c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2888b.J(i5);
        L();
        return this;
    }

    @Override // f4.g
    public final g t(int i5) {
        if (!(!this.f2889c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f2888b.I(i5);
        L();
        return this;
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("buffer(");
        g5.append(this.f2890d);
        g5.append(')');
        return g5.toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.f2889c)) {
            throw new IllegalStateException("closed".toString());
        }
        int write = this.f2888b.write(source);
        L();
        return write;
    }
}
