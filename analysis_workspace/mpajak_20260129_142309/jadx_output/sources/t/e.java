package t;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import n.a;
import t.a;
import t.c;

/* loaded from: classes3.dex */
public final class e implements a {

    /* renamed from: b, reason: collision with root package name */
    public final File f5401b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5402c;

    /* renamed from: e, reason: collision with root package name */
    public n.a f5404e;

    /* renamed from: d, reason: collision with root package name */
    public final c f5403d = new c();

    /* renamed from: a, reason: collision with root package name */
    public final k f5400a = new k();

    @Deprecated
    public e(File file, long j5) {
        this.f5401b = file;
        this.f5402c = j5;
    }

    @Override // t.a
    public final File a(p.f fVar) {
        String a5 = this.f5400a.a(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + a5 + " for for Key: " + fVar);
        }
        try {
            a.e n4 = c().n(a5);
            if (n4 != null) {
                return n4.f4490a[0];
            }
            return null;
        } catch (IOException e5) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e5);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, t.c$a>] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayDeque, java.util.Queue<t.c$a>] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.HashMap, java.util.Map<java.lang.String, t.c$a>] */
    @Override // t.a
    public final void b(p.f fVar, a.b bVar) {
        c.a aVar;
        boolean z4;
        String a5 = this.f5400a.a(fVar);
        c cVar = this.f5403d;
        synchronized (cVar) {
            aVar = (c.a) cVar.f5393a.get(a5);
            if (aVar == null) {
                c.b bVar2 = cVar.f5394b;
                synchronized (bVar2.f5397a) {
                    aVar = (c.a) bVar2.f5397a.poll();
                }
                if (aVar == null) {
                    aVar = new c.a();
                }
                cVar.f5393a.put(a5, aVar);
            }
            aVar.f5396b++;
        }
        aVar.f5395a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + a5 + " for for Key: " + fVar);
            }
            try {
                n.a c5 = c();
                if (c5.n(a5) == null) {
                    a.c f5 = c5.f(a5);
                    if (f5 == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + a5);
                    }
                    try {
                        r.g gVar = (r.g) bVar;
                        if (gVar.f4832a.a(gVar.f4833b, f5.b(), gVar.f4834c)) {
                            n.a.a(n.a.this, f5, true);
                            f5.f4480c = true;
                        }
                        if (!z4) {
                            try {
                                f5.a();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!f5.f4480c) {
                            try {
                                f5.a();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException e5) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e5);
                }
            }
        } finally {
            this.f5403d.a(a5);
        }
    }

    public final synchronized n.a c() {
        if (this.f5404e == null) {
            this.f5404e = n.a.q(this.f5401b, this.f5402c);
        }
        return this.f5404e;
    }
}
