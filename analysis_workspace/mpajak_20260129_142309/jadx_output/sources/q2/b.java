package q2;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import c3.a;
import x2.b;

/* loaded from: classes7.dex */
public final class b extends c3.a {

    /* renamed from: e, reason: collision with root package name */
    public static final x2.c f4736e = x2.d.a(b.class);

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteOpenHelper f4737b;

    /* renamed from: c, reason: collision with root package name */
    public c f4738c = null;

    /* renamed from: d, reason: collision with root package name */
    public final u2.d f4739d = new u2.d();

    public b(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f4737b = sQLiteOpenHelper;
    }

    public final void b(c3.d dVar) {
        x2.c cVar = f4736e;
        b.a aVar = b.a.ERROR;
        a.C0012a c0012a = this.f522a.get();
        if (c0012a == null) {
            Object obj = x2.c.f5926b;
            cVar.f(aVar, null, "no connection has been saved when clear() called", obj, obj, obj, null);
            return;
        }
        c3.d dVar2 = c0012a.f523a;
        if (dVar2 != dVar) {
            cVar.f(aVar, null, "connection saved {} is not the one being cleared {}", dVar2, dVar, x2.c.f5926b, null);
            return;
        }
        int i5 = c0012a.f524b - 1;
        c0012a.f524b = i5;
        if (i5 == 0) {
            this.f522a.set(null);
        }
    }

    public final c3.d c() {
        a.C0012a c0012a = this.f522a.get();
        c3.d dVar = c0012a == null ? null : c0012a.f523a;
        if (dVar != null) {
            return dVar;
        }
        c cVar = this.f4738c;
        if (cVar == null) {
            try {
                SQLiteDatabase writableDatabase = this.f4737b.getWritableDatabase();
                c cVar2 = new c(writableDatabase);
                this.f4738c = cVar2;
                f4736e.i("created connection {} for db {}, helper {}", cVar2, writableDatabase, this.f4737b);
            } catch (SQLException e5) {
                StringBuilder g5 = androidx.activity.d.g("Getting a writable database from helper ");
                g5.append(this.f4737b);
                g5.append(" failed");
                throw d1.c.e(g5.toString(), e5);
            }
        } else {
            f4736e.i("{}: returning read-write connection {}, helper {}", this, cVar, this.f4737b);
        }
        return this.f4738c;
    }

    public final boolean d(c3.d dVar) {
        a.C0012a c0012a = this.f522a.get();
        if (c0012a == null) {
            this.f522a.set(new a.C0012a(dVar));
            return true;
        }
        if (c0012a.f523a == dVar) {
            c0012a.f524b++;
            return false;
        }
        throw new java.sql.SQLException("trying to save connection " + dVar + " but already have saved connection " + c0012a.f523a);
    }

    public final String toString() {
        return b.class.getSimpleName() + "@" + Integer.toHexString(hashCode());
    }
}
