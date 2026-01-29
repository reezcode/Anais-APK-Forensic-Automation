package kotlin.reflect;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KMutableProperty;

/* loaded from: classes10.dex */
public interface KMutableProperty1<T, V> extends KProperty1<T, V>, KMutableProperty<V> {

    /* loaded from: classes16.dex */
    public interface Setter<T, V> extends KMutableProperty.Setter<V>, Function2<T, V, Unit> {
    }

    @Override // kotlin.reflect.KMutableProperty
    Setter<T, V> getSetter();

    void set(T t4, V v4);
}
