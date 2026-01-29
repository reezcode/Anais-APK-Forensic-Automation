package r;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r.h;
import v.o;

/* loaded from: classes12.dex */
public final class b0 implements h, h.a {

    /* renamed from: b, reason: collision with root package name */
    public final i<?> f4807b;

    /* renamed from: c, reason: collision with root package name */
    public final h.a f4808c;

    /* renamed from: d, reason: collision with root package name */
    public int f4809d;

    /* renamed from: e, reason: collision with root package name */
    public e f4810e;

    /* renamed from: f, reason: collision with root package name */
    public Object f4811f;

    /* renamed from: g, reason: collision with root package name */
    public volatile o.a<?> f4812g;

    /* renamed from: h, reason: collision with root package name */
    public f f4813h;

    public b0(i<?> iVar, h.a aVar) {
        this.f4807b = iVar;
        this.f4808c = aVar;
    }

    @Override // r.h.a
    public final void a() {
        throw new UnsupportedOperationException();
    }

    @Override // r.h.a
    public final void b(p.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, p.a aVar) {
        this.f4808c.b(fVar, exc, dVar, this.f4812g.f5514c.e());
    }

    @Override // r.h
    public final void cancel() {
        o.a<?> aVar = this.f4812g;
        if (aVar != null) {
            aVar.f5514c.cancel();
        }
    }

    @Override // r.h.a
    public final void d(p.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, p.a aVar, p.f fVar2) {
        this.f4808c.d(fVar, obj, dVar, this.f4812g.f5514c.e(), fVar);
    }

    @Override // r.h
    public final boolean e() {
        Object obj = this.f4811f;
        if (obj != null) {
            this.f4811f = null;
            int i5 = l0.f.f3932b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                p.d<X> e5 = this.f4807b.e(obj);
                g gVar = new g(e5, obj, this.f4807b.f4843i);
                p.f fVar = this.f4812g.f5512a;
                i<?> iVar = this.f4807b;
                this.f4813h = new f(fVar, iVar.f4848n);
                iVar.b().b(this.f4813h, gVar);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f4813h + ", data: " + obj + ", encoder: " + e5 + ", duration: " + l0.f.a(elapsedRealtimeNanos));
                }
                this.f4812g.f5514c.b();
                this.f4810e = new e(Collections.singletonList(this.f4812g.f5512a), this.f4807b, this);
            } catch (Throwable th) {
                this.f4812g.f5514c.b();
                throw th;
            }
        }
        e eVar = this.f4810e;
        if (eVar != null && eVar.e()) {
            return true;
        }
        this.f4810e = null;
        this.f4812g = null;
        boolean z4 = false;
        while (!z4) {
            if (!(this.f4809d < ((ArrayList) this.f4807b.c()).size())) {
                break;
            }
            List<o.a<?>> c5 = this.f4807b.c();
            int i6 = this.f4809d;
            this.f4809d = i6 + 1;
            this.f4812g = (o.a) ((ArrayList) c5).get(i6);
            if (this.f4812g != null && (this.f4807b.f4850p.c(this.f4812g.f5514c.e()) || this.f4807b.g(this.f4812g.f5514c.a()))) {
                this.f4812g.f5514c.f(this.f4807b.f4849o, new a0(this, this.f4812g));
                z4 = true;
            }
        }
        return z4;
    }
}
