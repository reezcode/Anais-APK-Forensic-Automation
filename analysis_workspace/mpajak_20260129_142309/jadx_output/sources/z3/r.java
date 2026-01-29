package z3;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import z3.d;

/* loaded from: classes16.dex */
public final class r implements Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f6320h = Logger.getLogger(e.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final f4.f f6321b;

    /* renamed from: c, reason: collision with root package name */
    public int f6322c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6323d;

    /* renamed from: e, reason: collision with root package name */
    public final d.b f6324e;

    /* renamed from: f, reason: collision with root package name */
    public final f4.g f6325f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6326g;

    public r(f4.g sink, boolean z4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f6325f = sink;
        this.f6326g = z4;
        f4.f fVar = new f4.f();
        this.f6321b = fVar;
        this.f6322c = 16384;
        this.f6324e = new d.b(fVar);
    }

    public final synchronized void a(u peerSettings) {
        Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
        if (this.f6323d) {
            throw new IOException("closed");
        }
        int i5 = this.f6322c;
        int i6 = peerSettings.f6335a;
        if ((i6 & 32) != 0) {
            i5 = peerSettings.f6336b[5];
        }
        this.f6322c = i5;
        int i7 = i6 & 2;
        if ((i7 != 0 ? peerSettings.f6336b[1] : -1) != -1) {
            d.b bVar = this.f6324e;
            int i8 = i7 != 0 ? peerSettings.f6336b[1] : -1;
            Objects.requireNonNull(bVar);
            int min = Math.min(i8, 16384);
            int i9 = bVar.f6194c;
            if (i9 != min) {
                if (min < i9) {
                    bVar.f6192a = Math.min(bVar.f6192a, min);
                }
                bVar.f6193b = true;
                bVar.f6194c = min;
                int i10 = bVar.f6198g;
                if (min < i10) {
                    if (min == 0) {
                        bVar.a();
                    } else {
                        bVar.b(i10 - min);
                    }
                }
            }
        }
        c(0, 0, 4, 1);
        this.f6325f.flush();
    }

    public final synchronized void b(boolean z4, int i5, f4.f fVar, int i6) {
        if (this.f6323d) {
            throw new IOException("closed");
        }
        c(i5, i6, 0, z4 ? 1 : 0);
        if (i6 > 0) {
            f4.g gVar = this.f6325f;
            Intrinsics.checkNotNull(fVar);
            gVar.T(fVar, i6);
        }
    }

    public final void c(int i5, int i6, int i7, int i8) {
        Logger logger = f6320h;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.f6205e.b(false, i5, i6, i7, i8));
        }
        if (!(i6 <= this.f6322c)) {
            StringBuilder g5 = androidx.activity.d.g("FRAME_SIZE_ERROR length > ");
            g5.append(this.f6322c);
            g5.append(": ");
            g5.append(i6);
            throw new IllegalArgumentException(g5.toString().toString());
        }
        if (!((((int) 2147483648L) & i5) == 0)) {
            throw new IllegalArgumentException(androidx.appcompat.widget.a.g("reserved bit set: ", i5).toString());
        }
        f4.g writeMedium = this.f6325f;
        byte[] bArr = t3.c.f5449a;
        Intrinsics.checkNotNullParameter(writeMedium, "$this$writeMedium");
        writeMedium.C((i6 >>> 16) & 255);
        writeMedium.C((i6 >>> 8) & 255);
        writeMedium.C(i6 & 255);
        this.f6325f.C(i7 & 255);
        this.f6325f.C(i8 & 255);
        this.f6325f.t(i5 & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f6323d = true;
        this.f6325f.close();
    }

    public final synchronized void e(int i5, b errorCode, byte[] debugData) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        if (this.f6323d) {
            throw new IOException("closed");
        }
        if (!(errorCode.f6171b != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        c(0, debugData.length + 8, 7, 0);
        this.f6325f.t(i5);
        this.f6325f.t(errorCode.f6171b);
        if (!(debugData.length == 0)) {
            this.f6325f.G(debugData);
        }
        this.f6325f.flush();
    }

    public final synchronized void f(boolean z4, int i5, List<c> headerBlock) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f6323d) {
            throw new IOException("closed");
        }
        this.f6324e.e(headerBlock);
        long j5 = this.f6321b.f2852c;
        long min = Math.min(this.f6322c, j5);
        int i6 = j5 == min ? 4 : 0;
        if (z4) {
            i6 |= 1;
        }
        c(i5, (int) min, 1, i6);
        this.f6325f.T(this.f6321b, min);
        if (j5 > min) {
            q(i5, j5 - min);
        }
    }

    public final synchronized void flush() {
        if (this.f6323d) {
            throw new IOException("closed");
        }
        this.f6325f.flush();
    }

    public final synchronized void l(boolean z4, int i5, int i6) {
        if (this.f6323d) {
            throw new IOException("closed");
        }
        c(0, 8, 6, z4 ? 1 : 0);
        this.f6325f.t(i5);
        this.f6325f.t(i6);
        this.f6325f.flush();
    }

    public final synchronized void n(int i5, b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f6323d) {
            throw new IOException("closed");
        }
        if (!(errorCode.f6171b != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        c(i5, 4, 3, 0);
        this.f6325f.t(errorCode.f6171b);
        this.f6325f.flush();
    }

    public final synchronized void p(int i5, long j5) {
        if (this.f6323d) {
            throw new IOException("closed");
        }
        if (!(j5 != 0 && j5 <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j5).toString());
        }
        c(i5, 4, 8, 0);
        this.f6325f.t((int) j5);
        this.f6325f.flush();
    }

    public final void q(int i5, long j5) {
        while (j5 > 0) {
            long min = Math.min(this.f6322c, j5);
            j5 -= min;
            c(i5, (int) min, 9, j5 == 0 ? 4 : 0);
            this.f6325f.T(this.f6321b, min);
        }
    }
}
