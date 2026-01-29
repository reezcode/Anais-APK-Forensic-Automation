package e4;

import androidx.core.view.PointerIconCompat;
import e4.g;
import f4.f;
import f4.i;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import s3.b0;
import s3.g0;
import s3.x;
import s3.y;

/* loaded from: classes17.dex */
public final class d implements g0, g.a {

    /* renamed from: x, reason: collision with root package name */
    public static final List<x> f2606x = CollectionsKt.listOf(x.HTTP_1_1);

    /* renamed from: a, reason: collision with root package name */
    public final String f2607a;

    /* renamed from: b, reason: collision with root package name */
    public w3.e f2608b;

    /* renamed from: c, reason: collision with root package name */
    public C0031d f2609c;

    /* renamed from: d, reason: collision with root package name */
    public g f2610d;

    /* renamed from: e, reason: collision with root package name */
    public h f2611e;

    /* renamed from: f, reason: collision with root package name */
    public v3.c f2612f;

    /* renamed from: g, reason: collision with root package name */
    public String f2613g;

    /* renamed from: h, reason: collision with root package name */
    public c f2614h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayDeque<i> f2615i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque<Object> f2616j;

    /* renamed from: k, reason: collision with root package name */
    public long f2617k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2618l;

    /* renamed from: m, reason: collision with root package name */
    public int f2619m;

    /* renamed from: n, reason: collision with root package name */
    public String f2620n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2621o;

    /* renamed from: p, reason: collision with root package name */
    public int f2622p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2623q;

    /* renamed from: r, reason: collision with root package name */
    public final y f2624r;

    /* renamed from: s, reason: collision with root package name */
    public final d1.f f2625s;

    /* renamed from: t, reason: collision with root package name */
    public final Random f2626t;

    /* renamed from: u, reason: collision with root package name */
    public final long f2627u;

    /* renamed from: v, reason: collision with root package name */
    public e4.f f2628v;

    /* renamed from: w, reason: collision with root package name */
    public long f2629w;

    /* loaded from: classes16.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2630a;

        /* renamed from: b, reason: collision with root package name */
        public final i f2631b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2632c = 60000;

        public a(int i5, i iVar) {
            this.f2630a = i5;
            this.f2631b = iVar;
        }
    }

    /* loaded from: classes18.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f2633a;

        /* renamed from: b, reason: collision with root package name */
        public final i f2634b;

        public b(i data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f2633a = 1;
            this.f2634b = data;
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class c implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f2635b;

        /* renamed from: c, reason: collision with root package name */
        public final f4.h f2636c;

        /* renamed from: d, reason: collision with root package name */
        public final f4.g f2637d;

        public c(f4.h source, f4.g sink) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            this.f2635b = true;
            this.f2636c = source;
            this.f2637d = sink;
        }
    }

    /* renamed from: e4.d$d, reason: collision with other inner class name */
    /* loaded from: classes14.dex */
    public final class C0031d extends v3.a {
        public C0031d() {
            super(androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), d.this.f2613g, " writer"), true);
        }

        @Override // v3.a
        public final long a() {
            try {
                return d.this.m() ? 0L : -1L;
            } catch (IOException e5) {
                d.this.i(e5, null);
                return -1L;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class e extends v3.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f2639e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d f2640f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, long j5, d dVar) {
            super(str, true);
            this.f2639e = j5;
            this.f2640f = dVar;
        }

        @Override // v3.a
        public final long a() {
            h hVar;
            d dVar = this.f2640f;
            synchronized (dVar) {
                if (!dVar.f2621o && (hVar = dVar.f2611e) != null) {
                    int i5 = dVar.f2623q ? dVar.f2622p : -1;
                    dVar.f2622p++;
                    dVar.f2623q = true;
                    Unit unit = Unit.INSTANCE;
                    if (i5 != -1) {
                        StringBuilder g5 = androidx.activity.d.g("sent ping but didn't receive pong within ");
                        g5.append(dVar.f2627u);
                        g5.append("ms (after ");
                        g5.append(i5 - 1);
                        g5.append(" successful ping/pongs)");
                        e = new SocketTimeoutException(g5.toString());
                    } else {
                        try {
                            i payload = i.f2860e;
                            Intrinsics.checkNotNullParameter(payload, "payload");
                            hVar.a(9, payload);
                        } catch (IOException e5) {
                            e = e5;
                        }
                    }
                    dVar.i(e, null);
                }
            }
            return this.f2639e;
        }
    }

    /* loaded from: classes9.dex */
    public static final class f extends v3.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f2641e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, d dVar) {
            super(str, true);
            this.f2641e = dVar;
        }

        @Override // v3.a
        public final long a() {
            w3.e eVar = this.f2641e.f2608b;
            Intrinsics.checkNotNull(eVar);
            eVar.d();
            return -1L;
        }
    }

    public d(v3.d taskRunner, y originalRequest, d1.f listener, Random random, long j5, long j6) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f2624r = originalRequest;
        this.f2625s = listener;
        this.f2626t = random;
        this.f2627u = j5;
        this.f2628v = null;
        this.f2629w = j6;
        this.f2612f = taskRunner.f();
        this.f2615i = new ArrayDeque<>();
        this.f2616j = new ArrayDeque<>();
        this.f2619m = -1;
        if (!Intrinsics.areEqual("GET", originalRequest.f5382c)) {
            StringBuilder g5 = androidx.activity.d.g("Request must be GET: ");
            g5.append(originalRequest.f5382c);
            throw new IllegalArgumentException(g5.toString().toString());
        }
        i.a aVar = i.f2861f;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.INSTANCE;
        this.f2607a = i.a.c(bArr).a();
    }

    @Override // s3.g0
    public final boolean a(int i5, String str) {
        synchronized (this) {
            i.g.J(i5);
            i iVar = null;
            if (str != null) {
                iVar = i.f2861f.b(str);
                if (!(((long) iVar.f2864d.length) <= 123)) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
                }
            }
            if (!this.f2621o && !this.f2618l) {
                this.f2618l = true;
                this.f2616j.add(new a(i5, iVar));
                l();
                return true;
            }
            return false;
        }
    }

    @Override // s3.g0
    public final boolean b(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        i b5 = i.f2861f.b(text);
        synchronized (this) {
            if (!this.f2621o && !this.f2618l) {
                long j5 = this.f2617k;
                byte[] bArr = b5.f2864d;
                if (bArr.length + j5 <= 16777216) {
                    this.f2617k = j5 + bArr.length;
                    this.f2616j.add(new b(b5));
                    l();
                    return true;
                }
                a(PointerIconCompat.TYPE_CONTEXT_MENU, null);
            }
            return false;
        }
    }

    @Override // e4.g.a
    public final synchronized void c(i payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!this.f2621o && (!this.f2618l || !this.f2616j.isEmpty())) {
            this.f2615i.add(payload);
            l();
        }
    }

    @Override // e4.g.a
    public final void d(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f2625s.H(this, text);
    }

    @Override // e4.g.a
    public final synchronized void e(i payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f2623q = false;
    }

    @Override // e4.g.a
    public final void f(int i5, String reason) {
        c cVar;
        g gVar;
        h hVar;
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (!(i5 != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            if (!(this.f2619m == -1)) {
                throw new IllegalStateException("already closed".toString());
            }
            this.f2619m = i5;
            this.f2620n = reason;
            cVar = null;
            if (this.f2618l && this.f2616j.isEmpty()) {
                c cVar2 = this.f2614h;
                this.f2614h = null;
                gVar = this.f2610d;
                this.f2610d = null;
                hVar = this.f2611e;
                this.f2611e = null;
                this.f2612f.f();
                cVar = cVar2;
            } else {
                gVar = null;
                hVar = null;
            }
            Unit unit = Unit.INSTANCE;
        }
        try {
            this.f2625s.E();
            if (cVar != null) {
                this.f2625s.D(i5);
            }
        } finally {
            if (cVar != null) {
                t3.c.d(cVar);
            }
            if (gVar != null) {
                t3.c.d(gVar);
            }
            if (hVar != null) {
                t3.c.d(hVar);
            }
        }
    }

    @Override // e4.g.a
    public final void g(i bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f2625s.G();
    }

    public final void h(b0 response, w3.c cVar) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.f5157e != 101) {
            StringBuilder g5 = androidx.activity.d.g("Expected HTTP 101 response but was '");
            g5.append(response.f5157e);
            g5.append(' ');
            g5.append(response.f5156d);
            g5.append('\'');
            throw new ProtocolException(g5.toString());
        }
        String a5 = b0.a(response, "Connection");
        if (!StringsKt.g("Upgrade", a5)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + a5 + '\'');
        }
        String a6 = b0.a(response, "Upgrade");
        if (!StringsKt.g("websocket", a6)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + a6 + '\'');
        }
        String a7 = b0.a(response, "Sec-WebSocket-Accept");
        String a8 = i.f2861f.b(this.f2607a + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").b("SHA-1").a();
        if (!(!Intrinsics.areEqual(a8, a7))) {
            if (cVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a8 + "' but was '" + a7 + '\'');
    }

    public final void i(Exception e5, b0 b0Var) {
        Intrinsics.checkNotNullParameter(e5, "e");
        synchronized (this) {
            if (this.f2621o) {
                return;
            }
            this.f2621o = true;
            c cVar = this.f2614h;
            this.f2614h = null;
            g gVar = this.f2610d;
            this.f2610d = null;
            h hVar = this.f2611e;
            this.f2611e = null;
            this.f2612f.f();
            Unit unit = Unit.INSTANCE;
            try {
                this.f2625s.F();
            } finally {
                if (cVar != null) {
                    t3.c.d(cVar);
                }
                if (gVar != null) {
                    t3.c.d(gVar);
                }
                if (hVar != null) {
                    t3.c.d(hVar);
                }
            }
        }
    }

    public final void j(String name, c streams) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(streams, "streams");
        e4.f fVar = this.f2628v;
        Intrinsics.checkNotNull(fVar);
        synchronized (this) {
            this.f2613g = name;
            this.f2614h = streams;
            boolean z4 = streams.f2635b;
            this.f2611e = new h(z4, streams.f2637d, this.f2626t, fVar.f2644a, z4 ? fVar.f2646c : fVar.f2648e, this.f2629w);
            this.f2609c = new C0031d();
            long j5 = this.f2627u;
            if (j5 != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(j5);
                this.f2612f.c(new e(name + " ping", nanos, this), nanos);
            }
            if (!this.f2616j.isEmpty()) {
                l();
            }
            Unit unit = Unit.INSTANCE;
        }
        boolean z5 = streams.f2635b;
        this.f2610d = new g(z5, streams.f2636c, this, fVar.f2644a, z5 ^ true ? fVar.f2646c : fVar.f2648e);
    }

    public final void k() {
        while (this.f2619m == -1) {
            g gVar = this.f2610d;
            Intrinsics.checkNotNull(gVar);
            gVar.b();
            if (!gVar.f2654f) {
                int i5 = gVar.f2651c;
                if (i5 != 1 && i5 != 2) {
                    StringBuilder g5 = androidx.activity.d.g("Unknown opcode: ");
                    g5.append(t3.c.x(i5));
                    throw new ProtocolException(g5.toString());
                }
                while (!gVar.f2650b) {
                    long j5 = gVar.f2652d;
                    if (j5 > 0) {
                        gVar.f2662n.F(gVar.f2657i, j5);
                        if (!gVar.f2661m) {
                            f4.f fVar = gVar.f2657i;
                            f.a aVar = gVar.f2660l;
                            Intrinsics.checkNotNull(aVar);
                            fVar.f(aVar);
                            gVar.f2660l.b(gVar.f2657i.f2852c - gVar.f2652d);
                            f.a aVar2 = gVar.f2660l;
                            byte[] bArr = gVar.f2659k;
                            Intrinsics.checkNotNull(bArr);
                            i.g.I(aVar2, bArr);
                            gVar.f2660l.close();
                        }
                    }
                    if (gVar.f2653e) {
                        if (gVar.f2655g) {
                            e4.c cVar = gVar.f2658j;
                            if (cVar == null) {
                                cVar = new e4.c(gVar.f2665q);
                                gVar.f2658j = cVar;
                            }
                            f4.f buffer = gVar.f2657i;
                            Intrinsics.checkNotNullParameter(buffer, "buffer");
                            if (!(cVar.f2602b.f2852c == 0)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            if (cVar.f2605e) {
                                cVar.f2603c.reset();
                            }
                            cVar.f2602b.b0(buffer);
                            cVar.f2602b.I(65535);
                            long bytesRead = cVar.f2603c.getBytesRead() + cVar.f2602b.f2852c;
                            do {
                                cVar.f2604d.a(buffer, Long.MAX_VALUE);
                            } while (cVar.f2603c.getBytesRead() < bytesRead);
                        }
                        if (i5 == 1) {
                            gVar.f2663o.d(gVar.f2657i.q());
                        } else {
                            gVar.f2663o.g(gVar.f2657i.l());
                        }
                    } else {
                        while (!gVar.f2650b) {
                            gVar.b();
                            if (!gVar.f2654f) {
                                break;
                            } else {
                                gVar.a();
                            }
                        }
                        if (gVar.f2651c != 0) {
                            StringBuilder g6 = androidx.activity.d.g("Expected continuation opcode. Got: ");
                            g6.append(t3.c.x(gVar.f2651c));
                            throw new ProtocolException(g6.toString());
                        }
                    }
                }
                throw new IOException("closed");
            }
            gVar.a();
        }
    }

    public final void l() {
        byte[] bArr = t3.c.f5449a;
        C0031d c0031d = this.f2609c;
        if (c0031d != null) {
            this.f2612f.c(c0031d, 0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10, types: [T, e4.g] */
    /* JADX WARN: Type inference failed for: r3v11, types: [T, e4.h] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, e4.d$c] */
    public final boolean m() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = null;
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.element = null;
        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        objectRef4.element = null;
        Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
        objectRef5.element = null;
        synchronized (this) {
            if (this.f2621o) {
                return false;
            }
            h hVar = this.f2611e;
            i payload = this.f2615i.poll();
            if (payload == null) {
                ?? poll = this.f2616j.poll();
                objectRef.element = poll;
                if (poll instanceof a) {
                    int i5 = this.f2619m;
                    intRef.element = i5;
                    objectRef2.element = this.f2620n;
                    if (i5 != -1) {
                        objectRef3.element = this.f2614h;
                        this.f2614h = null;
                        objectRef4.element = this.f2610d;
                        this.f2610d = null;
                        objectRef5.element = this.f2611e;
                        this.f2611e = null;
                        this.f2612f.f();
                    } else {
                        T t4 = objectRef.element;
                        if (t4 == 0) {
                            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
                        }
                        long j5 = ((a) t4).f2632c;
                        this.f2612f.c(new f(this.f2613g + " cancel", this), TimeUnit.MILLISECONDS.toNanos(j5));
                    }
                } else if (poll == 0) {
                    return false;
                }
            }
            Unit unit = Unit.INSTANCE;
            try {
                if (payload != null) {
                    Intrinsics.checkNotNull(hVar);
                    Objects.requireNonNull(hVar);
                    Intrinsics.checkNotNullParameter(payload, "payload");
                    hVar.a(10, payload);
                } else {
                    T t5 = objectRef.element;
                    if (t5 instanceof b) {
                        if (t5 == 0) {
                            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message");
                        }
                        b bVar = (b) t5;
                        Intrinsics.checkNotNull(hVar);
                        hVar.b(bVar.f2633a, bVar.f2634b);
                        synchronized (this) {
                            this.f2617k -= bVar.f2634b.c();
                        }
                    } else {
                        if (!(t5 instanceof a)) {
                            throw new AssertionError();
                        }
                        if (t5 == 0) {
                            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
                        }
                        a aVar = (a) t5;
                        Intrinsics.checkNotNull(hVar);
                        int i6 = aVar.f2630a;
                        i iVar = aVar.f2631b;
                        Objects.requireNonNull(hVar);
                        i iVar2 = i.f2860e;
                        if (i6 != 0 || iVar != null) {
                            if (i6 != 0) {
                                i.g.J(i6);
                            }
                            f4.f fVar = new f4.f();
                            fVar.J(i6);
                            if (iVar != null) {
                                fVar.x(iVar);
                            }
                            iVar2 = fVar.l();
                        }
                        try {
                            hVar.a(8, iVar2);
                            hVar.f2668d = true;
                            if (((c) objectRef3.element) != null) {
                                d1.f fVar2 = this.f2625s;
                                int i7 = intRef.element;
                                Intrinsics.checkNotNull((String) objectRef2.element);
                                fVar2.D(i7);
                            }
                        } catch (Throwable th) {
                            hVar.f2668d = true;
                            throw th;
                        }
                    }
                }
                return true;
            } finally {
                c cVar = (c) objectRef3.element;
                if (cVar != null) {
                    t3.c.d(cVar);
                }
                g gVar = (g) objectRef4.element;
                if (gVar != null) {
                    t3.c.d(gVar);
                }
                h hVar2 = (h) objectRef5.element;
                if (hVar2 != null) {
                    t3.c.d(hVar2);
                }
            }
        }
    }
}
