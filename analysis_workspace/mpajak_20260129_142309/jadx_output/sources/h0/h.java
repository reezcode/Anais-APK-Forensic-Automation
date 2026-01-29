package h0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.c;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import l0.e;
import l0.k;
import m0.d;
import r.m;
import r.r;
import r.w;
import v.l;

/* loaded from: classes8.dex */
public final class h<R> implements c, i0.g, g {
    public static final boolean D = Log.isLoggable("Request", 2);

    @GuardedBy("requestLock")
    public int A;

    @GuardedBy("requestLock")
    public boolean B;

    @Nullable
    public RuntimeException C;

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f3085a;

    /* renamed from: b, reason: collision with root package name */
    public final d.a f3086b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3087c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public final e<R> f3088d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3089e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f3090f;

    /* renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.d f3091g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public final Object f3092h;

    /* renamed from: i, reason: collision with root package name */
    public final Class<R> f3093i;

    /* renamed from: j, reason: collision with root package name */
    public final a<?> f3094j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3095k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3096l;

    /* renamed from: m, reason: collision with root package name */
    public final com.bumptech.glide.f f3097m;

    /* renamed from: n, reason: collision with root package name */
    public final i0.h<R> f3098n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public final List<e<R>> f3099o;

    /* renamed from: p, reason: collision with root package name */
    public final j0.b<? super R> f3100p;

    /* renamed from: q, reason: collision with root package name */
    public final Executor f3101q;

    /* renamed from: r, reason: collision with root package name */
    @GuardedBy("requestLock")
    public w<R> f3102r;

    /* renamed from: s, reason: collision with root package name */
    @GuardedBy("requestLock")
    public m.d f3103s;

    /* renamed from: t, reason: collision with root package name */
    @GuardedBy("requestLock")
    public long f3104t;

    /* renamed from: u, reason: collision with root package name */
    public volatile m f3105u;

    /* renamed from: v, reason: collision with root package name */
    @GuardedBy("requestLock")
    public int f3106v;

    /* renamed from: w, reason: collision with root package name */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f3107w;

    /* renamed from: x, reason: collision with root package name */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f3108x;

    /* renamed from: y, reason: collision with root package name */
    @Nullable
    @GuardedBy("requestLock")
    public Drawable f3109y;

    /* renamed from: z, reason: collision with root package name */
    @GuardedBy("requestLock")
    public int f3110z;

    public h(Context context, com.bumptech.glide.d dVar, @NonNull Object obj, @Nullable Object obj2, Class cls, a aVar, int i5, int i6, com.bumptech.glide.f fVar, i0.h hVar, @Nullable List list, d dVar2, m mVar) {
        j0.b<? super R> bVar = (j0.b<? super R>) j0.a.f3423b;
        e.a aVar2 = l0.e.f3929a;
        this.f3085a = D ? String.valueOf(hashCode()) : null;
        this.f3086b = new d.a();
        this.f3087c = obj;
        this.f3090f = context;
        this.f3091g = dVar;
        this.f3092h = obj2;
        this.f3093i = cls;
        this.f3094j = aVar;
        this.f3095k = i5;
        this.f3096l = i6;
        this.f3097m = fVar;
        this.f3098n = hVar;
        this.f3088d = null;
        this.f3099o = list;
        this.f3089e = dVar2;
        this.f3105u = mVar;
        this.f3100p = bVar;
        this.f3101q = aVar2;
        this.f3106v = 1;
        if (this.C == null && dVar.f561h.a(c.C0014c.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // h0.c
    public final boolean a() {
        boolean z4;
        synchronized (this.f3087c) {
            z4 = this.f3106v == 4;
        }
        return z4;
    }

    @Override // i0.g
    public final void b(int i5, int i6) {
        Object obj;
        int i7 = i5;
        this.f3086b.a();
        Object obj2 = this.f3087c;
        synchronized (obj2) {
            try {
                boolean z4 = D;
                if (z4) {
                    m("Got onSizeReady in " + l0.f.a(this.f3104t));
                }
                if (this.f3106v == 3) {
                    this.f3106v = 2;
                    float f5 = this.f3094j.f3055c;
                    if (i7 != Integer.MIN_VALUE) {
                        i7 = Math.round(i7 * f5);
                    }
                    this.f3110z = i7;
                    this.A = i6 == Integer.MIN_VALUE ? i6 : Math.round(f5 * i6);
                    if (z4) {
                        m("finished setup for calling load in " + l0.f.a(this.f3104t));
                    }
                    m mVar = this.f3105u;
                    com.bumptech.glide.d dVar = this.f3091g;
                    Object obj3 = this.f3092h;
                    a<?> aVar = this.f3094j;
                    try {
                        obj = obj2;
                        try {
                            try {
                                this.f3103s = mVar.b(dVar, obj3, aVar.f3065m, this.f3110z, this.A, aVar.f3072t, this.f3093i, this.f3097m, aVar.f3056d, aVar.f3071s, aVar.f3066n, aVar.f3078z, aVar.f3070r, aVar.f3062j, aVar.f3076x, aVar.A, aVar.f3077y, this, this.f3101q);
                                if (this.f3106v != 2) {
                                    this.f3103s = null;
                                }
                                if (z4) {
                                    m("finished onSizeReady in " + l0.f.a(this.f3104t));
                                }
                            } catch (Throwable th) {
                                th = th;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
            }
        }
    }

    @Override // h0.c
    public final boolean c(c cVar) {
        int i5;
        int i6;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        com.bumptech.glide.f fVar;
        int size;
        int i7;
        int i8;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        com.bumptech.glide.f fVar2;
        int size2;
        if (!(cVar instanceof h)) {
            return false;
        }
        synchronized (this.f3087c) {
            i5 = this.f3095k;
            i6 = this.f3096l;
            obj = this.f3092h;
            cls = this.f3093i;
            aVar = this.f3094j;
            fVar = this.f3097m;
            List<e<R>> list = this.f3099o;
            size = list != null ? list.size() : 0;
        }
        h hVar = (h) cVar;
        synchronized (hVar.f3087c) {
            i7 = hVar.f3095k;
            i8 = hVar.f3096l;
            obj2 = hVar.f3092h;
            cls2 = hVar.f3093i;
            aVar2 = hVar.f3094j;
            fVar2 = hVar.f3097m;
            List<e<R>> list2 = hVar.f3099o;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i5 == i7 && i6 == i8) {
            char[] cArr = k.f3942a;
            if ((obj == null ? obj2 == null : obj instanceof l ? ((l) obj).a() : obj.equals(obj2)) && cls.equals(cls2) && aVar.equals(aVar2) && fVar == fVar2 && size == size2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001e, B:14:0x0022, B:19:0x002e, B:20:0x0037, B:21:0x0039), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // h0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f3087c
            monitor-enter(r0)
            r5.d()     // Catch: java.lang.Throwable -> L42
            m0.d$a r1 = r5.f3086b     // Catch: java.lang.Throwable -> L42
            r1.a()     // Catch: java.lang.Throwable -> L42
            int r1 = r5.f3106v     // Catch: java.lang.Throwable -> L42
            r2 = 6
            if (r1 != r2) goto L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            return
        L12:
            r5.f()     // Catch: java.lang.Throwable -> L42
            r.w<R> r1 = r5.f3102r     // Catch: java.lang.Throwable -> L42
            r3 = 0
            if (r1 == 0) goto L1d
            r5.f3102r = r3     // Catch: java.lang.Throwable -> L42
            goto L1e
        L1d:
            r1 = r3
        L1e:
            h0.d r3 = r5.f3089e     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L2b
            boolean r3 = r3.d(r5)     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L29
            goto L2b
        L29:
            r3 = 0
            goto L2c
        L2b:
            r3 = 1
        L2c:
            if (r3 == 0) goto L37
            i0.h<R> r3 = r5.f3098n     // Catch: java.lang.Throwable -> L42
            android.graphics.drawable.Drawable r4 = r5.h()     // Catch: java.lang.Throwable -> L42
            r3.h(r4)     // Catch: java.lang.Throwable -> L42
        L37:
            r5.f3106v = r2     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L41
            r.m r0 = r5.f3105u
            r0.f(r1)
        L41:
            return
        L42:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.h.clear():void");
    }

    @GuardedBy("requestLock")
    public final void d() {
        if (this.B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // h0.c
    public final boolean e() {
        boolean z4;
        synchronized (this.f3087c) {
            z4 = this.f3106v == 6;
        }
        return z4;
    }

    @GuardedBy("requestLock")
    public final void f() {
        d();
        this.f3086b.a();
        this.f3098n.b(this);
        m.d dVar = this.f3103s;
        if (dVar != null) {
            synchronized (m.this) {
                dVar.f4917a.h(dVar.f4918b);
            }
            this.f3103s = null;
        }
    }

    @GuardedBy("requestLock")
    public final Drawable g() {
        int i5;
        if (this.f3109y == null) {
            a<?> aVar = this.f3094j;
            Drawable drawable = aVar.f3068p;
            this.f3109y = drawable;
            if (drawable == null && (i5 = aVar.f3069q) > 0) {
                this.f3109y = l(i5);
            }
        }
        return this.f3109y;
    }

    @GuardedBy("requestLock")
    public final Drawable h() {
        int i5;
        if (this.f3108x == null) {
            a<?> aVar = this.f3094j;
            Drawable drawable = aVar.f3060h;
            this.f3108x = drawable;
            if (drawable == null && (i5 = aVar.f3061i) > 0) {
                this.f3108x = l(i5);
            }
        }
        return this.f3108x;
    }

    @Override // h0.c
    public final void i() {
        synchronized (this.f3087c) {
            d();
            this.f3086b.a();
            int i5 = l0.f.f3932b;
            this.f3104t = SystemClock.elapsedRealtimeNanos();
            if (this.f3092h == null) {
                if (k.j(this.f3095k, this.f3096l)) {
                    this.f3110z = this.f3095k;
                    this.A = this.f3096l;
                }
                n(new r("Received null model"), g() == null ? 5 : 3);
                return;
            }
            int i6 = this.f3106v;
            if (i6 == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (i6 == 4) {
                p(this.f3102r, p.a.MEMORY_CACHE, false);
                return;
            }
            this.f3106v = 3;
            if (k.j(this.f3095k, this.f3096l)) {
                b(this.f3095k, this.f3096l);
            } else {
                this.f3098n.a(this);
            }
            int i7 = this.f3106v;
            if (i7 == 2 || i7 == 3) {
                d dVar = this.f3089e;
                if (dVar == null || dVar.k(this)) {
                    this.f3098n.f(h());
                }
            }
            if (D) {
                m("finished run method in " + l0.f.a(this.f3104t));
            }
        }
    }

    @Override // h0.c
    public final boolean isRunning() {
        boolean z4;
        synchronized (this.f3087c) {
            int i5 = this.f3106v;
            z4 = i5 == 2 || i5 == 3;
        }
        return z4;
    }

    @Override // h0.c
    public final boolean j() {
        boolean z4;
        synchronized (this.f3087c) {
            z4 = this.f3106v == 4;
        }
        return z4;
    }

    @GuardedBy("requestLock")
    public final boolean k() {
        d dVar = this.f3089e;
        return dVar == null || !dVar.g().a();
    }

    @GuardedBy("requestLock")
    public final Drawable l(@DrawableRes int i5) {
        Resources.Theme theme = this.f3094j.f3074v;
        if (theme == null) {
            theme = this.f3090f.getTheme();
        }
        com.bumptech.glide.d dVar = this.f3091g;
        return a0.a.a(dVar, dVar, i5, theme);
    }

    public final void m(String str) {
        StringBuilder e5 = androidx.activity.result.a.e(str, " this: ");
        e5.append(this.f3085a);
        Log.v("Request", e5.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[Catch: all -> 0x0091, TRY_LEAVE, TryCatch #0 {all -> 0x0091, blocks: (B:12:0x0052, B:14:0x0056, B:15:0x005b, B:17:0x0061, B:19:0x0071, B:21:0x0075, B:24:0x0080, B:26:0x0083), top: B:11:0x0052, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c A[Catch: all -> 0x0095, TryCatch #1 {, blocks: (B:4:0x0008, B:6:0x0011, B:8:0x0045, B:9:0x0048, B:28:0x0086, B:30:0x008c, B:31:0x008f, B:37:0x0092, B:38:0x0094, B:12:0x0052, B:14:0x0056, B:15:0x005b, B:17:0x0061, B:19:0x0071, B:21:0x0075, B:24:0x0080, B:26:0x0083), top: B:3:0x0008, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(r.r r5, int r6) {
        /*
            r4 = this;
            m0.d$a r0 = r4.f3086b
            r0.a()
            java.lang.Object r0 = r4.f3087c
            monitor-enter(r0)
            java.util.Objects.requireNonNull(r5)     // Catch: java.lang.Throwable -> L95
            com.bumptech.glide.d r1 = r4.f3091g     // Catch: java.lang.Throwable -> L95
            int r1 = r1.f562i     // Catch: java.lang.Throwable -> L95
            if (r1 > r6) goto L48
            java.lang.String r6 = "Glide"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L95
            r2.<init>()     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = "Load failed for "
            r2.append(r3)     // Catch: java.lang.Throwable -> L95
            java.lang.Object r3 = r4.f3092h     // Catch: java.lang.Throwable -> L95
            r2.append(r3)     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = " with size ["
            r2.append(r3)     // Catch: java.lang.Throwable -> L95
            int r3 = r4.f3110z     // Catch: java.lang.Throwable -> L95
            r2.append(r3)     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = "x"
            r2.append(r3)     // Catch: java.lang.Throwable -> L95
            int r3 = r4.A     // Catch: java.lang.Throwable -> L95
            r2.append(r3)     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = "]"
            r2.append(r3)     // Catch: java.lang.Throwable -> L95
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L95
            android.util.Log.w(r6, r2, r5)     // Catch: java.lang.Throwable -> L95
            r6 = 4
            if (r1 > r6) goto L48
            r5.e()     // Catch: java.lang.Throwable -> L95
        L48:
            r5 = 0
            r4.f3103s = r5     // Catch: java.lang.Throwable -> L95
            r5 = 5
            r4.f3106v = r5     // Catch: java.lang.Throwable -> L95
            r5 = 1
            r4.B = r5     // Catch: java.lang.Throwable -> L95
            r6 = 0
            java.util.List<h0.e<R>> r1 = r4.f3099o     // Catch: java.lang.Throwable -> L91
            if (r1 == 0) goto L70
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L91
            r2 = 0
        L5b:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L91
            if (r3 == 0) goto L71
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L91
            h0.e r3 = (h0.e) r3     // Catch: java.lang.Throwable -> L91
            r4.k()     // Catch: java.lang.Throwable -> L91
            boolean r3 = r3.b()     // Catch: java.lang.Throwable -> L91
            r2 = r2 | r3
            goto L5b
        L70:
            r2 = 0
        L71:
            h0.e<R> r1 = r4.f3088d     // Catch: java.lang.Throwable -> L91
            if (r1 == 0) goto L7f
            r4.k()     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.b()     // Catch: java.lang.Throwable -> L91
            if (r1 == 0) goto L7f
            goto L80
        L7f:
            r5 = 0
        L80:
            r5 = r5 | r2
            if (r5 != 0) goto L86
            r4.q()     // Catch: java.lang.Throwable -> L91
        L86:
            r4.B = r6     // Catch: java.lang.Throwable -> L95
            h0.d r5 = r4.f3089e     // Catch: java.lang.Throwable -> L95
            if (r5 == 0) goto L8f
            r5.h(r4)     // Catch: java.lang.Throwable -> L95
        L8f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L95
            return
        L91:
            r5 = move-exception
            r4.B = r6     // Catch: java.lang.Throwable -> L95
            throw r5     // Catch: java.lang.Throwable -> L95
        L95:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L95
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.h.n(r.r, int):void");
    }

    @GuardedBy("requestLock")
    public final void o(w wVar, Object obj, p.a aVar) {
        boolean z4;
        k();
        this.f3106v = 4;
        this.f3102r = wVar;
        if (this.f3091g.f562i <= 3) {
            StringBuilder g5 = androidx.activity.d.g("Finished loading ");
            g5.append(obj.getClass().getSimpleName());
            g5.append(" from ");
            g5.append(aVar);
            g5.append(" for ");
            g5.append(this.f3092h);
            g5.append(" with size [");
            g5.append(this.f3110z);
            g5.append("x");
            g5.append(this.A);
            g5.append("] in ");
            g5.append(l0.f.a(this.f3104t));
            g5.append(" ms");
            Log.d("Glide", g5.toString());
        }
        boolean z5 = true;
        this.B = true;
        try {
            List<e<R>> list = this.f3099o;
            if (list != null) {
                Iterator<e<R>> it = list.iterator();
                z4 = false;
                while (it.hasNext()) {
                    z4 |= it.next().a();
                }
            } else {
                z4 = false;
            }
            e<R> eVar = this.f3088d;
            if (eVar == null || !eVar.a()) {
                z5 = false;
            }
            if (!(z5 | z4)) {
                Objects.requireNonNull(this.f3100p);
                this.f3098n.i(obj);
            }
            this.B = false;
            d dVar = this.f3089e;
            if (dVar != null) {
                dVar.b(this);
            }
        } catch (Throwable th) {
            this.B = false;
            throw th;
        }
    }

    public final void p(w<?> wVar, p.a aVar, boolean z4) {
        h<R> hVar;
        Throwable th;
        this.f3086b.a();
        w<?> wVar2 = null;
        try {
            synchronized (this.f3087c) {
                try {
                    this.f3103s = null;
                    if (wVar == null) {
                        n(new r("Expected to receive a Resource<R> with an object of " + this.f3093i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = wVar.get();
                    try {
                        if (obj != null && this.f3093i.isAssignableFrom(obj.getClass())) {
                            d dVar = this.f3089e;
                            if (dVar == null || dVar.f(this)) {
                                o(wVar, obj, aVar);
                                return;
                            }
                            this.f3102r = null;
                            this.f3106v = 4;
                            this.f3105u.f(wVar);
                        }
                        this.f3102r = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.f3093i);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(wVar);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        n(new r(sb.toString()), 5);
                        this.f3105u.f(wVar);
                    } catch (Throwable th2) {
                        th = th2;
                        wVar2 = wVar;
                        hVar = this;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (wVar2 != null) {
                                        hVar.f3105u.f(wVar2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                hVar = hVar;
                            }
                            th = th4;
                            hVar = hVar;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    hVar = this;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            hVar = this;
        }
    }

    @Override // h0.c
    public final void pause() {
        synchronized (this.f3087c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    @GuardedBy("requestLock")
    public final void q() {
        int i5;
        d dVar = this.f3089e;
        if (dVar == null || dVar.k(this)) {
            Drawable g5 = this.f3092h == null ? g() : null;
            if (g5 == null) {
                if (this.f3107w == null) {
                    a<?> aVar = this.f3094j;
                    Drawable drawable = aVar.f3058f;
                    this.f3107w = drawable;
                    if (drawable == null && (i5 = aVar.f3059g) > 0) {
                        this.f3107w = l(i5);
                    }
                }
                g5 = this.f3107w;
            }
            if (g5 == null) {
                g5 = h();
            }
            this.f3098n.c(g5);
        }
    }
}
