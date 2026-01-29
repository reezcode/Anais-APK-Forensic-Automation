package s3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    public static final a f5272e = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f5273a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f5274b;

    /* renamed from: c, reason: collision with root package name */
    public final h f5275c;

    /* renamed from: d, reason: collision with root package name */
    public final List<Certificate> f5276d;

    /* loaded from: classes21.dex */
    public static final class a {

        /* renamed from: s3.q$a$a, reason: collision with other inner class name */
        /* loaded from: classes20.dex */
        public static final class C0066a extends Lambda implements Function0<List<? extends Certificate>> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ List f5277b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0066a(List list) {
                super(0);
                this.f5277b = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Certificate> invoke() {
                return this.f5277b;
            }
        }

        @JvmStatic
        @JvmName(name = "get")
        public final q a(SSLSession handshake) {
            List emptyList;
            Intrinsics.checkNotNullParameter(handshake, "$this$handshake");
            String cipherSuite = handshake.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            int hashCode = cipherSuite.hashCode();
            if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(androidx.activity.d.f("cipherSuite == ", cipherSuite));
            }
            h b5 = h.f5233t.b(cipherSuite);
            String protocol = handshake.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (Intrinsics.areEqual("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            f0 a5 = f0.f5210i.a(protocol);
            try {
                Certificate[] peerCertificates = handshake.getPeerCertificates();
                emptyList = peerCertificates != null ? t3.c.m((Certificate[]) Arrays.copyOf(peerCertificates, peerCertificates.length)) : CollectionsKt.emptyList();
            } catch (SSLPeerUnverifiedException unused) {
                emptyList = CollectionsKt.emptyList();
            }
            Certificate[] localCertificates = handshake.getLocalCertificates();
            return new q(a5, b5, localCertificates != null ? t3.c.m((Certificate[]) Arrays.copyOf(localCertificates, localCertificates.length)) : CollectionsKt.emptyList(), new C0066a(emptyList));
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends Lambda implements Function0<List<? extends Certificate>> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f5278b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0 function0) {
            super(0);
            this.f5278b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Certificate> invoke() {
            try {
                return (List) this.f5278b.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return CollectionsKt.emptyList();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(f0 tlsVersion, h cipherSuite, List<? extends Certificate> localCertificates, Function0<? extends List<? extends Certificate>> peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f5274b = tlsVersion;
        this.f5275c = cipherSuite;
        this.f5276d = localCertificates;
        this.f5273a = LazyKt.lazy(new b(peerCertificatesFn));
    }

    public final String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.checkNotNullExpressionValue(type, "type");
        return type;
    }

    @JvmName(name = "peerCertificates")
    public final List<Certificate> b() {
        return (List) this.f5273a.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (qVar.f5274b == this.f5274b && Intrinsics.areEqual(qVar.f5275c, this.f5275c) && Intrinsics.areEqual(qVar.b(), b()) && Intrinsics.areEqual(qVar.f5276d, this.f5276d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5276d.hashCode() + ((b().hashCode() + ((this.f5275c.hashCode() + ((this.f5274b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        List<Certificate> b5 = b();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(b5, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = b5.iterator();
        while (it.hasNext()) {
            arrayList.add(a((Certificate) it.next()));
        }
        String obj = arrayList.toString();
        StringBuilder e5 = androidx.activity.result.a.e("Handshake{", "tlsVersion=");
        e5.append(this.f5274b);
        e5.append(' ');
        e5.append("cipherSuite=");
        e5.append(this.f5275c);
        e5.append(' ');
        e5.append("peerCertificates=");
        e5.append(obj);
        e5.append(' ');
        e5.append("localCertificates=");
        List<Certificate> list = this.f5276d;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(a((Certificate) it2.next()));
        }
        e5.append(arrayList2);
        e5.append('}');
        return e5.toString();
    }
}
