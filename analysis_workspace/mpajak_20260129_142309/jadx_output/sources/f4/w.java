package f4;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final int f2902b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference<v>[] f2903c;

    /* renamed from: d, reason: collision with root package name */
    public static final w f2904d = new w();

    /* renamed from: a, reason: collision with root package name */
    public static final v f2901a = new v(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f2902b = highestOneBit;
        AtomicReference<v>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i5 = 0; i5 < highestOneBit; i5++) {
            atomicReferenceArr[i5] = new AtomicReference<>();
        }
        f2903c = atomicReferenceArr;
    }

    @JvmStatic
    public static final void b(v segment) {
        AtomicReference<v> a5;
        v vVar;
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (!(segment.f2899f == null && segment.f2900g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.f2897d || (vVar = (a5 = f2904d.a()).get()) == f2901a) {
            return;
        }
        int i5 = vVar != null ? vVar.f2896c : 0;
        if (i5 >= 65536) {
            return;
        }
        segment.f2899f = vVar;
        segment.f2895b = 0;
        segment.f2896c = i5 + 8192;
        if (a5.compareAndSet(vVar, segment)) {
            return;
        }
        segment.f2899f = null;
    }

    @JvmStatic
    public static final v c() {
        AtomicReference<v> a5 = f2904d.a();
        v vVar = f2901a;
        v andSet = a5.getAndSet(vVar);
        if (andSet == vVar) {
            return new v();
        }
        if (andSet == null) {
            a5.set(null);
            return new v();
        }
        a5.set(andSet.f2899f);
        andSet.f2899f = null;
        andSet.f2896c = 0;
        return andSet;
    }

    public final AtomicReference<v> a() {
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "Thread.currentThread()");
        return f2903c[(int) (currentThread.getId() & (f2902b - 1))];
    }
}
