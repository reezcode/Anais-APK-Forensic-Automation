package s;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

@RequiresApi(19)
/* loaded from: classes2.dex */
public final class m implements k {

    /* renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f5107d;

    /* renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f5108e;

    /* renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f5109f;

    /* renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f5110g;

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f5111h;

    /* renamed from: a, reason: collision with root package name */
    public final c f5112a = new c();

    /* renamed from: b, reason: collision with root package name */
    public final g<b, Bitmap> f5113b = new g<>();

    /* renamed from: c, reason: collision with root package name */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f5114c = new HashMap();

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5115a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f5115a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5115a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5115a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5115a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @VisibleForTesting
    /* loaded from: classes21.dex */
    public static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        public final c f5116a;

        /* renamed from: b, reason: collision with root package name */
        public int f5117b;

        /* renamed from: c, reason: collision with root package name */
        public Bitmap.Config f5118c;

        public b(c cVar) {
            this.f5116a = cVar;
        }

        @Override // s.l
        public final void a() {
            this.f5116a.c(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f5117b == bVar.f5117b && l0.k.b(this.f5118c, bVar.f5118c);
        }

        public final int hashCode() {
            int i5 = this.f5117b * 31;
            Bitmap.Config config = this.f5118c;
            return i5 + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return m.c(this.f5117b, this.f5118c);
        }
    }

    @VisibleForTesting
    /* loaded from: classes25.dex */
    public static class c extends s.c<b> {
        @Override // s.c
        public final b a() {
            return new b(this);
        }

        public final b d(int i5, Bitmap.Config config) {
            b b5 = b();
            b5.f5117b = i5;
            b5.f5118c = config;
            return b5;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f5107d = configArr;
        f5108e = configArr;
        f5109f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f5110g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f5111h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i5, Bitmap.Config config) {
        return "[" + i5 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d5 = d(bitmap.getConfig());
        Integer num2 = d5.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d5.remove(num);
                return;
            } else {
                d5.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    @Nullable
    public final Bitmap b(int i5, int i6, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int c5 = l0.k.c(i5, i6, config);
        b d5 = this.f5112a.d(c5, config);
        int i7 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i8 = a.f5115a[config.ordinal()];
            configArr = i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? new Bitmap.Config[]{config} : f5111h : f5110g : f5109f : f5107d;
        } else {
            configArr = f5108e;
        }
        int length = configArr.length;
        while (true) {
            if (i7 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i7];
            Integer ceilingKey = d(config2).ceilingKey(Integer.valueOf(c5));
            if (ceilingKey == null || ceilingKey.intValue() > c5 * 8) {
                i7++;
            } else if (ceilingKey.intValue() != c5 || (config2 != null ? !config2.equals(config) : config != null)) {
                this.f5112a.c(d5);
                d5 = this.f5112a.d(ceilingKey.intValue(), config2);
            }
        }
        Bitmap a5 = this.f5113b.a(d5);
        if (a5 != null) {
            a(Integer.valueOf(d5.f5117b), a5);
            a5.reconfigure(i5, i6, config);
        }
        return a5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>>] */
    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f5114c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f5114c.put(config, treeMap);
        return treeMap;
    }

    public final String e(Bitmap bitmap) {
        return c(l0.k.d(bitmap), bitmap.getConfig());
    }

    public final void f(Bitmap bitmap) {
        b d5 = this.f5112a.d(l0.k.d(bitmap), bitmap.getConfig());
        this.f5113b.b(d5, bitmap);
        NavigableMap<Integer, Integer> d6 = d(bitmap.getConfig());
        Integer num = d6.get(Integer.valueOf(d5.f5117b));
        d6.put(Integer.valueOf(d5.f5117b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.HashMap, java.util.Map<android.graphics.Bitmap$Config, java.util.NavigableMap<java.lang.Integer, java.lang.Integer>>] */
    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("SizeConfigStrategy{groupedMap=");
        g5.append(this.f5113b);
        g5.append(", sortedSizes=(");
        for (Map.Entry entry : this.f5114c.entrySet()) {
            g5.append(entry.getKey());
            g5.append('[');
            g5.append(entry.getValue());
            g5.append("], ");
        }
        if (!this.f5114c.isEmpty()) {
            g5.replace(g5.length() - 2, g5.length(), "");
        }
        g5.append(")}");
        return g5.toString();
    }
}
