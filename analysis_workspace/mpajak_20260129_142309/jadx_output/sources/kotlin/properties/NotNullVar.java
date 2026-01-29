package kotlin.properties;

import androidx.activity.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes15.dex */
final class NotNullVar<T> implements ReadWriteProperty<Object, T> {
    private T value;

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public T getValue(Object obj, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        T t4 = this.value;
        if (t4 != null) {
            return t4;
        }
        StringBuilder g5 = d.g("Property ");
        g5.append(property.getName());
        g5.append(" should be initialized before get.");
        throw new IllegalStateException(g5.toString());
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(Object obj, KProperty<?> property, T value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }
}
