package r;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes13.dex */
public final class p implements p.f {

    /* renamed from: b, reason: collision with root package name */
    public final Object f4952b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4953c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4954d;

    /* renamed from: e, reason: collision with root package name */
    public final Class<?> f4955e;

    /* renamed from: f, reason: collision with root package name */
    public final Class<?> f4956f;

    /* renamed from: g, reason: collision with root package name */
    public final p.f f4957g;

    /* renamed from: h, reason: collision with root package name */
    public final Map<Class<?>, p.l<?>> f4958h;

    /* renamed from: i, reason: collision with root package name */
    public final p.h f4959i;

    /* renamed from: j, reason: collision with root package name */
    public int f4960j;

    public p(Object obj, p.f fVar, int i5, int i6, Map<Class<?>, p.l<?>> map, Class<?> cls, Class<?> cls2, p.h hVar) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f4952b = obj;
        Objects.requireNonNull(fVar, "Signature must not be null");
        this.f4957g = fVar;
        this.f4953c = i5;
        this.f4954d = i6;
        Objects.requireNonNull(map, "Argument must not be null");
        this.f4958h = map;
        Objects.requireNonNull(cls, "Resource class must not be null");
        this.f4955e = cls;
        Objects.requireNonNull(cls2, "Transcode class must not be null");
        this.f4956f = cls2;
        Objects.requireNonNull(hVar, "Argument must not be null");
        this.f4959i = hVar;
    }

    @Override // p.f
    public final void a(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p.f
    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f4952b.equals(pVar.f4952b) && this.f4957g.equals(pVar.f4957g) && this.f4954d == pVar.f4954d && this.f4953c == pVar.f4953c && this.f4958h.equals(pVar.f4958h) && this.f4955e.equals(pVar.f4955e) && this.f4956f.equals(pVar.f4956f) && this.f4959i.equals(pVar.f4959i);
    }

    @Override // p.f
    public final int hashCode() {
        if (this.f4960j == 0) {
            int hashCode = this.f4952b.hashCode();
            this.f4960j = hashCode;
            int hashCode2 = ((((this.f4957g.hashCode() + (hashCode * 31)) * 31) + this.f4953c) * 31) + this.f4954d;
            this.f4960j = hashCode2;
            int hashCode3 = this.f4958h.hashCode() + (hashCode2 * 31);
            this.f4960j = hashCode3;
            int hashCode4 = this.f4955e.hashCode() + (hashCode3 * 31);
            this.f4960j = hashCode4;
            int hashCode5 = this.f4956f.hashCode() + (hashCode4 * 31);
            this.f4960j = hashCode5;
            this.f4960j = this.f4959i.hashCode() + (hashCode5 * 31);
        }
        return this.f4960j;
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("EngineKey{model=");
        g5.append(this.f4952b);
        g5.append(", width=");
        g5.append(this.f4953c);
        g5.append(", height=");
        g5.append(this.f4954d);
        g5.append(", resourceClass=");
        g5.append(this.f4955e);
        g5.append(", transcodeClass=");
        g5.append(this.f4956f);
        g5.append(", signature=");
        g5.append(this.f4957g);
        g5.append(", hashCode=");
        g5.append(this.f4960j);
        g5.append(", transformations=");
        g5.append(this.f4958h);
        g5.append(", options=");
        g5.append(this.f4959i);
        g5.append('}');
        return g5.toString();
    }
}
