package kotlin.collections.jdk8;

import java.util.Map;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@JvmName(name = "CollectionsJDK8Kt")
/* loaded from: classes7.dex */
public final class CollectionsJDK8Kt {
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final <K, V> V getOrDefault(Map<? extends K, ? extends V> map, K k5, V v4) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.getOrDefault(k5, v4);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final <K, V> boolean remove(Map<? extends K, ? extends V> map, K k5, V v4) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return TypeIntrinsics.asMutableMap(map).remove(k5, v4);
    }
}
