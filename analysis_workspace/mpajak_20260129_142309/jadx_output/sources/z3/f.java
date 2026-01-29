package z3;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z3.p;

/* loaded from: classes10.dex */
public final class f implements Closeable {
    public static final u C;
    public static final c D = new c();
    public final e A;
    public final Set<Integer> B;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6206b;

    /* renamed from: c, reason: collision with root package name */
    public final d f6207c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<Integer, q> f6208d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6209e;

    /* renamed from: f, reason: collision with root package name */
    public int f6210f;

    /* renamed from: g, reason: collision with root package name */
    public int f6211g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6212h;

    /* renamed from: i, reason: collision with root package name */
    public final v3.d f6213i;

    /* renamed from: j, reason: collision with root package name */
    public final v3.c f6214j;

    /* renamed from: k, reason: collision with root package name */
    public final v3.c f6215k;

    /* renamed from: l, reason: collision with root package name */
    public final v3.c f6216l;

    /* renamed from: m, reason: collision with root package name */
    public final i.g f6217m;

    /* renamed from: n, reason: collision with root package name */
    public long f6218n;

    /* renamed from: o, reason: collision with root package name */
    public long f6219o;

    /* renamed from: p, reason: collision with root package name */
    public long f6220p;

    /* renamed from: q, reason: collision with root package name */
    public long f6221q;

    /* renamed from: r, reason: collision with root package name */
    public long f6222r;

    /* renamed from: s, reason: collision with root package name */
    public final u f6223s;

    /* renamed from: t, reason: collision with root package name */
    public u f6224t;

    /* renamed from: u, reason: collision with root package name */
    public long f6225u;

    /* renamed from: v, reason: collision with root package name */
    public long f6226v;

    /* renamed from: w, reason: collision with root package name */
    public long f6227w;

    /* renamed from: x, reason: collision with root package name */
    public long f6228x;

    /* renamed from: y, reason: collision with root package name */
    public final Socket f6229y;

    /* renamed from: z, reason: collision with root package name */
    public final r f6230z;

    /* loaded from: classes18.dex */
    public static final class a extends v3.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f6231e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f6232f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, f fVar, long j5) {
            super(str, true);
            this.f6231e = fVar;
            this.f6232f = j5;
        }

        @Override // v3.a
        public final long a() {
            f fVar;
            boolean z4;
            synchronized (this.f6231e) {
                fVar = this.f6231e;
                long j5 = fVar.f6219o;
                long j6 = fVar.f6218n;
                if (j5 < j6) {
                    z4 = true;
                } else {
                    fVar.f6218n = j6 + 1;
                    z4 = false;
                }
            }
            if (z4) {
                f.a(fVar, null);
                return -1L;
            }
            fVar.q(false, 1, 0);
            return this.f6232f;
        }
    }

    /* loaded from: classes11.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Socket f6233a;

        /* renamed from: b, reason: collision with root package name */
        public String f6234b;

        /* renamed from: c, reason: collision with root package name */
        public f4.h f6235c;

        /* renamed from: d, reason: collision with root package name */
        public f4.g f6236d;

        /* renamed from: e, reason: collision with root package name */
        public d f6237e;

        /* renamed from: f, reason: collision with root package name */
        public i.g f6238f;

        /* renamed from: g, reason: collision with root package name */
        public int f6239g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f6240h;

        /* renamed from: i, reason: collision with root package name */
        public final v3.d f6241i;

        public b(v3.d taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.f6240h = true;
            this.f6241i = taskRunner;
            this.f6237e = d.f6242a;
            this.f6238f = t.f6334d;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
    }

    /* loaded from: classes19.dex */
    public static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        @JvmField
        public static final a f6242a = new a();

        /* loaded from: classes21.dex */
        public static final class a extends d {
            @Override // z3.f.d
            public final void b(q stream) {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.c(z3.b.REFUSED_STREAM, null);
            }
        }

        public void a(f connection, u settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void b(q qVar);
    }

    /* loaded from: classes21.dex */
    public final class e implements p.c, Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        public final p f6243b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f6244c;

        /* loaded from: classes7.dex */
        public static final class a extends v3.a {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ e f6245e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ int f6246f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ int f6247g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, e eVar, int i5, int i6) {
                super(str, true);
                this.f6245e = eVar;
                this.f6246f = i5;
                this.f6247g = i6;
            }

            @Override // v3.a
            public final long a() {
                this.f6245e.f6244c.q(true, this.f6246f, this.f6247g);
                return -1L;
            }
        }

        public e(f fVar, p reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f6244c = fVar;
            this.f6243b = reader;
        }

        @Override // z3.p.c
        public final void a(int i5, List requestHeaders) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            f fVar = this.f6244c;
            Objects.requireNonNull(fVar);
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            synchronized (fVar) {
                if (fVar.B.contains(Integer.valueOf(i5))) {
                    fVar.r(i5, z3.b.PROTOCOL_ERROR);
                    return;
                }
                fVar.B.add(Integer.valueOf(i5));
                fVar.f6215k.c(new l(fVar.f6209e + '[' + i5 + "] onRequest", fVar, i5, requestHeaders), 0L);
            }
        }

        @Override // z3.p.c
        public final void b() {
        }

        @Override // z3.p.c
        public final void c(boolean z4, int i5, List requestHeaders) {
            Intrinsics.checkNotNullParameter(requestHeaders, "headerBlock");
            if (this.f6244c.e(i5)) {
                f fVar = this.f6244c;
                Objects.requireNonNull(fVar);
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                fVar.f6215k.c(new k(fVar.f6209e + '[' + i5 + "] onHeaders", fVar, i5, requestHeaders, z4), 0L);
                return;
            }
            synchronized (this.f6244c) {
                q c5 = this.f6244c.c(i5);
                if (c5 != null) {
                    Unit unit = Unit.INSTANCE;
                    c5.j(t3.c.w(requestHeaders), z4);
                    return;
                }
                f fVar2 = this.f6244c;
                if (fVar2.f6212h) {
                    return;
                }
                if (i5 <= fVar2.f6210f) {
                    return;
                }
                if (i5 % 2 == fVar2.f6211g % 2) {
                    return;
                }
                q qVar = new q(i5, this.f6244c, false, z4, t3.c.w(requestHeaders));
                f fVar3 = this.f6244c;
                fVar3.f6210f = i5;
                fVar3.f6208d.put(Integer.valueOf(i5), qVar);
                this.f6244c.f6213i.f().c(new h(this.f6244c.f6209e + '[' + i5 + "] onStream", qVar, this), 0L);
            }
        }

        @Override // z3.p.c
        public final void d(boolean z4, int i5, int i6) {
            if (!z4) {
                this.f6244c.f6214j.c(new a(androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), this.f6244c.f6209e, " ping"), this, i5, i6), 0L);
                return;
            }
            synchronized (this.f6244c) {
                if (i5 == 1) {
                    this.f6244c.f6219o++;
                } else if (i5 != 2) {
                    if (i5 == 3) {
                        f fVar = this.f6244c;
                        Objects.requireNonNull(fVar);
                        fVar.notifyAll();
                    }
                    Unit unit = Unit.INSTANCE;
                } else {
                    this.f6244c.f6221q++;
                }
            }
        }

        @Override // z3.p.c
        public final void e(u settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.f6244c.f6214j.c(new i(androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), this.f6244c.f6209e, " applyAndAckSettings"), this, settings), 0L);
        }

        @Override // z3.p.c
        public final void f(int i5, z3.b errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (!this.f6244c.e(i5)) {
                q f5 = this.f6244c.f(i5);
                if (f5 != null) {
                    synchronized (f5) {
                        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                        if (f5.f6305k == null) {
                            f5.f6305k = errorCode;
                            f5.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            f fVar = this.f6244c;
            Objects.requireNonNull(fVar);
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            fVar.f6215k.c(new m(fVar.f6209e + '[' + i5 + "] onReset", fVar, i5, errorCode), 0L);
        }

        @Override // z3.p.c
        public final void g(int i5, long j5) {
            Object obj;
            if (i5 == 0) {
                Object obj2 = this.f6244c;
                synchronized (obj2) {
                    f fVar = this.f6244c;
                    fVar.f6228x += j5;
                    if (fVar == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                    fVar.notifyAll();
                    Unit unit = Unit.INSTANCE;
                    obj = obj2;
                }
            } else {
                q c5 = this.f6244c.c(i5);
                if (c5 == null) {
                    return;
                }
                synchronized (c5) {
                    c5.f6298d += j5;
                    if (j5 > 0) {
                        c5.notifyAll();
                    }
                    Unit unit2 = Unit.INSTANCE;
                    obj = c5;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
        
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0107, code lost:
        
            if (r18 == false) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0109, code lost:
        
            r3.j(t3.c.f5450b, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x010e, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
        
            return;
         */
        @Override // z3.p.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void h(boolean r18, int r19, f4.h r20, int r21) {
            /*
                Method dump skipped, instructions count: 271
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: z3.f.e.h(boolean, int, f4.h, int):void");
        }

        /* JADX WARN: Type inference failed for: r7v2, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, z3.q>] */
        @Override // z3.p.c
        public final void i(int i5, z3.b errorCode, f4.i debugData) {
            int i6;
            q[] qVarArr;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.c();
            synchronized (this.f6244c) {
                Object[] array = this.f6244c.f6208d.values().toArray(new q[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                qVarArr = (q[]) array;
                this.f6244c.f6212h = true;
                Unit unit = Unit.INSTANCE;
            }
            for (q qVar : qVarArr) {
                if (qVar.f6307m > i5 && qVar.h()) {
                    z3.b errorCode2 = z3.b.REFUSED_STREAM;
                    synchronized (qVar) {
                        Intrinsics.checkNotNullParameter(errorCode2, "errorCode");
                        if (qVar.f6305k == null) {
                            qVar.f6305k = errorCode2;
                            qVar.notifyAll();
                        }
                    }
                    this.f6244c.f(qVar.f6307m);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [z3.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.Unit] */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Throwable th;
            z3.b bVar;
            z3.b bVar2 = z3.b.INTERNAL_ERROR;
            IOException e5 = null;
            try {
                try {
                    this.f6243b.b(this);
                    while (this.f6243b.a(false, this)) {
                    }
                    z3.b bVar3 = z3.b.NO_ERROR;
                    try {
                        this.f6244c.b(bVar3, z3.b.CANCEL, null);
                        bVar = bVar3;
                    } catch (IOException e6) {
                        e5 = e6;
                        z3.b bVar4 = z3.b.PROTOCOL_ERROR;
                        f fVar = this.f6244c;
                        fVar.b(bVar4, bVar4, e5);
                        bVar = fVar;
                        t3.c.d(this.f6243b);
                        bVar2 = Unit.INSTANCE;
                        return bVar2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f6244c.b(bVar, bVar2, e5);
                    t3.c.d(this.f6243b);
                    throw th;
                }
            } catch (IOException e7) {
                e5 = e7;
            } catch (Throwable th3) {
                th = th3;
                bVar = bVar2;
                this.f6244c.b(bVar, bVar2, e5);
                t3.c.d(this.f6243b);
                throw th;
            }
            t3.c.d(this.f6243b);
            bVar2 = Unit.INSTANCE;
            return bVar2;
        }

        @Override // z3.p.c
        public final void priority() {
        }
    }

    /* renamed from: z3.f$f, reason: collision with other inner class name */
    /* loaded from: classes21.dex */
    public static final class C0090f extends v3.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f6248e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f6249f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ z3.b f6250g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0090f(String str, f fVar, int i5, z3.b bVar) {
            super(str, true);
            this.f6248e = fVar;
            this.f6249f = i5;
            this.f6250g = bVar;
        }

        @Override // v3.a
        public final long a() {
            try {
                f fVar = this.f6248e;
                int i5 = this.f6249f;
                z3.b statusCode = this.f6250g;
                Objects.requireNonNull(fVar);
                Intrinsics.checkNotNullParameter(statusCode, "statusCode");
                fVar.f6230z.n(i5, statusCode);
                return -1L;
            } catch (IOException e5) {
                f.a(this.f6248e, e5);
                return -1L;
            }
        }
    }

    /* loaded from: classes14.dex */
    public static final class g extends v3.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f6251e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f6252f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f6253g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, f fVar, int i5, long j5) {
            super(str, true);
            this.f6251e = fVar;
            this.f6252f = i5;
            this.f6253g = j5;
        }

        @Override // v3.a
        public final long a() {
            try {
                this.f6251e.f6230z.p(this.f6252f, this.f6253g);
                return -1L;
            } catch (IOException e5) {
                f.a(this.f6251e, e5);
                return -1L;
            }
        }
    }

    static {
        u uVar = new u();
        uVar.c(7, 65535);
        uVar.c(5, 16384);
        C = uVar;
    }

    public f(b builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean z4 = builder.f6240h;
        this.f6206b = z4;
        this.f6207c = builder.f6237e;
        this.f6208d = new LinkedHashMap();
        String str = builder.f6234b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
        }
        this.f6209e = str;
        this.f6211g = builder.f6240h ? 3 : 2;
        v3.d dVar = builder.f6241i;
        this.f6213i = dVar;
        v3.c f5 = dVar.f();
        this.f6214j = f5;
        this.f6215k = dVar.f();
        this.f6216l = dVar.f();
        this.f6217m = builder.f6238f;
        u uVar = new u();
        if (builder.f6240h) {
            uVar.c(7, 16777216);
        }
        Unit unit = Unit.INSTANCE;
        this.f6223s = uVar;
        this.f6224t = C;
        this.f6228x = r2.a();
        Socket socket = builder.f6233a;
        if (socket == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socket");
        }
        this.f6229y = socket;
        f4.g gVar = builder.f6236d;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sink");
        }
        this.f6230z = new r(gVar, z4);
        f4.h hVar = builder.f6235c;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("source");
        }
        this.A = new e(this, new p(hVar, z4));
        this.B = new LinkedHashSet();
        int i5 = builder.f6239g;
        if (i5 != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i5);
            f5.c(new a(androidx.activity.d.f(str, " ping"), this, nanos), nanos);
        }
    }

    public static final void a(f fVar, IOException iOException) {
        z3.b bVar = z3.b.PROTOCOL_ERROR;
        fVar.b(bVar, bVar, iOException);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, z3.q>] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, z3.q>] */
    public final void b(z3.b connectionCode, z3.b streamCode, IOException iOException) {
        int i5;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        byte[] bArr = t3.c.f5449a;
        try {
            l(connectionCode);
        } catch (IOException unused) {
        }
        q[] qVarArr = null;
        synchronized (this) {
            if (!this.f6208d.isEmpty()) {
                Object[] array = this.f6208d.values().toArray(new q[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                qVarArr = (q[]) array;
                this.f6208d.clear();
            }
            Unit unit = Unit.INSTANCE;
        }
        if (qVarArr != null) {
            for (q qVar : qVarArr) {
                try {
                    qVar.c(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f6230z.close();
        } catch (IOException unused3) {
        }
        try {
            this.f6229y.close();
        } catch (IOException unused4) {
        }
        this.f6214j.f();
        this.f6215k.f();
        this.f6216l.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, z3.q>] */
    public final synchronized q c(int i5) {
        return (q) this.f6208d.get(Integer.valueOf(i5));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(z3.b.NO_ERROR, z3.b.CANCEL, null);
    }

    public final boolean e(int i5) {
        return i5 != 0 && (i5 & 1) == 0;
    }

    public final synchronized q f(int i5) {
        q remove;
        remove = this.f6208d.remove(Integer.valueOf(i5));
        notifyAll();
        return remove;
    }

    public final void flush() {
        this.f6230z.flush();
    }

    public final void l(z3.b statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f6230z) {
            synchronized (this) {
                if (this.f6212h) {
                    return;
                }
                this.f6212h = true;
                int i5 = this.f6210f;
                Unit unit = Unit.INSTANCE;
                this.f6230z.e(i5, statusCode, t3.c.f5449a);
            }
        }
    }

    public final synchronized void n(long j5) {
        long j6 = this.f6225u + j5;
        this.f6225u = j6;
        long j7 = j6 - this.f6226v;
        if (j7 >= this.f6223s.a() / 2) {
            s(0, j7);
            this.f6226v += j7;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r5 - r3), r8.f6230z.f6322c);
        r6 = r3;
        r8.f6227w += r6;
        r4 = kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r9, boolean r10, f4.f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            z3.r r12 = r8.f6230z
            r12.b(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L6a
            monitor-enter(r8)
        L12:
            long r3 = r8.f6227w     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            long r5 = r8.f6228x     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L32
            java.util.Map<java.lang.Integer, z3.q> r3 = r8.f6208d     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            if (r3 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            goto L12
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            throw r9     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
        L32:
            long r5 = r5 - r3
            long r3 = java.lang.Math.min(r12, r5)     // Catch: java.lang.Throwable -> L59
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L59
            z3.r r3 = r8.f6230z     // Catch: java.lang.Throwable -> L59
            int r3 = r3.f6322c     // Catch: java.lang.Throwable -> L59
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L59
            long r4 = r8.f6227w     // Catch: java.lang.Throwable -> L59
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L59
            long r4 = r4 + r6
            r8.f6227w = r4     // Catch: java.lang.Throwable -> L59
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L59
            monitor-exit(r8)
            long r12 = r12 - r6
            z3.r r4 = r8.f6230z
            if (r10 == 0) goto L54
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = 0
        L55:
            r4.b(r5, r9, r11, r3)
            goto Ld
        L59:
            r9 = move-exception
            goto L68
        L5b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L59
            r9.interrupt()     // Catch: java.lang.Throwable -> L59
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L59
            r9.<init>()     // Catch: java.lang.Throwable -> L59
            throw r9     // Catch: java.lang.Throwable -> L59
        L68:
            monitor-exit(r8)
            throw r9
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.f.p(int, boolean, f4.f, long):void");
    }

    public final void q(boolean z4, int i5, int i6) {
        try {
            this.f6230z.l(z4, i5, i6);
        } catch (IOException e5) {
            z3.b bVar = z3.b.PROTOCOL_ERROR;
            b(bVar, bVar, e5);
        }
    }

    public final void r(int i5, z3.b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f6214j.c(new C0090f(this.f6209e + '[' + i5 + "] writeSynReset", this, i5, errorCode), 0L);
    }

    public final void s(int i5, long j5) {
        this.f6214j.c(new g(this.f6209e + '[' + i5 + "] windowUpdate", this, i5, j5), 0L);
    }
}
