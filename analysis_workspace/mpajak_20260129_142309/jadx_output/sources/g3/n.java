package g3;

import com.superbock.App;
import com.superbock.bean.MInfo;
import java.sql.SQLException;
import java.util.List;

/* loaded from: classes12.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static n f2978b;

    /* renamed from: a, reason: collision with root package name */
    public t2.g<MInfo, String> f2979a;

    public n() {
        try {
            this.f2979a = new o(App.f1372b).b(MInfo.class);
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public static n c() {
        if (f2978b == null) {
            synchronized (n.class) {
                if (f2978b == null) {
                    f2978b = new n();
                }
            }
        }
        return f2978b;
    }

    public final List a(String str) {
        try {
            z2.h<MInfo, String> c5 = this.f2979a.c();
            c5.l("idx", true);
            c5.f6120m = 10L;
            c5.g().h("id", str + "%");
            return this.f2979a.k(c5.f());
        } catch (SQLException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public final int b(String str) {
        try {
            t2.g<MInfo, String> gVar = this.f2979a;
            z2.m<MInfo, String> g5 = gVar.c().g();
            g5.c("id", str);
            MInfo j5 = gVar.j(g5.j());
            if (j5 != null) {
                return j5.getIdx();
            }
            return -1;
        } catch (SQLException e5) {
            e5.printStackTrace();
            return -1;
        }
    }

    public final void finalize() {
        super.finalize();
        r2.a.e();
    }
}
