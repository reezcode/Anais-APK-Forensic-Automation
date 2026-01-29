package androidx.activity;

import androidx.room.AutoCloser;
import androidx.work.impl.background.systemalarm.DelayMetCommandHandler;

/* loaded from: classes15.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f122b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f123c;

    public /* synthetic */ e(Object obj, int i5) {
        this.f122b = i5;
        this.f123c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f122b) {
            case 0:
                ComponentDialog.m0onBackPressedDispatcher$lambda1((ComponentDialog) this.f123c);
                break;
            case 1:
                AutoCloser.autoCloser$lambda$3((AutoCloser) this.f123c);
                break;
            default:
                ((DelayMetCommandHandler) this.f123c).stopWork();
                break;
        }
    }
}
