package androidx.room;

import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.List;

/* loaded from: classes24.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QueryInterceptorDatabase f260c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f262e;

    public /* synthetic */ f(QueryInterceptorDatabase queryInterceptorDatabase, Object obj, Object obj2, int i5) {
        this.f259b = i5;
        this.f260c = queryInterceptorDatabase;
        this.f261d = obj;
        this.f262e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f259b) {
            case 0:
                QueryInterceptorDatabase.query$lambda$9(this.f260c, (SupportSQLiteQuery) this.f261d, (QueryInterceptorProgram) this.f262e);
                break;
            default:
                QueryInterceptorDatabase.execSQL$lambda$11(this.f260c, (String) this.f261d, (List) this.f262e);
                break;
        }
    }
}
