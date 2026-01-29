package androidx.room;

import androidx.sqlite.db.SupportSQLiteProgram;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class QueryInterceptorProgram implements SupportSQLiteProgram {
    private final List<Object> bindArgsCache = new ArrayList();

    private final void saveArgsToCache(int i5, Object obj) {
        int size;
        int i6 = i5 - 1;
        if (i6 >= this.bindArgsCache.size() && (size = this.bindArgsCache.size()) <= i6) {
            while (true) {
                this.bindArgsCache.add(null);
                if (size == i6) {
                    break;
                } else {
                    size++;
                }
            }
        }
        this.bindArgsCache.set(i6, obj);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i5, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        saveArgsToCache(i5, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i5, double d5) {
        saveArgsToCache(i5, Double.valueOf(d5));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i5, long j5) {
        saveArgsToCache(i5, Long.valueOf(j5));
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i5) {
        saveArgsToCache(i5, null);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i5, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        saveArgsToCache(i5, value);
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        this.bindArgsCache.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final List<Object> getBindArgsCache$room_runtime_release() {
        return this.bindArgsCache;
    }
}
