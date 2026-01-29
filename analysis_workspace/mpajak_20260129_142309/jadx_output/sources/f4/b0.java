package f4;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class b0 {

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final a f2836d = new a();

    /* renamed from: a, reason: collision with root package name */
    public boolean f2837a;

    /* renamed from: b, reason: collision with root package name */
    public long f2838b;

    /* renamed from: c, reason: collision with root package name */
    public long f2839c;

    /* loaded from: classes16.dex */
    public static final class a extends b0 {
        @Override // f4.b0
        public final b0 d(long j5) {
            return this;
        }

        @Override // f4.b0
        public final void f() {
        }

        @Override // f4.b0
        public final b0 g(long j5, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this;
        }
    }

    public b0 a() {
        this.f2837a = false;
        return this;
    }

    public b0 b() {
        this.f2839c = 0L;
        return this;
    }

    public long c() {
        if (this.f2837a) {
            return this.f2838b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public b0 d(long j5) {
        this.f2837a = true;
        this.f2838b = j5;
        return this;
    }

    public boolean e() {
        return this.f2837a;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f2837a && this.f2838b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public b0 g(long j5, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (!(j5 >= 0)) {
            throw new IllegalArgumentException(androidx.activity.result.a.d("timeout < 0: ", j5).toString());
        }
        this.f2839c = unit.toNanos(j5);
        return this;
    }

    public long h() {
        return this.f2839c;
    }
}
