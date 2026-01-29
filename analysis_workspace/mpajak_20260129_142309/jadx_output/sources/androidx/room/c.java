package androidx.room;

import androidx.work.impl.background.systemalarm.DelayMetCommandHandler;
import androidx.work.impl.workers.ConstraintTrackingWorker;

/* loaded from: classes23.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f253b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f254c;

    public /* synthetic */ c(Object obj, int i5) {
        this.f253b = i5;
        this.f254c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f253b) {
            case 0:
                MultiInstanceInvalidationClient.setUpRunnable$lambda$1((MultiInstanceInvalidationClient) this.f254c);
                break;
            case 1:
                QueryInterceptorStatement.execute$lambda$0((QueryInterceptorStatement) this.f254c);
                break;
            case 2:
                ((DelayMetCommandHandler) this.f254c).startWork();
                break;
            default:
                ConstraintTrackingWorker.startWork$lambda$0((ConstraintTrackingWorker) this.f254c);
                break;
        }
    }
}
