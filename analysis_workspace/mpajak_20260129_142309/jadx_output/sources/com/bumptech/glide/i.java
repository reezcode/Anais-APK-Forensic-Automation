package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.c;
import e0.c;
import e0.k;
import e0.l;
import e0.m;
import e0.o;
import e0.p;
import e0.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public final class i implements ComponentCallbacks2, l {

    /* renamed from: l, reason: collision with root package name */
    public static final h0.f f583l;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.b f584b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f585c;

    /* renamed from: d, reason: collision with root package name */
    public final k f586d;

    /* renamed from: e, reason: collision with root package name */
    @GuardedBy("this")
    public final p f587e;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("this")
    public final o f588f;

    /* renamed from: g, reason: collision with root package name */
    @GuardedBy("this")
    public final r f589g;

    /* renamed from: h, reason: collision with root package name */
    public final a f590h;

    /* renamed from: i, reason: collision with root package name */
    public final e0.c f591i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList<h0.e<Object>> f592j;

    /* renamed from: k, reason: collision with root package name */
    @GuardedBy("this")
    public h0.f f593k;

    /* loaded from: classes23.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i iVar = i.this;
            iVar.f586d.b(iVar);
        }
    }

    /* loaded from: classes17.dex */
    public class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        @GuardedBy("RequestManager.this")
        public final p f595a;

        public b(@NonNull p pVar) {
            this.f595a = pVar;
        }
    }

    static {
        h0.f c5 = new h0.f().c(Bitmap.class);
        c5.f3073u = true;
        f583l = c5;
        new h0.f().c(c0.c.class).f3073u = true;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList, java.util.List<com.bumptech.glide.i>] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.ArrayList, java.util.List<com.bumptech.glide.i>] */
    public i(@NonNull com.bumptech.glide.b bVar, @NonNull k kVar, @NonNull o oVar, @NonNull Context context) {
        h0.f fVar;
        p pVar = new p();
        e0.d dVar = bVar.f535h;
        this.f589g = new r();
        a aVar = new a();
        this.f590h = aVar;
        this.f584b = bVar;
        this.f586d = kVar;
        this.f588f = oVar;
        this.f587e = pVar;
        this.f585c = context;
        Context applicationContext = context.getApplicationContext();
        b bVar2 = new b(pVar);
        Objects.requireNonNull((e0.f) dVar);
        boolean z4 = ContextCompat.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z4 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        e0.c eVar = z4 ? new e0.e(applicationContext, bVar2) : new m();
        this.f591i = eVar;
        if (l0.k.h()) {
            l0.k.f().post(aVar);
        } else {
            kVar.b(this);
        }
        kVar.b(eVar);
        this.f592j = new CopyOnWriteArrayList<>(bVar.f531d.f558e);
        d dVar2 = bVar.f531d;
        synchronized (dVar2) {
            if (dVar2.f563j == null) {
                Objects.requireNonNull((c.a) dVar2.f557d);
                h0.f fVar2 = new h0.f();
                fVar2.f3073u = true;
                dVar2.f563j = fVar2;
            }
            fVar = dVar2.f563j;
        }
        synchronized (this) {
            h0.f clone = fVar.clone();
            if (clone.f3073u && !clone.f3075w) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            clone.f3075w = true;
            clone.f3073u = true;
            this.f593k = clone;
        }
        synchronized (bVar.f536i) {
            if (bVar.f536i.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            bVar.f536i.add(this);
        }
    }

    @Override // e0.l
    public final synchronized void d() {
        o();
        this.f589g.d();
    }

    @NonNull
    @CheckResult
    public final h<Drawable> j() {
        return new h<>(this.f584b, this, Drawable.class, this.f585c);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.bumptech.glide.i>] */
    public final void k(@Nullable i0.h<?> hVar) {
        boolean z4;
        if (hVar == null) {
            return;
        }
        boolean q4 = q(hVar);
        h0.c g5 = hVar.g();
        if (q4) {
            return;
        }
        com.bumptech.glide.b bVar = this.f584b;
        synchronized (bVar.f536i) {
            Iterator it = bVar.f536i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z4 = false;
                    break;
                } else if (((i) it.next()).q(hVar)) {
                    z4 = true;
                    break;
                }
            }
        }
        if (z4 || g5 == null) {
            return;
        }
        hVar.e(null);
        g5.clear();
    }

    @NonNull
    @CheckResult
    public final h<Drawable> l(@Nullable File file) {
        return j().w(file);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, p.f>] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentMap<java.lang.String, p.f>] */
    @NonNull
    @CheckResult
    public final h<Drawable> m(@Nullable @DrawableRes @RawRes Integer num) {
        PackageInfo packageInfo;
        h<Drawable> j5 = j();
        h<Drawable> w4 = j5.w(num);
        Context context = j5.B;
        ConcurrentMap<String, p.f> concurrentMap = k0.b.f3798a;
        String packageName = context.getPackageName();
        p.f fVar = (p.f) k0.b.f3798a.get(packageName);
        if (fVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e5) {
                StringBuilder g5 = androidx.activity.d.g("Cannot resolve info for");
                g5.append(context.getPackageName());
                Log.e("AppVersionSignature", g5.toString(), e5);
                packageInfo = null;
            }
            k0.d dVar = new k0.d(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            fVar = (p.f) k0.b.f3798a.putIfAbsent(packageName, dVar);
            if (fVar == null) {
                fVar = dVar;
            }
        }
        return w4.a(new h0.f().k(new k0.a(context.getResources().getConfiguration().uiMode & 48, fVar)));
    }

    @NonNull
    @CheckResult
    public final h<Drawable> n(@Nullable String str) {
        return j().w(str);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<h0.c>] */
    public final synchronized void o() {
        p pVar = this.f587e;
        pVar.f2528c = true;
        Iterator it = ((ArrayList) l0.k.e(pVar.f2526a)).iterator();
        while (it.hasNext()) {
            h0.c cVar = (h0.c) it.next();
            if (cVar.isRunning()) {
                cVar.pause();
                pVar.f2527b.add(cVar);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList, java.util.List<h0.c>] */
    @Override // e0.l
    public final synchronized void onDestroy() {
        this.f589g.onDestroy();
        Iterator it = ((ArrayList) l0.k.e(this.f589g.f2536b)).iterator();
        while (it.hasNext()) {
            k((i0.h) it.next());
        }
        this.f589g.f2536b.clear();
        p pVar = this.f587e;
        Iterator it2 = ((ArrayList) l0.k.e(pVar.f2526a)).iterator();
        while (it2.hasNext()) {
            pVar.a((h0.c) it2.next());
        }
        pVar.f2527b.clear();
        this.f586d.a(this);
        this.f586d.a(this.f591i);
        l0.k.f().removeCallbacks(this.f590h);
        this.f584b.e(this);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // e0.l
    public final synchronized void onStart() {
        p();
        this.f589g.onStart();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i5) {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<h0.c>] */
    public final synchronized void p() {
        p pVar = this.f587e;
        pVar.f2528c = false;
        Iterator it = ((ArrayList) l0.k.e(pVar.f2526a)).iterator();
        while (it.hasNext()) {
            h0.c cVar = (h0.c) it.next();
            if (!cVar.j() && !cVar.isRunning()) {
                cVar.i();
            }
        }
        pVar.f2527b.clear();
    }

    public final synchronized boolean q(@NonNull i0.h<?> hVar) {
        h0.c g5 = hVar.g();
        if (g5 == null) {
            return true;
        }
        if (!this.f587e.a(g5)) {
            return false;
        }
        this.f589g.f2536b.remove(hVar);
        hVar.e(null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f587e + ", treeNode=" + this.f588f + "}";
    }
}
