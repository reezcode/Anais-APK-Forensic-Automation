package androidx.work.impl.model;

import androidx.arch.core.util.Function;
import i4.h;
import java.io.OutputStream;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOSupplier;
import org.apache.commons.io.output.ThresholdingOutputStream;

/* loaded from: classes15.dex */
public final /* synthetic */ class a implements Function, IOFunction {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f303b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f304c = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305a;

    public /* synthetic */ a(int i5) {
        this.f305a = i5;
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOConsumer andThen(Consumer consumer) {
        return h.a(this, consumer);
    }

    @Override // org.apache.commons.io.function.IOFunction, org.apache.commons.io.function.IOConsumer
    public final /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
        return h.b(this, iOConsumer);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOFunction andThen(java.util.function.Function function) {
        return h.c(this, function);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOFunction andThen(IOFunction iOFunction) {
        return h.d(this, iOFunction);
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        OutputStream lambda$static$0;
        List WORK_INFO_MAPPER$lambda$1;
        switch (this.f305a) {
            case 0:
                WORK_INFO_MAPPER$lambda$1 = WorkSpec.WORK_INFO_MAPPER$lambda$1((List) obj);
                return WORK_INFO_MAPPER$lambda$1;
            default:
                lambda$static$0 = ThresholdingOutputStream.lambda$static$0((ThresholdingOutputStream) obj);
                return lambda$static$0;
        }
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOFunction compose(java.util.function.Function function) {
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
