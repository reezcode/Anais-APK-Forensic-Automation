package kotlin.collections;

import androidx.activity.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class IndexedValue<T> {
    private final int index;
    private final T value;

    public IndexedValue(int i5, T t4) {
        this.index = i5;
        this.value = t4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndexedValue copy$default(IndexedValue indexedValue, int i5, Object obj, int i6, Object obj2) {
        if ((i6 & 1) != 0) {
            i5 = indexedValue.index;
        }
        if ((i6 & 2) != 0) {
            obj = indexedValue.value;
        }
        return indexedValue.copy(i5, obj);
    }

    public final int component1() {
        return this.index;
    }

    public final T component2() {
        return this.value;
    }

    public final IndexedValue<T> copy(int i5, T t4) {
        return new IndexedValue<>(i5, t4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        return this.index == indexedValue.index && Intrinsics.areEqual(this.value, indexedValue.value);
    }

    public final int getIndex() {
        return this.index;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        int i5 = this.index * 31;
        T t4 = this.value;
        return i5 + (t4 == null ? 0 : t4.hashCode());
    }

    public String toString() {
        StringBuilder g5 = d.g("IndexedValue(index=");
        g5.append(this.index);
        g5.append(", value=");
        g5.append(this.value);
        g5.append(')');
        return g5.toString();
    }
}
