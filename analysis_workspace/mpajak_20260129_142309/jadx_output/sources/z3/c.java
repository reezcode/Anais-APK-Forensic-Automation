package z3;

import f4.i;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final f4.i f6172d;

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public static final f4.i f6173e;

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public static final f4.i f6174f;

    /* renamed from: g, reason: collision with root package name */
    @JvmField
    public static final f4.i f6175g;

    /* renamed from: h, reason: collision with root package name */
    @JvmField
    public static final f4.i f6176h;

    /* renamed from: i, reason: collision with root package name */
    @JvmField
    public static final f4.i f6177i;

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public final int f6178a;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public final f4.i f6179b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public final f4.i f6180c;

    static {
        i.a aVar = f4.i.f2861f;
        f6172d = aVar.b(":");
        f6173e = aVar.b(":status");
        f6174f = aVar.b(":method");
        f6175g = aVar.b(":path");
        f6176h = aVar.b(":scheme");
        f6177i = aVar.b(":authority");
    }

    public c(f4.i name, f4.i value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f6179b = name;
        this.f6180c = value;
        this.f6178a = value.c() + name.c() + 32;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(f4.i name, String value) {
        this(name, f4.i.f2861f.b(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            f4.i$a r0 = f4.i.f2861f
            f4.i r2 = r0.b(r2)
            f4.i r3 = r0.b(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.c.<init>(java.lang.String, java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f6179b, cVar.f6179b) && Intrinsics.areEqual(this.f6180c, cVar.f6180c);
    }

    public final int hashCode() {
        f4.i iVar = this.f6179b;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        f4.i iVar2 = this.f6180c;
        return hashCode + (iVar2 != null ? iVar2.hashCode() : 0);
    }

    public final String toString() {
        return this.f6179b.k() + ": " + this.f6180c.k();
    }
}
