package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.tbs.video.interfaces.IUserStateChangedListener;

/* loaded from: classes17.dex */
class p {

    /* renamed from: e, reason: collision with root package name */
    private static p f2210e;

    /* renamed from: a, reason: collision with root package name */
    public r f2211a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2212b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.tbs.video.interfaces.a f2213c;

    /* renamed from: d, reason: collision with root package name */
    public IUserStateChangedListener f2214d;

    private p(Context context) {
        this.f2211a = null;
        this.f2212b = context.getApplicationContext();
        this.f2211a = new r(this.f2212b);
    }

    public static synchronized p a(Context context) {
        p pVar;
        synchronized (p.class) {
            if (f2210e == null) {
                f2210e = new p(context);
            }
            pVar = f2210e;
        }
        return pVar;
    }

    public void a(int i5, int i6, Intent intent) {
        com.tencent.tbs.video.interfaces.a aVar = this.f2213c;
        if (aVar != null) {
            aVar.a(i5, i6, intent);
        }
    }

    public void a(Activity activity, int i5) {
        this.f2211a.a(activity, i5);
    }

    public boolean a() {
        this.f2211a.a();
        return this.f2211a.b();
    }

    public boolean a(String str, Bundle bundle, com.tencent.tbs.video.interfaces.a aVar) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("videoUrl", str);
        }
        if (aVar != null) {
            this.f2211a.a();
            if (!this.f2211a.b()) {
                return false;
            }
            this.f2213c = aVar;
            IUserStateChangedListener iUserStateChangedListener = new IUserStateChangedListener() { // from class: com.tencent.smtt.sdk.p.1
                @Override // com.tencent.tbs.video.interfaces.IUserStateChangedListener
                public void onUserStateChanged() {
                    p.this.f2211a.c();
                }
            };
            this.f2214d = iUserStateChangedListener;
            this.f2213c.a(iUserStateChangedListener);
            bundle.putInt("callMode", 3);
        } else {
            bundle.putInt("callMode", 1);
        }
        this.f2211a.a(bundle, aVar == null ? null : this);
        return true;
    }
}
