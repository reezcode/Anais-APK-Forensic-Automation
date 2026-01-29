package s3;

import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import w3.e;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public ThreadPoolExecutor f5260a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<e.a> f5261b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque<e.a> f5262c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque<w3.e> f5263d = new ArrayDeque<>();

    public final void a(e.a call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.f5846b.decrementAndGet();
        ArrayDeque<e.a> arrayDeque = this.f5262c;
        synchronized (this) {
            if (!arrayDeque.remove(call)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            Unit unit = Unit.INSTANCE;
        }
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.m.b():boolean");
    }
}
