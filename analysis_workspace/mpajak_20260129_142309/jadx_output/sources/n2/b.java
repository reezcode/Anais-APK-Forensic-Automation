package n2;

import i2.a0;
import i2.i;
import i2.u;
import i2.z;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes8.dex */
public final class b extends z<Time> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f4508b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f4509a = new SimpleDateFormat("hh:mm:ss a");

    /* loaded from: classes24.dex */
    public class a implements a0 {
        @Override // i2.a0
        public final <T> z<T> a(i iVar, o2.a<T> aVar) {
            if (aVar.f4568a == Time.class) {
                return new b();
            }
            return null;
        }
    }

    @Override // i2.z
    public final Time a(p2.a aVar) {
        Time time;
        if (aVar.N() == 9) {
            aVar.I();
            return null;
        }
        String K = aVar.K();
        try {
            synchronized (this) {
                time = new Time(this.f4509a.parse(K).getTime());
            }
            return time;
        } catch (ParseException e5) {
            StringBuilder f5 = androidx.activity.result.a.f("Failed parsing '", K, "' as SQL Time; at path ");
            f5.append(aVar.q());
            throw new u(f5.toString(), e5);
        }
    }

    @Override // i2.z
    public final void b(p2.b bVar, Time time) {
        String format;
        Time time2 = time;
        if (time2 == null) {
            bVar.q();
            return;
        }
        synchronized (this) {
            format = this.f4509a.format((Date) time2);
        }
        bVar.E(format);
    }
}
