package f3;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

/* loaded from: classes18.dex */
public final class l implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2824a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2825b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2826c = false;

    /* renamed from: d, reason: collision with root package name */
    public Location f2827d;

    /* renamed from: e, reason: collision with root package name */
    public double f2828e;

    /* renamed from: f, reason: collision with root package name */
    public double f2829f;

    /* renamed from: g, reason: collision with root package name */
    public LocationManager f2830g;

    public l(Context context) {
        this.f2824a = context;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.f2829f = location.getLongitude();
        this.f2828e = location.getLatitude();
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        super.onProviderDisabled(str);
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        super.onProviderEnabled(str);
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i5, Bundle bundle) {
        super.onStatusChanged(str, i5, bundle);
    }
}
