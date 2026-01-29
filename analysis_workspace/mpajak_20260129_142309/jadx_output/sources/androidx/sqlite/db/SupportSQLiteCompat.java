package androidx.sqlite.db;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes16.dex */
public final class SupportSQLiteCompat {

    @RequiresApi(16)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes10.dex */
    public static final class Api16Impl {
        public static final Api16Impl INSTANCE = new Api16Impl();

        private Api16Impl() {
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void cancel(CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            cancellationSignal.cancel();
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final CancellationSignal createCancellationSignal() {
            return new CancellationSignal();
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final boolean deleteDatabase(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return SQLiteDatabase.deleteDatabase(file);
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void disableWriteAheadLogging(SQLiteDatabase sQLiteDatabase) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.disableWriteAheadLogging();
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final boolean isWriteAheadLoggingEnabled(SQLiteDatabase sQLiteDatabase) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            return sQLiteDatabase.isWriteAheadLoggingEnabled();
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final Cursor rawQueryWithFactory(SQLiteDatabase sQLiteDatabase, String sql, String[] selectionArgs, String str, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(selectionArgs, "selectionArgs");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            Intrinsics.checkNotNullParameter(cursorFactory, "cursorFactory");
            Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, str, cancellationSignal);
            Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
            return rawQueryWithFactory;
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void setForeignKeyConstraintsEnabled(SQLiteDatabase sQLiteDatabase, boolean z4) {
            Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.setForeignKeyConstraintsEnabled(z4);
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void setWriteAheadLoggingEnabled(SQLiteOpenHelper sQLiteOpenHelper, boolean z4) {
            Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z4);
        }
    }

    @RequiresApi(19)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes8.dex */
    public static final class Api19Impl {
        public static final Api19Impl INSTANCE = new Api19Impl();

        private Api19Impl() {
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final Uri getNotificationUri(Cursor cursor) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Uri notificationUri = cursor.getNotificationUri();
            Intrinsics.checkNotNullExpressionValue(notificationUri, "cursor.notificationUri");
            return notificationUri;
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final boolean isLowRamDevice(ActivityManager activityManager) {
            Intrinsics.checkNotNullParameter(activityManager, "activityManager");
            return activityManager.isLowRamDevice();
        }
    }

    @RequiresApi(21)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes2.dex */
    public static final class Api21Impl {
        public static final Api21Impl INSTANCE = new Api21Impl();

        private Api21Impl() {
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final File getNoBackupFilesDir(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
            return noBackupFilesDir;
        }
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes20.dex */
    public static final class Api23Impl {
        public static final Api23Impl INSTANCE = new Api23Impl();

        private Api23Impl() {
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void setExtras(Cursor cursor, Bundle extras) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Intrinsics.checkNotNullParameter(extras, "extras");
            cursor.setExtras(extras);
        }
    }

    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes8.dex */
    public static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final List<Uri> getNotificationUris(Cursor cursor) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            List<Uri> notificationUris = cursor.getNotificationUris();
            Intrinsics.checkNotNull(notificationUris);
            return notificationUris;
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void setNotificationUris(Cursor cursor, ContentResolver cr, List<? extends Uri> uris) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(uris, "uris");
            cursor.setNotificationUris(cr, uris);
        }
    }

    private SupportSQLiteCompat() {
    }
}
