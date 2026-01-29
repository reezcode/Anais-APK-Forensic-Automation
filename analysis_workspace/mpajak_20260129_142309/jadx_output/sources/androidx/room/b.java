package androidx.room;

import androidx.work.impl.background.systemalarm.DelayMetCommandHandler;

/* loaded from: classes8.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f252c;

    public /* synthetic */ b(Object obj, int i5) {
        this.f251b = i5;
        this.f252c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f251b) {
            case 0:
                ((InvalidationTracker) this.f252c).onAutoCloseCallback$room_runtime_release();
                break;
            case 1:
                QueryInterceptorDatabase.beginTransactionWithListenerNonExclusive$lambda$3((QueryInterceptorDatabase) this.f252c);
                break;
            case 2:
                QueryInterceptorStatement.executeUpdateDelete$lambda$1((QueryInterceptorStatement) this.f252c);
                break;
            default:
                ((DelayMetCommandHandler) this.f252c).stopWork();
                break;
        }
    }
}
