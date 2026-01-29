package i4;

import java.util.Objects;
import org.apache.commons.io.function.IOConsumer;

/* loaded from: classes19.dex */
public final /* synthetic */ class b<T> {
    static {
        IOConsumer<?> iOConsumer = IOConsumer.NOOP_IO_CONSUMER;
    }

    public static IOConsumer a(IOConsumer iOConsumer, IOConsumer iOConsumer2) {
        Objects.requireNonNull(iOConsumer2, "after");
        return new a(iOConsumer, iOConsumer2, 0);
    }

    public static /* synthetic */ void b(IOConsumer iOConsumer, IOConsumer iOConsumer2, Object obj) {
        iOConsumer.accept(obj);
        iOConsumer2.accept(obj);
    }

    public static /* synthetic */ void c(Object obj) {
    }

    public static <T> IOConsumer<T> d() {
        return (IOConsumer<T>) IOConsumer.NOOP_IO_CONSUMER;
    }
}
