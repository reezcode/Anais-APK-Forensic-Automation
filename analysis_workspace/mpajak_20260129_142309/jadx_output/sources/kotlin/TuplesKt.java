package kotlin;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@JvmName(name = "TuplesKt")
/* loaded from: classes22.dex */
public final class TuplesKt {
    public static final <A, B> Pair<A, B> to(A a5, B b5) {
        return new Pair<>(a5, b5);
    }

    public static final <T> List<T> toList(Pair<? extends T, ? extends T> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return CollectionsKt.listOf(pair.getFirst(), pair.getSecond());
    }

    public static final <T> List<T> toList(Triple<? extends T, ? extends T, ? extends T> triple) {
        Intrinsics.checkNotNullParameter(triple, "<this>");
        return CollectionsKt.listOf(triple.getFirst(), triple.getSecond(), triple.getThird());
    }
}
