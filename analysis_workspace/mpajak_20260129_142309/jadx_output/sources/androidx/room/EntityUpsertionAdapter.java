package androidx.room;

import android.database.sqlite.SQLiteConstraintException;
import androidx.annotation.RestrictTo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes13.dex */
public final class EntityUpsertionAdapter<T> {
    private final EntityInsertionAdapter<T> insertionAdapter;
    private final EntityDeletionOrUpdateAdapter<T> updateAdapter;

    public EntityUpsertionAdapter(EntityInsertionAdapter<T> insertionAdapter, EntityDeletionOrUpdateAdapter<T> updateAdapter) {
        Intrinsics.checkNotNullParameter(insertionAdapter, "insertionAdapter");
        Intrinsics.checkNotNullParameter(updateAdapter, "updateAdapter");
        this.insertionAdapter = insertionAdapter;
        this.updateAdapter = updateAdapter;
    }

    private final void checkUniquenessException(SQLiteConstraintException sQLiteConstraintException) {
        boolean contains;
        String message = sQLiteConstraintException.getMessage();
        if (message == null) {
            throw sQLiteConstraintException;
        }
        contains = StringsKt__StringsKt.contains(message, (CharSequence) "1555", true);
        if (!contains) {
            throw sQLiteConstraintException;
        }
    }

    public final void upsert(Iterable<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        for (T t4 : entities) {
            try {
                this.insertionAdapter.insert((EntityInsertionAdapter<T>) t4);
            } catch (SQLiteConstraintException e5) {
                checkUniquenessException(e5);
                this.updateAdapter.handle(t4);
            }
        }
    }

    public final void upsert(T t4) {
        try {
            this.insertionAdapter.insert((EntityInsertionAdapter<T>) t4);
        } catch (SQLiteConstraintException e5) {
            checkUniquenessException(e5);
            this.updateAdapter.handle(t4);
        }
    }

    public final void upsert(T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        for (T t4 : entities) {
            try {
                this.insertionAdapter.insert((EntityInsertionAdapter<T>) t4);
            } catch (SQLiteConstraintException e5) {
                checkUniquenessException(e5);
                this.updateAdapter.handle(t4);
            }
        }
    }

    public final long upsertAndReturnId(T t4) {
        try {
            return this.insertionAdapter.insertAndReturnId(t4);
        } catch (SQLiteConstraintException e5) {
            checkUniquenessException(e5);
            this.updateAdapter.handle(t4);
            return -1L;
        }
    }

    public final long[] upsertAndReturnIdsArray(Collection<? extends T> entities) {
        long j5;
        Intrinsics.checkNotNullParameter(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        long[] jArr = new long[size];
        for (int i5 = 0; i5 < size; i5++) {
            T next = it.next();
            try {
                j5 = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e5) {
                checkUniquenessException(e5);
                this.updateAdapter.handle(next);
                j5 = -1;
            }
            jArr[i5] = j5;
        }
        return jArr;
    }

    public final long[] upsertAndReturnIdsArray(T[] entities) {
        long j5;
        Intrinsics.checkNotNullParameter(entities, "entities");
        int length = entities.length;
        long[] jArr = new long[length];
        for (int i5 = 0; i5 < length; i5++) {
            try {
                j5 = this.insertionAdapter.insertAndReturnId(entities[i5]);
            } catch (SQLiteConstraintException e5) {
                checkUniquenessException(e5);
                this.updateAdapter.handle(entities[i5]);
                j5 = -1;
            }
            jArr[i5] = j5;
        }
        return jArr;
    }

    public final Long[] upsertAndReturnIdsArrayBox(Collection<? extends T> entities) {
        long j5;
        Intrinsics.checkNotNullParameter(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        Long[] lArr = new Long[size];
        for (int i5 = 0; i5 < size; i5++) {
            T next = it.next();
            try {
                j5 = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e5) {
                checkUniquenessException(e5);
                this.updateAdapter.handle(next);
                j5 = -1;
            }
            lArr[i5] = Long.valueOf(j5);
        }
        return lArr;
    }

    public final Long[] upsertAndReturnIdsArrayBox(T[] entities) {
        long j5;
        Intrinsics.checkNotNullParameter(entities, "entities");
        int length = entities.length;
        Long[] lArr = new Long[length];
        for (int i5 = 0; i5 < length; i5++) {
            try {
                j5 = this.insertionAdapter.insertAndReturnId(entities[i5]);
            } catch (SQLiteConstraintException e5) {
                checkUniquenessException(e5);
                this.updateAdapter.handle(entities[i5]);
                j5 = -1;
            }
            lArr[i5] = Long.valueOf(j5);
        }
        return lArr;
    }

    public final List<Long> upsertAndReturnIdsList(Collection<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        List createListBuilder = CollectionsKt.createListBuilder();
        for (T t4 : entities) {
            try {
                createListBuilder.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t4)));
            } catch (SQLiteConstraintException e5) {
                checkUniquenessException(e5);
                this.updateAdapter.handle(t4);
                createListBuilder.add(-1L);
            }
        }
        return CollectionsKt.build(createListBuilder);
    }

    public final List<Long> upsertAndReturnIdsList(T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        List createListBuilder = CollectionsKt.createListBuilder();
        for (T t4 : entities) {
            try {
                createListBuilder.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t4)));
            } catch (SQLiteConstraintException e5) {
                checkUniquenessException(e5);
                this.updateAdapter.handle(t4);
                createListBuilder.add(-1L);
            }
        }
        return CollectionsKt.build(createListBuilder);
    }
}
