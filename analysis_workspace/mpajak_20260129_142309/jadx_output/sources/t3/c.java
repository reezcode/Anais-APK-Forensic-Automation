package t3;

import f4.a0;
import f4.h;
import f4.i;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import s3.b0;
import s3.c0;
import s3.r;
import s3.s;

@JvmName(name = "Util")
/* loaded from: classes23.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public static final byte[] f5449a;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final r f5450b = r.f5279c.c(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final c0 f5451c;

    /* renamed from: d, reason: collision with root package name */
    public static final f4.r f5452d;

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public static final TimeZone f5453e;

    /* renamed from: f, reason: collision with root package name */
    public static final Regex f5454f;

    /* renamed from: g, reason: collision with root package name */
    @JvmField
    public static final String f5455g;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0141, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.c.<clinit>():void");
    }

    public static final int A(String str, int i5) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i5;
    }

    public static final String B(String trimSubstring, int i5, int i6) {
        Intrinsics.checkNotNullParameter(trimSubstring, "$this$trimSubstring");
        int o4 = o(trimSubstring, i5, i6);
        String substring = trimSubstring.substring(o4, p(trimSubstring, o4, i6));
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final Throwable C(Exception withSuppressed, List<? extends Exception> suppressed) {
        Intrinsics.checkNotNullParameter(withSuppressed, "$this$withSuppressed");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(withSuppressed, it.next());
        }
        return withSuppressed;
    }

    public static final boolean a(s canReuseConnectionFor, s other) {
        Intrinsics.checkNotNullParameter(canReuseConnectionFor, "$this$canReuseConnectionFor");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(canReuseConnectionFor.f5288e, other.f5288e) && canReuseConnectionFor.f5289f == other.f5289f && Intrinsics.areEqual(canReuseConnectionFor.f5285b, other.f5285b);
    }

    public static final int b() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter("timeout", "name");
        if (!(timeUnit != null)) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(15L);
        if (!(millis <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException("timeout too large.".toString());
        }
        if (millis != 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout too small.".toString());
    }

    public static final void c(long j5, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j5 || j5 - j6 < j7) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeQuietly) {
        Intrinsics.checkNotNullParameter(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket closeQuietly) {
        Intrinsics.checkNotNullParameter(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (AssertionError e5) {
            throw e5;
        } catch (RuntimeException e6) {
            if (!Intrinsics.areEqual(e6.getMessage(), "bio == null")) {
                throw e6;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(String delimiterOffset, char c5, int i5, int i6) {
        Intrinsics.checkNotNullParameter(delimiterOffset, "$this$delimiterOffset");
        while (i5 < i6) {
            if (delimiterOffset.charAt(i5) == c5) {
                return i5;
            }
            i5++;
        }
        return i6;
    }

    public static final int g(String delimiterOffset, String delimiters, int i5, int i6) {
        boolean contains$default;
        Intrinsics.checkNotNullParameter(delimiterOffset, "$this$delimiterOffset");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i5 < i6) {
            contains$default = StringsKt__StringsKt.contains$default(delimiters, delimiterOffset.charAt(i5), false, 2, (Object) null);
            if (contains$default) {
                return i5;
            }
            i5++;
        }
        return i6;
    }

    public static /* synthetic */ int h(String str, char c5, int i5, int i6, int i7) {
        if ((i7 & 2) != 0) {
            i5 = 0;
        }
        if ((i7 & 4) != 0) {
            i6 = str.length();
        }
        return f(str, c5, i5, i6);
    }

    public static final boolean i(a0 discard) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(discard, "$this$discard");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return v(discard, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String j(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
        return format2;
    }

    public static final boolean k(String[] hasIntersection, String[] strArr, Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(hasIntersection, "$this$hasIntersection");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(hasIntersection.length == 0) && strArr != null) {
            if (!(strArr.length == 0)) {
                for (String str : hasIntersection) {
                    for (String str2 : strArr) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long l(b0 headersContentLength) {
        Intrinsics.checkNotNullParameter(headersContentLength, "$this$headersContentLength");
        String toLongOrDefault = headersContentLength.f5159g.l("Content-Length");
        if (toLongOrDefault != null) {
            Intrinsics.checkNotNullParameter(toLongOrDefault, "$this$toLongOrDefault");
            try {
                return Long.parseLong(toLongOrDefault);
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    @SafeVarargs
    public static final <T> List<T> m(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int n(String indexOfControlOrNonAscii) {
        Intrinsics.checkNotNullParameter(indexOfControlOrNonAscii, "$this$indexOfControlOrNonAscii");
        int length = indexOfControlOrNonAscii.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = indexOfControlOrNonAscii.charAt(i5);
            if (Intrinsics.compare((int) charAt, 31) <= 0 || Intrinsics.compare((int) charAt, 127) >= 0) {
                return i5;
            }
        }
        return -1;
    }

    public static final int o(String indexOfFirstNonAsciiWhitespace, int i5, int i6) {
        Intrinsics.checkNotNullParameter(indexOfFirstNonAsciiWhitespace, "$this$indexOfFirstNonAsciiWhitespace");
        while (i5 < i6) {
            char charAt = indexOfFirstNonAsciiWhitespace.charAt(i5);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i5;
            }
            i5++;
        }
        return i6;
    }

    public static final int p(String indexOfLastNonAsciiWhitespace, int i5, int i6) {
        Intrinsics.checkNotNullParameter(indexOfLastNonAsciiWhitespace, "$this$indexOfLastNonAsciiWhitespace");
        int i7 = i6 - 1;
        if (i7 >= i5) {
            while (true) {
                char charAt = indexOfLastNonAsciiWhitespace.charAt(i7);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i7 + 1;
                }
                if (i7 == i5) {
                    break;
                }
                i7--;
            }
        }
        return i5;
    }

    public static final String[] q(String[] intersect, String[] other, Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(intersect, "$this$intersect");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : intersect) {
            int length = other.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i5]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i5++;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    public static final boolean r(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.g(name, "Authorization") || StringsKt.g(name, "Cookie") || StringsKt.g(name, "Proxy-Authorization") || StringsKt.g(name, "Set-Cookie");
    }

    public static final int s(char c5) {
        if ('0' <= c5 && '9' >= c5) {
            return c5 - '0';
        }
        char c6 = 'a';
        if ('a' > c5 || 'f' < c5) {
            c6 = 'A';
            if ('A' > c5 || 'F' < c5) {
                return -1;
            }
        }
        return (c5 - c6) + 10;
    }

    public static final Charset t(h readBomAsCharset, Charset charset) {
        Charset charset2;
        String str;
        Intrinsics.checkNotNullParameter(readBomAsCharset, "$this$readBomAsCharset");
        Intrinsics.checkNotNullParameter(charset, "default");
        int g5 = readBomAsCharset.g(f5452d);
        if (g5 == -1) {
            return charset;
        }
        if (g5 == 0) {
            charset2 = StandardCharsets.UTF_8;
            str = "UTF_8";
        } else if (g5 == 1) {
            charset2 = StandardCharsets.UTF_16BE;
            str = "UTF_16BE";
        } else {
            if (g5 != 2) {
                if (g5 == 3) {
                    return Charsets.INSTANCE.UTF32_BE();
                }
                if (g5 == 4) {
                    return Charsets.INSTANCE.UTF32_LE();
                }
                throw new AssertionError();
            }
            charset2 = StandardCharsets.UTF_16LE;
            str = "UTF_16LE";
        }
        Intrinsics.checkNotNullExpressionValue(charset2, str);
        return charset2;
    }

    public static final int u(h readMedium) {
        Intrinsics.checkNotNullParameter(readMedium, "$this$readMedium");
        return (readMedium.readByte() & 255) | ((readMedium.readByte() & 255) << 16) | ((readMedium.readByte() & 255) << 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (r6 == Long.MAX_VALUE) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
    
        r12.i().d(r1 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        r12.i().a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if (r6 != Long.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean v(f4.a0 r12, int r13) {
        /*
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r1 = "$this$skipAll"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            java.lang.String r1 = "timeUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            long r1 = java.lang.System.nanoTime()
            f4.b0 r3 = r12.i()
            boolean r3 = r3.e()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L29
            f4.b0 r3 = r12.i()
            long r6 = r3.c()
            long r6 = r6 - r1
            goto L2a
        L29:
            r6 = r4
        L2a:
            f4.b0 r3 = r12.i()
            long r8 = (long) r13
            long r8 = r0.toNanos(r8)
            long r8 = java.lang.Math.min(r6, r8)
            long r8 = r8 + r1
            r3.d(r8)
            f4.f r13 = new f4.f     // Catch: java.lang.Throwable -> L56 java.io.InterruptedIOException -> L68
            r13.<init>()     // Catch: java.lang.Throwable -> L56 java.io.InterruptedIOException -> L68
        L40:
            r8 = 8192(0x2000, double:4.0474E-320)
            long r8 = r12.u(r13, r8)     // Catch: java.lang.Throwable -> L56 java.io.InterruptedIOException -> L68
            r10 = -1
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 == 0) goto L50
            r13.a()     // Catch: java.lang.Throwable -> L56 java.io.InterruptedIOException -> L68
            goto L40
        L50:
            r13 = 1
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L76
            goto L6e
        L56:
            r13 = move-exception
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            f4.b0 r12 = r12.i()
            if (r0 != 0) goto L63
            r12.a()
            goto L67
        L63:
            long r1 = r1 + r6
            r12.d(r1)
        L67:
            throw r13
        L68:
            r13 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L76
        L6e:
            f4.b0 r12 = r12.i()
            r12.a()
            goto L7e
        L76:
            f4.b0 r12 = r12.i()
            long r1 = r1 + r6
            r12.d(r1)
        L7e:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.c.v(f4.a0, int):boolean");
    }

    public static final r w(List<z3.c> toHeaders) {
        Intrinsics.checkNotNullParameter(toHeaders, "$this$toHeaders");
        ArrayList arrayList = new ArrayList(20);
        for (z3.c cVar : toHeaders) {
            i iVar = cVar.f6179b;
            i iVar2 = cVar.f6180c;
            String name = iVar.k();
            String value = iVar2.k();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            arrayList.add(name);
            arrayList.add(StringsKt.trim((CharSequence) value).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return new r((String[]) array);
    }

    public static final String x(int i5) {
        String hexString = Integer.toHexString(i5);
        Intrinsics.checkNotNullExpressionValue(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String y(s3.s r4, boolean r5) {
        /*
            java.lang.String r0 = "$this$toHostHeader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = r4.f5288e
            java.lang.String r1 = ":"
            boolean r0 = kotlin.text.StringsKt.c(r0, r1)
            if (r0 == 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r4.f5288e
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L2a
        L28:
            java.lang.String r0 = r4.f5288e
        L2a:
            if (r5 != 0) goto L5d
            int r5 = r4.f5289f
            java.lang.String r1 = r4.f5285b
            java.lang.String r2 = "scheme"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            int r2 = r1.hashCode()
            r3 = 3213448(0x310888, float:4.503E-39)
            if (r2 == r3) goto L4f
            r3 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r2 == r3) goto L44
            goto L5a
        L44:
            java.lang.String r2 = "https"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5a
            r1 = 443(0x1bb, float:6.21E-43)
            goto L5b
        L4f:
            java.lang.String r2 = "http"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5a
            r1 = 80
            goto L5b
        L5a:
            r1 = -1
        L5b:
            if (r5 == r1) goto L73
        L5d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r0 = 58
            r5.append(r0)
            int r4 = r4.f5289f
            r5.append(r4)
            java.lang.String r0 = r5.toString()
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.c.y(s3.s, boolean):java.lang.String");
    }

    public static final <T> List<T> z(List<? extends T> toImmutableList) {
        Intrinsics.checkNotNullParameter(toImmutableList, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(CollectionsKt.toMutableList((Collection) toImmutableList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }
}
