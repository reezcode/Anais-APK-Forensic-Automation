package m3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public final class s0 extends w0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4210g = AtomicIntegerFieldUpdater.newUpdater(s0.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Function1<Throwable, Unit> f4211f;

    /* JADX WARN: Multi-variable type inference failed */
    public s0(Function1<? super Throwable, Unit> function1) {
        this.f4211f = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        k(th);
        return Unit.INSTANCE;
    }

    @Override // m3.p
    public final void k(Throwable th) {
        if (f4210g.compareAndSet(this, 0, 1)) {
            this.f4211f.invoke(th);
        }
    }
}
