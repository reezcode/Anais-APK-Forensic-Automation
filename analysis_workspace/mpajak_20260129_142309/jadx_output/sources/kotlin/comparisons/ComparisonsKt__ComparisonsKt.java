package kotlin.comparisons;

import java.util.Comparator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes24.dex */
public class ComparisonsKt__ComparisonsKt {
    @InlineOnly
    private static final <T, K> Comparator<T> compareBy(final Comparator<? super K> comparator, final Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$3
            @Override // java.util.Comparator
            public final int compare(T t4, T t5) {
                Comparator<? super K> comparator2 = comparator;
                Function1<T, K> function1 = selector;
                return comparator2.compare(function1.invoke(t4), function1.invoke(t5));
            }
        };
    }

    @InlineOnly
    private static final <T> Comparator<T> compareBy(Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new ComparisonsKt__ComparisonsKt$compareBy$2(selector);
    }

    public static final <T> Comparator<T> compareBy(final Function1<? super T, ? extends Comparable<?>>... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareBy$1
                @Override // java.util.Comparator
                public final int compare(T t4, T t5) {
                    int compareValuesByImpl$ComparisonsKt__ComparisonsKt;
                    compareValuesByImpl$ComparisonsKt__ComparisonsKt = ComparisonsKt__ComparisonsKt.compareValuesByImpl$ComparisonsKt__ComparisonsKt(t4, t5, selectors);
                    return compareValuesByImpl$ComparisonsKt__ComparisonsKt;
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @InlineOnly
    private static final <T, K> Comparator<T> compareByDescending(final Comparator<? super K> comparator, final Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$compareByDescending$2
            @Override // java.util.Comparator
            public final int compare(T t4, T t5) {
                Comparator<? super K> comparator2 = comparator;
                Function1<T, K> function1 = selector;
                return comparator2.compare(function1.invoke(t5), function1.invoke(t4));
            }
        };
    }

    @InlineOnly
    private static final <T> Comparator<T> compareByDescending(Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new ComparisonsKt__ComparisonsKt$compareByDescending$1(selector);
    }

    public static <T extends Comparable<?>> int compareValues(T t4, T t5) {
        if (t4 == t5) {
            return 0;
        }
        if (t4 == null) {
            return -1;
        }
        if (t5 == null) {
            return 1;
        }
        return t4.compareTo(t5);
    }

    @InlineOnly
    private static final <T, K> int compareValuesBy(T t4, T t5, Comparator<? super K> comparator, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return comparator.compare(selector.invoke(t4), selector.invoke(t5));
    }

    @InlineOnly
    private static final <T> int compareValuesBy(T t4, T t5, Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return compareValues(selector.invoke(t4), selector.invoke(t5));
    }

    public static final <T> int compareValuesBy(T t4, T t5, Function1<? super T, ? extends Comparable<?>>... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return compareValuesByImpl$ComparisonsKt__ComparisonsKt(t4, t5, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int compareValuesByImpl$ComparisonsKt__ComparisonsKt(T t4, T t5, Function1<? super T, ? extends Comparable<?>>[] function1Arr) {
        for (Function1<? super T, ? extends Comparable<?>> function1 : function1Arr) {
            int compareValues = compareValues(function1.invoke(t4), function1.invoke(t5));
            if (compareValues != 0) {
                return compareValues;
            }
        }
        return 0;
    }

    public static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        NaturalOrderComparator naturalOrderComparator = NaturalOrderComparator.INSTANCE;
        Intrinsics.checkNotNull(naturalOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return naturalOrderComparator;
    }

    @InlineOnly
    private static final <T extends Comparable<? super T>> Comparator<T> nullsFirst() {
        return nullsFirst(naturalOrder());
    }

    public static final <T> Comparator<T> nullsFirst(final Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$nullsFirst$1
            @Override // java.util.Comparator
            public final int compare(T t4, T t5) {
                if (t4 == t5) {
                    return 0;
                }
                if (t4 == null) {
                    return -1;
                }
                if (t5 == null) {
                    return 1;
                }
                return comparator.compare(t4, t5);
            }
        };
    }

    @InlineOnly
    private static final <T extends Comparable<? super T>> Comparator<T> nullsLast() {
        return nullsLast(naturalOrder());
    }

    public static final <T> Comparator<T> nullsLast(final Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$nullsLast$1
            @Override // java.util.Comparator
            public final int compare(T t4, T t5) {
                if (t4 == t5) {
                    return 0;
                }
                if (t4 == null) {
                    return 1;
                }
                if (t5 == null) {
                    return -1;
                }
                return comparator.compare(t4, t5);
            }
        };
    }

    public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        ReverseOrderComparator reverseOrderComparator = ReverseOrderComparator.INSTANCE;
        Intrinsics.checkNotNull(reverseOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return reverseOrderComparator;
    }

    public static final <T> Comparator<T> reversed(Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        if (comparator instanceof ReversedComparator) {
            return ((ReversedComparator) comparator).getComparator();
        }
        Comparator<T> comparator2 = NaturalOrderComparator.INSTANCE;
        if (Intrinsics.areEqual(comparator, comparator2)) {
            ReverseOrderComparator reverseOrderComparator = ReverseOrderComparator.INSTANCE;
            Intrinsics.checkNotNull(reverseOrderComparator, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return reverseOrderComparator;
        }
        if (Intrinsics.areEqual(comparator, ReverseOrderComparator.INSTANCE)) {
            Intrinsics.checkNotNull(comparator2, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
        } else {
            comparator2 = new ReversedComparator<>(comparator);
        }
        return comparator2;
    }

    public static final <T> Comparator<T> then(final Comparator<T> comparator, final Comparator<? super T> comparator2) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$then$1
            @Override // java.util.Comparator
            public final int compare(T t4, T t5) {
                int compare = comparator.compare(t4, t5);
                return compare != 0 ? compare : comparator2.compare(t4, t5);
            }
        };
    }

    @InlineOnly
    private static final <T, K> Comparator<T> thenBy(final Comparator<T> comparator, final Comparator<? super K> comparator2, final Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenBy$2
            @Override // java.util.Comparator
            public final int compare(T t4, T t5) {
                int compare = comparator.compare(t4, t5);
                if (compare != 0) {
                    return compare;
                }
                Comparator<? super K> comparator3 = comparator2;
                Function1<T, K> function1 = selector;
                return comparator3.compare(function1.invoke(t4), function1.invoke(t5));
            }
        };
    }

    @InlineOnly
    private static final <T> Comparator<T> thenBy(final Comparator<T> comparator, final Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenBy$1
            @Override // java.util.Comparator
            public final int compare(T t4, T t5) {
                int compare = comparator.compare(t4, t5);
                if (compare != 0) {
                    return compare;
                }
                Function1<T, Comparable<?>> function1 = selector;
                return ComparisonsKt__ComparisonsKt.compareValues(function1.invoke(t4), function1.invoke(t5));
            }
        };
    }

    @InlineOnly
    private static final <T, K> Comparator<T> thenByDescending(final Comparator<T> comparator, final Comparator<? super K> comparator2, final Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenByDescending$2
            @Override // java.util.Comparator
            public final int compare(T t4, T t5) {
                int compare = comparator.compare(t4, t5);
                if (compare != 0) {
                    return compare;
                }
                Comparator<? super K> comparator3 = comparator2;
                Function1<T, K> function1 = selector;
                return comparator3.compare(function1.invoke(t5), function1.invoke(t4));
            }
        };
    }

    @InlineOnly
    private static final <T> Comparator<T> thenByDescending(final Comparator<T> comparator, final Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t4, T t5) {
                int compare = comparator.compare(t4, t5);
                if (compare != 0) {
                    return compare;
                }
                Function1<T, Comparable<?>> function1 = selector;
                return ComparisonsKt__ComparisonsKt.compareValues(function1.invoke(t5), function1.invoke(t4));
            }
        };
    }

    @InlineOnly
    private static final <T> Comparator<T> thenComparator(final Comparator<T> comparator, final Function2<? super T, ? super T, Integer> comparison) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenComparator$1
            @Override // java.util.Comparator
            public final int compare(T t4, T t5) {
                int compare = comparator.compare(t4, t5);
                return compare != 0 ? compare : comparison.invoke(t4, t5).intValue();
            }
        };
    }

    public static final <T> Comparator<T> thenDescending(final Comparator<T> comparator, final Comparator<? super T> comparator2) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.ComparisonsKt__ComparisonsKt$thenDescending$1
            @Override // java.util.Comparator
            public final int compare(T t4, T t5) {
                int compare = comparator.compare(t4, t5);
                return compare != 0 ? compare : comparator2.compare(t5, t4);
            }
        };
    }
}
