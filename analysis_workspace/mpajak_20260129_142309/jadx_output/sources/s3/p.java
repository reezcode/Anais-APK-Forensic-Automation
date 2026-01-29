package s3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import s3.s;

/* loaded from: classes18.dex */
public final class p extends d1.f {

    /* renamed from: d, reason: collision with root package name */
    public static final u f5266d = u.f5303f.a("application/x-www-form-urlencoded");

    /* renamed from: b, reason: collision with root package name */
    public final List<String> f5267b;

    /* renamed from: c, reason: collision with root package name */
    public final List<String> f5268c;

    /* loaded from: classes16.dex */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public final Charset f5271c = null;

        /* renamed from: a, reason: collision with root package name */
        public final List<String> f5269a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final List<String> f5270b = new ArrayList();

        @JvmOverloads
        public a() {
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
        public final a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5269a.add(s.b.a(name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f5271c, 91));
            this.f5270b.add(s.b.a(value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f5271c, 91));
            return this;
        }
    }

    public p(List<String> encodedNames, List<String> encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.f5267b = t3.c.z(encodedNames);
        this.f5268c = t3.c.z(encodedValues);
    }

    @Override // d1.f
    public final long A() {
        return M(null, true);
    }

    @Override // d1.f
    public final u B() {
        return f5266d;
    }

    @Override // d1.f
    public final void K(f4.g sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        M(sink, false);
    }

    public final long M(f4.g gVar, boolean z4) {
        f4.f h5;
        if (z4) {
            h5 = new f4.f();
        } else {
            Intrinsics.checkNotNull(gVar);
            h5 = gVar.h();
        }
        int size = this.f5267b.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (i5 > 0) {
                h5.A(38);
            }
            h5.K(this.f5267b.get(i5));
            h5.A(61);
            h5.K(this.f5268c.get(i5));
        }
        if (!z4) {
            return 0L;
        }
        long j5 = h5.f2852c;
        h5.a();
        return j5;
    }
}
