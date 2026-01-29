package r;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes17.dex */
public final class q<Z> implements w<Z> {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4961b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4962c;

    /* renamed from: d, reason: collision with root package name */
    public final w<Z> f4963d;

    /* renamed from: e, reason: collision with root package name */
    public final a f4964e;

    /* renamed from: f, reason: collision with root package name */
    public final p.f f4965f;

    /* renamed from: g, reason: collision with root package name */
    public int f4966g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4967h;

    /* loaded from: classes3.dex */
    public interface a {
        void a(p.f fVar, q<?> qVar);
    }

    public q(w<Z> wVar, boolean z4, boolean z5, p.f fVar, a aVar) {
        Objects.requireNonNull(wVar, "Argument must not be null");
        this.f4963d = wVar;
        this.f4961b = z4;
        this.f4962c = z5;
        this.f4965f = fVar;
        Objects.requireNonNull(aVar, "Argument must not be null");
        this.f4964e = aVar;
    }

    public final synchronized void a() {
        if (this.f4967h) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f4966g++;
    }

    @Override // r.w
    @NonNull
    public final Class<Z> b() {
        return this.f4963d.b();
    }

    public final void c() {
        boolean z4;
        synchronized (this) {
            int i5 = this.f4966g;
            if (i5 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z4 = true;
            int i6 = i5 - 1;
            this.f4966g = i6;
            if (i6 != 0) {
                z4 = false;
            }
        }
        if (z4) {
            this.f4964e.a(this.f4965f, this);
        }
    }

    @Override // r.w
    @NonNull
    public final Z get() {
        return this.f4963d.get();
    }

    @Override // r.w
    public final int getSize() {
        return this.f4963d.getSize();
    }

    @Override // r.w
    public final synchronized void recycle() {
        if (this.f4966g > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f4967h) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f4967h = true;
        if (this.f4962c) {
            this.f4963d.recycle();
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f4961b + ", listener=" + this.f4964e + ", key=" + this.f4965f + ", acquired=" + this.f4966g + ", isRecycled=" + this.f4967h + ", resource=" + this.f4963d + '}';
    }
}
