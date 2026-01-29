package m3;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.JvmField;

/* loaded from: classes20.dex */
public final class j extends w0 implements i {

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public final k f4184f;

    public j(k kVar) {
        this.f4184f = kVar;
    }

    @Override // m3.i
    public final boolean d(Throwable th) {
        z0 l5 = l();
        Objects.requireNonNull(l5);
        if (th instanceof CancellationException) {
            return true;
        }
        return l5.h(th) && l5.t();
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        k(th);
        return Unit.INSTANCE;
    }

    @Override // m3.p
    public final void k(Throwable th) {
        this.f4184f.p(l());
    }
}
