package k2;

import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Type, i2.k<?>> f3814a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3815b;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> implements q<T> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i2.k f3816e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Type f3817f;

        public a(i2.k kVar, Type type) {
            this.f3816e = kVar;
            this.f3817f = type;
        }

        @Override // k2.q
        public final T c() {
            return (T) this.f3816e.a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes12.dex */
    public class b<T> implements q<T> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i2.k f3818e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Type f3819f;

        public b(i2.k kVar, Type type) {
            this.f3818e = kVar;
            this.f3819f = type;
        }

        @Override // k2.q
        public final T c() {
            return (T) this.f3818e.a();
        }
    }

    public e(Map<Type, i2.k<?>> map, boolean z4) {
        this.f3814a = map;
        this.f3815b = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> k2.q<T> a(o2.a<T> r11) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.e.a(o2.a):k2.q");
    }

    public final String toString() {
        return this.f3814a.toString();
    }
}
