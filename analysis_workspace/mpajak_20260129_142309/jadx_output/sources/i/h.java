package i;

import java.lang.reflect.Type;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Object f3221a;

    /* renamed from: b, reason: collision with root package name */
    public final h f3222b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3223c;

    /* renamed from: d, reason: collision with root package name */
    public Type f3224d;

    /* renamed from: e, reason: collision with root package name */
    public transient String f3225e;

    public h(h hVar, Object obj, Object obj2) {
        this.f3222b = hVar;
        this.f3221a = obj;
        this.f3223c = obj2;
    }

    public final String toString() {
        StringBuilder sb;
        String sb2;
        if (this.f3225e == null) {
            if (this.f3222b == null) {
                sb2 = "$";
            } else {
                if (this.f3223c instanceof Integer) {
                    sb = new StringBuilder();
                    sb.append(this.f3222b.toString());
                    sb.append("[");
                    sb.append(this.f3223c);
                    sb.append("]");
                } else {
                    sb = new StringBuilder();
                    sb.append(this.f3222b.toString());
                    sb.append(".");
                    sb.append(this.f3223c);
                }
                sb2 = sb.toString();
            }
            this.f3225e = sb2;
        }
        return this.f3225e;
    }
}
