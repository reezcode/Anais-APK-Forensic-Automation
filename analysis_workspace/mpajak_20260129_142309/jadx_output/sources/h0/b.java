package h0;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public final class b implements d, c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3079a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final d f3080b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c f3081c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f3082d;

    /* renamed from: e, reason: collision with root package name */
    @GuardedBy("requestLock")
    public int f3083e = 3;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("requestLock")
    public int f3084f = 3;

    public b(Object obj, @Nullable d dVar) {
        this.f3079a = obj;
        this.f3080b = dVar;
    }

    @Override // h0.d, h0.c
    public final boolean a() {
        boolean z4;
        synchronized (this.f3079a) {
            z4 = this.f3081c.a() || this.f3082d.a();
        }
        return z4;
    }

    @Override // h0.d
    public final void b(c cVar) {
        synchronized (this.f3079a) {
            if (cVar.equals(this.f3081c)) {
                this.f3083e = 4;
            } else if (cVar.equals(this.f3082d)) {
                this.f3084f = 4;
            }
            d dVar = this.f3080b;
            if (dVar != null) {
                dVar.b(this);
            }
        }
    }

    @Override // h0.c
    public final boolean c(c cVar) {
        if (!(cVar instanceof b)) {
            return false;
        }
        b bVar = (b) cVar;
        return this.f3081c.c(bVar.f3081c) && this.f3082d.c(bVar.f3082d);
    }

    @Override // h0.c
    public final void clear() {
        synchronized (this.f3079a) {
            this.f3083e = 3;
            this.f3081c.clear();
            if (this.f3084f != 3) {
                this.f3084f = 3;
                this.f3082d.clear();
            }
        }
    }

    @Override // h0.d
    public final boolean d(c cVar) {
        boolean z4;
        boolean z5;
        synchronized (this.f3079a) {
            d dVar = this.f3080b;
            z4 = true;
            if (dVar != null && !dVar.d(this)) {
                z5 = false;
                if (z5 || !l(cVar)) {
                    z4 = false;
                }
            }
            z5 = true;
            if (z5) {
            }
            z4 = false;
        }
        return z4;
    }

    @Override // h0.c
    public final boolean e() {
        boolean z4;
        synchronized (this.f3079a) {
            z4 = this.f3083e == 3 && this.f3084f == 3;
        }
        return z4;
    }

    @Override // h0.d
    public final boolean f(c cVar) {
        boolean z4;
        boolean z5;
        synchronized (this.f3079a) {
            d dVar = this.f3080b;
            z4 = true;
            if (dVar != null && !dVar.f(this)) {
                z5 = false;
                if (z5 || !l(cVar)) {
                    z4 = false;
                }
            }
            z5 = true;
            if (z5) {
            }
            z4 = false;
        }
        return z4;
    }

    @Override // h0.d
    public final d g() {
        d g5;
        synchronized (this.f3079a) {
            d dVar = this.f3080b;
            g5 = dVar != null ? dVar.g() : this;
        }
        return g5;
    }

    @Override // h0.d
    public final void h(c cVar) {
        synchronized (this.f3079a) {
            if (cVar.equals(this.f3082d)) {
                this.f3084f = 5;
                d dVar = this.f3080b;
                if (dVar != null) {
                    dVar.h(this);
                }
                return;
            }
            this.f3083e = 5;
            if (this.f3084f != 1) {
                this.f3084f = 1;
                this.f3082d.i();
            }
        }
    }

    @Override // h0.c
    public final void i() {
        synchronized (this.f3079a) {
            if (this.f3083e != 1) {
                this.f3083e = 1;
                this.f3081c.i();
            }
        }
    }

    @Override // h0.c
    public final boolean isRunning() {
        boolean z4;
        synchronized (this.f3079a) {
            z4 = true;
            if (this.f3083e != 1 && this.f3084f != 1) {
                z4 = false;
            }
        }
        return z4;
    }

    @Override // h0.c
    public final boolean j() {
        boolean z4;
        synchronized (this.f3079a) {
            z4 = this.f3083e == 4 || this.f3084f == 4;
        }
        return z4;
    }

    @Override // h0.d
    public final boolean k(c cVar) {
        boolean z4;
        boolean z5;
        synchronized (this.f3079a) {
            d dVar = this.f3080b;
            z4 = false;
            if (dVar != null && !dVar.k(this)) {
                z5 = false;
                if (z5 && l(cVar)) {
                    z4 = true;
                }
            }
            z5 = true;
            if (z5) {
                z4 = true;
            }
        }
        return z4;
    }

    @GuardedBy("requestLock")
    public final boolean l(c cVar) {
        return cVar.equals(this.f3081c) || (this.f3083e == 5 && cVar.equals(this.f3082d));
    }

    @Override // h0.c
    public final void pause() {
        synchronized (this.f3079a) {
            if (this.f3083e == 1) {
                this.f3083e = 2;
                this.f3081c.pause();
            }
            if (this.f3084f == 1) {
                this.f3084f = 2;
                this.f3082d.pause();
            }
        }
    }
}
