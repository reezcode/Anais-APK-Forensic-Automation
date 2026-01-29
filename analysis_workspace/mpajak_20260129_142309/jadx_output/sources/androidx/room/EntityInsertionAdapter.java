package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes20.dex */
public abstract class EntityInsertionAdapter<T> extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityInsertionAdapter(RoomDatabase database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    public abstract void bind(SupportSQLiteStatement supportSQLiteStatement, T t4);

    public final void insert(Iterable<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                acquire.executeInsert();
            }
        } finally {
            release(acquire);
        }
    }

    public final void insert(T t4) {
        SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, t4);
            acquire.executeInsert();
        } finally {
            release(acquire);
        }
    }

    public final void insert(T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            for (T t4 : entities) {
                bind(acquire, t4);
                acquire.executeInsert();
            }
        } finally {
            release(acquire);
        }
    }

    public final long insertAndReturnId(T t4) {
        SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, t4);
            return acquire.executeInsert();
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            long[] jArr = new long[entities.size()];
            int i5 = 0;
            for (T t4 : entities) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                bind(acquire, t4);
                jArr[i5] = acquire.executeInsert();
                i5 = i6;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            long[] jArr = new long[entities.length];
            int length = entities.length;
            int i5 = 0;
            int i6 = 0;
            while (i5 < length) {
                int i7 = i6 + 1;
                bind(acquire, entities[i5]);
                jArr[i6] = acquire.executeInsert();
                i5++;
                i6 = i7;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        Iterator<? extends T> it = entities.iterator();
        try {
            int size = entities.size();
            Long[] lArr = new Long[size];
            for (int i5 = 0; i5 < size; i5++) {
                bind(acquire, it.next());
                lArr[i5] = Long.valueOf(acquire.executeInsert());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long[] insertAndReturnIdsArrayBox(T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        Iterator it = ArrayIteratorKt.iterator(entities);
        try {
            int length = entities.length;
            Long[] lArr = new Long[length];
            for (int i5 = 0; i5 < length; i5++) {
                bind(acquire, it.next());
                lArr[i5] = Long.valueOf(acquire.executeInsert());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            List createListBuilder = CollectionsKt.createListBuilder();
            Iterator<T> it = entities.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                createListBuilder.add(Long.valueOf(acquire.executeInsert()));
            }
            return CollectionsKt.build(createListBuilder);
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            List createListBuilder = CollectionsKt.createListBuilder();
            for (T t4 : entities) {
                bind(acquire, t4);
                createListBuilder.add(Long.valueOf(acquire.executeInsert()));
            }
            return CollectionsKt.build(createListBuilder);
        } finally {
            release(acquire);
        }
    }
}
