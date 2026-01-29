package com.j256.ormlite.android.apptools;

import android.app.Activity;
import android.os.Bundle;
import r2.a;
import r2.b;
import x2.c;
import x2.d;

/* loaded from: classes22.dex */
public abstract class OrmLiteBaseActivity<H extends b> extends Activity {

    /* renamed from: c, reason: collision with root package name */
    public static c f1366c = d.a(OrmLiteBaseActivity.class);

    /* renamed from: b, reason: collision with root package name */
    public volatile H f1367b;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (this.f1367b == null) {
            H h5 = (H) a.a(this);
            f1366c.h("{}: got new helper {} from OpenHelperManager", this, h5);
            this.f1367b = h5;
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        H h5 = this.f1367b;
        a.e();
        f1366c.h("{}: helper {} was released, set to null", this, h5);
        this.f1367b = null;
    }

    public final String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(super.hashCode());
    }
}
