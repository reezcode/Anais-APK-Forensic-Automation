package androidx.core.location;

import android.location.Location;
import androidx.core.location.LocationManagerCompat;
import androidx.core.util.Consumer;

/* loaded from: classes12.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f183c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f184d;

    public /* synthetic */ f(Object obj, Object obj2, int i5) {
        this.f182b = i5;
        this.f183c = obj;
        this.f184d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f182b) {
            case 0:
                ((Consumer) this.f183c).accept((Location) this.f184d);
                break;
            default:
                ((LocationManagerCompat.LocationListenerTransport) this.f183c).lambda$onProviderDisabled$5((String) this.f184d);
                break;
        }
    }
}
