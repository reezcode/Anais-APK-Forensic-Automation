package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.BuilderInference;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class SetsKt__SetsKt extends SetsKt__SetsJVMKt {
    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <E> Set<E> buildSet(int i5, @BuilderInference Function1<? super Set<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Set createSetBuilder = SetsKt__SetsJVMKt.createSetBuilder(i5);
        builderAction.invoke(createSetBuilder);
        return SetsKt__SetsJVMKt.build(createSetBuilder);
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final <E> Set<E> buildSet(@BuilderInference Function1<? super Set<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Set createSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
        builderAction.invoke(createSetBuilder);
        return SetsKt__SetsJVMKt.build(createSetBuilder);
    }

    public static <T> Set<T> emptySet() {
        return EmptySet.INSTANCE;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> HashSet<T> hashSetOf() {
        return new HashSet<>();
    }

    public static final <T> HashSet<T> hashSetOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (HashSet) ArraysKt___ArraysKt.toCollection(elements, new HashSet(MapsKt__MapsJVMKt.mapCapacity(elements.length)));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> LinkedHashSet<T> linkedSetOf() {
        return new LinkedHashSet<>();
    }

    public static final <T> LinkedHashSet<T> linkedSetOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (LinkedHashSet) ArraysKt___ArraysKt.toCollection(elements, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(elements.length)));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> Set<T> mutableSetOf() {
        return new LinkedHashSet();
    }

    public static <T> Set<T> mutableSetOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (Set) ArraysKt___ArraysKt.toCollection(elements, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(elements.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Set<T> optimizeReadOnlySet(Set<? extends T> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : SetsKt__SetsJVMKt.setOf(set.iterator().next()) : emptySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final <T> Set<T> orEmpty(Set<? extends T> set) {
        return set == 0 ? emptySet() : set;
    }

    @InlineOnly
    private static final <T> Set<T> setOf() {
        return emptySet();
    }

    public static final <T> Set<T> setOf(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? ArraysKt___ArraysKt.toSet(elements) : emptySet();
    }

    @SinceKotlin(version = "1.4")
    public static final <T> Set<T> setOfNotNull(T t4) {
        return t4 != null ? SetsKt__SetsJVMKt.setOf(t4) : emptySet();
    }

    @SinceKotlin(version = "1.4")
    public static final <T> Set<T> setOfNotNull(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (Set) ArraysKt___ArraysKt.filterNotNullTo(elements, new LinkedHashSet());
    }
}
