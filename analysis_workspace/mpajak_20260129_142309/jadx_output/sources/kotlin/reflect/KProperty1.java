package kotlin.reflect;

import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* loaded from: classes19.dex */
public interface KProperty1<T, V> extends KProperty<V>, Function1<T, V> {

    /* loaded from: classes21.dex */
    public interface Getter<T, V> extends KProperty.Getter<V>, Function1<T, V> {
    }

    V get(T t4);

    @SinceKotlin(version = "1.1")
    Object getDelegate(T t4);

    @Override // kotlin.reflect.KProperty
    Getter<T, V> getGetter();
}
