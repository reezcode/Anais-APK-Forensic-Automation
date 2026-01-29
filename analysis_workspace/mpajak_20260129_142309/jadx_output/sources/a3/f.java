package a3;

import android.database.Cursor;
import java.sql.SQLException;
import java.util.Objects;
import t2.m;
import x2.b;

/* loaded from: classes16.dex */
public final class f<T, ID> extends a<T, ID> {
    public f(d3.c cVar, String str, v2.g[] gVarArr, v2.g[] gVarArr2) {
        super(cVar, str, gVarArr, gVarArr2);
    }

    public static <T, ID> f<T, ID> f(u2.c cVar, d3.c<T, ID> cVar2, v2.g gVar) {
        if (gVar == null && (gVar = cVar2.f2498f) == null) {
            StringBuilder g5 = androidx.activity.d.g("Cannot query-for-id with ");
            g5.append(cVar2.f2494b);
            g5.append(" because it doesn't have an id field");
            throw new SQLException(g5.toString());
        }
        StringBuilder sb = new StringBuilder(64);
        b.c(cVar, sb, "SELECT * FROM ", cVar2.f2495c);
        b.d(cVar, gVar, sb);
        return new f<>(cVar2, sb.toString(), new v2.g[]{gVar}, cVar2.f2496d);
    }

    public final T g(c3.d dVar, ID id, m mVar) {
        Cursor cursor;
        x2.c cVar;
        String str;
        int i5;
        String str2;
        T t4;
        if (mVar != null && (t4 = (T) mVar.get()) != null) {
            return t4;
        }
        Object[] objArr = {this.f71c.d(id)};
        String str3 = this.f72d;
        q2.c cVar2 = (q2.c) dVar;
        Objects.requireNonNull(cVar2);
        T t5 = (T) null;
        try {
            try {
                cursor = cVar2.f4741b.rawQuery(str3, cVar2.e(objArr));
            } catch (android.database.SQLException e5) {
                e = e5;
            }
        } catch (Throwable th) {
            th = th;
            cursor = t5;
        }
        try {
            q2.d dVar2 = new q2.d(cursor, mVar);
            q2.c.f4740d.h("{}: queried for one result: {}", cVar2, str3);
            if (dVar2.b()) {
                t5 = a(dVar2);
                if (dVar2.g()) {
                    t5 = (T) c3.d.f525a;
                }
            }
            cursor.close();
            if (t5 == null) {
                cVar = b.f68f;
                str = this.f72d;
                i5 = 1;
                str2 = "{} using '{}' and {} args, got no results";
            } else {
                if (t5 == c3.d.f525a) {
                    b.f68f.f(b.a.ERROR, null, "{} using '{}' and {} args, got >1 results", "query-for-id", this.f72d, 1, null);
                    b.f68f.h("{} arguments: {}", "query-for-id", objArr);
                    StringBuilder e6 = androidx.activity.result.a.e("query-for-id", " got more than 1 result: ");
                    e6.append(this.f72d);
                    throw new SQLException(e6.toString());
                }
                cVar = b.f68f;
                str = this.f72d;
                i5 = 1;
                str2 = "{} using '{}' and {} args, got 1 result";
            }
            cVar.d(str2, "query-for-id", str, i5);
            b.f68f.h("{} arguments: {}", "query-for-id", objArr);
            return (T) t5;
        } catch (android.database.SQLException e7) {
            e = e7;
            t5 = (T) cursor;
            throw d1.c.e("queryForOne from database failed: " + str3, e);
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
