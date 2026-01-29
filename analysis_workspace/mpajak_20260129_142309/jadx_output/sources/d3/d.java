package d3;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import t2.h;
import v2.g;
import x2.b;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static x2.c f2502a = x2.d.a(d.class);

    /* renamed from: b, reason: collision with root package name */
    public static final g[] f2503b = new g[0];

    public static void a(u2.c cVar, c cVar2, List list, boolean z4) {
        HashMap hashMap = new HashMap();
        for (g gVar : cVar2.f2496d) {
            String k5 = z4 ? gVar.k() : gVar.h();
            if (k5 != null) {
                List list2 = (List) hashMap.get(k5);
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(k5, list2);
                }
                list2.add(gVar.f5680d);
            }
        }
        StringBuilder sb = new StringBuilder(128);
        for (Map.Entry entry : hashMap.entrySet()) {
            f2502a.e("creating index '{}' for table '{}", entry.getKey(), cVar2.f2495c);
            sb.append("CREATE ");
            if (z4) {
                sb.append("UNIQUE ");
            }
            sb.append("INDEX ");
            sb.append("IF NOT EXISTS ");
            u2.a aVar = (u2.a) cVar;
            aVar.a(sb, (String) entry.getKey());
            sb.append(" ON ");
            aVar.a(sb, cVar2.f2495c);
            sb.append(" ( ");
            boolean z5 = true;
            for (String str : (List) entry.getValue()) {
                if (z5) {
                    z5 = false;
                } else {
                    sb.append(", ");
                }
                aVar.a(sb, str);
            }
            sb.append(" )");
            list.add(sb.toString());
            sb.setLength(0);
        }
    }

    public static <T> int b(c3.c cVar, Class<T> cls) {
        t2.g a5 = h.a(cVar, cls);
        return a5 instanceof t2.a ? c(cVar, ((t2.a) a5).f5428g) : c(cVar, new c(cVar, null, cls));
    }

    public static int c(c3.c cVar, c cVar2) {
        ArrayList arrayList;
        g[] gVarArr;
        int i5;
        boolean z4;
        q2.b bVar = (q2.b) cVar;
        u2.d dVar = bVar.f4739d;
        x2.c cVar3 = f2502a;
        String str = cVar2.f2495c;
        b.a aVar = b.a.INFO;
        Object obj = x2.c.f5926b;
        cVar3.f(aVar, null, "creating table '{}'", str, obj, obj, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        StringBuilder sb = new StringBuilder(256);
        sb.append("CREATE TABLE ");
        Objects.requireNonNull(dVar);
        sb.append("IF NOT EXISTS ");
        dVar.a(sb, cVar2.f2495c);
        sb.append(" (");
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        g[] gVarArr2 = cVar2.f2496d;
        int length = gVarArr2.length;
        int i6 = 0;
        boolean z5 = true;
        while (i6 < length) {
            g gVar = gVarArr2[i6];
            if (gVar.f5681e.F) {
                arrayList = arrayList3;
                gVarArr = gVarArr2;
                i5 = length;
            } else {
                if (z5) {
                    z5 = false;
                } else {
                    sb.append(", ");
                }
                String str2 = gVar.f5681e.A;
                if (str2 == null) {
                    dVar.a(sb, gVar.f5680d);
                    sb.append(' ');
                    v2.a aVar2 = gVar.f5688l;
                    if (gVar.f5681e.f5655f == 0) {
                        aVar2.n();
                    }
                    gVarArr = gVarArr2;
                    i5 = length;
                    z4 = z5;
                    arrayList = arrayList3;
                    switch (f.h.a(aVar2.s())) {
                        case 0:
                            sb.append("VARCHAR");
                            break;
                        case 1:
                            sb.append("TEXT");
                            break;
                        case 2:
                            sb.append("VARCHAR");
                            break;
                        case 3:
                            sb.append("SMALLINT");
                            break;
                        case 4:
                            sb.append("CHAR");
                            break;
                        case 5:
                            sb.append("TINYINT");
                            break;
                        case 6:
                            sb.append("BLOB");
                            break;
                        case 7:
                            sb.append("SMALLINT");
                            break;
                        case 8:
                            sb.append("INTEGER");
                            break;
                        case 9:
                            sb.append((gVar.i() == 10 && gVar.f5683g) ? "INTEGER" : "BIGINT");
                            break;
                        case 10:
                            sb.append("FLOAT");
                            break;
                        case 11:
                            sb.append("DOUBLE PRECISION");
                            break;
                        case 12:
                            sb.append("BLOB");
                            break;
                        case 13:
                        default:
                            StringBuilder g5 = androidx.activity.d.g("Unknown SQL-type ");
                            g5.append(androidx.appcompat.view.a.j(aVar2.s()));
                            throw new IllegalArgumentException(g5.toString());
                        case 14:
                            sb.append("NUMERIC");
                            break;
                    }
                    sb.append(' ');
                    if (gVar.m() && !gVar.n()) {
                        throw new SQLException("GeneratedIdSequence is not supported by database Android SQLite for field " + gVar);
                    }
                    if (gVar.f5683g && !gVar.n()) {
                        if (gVar.i() != 9 && gVar.i() != 10) {
                            throw new IllegalArgumentException("Sqlite requires that auto-increment generated-id be integer or long type");
                        }
                        sb.append("PRIMARY KEY AUTOINCREMENT ");
                    }
                    if (!gVar.f5683g) {
                        Object obj2 = gVar.f5689m;
                        if (obj2 != null) {
                            sb.append("DEFAULT ");
                            if (gVar.f5688l.i()) {
                                String obj3 = obj2.toString();
                                sb.append('\'');
                                sb.append(obj3);
                                sb.append('\'');
                            } else {
                                sb.append(obj2);
                            }
                            sb.append(' ');
                        }
                        if (!gVar.f5681e.f5656g) {
                            sb.append("NOT NULL ");
                        }
                        if (gVar.f5681e.f5666q) {
                            StringBuilder g6 = androidx.activity.d.g(" UNIQUE (");
                            dVar.a(g6, gVar.f5680d);
                            g6.append(")");
                            arrayList4.add(g6.toString());
                        }
                    }
                } else {
                    arrayList = arrayList3;
                    gVarArr = gVarArr2;
                    i5 = length;
                    z4 = z5;
                    dVar.a(sb, gVar.f5680d);
                    sb.append(' ');
                    sb.append(str2);
                    sb.append(' ');
                }
                z5 = z4;
            }
            i6++;
            gVarArr2 = gVarArr;
            length = i5;
            arrayList3 = arrayList;
        }
        ArrayList arrayList7 = arrayList3;
        StringBuilder sb2 = null;
        for (g gVar2 : cVar2.f2496d) {
            if ((!gVar2.f5683g || gVar2.n()) && gVar2.f5682f) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(48);
                    sb2.append("PRIMARY KEY (");
                } else {
                    sb2.append(',');
                }
                dVar.a(sb2, gVar2.f5680d);
            }
        }
        if (sb2 != null) {
            sb2.append(") ");
            arrayList4.add(sb2.toString());
        }
        StringBuilder sb3 = null;
        for (g gVar3 : cVar2.f2496d) {
            if (gVar3.f5681e.f5667r) {
                if (sb3 == null) {
                    sb3 = new StringBuilder(48);
                    sb3.append("UNIQUE (");
                } else {
                    sb3.append(',');
                }
                dVar.a(sb3, gVar3.f5680d);
            }
        }
        if (sb3 != null) {
            sb3.append(") ");
            arrayList4.add(sb3.toString());
        }
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            sb.append(", ");
            sb.append(str3);
        }
        sb.append(") ");
        arrayList2.addAll(arrayList5);
        arrayList2.add(sb.toString());
        arrayList2.addAll(arrayList6);
        a(dVar, cVar2, arrayList2, false);
        a(dVar, cVar2, arrayList2, true);
        c3.d c5 = bVar.c();
        Objects.requireNonNull(dVar);
        return f(c5, "create", arrayList2) + d(c5, arrayList7);
    }

    public static int d(c3.d dVar, List list) {
        Iterator it = list.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            c3.b bVar = null;
            try {
                try {
                    bVar = ((q2.c) dVar).b(str, 1);
                    q2.a aVar = (q2.a) bVar;
                    q2.d dVar2 = (q2.d) aVar.e();
                    int i6 = 0;
                    for (boolean b5 = dVar2.b(); b5; b5 = dVar2.g()) {
                        i6++;
                    }
                    f2502a.e("executing create table after-query got {} results: {}", Integer.valueOf(i6), str);
                    aVar.a();
                    i5++;
                } catch (SQLException e5) {
                    throw d1.c.e("executing create table after-query failed: " + str, e5);
                }
            } catch (Throwable th) {
                if (bVar != null) {
                    ((q2.a) bVar).a();
                }
                throw th;
            }
        }
        return i5;
    }

    public static int e(u2.c cVar, c3.c cVar2, c cVar3) {
        x2.c cVar4 = f2502a;
        String str = cVar3.f2495c;
        b.a aVar = b.a.INFO;
        Object obj = x2.c.f5926b;
        cVar4.f(aVar, null, "dropping table '{}'", str, obj, obj, null);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (g gVar : cVar3.f2496d) {
            String h5 = gVar.h();
            if (h5 != null) {
                hashSet.add(h5);
            }
            String k5 = gVar.k();
            if (k5 != null) {
                hashSet.add(k5);
            }
        }
        StringBuilder sb = new StringBuilder(48);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            f2502a.e("dropping index '{}' for table '{}", str2, cVar3.f2495c);
            sb.append("DROP INDEX ");
            ((u2.a) cVar).a(sb, str2);
            arrayList.add(sb.toString());
            sb.setLength(0);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (g gVar2 : cVar3.f2496d) {
            Objects.requireNonNull(cVar);
        }
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("DROP TABLE ");
        ((u2.a) cVar).a(sb2, cVar3.f2495c);
        sb2.append(' ');
        arrayList.addAll(arrayList2);
        arrayList.add(sb2.toString());
        arrayList.addAll(arrayList3);
        c3.d c5 = ((q2.b) cVar2).c();
        Objects.requireNonNull(cVar);
        return f(c5, "drop", arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int f(c3.d r15, java.lang.String r16, java.util.Collection r17) {
        /*
            x2.b$a r0 = x2.b.a.INFO
            java.util.Iterator r9 = r17.iterator()
            r1 = 0
            r10 = 0
        L8:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r9.next()
            r11 = r1
            java.lang.String r11 = (java.lang.String) r11
            r1 = 0
            r2 = 6
            r3 = r15
            q2.c r3 = (q2.c) r3     // Catch: java.lang.Throwable -> L6a java.sql.SQLException -> L6c
            c3.b r12 = r3.b(r11, r2)     // Catch: java.lang.Throwable -> L6a java.sql.SQLException -> L6c
            r13 = r12
            q2.a r13 = (q2.a) r13     // Catch: java.lang.Throwable -> L64 java.sql.SQLException -> L67
            int r14 = r13.d()     // Catch: java.lang.Throwable -> L64 java.sql.SQLException -> L67
            x2.c r1 = d3.d.f2502a     // Catch: java.sql.SQLException -> L62 java.lang.Throwable -> L64
            java.lang.String r4 = "executed {} table statement changed {} rows: {}"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)     // Catch: java.sql.SQLException -> L62 java.lang.Throwable -> L64
            r3 = 0
            r8 = 0
            r2 = r0
            r5 = r16
            r7 = r11
            r1.f(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.sql.SQLException -> L62 java.lang.Throwable -> L64
            r13.a()
            if (r14 < 0) goto L3e
            int r10 = r10 + 1
            goto L8
        L3e:
            java.sql.SQLException r0 = new java.sql.SQLException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SQL statement "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = " updated "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " rows, we were expecting >= 0"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L62:
            r0 = move-exception
            goto L6e
        L64:
            r0 = move-exception
            r1 = r12
            goto L84
        L67:
            r0 = move-exception
            r1 = r12
            goto L6d
        L6a:
            r0 = move-exception
            goto L84
        L6c:
            r0 = move-exception
        L6d:
            r12 = r1
        L6e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r1.<init>()     // Catch: java.lang.Throwable -> L64
            java.lang.String r2 = "SQL statement failed: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L64
            r1.append(r11)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L64
            java.sql.SQLException r0 = d1.c.e(r1, r0)     // Catch: java.lang.Throwable -> L64
            throw r0     // Catch: java.lang.Throwable -> L64
        L84:
            if (r1 == 0) goto L8b
            q2.a r1 = (q2.a) r1
            r1.a()
        L8b:
            throw r0
        L8c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.d.f(c3.d, java.lang.String, java.util.Collection):int");
    }

    public static int g(c3.c cVar, Class cls) {
        u2.d dVar = ((q2.b) cVar).f4739d;
        t2.g a5 = h.a(cVar, cls);
        return a5 instanceof t2.a ? e(dVar, cVar, ((t2.a) a5).f5428g) : e(dVar, cVar, new c(cVar, null, cls));
    }
}
