package r0;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes19.dex */
public final class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: f, reason: collision with root package name */
    public static final a f5007f = new a();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f5008b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f5009c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("sInstance")
    public final ArrayList<InterfaceC0063a> f5010d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    @GuardedBy("sInstance")
    public boolean f5011e = false;

    /* renamed from: r0.a$a, reason: collision with other inner class name */
    /* loaded from: classes25.dex */
    public interface InterfaceC0063a {
        void a(boolean z4);
    }

    public final void a(boolean z4) {
        synchronized (f5007f) {
            ArrayList<InterfaceC0063a> arrayList = this.f5010d;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                InterfaceC0063a interfaceC0063a = arrayList.get(i5);
                i5++;
                interfaceC0063a.a(z4);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f5008b.compareAndSet(true, false);
        this.f5009c.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f5008b.compareAndSet(true, false);
        this.f5009c.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i5) {
        if (i5 == 20 && this.f5008b.compareAndSet(false, true)) {
            this.f5009c.set(true);
            a(true);
        }
    }
}
