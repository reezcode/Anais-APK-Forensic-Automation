package h0;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* loaded from: classes10.dex */
public final class i implements d, c {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final d f3111a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3112b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c f3113c;

    /* renamed from: d, reason: collision with root package name */
    public volatile c f3114d;

    /* renamed from: e, reason: collision with root package name */
    @GuardedBy("requestLock")
    public int f3115e = 3;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("requestLock")
    public int f3116f = 3;

    /* renamed from: g, reason: collision with root package name */
    @GuardedBy("requestLock")
    public boolean f3117g;

    public i(Object obj, @Nullable d dVar) {
        this.f3112b = obj;
        this.f3111a = dVar;
    }

    @Override // h0.d, h0.c
    public final boolean a() {
        boolean z4;
        synchronized (this.f3112b) {
            z4 = this.f3114d.a() || this.f3113c.a();
        }
        return z4;
    }

    @Override // h0.d
    public final void b(c cVar) {
        synchronized (this.f3112b) {
            if (cVar.equals(this.f3114d)) {
                this.f3116f = 4;
                return;
            }
            this.f3115e = 4;
            d dVar = this.f3111a;
            if (dVar != null) {
                dVar.b(this);
            }
            if (!androidx.activity.d.a(this.f3116f)) {
                this.f3114d.clear();
            }
        }
    }

    @Override // h0.c
    public final boolean c(c cVar) {
        if (!(cVar instanceof i)) {
            return false;
        }
        i iVar = (i) cVar;
        if (this.f3113c == null) {
            if (iVar.f3113c != null) {
                return false;
            }
        } else if (!this.f3113c.c(iVar.f3113c)) {
            return false;
        }
        if (this.f3114d == null) {
            if (iVar.f3114d != null) {
                return false;
            }
        } else if (!this.f3114d.c(iVar.f3114d)) {
            return false;
        }
        return true;
    }

    @Override // h0.c
    public final void clear() {
        synchronized (this.f3112b) {
            this.f3117g = false;
            this.f3115e = 3;
            this.f3116f = 3;
            this.f3114d.clear();
            this.f3113c.clear();
        }
    }

    @Override // h0.d
    public final boolean d(c cVar) {
        boolean z4;
        boolean z5;
        synchronized (this.f3112b) {
            d dVar = this.f3111a;
            z4 = true;
            if (dVar != null && !dVar.d(this)) {
                z5 = false;
                if (z5 || !cVar.equals(this.f3113c) || this.f3115e == 2) {
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
        synchronized (this.f3112b) {
            z4 = this.f3115e == 3;
        }
        return z4;
    }

    @Override // h0.d
    public final boolean f(c cVar) {
        boolean z4;
        boolean z5;
        synchronized (this.f3112b) {
            d dVar = this.f3111a;
            z4 = true;
            if (dVar != null && !dVar.f(this)) {
                z5 = false;
                if (z5 || (!cVar.equals(this.f3113c) && this.f3115e == 4)) {
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
        synchronized (this.f3112b) {
            d dVar = this.f3111a;
            g5 = dVar != null ? dVar.g() : this;
        }
        return g5;
    }

    @Override // h0.d
    public final void h(c cVar) {
        synchronized (this.f3112b) {
            if (!cVar.equals(this.f3113c)) {
                this.f3116f = 5;
                return;
            }
            this.f3115e = 5;
            d dVar = this.f3111a;
            if (dVar != null) {
                dVar.h(this);
            }
        }
    }

    @Override // h0.c
    public final void i() {
        synchronized (this.f3112b) {
            this.f3117g = true;
            try {
                if (this.f3115e != 4 && this.f3116f != 1) {
                    this.f3116f = 1;
                    this.f3114d.i();
                }
                if (this.f3117g && this.f3115e != 1) {
                    this.f3115e = 1;
                    this.f3113c.i();
                }
            } finally {
                this.f3117g = false;
            }
        }
    }

    @Override // h0.c
    public final boolean isRunning() {
        boolean z4;
        synchronized (this.f3112b) {
            z4 = true;
            if (this.f3115e != 1) {
                z4 = false;
            }
        }
        return z4;
    }

    @Override // h0.c
    public final boolean j() {
        boolean z4;
        synchronized (this.f3112b) {
            z4 = this.f3115e == 4;
        }
        return z4;
    }

    @Override // h0.d
    public final boolean k(c cVar) {
        boolean z4;
        boolean z5;
        synchronized (this.f3112b) {
            d dVar = this.f3111a;
            z4 = false;
            if (dVar != null && !dVar.k(this)) {
                z5 = false;
                if (z5 && cVar.equals(this.f3113c) && !a()) {
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

    @Override // h0.c
    public final void pause() {
        synchronized (this.f3112b) {
            if (!androidx.activity.d.a(this.f3116f)) {
                this.f3116f = 2;
                this.f3114d.pause();
            }
            if (!androidx.activity.d.a(this.f3115e)) {
                this.f3115e = 2;
                this.f3113c.pause();
            }
        }
    }
}
