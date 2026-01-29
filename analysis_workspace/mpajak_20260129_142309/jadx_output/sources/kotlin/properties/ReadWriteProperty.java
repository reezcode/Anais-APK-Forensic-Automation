package kotlin.properties;

import kotlin.reflect.KProperty;

/* loaded from: classes4.dex */
public interface ReadWriteProperty<T, V> extends ReadOnlyProperty<T, V> {
    @Override // kotlin.properties.ReadOnlyProperty
    V getValue(T t4, KProperty<?> kProperty);

    void setValue(T t4, KProperty<?> kProperty, V v4);
}
