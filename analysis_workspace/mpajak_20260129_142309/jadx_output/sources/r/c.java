package r;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import r.q;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4814a;

    /* renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public final Map<p.f, a> f4815b;

    /* renamed from: c, reason: collision with root package name */
    public final ReferenceQueue<q<?>> f4816c;

    /* renamed from: d, reason: collision with root package name */
    public q.a f4817d;

    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static final class a extends WeakReference<q<?>> {

        /* renamed from: a, reason: collision with root package name */
        public final p.f f4818a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f4819b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        public w<?> f4820c;

        public a(@NonNull p.f fVar, @NonNull q<?> qVar, @NonNull ReferenceQueue<? super q<?>> referenceQueue, boolean z4) {
            super(qVar, referenceQueue);
            w<?> wVar;
            Objects.requireNonNull(fVar, "Argument must not be null");
            this.f4818a = fVar;
            if (qVar.f4961b && z4) {
                wVar = qVar.f4963d;
                Objects.requireNonNull(wVar, "Argument must not be null");
            } else {
                wVar = null;
            }
            this.f4820c = wVar;
            this.f4819b = qVar.f4961b;
        }
    }

    public c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new r.a());
        this.f4815b = new HashMap();
        this.f4816c = new ReferenceQueue<>();
        this.f4814a = false;
        newSingleThreadExecutor.execute(new b(this));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.HashMap, java.util.Map<p.f, r.c$a>] */
    public final synchronized void a(p.f fVar, q<?> qVar) {
        a aVar = (a) this.f4815b.put(fVar, new a(fVar, qVar, this.f4816c, this.f4814a));
        if (aVar != null) {
            aVar.f4820c = null;
            aVar.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<p.f, r.c$a>] */
    public final void b(@NonNull a aVar) {
        w<?> wVar;
        synchronized (this) {
            this.f4815b.remove(aVar.f4818a);
            if (aVar.f4819b && (wVar = aVar.f4820c) != null) {
                this.f4817d.a(aVar.f4818a, new q<>(wVar, true, false, aVar.f4818a, this.f4817d));
            }
        }
    }
}
