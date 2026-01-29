package com.j256.ormlite.android.apptools;

import android.app.Service;
import r2.a;
import r2.b;

/* loaded from: classes25.dex */
public abstract class OrmLiteBaseService<H extends b> extends Service {

    /* renamed from: b, reason: collision with root package name */
    public volatile H f1370b;

    @Override // android.app.Service
    public final void onCreate() {
        if (this.f1370b == null) {
            this.f1370b = (H) a.a(this);
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        a.e();
        this.f1370b = null;
    }
}
