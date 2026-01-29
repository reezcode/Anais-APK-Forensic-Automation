package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes24.dex */
public final class SQLiteDatabaseKt {
    public static final <T> T transaction(SQLiteDatabase sQLiteDatabase, boolean z4, Function1<? super SQLiteDatabase, ? extends T> body) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "<this>");
        Intrinsics.checkNotNullParameter(body, "body");
        if (z4) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T invoke = body.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            InlineMarker.finallyStart(1);
            sQLiteDatabase.endTransaction();
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ Object transaction$default(SQLiteDatabase sQLiteDatabase, boolean z4, Function1 body, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = true;
        }
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "<this>");
        Intrinsics.checkNotNullParameter(body, "body");
        if (z4) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object invoke = body.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            InlineMarker.finallyStart(1);
            sQLiteDatabase.endTransaction();
            InlineMarker.finallyEnd(1);
        }
    }
}
