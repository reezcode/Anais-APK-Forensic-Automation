package l0;

import android.os.SystemClock;

/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final double f3931a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3932b = 0;

    public static double a(long j5) {
        return (SystemClock.elapsedRealtimeNanos() - j5) * f3931a;
    }
}
