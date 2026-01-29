package m3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes17.dex */
public final class t0 extends y0 {

    /* renamed from: f, reason: collision with root package name */
    public final Function1<Throwable, Unit> f4214f;

    /* JADX WARN: Multi-variable type inference failed */
    public t0(Function1<? super Throwable, Unit> function1) {
        this.f4214f = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        k(th);
        return Unit.INSTANCE;
    }

    @Override // m3.p
    public final void k(Throwable th) {
        this.f4214f.invoke(th);
    }
}
