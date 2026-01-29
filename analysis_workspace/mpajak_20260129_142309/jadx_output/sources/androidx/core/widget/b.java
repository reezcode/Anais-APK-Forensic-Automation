package androidx.core.widget;

import androidx.room.RoomTrackingLiveData;

/* loaded from: classes19.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f236b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f237c;

    public /* synthetic */ b(Object obj, int i5) {
        this.f236b = i5;
        this.f237c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f236b) {
            case 0:
                ((ContentLoadingProgressBar) this.f237c).lambda$new$1();
                break;
            default:
                RoomTrackingLiveData.refreshRunnable$lambda$0((RoomTrackingLiveData) this.f237c);
                break;
        }
    }
}
