package x2;

/* loaded from: classes6.dex */
public interface b {

    /* loaded from: classes23.dex */
    public enum a {
        TRACE(1),
        DEBUG(2),
        INFO(3),
        WARNING(4),
        ERROR(5),
        /* JADX INFO: Fake field, exist only in values array */
        FATAL(6);


        /* renamed from: b, reason: collision with root package name */
        public int f5925b;

        a(int i5) {
            this.f5925b = i5;
        }
    }

    void a(a aVar, String str);

    boolean b(a aVar);

    void c(a aVar, String str, Throwable th);
}
