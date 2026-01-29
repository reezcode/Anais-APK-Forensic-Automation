package g3;

import com.superbock.App;
import com.superbock.bean.KInfo;
import java.sql.SQLException;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static l f2974b;

    /* renamed from: a, reason: collision with root package name */
    public t2.g<KInfo, String> f2975a;

    public l() {
        try {
            this.f2975a = new o(App.f1372b).b(KInfo.class);
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public static l c() {
        if (f2974b == null) {
            synchronized (l.class) {
                if (f2974b == null) {
                    f2974b = new l();
                }
            }
        }
        return f2974b;
    }

    public final void a(KInfo kInfo) {
        try {
            this.f2975a.n(kInfo);
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public final KInfo b(String str) {
        try {
            t2.g<KInfo, String> gVar = this.f2975a;
            z2.m<KInfo, String> g5 = gVar.c().g();
            g5.c("pk", str);
            return gVar.j(g5.j());
        } catch (SQLException unused) {
            return null;
        }
    }

    public final void finalize() {
        super.finalize();
        r2.a.e();
    }
}
