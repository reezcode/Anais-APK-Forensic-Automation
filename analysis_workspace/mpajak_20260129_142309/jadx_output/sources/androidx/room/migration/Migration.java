package androidx.room.migration;

import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* loaded from: classes19.dex */
public abstract class Migration {
    public final int endVersion;
    public final int startVersion;

    public Migration(int i5, int i6) {
        this.startVersion = i5;
        this.endVersion = i6;
    }

    public abstract void migrate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase);
}
