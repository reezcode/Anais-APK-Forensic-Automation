package com.j256.ormlite.android.apptools;

import android.app.ListActivity;
import android.os.Bundle;
import r2.a;
import r2.b;

/* loaded from: classes5.dex */
public abstract class OrmLiteBaseListActivity<H extends b> extends ListActivity {

    /* renamed from: b, reason: collision with root package name */
    public volatile H f1369b;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (this.f1369b == null) {
            this.f1369b = (H) a.a(this);
        }
        super.onCreate(bundle);
    }

    @Override // android.app.ListActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a.e();
        this.f1369b = null;
    }
}
