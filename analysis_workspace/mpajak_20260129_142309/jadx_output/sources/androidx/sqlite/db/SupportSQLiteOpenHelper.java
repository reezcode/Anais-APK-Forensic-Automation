package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import androidx.activity.d;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteCompat;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes22.dex */
public interface SupportSQLiteOpenHelper extends Closeable {

    /* loaded from: classes9.dex */
    public static abstract class Callback {
        public static final Companion Companion = new Companion(null);
        private static final String TAG = "SupportSQLite";

        @JvmField
        public final int version;

        /* loaded from: classes11.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Callback(int i5) {
            this.version = i5;
        }

        private final void deleteDatabaseFile(String str) {
            if (StringsKt.g(str, ":memory:")) {
                return;
            }
            int length = str.length() - 1;
            int i5 = 0;
            boolean z4 = false;
            while (i5 <= length) {
                boolean z5 = Intrinsics.compare((int) str.charAt(!z4 ? i5 : length), 32) <= 0;
                if (z4) {
                    if (!z5) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z5) {
                    i5++;
                } else {
                    z4 = true;
                }
            }
            if (str.subSequence(i5, length + 1).toString().length() == 0) {
                return;
            }
            Log.w(TAG, "deleting the database file: " + str);
            try {
                SupportSQLiteCompat.Api16Impl.deleteDatabase(new File(str));
            } catch (Exception e5) {
                Log.w(TAG, "delete failed: ", e5);
            }
        }

        public void onConfigure(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void onCorruption(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            Log.e(TAG, "Corruption reported by sqlite on database: " + db + ".path");
            if (!db.isOpen()) {
                String path = db.getPath();
                if (path != null) {
                    deleteDatabaseFile(path);
                    return;
                }
                return;
            }
            List<Pair<String, String>> list = null;
            try {
                try {
                    list = db.getAttachedDbs();
                } catch (SQLiteException unused) {
                }
                try {
                    db.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            } finally {
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                        deleteDatabaseFile((String) obj);
                    }
                } else {
                    String path2 = db.getPath();
                    if (path2 != null) {
                        deleteDatabaseFile(path2);
                    }
                }
            }
        }

        public abstract void onCreate(SupportSQLiteDatabase supportSQLiteDatabase);

        public void onDowngrade(SupportSQLiteDatabase db, int i5, int i6) {
            Intrinsics.checkNotNullParameter(db, "db");
            throw new SQLiteException(d.d("Can't downgrade database from version ", i5, " to ", i6));
        }

        public void onOpen(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public abstract void onUpgrade(SupportSQLiteDatabase supportSQLiteDatabase, int i5, int i6);
    }

    /* loaded from: classes19.dex */
    public static final class Configuration {
        public static final Companion Companion = new Companion(null);

        @JvmField
        public final boolean allowDataLossOnRecovery;

        @JvmField
        public final Callback callback;

        @JvmField
        public final Context context;

        @JvmField
        public final String name;

        @JvmField
        public final boolean useNoBackupDirectory;

        /* loaded from: classes18.dex */
        public static class Builder {
            private boolean allowDataLossOnRecovery;
            private Callback callback;
            private final Context context;
            private String name;
            private boolean useNoBackupDirectory;

            public Builder(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                this.context = context;
            }

            public Builder allowDataLossOnRecovery(boolean z4) {
                this.allowDataLossOnRecovery = z4;
                return this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
            
                if ((r0 == null || r0.length() == 0) == false) goto L14;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration build() {
                /*
                    r7 = this;
                    androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r3 = r7.callback
                    if (r3 == 0) goto L38
                    boolean r0 = r7.useNoBackupDirectory
                    r1 = 0
                    r2 = 1
                    if (r0 == 0) goto L1a
                    java.lang.String r0 = r7.name
                    if (r0 == 0) goto L17
                    int r0 = r0.length()
                    if (r0 != 0) goto L15
                    goto L17
                L15:
                    r0 = 0
                    goto L18
                L17:
                    r0 = 1
                L18:
                    if (r0 != 0) goto L1b
                L1a:
                    r1 = 1
                L1b:
                    if (r1 == 0) goto L2c
                    androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration r6 = new androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration
                    android.content.Context r1 = r7.context
                    java.lang.String r2 = r7.name
                    boolean r4 = r7.useNoBackupDirectory
                    boolean r5 = r7.allowDataLossOnRecovery
                    r0 = r6
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r6
                L2c:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "Must set a non-null database name to a configuration that uses the no backup directory."
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                L38:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "Must set a callback to create the configuration."
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder.build():androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration");
            }

            public Builder callback(Callback callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                this.callback = callback;
                return this;
            }

            public Builder name(String str) {
                this.name = str;
                return this;
            }

            public Builder noBackupDirectory(boolean z4) {
                this.useNoBackupDirectory = z4;
                return this;
            }
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final Builder builder(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new Builder(context);
            }
        }

        public Configuration(Context context, String str, Callback callback, boolean z4, boolean z5) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.context = context;
            this.name = str;
            this.callback = callback;
            this.useNoBackupDirectory = z4;
            this.allowDataLossOnRecovery = z5;
        }

        public /* synthetic */ Configuration(Context context, String str, Callback callback, boolean z4, boolean z5, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, str, callback, (i5 & 8) != 0 ? false : z4, (i5 & 16) != 0 ? false : z5);
        }

        @JvmStatic
        public static final Builder builder(Context context) {
            return Companion.builder(context);
        }
    }

    /* loaded from: classes12.dex */
    public interface Factory {
        SupportSQLiteOpenHelper create(Configuration configuration);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    SupportSQLiteDatabase getReadableDatabase();

    SupportSQLiteDatabase getWritableDatabase();

    @RequiresApi(api = 16)
    void setWriteAheadLoggingEnabled(boolean z4);
}
