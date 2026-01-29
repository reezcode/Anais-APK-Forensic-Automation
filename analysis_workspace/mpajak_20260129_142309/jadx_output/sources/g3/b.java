package g3;

import com.superbock.App;
import com.superbock.bean.AdInfo;
import java.sql.SQLException;
import java.util.Calendar;

/* loaded from: classes22.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static b f2952b;

    /* renamed from: a, reason: collision with root package name */
    public t2.g<AdInfo, String> f2953a;

    public b() {
        try {
            this.f2953a = new o(App.f1372b).b(AdInfo.class);
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public static b c() {
        if (f2952b == null) {
            synchronized (b.class) {
                if (f2952b == null) {
                    f2952b = new b();
                }
            }
        }
        return f2952b;
    }

    public final void a(String str) {
        try {
            z2.c<AdInfo, String> h5 = this.f2953a.h();
            h5.g().c("taskId", str);
            this.f2953a.m(h5.f());
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public final AdInfo b() {
        try {
            int i5 = Calendar.getInstance().get(11);
            t2.g<AdInfo, String> gVar = this.f2953a;
            z2.m<AdInfo, String> g5 = gVar.c().g();
            g5.a(new b3.d(g5.d("receiptId")));
            g5.b();
            g5.g("startHour", Integer.valueOf(i5));
            g5.b();
            g5.f("endHour", Integer.valueOf(i5));
            return gVar.j(g5.j());
        } catch (SQLException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public final void finalize() {
        super.finalize();
        r2.a.e();
    }
}
