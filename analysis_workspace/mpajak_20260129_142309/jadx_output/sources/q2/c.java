package q2;

import a3.c;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import c3.f;
import f.h;
import java.sql.SQLException;
import v2.g;

/* loaded from: classes14.dex */
public final class c implements c3.d {

    /* renamed from: d, reason: collision with root package name */
    public static x2.c f4740d = x2.d.a(c.class);

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteDatabase f4741b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4742c = false;

    public c(SQLiteDatabase sQLiteDatabase) {
        this.f4741b = sQLiteDatabase;
        f4740d.i("{}: db {} opened, read-write = {}", this, sQLiteDatabase, Boolean.TRUE);
    }

    public final void a(SQLiteStatement sQLiteStatement, Object[] objArr, g[] gVarArr) {
        for (int i5 = 0; i5 < objArr.length; i5++) {
            Object obj = objArr[i5];
            if (obj == null) {
                sQLiteStatement.bindNull(i5 + 1);
            } else {
                int i6 = gVarArr[i5].i();
                switch (h.a(i6)) {
                    case 0:
                    case 1:
                    case 4:
                        sQLiteStatement.bindString(i5 + 1, obj.toString());
                        break;
                    case 2:
                    case 13:
                    case 14:
                        StringBuilder g5 = androidx.activity.d.g("Invalid Android type: ");
                        g5.append(androidx.appcompat.view.a.j(i6));
                        throw new SQLException(g5.toString());
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                        sQLiteStatement.bindLong(i5 + 1, ((Number) obj).longValue());
                        break;
                    case 6:
                    case 12:
                        sQLiteStatement.bindBlob(i5 + 1, (byte[]) obj);
                        break;
                    case 10:
                    case 11:
                        sQLiteStatement.bindDouble(i5 + 1, ((Number) obj).doubleValue());
                        break;
                    default:
                        StringBuilder g6 = androidx.activity.d.g("Unknown sql argument type: ");
                        g6.append(androidx.appcompat.view.a.j(i6));
                        throw new SQLException(g6.toString());
                }
            }
        }
    }

    public final c3.b b(String str, int i5) {
        a aVar = new a(str, this.f4741b, i5, this.f4742c);
        f4740d.i("{}: compiled statement got {}: {}", this, aVar, str);
        return aVar;
    }

    public final void c(String str, Object[] objArr, g[] gVarArr, f fVar) {
        SQLiteStatement sQLiteStatement = null;
        try {
            try {
                sQLiteStatement = this.f4741b.compileStatement(str);
                a(sQLiteStatement, objArr, gVarArr);
                long executeInsert = sQLiteStatement.executeInsert();
                if (fVar != null) {
                    ((c.a) fVar).a(Long.valueOf(executeInsert));
                }
                f4740d.i("{}: insert statement is compiled and executed, changed {}: {}", this, 1, str);
                sQLiteStatement.close();
            } catch (android.database.SQLException e5) {
                throw d1.c.e("inserting to database failed: " + str, e5);
            }
        } catch (Throwable th) {
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
            throw th;
        }
    }

    public final long d(String str) {
        SQLiteStatement sQLiteStatement = null;
        try {
            try {
                sQLiteStatement = this.f4741b.compileStatement(str);
                long simpleQueryForLong = sQLiteStatement.simpleQueryForLong();
                f4740d.i("{}: query for long simple query returned {}: {}", this, Long.valueOf(simpleQueryForLong), str);
                sQLiteStatement.close();
                return simpleQueryForLong;
            } catch (android.database.SQLException e5) {
                throw d1.c.e("queryForLong from database failed: " + str, e5);
            }
        } catch (Throwable th) {
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
            throw th;
        }
    }

    public final String[] e(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        String[] strArr = new String[objArr.length];
        for (int i5 = 0; i5 < objArr.length; i5++) {
            Object obj = objArr[i5];
            if (obj == null) {
                strArr[i5] = null;
            } else {
                strArr[i5] = obj.toString();
            }
        }
        return strArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r0 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.lang.String r3, java.lang.Object[] r4, v2.g[] r5, java.lang.String r6) {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.f4741b     // Catch: java.lang.Throwable -> L3e android.database.SQLException -> L40
            android.database.sqlite.SQLiteStatement r1 = r1.compileStatement(r3)     // Catch: java.lang.Throwable -> L3e android.database.SQLException -> L40
            r2.a(r1, r4, r5)     // Catch: java.lang.Throwable -> L39 android.database.SQLException -> L3b
            r1.execute()     // Catch: java.lang.Throwable -> L39 android.database.SQLException -> L3b
            r1.close()
            android.database.sqlite.SQLiteDatabase r4 = r2.f4741b     // Catch: android.database.SQLException -> L1e java.lang.Throwable -> L20
            java.lang.String r5 = "SELECT CHANGES()"
            android.database.sqlite.SQLiteStatement r0 = r4.compileStatement(r5)     // Catch: android.database.SQLException -> L1e java.lang.Throwable -> L20
            long r4 = r0.simpleQueryForLong()     // Catch: android.database.SQLException -> L1e java.lang.Throwable -> L20
            int r5 = (int) r4
            goto L2a
        L1e:
            goto L27
        L20:
            r3 = move-exception
            if (r0 == 0) goto L26
            r0.close()
        L26:
            throw r3
        L27:
            r5 = 1
            if (r0 == 0) goto L2d
        L2a:
            r0.close()
        L2d:
            x2.c r4 = q2.c.f4740d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.String r1 = "{} statement is compiled and executed, changed {}: {}"
            r4.i(r1, r6, r0, r3)
            return r5
        L39:
            r3 = move-exception
            goto L58
        L3b:
            r4 = move-exception
            r0 = r1
            goto L41
        L3e:
            r3 = move-exception
            goto L57
        L40:
            r4 = move-exception
        L41:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r5.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = "updating database failed: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L3e
            r5.append(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L3e
            java.sql.SQLException r3 = d1.c.e(r3, r4)     // Catch: java.lang.Throwable -> L3e
            throw r3     // Catch: java.lang.Throwable -> L3e
        L57:
            r1 = r0
        L58:
            if (r1 == 0) goto L5d
            r1.close()
        L5d:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.c.f(java.lang.String, java.lang.Object[], v2.g[], java.lang.String):int");
    }

    public final String toString() {
        return c.class.getSimpleName() + "@" + Integer.toHexString(hashCode());
    }
}
