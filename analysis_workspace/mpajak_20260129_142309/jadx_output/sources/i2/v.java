package i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes22.dex */
public abstract class v {

    /* renamed from: b, reason: collision with root package name */
    public static final a f3303b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f3304c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ v[] f3305d;

    public enum a extends v {
        public a() {
            super("DEFAULT", 0, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [i2.v$b] */
    static {
        a aVar = new a();
        f3303b = aVar;
        ?? r12 = new v() { // from class: i2.v.b
        };
        f3304c = r12;
        f3305d = new v[]{aVar, r12};
    }

    public v(String str, int i5, a aVar) {
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f3305d.clone();
    }
}
