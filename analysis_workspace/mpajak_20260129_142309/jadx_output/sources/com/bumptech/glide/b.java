package com.bumptech.glide;

import android.R;
import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.c;
import com.bumptech.glide.e;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import e0.n;
import g0.a;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r.m;
import t.j;
import u.a;
import v.a;
import v.b;
import v.d;
import v.e;
import v.f;
import v.k;
import v.t;
import v.u;
import v.v;
import v.w;
import v.x;
import v.y;
import w.a;
import w.b;
import w.c;
import w.d;
import w.e;
import y.b0;
import y.c0;
import y.k;
import y.p;
import y.t;
import y.v;
import y.x;
import y.z;
import z.a;

/* loaded from: classes20.dex */
public final class b implements ComponentCallbacks2 {

    /* renamed from: j, reason: collision with root package name */
    @GuardedBy("Glide.class")
    public static volatile b f527j;

    /* renamed from: k, reason: collision with root package name */
    public static volatile boolean f528k;

    /* renamed from: b, reason: collision with root package name */
    public final s.d f529b;

    /* renamed from: c, reason: collision with root package name */
    public final t.i f530c;

    /* renamed from: d, reason: collision with root package name */
    public final d f531d;

    /* renamed from: e, reason: collision with root package name */
    public final g f532e;

    /* renamed from: f, reason: collision with root package name */
    public final s.b f533f;

    /* renamed from: g, reason: collision with root package name */
    public final n f534g;

    /* renamed from: h, reason: collision with root package name */
    public final e0.d f535h;

    /* renamed from: i, reason: collision with root package name */
    @GuardedBy("managers")
    public final List<i> f536i = new ArrayList();

    /* loaded from: classes12.dex */
    public interface a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.ArrayList, java.util.List<com.bumptech.glide.load.ImageHeaderParser>] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.ArrayList, java.util.List<com.bumptech.glide.load.ImageHeaderParser>] */
    /* JADX WARN: Type inference failed for: r16v1, types: [y.h] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList, java.util.List<g0.a$a<?>>] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList, java.util.List<g0.a$a<?>>] */
    public b(@NonNull Context context, @NonNull m mVar, @NonNull t.i iVar, @NonNull s.d dVar, @NonNull s.b bVar, @NonNull n nVar, @NonNull e0.d dVar2, int i5, @NonNull a aVar, @NonNull Map<Class<?>, j<?, ?>> map, @NonNull List<h0.e<Object>> list, e eVar) {
        p.j zVar;
        y.g gVar;
        this.f529b = dVar;
        this.f533f = bVar;
        this.f530c = iVar;
        this.f534g = nVar;
        this.f535h = dVar2;
        Resources resources = context.getResources();
        g gVar2 = new g();
        this.f532e = gVar2;
        k kVar = new k();
        g0.b bVar2 = gVar2.f577g;
        synchronized (bVar2) {
            bVar2.f2911a.add(kVar);
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 27) {
            p pVar = new p();
            g0.b bVar3 = gVar2.f577g;
            synchronized (bVar3) {
                bVar3.f2911a.add(pVar);
            }
        }
        List<ImageHeaderParser> e5 = gVar2.e();
        c0.a aVar2 = new c0.a(context, e5, dVar, bVar);
        c0 c0Var = new c0(dVar, new c0.g());
        y.m mVar2 = new y.m(gVar2.e(), resources.getDisplayMetrics(), dVar, bVar);
        if (!eVar.a(c.b.class) || i6 < 28) {
            y.g gVar3 = new y.g(mVar2);
            zVar = new z(mVar2, bVar);
            gVar = gVar3;
        } else {
            zVar = new t();
            gVar = new y.h();
        }
        a0.d dVar3 = new a0.d(context);
        t.c cVar = new t.c(resources);
        t.d dVar4 = new t.d(resources);
        t.b bVar4 = new t.b(resources);
        t.a aVar3 = new t.a(resources);
        y.c cVar2 = new y.c(bVar);
        d0.a aVar4 = new d0.a();
        d0.d dVar5 = new d0.d();
        ContentResolver contentResolver = context.getContentResolver();
        v.c cVar3 = new v.c();
        g0.a aVar5 = gVar2.f572b;
        synchronized (aVar5) {
            aVar5.f2908a.add(new a.C0034a(ByteBuffer.class, cVar3));
        }
        u uVar = new u(bVar);
        g0.a aVar6 = gVar2.f572b;
        synchronized (aVar6) {
            aVar6.f2908a.add(new a.C0034a(InputStream.class, uVar));
        }
        gVar2.d("Bitmap", ByteBuffer.class, Bitmap.class, gVar);
        gVar2.d("Bitmap", InputStream.class, Bitmap.class, zVar);
        gVar2.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new v(mVar2));
        gVar2.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, c0Var);
        gVar2.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new c0(dVar, new c0.c()));
        w.a<?> aVar7 = w.a.f5546a;
        gVar2.b(Bitmap.class, Bitmap.class, aVar7);
        gVar2.d("Bitmap", Bitmap.class, Bitmap.class, new b0());
        gVar2.c(Bitmap.class, cVar2);
        gVar2.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new y.a(resources, gVar));
        gVar2.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new y.a(resources, zVar));
        gVar2.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new y.a(resources, c0Var));
        gVar2.c(BitmapDrawable.class, new y.b(dVar, cVar2));
        gVar2.d("Gif", InputStream.class, c0.c.class, new c0.j(e5, aVar2, bVar));
        gVar2.d("Gif", ByteBuffer.class, c0.c.class, aVar2);
        gVar2.c(c0.c.class, new c0.d());
        gVar2.b(o.a.class, o.a.class, aVar7);
        gVar2.d("Bitmap", o.a.class, Bitmap.class, new c0.h(dVar));
        gVar2.d("legacy_append", Uri.class, Drawable.class, dVar3);
        gVar2.d("legacy_append", Uri.class, Bitmap.class, new x(dVar3, dVar));
        gVar2.g(new a.C0088a());
        gVar2.b(File.class, ByteBuffer.class, new d.b());
        gVar2.b(File.class, InputStream.class, new f.e());
        gVar2.d("legacy_append", File.class, File.class, new b0.a());
        gVar2.b(File.class, ParcelFileDescriptor.class, new f.b());
        gVar2.b(File.class, File.class, aVar7);
        gVar2.g(new k.a(bVar));
        gVar2.g(new ParcelFileDescriptorRewinder.a());
        Class cls = Integer.TYPE;
        gVar2.b(cls, InputStream.class, cVar);
        gVar2.b(cls, ParcelFileDescriptor.class, bVar4);
        gVar2.b(Integer.class, InputStream.class, cVar);
        gVar2.b(Integer.class, ParcelFileDescriptor.class, bVar4);
        gVar2.b(Integer.class, Uri.class, dVar4);
        gVar2.b(cls, AssetFileDescriptor.class, aVar3);
        gVar2.b(Integer.class, AssetFileDescriptor.class, aVar3);
        gVar2.b(cls, Uri.class, dVar4);
        gVar2.b(String.class, InputStream.class, new e.c());
        gVar2.b(Uri.class, InputStream.class, new e.c());
        gVar2.b(String.class, InputStream.class, new v.c());
        gVar2.b(String.class, ParcelFileDescriptor.class, new v.b());
        gVar2.b(String.class, AssetFileDescriptor.class, new v.a());
        gVar2.b(Uri.class, InputStream.class, new a.c(context.getAssets()));
        gVar2.b(Uri.class, ParcelFileDescriptor.class, new a.b(context.getAssets()));
        gVar2.b(Uri.class, InputStream.class, new b.a(context));
        gVar2.b(Uri.class, InputStream.class, new c.a(context));
        if (i6 >= 29) {
            gVar2.b(Uri.class, InputStream.class, new d.c(context));
            gVar2.b(Uri.class, ParcelFileDescriptor.class, new d.b(context));
        }
        gVar2.b(Uri.class, InputStream.class, new x.d(contentResolver));
        gVar2.b(Uri.class, ParcelFileDescriptor.class, new x.b(contentResolver));
        gVar2.b(Uri.class, AssetFileDescriptor.class, new x.a(contentResolver));
        gVar2.b(Uri.class, InputStream.class, new y.a());
        gVar2.b(URL.class, InputStream.class, new e.a());
        gVar2.b(Uri.class, File.class, new k.a(context));
        gVar2.b(v.g.class, InputStream.class, new a.C0078a());
        gVar2.b(byte[].class, ByteBuffer.class, new b.a());
        gVar2.b(byte[].class, InputStream.class, new b.d());
        gVar2.b(Uri.class, Uri.class, aVar7);
        gVar2.b(Drawable.class, Drawable.class, aVar7);
        gVar2.d("legacy_append", Drawable.class, Drawable.class, new a0.e());
        gVar2.h(Bitmap.class, BitmapDrawable.class, new d0.b(resources));
        gVar2.h(Bitmap.class, byte[].class, aVar4);
        gVar2.h(Drawable.class, byte[].class, new d0.c(dVar, aVar4, dVar5));
        gVar2.h(c0.c.class, byte[].class, dVar5);
        if (i6 >= 23) {
            c0 c0Var2 = new c0(dVar, new c0.d());
            gVar2.a(ByteBuffer.class, Bitmap.class, c0Var2);
            gVar2.a(ByteBuffer.class, BitmapDrawable.class, new y.a(resources, c0Var2));
        }
        this.f531d = new d(context, bVar, gVar2, new i.g(), aVar, map, list, mVar, eVar, i5);
    }

    @GuardedBy("Glide.class")
    public static void a(@NonNull Context context, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        if (f528k) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f528k = true;
        c cVar = new c();
        Context applicationContext = context.getApplicationContext();
        Collections.emptyList();
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(f0.e.a(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
            if (generatedAppGlideModule != null && !generatedAppGlideModule.c().isEmpty()) {
                Set<Class<?>> c5 = generatedAppGlideModule.c();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f0.c cVar2 = (f0.c) it.next();
                    if (c5.contains(cVar2.getClass())) {
                        if (Log.isLoggable("Glide", 3)) {
                            Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + cVar2);
                        }
                        it.remove();
                    }
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    f0.c cVar3 = (f0.c) it2.next();
                    StringBuilder g5 = androidx.activity.d.g("Discovered GlideModule from manifest: ");
                    g5.append(cVar3.getClass());
                    Log.d("Glide", g5.toString());
                }
            }
            cVar.f550n = null;
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((f0.c) it3.next()).a(applicationContext, cVar);
            }
            if (cVar.f543g == null) {
                int a5 = u.a.a();
                if (TextUtils.isEmpty("source")) {
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
                }
                cVar.f543g = new u.a(new ThreadPoolExecutor(a5, a5, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.ThreadFactoryC0069a("source", false)));
            }
            if (cVar.f544h == null) {
                int i5 = u.a.f5457d;
                if (TextUtils.isEmpty("disk-cache")) {
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                }
                cVar.f544h = new u.a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.ThreadFactoryC0069a("disk-cache", true)));
            }
            if (cVar.f551o == null) {
                int i6 = u.a.a() >= 4 ? 2 : 1;
                if (TextUtils.isEmpty("animation")) {
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                }
                cVar.f551o = new u.a(new ThreadPoolExecutor(i6, i6, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.ThreadFactoryC0069a("animation", true)));
            }
            if (cVar.f546j == null) {
                cVar.f546j = new t.j(new j.a(applicationContext));
            }
            if (cVar.f547k == null) {
                cVar.f547k = new e0.f();
            }
            if (cVar.f540d == null) {
                int i7 = cVar.f546j.f5408a;
                if (i7 > 0) {
                    cVar.f540d = new s.j(i7);
                } else {
                    cVar.f540d = new s.e();
                }
            }
            if (cVar.f541e == null) {
                cVar.f541e = new s.i(cVar.f546j.f5411d);
            }
            if (cVar.f542f == null) {
                cVar.f542f = new t.h(cVar.f546j.f5409b);
            }
            if (cVar.f545i == null) {
                cVar.f545i = new t.g(applicationContext);
            }
            if (cVar.f539c == null) {
                cVar.f539c = new m(cVar.f542f, cVar.f545i, cVar.f544h, cVar.f543g, new u.a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, u.a.f5456c, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.ThreadFactoryC0069a("source-unlimited", false))), cVar.f551o);
            }
            List<h0.e<Object>> list = cVar.f552p;
            cVar.f552p = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            e.a aVar = cVar.f538b;
            Objects.requireNonNull(aVar);
            e eVar = new e(aVar);
            b bVar = new b(applicationContext, cVar.f539c, cVar.f542f, cVar.f540d, cVar.f541e, new n(cVar.f550n, eVar), cVar.f547k, cVar.f548l, cVar.f549m, cVar.f537a, cVar.f552p, eVar);
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                f0.c cVar4 = (f0.c) it4.next();
                try {
                    cVar4.b(applicationContext, bVar, bVar.f532e);
                } catch (AbstractMethodError e5) {
                    StringBuilder g6 = androidx.activity.d.g("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                    g6.append(cVar4.getClass().getName());
                    throw new IllegalStateException(g6.toString(), e5);
                }
            }
            applicationContext.registerComponentCallbacks(bVar);
            f527j = bVar;
            f528k = false;
        } catch (PackageManager.NameNotFoundException e6) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e6);
        }
    }

    @NonNull
    public static b b(@NonNull Context context) {
        if (f527j == null) {
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (IllegalAccessException e5) {
                d(e5);
                throw null;
            } catch (InstantiationException e6) {
                d(e6);
                throw null;
            } catch (NoSuchMethodException e7) {
                d(e7);
                throw null;
            } catch (InvocationTargetException e8) {
                d(e8);
                throw null;
            }
            synchronized (b.class) {
                if (f527j == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return f527j;
    }

    @NonNull
    public static n c(@Nullable Context context) {
        Objects.requireNonNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).f534g;
    }

    public static void d(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @NonNull
    public static i f(@NonNull Context context) {
        return c(context).f(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static i g(@NonNull View view) {
        n c5 = c(view.getContext());
        Objects.requireNonNull(c5);
        if (!l0.k.h()) {
            Objects.requireNonNull(view.getContext(), "Unable to obtain a request manager for a view without a Context");
            Activity a5 = n.a(view.getContext());
            if (a5 != null) {
                Fragment fragment = null;
                androidx.fragment.app.Fragment fragment2 = null;
                if (a5 instanceof FragmentActivity) {
                    FragmentActivity fragmentActivity = (FragmentActivity) a5;
                    c5.f2522f.clear();
                    n.c(fragmentActivity.getSupportFragmentManager().getFragments(), c5.f2522f);
                    View findViewById = fragmentActivity.findViewById(R.id.content);
                    while (!view.equals(findViewById) && (fragment2 = c5.f2522f.get(view)) == null && (view.getParent() instanceof View)) {
                        view = (View) view.getParent();
                    }
                    c5.f2522f.clear();
                    if (fragment2 == null) {
                        return c5.g(fragmentActivity);
                    }
                    Objects.requireNonNull(fragment2.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
                    if (l0.k.h()) {
                        return c5.f(fragment2.getContext().getApplicationContext());
                    }
                    if (fragment2.getActivity() != null) {
                        e0.j jVar = c5.f2525i;
                        fragment2.getActivity();
                        jVar.a();
                    }
                    return c5.j(fragment2.getContext(), fragment2.getChildFragmentManager(), fragment2, fragment2.isVisible());
                }
                c5.f2523g.clear();
                c5.b(a5.getFragmentManager(), c5.f2523g);
                View findViewById2 = a5.findViewById(R.id.content);
                while (!view.equals(findViewById2) && (fragment = c5.f2523g.get(view)) == null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                c5.f2523g.clear();
                if (fragment == null) {
                    return c5.e(a5);
                }
                if (fragment.getActivity() == null) {
                    throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
                }
                if (l0.k.h()) {
                    return c5.f(fragment.getActivity().getApplicationContext());
                }
                if (fragment.getActivity() != null) {
                    e0.j jVar2 = c5.f2525i;
                    fragment.getActivity();
                    jVar2.a();
                }
                return c5.d(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
            }
        }
        return c5.f(view.getContext().getApplicationContext());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.bumptech.glide.i>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<com.bumptech.glide.i>] */
    public final void e(i iVar) {
        synchronized (this.f536i) {
            if (!this.f536i.contains(iVar)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.f536i.remove(iVar);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        l0.k.a();
        ((l0.g) this.f530c).e(0L);
        this.f529b.a();
        this.f533f.a();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.bumptech.glide.i>] */
    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i5) {
        long j5;
        l0.k.a();
        synchronized (this.f536i) {
            Iterator it = this.f536i.iterator();
            while (it.hasNext()) {
                Objects.requireNonNull((i) it.next());
            }
        }
        t.h hVar = (t.h) this.f530c;
        Objects.requireNonNull(hVar);
        if (i5 >= 40) {
            hVar.e(0L);
        } else if (i5 >= 20 || i5 == 15) {
            synchronized (hVar) {
                j5 = hVar.f3934b;
            }
            hVar.e(j5 / 2);
        }
        this.f529b.trimMemory(i5);
        this.f533f.trimMemory(i5);
    }
}
