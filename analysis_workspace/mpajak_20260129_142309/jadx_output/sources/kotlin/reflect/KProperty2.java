package kotlin.reflect;

import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* loaded from: classes24.dex */
public interface KProperty2<D, E, V> extends KProperty<V>, Function2<D, E, V> {

    /* loaded from: classes5.dex */
    public interface Getter<D, E, V> extends KProperty.Getter<V>, Function2<D, E, V> {
    }

    V get(D d5, E e5);

    @SinceKotlin(version = "1.1")
    Object getDelegate(D d5, E e5);

    @Override // kotlin.reflect.KProperty
    Getter<D, E, V> getGetter();
}
