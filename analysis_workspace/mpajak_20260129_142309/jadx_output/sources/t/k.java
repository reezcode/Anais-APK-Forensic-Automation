package t;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import m0.a;
import m0.d;

/* loaded from: classes17.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final l0.g<p.f, String> f5418a = new l0.g<>(1000);

    /* renamed from: b, reason: collision with root package name */
    public final Pools.Pool<b> f5419b = (a.c) m0.a.a(10, new a());

    /* loaded from: classes3.dex */
    public class a implements a.b<b> {
        @Override // m0.a.b
        public final b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    /* loaded from: classes21.dex */
    public static final class b implements a.d {

        /* renamed from: b, reason: collision with root package name */
        public final MessageDigest f5420b;

        /* renamed from: c, reason: collision with root package name */
        public final d.a f5421c = new d.a();

        public b(MessageDigest messageDigest) {
            this.f5420b = messageDigest;
        }

        @Override // m0.a.d
        @NonNull
        public final m0.d c() {
            return this.f5421c;
        }
    }

    public final String a(p.f fVar) {
        String a5;
        synchronized (this.f5418a) {
            a5 = this.f5418a.a(fVar);
        }
        if (a5 == null) {
            b acquire = this.f5419b.acquire();
            Objects.requireNonNull(acquire, "Argument must not be null");
            b bVar = acquire;
            try {
                fVar.a(bVar.f5420b);
                byte[] digest = bVar.f5420b.digest();
                char[] cArr = l0.k.f3943b;
                synchronized (cArr) {
                    for (int i5 = 0; i5 < digest.length; i5++) {
                        int i6 = digest[i5] & 255;
                        int i7 = i5 * 2;
                        char[] cArr2 = l0.k.f3942a;
                        cArr[i7] = cArr2[i6 >>> 4];
                        cArr[i7 + 1] = cArr2[i6 & 15];
                    }
                    a5 = new String(cArr);
                }
            } finally {
                this.f5419b.release(bVar);
            }
        }
        synchronized (this.f5418a) {
            this.f5418a.d(fVar, a5);
        }
        return a5;
    }
}
