package i4;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOSupplier;

/* loaded from: classes18.dex */
public final /* synthetic */ class a implements IOConsumer, IOFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3347c;

    public /* synthetic */ a(Object obj, Object obj2, int i5) {
        this.f3345a = i5;
        this.f3346b = obj;
        this.f3347c = obj2;
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final void accept(Object obj) {
        b.b((IOConsumer) this.f3346b, (IOConsumer) this.f3347c, obj);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOConsumer andThen(Consumer consumer) {
        return h.a(this, consumer);
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
        switch (this.f3345a) {
            case 0:
                return b.a(this, iOConsumer);
            default:
                return h.b(this, iOConsumer);
        }
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOFunction andThen(Function function) {
        return h.c(this, function);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOFunction andThen(IOFunction iOFunction) {
        return h.d(this, iOFunction);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final Object apply(Object obj) {
        Object apply;
        apply = ((IOFunction) this.f3346b).apply(((Function) this.f3347c).apply(obj));
        return apply;
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOFunction compose(Function function) {
        return h.e(this, function);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOFunction compose(IOFunction iOFunction) {
        return h.f(this, iOFunction);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOSupplier compose(Supplier supplier) {
        return h.g(this, supplier);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
        return h.h(this, iOSupplier);
    }
}
