package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.room.AmbiguousColumnResolver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes14.dex */
public final class AmbiguousColumnResolver {
    public static final AmbiguousColumnResolver INSTANCE = new AmbiguousColumnResolver();

    /* loaded from: classes23.dex */
    public static final class Match {
        private final List<Integer> resultIndices;
        private final IntRange resultRange;

        public Match(IntRange resultRange, List<Integer> resultIndices) {
            Intrinsics.checkNotNullParameter(resultRange, "resultRange");
            Intrinsics.checkNotNullParameter(resultIndices, "resultIndices");
            this.resultRange = resultRange;
            this.resultIndices = resultIndices;
        }

        public final List<Integer> getResultIndices() {
            return this.resultIndices;
        }

        public final IntRange getResultRange() {
            return this.resultRange;
        }
    }

    /* loaded from: classes18.dex */
    public static final class ResultColumn {
        private final int index;
        private final String name;

        public ResultColumn(String name, int i5) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.index = i5;
        }

        public static /* synthetic */ ResultColumn copy$default(ResultColumn resultColumn, String str, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                str = resultColumn.name;
            }
            if ((i6 & 2) != 0) {
                i5 = resultColumn.index;
            }
            return resultColumn.copy(str, i5);
        }

        public final String component1() {
            return this.name;
        }

        public final int component2() {
            return this.index;
        }

        public final ResultColumn copy(String name, int i5) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new ResultColumn(name, i5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResultColumn)) {
                return false;
            }
            ResultColumn resultColumn = (ResultColumn) obj;
            return Intrinsics.areEqual(this.name, resultColumn.name) && this.index == resultColumn.index;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.index;
        }

        public String toString() {
            StringBuilder g5 = androidx.activity.d.g("ResultColumn(name=");
            g5.append(this.name);
            g5.append(", index=");
            g5.append(this.index);
            g5.append(')');
            return g5.toString();
        }
    }

    /* loaded from: classes20.dex */
    public static final class Solution implements Comparable<Solution> {
        public static final Companion Companion = new Companion(null);
        private static final Solution NO_SOLUTION = new Solution(CollectionsKt.emptyList(), Integer.MAX_VALUE, Integer.MAX_VALUE);
        private final int coverageOffset;
        private final List<Match> matches;
        private final int overlaps;

        /* loaded from: classes25.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Solution build(List<Match> matches) {
                boolean z4;
                Intrinsics.checkNotNullParameter(matches, "matches");
                int i5 = 0;
                int i6 = 0;
                for (Match match : matches) {
                    i6 += ((match.getResultRange().getLast() - match.getResultRange().getFirst()) + 1) - match.getResultIndices().size();
                }
                Iterator<T> it = matches.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int first = ((Match) it.next()).getResultRange().getFirst();
                while (it.hasNext()) {
                    int first2 = ((Match) it.next()).getResultRange().getFirst();
                    if (first > first2) {
                        first = first2;
                    }
                }
                Iterator<T> it2 = matches.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int last = ((Match) it2.next()).getResultRange().getLast();
                while (it2.hasNext()) {
                    int last2 = ((Match) it2.next()).getResultRange().getLast();
                    if (last < last2) {
                        last = last2;
                    }
                }
                Iterable intRange = new IntRange(first, last);
                if (!(intRange instanceof Collection) || !((Collection) intRange).isEmpty()) {
                    Iterator it3 = intRange.iterator();
                    int i7 = 0;
                    while (it3.hasNext()) {
                        int nextInt = ((IntIterator) it3).nextInt();
                        Iterator<T> it4 = matches.iterator();
                        int i8 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                z4 = false;
                                break;
                            }
                            if (((Match) it4.next()).getResultRange().contains(nextInt)) {
                                i8++;
                            }
                            if (i8 > 1) {
                                z4 = true;
                                break;
                            }
                        }
                        if (z4 && (i7 = i7 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                    i5 = i7;
                }
                return new Solution(matches, i6, i5);
            }

            public final Solution getNO_SOLUTION() {
                return Solution.NO_SOLUTION;
            }
        }

        public Solution(List<Match> matches, int i5, int i6) {
            Intrinsics.checkNotNullParameter(matches, "matches");
            this.matches = matches;
            this.coverageOffset = i5;
            this.overlaps = i6;
        }

        @Override // java.lang.Comparable
        public int compareTo(Solution other) {
            Intrinsics.checkNotNullParameter(other, "other");
            int compare = Intrinsics.compare(this.overlaps, other.overlaps);
            return compare != 0 ? compare : Intrinsics.compare(this.coverageOffset, other.coverageOffset);
        }

        public final int getCoverageOffset() {
            return this.coverageOffset;
        }

        public final List<Match> getMatches() {
            return this.matches;
        }

        public final int getOverlaps() {
            return this.overlaps;
        }
    }

    private AmbiguousColumnResolver() {
    }

    private final <T> void dfs(List<? extends List<? extends T>> list, List<T> list2, int i5, Function1<? super List<? extends T>, Unit> function1) {
        if (i5 == list.size()) {
            function1.invoke(CollectionsKt.toList(list2));
            return;
        }
        Iterator<T> it = list.get(i5).iterator();
        while (it.hasNext()) {
            list2.add(it.next());
            INSTANCE.dfs(list, list2, i5 + 1, function1);
            CollectionsKt.removeLast(list2);
        }
    }

    public static /* synthetic */ void dfs$default(AmbiguousColumnResolver ambiguousColumnResolver, List list, List list2, int i5, Function1 function1, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i6 & 4) != 0) {
            i5 = 0;
        }
        ambiguousColumnResolver.dfs(list, list2, i5, function1);
    }

    private final void rabinKarpSearch(List<ResultColumn> list, String[] strArr, Function3<? super Integer, ? super Integer, ? super List<ResultColumn>, Unit> function3) {
        int i5 = 0;
        int i6 = 0;
        for (String str : strArr) {
            i6 += str.hashCode();
        }
        int length = strArr.length;
        Iterator<T> it = list.subList(0, length).iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 += ((ResultColumn) it.next()).getName().hashCode();
        }
        while (true) {
            if (i6 == i7) {
                function3.invoke(Integer.valueOf(i5), Integer.valueOf(length), list.subList(i5, length));
            }
            i5++;
            length++;
            if (length > list.size()) {
                return;
            } else {
                i7 = (i7 - list.get(i5 - 1).getName().hashCode()) + list.get(length - 1).getName().hashCode();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
    @JvmStatic
    public static final int[][] resolve(String[] resultColumns, String[][] mappings) {
        boolean z4;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(resultColumns, "resultColumns");
        Intrinsics.checkNotNullParameter(mappings, "mappings");
        int length = resultColumns.length;
        for (int i5 = 0; i5 < length; i5++) {
            String str = resultColumns[i5];
            if (str.charAt(0) == '`' && str.charAt(str.length() - 1) == '`') {
                str = str.substring(1, str.length() - 1);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            resultColumns[i5] = lowerCase;
        }
        int length2 = mappings.length;
        for (int i6 = 0; i6 < length2; i6++) {
            int length3 = mappings[i6].length;
            for (int i7 = 0; i7 < length3; i7++) {
                String[] strArr = mappings[i6];
                String str2 = mappings[i6][i7];
                Locale US2 = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase2 = str2.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                strArr[i7] = lowerCase2;
            }
        }
        Set createSetBuilder = SetsKt.createSetBuilder();
        for (String[] strArr2 : mappings) {
            CollectionsKt.addAll(createSetBuilder, strArr2);
        }
        Set build = SetsKt.build(createSetBuilder);
        List createListBuilder = CollectionsKt.createListBuilder();
        int length4 = resultColumns.length;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length4) {
            String str3 = resultColumns[i8];
            int i10 = i9 + 1;
            if (build.contains(str3)) {
                createListBuilder.add(new ResultColumn(str3, i9));
            }
            i8++;
            i9 = i10;
        }
        List<ResultColumn> build2 = CollectionsKt.build(createListBuilder);
        int length5 = mappings.length;
        final ArrayList arrayList = new ArrayList(length5);
        for (int i11 = 0; i11 < length5; i11++) {
            arrayList.add(new ArrayList());
        }
        int length6 = mappings.length;
        int i12 = 0;
        final int i13 = 0;
        while (i12 < length6) {
            final String[] strArr3 = mappings[i12];
            int i14 = i13 + 1;
            INSTANCE.rabinKarpSearch(build2, strArr3, new Function3<Integer, Integer, List<? extends ResultColumn>, Unit>() { // from class: androidx.room.AmbiguousColumnResolver$resolve$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, List<? extends AmbiguousColumnResolver.ResultColumn> list) {
                    invoke(num.intValue(), num2.intValue(), (List<AmbiguousColumnResolver.ResultColumn>) list);
                    return Unit.INSTANCE;
                }

                public final void invoke(int i15, int i16, List<AmbiguousColumnResolver.ResultColumn> resultColumnsSublist) {
                    Object obj;
                    Intrinsics.checkNotNullParameter(resultColumnsSublist, "resultColumnsSublist");
                    String[] strArr4 = strArr3;
                    ArrayList arrayList2 = new ArrayList(strArr4.length);
                    for (String str4 : strArr4) {
                        Iterator<T> it = resultColumnsSublist.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (Intrinsics.areEqual(str4, ((AmbiguousColumnResolver.ResultColumn) obj).component1())) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        AmbiguousColumnResolver.ResultColumn resultColumn = (AmbiguousColumnResolver.ResultColumn) obj;
                        if (resultColumn == null) {
                            return;
                        }
                        arrayList2.add(Integer.valueOf(resultColumn.getIndex()));
                    }
                    arrayList.get(i13).add(new AmbiguousColumnResolver.Match(new IntRange(i15, i16 - 1), arrayList2));
                }
            });
            if (((List) arrayList.get(i13)).isEmpty()) {
                ArrayList arrayList2 = new ArrayList(strArr3.length);
                for (String str4 : strArr3) {
                    List createListBuilder2 = CollectionsKt.createListBuilder();
                    for (ResultColumn resultColumn : build2) {
                        if (Intrinsics.areEqual(str4, resultColumn.getName())) {
                            createListBuilder2.add(Integer.valueOf(resultColumn.getIndex()));
                        }
                    }
                    List build3 = CollectionsKt.build(createListBuilder2);
                    if (!(!build3.isEmpty())) {
                        throw new IllegalStateException(androidx.appcompat.widget.a.j("Column ", str4, " not found in result").toString());
                    }
                    arrayList2.add(build3);
                }
                dfs$default(INSTANCE, arrayList2, null, 0, new Function1<List<? extends Integer>, Unit>() { // from class: androidx.room.AmbiguousColumnResolver$resolve$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Integer> list) {
                        invoke2((List<Integer>) list);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(List<Integer> indices) {
                        Intrinsics.checkNotNullParameter(indices, "indices");
                        Iterator<T> it = indices.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        int intValue = ((Number) it.next()).intValue();
                        while (it.hasNext()) {
                            int intValue2 = ((Number) it.next()).intValue();
                            if (intValue > intValue2) {
                                intValue = intValue2;
                            }
                        }
                        Iterator<T> it2 = indices.iterator();
                        if (!it2.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        int intValue3 = ((Number) it2.next()).intValue();
                        while (it2.hasNext()) {
                            int intValue4 = ((Number) it2.next()).intValue();
                            if (intValue3 < intValue4) {
                                intValue3 = intValue4;
                            }
                        }
                        arrayList.get(i13).add(new AmbiguousColumnResolver.Match(new IntRange(intValue, intValue3), indices));
                    }
                }, 6, null);
            }
            i12++;
            i13 = i14;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!(!((List) it.next()).isEmpty())) {
                    z4 = false;
                    break;
                }
            }
        }
        z4 = true;
        if (!z4) {
            throw new IllegalStateException("Failed to find matches for all mappings".toString());
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Solution.Companion.getNO_SOLUTION();
        dfs$default(INSTANCE, arrayList, null, 0, new Function1<List<? extends Match>, Unit>() { // from class: androidx.room.AmbiguousColumnResolver$resolve$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends AmbiguousColumnResolver.Match> list) {
                invoke2((List<AmbiguousColumnResolver.Match>) list);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<AmbiguousColumnResolver.Match> it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                ?? build4 = AmbiguousColumnResolver.Solution.Companion.build(it2);
                if (build4.compareTo(objectRef.element) < 0) {
                    objectRef.element = build4;
                }
            }
        }, 6, null);
        List<Match> matches = ((Solution) objectRef.element).getMatches();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(matches, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it2 = matches.iterator();
        while (it2.hasNext()) {
            arrayList3.add(CollectionsKt.toIntArray(((Match) it2.next()).getResultIndices()));
        }
        Object[] array = arrayList3.toArray(new int[0][]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (int[][]) array;
    }
}
