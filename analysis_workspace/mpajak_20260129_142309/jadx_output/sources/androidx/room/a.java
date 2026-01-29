package androidx.room;

import androidx.work.CoroutineWorker;
import androidx.work.impl.background.systemalarm.DelayMetCommandHandler;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f249b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f250c;

    public /* synthetic */ a(Object obj, int i5) {
        this.f249b = i5;
        this.f250c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f249b) {
            case 0:
                AutoCloser.executeAutoCloser$lambda$0((AutoCloser) this.f250c);
                break;
            case 1:
                RoomTrackingLiveData.invalidationRunnable$lambda$1((RoomTrackingLiveData) this.f250c);
                break;
            case 2:
                CoroutineWorker._init_$lambda$0((CoroutineWorker) this.f250c);
                break;
            default:
                ((DelayMetCommandHandler) this.f250c).stopWork();
                break;
        }
    }
}
