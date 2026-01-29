package q2;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import s2.b;

/* loaded from: classes2.dex */
public final class a implements c3.b {

    /* renamed from: i, reason: collision with root package name */
    public static x2.c f4725i = x2.d.a(a.class);

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f4726j = new String[0];

    /* renamed from: k, reason: collision with root package name */
    public static final s2.b f4727k = s2.a.f5136a;

    /* renamed from: a, reason: collision with root package name */
    public final String f4728a;

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteDatabase f4729b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4730c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4731d;

    /* renamed from: e, reason: collision with root package name */
    public Cursor f4732e;

    /* renamed from: f, reason: collision with root package name */
    public List<Object> f4733f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f4734g;

    /* renamed from: h, reason: collision with root package name */
    public b.a f4735h;

    public a(String str, SQLiteDatabase sQLiteDatabase, int i5, boolean z4) {
        this.f4728a = str;
        this.f4729b = sQLiteDatabase;
        this.f4730c = i5;
        this.f4731d = z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
    
        if (r5 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(android.database.sqlite.SQLiteDatabase r2, java.lang.String r3, java.lang.String r4, java.lang.Object[] r5) {
        /*
            r2.execSQL(r4, r5)     // Catch: android.database.SQLException -> L2b
            r5 = 0
            java.lang.String r0 = "SELECT CHANGES()"
            android.database.sqlite.SQLiteStatement r5 = r2.compileStatement(r0)     // Catch: android.database.SQLException -> L10 java.lang.Throwable -> L12
            long r0 = r5.simpleQueryForLong()     // Catch: android.database.SQLException -> L10 java.lang.Throwable -> L12
            int r2 = (int) r0
            goto L1c
        L10:
            goto L19
        L12:
            r2 = move-exception
            if (r5 == 0) goto L18
            r5.close()
        L18:
            throw r2
        L19:
            r2 = 1
            if (r5 == 0) goto L1f
        L1c:
            r5.close()
        L1f:
            x2.c r5 = q2.a.f4725i
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.String r1 = "executing statement {} changed {} rows: {}"
            r5.i(r1, r3, r0, r4)
            return r2
        L2b:
            r2 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Problems executing "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r3 = " Android statement: "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            java.sql.SQLException r2 = d1.c.e(r3, r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.a.b(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.Object[]):int");
    }

    public final void a() {
        Cursor cursor = this.f4732e;
        if (cursor != null) {
            try {
                cursor.close();
            } catch (SQLException e5) {
                throw d1.c.e("Problems closing Android cursor", e5);
            }
        }
        this.f4735h = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.lang.Object>] */
    public final Object[] c() {
        ?? r02 = this.f4733f;
        return r02 == 0 ? f4726j : r02.toArray(new Object[r02.size()]);
    }

    public final int d() {
        if (androidx.appcompat.widget.a.a(this.f4730c)) {
            return b(this.f4729b, "runExecute", this.f4728a, c());
        }
        StringBuilder g5 = androidx.activity.d.g("Cannot call execute on a ");
        g5.append(androidx.appcompat.widget.a.o(this.f4730c));
        g5.append(" statement");
        throw new IllegalArgumentException(g5.toString());
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List<java.lang.Object>] */
    public final c3.e e() {
        String str;
        if (!androidx.appcompat.widget.a.b(this.f4730c)) {
            StringBuilder g5 = androidx.activity.d.g("Cannot call query on a ");
            g5.append(androidx.appcompat.widget.a.o(this.f4730c));
            g5.append(" statement");
            throw new IllegalArgumentException(g5.toString());
        }
        String str2 = null;
        if (this.f4732e == null) {
            try {
                if (this.f4734g == null) {
                    str = this.f4728a;
                } else {
                    str = this.f4728a + " " + this.f4734g;
                }
                try {
                    if (this.f4731d) {
                        Objects.requireNonNull(f4727k);
                        this.f4735h = new b.a();
                    }
                    s2.b bVar = f4727k;
                    SQLiteDatabase sQLiteDatabase = this.f4729b;
                    ?? r5 = this.f4733f;
                    String[] strArr = r5 == 0 ? f4726j : (String[]) r5.toArray(new String[r5.size()]);
                    b.a aVar = this.f4735h;
                    Objects.requireNonNull(bVar);
                    Cursor rawQuery = aVar == null ? sQLiteDatabase.rawQuery(str, strArr) : sQLiteDatabase.rawQuery(str, strArr, aVar.f5137a);
                    this.f4732e = rawQuery;
                    rawQuery.moveToFirst();
                    f4725i.h("{}: started rawQuery cursor for: {}", this, str);
                } catch (SQLException e5) {
                    e = e5;
                    str2 = str;
                    throw d1.c.e("Problems executing Android query: " + str2, e);
                }
            } catch (SQLException e6) {
                e = e6;
            }
        }
        return new d(this.f4732e, null);
    }

    public final int f() {
        String str;
        if (!androidx.appcompat.widget.a.d(this.f4730c)) {
            StringBuilder g5 = androidx.activity.d.g("Cannot call update on a ");
            g5.append(androidx.appcompat.widget.a.o(this.f4730c));
            g5.append(" statement");
            throw new IllegalArgumentException(g5.toString());
        }
        if (this.f4734g == null) {
            str = this.f4728a;
        } else {
            str = this.f4728a + " " + this.f4734g;
        }
        return b(this.f4729b, "runUpdate", str, c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList, java.util.List<java.lang.Object>] */
    public final void g(int i5, Object obj, int i6) {
        ArrayList arrayList;
        if (this.f4732e != null) {
            throw new java.sql.SQLException("Query already run. Cannot add argument values.");
        }
        if (this.f4733f == null) {
            this.f4733f = new ArrayList();
        }
        if (obj == null) {
            this.f4733f.add(i5, null);
            return;
        }
        if (i6 == 0) {
            throw null;
        }
        switch (i6 - 1) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                List<Object> list = this.f4733f;
                obj = obj.toString();
                arrayList = list;
                break;
            case 6:
            case 12:
                arrayList = this.f4733f;
                break;
            case 13:
            case 14:
                StringBuilder g5 = androidx.activity.d.g("Invalid Android type: ");
                g5.append(androidx.appcompat.view.a.j(i6));
                throw new java.sql.SQLException(g5.toString());
            default:
                StringBuilder g6 = androidx.activity.d.g("Unknown sql argument type: ");
                g6.append(androidx.appcompat.view.a.j(i6));
                throw new java.sql.SQLException(g6.toString());
        }
        arrayList.add(i5, obj);
    }

    public final String toString() {
        return a.class.getSimpleName() + "@" + Integer.toHexString(hashCode());
    }
}
