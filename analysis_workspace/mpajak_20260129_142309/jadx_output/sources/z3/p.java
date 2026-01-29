package z3;

import f4.a0;
import f4.b0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import z3.d;

/* loaded from: classes6.dex */
public final class p implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f6283f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f6284g = new a();

    /* renamed from: b, reason: collision with root package name */
    public final b f6285b;

    /* renamed from: c, reason: collision with root package name */
    public final d.a f6286c;

    /* renamed from: d, reason: collision with root package name */
    public final f4.h f6287d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6288e;

    /* loaded from: classes24.dex */
    public static final class a {
        public final int a(int i5, int i6, int i7) {
            if ((i6 & 8) != 0) {
                i5--;
            }
            if (i7 <= i5) {
                return i5 - i7;
            }
            throw new IOException(androidx.activity.d.d("PROTOCOL_ERROR padding ", i7, " > remaining length ", i5));
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements a0 {

        /* renamed from: b, reason: collision with root package name */
        public int f6289b;

        /* renamed from: c, reason: collision with root package name */
        public int f6290c;

        /* renamed from: d, reason: collision with root package name */
        public int f6291d;

        /* renamed from: e, reason: collision with root package name */
        public int f6292e;

        /* renamed from: f, reason: collision with root package name */
        public int f6293f;

        /* renamed from: g, reason: collision with root package name */
        public final f4.h f6294g;

        public b(f4.h source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f6294g = source;
        }

        @Override // f4.a0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // f4.a0
        public final b0 i() {
            return this.f6294g.i();
        }

        @Override // f4.a0
        public final long u(f4.f sink, long j5) {
            int i5;
            int readInt;
            Intrinsics.checkNotNullParameter(sink, "sink");
            do {
                int i6 = this.f6292e;
                if (i6 != 0) {
                    long u4 = this.f6294g.u(sink, Math.min(j5, i6));
                    if (u4 == -1) {
                        return -1L;
                    }
                    this.f6292e -= (int) u4;
                    return u4;
                }
                this.f6294g.skip(this.f6293f);
                this.f6293f = 0;
                if ((this.f6290c & 4) != 0) {
                    return -1L;
                }
                i5 = this.f6291d;
                int u5 = t3.c.u(this.f6294g);
                this.f6292e = u5;
                this.f6289b = u5;
                int readByte = this.f6294g.readByte() & 255;
                this.f6290c = this.f6294g.readByte() & 255;
                a aVar = p.f6284g;
                Logger logger = p.f6283f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.f6205e.b(true, this.f6291d, this.f6289b, readByte, this.f6290c));
                }
                readInt = this.f6294g.readInt() & Integer.MAX_VALUE;
                this.f6291d = readInt;
                if (readByte != 9) {
                    throw new IOException(readByte + " != TYPE_CONTINUATION");
                }
            } while (readInt == i5);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }
    }

    /* loaded from: classes20.dex */
    public interface c {
        void a(int i5, List list);

        void b();

        void c(boolean z4, int i5, List list);

        void d(boolean z4, int i5, int i6);

        void e(u uVar);

        void f(int i5, z3.b bVar);

        void g(int i5, long j5);

        void h(boolean z4, int i5, f4.h hVar, int i6);

        void i(int i5, z3.b bVar, f4.i iVar);

        void priority();
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "Logger.getLogger(Http2::class.java.name)");
        f6283f = logger;
    }

    public p(f4.h source, boolean z4) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f6287d = source;
        this.f6288e = z4;
        b bVar = new b(source);
        this.f6285b = bVar;
        this.f6286c = new d.a(bVar);
    }

    public final boolean a(boolean z4, c handler) {
        int readInt;
        Intrinsics.checkNotNullParameter(handler, "handler");
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        try {
            this.f6287d.c0(9L);
            int u4 = t3.c.u(this.f6287d);
            if (u4 > 16384) {
                throw new IOException(androidx.appcompat.widget.a.g("FRAME_SIZE_ERROR: ", u4));
            }
            int readByte = this.f6287d.readByte() & 255;
            int readByte2 = this.f6287d.readByte() & 255;
            int readInt2 = this.f6287d.readInt() & Integer.MAX_VALUE;
            Logger logger = f6283f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.f6205e.b(true, readInt2, u4, readByte, readByte2));
            }
            if (z4 && readByte != 4) {
                StringBuilder g5 = androidx.activity.d.g("Expected a SETTINGS frame but was ");
                g5.append(e.f6205e.a(readByte));
                throw new IOException(g5.toString());
            }
            z3.b bVar = null;
            switch (readByte) {
                case 0:
                    if (readInt2 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z5 = (readByte2 & 1) != 0;
                    if ((readByte2 & 32) != 0) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    if ((readByte2 & 8) != 0) {
                        byte readByte3 = this.f6287d.readByte();
                        byte[] bArr = t3.c.f5449a;
                        i5 = readByte3 & 255;
                    }
                    handler.h(z5, readInt2, this.f6287d, f6284g.a(u4, readByte2, i5));
                    this.f6287d.skip(i5);
                    return true;
                case 1:
                    if (readInt2 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z6 = (readByte2 & 1) != 0;
                    if ((readByte2 & 8) != 0) {
                        byte readByte4 = this.f6287d.readByte();
                        byte[] bArr2 = t3.c.f5449a;
                        i7 = readByte4 & 255;
                    }
                    if ((readByte2 & 32) != 0) {
                        e(handler, readInt2);
                        u4 -= 5;
                    }
                    handler.c(z6, readInt2, c(f6284g.a(u4, readByte2, i7), i7, readByte2, readInt2));
                    return true;
                case 2:
                    if (u4 != 5) {
                        throw new IOException(androidx.activity.d.c("TYPE_PRIORITY length: ", u4, " != 5"));
                    }
                    if (readInt2 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    e(handler, readInt2);
                    return true;
                case 3:
                    if (u4 != 4) {
                        throw new IOException(androidx.activity.d.c("TYPE_RST_STREAM length: ", u4, " != 4"));
                    }
                    if (readInt2 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int readInt3 = this.f6287d.readInt();
                    z3.b[] values = z3.b.values();
                    int length = values.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length) {
                            z3.b bVar2 = values[i8];
                            if (bVar2.f6171b == readInt3) {
                                bVar = bVar2;
                            } else {
                                i8++;
                            }
                        }
                    }
                    if (bVar == null) {
                        throw new IOException(androidx.appcompat.widget.a.g("TYPE_RST_STREAM unexpected error code: ", readInt3));
                    }
                    handler.f(readInt2, bVar);
                    return true;
                case 4:
                    if (readInt2 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((readByte2 & 1) != 0) {
                        if (u4 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        handler.b();
                    } else {
                        if (u4 % 6 != 0) {
                            throw new IOException(androidx.appcompat.widget.a.g("TYPE_SETTINGS length % 6 != 0: ", u4));
                        }
                        u uVar = new u();
                        IntProgression step = RangesKt.step(RangesKt.until(0, u4), 6);
                        int first = step.getFirst();
                        int last = step.getLast();
                        int step2 = step.getStep();
                        if (step2 < 0 ? first >= last : first <= last) {
                            while (true) {
                                short readShort = this.f6287d.readShort();
                                byte[] bArr3 = t3.c.f5449a;
                                int i9 = readShort & 65535;
                                readInt = this.f6287d.readInt();
                                if (i9 != 2) {
                                    if (i9 == 3) {
                                        i9 = 4;
                                    } else if (i9 == 4) {
                                        i9 = 7;
                                        if (readInt < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                    } else if (i9 == 5 && (readInt < 16384 || readInt > 16777215)) {
                                    }
                                } else if (readInt != 0 && readInt != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                uVar.c(i9, readInt);
                                if (first != last) {
                                    first += step2;
                                }
                            }
                            throw new IOException(androidx.appcompat.widget.a.g("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", readInt));
                        }
                        handler.e(uVar);
                    }
                    return true;
                case 5:
                    if (readInt2 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    if ((readByte2 & 8) != 0) {
                        byte readByte5 = this.f6287d.readByte();
                        byte[] bArr4 = t3.c.f5449a;
                        i6 = readByte5 & 255;
                    }
                    handler.a(this.f6287d.readInt() & Integer.MAX_VALUE, c(f6284g.a(u4 - 4, readByte2, i6), i6, readByte2, readInt2));
                    return true;
                case 6:
                    if (u4 != 8) {
                        throw new IOException(androidx.appcompat.widget.a.g("TYPE_PING length != 8: ", u4));
                    }
                    if (readInt2 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    handler.d((readByte2 & 1) != 0, this.f6287d.readInt(), this.f6287d.readInt());
                    return true;
                case 7:
                    if (u4 < 8) {
                        throw new IOException(androidx.appcompat.widget.a.g("TYPE_GOAWAY length < 8: ", u4));
                    }
                    if (readInt2 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int readInt4 = this.f6287d.readInt();
                    int readInt5 = this.f6287d.readInt();
                    int i10 = u4 - 8;
                    z3.b[] values2 = z3.b.values();
                    int length2 = values2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            z3.b bVar3 = values2[i11];
                            if (bVar3.f6171b == readInt5) {
                                bVar = bVar3;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (bVar == null) {
                        throw new IOException(androidx.appcompat.widget.a.g("TYPE_GOAWAY unexpected error code: ", readInt5));
                    }
                    f4.i iVar = f4.i.f2860e;
                    if (i10 > 0) {
                        iVar = this.f6287d.d(i10);
                    }
                    handler.i(readInt4, bVar, iVar);
                    return true;
                case 8:
                    if (u4 != 4) {
                        throw new IOException(androidx.appcompat.widget.a.g("TYPE_WINDOW_UPDATE length !=4: ", u4));
                    }
                    int readInt6 = this.f6287d.readInt();
                    byte[] bArr5 = t3.c.f5449a;
                    long j5 = readInt6 & 2147483647L;
                    if (j5 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    handler.g(readInt2, j5);
                    return true;
                default:
                    this.f6287d.skip(u4);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void b(c handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.f6288e) {
            if (!a(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        f4.h hVar = this.f6287d;
        f4.i iVar = e.f6201a;
        f4.i d5 = hVar.d(iVar.f2864d.length);
        Logger logger = f6283f;
        if (logger.isLoggable(Level.FINE)) {
            StringBuilder g5 = androidx.activity.d.g("<< CONNECTION ");
            g5.append(d5.d());
            logger.fine(t3.c.j(g5.toString(), new Object[0]));
        }
        if (!Intrinsics.areEqual(iVar, d5)) {
            StringBuilder g6 = androidx.activity.d.g("Expected a connection header but was ");
            g6.append(d5.k());
            throw new IOException(g6.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<z3.c>] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.ArrayList, java.util.List<z3.c>] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList, java.util.List<z3.c>] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.ArrayList, java.util.List<z3.c>] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList, java.util.List<z3.c>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<z3.c> c(int r2, int r3, int r4, int r5) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.p.c(int, int, int, int):java.util.List");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6287d.close();
    }

    public final void e(c cVar, int i5) {
        this.f6287d.readInt();
        this.f6287d.readByte();
        byte[] bArr = t3.c.f5449a;
        cVar.priority();
    }
}
