package kotlin.collections;

import java.util.Map;
import kotlin.jvm.internal.markers.KMutableMap;

/* loaded from: classes19.dex */
interface MutableMapWithDefault<K, V> extends Map<K, V>, MapWithDefault<K, V>, KMutableMap {
    @Override // kotlin.collections.MapWithDefault
    Map<K, V> getMap();
}
