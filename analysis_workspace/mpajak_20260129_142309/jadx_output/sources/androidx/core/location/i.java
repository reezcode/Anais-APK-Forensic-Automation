package androidx.core.location;

import android.location.GnssStatus;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* loaded from: classes18.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executor f190c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f192e;

    public /* synthetic */ i(Object obj, Executor executor, Object obj2, int i5) {
        this.f189b = i5;
        this.f191d = obj;
        this.f190c = executor;
        this.f192e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f189b) {
            case 0:
                ((LocationManagerCompat.GpsStatusTransport) this.f191d).lambda$onGpsStatusChanged$3(this.f190c, (GnssStatusCompat) this.f192e);
                break;
            default:
                ((LocationManagerCompat.PreRGnssStatusTransport) this.f191d).lambda$onSatelliteStatusChanged$3(this.f190c, (GnssStatus) this.f192e);
                break;
        }
    }
}
