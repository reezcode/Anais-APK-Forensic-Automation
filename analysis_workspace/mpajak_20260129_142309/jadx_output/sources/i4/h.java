package i4;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOSupplier;

/* loaded from: classes23.dex */
public final /* synthetic */ class h<T, R> {
    public static IOConsumer a(final IOFunction iOFunction, final Consumer consumer) {
        Objects.requireNonNull(consumer, "after");
        return new IOConsumer() { // from class: i4.c
            @Override // org.apache.commons.io.function.IOConsumer
            public final void accept(Object obj) {
                consumer.accept(IOFunction.this.apply(obj));
            }

            @Override // org.apache.commons.io.function.IOConsumer
            public final /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return b.a(this, iOConsumer);
            }
        };
    }

    public static IOConsumer b(IOFunction iOFunction, IOConsumer iOConsumer) {
        Objects.requireNonNull(iOConsumer, "after");
        return new androidx.work.multiprocess.b(iOFunction, iOConsumer);
    }

    public static IOFunction c(final IOFunction iOFunction, final Function function) {
        Objects.requireNonNull(function, "after");
        return new IOFunction() { // from class: i4.d
            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return h.a(this, consumer);
            }

            @Override // org.apache.commons.io.function.IOFunction, org.apache.commons.io.function.IOConsumer
            public final /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return h.b(this, iOConsumer);
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOFunction andThen(Function function2) {
                return h.c(this, function2);
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOFunction andThen(IOFunction iOFunction2) {
                return h.d(this, iOFunction2);
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                Object apply;
                apply = function.apply(IOFunction.this.apply(obj));
                return apply;
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOFunction compose(Function function2) {
                return h.e(this, function2);
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOFunction compose(IOFunction iOFunction2) {
                return h.f(this, iOFunction2);
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOSupplier compose(Supplier supplier) {
                return h.g(this, supplier);
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return h.h(this, iOSupplier);
            }
        };
    }

    public static IOFunction d(final IOFunction iOFunction, final IOFunction iOFunction2) {
        Objects.requireNonNull(iOFunction2, "after");
        return new IOFunction() { // from class: i4.e
            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return h.a(this, consumer);
            }

            @Override // org.apache.commons.io.function.IOFunction, org.apache.commons.io.function.IOConsumer
            public final /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return h.b(this, iOConsumer);
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOFunction andThen(Function function) {
                return h.c(this, function);
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOFunction andThen(IOFunction iOFunction3) {
                return h.d(this, iOFunction3);
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                Object apply;
                apply = iOFunction2.apply(IOFunction.this.apply(obj));
                return apply;
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOFunction compose(Function function) {
                return h.e(this, function);
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOFunction compose(IOFunction iOFunction3) {
                return h.f(this, iOFunction3);
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOSupplier compose(Supplier supplier) {
                return h.g(this, supplier);
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return h.h(this, iOSupplier);
            }
        };
    }

    public static IOFunction e(IOFunction iOFunction, Function function) {
        Objects.requireNonNull(function, "before");
        return new a(iOFunction, function, 1);
    }

    public static IOFunction f(final IOFunction iOFunction, final IOFunction iOFunction2) {
        Objects.requireNonNull(iOFunction2, "before");
        return new IOFunction() { // from class: i4.f
            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return h.a(this, consumer);
            }

            @Override // org.apache.commons.io.function.IOFunction, org.apache.commons.io.function.IOConsumer
            public final /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return h.b(this, iOConsumer);
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOFunction andThen(Function function) {
                return h.c(this, function);
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOFunction andThen(IOFunction iOFunction3) {
                return h.d(this, iOFunction3);
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final Object apply(Object obj) {
                Object apply;
                apply = IOFunction.this.apply(iOFunction2.apply(obj));
                return apply;
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOFunction compose(Function function) {
                return h.e(this, function);
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOFunction compose(IOFunction iOFunction3) {
                return h.f(this, iOFunction3);
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOSupplier compose(Supplier supplier) {
                return h.g(this, supplier);
            }

            @Override // org.apache.commons.io.function.IOFunction
            public final /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return h.h(this, iOSupplier);
            }
        };
    }

    public static IOSupplier g(IOFunction iOFunction, Supplier supplier) {
        Objects.requireNonNull(supplier, "before");
        return new androidx.work.multiprocess.b(iOFunction, supplier);
    }

    public static IOSupplier h(final IOFunction iOFunction, final IOSupplier iOSupplier) {
        Objects.requireNonNull(iOSupplier, "before");
        return new IOSupplier() { // from class: i4.g
            @Override // org.apache.commons.io.function.IOSupplier
            public final Object get() {
                Object apply;
                apply = IOFunction.this.apply(iOSupplier.get());
                return apply;
            }
        };
    }

    public static <T> IOFunction<T, T> q() {
        return androidx.constraintlayout.core.state.e.f151d;
    }

    public static /* synthetic */ Object r(Object obj) {
        return obj;
    }
}
