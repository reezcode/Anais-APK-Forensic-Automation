package r0;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.WorkerThread;
import androidx.collection.ArraySet;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import s0.d;

/* loaded from: classes7.dex */
public final class b implements Handler.Callback {

    /* renamed from: i, reason: collision with root package name */
    public static final Status f5012i = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: j, reason: collision with root package name */
    public static final Status f5013j = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: k, reason: collision with root package name */
    public static final Object f5014k = new Object();

    /* renamed from: l, reason: collision with root package name */
    @GuardedBy("lock")
    public static b f5015l;

    /* renamed from: a, reason: collision with root package name */
    public long f5016a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5017b;

    /* renamed from: c, reason: collision with root package name */
    public final p0.c f5018c;

    /* renamed from: d, reason: collision with root package name */
    public final s0.c f5019d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<j<?>, a<?>> f5020e;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("lock")
    public final Set<j<?>> f5021f;

    /* renamed from: g, reason: collision with root package name */
    public final Set<j<?>> f5022g;

    /* renamed from: h, reason: collision with root package name */
    public final b1.a f5023h;

    /* loaded from: classes6.dex */
    public class a<O> {

        /* renamed from: a, reason: collision with root package name */
        public final Queue<f> f5024a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f5025b;

        /* renamed from: c, reason: collision with root package name */
        public final List<C0064b> f5026c;

        /* renamed from: d, reason: collision with root package name */
        public p0.a f5027d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f5028e;

        @WorkerThread
        public final void a() {
            s0.e.b(this.f5028e.f5023h);
            throw null;
        }

        @WorkerThread
        public final void b() {
            s0.e.b(this.f5028e.f5023h);
            this.f5027d = null;
        }

        @WorkerThread
        public final void c() {
            if (this.f5025b) {
                this.f5028e.f5023h.removeMessages(11, null);
                this.f5028e.f5023h.removeMessages(9, null);
                this.f5025b = false;
            }
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [java.util.LinkedList, java.util.Queue<r0.f>] */
        @WorkerThread
        public final void d(Status status) {
            s0.e.b(this.f5028e.f5023h);
            Iterator<f> it = this.f5024a.iterator();
            while (it.hasNext()) {
                it.next().a(status);
            }
            this.f5024a.clear();
        }
    }

    /* renamed from: r0.b$b, reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C0064b {

        /* renamed from: a, reason: collision with root package name */
        public final j<?> f5029a;

        /* renamed from: b, reason: collision with root package name */
        public final p0.b f5030b;

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C0064b)) {
                C0064b c0064b = (C0064b) obj;
                if (s0.d.a(this.f5029a, c0064b.f5029a) && s0.d.a(this.f5030b, c0064b.f5030b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f5029a, this.f5030b});
        }

        public final String toString() {
            d.a aVar = new d.a(this);
            aVar.a("key", this.f5029a);
            aVar.a("feature", this.f5030b);
            return aVar.toString();
        }
    }

    public b(Context context, Looper looper) {
        p0.c cVar = p0.c.f4631c;
        this.f5016a = WorkRequest.MIN_BACKOFF_MILLIS;
        new AtomicInteger(1);
        new AtomicInteger(0);
        this.f5020e = new ConcurrentHashMap(5, 0.75f, 1);
        this.f5021f = new ArraySet();
        this.f5022g = new ArraySet();
        this.f5017b = context;
        b1.a aVar = new b1.a(looper, this);
        this.f5023h = aVar;
        this.f5018c = cVar;
        this.f5019d = new s0.c();
        aVar.sendMessage(aVar.obtainMessage(6));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map<r0.j<?>, r0.b$a<?>>, java.util.concurrent.ConcurrentHashMap] */
    @WorkerThread
    public final void a(q0.a<?> aVar) {
        Objects.requireNonNull(aVar);
        if (((a) this.f5020e.get(null)) != null) {
            throw null;
        }
        new LinkedList();
        new HashSet();
        new HashMap();
        new ArrayList();
        this.f5023h.getLooper();
        new ArraySet().addAll(Collections.emptySet());
        throw null;
    }

    public final boolean b(p0.a aVar, int i5) {
        p0.c cVar = this.f5018c;
        Context context = this.f5017b;
        Objects.requireNonNull(cVar);
        int i6 = aVar.f4624c;
        PendingIntent pendingIntent = null;
        if ((i6 == 0 || aVar.f4625d == null) ? false : true) {
            pendingIntent = aVar.f4625d;
        } else {
            Intent a5 = cVar.a(context, i6, null);
            if (a5 != null) {
                pendingIntent = PendingIntent.getActivity(context, 0, a5, 134217728);
            }
        }
        if (pendingIntent == null) {
            return false;
        }
        int i7 = aVar.f4624c;
        int i8 = GoogleApiActivity.f639c;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i5);
        intent.putExtra("notify_manager", true);
        cVar.e(context, i7, PendingIntent.getActivity(context, 0, intent, 134217728));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Map<r0.j<?>, r0.b$a<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.Map<r0.j<?>, r0.b$a<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.Map<r0.j<?>, r0.b$a<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.Map<r0.j<?>, r0.b$a<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.Map<r0.j<?>, r0.b$a<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.util.Map<r0.j<?>, r0.b$a<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.Map<r0.j<?>, r0.b$a<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.Map<r0.j<?>, r0.b$a<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.Map<r0.j<?>, r0.b$a<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.util.Map<r0.j<?>, r0.b$a<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Map<r0.j<?>, r0.b$a<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.ArrayList, java.util.List<r0.b$b>] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.ArrayList, java.util.List<r0.b$b>] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.LinkedList, java.util.Queue<r0.f>] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Map<r0.j<?>, r0.b$a<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.LinkedList, java.util.Queue<r0.f>] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.Map<r0.j<?>, r0.b$a<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.Map<r0.j<?>, r0.b$a<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r8v60, types: [java.util.Map<r0.j<?>, r0.b$a<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r8v62, types: [java.util.Map<r0.j<?>, r0.b$a<?>>, java.util.concurrent.ConcurrentHashMap] */
    @Override // android.os.Handler.Callback
    @WorkerThread
    public final boolean handleMessage(Message message) {
        int i5 = message.what;
        a aVar = null;
        long j5 = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        int i6 = 0;
        switch (i5) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j5 = WorkRequest.MIN_BACKOFF_MILLIS;
                }
                this.f5016a = j5;
                this.f5023h.removeMessages(12);
                for (j jVar : this.f5020e.keySet()) {
                    b1.a aVar2 = this.f5023h;
                    aVar2.sendMessageDelayed(aVar2.obtainMessage(12, jVar), this.f5016a);
                }
                return true;
            case 2:
                Objects.requireNonNull((k) message.obj);
                throw null;
            case 3:
                Iterator it = this.f5020e.values().iterator();
                if (it.hasNext()) {
                    a aVar3 = (a) it.next();
                    aVar3.b();
                    aVar3.a();
                    throw null;
                }
                return true;
            case 4:
            case 8:
            case 13:
                Objects.requireNonNull((h) message.obj);
                throw null;
            case 5:
                int i7 = message.arg1;
                p0.a aVar4 = (p0.a) message.obj;
                Iterator it2 = this.f5020e.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        a aVar5 = (a) it2.next();
                        Objects.requireNonNull(aVar5);
                        if (i7 == 0) {
                            aVar = aVar5;
                        }
                    }
                }
                if (aVar != null) {
                    p0.c cVar = this.f5018c;
                    int i8 = aVar4.f4624c;
                    Objects.requireNonNull(cVar);
                    AtomicBoolean atomicBoolean = p0.f.f4636a;
                    String j6 = p0.a.j(i8);
                    String str = aVar4.f4626e;
                    StringBuilder sb = new StringBuilder(androidx.activity.d.b(str, androidx.activity.d.b(j6, 69)));
                    sb.append("Error resolution was canceled by the user, original error message: ");
                    sb.append(j6);
                    sb.append(": ");
                    sb.append(str);
                    aVar.d(new Status(17, sb.toString()));
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i7);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                }
                return true;
            case 6:
                if (this.f5017b.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.f5017b.getApplicationContext();
                    r0.a aVar6 = r0.a.f5007f;
                    synchronized (aVar6) {
                        if (!aVar6.f5011e) {
                            application.registerActivityLifecycleCallbacks(aVar6);
                            application.registerComponentCallbacks(aVar6);
                            aVar6.f5011e = true;
                        }
                    }
                    g gVar = new g(this);
                    synchronized (aVar6) {
                        aVar6.f5010d.add(gVar);
                    }
                    if (!aVar6.f5009c.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!aVar6.f5009c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            aVar6.f5008b.set(true);
                        }
                    }
                    if (!aVar6.f5008b.get()) {
                        this.f5016a = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
                    }
                }
                return true;
            case 7:
                a((q0.a) message.obj);
                throw null;
            case 9:
                if (this.f5020e.containsKey(message.obj)) {
                    a aVar7 = (a) this.f5020e.get(message.obj);
                    s0.e.b(aVar7.f5028e.f5023h);
                    if (aVar7.f5025b) {
                        aVar7.a();
                        throw null;
                    }
                }
                return true;
            case 10:
                Iterator<j<?>> it3 = this.f5022g.iterator();
                if (!it3.hasNext()) {
                    this.f5022g.clear();
                    return true;
                }
                a aVar8 = (a) this.f5020e.remove(it3.next());
                s0.e.b(aVar8.f5028e.f5023h);
                aVar8.d(f5012i);
                throw null;
            case 11:
                if (this.f5020e.containsKey(message.obj)) {
                    a aVar9 = (a) this.f5020e.get(message.obj);
                    s0.e.b(aVar9.f5028e.f5023h);
                    if (aVar9.f5025b) {
                        aVar9.c();
                        b bVar = aVar9.f5028e;
                        aVar9.d(bVar.f5018c.c(bVar.f5017b) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                        throw null;
                    }
                }
                return true;
            case 12:
                if (this.f5020e.containsKey(message.obj)) {
                    s0.e.b(((a) this.f5020e.get(message.obj)).f5028e.f5023h);
                    throw null;
                }
                return true;
            case 14:
                Objects.requireNonNull((e) message.obj);
                if (!this.f5020e.containsKey(null)) {
                    throw null;
                }
                s0.e.b(((a) this.f5020e.get(null)).f5028e.f5023h);
                throw null;
            case 15:
                C0064b c0064b = (C0064b) message.obj;
                if (this.f5020e.containsKey(c0064b.f5029a)) {
                    a aVar10 = (a) this.f5020e.get(c0064b.f5029a);
                    if (aVar10.f5026c.contains(c0064b) && !aVar10.f5025b) {
                        throw null;
                    }
                }
                return true;
            case 16:
                C0064b c0064b2 = (C0064b) message.obj;
                if (this.f5020e.containsKey(c0064b2.f5029a)) {
                    a aVar11 = (a) this.f5020e.get(c0064b2.f5029a);
                    if (aVar11.f5026c.remove(c0064b2)) {
                        aVar11.f5028e.f5023h.removeMessages(15, c0064b2);
                        aVar11.f5028e.f5023h.removeMessages(16, c0064b2);
                        p0.b bVar2 = c0064b2.f5030b;
                        ArrayList arrayList = new ArrayList(aVar11.f5024a.size());
                        for (f fVar : aVar11.f5024a) {
                            if (fVar instanceof i) {
                                ((i) fVar).c(aVar11);
                            }
                        }
                        int size = arrayList.size();
                        while (i6 < size) {
                            Object obj = arrayList.get(i6);
                            i6++;
                            f fVar2 = (f) obj;
                            aVar11.f5024a.remove(fVar2);
                            fVar2.b(new q0.b(bVar2));
                        }
                    }
                }
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i5);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }
}
