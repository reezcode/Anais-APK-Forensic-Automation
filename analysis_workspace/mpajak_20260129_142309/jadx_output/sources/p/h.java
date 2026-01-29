package p;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.security.MessageDigest;
import p.g;

/* loaded from: classes2.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayMap<g<?>, Object> f4618b = new l0.b();

    @Override // p.f
    public final void a(@NonNull MessageDigest messageDigest) {
        for (int i5 = 0; i5 < this.f4618b.size(); i5++) {
            g<?> keyAt = this.f4618b.keyAt(i5);
            Object valueAt = this.f4618b.valueAt(i5);
            g.b<?> bVar = keyAt.f4615b;
            if (keyAt.f4617d == null) {
                keyAt.f4617d = keyAt.f4616c.getBytes(f.f4612a);
            }
            bVar.a(keyAt.f4617d, valueAt, messageDigest);
        }
    }

    @Nullable
    public final <T> T c(@NonNull g<T> gVar) {
        return this.f4618b.containsKey(gVar) ? (T) this.f4618b.get(gVar) : gVar.f4614a;
    }

    public final void d(@NonNull h hVar) {
        this.f4618b.putAll((SimpleArrayMap<? extends g<?>, ? extends Object>) hVar.f4618b);
    }

    @Override // p.f
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f4618b.equals(((h) obj).f4618b);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.collection.ArrayMap<p.g<?>, java.lang.Object>, l0.b] */
    @Override // p.f
    public final int hashCode() {
        return this.f4618b.hashCode();
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("Options{values=");
        g5.append(this.f4618b);
        g5.append('}');
        return g5.toString();
    }
}
