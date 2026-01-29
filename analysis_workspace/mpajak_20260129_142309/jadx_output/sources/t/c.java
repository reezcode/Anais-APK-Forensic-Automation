package t;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, a> f5393a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final b f5394b = new b();

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ReentrantLock f5395a = new ReentrantLock();

        /* renamed from: b, reason: collision with root package name */
        public int f5396b;
    }

    /* loaded from: classes23.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Queue<a> f5397a = new ArrayDeque();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, t.c$a>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.HashMap, java.util.Map<java.lang.String, t.c$a>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayDeque, java.util.Queue<t.c$a>] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayDeque, java.util.Queue<t.c$a>] */
    public final void a(String str) {
        a aVar;
        synchronized (this) {
            Object obj = this.f5393a.get(str);
            Objects.requireNonNull(obj, "Argument must not be null");
            aVar = (a) obj;
            int i5 = aVar.f5396b;
            if (i5 < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f5396b);
            }
            int i6 = i5 - 1;
            aVar.f5396b = i6;
            if (i6 == 0) {
                a aVar2 = (a) this.f5393a.remove(str);
                if (!aVar2.equals(aVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                }
                b bVar = this.f5394b;
                synchronized (bVar.f5397a) {
                    if (bVar.f5397a.size() < 10) {
                        bVar.f5397a.offer(aVar2);
                    }
                }
            }
        }
        aVar.f5395a.unlock();
    }
}
