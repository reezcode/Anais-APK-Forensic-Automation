package kotlin.properties;

import kotlin.reflect.KProperty;

/* loaded from: classes12.dex */
public interface ReadOnlyProperty<T, V> {
    V getValue(T t4, KProperty<?> kProperty);
}
