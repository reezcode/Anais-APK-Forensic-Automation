package androidx.sqlite.db;

import androidx.activity.d;
import java.util.regex.Pattern;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class SupportSQLiteQueryBuilder {
    public static final Companion Companion = new Companion(null);
    private static final Pattern limitPattern = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    private Object[] bindArgs;
    private String[] columns;
    private boolean distinct;
    private String groupBy;
    private String having;
    private String limit;
    private String orderBy;
    private String selection;
    private final String table;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final SupportSQLiteQueryBuilder builder(String tableName) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            return new SupportSQLiteQueryBuilder(tableName, null);
        }
    }

    private SupportSQLiteQueryBuilder(String str) {
        this.table = str;
    }

    public /* synthetic */ SupportSQLiteQueryBuilder(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private final void appendClause(StringBuilder sb, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        sb.append(str);
        sb.append(str2);
    }

    private final void appendColumns(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            String str = strArr[i5];
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(' ');
    }

    @JvmStatic
    public static final SupportSQLiteQueryBuilder builder(String str) {
        return Companion.builder(str);
    }

    public final SupportSQLiteQueryBuilder columns(String[] strArr) {
        this.columns = strArr;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if ((r0.length == 0) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.sqlite.db.SupportSQLiteQuery create() {
        /*
            r5 = this;
            java.lang.String r0 = r5.groupBy
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lf
            int r0 = r0.length()
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            if (r0 == 0) goto L25
            java.lang.String r0 = r5.having
            if (r0 == 0) goto L1f
            int r0 = r0.length()
            if (r0 != 0) goto L1d
            goto L1f
        L1d:
            r0 = 0
            goto L20
        L1f:
            r0 = 1
        L20:
            if (r0 == 0) goto L23
            goto L25
        L23:
            r0 = 0
            goto L26
        L25:
            r0 = 1
        L26:
            if (r0 == 0) goto L96
            r0 = 120(0x78, float:1.68E-43)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = "SELECT "
            r3.append(r0)
            boolean r0 = r5.distinct
            if (r0 == 0) goto L3d
            java.lang.String r0 = "DISTINCT "
            r3.append(r0)
        L3d:
            java.lang.String[] r0 = r5.columns
            if (r0 == 0) goto L49
            int r4 = r0.length
            if (r4 != 0) goto L46
            r4 = 1
            goto L47
        L46:
            r4 = 0
        L47:
            if (r4 == 0) goto L4a
        L49:
            r1 = 1
        L4a:
            if (r1 != 0) goto L53
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r5.appendColumns(r3, r0)
            goto L58
        L53:
            java.lang.String r0 = "* "
            r3.append(r0)
        L58:
            java.lang.String r0 = "FROM "
            r3.append(r0)
            java.lang.String r0 = r5.table
            r3.append(r0)
            java.lang.String r0 = r5.selection
            java.lang.String r1 = " WHERE "
            r5.appendClause(r3, r1, r0)
            java.lang.String r0 = r5.groupBy
            java.lang.String r1 = " GROUP BY "
            r5.appendClause(r3, r1, r0)
            java.lang.String r0 = r5.having
            java.lang.String r1 = " HAVING "
            r5.appendClause(r3, r1, r0)
            java.lang.String r0 = r5.orderBy
            java.lang.String r1 = " ORDER BY "
            r5.appendClause(r3, r1, r0)
            java.lang.String r0 = r5.limit
            java.lang.String r1 = " LIMIT "
            r5.appendClause(r3, r1, r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            androidx.sqlite.db.SimpleSQLiteQuery r1 = new androidx.sqlite.db.SimpleSQLiteQuery
            java.lang.Object[] r2 = r5.bindArgs
            r1.<init>(r0, r2)
            return r1
        L96:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "HAVING clauses are only permitted when using a groupBy clause"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.db.SupportSQLiteQueryBuilder.create():androidx.sqlite.db.SupportSQLiteQuery");
    }

    public final SupportSQLiteQueryBuilder distinct() {
        this.distinct = true;
        return this;
    }

    public final SupportSQLiteQueryBuilder groupBy(String str) {
        this.groupBy = str;
        return this;
    }

    public final SupportSQLiteQueryBuilder having(String str) {
        this.having = str;
        return this;
    }

    public final SupportSQLiteQueryBuilder limit(String limit) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        boolean matches = limitPattern.matcher(limit).matches();
        boolean z4 = true;
        if (!(limit.length() == 0) && !matches) {
            z4 = false;
        }
        if (!z4) {
            throw new IllegalArgumentException(d.f("invalid LIMIT clauses:", limit).toString());
        }
        this.limit = limit;
        return this;
    }

    public final SupportSQLiteQueryBuilder orderBy(String str) {
        this.orderBy = str;
        return this;
    }

    public final SupportSQLiteQueryBuilder selection(String str, Object[] objArr) {
        this.selection = str;
        this.bindArgs = objArr;
        return this;
    }
}
