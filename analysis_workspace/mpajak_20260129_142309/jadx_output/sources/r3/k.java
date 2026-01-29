package r3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmField;
import kotlin.ranges.RangesKt;
import q3.s;

/* loaded from: classes13.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public static final long f5068a;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final int f5069b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final int f5070c;

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final long f5071d;

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public static e f5072e;

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public static final i f5073f;

    /* renamed from: g, reason: collision with root package name */
    @JvmField
    public static final i f5074g;

    static {
        long z4;
        long z5;
        z4 = i.g.z("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        f5068a = z4;
        f5069b = i.g.C("kotlinx.coroutines.scheduler.core.pool.size", RangesKt.coerceAtLeast(s.f4790a, 2), 1, 0, 8);
        f5070c = i.g.C("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        z5 = i.g.z("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE);
        f5071d = timeUnit.toNanos(z5);
        f5072e = e.f5062b;
        f5073f = new i(0);
        f5074g = new i(1);
    }
}
