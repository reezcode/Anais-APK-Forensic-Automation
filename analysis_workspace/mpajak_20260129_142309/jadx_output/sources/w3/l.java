package w3;

import a4.h;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s3.e0;
import w3.e;

/* loaded from: classes23.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f5876a;

    /* renamed from: b, reason: collision with root package name */
    public final v3.c f5877b;

    /* renamed from: c, reason: collision with root package name */
    public final k f5878c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue<j> f5879d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5880e;

    public l(v3.d taskRunner) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f5880e = 5;
        this.f5876a = timeUnit.toNanos(5L);
        this.f5877b = taskRunner.f();
        this.f5878c = new k(this, androidx.appcompat.graphics.drawable.a.c(new StringBuilder(), t3.c.f5455g, " ConnectionPool"));
        this.f5879d = new ConcurrentLinkedQueue<>();
    }

    public final boolean a(s3.a address, e call, List<e0> list, boolean z4) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator<j> it = this.f5879d.iterator();
        while (it.hasNext()) {
            j connection = it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (z4) {
                    if (!connection.j()) {
                        Unit unit = Unit.INSTANCE;
                    }
                }
                if (connection.h(address, list)) {
                    call.b(connection);
                    return true;
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List, java.util.List<java.lang.ref.Reference<w3.e>>] */
    public final int b(j jVar, long j5) {
        byte[] bArr = t3.c.f5449a;
        ?? r02 = jVar.f5872o;
        int i5 = 0;
        while (i5 < r02.size()) {
            Reference reference = (Reference) r02.get(i5);
            if (reference.get() != null) {
                i5++;
            } else {
                StringBuilder g5 = androidx.activity.d.g("A connection to ");
                g5.append(jVar.f5874q.f5197a.f5138a);
                g5.append(" was leaked. ");
                g5.append("Did you forget to close a response body?");
                String sb = g5.toString();
                h.a aVar = a4.h.f116c;
                a4.h.f114a.k(sb, ((e.b) reference).f5849a);
                r02.remove(i5);
                jVar.f5866i = true;
                if (r02.isEmpty()) {
                    jVar.f5873p = j5 - this.f5876a;
                    return 0;
                }
            }
        }
        return r02.size();
    }
}
