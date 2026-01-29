package a1;

import android.content.Intent;
import com.google.android.gms.iid.zze;

/* loaded from: classes4.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f34b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Intent f35c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zze f36d;

    public e(zze zzeVar, Intent intent, Intent intent2) {
        this.f36d = zzeVar;
        this.f34b = intent;
        this.f35c = intent2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36d.handleIntent(this.f34b);
        this.f36d.a(this.f35c);
    }
}
