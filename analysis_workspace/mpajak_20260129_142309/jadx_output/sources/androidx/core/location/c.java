package androidx.core.location;

import android.location.Location;
import androidx.core.util.Consumer;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;

/* loaded from: classes16.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f176c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f177d;

    public /* synthetic */ c(Object obj, Object obj2, int i5) {
        this.f175b = i5;
        this.f176c = obj;
        this.f177d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f175b) {
            case 0:
                ((Consumer) this.f176c).accept((Location) this.f177d);
                break;
            case 1:
                ConstraintTracker._set_state_$lambda$4$lambda$3((List) this.f176c, (ConstraintTracker) this.f177d);
                break;
            default:
                ConstraintTrackingWorker.setupAndRunConstraintTrackingWork$lambda$2((ConstraintTrackingWorker) this.f176c, (h2.a) this.f177d);
                break;
        }
    }
}
