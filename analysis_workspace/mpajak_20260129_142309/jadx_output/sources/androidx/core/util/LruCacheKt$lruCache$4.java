package androidx.core.util;

import android.util.LruCache;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes16.dex */
public final class LruCacheKt$lruCache$4<K, V> extends LruCache<K, V> {
    public final /* synthetic */ Function1<K, V> $create;
    public final /* synthetic */ Function4<Boolean, K, V, V, Unit> $onEntryRemoved;
    public final /* synthetic */ Function2<K, V, Integer> $sizeOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LruCacheKt$lruCache$4(int i5, Function2<? super K, ? super V, Integer> function2, Function1<? super K, ? extends V> function1, Function4<? super Boolean, ? super K, ? super V, ? super V, Unit> function4) {
        super(i5);
        this.$sizeOf = function2;
        this.$create = function1;
        this.$onEntryRemoved = function4;
    }

    @Override // android.util.LruCache
    public V create(K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.$create.invoke(key);
    }

    @Override // android.util.LruCache
    public void entryRemoved(boolean z4, K key, V oldValue, V v4) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        this.$onEntryRemoved.invoke(Boolean.valueOf(z4), key, oldValue, v4);
    }

    @Override // android.util.LruCache
    public int sizeOf(K key, V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.$sizeOf.invoke(key, value).intValue();
    }
}
