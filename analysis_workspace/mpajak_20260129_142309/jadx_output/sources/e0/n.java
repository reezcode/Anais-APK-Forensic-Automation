package e0;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.c;
import com.bumptech.glide.manager.RequestManagerFragment;
import e0.q;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class n implements Handler.Callback {

    /* renamed from: j, reason: collision with root package name */
    public static final a f2516j = new a();

    /* renamed from: a, reason: collision with root package name */
    public volatile com.bumptech.glide.i f2517a;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f2520d;

    /* renamed from: e, reason: collision with root package name */
    public final b f2521e;

    /* renamed from: i, reason: collision with root package name */
    public final j f2525i;

    /* renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public final Map<FragmentManager, RequestManagerFragment> f2518b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    @VisibleForTesting
    public final Map<androidx.fragment.app.FragmentManager, q> f2519c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayMap<View, Fragment> f2522f = new ArrayMap<>();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayMap<View, android.app.Fragment> f2523g = new ArrayMap<>();

    /* renamed from: h, reason: collision with root package name */
    public final Bundle f2524h = new Bundle();

    /* loaded from: classes3.dex */
    public class a implements b {
    }

    /* loaded from: classes21.dex */
    public interface b {
    }

    public n(@Nullable b bVar, com.bumptech.glide.e eVar) {
        this.f2521e = bVar == null ? f2516j : bVar;
        this.f2520d = new Handler(Looper.getMainLooper(), this);
        this.f2525i = (y.r.f6013h && y.r.f6012g) ? eVar.a(c.d.class) ? new h() : new i() : new g();
    }

    @Nullable
    public static Activity a(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void c(@Nullable Collection<Fragment> collection, @NonNull Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                c(fragment.getChildFragmentManager().getFragments(), map);
            }
        }
    }

    @TargetApi(26)
    @Deprecated
    public final void b(@NonNull FragmentManager fragmentManager, @NonNull ArrayMap<View, android.app.Fragment> arrayMap) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    arrayMap.put(fragment.getView(), fragment);
                    b(fragment.getChildFragmentManager(), arrayMap);
                }
            }
            return;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            this.f2524h.putInt("key", i5);
            android.app.Fragment fragment2 = null;
            try {
                fragment2 = fragmentManager.getFragment(this.f2524h, "key");
            } catch (Exception unused) {
            }
            if (fragment2 == null) {
                return;
            }
            if (fragment2.getView() != null) {
                arrayMap.put(fragment2.getView(), fragment2);
                b(fragment2.getChildFragmentManager(), arrayMap);
            }
            i5 = i6;
        }
    }

    @NonNull
    @Deprecated
    public final com.bumptech.glide.i d(@NonNull Context context, @NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment, boolean z4) {
        RequestManagerFragment h5 = h(fragmentManager, fragment);
        com.bumptech.glide.i iVar = h5.f633e;
        if (iVar != null) {
            return iVar;
        }
        com.bumptech.glide.b b5 = com.bumptech.glide.b.b(context);
        b bVar = this.f2521e;
        e0.a aVar = h5.f630b;
        RequestManagerFragment.a aVar2 = h5.f631c;
        Objects.requireNonNull((a) bVar);
        com.bumptech.glide.i iVar2 = new com.bumptech.glide.i(b5, aVar, aVar2, context);
        if (z4) {
            iVar2.onStart();
        }
        h5.f633e = iVar2;
        return iVar2;
    }

    @NonNull
    public final com.bumptech.glide.i e(@NonNull Activity activity) {
        if (l0.k.h()) {
            return f(activity.getApplicationContext());
        }
        if (activity instanceof FragmentActivity) {
            return g((FragmentActivity) activity);
        }
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f2525i.a();
        FragmentManager fragmentManager = activity.getFragmentManager();
        Activity a5 = a(activity);
        return d(activity, fragmentManager, null, a5 == null || !a5.isFinishing());
    }

    @NonNull
    public final com.bumptech.glide.i f(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (l0.k.i() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return g((FragmentActivity) context);
            }
            if (context instanceof Activity) {
                return e((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return f(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f2517a == null) {
            synchronized (this) {
                if (this.f2517a == null) {
                    com.bumptech.glide.b b5 = com.bumptech.glide.b.b(context.getApplicationContext());
                    b bVar = this.f2521e;
                    e0.b bVar2 = new e0.b();
                    d1.d dVar = new d1.d();
                    Context applicationContext = context.getApplicationContext();
                    Objects.requireNonNull((a) bVar);
                    this.f2517a = new com.bumptech.glide.i(b5, bVar2, dVar, applicationContext);
                }
            }
        }
        return this.f2517a;
    }

    @NonNull
    public final com.bumptech.glide.i g(@NonNull FragmentActivity fragmentActivity) {
        if (l0.k.h()) {
            return f(fragmentActivity.getApplicationContext());
        }
        if (fragmentActivity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f2525i.a();
        androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Activity a5 = a(fragmentActivity);
        return j(fragmentActivity, supportFragmentManager, null, a5 == null || !a5.isFinishing());
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashMap, java.util.Map<android.app.FragmentManager, com.bumptech.glide.manager.RequestManagerFragment>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.HashMap, java.util.Map<android.app.FragmentManager, com.bumptech.glide.manager.RequestManagerFragment>] */
    @NonNull
    public final RequestManagerFragment h(@NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment) {
        RequestManagerFragment requestManagerFragment = (RequestManagerFragment) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (requestManagerFragment == null && (requestManagerFragment = (RequestManagerFragment) this.f2518b.get(fragmentManager)) == null) {
            requestManagerFragment = new RequestManagerFragment();
            requestManagerFragment.f635g = fragment;
            if (fragment != null && fragment.getActivity() != null) {
                requestManagerFragment.a(fragment.getActivity());
            }
            this.f2518b.put(fragmentManager, requestManagerFragment);
            fragmentManager.beginTransaction().add(requestManagerFragment, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f2520d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return requestManagerFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        ?? r02;
        Object obj2;
        int i5 = message.what;
        Object obj3 = null;
        boolean z4 = true;
        if (i5 == 1) {
            obj = (FragmentManager) message.obj;
            r02 = this.f2518b;
        } else {
            if (i5 != 2) {
                z4 = false;
                obj2 = null;
                if (z4 && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
                }
                return z4;
            }
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            r02 = this.f2519c;
        }
        Object obj4 = obj;
        obj3 = r02.remove(obj4);
        obj2 = obj4;
        if (z4) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z4;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashMap, java.util.Map<androidx.fragment.app.FragmentManager, e0.q>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.HashMap, java.util.Map<androidx.fragment.app.FragmentManager, e0.q>] */
    @NonNull
    public final q i(@NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable Fragment fragment) {
        q qVar = (q) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (qVar == null && (qVar = (q) this.f2519c.get(fragmentManager)) == null) {
            qVar = new q();
            qVar.f2534g = fragment;
            if (fragment != null && fragment.getContext() != null) {
                Fragment fragment2 = fragment;
                while (fragment2.getParentFragment() != null) {
                    fragment2 = fragment2.getParentFragment();
                }
                androidx.fragment.app.FragmentManager fragmentManager2 = fragment2.getFragmentManager();
                if (fragmentManager2 != null) {
                    qVar.b(fragment.getContext(), fragmentManager2);
                }
            }
            this.f2519c.put(fragmentManager, qVar);
            fragmentManager.beginTransaction().add(qVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f2520d.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return qVar;
    }

    @NonNull
    public final com.bumptech.glide.i j(@NonNull Context context, @NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable Fragment fragment, boolean z4) {
        q i5 = i(fragmentManager, fragment);
        com.bumptech.glide.i iVar = i5.f2533f;
        if (iVar != null) {
            return iVar;
        }
        com.bumptech.glide.b b5 = com.bumptech.glide.b.b(context);
        b bVar = this.f2521e;
        e0.a aVar = i5.f2529b;
        q.a aVar2 = i5.f2530c;
        Objects.requireNonNull((a) bVar);
        com.bumptech.glide.i iVar2 = new com.bumptech.glide.i(b5, aVar, aVar2, context);
        if (z4) {
            iVar2.onStart();
        }
        i5.f2533f = iVar2;
        return iVar2;
    }
}
