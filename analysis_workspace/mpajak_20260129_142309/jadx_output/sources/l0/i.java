package l0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public Class<?> f3939a;

    /* renamed from: b, reason: collision with root package name */
    public Class<?> f3940b;

    /* renamed from: c, reason: collision with root package name */
    public Class<?> f3941c;

    public i() {
    }

    public i(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        a(cls, cls2, cls3);
    }

    public final void a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.f3939a = cls;
        this.f3940b = cls2;
        this.f3941c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3939a.equals(iVar.f3939a) && this.f3940b.equals(iVar.f3940b) && k.b(this.f3941c, iVar.f3941c);
    }

    public final int hashCode() {
        int hashCode = (this.f3940b.hashCode() + (this.f3939a.hashCode() * 31)) * 31;
        Class<?> cls = this.f3941c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("MultiClassKey{first=");
        g5.append(this.f3939a);
        g5.append(", second=");
        g5.append(this.f3940b);
        g5.append('}');
        return g5.toString();
    }
}
