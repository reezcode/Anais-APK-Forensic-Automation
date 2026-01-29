package w3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s3.e0;
import s3.s;

/* loaded from: classes22.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public List<? extends Proxy> f5884a;

    /* renamed from: b, reason: collision with root package name */
    public int f5885b;

    /* renamed from: c, reason: collision with root package name */
    public List<? extends InetSocketAddress> f5886c;

    /* renamed from: d, reason: collision with root package name */
    public final List<e0> f5887d;

    /* renamed from: e, reason: collision with root package name */
    public final s3.a f5888e;

    /* renamed from: f, reason: collision with root package name */
    public final m f5889f;

    /* renamed from: g, reason: collision with root package name */
    public final s3.d f5890g;

    /* renamed from: h, reason: collision with root package name */
    public final s3.o f5891h;

    /* loaded from: classes12.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f5892a;

        /* renamed from: b, reason: collision with root package name */
        public final List<e0> f5893b;

        public a(List<e0> routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.f5893b = routes;
        }

        public final boolean a() {
            return this.f5892a < this.f5893b.size();
        }

        public final e0 b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            List<e0> list = this.f5893b;
            int i5 = this.f5892a;
            this.f5892a = i5 + 1;
            return list.get(i5);
        }
    }

    public o(s3.a address, m routeDatabase, s3.d call, s3.o eventListener) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f5888e = address;
        this.f5889f = routeDatabase;
        this.f5890g = call;
        this.f5891h = eventListener;
        this.f5884a = CollectionsKt.emptyList();
        this.f5886c = CollectionsKt.emptyList();
        this.f5887d = new ArrayList();
        s url = address.f5138a;
        p pVar = new p(this, address.f5147j, url);
        Objects.requireNonNull(eventListener);
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        List<Proxy> proxies = pVar.invoke();
        this.f5884a = proxies;
        this.f5885b = 0;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<s3.e0>] */
    public final boolean a() {
        return b() || (this.f5887d.isEmpty() ^ true);
    }

    public final boolean b() {
        return this.f5885b < this.f5884a.size();
    }
}
