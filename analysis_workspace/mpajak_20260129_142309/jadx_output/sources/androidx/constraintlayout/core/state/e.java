package androidx.constraintlayout.core.state;

import i4.h;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOSupplier;
import org.apache.commons.io.output.ThresholdingOutputStream;

/* loaded from: classes6.dex */
public final /* synthetic */ class e implements Interpolator, IOConsumer, IOFunction {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ e f149b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e f150c = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e f151d = new e(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152a;

    public /* synthetic */ e(int i5) {
        this.f152a = i5;
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final void accept(Object obj) {
        IOUtils.lambda$toByteArray$0((ThresholdingOutputStream) obj);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public final /* synthetic */ IOConsumer andThen(Consumer consumer) {
        return h.a(this, consumer);
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
        switch (this.f152a) {
            case 1:
                return i4.b.a(this, iOConsumer);
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
        return h.r(obj);
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

    @Override // androidx.constraintlayout.core.state.Interpolator
    public final float getInterpolation(float f5) {
        float lambda$getInterpolator$6;
        lambda$getInterpolator$6 = Transition.lambda$getInterpolator$6(f5);
        return lambda$getInterpolator$6;
    }
}
