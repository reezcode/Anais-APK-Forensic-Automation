package g3;

import com.superbock.App;
import com.superbock.bean.SysNews;
import java.sql.SQLException;

/* loaded from: classes16.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static p f2980b;

    /* renamed from: a, reason: collision with root package name */
    public t2.g<SysNews, String> f2981a;

    public p() {
        try {
            this.f2981a = new o(App.f1372b).b(SysNews.class);
        } catch (SQLException e5) {
            e5.printStackTrace();
        }
    }

    public static p b() {
        if (f2980b == null) {
            synchronized (p.class) {
                if (f2980b == null) {
                    f2980b = new p();
                }
            }
        }
        return f2980b;
    }

    public final SysNews a(String str) {
        try {
            t2.g<SysNews, String> gVar = this.f2981a;
            z2.h<SysNews, String> c5 = gVar.c();
            c5.l("total", true);
            c5.l("pubDate", false);
            z2.m<SysNews, String> g5 = c5.g();
            g5.c("lang", str);
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
