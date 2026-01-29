package d1;

import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes15.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<h, List<Throwable>> f2482a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b, reason: collision with root package name */
    public final ReferenceQueue<Throwable> f2483b = new ReferenceQueue<>();
}
