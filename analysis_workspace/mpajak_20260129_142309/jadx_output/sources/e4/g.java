package e4;

import f4.f;
import f4.i;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes19.dex */
public final class g implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public boolean f2650b;

    /* renamed from: c, reason: collision with root package name */
    public int f2651c;

    /* renamed from: d, reason: collision with root package name */
    public long f2652d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2653e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2654f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2655g;

    /* renamed from: h, reason: collision with root package name */
    public final f4.f f2656h;

    /* renamed from: i, reason: collision with root package name */
    public final f4.f f2657i;

    /* renamed from: j, reason: collision with root package name */
    public c f2658j;

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f2659k;

    /* renamed from: l, reason: collision with root package name */
    public final f.a f2660l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f2661m;

    /* renamed from: n, reason: collision with root package name */
    public final f4.h f2662n;

    /* renamed from: o, reason: collision with root package name */
    public final a f2663o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f2664p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f2665q;

    /* loaded from: classes5.dex */
    public interface a {
        void c(i iVar);

        void d(String str);

        void e(i iVar);

        void f(int i5, String str);

        void g(i iVar);
    }

    public g(boolean z4, f4.h source, a frameCallback, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(frameCallback, "frameCallback");
        this.f2661m = z4;
        this.f2662n = source;
        this.f2663o = frameCallback;
        this.f2664p = z5;
        this.f2665q = z6;
        this.f2656h = new f4.f();
        this.f2657i = new f4.f();
        this.f2659k = z4 ? null : new byte[4];
        this.f2660l = z4 ? null : new f.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r9 = this;
            long r0 = r9.f2652d
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L31
            f4.h r4 = r9.f2662n
            f4.f r5 = r9.f2656h
            r4.F(r5, r0)
            boolean r0 = r9.f2661m
            if (r0 != 0) goto L31
            f4.f r0 = r9.f2656h
            f4.f$a r1 = r9.f2660l
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0.f(r1)
            f4.f$a r0 = r9.f2660l
            r0.b(r2)
            f4.f$a r0 = r9.f2660l
            byte[] r1 = r9.f2659k
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            i.g.I(r0, r1)
            f4.f$a r0 = r9.f2660l
            r0.close()
        L31:
            int r0 = r9.f2651c
            switch(r0) {
                case 8: goto L68;
                case 9: goto L5c;
                case 10: goto L4f;
                default: goto L36;
            }
        L36:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Unknown control opcode: "
            java.lang.StringBuilder r1 = androidx.activity.d.g(r1)
            int r2 = r9.f2651c
            java.lang.String r2 = t3.c.x(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L4f:
            e4.g$a r0 = r9.f2663o
            f4.f r1 = r9.f2656h
            f4.i r1 = r1.l()
            r0.e(r1)
            goto Lcb
        L5c:
            e4.g$a r0 = r9.f2663o
            f4.f r1 = r9.f2656h
            f4.i r1 = r1.l()
            r0.c(r1)
            goto Lcb
        L68:
            r0 = 1005(0x3ed, float:1.408E-42)
            f4.f r1 = r9.f2656h
            long r4 = r1.f2852c
            r6 = 1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto Lcc
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto Lc1
            short r0 = r1.readShort()
            f4.f r1 = r9.f2656h
            java.lang.String r1 = r1.q()
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r2) goto La7
            r2 = 5000(0x1388, float:7.006E-42)
            if (r0 < r2) goto L8b
            goto La7
        L8b:
            r2 = 1006(0x3ee, float:1.41E-42)
            r3 = 1004(0x3ec, float:1.407E-42)
            if (r3 > r0) goto L93
            if (r2 >= r0) goto L9c
        L93:
            r2 = 2999(0xbb7, float:4.202E-42)
            r3 = 1015(0x3f7, float:1.422E-42)
            if (r3 <= r0) goto L9a
            goto La5
        L9a:
            if (r2 < r0) goto La5
        L9c:
            java.lang.String r2 = "Code "
            java.lang.String r3 = " is reserved and may not be used."
            java.lang.StringBuilder r2 = androidx.appcompat.graphics.drawable.a.e(r2, r0, r3)
            goto Lb4
        La5:
            r2 = 0
            goto Lb8
        La7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Code must be in range [1000,5000): "
            r2.append(r3)
            r2.append(r0)
        Lb4:
            java.lang.String r2 = r2.toString()
        Lb8:
            if (r2 != 0) goto Lbb
            goto Lc3
        Lbb:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r2)
            throw r0
        Lc1:
            java.lang.String r1 = ""
        Lc3:
            e4.g$a r2 = r9.f2663o
            r2.f(r0, r1)
            r0 = 1
            r9.f2650b = r0
        Lcb:
            return
        Lcc:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Malformed close payload length of 1."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.g.a():void");
    }

    /* JADX WARN: Finally extract failed */
    public final void b() {
        boolean z4;
        if (this.f2650b) {
            throw new IOException("closed");
        }
        long h5 = this.f2662n.i().h();
        this.f2662n.i().b();
        try {
            byte readByte = this.f2662n.readByte();
            byte[] bArr = t3.c.f5449a;
            int i5 = readByte & 255;
            this.f2662n.i().g(h5, TimeUnit.NANOSECONDS);
            int i6 = i5 & 15;
            this.f2651c = i6;
            boolean z5 = (i5 & 128) != 0;
            this.f2653e = z5;
            boolean z6 = (i5 & 8) != 0;
            this.f2654f = z6;
            if (z6 && !z5) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z7 = (i5 & 64) != 0;
            if (i6 == 1 || i6 == 2) {
                if (!z7) {
                    z4 = false;
                } else {
                    if (!this.f2664p) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z4 = true;
                }
                this.f2655g = z4;
            } else if (z7) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((i5 & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((i5 & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int readByte2 = this.f2662n.readByte() & 255;
            boolean z8 = (readByte2 & 128) != 0;
            if (z8 == this.f2661m) {
                throw new ProtocolException(this.f2661m ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j5 = readByte2 & 127;
            this.f2652d = j5;
            if (j5 == 126) {
                this.f2652d = this.f2662n.readShort() & 65535;
            } else if (j5 == 127) {
                long readLong = this.f2662n.readLong();
                this.f2652d = readLong;
                if (readLong < 0) {
                    StringBuilder g5 = androidx.activity.d.g("Frame length 0x");
                    String hexString = Long.toHexString(this.f2652d);
                    Intrinsics.checkNotNullExpressionValue(hexString, "java.lang.Long.toHexString(this)");
                    g5.append(hexString);
                    g5.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(g5.toString());
                }
            }
            if (this.f2654f && this.f2652d > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z8) {
                f4.h hVar = this.f2662n;
                byte[] bArr2 = this.f2659k;
                Intrinsics.checkNotNull(bArr2);
                hVar.readFully(bArr2);
            }
        } catch (Throwable th) {
            this.f2662n.i().g(h5, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c cVar = this.f2658j;
        if (cVar != null) {
            cVar.close();
        }
    }
}
