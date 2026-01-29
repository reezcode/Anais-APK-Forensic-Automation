package kotlin.text;

import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class StringsKt__AppendableKt {
    public static final <T extends Appendable> T append(T t4, CharSequence... value) {
        Intrinsics.checkNotNullParameter(t4, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        for (CharSequence charSequence : value) {
            t4.append(charSequence);
        }
        return t4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    public static <T> void appendElement(Appendable appendable, T t4, Function1<? super T, ? extends CharSequence> function1) {
        CharSequence valueOf;
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        if (function1 != null) {
            t4 = (T) function1.invoke(t4);
        } else {
            if (!(t4 == 0 ? true : t4 instanceof CharSequence)) {
                if (t4 instanceof Character) {
                    appendable.append(((Character) t4).charValue());
                    return;
                } else {
                    valueOf = String.valueOf((Object) t4);
                    appendable.append(valueOf);
                }
            }
        }
        valueOf = (CharSequence) t4;
        appendable.append(valueOf);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Appendable appendLine(Appendable appendable) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append('\n');
        Intrinsics.checkNotNullExpressionValue(append, "append('\\n')");
        return append;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Appendable appendLine(Appendable appendable, char c5) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(c5);
        Intrinsics.checkNotNullExpressionValue(append, "append(value)");
        Appendable append2 = append.append('\n');
        Intrinsics.checkNotNullExpressionValue(append2, "append('\\n')");
        return append2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Appendable appendLine(Appendable appendable, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(append, "append(value)");
        Appendable append2 = append.append('\n');
        Intrinsics.checkNotNullExpressionValue(append2, "append('\\n')");
        return append2;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T extends Appendable> T appendRange(T t4, CharSequence value, int i5, int i6) {
        Intrinsics.checkNotNullParameter(t4, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        T t5 = (T) t4.append(value, i5, i6);
        Intrinsics.checkNotNull(t5, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t5;
    }
}
