package i2;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes15.dex */
public final class g extends z<AtomicLong> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f3270a;

    public g(z zVar) {
        this.f3270a = zVar;
    }

    @Override // i2.z
    public final AtomicLong a(p2.a aVar) {
        return new AtomicLong(((Number) this.f3270a.a(aVar)).longValue());
    }

    @Override // i2.z
    public final void b(p2.b bVar, AtomicLong atomicLong) {
        this.f3270a.b(bVar, Long.valueOf(atomicLong.get()));
    }
}
