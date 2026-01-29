package m;

/* loaded from: classes14.dex */
public final class f<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final a<K, V>[] f4097a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4098b;

    /* loaded from: classes6.dex */
    public static final class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f4099a;

        /* renamed from: b, reason: collision with root package name */
        public V f4100b;

        /* renamed from: c, reason: collision with root package name */
        public final a<K, V> f4101c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, Object obj2, a aVar) {
            this.f4099a = obj;
            this.f4100b = obj2;
            this.f4101c = aVar;
        }
    }

    public f() {
        this.f4098b = 8191;
        this.f4097a = new a[8192];
    }

    public f(int i5) {
        this.f4098b = 8191;
        this.f4097a = new a[8192];
    }

    public final V a(K k5) {
        for (a<K, V> aVar = this.f4097a[System.identityHashCode(k5) & this.f4098b]; aVar != null; aVar = aVar.f4101c) {
            if (k5 == aVar.f4099a) {
                return aVar.f4100b;
            }
        }
        return null;
    }

    public final boolean b(K k5, V v4) {
        int identityHashCode = System.identityHashCode(k5) & this.f4098b;
        for (a<K, V> aVar = this.f4097a[identityHashCode]; aVar != null; aVar = aVar.f4101c) {
            if (k5 == aVar.f4099a) {
                aVar.f4100b = v4;
                return true;
            }
        }
        a<K, V>[] aVarArr = this.f4097a;
        aVarArr[identityHashCode] = new a<>(k5, v4, aVarArr[identityHashCode]);
        return false;
    }
}
