package l0;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* loaded from: classes22.dex */
public final class b<K, V> extends ArrayMap<K, V> {

    /* renamed from: b, reason: collision with root package name */
    public int f3923b;

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final void clear() {
        this.f3923b = 0;
        super.clear();
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final int hashCode() {
        if (this.f3923b == 0) {
            this.f3923b = super.hashCode();
        }
        return this.f3923b;
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final V put(K k5, V v4) {
        this.f3923b = 0;
        return (V) super.put(k5, v4);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this.f3923b = 0;
        super.putAll(simpleArrayMap);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final V removeAt(int i5) {
        this.f3923b = 0;
        return (V) super.removeAt(i5);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final V setValueAt(int i5, V v4) {
        this.f3923b = 0;
        return (V) super.setValueAt(i5, v4);
    }
}
