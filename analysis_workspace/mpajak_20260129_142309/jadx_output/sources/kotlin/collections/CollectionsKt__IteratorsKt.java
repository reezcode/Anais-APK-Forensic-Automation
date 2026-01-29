package kotlin.collections;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes20.dex */
class CollectionsKt__IteratorsKt extends CollectionsKt__IteratorsJVMKt {
    public static final <T> void forEach(Iterator<? extends T> it, Function1<? super T, Unit> operation) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        Intrinsics.checkNotNullParameter(operation, "operation");
        while (it.hasNext()) {
            operation.invoke(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <T> Iterator<T> iterator(Iterator<? extends T> it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return it;
    }

    public static final <T> Iterator<IndexedValue<T>> withIndex(Iterator<? extends T> it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return new IndexingIterator(it);
    }
}
