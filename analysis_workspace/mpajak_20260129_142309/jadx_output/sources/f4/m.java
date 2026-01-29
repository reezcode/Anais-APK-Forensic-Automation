package f4;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class m extends b0 {

    /* renamed from: e, reason: collision with root package name */
    public b0 f2870e;

    public m(b0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f2870e = delegate;
    }

    @Override // f4.b0
    public final b0 a() {
        return this.f2870e.a();
    }

    @Override // f4.b0
    public final b0 b() {
        return this.f2870e.b();
    }

    @Override // f4.b0
    public final long c() {
        return this.f2870e.c();
    }

    @Override // f4.b0
    public final b0 d(long j5) {
        return this.f2870e.d(j5);
    }

    @Override // f4.b0
    public final boolean e() {
        return this.f2870e.e();
    }

    @Override // f4.b0
    public final void f() {
        this.f2870e.f();
    }

    @Override // f4.b0
    public final b0 g(long j5, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f2870e.g(j5, unit);
    }

    @Override // f4.b0
    public final long h() {
        return this.f2870e.h();
    }
}
