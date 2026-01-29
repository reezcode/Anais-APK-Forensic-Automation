package s3;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import x3.c;

/* loaded from: classes25.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f5250a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5251b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5252c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5253d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5254e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5255f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5256g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5257h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5258i;

    /* renamed from: n, reason: collision with root package name */
    public static final a f5249n = new a();

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f5245j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f5246k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f5247l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f5248m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* loaded from: classes20.dex */
    public static final class a {
        public final int a(String str, int i5, int i6, boolean z4) {
            while (i5 < i6) {
                char charAt = str.charAt(i5);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z4)) {
                    return i5;
                }
                i5++;
            }
            return i6;
        }

        public final long b(String str, int i5) {
            int indexOf$default;
            int a5 = a(str, 0, i5, false);
            Matcher matcher = k.f5248m.matcher(str);
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            while (a5 < i5) {
                int a6 = a(str, a5 + 1, i5, true);
                matcher.region(a5, a6);
                if (i7 == -1 && matcher.usePattern(k.f5248m).matches()) {
                    String group = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group, "matcher.group(1)");
                    i7 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    Intrinsics.checkNotNullExpressionValue(group2, "matcher.group(2)");
                    i10 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    Intrinsics.checkNotNullExpressionValue(group3, "matcher.group(3)");
                    i11 = Integer.parseInt(group3);
                } else if (i8 == -1 && matcher.usePattern(k.f5247l).matches()) {
                    String group4 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group4, "matcher.group(1)");
                    i8 = Integer.parseInt(group4);
                } else {
                    if (i9 == -1) {
                        Pattern pattern = k.f5246k;
                        if (matcher.usePattern(pattern).matches()) {
                            String group5 = matcher.group(1);
                            Intrinsics.checkNotNullExpressionValue(group5, "matcher.group(1)");
                            Locale locale = Locale.US;
                            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
                            Objects.requireNonNull(group5, "null cannot be cast to non-null type java.lang.String");
                            String lowerCase = group5.toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            String pattern2 = pattern.pattern();
                            Intrinsics.checkNotNullExpressionValue(pattern2, "MONTH_PATTERN.pattern()");
                            indexOf$default = StringsKt__StringsKt.indexOf$default(pattern2, lowerCase, 0, false, 6, (Object) null);
                            i9 = indexOf$default / 4;
                        }
                    }
                    if (i6 == -1 && matcher.usePattern(k.f5245j).matches()) {
                        String group6 = matcher.group(1);
                        Intrinsics.checkNotNullExpressionValue(group6, "matcher.group(1)");
                        i6 = Integer.parseInt(group6);
                    }
                }
                a5 = a(str, a6 + 1, i5, false);
            }
            if (70 <= i6 && 99 >= i6) {
                i6 += 1900;
            }
            if (i6 >= 0 && 69 >= i6) {
                i6 += RecyclerView.MAX_SCROLL_DURATION;
            }
            if (!(i6 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i9 != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i8 && 31 >= i8)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i7 >= 0 && 23 >= i7)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i10 >= 0 && 59 >= i10)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i11 >= 0 && 59 >= i11)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(t3.c.f5453e);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i6);
            gregorianCalendar.set(2, i9 - 1);
            gregorianCalendar.set(5, i8);
            gregorianCalendar.set(11, i7);
            gregorianCalendar.set(12, i10);
            gregorianCalendar.set(13, i11);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public k(String str, String str2, long j5, String str3, String str4, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f5250a = str;
        this.f5251b = str2;
        this.f5252c = j5;
        this.f5253d = str3;
        this.f5254e = str4;
        this.f5255f = z4;
        this.f5256g = z5;
        this.f5257h = z6;
        this.f5258i = z7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (Intrinsics.areEqual(kVar.f5250a, this.f5250a) && Intrinsics.areEqual(kVar.f5251b, this.f5251b) && kVar.f5252c == this.f5252c && Intrinsics.areEqual(kVar.f5253d, this.f5253d) && Intrinsics.areEqual(kVar.f5254e, this.f5254e) && kVar.f5255f == this.f5255f && kVar.f5256g == this.f5256g && kVar.f5257h == this.f5257h && kVar.f5258i == this.f5258i) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        int hashCode = (this.f5251b.hashCode() + ((this.f5250a.hashCode() + 527) * 31)) * 31;
        long j5 = this.f5252c;
        return ((((((((this.f5254e.hashCode() + ((this.f5253d.hashCode() + ((hashCode + ((int) (j5 ^ (j5 >>> 32)))) * 31)) * 31)) * 31) + (this.f5255f ? 1231 : 1237)) * 31) + (this.f5256g ? 1231 : 1237)) * 31) + (this.f5257h ? 1231 : 1237)) * 31) + (this.f5258i ? 1231 : 1237);
    }

    public final String toString() {
        String format;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5250a);
        sb.append('=');
        sb.append(this.f5251b);
        if (this.f5257h) {
            if (this.f5252c == Long.MIN_VALUE) {
                format = "; max-age=0";
            } else {
                sb.append("; expires=");
                Date toHttpDateString = new Date(this.f5252c);
                c.a aVar = x3.c.f5935a;
                Intrinsics.checkNotNullParameter(toHttpDateString, "$this$toHttpDateString");
                format = x3.c.f5935a.get().format(toHttpDateString);
                Intrinsics.checkNotNullExpressionValue(format, "STANDARD_DATE_FORMAT.get().format(this)");
            }
            sb.append(format);
        }
        if (!this.f5258i) {
            sb.append("; domain=");
            sb.append(this.f5253d);
        }
        sb.append("; path=");
        sb.append(this.f5254e);
        if (this.f5255f) {
            sb.append("; secure");
        }
        if (this.f5256g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString()");
        return sb2;
    }
}
