package n2;

import i2.a0;
import i2.i;
import i2.z;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

/* loaded from: classes13.dex */
public final class c extends z<Timestamp> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f4510b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final z<Date> f4511a;

    /* loaded from: classes21.dex */
    public class a implements a0 {
        @Override // i2.a0
        public final <T> z<T> a(i iVar, o2.a<T> aVar) {
            if (aVar.f4568a != Timestamp.class) {
                return null;
            }
            Objects.requireNonNull(iVar);
            return new c(iVar.e(new o2.a<>(Date.class)), null);
        }
    }

    public c(z zVar, a aVar) {
        this.f4511a = zVar;
    }

    @Override // i2.z
    public final Timestamp a(p2.a aVar) {
        Date a5 = this.f4511a.a(aVar);
        if (a5 != null) {
            return new Timestamp(a5.getTime());
        }
        return null;
    }

    @Override // i2.z
    public final void b(p2.b bVar, Timestamp timestamp) {
        this.f4511a.b(bVar, timestamp);
    }
}
