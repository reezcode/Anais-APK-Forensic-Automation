package androidx.core.location;

import android.location.Location;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Executor;

/* loaded from: classes17.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f186b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f187c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f188d;

    public /* synthetic */ h(Object obj, Object obj2, int i5) {
        this.f186b = i5;
        this.f187c = obj;
        this.f188d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f186b) {
            case 0:
                ((LocationManagerCompat.GpsStatusTransport) this.f187c).lambda$onGpsStatusChanged$0((Executor) this.f188d);
                break;
            default:
                ((LocationManagerCompat.LocationListenerTransport) this.f187c).lambda$onLocationChanged$0((Location) this.f188d);
                break;
        }
    }
}
