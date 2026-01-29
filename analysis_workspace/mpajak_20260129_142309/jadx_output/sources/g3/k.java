package g3;

import com.superbock.App;
import com.superbock.bean.JInfo;
import java.sql.SQLException;

/* loaded from: classes24.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static k f2972b;

    /* renamed from: a, reason: collision with root package name */
    public t2.g<JInfo, String> f2973a;

    public k() {
        try {
            this.f2973a = new o(App.f1372b).b(JInfo.class);
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public static k b() {
        if (f2972b == null) {
            synchronized (k.class) {
                if (f2972b == null) {
                    f2972b = new k();
                }
            }
        }
        return f2972b;
    }

    public final void a(JInfo jInfo) {
        try {
            this.f2973a.n(jInfo);
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public final JInfo c(int i5) {
        try {
            z2.h<JInfo, String> c5 = this.f2973a.c();
            c5.l("ti", false);
            z2.m g5 = c5.g();
            if (i5 > 0) {
                g5.c("ty", Integer.valueOf(i5));
            } else {
                g5.e(1);
                g5.b();
                g5.g("ty", 3);
            }
            c5.f6146g = g5;
            return this.f2973a.j(c5.f());
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
