package h0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import h0.a;
import java.util.Map;
import java.util.Objects;
import l0.k;
import r.l;
import y.o;

/* loaded from: classes21.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    public boolean A;

    /* renamed from: b, reason: collision with root package name */
    public int f3054b;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public Drawable f3058f;

    /* renamed from: g, reason: collision with root package name */
    public int f3059g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public Drawable f3060h;

    /* renamed from: i, reason: collision with root package name */
    public int f3061i;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3066n;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public Drawable f3068p;

    /* renamed from: q, reason: collision with root package name */
    public int f3069q;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3073u;

    /* renamed from: v, reason: collision with root package name */
    @Nullable
    public Resources.Theme f3074v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3075w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3076x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3077y;

    /* renamed from: c, reason: collision with root package name */
    public float f3055c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public l f3056d = l.f4894d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public com.bumptech.glide.f f3057e = com.bumptech.glide.f.NORMAL;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3062j = true;

    /* renamed from: k, reason: collision with root package name */
    public int f3063k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f3064l = -1;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public p.f f3065m = k0.c.f3799b;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3067o = true;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public p.h f3070r = new p.h();

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public Map<Class<?>, p.l<?>> f3071s = new l0.b();

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    public Class<?> f3072t = Object.class;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3078z = true;

    public static boolean e(int i5, int i6) {
        return (i5 & i6) != 0;
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.Map<java.lang.Class<?>, p.l<?>>, l0.b] */
    @NonNull
    @CheckResult
    public T a(@NonNull a<?> aVar) {
        if (this.f3075w) {
            return (T) clone().a(aVar);
        }
        if (e(aVar.f3054b, 2)) {
            this.f3055c = aVar.f3055c;
        }
        if (e(aVar.f3054b, 262144)) {
            this.f3076x = aVar.f3076x;
        }
        if (e(aVar.f3054b, 1048576)) {
            this.A = aVar.A;
        }
        if (e(aVar.f3054b, 4)) {
            this.f3056d = aVar.f3056d;
        }
        if (e(aVar.f3054b, 8)) {
            this.f3057e = aVar.f3057e;
        }
        if (e(aVar.f3054b, 16)) {
            this.f3058f = aVar.f3058f;
            this.f3059g = 0;
            this.f3054b &= -33;
        }
        if (e(aVar.f3054b, 32)) {
            this.f3059g = aVar.f3059g;
            this.f3058f = null;
            this.f3054b &= -17;
        }
        if (e(aVar.f3054b, 64)) {
            this.f3060h = aVar.f3060h;
            this.f3061i = 0;
            this.f3054b &= -129;
        }
        if (e(aVar.f3054b, 128)) {
            this.f3061i = aVar.f3061i;
            this.f3060h = null;
            this.f3054b &= -65;
        }
        if (e(aVar.f3054b, 256)) {
            this.f3062j = aVar.f3062j;
        }
        if (e(aVar.f3054b, 512)) {
            this.f3064l = aVar.f3064l;
            this.f3063k = aVar.f3063k;
        }
        if (e(aVar.f3054b, 1024)) {
            this.f3065m = aVar.f3065m;
        }
        if (e(aVar.f3054b, 4096)) {
            this.f3072t = aVar.f3072t;
        }
        if (e(aVar.f3054b, 8192)) {
            this.f3068p = aVar.f3068p;
            this.f3069q = 0;
            this.f3054b &= -16385;
        }
        if (e(aVar.f3054b, 16384)) {
            this.f3069q = aVar.f3069q;
            this.f3068p = null;
            this.f3054b &= -8193;
        }
        if (e(aVar.f3054b, 32768)) {
            this.f3074v = aVar.f3074v;
        }
        if (e(aVar.f3054b, 65536)) {
            this.f3067o = aVar.f3067o;
        }
        if (e(aVar.f3054b, 131072)) {
            this.f3066n = aVar.f3066n;
        }
        if (e(aVar.f3054b, 2048)) {
            this.f3071s.putAll(aVar.f3071s);
            this.f3078z = aVar.f3078z;
        }
        if (e(aVar.f3054b, 524288)) {
            this.f3077y = aVar.f3077y;
        }
        if (!this.f3067o) {
            this.f3071s.clear();
            int i5 = this.f3054b & (-2049);
            this.f3066n = false;
            this.f3054b = i5 & (-131073);
            this.f3078z = true;
        }
        this.f3054b |= aVar.f3054b;
        this.f3070r.d(aVar.f3070r);
        i();
        return this;
    }

    @Override // 
    @CheckResult
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t4 = (T) super.clone();
            p.h hVar = new p.h();
            t4.f3070r = hVar;
            hVar.d(this.f3070r);
            l0.b bVar = new l0.b();
            t4.f3071s = bVar;
            bVar.putAll(this.f3071s);
            t4.f3073u = false;
            t4.f3075w = false;
            return t4;
        } catch (CloneNotSupportedException e5) {
            throw new RuntimeException(e5);
        }
    }

    @NonNull
    @CheckResult
    public final T c(@NonNull Class<?> cls) {
        if (this.f3075w) {
            return (T) clone().c(cls);
        }
        this.f3072t = cls;
        this.f3054b |= 4096;
        i();
        return this;
    }

    @NonNull
    @CheckResult
    public final T d(@NonNull l lVar) {
        if (this.f3075w) {
            return (T) clone().d(lVar);
        }
        this.f3056d = lVar;
        this.f3054b |= 4;
        i();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Float.compare(aVar.f3055c, this.f3055c) == 0 && this.f3059g == aVar.f3059g && k.b(this.f3058f, aVar.f3058f) && this.f3061i == aVar.f3061i && k.b(this.f3060h, aVar.f3060h) && this.f3069q == aVar.f3069q && k.b(this.f3068p, aVar.f3068p) && this.f3062j == aVar.f3062j && this.f3063k == aVar.f3063k && this.f3064l == aVar.f3064l && this.f3066n == aVar.f3066n && this.f3067o == aVar.f3067o && this.f3076x == aVar.f3076x && this.f3077y == aVar.f3077y && this.f3056d.equals(aVar.f3056d) && this.f3057e == aVar.f3057e && this.f3070r.equals(aVar.f3070r) && this.f3071s.equals(aVar.f3071s) && this.f3072t.equals(aVar.f3072t) && k.b(this.f3065m, aVar.f3065m) && k.b(this.f3074v, aVar.f3074v)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public final T f(@NonNull y.l lVar, @NonNull p.l<Bitmap> lVar2) {
        if (this.f3075w) {
            return (T) clone().f(lVar, lVar2);
        }
        j(y.l.f5994f, lVar);
        return n(lVar2, false);
    }

    @NonNull
    @CheckResult
    public final T g(int i5, int i6) {
        if (this.f3075w) {
            return (T) clone().g(i5, i6);
        }
        this.f3064l = i5;
        this.f3063k = i6;
        this.f3054b |= 512;
        i();
        return this;
    }

    @NonNull
    @CheckResult
    public final a h() {
        com.bumptech.glide.f fVar = com.bumptech.glide.f.LOW;
        if (this.f3075w) {
            return clone().h();
        }
        this.f3057e = fVar;
        this.f3054b |= 8;
        i();
        return this;
    }

    public final int hashCode() {
        float f5 = this.f3055c;
        char[] cArr = k.f3942a;
        return k.g(this.f3074v, k.g(this.f3065m, k.g(this.f3072t, k.g(this.f3071s, k.g(this.f3070r, k.g(this.f3057e, k.g(this.f3056d, (((((((((((((k.g(this.f3068p, (k.g(this.f3060h, (k.g(this.f3058f, ((Float.floatToIntBits(f5) + 527) * 31) + this.f3059g) * 31) + this.f3061i) * 31) + this.f3069q) * 31) + (this.f3062j ? 1 : 0)) * 31) + this.f3063k) * 31) + this.f3064l) * 31) + (this.f3066n ? 1 : 0)) * 31) + (this.f3067o ? 1 : 0)) * 31) + (this.f3076x ? 1 : 0)) * 31) + (this.f3077y ? 1 : 0))))))));
    }

    @NonNull
    public final T i() {
        if (this.f3073u) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.collection.ArrayMap<p.g<?>, java.lang.Object>, l0.b] */
    @NonNull
    @CheckResult
    public final <Y> T j(@NonNull p.g<Y> gVar, @NonNull Y y4) {
        if (this.f3075w) {
            return (T) clone().j(gVar, y4);
        }
        Objects.requireNonNull(gVar, "Argument must not be null");
        this.f3070r.f4618b.put(gVar, y4);
        i();
        return this;
    }

    @NonNull
    @CheckResult
    public final T k(@NonNull p.f fVar) {
        if (this.f3075w) {
            return (T) clone().k(fVar);
        }
        this.f3065m = fVar;
        this.f3054b |= 1024;
        i();
        return this;
    }

    @NonNull
    @CheckResult
    public final a l() {
        if (this.f3075w) {
            return clone().l();
        }
        this.f3062j = false;
        this.f3054b |= 256;
        i();
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map<java.lang.Class<?>, p.l<?>>, l0.b] */
    @NonNull
    public final <Y> T m(@NonNull Class<Y> cls, @NonNull p.l<Y> lVar, boolean z4) {
        if (this.f3075w) {
            return (T) clone().m(cls, lVar, z4);
        }
        Objects.requireNonNull(lVar, "Argument must not be null");
        this.f3071s.put(cls, lVar);
        int i5 = this.f3054b | 2048;
        this.f3067o = true;
        int i6 = i5 | 65536;
        this.f3054b = i6;
        this.f3078z = false;
        if (z4) {
            this.f3054b = i6 | 131072;
            this.f3066n = true;
        }
        i();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final T n(@NonNull p.l<Bitmap> lVar, boolean z4) {
        if (this.f3075w) {
            return (T) clone().n(lVar, z4);
        }
        o oVar = new o(lVar, z4);
        m(Bitmap.class, lVar, z4);
        m(Drawable.class, oVar, z4);
        m(BitmapDrawable.class, oVar, z4);
        m(c0.c.class, new c0.f(lVar), z4);
        i();
        return this;
    }

    @NonNull
    @CheckResult
    public final a o() {
        if (this.f3075w) {
            return clone().o();
        }
        this.A = true;
        this.f3054b |= 1048576;
        i();
        return this;
    }
}
