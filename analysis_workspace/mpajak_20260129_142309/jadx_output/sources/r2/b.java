package r2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.sql.SQLException;
import java.util.Objects;
import t2.g;
import t2.h;
import x2.b;
import x2.c;
import x2.d;

/* loaded from: classes11.dex */
public abstract class b extends SQLiteOpenHelper {

    /* renamed from: d, reason: collision with root package name */
    public static c f5037d = d.a(b.class);

    /* renamed from: b, reason: collision with root package name */
    public q2.b f5038b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f5039c;

    public b(Context context) {
        super(context, "mydb.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f5038b = new q2.b(this);
        this.f5039c = true;
        f5037d.h("{}: constructed connectionSource {}", this, this.f5038b);
    }

    public final c3.c a() {
        if (!this.f5039c) {
            c cVar = f5037d;
            IllegalStateException illegalStateException = new IllegalStateException();
            b.a aVar = b.a.WARNING;
            Object obj = c.f5926b;
            cVar.f(aVar, illegalStateException, "Getting connectionSource was called after closed", obj, obj, obj, null);
        }
        return this.f5038b;
    }

    public final <D extends g<T, ?>, T> D b(Class<T> cls) {
        return (D) h.a(a(), cls);
    }

    public abstract void c(c3.c cVar);

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        super.close();
        Objects.requireNonNull(this.f5038b);
        this.f5039c = false;
    }

    public abstract void e(c3.c cVar);

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        boolean z4;
        c3.a aVar = (c3.a) a();
        c3.d a5 = aVar.a();
        if (a5 == null) {
            a5 = new q2.c(sQLiteDatabase);
            try {
                ((q2.b) aVar).d(a5);
                z4 = true;
            } catch (SQLException e5) {
                throw new IllegalStateException("Could not save special connection", e5);
            }
        } else {
            z4 = false;
        }
        try {
            c(aVar);
        } finally {
            if (z4) {
                ((q2.b) aVar).b(a5);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i6) {
        boolean z4;
        c3.a aVar = (c3.a) a();
        c3.d a5 = aVar.a();
        if (a5 == null) {
            a5 = new q2.c(sQLiteDatabase);
            try {
                ((q2.b) aVar).d(a5);
                z4 = true;
            } catch (SQLException e5) {
                throw new IllegalStateException("Could not save special connection", e5);
            }
        } else {
            z4 = false;
        }
        try {
            e(aVar);
        } finally {
            if (z4) {
                ((q2.b) aVar).b(a5);
            }
        }
    }

    public final String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(super.hashCode());
    }
}
