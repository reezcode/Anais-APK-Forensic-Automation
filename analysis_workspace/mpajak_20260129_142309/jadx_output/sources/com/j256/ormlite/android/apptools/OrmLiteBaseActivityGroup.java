package com.j256.ormlite.android.apptools;

import android.app.ActivityGroup;
import android.os.Bundle;
import r2.a;
import r2.b;

/* loaded from: classes19.dex */
public abstract class OrmLiteBaseActivityGroup<H extends b> extends ActivityGroup {

    /* renamed from: b, reason: collision with root package name */
    public volatile H f1368b;

    @Override // android.app.ActivityGroup, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (this.f1368b == null) {
            this.f1368b = (H) a.a(this);
        }
        super.onCreate(bundle);
    }

    @Override // android.app.ActivityGroup, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a.e();
        this.f1368b = null;
    }
}
