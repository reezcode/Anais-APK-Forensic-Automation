package androidx.work.multiprocess;

import androidx.work.PeriodicWorkRequest;
import java.util.function.Supplier;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOSupplier;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements RemoteDispatcher, IOSupplier, IOConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f315b;

    public /* synthetic */ b(Object obj, Object obj2) {
        this.f314a = obj;
        this.f315b = obj2;
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final void accept(Object obj) {
        ((IOConsumer) this.f315b).accept(((IOFunction) this.f314a).apply(obj));
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
        return i4.b.a(this, iOConsumer);
    }

    @Override // androidx.work.multiprocess.RemoteDispatcher
    public final void execute(Object obj, IWorkManagerImplCallback iWorkManagerImplCallback) {
        RemoteWorkManagerClient.lambda$enqueueUniquePeriodicWork$0((PeriodicWorkRequest) this.f314a, (String) this.f315b, (IWorkManagerImpl) obj, iWorkManagerImplCallback);
    }

    @Override // org.apache.commons.io.function.IOSupplier
    public final Object get() {
        Object apply;
        apply = ((IOFunction) this.f314a).apply(((Supplier) this.f315b).get());
        return apply;
    }
}
