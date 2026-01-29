package m3;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.JvmField;

/* loaded from: classes12.dex */
public final class h extends w0 {

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public final f<?> f4178f;

    public h(f<?> fVar) {
        this.f4178f = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        k(th);
        return Unit.INSTANCE;
    }

    @Override // m3.p
    public final void k(Throwable th) {
        f<?> fVar = this.f4178f;
        z0 l5 = l();
        Objects.requireNonNull(fVar);
        CancellationException q4 = l5.q();
        if (!fVar.r() ? false : ((q3.e) fVar.f4172e).i(q4)) {
            return;
        }
        fVar.c(q4);
        fVar.l();
    }
}
