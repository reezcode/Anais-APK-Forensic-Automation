package kotlin.properties;

import kotlin.SinceKotlin;
import kotlin.reflect.KProperty;

@SinceKotlin(version = "1.4")
/* loaded from: classes13.dex */
public interface PropertyDelegateProvider<T, D> {
    D provideDelegate(T t4, KProperty<?> kProperty);
}
