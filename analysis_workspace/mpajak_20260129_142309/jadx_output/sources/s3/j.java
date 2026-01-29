package s3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import s3.h;

/* loaded from: classes22.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public static final j f5235e;

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public static final j f5236f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5237a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5238b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f5239c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f5240d;

    /* loaded from: classes23.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f5241a;

        /* renamed from: b, reason: collision with root package name */
        public String[] f5242b;

        /* renamed from: c, reason: collision with root package name */
        public String[] f5243c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f5244d;

        public a() {
            this.f5241a = true;
        }

        public a(j connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f5241a = connectionSpec.f5237a;
            this.f5242b = connectionSpec.f5239c;
            this.f5243c = connectionSpec.f5240d;
            this.f5244d = connectionSpec.f5238b;
        }

        public final j a() {
            return new j(this.f5241a, this.f5244d, this.f5242b, this.f5243c);
        }

        public final a b(String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f5241a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(cipherSuites.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            Object clone = cipherSuites.clone();
            Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            this.f5242b = (String[]) clone;
            return this;
        }

        public final a c(h... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f5241a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (h hVar : cipherSuites) {
                arrayList.add(hVar.f5234a);
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            b((String[]) Arrays.copyOf(strArr, strArr.length));
            return this;
        }

        @Deprecated(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        public final a d() {
            if (!this.f5241a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.f5244d = true;
            return this;
        }

        public final a e(String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f5241a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(tlsVersions.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            Object clone = tlsVersions.clone();
            Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            this.f5243c = (String[]) clone;
            return this;
        }

        public final a f(f0... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f5241a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (f0 f0Var : tlsVersions) {
                arrayList.add(f0Var.f5211b);
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            e((String[]) Arrays.copyOf(strArr, strArr.length));
            return this;
        }
    }

    static {
        h hVar = h.f5230q;
        h hVar2 = h.f5231r;
        h hVar3 = h.f5232s;
        h hVar4 = h.f5224k;
        h hVar5 = h.f5226m;
        h hVar6 = h.f5225l;
        h hVar7 = h.f5227n;
        h hVar8 = h.f5229p;
        h hVar9 = h.f5228o;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9};
        h[] hVarArr2 = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, h.f5222i, h.f5223j, h.f5220g, h.f5221h, h.f5218e, h.f5219f, h.f5217d};
        a aVar = new a();
        aVar.c((h[]) Arrays.copyOf(hVarArr, 9));
        f0 f0Var = f0.TLS_1_3;
        f0 f0Var2 = f0.TLS_1_2;
        aVar.f(f0Var, f0Var2);
        aVar.d();
        aVar.a();
        a aVar2 = new a();
        aVar2.c((h[]) Arrays.copyOf(hVarArr2, 16));
        aVar2.f(f0Var, f0Var2);
        aVar2.d();
        f5235e = aVar2.a();
        a aVar3 = new a();
        aVar3.c((h[]) Arrays.copyOf(hVarArr2, 16));
        aVar3.f(f0Var, f0Var2, f0.TLS_1_1, f0.TLS_1_0);
        aVar3.d();
        aVar3.a();
        f5236f = new j(false, false, null, null);
    }

    public j(boolean z4, boolean z5, String[] strArr, String[] strArr2) {
        this.f5237a = z4;
        this.f5238b = z5;
        this.f5239c = strArr;
        this.f5240d = strArr2;
    }

    @JvmName(name = "cipherSuites")
    public final List<h> a() {
        String[] strArr = this.f5239c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(h.f5233t.b(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final boolean b(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f5237a) {
            return false;
        }
        String[] strArr = this.f5240d;
        if (strArr != null && !t3.c.k(strArr, socket.getEnabledProtocols(), ComparisonsKt.naturalOrder())) {
            return false;
        }
        String[] strArr2 = this.f5239c;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = socket.getEnabledCipherSuites();
        h.b bVar = h.f5233t;
        Comparator<String> comparator = h.f5215b;
        return t3.c.k(strArr2, enabledCipherSuites, h.f5215b);
    }

    @JvmName(name = "tlsVersions")
    public final List<f0> c() {
        String[] strArr = this.f5240d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f0.f5210i.a(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z4 = this.f5237a;
        j jVar = (j) obj;
        if (z4 != jVar.f5237a) {
            return false;
        }
        return !z4 || (Arrays.equals(this.f5239c, jVar.f5239c) && Arrays.equals(this.f5240d, jVar.f5240d) && this.f5238b == jVar.f5238b);
    }

    public final int hashCode() {
        if (!this.f5237a) {
            return 17;
        }
        String[] strArr = this.f5239c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f5240d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f5238b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f5237a) {
            return "ConnectionSpec()";
        }
        StringBuilder e5 = androidx.activity.result.a.e("ConnectionSpec(", "cipherSuites=");
        e5.append(Objects.toString(a(), "[all enabled]"));
        e5.append(", ");
        e5.append("tlsVersions=");
        e5.append(Objects.toString(c(), "[all enabled]"));
        e5.append(", ");
        e5.append("supportsTlsExtensions=");
        e5.append(this.f5238b);
        e5.append(')');
        return e5.toString();
    }
}
