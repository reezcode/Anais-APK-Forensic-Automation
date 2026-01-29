package r;

/* loaded from: classes22.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4891a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final b f4892b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final c f4893c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final d f4894d = new d();

    /* loaded from: classes6.dex */
    public class a extends l {
        @Override // r.l
        public final boolean a() {
            return false;
        }

        @Override // r.l
        public final boolean b() {
            return false;
        }

        @Override // r.l
        public final boolean c(p.a aVar) {
            return false;
        }

        @Override // r.l
        public final boolean d(boolean z4, p.a aVar, p.c cVar) {
            return false;
        }
    }

    /* loaded from: classes19.dex */
    public class b extends l {
        @Override // r.l
        public final boolean a() {
            return true;
        }

        @Override // r.l
        public final boolean b() {
            return false;
        }

        @Override // r.l
        public final boolean c(p.a aVar) {
            return (aVar == p.a.DATA_DISK_CACHE || aVar == p.a.MEMORY_CACHE) ? false : true;
        }

        @Override // r.l
        public final boolean d(boolean z4, p.a aVar, p.c cVar) {
            return false;
        }
    }

    /* loaded from: classes10.dex */
    public class c extends l {
        @Override // r.l
        public final boolean a() {
            return false;
        }

        @Override // r.l
        public final boolean b() {
            return true;
        }

        @Override // r.l
        public final boolean c(p.a aVar) {
            return false;
        }

        @Override // r.l
        public final boolean d(boolean z4, p.a aVar, p.c cVar) {
            return (aVar == p.a.RESOURCE_DISK_CACHE || aVar == p.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* loaded from: classes12.dex */
    public class d extends l {
        @Override // r.l
        public final boolean a() {
            return true;
        }

        @Override // r.l
        public final boolean b() {
            return true;
        }

        @Override // r.l
        public final boolean c(p.a aVar) {
            return aVar == p.a.REMOTE;
        }

        @Override // r.l
        public final boolean d(boolean z4, p.a aVar, p.c cVar) {
            return ((z4 && aVar == p.a.DATA_DISK_CACHE) || aVar == p.a.LOCAL) && cVar == p.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(p.a aVar);

    public abstract boolean d(boolean z4, p.a aVar, p.c cVar);
}
