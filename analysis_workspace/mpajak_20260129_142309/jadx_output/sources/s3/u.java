package s3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* loaded from: classes14.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f5304a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5305b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f5306c;

    /* renamed from: f, reason: collision with root package name */
    public static final a f5303f = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f5301d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f5302e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* loaded from: classes10.dex */
    public static final class a {
        @JvmStatic
        @JvmName(name = "get")
        public final u a(String toMediaType) {
            Intrinsics.checkNotNullParameter(toMediaType, "$this$toMediaType");
            Matcher matcher = u.f5301d.matcher(toMediaType);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + toMediaType + Typography.quote).toString());
            }
            String group = matcher.group(1);
            Intrinsics.checkNotNullExpressionValue(group, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            Objects.requireNonNull(group, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = group.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            Intrinsics.checkNotNullExpressionValue(group2, "typeSubtype.group(2)");
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            Objects.requireNonNull(group2, "null cannot be cast to non-null type java.lang.String");
            Intrinsics.checkNotNullExpressionValue(group2.toLowerCase(locale), "(this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = u.f5302e.matcher(toMediaType);
            for (int end = matcher.end(); end < toMediaType.length(); end = matcher2.end()) {
                matcher2.region(end, toMediaType.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder g5 = androidx.activity.d.g("Parameter is not formatted correctly: \"");
                    String substring = toMediaType.substring(end);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                    g5.append(substring);
                    g5.append("\" for: \"");
                    g5.append(toMediaType);
                    g5.append(Typography.quote);
                    throw new IllegalArgumentException(g5.toString().toString());
                }
                String group3 = matcher2.group(1);
                if (group3 != null) {
                    String group4 = matcher2.group(2);
                    if (group4 == null) {
                        group4 = matcher2.group(3);
                    } else if (StringsKt.u(group4, "'") && StringsKt.f(group4, "'") && group4.length() > 2) {
                        group4 = group4.substring(1, group4.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    arrayList.add(group3);
                    arrayList.add(group4);
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new u(toMediaType, lowerCase, (String[]) array);
        }

        @JvmStatic
        @JvmName(name = "parse")
        public final u b(String toMediaTypeOrNull) {
            Intrinsics.checkNotNullParameter(toMediaTypeOrNull, "$this$toMediaTypeOrNull");
            try {
                return a(toMediaTypeOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public u(String str, String str2, String[] strArr) {
        this.f5304a = str;
        this.f5305b = str2;
        this.f5306c = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @kotlin.jvm.JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.nio.charset.Charset a(java.nio.charset.Charset r6) {
        /*
            r5 = this;
            java.lang.String r0 = "charset"
            java.lang.String r1 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String[] r1 = r5.f5306c
            kotlin.ranges.IntRange r1 = kotlin.collections.ArraysKt.getIndices(r1)
            r2 = 2
            kotlin.ranges.IntProgression r1 = kotlin.ranges.RangesKt.step(r1, r2)
            int r2 = r1.getFirst()
            int r3 = r1.getLast()
            int r1 = r1.getStep()
            if (r1 < 0) goto L23
            if (r2 > r3) goto L3a
            goto L25
        L23:
            if (r2 < r3) goto L3a
        L25:
            java.lang.String[] r4 = r5.f5306c
            r4 = r4[r2]
            boolean r4 = kotlin.text.StringsKt.g(r4, r0)
            if (r4 == 0) goto L36
            java.lang.String[] r0 = r5.f5306c
            int r2 = r2 + 1
            r0 = r0[r2]
            goto L3b
        L36:
            if (r2 == r3) goto L3a
            int r2 = r2 + r1
            goto L25
        L3a:
            r0 = 0
        L3b:
            if (r0 == 0) goto L41
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> L41
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.u.a(java.nio.charset.Charset):java.nio.charset.Charset");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u) && Intrinsics.areEqual(((u) obj).f5304a, this.f5304a);
    }

    public final int hashCode() {
        return this.f5304a.hashCode();
    }

    public final String toString() {
        return this.f5304a;
    }
}
