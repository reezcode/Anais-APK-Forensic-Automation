package com.j256.ormlite.android.apptools;

import android.app.TabActivity;
import android.os.Bundle;
import r2.a;
import r2.b;

/* loaded from: classes18.dex */
public abstract class OrmLiteBaseTabActivity<H extends b> extends TabActivity {

    /* renamed from: b, reason: collision with root package name */
    public volatile H f1371b;

    @Override // android.app.ActivityGroup, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (this.f1371b == null) {
            this.f1371b = (H) a.a(this);
        }
        super.onCreate(bundle);
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a.e();
        this.f1371b = null;
    }
}
