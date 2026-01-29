package s3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s3.s;

/* loaded from: classes22.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final s f5138a;

    /* renamed from: b, reason: collision with root package name */
    public final List<x> f5139b;

    /* renamed from: c, reason: collision with root package name */
    public final List<j> f5140c;

    /* renamed from: d, reason: collision with root package name */
    public final n f5141d;

    /* renamed from: e, reason: collision with root package name */
    public final SocketFactory f5142e;

    /* renamed from: f, reason: collision with root package name */
    public final SSLSocketFactory f5143f;

    /* renamed from: g, reason: collision with root package name */
    public final HostnameVerifier f5144g;

    /* renamed from: h, reason: collision with root package name */
    public final f f5145h;

    /* renamed from: i, reason: collision with root package name */
    public final b f5146i;

    /* renamed from: j, reason: collision with root package name */
    public final Proxy f5147j;

    /* renamed from: k, reason: collision with root package name */
    public final ProxySelector f5148k;

    public a(String host, int i5, n dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b proxyAuthenticator, Proxy proxy, List<? extends x> protocols, List<j> connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(host, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f5141d = dns;
        this.f5142e = socketFactory;
        this.f5143f = sSLSocketFactory;
        this.f5144g = hostnameVerifier;
        this.f5145h = fVar;
        this.f5146i = proxyAuthenticator;
        this.f5147j = proxy;
        this.f5148k = proxySelector;
        s.a aVar = new s.a();
        String str = "https";
        String scheme = sSLSocketFactory != null ? "https" : "http";
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (StringsKt.g(scheme, "http")) {
            str = "http";
        } else if (!StringsKt.g(scheme, "https")) {
            throw new IllegalArgumentException(androidx.activity.d.f("unexpected scheme: ", scheme));
        }
        aVar.f5293a = str;
        Intrinsics.checkNotNullParameter(host, "host");
        String E = i.g.E(s.b.d(host, 0, 0, false, 7));
        if (E == null) {
            throw new IllegalArgumentException(androidx.activity.d.f("unexpected host: ", host));
        }
        aVar.f5296d = E;
        if (!(1 <= i5 && 65535 >= i5)) {
            throw new IllegalArgumentException(androidx.appcompat.widget.a.g("unexpected port: ", i5).toString());
        }
        aVar.f5297e = i5;
        this.f5138a = aVar.a();
        this.f5139b = t3.c.z(protocols);
        this.f5140c = t3.c.z(connectionSpecs);
    }

    public final boolean a(a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.f5141d, that.f5141d) && Intrinsics.areEqual(this.f5146i, that.f5146i) && Intrinsics.areEqual(this.f5139b, that.f5139b) && Intrinsics.areEqual(this.f5140c, that.f5140c) && Intrinsics.areEqual(this.f5148k, that.f5148k) && Intrinsics.areEqual(this.f5147j, that.f5147j) && Intrinsics.areEqual(this.f5143f, that.f5143f) && Intrinsics.areEqual(this.f5144g, that.f5144g) && Intrinsics.areEqual(this.f5145h, that.f5145h) && this.f5138a.f5289f == that.f5138a.f5289f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Intrinsics.areEqual(this.f5138a, aVar.f5138a) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f5145h) + ((Objects.hashCode(this.f5144g) + ((Objects.hashCode(this.f5143f) + ((Objects.hashCode(this.f5147j) + ((this.f5148k.hashCode() + ((this.f5140c.hashCode() + ((this.f5139b.hashCode() + ((this.f5146i.hashCode() + ((this.f5141d.hashCode() + ((this.f5138a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder g5;
        Object obj;
        StringBuilder g6 = androidx.activity.d.g("Address{");
        g6.append(this.f5138a.f5288e);
        g6.append(':');
        g6.append(this.f5138a.f5289f);
        g6.append(", ");
        if (this.f5147j != null) {
            g5 = androidx.activity.d.g("proxy=");
            obj = this.f5147j;
        } else {
            g5 = androidx.activity.d.g("proxySelector=");
            obj = this.f5148k;
        }
        g5.append(obj);
        g6.append(g5.toString());
        g6.append("}");
        return g6.toString();
    }
}
