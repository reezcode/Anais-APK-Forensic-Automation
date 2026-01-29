package k0;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Objects;
import p.f;

/* loaded from: classes2.dex */
public final class d implements f {

    /* renamed from: b, reason: collision with root package name */
    public final Object f3800b;

    public d(@NonNull Object obj) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f3800b = obj;
    }

    @Override // p.f
    public final void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f3800b.toString().getBytes(f.f4612a));
    }

    @Override // p.f
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f3800b.equals(((d) obj).f3800b);
        }
        return false;
    }

    @Override // p.f
    public final int hashCode() {
        return this.f3800b.hashCode();
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("ObjectKey{object=");
        g5.append(this.f3800b);
        g5.append('}');
        return g5.toString();
    }
}
