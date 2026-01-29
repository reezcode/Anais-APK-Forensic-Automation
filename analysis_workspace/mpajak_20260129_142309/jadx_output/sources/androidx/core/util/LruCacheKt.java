package androidx.core.util;

import android.util.LruCache;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes16.dex */
public final class LruCacheKt {
    public static final <K, V> LruCache<K, V> lruCache(int i5, Function2<? super K, ? super V, Integer> sizeOf, Function1<? super K, ? extends V> create, Function4<? super Boolean, ? super K, ? super V, ? super V, Unit> onEntryRemoved) {
        Intrinsics.checkNotNullParameter(sizeOf, "sizeOf");
        Intrinsics.checkNotNullParameter(create, "create");
        Intrinsics.checkNotNullParameter(onEntryRemoved, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i5, sizeOf, create, onEntryRemoved);
    }

    public static /* synthetic */ LruCache lruCache$default(int i5, Function2 sizeOf, Function1 create, Function4 onEntryRemoved, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            sizeOf = new Function2() { // from class: androidx.core.util.LruCacheKt$lruCache$1
                @Override // kotlin.jvm.functions.Function2
                public final Integer invoke(Object obj2, Object obj3) {
                    Intrinsics.checkNotNullParameter(obj2, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(obj3, "<anonymous parameter 1>");
                    return 1;
                }
            };
        }
        if ((i6 & 4) != 0) {
            create = new Function1() { // from class: androidx.core.util.LruCacheKt$lruCache$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return null;
                }
            };
        }
        if ((i6 & 8) != 0) {
            onEntryRemoved = new Function4() { // from class: androidx.core.util.LruCacheKt$lruCache$3
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    invoke(((Boolean) obj2).booleanValue(), obj3, obj4, obj5);
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z4, Object obj2, Object obj3, Object obj4) {
                    Intrinsics.checkNotNullParameter(obj2, "<anonymous parameter 1>");
                    Intrinsics.checkNotNullParameter(obj3, "<anonymous parameter 2>");
                }
            };
        }
        Intrinsics.checkNotNullParameter(sizeOf, "sizeOf");
        Intrinsics.checkNotNullParameter(create, "create");
        Intrinsics.checkNotNullParameter(onEntryRemoved, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i5, sizeOf, create, onEntryRemoved);
    }
}
