package w3;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.collections.ArraysKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import s3.h;
import s3.j;

/* loaded from: classes23.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f5797a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5798b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5799c;

    /* renamed from: d, reason: collision with root package name */
    public final List<s3.j> f5800d;

    public b(List<s3.j> connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f5800d = connectionSpecs;
    }

    public final s3.j a(SSLSocket sslSocket) {
        s3.j jVar;
        boolean z4;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i5 = this.f5797a;
        int size = this.f5800d.size();
        while (true) {
            if (i5 >= size) {
                jVar = null;
                break;
            }
            jVar = this.f5800d.get(i5);
            if (jVar.b(sslSocket)) {
                this.f5797a = i5 + 1;
                break;
            }
            i5++;
        }
        if (jVar == null) {
            StringBuilder g5 = androidx.activity.d.g("Unable to find acceptable protocols. isFallback=");
            g5.append(this.f5799c);
            g5.append(',');
            g5.append(" modes=");
            g5.append(this.f5800d);
            g5.append(',');
            g5.append(" supported protocols=");
            String[] enabledProtocols = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNull(enabledProtocols);
            String arrays = Arrays.toString(enabledProtocols);
            Intrinsics.checkNotNullExpressionValue(arrays, "java.util.Arrays.toString(this)");
            g5.append(arrays);
            throw new UnknownServiceException(g5.toString());
        }
        int i6 = this.f5797a;
        int size2 = this.f5800d.size();
        while (true) {
            if (i6 >= size2) {
                z4 = false;
                break;
            }
            if (this.f5800d.get(i6).b(sslSocket)) {
                z4 = true;
                break;
            }
            i6++;
        }
        this.f5798b = z4;
        boolean z5 = this.f5799c;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (jVar.f5239c != null) {
            String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            String[] strArr = jVar.f5239c;
            h.b bVar = s3.h.f5233t;
            Comparator<String> comparator = s3.h.f5215b;
            cipherSuitesIntersection = t3.c.q(enabledCipherSuites, strArr, s3.h.f5215b);
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        if (jVar.f5240d != null) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = t3.c.q(enabledProtocols2, jVar.f5240d, ComparisonsKt.naturalOrder());
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] indexOf = sslSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(indexOf, "supportedCipherSuites");
        h.b bVar2 = s3.h.f5233t;
        Comparator<String> comparator2 = s3.h.f5215b;
        Comparator<String> comparator3 = s3.h.f5215b;
        byte[] bArr = t3.c.f5449a;
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        Intrinsics.checkNotNullParameter("TLS_FALLBACK_SCSV", "value");
        Intrinsics.checkNotNullParameter(comparator3, "comparator");
        int length = indexOf.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            if (comparator3.compare(indexOf[i7], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i7++;
        }
        if (z5 && i7 != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String value = indexOf[i7];
            Intrinsics.checkNotNullExpressionValue(value, "supportedCipherSuites[indexOfFallbackScsv]");
            Intrinsics.checkNotNullParameter(cipherSuitesIntersection, "$this$concat");
            Intrinsics.checkNotNullParameter(value, "value");
            Object[] copyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) copyOf;
            cipherSuitesIntersection[ArraysKt.getLastIndex(cipherSuitesIntersection)] = value;
        }
        j.a aVar = new j.a(jVar);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        aVar.b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        aVar.e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        s3.j a5 = aVar.a();
        if (a5.c() != null) {
            sslSocket.setEnabledProtocols(a5.f5240d);
        }
        if (a5.a() != null) {
            sslSocket.setEnabledCipherSuites(a5.f5239c);
        }
        return jVar;
    }
}
