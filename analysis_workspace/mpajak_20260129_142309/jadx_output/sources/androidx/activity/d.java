package androidx.activity;

import java.util.Iterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;

/* loaded from: classes17.dex */
public final /* synthetic */ class d {
    public static /* synthetic */ boolean a(int i5) {
        if (i5 == 1 || i5 == 2 || i5 == 3) {
            return false;
        }
        if (i5 == 4 || i5 == 5) {
            return true;
        }
        throw null;
    }

    public static int b(String str, int i5) {
        return String.valueOf(str).length() + i5;
    }

    public static String c(String str, int i5, String str2) {
        return str + i5 + str2;
    }

    public static String d(String str, int i5, String str2, int i6) {
        return str + i5 + str2 + i6;
    }

    public static String e(String str, Class cls) {
        return str + cls;
    }

    public static String f(String str, String str2) {
        return str + str2;
    }

    public static StringBuilder g(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static Iterator h(Iterable iterable, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(iterable, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return iterable.iterator();
    }

    public static Iterator i(Sequence sequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(sequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return sequence.iterator();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    public static IntIterator j(int i5, int i6) {
        return new IntRange(i5, i6).iterator();
    }

    public static /* synthetic */ String k(int i5) {
        return i5 == 1 ? "INITIALIZE" : i5 == 2 ? "SWITCH_TO_SOURCE_SERVICE" : i5 == 3 ? "DECODE_DATA" : "null";
    }
}
