package a3;

import java.sql.SQLException;
import x2.b;

/* loaded from: classes15.dex */
public final class e<T, ID> extends a<T, ID> implements z2.f<T>, z2.e<T>, z2.g {

    /* renamed from: k, reason: collision with root package name */
    public final z2.a[] f79k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f80l;

    /* renamed from: m, reason: collision with root package name */
    public final int f81m;

    public e(d3.c cVar, String str, v2.g[] gVarArr, v2.g[] gVarArr2, z2.a[] aVarArr, int i5) {
        super(cVar, str, gVarArr, gVarArr2);
        this.f79k = aVarArr;
        this.f80l = null;
        this.f81m = i5;
    }

    public final c3.b f(c3.d dVar, int i5) {
        z2.a[] aVarArr;
        int i6;
        if (this.f81m != i5) {
            StringBuilder g5 = androidx.activity.d.g("Could not compile this ");
            g5.append(androidx.appcompat.widget.a.o(this.f81m));
            g5.append(" statement since the caller is expecting a ");
            g5.append(androidx.appcompat.widget.a.o(i5));
            g5.append(" statement.  Check your QueryBuilder methods.");
            throw new SQLException(g5.toString());
        }
        c3.b b5 = ((q2.c) dVar).b(this.f72d, i5);
        try {
            Long l5 = this.f80l;
            if (l5 != null) {
                int intValue = l5.intValue();
                q2.a aVar = (q2.a) b5;
                if (aVar.f4732e != null) {
                    throw new SQLException("Query already run. Cannot add argument values.");
                }
                aVar.f4734g = Integer.valueOf(intValue);
            }
            Object[] objArr = null;
            x2.c cVar = b.f68f;
            if (cVar.f5927a.b(b.a.TRACE)) {
                z2.a[] aVarArr2 = this.f79k;
                if (aVarArr2.length > 0) {
                    objArr = new Object[aVarArr2.length];
                }
            }
            int i7 = 0;
            while (true) {
                aVarArr = this.f79k;
                if (i7 >= aVarArr.length) {
                    break;
                }
                Object a5 = aVarArr[i7].a();
                v2.g gVar = this.f73e[i7];
                if (gVar == null) {
                    this.f79k[i7].c();
                    i6 = 0;
                } else {
                    i6 = gVar.i();
                }
                ((q2.a) b5).g(i7, a5, i6);
                if (objArr != null) {
                    objArr[i7] = a5;
                }
                i7++;
            }
            b.f68f.c("prepared statement '{}' with {} args", this.f72d, Integer.valueOf(aVarArr.length));
            if (objArr != null) {
                b.f68f.g("prepared statement arguments: {}", objArr);
            }
            return b5;
        } catch (Throwable th) {
            ((q2.a) b5).a();
            throw th;
        }
    }
}
