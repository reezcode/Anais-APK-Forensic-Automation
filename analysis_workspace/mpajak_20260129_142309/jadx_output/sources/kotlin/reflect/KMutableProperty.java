package kotlin.reflect;

import kotlin.Unit;
import kotlin.reflect.KProperty;

/* loaded from: classes14.dex */
public interface KMutableProperty<V> extends KProperty<V> {

    /* loaded from: classes4.dex */
    public interface Setter<V> extends KProperty.Accessor<V>, KFunction<Unit> {
    }

    Setter<V> getSetter();
}
