package kotlin.properties;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes8.dex */
public final class Delegates {
    public static final Delegates INSTANCE = new Delegates();

    private Delegates() {
    }

    public final <T> ReadWriteProperty<Object, T> notNull() {
        return new NotNullVar();
    }

    public final <T> ReadWriteProperty<Object, T> observable(final T t4, final Function3<? super KProperty<?>, ? super T, ? super T, Unit> onChange) {
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        return new ObservableProperty<T>(t4) { // from class: kotlin.properties.Delegates$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, T t5, T t6) {
                Intrinsics.checkNotNullParameter(property, "property");
                onChange.invoke(property, t5, t6);
            }
        };
    }

    public final <T> ReadWriteProperty<Object, T> vetoable(final T t4, final Function3<? super KProperty<?>, ? super T, ? super T, Boolean> onChange) {
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        return new ObservableProperty<T>(t4) { // from class: kotlin.properties.Delegates$vetoable$1
            @Override // kotlin.properties.ObservableProperty
            public boolean beforeChange(KProperty<?> property, T t5, T t6) {
                Intrinsics.checkNotNullParameter(property, "property");
                return onChange.invoke(property, t5, t6).booleanValue();
            }
        };
    }
}
