package k;

/* loaded from: classes9.dex */
public enum b1 {
    QuoteFieldNames,
    UseSingleQuotes,
    WriteMapNullValue,
    WriteEnumUsingToString,
    WriteEnumUsingName,
    UseISO8601DateFormat,
    WriteNullListAsEmpty,
    WriteNullStringAsEmpty,
    WriteNullNumberAsZero,
    WriteNullBooleanAsFalse,
    SkipTransientField,
    SortField,
    /* JADX INFO: Fake field, exist only in values array */
    WriteTabAsSpecial,
    PrettyFormat,
    WriteClassName,
    DisableCircularReferenceDetect,
    WriteSlashAsSpecial,
    BrowserCompatible,
    WriteDateUseDateFormat,
    NotWriteRootClassName,
    /* JADX INFO: Fake field, exist only in values array */
    DisableCheckSpecialChar,
    BeanToArray,
    WriteNonStringKeyAsString,
    NotWriteDefaultValue,
    BrowserSecure,
    IgnoreNonFieldGetter,
    WriteNonStringValueAsString,
    IgnoreErrorGetter,
    WriteBigDecimalAsPlain,
    MapSortField;

    public static final b1[] E;
    public static final int F;

    /* renamed from: b, reason: collision with root package name */
    public final int f3675b = 1 << ordinal();

    static {
        b1 b1Var = WriteMapNullValue;
        b1 b1Var2 = WriteNullListAsEmpty;
        b1 b1Var3 = WriteNullStringAsEmpty;
        b1 b1Var4 = WriteNullNumberAsZero;
        b1 b1Var5 = WriteNullBooleanAsFalse;
        E = new b1[0];
        F = b1Var.f3675b | b1Var5.f3675b | b1Var2.f3675b | b1Var4.f3675b | b1Var3.f3675b;
    }

    b1() {
    }

    public static boolean a(int i5, b1 b1Var) {
        return (i5 & b1Var.f3675b) != 0;
    }

    public static int b(b1[] b1VarArr) {
        if (b1VarArr == null) {
            return 0;
        }
        int i5 = 0;
        for (b1 b1Var : b1VarArr) {
            i5 |= b1Var.f3675b;
        }
        return i5;
    }
}
