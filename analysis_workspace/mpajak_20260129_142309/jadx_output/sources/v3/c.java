package v3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import k.j0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import v3.d;

/* loaded from: classes20.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5706a;

    /* renamed from: b, reason: collision with root package name */
    public a f5707b;

    /* renamed from: c, reason: collision with root package name */
    public final List<a> f5708c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5709d;

    /* renamed from: e, reason: collision with root package name */
    public final d f5710e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5711f;

    public c(d taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f5710e = taskRunner;
        this.f5711f = name;
        this.f5708c = new ArrayList();
    }

    public final void a() {
        byte[] bArr = t3.c.f5449a;
        synchronized (this.f5710e) {
            if (b()) {
                this.f5710e.e(this);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<v3.a>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<v3.a>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<v3.a>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<v3.a>] */
    public final boolean b() {
        a aVar = this.f5707b;
        if (aVar != null) {
            Intrinsics.checkNotNull(aVar);
            if (aVar.f5704d) {
                this.f5709d = true;
            }
        }
        boolean z4 = false;
        for (int size = this.f5708c.size() - 1; size >= 0; size--) {
            if (((a) this.f5708c.get(size)).f5704d) {
                a aVar2 = (a) this.f5708c.get(size);
                d.b bVar = d.f5714j;
                if (d.f5713i.isLoggable(Level.FINE)) {
                    j0.b(aVar2, this, "canceled");
                }
                this.f5708c.remove(size);
                z4 = true;
            }
        }
        return z4;
    }

    public final void c(a task, long j5) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f5710e) {
            if (!this.f5706a) {
                if (e(task, j5, false)) {
                    this.f5710e.e(this);
                }
                Unit unit = Unit.INSTANCE;
            } else if (task.f5704d) {
                Objects.requireNonNull(d.f5714j);
                if (d.f5713i.isLoggable(Level.FINE)) {
                    j0.b(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Objects.requireNonNull(d.f5714j);
                if (d.f5713i.isLoggable(Level.FINE)) {
                    j0.b(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<v3.a>] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.ArrayList, java.util.List<v3.a>] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList, java.util.List<v3.a>] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.ArrayList, java.util.List<v3.a>] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList, java.util.List<v3.a>] */
    public final boolean e(a task, long j5, boolean z4) {
        StringBuilder sb;
        String str;
        Intrinsics.checkNotNullParameter(task, "task");
        Objects.requireNonNull(task);
        Intrinsics.checkNotNullParameter(this, "queue");
        c cVar = task.f5701a;
        if (cVar != this) {
            if (!(cVar == null)) {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
            task.f5701a = this;
        }
        long c5 = this.f5710e.f5721g.c();
        long j6 = c5 + j5;
        int indexOf = this.f5708c.indexOf(task);
        if (indexOf != -1) {
            if (task.f5702b <= j6) {
                d.b bVar = d.f5714j;
                if (d.f5713i.isLoggable(Level.FINE)) {
                    j0.b(task, this, "already scheduled");
                }
                return false;
            }
            this.f5708c.remove(indexOf);
        }
        task.f5702b = j6;
        d.b bVar2 = d.f5714j;
        if (d.f5713i.isLoggable(Level.FINE)) {
            if (z4) {
                sb = new StringBuilder();
                str = "run again after ";
            } else {
                sb = new StringBuilder();
                str = "scheduled after ";
            }
            sb.append(str);
            sb.append(j0.e(j6 - c5));
            j0.b(task, this, sb.toString());
        }
        Iterator it = this.f5708c.iterator();
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                i5 = -1;
                break;
            }
            if (((a) it.next()).f5702b - c5 > j5) {
                break;
            }
            i5++;
        }
        if (i5 == -1) {
            i5 = this.f5708c.size();
        }
        this.f5708c.add(i5, task);
        return i5 == 0;
    }

    public final void f() {
        byte[] bArr = t3.c.f5449a;
        synchronized (this.f5710e) {
            this.f5706a = true;
            if (b()) {
                this.f5710e.e(this);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final String toString() {
        return this.f5711f;
    }
}
