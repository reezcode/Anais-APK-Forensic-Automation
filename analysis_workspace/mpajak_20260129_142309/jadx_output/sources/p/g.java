package p;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;

/* loaded from: classes24.dex */
public final class g<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final b<Object> f4613e = new a();

    /* renamed from: a, reason: collision with root package name */
    public final T f4614a;

    /* renamed from: b, reason: collision with root package name */
    public final b<T> f4615b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4616c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f4617d;

    /* loaded from: classes6.dex */
    public class a implements b<Object> {
        @Override // p.g.b
        public final void a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }

    /* loaded from: classes15.dex */
    public interface b<T> {
        void a(@NonNull byte[] bArr, @NonNull T t4, @NonNull MessageDigest messageDigest);
    }

    public g(@NonNull String str, @Nullable T t4, @NonNull b<T> bVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f4616c = str;
        this.f4614a = t4;
        this.f4615b = bVar;
    }

    @NonNull
    public static <T> g<T> a(@NonNull String str, @NonNull T t4) {
        return new g<>(str, t4, f4613e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f4616c.equals(((g) obj).f4616c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4616c.hashCode();
    }

    public final String toString() {
        StringBuilder g5 = androidx.activity.d.g("Option{key='");
        g5.append(this.f4616c);
        g5.append('\'');
        g5.append('}');
        return g5.toString();
    }
}
