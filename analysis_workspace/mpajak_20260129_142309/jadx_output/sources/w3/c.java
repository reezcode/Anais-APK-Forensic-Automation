package w3;

import e4.d;
import f4.a0;
import f4.t;
import f4.u;
import f4.y;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import s3.b0;
import z3.v;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5801a;

    /* renamed from: b, reason: collision with root package name */
    public final j f5802b;

    /* renamed from: c, reason: collision with root package name */
    public final e f5803c;

    /* renamed from: d, reason: collision with root package name */
    public final s3.o f5804d;

    /* renamed from: e, reason: collision with root package name */
    public final d f5805e;

    /* renamed from: f, reason: collision with root package name */
    public final x3.d f5806f;

    /* loaded from: classes3.dex */
    public final class a extends f4.k {

        /* renamed from: c, reason: collision with root package name */
        public boolean f5807c;

        /* renamed from: d, reason: collision with root package name */
        public long f5808d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f5809e;

        /* renamed from: f, reason: collision with root package name */
        public final long f5810f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c f5811g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, y delegate, long j5) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f5811g = cVar;
            this.f5810f = j5;
        }

        @Override // f4.y
        public final void T(f4.f source, long j5) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f5809e)) {
                throw new IllegalStateException("closed".toString());
            }
            long j6 = this.f5810f;
            if (j6 != -1 && this.f5808d + j5 > j6) {
                StringBuilder g5 = androidx.activity.d.g("expected ");
                g5.append(this.f5810f);
                g5.append(" bytes but received ");
                g5.append(this.f5808d + j5);
                throw new ProtocolException(g5.toString());
            }
            try {
                Intrinsics.checkNotNullParameter(source, "source");
                this.f2868b.T(source, j5);
                this.f5808d += j5;
            } catch (IOException e5) {
                throw a(e5);
            }
        }

        public final <E extends IOException> E a(E e5) {
            if (this.f5807c) {
                return e5;
            }
            this.f5807c = true;
            return (E) this.f5811g.a(false, true, e5);
        }

        @Override // f4.k, f4.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f5809e) {
                return;
            }
            this.f5809e = true;
            long j5 = this.f5810f;
            if (j5 != -1 && this.f5808d != j5) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e5) {
                throw a(e5);
            }
        }

        @Override // f4.k, f4.y, java.io.Flushable
        public final void flush() {
            try {
                super.flush();
            } catch (IOException e5) {
                throw a(e5);
            }
        }
    }

    /* loaded from: classes5.dex */
    public final class b extends f4.l {

        /* renamed from: c, reason: collision with root package name */
        public long f5812c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f5813d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f5814e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f5815f;

        /* renamed from: g, reason: collision with root package name */
        public final long f5816g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ c f5817h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, a0 delegate, long j5) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f5817h = cVar;
            this.f5816g = j5;
            this.f5813d = true;
            if (j5 == 0) {
                a(null);
            }
        }

        public final <E extends IOException> E a(E e5) {
            if (this.f5814e) {
                return e5;
            }
            this.f5814e = true;
            if (e5 == null && this.f5813d) {
                this.f5813d = false;
                c cVar = this.f5817h;
                s3.o oVar = cVar.f5804d;
                e call = cVar.f5803c;
                Objects.requireNonNull(oVar);
                Intrinsics.checkNotNullParameter(call, "call");
            }
            return (E) this.f5817h.a(true, false, e5);
        }

        @Override // f4.l, f4.a0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f5815f) {
                return;
            }
            this.f5815f = true;
            try {
                super.close();
                a(null);
            } catch (IOException e5) {
                throw a(e5);
            }
        }

        @Override // f4.a0
        public final long u(f4.f sink, long j5) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!(!this.f5815f)) {
                throw new IllegalStateException("closed".toString());
            }
            try {
                long u4 = this.f2869b.u(sink, j5);
                if (this.f5813d) {
                    this.f5813d = false;
                    c cVar = this.f5817h;
                    s3.o oVar = cVar.f5804d;
                    e call = cVar.f5803c;
                    Objects.requireNonNull(oVar);
                    Intrinsics.checkNotNullParameter(call, "call");
                }
                if (u4 == -1) {
                    a(null);
                    return -1L;
                }
                long j6 = this.f5812c + u4;
                long j7 = this.f5816g;
                if (j7 != -1 && j6 > j7) {
                    throw new ProtocolException("expected " + this.f5816g + " bytes but received " + j6);
                }
                this.f5812c = j6;
                if (j6 == j7) {
                    a(null);
                }
                return u4;
            } catch (IOException e5) {
                throw a(e5);
            }
        }
    }

    public c(e call, s3.o eventListener, d finder, x3.d codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f5803c = call;
        this.f5804d = eventListener;
        this.f5805e = finder;
        this.f5806f = codec;
        this.f5802b = codec.h();
    }

    public final IOException a(boolean z4, boolean z5, IOException iOException) {
        if (iOException != null) {
            f(iOException);
        }
        if (z5) {
            s3.o oVar = this.f5804d;
            e call = this.f5803c;
            if (iOException != null) {
                oVar.b(call, iOException);
            } else {
                Objects.requireNonNull(oVar);
                Intrinsics.checkNotNullParameter(call, "call");
            }
        }
        if (z4) {
            if (iOException != null) {
                this.f5804d.c(this.f5803c, iOException);
            } else {
                s3.o oVar2 = this.f5804d;
                e call2 = this.f5803c;
                Objects.requireNonNull(oVar2);
                Intrinsics.checkNotNullParameter(call2, "call");
            }
        }
        return this.f5803c.h(this, z5, z4, iOException);
    }

    public final y b(s3.y request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f5801a = false;
        d1.f fVar = request.f5384e;
        Intrinsics.checkNotNull(fVar);
        long A = fVar.A();
        s3.o oVar = this.f5804d;
        e call = this.f5803c;
        Objects.requireNonNull(oVar);
        Intrinsics.checkNotNullParameter(call, "call");
        return new a(this, this.f5806f.d(request, A), A);
    }

    public final d.c c() {
        this.f5803c.k();
        j h5 = this.f5806f.h();
        Objects.requireNonNull(h5);
        Intrinsics.checkNotNullParameter(this, "exchange");
        Socket socket = h5.f5860c;
        Intrinsics.checkNotNull(socket);
        u uVar = h5.f5864g;
        Intrinsics.checkNotNull(uVar);
        t tVar = h5.f5865h;
        Intrinsics.checkNotNull(tVar);
        socket.setSoTimeout(0);
        h5.l();
        return new i(this, uVar, tVar, uVar, tVar);
    }

    public final b0.a d(boolean z4) {
        try {
            b0.a g5 = this.f5806f.g(z4);
            if (g5 != null) {
                Intrinsics.checkNotNullParameter(this, "deferredTrailers");
                g5.f5179m = this;
            }
            return g5;
        } catch (IOException e5) {
            this.f5804d.c(this.f5803c, e5);
            f(e5);
            throw e5;
        }
    }

    public final void e() {
        s3.o oVar = this.f5804d;
        e call = this.f5803c;
        Objects.requireNonNull(oVar);
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public final void f(IOException iOException) {
        this.f5805e.c(iOException);
        j h5 = this.f5806f.h();
        e call = this.f5803c;
        synchronized (h5) {
            Intrinsics.checkNotNullParameter(call, "call");
            if (iOException instanceof v) {
                if (((v) iOException).f6337b == z3.b.REFUSED_STREAM) {
                    int i5 = h5.f5870m + 1;
                    h5.f5870m = i5;
                    if (i5 > 1) {
                        h5.f5866i = true;
                        h5.f5868k++;
                    }
                } else if (((v) iOException).f6337b != z3.b.CANCEL || !call.f5840n) {
                    h5.f5866i = true;
                    h5.f5868k++;
                }
            } else if (!h5.j() || (iOException instanceof z3.a)) {
                h5.f5866i = true;
                if (h5.f5869l == 0) {
                    h5.d(call.f5843q, h5.f5874q, iOException);
                    h5.f5868k++;
                }
            }
        }
    }
}
