package kotlin.properties;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public abstract class ObservableProperty<V> implements ReadWriteProperty<Object, V> {
    private V value;

    public ObservableProperty(V v4) {
        this.value = v4;
    }

    public void afterChange(KProperty<?> property, V v4, V v5) {
        Intrinsics.checkNotNullParameter(property, "property");
    }

    public boolean beforeChange(KProperty<?> property, V v4, V v5) {
        Intrinsics.checkNotNullParameter(property, "property");
        return true;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public V getValue(Object obj, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.value;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(Object obj, KProperty<?> property, V v4) {
        Intrinsics.checkNotNullParameter(property, "property");
        V v5 = this.value;
        if (beforeChange(property, v5, v4)) {
            this.value = v4;
            afterChange(property, v5, v4);
        }
    }
}
