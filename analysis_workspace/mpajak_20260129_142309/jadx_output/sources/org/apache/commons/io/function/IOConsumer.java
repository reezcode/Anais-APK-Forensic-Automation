package org.apache.commons.io.function;

import androidx.constraintlayout.core.state.d;

@FunctionalInterface
/* loaded from: classes3.dex */
public interface IOConsumer<T> {
    public static final IOConsumer<?> NOOP_IO_CONSUMER = d.f148b;

    void accept(T t4);

    IOConsumer<T> andThen(IOConsumer<? super T> iOConsumer);
}
