package androidx.room;

/* loaded from: classes23.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QueryInterceptorDatabase f258c;

    public /* synthetic */ e(QueryInterceptorDatabase queryInterceptorDatabase, int i5) {
        this.f257b = i5;
        this.f258c = queryInterceptorDatabase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f257b) {
            case 0:
                QueryInterceptorDatabase.beginTransactionNonExclusive$lambda$1(this.f258c);
                break;
            default:
                QueryInterceptorDatabase.endTransaction$lambda$4(this.f258c);
                break;
        }
    }
}
