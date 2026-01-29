package androidx.sqlite.db;

import android.annotation.SuppressLint;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class SimpleSQLiteQuery implements SupportSQLiteQuery {
    public static final Companion Companion = new Companion(null);
    private final Object[] bindArgs;
    private final String query;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void bind(SupportSQLiteProgram supportSQLiteProgram, int i5, Object obj) {
            long j5;
            int byteValue;
            double doubleValue;
            if (obj == null) {
                supportSQLiteProgram.bindNull(i5);
                return;
            }
            if (obj instanceof byte[]) {
                supportSQLiteProgram.bindBlob(i5, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                doubleValue = ((Number) obj).floatValue();
            } else {
                if (!(obj instanceof Double)) {
                    if (obj instanceof Long) {
                        j5 = ((Number) obj).longValue();
                    } else {
                        if (obj instanceof Integer) {
                            byteValue = ((Number) obj).intValue();
                        } else if (obj instanceof Short) {
                            byteValue = ((Number) obj).shortValue();
                        } else if (obj instanceof Byte) {
                            byteValue = ((Number) obj).byteValue();
                        } else {
                            if (obj instanceof String) {
                                supportSQLiteProgram.bindString(i5, (String) obj);
                                return;
                            }
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i5 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                            }
                            j5 = ((Boolean) obj).booleanValue() ? 1L : 0L;
                        }
                        j5 = byteValue;
                    }
                    supportSQLiteProgram.bindLong(i5, j5);
                    return;
                }
                doubleValue = ((Number) obj).doubleValue();
            }
            supportSQLiteProgram.bindDouble(i5, doubleValue);
        }

        @JvmStatic
        @SuppressLint({"SyntheticAccessor"})
        public final void bind(SupportSQLiteProgram statement, Object[] objArr) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i5 = 0;
            while (i5 < length) {
                Object obj = objArr[i5];
                i5++;
                bind(statement, i5, obj);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleSQLiteQuery(String query) {
        this(query, null);
        Intrinsics.checkNotNullParameter(query, "query");
    }

    public SimpleSQLiteQuery(String query, Object[] objArr) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.query = query;
        this.bindArgs = objArr;
    }

    @JvmStatic
    @SuppressLint({"SyntheticAccessor"})
    public static final void bind(SupportSQLiteProgram supportSQLiteProgram, Object[] objArr) {
        Companion.bind(supportSQLiteProgram, objArr);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(SupportSQLiteProgram statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        Companion.bind(statement, this.bindArgs);
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
        Object[] objArr = this.bindArgs;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public String getSql() {
        return this.query;
    }
}
