package z2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public abstract class k<T, ID> {

    /* renamed from: h, reason: collision with root package name */
    public static x2.c f6139h = x2.d.a(k.class);

    /* renamed from: a, reason: collision with root package name */
    public final d3.c<T, ID> f6140a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6141b;

    /* renamed from: c, reason: collision with root package name */
    public final u2.c f6142c;

    /* renamed from: d, reason: collision with root package name */
    public final t2.g<T, ID> f6143d;

    /* renamed from: e, reason: collision with root package name */
    public int f6144e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6145f;

    /* renamed from: g, reason: collision with root package name */
    public m<T, ID> f6146g = null;

    /* JADX WARN: Incorrect types in method signature: (Lu2/c;Ld3/c<TT;TID;>;Lt2/g<TT;TID;>;Ljava/lang/Object;)V */
    public k(u2.c cVar, d3.c cVar2, t2.g gVar, int i5) {
        this.f6142c = cVar;
        this.f6140a = cVar2;
        this.f6141b = cVar2.f2495c;
        this.f6143d = gVar;
        this.f6144e = i5;
        if (androidx.appcompat.widget.a.c(i5)) {
            return;
        }
        StringBuilder g5 = androidx.activity.d.g("Building a statement from a ");
        g5.append(androidx.appcompat.widget.a.o(i5));
        g5.append(" statement is not allowed");
        throw new IllegalStateException(g5.toString());
    }

    public abstract void a(StringBuilder sb, List<a> list);

    public abstract void b(StringBuilder sb);

    public boolean c(StringBuilder sb, List list) {
        if (this.f6146g == null) {
            return true;
        }
        sb.append("WHERE ");
        m<T, ID> mVar = this.f6146g;
        String str = this.f6145f ? this.f6141b : null;
        int i5 = mVar.f6162e;
        if (i5 == 0) {
            throw new IllegalStateException("No where clauses defined.  Did you miss a where operation?");
        }
        if (i5 != 1) {
            throw new IllegalStateException("Both the \"left-hand\" and \"right-hand\" clauses have been defined.  Did you miss an AND or OR?");
        }
        if (mVar.f6163f != null) {
            throw new IllegalStateException("The SQL statement has not been finished since there are previous operations still waiting for clauses.");
        }
        mVar.f6161d[i5 - 1].a(mVar.f6160c, str, sb, list);
        return false;
    }

    public final String d(List<a> list) {
        StringBuilder sb = new StringBuilder(128);
        b(sb);
        c(sb, list);
        a(sb, list);
        String sb2 = sb.toString();
        f6139h.b("built statement {}", sb2);
        return sb2;
    }

    public v2.g[] e() {
        return null;
    }

    public final a3.e f() {
        ArrayList arrayList = new ArrayList();
        String d5 = d(arrayList);
        a[] aVarArr = (a[]) arrayList.toArray(new a[arrayList.size()]);
        v2.g[] e5 = e();
        v2.g[] gVarArr = new v2.g[arrayList.size()];
        for (int i5 = 0; i5 < aVarArr.length; i5++) {
            gVarArr[i5] = aVarArr[i5].b();
        }
        if (androidx.appcompat.widget.a.c(this.f6144e)) {
            d3.c<T, ID> cVar = this.f6140a;
            Objects.requireNonNull(this.f6142c);
            return new a3.e(cVar, d5, gVarArr, e5, aVarArr, this.f6144e);
        }
        StringBuilder g5 = androidx.activity.d.g("Building a statement from a ");
        g5.append(androidx.appcompat.widget.a.o(this.f6144e));
        g5.append(" statement is not allowed");
        throw new IllegalStateException(g5.toString());
    }

    public final m<T, ID> g() {
        m<T, ID> mVar = new m<>(this.f6140a, this, this.f6142c);
        this.f6146g = mVar;
        return mVar;
    }
}
