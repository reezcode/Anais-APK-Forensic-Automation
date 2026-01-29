package kotlin.text;

/* loaded from: classes2.dex */
public final class StringsKt extends StringsKt___StringsKt {
    private StringsKt() {
    }

    public static /* bridge */ /* synthetic */ boolean c(CharSequence charSequence, CharSequence charSequence2) {
        return StringsKt__StringsKt.contains$default(charSequence, charSequence2, false, 2, (Object) null);
    }

    public static /* bridge */ /* synthetic */ boolean f(String str, String str2) {
        return StringsKt__StringsJVMKt.endsWith$default(str, str2, false, 2, null);
    }

    public static /* bridge */ /* synthetic */ boolean g(String str, String str2) {
        return StringsKt__StringsJVMKt.equals(str, str2, true);
    }

    public static /* bridge */ /* synthetic */ int h(CharSequence charSequence, char c5, int i5, int i6) {
        return StringsKt__StringsKt.indexOf$default(charSequence, c5, i5, false, i6, (Object) null);
    }

    public static /* bridge */ /* synthetic */ boolean u(String str, String str2) {
        return StringsKt__StringsJVMKt.startsWith$default(str, str2, false, 2, null);
    }

    public static /* bridge */ /* synthetic */ boolean v(String str, String str2, int i5) {
        return StringsKt__StringsJVMKt.startsWith$default(str, str2, i5, false, 4, null);
    }
}
