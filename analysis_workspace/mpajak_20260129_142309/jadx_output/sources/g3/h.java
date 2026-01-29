package g3;

import com.superbock.App;
import com.superbock.bean.GInfo;
import java.sql.SQLException;

/* loaded from: classes16.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static h f2965b;

    /* renamed from: a, reason: collision with root package name */
    public t2.g<GInfo, String> f2966a;

    public h() {
        try {
            this.f2966a = new o(App.f1372b).b(GInfo.class);
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public static h b() {
        if (f2965b == null) {
            synchronized (h.class) {
                if (f2965b == null) {
                    f2965b = new h();
                }
            }
        }
        return f2965b;
    }

    public final void a(GInfo gInfo) {
        try {
            this.f2966a.n(gInfo);
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public final void finalize() {
        super.finalize();
        r2.a.e();
    }
}
