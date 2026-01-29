package kotlin.comparisons;

import java.util.Comparator;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
class ComparisonsKt___ComparisonsKt extends ComparisonsKt___ComparisonsJvmKt {
    @SinceKotlin(version = "1.1")
    public static final <T> T maxOf(T t4, T t5, T t6, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (T) maxOf(t4, maxOf(t5, t6, comparator), comparator);
    }

    @SinceKotlin(version = "1.1")
    public static final <T> T maxOf(T t4, T t5, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return comparator.compare(t4, t5) >= 0 ? t4 : t5;
    }

    @SinceKotlin(version = "1.4")
    public static final <T> T maxOf(T t4, T[] other, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        for (T t5 : other) {
            if (comparator.compare(t4, t5) < 0) {
                t4 = t5;
            }
        }
        return t4;
    }

    @SinceKotlin(version = "1.1")
    public static final <T> T minOf(T t4, T t5, T t6, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (T) minOf(t4, minOf(t5, t6, comparator), comparator);
    }

    @SinceKotlin(version = "1.1")
    public static final <T> T minOf(T t4, T t5, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return comparator.compare(t4, t5) <= 0 ? t4 : t5;
    }

    @SinceKotlin(version = "1.4")
    public static final <T> T minOf(T t4, T[] other, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        for (T t5 : other) {
            if (comparator.compare(t4, t5) > 0) {
                t4 = t5;
            }
        }
        return t4;
    }
}
