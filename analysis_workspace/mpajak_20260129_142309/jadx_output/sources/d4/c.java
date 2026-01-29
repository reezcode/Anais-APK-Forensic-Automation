package d4;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes20.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2506a = new c();

    public final String a(String str) {
        if (!c(str)) {
            return str;
        }
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public final List<String> b(X509Certificate x509Certificate, int i5) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && !(!Intrinsics.areEqual(list.get(0), Integer.valueOf(i5))) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.emptyList();
        }
    }

    public final boolean c(String utf8Size) {
        int i5;
        int length = utf8Size.length();
        int length2 = utf8Size.length();
        Intrinsics.checkNotNullParameter(utf8Size, "$this$utf8Size");
        if (!(length2 >= 0)) {
            throw new IllegalArgumentException(androidx.activity.d.d("endIndex < beginIndex: ", length2, " < ", 0).toString());
        }
        if (!(length2 <= utf8Size.length())) {
            StringBuilder e5 = androidx.appcompat.graphics.drawable.a.e("endIndex > string.length: ", length2, " > ");
            e5.append(utf8Size.length());
            throw new IllegalArgumentException(e5.toString().toString());
        }
        long j5 = 0;
        int i6 = 0;
        while (i6 < length2) {
            char charAt = utf8Size.charAt(i6);
            if (charAt < 128) {
                j5++;
            } else {
                if (charAt < 2048) {
                    i5 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i5 = 3;
                } else {
                    int i7 = i6 + 1;
                    char charAt2 = i7 < length2 ? utf8Size.charAt(i7) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j5++;
                        i6 = i7;
                    } else {
                        j5 += 4;
                        i6 += 2;
                    }
                }
                j5 += i5;
            }
            i6++;
        }
        return length == ((int) j5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x011e, code lost:
    
        if (r0 != (-1)) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[LOOP:1: B:25:0x0065->B:58:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.lang.String r10, java.security.cert.X509Certificate r11) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.c.d(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (!c(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            if (certificate != null) {
                return d(host, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
