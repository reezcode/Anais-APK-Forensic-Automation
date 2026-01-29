package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* loaded from: classes4.dex */
public final class BrittleContainsOptimizationKt {
    public static final <T> Collection<T> convertToSetForSetOperation(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (iterable instanceof Collection) {
            Collection<T> collection = (Collection) iterable;
            if (!safeToConvertToSet(collection)) {
                return collection;
            }
        } else if (!CollectionSystemProperties.brittleContainsOptimizationEnabled) {
            return CollectionsKt___CollectionsKt.toList(iterable);
        }
        return CollectionsKt___CollectionsKt.toHashSet(iterable);
    }

    public static final <T> Collection<T> convertToSetForSetOperation(Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return CollectionSystemProperties.brittleContainsOptimizationEnabled ? SequencesKt.toHashSet(sequence) : SequencesKt.toList(sequence);
    }

    public static final <T> Collection<T> convertToSetForSetOperation(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return CollectionSystemProperties.brittleContainsOptimizationEnabled ? ArraysKt___ArraysKt.toHashSet(tArr) : ArraysKt___ArraysJvmKt.asList(tArr);
    }

    public static final <T> Collection<T> convertToSetForSetOperationWith(Iterable<? extends T> iterable, Iterable<? extends T> source) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(iterable instanceof Set)) {
            if (iterable instanceof Collection) {
                if (!(source instanceof Collection) || ((Collection) source).size() >= 2) {
                    Collection<T> collection = (Collection) iterable;
                    if (!safeToConvertToSet(collection)) {
                        return collection;
                    }
                }
            } else if (!CollectionSystemProperties.brittleContainsOptimizationEnabled) {
                return CollectionsKt___CollectionsKt.toList(iterable);
            }
            return CollectionsKt___CollectionsKt.toHashSet(iterable);
        }
        return (Collection) iterable;
    }

    private static final <T> boolean safeToConvertToSet(Collection<? extends T> collection) {
        return CollectionSystemProperties.brittleContainsOptimizationEnabled && collection.size() > 2 && (collection instanceof ArrayList);
    }
}
