package s3;

import f4.i;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Set<b> f5202a;

    /* renamed from: b, reason: collision with root package name */
    public final d1.f f5203b;

    /* renamed from: d, reason: collision with root package name */
    public static final a f5201d = new a();

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final f f5200c = new f(CollectionsKt.toSet(new ArrayList()));

    public static final class a {
        @JvmStatic
        public final String a(Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            StringBuilder g5 = androidx.activity.d.g("sha256/");
            g5.append(b((X509Certificate) certificate).a());
            return g5.toString();
        }

        @JvmStatic
        public final f4.i b(X509Certificate sha256Hash) {
            Intrinsics.checkNotNullParameter(sha256Hash, "$this$sha256Hash");
            i.a aVar = f4.i.f2861f;
            PublicKey publicKey = sha256Hash.getPublicKey();
            Intrinsics.checkNotNullExpressionValue(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return i.a.c(encoded).b("SHA-256");
        }
    }

    /* loaded from: classes16.dex */
    public static final class b {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            Objects.requireNonNull(bVar);
            if (!Intrinsics.areEqual((Object) null, (Object) null)) {
                return false;
            }
            Objects.requireNonNull(bVar);
            if (!Intrinsics.areEqual((Object) null, (Object) null)) {
                return false;
            }
            Objects.requireNonNull(bVar);
            return !(Intrinsics.areEqual((Object) null, (Object) null) ^ true);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append((String) null);
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            throw null;
        }
    }

    public f(Set pins) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f5202a = pins;
        this.f5203b = null;
    }

    public f(Set<b> pins, d1.f fVar) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f5202a = pins;
        this.f5203b = fVar;
    }

    public final void a(String hostname, Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set<b> set = this.f5202a;
        List<b> emptyList = CollectionsKt.emptyList();
        for (Object obj : set) {
            Objects.requireNonNull((b) obj);
            Intrinsics.checkNotNullParameter(hostname, "hostname");
            if (StringsKt.u(null, "**.")) {
                throw null;
            }
            if (StringsKt.u(null, "*.")) {
                throw null;
            }
            if (Intrinsics.areEqual(hostname, (Object) null)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList();
                }
                TypeIntrinsics.asMutableList(emptyList).add(obj);
            }
        }
        if (emptyList.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : invoke) {
            Iterator it = emptyList.iterator();
            if (it.hasNext()) {
                Objects.requireNonNull((b) it.next());
                throw null;
            }
        }
        StringBuilder e5 = androidx.activity.result.a.e("Certificate pinning failure!", "\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : invoke) {
            e5.append("\n    ");
            e5.append(f5201d.a(x509Certificate2));
            e5.append(": ");
            Principal subjectDN = x509Certificate2.getSubjectDN();
            Intrinsics.checkNotNullExpressionValue(subjectDN, "element.subjectDN");
            e5.append(subjectDN.getName());
        }
        e5.append("\n  Pinned certificates for ");
        e5.append(hostname);
        e5.append(":");
        for (b bVar : emptyList) {
            e5.append("\n    ");
            e5.append(bVar);
        }
        String sb = e5.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb);
    }

    public final f b(d1.f certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.areEqual(this.f5203b, certificateChainCleaner) ? this : new f(this.f5202a, certificateChainCleaner);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Intrinsics.areEqual(fVar.f5202a, this.f5202a) && Intrinsics.areEqual(fVar.f5203b, this.f5203b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f5202a.hashCode() + 1517) * 41;
        d1.f fVar = this.f5203b;
        return hashCode + (fVar != null ? fVar.hashCode() : 0);
    }
}
