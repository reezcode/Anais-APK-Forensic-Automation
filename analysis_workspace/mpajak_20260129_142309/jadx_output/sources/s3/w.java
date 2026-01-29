package s3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.io.FileUtils;
import s3.o;

/* loaded from: classes9.dex */
public final class w implements Cloneable {
    public final int A;
    public final int B;
    public final long C;
    public final w3.m D;

    /* renamed from: b, reason: collision with root package name */
    public final m f5320b;

    /* renamed from: c, reason: collision with root package name */
    public final g3.d f5321c;

    /* renamed from: d, reason: collision with root package name */
    public final List<t> f5322d;

    /* renamed from: e, reason: collision with root package name */
    public final List<t> f5323e;

    /* renamed from: f, reason: collision with root package name */
    public final o.b f5324f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5325g;

    /* renamed from: h, reason: collision with root package name */
    public final s3.b f5326h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5327i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5328j;

    /* renamed from: k, reason: collision with root package name */
    public final l f5329k;

    /* renamed from: l, reason: collision with root package name */
    public final n f5330l;

    /* renamed from: m, reason: collision with root package name */
    public final Proxy f5331m;

    /* renamed from: n, reason: collision with root package name */
    public final ProxySelector f5332n;

    /* renamed from: o, reason: collision with root package name */
    public final s3.b f5333o;

    /* renamed from: p, reason: collision with root package name */
    public final SocketFactory f5334p;

    /* renamed from: q, reason: collision with root package name */
    public final SSLSocketFactory f5335q;

    /* renamed from: r, reason: collision with root package name */
    public final X509TrustManager f5336r;

    /* renamed from: s, reason: collision with root package name */
    public final List<j> f5337s;

    /* renamed from: t, reason: collision with root package name */
    public final List<x> f5338t;

    /* renamed from: u, reason: collision with root package name */
    public final HostnameVerifier f5339u;

    /* renamed from: v, reason: collision with root package name */
    public final f f5340v;

    /* renamed from: w, reason: collision with root package name */
    public final d1.f f5341w;

    /* renamed from: x, reason: collision with root package name */
    public final int f5342x;

    /* renamed from: y, reason: collision with root package name */
    public final int f5343y;

    /* renamed from: z, reason: collision with root package name */
    public final int f5344z;
    public static final b G = new b();
    public static final List<x> E = t3.c.m(x.HTTP_2, x.HTTP_1_1);
    public static final List<j> F = t3.c.m(j.f5235e, j.f5236f);

    /* loaded from: classes13.dex */
    public static final class a {
        public int A;
        public long B;
        public w3.m C;

        /* renamed from: a, reason: collision with root package name */
        public m f5345a = new m();

        /* renamed from: b, reason: collision with root package name */
        public g3.d f5346b = new g3.d(1);

        /* renamed from: c, reason: collision with root package name */
        public final List<t> f5347c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public final List<t> f5348d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public o.b f5349e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f5350f;

        /* renamed from: g, reason: collision with root package name */
        public s3.b f5351g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f5352h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f5353i;

        /* renamed from: j, reason: collision with root package name */
        public l f5354j;

        /* renamed from: k, reason: collision with root package name */
        public n f5355k;

        /* renamed from: l, reason: collision with root package name */
        public Proxy f5356l;

        /* renamed from: m, reason: collision with root package name */
        public ProxySelector f5357m;

        /* renamed from: n, reason: collision with root package name */
        public s3.b f5358n;

        /* renamed from: o, reason: collision with root package name */
        public SocketFactory f5359o;

        /* renamed from: p, reason: collision with root package name */
        public SSLSocketFactory f5360p;

        /* renamed from: q, reason: collision with root package name */
        public X509TrustManager f5361q;

        /* renamed from: r, reason: collision with root package name */
        public List<j> f5362r;

        /* renamed from: s, reason: collision with root package name */
        public List<? extends x> f5363s;

        /* renamed from: t, reason: collision with root package name */
        public HostnameVerifier f5364t;

        /* renamed from: u, reason: collision with root package name */
        public f f5365u;

        /* renamed from: v, reason: collision with root package name */
        public d1.f f5366v;

        /* renamed from: w, reason: collision with root package name */
        public int f5367w;

        /* renamed from: x, reason: collision with root package name */
        public int f5368x;

        /* renamed from: y, reason: collision with root package name */
        public int f5369y;

        /* renamed from: z, reason: collision with root package name */
        public int f5370z;

        public a() {
            o.a asFactory = o.f5265a;
            byte[] bArr = t3.c.f5449a;
            Intrinsics.checkNotNullParameter(asFactory, "$this$asFactory");
            this.f5349e = new t3.a();
            this.f5350f = true;
            f1.j jVar = s3.b.f5153a;
            this.f5351g = jVar;
            this.f5352h = true;
            this.f5353i = true;
            this.f5354j = l.f5259b;
            this.f5355k = n.f5264c;
            this.f5358n = jVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "SocketFactory.getDefault()");
            this.f5359o = socketFactory;
            b bVar = w.G;
            this.f5362r = w.F;
            this.f5363s = w.E;
            this.f5364t = d4.c.f2506a;
            this.f5365u = f.f5200c;
            this.f5368x = 10000;
            this.f5369y = 10000;
            this.f5370z = 10000;
            this.B = FileUtils.ONE_KB;
        }
    }

    /* loaded from: classes24.dex */
    public static final class b {
    }

    public w() {
        this(new a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004c, code lost:
    
        if (r0 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(s3.w.a r5) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.w.<init>(s3.w$a):void");
    }

    public final d a(y request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new w3.e(this, request, false);
    }

    public final Object clone() {
        return super.clone();
    }
}
