package t;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import r.m;
import r.w;
import t.i;

/* loaded from: classes20.dex */
public final class h extends l0.g<p.f, w<?>> implements i {

    /* renamed from: d, reason: collision with root package name */
    public i.a f5407d;

    public h(long j5) {
        super(j5);
    }

    @Override // l0.g
    public final int b(@Nullable w<?> wVar) {
        w<?> wVar2 = wVar;
        if (wVar2 == null) {
            return 1;
        }
        return wVar2.getSize();
    }

    @Override // l0.g
    public final void c(@NonNull p.f fVar, @Nullable w<?> wVar) {
        w<?> wVar2 = wVar;
        i.a aVar = this.f5407d;
        if (aVar == null || wVar2 == null) {
            return;
        }
        ((m) aVar).f4900e.a(wVar2, true);
    }
}
