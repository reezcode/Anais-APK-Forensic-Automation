package z2;

import android.database.Cursor;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes23.dex */
public final class l<T, ID> implements d<String[]> {

    /* renamed from: k, reason: collision with root package name */
    public static x2.c f6147k = x2.d.a(l.class);

    /* renamed from: a, reason: collision with root package name */
    public final u2.c f6148a;

    /* renamed from: b, reason: collision with root package name */
    public final d3.c<T, ID> f6149b;

    /* renamed from: c, reason: collision with root package name */
    public final t2.g<T, ID> f6150c;

    /* renamed from: d, reason: collision with root package name */
    public a3.f<T, ID> f6151d;

    /* renamed from: e, reason: collision with root package name */
    public f<T> f6152e;

    /* renamed from: f, reason: collision with root package name */
    public a3.c<T, ID> f6153f;

    /* renamed from: g, reason: collision with root package name */
    public a3.g<T, ID> f6154g;

    /* renamed from: h, reason: collision with root package name */
    public a3.d<T, ID> f6155h;

    /* renamed from: i, reason: collision with root package name */
    public String f6156i;

    /* renamed from: j, reason: collision with root package name */
    public String f6157j;

    public l(u2.c cVar, d3.c<T, ID> cVar2, t2.g<T, ID> gVar) {
        this.f6148a = cVar;
        this.f6149b = cVar2;
        this.f6150c = gVar;
    }

    @Override // z2.d
    public final String[] a(c3.e eVar) {
        q2.d dVar = (q2.d) eVar;
        int columnCount = dVar.f4744a.getColumnCount();
        String[] strArr = new String[columnCount];
        for (int i5 = 0; i5 < columnCount; i5++) {
            strArr[i5] = dVar.e(i5);
        }
        return strArr;
    }

    public final j b(t2.a aVar, c3.c cVar, g gVar) {
        c3.d c5 = ((q2.b) cVar).c();
        c3.b bVar = null;
        try {
            a3.e eVar = (a3.e) gVar;
            c3.b f5 = eVar.f(c5, 1);
            try {
                return new j(this.f6149b.f2494b, aVar, eVar, cVar, c5, f5, eVar.f72d);
            } catch (Throwable th) {
                th = th;
                bVar = f5;
                if (bVar != null) {
                    ((q2.a) bVar).a();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Incorrect return type in method signature: (Lc3/d;TT;Lt2/m;)I */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0180 A[Catch: SQLException -> 0x01cf, TryCatch #0 {SQLException -> 0x01cf, blocks: (B:72:0x010c, B:74:0x0112, B:76:0x0118, B:80:0x0138, B:81:0x0121, B:83:0x0127, B:85:0x0133, B:90:0x013b, B:92:0x0143, B:94:0x0147, B:97:0x0155, B:100:0x016a, B:102:0x0180, B:104:0x0187, B:106:0x0192, B:108:0x0196, B:110:0x01a0, B:113:0x01a6, B:114:0x01ad, B:115:0x01ae, B:116:0x01b5, B:120:0x01b8, B:122:0x01c9, B:123:0x01ce, B:124:0x0151, B:99:0x015f), top: B:71:0x010c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0187 A[Catch: SQLException -> 0x01cf, TryCatch #0 {SQLException -> 0x01cf, blocks: (B:72:0x010c, B:74:0x0112, B:76:0x0118, B:80:0x0138, B:81:0x0121, B:83:0x0127, B:85:0x0133, B:90:0x013b, B:92:0x0143, B:94:0x0147, B:97:0x0155, B:100:0x016a, B:102:0x0180, B:104:0x0187, B:106:0x0192, B:108:0x0196, B:110:0x01a0, B:113:0x01a6, B:114:0x01ad, B:115:0x01ae, B:116:0x01b5, B:120:0x01b8, B:122:0x01c9, B:123:0x01ce, B:124:0x0151, B:99:0x015f), top: B:71:0x010c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0192 A[Catch: SQLException -> 0x01cf, TryCatch #0 {SQLException -> 0x01cf, blocks: (B:72:0x010c, B:74:0x0112, B:76:0x0118, B:80:0x0138, B:81:0x0121, B:83:0x0127, B:85:0x0133, B:90:0x013b, B:92:0x0143, B:94:0x0147, B:97:0x0155, B:100:0x016a, B:102:0x0180, B:104:0x0187, B:106:0x0192, B:108:0x0196, B:110:0x01a0, B:113:0x01a6, B:114:0x01ad, B:115:0x01ae, B:116:0x01b5, B:120:0x01b8, B:122:0x01c9, B:123:0x01ce, B:124:0x0151, B:99:0x015f), top: B:71:0x010c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0112 A[Catch: SQLException -> 0x01cf, TryCatch #0 {SQLException -> 0x01cf, blocks: (B:72:0x010c, B:74:0x0112, B:76:0x0118, B:80:0x0138, B:81:0x0121, B:83:0x0127, B:85:0x0133, B:90:0x013b, B:92:0x0143, B:94:0x0147, B:97:0x0155, B:100:0x016a, B:102:0x0180, B:104:0x0187, B:106:0x0192, B:108:0x0196, B:110:0x01a0, B:113:0x01a6, B:114:0x01ad, B:115:0x01ae, B:116:0x01b5, B:120:0x01b8, B:122:0x01c9, B:123:0x01ce, B:124:0x0151, B:99:0x015f), top: B:71:0x010c, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(c3.d r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.l.c(c3.d, java.lang.Object):void");
    }

    public final int d(c3.d dVar, T t4, t2.m mVar) {
        if (this.f6155h == null) {
            u2.c cVar = this.f6148a;
            d3.c<T, ID> cVar2 = this.f6149b;
            int i5 = a3.d.f78g;
            v2.g gVar = cVar2.f2498f;
            if (gVar == null) {
                StringBuilder g5 = androidx.activity.d.g("Cannot delete from ");
                g5.append(cVar2.f2494b);
                g5.append(" because it doesn't have an id field");
                throw new SQLException(g5.toString());
            }
            StringBuilder sb = new StringBuilder(64);
            a3.b.c(cVar, sb, "DELETE FROM ", cVar2.f2495c);
            a3.b.d(cVar, gVar, sb);
            this.f6155h = new a3.d<>(cVar2, sb.toString(), new v2.g[]{gVar});
        }
        a3.d<T, ID> dVar2 = this.f6155h;
        Objects.requireNonNull(dVar2);
        try {
            Object[] e5 = dVar2.e(t4);
            int f5 = ((q2.c) dVar).f(dVar2.f72d, e5, dVar2.f73e, "deleted");
            a3.b.f68f.d("delete data with statement '{}' and {} args, changed {} rows", dVar2.f72d, Integer.valueOf(e5.length), Integer.valueOf(f5));
            if (e5.length > 0) {
                a3.b.f68f.g("delete arguments: {}", e5);
            }
            return f5;
        } catch (SQLException e6) {
            throw d1.c.e("Unable to run delete stmt on object " + t4 + ": " + dVar2.f72d, e6);
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final boolean e(c3.d dVar, ID id) {
        if (this.f6157j == null) {
            h hVar = new h(this.f6148a, this.f6149b, this.f6150c);
            String[] strArr = {"COUNT(*)"};
            if (hVar.f6117j == null) {
                hVar.f6117j = new ArrayList();
            }
            for (int i5 = 0; i5 < 1; i5++) {
                hVar.f6117j.add(strArr[i5]);
            }
            hVar.g().c(this.f6149b.f2498f.f5680d, new i());
            this.f6157j = hVar.d(new ArrayList());
            v2.g gVar = this.f6149b.f2498f;
        }
        String str = this.f6157j;
        Object[] objArr = {id};
        q2.c cVar = (q2.c) dVar;
        Objects.requireNonNull(cVar);
        Cursor cursor = null;
        try {
            try {
                cursor = cVar.f4741b.rawQuery(str, cVar.e(objArr));
                String[] columnNames = cursor.getColumnNames();
                if (columnNames.length >= 8) {
                    HashMap hashMap = new HashMap();
                    for (int i6 = 0; i6 < columnNames.length; i6++) {
                        hashMap.put(columnNames[i6], Integer.valueOf(i6));
                    }
                }
                long j5 = cursor.moveToFirst() ? cursor.getLong(0) : 0L;
                q2.c.f4740d.i("{}: query for long raw query returned {}: {}", cVar, Long.valueOf(j5), str);
                cursor.close();
                f6147k.c("query of '{}' returned {}", this.f6157j, Long.valueOf(j5));
                return j5 != 0;
            } catch (android.database.SQLException e5) {
                throw d1.c.e("queryForLong from database failed: " + str, e5);
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long f(c3.d dVar) {
        if (this.f6156i == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("SELECT COUNT(*) FROM ");
            ((u2.a) this.f6148a).a(sb, this.f6149b.f2495c);
            this.f6156i = sb.toString();
        }
        long d5 = ((q2.c) dVar).d(this.f6156i);
        f6147k.c("query of '{}' returned {}", this.f6156i, Long.valueOf(d5));
        return d5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(c3.d dVar, g gVar) {
        c3.b f5 = ((a3.e) gVar).f(dVar, 1);
        c3.e eVar = null;
        try {
            c3.e e5 = ((q2.a) f5).e();
            try {
                q2.d dVar2 = (q2.d) e5;
                if (!dVar2.b()) {
                    f6147k.b("query-for-first of '{}' returned at 0 results", ((a3.e) gVar).f72d);
                    dVar2.a();
                    ((q2.a) f5).a();
                    return null;
                }
                f6147k.b("query-for-first of '{}' returned at least 1 result", ((a3.e) gVar).f72d);
                Object a5 = ((a3.a) gVar).a(e5);
                dVar2.a();
                ((q2.a) f5).a();
                return a5;
            } catch (Throwable th) {
                th = th;
                eVar = e5;
                if (eVar != null) {
                    ((q2.d) eVar).a();
                }
                ((q2.a) f5).a();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final long h(c3.d dVar, g<T> gVar) {
        c3.b f5 = ((a3.e) gVar).f(dVar, 2);
        try {
            q2.d dVar2 = (q2.d) ((q2.a) f5).e();
            if (dVar2.b()) {
                long d5 = dVar2.d(0);
                dVar2.a();
                ((q2.a) f5).a();
                return d5;
            }
            throw new SQLException("No result found in queryForLong: " + ((a3.e) gVar).f72d);
        } catch (Throwable th) {
            if (0 != 0) {
                ((q2.d) null).a();
            }
            ((q2.a) f5).a();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0092 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(c3.d r18, T r19, t2.m r20) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.l.i(c3.d, java.lang.Object, t2.m):int");
    }
}
