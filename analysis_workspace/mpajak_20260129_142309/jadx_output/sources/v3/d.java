package v3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.j0;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    @JvmField
    public static final d f5712h;

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f5713i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f5714j = new b();

    /* renamed from: a, reason: collision with root package name */
    public int f5715a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5716b;

    /* renamed from: c, reason: collision with root package name */
    public long f5717c;

    /* renamed from: d, reason: collision with root package name */
    public final List<v3.c> f5718d;

    /* renamed from: e, reason: collision with root package name */
    public final List<v3.c> f5719e;

    /* renamed from: f, reason: collision with root package name */
    public final RunnableC0077d f5720f;

    /* renamed from: g, reason: collision with root package name */
    public final a f5721g;

    /* loaded from: classes2.dex */
    public interface a {
        void a(d dVar);

        void b(d dVar, long j5);

        long c();

        void execute(Runnable runnable);
    }

    /* loaded from: classes2.dex */
    public static final class b {
    }

    /* loaded from: classes21.dex */
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadPoolExecutor f5722a;

        public c(ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f5722a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // v3.d.a
        public final void a(d taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // v3.d.a
        public final void b(d taskRunner, long j5) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j6 = j5 / 1000000;
            long j7 = j5 - (1000000 * j6);
            if (j6 > 0 || j5 > 0) {
                taskRunner.wait(j6, (int) j7);
            }
        }

        @Override // v3.d.a
        public final long c() {
            return System.nanoTime();
        }

        @Override // v3.d.a
        public final void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f5722a.execute(runnable);
        }
    }

    /* renamed from: v3.d$d, reason: collision with other inner class name */
    /* loaded from: classes21.dex */
    public static final class RunnableC0077d implements Runnable {
        public RunnableC0077d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            v3.a c5;
            while (true) {
                synchronized (d.this) {
                    c5 = d.this.c();
                }
                if (c5 == null) {
                    return;
                }
                v3.c cVar = c5.f5701a;
                Intrinsics.checkNotNull(cVar);
                long j5 = -1;
                b bVar = d.f5714j;
                boolean isLoggable = d.f5713i.isLoggable(Level.FINE);
                if (isLoggable) {
                    j5 = cVar.f5710e.f5721g.c();
                    j0.b(c5, cVar, "starting");
                }
                try {
                    try {
                        d.a(d.this, c5);
                        Unit unit = Unit.INSTANCE;
                        if (isLoggable) {
                            long c6 = cVar.f5710e.f5721g.c() - j5;
                            StringBuilder g5 = androidx.activity.d.g("finished run in ");
                            g5.append(j0.e(c6));
                            j0.b(c5, cVar, g5.toString());
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        long c7 = cVar.f5710e.f5721g.c() - j5;
                        StringBuilder g6 = androidx.activity.d.g("failed a run in ");
                        g6.append(j0.e(c7));
                        j0.b(c5, cVar, g6.toString());
                    }
                    throw th;
                }
            }
        }
    }

    static {
        String name = t3.c.f5455g + " TaskRunner";
        Intrinsics.checkNotNullParameter(name, "name");
        f5712h = new d(new c(new t3.b(name, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f5713i = logger;
    }

    public d(a backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f5721g = backend;
        this.f5715a = 10000;
        this.f5718d = new ArrayList();
        this.f5719e = new ArrayList();
        this.f5720f = new RunnableC0077d();
    }

    public static final void a(d dVar, v3.a aVar) {
        Objects.requireNonNull(dVar);
        byte[] bArr = t3.c.f5449a;
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(aVar.f5703c);
        try {
            long a5 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a5);
                Unit unit = Unit.INSTANCE;
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                Unit unit2 = Unit.INSTANCE;
                currentThread.setName(name);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<v3.c>] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList, java.util.List<v3.a>] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList, java.util.List<v3.c>] */
    public final void b(v3.a aVar, long j5) {
        byte[] bArr = t3.c.f5449a;
        v3.c cVar = aVar.f5701a;
        Intrinsics.checkNotNull(cVar);
        if (!(cVar.f5707b == aVar)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean z4 = cVar.f5709d;
        cVar.f5709d = false;
        cVar.f5707b = null;
        this.f5718d.remove(cVar);
        if (j5 != -1 && !z4 && !cVar.f5706a) {
            cVar.e(aVar, j5, true);
        }
        if (!cVar.f5708c.isEmpty()) {
            this.f5719e.add(cVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<v3.c>] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList, java.util.List<v3.c>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<v3.c>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<v3.a>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<v3.c>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<v3.c>] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList, java.util.List<v3.a>] */
    public final v3.a c() {
        boolean z4;
        byte[] bArr = t3.c.f5449a;
        while (!this.f5719e.isEmpty()) {
            long c5 = this.f5721g.c();
            long j5 = Long.MAX_VALUE;
            Iterator it = this.f5719e.iterator();
            v3.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z4 = false;
                    break;
                }
                v3.a aVar2 = (v3.a) ((v3.c) it.next()).f5708c.get(0);
                long max = Math.max(0L, aVar2.f5702b - c5);
                if (max > 0) {
                    j5 = Math.min(max, j5);
                } else {
                    if (aVar != null) {
                        z4 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                byte[] bArr2 = t3.c.f5449a;
                aVar.f5702b = -1L;
                v3.c cVar = aVar.f5701a;
                Intrinsics.checkNotNull(cVar);
                cVar.f5708c.remove(aVar);
                this.f5719e.remove(cVar);
                cVar.f5707b = aVar;
                this.f5718d.add(cVar);
                if (z4 || (!this.f5716b && (!this.f5719e.isEmpty()))) {
                    this.f5721g.execute(this.f5720f);
                }
                return aVar;
            }
            if (this.f5716b) {
                if (j5 < this.f5717c - c5) {
                    this.f5721g.a(this);
                }
                return null;
            }
            this.f5716b = true;
            this.f5717c = c5 + j5;
            try {
                try {
                    this.f5721g.b(this, j5);
                } catch (InterruptedException unused) {
                    d();
                }
            } finally {
                this.f5716b = false;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<v3.c>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<v3.c>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<v3.c>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<v3.a>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList, java.util.List<v3.c>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList, java.util.List<v3.c>] */
    public final void d() {
        int size = this.f5718d.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                ((v3.c) this.f5718d.get(size)).b();
            }
        }
        int size2 = this.f5719e.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            }
            v3.c cVar = (v3.c) this.f5719e.get(size2);
            cVar.b();
            if (cVar.f5708c.isEmpty()) {
                this.f5719e.remove(size2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<v3.a>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<v3.c>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.ArrayList, java.util.List, java.util.List<v3.c>] */
    public final void e(v3.c taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        byte[] bArr = t3.c.f5449a;
        if (taskQueue.f5707b == null) {
            if (!taskQueue.f5708c.isEmpty()) {
                ?? addIfAbsent = this.f5719e;
                Intrinsics.checkNotNullParameter(addIfAbsent, "$this$addIfAbsent");
                if (!addIfAbsent.contains(taskQueue)) {
                    addIfAbsent.add(taskQueue);
                }
            } else {
                this.f5719e.remove(taskQueue);
            }
        }
        if (this.f5716b) {
            this.f5721g.a(this);
        } else {
            this.f5721g.execute(this.f5720f);
        }
    }

    public final v3.c f() {
        int i5;
        synchronized (this) {
            i5 = this.f5715a;
            this.f5715a = i5 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i5);
        return new v3.c(this, sb.toString());
    }
}
