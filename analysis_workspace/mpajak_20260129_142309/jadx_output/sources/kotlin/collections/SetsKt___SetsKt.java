package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes21.dex */
public class SetsKt___SetsKt extends SetsKt__SetsKt {
    public static final <T> Set<T> minus(Set<? extends T> set, Iterable<? extends T> elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<?> convertToSetForSetOperationWith = BrittleContainsOptimizationKt.convertToSetForSetOperationWith(elements, set);
        if (convertToSetForSetOperationWith.isEmpty()) {
            return CollectionsKt___CollectionsKt.toSet(set);
        }
        if (!(convertToSetForSetOperationWith instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(convertToSetForSetOperationWith);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t4 : set) {
            if (!convertToSetForSetOperationWith.contains(t4)) {
                linkedHashSet2.add(t4);
            }
        }
        return linkedHashSet2;
    }

    public static final <T> Set<T> minus(Set<? extends T> set, T t4) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(set.size()));
        boolean z4 = false;
        for (T t5 : set) {
            boolean z5 = true;
            if (!z4 && Intrinsics.areEqual(t5, t4)) {
                z4 = true;
                z5 = false;
            }
            if (z5) {
                linkedHashSet.add(t5);
            }
        }
        return linkedHashSet;
    }

    public static final <T> Set<T> minus(Set<? extends T> set, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        CollectionsKt__MutableCollectionsKt.removeAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final <T> Set<T> minus(Set<? extends T> set, T[] elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        CollectionsKt__MutableCollectionsKt.removeAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    @InlineOnly
    private static final <T> Set<T> minusElement(Set<? extends T> set, T t4) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        return minus(set, t4);
    }

    public static <T> Set<T> plus(Set<? extends T> set, Iterable<? extends T> elements) {
        int size;
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Integer collectionSizeOrNull = CollectionsKt__IterablesKt.collectionSizeOrNull(elements);
        if (collectionSizeOrNull != null) {
            size = set.size() + collectionSizeOrNull.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(size));
        linkedHashSet.addAll(set);
        CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final <T> Set<T> plus(Set<? extends T> set, T t4) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t4);
        return linkedHashSet;
    }

    public static final <T> Set<T> plus(Set<? extends T> set, Sequence<? extends T> elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(set.size() * 2));
        linkedHashSet.addAll(set);
        CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static final <T> Set<T> plus(Set<? extends T> set, T[] elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(set.size() + elements.length));
        linkedHashSet.addAll(set);
        CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, elements);
        return linkedHashSet;
    }

    @InlineOnly
    private static final <T> Set<T> plusElement(Set<? extends T> set, T t4) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        return plus(set, t4);
    }
}
