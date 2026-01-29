package androidx.room;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f255b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QueryInterceptorDatabase f256c;

    public /* synthetic */ d(QueryInterceptorDatabase queryInterceptorDatabase, int i5) {
        this.f255b = i5;
        this.f256c = queryInterceptorDatabase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f255b) {
            case 0:
                QueryInterceptorDatabase.setTransactionSuccessful$lambda$5(this.f256c);
                break;
            default:
                QueryInterceptorDatabase.beginTransactionWithListener$lambda$2(this.f256c);
                break;
        }
    }
}
