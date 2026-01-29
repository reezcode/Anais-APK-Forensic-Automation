package androidx.work.impl;

import androidx.work.impl.utils.WorkForegroundRunnable;
import androidx.work.impl.utils.futures.SettableFuture;

/* loaded from: classes12.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f301c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f302d;

    public /* synthetic */ g(Object obj, Object obj2, int i5) {
        this.f300b = i5;
        this.f301c = obj;
        this.f302d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f300b) {
            case 0:
                ((WorkerWrapper) this.f301c).lambda$runWorker$0((h2.a) this.f302d);
                break;
            default:
                ((WorkForegroundRunnable) this.f301c).lambda$run$0((SettableFuture) this.f302d);
                break;
        }
    }
}
