package z2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes25.dex */
public final class h<T, ID> extends k<T, ID> {

    /* renamed from: i, reason: collision with root package name */
    public v2.g[] f6116i;

    /* renamed from: j, reason: collision with root package name */
    public List<String> f6117j;

    /* renamed from: k, reason: collision with root package name */
    public List<b3.f> f6118k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6119l;

    /* renamed from: m, reason: collision with root package name */
    public Long f6120m;

    /* renamed from: n, reason: collision with root package name */
    public Long f6121n;

    public h(u2.c cVar, d3.c<T, ID> cVar2, t2.g<T, ID> gVar) {
        super(cVar, cVar2, gVar, 1);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList, java.util.List<b3.f>] */
    @Override // z2.k
    public final void a(StringBuilder sb, List<a> list) {
        ?? r5 = this.f6118k;
        if ((r5 == 0 || r5.isEmpty()) ? false : true) {
            j(sb);
        }
        Objects.requireNonNull(this.f6142c);
        i(sb);
        if (this.f6121n != null) {
            Objects.requireNonNull(this.f6142c);
            u2.c cVar = this.f6142c;
            long longValue = this.f6121n.longValue();
            Objects.requireNonNull((u2.a) cVar);
            sb.append("OFFSET ");
            sb.append(longValue);
            sb.append(' ');
        }
        this.f6145f = false;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    @Override // z2.k
    public final void b(StringBuilder sb) {
        this.f6145f = false;
        sb.append("SELECT ");
        Objects.requireNonNull(this.f6142c);
        if (this.f6119l) {
            this.f6144e = 2;
            sb.append("COUNT(*) ");
        } else {
            ?? r12 = this.f6117j;
            boolean z4 = true;
            if (r12 == 0 || r12.isEmpty()) {
                this.f6144e = 1;
                if (this.f6145f) {
                    ((u2.a) this.f6142c).a(sb, this.f6141b);
                    sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                }
                sb.append("* ");
                this.f6116i = this.f6140a.f2496d;
            } else {
                this.f6144e = 3;
                Iterator it = this.f6117j.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (z4) {
                        z4 = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(str);
                }
                sb.append(' ');
            }
        }
        sb.append("FROM ");
        ((u2.a) this.f6142c).a(sb, this.f6141b);
        sb.append(' ');
    }

    @Override // z2.k
    public final boolean c(StringBuilder sb, List list) {
        if (this.f6146g != null) {
            return super.c(sb, list);
        }
        return true;
    }

    @Override // z2.k
    public final v2.g[] e() {
        return this.f6116i;
    }

    public final void h(StringBuilder sb, String str) {
        if (this.f6145f) {
            ((u2.a) this.f6142c).a(sb, this.f6141b);
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        }
        ((u2.a) this.f6142c).a(sb, str);
    }

    public final void i(StringBuilder sb) {
        if (this.f6120m != null) {
            Objects.requireNonNull(this.f6142c);
            u2.c cVar = this.f6142c;
            long longValue = this.f6120m.longValue();
            Objects.requireNonNull((u2.a) cVar);
            sb.append("LIMIT ");
            sb.append(longValue);
            sb.append(' ');
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<b3.f>] */
    public final void j(StringBuilder sb) {
        sb.append("ORDER BY ");
        ?? r02 = this.f6118k;
        if (r02 != 0) {
            Iterator it = r02.iterator();
            boolean z4 = true;
            while (it.hasNext()) {
                b3.f fVar = (b3.f) it.next();
                if (z4) {
                    z4 = false;
                } else {
                    sb.append(',');
                }
                h(sb, fVar.f436a);
                if (!fVar.f437b) {
                    sb.append(" DESC");
                }
            }
        }
        sb.append(' ');
    }

    public final h<T, ID> k(Long l5) {
        Objects.requireNonNull(this.f6142c);
        this.f6121n = l5;
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<b3.f>] */
    public final h<T, ID> l(String str, boolean z4) {
        if (this.f6140a.b(str).f5681e.F) {
            throw new IllegalArgumentException(androidx.activity.d.f("Can't orderBy foreign colletion field: ", str));
        }
        if (this.f6118k == null) {
            this.f6118k = new ArrayList();
        }
        this.f6118k.add(new b3.f(str, z4));
        return this;
    }

    public final f<T> m() {
        return f();
    }
}
