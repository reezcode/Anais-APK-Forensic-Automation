package s3;

import androidx.core.app.NotificationCompat;
import com.tencent.smtt.sdk.TbsListener;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.apache.commons.io.IOUtils;

/* loaded from: classes19.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5284a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5285b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5286c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5287d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5288e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5289f;

    /* renamed from: g, reason: collision with root package name */
    public final List<String> f5290g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5291h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5292i;

    /* renamed from: k, reason: collision with root package name */
    public static final b f5283k = new b();

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f5282j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* loaded from: classes22.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f5293a;

        /* renamed from: d, reason: collision with root package name */
        public String f5296d;

        /* renamed from: f, reason: collision with root package name */
        public final List<String> f5298f;

        /* renamed from: g, reason: collision with root package name */
        public List<String> f5299g;

        /* renamed from: h, reason: collision with root package name */
        public String f5300h;

        /* renamed from: b, reason: collision with root package name */
        public String f5294b = "";

        /* renamed from: c, reason: collision with root package name */
        public String f5295c = "";

        /* renamed from: e, reason: collision with root package name */
        public int f5297e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f5298f = arrayList;
            arrayList.add("");
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Iterable, java.util.ArrayList, java.util.List<java.lang.String>] */
        public final s a() {
            int collectionSizeOrDefault;
            ArrayList arrayList;
            int collectionSizeOrDefault2;
            String str = this.f5293a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String d5 = b.d(this.f5294b, 0, 0, false, 7);
            String d6 = b.d(this.f5295c, 0, 0, false, 7);
            String str2 = this.f5296d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int b5 = b();
            ?? r02 = this.f5298f;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(r02, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            Iterator it = r02.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.d((String) it.next(), 0, 0, false, 7));
            }
            List<String> list = this.f5299g;
            if (list != null) {
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                arrayList = new ArrayList(collectionSizeOrDefault2);
                for (String str3 : list) {
                    arrayList.add(str3 != null ? b.d(str3, 0, 0, true, 3) : null);
                }
            } else {
                arrayList = null;
            }
            String str4 = this.f5300h;
            return new s(str, d5, d6, str2, b5, arrayList2, arrayList, str4 != null ? b.d(str4, 0, 0, false, 7) : null, toString());
        }

        public final int b() {
            int i5 = this.f5297e;
            if (i5 != -1) {
                return i5;
            }
            String scheme = this.f5293a;
            Intrinsics.checkNotNull(scheme);
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            int hashCode = scheme.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && scheme.equals("https")) {
                    return 443;
                }
            } else if (scheme.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final a c(String str) {
            List<String> list;
            if (str != null) {
                b bVar = s.f5283k;
                String a5 = b.a(str, 0, 0, " \"'<>#", true, false, true, false, null, TbsListener.ErrorCode.EXCEED_COPY_RETRY_NUM);
                if (a5 != null) {
                    list = bVar.e(a5);
                    this.f5299g = (ArrayList) list;
                    return this;
                }
            }
            list = null;
            this.f5299g = (ArrayList) list;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:183:0x0257, code lost:
        
            if (65535 < r1) goto L127;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
        
            if (r9 == ':') goto L43;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v30, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r2v31, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r2v37, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r2v38, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r2v41, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r3v33, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r3v70, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r3v71, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v12, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r5v16, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 4 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final s3.s.a d(s3.s r28, java.lang.String r29) {
            /*
                Method dump skipped, instructions count: 1186
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: s3.s.a.d(s3.s, java.lang.String):s3.s$a");
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        
            if ((r8.f5295c.length() > 0) != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
        
            if (r1 != r3) goto L48;
         */
        /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.ArrayList, java.util.List, java.util.List<java.lang.String>] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: s3.s.a.toString():java.lang.String");
        }
    }

    /* loaded from: classes11.dex */
    public static final class b {
        /* JADX WARN: Removed duplicated region for block: B:90:0x01ae A[LOOP:2: B:88:0x01a8->B:90:0x01ae, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.String a(java.lang.String r17, int r18, int r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, boolean r24, java.nio.charset.Charset r25, int r26) {
            /*
                Method dump skipped, instructions count: 494
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: s3.s.b.a(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset, int):java.lang.String");
        }

        public static String d(String percentDecode, int i5, int i6, boolean z4, int i7) {
            int i8;
            if ((i7 & 1) != 0) {
                i5 = 0;
            }
            if ((i7 & 2) != 0) {
                i6 = percentDecode.length();
            }
            if ((i7 & 4) != 0) {
                z4 = false;
            }
            Intrinsics.checkNotNullParameter(percentDecode, "$this$percentDecode");
            int i9 = i5;
            while (i9 < i6) {
                char charAt = percentDecode.charAt(i9);
                if (charAt == '%' || (charAt == '+' && z4)) {
                    f4.f fVar = new f4.f();
                    fVar.M(percentDecode, i5, i9);
                    while (i9 < i6) {
                        int codePointAt = percentDecode.codePointAt(i9);
                        if (codePointAt != 37 || (i8 = i9 + 2) >= i6) {
                            if (codePointAt == 43 && z4) {
                                fVar.A(32);
                                i9++;
                            }
                            fVar.N(codePointAt);
                            i9 += Character.charCount(codePointAt);
                        } else {
                            int s4 = t3.c.s(percentDecode.charAt(i9 + 1));
                            int s5 = t3.c.s(percentDecode.charAt(i8));
                            if (s4 != -1 && s5 != -1) {
                                fVar.A((s4 << 4) + s5);
                                i9 = Character.charCount(codePointAt) + i8;
                            }
                            fVar.N(codePointAt);
                            i9 += Character.charCount(codePointAt);
                        }
                    }
                    return fVar.q();
                }
                i9++;
            }
            String substring = percentDecode.substring(i5, i6);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        @JvmStatic
        public final int b(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            int hashCode = scheme.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && scheme.equals("https")) {
                    return 443;
                }
            } else if (scheme.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final boolean c(String str, int i5, int i6) {
            int i7 = i5 + 2;
            return i7 < i6 && str.charAt(i5) == '%' && t3.c.s(str.charAt(i5 + 1)) != -1 && t3.c.s(str.charAt(i7)) != -1;
        }

        public final List<String> e(String toQueryNamesAndValues) {
            String str;
            Intrinsics.checkNotNullParameter(toQueryNamesAndValues, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            while (i5 <= toQueryNamesAndValues.length()) {
                int h5 = StringsKt.h(toQueryNamesAndValues, Typography.amp, i5, 4);
                if (h5 == -1) {
                    h5 = toQueryNamesAndValues.length();
                }
                int h6 = StringsKt.h(toQueryNamesAndValues, '=', i5, 4);
                if (h6 == -1 || h6 > h5) {
                    String substring = toQueryNamesAndValues.substring(i5, h5);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    str = null;
                } else {
                    String substring2 = toQueryNamesAndValues.substring(i5, h6);
                    Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    str = toQueryNamesAndValues.substring(h6 + 1, h5);
                    Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(str);
                i5 = h5 + 1;
            }
            return arrayList;
        }

        public final void f(List<String> toQueryString, StringBuilder out) {
            Intrinsics.checkNotNullParameter(toQueryString, "$this$toQueryString");
            Intrinsics.checkNotNullParameter(out, "out");
            IntProgression step = RangesKt.step(RangesKt.until(0, toQueryString.size()), 2);
            int first = step.getFirst();
            int last = step.getLast();
            int step2 = step.getStep();
            if (step2 >= 0) {
                if (first > last) {
                    return;
                }
            } else if (first < last) {
                return;
            }
            while (true) {
                String str = toQueryString.get(first);
                String str2 = toQueryString.get(first + 1);
                if (first > 0) {
                    out.append(Typography.amp);
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first += step2;
                }
            }
        }
    }

    public s(String scheme, String username, String password, String host, int i5, List<String> pathSegments, List<String> list, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f5285b = scheme;
        this.f5286c = username;
        this.f5287d = password;
        this.f5288e = host;
        this.f5289f = i5;
        this.f5290g = list;
        this.f5291h = str;
        this.f5292i = url;
        this.f5284a = Intrinsics.areEqual(scheme, "https");
    }

    @JvmName(name = "encodedPassword")
    public final String a() {
        if (this.f5287d.length() == 0) {
            return "";
        }
        int h5 = StringsKt.h(this.f5292i, ':', this.f5285b.length() + 3, 4) + 1;
        int h6 = StringsKt.h(this.f5292i, '@', 0, 6);
        String str = this.f5292i;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(h5, h6);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @JvmName(name = "encodedPath")
    public final String b() {
        int h5 = StringsKt.h(this.f5292i, IOUtils.DIR_SEPARATOR_UNIX, this.f5285b.length() + 3, 4);
        String str = this.f5292i;
        int g5 = t3.c.g(str, "?#", h5, str.length());
        String str2 = this.f5292i;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(h5, g5);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @JvmName(name = "encodedPathSegments")
    public final List<String> c() {
        int h5 = StringsKt.h(this.f5292i, IOUtils.DIR_SEPARATOR_UNIX, this.f5285b.length() + 3, 4);
        String str = this.f5292i;
        int g5 = t3.c.g(str, "?#", h5, str.length());
        ArrayList arrayList = new ArrayList();
        while (h5 < g5) {
            int i5 = h5 + 1;
            int f5 = t3.c.f(this.f5292i, IOUtils.DIR_SEPARATOR_UNIX, i5, g5);
            String str2 = this.f5292i;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String substring = str2.substring(i5, f5);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            h5 = f5;
        }
        return arrayList;
    }

    @JvmName(name = "encodedQuery")
    public final String d() {
        if (this.f5290g == null) {
            return null;
        }
        int h5 = StringsKt.h(this.f5292i, '?', 0, 6) + 1;
        String str = this.f5292i;
        int f5 = t3.c.f(str, '#', h5, str.length());
        String str2 = this.f5292i;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(h5, f5);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @JvmName(name = "encodedUsername")
    public final String e() {
        if (this.f5286c.length() == 0) {
            return "";
        }
        int length = this.f5285b.length() + 3;
        String str = this.f5292i;
        int g5 = t3.c.g(str, ":@", length, str.length());
        String str2 = this.f5292i;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(length, g5);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s) && Intrinsics.areEqual(((s) obj).f5292i, this.f5292i);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final a f() {
        String substring;
        a aVar = new a();
        aVar.f5293a = this.f5285b;
        String e5 = e();
        Intrinsics.checkNotNullParameter(e5, "<set-?>");
        aVar.f5294b = e5;
        String a5 = a();
        Intrinsics.checkNotNullParameter(a5, "<set-?>");
        aVar.f5295c = a5;
        aVar.f5296d = this.f5288e;
        aVar.f5297e = this.f5289f != f5283k.b(this.f5285b) ? this.f5289f : -1;
        aVar.f5298f.clear();
        aVar.f5298f.addAll(c());
        aVar.c(d());
        if (this.f5291h == null) {
            substring = null;
        } else {
            int h5 = StringsKt.h(this.f5292i, '#', 0, 6) + 1;
            String str = this.f5292i;
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            substring = str.substring(h5);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
        }
        aVar.f5300h = substring;
        return aVar;
    }

    public final String g() {
        a aVar;
        Intrinsics.checkNotNullParameter("/...", "link");
        try {
            aVar = new a();
            aVar.d(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        Intrinsics.checkNotNull(aVar);
        Objects.requireNonNull(aVar);
        Intrinsics.checkNotNullParameter("", "username");
        aVar.f5294b = b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        Intrinsics.checkNotNullParameter("", "password");
        aVar.f5295c = b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        return aVar.a().f5292i;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    @JvmName(name = NotificationCompat.MessagingStyle.Message.KEY_DATA_URI)
    public final URI h() {
        a f5 = f();
        String str = f5.f5296d;
        f5.f5296d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
        int size = f5.f5298f.size();
        for (int i5 = 0; i5 < size; i5++) {
            ?? r6 = f5.f5298f;
            r6.set(i5, b.a((String) r6.get(i5), 0, 0, "[]", true, true, false, false, null, TbsListener.ErrorCode.HOST_CONTEXT_IS_NULL));
        }
        List<String> list = f5.f5299g;
        if (list != null) {
            int size2 = list.size();
            for (int i6 = 0; i6 < size2; i6++) {
                String str2 = list.get(i6);
                list.set(i6, str2 != null ? b.a(str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195) : null);
            }
        }
        String str3 = f5.f5300h;
        f5.f5300h = str3 != null ? b.a(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163) : null;
        String aVar = f5.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e5) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(aVar, ""));
                Intrinsics.checkNotNullExpressionValue(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e5);
            }
        }
    }

    public final int hashCode() {
        return this.f5292i.hashCode();
    }

    public final String toString() {
        return this.f5292i;
    }
}
