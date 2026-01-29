package i;

/* loaded from: classes10.dex */
public enum b {
    AutoCloseSource,
    /* JADX INFO: Fake field, exist only in values array */
    AllowComment,
    AllowUnQuotedFieldNames,
    AllowSingleQuotes,
    InternFieldNames,
    AllowISO8601DateFormat,
    AllowArbitraryCommas,
    UseBigDecimal,
    IgnoreNotMatch,
    SortFeidFastMatch,
    /* JADX INFO: Fake field, exist only in values array */
    DisableASM,
    DisableCircularReferenceDetect,
    InitStringFieldAsEmpty,
    SupportArrayToBean,
    OrderedField,
    DisableSpecialKeyDetect,
    UseObjectArray,
    SupportNonPublicField,
    IgnoreAutoType,
    DisableFieldSmartMatch;


    /* renamed from: b, reason: collision with root package name */
    public final int f3178b = 1 << ordinal();

    b() {
    }

    public static int a(b[] bVarArr) {
        if (bVarArr == null) {
            return 0;
        }
        int i5 = 0;
        for (b bVar : bVarArr) {
            i5 |= bVar.f3178b;
        }
        return i5;
    }
}
