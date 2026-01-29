package r;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.util.Objects;
import m0.a;
import m0.d;

/* loaded from: classes3.dex */
public final class v<Z> implements w<Z>, a.d {

    /* renamed from: f, reason: collision with root package name */
    public static final Pools.Pool<v<?>> f4981f = (a.c) m0.a.a(20, new a());

    /* renamed from: b, reason: collision with root package name */
    public final d.a f4982b = new d.a();

    /* renamed from: c, reason: collision with root package name */
    public w<Z> f4983c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4984d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4985e;

    /* loaded from: classes20.dex */
    public class a implements a.b<v<?>> {
        @Override // m0.a.b
        public final v<?> a() {
            return new v<>();
        }
    }

    @NonNull
    public static <Z> v<Z> a(w<Z> wVar) {
        v<Z> vVar = (v) f4981f.acquire();
        Objects.requireNonNull(vVar, "Argument must not be null");
        vVar.f4985e = false;
        vVar.f4984d = true;
        vVar.f4983c = wVar;
        return vVar;
    }

    @Override // r.w
    @NonNull
    public final Class<Z> b() {
        return this.f4983c.b();
    }

    @Override // m0.a.d
    @NonNull
    public final m0.d c() {
        return this.f4982b;
    }

    public final synchronized void d() {
        this.f4982b.a();
        if (!this.f4984d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f4984d = false;
        if (this.f4985e) {
            recycle();
        }
    }

    @Override // r.w
    @NonNull
    public final Z get() {
        return this.f4983c.get();
    }

    @Override // r.w
    public final int getSize() {
        return this.f4983c.getSize();
    }

    @Override // r.w
    public final synchronized void recycle() {
        this.f4982b.a();
        this.f4985e = true;
        if (!this.f4984d) {
            this.f4983c.recycle();
            this.f4983c = null;
            f4981f.release(this);
        }
    }
}
