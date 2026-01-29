package androidx.room;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class QueryInterceptorStatement implements SupportSQLiteStatement {
    private final List<Object> bindArgsCache;
    private final SupportSQLiteStatement delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final Executor queryCallbackExecutor;
    private final String sqlStatement;

    public QueryInterceptorStatement(SupportSQLiteStatement delegate, String sqlStatement, Executor queryCallbackExecutor, RoomDatabase.QueryCallback queryCallback) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(sqlStatement, "sqlStatement");
        Intrinsics.checkNotNullParameter(queryCallbackExecutor, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.sqlStatement = sqlStatement;
        this.queryCallbackExecutor = queryCallbackExecutor;
        this.queryCallback = queryCallback;
        this.bindArgsCache = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$0(QueryInterceptorStatement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeInsert$lambda$2(QueryInterceptorStatement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeUpdateDelete$lambda$1(QueryInterceptorStatement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    private final void saveArgsToCache(int i5, Object obj) {
        int i6 = i5 - 1;
        if (i6 >= this.bindArgsCache.size()) {
            int size = (i6 - this.bindArgsCache.size()) + 1;
            for (int i7 = 0; i7 < size; i7++) {
                this.bindArgsCache.add(null);
            }
        }
        this.bindArgsCache.set(i6, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void simpleQueryForLong$lambda$3(QueryInterceptorStatement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void simpleQueryForString$lambda$4(QueryInterceptorStatement this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.queryCallback.onQuery(this$0.sqlStatement, this$0.bindArgsCache);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i5, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        saveArgsToCache(i5, value);
        this.delegate.bindBlob(i5, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i5, double d5) {
        saveArgsToCache(i5, Double.valueOf(d5));
        this.delegate.bindDouble(i5, d5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i5, long j5) {
        saveArgsToCache(i5, Long.valueOf(j5));
        this.delegate.bindLong(i5, j5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i5) {
        Object[] array = this.bindArgsCache.toArray(new Object[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        saveArgsToCache(i5, Arrays.copyOf(array, array.length));
        this.delegate.bindNull(i5);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i5, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        saveArgsToCache(i5, value);
        this.delegate.bindString(i5, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.bindArgsCache.clear();
        this.delegate.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public void execute() {
        this.queryCallbackExecutor.execute(new c(this, 1));
        this.delegate.execute();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long executeInsert() {
        this.queryCallbackExecutor.execute(new androidx.appcompat.widget.b(this, 5));
        return this.delegate.executeInsert();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        this.queryCallbackExecutor.execute(new b(this, 2));
        return this.delegate.executeUpdateDelete();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        this.queryCallbackExecutor.execute(new androidx.activity.c(this, 3));
        return this.delegate.simpleQueryForLong();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public String simpleQueryForString() {
        this.queryCallbackExecutor.execute(new androidx.core.widget.a(this, 1));
        return this.delegate.simpleQueryForString();
    }
}
