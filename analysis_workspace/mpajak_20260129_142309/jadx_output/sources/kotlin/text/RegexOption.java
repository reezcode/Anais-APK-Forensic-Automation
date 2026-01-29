package kotlin.text;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'IGNORE_CASE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes25.dex */
public final class RegexOption implements FlagEnum {
    private static final /* synthetic */ RegexOption[] $VALUES = $values();
    public static final RegexOption CANON_EQ;
    public static final RegexOption COMMENTS;
    public static final RegexOption DOT_MATCHES_ALL;
    public static final RegexOption IGNORE_CASE;
    public static final RegexOption LITERAL;
    public static final RegexOption MULTILINE;
    public static final RegexOption UNIX_LINES;
    private final int mask;
    private final int value;

    private static final /* synthetic */ RegexOption[] $values() {
        return new RegexOption[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    static {
        int i5 = 2;
        IGNORE_CASE = new RegexOption("IGNORE_CASE", 0, i5, 0, 2, null);
        int i6 = 0;
        int i7 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        MULTILINE = new RegexOption("MULTILINE", 1, 8, i6, i7, defaultConstructorMarker);
        int i8 = 0;
        int i9 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        LITERAL = new RegexOption("LITERAL", i5, 16, i8, i9, defaultConstructorMarker2);
        UNIX_LINES = new RegexOption("UNIX_LINES", 3, 1, i6, i7, defaultConstructorMarker);
        COMMENTS = new RegexOption("COMMENTS", 4, 4, i8, i9, defaultConstructorMarker2);
        DOT_MATCHES_ALL = new RegexOption("DOT_MATCHES_ALL", 5, 32, i6, i7, defaultConstructorMarker);
        CANON_EQ = new RegexOption("CANON_EQ", 6, 128, i8, i9, defaultConstructorMarker2);
    }

    private RegexOption(String str, int i5, int i6, int i7) {
        this.value = i6;
        this.mask = i7;
    }

    public /* synthetic */ RegexOption(String str, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i5, i6, (i8 & 2) != 0 ? i6 : i7);
    }

    public static RegexOption valueOf(String str) {
        return (RegexOption) Enum.valueOf(RegexOption.class, str);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) $VALUES.clone();
    }

    @Override // kotlin.text.FlagEnum
    public int getMask() {
        return this.mask;
    }

    @Override // kotlin.text.FlagEnum
    public int getValue() {
        return this.value;
    }
}
