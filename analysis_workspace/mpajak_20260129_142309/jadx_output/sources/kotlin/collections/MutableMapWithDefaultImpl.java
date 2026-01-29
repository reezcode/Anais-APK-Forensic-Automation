package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes21.dex */
final class MutableMapWithDefaultImpl<K, V> implements MutableMapWithDefault<K, V> {

    /* renamed from: default, reason: not valid java name */
    private final Function1<K, V> f2default;
    private final Map<K, V> map;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableMapWithDefaultImpl(Map<K, V> map, Function1<? super K, ? extends V> function1) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(function1, "default");
        this.map = map;
        this.f2default = function1;
    }

    @Override // java.util.Map
    public void clear() {
        getMap().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return getMap().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return getMap().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return getMap().equals(obj);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return getMap().get(obj);
    }

    public Set<Map.Entry<K, V>> getEntries() {
        return getMap().entrySet();
    }

    public Set<K> getKeys() {
        return getMap().keySet();
    }

    @Override // kotlin.collections.MutableMapWithDefault, kotlin.collections.MapWithDefault
    public Map<K, V> getMap() {
        return this.map;
    }

    @Override // kotlin.collections.MapWithDefault
    public V getOrImplicitDefault(K k5) {
        Map<K, V> map = getMap();
        V v4 = map.get(k5);
        return (v4 != null || map.containsKey(k5)) ? v4 : this.f2default.invoke(k5);
    }

    public int getSize() {
        return getMap().size();
    }

    public Collection<V> getValues() {
        return getMap().values();
    }

    @Override // java.util.Map
    public int hashCode() {
        return getMap().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getMap().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public V put(K k5, V v4) {
        return getMap().put(k5, v4);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        getMap().putAll(from);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return getMap().remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        return getMap().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }
}
