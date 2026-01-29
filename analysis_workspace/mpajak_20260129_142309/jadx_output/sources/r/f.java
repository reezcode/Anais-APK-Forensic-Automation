package r;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* loaded from: classes21.dex */
public final class f implements p.f {

    /* renamed from: b, reason: collision with root package name */
    public final p.f f4830b;

    /* renamed from: c, reason: collision with root package name */
    public final p.f f4831c;

    public f(p.f fVar, p.f fVar2) {
        this.f4830b = fVar;
        this.f4831c = fVar2;
    }

    @Override // p.f
    public final void a(@NonNull MessageDigest messageDigest) {
        this.f4830b.a(messageDigest);
        this.f4831c.a(messageDigest);
    }

    @Override // p.f
    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f4830b.equals(fVar.f4830b) && this.f4831c.equals(fVar.f4831c);
    }

    @Override // p.f
    public final int hashCode() {
        return this.f4831c.hashCode() + (this.f4830b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("DataCacheKey{sourceKey=");
        g5.append(this.f4830b);
        g5.append(", signature=");
        g5.append(this.f4831c);
        g5.append('}');
        return g5.toString();
    }
}
