package kotlin.text;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExperimentalStdlibApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes21.dex */
class StringsKt__StringBuilderJVMKt extends StringsKt__RegexExtensionsKt {
    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb, byte b5) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append((int) b5);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value.toInt())");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb, double d5) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(d5);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb, float f5) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(f5);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb, int i5) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(i5);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb, long j5) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(j5);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb, StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(stringBuffer);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb, StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append((CharSequence) sb2);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder appendLine(StringBuilder sb, short s4) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append((int) s4);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value.toInt())");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder appendRange(StringBuilder sb, CharSequence value, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb.append(value, i5, i6);
        Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder appendRange(StringBuilder sb, char[] value, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb.append(value, i5, i6 - i5);
        Intrinsics.checkNotNullExpressionValue(sb, "this.append(value, start…x, endIndex - startIndex)");
        return sb;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine()", imports = {}))
    public static final Appendable appendln(Appendable appendable) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(SystemProperties.LINE_SEPARATOR);
        Intrinsics.checkNotNullExpressionValue(append, "append(SystemProperties.LINE_SEPARATOR)");
        return append;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final Appendable appendln(Appendable appendable, char c5) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(c5);
        Intrinsics.checkNotNullExpressionValue(append, "append(value)");
        return appendln(append);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final Appendable appendln(Appendable appendable, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(append, "append(value)");
        return appendln(append);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine()", imports = {}))
    public static final StringBuilder appendln(StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(SystemProperties.LINE_SEPARATOR);
        Intrinsics.checkNotNullExpressionValue(sb, "append(SystemProperties.LINE_SEPARATOR)");
        return sb;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb, byte b5) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append((int) b5);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value.toInt())");
        return appendln(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb, char c5) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(c5);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb, double d5) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(d5);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb, float f5) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(f5);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb, int i5) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(i5);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb, long j5) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(j5);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(charSequence);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb, Object obj) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(obj);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb, String str) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(str);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb, StringBuffer stringBuffer) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(stringBuffer);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb, StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append((CharSequence) sb2);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb, short s4) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append((int) s4);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value.toInt())");
        return appendln(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb, boolean z4) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.append(z4);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder appendln(StringBuilder sb, char[] value) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb.append(value);
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        return appendln(sb);
    }

    @SinceKotlin(version = "1.3")
    public static final StringBuilder clear(StringBuilder sb) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.setLength(0);
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder deleteAt(StringBuilder sb, int i5) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder deleteCharAt = sb.deleteCharAt(i5);
        Intrinsics.checkNotNullExpressionValue(deleteCharAt, "this.deleteCharAt(index)");
        return deleteCharAt;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder deleteRange(StringBuilder sb, int i5, int i6) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        StringBuilder delete = sb.delete(i5, i6);
        Intrinsics.checkNotNullExpressionValue(delete, "this.delete(startIndex, endIndex)");
        return delete;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder insertRange(StringBuilder sb, int i5, CharSequence value, int i6, int i7) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder insert = sb.insert(i5, value, i6, i7);
        Intrinsics.checkNotNullExpressionValue(insert, "this.insert(index, value, startIndex, endIndex)");
        return insert;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder insertRange(StringBuilder sb, int i5, char[] value, int i6, int i7) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder insert = sb.insert(i5, value, i6, i7 - i6);
        Intrinsics.checkNotNullExpressionValue(insert, "this.insert(index, value…x, endIndex - startIndex)");
        return insert;
    }

    @InlineOnly
    private static final void set(StringBuilder sb, int i5, char c5) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.setCharAt(i5, c5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder setRange(StringBuilder sb, int i5, int i6, String value) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder replace = sb.replace(i5, i6, value);
        Intrinsics.checkNotNullExpressionValue(replace, "this.replace(startIndex, endIndex, value)");
        return replace;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final void toCharArray(StringBuilder sb, char[] destination, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        sb.getChars(i6, i7, destination, i5);
    }

    public static /* synthetic */ void toCharArray$default(StringBuilder sb, char[] destination, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = sb.length();
        }
        Intrinsics.checkNotNullParameter(sb, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        sb.getChars(i6, i7, destination, i5);
    }
}
