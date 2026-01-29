package kotlin.collections;

import kotlin.jvm.functions.Function1;

/* loaded from: classes15.dex */
public final class ArraysKt extends ArraysKt___ArraysKt {
    private ArraysKt() {
    }

    public static /* bridge */ /* synthetic */ Appendable d(Object[] objArr, Appendable appendable, Function1 function1) {
        Appendable joinTo;
        joinTo = ArraysKt___ArraysKt.joinTo(objArr, appendable, (r14 & 2) != 0 ? ", " : null, (r14 & 4) != 0 ? "" : "<", (r14 & 8) == 0 ? ">" : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : function1);
        return joinTo;
    }
}
