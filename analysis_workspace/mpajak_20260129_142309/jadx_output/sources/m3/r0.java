package m3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes10.dex */
public final class r0 extends d {

    /* renamed from: b, reason: collision with root package name */
    public final Function1<Throwable, Unit> f4208b;

    /* JADX WARN: Multi-variable type inference failed */
    public r0(Function1<? super Throwable, Unit> function1) {
        this.f4208b = function1;
    }

    @Override // m3.d
    public final void a(Throwable th) {
        this.f4208b.invoke(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f4208b.invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("InvokeOnCancel[");
        g5.append(a0.a(this.f4208b));
        g5.append('@');
        g5.append(a0.b(this));
        g5.append(']');
        return g5.toString();
    }
}
