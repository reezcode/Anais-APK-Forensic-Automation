package kotlin.jvm.optionals;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* loaded from: classes2.dex */
public final class OptionalsKt {
    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    public static final <T> Sequence<T> asSequence(Optional<? extends T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.isPresent() ? SequencesKt.sequenceOf(optional.get()) : SequencesKt.emptySequence();
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    public static final <R, T extends R> R getOrDefault(Optional<T> optional, R r4) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.isPresent() ? optional.get() : r4;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    public static final <R, T extends R> R getOrElse(Optional<T> optional, Function0<? extends R> defaultValue) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return optional.isPresent() ? optional.get() : defaultValue.invoke();
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    public static final <T> T getOrNull(Optional<T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.orElse(null);
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    public static final <T, C extends Collection<? super T>> C toCollection(Optional<T> optional, C destination) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (optional.isPresent()) {
            T t4 = optional.get();
            Intrinsics.checkNotNullExpressionValue(t4, "get()");
            destination.add(t4);
        }
        return destination;
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    public static final <T> List<T> toList(Optional<? extends T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.isPresent() ? CollectionsKt.listOf(optional.get()) : CollectionsKt.emptyList();
    }

    @SinceKotlin(version = "1.7")
    @ExperimentalStdlibApi
    public static final <T> Set<T> toSet(Optional<? extends T> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        return optional.isPresent() ? SetsKt.setOf(optional.get()) : SetsKt.emptySet();
    }
}
