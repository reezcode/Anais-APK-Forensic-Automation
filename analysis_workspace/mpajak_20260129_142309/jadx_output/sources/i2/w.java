package i2;

import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public abstract class w implements x {

    /* renamed from: b, reason: collision with root package name */
    public static final a f3306b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f3307c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f3308d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f3309e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w[] f3310f;

    /* loaded from: classes5.dex */
    public enum a extends w {
        public a() {
            super("DOUBLE", 0, null);
        }

        @Override // i2.x
        public final Number a(p2.a aVar) {
            return Double.valueOf(aVar.y());
        }
    }

    /* loaded from: classes15.dex */
    public enum b extends w {
        public b() {
            super("LAZILY_PARSED_NUMBER", 1, null);
        }

        @Override // i2.x
        public final Number a(p2.a aVar) {
            return new k2.o(aVar.K());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [i2.w$c] */
    /* JADX WARN: Type inference failed for: r5v0, types: [i2.w$d] */
    static {
        a aVar = new a();
        f3306b = aVar;
        b bVar = new b();
        f3307c = bVar;
        ?? r32 = new w() { // from class: i2.w.c
            @Override // i2.x
            public final Number a(p2.a aVar2) {
                String K = aVar2.K();
                try {
                    try {
                        return Long.valueOf(Long.parseLong(K));
                    } catch (NumberFormatException e5) {
                        StringBuilder f5 = androidx.activity.result.a.f("Cannot parse ", K, "; at path ");
                        f5.append(aVar2.q());
                        throw new r(f5.toString(), e5);
                    }
                } catch (NumberFormatException unused) {
                    Double valueOf = Double.valueOf(K);
                    if ((!valueOf.isInfinite() && !valueOf.isNaN()) || aVar2.f4648c) {
                        return valueOf;
                    }
                    throw new p2.c("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar2.q());
                }
            }
        };
        f3308d = r32;
        ?? r5 = new w() { // from class: i2.w.d
            @Override // i2.x
            public final Number a(p2.a aVar2) {
                String K = aVar2.K();
                try {
                    return new BigDecimal(K);
                } catch (NumberFormatException e5) {
                    StringBuilder f5 = androidx.activity.result.a.f("Cannot parse ", K, "; at path ");
                    f5.append(aVar2.q());
                    throw new r(f5.toString(), e5);
                }
            }
        };
        f3309e = r5;
        f3310f = new w[]{aVar, bVar, r32, r5};
    }

    public w(String str, int i5, a aVar) {
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f3310f.clone();
    }
}
